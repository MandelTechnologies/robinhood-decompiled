package com.robinhood.android.matcha.p177ui.search;

import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.models.p176ui.UiMatchaUser2;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchViewState5;
import com.robinhood.models.contacts.ReferralContact;
import com.robinhood.models.p320db.matcha.MatchaSearchUser;
import com.robinhood.models.util.Money;
import com.robinhood.p2p.common.ProfileAvatarState;
import com.robinhood.p2p.common.ProfileAvatars;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaSearchViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\b\t\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "RhUser", "Contact", "Header", "EnableContacts", "ShareQr", "Placeholder", "NoResults", "Lcom/robinhood/android/matcha/ui/search/Row$Contact;", "Lcom/robinhood/android/matcha/ui/search/Row$EnableContacts;", "Lcom/robinhood/android/matcha/ui/search/Row$Header;", "Lcom/robinhood/android/matcha/ui/search/Row$NoResults;", "Lcom/robinhood/android/matcha/ui/search/Row$Placeholder;", "Lcom/robinhood/android/matcha/ui/search/Row$RhUser;", "Lcom/robinhood/android/matcha/ui/search/Row$ShareQr;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.Row, reason: use source file name */
/* loaded from: classes8.dex */
public abstract class MatchaSearchViewState4 {
    public static final int $stable = 0;
    private final int viewType;

    public /* synthetic */ MatchaSearchViewState4(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private MatchaSearchViewState4(int i) {
        this.viewType = i;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001d\u001a\u00020\u0003HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÂ\u0003J'\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0014HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\nR\u0011\u0010\u001b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\nR\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\n¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row$RhUser;", "Lcom/robinhood/android/matcha/ui/search/Row;", "user", "Lcom/robinhood/models/db/matcha/MatchaSearchUser;", "isConnection", "", "checkboxState", "Lcom/robinhood/android/matcha/ui/search/RowCheckboxState;", "<init>", "(Lcom/robinhood/models/db/matcha/MatchaSearchUser;ZLcom/robinhood/android/matcha/ui/search/RowCheckboxState;)V", "()Z", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor$User;", "avatar", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "getAvatar", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "primaryText", "", "getPrimaryText", "()Ljava/lang/String;", "secondaryText", "getSecondaryText", "inRhyLicensedState", "getInRhyLicensedState", "isCheckboxVisible", "isCheckboxChecked", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.Row$RhUser, reason: from toString */
    public static final /* data */ class RhUser extends MatchaSearchViewState4 {
        public static final int $stable = 8;
        private final MatchaSearchViewState5 checkboxState;
        private final boolean isConnection;
        private final MatchaSearchUser user;

        /* renamed from: component1, reason: from getter */
        private final MatchaSearchUser getUser() {
            return this.user;
        }

        /* renamed from: component3, reason: from getter */
        private final MatchaSearchViewState5 getCheckboxState() {
            return this.checkboxState;
        }

        public static /* synthetic */ RhUser copy$default(RhUser rhUser, MatchaSearchUser matchaSearchUser, boolean z, MatchaSearchViewState5 matchaSearchViewState5, int i, Object obj) {
            if ((i & 1) != 0) {
                matchaSearchUser = rhUser.user;
            }
            if ((i & 2) != 0) {
                z = rhUser.isConnection;
            }
            if ((i & 4) != 0) {
                matchaSearchViewState5 = rhUser.checkboxState;
            }
            return rhUser.copy(matchaSearchUser, z, matchaSearchViewState5);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsConnection() {
            return this.isConnection;
        }

        public final RhUser copy(MatchaSearchUser user, boolean isConnection, MatchaSearchViewState5 checkboxState) {
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(checkboxState, "checkboxState");
            return new RhUser(user, isConnection, checkboxState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RhUser)) {
                return false;
            }
            RhUser rhUser = (RhUser) other;
            return Intrinsics.areEqual(this.user, rhUser.user) && this.isConnection == rhUser.isConnection && Intrinsics.areEqual(this.checkboxState, rhUser.checkboxState);
        }

        public int hashCode() {
            return (((this.user.hashCode() * 31) + Boolean.hashCode(this.isConnection)) * 31) + this.checkboxState.hashCode();
        }

        public String toString() {
            return "RhUser(user=" + this.user + ", isConnection=" + this.isConnection + ", checkboxState=" + this.checkboxState + ")";
        }

        public final boolean isConnection() {
            return this.isConnection;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RhUser(MatchaSearchUser user, boolean z, MatchaSearchViewState5 checkboxState) {
            super(0, null);
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(checkboxState, "checkboxState");
            this.user = user;
            this.isConnection = z;
            this.checkboxState = checkboxState;
        }

        public final Transactor.User getTransactor() {
            return new Transactor.User(UiMatchaUser2.toUiMatchaUser(this.user), this.isConnection);
        }

        public final ProfileAvatarState getAvatar() {
            return ProfileAvatars.getAvatar(getTransactor());
        }

        public final String getPrimaryText() {
            return this.user.getName();
        }

        public final String getSecondaryText() {
            return this.user.getUsername();
        }

        public final boolean getInRhyLicensedState() {
            return this.user.getInRhyLicensedState();
        }

        public final boolean isCheckboxVisible() {
            return this.checkboxState instanceof MatchaSearchViewState5.Visible;
        }

        public final boolean isCheckboxChecked() {
            MatchaSearchViewState5 matchaSearchViewState5 = this.checkboxState;
            return (matchaSearchViewState5 instanceof MatchaSearchViewState5.Visible) && ((MatchaSearchViewState5.Visible) matchaSearchViewState5).getChecked();
        }
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0017\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0012HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row$Contact;", "Lcom/robinhood/android/matcha/ui/search/Row;", "contact", "Lcom/robinhood/models/contacts/ReferralContact;", "isInviteLoading", "", "<init>", "(Lcom/robinhood/models/contacts/ReferralContact;Z)V", "()Z", "transactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "getTransactor", "()Lcom/robinhood/android/matcha/models/ui/Transactor;", "avatar", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "getAvatar", "()Lcom/robinhood/p2p/common/ProfileAvatarState;", "primaryText", "", "getPrimaryText", "()Ljava/lang/String;", "secondaryText", "getSecondaryText", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.Row$Contact, reason: from toString */
    public static final /* data */ class Contact extends MatchaSearchViewState4 {
        public static final int $stable = 8;
        private final ReferralContact contact;
        private final boolean isInviteLoading;

        /* renamed from: component1, reason: from getter */
        private final ReferralContact getContact() {
            return this.contact;
        }

        public static /* synthetic */ Contact copy$default(Contact contact, ReferralContact referralContact, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                referralContact = contact.contact;
            }
            if ((i & 2) != 0) {
                z = contact.isInviteLoading;
            }
            return contact.copy(referralContact, z);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInviteLoading() {
            return this.isInviteLoading;
        }

        public final Contact copy(ReferralContact contact, boolean isInviteLoading) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            return new Contact(contact, isInviteLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) other;
            return Intrinsics.areEqual(this.contact, contact.contact) && this.isInviteLoading == contact.isInviteLoading;
        }

        public int hashCode() {
            return (this.contact.getContactId() * 31) + Boolean.hashCode(this.isInviteLoading);
        }

        public String toString() {
            return "Contact(contact=" + this.contact + ", isInviteLoading=" + this.isInviteLoading + ")";
        }

        public final boolean isInviteLoading() {
            return this.isInviteLoading;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Contact(ReferralContact contact, boolean z) {
            super(1, null);
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.contact = contact;
            this.isInviteLoading = z;
        }

        public final Transactor getTransactor() {
            if (this.contact.usePhone()) {
                String str = this.contact.phoneNumberForDisplay;
                Intrinsics.checkNotNull(str);
                return new Transactor.Phone(str, this.contact.validDisplayName(), this.contact.contactId);
            }
            String str2 = this.contact.email;
            Intrinsics.checkNotNull(str2);
            return new Transactor.Email(str2, this.contact.validDisplayName(), this.contact.contactId);
        }

        public final ProfileAvatarState getAvatar() {
            return ProfileAvatars.getAvatar(this.contact);
        }

        public final String getPrimaryText() {
            return this.contact.validDisplayName();
        }

        public final String getSecondaryText() {
            String str;
            if (this.contact.usePhone()) {
                str = this.contact.phoneNumberForDisplay;
            } else {
                str = this.contact.email;
            }
            return str == null ? "" : str;
        }
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row$Header;", "Lcom/robinhood/android/matcha/ui/search/Row;", "text", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.Row$Header, reason: from toString */
    public static final /* data */ class Header extends MatchaSearchViewState4 {
        public static final int $stable = StringResource.$stable;
        private final StringResource text;

        public static /* synthetic */ Header copy$default(Header header, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = header.text;
            }
            return header.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        public final Header copy(StringResource text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Header(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Header) && Intrinsics.areEqual(this.text, ((Header) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Header(text=" + this.text + ")";
        }

        public final StringResource getText() {
            return this.text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(StringResource text) {
            super(2, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row$EnableContacts;", "Lcom/robinhood/android/matcha/ui/search/Row;", "showIllustration", "", "<init>", "(Z)V", "getShowIllustration", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.Row$EnableContacts, reason: from toString */
    public static final /* data */ class EnableContacts extends MatchaSearchViewState4 {
        public static final int $stable = 0;
        private final boolean showIllustration;

        public static /* synthetic */ EnableContacts copy$default(EnableContacts enableContacts, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = enableContacts.showIllustration;
            }
            return enableContacts.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowIllustration() {
            return this.showIllustration;
        }

        public final EnableContacts copy(boolean showIllustration) {
            return new EnableContacts(showIllustration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EnableContacts) && this.showIllustration == ((EnableContacts) other).showIllustration;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showIllustration);
        }

        public String toString() {
            return "EnableContacts(showIllustration=" + this.showIllustration + ")";
        }

        public final boolean getShowIllustration() {
            return this.showIllustration;
        }

        public EnableContacts(boolean z) {
            super(3, null);
            this.showIllustration = z;
        }
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row$ShareQr;", "Lcom/robinhood/android/matcha/ui/search/Row;", "amount", "Lcom/robinhood/models/util/Money;", "<init>", "(Lcom/robinhood/models/util/Money;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.Row$ShareQr, reason: from toString */
    public static final /* data */ class ShareQr extends MatchaSearchViewState4 {
        public static final int $stable = 8;
        private final Money amount;

        public static /* synthetic */ ShareQr copy$default(ShareQr shareQr, Money money, int i, Object obj) {
            if ((i & 1) != 0) {
                money = shareQr.amount;
            }
            return shareQr.copy(money);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        public final ShareQr copy(Money amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            return new ShareQr(amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShareQr) && Intrinsics.areEqual(this.amount, ((ShareQr) other).amount);
        }

        public int hashCode() {
            return this.amount.hashCode();
        }

        public String toString() {
            return "ShareQr(amount=" + this.amount + ")";
        }

        public final Money getAmount() {
            return this.amount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareQr(Money amount) {
            super(7, null);
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.amount = amount;
        }
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row$Placeholder;", "Lcom/robinhood/android/matcha/ui/search/Row;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.Row$Placeholder */
    public static final class Placeholder extends MatchaSearchViewState4 {
        public static final int $stable = 0;
        public static final Placeholder INSTANCE = new Placeholder();

        private Placeholder() {
            super(6, null);
        }
    }

    /* compiled from: MatchaSearchViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/search/Row$NoResults;", "Lcom/robinhood/android/matcha/ui/search/Row;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.search.Row$NoResults */
    public static final class NoResults extends MatchaSearchViewState4 {
        public static final int $stable = 0;
        public static final NoResults INSTANCE = new NoResults();

        private NoResults() {
            super(5, null);
        }
    }
}
