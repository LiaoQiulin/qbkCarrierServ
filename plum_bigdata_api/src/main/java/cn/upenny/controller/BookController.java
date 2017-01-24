package cn.upenny.controller;

import cn.upenny.entity.BookBean;
import cn.upenny.hbase.CreateTableSample;
import cn.upenny.hbase.ModifyTableSample;
import cn.upenny.hbase.PutDataSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/1/13.
 */
@RestController
public class BookController {

    @Value(value = "${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @Value("${book.pinyin}")
    private String bookPinYin;


    @Autowired
    private BookBean bookBean;

    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    String index(){
        return "Hello Spring Boot! The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;
//		return "Hello Spring Boot!";
    }
    @RequestMapping("/book")
    public String book() {

        CreateTableSample createTableSample = new CreateTableSample();
        createTableSample.operate();


        return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
    }

    @RequestMapping("/book2")
    public String book2() {

        ModifyTableSample modifyTableSample = new ModifyTableSample();
        modifyTableSample.operate();

        return "Hello2 Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
    }

    @RequestMapping("/book3")
    public String book3() {

        PutDataSample putDataSample = new PutDataSample();
        putDataSample.operate();

        return "Hello3 Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
    }

}
