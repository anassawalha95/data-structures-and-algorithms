package RepeatedWord;

import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

public
class AppTest {




    @Test public void repeatedWordsTest() {

        String text1="";
        String text2=" ";
        String text3="hello";
        String text4=" it it is is";
        String text5="Once upon a time, there was a brave princess who...";
        String text6="It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        String text7="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        assertEquals("",RepeatedWord.repeatedWord(text1));
        assertEquals("",RepeatedWord.repeatedWord(text2));
        assertEquals("",RepeatedWord.repeatedWord(text3));
        assertEquals("it",RepeatedWord.repeatedWord(text4));
        assertEquals("a",RepeatedWord.repeatedWord(text5));
        assertEquals("it",RepeatedWord.repeatedWord(text6));
        assertEquals("summer",RepeatedWord.repeatedWord(text7));

    }


}
