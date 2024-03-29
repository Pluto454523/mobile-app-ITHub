package com.example.it_hub;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PersonelFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PersonelFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PersonelFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PersonelFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PersonelFragment newInstance(String param1, String param2) {
        PersonelFragment fragment = new PersonelFragment();
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

    private static String[] profilePositions = {
            "หัวหน้าภาควิชา",
            "ธุรการด้านวิจัย",
            "ธุรการด้านวิชาการ",
            "ธุรการด้านกิจการนักศึกษา",
            "ธุรการด้านงานประกันคุณภาพการศึกษา",
            "รองอธิการบดีวิทยาเขตปราจีนบุรี",
            "รองคณบดีฝ่ายสื่อสารองค์กรและอุตสาหกรรมสัมพันธ์",
            "รองคณบดีฝ่ายกิจการพิเศษ",
            "ผู้ช่วยผู้อำนวยการฝ่ายเทคโนโลยีสารสนเทศ วิทยาเขตปราจีนบุรี",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน",
            "อาจารย์ผู้สอน"
    };
    private static String[] profileNames = {
            "ผศ.ดร.ขนิษฐา นามี",
            "ผศ.ดร.วันทนี ประจวบศุภกิจ",
            "ผศ.ดร.พาฝัน ดวงไพศาล",
            "ผศ.สิวาลัย จินเจือ",
            "ผศ.ดร.สุพาภรณ์ ซิ้มเจริญ",
            "ผศ.พีระศักดิ์ เสรีกุล",
            "ผศ.สุปีติ กุลจันทร์",
            "ผศ.ดร. นัฎฐพันธ์ นาคพงษ",
            "ผศ.ดร.บีสุดา ดาวเรือง",
            "รศ.ดร.อนิราช มิ่งขวัญ",
            "ผศ.สมชัย เชียงพงศ์พันธ",
            "รศ.ดร. ยุพิน สรรพคุณ",
            "ผศ.อรบุษป์ วุฒิกมลชัย",
            "อ.ดร.ประดิษฐ์ พิทักษ์เสถียรกุล",
            "ผศ.นิมิต ศรีคำทา",
            "ผศ.นพดล บูรณ์กุศล",
            "อ.ดร.วัชรชัย คงศิริวัฒนา",
            "ผศ.นิติการ นาคเจือทอง",
            "ผศ.นพเก้า ทองใบ",
            "อ.ดร.ศรายุทธ ธเนศสกุลวัฒนา",
            "ศิรินทรา แว่วศรี",
            "อ.ดร.กาญจน์ ณ ศรีธะ"
    };
    private static String[] profileContacts = {
            "khanista.n@itm.kmutnb.ac.th",
            "wanthanee.p@itm.kmutnb.ac.th",
            "pafan.d@itm.kmutnb.ac.th",
            "siwalai.s@itm.kmutnb.ac.th",
            "supaporn.s@itm.kmutnb.ac.th",
            "peerasak.s@itm.kmutnb.ac.th",
            "supeeti.k@itm.kmutnb.ac.th",
            "nuttapun.n@itm.kmutnb.ac.th",
            "beesuda.d@itm.kmutnb.ac.th",
            "anirach.m@itm.kmutnb.ac.th",
            "somchai.c@itm.kmutnb.ac.th",
            "yupin.s@itm.kmutnb.ac.th",
            "oraboot.w@itm.kmutnb.ac.th",
            "pradit.p@itm.kmutnb.ac.th",
            "nimit.s@itm.kmutnb.ac.th",
            "noppadon.b@itm.kmutnb.ac.th",
            "watcharachai.k@itm.kmutnb.ac.th",
            "nitigan.n@itm.kmutnb.ac.th",
            "nopphagaw.t@itm.kmutnb.ac.th",
            "sarayoot.t@itm.kmutnb.ac.th",
            "sirintra.v@itm.kmutnb.ac.th",
            "karn.n@itm.kmutnb.ac.th"


    };
    private static int[] profileImages = {
            R.drawable.personel_profile_khanista,
            R.drawable.personel_profile_wanthanee_p,
            R.drawable.personel_profile_pafan_d,
            R.drawable.personel_profile_siwalai_s,
            R.drawable.personel_profile_supaporn_s,
            R.drawable.personel_profile_peerasak_s,
            R.drawable.personel_profile_supeeti_k,
            R.drawable.personel_profile_nuttapun_n,
            R.drawable.personel_profile_beesuda_d,
            R.drawable.personel_profile_anirach_m,
            R.drawable.personel_profile_somchai_c,
            R.drawable.personel_profile_yupin_s,
            R.drawable.personel_profile_oraboot_w,
            R.drawable.personel_profile_pradit_p,
            R.drawable.personel_profile_nimit_s,
            R.drawable.personel_profile_noppadon_b,
            R.drawable.personel_profile_watcharachai_k,
            R.drawable.personel_profile_nitigan_n,
            R.drawable.personel_profile_nopphagaw_t,
            R.drawable.personel_profile_sarayoot,
            R.drawable.personel_profile_sirintra_v,
            R.drawable.personel_profile_karn_n


    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.personel_fragment, container, false);

        PersonelListViewAdapter adapter = new PersonelListViewAdapter(getContext(), profilePositions, profileNames, profileContacts, profileImages);
        listView = (ListView) rootView.findViewById(R.id.listPersonel);
        listView.setAdapter(adapter);
        return rootView;
    }
}

class PersonelListViewAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] profilePositions, profileNames, profileContacts;
    private final int[] profileImages;
    public PersonelListViewAdapter(Context ctx, String[] profilePositions, String[] profileNames, String[] profileContacts, int[] profileImages) {
        super(ctx, R.layout.home_view_layout, profileNames);
        this.context = ctx;
        this.profilePositions = profilePositions;
        this.profileNames = profileNames;
        this.profileContacts = profileContacts;
        this.profileImages = profileImages;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.personel_view_layout, null, true);

        TextView profilePosition = (TextView) rowView.findViewById(R.id.profilePosition);
        profilePosition.setText(profilePositions[position]);

        TextView profileName = (TextView) rowView.findViewById(R.id.profileName);
        profileName.setText(profileNames[position]);

        TextView profileContact = (TextView) rowView.findViewById(R.id.profileContact);
        profileContact.setText(profileContacts[position]);

        ImageView profileImage = (ImageView) rowView.findViewById(R.id.profileImage);
        profileImage.setImageResource(profileImages[position]);

        return rowView;
    }
}