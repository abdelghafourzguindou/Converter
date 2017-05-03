package WADL;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by l.IsSaM.l on 03/05/2017.
 */
public class Methode {

    protected List<Doc> doc;
    protected List<Response> response;
    protected List<Request> requests;

    protected String id;
    protected HTTPMethods name;



    protected List<Object> any;
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();


    public Methode(String id, HTTPMethods name) {
        this.id = id;
        this.name = name;
    }

    public Methode() {
    }

    public List<Doc> getDoc() {
        return doc;
    }

    public List<Response> getResponse() {
        return response;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public String getId() {
        return id;
    }

    public List<Object> getAny() {
        return any;
    }

    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public void setDoc(List<Doc> doc) {
        this.doc = doc;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAny(List<Object> any) {
        this.any = any;
    }

    public void setOtherAttributes(Map<QName, String> otherAttributes) {
        this.otherAttributes = otherAttributes;
    }

    public HTTPMethods getName() {
        return name;
    }

    public void setName(HTTPMethods name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Methode{" +
                "doc=" + doc +
                ", response=" + response +
                ", requests=" + requests +
                ", id='" + id + '\'' +
                ", name=" + name +
                ", any=" + any +
                ", otherAttributes=" + otherAttributes +
                '}';
    }
}
