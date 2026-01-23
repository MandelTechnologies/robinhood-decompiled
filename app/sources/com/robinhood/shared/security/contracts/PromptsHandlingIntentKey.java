package com.robinhood.shared.security.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsHandlingIntentKey.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/PromptsHandlingIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "<init>", "(Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;)V", "getInfo", "()Lcom/robinhood/shared/security/contracts/PromptsHandlingInfo;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class PromptsHandlingIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<PromptsHandlingIntentKey> CREATOR = new Creator();
    private final PromptsHandlingInfo info;

    /* compiled from: PromptsHandlingIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PromptsHandlingIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptsHandlingIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PromptsHandlingIntentKey(PromptsHandlingInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromptsHandlingIntentKey[] newArray(int i) {
            return new PromptsHandlingIntentKey[i];
        }
    }

    public static /* synthetic */ PromptsHandlingIntentKey copy$default(PromptsHandlingIntentKey promptsHandlingIntentKey, PromptsHandlingInfo promptsHandlingInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            promptsHandlingInfo = promptsHandlingIntentKey.info;
        }
        return promptsHandlingIntentKey.copy(promptsHandlingInfo);
    }

    /* renamed from: component1, reason: from getter */
    public final PromptsHandlingInfo getInfo() {
        return this.info;
    }

    public final PromptsHandlingIntentKey copy(PromptsHandlingInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        return new PromptsHandlingIntentKey(info);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PromptsHandlingIntentKey) && Intrinsics.areEqual(this.info, ((PromptsHandlingIntentKey) other).info);
    }

    public int hashCode() {
        return this.info.hashCode();
    }

    public String toString() {
        return "PromptsHandlingIntentKey(info=" + this.info + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.info.writeToParcel(dest, flags);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public PromptsHandlingIntentKey(PromptsHandlingInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
    }

    public final PromptsHandlingInfo getInfo() {
        return this.info;
    }
}
