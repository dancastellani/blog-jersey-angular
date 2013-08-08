function PostCtrl($scope, $http) {
    $http.get('../rest/posts').
            success(function(data) {
        $scope.posts = data;
    });
}