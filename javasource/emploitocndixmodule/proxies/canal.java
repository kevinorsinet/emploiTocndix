// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emploitocndixmodule.proxies;

public class canal
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject canalMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "emploiTocndixModule.canal";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		nom_canal("nom_canal"),
		tarif("tarif");

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

	public canal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "emploiTocndixModule.canal"));
	}

	protected canal(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject canalMendixObject)
	{
		if (canalMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("emploiTocndixModule.canal", canalMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a emploiTocndixModule.canal");

		this.canalMendixObject = canalMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'canal.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emploitocndixmodule.proxies.canal initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emploitocndixmodule.proxies.canal.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emploitocndixmodule.proxies.canal initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emploitocndixmodule.proxies.canal(context, mendixObject);
	}

	public static emploitocndixmodule.proxies.canal load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emploitocndixmodule.proxies.canal.initialize(context, mendixObject);
	}

	public static java.util.List<emploitocndixmodule.proxies.canal> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emploitocndixmodule.proxies.canal> result = new java.util.ArrayList<emploitocndixmodule.proxies.canal>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//emploiTocndixModule.canal" + xpathConstraint))
			result.add(emploitocndixmodule.proxies.canal.initialize(context, obj));
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
	 * @return value of nom_canal
	 */
	public final java.lang.String getnom_canal()
	{
		return getnom_canal(getContext());
	}

	/**
	 * @param context
	 * @return value of nom_canal
	 */
	public final java.lang.String getnom_canal(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nom_canal.toString());
	}

	/**
	 * Set value of nom_canal
	 * @param nom_canal
	 */
	public final void setnom_canal(java.lang.String nom_canal)
	{
		setnom_canal(getContext(), nom_canal);
	}

	/**
	 * Set value of nom_canal
	 * @param context
	 * @param nom_canal
	 */
	public final void setnom_canal(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nom_canal)
	{
		getMendixObject().setValue(context, MemberNames.nom_canal.toString(), nom_canal);
	}

	/**
	 * @return value of tarif
	 */
	public final java.math.BigDecimal gettarif()
	{
		return gettarif(getContext());
	}

	/**
	 * @param context
	 * @return value of tarif
	 */
	public final java.math.BigDecimal gettarif(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.tarif.toString());
	}

	/**
	 * Set value of tarif
	 * @param tarif
	 */
	public final void settarif(java.math.BigDecimal tarif)
	{
		settarif(getContext(), tarif);
	}

	/**
	 * Set value of tarif
	 * @param context
	 * @param tarif
	 */
	public final void settarif(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal tarif)
	{
		getMendixObject().setValue(context, MemberNames.tarif.toString(), tarif);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return canalMendixObject;
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
			final emploitocndixmodule.proxies.canal that = (emploitocndixmodule.proxies.canal) obj;
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
		return "emploiTocndixModule.canal";
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
