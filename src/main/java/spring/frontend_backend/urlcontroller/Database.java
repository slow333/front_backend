package spring.frontend_backend.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/database")
public class Database {
  // ==============================================
  // ############## 1장: w3-Mysql #################
  // ==============================================
  @GetMapping("/01-w3/00-mysql-basic")
  public String w3MysqlBasic() {
    return "database/01-w3/00-mysql-basic";
  }

  @GetMapping("/01-w3/01-db-table-handle")
  public String w3Create() {
    return "database/01-w3/01-db-table-handle";
  }

  @GetMapping("/01-w3/02-constraints")
  public String w3constraints() {
    return "database/01-w3/02-constraints";
  }

  @GetMapping("/01-w3/03-select")
  public String w3select() {
    return "database/01-w3/03-select";
  }

  @GetMapping("/01-w3/04-insert-update-delete")
  public String w3InsertUpdateDelete() {
    return "database/01-w3/04-insert-update-delete";
  }
  
  @GetMapping("/01-w3/05-select-search-like-in-between")
  public String w3LikeWildcard() {
    return "database/01-w3/05-select-search-like-in-between";
  }

  @GetMapping("/01-w3/06-aggregate")
  public String w3Aggregate() {
    return "database/01-w3/06-aggregate";
  }

  @GetMapping("/01-w3/07-join")
  public String w3Join() {
    return "database/01-w3/07-join";
  }

  @GetMapping("/01-w3/08-group-by-having")
  public String w3GroupByHaving() {
    return "database/01-w3/08-group-by-having";
  }

  @GetMapping("/01-w3/09-exists-any-all")
  public String w3ExistsAnyAll() {
    return "database/01-w3/09-exists-any-all";
  }

  @GetMapping("/01-w3/10-copy-table-insert-select")
  public String w3CopyTable() {
    return "database/01-w3/10-copy-table-insert-select";
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
