select max(num) as num 
from MyNumbers
where num IN (
    select num
    from MyNumbers
    group by num
    Having count(*)=1
    );