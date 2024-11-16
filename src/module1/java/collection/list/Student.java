package module1.java.collection.list;

public class Student {
private long id;
private String name;


public Student(long id, String name) {
	
	this.id = id;
	this.name = name;
}

@Override
public String toString() {
	return "Student =  [id=" + id + ", name=" + name + "]";
}

public long getId() {
	return id;
}
public void setId(long myId) {
	this.id = myId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
