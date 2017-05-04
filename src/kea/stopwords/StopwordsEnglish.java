package kea.stopwords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


/**
 * Class that can test whether a given string is a stop word.
 * Lowercases all words before the test.
 *
 * @version 1.0
 */
public class StopwordsEnglish extends Stopwords {

	public StopwordsEnglish() throws FileNotFoundException{
            
            InputStream is = new FileInputStream("/Users/Computer/Projects/KEA/data/stopwords/stopwords_en.txt");
            loadStopwords(is);
                        
	}
}


