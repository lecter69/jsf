
package validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Jakub Martin
 */
public class IsTrue implements Validator {
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Boolean && ((Boolean) value).equals(Boolean.FALSE)) {
            throw new ValidatorException(new FacesMessage("error"));
        }
    }
}
