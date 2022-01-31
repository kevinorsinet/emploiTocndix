// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emploitocndixmodule.proxies;

public class contrat
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject contratMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "emploiTocndixModule.contrat";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		type_contrat("type_contrat");

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

	public contrat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "emploiTocndixModule.contrat"));
	}

	protected contrat(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject contratMendixObject)
	{
		if (contratMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("emploiTocndixModule.contrat", contratMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a emploiTocndixModule.contrat");

		this.contratMendixObject = contratMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'contrat.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emploitocndixmodule.proxies.contrat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emploitocndixmodule.proxies.contrat.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emploitocndixmodule.proxies.contrat initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emploitocndixmodule.proxies.contrat(context, mendixObject);
	}

	public static emploitocndixmodule.proxies.contrat load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emploitocndixmodule.proxies.contrat.initialize(context, mendixObject);
	}

	public static java.util.List<emploitocndixmodule.proxies.contrat> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emploitocndixmodule.proxies.contrat> result = new java.util.ArrayList<emploitocndixmodule.proxies.contrat>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//emploiTocndixModule.contrat" + xpathConstraint))
			result.add(emploitocndixmodule.proxies.contrat.initialize(context, obj));
		return result;
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
	 * @return value of type_contrat
	 */
	public final java.lang.String gettype_contrat()
	{
		return gettype_contrat(getContext());
	}

	/**
	 * @param context
	 * @return value of type_contrat
	 */
	public final java.lang.String gettype_contrat(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.type_contrat.toString());
	}

	/**
	 * Set value of type_contrat
	 * @param type_contrat
	 */
	public final void settype_contrat(java.lang.String type_contrat)
	{
		settype_contrat(getContext(), type_contrat);
	}

	/**
	 * Set value of type_contrat
	 * @param context
	 * @param type_contrat
	 */
	public final void settype_contrat(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String type_contrat)
	{
		getMendixObject().setValue(context, MemberNames.type_contrat.toString(), type_contrat);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return contratMendixObject;
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
			final emploitocndixmodule.proxies.contrat that = (emploitocndixmodule.proxies.contrat) obj;
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
		return "emploiTocndixModule.contrat";
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
