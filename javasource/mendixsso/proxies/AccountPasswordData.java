// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mendixsso.proxies;

public class AccountPasswordData implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject accountPasswordDataMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MendixSSO.AccountPasswordData";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OldPassword("OldPassword"),
		NewPassword("NewPassword"),
		ConfirmPassword("ConfirmPassword"),
		AccountPasswordData_MendixSSOUser("MendixSSO.AccountPasswordData_MendixSSOUser");

		private final java.lang.String metaName;

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

	public AccountPasswordData(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected AccountPasswordData(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject accountPasswordDataMendixObject)
	{
		if (accountPasswordDataMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, accountPasswordDataMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.accountPasswordDataMendixObject = accountPasswordDataMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static mendixsso.proxies.AccountPasswordData initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mendixsso.proxies.AccountPasswordData(context, mendixObject);
	}

	public static mendixsso.proxies.AccountPasswordData load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mendixsso.proxies.AccountPasswordData.initialize(context, mendixObject);
	}

	/**
	 * @return value of OldPassword
	 */
	public final java.lang.String getOldPassword()
	{
		return getOldPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of OldPassword
	 */
	public final java.lang.String getOldPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OldPassword.toString());
	}

	/**
	 * Set value of OldPassword
	 * @param oldpassword
	 */
	public final void setOldPassword(java.lang.String oldpassword)
	{
		setOldPassword(getContext(), oldpassword);
	}

	/**
	 * Set value of OldPassword
	 * @param context
	 * @param oldpassword
	 */
	public final void setOldPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String oldpassword)
	{
		getMendixObject().setValue(context, MemberNames.OldPassword.toString(), oldpassword);
	}

	/**
	 * @return value of NewPassword
	 */
	public final java.lang.String getNewPassword()
	{
		return getNewPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of NewPassword
	 */
	public final java.lang.String getNewPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NewPassword.toString());
	}

	/**
	 * Set value of NewPassword
	 * @param newpassword
	 */
	public final void setNewPassword(java.lang.String newpassword)
	{
		setNewPassword(getContext(), newpassword);
	}

	/**
	 * Set value of NewPassword
	 * @param context
	 * @param newpassword
	 */
	public final void setNewPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String newpassword)
	{
		getMendixObject().setValue(context, MemberNames.NewPassword.toString(), newpassword);
	}

	/**
	 * @return value of ConfirmPassword
	 */
	public final java.lang.String getConfirmPassword()
	{
		return getConfirmPassword(getContext());
	}

	/**
	 * @param context
	 * @return value of ConfirmPassword
	 */
	public final java.lang.String getConfirmPassword(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ConfirmPassword.toString());
	}

	/**
	 * Set value of ConfirmPassword
	 * @param confirmpassword
	 */
	public final void setConfirmPassword(java.lang.String confirmpassword)
	{
		setConfirmPassword(getContext(), confirmpassword);
	}

	/**
	 * Set value of ConfirmPassword
	 * @param context
	 * @param confirmpassword
	 */
	public final void setConfirmPassword(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String confirmpassword)
	{
		getMendixObject().setValue(context, MemberNames.ConfirmPassword.toString(), confirmpassword);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of AccountPasswordData_MendixSSOUser
	 */
	public final mendixsso.proxies.MendixSSOUser getAccountPasswordData_MendixSSOUser() throws com.mendix.core.CoreException
	{
		return getAccountPasswordData_MendixSSOUser(getContext());
	}

	/**
	 * @param context
	 * @return value of AccountPasswordData_MendixSSOUser
	 * @throws com.mendix.core.CoreException
	 */
	public final mendixsso.proxies.MendixSSOUser getAccountPasswordData_MendixSSOUser(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mendixsso.proxies.MendixSSOUser result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AccountPasswordData_MendixSSOUser.toString());
		if (identifier != null) {
			result = mendixsso.proxies.MendixSSOUser.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of AccountPasswordData_MendixSSOUser
	 * @param accountpassworddata_mendixssouser
	 */
	public final void setAccountPasswordData_MendixSSOUser(mendixsso.proxies.MendixSSOUser accountpassworddata_mendixssouser)
	{
		setAccountPasswordData_MendixSSOUser(getContext(), accountpassworddata_mendixssouser);
	}

	/**
	 * Set value of AccountPasswordData_MendixSSOUser
	 * @param context
	 * @param accountpassworddata_mendixssouser
	 */
	public final void setAccountPasswordData_MendixSSOUser(com.mendix.systemwideinterfaces.core.IContext context, mendixsso.proxies.MendixSSOUser accountpassworddata_mendixssouser)
	{
		if (accountpassworddata_mendixssouser == null) {
			getMendixObject().setValue(context, MemberNames.AccountPasswordData_MendixSSOUser.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.AccountPasswordData_MendixSSOUser.toString(), accountpassworddata_mendixssouser.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return accountPasswordDataMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mendixsso.proxies.AccountPasswordData that = (mendixsso.proxies.AccountPasswordData) obj;
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
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}