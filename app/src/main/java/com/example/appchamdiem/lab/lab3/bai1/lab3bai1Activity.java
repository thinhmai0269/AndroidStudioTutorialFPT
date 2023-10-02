package com.example.appchamdiem.lab.lab3.bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appchamdiem.R;

import java.util.ArrayList;

public class lab3bai1Activity extends AppCompatActivity {
    ListView lVMonHoc;
    EditText addMonHoc;
    Button addButton;
    Button updateButton;
    Button removeButton;
    ArrayList <String> arraycourse;
    int selectedCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3bai1);
        lVMonHoc =(ListView)findViewById(R.id.ListView);
        addMonHoc = (EditText)findViewById(R.id.addmonhoc);
        addButton = (Button)findViewById(R.id.addbutton);
        updateButton = (Button)findViewById(R.id.updatebutton);
        removeButton = (Button)findViewById(R.id.deletebutton);

        arraycourse = new ArrayList<>();
        arraycourse.add("Android");
        arraycourse.add("Android2");
        arraycourse.add("Android3");
        arraycourse.add("Android4");
        arraycourse.add("Android5");
        arraycourse.add("Android6");
        ArrayAdapter adapter = new ArrayAdapter<>(
                lab3bai1Activity.this,
                android.R.layout.simple_list_item_1,
                arraycourse
        );
        lVMonHoc.setAdapter(adapter);

        lVMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(lab3bai1Activity.this, arraycourse.get(i), Toast.LENGTH_LONG).show();
            }
        });

        lVMonHoc.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                arraycourse.remove(i);
                adapter.notifyDataSetChanged();
                return false;
            }
        });
        addButton.setOnClickListener(view -> {
            String course = addMonHoc.getText().toString();

            if (course.isEmpty()) {
                Toast.makeText(lab3bai1Activity.this, "Chưa có nội dung", Toast.LENGTH_SHORT).show();
            } else {
                boolean isDuplicate = false;
                    for (String existingCourse : arraycourse) {
                    if (existingCourse.equals(course)) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) {
                    Toast.makeText(lab3bai1Activity.this, "Môn học đã tồn tại", Toast.LENGTH_SHORT).show();
                } else {
                    arraycourse.add(course);
                    adapter.notifyDataSetChanged();
                    Toast.makeText(lab3bai1Activity.this, "Đã thêm môn học "+course, Toast.LENGTH_SHORT).show();
                }
                addMonHoc.setText("");
            }
        });
        //chọn thành phần trong list
        lVMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                addMonHoc.setText(arraycourse.get(i));
                selectedCourse = i;
            }
        });
        //update
        updateButton.setOnClickListener(view -> {
            String updatedCourse = addMonHoc.getText().toString();

            if (updatedCourse.isEmpty()) {
                Toast.makeText(lab3bai1Activity.this, "Chưa có nội dung", Toast.LENGTH_SHORT).show();
            } else {
                arraycourse.set(selectedCourse, updatedCourse);
                adapter.notifyDataSetChanged();
                addMonHoc.setText("");
                Toast.makeText(lab3bai1Activity.this, "Đã update", Toast.LENGTH_SHORT).show();
            }
        });
        //delete
        removeButton.setOnClickListener(view -> {
            String updatedCourse = addMonHoc.getText().toString();

            if (updatedCourse.isEmpty()) {
                Toast.makeText(lab3bai1Activity.this, "Chọn lại môn học để xóa", Toast.LENGTH_SHORT).show();
            } else {
                arraycourse.remove(selectedCourse);
                adapter.notifyDataSetChanged();
                addMonHoc.setText("");
                Toast.makeText(lab3bai1Activity.this, "Đã xóa", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
