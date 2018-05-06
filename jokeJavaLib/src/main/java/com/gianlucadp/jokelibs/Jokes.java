package com.gianlucadp.jokelibs;

import java.util.Random;

public class Jokes {

    private static String[] jokes = {
            "A ham sandwich walks into a bar and orders a beer. Bartender says, 'Sorry we don't serve food here.",
            "Me: 'Dad, make me a sandwich!' \n Dad: 'Poof, You're a sandwich!'",
            "Whenever we drive past a graveyard my dad says, 'Do you know why I can't be buried there?' And we all say, 'Why not?' And he says, 'Because I'm not dead yet!'",
            "Two peanuts were walking down the street. One was a salted",
            "How do you make holy water? You boil the hell out of it.",
            "5/4 of people admit that they're bad with fractions",
            "What's Forrest Gump's password? 1forrest1",
            "I'm reading a book about anti-gravity. It's impossible to put down!",
            "If you see a robbery at an Apple Store does that make you an iWitness?",
            "I bought some shoes from a drug dealer. I don't know what he laced them with, but I was tripping all day!",
            "A termite walks into a bar and asks, 'Is the bar tender here?'",
            "Two peanuts were walking down the street. One was a salted",
            "Why did the invisible man turn down the job offer? He couldn't see himself doing it",
            "When you ask a dad if he's alright: 'No, I'm half left'",
            "MOM: \"How do I look?\" DAD: \"With your eyes.\"",
            "What is Beethoven's favorite fruit? A ba-na-na-na",
            "Don't trust atoms. They make up everything!",
            "How many tickles does it take to make an octopus laugh? Ten-tickles",
            "What's the best part about living in Switzerland? I don't know, but the flag is a big plus",
            " Why couldn't the bike standup by itself? It was two tired",
            "The fattest knight at King Arthur's round table was Sir Cumference. He acquired his size from too much pi",
            "What does a zombie vegetarian eat? GRRRAAAAAIIIINNNNS!"


    };

    public static String getRandomJoke() {
        Random rand = new Random();

        int n = rand.nextInt(jokes.length);
        return jokes[n];
    }

}
