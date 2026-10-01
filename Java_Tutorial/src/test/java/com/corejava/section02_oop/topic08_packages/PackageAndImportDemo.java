package com.corejava.section02_oop.topic08_packages;

// import: use a class from another package, just like "import org.openqa.selenium.By;"
import com.corejava.section02_oop.topic08_packages.helper.MathHelper;

/**
 * Package = a namespace/folder that groups related classes.
 * A real project separates reusable framework code (src/main) from
 * test classes (src/test) and keeps config/data under src/test/resources.
 */
public class PackageAndImportDemo {

    public static void main(String[] args) {
        int sum = MathHelper.add(2, 3); // MathHelper lives in a different package
        System.out.println("MathHelper.add(2, 3) -> " + sum);

        System.out.println();
        System.out.println("Typical framework layout:");
        System.out.println("automation-framework/");
        System.out.println("  pom.xml");
        System.out.println("  src/main/java/com/company/base/BaseTest.java");
        System.out.println("  src/main/java/com/company/pages/LoginPage.java");
        System.out.println("  src/test/java/com/company/tests/ui/LoginTest.java");
        System.out.println("  src/test/resources/config.properties");
    }
}
