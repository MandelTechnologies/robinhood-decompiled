package com.robinhood.android.rhy.referral.contact;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RhyReferralContactListViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactListViewState;", "", "contacts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactRow;", "isSearching", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getContacts", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralContactListViewState {
    public static final int $stable = 8;
    private final ImmutableList<RhyReferralContactRow> contacts;
    private final boolean isSearching;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyReferralContactListViewState copy$default(RhyReferralContactListViewState rhyReferralContactListViewState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = rhyReferralContactListViewState.contacts;
        }
        if ((i & 2) != 0) {
            z = rhyReferralContactListViewState.isSearching;
        }
        return rhyReferralContactListViewState.copy(immutableList, z);
    }

    public final ImmutableList<RhyReferralContactRow> component1() {
        return this.contacts;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSearching() {
        return this.isSearching;
    }

    public final RhyReferralContactListViewState copy(ImmutableList<RhyReferralContactRow> contacts, boolean isSearching) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        return new RhyReferralContactListViewState(contacts, isSearching);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralContactListViewState)) {
            return false;
        }
        RhyReferralContactListViewState rhyReferralContactListViewState = (RhyReferralContactListViewState) other;
        return Intrinsics.areEqual(this.contacts, rhyReferralContactListViewState.contacts) && this.isSearching == rhyReferralContactListViewState.isSearching;
    }

    public int hashCode() {
        return (this.contacts.hashCode() * 31) + Boolean.hashCode(this.isSearching);
    }

    public String toString() {
        return "RhyReferralContactListViewState(contacts=" + this.contacts + ", isSearching=" + this.isSearching + ")";
    }

    public RhyReferralContactListViewState(ImmutableList<RhyReferralContactRow> contacts, boolean z) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.contacts = contacts;
        this.isSearching = z;
    }

    public final ImmutableList<RhyReferralContactRow> getContacts() {
        return this.contacts;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }
}
