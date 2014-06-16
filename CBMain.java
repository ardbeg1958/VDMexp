import jp.vdmtools.VDM.UTIL;
import jp.vdmtools.VDM.CGException;

public class CBMain {

    public static void main(String[] args){
      try{
        System.out.println(UTIL.toString((new CrossingBridge()).solve()));
      }
      catch (CGException e){
        System.out.println(e.getMessage());
      }
    }
}