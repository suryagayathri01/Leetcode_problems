# Write your MySQL query statement below
with manager as(select managerId,count(managerId) as countM from Employee group by managerId),
idname as(select id,name from Employee)
select i.name from manager m join idname i on m.managerId=i.id where countM>=5;