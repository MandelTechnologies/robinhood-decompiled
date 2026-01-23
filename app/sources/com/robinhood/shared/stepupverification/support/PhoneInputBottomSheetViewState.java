package com.robinhood.shared.stepupverification.support;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneInputBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/support/PhoneInputBottomSheetViewState;", "", "phoneNumber", "", "<init>", "(Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PhoneInputBottomSheetViewState {
    public static final int $stable = 0;
    private final String phoneNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public PhoneInputBottomSheetViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhoneInputBottomSheetViewState copy$default(PhoneInputBottomSheetViewState phoneInputBottomSheetViewState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneInputBottomSheetViewState.phoneNumber;
        }
        return phoneInputBottomSheetViewState.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final PhoneInputBottomSheetViewState copy(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return new PhoneInputBottomSheetViewState(phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PhoneInputBottomSheetViewState) && Intrinsics.areEqual(this.phoneNumber, ((PhoneInputBottomSheetViewState) other).phoneNumber);
    }

    public int hashCode() {
        return this.phoneNumber.hashCode();
    }

    public String toString() {
        return "PhoneInputBottomSheetViewState(phoneNumber=" + this.phoneNumber + ")";
    }

    public PhoneInputBottomSheetViewState(String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
    }

    public /* synthetic */ PhoneInputBottomSheetViewState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }
}
