DROP INDEX "idx_emploitocndixmodule$offre_canal_emploitocndixmodule$canal_emploitocndixmodule$offre";
ALTER TABLE "emploitocndixmodule$offre_canal" RENAME TO "151424a0ad844618b231d437bfb16b0f";
ALTER TABLE "emploitocndixmodule$offre" DROP COLUMN "date_publication";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'b486de2d-760a-453d-87cb-e9ce86e7d8ce';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = 'cc95874f-c9b1-4153-bd3d-a6f7e2683a9a';
CREATE TABLE "emploitocndixmodule$offre_canal" (
	"id" BIGINT NOT NULL,
	"date_publication" TIMESTAMP NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('a918cb5e-7fa5-4e78-b78f-c60c358d896a', 
'emploiTocndixModule.offre_canal', 
'emploitocndixmodule$offre_canal', 
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
 VALUES ('27de255f-be8f-4b56-80d9-978bd52fa526', 
'a918cb5e-7fa5-4e78-b78f-c60c358d896a', 
'date_publication', 
'date_publication', 
20, 
0, 
'', 
false);
CREATE TABLE "emploitocndixmodule$offre_canal_offre" (
	"emploitocndixmodule$offre_canalid" BIGINT NOT NULL,
	"emploitocndixmodule$offreid" BIGINT NOT NULL,
	PRIMARY KEY("emploitocndixmodule$offre_canalid","emploitocndixmodule$offreid"),
	CONSTRAINT "uniq_emploitocndixmodule$offre_canal_offre_emploitocndixmodule$offre_canalid" UNIQUE ("emploitocndixmodule$offre_canalid"));
CREATE INDEX "idx_emploitocndixmodule$offre_canal_offre_emploitocndixmodule$offre_emploitocndixmodule$offre_canal" ON "emploitocndixmodule$offre_canal_offre" ("emploitocndixmodule$offreid" ASC,"emploitocndixmodule$offre_canalid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('b88e2699-14a3-4289-8c7a-0df9ce9f7ae5', 
'emploiTocndixModule.offre_canal_offre', 
'emploitocndixmodule$offre_canal_offre', 
'a918cb5e-7fa5-4e78-b78f-c60c358d896a', 
'c9122280-260f-45e8-a4e6-d6be2b396912', 
'emploitocndixmodule$offre_canalid', 
'emploitocndixmodule$offreid', 
'idx_emploitocndixmodule$offre_canal_offre_emploitocndixmodule$offre_emploitocndixmodule$offre_canal');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$offre_canal_offre_emploitocndixmodule$offre_canalid', 
'b88e2699-14a3-4289-8c7a-0df9ce9f7ae5', 
'6de8a695-06cf-3347-a652-ca987bc085fd');
CREATE TABLE "emploitocndixmodule$offre_canal_canal" (
	"emploitocndixmodule$offre_canalid" BIGINT NOT NULL,
	"emploitocndixmodule$canalid" BIGINT NOT NULL,
	PRIMARY KEY("emploitocndixmodule$offre_canalid","emploitocndixmodule$canalid"),
	CONSTRAINT "uniq_emploitocndixmodule$offre_canal_canal_emploitocndixmodule$offre_canalid" UNIQUE ("emploitocndixmodule$offre_canalid"));
CREATE INDEX "idx_emploitocndixmodule$offre_canal_canal_emploitocndixmodule$canal_emploitocndixmodule$offre_canal" ON "emploitocndixmodule$offre_canal_canal" ("emploitocndixmodule$canalid" ASC,"emploitocndixmodule$offre_canalid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('f7286fbc-eecb-4be1-b0fb-9be1cc5a3f43', 
'emploiTocndixModule.offre_canal_canal', 
'emploitocndixmodule$offre_canal_canal', 
'a918cb5e-7fa5-4e78-b78f-c60c358d896a', 
'3445f17b-7ef8-4ce8-91a4-6f74914d497e', 
'emploitocndixmodule$offre_canalid', 
'emploitocndixmodule$canalid', 
'idx_emploitocndixmodule$offre_canal_canal_emploitocndixmodule$canal_emploitocndixmodule$offre_canal');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_emploitocndixmodule$offre_canal_canal_emploitocndixmodule$offre_canalid', 
'f7286fbc-eecb-4be1-b0fb-9be1cc5a3f43', 
'6ed00222-6c4b-32b2-8989-c06066cb8cae');
DROP TABLE "151424a0ad844618b231d437bfb16b0f";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220131 16:37:20';
