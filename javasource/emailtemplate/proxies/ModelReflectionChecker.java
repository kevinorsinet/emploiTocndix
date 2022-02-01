// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailtemplate.proxies;

public class ModelReflectionChecker
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject modelReflectionCheckerMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmailTemplate.ModelReflectionChecker";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ModelReflectionSynced("ModelReflectionSynced"),
		ModelReflectionChecker_EmailTemplate("EmailTemplate.ModelReflectionChecker_EmailTemplate");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ModelReflectionChecker(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EmailTemplate.ModelReflectionChecker"));
	}

	protected ModelReflectionChecker(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject modelReflectionCheckerMendixObject)
	{
		if (modelReflectionCheckerMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EmailTemplate.ModelReflectionChecker", modelReflectionCheckerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EmailTemplate.ModelReflectionChecker");

		this.modelReflectionCheckerMendixObject = modelReflectionCheckerMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ModelReflectionChecker.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emailtemplate.proxies.ModelReflectionChecker initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emailtemplate.proxies.ModelReflectionChecker.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emailtemplate.proxies.ModelReflectionChecker initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emailtemplate.proxies.ModelReflectionChecker(context, mendixObject);
	}

	public static emailtemplate.proxies.ModelReflectionChecker load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emailtemplate.proxies.ModelReflectionChecker.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ModelReflectionSynced
	 */
	public final java.lang.Boolean getModelReflectionSynced()
	{
		return getModelReflectionSynced(getContext());
	}

	/**
	 * @param context
	 * @return value of ModelReflectionSynced
	 */
	public final java.lang.Boolean getModelReflectionSynced(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.ModelReflectionSynced.toString());
	}

	/**
	 * Set value of ModelReflectionSynced
	 * @param modelreflectionsynced
	 */
	public final void setModelReflectionSynced(java.lang.Boolean modelreflectionsynced)
	{
		setModelReflectionSynced(getContext(), modelreflectionsynced);
	}

	/**
	 * Set value of ModelReflectionSynced
	 * @param context
	 * @param modelreflectionsynced
	 */
	public final void setModelReflectionSynced(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean modelreflectionsynced)
	{
		getMendixObject().setValue(context, MemberNames.ModelReflectionSynced.toString(), modelreflectionsynced);
	}

	/**
	 * @return value of ModelReflectionChecker_EmailTemplate
	 */
	public final emailtemplate.proxies.EmailTemplate getModelReflectionChecker_EmailTemplate() throws com.mendix.core.CoreException
	{
		return getModelReflectionChecker_EmailTemplate(getContext());
	}

	/**
	 * @param context
	 * @return value of ModelReflectionChecker_EmailTemplate
	 */
	public final emailtemplate.proxies.EmailTemplate getModelReflectionChecker_EmailTemplate(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emailtemplate.proxies.EmailTemplate result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ModelReflectionChecker_EmailTemplate.toString());
		if (identifier != null)
			result = emailtemplate.proxies.EmailTemplate.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ModelReflectionChecker_EmailTemplate
	 * @param modelreflectionchecker_emailtemplate
	 */
	public final void setModelReflectionChecker_EmailTemplate(emailtemplate.proxies.EmailTemplate modelreflectionchecker_emailtemplate)
	{
		setModelReflectionChecker_EmailTemplate(getContext(), modelreflectionchecker_emailtemplate);
	}

	/**
	 * Set value of ModelReflectionChecker_EmailTemplate
	 * @param context
	 * @param modelreflectionchecker_emailtemplate
	 */
	public final void setModelReflectionChecker_EmailTemplate(com.mendix.systemwideinterfaces.core.IContext context, emailtemplate.proxies.EmailTemplate modelreflectionchecker_emailtemplate)
	{
		if (modelreflectionchecker_emailtemplate == null)
			getMendixObject().setValue(context, MemberNames.ModelReflectionChecker_EmailTemplate.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ModelReflectionChecker_EmailTemplate.toString(), modelreflectionchecker_emailtemplate.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return modelReflectionCheckerMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final emailtemplate.proxies.ModelReflectionChecker that = (emailtemplate.proxies.ModelReflectionChecker) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "EmailTemplate.ModelReflectionChecker";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
