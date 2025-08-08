$modules = @(
    @{ domain = "controlplane"; layer = "entities" },
    @{ domain = "controlplane"; layer = "dal" },
    @{ domain = "controlplane"; layer = "bll" },
    @{ domain = "training";     layer = "entities" },
    @{ domain = "training";     layer = "dal" },
    @{ domain = "training";     layer = "bll" }
)

$basePackage = "com/skillsharbor/backend"

foreach ($mod in $modules) {
    $domain = $mod.domain
    $layer = $mod.layer

    $modulePath = "$domain/$layer"
    $srcPath = "$modulePath/src/main/java/$basePackage/$domain/$layer"

    New-Item -ItemType Directory -Path $srcPath -Force | Out-Null

    # Optionally, create a dummy Java class
    $className = "$([char]::ToUpper($layer[0]))$($layer.Substring(1))"
    $javaFile = "$srcPath/$className.java"

    Set-Content -Path $javaFile -Value "package com.skillsharbor.backend.$domain.$layer;

public class $className {
    // TODO: implement
}
"
}
