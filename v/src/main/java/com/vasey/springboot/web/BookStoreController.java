package com.vasey.springboot.web;

import com.vasey.springboot.domain.Book;
import com.vasey.springboot.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * book控制层
 */
@Controller
@RequestMapping("/book")
public class BookStoreController {

    public static final String BOOK_FORM_PATH_NAME = "bookForm";
    public static final String BOOK_LIST_PATH_NAME = "bookList";
    public static final String REDIRECT_TO_BOOK_URL = "redirect:/book";

    @Autowired(required = false)
    BookStoreService bookStoreService ;


    /**
     * 获取 Book 列表
     * 处理 "/book" 的 GET 请求，用来获取 Book 列表
     */
    @GetMapping
    public  String getBookList(ModelMap map){

        map.addAttribute("bookList",bookStoreService.findAll());
        return BOOK_LIST_PATH_NAME;

    }


    /**
     * 获取创建book表单
     */
    @GetMapping(value = "/create")
    public String createBookForm(ModelMap map){
        map.addAttribute("book",new Book());
        map.addAttribute("action","create");
        return  BOOK_FORM_PATH_NAME;

    }

    /**
     *  创建 Book
     *  处理 "/book/create" 的 POST 请求，用来新建 Book 信息
     *  通过 @ModelAttribute 绑定表单实体参数，也通过 @RequestParam 传递参数
     */

    @PostMapping(value = "/create")
    public String insertBook(@ModelAttribute Book book){

        bookStoreService.insert(book);
        return REDIRECT_TO_BOOK_URL;

    }

    /**
     * 获取更新 Book 表单
     *    处理 "/book/update/{id}" 的 GET 请求，通过 URL 中的 id 值获取 Book 信息
     *    URL 中的 id ，通过 @PathVariable 绑定参数
     */

    @GetMapping(value = "/update/{id}")
    public  String findById(@PathVariable Long id,ModelMap map){

        map.addAttribute("book",bookStoreService.findById(id));
        map.addAttribute("action","update");
        return BOOK_FORM_PATH_NAME;

    }


    /**
     * 更新 Book
     * 处理 "/update" 的 PUT 请求，用来更新 Book 信息
     */
    @PostMapping(value = "/update")
    public String updateBook(@ModelAttribute Book book){

        bookStoreService.update(book);
        return  REDIRECT_TO_BOOK_URL;
    }

    /**
     * 删除 Book
     * 处理 "/book/{id}" 的 GET 请求，用来删除 Book 信息
     */
    @GetMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable Long id){

        bookStoreService.delete(id);
        return  REDIRECT_TO_BOOK_URL;

    }




}
