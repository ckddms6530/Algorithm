SELECT count(*) as COUNT
FROM ECOLI_DATA 
WHERE 
     (GENOTYPE & 2) = 0 
    AND 
     (GENOTYPE & 5) > 0
;

