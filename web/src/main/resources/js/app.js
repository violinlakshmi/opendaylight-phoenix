// Filename: app.js

define([
  // These are path alias that we configured in our bootstrap
  'jquery',     // lib/jquery/jquery
  'underscore', // lib/underscore/underscore
  'backbone',    // lib/backbone/backbone
  'views/FlowsListView'
], function($, _, Backbone, FlowsListView){
  var initialize = function() {
    //var deviceView = new DeviceView(); // this calls initialize which in turn calls render
    var flowsListView = new FlowsListView(); // this calls initialize which in turn calls render
  }

  return {
    initialize : initialize
  };
});
