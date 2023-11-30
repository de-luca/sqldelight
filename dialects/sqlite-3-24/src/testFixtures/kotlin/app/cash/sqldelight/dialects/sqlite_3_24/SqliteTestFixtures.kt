package app.cash.sqldelight.dialects.sqlite_3_24

import com.alecstrong.sql.psi.test.fixtures.loadFolderFromResources
import com.alecstrong.sql.psi.test.fixtures.toParameter
import java.io.File

object SqliteTestFixtures {
  val fixtures = loadFolderFromResources("fixtures_sqlite_3_24", File("build")).toParameter()
}
