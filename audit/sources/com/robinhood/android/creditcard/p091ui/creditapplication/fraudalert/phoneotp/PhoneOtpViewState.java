package com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneOtpDuxo.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneotp/PhoneOtpViewState;", "", "isLoading", "", "pin", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getPin", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PhoneOtpViewState {
    public static final int $stable = 0;
    private final boolean isLoading;
    private final String pin;

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneOtpViewState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhoneOtpViewState copy$default(PhoneOtpViewState phoneOtpViewState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = phoneOtpViewState.isLoading;
        }
        if ((i & 2) != 0) {
            str = phoneOtpViewState.pin;
        }
        return phoneOtpViewState.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    public final PhoneOtpViewState copy(boolean isLoading, String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return new PhoneOtpViewState(isLoading, pin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneOtpViewState)) {
            return false;
        }
        PhoneOtpViewState phoneOtpViewState = (PhoneOtpViewState) other;
        return this.isLoading == phoneOtpViewState.isLoading && Intrinsics.areEqual(this.pin, phoneOtpViewState.pin);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + this.pin.hashCode();
    }

    public String toString() {
        return "PhoneOtpViewState(isLoading=" + this.isLoading + ", pin=" + this.pin + ")";
    }

    public PhoneOtpViewState(boolean z, String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.isLoading = z;
        this.pin = pin;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ PhoneOtpViewState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public final String getPin() {
        return this.pin;
    }
}
