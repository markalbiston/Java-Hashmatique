import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    HashMap<String, String> trackList = new HashMap<String, String>();
    public HashMap<String, String> MakeTrackList(){
        trackList.put("Hey Jealousy", "if you don't expect too much from me you might not be let down");
        trackList.put("Keasbey Nights", "when they come for me i'll be sitting at my desk with a gun in my hand wearing a bulletproof vest");
        trackList.put("Brooklyn", "everybody's moving to brooklyn");
        trackList.put("Poor Boy", "johnny was a poor boy who thought he needed money");
        return trackList;
    }
    public String GetTrack(String title){
        return trackList.get(title);
    }
    public boolean PrintTracks(){
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + ": " + trackList.get(key));
        }
        return true;
    }
}