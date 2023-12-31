package com.patriciafiona.marioworld

import com.patriciafiona.mario_world.core.domain.model.Character

object DummyCharactersTestData {
    fun generateDummyCharacter(): ArrayList<Character> = arrayListOf(
        Character(
            name = "Mario",
            description = "The main hero of the Mushroom Kingdom. Mario is always bright and cheerful and instantly recognizable with his blue overalls, red cap, and trademark moustache.\n" +
                    "\n" +
                    "He's a trusted friend of Princess Peach, and he and his brother Luigi are known across the land for their acts of bravery.\n" +
                    "\n" +
                    "Mario excels at sports including tennis, golf, baseball, soccer, and even kart racing. He's good at all of them! He's a plumber by profession but is really a jack of all trades.\n" +
                    "\n" +
                    "He uses his masterful jumping ability and a variety of power-ups to take on his archrival, Bowser.",
            imageOpen = "mario_open",
            imageClose = "mario_closed",
            imageFull = "mario_open_2",
            backgroundColor = "224,18,15",
            characterSound = "sound_mario_0,sound_mario_1,sound_mario_2",
            fullName = "Mario Mario",
            species = "Human",
            dialog = "It's-a me, Mario!",
            ability = "8.0,8.0,8.0,8.0,8.0",
            isFavorite = false
        ),
        Character(
            name = "Luigi",
            description = "Mario's brother and fellow hero of the Mushroom Kingdom. Luigi is instantly recognizable in his trademark green hat and green shirt.\n" +
                    "\n" +
                    "Luigi is kind but can be a bit nervous, especially around ghosts. However, his abilities are on par with Mario's, so when these brothers team up, there's nothing they can't achieve.\n" +
                    "\n" +
                    "Luigi is taller and can jump higher than Mario. If you look closely, you may also notice that the shape of his moustache is a bit different as well.",
            imageOpen = "luigi_open",
            imageClose = "luigi_closed",
            imageFull = "luigi_open_02",
            backgroundColor = "8,169,54",
            ability = "6.0,7.0,6.0,7.0,7.0",
            characterSound = "sound_luigi_0,sound_luigi_1,sound_luigi_2",
            fullName = "Luigi Mario",
            species = "Human",
            dialog = "Eek! No one told me there would be gh-gh-ghosts here! I wish I'd brought my Poltergust 3000 with me.",
            isFavorite = false
        ),
        Character(
            name = "Princess Peach",
            description = "The beloved princess of the Mushroom Kingdom. She's extremely kind and is always working to create a world where everyone can live together happily. Her signature pink dress is quite lovely.\n" +
                    "\n" +
                    "Princess Peach is always game for a variety of sports, and also enjoys baking and cooking.\n" +
                    "\n" +
                    "Princess Peach and Mario are good friends and help each other out whenever they can.",
            imageOpen = "peach_open",
            imageClose = "peach_closed",
            imageFull = "peach_open_02",
            backgroundColor = "240,150,190",
            ability = "6.0,7.5,8.0,6.0,6.0",
            characterSound = "sound_peach_0,sound_peach_1,sound_peach_2",
            fullName = "Princess Peach Toadstool",
            species = "Human",
            dialog = "I can't believe I'm kidnapped... again.",
            isFavorite = false
        ),
        Character(
            name = "Toad",
            description = "A resident of the Mushroom Kingdom who works in service of Princess Peach. Toad has red spots on his head, though others of his kind come in a variety of colors.\n" +
                    "\n" +
                    "Toad is very cheerful and loyal. He does his best to help Mario and Luigi in their efforts to protect the Mushroom Kingdom from Bowser, even if he ends endangering himself in the process.",
            imageOpen = "toad_open",
            imageClose = "toad_closed",
            backgroundColor = "23, 65, 154",
            ability = "7.0,9.0,6.0,8.0,7.0",
            characterSound = "sound_toad_0,sound_toad_1,sound_toad_2",
            fullName = "Toad",
            species = "Mushroom",
            dialog = "M-M-M-M-M-M-M-Mario! Help! It's Sh-sh-sh-sh-sh-sh-sh-shocking... Mushroom Castle... RIDED! Prince Peach... STOLEN!",
            isFavorite = false
        ),
        Character(
            name = "Bowser",
            description = "The King of the Koopas. Bowser is Mario's archrival and is always causing trouble in the Mushroom Kingdom.\n" +
                    "\n" +
                    "Bowser commands many underlings, including Koopas, Goombas, Bullet Bills, and Shy Guys. Whenever he sets his sights on the Mushroom Kingdom, his plans are often foiled by Mario and friends.\n" +
                    "\n" +
                    "Bowser is a mighty foe who possesses incredible strength and can even breathe fire.",
            imageOpen = "bowser_open",
            imageClose = "bowser_closed",
            backgroundColor = "248,190,16",
            ability = "6.0,8.0,7.0,9.0,8.0",
            characterSound = "sound_bowser_0,sound_bowser_1,sound_bowser_2",
            fullName = "King Bowser Koopa",
            species = "Koopa",
            dialog = "Hear this! I will kidnap PeachOVER and OVER until I pull it off! And no one can stop me! Losing is not an option! And neither is giving up!",
            isFavorite = false
        ),
        Character(
            name = "Yoshi",
            description = "Mario's dependable companion who hails from Yoshi's Island. He is green, but others of his kind may be other colors such as red, blue, pink, and yellow.\n" +
                    "\n" +
                    "Yoshi is kind and carefree. He uses his long tongue to gobble up fruit and enemies, which he can turn into eggs for throwing.",
            imageOpen = "yoshi_open",
            imageClose = "yoshi_closed",
            imageFull = "yoshi_open_02",
            backgroundColor = "112,185,33",
            ability = "6.0,5.0,8.0,7.0,6.0",
            characterSound = "sound_yoshi_0,sound_yoshi_1,sound_yoshi_2",
            fullName = "Yoshi",
            species = "Yoshi",
            dialog = "I know! We should team up! Come on! Hop on my back!",
            isFavorite = false
        ),
        Character(
            name = "Daisy",
            description = "The princess of Sarasaland. Her trademark style includes her yellow dress and flowery accessories.\n" +
                    "\n" +
                    "Daisy is cheerful, energetic, and a bit of a tomboy. She enjoys playing a variety of sports with Mario and friends.",
            imageOpen = "daisy_open",
            imageClose = "daisy_closed",
            imageFull = "daisy_open_02",
            backgroundColor = "238,131,10",
            ability = "8.0,8.0,7.0,9.0,6.0",
            characterSound = "sound_daisy_0,sound_daisy_1,sound_daisy_2",
            fullName = "Princess Daisy",
            species = "Human",
            dialog = "Don't underestimate me, people! Just because I'm a princess doesn't mean I won't fight dirty!",
            isFavorite = false
        ),
        Character(
            name = "Wario",
            description = "The self-professed archrival of Mario. Wario wears purple overalls, a yellow hat, and has an instantly recognizable zigzag moustache.\n" +
                    "\n" +
                    "Wario and Mario have known each other since they were babies. He's got a boisterous personality and doesn't sweat the small things. He loves garlic and making money.",
            imageOpen = "wario_open",
            imageClose = "wario_closed",
            backgroundColor = "232,205,14",
            ability = "6.0,5.0,8.0,7.0,9.0",
            characterSound = "sound_wario_0,sound_wario_1,sound_wario_2",
            fullName = "Wario",
            species = "Human",
            dialog = "So admit it... Don't I look cool in the game screens? Those long, muscular legs on my sturdy, toned fame... " +
                    "I'm the perfect speciment of a man! ...What!?!? You say I look fat and my quadruple chin looks like a waterfall of flab? " +
                    "Shut up! Taht's just because you have your television set up for widescreen display!",
            isFavorite = false
        ),
        Character(
            name = "Waluigi",
            description = "Wario's pal and accomplice. Waluigi is the self-proclaimed rival of Luigi.\n" +
                    "\n" +
                    "Waluigi is willing to put in a lot of effort to best Mario and Luigi, if only to annoy them. His long arms and long legs help keep him competitive at sports.",
            imageOpen = "waluigi_open",
            imageClose = "waluigi_closed",
            backgroundColor = "93,46,142",
            ability = "4.0,6.0,6.5,7.0,6.0",
            characterSound = "sound_waluigi_0,sound_waluigi_1,sound_waluigi_2",
            fullName = "Waluigi",
            species = "Human",
            dialog = "Hey! You might be getting better, but nobody cheats better than Waluigi! You got that?!",
            isFavorite = false
        ),
        Character(
            name = "Rosalina",
            description = "A mysterious lady who travels the galaxy accompanied by her family of star-like creatures called Lumas.\n" +
                    "\n" +
                    "Rosalina may seem a bit distant, but she is actually quite kind-hearted. She is the adoptive mother of the Lumas. Though her home is among the stars, she'll sometimes joins Mario and friends on their adventures.",
            imageOpen = "rosalina_open",
            imageClose = "rosalina_closed",
            imageFull = "rosalina_open_02",
            backgroundColor = "29,213,183",
            ability = "7.0,6.0,8.0,7.0,6.0",
            characterSound = "sound_rosalina_0,sound_rosalina_1,sound_rosalina_2",
            fullName = "Princess Rosalina",
            species = "Human",
            dialog = "May the starts shine down on you.",
            isFavorite = false
        ),
        Character(
            name = "Bowser Jr.",
            description = "The only son of Bowser, the King of the Koopas. He's often seen wearing a mask with an intimidating mouth drawn on it.\n" +
                    "\n" +
                    "Bowser Jr. is small but has inherited great strength from his father.\n" +
                    "\n" +
                    "He may throw a tantrum if things don't go his way. He's know to cause plenty of trouble and can be a bit selfish.",
            imageOpen = "bowser_jr_open",
            imageClose = "bowser_jr_closed",
            backgroundColor = "246,206,9",
            ability = "8.0,7.0,8.0,6.5,5.0",
            characterSound = "sound_bowser_jr_0,sound_bowser_jr_1,sound_bowser_jr_2",
            fullName = "Bowser Junior",
            species = "Koopa",
            dialog = "Someday... when I'm bigger... I wanna fight that Mario again!",
            isFavorite = false
        ),
        Character(
            name = "Boo",
            description = "Mischievous ghosts who often appear in dark, abandoned places.\n" +
                    "\n" +
                    "They may be spooky ghosts, but they're also incredibly shy. They will freeze in place and cover their eyes if someone looks right at them.",
            imageOpen = "boo_open",
            imageClose = "boo_closed",
            backgroundColor = "149,164,174",
            ability = "8.0,8.0,5.0,6.0,5.0",
            characterSound = "sound_boo_0,sound_boo_1,sound_boo_2",
            fullName = "Boo",
            species = "Boo",
            dialog = "This board is a scary little spook house that I cooked up a while back.",
            isFavorite = false
        ),
        Character(
            name = "Donkey Kong",
            description = "The king of the jungle whose trademark is his red necktie, which bears his initials.\n" +
                    "\n" +
                    "Donkey Kong can hurl giant barrels with the greatest of ease, and is so powerful the ground shakes when he pounds on the ground.\n" +
                    "\n" +
                    "He loves bananas and always keeps a large stash of them in his treehouse.",
            imageOpen = "donkey_kong_open",
            imageClose = "donkey_kong_closed",
            imageFull = "donkey_kong_open_02",
            backgroundColor = "116,38,7",
            ability = "6.0,8.0,7.0,6.0,6.5",
            characterSound = "sound_donkey_kong_0,sound_donkey_kong_1,sound_donkey_kong_2",
            fullName = "Donkey Kong",
            species = "Kong",
            dialog = "My bananas and my buddy, Diddy Kong, they are gone! The Kremlings will pay! " +
                    "I'll hunt them down through every corner of my island, until I have every last banana from my hoard back!",
            isFavorite = false
        ),
        Character(
            name = "Diddy Kong",
            description = "Donkey Kong's trusted friend and partner. His trademarks are his red shirt with yellow stars and red cap.\n" +
                    "\n" +
                    "Though not as strong as DK, Diddy Kong is agile and a great jumper. He's fast as well, and a great ally for " +
                    "helping DK protect his banana stash.",
            imageOpen = "diddy_kong_open",
            imageClose = "diddy_kong_closed",
            backgroundColor = "152,49,6",
            ability = "6.0,8.0,5.5,8.0,7.0",
            characterSound = "sound_diddy_kong_0,sound_diddy_kong_1,sound_diddy_kong_2",
            fullName = "Diddy Kong",
            species = "Kong",
            dialog = "I am the brave Diddy Kong. Show yourself, if you are friently. If not, " +
                    "then get ready for the fight of your life!",
            isFavorite = false
        )
    )
}