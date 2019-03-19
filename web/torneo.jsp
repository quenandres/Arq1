<html>
<table>
    <tr>
        <td style="text-align:left;" colspan="2"><b>Creacion de Torneos</b></td>
    </tr>
    <tr>
        <td>Id Torneo</td>
        <td><input type="text" name="id_torneo"></td>
    </tr>
    <tr>
        <td>Descripcion Torneo</td>
        <td>
            <textarea name="descripciontorneo"></textarea>
        </td>
    </tr>
</table>


<table>
    <tr>
        <td>Equipos participantes</td>
        <td>
            <!-- Equipos en seelct multiple -->
            <select></select>
        </td>
    </tr>
    <tr>
        <td>Fecha inicio</td>
        <td><input type="date" name="fecha_inicio"></td>
    </tr>
    <tr>
        <td>Fecha fin</td>
        <td><input type="date" name="fecha_fin"></td>
    </tr>
    <tr>
        <td>Torneo fase final</td>
        <td>
            <select name="fase_final">
                <option value="si">Si</option>
                <option value="no">No</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>Id partido</td>
        <td><input type="number" name="id_partido"></td>
    </tr>
    <tr>
        <td>Fecha encuentro</td>
        <td><input type="date" name="fecha_encuentro"></td>
    </tr>
   
</table>

<table>
    <tr>
        <td >Guardar</td>
    </tr>
</table>

</html>