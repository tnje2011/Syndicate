package com.syndicate.controller.admin;

import com.syndicate.controller.admin.services.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tom on 2016/6/21.
 */
@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping("/search")
    public String search(@PathVariable("keyword") String keyword) {
        return "/admin/search/results";
    }
}
