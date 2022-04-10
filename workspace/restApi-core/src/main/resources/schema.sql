CREATE TABLE IF NOT EXISTS t_affiliation(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  affiliation VARCHAR(120) NOT NULL
);


CREATE TABLE IF NOT EXISTS t_user(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(254) NOT NULL UNIQUE,
  password VARCHAR(254) NOT NULL,
  first_name VARCHAR(60) NOT NULL,
  last_name VARCHAR(60) NOT NULL,
  first_name_kana VARCHAR(60) NOT NULL,
  last_name_kana VARCHAR(60) NOT NULL,
  affiliation_id BIGINT NOT NULL,
  login_date DATETIME,
  is_first_login  BOOLEAN, 
  delete_flag BOOLEAN,
  INDEX par_ind (affiliation_id),
  FOREIGN KEY (affiliation_id) 
      REFERENCES t_affiliation(id)
      ON DELETE CASCADE
);


CREATE TABLE IF NOT EXISTS t_api(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  api_name VARCHAR(60) NOT NULL UNIQUE,
  api_name_J VARCHAR(60) NOT NULL
);



CREATE TABLE IF NOT EXISTS t_role(
  id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  api_id BIGINT NOT NULL,
  role_name VARCHAR(60) NOT NULL UNIQUE,
  INDEX par_ind (api_id),
  FOREIGN KEY (api_id) 
      REFERENCES t_api(id)
      ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS t_user_role(
  user_id BIGINT NOT NULL,
  api_id BIGINT NOT NULL,
  role_id BIGINT NOT NULL,
  INDEX (user_id),
  INDEX (api_id),
  INDEX (role_id),

  PRIMARY KEY(user_id,api_id,role_id),

  FOREIGN KEY (user_id) 
      REFERENCES t_user(id)
      ON DELETE CASCADE,

  FOREIGN KEY (api_id) 
      REFERENCES t_api(id)
      ON DELETE CASCADE,

  FOREIGN KEY (role_id) 
      REFERENCES t_role(id)
      ON DELETE CASCADE
  
);