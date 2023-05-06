package com.example.task4_onlineexamapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.JavascriptInterface;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank{

    private static List<QuestionsList> javaQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the default value of an uninitialized boolean variable in Java?", "true", "false", "null","0","false", "");
        final QuestionsList question2 = new QuestionsList("Which of the following is not a valid access specifier in Java?", "public", "private", "protected", "global", "global", "");
        final QuestionsList question3 = new QuestionsList("Which of the following is used to create a new object in Java?", "new", "create", "make", "instantiate", "new", "");
        final QuestionsList question4 = new QuestionsList("Which of the following keywords is used to exit a loop in Java?", "continue", "exit", "break", "return", "break", "");
        final QuestionsList question5 = new QuestionsList("Which of the following is not a Java keyword?", "final", "private", "class", "function", "function", "");
        final QuestionsList question6 = new QuestionsList("Which of the following is a feature of Java that makes it platform-independent?", "Bytecode", "Just-In-Time (JIT) compiler", "Garbage collection", "Multithreading", "Bytecode", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;

    }

    private static List<QuestionsList> phpQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What does PHP stand for?", "Personal Home Page", "Hypertext Preprocessor", "Preprocessed Hypertext", "Hypertext Processor", "Hypertext Preprocessor", "");
        final QuestionsList question2 = new QuestionsList("Which of the following variables is a super-global array in PHP?", "$_GET", "$_POST", "$_REQUEST", "All of the above", "All of the above", "");
        final QuestionsList question3 = new QuestionsList("What is the correct way to end a PHP statement?", ";", ":", ".", ",", ";", "");
        final QuestionsList question4 = new QuestionsList("Which of the following is used to print output in PHP?", "echo", "print", "printf", "All of the above", "All of the above", "");
        final QuestionsList question5 = new QuestionsList("What is the default scope of a PHP variable?", "Local", "Global", "Static", "None of the above", "Local", "");
        final QuestionsList question6 = new QuestionsList("Which of the following is used to define a function in PHP?", "define", "function", "var", "class", "function", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> htmlQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What does HTML stand for?", "Hyper Text Markup Language", "Hyperlinks and Text Markup Language", "Home Tool Markup Language", "High Tech Markup Language", "Hyper Text Markup Language", "");
        final QuestionsList question2 = new QuestionsList("Which of the following is used to define a hyperlink in HTML?", "<h1>", "<p>", "<a>", "<img>", "<a>", "");
        final QuestionsList question3 = new QuestionsList("What is the correct HTML tag for inserting an image?", "<picture>", "<image>", "<src>", "<img>", "<img>", "");
        final QuestionsList question4 = new QuestionsList("Which of the following HTML tags is used to define a paragraph?", "<p>", "<h1>", "<div>", "<span>", "<p>", "");
        final QuestionsList question5 = new QuestionsList("Which of the following HTML tags is used to create a numbered list?", "<ul>", "<li>", "<ol>", "<dl>", "<ol>", "");
        final QuestionsList question6 = new QuestionsList("What is the correct HTML tag for inserting a line break?", "<break>", "<lb>", "<br>", "<linebreak>", "<br>", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the primary language used for Android app development?", "Swift", "Java", "Objective-C", "C#", "Java", "");
        final QuestionsList question2 = new QuestionsList("What is an APK file in Android?", "An Android Package Kit file", "An Android Project Kit file", "An Android Platform Kit file", "An Android Program Kit file", "An Android Package Kit file", "");
        final QuestionsList question3 = new QuestionsList("What is the purpose of the AndroidManifest.xml file in an Android app?", "To define the app's layout", "To define the app's user interface", "To define the app's functionality", "To describe the app's components and permissions", "To describe the app's components and permissions", "");
        final QuestionsList question4 = new QuestionsList("What is an activity in Android?", "A user interface screen in an app", "A background service running in an app", "A component that processes data in an app", "A storage location for data in an app", "A user interface screen in an app", "");
        final QuestionsList question5 = new QuestionsList("Which of the following is the recommended way to store small amounts of data in an Android app?", "SharedPreferences", "SQLite database", "File storage", "Network storage", "SharedPreferences", "");
        final QuestionsList question6 = new QuestionsList("What is the purpose of the findViewById() method in Android?", "To locate a resource by its ID", "To set the content view of an activity", "To start a new activity", "To save data in a database", "To locate a resource by its ID", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }
}