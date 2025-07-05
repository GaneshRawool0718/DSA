package Day15;

public class NoOfSegmentString {
/** Counts the number of segments in a string.
 *  A segment is defined as a contiguous sequence of 
 *  If the string is null or empty, returns 0.
 * */
    public int countSegments(String s) {

    if(s == null || s.isEmpty()) {
        return 0;
    }

    // Split the string by whitespace and count the segments
    // Using trim() to remove leading and trailing spaces
    String[] segments = s.trim().split("\\s+");
    return segments.length;
}
}
