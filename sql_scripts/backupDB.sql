--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-07-05 20:03:57

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 8 (class 2615 OID 16441)
-- Name: co; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA co;


ALTER SCHEMA co OWNER TO postgres;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 206 (class 1259 OID 16452)
-- Name: t_cocktails; Type: TABLE; Schema: co; Owner: postgres
--

CREATE TABLE co.t_cocktails (
    cocktail_id bigint NOT NULL,
    name character varying(50) NOT NULL,
    url character varying(1000) NOT NULL,
    instructions character varying(10000)
);


ALTER TABLE co.t_cocktails OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 16450)
-- Name: t_cocktails_cocktail_id_seq; Type: SEQUENCE; Schema: co; Owner: postgres
--

CREATE SEQUENCE co.t_cocktails_cocktail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE co.t_cocktails_cocktail_id_seq OWNER TO postgres;

--
-- TOC entry 2854 (class 0 OID 0)
-- Dependencies: 205
-- Name: t_cocktails_cocktail_id_seq; Type: SEQUENCE OWNED BY; Schema: co; Owner: postgres
--

ALTER SEQUENCE co.t_cocktails_cocktail_id_seq OWNED BY co.t_cocktails.cocktail_id;


--
-- TOC entry 209 (class 1259 OID 16469)
-- Name: t_cocktails_x_ingredients; Type: TABLE; Schema: co; Owner: postgres
--

CREATE TABLE co.t_cocktails_x_ingredients (
    cocktail_id bigint NOT NULL,
    ingredient_id bigint NOT NULL,
    measure character varying(50)
);


ALTER TABLE co.t_cocktails_x_ingredients OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 16465)
-- Name: t_cocktails_x_ingredients_cocktail_id_seq; Type: SEQUENCE; Schema: co; Owner: postgres
--

CREATE SEQUENCE co.t_cocktails_x_ingredients_cocktail_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE co.t_cocktails_x_ingredients_cocktail_id_seq OWNER TO postgres;

--
-- TOC entry 2855 (class 0 OID 0)
-- Dependencies: 207
-- Name: t_cocktails_x_ingredients_cocktail_id_seq; Type: SEQUENCE OWNED BY; Schema: co; Owner: postgres
--

ALTER SEQUENCE co.t_cocktails_x_ingredients_cocktail_id_seq OWNED BY co.t_cocktails_x_ingredients.cocktail_id;


--
-- TOC entry 208 (class 1259 OID 16467)
-- Name: t_cocktails_x_ingredients_ingredient_id_seq; Type: SEQUENCE; Schema: co; Owner: postgres
--

CREATE SEQUENCE co.t_cocktails_x_ingredients_ingredient_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE co.t_cocktails_x_ingredients_ingredient_id_seq OWNER TO postgres;

--
-- TOC entry 2856 (class 0 OID 0)
-- Dependencies: 208
-- Name: t_cocktails_x_ingredients_ingredient_id_seq; Type: SEQUENCE OWNED BY; Schema: co; Owner: postgres
--

ALTER SEQUENCE co.t_cocktails_x_ingredients_ingredient_id_seq OWNED BY co.t_cocktails_x_ingredients.ingredient_id;


--
-- TOC entry 204 (class 1259 OID 16444)
-- Name: t_ingredients; Type: TABLE; Schema: co; Owner: postgres
--

CREATE TABLE co.t_ingredients (
    ingredient_id bigint NOT NULL,
    name character varying(50) NOT NULL
);


ALTER TABLE co.t_ingredients OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 16442)
-- Name: t_ingredients_ingredient_id_seq; Type: SEQUENCE; Schema: co; Owner: postgres
--

CREATE SEQUENCE co.t_ingredients_ingredient_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE co.t_ingredients_ingredient_id_seq OWNER TO postgres;

--
-- TOC entry 2857 (class 0 OID 0)
-- Dependencies: 203
-- Name: t_ingredients_ingredient_id_seq; Type: SEQUENCE OWNED BY; Schema: co; Owner: postgres
--

ALTER SEQUENCE co.t_ingredients_ingredient_id_seq OWNED BY co.t_ingredients.ingredient_id;


--
-- TOC entry 2705 (class 2604 OID 16455)
-- Name: t_cocktails cocktail_id; Type: DEFAULT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_cocktails ALTER COLUMN cocktail_id SET DEFAULT nextval('co.t_cocktails_cocktail_id_seq'::regclass);


--
-- TOC entry 2706 (class 2604 OID 16472)
-- Name: t_cocktails_x_ingredients cocktail_id; Type: DEFAULT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_cocktails_x_ingredients ALTER COLUMN cocktail_id SET DEFAULT nextval('co.t_cocktails_x_ingredients_cocktail_id_seq'::regclass);


--
-- TOC entry 2707 (class 2604 OID 16473)
-- Name: t_cocktails_x_ingredients ingredient_id; Type: DEFAULT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_cocktails_x_ingredients ALTER COLUMN ingredient_id SET DEFAULT nextval('co.t_cocktails_x_ingredients_ingredient_id_seq'::regclass);


--
-- TOC entry 2704 (class 2604 OID 16447)
-- Name: t_ingredients ingredient_id; Type: DEFAULT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_ingredients ALTER COLUMN ingredient_id SET DEFAULT nextval('co.t_ingredients_ingredient_id_seq'::regclass);


--
-- TOC entry 2845 (class 0 OID 16452)
-- Dependencies: 206
-- Data for Name: t_cocktails; Type: TABLE DATA; Schema: co; Owner: postgres
--

COPY co.t_cocktails (cocktail_id, name, url, instructions) FROM stdin;
337	Absolut Stress #2	https://www.thecocktaildb.com/images/media/drink/xuyqrw1472811825.jpg	Mix well. Garnish with Orange and Cherry. Enjoy
302	57 Chevy with a White License Plate	https://www.thecocktaildb.com/images/media/drink/qyyvtu1468878544.jpg	1. Fill a rocks glass with ice 2.add white creme de cacao and vodka 3.stir
303	1900FUKMEUP	https://www.thecocktaildb.com/images/media/drink/uxywyw1468877224.jpg	Shake ingredients in a mixing tin filled with ice cubes. Strain into a rocks glass.
304	110 in the shade	https://www.thecocktaildb.com/images/media/drink/xxyywq1454511117.jpg	Drop shooter in glass. Fill with beer
305	151 Florida Bushwacker	https://www.thecocktaildb.com/images/media/drink/rvwrvv1468877323.jpg	Combine all ingredients. Blend until smooth. Garnish with chocolate shavings if desired.
306	155 Belmont	https://www.thecocktaildb.com/images/media/drink/yqvvqs1475667388.jpg	Blend with ice. Serve in a wine glass. Garnish with carrot.
307	24k nightmare	https://www.thecocktaildb.com/images/media/drink/yyrwty1468877498.jpg	Add over ice,shake and pour.
308	252	https://www.thecocktaildb.com/images/media/drink/rtpxqw1468877562.jpg	Add both ingredients to shot glass, shoot, and get drunk quick
309	3 Wise Men	https://www.thecocktaildb.com/images/media/drink/wxqpyw1468877677.jpg	put them them in a glass... and slam it to tha head.
310	3Mile Long Island Iced Tea	https://www.thecocktaildb.com/images/media/drink/rrtssw1472668972.jpg	Fill 14oz glass with ice and alcohol. Fill 2/3 glass with cola and remainder with sweet & sour. Top with dash of bitters and lemon wedge.
311	410 Gone	https://www.thecocktaildb.com/images/media/drink/xtuyqv1472669026.jpg	
312	50/50	https://www.thecocktaildb.com/images/media/drink/wwpyvr1461919316.jpg	fill glass with crushed ice. Add vodka. Add a splash of grandmarnier. Fill with o.j.
313	501 Blue	https://www.thecocktaildb.com/images/media/drink/ywxwqs1461867097.jpg	Mix equal amounts into a glass with ice.
314	69 Special	https://www.thecocktaildb.com/images/media/drink/vqyxqx1472669095.jpg	Pour 2 oz. gin. Add 4 oz. 7up. Add Lemon Juice for flavor. If you are weak, top up glass with more 7Up.
315	747	https://www.thecocktaildb.com/images/media/drink/xxsxqy1472668106.jpg	pour kaluha, then Baileys, then Frangelico not chilled and not layered  SERVE
316	747 Drink	https://www.thecocktaildb.com/images/media/drink/i9suxb1582474926.jpg	Fill a Collins glass with ice.Pour in vodka, lime cordial, and cranberry juice.Fill up with Sprite.Garnish with a Lime wheel or some cranberries
317	9 1/2 Weeks	https://www.thecocktaildb.com/images/media/drink/xvwusr1472669302.jpg	Combine all ingredients in glass mixer. Chill and strain into Cocktail glass. Garnish with sliced strawberry.
318	A Day at the Beach	https://www.thecocktaildb.com/images/media/drink/trptts1454514474.jpg	Shake Rum, Amaretto, and Orange Juice in a shaker filled with ice. Strain over ice into a highball glass. Add Grenadine and garnish with a Pineapple Wedge and a Strawberry.
319	A Furlong Too Late	https://www.thecocktaildb.com/images/media/drink/ssxvww1472669166.jpg	Pour the rum and ginger beer into a highball glass almost filled with ice cubes. Stir well. Garnish with the lemon twist.
320	A Gilligans Island	https://www.thecocktaildb.com/images/media/drink/wysqut1461867176.jpg	Shaken, not stirred
321	A midsummernight dream	https://www.thecocktaildb.com/images/media/drink/ysqvqp1461867292.jpg	Mix the strawberrys in a blender Pour it together with the vodka,kirch and strawberry liquer over ice in a shaker. Shake well and pour in a highballglass. Fill up with the Russchian water
322	A Night In Old Mandalay	https://www.thecocktaildb.com/images/media/drink/vyrvxt1461919380.jpg	In a shaker halffilled with ice cubes, combine the light rum, añejo rum, orange juice, and lemon juice. Shake well. Strain into a highball glass almost filled with ice cubes. Top with the ginger ale. Garnish with the lemon twist.
323	A Piece of Ass	https://www.thecocktaildb.com/images/media/drink/tqxyxx1472719737.jpg	Put ice in glass. Pour in shots. Fill with Sour Mix.
324	A Splash of Nash	https://www.thecocktaildb.com/images/media/drink/rsvtrr1472668201.jpg	Drop shot glass with banana & melon liquers into a 9 oz hi ball glass containing soda water and cranberry juice. Drink in one shot.
325	A True Amaretto Sour	https://www.thecocktaildb.com/images/media/drink/rptuxy1472669372.jpg	Rub the rim of an old fashioned glass with lemon, and dip repeatedly into granulated sugar until it has a good "frosted" rim. Shake a jigger of Amaretto with the juice of 1/2 a lemon. Strain into glass and add ice. Garnish with a Marachino Cherry.
326	A. J.	https://www.thecocktaildb.com/images/media/drink/l74qo91582480316.jpg	Shake ingredients with ice, strain into a cocktail glass, and serve.
327	A.D.M. After Dinner Mint	https://www.thecocktaildb.com/images/media/drink/ruxuvp1472669600.jpg	shake vigorously
328	A1	https://www.thecocktaildb.com/images/media/drink/2x8thr1504816928.jpg	Pour all ingredients into a cocktail shaker, mix and serve over ice into a chilled glass.
329	Abbey Cocktail	https://www.thecocktaildb.com/images/media/drink/mr30ob1582479875.jpg	Shake all ingredients except for the cherry with ice and strain into a cocktail glass. Top with the cherry and serve.
330	Abbey Martini	https://www.thecocktaildb.com/images/media/drink/2mcozt1504817403.jpg	Put all ingredients into a shaker and mix, then strain contents into a chilled cocktail glass.
331	ABC	https://www.thecocktaildb.com/images/media/drink/tqpvqp1472668328.jpg	Layered in a shot glass.
332	Abilene	https://www.thecocktaildb.com/images/media/drink/smb2oe1582479072.jpg	Pour all of the ingredients into a highball glass almost filled with ice cubes. Stir well.
333	Absinthe #2	https://www.thecocktaildb.com/images/media/drink/uxxtrt1472667197.jpg	Mix together and let sit a few days. Strain through a coffee filter. To serve mix 1 part absinthe to 4 parts water, add ice, enjoy.
334	Absolut Evergreen	https://www.thecocktaildb.com/images/media/drink/wrxrxp1472812609.jpg	Mix, pour over ice and top up with Bitter Lemon.
335	Absolut limousine	https://www.thecocktaildb.com/images/media/drink/ssqpyw1472719844.jpg	Fill Absolut into a glass. Add Lime juice. Add Ice and lime wedges.
336	Absolut Sex	https://www.thecocktaildb.com/images/media/drink/xtrvtx1472668436.jpg	Shake Absolut Kurant, Midori, and Cranberry juice in shaker with ice: Strain into rocks glass: Splash of seven on top.Absolut Sex.
338	Absolut Summertime	https://www.thecocktaildb.com/images/media/drink/trpxxs1472669662.jpg	Add all ingredients except lemon to shaker filled with ice. Cover and shake vigorously. Strain contents into ice filled collins glass. Garnish with lemon.
339	Absolutely Cranberry Smash	https://www.thecocktaildb.com/images/media/drink/vqwstv1472811884.jpg	Stir ingredients together. Serve over ice.
340	Absolutely Fabulous	https://www.thecocktaildb.com/images/media/drink/abcpwr1504817734.jpg	Mix the Vodka and Cranberry juice together in a shaker and strain into a glass. Top up with Champagne.
341	Absolutly Screwed Up	https://www.thecocktaildb.com/images/media/drink/yvxrwv1472669728.jpg	Shake it up it tasts better that way, but you can stir it if you want. 6 of those and you will be wasted for the rest of the night.
342	Acapulco	https://www.thecocktaildb.com/images/media/drink/il9e0r1582478841.jpg	Combine and shake all ingredients except mint with ice and strain into an oldfashioned glass over ice cubes. Add the sprig of mint and serve.
343	Ace	https://www.thecocktaildb.com/images/media/drink/l3cd7f1504818306.jpg	Shake all the ingredients in a cocktail shaker and ice then strain in a cold glass.
344	ACID	https://www.thecocktaildb.com/images/media/drink/xuxpxt1479209317.jpg	Poor in the 151 first followed by the 101 served with a Coke or Dr Pepper chaser.
345	Adam	https://www.thecocktaildb.com/images/media/drink/v0at4i1582478473.jpg	In a shaker halffilled with ice cubes, combine all of the ingredients. Shake well. Strain into a cocktail glass.
346	Adam & Eve	https://www.thecocktaildb.com/images/media/drink/vfeumw1504819077.jpg	Shake together all the ingredients and strain into a cold glass.
347	Adam Bomb	https://www.thecocktaildb.com/images/media/drink/tpxurs1454513016.jpg	Add ice to blender or to glass if prefer on the rocks then fruit, and fruite juice depending on personal prefference then add the Rum, Vodka, Tequila, and triple sec. blend till smooth, rim glass with sugar or salt and pour mixture in. garnish with lemon or lime slice.
348	Adam Sunrise	https://www.thecocktaildb.com/images/media/drink/vtuyvu1472812112.jpg	Fill blender up with ice. Fill half with Bartons Vodka. Put 10 tsp of sugar, add 1/2 can lemonade concentrate, fill to top with water. Blend for 60 seconds.
349	Addington	https://www.thecocktaildb.com/images/media/drink/ib0b7g1504818925.jpg	Mix both the vermouths in a shaker and strain into a cold glass. Top up with a squirt of Soda Water. 
350	Addison	https://www.thecocktaildb.com/images/media/drink/yzva7x1504820300.jpg	Shake together all the ingredients and strain into a cold glass.
351	Addison Special	https://www.thecocktaildb.com/images/media/drink/4vo5651493068493.jpg	Combine ingredients in the order listed into a shaker. Fill half full with ice and shake well. Strain into glass with ice and garnish with a cherry and orange wedge.
352	Adios Amigos Cocktail	https://www.thecocktaildb.com/images/media/drink/8nk2mp1504819893.jpg	Shake together all the ingredients and strain into a cold glass.
353	Adonis Cocktail	https://www.thecocktaildb.com/images/media/drink/xrvruq1472812030.jpg	Stir all ingredients with ice, strain contents into a cocktail glass, and serve.
354	Affair	https://www.thecocktaildb.com/images/media/drink/h5za6y1582477994.jpg	Pour schnapps, orange juice, and cranberry juice over ice in a highball glass. Top with club soda and serve.
355	Affinity	https://www.thecocktaildb.com/images/media/drink/wzdtnn1582477684.jpg	In a mixing glass halffilled with ice cubes, combine all of the ingredients. Stir well. Strain into a cocktail glass.
356	After Dinner Cocktail	https://www.thecocktaildb.com/images/media/drink/vtytxq1483387578.jpg	Shake all ingredients except lime wedge with ice and strain into a cocktail glass. Add the wedge of lime and serve.
357	After Five	https://www.thecocktaildb.com/images/media/drink/sk3lr91493068595.jpg	1. Pour Kahlua into shot glass to about 1/2 full. 2. Using a spooninverted, slowly pour in the Peppermint Schnapps until glass is about 3/4 full. Done correctly, the Schnapps will flow under the Kahlua for a clear layer. 3. Again using a spoon, but this time right side up, slowly top off the glass with a layer of Baileys. Be careful to place the spoon right at the top of the Kahlua layer and to raise it as the glass fills up. Done correctly, this will provide a layer of Baileys floating over the Kahlua. 4. Toss it down all at once for something like a Peppermint Pattie, WITH A BANG NOTE: Best if all ingredients are chilled
358	After sex	https://www.thecocktaildb.com/images/media/drink/xrl66i1493068702.jpg	Pour the vodka and creme over some ice cubes in a tall glass and fill up with juice. to make it beuty full make the top of the glass with a grenadine and sugar
359	After Supper Cocktail	https://www.thecocktaildb.com/images/media/drink/quyxwu1483387610.jpg	Shake all ingredients with ice, strain into a cocktail glass, and serve.
360	Afternoon	https://www.thecocktaildb.com/images/media/drink/vyrurp1472667777.jpg	Build into a suiting glass, with no ice. Cream on top if wanted. Served directly.
361	Alabama Slammer	https://www.thecocktaildb.com/images/media/drink/qtwxwr1483387647.jpg	Pour all ingredients except for lemon juice over ice in a highball glass. Stir, add a dash of lemon juice, and serve.
362	Alaska Cocktail	https://www.thecocktaildb.com/images/media/drink/wsyryt1483387720.jpg	Stir all ingredients with ice, strain contents into a cocktail glass. Drop in a twist of lemon and serve.
363	Alexander	https://www.thecocktaildb.com/images/media/drink/urystu1478253039.jpg	Shake all ingredients with ice and strain contents into a cocktail glass. Sprinkle nutmeg on top and serve.
364	Alfie Cocktail	https://www.thecocktaildb.com/images/media/drink/ypxsqy1483387829.jpg	Combine and shake all ingredients with ice, strain into a cocktail glass, and serve.
365	Algonquin	https://www.thecocktaildb.com/images/media/drink/uwryxx1483387873.jpg	Combine and shake all ingredients with ice, strain contents into a cocktail glass, and serve.
366	Alice in Wonderland	https://www.thecocktaildb.com/images/media/drink/g12lj41493069391.jpg	Just mix the three ingredients one to one to one
367	Allegheny	https://www.thecocktaildb.com/images/media/drink/uwvyts1483387934.jpg	Shake all ingredients except lemon peel with ice and strain into a cocktail glass. Top with the twist of lemon peel and serve.
368	Allies Cocktail	https://www.thecocktaildb.com/images/media/drink/qvprvp1483388104.jpg	Stir all ingredients with ice, strain contents into a cocktail glass, and serve.
369	Almeria	https://www.thecocktaildb.com/images/media/drink/rwsyyu1483388181.jpg	In a shaker halffilled with ice cubes, combine all of the ingredients. Shake well. Strain into a cocktail glass.
370	Almond Chocolate Coffee	https://www.thecocktaildb.com/images/media/drink/jls02c1493069441.jpg	Pour in order into coffee cup. Top with whipped creme and chocolate shcvings.
371	Almond Joy	https://www.thecocktaildb.com/images/media/drink/xutuqs1483388296.jpg	Shake all ingredients with ice, strain into a cocktail glass, and serve.
372	Amaretto And Cream	https://www.thecocktaildb.com/images/media/drink/dj8n0r1504375018.jpg	Shake well with cracked ice, strain contents into a cocktail glass, and serve.
373	Amaretto fizz	https://www.thecocktaildb.com/images/media/drink/92h3jz1582474310.jpg	Mix Amaretto, orange juice and sparkling wine in a jug. Add a strip orange zest to each glass, if you like.
374	Amaretto Liqueur	https://www.thecocktaildb.com/images/media/drink/swqxuv1472719649.jpg	Combine sugar and 3/4 cup water in a small saucepan. Bring to a boil, stirring constantly. Reduce heat and simmer until all sugar is dissolved. Remove from heat and cool. In an aging container, combine apricot halves, almond extract, grain alcohol with 1/2 cup water, and brandy. Stir in cooled sugar syrup mixture. Cap and let age for 2 days. Remove apricot halves. Save apricot halves, can be used for cooking. Add food coloring and glycerine. Stir, recap and continue aging for 1 to 2 months. Rebottle as desired. Liqueur is ready to serve but will continue to improve with additional aging.
375	Amaretto Mist	https://www.thecocktaildb.com/images/media/drink/utpxxq1483388370.jpg	Pour amaretto in an oldfashioned glass over crushed ice. Add the wedge of lime and serve. A wedge of lemon may be substituted for lime, if preferred.
376	Amaretto Rose	https://www.thecocktaildb.com/images/media/drink/3jm41q1493069578.jpg	Pour amaretto and lime juice over ice in a collins glass. Fill with club soda and serve.
377	Amaretto Shake	https://www.thecocktaildb.com/images/media/drink/xk79al1493069655.jpg	Combine all ingredients in a blender and blend at high speed until smooth. Serve in chilled glass garnished with bittersweet chocolate shavings.
378	Amaretto Sour	https://www.thecocktaildb.com/images/media/drink/xnzc541493070211.jpg	Shake and strain. Garnish with a cherry and an orange slice.
379	Amaretto Stinger	https://www.thecocktaildb.com/images/media/drink/vvop4w1493069934.jpg	Shake ingredients well with cracked ice, strain into a cocktail glass, and serve.
380	Amaretto Stone Sour	https://www.thecocktaildb.com/images/media/drink/xwryyx1472719921.jpg	Shake and Serve over ice
381	Amaretto Stone Sour #3	https://www.thecocktaildb.com/images/media/drink/wutxqr1472720012.jpg	Shake sour mix, tequila and amaretto with ice. Strain into highball glass. Add a splash of OJ. Garnish with orange slice and a cherry.
382	Amaretto Sunrise	https://www.thecocktaildb.com/images/media/drink/akcpsh1493070267.jpg	Mix together the amaretto and orange juice. Pour into glass and then add the grenadine untill you see the sunrise.
383	Amaretto Sunset	https://www.thecocktaildb.com/images/media/drink/apictz1493069760.jpg	Shake ingredients in bartenders mixer quickly, just 5 shakes. Strain out ice, serve in glass immediately with a slice of orange.
384	Amaretto Sweet & Sour	https://www.thecocktaildb.com/images/media/drink/vswwus1472668546.jpg	Fill the blender with 3/4 ice. Add sweet & sour mix to the top of the ice. Add about 1" of pineapple juice, 1/2" of melon liqeur, and 1/2 to 1/4" of amaretto. Then blend the mix until it is of margaritta consistency or thinner.
385	Amaretto Tea	https://www.thecocktaildb.com/images/media/drink/b7qzo21493070167.jpg	Pour hot tea into a poussecafe glass, using a spoon in glass to prevent cracking. Add amaretto, but do not stir. Top with chilled whipped cream and serve.
386	Americano	https://www.thecocktaildb.com/images/media/drink/trwruu1478253126.jpg	Pour the Campari and vermouth over ice into glass, add a splash of soda water and garnish with half orange slice.
387	Angel Face	https://www.thecocktaildb.com/images/media/drink/vqpptp1478253178.jpg	Shake all ingredients with ice and strain contents into a cocktail glass.
388	Angelica Liqueur	https://www.thecocktaildb.com/images/media/drink/yuurps1472667672.jpg	Combine all herbs, nuts and spices with vodka in a 1 quart or larger aging container. Cap tightly and shake daily for 2 weeks. Strain through a fine muslin cloth or coffee filter, discarding solids. Clean out aging container. Place liquid back in container. Place sugar and water in saucepan and stir to combine over medium heat. When sugar is completely dissolved, set aside and let cool. When cool combine with food coloring and add to liqueur liquid. Cap and allow to age and mellow in a cool, dark place for one month.
389	Aperol Spritz	https://www.thecocktaildb.com/images/media/drink/iloasq1587661955.jpg	Put a couple of cubes of ice into 2 glasses and add a 50 ml measure of Aperol to each. Divide the prosecco between the glasses and then top up with soda, if you like.
390	Apple Grande	https://www.thecocktaildb.com/images/media/drink/wqrptx1472668622.jpg	Chill both ingredients Mix in a tumbler and enjoy
391	Apple Pie with A Crust	https://www.thecocktaildb.com/images/media/drink/qspqxt1472720078.jpg	Just mix the two liquids and sprinkle in the cinnamon. Serve either cold or heated.
392	Apple Slammer	https://www.thecocktaildb.com/images/media/drink/09yd5f1493069852.jpg	pour into a shot glass and present to consumer, they are expected to cover the top of the shotglass with thier palm, raise the glass, slam it on the bar and the swallow quickly.
393	Applecar	https://www.thecocktaildb.com/images/media/drink/sbffau1504389764.jpg	Shake all ingredients with ice, strain into a cocktail glass, and serve.
394	Applejack	https://www.thecocktaildb.com/images/media/drink/sutyqp1479209062.jpg	Add all ingredients into mixing glass, chill and strain into cocktail glass
395	Apricot Lady	https://www.thecocktaildb.com/images/media/drink/7ityp11582579598.jpg	In a shaker halffilled with ice cubes, combine the rum, apricot brandy, triple sec, lemon juice, and egg white. Shake well. Strain into an oldfashioned glass almost filled with ice cubes. Garnish with the orange slice.
396	Apricot punch	https://www.thecocktaildb.com/images/media/drink/tuxxtp1472668667.jpg	Pour all ingrediants into a large punch bowl. Add ice and 4 oranges that are peeled and divided.
397	Aquamarine	https://www.thecocktaildb.com/images/media/drink/zvsre31572902738.jpg	Shake well in a shaker with ice.Strain in a martini glass.
398	Archbishop	https://www.thecocktaildb.com/images/media/drink/4g6xds1582579703.jpg	In an oldfashioned glass almost filled with ice cubes, combine all of the ingredients. Stir well.
399	Arctic Fish	https://www.thecocktaildb.com/images/media/drink/ttsvwy1472668781.jpg	Fill glass with ice and fish, add vodka, grape soda and orange juice. DO NOT STIR Serve well chilled.
400	Arctic Mouthwash	https://www.thecocktaildb.com/images/media/drink/wqstwv1478963735.jpg	Blend all ingredients in a blender on high until ice is finely crushed. It should be of a slushy consistency. Pour immediately and serve.
401	Arise My Love	https://www.thecocktaildb.com/images/media/drink/wyrrwv1441207432.jpg	Put creme de menthe into a champagne flute. Fill with chilled champagne and serve.
\.


--
-- TOC entry 2848 (class 0 OID 16469)
-- Dependencies: 209
-- Data for Name: t_cocktails_x_ingredients; Type: TABLE DATA; Schema: co; Owner: postgres
--

COPY co.t_cocktails_x_ingredients (cocktail_id, ingredient_id, measure) FROM stdin;
302	1466	1 oz white
302	1357	1 oz
303	1427	1/2 oz
303	1352	1/4 oz
303	1418	1/4 oz
303	1433	1/4 oz
303	1371	1/4 oz
303	1366	1/4 oz
303	1376	1/2 oz
303	1374	1/4 oz
304	1350	16 oz
304	1395	1.5 oz
305	1371	1/2 oz
305	1358	1/2 oz
305	1464	1/2 oz bacardi
305	1445	1 oz
305	1383	1 oz
305	1372	3 oz
305	1474	1 oz
305	1467	1 cup
306	1429	1 shot
306	1358	2 shots
306	1357	1 shot
306	1469	1 shot
307	1419	1/2 oz
307	1449	1/2 oz
307	1457	1/2 oz
307	1464	1/2 oz bacardi
308	1464	1/2 shot bacardi
308	1413	1/2 shot
309	1431	1/3 oz
309	1408	1/3 oz
309	1478	1/3 oz
310	1370	1/2 oz
310	1358	1/2 oz
310	1395	1/2 oz
310	1380	1/2 oz
310	1357	1/2 oz
310	1388	not specified
310	1411	1-2 dash
310	1485	1 wedge
310	1434	not specified
311	1360	2-3 oz
311	1388	not specified
312	1409	2 1/2 oz
312	1352	1 splash
312	1469	fill with
313	1450	not specified
313	1341	not specified
313	1357	not specified
313	1407	not specified
313	1353	not specified
314	1370	2 oz dry
314	1353	4 oz
314	1384	0.75 oz
315	1373	1/3 part
315	1368	1/3 part
315	1412	1/3 part
316	1357	1 oz
316	1424	1 oz
316	1376	1 oz
316	1487	top
316	1468	not specified
317	1455	2 oz
317	1391	1/2 oz
317	1392	1 splash
317	1469	1 oz
318	1401	1 oz
318	1366	1/2 oz
318	1469	4 oz
318	1436	1/2 oz
319	1358	2 oz
319	1336	4 oz
319	1460	1 twist of
320	1357	1 oz
320	1472	1 oz
320	1469	3 oz
320	1376	3 oz
321	1357	2 oz
321	1453	1 oz
321	1392	1 tsp
321	1425	5
321	1343	not specified
322	1358	1 oz
322	1444	1 oz
322	1469	1 oz
322	1384	1/2 oz
322	1451	3 oz
322	1460	1 twist of
323	1366	1 shot
323	1473	1 shot
323	1470	cubes
323	1407	not specified
324	1376	2 oz
324	1369	2 oz
324	1433	0.5 oz
324	1399	0.5 oz
325	1366	1 jigger
325	1434	juice of 1/2
325	1470	not specified
325	1365	not specified
326	1405	1 1/2 oz
326	1428	1 oz
327	1486	1/2 oz
327	1473	3/4 oz
327	1357	1/2 oz
327	1482	fill with
328	1370	1 3/4 shot
328	1352	1 shot
328	1384	1/4 shot
328	1436	1/8 shot
329	1370	1 1/2 oz
329	1484	1 dash
329	1364	juice of 1/4
329	1402	1
330	1370	2 shots
330	1359	1 shot
330	1469	1 shot
330	1410	3 dashes
331	1366	1/3
331	1368	1/3
331	1385	1/3
332	1429	1 1/2 oz
332	1435	2 oz
332	1469	3 oz
333	1357	1 bottle
333	1488	50 gr
333	1439	50 ml pure
333	1479	1 tblsp
333	1397	1
334	1455	2/3 part
334	1422	1/3 part
334	1470	cubes
334	1465	not specified
335	1455	2/3
335	1340	1/3
335	1470	fill with
335	1438	top it up with
336	1427	3/4 oz
336	1433	3/4 oz
336	1376	1 oz
336	1487	1 splash
337	1442	1 1/2 oz
337	1472	1/2 oz
337	1474	1/2 oz
337	1376	1 1/2 oz
337	1374	1 1/2 oz
338	1455	1 1/2 oz
338	1411	3/4 oz
338	1487	1/2 oz
338	1369	3 oz
338	1434	1 slice
339	1442	2 oz
339	1376	4 oz
339	1451	2 oz
339	1470	add
340	1357	1 shot
340	1376	2 shots
340	1338	top up with
341	1455	1 shot
341	1469	1 shot
341	1380	1 shot
341	1451	fill to top
342	1358	1 1/2 oz
342	1380	1 1/2 tsp
342	1340	1 tblsp
342	1488	1 tsp
342	1423	1
342	1361	1
343	1370	2 shots
343	1436	1/2 shot
343	1389	1/2 shot
343	1372	1/2 shot
343	1423	1/2 fresh
344	1464	1 oz bacardi
344	1413	1 oz
345	1429	2 oz
345	1384	1 oz
345	1436	1 tsp
346	1370	1 shot
346	1385	1 shot
346	1377	1 shot
346	1396	1/8 shot
347	1432	1 part
347	1357	1 part
347	1395	1 part
347	1380	1/2 part
347	1354	not specified
347	1470	not specified
347	1476	1-3 pint
347	1440	not specified
348	1357	1/2
348	1475	1/2 can
348	1386	1/2
348	1488	10 tsp
349	1359	2 shots
349	1346	1 shot
349	1369	top up with
350	1370	1 1/2 shot
350	1362	1 1/2 shot
351	1357	1 shot
351	1436	1 tblsp
351	1469	fill with
352	1432	1 shot
352	1346	1/2 shot
352	1385	1/2 shot
352	1370	1/2 shot
352	1426	1/4 shot
352	1403	1/4 shot
352	1386	1/2 shot
353	1359	3/4 oz
353	1452	1 1/2 oz dry
353	1484	1 dash
354	1481	2 oz
354	1469	2 oz
354	1376	2 oz
354	1421	not specified
355	1471	1 1/2 oz
355	1359	1 oz
355	1346	1 oz
355	1484	2 dashes
356	1347	1 oz
356	1380	1 oz
356	1430	1
357	1382	not specified
357	1373	not specified
357	1368	not specified
358	1357	2 cl
358	1399	1 cl
358	1469	not specified
359	1380	1 oz
359	1347	1 oz
359	1384	1/2 tsp
360	1373	1 cl
360	1368	1 cl
360	1412	1 1/2
360	1344	4 cl hot
360	1441	not specified
361	1473	1 oz
361	1366	1 oz
361	1456	1/2 oz
361	1384	1 dash
362	1484	2 dashes
362	1370	1 1/2 oz
362	1462	3/4 oz
362	1460	twist of
363	1370	1/2 oz
363	1466	1/2 oz white
363	1446	2 oz
363	1381	not specified
364	1417	1 1/2 oz
364	1380	1 dash
364	1374	1 tblsp
365	1454	1 1/2 oz
365	1346	1 oz
365	1374	1 oz
366	1366	1 shot
366	1352	1 shot
366	1473	1 shot
367	1346	1 oz
367	1483	1 oz
367	1415	1 1/2 tsp
367	1384	1 1/2 tsp
367	1460	1 twist of
368	1346	1 oz
368	1370	1 oz
368	1477	1/2 tsp
369	1429	2 oz
369	1373	1 oz
369	1423	1
370	1366	3/4 oz
370	1445	1/2 oz
370	1344	8 oz
371	1366	1/2 oz
371	1466	1/2 oz white
371	1446	2 oz
372	1366	1 1/2 oz
372	1446	1 1/2 oz
373	1366	4 cl
373	1469	6 cl
373	1437	15 cl
373	1400	garnish with
373	1468	not specified
374	1488	1 cup
374	1386	1/2 cup
374	1351	2
374	1363	1 tblsp
374	1394	1/2 cup pure
374	1378	1 cup
374	1390	2 drops blue
374	1480	1/2 tsp
375	1366	1 1/2 oz
375	1430	1
376	1366	1 1/2 oz
376	1340	1/2 oz
376	1421	not specified
377	1461	2 scoops
377	1378	2 oz
377	1366	2 oz
378	1366	1 1/2 oz
378	1407	3 oz
379	1366	1 1/2 oz
379	1486	3/4 oz
380	1366	1 part
380	1407	1 part
380	1469	1 part
381	1407	2 oz
381	1366	2 oz
381	1395	2 oz
381	1469	add splash
382	1366	1 cl
382	1469	4 oz
382	1436	1/4 cl
383	1380	1/2 jigger
383	1366	3 shots
383	1414	1/2 cup
383	1470	add 1/2 cup
384	1366	not specified
384	1411	not specified
384	1433	not specified
384	1374	not specified
385	1458	6 oz hot
385	1366	2 oz
385	1420	chilled
386	1416	1 oz
386	1359	1 oz red
386	1460	twist of
386	1400	twist of
387	1347	1/2 oz
387	1345	1/2 oz
387	1370	1 oz
388	1348	3 tblsp chopped
388	1337	1 tblsp chopped
388	1349	1 cracked
388	1448	1 one-inch
388	1439	3-6 crushed
388	1393	1/8 tsp powdered
388	1443	1 tblsp fresh chopped
388	1357	1.5 cup
388	1488	1/2 cup granulated
388	1386	1/4 cup
388	1390	1 drop green
389	1406	100 ml
389	1375	150 ml
389	1369	top
389	1468	not specified
390	1395	3 oz
390	1367	12 oz
391	1342	3 parts
391	1371	1 part
391	1448	3 dashes
392	1353	1 part
392	1463	1 part
393	1405	1 oz
393	1380	1 oz
393	1384	1 oz
394	1431	1 oz
394	1433	1/2 oz
394	1407	2 oz
395	1358	1 1/2 oz
395	1347	1 oz
395	1380	1 tsp
395	1384	1/2 oz
395	1423	1
395	1364	1
396	1347	1 qt
396	1338	4 fifth
396	1357	1 fifth
396	1353	4 l
396	1469	1/2 gal
397	1398	2 oz
397	1374	1 oz
397	1355	1 oz
397	1468	not specified
398	1370	2 oz
398	1379	1 oz green ginger
398	1459	1 tsp
398	1430	1
399	1357	1/3 part
399	1404	1/3 part
399	1469	1/3 part
399	1470	lots
399	1356	1 dash
400	1447	5 oz blue
400	1339	5 oz
400	1470	cubes
401	1338	chilled
401	1387	1 tsp
\.


--
-- TOC entry 2843 (class 0 OID 16444)
-- Dependencies: 204
-- Data for Name: t_ingredients; Type: TABLE DATA; Schema: co; Owner: postgres
--

COPY co.t_ingredients (ingredient_id, name) FROM stdin;
1336	ginger beer
1337	almond
1338	champagne
1339	mountain dew
1340	lime juice
1341	blueberry schnapps
1342	apple juice
1343	schweppes russchian
1344	coffee
1345	apple brandy
1346	dry vermouth
1347	apricot brandy
1348	angelica root
1349	allspice
1350	lager
1351	apricot
1352	grand marnier
1353	7-up
1354	fruit
1355	banana liqueur
1356	candy
1357	vodka
1358	light rum
1359	sweet vermouth
1360	peach vodka
1361	mint
1362	vermouth
1363	almond flavoring
1364	orange
1365	maraschino cherry
1366	amaretto
1367	apple cider
1368	baileys irish cream
1369	soda water
1370	gin
1371	malibu rum
1372	milk
1373	kahlua
1374	pineapple juice
1375	prosecco
1376	cranberry juice
1377	creme de cassis
1378	brandy
1379	wine
1380	triple sec
1381	nutmeg
1382	peppermint schnapps
1383	cointreau
1384	lemon juice
1385	cognac
1386	water
1387	green creme de menthe
1388	coca-cola
1389	heavy cream
1390	food coloring
1391	orange curacao
1392	strawberry liqueur
1393	coriander
1394	grain alcohol
1395	tequila
1396	fresh lemon juice
1397	wormwood
1398	hpnotiq
1399	creme de banane
1400	orange peel
1401	coconut rum
1402	cherry
1403	sugar syrup
1404	grape soda
1405	applejack
1406	aperol
1407	sour mix
1408	johnnie walker
1409	vanilla vodka
1410	angostura bitters
1411	sweet and sour
1412	frangelico
1413	wild turkey
1414	cider
1415	blackberry brandy
1416	campari
1417	lemon vodka
1418	chambord raspberry liqueur
1419	goldschlager
1420	whipped cream
1421	club soda
1422	pisang ambon
1423	egg white
1424	roses sweetened lime juice
1425	strawberries
1426	fresh lime juice
1427	absolut kurant
1428	grapefruit juice
1429	dark rum
1430	lime
1431	jack daniels
1432	rum
1433	midori melon liqueur
1434	lemon
1435	peach nectar
1436	grenadine
1437	white wine
1438	tonic water
1439	anise
1440	fruit juice
1441	cream
1442	absolut vodka
1443	marjoram leaves
1444	añejo rum
1445	dark creme de cacao
1446	light cream
1447	maui
1448	cinnamon
1449	jägermeister
1450	blue curacao
1451	ginger ale
1452	sherry
1453	kirschwasser
1454	blended whiskey
1455	absolut citron
1456	sloe gin
1457	rumple minze
1458	tea
1459	benedictine
1460	lemon peel
1461	chocolate ice-cream
1462	yellow chartreuse
1463	apple schnapps
1464	151 proof rum
1465	bitter lemon
1466	creme de cacao
1467	vanilla ice-cream
1468	not specified
1469	orange juice
1470	ice
1471	scotch
1472	peach schnapps
1473	southern comfort
1474	coconut liqueur
1475	lemonade
1476	salt
1477	kummel
1478	jim beam
1479	licorice root
1480	glycerine
1481	strawberry schnapps
1482	hot chocolate
1483	bourbon
1484	orange bitters
1485	bitters
1486	white creme de menthe
1487	sprite
1488	sugar
\.


--
-- TOC entry 2858 (class 0 OID 0)
-- Dependencies: 205
-- Name: t_cocktails_cocktail_id_seq; Type: SEQUENCE SET; Schema: co; Owner: postgres
--

SELECT pg_catalog.setval('co.t_cocktails_cocktail_id_seq', 401, true);


--
-- TOC entry 2859 (class 0 OID 0)
-- Dependencies: 207
-- Name: t_cocktails_x_ingredients_cocktail_id_seq; Type: SEQUENCE SET; Schema: co; Owner: postgres
--

SELECT pg_catalog.setval('co.t_cocktails_x_ingredients_cocktail_id_seq', 1, false);


--
-- TOC entry 2860 (class 0 OID 0)
-- Dependencies: 208
-- Name: t_cocktails_x_ingredients_ingredient_id_seq; Type: SEQUENCE SET; Schema: co; Owner: postgres
--

SELECT pg_catalog.setval('co.t_cocktails_x_ingredients_ingredient_id_seq', 1, false);


--
-- TOC entry 2861 (class 0 OID 0)
-- Dependencies: 203
-- Name: t_ingredients_ingredient_id_seq; Type: SEQUENCE SET; Schema: co; Owner: postgres
--

SELECT pg_catalog.setval('co.t_ingredients_ingredient_id_seq', 1488, true);


--
-- TOC entry 2711 (class 2606 OID 16460)
-- Name: t_cocktails t_cocktails_pkey; Type: CONSTRAINT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_cocktails
    ADD CONSTRAINT t_cocktails_pkey PRIMARY KEY (cocktail_id);


--
-- TOC entry 2709 (class 2606 OID 16449)
-- Name: t_ingredients t_ingredients_pkey; Type: CONSTRAINT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_ingredients
    ADD CONSTRAINT t_ingredients_pkey PRIMARY KEY (ingredient_id);


--
-- TOC entry 2712 (class 1259 OID 16484)
-- Name: fki_t_cocktails_x_ingredients_cocktail_id_fkey; Type: INDEX; Schema: co; Owner: postgres
--

CREATE INDEX fki_t_cocktails_x_ingredients_cocktail_id_fkey ON co.t_cocktails_x_ingredients USING btree (cocktail_id);


--
-- TOC entry 2713 (class 1259 OID 16485)
-- Name: fki_t_cocktails_x_ingredients_ingredient_id_fkey; Type: INDEX; Schema: co; Owner: postgres
--

CREATE INDEX fki_t_cocktails_x_ingredients_ingredient_id_fkey ON co.t_cocktails_x_ingredients USING btree (ingredient_id);


--
-- TOC entry 2714 (class 2606 OID 16474)
-- Name: t_cocktails_x_ingredients t_cocktails_x_ingredients_cocktail_id_fkey; Type: FK CONSTRAINT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_cocktails_x_ingredients
    ADD CONSTRAINT t_cocktails_x_ingredients_cocktail_id_fkey FOREIGN KEY (cocktail_id) REFERENCES co.t_cocktails(cocktail_id);


--
-- TOC entry 2715 (class 2606 OID 16479)
-- Name: t_cocktails_x_ingredients t_cocktails_x_ingredients_ingredient_id_fkey; Type: FK CONSTRAINT; Schema: co; Owner: postgres
--

ALTER TABLE ONLY co.t_cocktails_x_ingredients
    ADD CONSTRAINT t_cocktails_x_ingredients_ingredient_id_fkey FOREIGN KEY (ingredient_id) REFERENCES co.t_ingredients(ingredient_id);


-- Completed on 2020-07-05 20:03:57

--
-- PostgreSQL database dump complete
--

