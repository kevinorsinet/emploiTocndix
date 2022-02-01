ALTER TABLE "emploitocndixmodule$cv" RENAME TO "0131013cad904cfaab7ae793f544bd13";
ALTER TABLE "emploitocndixmodule$candidat_cv" DROP CONSTRAINT "uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$cvid";
ALTER TABLE "emploitocndixmodule$candidat_cv" DROP CONSTRAINT "uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$candidatid";
DROP INDEX "idx_emploitocndixmodule$candidat_cv_emploitocndixmodule$cv_emploitocndixmodule$candidat";
ALTER TABLE "emploitocndixmodule$candidat_cv" RENAME TO "dc4dd7dfab7e4ccba394f50ff04e3be2";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = 'bfd3a407-0a7e-453e-b052-9a2bfe5378c5';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = 'bfd3a407-0a7e-453e-b052-9a2bfe5378c5';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = 'bfd3a407-0a7e-453e-b052-9a2bfe5378c5');
DELETE FROM "mendixsystem$remote_primary_key" 
 WHERE "entity_id" = 'bfd3a407-0a7e-453e-b052-9a2bfe5378c5';
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = 'bfd3a407-0a7e-453e-b052-9a2bfe5378c5';
UPDATE "mendixsystem$entity"
 SET "entity_name" = 'emploiTocndixModule.candidat', 
"table_name" = 'emploitocndixmodule$candidat', 
"superentity_id" = '170ce49d-f29c-4fac-99a6-b55e8a3aeb39', 
"remote" = false, 
"remote_primary_key" = false
 WHERE "id" = 'c45f8571-d586-4a8a-afbf-764f1b2fbe63';
DELETE FROM "mendixsystem$association" 
 WHERE "id" = '093670f3-cd0e-4734-8c4b-3c5453553e2b';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$cvid' AND "column_id" = 'd35d5cf5-df30-30b7-abdf-8586ee38ffd8';
DELETE FROM "mendixsystem$unique_constraint" 
 WHERE "name" = 'uniq_emploitocndixmodule$candidat_cv_emploitocndixmodule$candidatid' AND "column_id" = '9b366b77-bc87-3039-8f8c-6e20e5483b1e';
DELETE FROM "system$filedocument" 
 WHERE "id" IN (SELECT "id"
 FROM "0131013cad904cfaab7ae793f544bd13");
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
DROP TABLE "0131013cad904cfaab7ae793f544bd13";
DROP TABLE "dc4dd7dfab7e4ccba394f50ff04e3be2";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20220201 10:45:08';
