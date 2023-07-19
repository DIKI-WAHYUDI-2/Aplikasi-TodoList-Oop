package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {

        testRemoveTodoList();

    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("halo");
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Halo");
        todoListService.addTodoList("Ya");
        todoListService.addTodoList("HAAHAHAHAH");

        todoListService.showTodoList();

    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Halo");
        todoListService.addTodoList("Ya");
        todoListService.addTodoList("HAAHAHAHAH");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(1);

        todoListService.showTodoList();




    }
}
