ALTER TABLE "emploitocndixmodule$offre" ALTER COLUMN "profil_recherche" RENAME TO "experience";
ALTER TABLE "emploitocndixmodule$offre" ADD "niveau_etude" VARCHAR_IGNORECASE(200) NULL;
UPDATE "mendixsystem$attribute"
 SET "entity_id" = 'c9122280-260f-45e8-a4e6-d6be2b396912', 
"attribute_name" = 'experience', 
"column_name" = 'experience', 
"type" = 30, 
"length" = 1000, 
"default_value" = '', 
"is_auto_number" = false
 WHERE "id" = 'b9a4f20e-fc7d-4999-af9d-a6d4410e526a';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('da837f1b-bbab-41cb-8f5f-6da9ec9ec4fe', 
'c9122280-260f-45e8-a4e6-d6be2b396912', 
'niveau_etude', 
'niveau_etude', 
30, 
200, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220201 14:07:00';
