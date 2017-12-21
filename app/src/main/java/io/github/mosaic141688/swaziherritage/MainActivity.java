package io.github.mosaic141688.swaziherritage;

import android.content.Context;
import android.content.Intent;
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
import com.nightonke.boommenu.BoomMenuButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.github.mosaic141688.swaziherritage.dummy.DummyContent;

public class MainActivity extends AppCompatActivity {
    public static List<ListContent> listContents = new ArrayList<>();

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
                "In her founding affidavit, Dr Zebenguni Mkhatshwa stated that on or about June 16, 1993, government issued out Establishment Circular No.7 of 1993. She submitted that the purpose of the Circular was to regulate claims and payments to the applicants (doctors and technical staff) of their standby and on-call allowance by government.\n"));
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
                "The mother appeared before Acting Lubombo Principal Magistrate Donald Mavuso, who was sitting at the Siteki Magistrates Court. She was not asked to plead to the charges she is facing but she informed the court that she would represent herself during trial. Prosecutors informed the court that the minor has been discharged from hospital and that he is recuperating at a ‘safe place’."));
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
                "When asked about whether there would be an exception this festive season that could allow the three types of businesses to apply for extensions around Christmas and on New Year’s Eve, Hlophe responded to the negative. He stressed that there would be no negotiations in this regard and added that they had a system in place that showed if a certain company had already been granted permission to operate additional hours in that month."));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);

        final HashMap<String, Integer> icons = new HashMap<>();
        icons.put("Swazi4U", R.drawable.ic_action_swazifu);
        icons.put("News", R.drawable.ic_action_news);
        icons.put("Sports", R.drawable.ic_action_sport);
        icons.put("Entertainment & Tourism", R.drawable.ic_action_hot);

        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            HamButton.Builder builder = new HamButton.Builder()
                    .normalImageRes(icons.get(DummyContent.ITEMS.get(i).title))
                    .normalText(DummyContent.ITEMS.get(i).title)
                    .subNormalText(DummyContent.ITEMS.get(i).details);
            bmb.addBuilder(builder);
        }

        View recyclerView = findViewById(R.id.item_list);
        assert recyclerView != null;
        setupRecyclerView((RecyclerView) recyclerView);

    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {
        recyclerView.setAdapter(new MainActivity.SimpleItemRecyclerViewAdapter(this, listContents, false));
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
        public void onBindViewHolder(final MainActivity.SimpleItemRecyclerViewAdapter.ViewHolder holder, int position) {
            holder.mIdView.setText(mValues.get(position).title);
            holder.expTv.setText(mValues.get(position).body);

            holder.itemView.setTag(mValues.get(position));
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
                expTv = (ExpandableTextView) view.findViewById(R.id.expand_text_view);
                mIdView = (TextView) view.findViewById(R.id.id_text);
                mContentView = (TextView) view.findViewById(R.id.expandable_text);
            }
        }
    }


}

class ListContent {

    public final String id;
    public final String title;
    public final String body;

    public ListContent(String id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

}
