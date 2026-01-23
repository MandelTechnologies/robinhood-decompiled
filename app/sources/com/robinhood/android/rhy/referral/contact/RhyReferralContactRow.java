package com.robinhood.android.rhy.referral.contact;

import com.robinhood.models.contacts.ReferralContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralContactRow.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/contact/RhyReferralContactRow;", "", "referralContact", "Lcom/robinhood/models/contacts/ReferralContact;", "primaryText", "", "secondaryText", "<init>", "(Lcom/robinhood/models/contacts/ReferralContact;Ljava/lang/String;Ljava/lang/String;)V", "getReferralContact", "()Lcom/robinhood/models/contacts/ReferralContact;", "getPrimaryText", "()Ljava/lang/String;", "getSecondaryText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RhyReferralContactRow {
    public static final int $stable = 8;
    private final String primaryText;
    private final ReferralContact referralContact;
    private final String secondaryText;

    public static /* synthetic */ RhyReferralContactRow copy$default(RhyReferralContactRow rhyReferralContactRow, ReferralContact referralContact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            referralContact = rhyReferralContactRow.referralContact;
        }
        if ((i & 2) != 0) {
            str = rhyReferralContactRow.primaryText;
        }
        if ((i & 4) != 0) {
            str2 = rhyReferralContactRow.secondaryText;
        }
        return rhyReferralContactRow.copy(referralContact, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final ReferralContact getReferralContact() {
        return this.referralContact;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public final RhyReferralContactRow copy(ReferralContact referralContact, String primaryText, String secondaryText) {
        Intrinsics.checkNotNullParameter(referralContact, "referralContact");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        return new RhyReferralContactRow(referralContact, primaryText, secondaryText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyReferralContactRow)) {
            return false;
        }
        RhyReferralContactRow rhyReferralContactRow = (RhyReferralContactRow) other;
        return Intrinsics.areEqual(this.referralContact, rhyReferralContactRow.referralContact) && Intrinsics.areEqual(this.primaryText, rhyReferralContactRow.primaryText) && Intrinsics.areEqual(this.secondaryText, rhyReferralContactRow.secondaryText);
    }

    public int hashCode() {
        return (((this.referralContact.getContactId() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode();
    }

    public String toString() {
        return "RhyReferralContactRow(referralContact=" + this.referralContact + ", primaryText=" + this.primaryText + ", secondaryText=" + this.secondaryText + ")";
    }

    public RhyReferralContactRow(ReferralContact referralContact, String primaryText, String secondaryText) {
        Intrinsics.checkNotNullParameter(referralContact, "referralContact");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        this.referralContact = referralContact;
        this.primaryText = primaryText;
        this.secondaryText = secondaryText;
    }

    public final ReferralContact getReferralContact() {
        return this.referralContact;
    }

    public final String getPrimaryText() {
        return this.primaryText;
    }

    public final String getSecondaryText() {
        return this.secondaryText;
    }
}
