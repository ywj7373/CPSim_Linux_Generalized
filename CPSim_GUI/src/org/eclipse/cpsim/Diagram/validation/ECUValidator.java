/**
 *
 * $Id$
 */
package org.eclipse.cpsim.Diagram.validation;

import org.eclipse.cpsim.Diagram.CAN;
import org.eclipse.cpsim.Diagram.SWC;
import org.eclipse.cpsim.Diagram.VirtualCategory;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.cpsim.Diagram.ECU}.
 * This doesn't really do anything, and it's not a real EMF artifact. It was
 * generated by the org.eclipse.emf.examples.generator.validator plug-in to
 * illustrate how EMF's code generator can be extended. This can be disabled
 * with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ECUValidator {
	boolean validate();

	boolean validateSwcRefs(EList<SWC> value);

	boolean validateCanRef(CAN value);

	boolean validateId(String value);

	boolean validateNumberOfCores(int value);

	boolean validateSchedulingPolicy(String value);

	boolean validateSystemClock(int value);

	boolean validateVirtual(VirtualCategory value);

	boolean validateModelName(String value);

	boolean validateTargetArchitecture(String value);
}