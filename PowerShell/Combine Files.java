$folderPath = "C:\Users\andre\Downloads\Etsy File Folder\Etsy Orders”
$fileNames = @("EtsySoldOrders2020.csv", "EtsySoldOrders2021.csv", "EtsySoldOrders2022.csv", "EtsySoldOrders2023.csv", "EtsySoldOrders2024.csv")
$outputFilePath = "C:\Users\andre\Downloads\Etsy File Folder\Etsy Orders – Combined.csv"
$combinedContent = @()
foreach ($fileName in $fileNames) 
{$filePath = Join-Path -Path $folderPath -ChildPath $fileName
  $fileContent = Import-Csv -Path $filePath
  $combinedContent += $fileContent}
Write-Host "Output file path: $outputFilePath"
$combinedContent | Export-Csv -Path $outputFilePath -NoTypeInformation
Write-Host "CSV files combined successfully. Output file: $outputFilePath"

//
//

$folderPath = "C:\Users\andre\Downloads\Etsy File Folder\Etsy Items”
$fileNames = @("EtsySoldOrderItems2020.csv", "EtsySoldOrderItems2021.csv", "EtsySoldOrderItems2022.csv", "EtsySoldOrderItems2023.csv", "EtsySoldOrderItems2024.csv")
$outputFilePath = "C:\Users\andre\Downloads\Etsy File Folder\Etsy Items – Combined.csv"
$combinedContent = @()
foreach ($fileName in $fileNames) 
{$filePath = Join-Path -Path $folderPath -ChildPath $fileName
  $fileContent = Import-Csv -Path $filePath
  $combinedContent += $fileContent}
Write-Host "Output file path: $outputFilePath"
$combinedContent | Export-Csv -Path $outputFilePath -NoTypeInformation
Write-Host "CSV files combined successfully. Output file: $outputFilePath"

//
//

$folderPath = "C:\Users\andre\Downloads\Etsy File Folder\Etsy Sales”
$fileNames = @("EtsyDirectCheckoutPayments2020.csv", "EtsyDirectCheckoutPayments2021.csv", "EtsyDirectCheckoutPayments2022.csv", "EtsyDirectCheckoutPayments2023.csv", "EtsyDirectCheckoutPayments2024.csv")
$outputFilePath = "C:\Users\andre\Downloads\Etsy File Folder\Etsy Sales – Combined.csv"
$combinedContent = @()
foreach ($fileName in $fileNames) 
{$filePath = Join-Path -Path $folderPath -ChildPath $fileName
  $fileContent = Import-Csv -Path $filePath
  $combinedContent += $fileContent}
Write-Host "Output file path: $outputFilePath"
$combinedContent | Export-Csv -Path $outputFilePath -NoTypeInformation
Write-Host "CSV files combined successfully. Output file: $outputFilePath"

//
//

$folderPath = "C:\Users\andre\Downloads\Etsy File Folder\Ebay”
$fileNames = @("Ebay 2023", "Ebay 2024")
$outputFilePath = "C:\Users\andre\Downloads\Etsy File Folder\eBay - Combined.csv"
$combinedContent = @()
foreach ($fileName in $fileNames) 
{$filePath = Join-Path -Path $folderPath -ChildPath $fileName
  $fileContent = Import-Csv -Path $filePath
  $combinedContent += $fileContent}
Write-Host "Output file path: $outputFilePath"
$combinedContent | Export-Csv -Path $outputFilePath -NoTypeInformation
Write-Host "CSV files combined successfully. Output file: $outputFilePath"
