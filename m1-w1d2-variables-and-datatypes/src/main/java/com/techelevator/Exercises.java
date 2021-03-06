package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		int birdsOnBranch = 4; 
		int birdsFlewAway = 1;
		int birdsLeft = birdsOnBranch - birdsFlewAway;
		System.out.println("1. Number of birds left: " + birdsLeft);
        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		int birds = 6;
		int nests = 3;
		int birdsMoreThanNests = birds - nests;
		System.out.println("2. Number of birds more than nests: " + birdsMoreThanNests);
        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int raccoonsInWoods = 3;
		int raccoonsGoneHome = 2;
		int raccoonsLeft = raccoonsInWoods - raccoonsGoneHome;
		System.out.println("3. Number of raccoons left: " + raccoonsLeft);
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int flowers = 5;
		int bees = 3;
		int lessBees = flowers - bees;
		System.out.println("4. Number of bees less than flowers: " + lessBees);
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int totalPigeons = lonelyPigeon + anotherPigeon;
		System.out.println("5. Number of pigeons eating breadcrumbs: " + totalPigeons);
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int owlsOnFence = 3;
		int owlsJoined = 2;
		int owlsTotal = owlsOnFence + owlsJoined;
		System.out.println("6. Number of owls on fence: " + owlsTotal);
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int beaversStillWorking = beaversWorking - beaversSwimming;
		System.out.println("7. Number of beavers still working: " + beaversStillWorking);
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int toucansSitting = 2;
		int toucansJoined = 1;
		int totalToucans = toucansSitting + toucansJoined;
		System.out.println("8. Number of toucans sitting: " + totalToucans);
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int squirrels = 4;
		int nuts = 2;
		int moreSquirrels = squirrels - nuts;
		System.out.println("9. Number of more squirrels than nuts: " + moreSquirrels);
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int totalMoney = quarter + dime + nickel + nickel;
		System.out.println("10. Total money: " + totalMoney + " cents");
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int muffinsBrier = 18;
		int muffinsMacAdams = 20;
		int muffinsFlannery = 17;
		int muffinsTotal = muffinsBrier + muffinsMacAdams + muffinsFlannery;
		System.out.println("11. Number of total muffins: " + muffinsTotal);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int yoyo = 24;
        int whistle = 14;
        int totalSpent = yoyo + whistle;
        System.out.println("12. Total amount spent: " + totalSpent);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int largeMarsh = 8;
        int miniMarsh = 10;
        int totalMarch = largeMarsh + miniMarsh;
        System.out.println("13. Total number of marshmallows: " + totalMarch);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int snowHilt = 29;
        int snowSchool = 17;
        int snowMore = snowHilt - snowSchool;
        System.out.println("14. Mrs. Hilt's house has " + snowMore + " inches");
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int moneyHilt = 10;
        int moneyTruck = 3;
        int moneyPencil = 2;
        int moneyLeft = moneyHilt - moneyTruck - moneyPencil; 
        System.out.println("15. Mrs. Hilt has " + moneyLeft + " dollars left.");
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int totalMarbles = 16;
        int lostMarbles = 7;
        int currentMarbles = totalMarbles - lostMarbles;
        System.out.println("16. Josh has " + currentMarbles + " marbles left.");
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int seashells = 19;
        int totalSeashells = 25;
        int moreSeashells = totalSeashells - seashells;
        System.out.println("17. Megan needs to find " + moreSeashells + " more seashells.");
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int balloons = 17;
        int redBalloons = 8;
        int greenBalloons = balloons - redBalloons;
        System.out.println("18. There are " + greenBalloons + " green balloons.");
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int books = 38;
        int moreBooks = 10;
        int totalBooks = books + moreBooks;
        System.out.println("19. There are " + totalBooks + " on the shelf.");
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int legs = 6;
        int bee = 8;
        int totalLegs = legs * bee;
        System.out.println("20. 8 bees have " + totalLegs + " legs.");
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        int iceCream = 99;
        int cones = 2;
        int total = iceCream * cones;
        System.out.println("21. Total cost: " + total + " cents.");
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocks = 64;
        int rocksNeed = 125;
        int rocksMore = rocksNeed - rocks;
        System.out.println("22. Mrs. Hilt needs " + rocksMore + " rocks.");
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int marbles = 38;
        int marblesLost = 15;
        int marblesLeft = marbles - marblesLost;
        System.out.println("23. Mrs. Hilt has " + marblesLeft + " marbles left.");
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int milesTotal = 78;
        int milesDriven = 32;
        int milesLeft = milesTotal - milesDriven;
        System.out.println("24. They have " + milesLeft + " miles left.");
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int snowMorning = 90;
        int snowAfternoon = 45;
        int snowTotal = snowMorning + snowAfternoon;
        System.out.println("25. She spent " + snowTotal + " minutes shoveling snow.");
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        int hotDogs = 6;
        int priceHotDogs = 50;
        int allHotDogs = hotDogs * priceHotDogs;
        System.out.println("26. All the hot dogs cost " + allHotDogs + " cents.");
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int moneyTotal = 50;
        int costPencil = 7; 
        int totalPencils = moneyTotal / costPencil;
        System.out.println("27. She can buy " + totalPencils + " pencils.");
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int butterfliesTotal = 33;
        int butterfliesOrange = 20;
        int butterfliesRed = butterfliesTotal - butterfliesOrange;
        System.out.println("28. There are " + butterfliesRed + " red butterflies.");
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        int Kate = 100;
        int candy = 54;
        int change = Kate - candy;
        System.out.println("29. She should get " + change + " cents back.");
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int Trees = 13;
        int moreTrees = 12;
        int totalTrees = Trees + moreTrees;
        System.out.println("30. He will have " + totalTrees + " trees.");
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int daysUntilGrandma = 2;
        int hoursInDay = 24;
        int hoursUntilGrandma = daysUntilGrandma * hoursInDay;
        System.out.println("31. She will see grandma in " + hoursUntilGrandma + " hours.");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int cousins = 4;
        int piecesOfGum = 5;
        int totalGum = cousins * piecesOfGum;
        System.out.println("32. She will need " + totalGum + " pieces of gum.");
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        totalMoney = 3;
        int costCandy = 1;
        moneyLeft = totalMoney - costCandy;
        System.out.println("33. Dan has " + moneyLeft + " dollars left.");
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boats = 5;
        int peopleInBoats = 3;
        int totalPeople = boats * peopleInBoats;
        System.out.println("34. There are " + totalPeople + " total people.");
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int totalLegos = 380;
        int lostLegos = 57;
        int leftLegos = totalLegos - lostLegos; 
        System.out.println("35. There are " + leftLegos + " Legos left.");
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int muffins = 35;
        int totalMuffins = 83;
        int moreMuffins = totalMuffins - muffins;
        System.out.println("36. He needs to bake " + moreMuffins + " more muffins.");
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willyCrayons = 1400;
        int lucyCrayons = 290;
        int moreCrayons = willyCrayons - lucyCrayons;
        System.out.println("37. Willy has " + moreCrayons + " more Crayons than Lucy.");
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int Stickers = 10;
        int Pages = 22;
        int totalStickers = Stickers * Pages;
        System.out.println("38. There are " + totalStickers + " stickers.");
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int cupcakes = 96;
        int children = 8;
        int cupcakesPerPerson = cupcakes / children;
        System.out.println("39. Each child would get " + cupcakesPerPerson + " cupcakes.");
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int gingerbread = 47;
        int cookiesPerJar = 6;
        int cookiesNotPlaced = gingerbread % cookiesPerJar; 
        System.out.println("40. Cookies not placed in jars: " + cookiesNotPlaced);
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int Croissants = 59;
        int Neighbors = 8;
        int leftCroissants = Croissants % Neighbors;
        System.out.println("41. There are " + leftCroissants + " croissants left.");
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int totalCookies = 276;
        int cookiesPerTray = 12;
        int totalTrays = totalCookies / cookiesPerTray;
        System.out.println("42. She will need " + totalTrays + " trays.");
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int pretzels = 480;
        int pretzelServings = 12;
        int servings = pretzels / pretzelServings;
        System.out.println("43. Marian prepared " + servings + " servings.");
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int lemon = 53;
        int leftLemon = 2;
        int lemonPerBox = 3;
        int boxes = (lemon - leftLemon) / lemonPerBox;
        System.out.println("44. " + boxes + " boxes");
        
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrots = 74;
        int people = 12;
        int carrotsLeft = carrots % people;
        System.out.println("45. " + carrotsLeft + " carrot sticks left.");
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int bears = 98;
        int bearsOnShelf = 7;
        int filledShelves = bears / bearsOnShelf;
        System.out.println("46. " + filledShelves + " shelves.");
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int pictures = 480;
        int picturesPerAlbum = 20;
        int totalAlbums = pictures / picturesPerAlbum;
        System.out.println("47. " + totalAlbums + " albums.");
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int cards = 94;
        int fullBox = 8;
        int filledBoxes = cards / fullBox;
        int unfilledBox = cards % fullBox;
        System.out.println("48. There were " + filledBoxes + " filled boxes and " + unfilledBox + " cards in the unfilled box.");
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        books = 210;
        int repairedShelves = 10;
        int booksPerShelf = books / repairedShelves;
        System.out.println("49. Each shelf will contain " + booksPerShelf + " books.");
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int croissants = 17;
        int guests = 7;
        int croissantsPerGuest = croissants / guests;
        System.out.println("50. Each guest will have " + croissantsPerGuest + " croissants.");
	}

}
