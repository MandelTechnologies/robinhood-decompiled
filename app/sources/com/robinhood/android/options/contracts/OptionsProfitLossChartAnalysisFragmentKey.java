package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p355ui.OptionOrderBundle;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitLossChartAnalysisFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "contractQuantity", "", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "overrideDirection", "Lcom/robinhood/models/db/OrderDirection;", "preserveUserInput", "", "permanentLimitPrice", "Ljava/math/BigDecimal;", "defaultPricingType", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "<init>", "(ILcom/robinhood/models/ui/OptionOrderBundle;Lcom/robinhood/models/db/OrderDirection;ZLjava/math/BigDecimal;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;)V", "getContractQuantity", "()I", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getOverrideDirection", "()Lcom/robinhood/models/db/OrderDirection;", "getPreserveUserInput", "()Z", "getPermanentLimitPrice", "()Ljava/math/BigDecimal;", "getDefaultPricingType", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "defaultTab", "Lcom/robinhood/android/navigation/keys/FragmentTab;", "getDefaultTab", "()Lcom/robinhood/android/navigation/keys/FragmentTab;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionsProfitLossChartAnalysisFragmentKey implements FragmentKey, TabFragmentKey {
    public static final Parcelable.Creator<OptionsProfitLossChartAnalysisFragmentKey> CREATOR = new Creator();
    private final int contractQuantity;
    private final OptionSettings.DefaultPricingSetting defaultPricingType;
    private final OptionOrderBundle optionOrderBundle;
    private final OrderDirection overrideDirection;
    private final BigDecimal permanentLimitPrice;
    private final boolean preserveUserInput;

    /* compiled from: OptionsProfitLossChartAnalysisFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionsProfitLossChartAnalysisFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsProfitLossChartAnalysisFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionsProfitLossChartAnalysisFragmentKey(parcel.readInt(), (OptionOrderBundle) parcel.readParcelable(OptionsProfitLossChartAnalysisFragmentKey.class.getClassLoader()), parcel.readInt() == 0 ? null : OrderDirection.valueOf(parcel.readString()), parcel.readInt() != 0, (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? OptionSettings.DefaultPricingSetting.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsProfitLossChartAnalysisFragmentKey[] newArray(int i) {
            return new OptionsProfitLossChartAnalysisFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.contractQuantity);
        dest.writeParcelable(this.optionOrderBundle, flags);
        OrderDirection orderDirection = this.overrideDirection;
        if (orderDirection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(orderDirection.name());
        }
        dest.writeInt(this.preserveUserInput ? 1 : 0);
        dest.writeSerializable(this.permanentLimitPrice);
        OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingType;
        if (defaultPricingSetting == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(defaultPricingSetting.name());
        }
    }

    public OptionsProfitLossChartAnalysisFragmentKey(int i, OptionOrderBundle optionOrderBundle, OrderDirection orderDirection, boolean z, BigDecimal bigDecimal, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
        Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
        this.contractQuantity = i;
        this.optionOrderBundle = optionOrderBundle;
        this.overrideDirection = orderDirection;
        this.preserveUserInput = z;
        this.permanentLimitPrice = bigDecimal;
        this.defaultPricingType = defaultPricingSetting;
    }

    public /* synthetic */ OptionsProfitLossChartAnalysisFragmentKey(int i, OptionOrderBundle optionOrderBundle, OrderDirection orderDirection, boolean z, BigDecimal bigDecimal, OptionSettings.DefaultPricingSetting defaultPricingSetting, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, optionOrderBundle, orderDirection, z, (i2 & 16) != 0 ? null : bigDecimal, defaultPricingSetting);
    }

    public final int getContractQuantity() {
        return this.contractQuantity;
    }

    public final OptionOrderBundle getOptionOrderBundle() {
        return this.optionOrderBundle;
    }

    public final OrderDirection getOverrideDirection() {
        return this.overrideDirection;
    }

    public final boolean getPreserveUserInput() {
        return this.preserveUserInput;
    }

    public final BigDecimal getPermanentLimitPrice() {
        return this.permanentLimitPrice;
    }

    public final OptionSettings.DefaultPricingSetting getDefaultPricingType() {
        return this.defaultPricingType;
    }

    @Override // com.robinhood.android.navigation.keys.TabFragmentKey
    public FragmentTab getDefaultTab() {
        return FragmentTab.HOME;
    }
}
