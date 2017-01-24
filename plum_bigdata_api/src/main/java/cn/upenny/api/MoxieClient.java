package cn.upenny.api;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 17/1/20.
 */
public class MoxieClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(MoxieClient.class);
    protected Retrofit retrofit;


    @Autowired
    public MoxieClient(String apiBaseUrl,String apiToken) {

        retrofit = createRetrofit(apiToken, apiBaseUrl);
    }



    private Retrofit createRetrofit(final String apiToken, String apiBaseUrl) {
//        Interceptor interceptor = chain -> {
//            Request newRequest = chain.request().newBuilder().addHeader("Authorization", "Token " + apiToken).build();
//            return chain.proceed(newRequest);
//        };




        Interceptor interceptor = new Interceptor() {

            public Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder().addHeader("Authorization", "Token " + apiToken).build();
                return chain.proceed(newRequest);

            }
        };


        X509TrustManager xtm = new X509TrustManager() {

            public void checkClientTrusted(X509Certificate[] chain, String authType) {
            }


            public void checkServerTrusted(X509Certificate[] chain, String authType) {
            }


            public X509Certificate[] getAcceptedIssuers() {
                X509Certificate[] x509Certificates = new X509Certificate[0];
                return x509Certificates;
            }
        };

        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getInstance("SSL");

            sslContext.init(null, new TrustManager[]{xtm}, new SecureRandom());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
        HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {

            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };


        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.interceptors().add(interceptor);

        OkHttpClient client = builder
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .sslSocketFactory(sslContext.getSocketFactory())
                .hostnameVerifier(DO_NOT_VERIFY)
                .build();

        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(apiBaseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .client(client)
                .build();

        return retrofit;
    }



}
