import java.util.HashMap;

public class HashmatiqueTest{
    public static void main (String[] args){
        Hashmatique makeList = new Hashmatique();
        HashMap<String, String> trackList = makeList.MakeTrackList();
        String singleTrack = makeList.GetTrack("Brooklyn");
        // System.out.println(trackList);
        System.out.println(singleTrack);
        Boolean wasPrinted = makeList.PrintTracks();
    }
}