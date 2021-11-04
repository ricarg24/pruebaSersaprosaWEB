function eliminar(id) {
	swal({
		title: "Esta seguro de eliminar el registro?",
		text: "una vez eliminado, no se podra recuperar el registro!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarTipo/" + id,
					success : function(res) {
						console.log(res);
					}


				});

				swal("Poof! Your imaginary file has been deleted!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href="/listar"
					}
				});
			} else {
				swal("Your imaginary file is safe!");
			}
		});


}

function eliminarOrigen(id) {
	swal({
		title: "Esta seguro de eliminar el registro?",
		text: "una vez eliminado, no se podra recuperar el registro!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarOrigen/" + id,
					success : function(res) {
						console.log(res);
					}


				});

				swal("Poof! Your imaginary file has been deleted!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href="/listarOrigen"
					}
				});
			} else {
				swal("Your imaginary file is safe!");
			}
		});


}


function eliminarGestion(id) {
	swal({
		title: "Esta seguro de eliminar el registro?",
		text: "una vez eliminado, no se podra recuperar el registro!",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url: "/eliminarGestion/" + id,
					success : function(res) {
						console.log(res);
					}


				});

				swal("Poof! Your imaginary file has been deleted!", {
					icon: "success",
				}).then((ok) => {
					if (ok) {
						location.href="/listargestion"
					}
				});
			} else {
				swal("Your imaginary file is safe!");
			}
		});


}