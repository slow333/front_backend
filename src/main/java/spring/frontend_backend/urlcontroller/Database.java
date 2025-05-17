package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/database")
public class Database {
    // =====================================================================================
  // ############### 1장: w3-Mysql #################
  // =====================================================================================
  @GetMapping("/01-w3/00-mysql-basic")
  public String w3MysqlBasic() {
    return "database/01-w3/00-mysql-basic";
  }

  @GetMapping("/01-w3/01-create")
  public String w3Create() {
    return "database/01-w3/01-create";
  }

  @GetMapping("/01-w3/02-select")
  public String w3select() {
    return "database/01-w3/02-select";
  }

  // =====================================================================================
  // ############### 2장: PostgreSQL #################
  // =====================================================================================
  @GetMapping("/02-psql/01-installation")
  public String psqlInstallation() {
    return "database/02-psql/01-installation";
  }

  @GetMapping("/02-psql/02-psql-basic-crud")
  public String psqlBasicCRUD() {
    return "database/02-psql/02-psql-basic-crud";
  }
}
