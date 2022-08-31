const { app, BrowserWindow } = require('electron');

const createWindow = () => {
    const win = new BrowserWindow({
        width: 800,
        height: 600,
    });
    // win.maximize();
    win.webContents.openDevTools();
    win.setMenu(null);
    win.loadURL('http://localhost:3000/')
    // win.loadFile('../app.asar.unpacked/build/index.html');
};
  
app.whenReady().then(() => {
    createWindow()
});
  
app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') app.quit()
});