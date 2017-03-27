package ee.ttu.idu0080.hinnakiri.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import ee.ttu.idu0080.hinnakiri.exceptions.*;

/**
 * This class was generated by Apache CXF 2.2.6
 * Thu Mar 04 20:52:32 EET 2010
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "http://www.ttu.ee/idu0080/hinnakiri/wsdl/1.0", name = "HinnakiriService")
@XmlSeeAlso({ee.ttu.idu0080.hinnakiri.types.ObjectFactory.class,
	HinnakiriNegNumberFormatFault.class,
	HinnakiriPrecisionFormatFault.class,
	HinnakiriZeroNumberFormatFault.class,
	HinnakiriNumberFormatFault.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface HinnakiriService {

    @WebResult(name = "getHinnakiriResponse", targetNamespace = "http://www.ttu.ee/idu0080/hinnakiri/1.0", partName = "parameters")
    @WebMethod
    public ee.ttu.idu0080.hinnakiri.types.GetHinnakiriResponse getHinnakiri(
        @WebParam(partName = "parameters", name = "getHinnakiri", targetNamespace = "http://www.ttu.ee/idu0080/hinnakiri/1.0")
        java.lang.String parameters) 
    throws HinnakiriNumberFormatException, HinnakiriNegNumberFormatException, HinnakiriPrecisionFormatException, HinnakiriZeroNumberFormatException;
}
