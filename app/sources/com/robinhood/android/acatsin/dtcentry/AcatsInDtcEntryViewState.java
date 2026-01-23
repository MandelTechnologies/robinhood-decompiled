package com.robinhood.android.acatsin.dtcentry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInDtcEntryViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryViewState;", "", "userEnteredText", "", "isButtonLoading", "", "dtcNumber", "", "<init>", "(Ljava/lang/CharSequence;ZLjava/lang/String;)V", "getUserEnteredText", "()Ljava/lang/CharSequence;", "()Z", "getDtcNumber", "()Ljava/lang/String;", "isContinueButtonEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInDtcEntryViewState {
    public static final int $stable = 8;
    private final String dtcNumber;
    private final boolean isButtonLoading;
    private final CharSequence userEnteredText;

    public AcatsInDtcEntryViewState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ AcatsInDtcEntryViewState copy$default(AcatsInDtcEntryViewState acatsInDtcEntryViewState, CharSequence charSequence, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = acatsInDtcEntryViewState.userEnteredText;
        }
        if ((i & 2) != 0) {
            z = acatsInDtcEntryViewState.isButtonLoading;
        }
        if ((i & 4) != 0) {
            str = acatsInDtcEntryViewState.dtcNumber;
        }
        return acatsInDtcEntryViewState.copy(charSequence, z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getUserEnteredText() {
        return this.userEnteredText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsButtonLoading() {
        return this.isButtonLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDtcNumber() {
        return this.dtcNumber;
    }

    public final AcatsInDtcEntryViewState copy(CharSequence userEnteredText, boolean isButtonLoading, String dtcNumber) {
        return new AcatsInDtcEntryViewState(userEnteredText, isButtonLoading, dtcNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInDtcEntryViewState)) {
            return false;
        }
        AcatsInDtcEntryViewState acatsInDtcEntryViewState = (AcatsInDtcEntryViewState) other;
        return Intrinsics.areEqual(this.userEnteredText, acatsInDtcEntryViewState.userEnteredText) && this.isButtonLoading == acatsInDtcEntryViewState.isButtonLoading && Intrinsics.areEqual(this.dtcNumber, acatsInDtcEntryViewState.dtcNumber);
    }

    public int hashCode() {
        CharSequence charSequence = this.userEnteredText;
        int iHashCode = (((charSequence == null ? 0 : charSequence.hashCode()) * 31) + Boolean.hashCode(this.isButtonLoading)) * 31;
        String str = this.dtcNumber;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        CharSequence charSequence = this.userEnteredText;
        return "AcatsInDtcEntryViewState(userEnteredText=" + ((Object) charSequence) + ", isButtonLoading=" + this.isButtonLoading + ", dtcNumber=" + this.dtcNumber + ")";
    }

    public AcatsInDtcEntryViewState(CharSequence charSequence, boolean z, String str) {
        this.userEnteredText = charSequence;
        this.isButtonLoading = z;
        this.dtcNumber = str;
    }

    public /* synthetic */ AcatsInDtcEntryViewState(CharSequence charSequence, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }

    public final CharSequence getUserEnteredText() {
        return this.userEnteredText;
    }

    public final boolean isButtonLoading() {
        return this.isButtonLoading;
    }

    public final String getDtcNumber() {
        return this.dtcNumber;
    }

    public final boolean isContinueButtonEnabled() {
        CharSequence charSequence = this.userEnteredText;
        return (charSequence == null || charSequence.length() != 4 || this.isButtonLoading) ? false : true;
    }
}
