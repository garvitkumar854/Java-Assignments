@echo off
setlocal enabledelayedexpansion

:MENU
cls
echo ============================================
echo       Java Assignment Runner
echo ============================================
echo.
echo 1. Run a single assignment
echo 2. Run multiple assignments (comma-separated)
echo 3. Run all assignments
echo 4. Exit
echo.
set /p choice="Enter your choice (1-4): "

if "%choice%"=="1" goto SINGLE
if "%choice%"=="2" goto MULTIPLE
if "%choice%"=="3" goto ALL
if "%choice%"=="4" goto EXIT
echo Invalid choice! Press any key to try again...
pause >nul
goto MENU

:SINGLE
cls
echo ============================================
echo       Run Single Assignment
echo ============================================
echo.
set /p num="Enter assignment number (1-51 or 0 to go back): "
if "%num%"=="0" goto MENU
call :RUN_ASSIGNMENT %num%
echo.
echo Press any key to return to menu (or Ctrl+C to exit)...
pause >nul
goto MENU

:MULTIPLE
cls
echo ============================================
echo       Run Multiple Assignments
echo ============================================
echo.
echo Enter assignment numbers separated by commas
echo Example: 1,5,10,15
echo (Enter 0 to go back to menu)
echo.
set /p nums="Assignment numbers: "
if "%nums%"=="0" goto MENU

set count=0
set total=0
for %%a in (%nums%) do set /a total+=1

for %%a in (%nums%) do (
    set /a count+=1
    call :RUN_ASSIGNMENT %%a
    echo.
    if !count! LSS %total% (
        set /p continue="Continue to next assignment? (Y/N or Ctrl+C to exit): "
        call :CHECK_CONTINUE "!continue!"
        if !CONTINUE_RESULT!==0 goto MENU
    ) else (
        echo [INFO] Last Assignment completed!
    )
)
echo.
echo All selected assignments processed.
echo Press any key to return to menu...
pause >nul
goto MENU

:ALL
cls
echo ============================================
echo       Run All Assignments
echo ============================================
echo.
set /p confirm="This will run all 51 assignments. Continue? (Y/N): "
call :CHECK_CONTINUE "%confirm%"
if !CONTINUE_RESULT!==0 goto MENU

for /L %%i in (1,1,51) do (
    call :RUN_ASSIGNMENT %%i
    echo.
    if %%i LSS 51 (
        set /p continue="Continue to next assignment? (Y/N or Ctrl+C to exit): "
        call :CHECK_CONTINUE "!continue!"
        if !CONTINUE_RESULT!==0 goto MENU
    ) else (
        echo [INFO] Last Assignment completed!
    )
)
echo.
echo All assignments processed.
echo Press any key to return to menu...
pause >nul
goto MENU

:RUN_ASSIGNMENT
set num=%1
if %num% LSS 10 (
    set padded=0%num%
) else (
    set padded=%num%
)
set filename=Assignment%padded%.java
set classname=Assignment%padded%

if not exist "%filename%" (
    echo [ERROR] %filename% not found!
    goto :EOF
)

echo ============================================
echo Compiling %filename%
echo ============================================
javac "%filename%" 2>nul
if errorlevel 1 (
    echo [ERROR] Compilation failed for %filename%
    javac "%filename%"
    goto :EOF
)

echo [SUCCESS] Compilation successful
echo.
echo ============================================
echo Running %classname%
echo ============================================
java %classname%
echo.
echo [DONE] %classname% execution completed
echo Cleaning up %classname%.class...
del "%classname%.class" 2>nul
goto :EOF

:CHECK_CONTINUE
set input=%~1
set CONTINUE_RESULT=0

REM Check for YES variations
if /i "%input%"=="Y" set CONTINUE_RESULT=1
if /i "%input%"=="y" set CONTINUE_RESULT=1
if /i "%input%"=="yes" set CONTINUE_RESULT=1
if /i "%input%"=="Yes" set CONTINUE_RESULT=1
if /i "%input%"=="YES" set CONTINUE_RESULT=1

REM Check for NO variations (already defaults to 0)
if /i "%input%"=="N" set CONTINUE_RESULT=0
if /i "%input%"=="n" set CONTINUE_RESULT=0
if /i "%input%"=="no" set CONTINUE_RESULT=0
if /i "%input%"=="No" set CONTINUE_RESULT=0
if /i "%input%"=="NO" set CONTINUE_RESULT=0

goto :EOF

:EXIT
cls
echo Goodbye!
timeout /t 1 >nul
exit /b