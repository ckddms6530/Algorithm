# SELECT count(*) as COUNT
# FROM ECOLI_DATA 
# WHERE 
#      (GENOTYPE & 2) = 0 
#     AND 
#      (GENOTYPE & 5) > 0
# ;
-- 조건 걸어줄 필요가 없었음 
-- 어차피 where 절에선 0이 아니면 True 기 때문에..
SELECT 
    count(*) as COUNT
FROM 
    ECOLI_DATA 
WHERE 
     NOT GENOTYPE & 2
     AND 
     GENOTYPE & 5
;