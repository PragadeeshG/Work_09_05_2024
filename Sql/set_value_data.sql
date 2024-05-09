create table if not exists set_value_data(
set_value_set_id Integer not null,
set_description varchar(255) null,
charting_table_name varchar(255) null,
start_date varchar(255) null,
end_date varchar(255) null,
record_created char null,
record_modified char null,
record_deleted char null,
action_source varchar(255) null,
process_name varchar(255) null,
process_id Integer null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint set_value_data_pk primary key(set_value_set_id));