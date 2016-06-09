package com.example;

import java.util.Random;

public class SupplyJokes {

    private static String[]joke_db = {

                "A young man was walking along in the forest, when he heard a muffled voice crying for help from behind a log.  He leaned over to see a frog sitting in the mud.\n" +
                        "\n" +
                        "The frog looked up at him and said, \"I'm actually a beautiful princess, and if you kiss me, I'll transform back into my true self, and be yours for eternity.\"\n" +
                        "\n" +
                        "Silently, the man scooped up the frog and continued on his walk.\n" +
                        "\n" +
                        "A minute or two later, the frog piped up again, \"Hey, buddy, maybe you didn't hear me -- I said, if you kiss me, I'll turn into a princess. What are you waiting for?\"\n" +
                        "\n" +
                        "Annoyed, the man stuffed the frog into his coat pocket.\n" +
                        "\n" +
                        "Shocked, the frog yelled from inside the man's pocket, \"What the hell?  I'm a princess!  All you have to do is kiss me!\"\n" +
                        "\n" +
                        "Opening his pocket and peering in, the man said, \"Listen -- I'm a software engineer.  I don't have time for a girlfriend.  But a talking frog is kind of cool.\""
            ,


                    "Why did the chicken cross the road?\n" +
                            "\n" +
                            "Assembler Chicken: First, it builds the road ......\n" +
                            "\n" +
                            "C Chicken: It crosses the road without looking both ways.\n" +
                            "\n" +
                            "C++ Chicken: The chicken wouldn't have to cross the road, you' d simply refer to him on the other side.\n" +
                            "\n" +
                            "COBOL Chicken: 0001-CHICKEN-CROSSING.\n" +
                            "   IF NO-MORE-VEHICLES\n" +
                            "        THEN PERFORM 0010-CROSS-THE-ROAD\n" +
                            "        VARYING STEPS FROM 1 BY 1 UNTIL\n" +
                            "        ON-THE-OTHER-SIDE\n" +
                            "    ELSE\n" +
                            "    GO TO 0001-CHICKEN-CROSSING\n" +
                            "\n" +
                            "Cray Chicken: Crosses faster than any other chicken, but if you don't dip it in liquid nitrogen first, it arrives on the other side frazzled.\n" +
                            "\n" +
                            "Delphi Chicken: The chicken is dragged across the road and dropped on the other side.\n" +
                            "\n" +
                            "Gopher Chicken: Tried to run but got beaten by the Web chicken.\n" +
                            "\n" +
                            "Intel Pentium Chicken: The chicken crossed 4.9999978 times.\n" +
                            "\n" +
                            "Iomega Chicken: The chicken should have  backed up before crossing.\n" +
                            "\n" +
                            "Java Chicken: If your road needs to be crossed by a chicken, then the server will download one to the other side. (Of course, those are chicklets.)  See also WMI Monitor.\n" +
                            "\n" +
                            "Linux Chicken: Don't you *dare* try to cross the road the same way we do!\n" +
                            "\n" +
                            "Mac Chicken: No reasonable chicken owner would want a chicken to cross the road, so there's no way to tell it how to cross the road.\n" +
                            "\n" +
                            "Newton Chicken: Can't cluck, can't fly, and can't lay eggs, but you can carry it across the road in your pocket.\n" +
                            "\n" +
                            "OOP Chicken: It doesn't need to cross the road, it just sends a message.\n" +
                            "\n" +
                            "OS/2 Chicken: It crossed the road in style years ago, but it was so quiet that nobody noticed.\n" +
                            "\n" +
                            "Microsoft's Chicken: It's already on both sides of the road. What's more its just bought the road.\n" +
                            "\n" +
                            "Windows 95 Chicken: You see different coloured feathers while it crosses, but when you cook it still tastes like........ chicken.\n" +
                            "\n" +
                            "Quantum Logic Chicken: The chicken is distributed probabilistically on all sides of the road until you observe it on the side of your choice.\n" +
                            "\n" +
                            "VB Chicken: USHighways! <TheRoad.cross> (aChicken)\n" +
                            "\n" +
                            "XP Chicken Jumps out onto the road, turns right, and just keeps on running.\n" +
                            "\n" +
                            "The Longhorn Chicken had an identity crisis and is now calling itself Vista.\n" +
                            "\n" +
                            "The Vista Chicken dazzled itself with its own graphics."
            ,


                    "A young programmer and his project manager board a train headed through the mountains on its way to Wichita. " +
                            "They can find no place to sit except for two seats right across the aisle from a young woman and " +
                            "her grandmother. After a while, it is obvious that the young woman and the young programmer are" +
                            " interested in each other, because they are giving each other looks. Soon the train passes into a" +
                            " tunnel and it is pitch black. There is a sound of a kiss followed by the sound of a slap.\n" +
                            "\n" +
                            "When the train emerges from the tunnel, the four sit there without saying a word. " +
                            "The grandmother is thinking to herself, It was very brash for that young man to kiss my granddaughter," +
                            " but I'm glad she slapped him.?\n" +
                            "\n" +
                            "The project manager is sitting there thinking, I didn't know the young tech was brave enough to kiss the" +
                            " girl, but I sure wish she hadn't missed him when she slapped me!\n" +
                            "\n" +
                            "The young woman was sitting and thinking, I'm glad the guy kissed me," +
                            " but I wish my grandmother had not slapped him!\n" +
                            "\n" +
                            "The young programmer sat there with a satisfied smile on his face." +
                            " He thought to himself, Life is good. How often does a guy have the chance " +
                            "to kiss a beautiful girl and slap his project manager all at the same time!"
            ,


                    ">> A physicist, an engineer and a programmer were in a car driving over a steep alpine pass when the brakes" +
                            " failed. The car was getting faster and faster, they were struggling to get round the corners and " +
                            "once or twice only the feeble crash barrier saved them from crashing down the side of the mountain." +
                            " They were sure they were all going to die, when suddenly they spotted an escape lane. " +
                            "They pulled into the escape lane, and came safely to a halt.\n" +
                            "The physicist said - We need to model the friction in the brake pads and the resultant temperature rise," +
                            " see if we can work out why they failed.\n" +
                            "The engineer said -I think I've got a few spanners in the back. I'll take a look and see if I can work out" +
                            " what's wrong?.\n" +
                            "The programmer said -Why don't we get going again and see if it's reproducible??\n" +
                            "\n" +
                            ">>There are two types of people in this world: those who understand recursion and those who don't understand" +
                            " that there are two types of people in this world:\n" +
                            "\n" +
                            ">>There are 10 types of people in this world: those who understand binary and those who don't.\n" +
                            "\n" +
                            ">>Q: how many programmers does it take to change a light bulb?\n" +
                            "A: none, that?s a hardware problem\n" +
                            "\n" +
                            ">>Two bytes meet. The first byte asks, Are you ill??\n" +
                            "The second byte replies, No, just feeling a bit off.?\u009D\n" +
                            "\n" +
                            ">>Q: Why do programmers always mix up Halloween and Christmas?\n" +
                            "A: Because Oct 31 == Dec 25!\n" +
                            "\n" +
                            ">>A SQL query goes into a bar, walks up to two tables and asks, Can I join you??.\n" +
                            "\n" +
                            ">>Q: Whats the object-oriented way to become wealthy??\n" +
                            "A: Inheritance"
            ,

                    "What did the suicidal function say? \"GOODBYE WORLD\"\n" +
                            "\n" +
                            "How do functions break up? \"They stop calling each other!\"\n" +
                            "\n" +
                            "When is a function a bad investment? \"When there's no return\"\n" +
                            "\n" +
                            "What happened to the function that ran away? \"It never returned\"\n" +
                            "\n" +
                            "When do two functions fight? \"When they have arguments\"\n" +
                            "\n" +
                            "In what unit do you measure a function's length? \"In Para meters...\"\n" +
                            "\n" +
                            "What did the flirtatious function say? \"Call me ;)\"\n" +
                            "\n" +
                            "What happened to all the illegal exceptions? \"They were all caught!\"\n" +
                            "\n" +
                            "What do threads do after they make love? \"They go to sleep\"\n" +
                            "\n" +
                            "Why do we rarely see a program with crooked teeth? \"Because most of them have braces\""
            ,

                    "Ten computer scientists and ten engineers are on line to buy train tickets to travel to the tech conference in the " +
                            "nearby city.\n" +
                            "\n" +
                            "Each of the computer scientists walk up to the window to purchase their train ticket," +
                            " and watch as the engineers combine their money to purchase only one ticket.\n" +
                            "\n" +
                            "\"Stupid engineers,\" they say amongst themselves, boarding the train.\n" +
                            "\n" +
                            "Soon after departing, the ticket taker enters the train car. All ten of the engineers pile " +
                            "into the restroom with their single ticket.\n" +
                            "\n" +
                            "The ticket taker collects each of the computer scientists' tickets " +
                            "and proceeds to the rest room. Seeing that it's occupied, " +
                            "the ticket taker knocks on the door and asks for the occupant's ticket. " +
                            "The engineers slip their ticket from under the door and the ticket taker moves on.\n" +
                            "\n" +
                            "The computer scientists look at each other in astonishment that the engineers' plan actually worked.\n" +
                            "\n" +
                            "\n" +
                            "After the conference, the ten computer scientists and ten engineers line up again " +
                            "to buy their return tickets.\n" +
                            "\n" +
                            "Again, the engineers only buy one ticket, but this time they watch on as the " +
                            "computer scientists buy zero tickets.\n" +
                            "\n" +
                            "\"Stupid computer scientists,\" they say amongst themselves, boarding the train.\n" +
                            "\n" +
                            "And again, the ticket taker enters the train car and all " +
                            "ten engineers pile into the restroom with their single ticket.\n" +
                            "\n" +
                            "\"Ticket please\", a computer scientist says, knocking on the restroom door. " +
                            "Sure enough, the engineers slide their ticket from under the door as the " +
                            "computer scientists pile into the adjacent restroom..."
            ,

                    "A man flying in a hot air balloon suddenly realizes he's lost." +
                            " He reduces height and spots a man down below." +
                            " He lowers the balloon further and shouts to get directions," +
                            " \"Excuse me, can you tell me where I am?\"\n" +
                            "\n" +
                            "The man below says: \"Yes, you're in a hot air balloon, hovering 30 feet above this field.\"\n" +
                            "\n" +
                            "\"You must work in Information Technology,\" says the balloonist.\n" +
                            "\n" +
                            "\"I do\" replies the man. \"How did you know?\"\n" +
                            "\n" +
                            "\"Well,\" says the balloonist, \"everything you have told me is technically correct, but it's of no use to anyone.\"\n" +
                            "\n" +
                            "The man below replies, \"You must work in management.\"\n" +
                            "\n" +
                            "\"I do\" replies the balloonist, \"But how'd you know?\"\n" +
                            "\n" +
                            "\"Well\", says the man, \"you don't know where you are, " +
                            "or where you're going, you expect me to be able to help." +
                            " You're in the same position you were before we met, but now it's my fault.\""
            ,

                    "A Geologist and an engineer are sitting next to each other on a long flight from LA to NY. The Geologist leans over to the Engineer and asks if he would like to play a fun game. The Engineer just wants to take a nap, so he politely declines and rolls over to the window to catch a few winks. The Geologist persists and explains that the game is real easy and a lotta fun. He explains, \"I ask you a question, and if you don't know the answer, you pay me $5. Then you ask me a question, and if I don't know the answer, I'll pay you $5.\" Again, the Engineer politely declines and tries to get to sleep. The Geologist now somewhat agitated, says, \"OK, if you don't know the answer you pay me $5, and if I don't know the answer, I'll pay you $50!\"\n" +
                            "\n" +
                            "This catches the Engineer's attention, and he sees no end to this torment unless he plays, so he agrees to the game. The Geologist asks the first question. \"What's the distance from the Earth to the moon?\"\n" +
                            "The Engineer doesn't say a word, but reaches into his wallet, pulls out a five dollar bill and hands it to the Geologist.\n" +
                            "\n" +
                            "Now, it's the Engineer's turn. He asks the Geologist, \"What goes up a hill with three legs, and comes down on four?\" The Geologist looks up at him with a puzzled look. He takes out his laptop computer and searches all of his references. He taps into the Airphone with his modem and searches the net and the Library of Congress. Frustrated, he sends e-mail to his co-workers -- all to no avail.\n" +
                            "\n" +
                            "After about an hour, he wakes the Engineer and hands him $50. The Engineer politely takes the $50 and turns away to try to get back to sleep.\n" +
                            "The Geologist is more than a little miffed, shakes the Engineer and asks, \"Well, so what's the answer?\"\n" +
                            "\n" +
                            "Without a word, the Engineer reaches into his wallet, hands the Geologist $5, and turns away to get back to sleep."
            ,

                    "Programming is like sex:\n" +
                            "\n" +
                            "One mistake and you have to support it for the rest of your life. "
            ,

                    "Java programming is like teenage sex ....  \n" +
                            "\n" +
                            "Everyone talks about it all of the time (but they don't really know what they're talking about);\n" +
                            "Everyone claims to be doing it;\n" +
                            "Everyone thinks everyone else is doing it;\n" +
                            "Those few who are actually doing it:\n" +
                            "Are not practicing it safely;\n" +
                            "Are doing it poorly, and\n" +
                            "Are sure it will be better next time.\n"


    };

    public static String getJoke(){
/*
        return "Q: How do you tell an introverted computer scientist from an extroverted computer scientist?\n\n"+
                "A: An extroverted computer scientist looks at your shoes when he talks to you.";*/
        //return joke_db[0];
        int index = getRnd(0,joke_db.length-1);
        try {
            return joke_db[index];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("INDEXXXXX: "+index+" Total Size: "+ (joke_db.length-1));
            e.printStackTrace();
            return joke_db[0];
        }
    }

    private static int getRnd(int min, int max){
        Random rnd = new Random();
        return rnd.nextInt(max - min)+min;
    }
}
