package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainOnboardingFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainOnboardingFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainOnboardingLaunchMode;", "source", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/options/contracts/OptionChainOnboardingLaunchMode;Ljava/lang/String;)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainOnboardingLaunchMode;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainOnboardingFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<OptionChainOnboardingFragmentKey> CREATOR = new Creator();
    private final BrokerageAccountType accountType;
    private final OptionChainOnboardingFragmentKey2 launchMode;
    private final String source;

    /* compiled from: OptionChainOnboardingFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionChainOnboardingFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainOnboardingFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionChainOnboardingFragmentKey(BrokerageAccountType.valueOf(parcel.readString()), OptionChainOnboardingFragmentKey2.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionChainOnboardingFragmentKey[] newArray(int i) {
            return new OptionChainOnboardingFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionChainOnboardingFragmentKey copy$default(OptionChainOnboardingFragmentKey optionChainOnboardingFragmentKey, BrokerageAccountType brokerageAccountType, OptionChainOnboardingFragmentKey2 optionChainOnboardingFragmentKey2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = optionChainOnboardingFragmentKey.accountType;
        }
        if ((i & 2) != 0) {
            optionChainOnboardingFragmentKey2 = optionChainOnboardingFragmentKey.launchMode;
        }
        if ((i & 4) != 0) {
            str = optionChainOnboardingFragmentKey.source;
        }
        return optionChainOnboardingFragmentKey.copy(brokerageAccountType, optionChainOnboardingFragmentKey2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainOnboardingFragmentKey2 getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final OptionChainOnboardingFragmentKey copy(BrokerageAccountType accountType, OptionChainOnboardingFragmentKey2 launchMode, String source) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(source, "source");
        return new OptionChainOnboardingFragmentKey(accountType, launchMode, source);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainOnboardingFragmentKey)) {
            return false;
        }
        OptionChainOnboardingFragmentKey optionChainOnboardingFragmentKey = (OptionChainOnboardingFragmentKey) other;
        return this.accountType == optionChainOnboardingFragmentKey.accountType && this.launchMode == optionChainOnboardingFragmentKey.launchMode && Intrinsics.areEqual(this.source, optionChainOnboardingFragmentKey.source);
    }

    public int hashCode() {
        return (((this.accountType.hashCode() * 31) + this.launchMode.hashCode()) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "OptionChainOnboardingFragmentKey(accountType=" + this.accountType + ", launchMode=" + this.launchMode + ", source=" + this.source + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType.name());
        dest.writeString(this.launchMode.name());
        dest.writeString(this.source);
    }

    public OptionChainOnboardingFragmentKey(BrokerageAccountType accountType, OptionChainOnboardingFragmentKey2 launchMode, String source) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(source, "source");
        this.accountType = accountType;
        this.launchMode = launchMode;
        this.source = source;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final OptionChainOnboardingFragmentKey2 getLaunchMode() {
        return this.launchMode;
    }

    public final String getSource() {
        return this.source;
    }
}
