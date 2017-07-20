package com.FeedbackController;

public class FeedbackPojo {

int Id;
String Name;
String Email;
String Comment;



public FeedbackPojo(int id, String name, String email,
		String comment) {
	super();
	Id = id;
	Name = name;
	Email= email;
	Comment=comment;
}




public String getName() {
	return Name;
}
public void setName(String name) {
	this.Name = name;
}



public FeedbackPojo() {
	// TODO Auto-generated constructor stub
	super();
}

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}


public String getEmail() {
	return Email;
}




public void setEmail(String email) {
	Email = email;
}




public String getComment() {
	return Comment;
}




public void setComment(String comment) {
	Comment = comment;
}




@Override
public String toString() {
	return "FeedbackPojo [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Comment=" + Comment + "]";
}










}
