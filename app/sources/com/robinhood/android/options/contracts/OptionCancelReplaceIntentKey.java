package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionCancelReplaceIntentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionCancelReplaceIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, "Ljava/util/UUID;", "accountNumber", "", "launchMode", "Lcom/robinhood/android/options/contracts/OptionCancelReplaceIntentKey$LaunchMode;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/options/contracts/OptionCancelReplaceIntentKey$LaunchMode;)V", "getOptionOrderId", "()Ljava/util/UUID;", "getAccountNumber", "()Ljava/lang/String;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionCancelReplaceIntentKey$LaunchMode;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LaunchMode", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionCancelReplaceIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<OptionCancelReplaceIntentKey> CREATOR = new Creator();
    private final String accountNumber;
    private final LaunchMode launchMode;
    private final UUID optionOrderId;

    /* compiled from: OptionCancelReplaceIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionCancelReplaceIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionCancelReplaceIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionCancelReplaceIntentKey((UUID) parcel.readSerializable(), parcel.readString(), LaunchMode.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionCancelReplaceIntentKey[] newArray(int i) {
            return new OptionCancelReplaceIntentKey[i];
        }
    }

    public static /* synthetic */ OptionCancelReplaceIntentKey copy$default(OptionCancelReplaceIntentKey optionCancelReplaceIntentKey, UUID uuid, String str, LaunchMode launchMode, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = optionCancelReplaceIntentKey.optionOrderId;
        }
        if ((i & 2) != 0) {
            str = optionCancelReplaceIntentKey.accountNumber;
        }
        if ((i & 4) != 0) {
            launchMode = optionCancelReplaceIntentKey.launchMode;
        }
        return optionCancelReplaceIntentKey.copy(uuid, str, launchMode);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOptionOrderId() {
        return this.optionOrderId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final OptionCancelReplaceIntentKey copy(UUID optionOrderId, String accountNumber, LaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(optionOrderId, "optionOrderId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        return new OptionCancelReplaceIntentKey(optionOrderId, accountNumber, launchMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionCancelReplaceIntentKey)) {
            return false;
        }
        OptionCancelReplaceIntentKey optionCancelReplaceIntentKey = (OptionCancelReplaceIntentKey) other;
        return Intrinsics.areEqual(this.optionOrderId, optionCancelReplaceIntentKey.optionOrderId) && Intrinsics.areEqual(this.accountNumber, optionCancelReplaceIntentKey.accountNumber) && this.launchMode == optionCancelReplaceIntentKey.launchMode;
    }

    public int hashCode() {
        return (((this.optionOrderId.hashCode() * 31) + this.accountNumber.hashCode()) * 31) + this.launchMode.hashCode();
    }

    public String toString() {
        return "OptionCancelReplaceIntentKey(optionOrderId=" + this.optionOrderId + ", accountNumber=" + this.accountNumber + ", launchMode=" + this.launchMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.optionOrderId);
        dest.writeString(this.accountNumber);
        dest.writeString(this.launchMode.name());
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public OptionCancelReplaceIntentKey(UUID optionOrderId, String accountNumber, LaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(optionOrderId, "optionOrderId");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.optionOrderId = optionOrderId;
        this.accountNumber = accountNumber;
        this.launchMode = launchMode;
    }

    public final UUID getOptionOrderId() {
        return this.optionOrderId;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final LaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionCancelReplaceIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionCancelReplaceIntentKey$LaunchMode;", "", "<init>", "(Ljava/lang/String;I)V", "CANCEL", "REPLACE", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class LaunchMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LaunchMode[] $VALUES;
        public static final LaunchMode CANCEL = new LaunchMode("CANCEL", 0);
        public static final LaunchMode REPLACE = new LaunchMode("REPLACE", 1);

        private static final /* synthetic */ LaunchMode[] $values() {
            return new LaunchMode[]{CANCEL, REPLACE};
        }

        public static EnumEntries<LaunchMode> getEntries() {
            return $ENTRIES;
        }

        static {
            LaunchMode[] launchModeArr$values = $values();
            $VALUES = launchModeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(launchModeArr$values);
        }

        private LaunchMode(String str, int i) {
        }

        public static LaunchMode valueOf(String str) {
            return (LaunchMode) Enum.valueOf(LaunchMode.class, str);
        }

        public static LaunchMode[] values() {
            return (LaunchMode[]) $VALUES.clone();
        }
    }
}
