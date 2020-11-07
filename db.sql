CREATE TABLE `User` (
  `userName` varchar(255),
  `email` varchar(255),
  `password` varchar(255),
  `createdAt` date,
  `updateAt` date,
  `deletetAt` date,
  `userType` varchar(255),
  `panNumber` varchar(255),
  `adhaarNumber` varchar(255),
  `userId` varchar(255)
);

CREATE TABLE `Loan` (
  `loanId` varchar(255),
  `applNo` varchar(255),
  `purpose` varchar(255),
  `amtRequest` integer,
  `amtSancioned` integer,
  `loanTerm` integer,
  `psd` varchar(255),
  `lcd` varchar(255),
  `emi` integer,
  `doa` varchar(255),
  `bstructure` varchar(255),
  `bindicator` varchar(255),
  `address` varchar(255),
  `userId` integer,
  `IsSalaried` boolean,
  `IsTaxPayer` boolean,
  `IsApproved` boolean
);
