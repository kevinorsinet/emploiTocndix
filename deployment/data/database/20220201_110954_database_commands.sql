ALTER TABLE "emploitocndixmodule$candidat" DROP COLUMN "cv_lien";
ALTER TABLE "emploitocndixmodule$candidat" DROP COLUMN "lettre_motivation";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '6831efb8-cdf8-4133-abbf-d6f26a113315';
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'dd94b093-846a-4649-858d-2e8bce8ace7e';
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'emploiTocndixModule.candidat', 
"table_name" = 'emploitocndixmodule$candidat', 
"superentity_id" = NULL, 
"remote" = false, 
"remote_primary_key" = false
 WHERE "id" = 'c45f8571-d586-4a8a-afbf-764f1b2fbe63';
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
 VALUES ('5cf903cc-71f2-4cd9-a80c-26e2b813e7f0', 
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
 VALUES ('0e52cc6c-b3f4-4085-a77c-8081c212d682', 
'5cf903cc-71f2-4cd9-a80c-26e2b813e7f0', 
'cv_nom', 
'cv_nom', 
30, 
200, 
'', 
false);
CREATE TABLE "emploitocndixmodule$motivation" (
	"id" BIGINT NOT NULL,
	"nom_lettre" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"superentity_id", 
"remote", 
"remote_primary_key")
 VALUES ('c01c4c29-0bac-43b7-ac30-dd395a34a644', 
'emploiTocndixModule.motivation', 
'emploitocndixmodule$motivation', 
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
 VALUES ('a7bebcb0-305c-4441-a18b-6b2ff37b5863', 
'c01c4c29-0bac-43b7-ac30-dd395a34a644', 
'nom_lettre', 
'nom_lettre', 
30, 
200, 
'', 
false);
CREATE TABLE "emploitocndixmodule$candidat_motivation" (
	"emploitocndixmodule$candidatid" BIGINT NOT NULL,
	"emploitocndixmodule$motivationid" BIGINT NOT NULL,
	PRIMARY KEY("emploitocndixmodule$candidatid","emploitocndixmodule$motivationid"),
	CONSTRAINT "uniq_emploitocndixmodule$candidat_motivation_emploitocndixmodule$motivationid" UNIQUE ("emploitocndixmodule$motivationid"),
	CONSTRAINT "uniq_emploitocndixmodule$candidat_motivation_emploitocndixmodule$candidatid" UNIQUE ("emploitocndixmodule$candidatid"));
CREATE INDEX "idx_emploitocndixmodule$candidat_motivation_emploitocndixmodule$motivation_emploitocndixmodule$candidat" ON "emploitocndixmodule$candidat_motivation" ("emploitocndixmodule$motivationid" ASC,"emploitocndixmodule$candidatid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('02cd4859-9f65-4609-b04b-ee242442a801', 
'emploiTocndixModule.candidat_motivation', 
'emploitocndixmodule$candidat_motivation', 
'c45f8571-d586-4a8a-afbf-764f1b2fbe63', 
'c01c4c29-0bac-43b7-ac30-dd395a34a644', 
'emploitocndixmodule$candidatid', 
'emploitocndixmodule$motivationid', 
'idx_emploitocndixmodule$candidat_motivation_emploitocndixmodule$motivation_emploitocndixmodule$candidat');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$candidat_motivation_emploitocndixmodule$motivationid', 
'02cd4859-9f65-4609-b04b-ee242442a801', 
'3dbad750-1662-3a89-a213-438a9c05a609');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$candidat_motivation_emploitocndixmodule$candidatid', 
'02cd4859-9f65-4609-b04b-ee242442a801', 
'e8483404-19ec-33f8-8cae-ac28ab17d165');
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
 VALUES ('021f1e17-d4fb-4782-907b-900dae1a59d3', 
'emploiTocndixModule.candidat_cv', 
'emploitocndixmodule$candidat_cv', 
'c45f8571-d586-4a8a-afbf-764f1b2fbe63', 
'5cf903cc-71f2-4cd9-a80c-26e2b813e7f0', 
'emploitocndixmodule$candidatid', 
'emploitocndixmodule$cvid', 
'idx_emploitocndixmodule$candidat_cv_emploitocndixmodule$cv_emploitocndixmodule$candidat');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$cvid', 
'021f1e17-d4fb-4782-907b-900dae1a59d3', 
'e5bfa5af-5015-386d-a39d-ca5577ee0a21');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$candidatid', 
'021f1e17-d4fb-4782-907b-900dae1a59d3', 
'2a9d1c45-fee5-346f-bb02-36c0931ec986');
DELETE FROM "system$filedocument" 
 WHERE "id" IN (SELECT "id"
 FROM "emploitocndixmodule$candidat");
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220201 11:09:54';
