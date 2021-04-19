package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://cdn.pixabay.com/photo/2013/07/12/18/35/alien-153542_960_720.png"),
            new User("002", "Paul", "https://cdn.pixabay.com/photo/2016/08/21/18/48/emoticon-1610518_960_720.png"),
            new User("003", "Phil", "https://cdn.pixabay.com/photo/2013/07/12/18/35/alien-153542_960_720.png"),
            new User("004", "Guillaume", "https://cdn.pixabay.com/photo/2016/08/21/18/48/emoticon-1610518_960_720.png"),
            new User("005", "Francis", "https://cdn.pixabay.com/photo/2013/07/12/18/35/alien-153542_960_720.png"),
            new User("006", "George", "https://cdn.pixabay.com/photo/2016/08/21/18/48/emoticon-1610518_960_720.png"),
            new User("007", "Louis", "https://cdn.pixabay.com/photo/2013/07/12/18/35/alien-153542_960_720.png"),
            new User("008", "Mateo", "https://cdn.pixabay.com/photo/2016/08/21/18/48/emoticon-1610518_960_720.png"),
            new User("009", "April", "https://cdn.pixabay.com/photo/2020/09/17/17/28/emoji-5579896_960_720.png"),
            new User("010", "Louise", "https://cdn.pixabay.com/photo/2020/09/14/18/34/shocked-5571739_960_720.png"),
            new User("011", "Elodie", "https://cdn.pixabay.com/photo/2020/09/17/17/28/emoji-5579896_960_720.png"),
            new User("012", "Helene", "https://cdn.pixabay.com/photo/2020/09/14/18/34/shocked-5571739_960_720.png"),
            new User("013", "Fanny", "https://cdn.pixabay.com/photo/2020/09/17/17/28/emoji-5579896_960_720.png"),
            new User("014", "Laura", "https://cdn.pixabay.com/photo/2020/09/14/18/34/shocked-5571739_960_720.png"),
            new User("015", "Gertrude", "https://cdn.pixabay.com/photo/2020/09/17/17/28/emoji-5579896_960_720.png"),
            new User("016", "Chloé", "https://cdn.pixabay.com/photo/2020/09/14/18/34/shocked-5571739_960_720.png"),
            new User("017", "April", "https://cdn.pixabay.com/photo/2020/09/17/17/28/emoji-5579896_960_720.png"),
            new User("018", "Marie", "https://cdn.pixabay.com/photo/2020/09/14/18/34/shocked-5571739_960_720.png"),
            new User("019", "Henri", "https://cdn.pixabay.com/photo/2013/07/12/18/35/alien-153542_960_720.png"),
            new User("020", "Rémi", "https://cdn.pixabay.com/photo/2016/08/21/18/48/emoticon-1610518_960_720.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://cdn.pixabay.com/photo/2013/04/01/09/07/kiss-98454_960_720.png"),
            new User("022", "Geoffrey", "https://cdn.pixabay.com/photo/2019/06/12/17/18/smiley-4269804_960_720.jpg"),
            new User("023", "Simon", "https://cdn.pixabay.com/photo/2012/04/14/17/14/emoticon-34647_960_720.png"),
            new User("024", "André", "https://cdn.pixabay.com/photo/2012/04/14/16/17/smiley-34473_960_720.png"),
            new User("025", "Leopold", "https://cdn.pixabay.com/photo/2014/04/03/11/47/angry-312142_960_720.png")
    );
}
