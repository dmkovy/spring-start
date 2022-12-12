package ru.dmkovy.springstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music musicBean = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);

        // Использовали DI и теперь можем вызывать musicPlayer из контекста
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

//        MusicPlayer firstMP = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMP = context.getBean("musicPlayer", MusicPlayer.class);
//
//        System.out.println(firstMP == secondMP);
//        System.out.println(firstMP.equals(secondMP));
//
//        System.out.println(firstMP);
//        System.out.println(secondMP);
//
//        firstMP.setVolume(10);
//        System.out.println(firstMP.getVolume());
//        System.out.println(secondMP.getVolume());

        DubstepMusic dubstepMusic1 = context.getBean("musicBean3", DubstepMusic.class);
        DubstepMusic dubstepMusic2= context.getBean("musicBean3", DubstepMusic.class);
        DubstepMusic dubstepMusic3 = context.getBean("musicBean3", DubstepMusic.class);

        System.out.println(dubstepMusic1.getSong());
        System.out.println(dubstepMusic2.getSong());
        System.out.println(dubstepMusic3.getSong());

        context.close();
    }
}
