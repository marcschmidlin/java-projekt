package data;


import entity.Object;
import entity.Project;
import entity.UserReader;
import entity.Objectonline;

import java.util.ArrayList;

public class Dataholding {
    ArrayList<UserReader> userReaderArrayList = new ArrayList<UserReader>();
    ArrayList<Project> projectArrayList = new ArrayList<Project>();
    ArrayList<Objectonline> objectonlineArrayList = new ArrayList<>();

    public void setProjectArrayList(Project p){
        projectArrayList.add(p);
    }

}
