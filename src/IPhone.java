import Interfaces.InternetBrowser;
import Interfaces.MusicPlayer;
import Interfaces.TelephoneFeature;

public class IPhone implements MusicPlayer, InternetBrowser, TelephoneFeature{
   
    @Override
    public void callNumber(int number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'callNumber'");
    }

    @Override
    public void pickUpCall(int number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pickUpCall'");
    }

    @Override
    public void startVoiceMail(int number) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startVoiceMail'");
    }

    @Override
    public void displayPage(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayPage'");
    }

    @Override
    public void addNewPage(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addNewPage'");
    }

    @Override
    public void refreshPage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refreshPage'");
    }

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'playMusic'");
    }

    @Override
    public void pauseMusic() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pauseMusic'");
    }

    @Override
    public void selectMusic(String musicName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectMusic'");
    }
}
