// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package audittrail.actions;

import audittrail.log.CreateLogObject;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;

/**
 * An object is created f entity type 'AuditTrail.Log'.
 * 
 * The new values of this object its members are stored in 'AuditTrail.LogItem' and associated to the created 'AuditTrail.Log' object. 
 * 
 * You need to make sure a referenceSet exists between the Log Entity and the entity you pass into the Java. If there is a referenceSet, the Java will commit all info. 
 * This reference can be a default Reference Owned by Log to your AuditableObject, or a ReferenceSet from AuditableObject to Log, both are supported. 
 * 
 * (If you enable Audit trace logging in the console the java prints which association it uses).
 * 
 * The Log Object that is being returned can be ignored, the Java committed the entity.
 */
public class CreateLogRecordOfObject extends CustomJavaAction<IMendixObject>
{
	private IMendixObject AuditableObject;

	public CreateLogRecordOfObject(IContext context, IMendixObject AuditableObject)
	{
		super(context);
		this.AuditableObject = AuditableObject;
	}

	@Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		IMendixObject logObject = CreateLogObject.CreateAuditLogItems( this.AuditableObject, this.getContext() );
		//The Java Action create auditLogLines commits the LogObject
		
		return logObject;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "CreateLogRecordOfObject";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
