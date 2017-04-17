
controllers.MainController = function($scope, FetchRestaurantInLAN,
		restaurantFactory) {

	$scope.getStudentDetails = function() {
		alert("in getStudentDetails ");
		FetchRestaurantInLAN.getStudentDetails().
		success(function(users) {
			alert("Success ");
			$scope.users = users;
			
		}).
		error(function(error) {
			alert("Unable to load customer data: " + error);
			$scope.dataLoading = false;
		});
	}
	$scope.getEmployeeDetails = function() {
		alert("in getemployeeDetails ");
		FetchRestaurantInLAN.getEmployeeDetails().
		success(function(jsonemp) {
			alert("Success ");
			$scope.scopejsonemp = jsonemp;
			
		}).
		error(function(error) {
			alert("Unable to load customer data: " + error);
			$scope.dataLoading = false;
		});
	}
}
restaurantMenuApp.controller(controllers);
