package com.example.it_hub;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.home_fragment, container, false);
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

        String []newsTitle = {
                "FITM Open House on Demand น้องอยากรู้...พี่พาดู\\n",
                "ประกาศรายชื่อผู้ผ่านคัดเลือกเป็นนักศึกษาใหม่ ประจำปีการศึกษา 2567  \\n",
                "เปิดรับสมัครนักศึกษาใหม่ TCAS รอบที่ 2 สำหรับผู้มีวุฒิ ม.6 ",
                "DEK67 เตรียมตัว! ดูรอบการรับสมัครของ FITM ได้ที่นี่ \\n",
                "รับสมัครวันสุดท้าย! สำหรับน้อง ๆ ที่มีคะแนน TGAT รหัสวิชา 90 \\n ",
                "คณะผู้บริหาร FITM ร่วมพิธีรำลึกถึงทวาปูชนียาจารย์ ในวันรวมน้ำใจชาว มจพ. ครบรอบ 65 ปี \\n",
                "ขอแสดงความยินดี กับบุคลากรของคณะเทคโนโลยีและการจัดการอุตสาหกรรม(FITM) \\n",
        };

        String []newsDescription = {
                "FITM Open House on Demand น้องอยากรู้...พี่พาดู\\n\n" + "\n" +"คณะเทคโนโลยีและการจัดการอุตสาหกรรม มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ วิทยาเขตปราจีนบุรี \\n\n" + "ขอเชิญชวนนักเรียน นักศึกษา ครู ผู้ปกครองเข้าร่วมมหกรรมเปิดบ้านที่ตามใจคุณ \\n\n" + "\"FITM Open House on Demand - น้องอยากรู้...พี่พาดู\" \\n\n" + "เยี่ยมชมคณะฯ ของเราได้ตลอดภาคการศึกษา แบบไม่ต้องรอใคร ไม่จำกัดจำนวน!\\n",
                "ประกาศรายชื่อผู้ผ่านคัดเลือกเป็นนักศึกษาใหม่ ประจำปีการศึกษา 2567  \\n\n" + "โครงการโควตาพื้นที่ รอบ 2 เพื่อเข้าศึกษาต่อคณะเทคโนโลและการจัดการอุตสาหกรรม \n" + "ระดับปริญญาตรี 4 ปี https://drive.google.com/.../1aNZEcIg6K4GXMS0JSj7\n" + "ระดับปริญญาตรี (ต่อเนื่อง/เทียบโอน) 2-3 ปี \\n\n" + "https://drive.google.com/.../1P0ZULB6ikj2dI8mULPq.../view... \\n",
                "คณะเทคโนโลยีและการจัดการอุตสาหกรรม (FITM) มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ วิทยาเขตปราจีนบุรี \\n\n" + "เปิดรับสมัครนักศึกษาใหม่ TCAS รอบที่ 2 สำหรับผู้มีวุฒิ ม.6 โครงการรับตรงใช้คะแนน A-LEVEL \\n\n" + " ดูรายละเอียดและสมัครได้ที่นี่ https://bit.ly/3xbaLcd ปิดรับสมัคร 31 มีนาคม 2567 นี้ \\n",
                "DEK67 เกียมตัว! ดูรอบการรับสมัครของ FITM ได้ที่นี่ \\n\n" + "กำหนดการรับนักศึกษา TCAS67 ของคณะเทคโนโลยีและการจัดการอุตสาหกรรม (FITM) \\n\n" + " มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ \\n\n" + " น้องๆ สามารถสมัครเรียน / ดูรายละเอียดโครงการ ดูหลักสูตร / ค่าเทอม / ตรวจสอบคุณวุฒิ \\n\n" + " คลิกที่นี่ https://sites.google.com/fitm.kmutnb.ac.th/fitmopenhouse \\n\\n",
                "รับสมัครวันสุดท้าย! สำหรับน้อง ๆ ที่มีคะแนน TGAT รหัสวิชา 90 \\n\n" + "สมัครเรียน ป.ตรี กับเรา FITM \\n\n" + "คณะเทคโนโลยีและการจัดการอุตสาหกรร มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ วิทยาเขตปราจีนบุรี ได้ทุกสาขา \\n\n" + "สาขาที่เปิดรับ \\n\n" + "คอมพิวเตอร์ช่วยออกแบบและบริหารงานก่อสร้าง (CA) \\n\n" + "เทศโนโลยีเครื่องกลและกระบวนการผลิต (MM) \\n\n" + "วิศวกรรมสารสนเทศและเครือข่าย (INE) \\n\n" + "วิศวกรรมอุตสาหการและการจัดการ (IEM) \\n\n" + "วิศวกรรมเกษตรและอาหาร (AFE) \\n\n" + "สมัครได้เลยกับ \\n\n" + "โครงการรับตรงใช้คะแนน TGAT/TPAT ปีการศึกษา 2567 \\n\n" + "ช่วงเวลาการรับสมัคร 10 มกราคม - 20 กุมภาพันธ์ 2567 \\n\n" + "อ่านรายละเอียดเพิ่มเติมและสมัครได้ที่ https://sites.google.com/fitm.kmutnb.ac.th/fitmopenhouse/apply-now/เปดรบตอนน?authuser=0 \\n\n",
                "คณะผู้บริหาร FITM ร่วมพิธีรำลึกถึงทวาปูชนียาจารย์ ในวันรวมน้ำใจชาว มจพ. ครบรอบ 65 ปี \\n\n" + "เมื่อวันที่ 19 กุมภาพันธ์ 2567 ผู้ช่วยศาสตราจารย์ ดร.กฤษฎากร บุดดาจันทร์ คณบดีคณะเทคโนโลยีและการจัดการอุตสาหกรรม (FITM) \\n\n" + "มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ วิทยาเขตปราจีนบุรี \\n\n" + "พร้อมคณะผู้บริหาร ได้เข้าร่วมพิธีรำลึกถึงทวาปูชนียาจารย์ ศาสตราจารย์ ดร.บุญญศักดิ์ ใจจงกิจ และ Dipl. Ing Karl Stützle \\n\n" + "ในงานวันรวมน้ำใจชาว มจพ. ประจำปี พ.ศ. 2567  “65 ปี มจพ. พลิกโฉม  พลิกความคิด สู่ความยั่งยืน” \\n\n" + "เนื่องในโอกาสวันคล้ายวันสถาปนามหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือครบ 65 ปี \\n\n" + "วันจันทร์ที่ 19 กุมภาพันธ์ พ.ศ. 2567 ณ ลานทวาปูชนียาจารย์ บริเวณหน้าอาคาร TGGS \\n\n" + "มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ กรุงเทพมหานคร \\n",
                "ขอแสดงความยินดี กับบุคลากรของคณะเทคโนโลยีและการจัดการอุตสาหกรรม(FITM) \\n\n" + "ได้แก่ อ.ดร.อรวิริยา นามสวัสดิ์ จากภาควิชาการออกแบบและบริหารงานก่อสร้างที่ได้รับรางวัลผู้ปฏิบัติงานดีเด่น ระดับส่วนงาน สายวิชาการ ประจำปี 2566 \\n\n" + "และคุณสุชาดา แสดง จากสำนักงานคุณบดี \\n\n" + "ที่ได้รับรางวัลผู้ปฏิบัติงานดีเด่น ระดับส่วนงาน สายสนับสนุนวิชาการ ประจำปี 2566 \\n",


        };

        int []newsImages = {
                R.drawable.news_image_1,
                R.drawable.news_image_2,
                R.drawable.news_image_3,
                R.drawable.news_image_4,
                R.drawable.news_image_5,
                R.drawable.news_image_6,
                R.drawable.news_image_7,

        };
        TextView linkNews = rootView.findViewById(R.id.linkNews);
        linkNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentView = new Intent(getActivity(), HomeListViewActivity.class);
                intentView.putExtra("contentTitles", newsTitle);
                intentView.putExtra("contentDescriptions", newsDescription);
                intentView.putExtra("contentImages", newsImages);
                intentView.putExtra("titleActivity", "ข่าวสารและกิจกรรม");
                startActivity(intentView);

            }
        });

        LinearLayout NewsLayout = rootView.findViewById(R.id.NewsLayout);
        for (int i = 0; i < newsImages.length; i++) {
            NewsLayout.addView(newImageView(newsImages[i], 410));
        }

        String []achievementTitle = {
                "“Kmutnb Innovation Awards 2019”\\n",
                "นศ. ITI ร่วมแสดงผลงาน เทคโนนิทรรศ น้อมเกล้า 60 ปี\\n",
                "ร่วมแสดงผลงาน\\n",
                "เข้าร่วมการแข่งขัน กิจกรรม  TESA Top Gun Rally 2023\\n",
                "การแข่งขันพัฒนาโปรแกรมคอมพิวเตอร์แห่งประเทศไทย ครั้งที่ 25 ผ่านเข้าสู่รอบชิงชนะเลิศ NSC 2023\\n",
                "การแข่งขันพัฒนาโปรแกรมคอมพิวเตอร์แห่งประเทศไทย ครั้งที่ 25  รอบสอง\\",


        };

        String []achievementDescription = {
                "“Kmutnb Innovation Awards 2019”\\n\n" + "งานประกวดสิ่งประดิษฐ์และนวัตกรรม มจพ.2562ระหว่างวันที่ 17-18 มีนาคม 2562 \\n\n" + "ณ หอประชุมประดู่แดง\\n\n" + "มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ\\n\n" + "มีผลงานของนักศึกษาและบุคลากรของภาควิชาเทคโนโลยีสารสนเทศ ดังนี้\\n\n" + "1.สติกเกอร์วัดความชื้นเมล็ดพืช\\n\n" + "นายสุรเชษฐ์ สะตะ\\n\n" + "นายสมรักษ์ มังสา\\n\n" + "อาจารย์ที่ปรึกษา อ.นัฎฐพันธ์ นาคพงษ์\\n\n" + "\n" + "2.ฉลากยาพูดได้\\n\n" + "นางสาววิกานต์ดา วงค์แจ้\\n\n" + "นางสาวธนภรณ์ ฟูคำ\\n\n" + "อาจารย์ที่ปรึกษา รศ.ดร.ยุพิน สรรพคุณ\\n\n" + "\u2028\n" + "3.เครื่องขอความช่วยเหลือเหตุการณ์ฉุกเฉินภายในอาคาร\\n\n" + "นางสาวขนิษฐา เชื้ออ่อน\\n\n" + "นายสหรัฐ รักษาถูก\\n\n" + "อาจารย์ที่ปรึกษา อ.นัฎฐพันธ์ นาคพงษ์\\n\n" + "\u2028\u2028\u2028\u2028\u2028\u2028\u2028\u2028\u2028\u2028",
                "นศ. ITI ร่วมแสดงผลงาน เทคโนนิทรรศ น้อมเกล้า 60 ปี\\n\n" + "โดยมีผลงานเข้าร่วมจัดแสดงใน เทคโนนิทรรศน้อมเกล้า 60 ปี แห่งการสร้างสรรค์ประดิษฐ์กรรมสู่นวัตกรรม ระหว่างวันที่ 15 - 18 มีนาคม 2562\\n\n" + "\n" + "ณ อาคารอเนกประสงค์ มหาวิทยาลัยเทคโนโลยีพระจอมเกล้าพระนครเหนือ\\n\n" + "\n" + "โดยมีผลงานที่ได้เข้าร่วมจัดแสดงดังต่อไปนี้\\n\n" + "\n" + "ชื่อผลงาน ชุดฝึกทักษะการเขียนอักษรเบรลล์เบื้องต้น\\n\n" + "นางสาว เบญจวรรณ พันนาม\\n\n" + "นาย ธนกฤต แก้วเนตร\\n\n" + "อาจารย์ที่ปรึกษา รศ.ดร.ยุพิน สรรพคุณ\\n\n" + "\n" + "ชื่อผลงาน เครื่องช่วยอ่านสำหรับผู้พิการทางสายตาและผู้สูงอายุ\\n\n" + "นางสาวพันธิตรา เรืองคำ\\n\n" + "ว่าที่ รต.พิชญุตม์ ชุมสาย ณ อยุธยา\\n\n" + "อาจารย์ที่ปรึกษา อาจารย์นพเก้า ทองใบ\\n",
                "รร่วมแสดงผลงาน\\n\n" + "\"วันวิชาการโรงเรียนนายร้อยพระจุลจอมเกล้า ปี 2555\"\\n\n" + "ชื่อผลงาน\"ระบบนำร่องอัตโนมัติ อากาศยานไร้คนขับภายในอาารด้วย Network Protocol\"\\n",
                "ภาควิชาเทคโนโลยีสารสนเทศ คณะเทคโนโลยีและการจัดการอุตสาหกรรม\\n\n" + "ขอเชิญชวนเพื่อนๆ พี่ๆ น้องๆ ร่วมส่งกำลังใจและแรงเชียร์ให้กับตัวแทนของภาควิชา\\n\n" + "ที่ได้เข้าร่วมการแข่งขัน กิจกรรม  TESA Top Gun Rally 2023\\n\n" + "โดยมีสมาชิกทีมได้แก่\\n\n" + "1. เฟิร์ส ยงยุทธ ชวนขุนทด นักศึกษา INE ชั้นปีที่ 2\\n\n" + "2. กอล์ฟ ฐิติพงษ์ ตะเพียนทอง นักศึกษา INE ชั้นปีที่ 2\\n\n" + "3. มิว พัชร์กวี กีรติตระกูล นักศึกษา INE ชั้นปีที่ 2\\n\n" + "4. โอเว่น ภานุวัฒน์ กลิ่นสุคนธ์ นักศึกษา INE ชั้นปีที่ 2\\n\n" + "5. เชน ชยังกูร ศรีวงษ์ นักศึกษา IT ชั้นปีที่ 1\\n\n" + "โดยหัวข้อในการประชันทักษะในปีนี้ คือ “ระบบแสดงผล และการจัดการสภาวะน้ำท่วม และน้ำแล้ง” (Monitoring and Management System of Flood and Drought Conditions)\\n",
                "ขอแสดงความยินดีกับตัวแทนของภาควิชาเทคโนโลยีสารสนเทศ ที่ได้ผ่านเข้าสู่รอบชิงชนะเลิศ NSC 2023\\n\n" + "ในการแข่งขันพัฒนาโปรแกรมคอมพิวเตอร์แห่งประเทศไทย ครั้งที่ 25\\n\n" + "จำนวน 4 โครงการ และ ได้รับทุนสนับสนุนรอบสอง 1 โครงการ\\n\n" + "จากโครงการทั้งหมดทั่วประเทศที่ส่งเข้าแข่งขันในปีนี้ จำนวนทั้งหมดทั้งสิ้น 1039 โครงการ\\n\n" + "โดยการแข่งขัน NSC 2023 รอบชิงชนะเลิศ ดำเนินแข่งขันแบบออนไลน์ ในวันที่ 27 เมษายน 2566\\n\n" + "ฝากร่วมเป็นกำลังใจให้กับพี่ ๆ ทุกกลุ่มด้วยนะครับ\\n\n" + "โครงการที่ผ่านเข้าสู่รอบชิงชนะเลิศ  มีดังนี้\\n\n" + "1.โครงการ 25P12E0060 แอปพลิเคชั่นฝึกทักษะป้องกันสภาวะสมองเสื่อม\\n\n" + "นายจิรพัส ติ๊บบุญทา ITI ปี 2\\n\n" + "นายธนโชติ นิวรวรรณ ITI ปี 2\\n\n" + "อาจารย์ที่ปรึกษา ผศ.จสต.นพเก้า ทองใบ\\n\n",
                "เมื่อวันที่ 25 มีนาคม 2566 นักศึกษาของภาควิชาเทคโนโลยีสารสนเทศ\\n\n" + " คณะเทคโนโลยีและการจัดการอุตสาหกรรม มจพ.วิทยาเขตปราจีนบุรี \\n\n" + " ที่ผ่านรอบคัดเลือก NSC 2023 : การแข่งขันพัฒนาโปรแกรมคอมพิวเตอร์แห่งประเทศไทย ครั้งที่ 25\\n\n" + "  ได้เข้าร่วมนำเสนอผลงาน รอบสอง ณ ม.บูรพา จังหวัดชลบุรี โดยมีรายชื่อโครงงานดังต่อไปนี้\\n\n" + "25P12E0052 แอปพลิเคชั่นฝึกทักษะจินตคณิต\\n\n" + "นางสาวปราณี คำแก้ว  ITI ปี 2\\n\n" + "นางสาวรัชนีวรรณ ตากรวดดี ITI ปี 2\\n\n" + "อาจารย์ที่ปรึกษา ผศ.จสต.นพเก้า ทองใบ\\n\n" + "25P12E0060 แอปพลิเคชั่นฝึกทักษะป้องกันสภาวะสมองเสื่อม\\n\n" + "นายจิรพัส ติ๊บบุญทา ITI ปี 2\\n\n" + "นายธนโชติ นิวรวรรณ ITI ปี 2\\n\n" + "อาจารย์ที่ปรึกษา ผศ.จสต.นพเก้า ทองใบ\\n",
        };

        int []achievementImages = {
                R.drawable.achievement_image_1,
                R.drawable.achievement_image_2,
                R.drawable.achievement_image_3,
                R.drawable.achievement_image_4,
                R.drawable.achievement_image_5,
                R.drawable.achievement_image_6,

        };


        TextView linkAchievement = rootView.findViewById(R.id.linkAchievement);
        linkAchievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentView = new Intent(getActivity(), HomeListViewActivity.class);
                intentView.putExtra("contentTitles", achievementTitle);
                intentView.putExtra("contentDescriptions", achievementDescription);
                intentView.putExtra("contentImages", achievementImages);
                intentView.putExtra("titleActivity", "ผลงานทั้งหมด");
                startActivity(intentView);

            }
        });

        LinearLayout AchivementLayout = rootView.findViewById(R.id.AchivementLayout);
        for (int i = 0; i < achievementImages.length; i++) {
            AchivementLayout.addView(newImageView(achievementImages[i], 410));
        }

        return rootView;


    }

    private ImageView newImageView(int drawable, int width) {

        ImageView imageView = new ImageView(requireContext());
        int widthImage =  (int) (width * requireContext().getResources().getDisplayMetrics().density);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        imageView.setPadding(0, 0, 15, 0);
        imageView.setImageResource(drawable);
        imageView.setAdjustViewBounds(true);

        return imageView;

    }
}