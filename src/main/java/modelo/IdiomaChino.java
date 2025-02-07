package modelo;

public class IdiomaChino implements IdiomaMensajes {
    public String getTitulo() { return "=== 图书馆管理系统 ==="; }
    public String getOpcion1() { return "1. 添加书籍"; }
    public String getOpcion2() { return "2. 添加用户"; }
    public String getOpcion3() { return "3. 进行借阅"; }
    public String getOpcion4() { return "4. 生成报告"; }
    public String getOpcion5() { return "5. 退出"; }
    public String getSeleccion() { return "选择一个选项: "; }
    public String getSalida() { return "退出中..."; }
    public String getidUsuario() { return "用户身份";}
    public String getnombreUsuario() { return "用户名";}
    public String getgmailUsuario() { return " Gmail 用户";}
    public String getIdLibro(){ return "图书编号";}
    public String getautorLibro() { return " 作者书" ;}
    public String gettituloLibro() { return "书名";}
    public String getlibroId() { return  "图书编号";}
    public String getusuarioId() { return " 用户身份";}
    public String gettotalPrestamos() { return "总图书数: ";}
    public String gettotalLibros() { return "用户总数: ";}
    public String gettotalUsuarios(){ return "贷款总额: ";}
    public String getreporteBiblioteca() { return  " 图书馆报告";}
    public String getOpcionInvalida() { return "无效选项。请再试一次。"; }
    public String getLibroAgregado() { return "书籍添加成功。"; }
    public String getUsuarioAgregado() { return "用户添加成功。"; }
    public String getPrestamoExitoso() { return "借贷成功。"; }
    public String getPrestamoFallido() { return "无法进行借贷。请检查书籍的可用性和用户的活动借贷。"; }
}
