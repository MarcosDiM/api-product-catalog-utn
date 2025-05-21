package com.example.parcialProgramacion;

import com.example.parcialProgramacion.entities.*;
import com.example.parcialProgramacion.entities.enums.*;
import com.example.parcialProgramacion.repositories.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class parcialProgramacion {
    @Autowired
    private ImagenRepository imagenRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private EmpleadoRepository empleadoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PaisRepository paisRepository;
    @Autowired
    private ProvinciaRepository provinciaRepository;
    @Autowired
    private LocalidadRepository localidadRepository;
    @Autowired
    private DomicilioRepository domicilioRepository;
    @Autowired
    private EmpresaRepository empresaRepository;
    @Autowired
    private SucursalRepository sucursalRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private PromocionRepository promocionRepository;
    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;
    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;
    @Autowired
    private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;
    @Autowired
    private PromocionDetalleRepository promocionDetalleRepository;
    @Autowired
    private FacturaRepository facturaRepository;



    public static void main(String[] args) {
        SpringApplication.run(parcialProgramacion.class, args);
        System.out.println("Inicio programa");
    }

    @Bean
    @Transactional
    CommandLineRunner init(ImagenRepository imagenRepository,
                           UsuarioRepository usuarioRepository,
                           EmpleadoRepository empleadoRepository,
                           ClienteRepository clienteRepository,
                           PaisRepository paisRepository,
                           ProvinciaRepository provinciaRepository,
                           LocalidadRepository localidadRepository,
                           DomicilioRepository domicilioRepository,
                           EmpresaRepository empresaRepository,
                           SucursalRepository sucursalRepository,
                           PedidoRepository pedidoRepository,
                           DetallePedidoRepository detallePedidoRepository,
                           CategoriaRepository categoriaRepository,
                           PromocionRepository promocionRepository,
                           UnidadMedidaRepository unidadMedidaRepository,
                           ArticuloInsumoRepository articuloInsumoRepository,
                           ArticuloManufacturadoRepository articuloManufacturadoRepository,
                           ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository,
                           PromocionDetalleRepository promocionDetalleRepository,
                           FacturaRepository facturaRepository){
        return args -> {

            // Instanciadas y relacionadas clases Pais, Provincia, Localidad y Domicilio

            Pais pais1 = Pais.builder()
                    .nombre("Argentina")
                    .build();
            paisRepository.save(pais1);

            Provincia provincia1 = Provincia.builder()
                    .nombre("Mendoza")
                    .pais(pais1)
                    .build();
            provinciaRepository.save(provincia1);

            Localidad localidad1 = Localidad.builder()
                    .nombre("Lujan de Cuyo")
                    .provincia(provincia1)
                    .build();
            localidadRepository.save(localidad1);

            Localidad localidad2 = Localidad.builder()
                    .nombre("Godoy Cruz")
                    .provincia(provincia1)
                    .build();
            localidadRepository.save(localidad2);

            Domicilio domicilio1 = Domicilio.builder()
                    .calle("Francia")
                    .numero(430)
                    .cp(5505)
                    .localidad(localidad1)
                    .build();
            domicilioRepository.save(domicilio1);

            Domicilio domicilio2 = Domicilio.builder()
                    .calle("Panamericana")
                    .numero(289)
                    .cp(5409)
                    .localidad(localidad2)
                    .build();
            domicilioRepository.save(domicilio2);


            // Instanciadas y relacionadas las clases Empresa, Sucursal

            Empresa empresa1 = Empresa.builder()
                    .razonSocial("Musimundo S.A")
                    .nombre("Musimundo")
                    .cuil(2065465467)
                    .build();
            empresaRepository.save(empresa1);

            Sucursal sucursal1 = Sucursal.builder()
                    .nombre("Sucursal Lujan De Cuyo")
                    .casaMatriz(Boolean.FALSE)
                    .domicilio(domicilio1)
                    .horarioApertura(LocalTime.of(8,30))
                    .horarioCierre(LocalTime.of(20,30))
                    .empresa(empresa1)
                    .build();
            sucursalRepository.save(sucursal1);

            Sucursal sucursal2 = Sucursal.builder()
                    .nombre("Sucursal Palmares")
                    .casaMatriz(Boolean.TRUE)
                    .domicilio(domicilio2)
                    .horarioApertura(LocalTime.of(8,30))
                    .horarioCierre(LocalTime.of(21,30))
                    .empresa(empresa1)
                    .build();
            sucursalRepository.save(sucursal2);


            // Instancias y relaciones de las clases Promocion y ImagenPromocion

            Imagen imgPromomocion1 = Imagen.builder()
                    .denominacion("Imangen proM1")
                    .build();
            imagenRepository.save(imgPromomocion1);


            Promocion prom1 = Promocion.builder()
                    .denominacion("Promocion Telefonos")
                    .descripcionDescuento("10% de descuento")
                    .fechaDesde(LocalDate.of(2024,05,31))
                    .fechaHasta(LocalDate.of(2024, 06, 30))
                    .horaDesde(LocalTime.of(00,00))
                    .horaHasta(LocalTime.of(23,59))
                    .precioPromocional(49999.9)
                    .tipoPromocion(TipoPromocion.HAPPYHOUR)
                    .build();
            prom1.getImagenesPromocion().add(imgPromomocion1);
            promocionRepository.save(prom1);


            Imagen imgProm2 = Imagen.builder()
                    .denominacion("Imangen prom2")
                    .build();
            imagenRepository.save(imgProm2);

            sucursal1.getPromociones().add(prom1);

            sucursalRepository.save(sucursal1);

            //Instanciada clase Categoria y relaciones

            Categoria categoria1 = Categoria.builder()
                    .denominacion("Tecnologia")
                    .build();
            categoriaRepository.save(categoria1);

            Categoria subCategoria1 = Categoria.builder()
                    .denominacion("Telefonos")
                    .categoriaPadre(categoria1)
                    .build();
            categoriaRepository.save(subCategoria1);

            Categoria subCategoria2 = Categoria.builder()
                    .denominacion("Televisores")
                    .categoriaPadre(categoria1)
                    .build();
            categoriaRepository.save(subCategoria2);

            categoria1.getSubcategorias().add(subCategoria1);
            categoria1.getSubcategorias().add(subCategoria2);
            categoriaRepository.save(categoria1);

            sucursal1.getCategorias().add(categoria1);
            //sucursalRepository.save(sucursal1);



            // Instanciadas y relacionadas las clases Articulo, ArticuloInsumo, ArticuloManufacturado, ArticuloManufacturadoDetalle, Promocion Detalle, UnidadMedida y ImagenArticulo

            Imagen imagenArticuloInsumo1 = Imagen.builder()
                    .denominacion("Imagen articulo insumo")
                    .build();
            imagenRepository.save(imagenArticuloInsumo1);


            UnidadMedida unMedida = UnidadMedida.builder()
                    .denominacion("Unidad de medida 1")
                    .build();
            unidadMedidaRepository.save(unMedida);

            ArticuloInsumo articuloInsumo1 = ArticuloInsumo.builder()
                    .denominacion("Pantalla telefono")
                    .precioVenta(150.0)
                    .precioCompra(299.9)
                    .stockActual(14)
                    .stockMaximo(30)
                    .esParaElaborar(Boolean.TRUE)
                    .categoria(subCategoria1)
                    .unidadMedida(unMedida)
                    .build();
            articuloInsumo1.getImagenesArticulos().add(imagenArticuloInsumo1);
            articuloInsumoRepository.save(articuloInsumo1);

            Imagen imagenArticuloManufacturado1 = Imagen.builder()
                    .denominacion("Imagen Telefono Samsung A35")
                    .build();
            imagenRepository.save(imagenArticuloManufacturado1);

            ArticuloManufacturado articuloManufacturado1 = ArticuloManufacturado.builder()
                    .denominacion("Telefono Samsung")
                    .categoria(subCategoria1)
                    .precioVenta(1049.9)
                    .descripcion("Smartphone Samsung A35 128g 8RAM")
                    .tiempoEstimadoMinutos(400)
                    .preparacion("Preparacion: colocar pantalla")
                    .unidadMedida(unMedida)
                    .build();
            articuloManufacturado1.getImagenesArticulos().add(imagenArticuloManufacturado1);
            articuloManufacturadoRepository.save(articuloManufacturado1);

            ArticuloManufacturadoDetalle artManufDetalle1 = ArticuloManufacturadoDetalle.builder()
                    .cantidad(10)
                    .articuloInsumo(articuloInsumo1)
                    .articuloManufacturado(articuloManufacturado1)
                    .build();
            articuloManufacturadoDetalleRepository.save(artManufDetalle1);

            Imagen imagenArticuloManufacturado2 = Imagen.builder()
                    .denominacion("Imagen TV LG")
                    .build();
            imagenRepository.save(imagenArticuloManufacturado2);

            ArticuloManufacturado articuloManufacturado2 = ArticuloManufacturado.builder()
                    .denominacion("Televisor LG")
                    .categoria(subCategoria2)
                    .precioVenta(3000.0)
                    .descripcion("SmartTV LG 55' 4K")
                    .tiempoEstimadoMinutos(400)
                    .unidadMedida(unMedida)
                    .build();
            articuloManufacturado1.getImagenesArticulos().add(imagenArticuloManufacturado2);
            articuloManufacturadoRepository.save(articuloManufacturado2);

            ArticuloManufacturadoDetalle artManufDetalle2 = ArticuloManufacturadoDetalle.builder()
                    .cantidad(5)
                    .articuloManufacturado(articuloManufacturado2)
                    .build();
            articuloManufacturadoDetalleRepository.save(artManufDetalle2);


            //Insaciada Promocion detalle

            PromocionDetalle promocion1Detalle = PromocionDetalle.builder()
                    .cantidad(20)
                    .promocion(prom1)
                    .articulo(articuloManufacturado1)
                    .build();
            promocionDetalleRepository.save(promocion1Detalle);


            //Instanciadas clase Empleado y relaciones

            Imagen imgEmpleado1 = Imagen.builder()
                    .denominacion("Imangen Empleado 1")
                    .build();
            imagenRepository.save(imgEmpleado1);

            Usuario usuarioEmpleado1 = Usuario.builder()
                    .auth0Id("hpksd234")
                    .userName("juanCarlos3")
                    .build();
            usuarioRepository.save(usuarioEmpleado1);

            Empleado empleado1 = Empleado.builder()
                    .sucursal(sucursal1)
                    .build();
            empleado1.setNombre("Juan Carlos");
            empleado1.setApellido("Perez");
            empleado1.setTelefono("261486545");
            empleado1.setEmail("juanca1998@gmail.com");
            empleado1.setFechaNacimiento(LocalDate.of(1998,06,15));
            empleado1.setImagenPersona(imgEmpleado1);
            empleado1.setUsuario(usuarioEmpleado1);
            empleado1.setRol(Rol.CAJERO);
            empleadoRepository.save(empleado1);

            //Instanciadas Clase Cliente y relaciones

            Imagen imgCliente1 = Imagen.builder()
                    .denominacion("Imangen Cliente 1")
                    .build();
            imagenRepository.save(imgCliente1);

            Usuario usuarioCliente1 = Usuario.builder()
                    .auth0Id("1234667")
                    .userName("marcosDm")
                    .build();
            usuarioRepository.save(usuarioCliente1);


            Cliente cliente1 = Cliente.builder().build();
                    cliente1.setNombre("Marcos");
                    cliente1.setApellido("Di Meco");
                    cliente1.setTelefono("2613455496");
                    cliente1.setEmail("marcosdimecom@gmail.com");
                    cliente1.setFechaNacimiento(LocalDate.of(2002,05,30));
                    cliente1.setImagenPersona(imgCliente1);
                    cliente1.setUsuario(usuarioCliente1);
                    cliente1.setRol(Rol.CLIENTE);
                    cliente1.getDomicilios().add(domicilio1);
                    cliente1.getDomicilios().add(domicilio2);
            clienteRepository.save(cliente1);


            // Instanciadas clase Pedido, DetallePedido y Factura

            Pedido pedido1 = Pedido.builder()
                    .fechaPedido(LocalDate.of(2024,06,9))
                    .sucursal(sucursal1).cliente(cliente1)
                    .empleado(empleado1).total(200.0)
                    .estado(Estado.PENDIENTE)
                    .formaPago(FormaPago.EFECTIVO)
                    .horaEstimadaFinalizacion(LocalTime.of(8,23))
                    .tipoEnvio(TipoEnvio.DELIVERY)
                    .totalCosto(200.0)
                    .build();
            pedidoRepository.save(pedido1);

            DetallePedido detPedido1 = DetallePedido.builder()
                    .pedido(pedido1)
                    .cantidad(2)
                    .subTotal(950.9)
                    .build();
            detallePedidoRepository.save(detPedido1);

            DetallePedido detPedido2 = DetallePedido.builder()
                    .pedido(pedido1)
                    .cantidad(2)
                    .subTotal(300.0)
                    .build();
            detallePedidoRepository.save(detPedido2);

            Factura factura1 = Factura.builder()
                    .fechaFacturacion(LocalDate.of(2024,06,9))
                    .formaPago(FormaPago.EFECTIVO)
                    .totalVenta(1100)
                    .pedido(pedido1)
                    .build();
            facturaRepository.save(factura1);
        };
    }
}
