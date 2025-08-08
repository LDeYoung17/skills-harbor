$modules = @(
    @{ domain = "controlplane"; layer = "entities" },
    @{ domain = "controlplane"; layer = "dal" },
    @{ domain = "controlplane"; layer = "bll" },
    @{ domain = "training";     layer = "entities" },
    @{ domain = "training";     layer = "dal" },
    @{ domain = "training";     layer = "bll" }
)

$baseTestPath = "src/test/java/com/skillsharbor/backend"

foreach ($mod in $modules) {
    $domain = $mod.domain
    $layer = $mod.layer

    $testPath = "$domain/$layer/$baseTestPath/$domain/$layer"
    New-Item -ItemType Directory -Path $testPath -Force | Out-Null

    # Optional: create placeholder test class
    $className = "$([char]::ToUpper($layer[0]))$($layer.Substring(1))Test"
    $testFile = "$testPath/$className.java"

    Set-Content -Path $testFile -Value "package com.skillsharbor.backend.$domain.$layer;

import org.junit.jupiter.api.Test;

public class $className {

    @Test
    void placeholderTest() {
        // TODO: Replace with real tests
    }
}
"
}
