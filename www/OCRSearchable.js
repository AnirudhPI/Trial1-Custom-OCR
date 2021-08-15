var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'OCRSearchable', 'coolMethod', [arg0]);
};

module.exports.capture = function (arg0, success, error) {
    exec(success, error, 'OCRSearchable', 'capture', [arg0]);
};