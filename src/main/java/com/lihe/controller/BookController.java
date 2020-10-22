package com.lihe.controller;

import com.lihe.pojo.Books;
import com.lihe.service.BookService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    // 跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("addBook")
    public String addBook(Books books){
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        return "redirect:/book/allBook"; // 重定向到allBook请求
    }

    // 跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdateBook(int id, Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook", books);

        return "updateBook";
    }

    // 修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    // 删除书籍
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        System.out.println("删除书籍" + id);
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    // 查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model){
        Books books = bookService.queryBookByName(queryBookName);


        List<Books> list = new ArrayList<Books>();
        if (books == null){
            list = bookService.queryAllBook();
            model.addAttribute("error", "未查到");
        }else{
            list.add(books);
        }


        model.addAttribute("list", list);
        return "allBook";
    }


}
