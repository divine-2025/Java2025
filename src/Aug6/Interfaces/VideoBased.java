package Aug6.Interfaces;

public interface VideoBased {
    int numberOfReels();
    default int numberOfViews(){
        return 0;
    }

}
