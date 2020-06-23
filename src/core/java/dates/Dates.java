public static void main(String[] args){

public String subtractOneMonthFromDate(String date){

String profileDate = date;
SimpleDateFormat date1 = new SimpleDateFormat("yyyyMM");
Date d1 = null;

try{
  d1 = date1.parse(profileDate);
  
} catch(ParseException e){
  e.printStackTrace();
}

Calendar c = Calendar.getInstance();
c.setTime(d1);
c.add(Calendar.MONTH, -1);
Date d = c.getTime();
String res = date1.format(d);

return res;


}


}
