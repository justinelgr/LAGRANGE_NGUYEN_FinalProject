package fr.esilv.lagrange_nguyen_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FullImageActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        WhichCharacter_Adapter imageAdapter = new WhichCharacter_Adapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.icons[position]);

        TextView character_name = (TextView)findViewById(R.id.character_name);
        TextView description = (TextView)findViewById(R.id.character_description);

        // If the Serena icon is clicked on
        if(position==0){
            character_name.setText("Serena VAN DER WOODSEN");
            description.setText("Serena van der Woodsen is the daughter of William and Lily van der Woodsen. The story begins with her return to New York from boarding school. Shortly after her return, she realizes a lot has changed since she left. Her friends are not too happy about her return, including her best friend Blair Waldorf.\n" +
                    "\n" +
                    "She then meets Dan Humphrey and the two begin a romantic relationship and soon fall in love. Serena's storylines often surround her disastrous relationship choices and her struggle to find where she fits in the world outside the Upper East Side. In the finale, Dan and Serena get married, surrounded by friends and family.\n" +
                    "\n" +
                    "She appears to be 16 through 21 years old in the series.");
        }

        // If the Blair icon is clicked on
        if(position==1){
            character_name.setText("Blair WALDORF");
            description.setText("Blair is the daughter of Harold and Eleanor Waldorf, respectively a successful lawyer and fashion designer. Her parents divorce, and her stepfathers include Roman Garrel and Cyrus Rose. After failing to build a future with Nate Archibald, Blair begins a relationship with Chuck Bass but later embarks in a failed marriage to Prince Louis Grimaldi Throughout the duration of the series, Blair is aged 16 to 21-22\n" +
                    "\n" +
                    "Blair's storylines often surround her struggle with constantly feeling as if she is in Serena's shadow and finding how she can shine in her own light. They also surround her romantic relationships, namely with Chuck and Louis.");
        }

        // If the Dan icon is clicked on
        if(position==2){
            character_name.setText("Daniel 'Dan' HUMPHREY");
            description.setText("Dan Humphrey is the son of rock musician Rufus Humphrey and artist Alison Humphrey, and is the older brother of Jenny Humphrey. Dan is a writer/poet and used to attend the St. Jude’s School for Boys with eventual friends Chuck Bass and Nate Archibald. Although accepted to Yale, he ends up attending NYU. He had a crush on Serena van der Woodsen that eventually evolved into a relationship that became the longest on the show. He used to despise Serena’s best friend, Blair Waldorf; but became friends with her and has since dated.\n" +
                    "\n" +
                    "Dan is clever, as he was basically the smartest in his class, and also witty and patient; he works hard for what he wants and normally achieves his goals. Although inexperienced with plotting and manipulation, he demonstrates promise when scheming with Blair. Dan reveals at the end of the series that he was Gossip Girl from the beginning for a way for him to win Serena by writing himself into the Upper East Side, a task he succeeded in by the end of the series. In the finale, Dan and Serena get married, surrounded by friends and family.");
        }

        // If the Nate icon is clicked on
        if(position==3){
            character_name.setText("Nathaniel 'Nate' ARCHIBALD");
            description.setText("Nathaniel \"Nate\" Archibald was born to Howard \"The Captain\" Archibald, a successful business magnate and former Navy captain, and Anne Archibald, a member of the Vanderbilt family, on April 5th, 1991. Nate is considered to be the \"golden boy of the Upper East Side.\" Nate is best friends with Chuck Bass, with whom he attends the elite St. Jude's School for Boys and shares a deep friendship with.\n" +
                    "\n" +
                    "Throughout the show, Nate has been involved in numerous romantic relationships, none of which turned out successful. He once said to Dan; that all his life he has chased after girls that have been wrong for him. In the finale he is the only main character who is still single.\n" +
                    "\n" +
                    "Nate has aspirations for a future in politics, it was for this reason he took an interest in running The Spectator. In the finale, Nate on his way to Dan and Serena's wedding, tells a reporter his intentions of running for mayor of New York; to which he would be the youngest mayor in the city's history.");
        }

        // If the Chuck icon is clicked on
        if(position==4){
            character_name.setText("Charles 'Chuck' BASS");
            description.setText("Chuck Bass was born on January 19, 1991 and grew up as the only child of Bartholomew \"Bart\" Bass, a self-made billionaire who owns the New York Palace Hotel. Chuck is generally shown throughout the first two seasons as the group's bad boy, and is frequently manipulative. However, a softer side to his personality is formed more for people cares about as the series progresses, most notably Nate and Blair. He often blames himself for his mother's death even though it isn't his fault, and he has a tendency to not completely trust people and is always in search of ways to succeed.\n" +
                    "\n" +
                    "Chuck is orphaned in his senior year at high school due to the death of his father in a car accident, before being adopted by Lily van der Woodsen, his stepmother, and the only parent who Chuck really connected to and loved unconditionally.");
        }

        // If the Jenny icon is clicked on
        if(position==5){
            character_name.setText("Jennifer 'Jenny' HUMPHREY");
            description.setText("Jenny is the daughter of Rufus and Alison Humphrey and the sister of Dan. When the story begins, Jenny is a freshman at Constance Billard and consistently vying for Blair's attention and approval. However, as the show progresses, Jenny steps away from seeking approval and works to be a force in her own right. At the end of the third season Jenny moves to Hudson, New York to live with Alison.\n" +
                    "\n" +
                    "In New York, I Love You XOXO it's shown that Jenny and Blair fixed their problems with one another and Jenny created a line for Waldorf Designs titled J for Waldorf. Throughout the series Jenny is aged 14 to 17.");
        }

        // If the Eric icon is clicked on
        if(position==6){
            character_name.setText("Eric VAND DER WOODSEN");
            description.setText("Eric is the son of Lily and William van der Woodsen and the younger brother of Serena van der Woodsen. He grew up on the Upper East Side and attended St. Jude's School for Boys before moving to attend Sarah Lawrence College. He is gay.\n" +
                    "\n" +
                    "Many of Eric's storylines surround his relationship with his family, namely Serena and Lily, and his friendship with Jenny Humphrey. Unlike many of the other characters on the show, Eric tries to stay out of the drama; except for a few notable instances.");
        }

        // If the Vanessa icon is clicked on
        if(position==7){
            character_name.setText("Vanessa ABRAMS");
            description.setText("Vanessa is the daughter of Arlo and Gabriela Abrams. She grew up on a commune in Vermont before moving to Brooklyn to live with her sister, Ruby. She was homeschooled her entire life until she began attending NYU.\n" +
                    "\n" +
                    "Vanessa's storylines often surround her friendship and eventual romantic relationship with Dan Humphrey; as well as her struggle to fit in with his Upper East Side friends.");
        }

        // If the Georgina icon is clicked on
        if(position==8){
            character_name.setText("Georgina SPARKS");
            description.setText("Georgina is an old frenemy of Serena van der Woodsen's. Also a member of Upper East Side society, Georgina is known for being even more rebellious than Serena and often involves herself in dangerous and crazy situations. During the first and second seasons, Georgina played a minor role but she returned for longer periods for seasons three through six.\n" +
                    "\n" +
                    "During season four she gives birth to her son, Milo Humphrey, and marries Philip Becker. In the series finale, New York, I Love You XOXO, it's revealed she has begun dating Jack Bass.");
        }

        // If the Carter icon is clicked on
        if(position==9){
            character_name.setText("Carter BAIZEN");
            description.setText("Carter Baizen is a St. Jude's graduate and rival of Nate and Chuck. It is mentioned that he turned his back on his parents and so was left without a trust fund and was forced to take matters into his own hands by shaping his own future, something that Carter reveals to Serena a week before the cotillion." +
                    "\n" +
                    "In the second season, Carter resurfaces in New York with the mysterious Elle but ends up being involved with Blair and sleeps with her, contributing to her downward spiral. He soon leaves New York as Serena and Chuck intervene.");
        }

        // If the Lily icon is clicked on
        if(position==10){
            character_name.setText("Lily VAN DER WOODSEN");
            description.setText("Lily is the daughter of music executive producer Rick Rhodes and Celia Rhodes and the younger sister of Carol Rhodes. She grew up in Montecito, California and lived on a ranch there before beginning The Thacher School in Santa Barbara as a teenager. She also lived in Manhattan as a child, briefly. After being expelled from school, she moved to Los Angeles to live with Carol.\n" +
                    "\n" +
                    "She later attended Brown University before marrying William van der Woodsen and moving into a penthouse on the Upper East Side. Before her marriage, she dated Rufus Humphrey and gave birth to their love child, whom she gave up for adoption. The majority of Lily's storylines on the show surround her relationship with her children and her husbands, namely Rufus, Bart, and William, as well as her mother and sister.");
        }

        // If the Rufus icon is clicked on
        if(position==11){
            character_name.setText("Rufus HUMPHREY");
            description.setText("Not much is known about Rufus' background or his upbringing. After graduating high school, he declined his offer to go to college in favor of pursuing music.\n" +
                    "\n" +
                    "The majority of Rufus' storylines involve him trying to parent his children, or trying to pursue a relationship with Lily van der Woodsen.");
        }

        // If the Bart icon is clicked on
        if(position==12){
            character_name.setText("Bartholomew 'Bart' BASS");
            description.setText("Bartholomew \"Bart\" Bass, is Chuck's billionaire father, founder of Bass Industries and was married to Lily van der Woodsen. His family lived at the New York Palace Hotel, which he owned. His money was self-made, as opposed to inherited like most Upper East Side families." +
                    "\n" +
                    "He was controlling with his family, ruthless in business and demonstrated little affection for Chuck, and it's revealed that this is because he holds his son responsible for his late wife's death (Chuck's mother died while giving birth to him.) At times Bart appears to care about his son, and asked him to be his best man at the wedding.");
        }

        // If the Eleanor icon is clicked on
        if(position==13){
            character_name.setText("Eleanor WALDORF");
            description.setText("Eleanor Waldorf is the fashion designer mother of Blair Waldorf. Her decades-long marriage to Blair's father, Harold Waldorf, ended when Harold left her to pursue a relationship with a French male model, Roman. It is implied through flashbacks that Eleanor knew about Harold's sexuality." +
                    "\n" +
                    "Her clothing line 'Eleanor Waldorf Designs' is being distributed by Barney's and Bendel's. She once employed Jenny as an overworked intern. She later marries her divorce attorney, Cyrus Rose.");
        }

        // If the Dorota icon is clicked on
        if(position==14){
            character_name.setText("Dorota KISHLOVSKY");
            description.setText("Born and raised in Poland as a countess, Dorota's parents forced her into an arranged marriage. She was then married at a city hall and believes the non-traditional wedding caused the marriage to end." +
                    "\n" +
                    "Her dream was to come to London but her husband wanted to stay in their homeland; so while he was at a football game she left him for America and got a job as a housemaid at the Waldorf's. She also is a big fan of Cyndi Lauper.");
        }
    }
}
