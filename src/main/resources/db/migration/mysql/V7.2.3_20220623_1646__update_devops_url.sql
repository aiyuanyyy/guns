UPDATE `sys_config` SET `config_value` = concat(config_value, '/guns-devops/**,') WHERE `config_code` = 'SYS_NONE_SECURITY_URLS';