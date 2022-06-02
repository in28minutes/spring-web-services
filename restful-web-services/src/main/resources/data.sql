/*  Replace H2 sysdate() function(deprecated) with CURRENT_DATE() function */
insert into user values(10001, CURRENT_DATE(), 'AB');
insert into user values(10002, CURRENT_DATE(), 'Jill');
insert into user values(10003, CURRENT_DATE(), 'Jam');
insert into post values(11001, 'My First Post', 10001);
insert into post values(11002, 'My Second Post', 10001);