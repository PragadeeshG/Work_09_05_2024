create table if not exists charting_approvals(
set_value_id Integer not null,
chart_code Integer null,
sequence_id Integer null,
chart_set_role_id varchar(255) null,
chart_set_group_name varchar(255) null,
chart_set_approval_type_code Integer null,
chart_set_approval_type varchar(255) null,
chart_set_approval_type_desc varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint charting_approvals_pk primary key(set_value_id));