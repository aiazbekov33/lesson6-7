package com.example.lesson6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class StartFragment extends Fragment {
    ArrayList<GameModel> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.start_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendArrayModel();
            }
        });
    }

    private void sendArrayModel() {
        GameModel model1 = new GameModel("1 уровень",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkfrZFqvRVe0P4QJStfL2r0qaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkdNf5U0PrK-qmOH4WUGolQ6aKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkfWLgQgISfdmxIaCZDYbXzqaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkCdabpoELgRNbSQwIb5NqmKaKTM5SRkZCeTgDn6uOyic",
                "Улан");
        GameModel model2 = new GameModel("2 уровень",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkD94o1m2UYRRmK8Sy3mNT8aaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkcOcc8j5LL5udhUpaxCfiD6aKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkznRd6IivuWsOYSnAqiYyDqaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1Rkag7gQRvIkMN1Ypa1W56fxKaKTM5SRkZCeTgDn6uOyic",
                "Жаркынбек");

        GameModel model3 = new GameModel("3 уровень",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1Rkrz8O7vsf7AI4KHKX0-_-F6aKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkkwJ6pUSyKbQ4-3st44ZnIKaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkdI_drsQ5CwfU51IKyD5PA6aKTM5SRkZCeTgDn6uOyic",
                "https://24.kg/thumbnails/38f71/84e10/52659_w750_h_r.jpg",
                "Урмат");
        GameModel model4 = new GameModel("4 уровень",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkeizUHDPdzjmuoC-AMzsHIaaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1Rk57PwNHKnz4AI9m9IMqFZs6aKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkBL6jevKhoroq2KboJW2T0qaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkwGs5__e6jmojWoL3uvE3raaKTM5SRkZCeTgDn6uOyic",
                "Бакыт");

        GameModel model5 = new GameModel("5 уровень",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkUcoh3pPq9k8mrj4-nSYU36aKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkSIA2i4SiQYnIqgpcFO0JV6aKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkXy4z2RBXPiqS3jXOYrdkJKaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkjmoI0kg0eQiPYruYld3QhaaKTM5SRkZCeTgDn6uOyic",
                "Ислан");

        GameModel model6 = new GameModel("6 уровень",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkY_b8IYtrWGRg8qnWzBQjCaaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1Rk54bZKOnRMmAcUpy8yE9E-KaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1Rk1oFciwf6UwroWDJjuec8wKaKTM5SRkZCeTgDn6uOyic",
                "https://w7.pngwing.com/pngs/691/783/png-transparent-silhouette-businessman-briefcase-full-length-men-standing-confidence-people-thumbnail.png",
                "Азиз");
        GameModel model7 = new GameModel("7 уровень",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1Rka6qY8hubtxhPSZwEV4wyxqaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkcdRYYolawT-bD1vH0G5BTKaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RktAORmMn1WrcEK2KMB5EEIqaKTM5SRkZCeTgDn6uOyic",
                "https://i.mycdn.me/i?r=AzEPZsRbOZEKgBhR0XGMT1RkBNBcFhyqjfECKhGKA5N-jqaKTM5SRkZCeTgDn6uOyic",
                "Улук");

        GameModel model8 = new GameModel("8 уровень",
                "https://n1s1.elle.ru/1d/90/7f/1d907f63a3a2f2f57061873426eb46ef/728x542_1_57f02985e89f8f7f7a805a40d4af0694@940x700_0xc35dbb80_17935956531499763989.jpeg",
                "https://static.wikia.nocookie.net/peppa-pig/images/2/27/%D0%A1%D0%B2%D0%B8%D0%BD%D0%BA%D0%B0_%D0%9F%D0%B5%D0%BF%D0%BF%D0%B0-0.png/revision/latest?cb=20190819080228&path-prefix=ru",
                "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAQMAAADCCAMAAAB6zFdcAAAAnFBMVEUAAAAEBAQDAwEHBwUAAAG3s7QHBQYNDQ0hGBsvLy8YGBhDQ0FnZ2WpqacyMjCCgoAgIB/AvL3Fw8S7trikoqPHv8ImICIaDxPNx8llYGKRj5BgYGBISEZXV1UVFROTk5FtbWubm5t6engmJiQ4ODa3t7WKiImtqqzV0dK2rrGfmJqGgIJ8d3lqZWeXjZBUTU9BOTwwJyoSBQpIQkSp47iUAAACyUlEQVR4nO3aaXOiQBCA4eaOiIbDAzQkRl2JxqzX//9vOwNulrV2K99ClfM+aoSxUjXdMkMzIgIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAL5gdd2Bzlm1rnvRLXIA46cCq3l9joNm35hhYVt2E/9ni2EJ0G5TIJ877m37XVLHgO2oJARWK1hHbFtnxlaHgt1h576L5fze8Fut18ht23Zu/+H+qO+7H0XRfNg+6O1A4qeyLIeBGJACkef54GWxHL2WrSQ4MnwcPS5fBlGoR8Wdc2X1MugNh0vvNWw1B9FgOeyvfwzKznr2fVxx+pHE8VNUBq1zYbCO+vFw9bjo1xPmnVNxO45t6/nwTw70eSKwJYgDx4gJwVFh6jHvt+uAQJ80/aZQuvv6wNX1gWL9XQxdrx6NqJCkLpJULST1UGhdLFz3jEiBLhD0rHdTKVty2wbD3P8k+DXfIQkcBwAAAKhZ/9lWZbMY8fOCXJcOWnwJgqC9rmaAawbC9dN8ViV5nip5/T57FhMuoJolo9V8U3lemiSJl3leUnlplWTV2+giYsC6crNmWHqZjt1Lsq3aUJvpdpx46WitEmRADuqFM3/n5anKwDjLxuNxnmXb3e7n+34fimXIipqKsvjYb37udOA69I/icDxNJtODL2b88FwLD+fJ8dg7nk6Th+lZPR6USaE/MiUHrlyO6s1XsU9V+PXzfD5dxPLNGAqNxWg32xeHi3Y4HIpiv9lM9Qdu1z37LpacRkmSp9m48rJtnuVj9SjEdY3JgOjicDir0qwpDPJK1QmjQrf6JiXBkni+ea3esjTx1J/dXtVHvm+5pkyJiqMr5rD3NC/eN5vZolwHKgO+IcXBVev+izAM9U0H+r48MWo+aIS9XvzcdSe6Fq56cdB1J9A5o+bAfyMFAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADAdL8APyciUzA+45cAAAAASUVORK5CYII=",
                "data:image/jpeg;base64,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",
                "Азамат");

        if (list.size() == 0) {

            list.add(model1);
            list.add(model2);
            list.add(model3);
            list.add(model4);
            list.add(model5);
            list.add(model6);
            list.add(model7);
            list.add(model8);
        }

        Bundle bundle = new Bundle();
        bundle.putSerializable("model", list);
        LevelFragment fragment = new LevelFragment();
        fragment.setArguments(bundle);

        getParentFragmentManager()
                .beginTransaction()
                .replace(R.id.container_main, fragment).addToBackStack("")
                .commit();
    }
}