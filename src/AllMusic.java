public class AllMusic {
    public static void main(String[] args) {

        MusicStyles classicMusic = new ClassicMusic();
        MusicStyles popMusic = new PopMusic();
        MusicStyles rockMusic = new RockMusic();


        MusicStyles[] musicStyle = new MusicStyles[]{
                new ClassicMusic(), new PopMusic(), new RockMusic()
        };

        for (MusicStyles musicStyles : musicStyle) {
            musicStyles.playMusic();

        }


    }


}

