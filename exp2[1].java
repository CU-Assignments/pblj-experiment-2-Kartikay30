
import java.util.*;


class Video{
    private String title;
    private boolean check;
    private int userRating;
    
    Video(String title,int userRating){
        this.title = title;
        this.userRating = userRating;
        this.check = true;
    }
    
    public boolean toCheck(){
        return check;
    }
    public void setIsThere(){
        
    }
    public String getTitle(){
        return this.title;
    }
    public void setReturned(){
        check = true;
    }
    public void setChecked(){
        check = false;
    }
    public void setRating(int rating){
        userRating = rating;
    }
    public int getRating(){
        return userRating;
    }
    public String toString(){
        return this.title +"     "+ this.userRating + "     "+ this.check;
    }
}

class VideoStore{
    List<Video> store = new ArrayList<Video>();
    
    public void addVideo(String name){
        store.add(new Video(name,0));
    }
    
    public void checkoutVideo(String name){
        for(Video obj:store){
            if(obj.getTitle() == name){
                obj.setChecked();
                break;
            }
        }
    }
    public void returnVideo(String name){
        for(Video obj:store){
            if(obj.getTitle() == name){
                obj.setReturned();
                break;
            }
        }
    }
    
    public void setRating(String name,int rating){
        for(Video obj:store){
            if(obj.getTitle() == name){
                obj.setRating(rating);
                break;
            }
        }
    }
    public void listInventory(){
        System.out.println("Title  Rating Checked");
        for(Video obj:store){
            System.out.println(obj);
            // String x;
            // if(obj.toCheck() == true) x = "True";
            // else x = "False";
            // System.out.println(obj.getTitle() + "     " + obj.getRating() + "     " + x);
        }
    }
    
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        // Video v1 = new Video("AK",101);
        // System.out.println("Video title: " + v1.getTitle());
        // System.out.println("Video rating: " + v1.getRating());
        // boolean flag = v1.toCheck();
        // if(flag) System.out.println("Video is There");
        // else System.out.println("Video not There");
        
        
        VideoStore storeObj = new VideoStore();
        storeObj.addVideo("AK");
        storeObj.setRating("AK",47);
        storeObj.checkoutVideo("AK");
        
        storeObj.addVideo("SK");
        storeObj.setRating("SK",70);
        storeObj.checkoutVideo("SK");
        
        storeObj.addVideo("DK");
        storeObj.setRating("DK",16);
        
        storeObj.addVideo("NK");
        storeObj.setRating("NK",20);
        
        storeObj.addVideo("YR");
        storeObj.setRating("YR",20);
        storeObj.checkoutVideo("YR");
        
        storeObj.addVideo("KJ");
        storeObj.setRating("KJ",55);
        
        storeObj.listInventory();
	}
}