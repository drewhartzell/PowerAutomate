function main(workbook: ExcelScript.Workbook) {
  const tables = workbook.getTables();
  
  for (let table of tables) {
    // If it's a linked table (from Power Query, for example)
    if (table.hasHeaders()) {
      table.refresh();
    }
  }

  workbook.getApplication().calculateAll(); // Optional: Recalculate formulas
}

//
// Refresh all connections (auto-refresh tables in Excel workbook)

function main(workbook: ExcelScript.Workbook) {
  workbook.refreshAllDataConnections(); // refresh Power Query connections
  workbook.getApplication().calculateAll(); // recalc formulas
}
