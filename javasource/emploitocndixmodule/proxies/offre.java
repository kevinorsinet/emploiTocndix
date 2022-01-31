// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emploitocndixmodule.proxies;

public class offre
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject offreMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "emploiTocndixModule.offre";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		nom_poste("nom_poste"),
		description_mission("description_mission"),
		salaire_mini("salaire_mini"),
		salaire_max("salaire_max"),
		profil_recherche("profil_recherche"),
		heures("heures"),
		offre_contrat("emploiTocndixModule.offre_contrat"),
		offre_site("emploiTocndixModule.offre_site");

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

	public offre(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "emploiTocndixModule.offre"));
	}

	protected offre(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject offreMendixObject)
	{
		if (offreMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("emploiTocndixModule.offre", offreMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a emploiTocndixModule.offre");

		this.offreMendixObject = offreMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'offre.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emploitocndixmodule.proxies.offre initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emploitocndixmodule.proxies.offre.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emploitocndixmodule.proxies.offre initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emploitocndixmodule.proxies.offre(context, mendixObject);
	}

	public static emploitocndixmodule.proxies.offre load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emploitocndixmodule.proxies.offre.initialize(context, mendixObject);
	}

	public static java.util.List<emploitocndixmodule.proxies.offre> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<emploitocndixmodule.proxies.offre> result = new java.util.ArrayList<emploitocndixmodule.proxies.offre>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//emploiTocndixModule.offre" + xpathConstraint))
			result.add(emploitocndixmodule.proxies.offre.initialize(context, obj));
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
	 * @return value of nom_poste
	 */
	public final java.lang.String getnom_poste()
	{
		return getnom_poste(getContext());
	}

	/**
	 * @param context
	 * @return value of nom_poste
	 */
	public final java.lang.String getnom_poste(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.nom_poste.toString());
	}

	/**
	 * Set value of nom_poste
	 * @param nom_poste
	 */
	public final void setnom_poste(java.lang.String nom_poste)
	{
		setnom_poste(getContext(), nom_poste);
	}

	/**
	 * Set value of nom_poste
	 * @param context
	 * @param nom_poste
	 */
	public final void setnom_poste(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nom_poste)
	{
		getMendixObject().setValue(context, MemberNames.nom_poste.toString(), nom_poste);
	}

	/**
	 * @return value of description_mission
	 */
	public final java.lang.String getdescription_mission()
	{
		return getdescription_mission(getContext());
	}

	/**
	 * @param context
	 * @return value of description_mission
	 */
	public final java.lang.String getdescription_mission(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.description_mission.toString());
	}

	/**
	 * Set value of description_mission
	 * @param description_mission
	 */
	public final void setdescription_mission(java.lang.String description_mission)
	{
		setdescription_mission(getContext(), description_mission);
	}

	/**
	 * Set value of description_mission
	 * @param context
	 * @param description_mission
	 */
	public final void setdescription_mission(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description_mission)
	{
		getMendixObject().setValue(context, MemberNames.description_mission.toString(), description_mission);
	}

	/**
	 * @return value of salaire_mini
	 */
	public final java.math.BigDecimal getsalaire_mini()
	{
		return getsalaire_mini(getContext());
	}

	/**
	 * @param context
	 * @return value of salaire_mini
	 */
	public final java.math.BigDecimal getsalaire_mini(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.salaire_mini.toString());
	}

	/**
	 * Set value of salaire_mini
	 * @param salaire_mini
	 */
	public final void setsalaire_mini(java.math.BigDecimal salaire_mini)
	{
		setsalaire_mini(getContext(), salaire_mini);
	}

	/**
	 * Set value of salaire_mini
	 * @param context
	 * @param salaire_mini
	 */
	public final void setsalaire_mini(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal salaire_mini)
	{
		getMendixObject().setValue(context, MemberNames.salaire_mini.toString(), salaire_mini);
	}

	/**
	 * @return value of salaire_max
	 */
	public final java.math.BigDecimal getsalaire_max()
	{
		return getsalaire_max(getContext());
	}

	/**
	 * @param context
	 * @return value of salaire_max
	 */
	public final java.math.BigDecimal getsalaire_max(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.salaire_max.toString());
	}

	/**
	 * Set value of salaire_max
	 * @param salaire_max
	 */
	public final void setsalaire_max(java.math.BigDecimal salaire_max)
	{
		setsalaire_max(getContext(), salaire_max);
	}

	/**
	 * Set value of salaire_max
	 * @param context
	 * @param salaire_max
	 */
	public final void setsalaire_max(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal salaire_max)
	{
		getMendixObject().setValue(context, MemberNames.salaire_max.toString(), salaire_max);
	}

	/**
	 * @return value of profil_recherche
	 */
	public final java.lang.String getprofil_recherche()
	{
		return getprofil_recherche(getContext());
	}

	/**
	 * @param context
	 * @return value of profil_recherche
	 */
	public final java.lang.String getprofil_recherche(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.profil_recherche.toString());
	}

	/**
	 * Set value of profil_recherche
	 * @param profil_recherche
	 */
	public final void setprofil_recherche(java.lang.String profil_recherche)
	{
		setprofil_recherche(getContext(), profil_recherche);
	}

	/**
	 * Set value of profil_recherche
	 * @param context
	 * @param profil_recherche
	 */
	public final void setprofil_recherche(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String profil_recherche)
	{
		getMendixObject().setValue(context, MemberNames.profil_recherche.toString(), profil_recherche);
	}

	/**
	 * @return value of heures
	 */
	public final java.math.BigDecimal getheures()
	{
		return getheures(getContext());
	}

	/**
	 * @param context
	 * @return value of heures
	 */
	public final java.math.BigDecimal getheures(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.heures.toString());
	}

	/**
	 * Set value of heures
	 * @param heures
	 */
	public final void setheures(java.math.BigDecimal heures)
	{
		setheures(getContext(), heures);
	}

	/**
	 * Set value of heures
	 * @param context
	 * @param heures
	 */
	public final void setheures(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal heures)
	{
		getMendixObject().setValue(context, MemberNames.heures.toString(), heures);
	}

	/**
	 * @return value of offre_contrat
	 */
	public final emploitocndixmodule.proxies.contrat getoffre_contrat() throws com.mendix.core.CoreException
	{
		return getoffre_contrat(getContext());
	}

	/**
	 * @param context
	 * @return value of offre_contrat
	 */
	public final emploitocndixmodule.proxies.contrat getoffre_contrat(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emploitocndixmodule.proxies.contrat result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.offre_contrat.toString());
		if (identifier != null)
			result = emploitocndixmodule.proxies.contrat.load(context, identifier);
		return result;
	}

	/**
	 * Set value of offre_contrat
	 * @param offre_contrat
	 */
	public final void setoffre_contrat(emploitocndixmodule.proxies.contrat offre_contrat)
	{
		setoffre_contrat(getContext(), offre_contrat);
	}

	/**
	 * Set value of offre_contrat
	 * @param context
	 * @param offre_contrat
	 */
	public final void setoffre_contrat(com.mendix.systemwideinterfaces.core.IContext context, emploitocndixmodule.proxies.contrat offre_contrat)
	{
		if (offre_contrat == null)
			getMendixObject().setValue(context, MemberNames.offre_contrat.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.offre_contrat.toString(), offre_contrat.getMendixObject().getId());
	}

	/**
	 * @return value of offre_site
	 */
	public final emploitocndixmodule.proxies.site getoffre_site() throws com.mendix.core.CoreException
	{
		return getoffre_site(getContext());
	}

	/**
	 * @param context
	 * @return value of offre_site
	 */
	public final emploitocndixmodule.proxies.site getoffre_site(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emploitocndixmodule.proxies.site result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.offre_site.toString());
		if (identifier != null)
			result = emploitocndixmodule.proxies.site.load(context, identifier);
		return result;
	}

	/**
	 * Set value of offre_site
	 * @param offre_site
	 */
	public final void setoffre_site(emploitocndixmodule.proxies.site offre_site)
	{
		setoffre_site(getContext(), offre_site);
	}

	/**
	 * Set value of offre_site
	 * @param context
	 * @param offre_site
	 */
	public final void setoffre_site(com.mendix.systemwideinterfaces.core.IContext context, emploitocndixmodule.proxies.site offre_site)
	{
		if (offre_site == null)
			getMendixObject().setValue(context, MemberNames.offre_site.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.offre_site.toString(), offre_site.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return offreMendixObject;
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
			final emploitocndixmodule.proxies.offre that = (emploitocndixmodule.proxies.offre) obj;
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
		return "emploiTocndixModule.offre";
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
