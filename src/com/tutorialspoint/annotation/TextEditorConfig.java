package com.tutorialspoint.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tutorialspoint.SpellChecker;
import com.tutorialspoint.TextEditor;

@Configuration
public class TextEditorConfig {
@Bean
public TextEditor textEditor(){
	return new TextEditor(spellChecker());
}
@Bean
public SpellChecker spellChecker(){
    return new SpellChecker( );
 } 
}
