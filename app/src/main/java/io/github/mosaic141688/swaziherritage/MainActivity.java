package io.github.mosaic141688.swaziherritage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomMenuButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.github.mosaic141688.swaziherritage.dummy.DummyContent;

public class MainActivity extends AppCompatActivity {
    public static List<ListContent> listContents = new ArrayList<>();
    public static List<ListContent> ussdCodes = new ArrayList<>();
    public static List<ListContent> sports = new ArrayList<>();
    public static List<ListContent> tourism = new ArrayList<>();
    public static List<ListContent> education = new ArrayList<>();
    public static List<ListContent> promotions = new ArrayList<>();
    public static List<ListContent> entour = new ArrayList<>();
    public static List<ListContent> etertainment = new ArrayList<>();
    public static List<ListContent> news = new ArrayList<>();
    public static List<ListContent> sport = new ArrayList<>();
    public static  View recyclerView ;//= findViewById(R.id.item_list);
    public static Activity activity;

    static {
        news.add(new ListContent("news","Local News","News From local media","local"));
        news.add(new ListContent("news","International News","News from International media","international"));
    }

    static {
        sport.add(new ListContent("sport","Local Sports","News From local media","local"));
        sport.add(new ListContent("sport","Europe Sports","European Sports","eu"));
        sport.add(new ListContent("sport","World Sports","International Sports","int"));
        sport.add(new ListContent("sport","South African Sports","News from International media","international"));
    }





    static{
    tourism.add(new ListContent("01","eSwatini do's","Activities to do when you are in Swaziland",Intent.ACTION_SEND));
    tourism.add(new ListContent("01","Hotels","Details About Hotels",Intent.ACTION_SEND));
    tourism.add(new ListContent("01","Site Seing","Details About Site Seing",Intent.ACTION_SEND));
    tourism.add(new ListContent("01","Restaurants","Details About Restaurants",Intent.ACTION_SEND));
    tourism.add(new ListContent("01","Shuttle Services","Available Shuttle Services",Intent.ACTION_SEND));
   // tourism.add(new )
}

static {
    etertainment.add(new ListContent("01","Clubs","Local Clubs",""));
    etertainment.add(new ListContent("01","Brai Houses","Eat the best brai",""));
    etertainment.add(new ListContent("01","Chill Sessions","Where to chill",""));
}

static {
    entour.add(new ListContent("entour","Tourism","Hotels, sites, Restaurants ","tourism"));
    entour.add(new ListContent("entour","Entertainment","Clubs, Brai Houses, Chill Sessions","entertainment"));
}

static {
    education.add(new ListContent("http://www.cambridgeinternational.org/programmes-and-qualifications/cambridge-igcse-accounting-0452/past-papers/","Past Exam Papers","Accounting IGCSE Papers",Intent.ACTION_SEND));
    education.add(new ListContent("http://www.cambridgeinternational.org/programmes-and-qualifications/cambridge-igcse-science-combined-0653/past-papers/","Past Exam Papers","Combined Science IGCSE Papers",Intent.ACTION_SEND));
    education.add(new ListContent("https://www.khanacademy.org/","Khan Academy Website","The Khan Academy Website Has Educational material for all levels in education",Intent.ACTION_SEND));
    education.add(new ListContent("https://www.intmath.com","Interactive Mathematics","A website that lets you learn mathematics while you play with it",Intent.ACTION_SEND));

}


    static {
        ussdCodes.add(new ListContent("tel:*123","Check Cell Phone Number","*123#",Intent.ACTION_SEND));
        ussdCodes.add(new ListContent("tel:*202#","Account Ballance","*202#",Intent.ACTION_SEND));
        ussdCodes.add(new ListContent("tel:*200*Voucher Pin#","Load Airtime Voucher","*200*Voucher Pin#",Intent.ACTION_SEND));
        ussdCodes.add(new ListContent("tel:*203*Bundle Amount#","Convert Airtime to data Bundle","*203*Bundle Amount#",Intent.ACTION_SEND));
        ussdCodes.add(new ListContent("tel:204*Package Amount#","Convert Airtime to a package","*204*Package Amount#",Intent.ACTION_SEND));
        ussdCodes.add(new ListContent("tel:*205* Amount * Cellphone Number#","Share Airtime using Mapha","*205* Amount * Cellphone Number#",Intent.ACTION_SEND));
        ussdCodes.add(new ListContent("tel:142","Access Your Voicemail","142",Intent.ACTION_SEND));
    }

    static {

        sports.add(new ListContent("01","WE ARE TIRED OF LOSING TO SWALLOWS – ‘MLABA’","\n" +
                "\n" +
                "MBABANE – Ahead of this afternoon’s capital city derby, Mbabane Highlanders midfielder Mlamuli ‘Mlaba’ Nkambule has declared ‘enough is enough.’\n" +
                "\n" +
                "\n" +
                "The left-footed midfielder is cognisant of the threat posed by their unbeaten rivals that have bossed over them for the past two seasons. Highlanders last won the Mbabane derby in April 2016 in the second round of the MTN League.\n" +
                "\n" +
                "\n" +
                "“We are a far better team now than the previous games. People should not read much on the recent loss to Milling Hotspurs. We know what the derby means to us as players, the team, including our supporters,” he said.\n" +
                "\n" +
                "\n" +
                "When reminded of the fact that his team has not won the derby in the past six games he said; “We are tired of losing to these people and our supporters should come at the stadium to cheer us because we are going to win.”\n" +
                "Captain Xolani ‘Chocco’ Sibandze added that they are motivated by Swallows’ 39-league unbeaten run streak.\n" +
                "\n" +
                "\n" +
                "“We want to break that run and it is good that we will be underdogs. It is in games like this where we have to show character. In our first round meeting, the team had just been put together with a handful of new signings but now, we have been together for a while and the coach (Professor Ngubane) has watched them (Swallows) play in a number of occasions,” the flying winger said.  \n" +
                "‘Chocco’ is expected to be named in a four-men attacking line alongside Mphucuko ‘Smoothies’ Dlamini, Mfan’fikile ‘Fash’ Ndzimandze and Menzi Sithole. \n" +
                "\n" +
                "\n" +
                "Swallows captain Tony Tsabedze insisted that they were not reading much into their unprecedented run in the league, leaving their unbeaten streak to bookmakers.\n" +
                "“Just like any game, it is about the three. The records are not important to us and we are prepared for the battle,” the left-footed winger said.\n"
                ,Intent.ACTION_SEND));
        sports.add(new ListContent("01","WE ARE TIRED OF LOSING TO SWALLOWS – ‘MLABA’","\n" +
                "\n" +
                "MBABANE – Ahead of this afternoon’s capital city derby, Mbabane Highlanders midfielder Mlamuli ‘Mlaba’ Nkambule has declared ‘enough is enough.’\n" +
                "\n" +
                "\n" +
                "The left-footed midfielder is cognisant of the threat posed by their unbeaten rivals that have bossed over them for the past two seasons. Highlanders last won the Mbabane derby in April 2016 in the second round of the MTN League.\n" +
                "\n" +
                "\n" +
                "“We are a far better team now than the previous games. People should not read much on the recent loss to Milling Hotspurs. We know what the derby means to us as players, the team, including our supporters,” he said.\n" +
                "\n" +
                "\n" +
                "When reminded of the fact that his team has not won the derby in the past six games he said; “We are tired of losing to these people and our supporters should come at the stadium to cheer us because we are going to win.”\n" +
                "Captain Xolani ‘Chocco’ Sibandze added that they are motivated by Swallows’ 39-league unbeaten run streak.\n" +
                "\n" +
                "\n" +
                "“We want to break that run and it is good that we will be underdogs. It is in games like this where we have to show character. In our first round meeting, the team had just been put together with a handful of new signings but now, we have been together for a while and the coach (Professor Ngubane) has watched them (Swallows) play in a number of occasions,” the flying winger said.  \n" +
                "‘Chocco’ is expected to be named in a four-men attacking line alongside Mphucuko ‘Smoothies’ Dlamini, Mfan’fikile ‘Fash’ Ndzimandze and Menzi Sithole. \n" +
                "\n" +
                "\n" +
                "Swallows captain Tony Tsabedze insisted that they were not reading much into their unprecedented run in the league, leaving their unbeaten streak to bookmakers.\n" +
                "“Just like any game, it is about the three. The records are not important to us and we are prepared for the battle,” the left-footed winger said.\n",Intent.ACTION_SEND));
        sports.add(new ListContent("03","TEAMS PETITION NETBALL LEADERSHIP AGAIN","\n" +
                "\n" +
                "MBABANE – It seems the National Netball Association of Swaziland (NNAS) executive committee is still unpopular with the teams.\n" +
                "\n" +
                "\n" +
                "Just when the leaders were celebrating the national side’s flawless outing in the Mission Foods Nations Cup in Singapore, where a silver medal was reaped about a fortnight ago; the teams burst their bubble. The executive committee was petitioned and summoned to a meeting at Zakhele in Manzini in the past weekend.\n" +
                "\n" +
                "\n" +
                "The concerns of the teams, it was reliably gathered, were headlined by the ‘lack of a clear development plan.’ A well-informed insider disclosed that the affiliates demanded a strategic and operational plan, among other things, but the executive allegedly reported that the documents were available, but were yet to be distributed.   \n"
                ,Intent.ACTION_SEND));
    }


    static {
        listContents.add(new ListContent("01", "DOCTORS’ GO-SLOW LOOMING OVER SLASHED ALLOWANCES", " \n" +
                "\n" +
                "MBABANE  –  A go-slow by doctors and technical staff in public health institutions is looming after government slashed their on-call and standby allowances.\n" +
                "\n" +
                "The reduction ranges from 30 to 50 per cent. Doctors and the technical staff were previously receiving 90 per cent of their annual basis salary as allowances.\n" +
                "The doctors and the technical staff contend that a newly-proposed Circular by government would reduce their on-call and standby allowance from 90 per cent of their annual basic salary to 60 per cent and 40 per cent for the technical staff.  They said this was in contravention of the Employment Act, 1980.\n" +
                "\n" +
                "\n" +
                "As a first step, the doctors have since filed an urgent application in the Industrial Court.\n" +
                "They want the court to interdict government from implementing its decision to pay 40 per cent to the technical staff and 60 per cent to professionals, of their annual salary across the board for on-call and standby allowances.\n" +
                "\n" +
                "\n" +
                "According to the doctors, the matter was urgent because government allegedly wanted to implement its decision in two weeks’ time.\n" +
                "The applicants (government doctors) also want the court to declare that  the decision by government to pay them as aformentioned instead of paying them in terms of Circular No.7 of 1993 would result in less favourable conditions of employment.\n" +
                "\n" +
                "\n" +
                "In her founding affidavit, Dr Zebenguni Mkhatshwa stated that on or about June 16, 1993, government issued out Establishment Circular No.7 of 1993. She submitted that the purpose of the Circular was to regulate claims and payments to the applicants (doctors and technical staff) of their standby and on-call allowance by government.\n"
                ,Intent.ACTION_SEND));
        listContents.add(new ListContent("01", "GLUE-SNIFFING MOTHER BASHES, INJURES SON (6)", " SITEKI – A boy (6) sustained serious injuries and was forced to flee and spend a night in a forest after he was brutally assaulted by his mother, who is reportedly on drugs.\n" +
                "\n" +
                "\n" +
                "The incident, which has been described as gruesome and shocking by some people, occurred recently at the rural community of Maphungwane, which is situated east of Siteki town.\n" +
                "\n" +
                "\n" +
                "The names of both the woman and her son are known to this publication but have been deliberately withheld for ethical reasons.\n" +
                "The minor was reportedly at home with other siblings when the minor attacked him with a stick, severely assaulting him on the head, hands and legs.\n" +
                "\n" +
                "\n" +
                "Scared boy flees into forest\n" +
                "SITEKI – Fearing for his life, the boy fled and hid in a forest before he was discovered by a relative who is a former member of Parliament (MP) of the area, a source privy to the details of the matter said.\n" +
                "\n" +
                "\n" +
                "He was then brought to the Siteki Social Welfare offices before he was taken to the police. He was then taken to Good Shepherd Hospital for medical attention. The mother was then arrested by the police and she was charged with contravening Section 48(1) of the Children’s Projection and Welfare Act No: 6/2012\n" +
                "\n" +
                "\n" +
                "Court papers allege that the woman did wrongfully and unlawfully assault the minor and further failed to seek medical assistance for the injuries he had sustained, thus exposing the boy to danger. It is further mentioned in court papers that the severe beating inflicted on the minor resulted in both physical and emotional injuries.\n" +
                "\n" +
                "The mother appeared before Acting Lubombo Principal Magistrate Donald Mavuso, who was sitting at the Siteki Magistrates Court. She was not asked to plead to the charges she is facing but she informed the court that she would represent herself during trial. Prosecutors informed the court that the minor has been discharged from hospital and that he is recuperating at a ‘safe place’."
                ,Intent.ACTION_SEND));
        listContents.add(new ListContent("01", "NO ‘SIX TO SIX’ CLUB PARTIES THIS FESTIVE", " MBABANE – Booze lovers will not be allowed to stay for extended hours in bars and certain drinking spots.\n" +
                "\n" +
                "\n" +
                "This basically means that the ‘six to six’ club parties will remain a fantasy this festive season.\n" +
                "This was confirmed by the Chief Commercial Officer (CCO) in the Ministry of Commerce, Industry and Trade Magenius Hlophe, during an interview yesterday.\n" +
                "\n" +
                "\n" +
                "Hlophe stressed that all businesses were expected to close shop at the time stipulated in their business licences. He explained that the law only permitted hotels, clubs, and sport clubs to exceed their normal operation hours although by only three hours. He stated that the three entities could operate for more hours after successfully applying for same and added that the extension was granted to an entity only once a month.\n" +
                "\n" +
                "\n" +
                "“You only apply once, there is no negotiating,” stressed Hlophe.\n" +
                "Hlophe stated that he was not sure if any entity within the three types of businesses had applied for an extension as he was out of office. He explained that the three types of businesses could only apply if they would be hosting certain functions. He added that businesses that were outside of this bracket would not be given any extension as owners knew that it was not provided for by the law.\n" +
                "\n" +
                "\n" +
                "“Even if you have a cross-over party, you cannot apply for an extension if you are not part of the three types of businesses,” emphasised Hlophe.\n" +
                "\n" +
                "\n" +
                "When asked about whether there would be an exception this festive season that could allow the three types of businesses to apply for extensions around Christmas and on New Year’s Eve, Hlophe responded to the negative. He stressed that there would be no negotiations in this regard and added that they had a system in place that showed if a certain company had already been granted permission to operate additional hours in that month."
                ,Intent.ACTION_SEND));
    }


    static{
        promotions.add(new ListContent("","","",""));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("We Work We connect We Serve");

        final BoomMenuButton bmb = findViewById(R.id.bmb);
        bmb.setNormalColor(R.color.colorPrimary);
        recyclerView = findViewById(R.id.item_list);

        final HashMap<String, Integer> icons = new HashMap<>();
        final HashMap<String, List> lists = new HashMap<>();
        final HashMap<String, Integer> colors = new HashMap<>();

        icons.put("Swazi4U", R.drawable.ic_action_swazifu);
        icons.put("News", R.drawable.ic_action_news);
        icons.put("Sports", R.drawable.ic_action_sport);
        icons.put("Entertainment & Tourism", R.drawable.ic_action_hot);
        icons.put("Educational Links",R.drawable.ic_action_school);

        lists.put("Swazi4U", ussdCodes);
        lists.put("News", news);
        lists.put("Sports", sport);
        lists.put("Entertainment & Tourism", entour);
        lists.put("Educational Links",education);



        colors.put("Swazi4U", R.color.red);
        colors.put("News", R.color.white);
        colors.put("Sports", R.color.grey);
        colors.put("Entertainment & Tourism", R.color.red);
        colors.put("Educational Links",R.color.white);


        activity = this;

        final List[] lst = new List[bmb.getPiecePlaceEnum().pieceNumber()];

        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            lst[i] = lists.get(DummyContent.ITEMS.get(i).title);
            HamButton.Builder builder = new HamButton.Builder()
                    .normalImageRes(icons.get(DummyContent.ITEMS.get(i).title))
                    .normalText(DummyContent.ITEMS.get(i).title)
                    .normalTextColorRes(colors.get(DummyContent.ITEMS.get(i).title)!=R.color.white?R.color.white:R.color.red)
                    .subNormalTextColorRes(colors.get(DummyContent.ITEMS.get(i).title)!=R.color.white?R.color.white:R.color.red)
                    .normalColorRes(colors.get(DummyContent.ITEMS.get(i).title))
                    .listener(new OnBMClickListener() {
                        @Override
                        public void onBoomButtonClick(int index) {
                            Log.e("Boom Index",""+index);
                            setupRecyclerView((RecyclerView) recyclerView,lst[index]);
                            toolbar.setTitle(DummyContent.ITEMS.get(index).title);
                            toolbar.setSubtitle(DummyContent.ITEMS.get(index).details);
                        }
                    })
                    .subNormalText(DummyContent.ITEMS.get(i).details);
            bmb.addBuilder(builder);
        }

        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView,listContents);

    }

    private static void setupRecyclerView(@NonNull RecyclerView recyclerView,List _list) {
        recyclerView.setAdapter(new MainActivity.SimpleItemRecyclerViewAdapter((MainActivity) activity, _list, false));
    }

    public static class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final MainActivity mParentActivity;
        private final List<ListContent> mValues;
        private final boolean mTwoPane;
        private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   DummyContent.MenuItem item = (DummyContent.MenuItem) view.getTag();
                if (mTwoPane) {
                    Bundle arguments = new Bundle();
                    arguments.putString(ItemDetailFragment.ARG_ITEM_ID, item.id);
                    ItemDetailFragment fragment = new ItemDetailFragment();
                    fragment.setArguments(arguments);
                    mParentActivity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.item_detail_container, fragment)
                            .commit();
                } else {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, ItemDetailActivity.class);
                    intent.putExtra(ItemDetailFragment.ARG_ITEM_ID, item.id);

                    context.startActivity(intent);
                }*/

             Log.e("View TAG","view.getTag().toString()");

            }
        };

        SimpleItemRecyclerViewAdapter(MainActivity parent,
                                      List<ListContent> items,
                                      boolean twoPane) {
            mValues = items;
            mParentActivity = parent;
            mTwoPane = twoPane;
        }

        @Override
        public MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list_content, parent, false);
            return new MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder(view);
        }


        @Override
        public void onBindViewHolder(final MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder holder, final int position) {
            holder.mIdView.setText(mValues.get(position).title);
            holder.expTv.setText(mValues.get(position).body);

            holder.itemView.setTag(mValues.get(position));
            holder.mIdView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.e("CLick",mValues.get(position).id);

                    if(mValues.get(position).id.equals("entour")){
                        HashMap<String,List> links = new HashMap<>();
                        links.put("tourism",tourism);
                        links.put("entertainment",etertainment);
                        setupRecyclerView((RecyclerView) recyclerView,links.get(mValues.get(position).action));
                        return;
                    }

                    if(mValues.get(position).id.equals("news")){
                        setupRecyclerView((RecyclerView) recyclerView,listContents);
                        return;
                    }

                    if(mValues.get(position).id.equals("sport")){
                        setupRecyclerView((RecyclerView) recyclerView,sports);
                        return;
                    }

                    Context context = holder.mIdView.getContext();
                    Intent sendIntent = new Intent();
                    //sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.setData(Uri.parse(mValues.get(position).id));
                   // sendIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
                   // sendIntent.setType("text/plain");


                    if (sendIntent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(sendIntent);
                    }else {
                        Log.e("Not ","Resolved");
                    }
                }
            });
            //holder.itemView.setOnClickListener(mOnClickListener);
        }

        @Override
        public int getItemCount() {

            return mValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView mIdView;
            final TextView mContentView;
            final ExpandableTextView expTv;

            ViewHolder(View view) {
                super(view);
                expTv = view.findViewById(R.id.expand_text_view);
                mIdView = view.findViewById(R.id.id_text);
                mContentView =  view.findViewById(R.id.expandable_text);
            }
        }
    }


}

class ListContent {

    public final String id;
    public final String title;
    public final String body;
    public final String action;

    public ListContent(String id, String title, String body,String action) {
        this.id = id;
        this.action = action;
        this.title = title;
        this.body = body;
    }

}
