package com.robinhood.shared.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneVerifyOdysseyIntentKey.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/PhoneVerifyOdysseyIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "flowType", "Lcom/robinhood/shared/security/contracts/PhoneVerificationFlowType;", "source", "Lcom/robinhood/shared/security/contracts/PhoneVerificationSource;", "phoneNumber", "", "<init>", "(Lcom/robinhood/shared/security/contracts/PhoneVerificationFlowType;Lcom/robinhood/shared/security/contracts/PhoneVerificationSource;Ljava/lang/String;)V", "getFlowType", "()Lcom/robinhood/shared/security/contracts/PhoneVerificationFlowType;", "getSource", "()Lcom/robinhood/shared/security/contracts/PhoneVerificationSource;", "getPhoneNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PhoneVerifyOdysseyIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<PhoneVerifyOdysseyIntentKey> CREATOR = new Creator();
    private final PhoneVerificationFlowType flowType;
    private final String phoneNumber;
    private final PhoneVerificationSource source;

    /* compiled from: PhoneVerifyOdysseyIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PhoneVerifyOdysseyIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneVerifyOdysseyIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhoneVerifyOdysseyIntentKey(PhoneVerificationFlowType.valueOf(parcel.readString()), PhoneVerificationSource.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneVerifyOdysseyIntentKey[] newArray(int i) {
            return new PhoneVerifyOdysseyIntentKey[i];
        }
    }

    public PhoneVerifyOdysseyIntentKey() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.flowType.name());
        dest.writeString(this.source.name());
        dest.writeString(this.phoneNumber);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public PhoneVerifyOdysseyIntentKey(PhoneVerificationFlowType flowType, PhoneVerificationSource source, String str) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.flowType = flowType;
        this.source = source;
        this.phoneNumber = str;
    }

    public /* synthetic */ PhoneVerifyOdysseyIntentKey(PhoneVerificationFlowType phoneVerificationFlowType, PhoneVerificationSource phoneVerificationSource, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PhoneVerificationFlowType.VERIFIED_SETTINGS : phoneVerificationFlowType, (i & 2) != 0 ? PhoneVerificationSource.UNKNOWN : phoneVerificationSource, (i & 4) != 0 ? null : str);
    }

    public final PhoneVerificationFlowType getFlowType() {
        return this.flowType;
    }

    public final PhoneVerificationSource getSource() {
        return this.source;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }
}
