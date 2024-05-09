create table if not exists set_value_map(
set_value_id Integer not null,
chartingset_value1 varchar(255) null,
creation_date varchar(255) null,
chartingset_value2 varchar(255) null,
charting_value2 varchar(255) null,
chartingset_value3 varchar(255) null,
charting_value3 varchar(255) null,
charting_system varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint set_value_map_pk primary key(set_value_id));