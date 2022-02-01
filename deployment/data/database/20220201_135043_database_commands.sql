ALTER TABLE "emploitocndixmodule$commentaire" RENAME TO "f98332eb50164bf792a397bd536452d5";
ALTER TABLE "emploitocndixmodule$candidat_commentaire" DROP CONSTRAINT "uniq_emploitocndixmodule$candidat_commentaire_emploitocndixmodule$candidatid";
ALTER TABLE "emploitocndixmodule$candidat_commentaire" DROP CONSTRAINT "uniq_emploitocndixmodule$candidat_commentaire_emploitocndixmodule$commentaireid";
DROP INDEX "idx_emploitocndixmodule$candidat_commentaire_emploitocndixmodule$commentaire_emploitocndixmodule$candidat";
ALTER TABLE "emploitocndixmodule$candidat_commentaire" RENAME TO "9d67d0e4ec07474c8e001fc91d0ab899";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '01d3aa94-b656-4ccf-a3aa-98e6d32505da';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '01d3aa94-b656-4ccf-a3aa-98e6d32505da';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '01d3aa94-b656-4ccf-a3aa-98e6d32505da');
DELETE FROM "mendixsystem$remote_primary_key" 
 WHERE "entity_id" = '01d3aa94-b656-4ccf-a3aa-98e6d32505da';
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '01d3aa94-b656-4ccf-a3aa-98e6d32505da';
ALTER TABLE "emploitocndixmodule$candidat" ADD "commentaire" VARCHAR_IGNORECASE(1000) NULL;
ALTER TABLE "emploitocndixmodule$candidat" ADD "avis" VARCHAR_IGNORECASE(13) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('4a352346-963c-4fda-958e-cfeb4d544ab9', 
'c45f8571-d586-4a8a-afbf-764f1b2fbe63', 
'avis', 
'avis', 
40, 
13, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('9ecd49ae-a933-4e8a-bf72-4020ef59732e', 
'c45f8571-d586-4a8a-afbf-764f1b2fbe63', 
'commentaire', 
'commentaire', 
30, 
1000, 
'', 
false);
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '081bbe23-502f-4bd3-ab08-c77a8b3dc7fb';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_emploitocndixmodule$candidat_commentaire_emploitocndixmodule$candidatid' AND "column_id" = 'f5495bdb-9fb7-36e7-bf8c-019ed301e74a';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_emploitocndixmodule$candidat_commentaire_emploitocndixmodule$commentaireid' AND "column_id" = 'df37759c-2ff4-3f1c-8062-f98bbb5755bc';
DROP TABLE "f98332eb50164bf792a397bd536452d5";
DROP TABLE "9d67d0e4ec07474c8e001fc91d0ab899";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220201 13:50:43';
