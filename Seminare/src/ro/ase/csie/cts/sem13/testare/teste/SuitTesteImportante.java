package ro.ase.csie.cts.sem13.testare.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({SuitTesteImportante.class})
@SuiteClasses({ TestStudent.class, TestStudentAlteTeste.class })
public class SuitTesteImportante {

}
