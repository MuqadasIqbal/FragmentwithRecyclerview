package com.example.framgment;

import static com.example.framgment.databinding.ActivityMainBinding.inflate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.framgment.databinding.ActivityMainBinding;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= inflate(getLayoutInflater());
        setContentView(binding.getRoot());


       binding. carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyryRRjy25wIuog6PNgZoIFgIhKPaHImjMaw&usqp=CAU"));
       binding. carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRoeNPUc4BijyDEWzlXWyEGGR-BjBtVX7qrUg&usqp=CAU"));
       binding. carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQg5DCB_G5e8UOk3-Q0GC0SMyEijkf5rgeqyw&usqp=CAU"));
       binding. carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_2HNgGnLUG00CNPmc9RnRFurvCIXozkxE4uAG0RKP-CGOHziryWL3zXiUFuL6_ezkVN8&usqp=CAU"));
        binding.carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzhLTWVOtEm5kJHUFX3sYkzggaTHsxMxORYA&usqp=CAU"));
       binding. carousel.addData(new CarouselItem("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrIasUefbvfY8Rljy-HOLYQt1BGpeAfKx2eQ&usqp=CAU"));
       getSupportFragmentManager().beginTransaction().replace(R.id.main,new datafragment()).commit();

    }
}