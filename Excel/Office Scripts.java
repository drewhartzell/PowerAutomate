function main(workbook: ExcelScript.Workbook) {
  const tables = workbook.getTables();
  
  for (let table of tables) {
    if (table.hasHeaders()) {
      table.refresh();
    }
  }

  workbook.getApplication().calculateAll(); 
}

// Refresh all connections 

function main(workbook: ExcelScript.Workbook) {
  workbook.refreshAllDataConnections(); 
  workbook.getApplication().calculateAll(); 
}
