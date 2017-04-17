  
restaurantMenuApp.factory('restaurantFactory',function(){
	
	var factory={};
	
	
	return factory;
}); 

 
restaurantMenuApp.factory('FetchRestaurantInLAN', ['$http', function ($http) {
	var headers = {
			'Access-Control-Allow-Origin' : '*',
			'Access-Control-Allow-Methods' : 'POST, GET, OPTIONS, PUT',
			'Content-Type': 'application/json',
			'Accept': 'application/json'
		};
	var urlBase = 'http://localhost:8080/';
	
    var FetchRestaurantInLAN = {};

   
    FetchRestaurantInLAN.getStudentDetails = function () {
    	alert(" url !! "+urlBase+'School/StudentDetails/getAllStudentDetails');
    	return $http.get(urlBase+'School/StudentDetails/getAllStudentDetails');
    };
   
    FetchRestaurantInLAN.getEmployeeDetails = function () {
    	alert(" url !! "+urlBase+'office/EmployeeDetails/getAllEmployeeDetails');
    	return $http.get(urlBase+'office/EmployeeDetails/getAllEmployeeDetails');
    };
    
    return FetchRestaurantInLAN;
}]);


