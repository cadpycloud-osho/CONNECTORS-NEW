Instructions to generate the POJOs for the execute operation

- Update CRM assemblies on generation tool and run it
- Get the exported WSDL
- Run wsdl2java -b binding.xml [exported_wsdl]
- Run collection setter injector tool

Tested with apache-cxf-3.1.5
