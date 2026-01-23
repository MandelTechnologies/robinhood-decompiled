package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionStatisticsFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B7\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionStatisticsFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "Landroid/os/Parcelable;", "optionLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "tradableState", "Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "launchMode", "Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;", "shouldDefaultToSimulatedReturnTab", "", "<init>", "(Lcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;Lcom/robinhood/models/ui/OptionStatisticsTradableState;Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;Z)V", "getOptionLegBundle", "()Lcom/robinhood/models/ui/OptionLegBundle;", "getOptionOrderIntentKey", "()Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "getTradableState", "()Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;", "getShouldDefaultToSimulatedReturnTab", "()Z", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionStatisticsFragmentKey implements FragmentKey, TabFragmentKey, Parcelable {
    public static final Parcelable.Creator<OptionStatisticsFragmentKey> CREATOR = new Creator();
    private final OptionStatisticsLaunchMode launchMode;
    private final OptionLegBundle optionLegBundle;
    private final OptionOrderIntentKey optionOrderIntentKey;
    private final boolean shouldDefaultToSimulatedReturnTab;
    private final OptionStatisticsTradableState tradableState;

    /* compiled from: OptionStatisticsFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionStatisticsFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStatisticsFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionStatisticsFragmentKey((OptionLegBundle) parcel.readParcelable(OptionStatisticsFragmentKey.class.getClassLoader()), (OptionOrderIntentKey) parcel.readParcelable(OptionStatisticsFragmentKey.class.getClassLoader()), (OptionStatisticsTradableState) parcel.readParcelable(OptionStatisticsFragmentKey.class.getClassLoader()), OptionStatisticsLaunchMode.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionStatisticsFragmentKey[] newArray(int i) {
            return new OptionStatisticsFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.optionLegBundle, flags);
        dest.writeParcelable(this.optionOrderIntentKey, flags);
        dest.writeParcelable(this.tradableState, flags);
        dest.writeString(this.launchMode.name());
        dest.writeInt(this.shouldDefaultToSimulatedReturnTab ? 1 : 0);
    }

    public OptionStatisticsFragmentKey(OptionLegBundle optionLegBundle, OptionOrderIntentKey optionOrderIntentKey, OptionStatisticsTradableState tradableState, OptionStatisticsLaunchMode launchMode, boolean z) {
        Intrinsics.checkNotNullParameter(optionLegBundle, "optionLegBundle");
        Intrinsics.checkNotNullParameter(tradableState, "tradableState");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.optionLegBundle = optionLegBundle;
        this.optionOrderIntentKey = optionOrderIntentKey;
        this.tradableState = tradableState;
        this.launchMode = launchMode;
        this.shouldDefaultToSimulatedReturnTab = z;
    }

    public final OptionLegBundle getOptionLegBundle() {
        return this.optionLegBundle;
    }

    public final OptionOrderIntentKey getOptionOrderIntentKey() {
        return this.optionOrderIntentKey;
    }

    public final OptionStatisticsTradableState getTradableState() {
        return this.tradableState;
    }

    public /* synthetic */ OptionStatisticsFragmentKey(OptionLegBundle optionLegBundle, OptionOrderIntentKey optionOrderIntentKey, OptionStatisticsTradableState optionStatisticsTradableState, OptionStatisticsLaunchMode optionStatisticsLaunchMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(optionLegBundle, (i & 2) != 0 ? null : optionOrderIntentKey, optionStatisticsTradableState, (i & 8) != 0 ? OptionStatisticsLaunchMode.NORMAL_ORDER : optionStatisticsLaunchMode, (i & 16) != 0 ? false : z);
    }

    public final OptionStatisticsLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final boolean getShouldDefaultToSimulatedReturnTab() {
        return this.shouldDefaultToSimulatedReturnTab;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }
}
