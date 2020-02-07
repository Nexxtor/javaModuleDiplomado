package com.naldana.models;


public class Attendance {

  private long id;
  private long studentId;
  private long eventId;
  private String attendance;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }


  public long getEventId() {
    return eventId;
  }

  public void setEventId(long eventId) {
    this.eventId = eventId;
  }


  public String getAttendance() {
    return attendance;
  }

  public void setAttendance(String attendance) {
    this.attendance = attendance;
  }

}
