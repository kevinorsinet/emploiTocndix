// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emploitocndixmodule.proxies;

public class candidats
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject candidatsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "emploiTocndixModule.candidats";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		nb_candidats("nb_candidats");

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

	public candidats(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "emploiTocndixModule.candidats"));
	}

	protected candidats(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject candidatsMendixObject)
	{
		if (candidatsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("emploiTocndixModule.candidats", candidatsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a emploiTocndixModule.candidats");

		this.candidatsMendixObject = candidatsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'candidats.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emploitocndixmodule.proxies.candidats initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emploitocndixmodule.proxies.candidats.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emploitocndixmodule.proxies.candidats initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emploitocndixmodule.proxies.candidats(context, mendixObject);
	}

	public static emploitocndixmodule.proxies.candidats load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emploitocndixmodule.proxies.candidats.initialize(context, mendixObject);
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
	 * @return value of nb_candidats
	 */
	public final java.lang.Integer getnb_candidats()
	{
		return getnb_candidats(getContext());
	}

	/**
	 * @param context
	 * @return value of nb_candidats
	 */
	public final java.lang.Integer getnb_candidats(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.nb_candidats.toString());
	}

	/**
	 * Set value of nb_candidats
	 * @param nb_candidats
	 */
	public final void setnb_candidats(java.lang.Integer nb_candidats)
	{
		setnb_candidats(getContext(), nb_candidats);
	}

	/**
	 * Set value of nb_candidats
	 * @param context
	 * @param nb_candidats
	 */
	public final void setnb_candidats(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer nb_candidats)
	{
		getMendixObject().setValue(context, MemberNames.nb_candidats.toString(), nb_candidats);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return candidatsMendixObject;
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
			final emploitocndixmodule.proxies.candidats that = (emploitocndixmodule.proxies.candidats) obj;
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
		return "emploiTocndixModule.candidats";
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
