ALTER TABLE "emploitocndixmodule$cv" DROP COLUMN "cv_nom";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '0e52cc6c-b3f4-4085-a77c-8081c212d682';
ALTER TABLE "emploitocndixmodule$motivation" DROP COLUMN "nom_lettre";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'a7bebcb0-305c-4441-a18b-6b2ff37b5863';
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'emploiTocndixModule.candidat', 
"table_name" = 'emploitocndixmodule$candidat', 
"superentity_id" = '170ce49d-f29c-4fac-99a6-b55e8a3aeb39', 
"remote" = false, 
"remote_primary_key" = false
 WHERE "id" = 'c45f8571-d586-4a8a-afbf-764f1b2fbe63';
INSERT INTO "system$filedocument" ("id", 
"submetaobjectname", 
"fileid", 
"deleteafterdownload", 
"hascontents", 
"size", 
"__filename__")
SELECT "id", 
'emploiTocndixModule.candidat', 
NEXT VALUE FOR "system$filedocument_fileid_mxseq", 
false, 
false, 
-1, 
0
 FROM "emploitocndixmodule$candidat"
 ORDER BY "id" ASC;
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220201 11:39:42';
