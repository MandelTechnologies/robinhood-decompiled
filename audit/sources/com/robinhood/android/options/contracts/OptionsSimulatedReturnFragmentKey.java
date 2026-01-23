package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsSimulatedReturnFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "activeChartSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "strategyCode", "", "isLegContext", "", "fixedAccountNumber", "useWatchlist", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/String;ZLjava/lang/String;ZLcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "getActiveChartSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getStrategyCode", "()Ljava/lang/String;", "()Z", "getFixedAccountNumber", "getUseWatchlist", "getUnderlyingType", "()Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OptionsSimulatedReturnFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<OptionsSimulatedReturnFragmentKey> CREATOR = new Creator();
    private final DisplaySpan activeChartSpan;
    private final String fixedAccountNumber;
    private final boolean isLegContext;
    private final String strategyCode;
    private final OptionChain.UnderlyingType underlyingType;
    private final boolean useWatchlist;

    /* compiled from: OptionsSimulatedReturnFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<OptionsSimulatedReturnFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsSimulatedReturnFragmentKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            DisplaySpan displaySpanValueOf = DisplaySpan.valueOf(parcel.readString());
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new OptionsSimulatedReturnFragmentKey(displaySpanValueOf, string2, z3, string3, z2, OptionChain.UnderlyingType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsSimulatedReturnFragmentKey[] newArray(int i) {
            return new OptionsSimulatedReturnFragmentKey[i];
        }
    }

    public static /* synthetic */ OptionsSimulatedReturnFragmentKey copy$default(OptionsSimulatedReturnFragmentKey optionsSimulatedReturnFragmentKey, DisplaySpan displaySpan, String str, boolean z, String str2, boolean z2, OptionChain.UnderlyingType underlyingType, int i, Object obj) {
        if ((i & 1) != 0) {
            displaySpan = optionsSimulatedReturnFragmentKey.activeChartSpan;
        }
        if ((i & 2) != 0) {
            str = optionsSimulatedReturnFragmentKey.strategyCode;
        }
        if ((i & 4) != 0) {
            z = optionsSimulatedReturnFragmentKey.isLegContext;
        }
        if ((i & 8) != 0) {
            str2 = optionsSimulatedReturnFragmentKey.fixedAccountNumber;
        }
        if ((i & 16) != 0) {
            z2 = optionsSimulatedReturnFragmentKey.useWatchlist;
        }
        if ((i & 32) != 0) {
            underlyingType = optionsSimulatedReturnFragmentKey.underlyingType;
        }
        boolean z3 = z2;
        OptionChain.UnderlyingType underlyingType2 = underlyingType;
        return optionsSimulatedReturnFragmentKey.copy(displaySpan, str, z, str2, z3, underlyingType2);
    }

    /* renamed from: component1, reason: from getter */
    public final DisplaySpan getActiveChartSpan() {
        return this.activeChartSpan;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLegContext() {
        return this.isLegContext;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFixedAccountNumber() {
        return this.fixedAccountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUseWatchlist() {
        return this.useWatchlist;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }

    public final OptionsSimulatedReturnFragmentKey copy(DisplaySpan activeChartSpan, String strategyCode, boolean isLegContext, String fixedAccountNumber, boolean useWatchlist, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(activeChartSpan, "activeChartSpan");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(fixedAccountNumber, "fixedAccountNumber");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        return new OptionsSimulatedReturnFragmentKey(activeChartSpan, strategyCode, isLegContext, fixedAccountNumber, useWatchlist, underlyingType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnFragmentKey)) {
            return false;
        }
        OptionsSimulatedReturnFragmentKey optionsSimulatedReturnFragmentKey = (OptionsSimulatedReturnFragmentKey) other;
        return this.activeChartSpan == optionsSimulatedReturnFragmentKey.activeChartSpan && Intrinsics.areEqual(this.strategyCode, optionsSimulatedReturnFragmentKey.strategyCode) && this.isLegContext == optionsSimulatedReturnFragmentKey.isLegContext && Intrinsics.areEqual(this.fixedAccountNumber, optionsSimulatedReturnFragmentKey.fixedAccountNumber) && this.useWatchlist == optionsSimulatedReturnFragmentKey.useWatchlist && this.underlyingType == optionsSimulatedReturnFragmentKey.underlyingType;
    }

    public int hashCode() {
        return (((((((((this.activeChartSpan.hashCode() * 31) + this.strategyCode.hashCode()) * 31) + Boolean.hashCode(this.isLegContext)) * 31) + this.fixedAccountNumber.hashCode()) * 31) + Boolean.hashCode(this.useWatchlist)) * 31) + this.underlyingType.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnFragmentKey(activeChartSpan=" + this.activeChartSpan + ", strategyCode=" + this.strategyCode + ", isLegContext=" + this.isLegContext + ", fixedAccountNumber=" + this.fixedAccountNumber + ", useWatchlist=" + this.useWatchlist + ", underlyingType=" + this.underlyingType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.activeChartSpan.name());
        dest.writeString(this.strategyCode);
        dest.writeInt(this.isLegContext ? 1 : 0);
        dest.writeString(this.fixedAccountNumber);
        dest.writeInt(this.useWatchlist ? 1 : 0);
        dest.writeString(this.underlyingType.name());
    }

    public OptionsSimulatedReturnFragmentKey(DisplaySpan activeChartSpan, String strategyCode, boolean z, String fixedAccountNumber, boolean z2, OptionChain.UnderlyingType underlyingType) {
        Intrinsics.checkNotNullParameter(activeChartSpan, "activeChartSpan");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(fixedAccountNumber, "fixedAccountNumber");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        this.activeChartSpan = activeChartSpan;
        this.strategyCode = strategyCode;
        this.isLegContext = z;
        this.fixedAccountNumber = fixedAccountNumber;
        this.useWatchlist = z2;
        this.underlyingType = underlyingType;
    }

    public final DisplaySpan getActiveChartSpan() {
        return this.activeChartSpan;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final boolean isLegContext() {
        return this.isLegContext;
    }

    public final String getFixedAccountNumber() {
        return this.fixedAccountNumber;
    }

    public final boolean getUseWatchlist() {
        return this.useWatchlist;
    }

    public final OptionChain.UnderlyingType getUnderlyingType() {
        return this.underlyingType;
    }
}
