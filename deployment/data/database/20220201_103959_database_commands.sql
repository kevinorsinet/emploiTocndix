CREATE TABLE "emploitocndixmodule$cv" (
	"id" BIGINT NOT NULL,
	"cv_nom" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('bfd3a407-0a7e-453e-b052-9a2bfe5378c5', 
'emploiTocndixModule.cv', 
'emploitocndixmodule$cv', 
'170ce49d-f29c-4fac-99a6-b55e8a3aeb39', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('bada1945-9a4a-4318-bb0b-99a9bded2f33', 
'bfd3a407-0a7e-453e-b052-9a2bfe5378c5', 
'cv_nom', 
'cv_nom', 
30, 
200, 
'', 
false);
CREATE TABLE "emploitocndixmodule$candidat_cv" (
	"emploitocndixmodule$candidatid" BIGINT NOT NULL,
	"emploitocndixmodule$cvid" BIGINT NOT NULL,
	PRIMARY KEY("emploitocndixmodule$candidatid","emploitocndixmodule$cvid"),
	CONSTRAINT "uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$cvid" UNIQUE ("emploitocndixmodule$cvid"),
	CONSTRAINT "uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$candidatid" UNIQUE ("emploitocndixmodule$candidatid"));
CREATE INDEX "idx_emploitocndixmodule$candidat_cv_emploitocndixmodule$cv_emploitocndixmodule$candidat" ON "emploitocndixmodule$candidat_cv" ("emploitocndixmodule$cvid" ASC,"emploitocndixmodule$candidatid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('093670f3-cd0e-4734-8c4b-3c5453553e2b', 
'emploiTocndixModule.candidat_cv', 
'emploitocndixmodule$candidat_cv', 
'c45f8571-d586-4a8a-afbf-764f1b2fbe63', 
'bfd3a407-0a7e-453e-b052-9a2bfe5378c5', 
'emploitocndixmodule$candidatid', 
'emploitocndixmodule$cvid', 
'idx_emploitocndixmodule$candidat_cv_emploitocndixmodule$cv_emploitocndixmodule$candidat');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$cvid', 
'093670f3-cd0e-4734-8c4b-3c5453553e2b', 
'd35d5cf5-df30-30b7-abdf-8586ee38ffd8');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$candidatid', 
'093670f3-cd0e-4734-8c4b-3c5453553e2b', 
'9b366b77-bc87-3039-8f8c-6e20e5483b1e');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220201 10:39:59';
