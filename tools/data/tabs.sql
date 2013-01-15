create table file(
	uuid	varchar(50),
	fileName		varchar(2000),
	filePath		varchar(2000),
	fileSize varchar(2000),
	lastModify date,
	uri varchar(2000),
	constraint PK_UUID primary key (uuid)
);

