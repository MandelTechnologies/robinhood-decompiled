package com.robinhood.shared.user.contracts.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmailVerificationSettingIntentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/verification/EmailVerificationSettingIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "source", "Lcom/robinhood/shared/user/contracts/verification/EmailVerificationSource;", "<init>", "(Lcom/robinhood/shared/user/contracts/verification/EmailVerificationSource;)V", "getSource", "()Lcom/robinhood/shared/user/contracts/verification/EmailVerificationSource;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class EmailVerificationSettingIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<EmailVerificationSettingIntentKey> CREATOR = new Creator();
    private final EmailVerificationSettingIntentKey2 source;

    /* compiled from: EmailVerificationSettingIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<EmailVerificationSettingIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailVerificationSettingIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmailVerificationSettingIntentKey(EmailVerificationSettingIntentKey2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailVerificationSettingIntentKey[] newArray(int i) {
            return new EmailVerificationSettingIntentKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailVerificationSettingIntentKey() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EmailVerificationSettingIntentKey copy$default(EmailVerificationSettingIntentKey emailVerificationSettingIntentKey, EmailVerificationSettingIntentKey2 emailVerificationSettingIntentKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            emailVerificationSettingIntentKey2 = emailVerificationSettingIntentKey.source;
        }
        return emailVerificationSettingIntentKey.copy(emailVerificationSettingIntentKey2);
    }

    /* renamed from: component1, reason: from getter */
    public final EmailVerificationSettingIntentKey2 getSource() {
        return this.source;
    }

    public final EmailVerificationSettingIntentKey copy(EmailVerificationSettingIntentKey2 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new EmailVerificationSettingIntentKey(source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EmailVerificationSettingIntentKey) && this.source == ((EmailVerificationSettingIntentKey) other).source;
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    public String toString() {
        return "EmailVerificationSettingIntentKey(source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.source.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public EmailVerificationSettingIntentKey(EmailVerificationSettingIntentKey2 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    public /* synthetic */ EmailVerificationSettingIntentKey(EmailVerificationSettingIntentKey2 emailVerificationSettingIntentKey2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmailVerificationSettingIntentKey2.UNKNOWN : emailVerificationSettingIntentKey2);
    }

    public final EmailVerificationSettingIntentKey2 getSource() {
        return this.source;
    }
}
