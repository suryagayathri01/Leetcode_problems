# Write your MySQL query statement below
with exams as(select s.student_id,s.student_name,u.subject_name,count(e.subject_name) as attended_exams from Students s cross join Subjects u left outer join Examinations e on e.subject_name=u.subject_name and s.student_id=e.student_id group by student_id,student_name,u.subject_name order by student_id)

select * from exams;