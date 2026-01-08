@echo off
for %%f in (Assignment*.java) do (
    echo ============================================
    echo Compiling %%f
    javac %%f
    if errorlevel 1 (
        echo Error in %%f
    ) else (
        echo Running %%~nf
        java %%~nf
    )
    echo.   REM <-- this adds a blank line (space)
)
echo ============================================
echo All assignments processed.