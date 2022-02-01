// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emailtemplate.proxies;

public enum PrivateConstants
{
	regex(new java.lang.String[][] { new java.lang.String[] { "en_US", "^[^\\s\\@,]+?@([a-zA-Z0-9-]+\\.)+?[a-zA-Z]{2,}$" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private PrivateConstants(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("fr_FR");
	}

	public java.lang.String getCaption()
	{
		return captions.get("fr_FR");
	}
}
