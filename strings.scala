 import scala.math.min

object strings  {
   def getSentenceType(sentence : String) : String = {
    
       
                       if(sentence.endsWith(".")) { 
                           "declarative"
                                } 
                        else if (sentence.endsWith("?")) {
                        "interrogative"
                        }
                        else if (sentence.endsWith("!")){
                        "exclamatory"
                        }else{
                        "unknown"
                        }
   }
   
 


//don't find space, return name, then return everything//
//findthatoccurenceofaspace,positiolessthan0, position was not found in the name.find that occurence ofaspace.
//-1 = not found 
//last space position is less than 0
//minus 1 returned but testing less than -
//when something is found, it's suppose to be non-negative (0 + length-1)
//not found, will be outside of that range
//last space position less than 0, return name
//DONT use return in scala
//0 to last space position, everyting up until space character
//last name. first name = glue the strings together "last name + ", " + " " + first name." 
//Run the function in terminal: getFormattedName(enter Name) after sbt console, get nto colder and do ls and then once in folder, do "sbt console." 
//val lastSpacePosition = name.lastIndex("  ")//
//steps basically. 1) find the position of first space in name because the first space can indicate two things: if the person just has a name such as "Madonna" no last or middle name or if they do have a first and last name, and also to find out the position of where the space is.
//also check position of last space to see if they have a middle or last name. Sstore positions of space and check for spaces using condition statements and .index of API. if a negative index indicates no space and a positive value 
//2) finding the position of the first space and storing it allows use to create substrings. create a substring everything before the first space to get the first name and then create a substring from lastposition to get last name 
//glue first and last name substrings together//
     
                     def getFormattedName(name : String) : String = { 
                            var fullname = ""
                            var firstPos = name.indexOf(" ")
                            var lastPos = name.lastIndexOf(" ")
                            if (lastPos < 0) {
                                fullname = name
                            } 
                         else {
                            var first = name.substring(0, lastPos)
                            var last = name.substring(lastPos+1)
                                fullname =last + ", " +first
                               }
                                fullname
                               }
   }

