package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.android.trade.options.ReplaceOptionOrderDialogFragment;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderDetailFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOrderDetailFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", ReplaceOptionOrderDialogFragment.EXTRA_ORDER_ID, "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getOptionOrderId", "()Ljava/util/UUID;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionOrderDetailFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<OptionOrderDetailFragmentKey> CREATOR = new Creator();
    private final UUID optionOrderId;

    /* compiled from: OptionOrderDetailFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionOrderDetailFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOrderDetailFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionOrderDetailFragmentKey((UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionOrderDetailFragmentKey[] newArray(int i) {
            return new OptionOrderDetailFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionOrderDetailFragmentKey copy$default(OptionOrderDetailFragmentKey optionOrderDetailFragmentKey, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = optionOrderDetailFragmentKey.optionOrderId;
        }
        return optionOrderDetailFragmentKey.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOptionOrderId() {
        return this.optionOrderId;
    }

    public final OptionOrderDetailFragmentKey copy(UUID optionOrderId) {
        Intrinsics.checkNotNullParameter(optionOrderId, "optionOrderId");
        return new OptionOrderDetailFragmentKey(optionOrderId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionOrderDetailFragmentKey) && Intrinsics.areEqual(this.optionOrderId, ((OptionOrderDetailFragmentKey) other).optionOrderId);
    }

    public int hashCode() {
        return this.optionOrderId.hashCode();
    }

    public String toString() {
        return "OptionOrderDetailFragmentKey(optionOrderId=" + this.optionOrderId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.optionOrderId);
    }

    public OptionOrderDetailFragmentKey(UUID optionOrderId) {
        Intrinsics.checkNotNullParameter(optionOrderId, "optionOrderId");
        this.optionOrderId = optionOrderId;
    }

    public final UUID getOptionOrderId() {
        return this.optionOrderId;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }
}
