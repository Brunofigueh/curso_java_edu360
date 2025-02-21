package br.com.edu.Tarefas;
import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Tarefas {
	private String tasks;
	private ArrayList<String> list;
	//original generated list
	private ArrayList<String> taskList = new ArrayList<>();
	private ArrayList<String> sortList = new ArrayList<>();
	private ArrayList<String> chroList = new ArrayList<>();
	
	
	
	
	//class method constructor
	Tarefas () {
		
	}
	
	//getter list
	protected ArrayList<String> getList(){
		return this.list;
	}
	//setter list
	protected void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	
	//getter
	protected String getTasks() {
		return this.tasks;
	}
	 //setter
	protected void setTasks(String tasks) {
		this.tasks = tasks;
	}
	
	//Add task in main list
	public void addTask(String tasks) {
		//take the actual time
		LocalDateTime timeNow = LocalDateTime.now();
				
		//formated date and time to display of user
		DateTimeFormatter format_ = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dateFormated = timeNow.format(format_);
		
		taskList.add(tasks);
		chroList.add(dateFormated);
	}
	
	//List all elements
	private void listTask(ArrayList<String>list) {
		System.out.println("------------------TAREFAS----------------------------");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i+1+" - "+list.get(i));
		}
		System.out.println("-----------------------------------------------------");
	}
	
	//public method to display the list according to options
	public void listedTasks() {
		listTask(taskList);
	}
	
	//Delete elements
	public void delTask(int index) {
		//remove the selected index for the both list
		taskList.remove(index);
		chroList.remove(index);
		System.out.println("lista deletada :"+ taskList);
	}
	
	//Sort in alphabetical order
	public void sortdTask() {
		sortList = taskList;
		Collections.sort(sortList);
		listTask(sortList);
		
	}
	
	//Sort in chronological order
	public void chroSort() {
				
		for(int i = 0; i < taskList.size(); i++) {
				System.out.println(i+1+" - "+taskList.get(i)+" :"+chroList.get(i));
				
		}
		
	}
	
}
