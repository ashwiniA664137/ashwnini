package com.ReportController;

public class ReportPojo {

int Id;
String Category ;
String Do;
String Dont;


public ReportPojo(int id, String category, String do1, String dont) {
	super();
	Id = id;
	Category = category;
	Do = do1;
	Dont = dont;
}
public ReportPojo() {
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
	return "ReportPojo [Id=" + Id + ", Category=" + Category + ", Do=" + Do + ", Dont=" + Dont + "]";
}










}
