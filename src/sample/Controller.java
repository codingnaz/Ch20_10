package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


import java.util.*;
import java.util.PriorityQueue;

public class Controller {
    @FXML
            public Label IntersectionOutput;
    @FXML
            public Label differenceOutput;
    @FXML
            public Label unionOutput;
    @FXML
            public Button calculate;



    PriorityQueue<String> list2= new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
    PriorityQueue<String> list1= new PriorityQueue<>(Arrays.asList("George", "Jim", "John", "Blake", "Kevin", "Michael"));





    public static<T> PriorityQueue<T> union(PriorityQueue<T> set1, PriorityQueue set2){
        PriorityQueue<T> temp= new PriorityQueue<>(set1);
        temp.addAll(set2);
        return temp;
    }

    public static<T> PriorityQueue<T> difference(PriorityQueue<T> set1, PriorityQueue set2){
        PriorityQueue<T> temp= new PriorityQueue<>(set1);
        temp.removeAll(set2);
        return temp;
    }

    public static<T> PriorityQueue<T> intersection (PriorityQueue<T> set1, PriorityQueue set2){
        PriorityQueue<T> temp= new PriorityQueue<>(set1);
        temp.retainAll(set2);
        return temp;
    }

    public void calculateButton(ActionEvent event){
        unionOutput.setText(  union(list1,list2).toString());
        unionOutput.setVisible(true);
        differenceOutput.setText(difference(list1,list2).toString());
        differenceOutput.setVisible(true);
        IntersectionOutput.setText(intersection(list1,list2).toString());
        IntersectionOutput.setVisible(true);


    }



}
