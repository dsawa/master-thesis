assignmentsControllers.controller('GroupAssignmentsListCtrl', 
    ['$stateParams', '$scope', '$state', 'Group', 'Assignment',
        function ($stateParams, $scope, $state, Group, Assignment) {
            $scope.group = Group.show({id: $stateParams.groupId});
            ...    
        }
    ]);