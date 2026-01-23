package com.robinhood.android.acatsin.dtcentry;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInDtcEntryDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/acatsin/dtcentry/AcatsInDtcEntryDataState;", "", "userEnteredText", "", "isButtonLoading", "", "<init>", "(Ljava/lang/CharSequence;Z)V", "getUserEnteredText", "()Ljava/lang/CharSequence;", "()Z", "getDtcNumber", "", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInDtcEntryDataState {
    public static final int $stable = 8;
    private final boolean isButtonLoading;
    private final CharSequence userEnteredText;

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInDtcEntryDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AcatsInDtcEntryDataState copy$default(AcatsInDtcEntryDataState acatsInDtcEntryDataState, CharSequence charSequence, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = acatsInDtcEntryDataState.userEnteredText;
        }
        if ((i & 2) != 0) {
            z = acatsInDtcEntryDataState.isButtonLoading;
        }
        return acatsInDtcEntryDataState.copy(charSequence, z);
    }

    /* renamed from: component1, reason: from getter */
    public final CharSequence getUserEnteredText() {
        return this.userEnteredText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsButtonLoading() {
        return this.isButtonLoading;
    }

    public final AcatsInDtcEntryDataState copy(CharSequence userEnteredText, boolean isButtonLoading) {
        return new AcatsInDtcEntryDataState(userEnteredText, isButtonLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInDtcEntryDataState)) {
            return false;
        }
        AcatsInDtcEntryDataState acatsInDtcEntryDataState = (AcatsInDtcEntryDataState) other;
        return Intrinsics.areEqual(this.userEnteredText, acatsInDtcEntryDataState.userEnteredText) && this.isButtonLoading == acatsInDtcEntryDataState.isButtonLoading;
    }

    public int hashCode() {
        CharSequence charSequence = this.userEnteredText;
        return ((charSequence == null ? 0 : charSequence.hashCode()) * 31) + Boolean.hashCode(this.isButtonLoading);
    }

    public String toString() {
        CharSequence charSequence = this.userEnteredText;
        return "AcatsInDtcEntryDataState(userEnteredText=" + ((Object) charSequence) + ", isButtonLoading=" + this.isButtonLoading + ")";
    }

    public AcatsInDtcEntryDataState(CharSequence charSequence, boolean z) {
        this.userEnteredText = charSequence;
        this.isButtonLoading = z;
    }

    public /* synthetic */ AcatsInDtcEntryDataState(CharSequence charSequence, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence, (i & 2) != 0 ? false : z);
    }

    public final CharSequence getUserEnteredText() {
        return this.userEnteredText;
    }

    public final boolean isButtonLoading() {
        return this.isButtonLoading;
    }

    public final String getDtcNumber() {
        String string2;
        CharSequence charSequence = this.userEnteredText;
        if (charSequence == null || (string2 = charSequence.toString()) == null || string2.length() != 4 || !TextUtils.isDigitsOnly(string2)) {
            return null;
        }
        return string2;
    }
}
