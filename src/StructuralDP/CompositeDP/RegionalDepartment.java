package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

   List<Department> childDepartments;

   //butun departmanlari bir degisken uzerinde kontrol etmek icin parametreli const olusturuldu
    public RegionalDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {//firmada olan butun departmanlarin ismini getisin
        return
                childDepartments.
                        stream()//stream yapida departmanlar geliyor
                .map(Department::getName)//stream departman isimlerini getiriyor
                .collect(Collectors.joining(", "));//finance, sales

    }

    @Override
    List<String> getEmployees() {
        return
                childDepartments.
                        stream()
                        .flatMap(d->d.getEmployees().stream()).//akisi degistirdir.
                        collect(Collectors.toList());
    }
}
