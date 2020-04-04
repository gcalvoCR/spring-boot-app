$(document).ready( function () {
	 var table = $('#suministrosTable').DataTable({
			"sAjaxSource": "/suministros",
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
			    { "mData": "nombre" },
				{ "mData": "gradocalidad" },
				{ "mData": "cantidad" },
				{ "mData": "bodega" },
				{ "mData": "cantidadcaja" },
				{ "mData": "createdAsShort" }
			]
	 })
});