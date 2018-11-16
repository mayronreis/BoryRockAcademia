package mayron.boryrockacademia;

/**
 * Created by mayro on 14/11/2017.
 */

public class Sample {

    private int ImageID;
    private String Title;
    private String Description;
    private Class activity;

    public Class getActivity() {
        return activity;
    }

    public void setActivity(Class activity) {
        this.activity = activity;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Sample(int imageID, String title, String description) {
        ImageID = imageID;
        Title = title;
        Description = description;
    }

//    public Sample(int imageID, String title, String description, boolean showButton) {
//        ImageID = imageID;
//        Title = title;
//        Description = description;
//
//    }
//
//    public Sample(int imageID, String title, String description, boolean showButton, Class<?> activity) {
//        ImageID = imageID;
//        Title = title;
//        Description = description;
//        this.activity = activity;
//    }



}
