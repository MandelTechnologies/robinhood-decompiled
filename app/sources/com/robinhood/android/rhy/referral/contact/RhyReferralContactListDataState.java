package com.robinhood.android.rhy.referral.contact;

import com.robinhood.models.contacts.ReferralContact;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralContactListDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListDataState;", "", "isSearching", "", "contacts", "", "Lcom/robinhood/models/contacts/ReferralContact;", "query", "", "inviteMessage", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "setSearching", "(Z)V", "getContacts", "()Ljava/util/List;", "getQuery", "()Ljava/lang/String;", "getInviteMessage", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralContactListDataState {
    public static final int $stable = 8;
    private final List<ReferralContact> contacts;
    private final String inviteMessage;
    private boolean isSearching;
    private final String query;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyReferralContactListDataState copy$default(RhyReferralContactListDataState rhyReferralContactListDataState, boolean z, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rhyReferralContactListDataState.isSearching;
        }
        if ((i & 2) != 0) {
            list = rhyReferralContactListDataState.contacts;
        }
        if ((i & 4) != 0) {
            str = rhyReferralContactListDataState.query;
        }
        if ((i & 8) != 0) {
            str2 = rhyReferralContactListDataState.inviteMessage;
        }
        return rhyReferralContactListDataState.copy(z, list, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSearching() {
        return this.isSearching;
    }

    public final List<ReferralContact> component2() {
        return this.contacts;
    }

    /* renamed from: component3, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInviteMessage() {
        return this.inviteMessage;
    }

    public final RhyReferralContactListDataState copy(boolean isSearching, List<ReferralContact> contacts, String query, String inviteMessage) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(inviteMessage, "inviteMessage");
        return new RhyReferralContactListDataState(isSearching, contacts, query, inviteMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralContactListDataState)) {
            return false;
        }
        RhyReferralContactListDataState rhyReferralContactListDataState = (RhyReferralContactListDataState) other;
        return this.isSearching == rhyReferralContactListDataState.isSearching && Intrinsics.areEqual(this.contacts, rhyReferralContactListDataState.contacts) && Intrinsics.areEqual(this.query, rhyReferralContactListDataState.query) && Intrinsics.areEqual(this.inviteMessage, rhyReferralContactListDataState.inviteMessage);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isSearching) * 31) + this.contacts.hashCode()) * 31;
        String str = this.query;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.inviteMessage.hashCode();
    }

    public String toString() {
        return "RhyReferralContactListDataState(isSearching=" + this.isSearching + ", contacts=" + this.contacts + ", query=" + this.query + ", inviteMessage=" + this.inviteMessage + ")";
    }

    public RhyReferralContactListDataState(boolean z, List<ReferralContact> contacts, String str, String inviteMessage) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(inviteMessage, "inviteMessage");
        this.isSearching = z;
        this.contacts = contacts;
        this.query = str;
        this.inviteMessage = inviteMessage;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }

    public final void setSearching(boolean z) {
        this.isSearching = z;
    }

    public /* synthetic */ RhyReferralContactListDataState(boolean z, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, str2);
    }

    public final List<ReferralContact> getContacts() {
        return this.contacts;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getInviteMessage() {
        return this.inviteMessage;
    }
}
