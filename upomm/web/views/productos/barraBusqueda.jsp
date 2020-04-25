<link href="/upomm/css/barraBusqueda.css" rel="stylesheet" type="text/css"/>
<script>
    $(document).ready(function () {
        $("#ordenarResultados select").change(function () {
            $("#ordenarResultados").submit();
        });
    });
</script>
<div class="container-fluid">
    <div class="row mx-auto">
        <div class="col-xl-9 my-auto mx-auto">
            <s:form id='searchForm' cssClass="form-inline md-form mr-auto mb-4" action='buscarProductos' theme="simple">
                <s:select cssClass="form-control" name="categoria" list="categorias" listKey="nombre" listValue="nombre" headerKey="" headerValue="Todas las categor�as">
                </s:select>
                <div class="input-group">
                    <input id='searchBar' type="text" class="form-control" placeholder="Buscar productos" name='busqueda'>
                    <div class="input-group-append">
                        <button class="btn btn-secondary" type="submit">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
            </s:form>
        </div>
        <div class="col-xl-3 my-auto mx-auto ordenacion">
            <form id="ordenarResultados" class="form-inline mr-auto mb-1" method="GET">
                <%--<?php
                if (isset($_GET["categoria"])) {
                    echo "<input type='text' value='" . $_GET["categoria"] . "' name='categoria' hidden>";
                }
                ?>--%>
                <select class="form-control" name="ordenar">
                    <s:if test="%{#ordenar==-1}">
                        <option value="-1" selected>
                    </s:if>
                    <s:else>
                        <option value="-1">
                    </s:else>
                    Ordenar (por defecto)
                    </option>
                    <s:if test="%{#ordenar==0}">
                        <option value="0" selected>
                    </s:if>
                    <s:else>
                        <option value="0">
                    </s:else>
                    Mejor Valorados
                    </option>
                    <s:if test="%{#ordenar==1}">
                        <option value="1" selected>
                    </s:if>
                    <s:else>
                        <option value="1">
                    </s:else>
                    M�s Vendidos
                    </option>
                    <s:if test="%{#ordenar==2}">
                        <option value="2" selected>
                    </s:if>
                    <s:else>
                        <option value="2">
                    </s:else>
                    Novedades
                    </option>
                    <s:if test="%{#ordenar==3}">
                        <option value="3" selected>
                    </s:if>
                    <s:else>
                        <option value="3">
                    </s:else>
                    Precio: ascendente
                    </option>
                    <s:if test="%{#ordenar==4}">
                        <option value="4" selected>
                    </s:if>
                    <s:else>
                        <option value="4">
                    </s:else>
                    Precio: descendente
                    </option>
                </select>
            </form>
        </div>
    </div>
</div>