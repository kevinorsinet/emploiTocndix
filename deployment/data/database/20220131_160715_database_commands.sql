ALTER TABLE "emploitocndixmodule$canal" ADD "tarif" DECIMAL(28, 8) NULL;
UPDATE "emploitocndixmodule$canal"
 SET "tarif" = 0;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('6c4c5786-3cf9-41ad-952c-95535100f7c1', 
'3445f17b-7ef8-4ce8-91a4-6f74914d497e', 
'tarif', 
'tarif', 
5, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220131 16:07:15';
