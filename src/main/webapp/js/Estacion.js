
angular.module('Estacion',[])
        .controller('ctrlEstacion',function($scope,$http){
        console.log('probando el controller de la estacion');
$scope.mensaje='probado el controller de la estacion';

//Vamos a invocar a un servicio json que yo cree

$http.get('http://campitos.elasticbeanstalk.com/estacion/temperatura')
        .success(function(datos){
        $scope.temperatura=datos[21].temperatura;
        $scope.esta=datos;
    })

});


