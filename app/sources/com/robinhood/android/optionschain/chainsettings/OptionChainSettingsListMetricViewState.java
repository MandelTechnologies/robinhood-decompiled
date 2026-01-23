package com.robinhood.android.optionschain.chainsettings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsListMetricViewState;", "Lcom/robinhood/android/optionschain/chainsettings/OptionChainSettingsMetricViewState;", "buySelectedMetricLabelOne", "", "buySelectedMetricLabelTwo", "sellSelectedMetricLabelOne", "sellSelectedMetricLabelTwo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuySelectedMetricLabelOne", "()Ljava/lang/String;", "getBuySelectedMetricLabelTwo", "getSellSelectedMetricLabelOne", "getSellSelectedMetricLabelTwo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainSettingsListMetricViewState implements OptionChainSettingsViewState5 {
    public static final int $stable = 0;
    private final String buySelectedMetricLabelOne;
    private final String buySelectedMetricLabelTwo;
    private final String sellSelectedMetricLabelOne;
    private final String sellSelectedMetricLabelTwo;

    public static /* synthetic */ OptionChainSettingsListMetricViewState copy$default(OptionChainSettingsListMetricViewState optionChainSettingsListMetricViewState, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionChainSettingsListMetricViewState.buySelectedMetricLabelOne;
        }
        if ((i & 2) != 0) {
            str2 = optionChainSettingsListMetricViewState.buySelectedMetricLabelTwo;
        }
        if ((i & 4) != 0) {
            str3 = optionChainSettingsListMetricViewState.sellSelectedMetricLabelOne;
        }
        if ((i & 8) != 0) {
            str4 = optionChainSettingsListMetricViewState.sellSelectedMetricLabelTwo;
        }
        return optionChainSettingsListMetricViewState.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBuySelectedMetricLabelOne() {
        return this.buySelectedMetricLabelOne;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBuySelectedMetricLabelTwo() {
        return this.buySelectedMetricLabelTwo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSellSelectedMetricLabelOne() {
        return this.sellSelectedMetricLabelOne;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSellSelectedMetricLabelTwo() {
        return this.sellSelectedMetricLabelTwo;
    }

    public final OptionChainSettingsListMetricViewState copy(String buySelectedMetricLabelOne, String buySelectedMetricLabelTwo, String sellSelectedMetricLabelOne, String sellSelectedMetricLabelTwo) {
        Intrinsics.checkNotNullParameter(buySelectedMetricLabelOne, "buySelectedMetricLabelOne");
        Intrinsics.checkNotNullParameter(buySelectedMetricLabelTwo, "buySelectedMetricLabelTwo");
        Intrinsics.checkNotNullParameter(sellSelectedMetricLabelOne, "sellSelectedMetricLabelOne");
        Intrinsics.checkNotNullParameter(sellSelectedMetricLabelTwo, "sellSelectedMetricLabelTwo");
        return new OptionChainSettingsListMetricViewState(buySelectedMetricLabelOne, buySelectedMetricLabelTwo, sellSelectedMetricLabelOne, sellSelectedMetricLabelTwo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainSettingsListMetricViewState)) {
            return false;
        }
        OptionChainSettingsListMetricViewState optionChainSettingsListMetricViewState = (OptionChainSettingsListMetricViewState) other;
        return Intrinsics.areEqual(this.buySelectedMetricLabelOne, optionChainSettingsListMetricViewState.buySelectedMetricLabelOne) && Intrinsics.areEqual(this.buySelectedMetricLabelTwo, optionChainSettingsListMetricViewState.buySelectedMetricLabelTwo) && Intrinsics.areEqual(this.sellSelectedMetricLabelOne, optionChainSettingsListMetricViewState.sellSelectedMetricLabelOne) && Intrinsics.areEqual(this.sellSelectedMetricLabelTwo, optionChainSettingsListMetricViewState.sellSelectedMetricLabelTwo);
    }

    public int hashCode() {
        return (((((this.buySelectedMetricLabelOne.hashCode() * 31) + this.buySelectedMetricLabelTwo.hashCode()) * 31) + this.sellSelectedMetricLabelOne.hashCode()) * 31) + this.sellSelectedMetricLabelTwo.hashCode();
    }

    public String toString() {
        return "OptionChainSettingsListMetricViewState(buySelectedMetricLabelOne=" + this.buySelectedMetricLabelOne + ", buySelectedMetricLabelTwo=" + this.buySelectedMetricLabelTwo + ", sellSelectedMetricLabelOne=" + this.sellSelectedMetricLabelOne + ", sellSelectedMetricLabelTwo=" + this.sellSelectedMetricLabelTwo + ")";
    }

    public OptionChainSettingsListMetricViewState(String buySelectedMetricLabelOne, String buySelectedMetricLabelTwo, String sellSelectedMetricLabelOne, String sellSelectedMetricLabelTwo) {
        Intrinsics.checkNotNullParameter(buySelectedMetricLabelOne, "buySelectedMetricLabelOne");
        Intrinsics.checkNotNullParameter(buySelectedMetricLabelTwo, "buySelectedMetricLabelTwo");
        Intrinsics.checkNotNullParameter(sellSelectedMetricLabelOne, "sellSelectedMetricLabelOne");
        Intrinsics.checkNotNullParameter(sellSelectedMetricLabelTwo, "sellSelectedMetricLabelTwo");
        this.buySelectedMetricLabelOne = buySelectedMetricLabelOne;
        this.buySelectedMetricLabelTwo = buySelectedMetricLabelTwo;
        this.sellSelectedMetricLabelOne = sellSelectedMetricLabelOne;
        this.sellSelectedMetricLabelTwo = sellSelectedMetricLabelTwo;
    }

    public final String getBuySelectedMetricLabelOne() {
        return this.buySelectedMetricLabelOne;
    }

    public final String getBuySelectedMetricLabelTwo() {
        return this.buySelectedMetricLabelTwo;
    }

    public final String getSellSelectedMetricLabelOne() {
        return this.sellSelectedMetricLabelOne;
    }

    public final String getSellSelectedMetricLabelTwo() {
        return this.sellSelectedMetricLabelTwo;
    }
}
