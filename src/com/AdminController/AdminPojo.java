package com.AdminController;

public class AdminPojo {
	
	


int Id;
String Category ;
String Do;
String Dont;






public AdminPojo(int id, String category, String do1, String dont) {
	super();
	Id = id;
	Category = category;
	Do = do1;
	Dont = dont;
}
public AdminPojo() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getCategory() {
	return Category;
}
public void setCategory(String category) {
	Category = category;
}
public String getDo() {
	return Do;
}
public void setDo(String do1) {
	Do = do1;
}
public String getDont() {
	return Dont;
}
public void setDont(String dont) {
	Dont = dont;
}
@Override
public String toString() {
	return "AdminPojo [Id=" + Id + ", Category=" + Category + ", Do=" + Do + ", Dont=" + Dont + "]";
}










}
