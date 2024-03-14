package com.example.springboottestingdemo;

import com.example.springboottestingdemo.model.Todo;
import com.example.springboottestingdemo.repository.TodoRepository;
import com.example.springboottestingdemo.service.TodoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoServiceTest2 {

    @TestConfiguration
    public static class TodoServiceTest2Configuration{

        /*
        Tạo ra trong Context một Bean TodoService
         */
        @Bean
        TodoService todoService(){
            return new TodoService();
        }
    }
    @MockBean
    TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;

    @Before
    public void setUp() {
        Collectors Collectors = null;
        Mockito.when(todoRepository.findAll())
                .thenReturn((List<Todo>) IntStream.range(0, 10)
                        .mapToObj(i -> new Todo(i, "title-" + i, "detail-" + i))
                        .collect(Collectors.toList()));
    }
    @Test
    public void testCount() {
        Assert.assertEquals(10, todoService.countTodo());
    }



}
