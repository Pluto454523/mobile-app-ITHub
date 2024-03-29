package com.example.it_hub;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LocationFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LocationFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LocationFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LocationFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LocationFragment newInstance(String param1, String param2) {
        LocationFragment fragment = new LocationFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private ListView listView;

    private static String[] StudyTitle = {
            "ห้องพวงคราม 2",
            "ห้องพวงแสด",
            "ห้องพวงคราม 1",
            "ห้อง 4-21-B",
            "ห้อง 4-21-A"

    };

    private static String[] StudyDescription = {
            "ห้องสำหรับจัดกิจกรรมและการเรียนต่างๆ\n" + "ที่ต้องใช้พื้นที่ในการนำเสนอ และแสดงบนจอโปรเจคเตอร์ เป็นห้อง\n" + "ขนาดใหญ่ ที่นั่งมีลักษณะเป็นขั้นบันไดขึ้นไป ใช้สำหรับนั่งชมกิจกรรม",
            "ห้องสำหรับการทำกิจกรรมต่างๆ ในวันสำคัญต่างๆ\n" +"เช่น วันไหว้ครู และใช้สำหรับการสอบกลางภาคและปลายภาคเพราะมีขนาดที่ใหญ่\n" + "รองรับนักศึกษาสอบได้เยอะ อีกทั้ง ในวันเรียนปกติในบางวิชาก็มีการเรียนการสอนที่ห้องพวงแสด",
            "ห้องสำหรับจัดกิจกรรมและการเรียนต่างๆ\n" + "ที่ต้องใช้พื้นที่ในการนำเสนอ และแสดงบนจอโปรเจคเตอร์ เป็นห้อง\n" + "ขนาดใหญ่ ที่นั่งมีลักษณะเป็นขั้นบันไดขึ้นไป และห้องนี้จะต่างจากพวง\n" + "คราม 2 คือจะมีโต๊ะอยู่หน้าเก้าอี้ สำหรับการเขียนงาน   ",
            "ใช้สำหรับการเรียนการสอนในหลายๆวิชา หรือใช้สำหรับการทำกิจกรรม \n" + "หรือใช้ทำการอบรมในโอกาสต่างๆ  ",
            "ใช้สำหรับจัดการเรียนการสอนต่างๆ\n" + "และมักใช้ในการจัดกิจกรรม ที่เป็นการบรรยาย และแนะนำ\n" + "จากรุ่นพี่ศิษย์เก่าในการฝึกงานในอนาคต\n"
    };

    private static int[] StudyImages = {
            R.drawable.study_image_1,
            R.drawable.study_image_2,
            R.drawable.study_image_3,
            R.drawable.study_image_4,
            R.drawable.study_image_5,
    };

    private static String[] LabTitle = {
            "ห้อง 4-01-A",
            "ห้อง 4-01-B ",
            "ห้อง 4-08"
    };

    private static String[] LabDescription = {
            "เอาไว้ใช้ทําหรับเขียนโปรเเกรม\n" + "หรือเอาไว้ทํางานที่จะต้องใช้งานทรัพยากรเครื่อง\n" + "มากๆเพราะคอมที่ห้องนี้จะมีสเปคที่ใหม่ เอาไว้ทํางาน\n" + "กราฟิกเขียน 3D เพราะจะประมวลผลได้ดีและเร็วขึ้น",
            "หเอาไว้ใช้ทําหรับเขียนโปรเเกรม\n" + "หรือเอาไว้ทํางานที่จะต้องใช้งานทรัพยากรเครื่อง\n" + "ไม่มากสามารถทํางานทั่วไปได้ดี",
            "เอาไว้ใช้ทําหรับเขียนโปรเเกรม\n" + "หรือเอาไว้ทํางานที่จะต้องใช้งานทรัพยากรเครื่อง\n" + "ไม่มากสามารถทํางานทั่วไปได้ดีเเต่ส่วนมาห้องนี้จะทําการเรียนวิชาทั่วไปที่ไม่ได้มีการประมวลผลหนักๆมากกว่า"
    };

    private static int[] LabImages = {
            R.drawable.lab_image_1,
            R.drawable.lab_image_2,
            R.drawable.lab_image_3,
    };

    private static String[] LocationTitle = {
            "โรงอาหาร",
            "โรงยิม",
            "รูปปั้นรัชกาลที่ 4",
            "ศาลาหลวงพ่อสิงห์"

    };

    private static String[] LocationDescription = {
            "สถานที่ใช้สำหรับรับประทานอาหาร และซื้อเครื่องดื่ม\n" + "เวลาพักเที่ยงอาจารย์ส่วนใหญ่ จะมารับประทานอาหารที่โรงอาหาร ",
            "โรงยินใช้สำหรับเล่นกีฬา มีพื้นที่สำหรับการเล่น เบ็ต,ฟุตซอล,บาส ในตอนเย็น ในบางโอกาศ โรงยินจะใช้ในการจัดกิจกรรมงานกีฬาต่างๆ",
            "เป็นสัญลักษณ์ของมหาลัยเอาไว้กราบไหว้บูชา ในบางโอกาสรุ่นที่สําเร็จการศึกษาไปถ่ายรูปในบางโอกาส",
            "สถานที่สิ่งสิ่งศักดิ์สิทธิ์ในมหาลัย ใช้ในวันสำศัญทางศาสนา หรือใช้ในการกราบไหว้ นักศึกษาใกล้สอบหลายคนชอบไปกราบไหว้องค์ท่านเป็นประจำ"
    };

    private static int[] LocationImages = {
            R.drawable.location_image_1,
            R.drawable.location_image_2,
            R.drawable.location_image_3,
            R.drawable.location_image_4
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_fragment, container, false);
        listView = (ListView) rootView.findViewById(R.id.listLocation);

        LinearLayout btnStudyRoom = rootView.findViewById(R.id.btnStudyRoom);
        btnStudyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setListView(StudyTitle, StudyDescription, StudyImages);
            }
        });


        LinearLayout btnLab = rootView.findViewById(R.id.btnLab);
        btnLab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setListView(LabTitle, LabDescription, LabImages);
            }
        });


        LinearLayout btnInternalLocation = rootView.findViewById(R.id.btnInternalLocation);
        btnInternalLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setListView(LocationTitle, LocationDescription, LocationImages);
            }
        });


        setListView(StudyTitle, StudyDescription, StudyImages);
        return rootView;
    }

    private void setListView(String[] Titles, String[] Descriptions, int[] Images) {
        LocationListViewAdapter adapter = new LocationListViewAdapter(getContext(), Titles, Descriptions, Images);
        listView.setAdapter(adapter);
    }
}

class LocationListViewAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] Names, Descriptions;
    private final int[] Images;
    public LocationListViewAdapter(Context ctx, String[] Names, String[] Descriptions, int[] Images) {
        super(ctx, R.layout.home_view_layout, Names);
        this.context = ctx;
        this.Names = Names;
        this.Descriptions = Descriptions;
        this.Images = Images;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.location_room_list_layout, null, true);

        TextView locationName = (TextView) rowView.findViewById(R.id.locationName);
        locationName.setText(Names[position]);

        TextView locationDescription = (TextView) rowView.findViewById(R.id.locationDescription);
        locationDescription.setText(Descriptions[position]);


        ImageView locationImage = (ImageView) rowView.findViewById(R.id.locationImage);
        locationImage.setImageResource(Images[position]);

        return rowView;
    }
}