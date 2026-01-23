package com.robinhood.android.options.contracts;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import java.math.BigDecimal;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u001f2\u00020\u0001:\f\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB'\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\t !\"#$%&'(¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "Landroid/os/Parcelable;", "featureSet", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "optionStatisticsLaunchMode", "Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;", "singleLegAction", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction;", "<init>", "(Ljava/util/Set;Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction;)V", "getFeatureSet", "()Ljava/util/Set;", "getOptionStatisticsLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionStatisticsLaunchMode;", "getSingleLegAction", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction;", "hasFeature", "", "feature", "Normal", "RollingContractSelector", "WatchlistSearch", "WatchlistOnboarding", "ChainCustomizationGtm", "SideBySideChainOnboardingFirstStep", "SideBySideChainOnboardingSecondStep", "SimulatedReturnPreTradeOnboardingFirstStep", "SimulatedReturnPreTradeOnboardingSecondStep", "Feature", "SingleLegAction", "Companion", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$ChainCustomizationGtm;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Normal;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SideBySideChainOnboardingFirstStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SideBySideChainOnboardingSecondStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SimulatedReturnPreTradeOnboardingFirstStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SimulatedReturnPreTradeOnboardingSecondStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$WatchlistOnboarding;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$WatchlistSearch;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public abstract class OptionChainLaunchMode implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Feature> NORMAL_FEATURE_SET = SetsKt.setOf((Object[]) new Feature[]{Feature.BOTTOM_SHEET_UPSELLS, Feature.CHAIN_SETTINGS, Feature.DISCLOSURE, Feature.MULTILEG, Feature.POSITION_CLOSING, Feature.USE_DEFAULT_PRICING_SETTING, Feature.WATCHLIST});
    private final Set<Feature> featureSet;
    private final OptionStatisticsLaunchMode optionStatisticsLaunchMode;
    private final SingleLegAction singleLegAction;

    public /* synthetic */ OptionChainLaunchMode(Set set, OptionStatisticsLaunchMode optionStatisticsLaunchMode, SingleLegAction singleLegAction, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, optionStatisticsLaunchMode, singleLegAction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OptionChainLaunchMode(Set<? extends Feature> set, OptionStatisticsLaunchMode optionStatisticsLaunchMode, SingleLegAction singleLegAction) {
        this.featureSet = set;
        this.optionStatisticsLaunchMode = optionStatisticsLaunchMode;
        this.singleLegAction = singleLegAction;
    }

    public final Set<Feature> getFeatureSet() {
        return this.featureSet;
    }

    public final OptionStatisticsLaunchMode getOptionStatisticsLaunchMode() {
        return this.optionStatisticsLaunchMode;
    }

    public final SingleLegAction getSingleLegAction() {
        return this.singleLegAction;
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Normal;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Normal extends OptionChainLaunchMode {
        public static final Normal INSTANCE = new Normal();
        public static final Parcelable.Creator<Normal> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Normal> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Normal createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Normal.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Normal[] newArray(int i) {
                return new Normal[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Normal);
        }

        public int hashCode() {
            return 1856885764;
        }

        public String toString() {
            return "Normal";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Normal() {
            super(SetsKt.plus(OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), Feature.BUILDER_TAB), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$RollingContractSelector;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "optionInstrumentToRoll", "Lcom/robinhood/models/db/OptionInstrument;", "positionType", "Lcom/robinhood/models/db/OptionPositionType;", "quantity", "Ljava/math/BigDecimal;", "strategyCode", "", "settleOnOpen", "", "<init>", "(Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionPositionType;Ljava/math/BigDecimal;Ljava/lang/String;Z)V", "getOptionInstrumentToRoll", "()Lcom/robinhood/models/db/OptionInstrument;", "getPositionType", "()Lcom/robinhood/models/db/OptionPositionType;", "getQuantity", "()Ljava/math/BigDecimal;", "getStrategyCode", "()Ljava/lang/String;", "getSettleOnOpen", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RollingContractSelector extends OptionChainLaunchMode {
        public static final Parcelable.Creator<RollingContractSelector> CREATOR = new Creator();
        private final OptionInstrument optionInstrumentToRoll;
        private final OptionPositionType positionType;
        private final BigDecimal quantity;
        private final boolean settleOnOpen;
        private final String strategyCode;

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<RollingContractSelector> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RollingContractSelector createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RollingContractSelector((OptionInstrument) parcel.readParcelable(RollingContractSelector.class.getClassLoader()), OptionPositionType.valueOf(parcel.readString()), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RollingContractSelector[] newArray(int i) {
                return new RollingContractSelector[i];
            }
        }

        public static /* synthetic */ RollingContractSelector copy$default(RollingContractSelector rollingContractSelector, OptionInstrument optionInstrument, OptionPositionType optionPositionType, BigDecimal bigDecimal, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                optionInstrument = rollingContractSelector.optionInstrumentToRoll;
            }
            if ((i & 2) != 0) {
                optionPositionType = rollingContractSelector.positionType;
            }
            if ((i & 4) != 0) {
                bigDecimal = rollingContractSelector.quantity;
            }
            if ((i & 8) != 0) {
                str = rollingContractSelector.strategyCode;
            }
            if ((i & 16) != 0) {
                z = rollingContractSelector.settleOnOpen;
            }
            boolean z2 = z;
            BigDecimal bigDecimal2 = bigDecimal;
            return rollingContractSelector.copy(optionInstrument, optionPositionType, bigDecimal2, str, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionInstrument getOptionInstrumentToRoll() {
            return this.optionInstrumentToRoll;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionPositionType getPositionType() {
            return this.positionType;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSettleOnOpen() {
            return this.settleOnOpen;
        }

        public final RollingContractSelector copy(OptionInstrument optionInstrumentToRoll, OptionPositionType positionType, BigDecimal quantity, String strategyCode, boolean settleOnOpen) {
            Intrinsics.checkNotNullParameter(optionInstrumentToRoll, "optionInstrumentToRoll");
            Intrinsics.checkNotNullParameter(positionType, "positionType");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            return new RollingContractSelector(optionInstrumentToRoll, positionType, quantity, strategyCode, settleOnOpen);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RollingContractSelector)) {
                return false;
            }
            RollingContractSelector rollingContractSelector = (RollingContractSelector) other;
            return Intrinsics.areEqual(this.optionInstrumentToRoll, rollingContractSelector.optionInstrumentToRoll) && this.positionType == rollingContractSelector.positionType && Intrinsics.areEqual(this.quantity, rollingContractSelector.quantity) && Intrinsics.areEqual(this.strategyCode, rollingContractSelector.strategyCode) && this.settleOnOpen == rollingContractSelector.settleOnOpen;
        }

        public int hashCode() {
            return (((((((this.optionInstrumentToRoll.hashCode() * 31) + this.positionType.hashCode()) * 31) + this.quantity.hashCode()) * 31) + this.strategyCode.hashCode()) * 31) + Boolean.hashCode(this.settleOnOpen);
        }

        public String toString() {
            return "RollingContractSelector(optionInstrumentToRoll=" + this.optionInstrumentToRoll + ", positionType=" + this.positionType + ", quantity=" + this.quantity + ", strategyCode=" + this.strategyCode + ", settleOnOpen=" + this.settleOnOpen + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.optionInstrumentToRoll, flags);
            dest.writeString(this.positionType.name());
            dest.writeSerializable(this.quantity);
            dest.writeString(this.strategyCode);
            dest.writeInt(this.settleOnOpen ? 1 : 0);
        }

        public final OptionInstrument getOptionInstrumentToRoll() {
            return this.optionInstrumentToRoll;
        }

        public final OptionPositionType getPositionType() {
            return this.positionType;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final boolean getSettleOnOpen() {
            return this.settleOnOpen;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RollingContractSelector(OptionInstrument optionInstrumentToRoll, OptionPositionType positionType, BigDecimal quantity, String strategyCode, boolean z) {
            super(SetsKt.setOf((Object[]) new Feature[]{Feature.ROLLING_HEADER_VIEW, Feature.FORCE_FOCUSED_CHAIN}), OptionStatisticsLaunchMode.ROLL, SingleLegAction.Roll.INSTANCE, null);
            Intrinsics.checkNotNullParameter(optionInstrumentToRoll, "optionInstrumentToRoll");
            Intrinsics.checkNotNullParameter(positionType, "positionType");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
            this.optionInstrumentToRoll = optionInstrumentToRoll;
            this.positionType = positionType;
            this.quantity = quantity;
            this.strategyCode = strategyCode;
            this.settleOnOpen = z;
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$WatchlistSearch;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WatchlistSearch extends OptionChainLaunchMode {
        public static final WatchlistSearch INSTANCE = new WatchlistSearch();
        public static final Parcelable.Creator<WatchlistSearch> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WatchlistSearch> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WatchlistSearch createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WatchlistSearch.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WatchlistSearch[] newArray(int i) {
                return new WatchlistSearch[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WatchlistSearch);
        }

        public int hashCode() {
            return -576881800;
        }

        public String toString() {
            return "WatchlistSearch";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private WatchlistSearch() {
            super(SetsKt.plus(OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), Feature.FORCE_BOTTOM_SHEET_FOR_L2), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$WatchlistOnboarding;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WatchlistOnboarding extends OptionChainLaunchMode {
        public static final WatchlistOnboarding INSTANCE = new WatchlistOnboarding();
        public static final Parcelable.Creator<WatchlistOnboarding> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<WatchlistOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WatchlistOnboarding createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WatchlistOnboarding.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WatchlistOnboarding[] newArray(int i) {
                return new WatchlistOnboarding[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof WatchlistOnboarding);
        }

        public int hashCode() {
            return -1094327317;
        }

        public String toString() {
            return "WatchlistOnboarding";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private WatchlistOnboarding() {
            super(SetsKt.plus((Set) OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), (Iterable) CollectionsKt.listOf((Object[]) new Feature[]{Feature.FORCE_BOTTOM_SHEET_FOR_L2, Feature.FORCE_WATCHLIST_BOTTOM_SHEET})), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$ChainCustomizationGtm;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChainCustomizationGtm extends OptionChainLaunchMode {
        public static final ChainCustomizationGtm INSTANCE = new ChainCustomizationGtm();
        public static final Parcelable.Creator<ChainCustomizationGtm> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ChainCustomizationGtm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChainCustomizationGtm createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChainCustomizationGtm.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChainCustomizationGtm[] newArray(int i) {
                return new ChainCustomizationGtm[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof ChainCustomizationGtm);
        }

        public int hashCode() {
            return -1326473103;
        }

        public String toString() {
            return "ChainCustomizationGtm";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private ChainCustomizationGtm() {
            super(SetsKt.plus(OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), Feature.FORCE_IAC_ALERT_SHEET), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SideBySideChainOnboardingFirstStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SideBySideChainOnboardingFirstStep extends OptionChainLaunchMode {
        public static final SideBySideChainOnboardingFirstStep INSTANCE = new SideBySideChainOnboardingFirstStep();
        public static final Parcelable.Creator<SideBySideChainOnboardingFirstStep> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SideBySideChainOnboardingFirstStep> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SideBySideChainOnboardingFirstStep createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SideBySideChainOnboardingFirstStep.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SideBySideChainOnboardingFirstStep[] newArray(int i) {
                return new SideBySideChainOnboardingFirstStep[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SideBySideChainOnboardingFirstStep);
        }

        public int hashCode() {
            return 1587151490;
        }

        public String toString() {
            return "SideBySideChainOnboardingFirstStep";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private SideBySideChainOnboardingFirstStep() {
            super(SetsKt.plus((Set<? extends Feature>) SetsKt.plus((Set<? extends Feature>) SetsKt.plus((Set<? extends Feature>) SetsKt.plus(OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), Feature.FORCE_SIDE_BY_SIDE_CHAIN_WHEN_ENTERING), Feature.ONBOARDING_SEARCH_POPUP), Feature.ONBOARDING_DISCLOSURE), Feature.SIDE_BY_SIDE_CHAIN_DEEPLINK), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SideBySideChainOnboardingSecondStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SideBySideChainOnboardingSecondStep extends OptionChainLaunchMode {
        public static final SideBySideChainOnboardingSecondStep INSTANCE = new SideBySideChainOnboardingSecondStep();
        public static final Parcelable.Creator<SideBySideChainOnboardingSecondStep> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SideBySideChainOnboardingSecondStep> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SideBySideChainOnboardingSecondStep createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SideBySideChainOnboardingSecondStep.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SideBySideChainOnboardingSecondStep[] newArray(int i) {
                return new SideBySideChainOnboardingSecondStep[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SideBySideChainOnboardingSecondStep);
        }

        public int hashCode() {
            return -1742179014;
        }

        public String toString() {
            return "SideBySideChainOnboardingSecondStep";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private SideBySideChainOnboardingSecondStep() {
            super(SetsKt.plus((Set<? extends Feature>) SetsKt.plus(OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), Feature.FORCE_SIDE_BY_SIDE_CHAIN_WHEN_ENTERING), Feature.SIDE_BY_SIDE_CHAIN_DEEPLINK), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SimulatedReturnPreTradeOnboardingFirstStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SimulatedReturnPreTradeOnboardingFirstStep extends OptionChainLaunchMode {
        public static final SimulatedReturnPreTradeOnboardingFirstStep INSTANCE = new SimulatedReturnPreTradeOnboardingFirstStep();
        public static final Parcelable.Creator<SimulatedReturnPreTradeOnboardingFirstStep> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SimulatedReturnPreTradeOnboardingFirstStep> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimulatedReturnPreTradeOnboardingFirstStep createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SimulatedReturnPreTradeOnboardingFirstStep.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimulatedReturnPreTradeOnboardingFirstStep[] newArray(int i) {
                return new SimulatedReturnPreTradeOnboardingFirstStep[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SimulatedReturnPreTradeOnboardingFirstStep);
        }

        public int hashCode() {
            return 1982459373;
        }

        public String toString() {
            return "SimulatedReturnPreTradeOnboardingFirstStep";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private SimulatedReturnPreTradeOnboardingFirstStep() {
            super(SetsKt.plus((Set<? extends Feature>) SetsKt.plus((Set<? extends Feature>) SetsKt.plus((Set<? extends Feature>) SetsKt.plus((Set<? extends Feature>) SetsKt.minus(OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), Feature.BOTTOM_SHEET_UPSELLS), Feature.BUILDER_TAB), Feature.ONBOARDING_SEARCH_POPUP), Feature.ONBOARDING_DISCLOSURE), Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SimulatedReturnPreTradeOnboardingSecondStep;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SimulatedReturnPreTradeOnboardingSecondStep extends OptionChainLaunchMode {
        public static final SimulatedReturnPreTradeOnboardingSecondStep INSTANCE = new SimulatedReturnPreTradeOnboardingSecondStep();
        public static final Parcelable.Creator<SimulatedReturnPreTradeOnboardingSecondStep> CREATOR = new Creator();

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SimulatedReturnPreTradeOnboardingSecondStep> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimulatedReturnPreTradeOnboardingSecondStep createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SimulatedReturnPreTradeOnboardingSecondStep.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SimulatedReturnPreTradeOnboardingSecondStep[] newArray(int i) {
                return new SimulatedReturnPreTradeOnboardingSecondStep[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof SimulatedReturnPreTradeOnboardingSecondStep);
        }

        public int hashCode() {
            return 1922430767;
        }

        public String toString() {
            return "SimulatedReturnPreTradeOnboardingSecondStep";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private SimulatedReturnPreTradeOnboardingSecondStep() {
            super(SetsKt.plus((Set<? extends Feature>) SetsKt.plus((Set<? extends Feature>) SetsKt.minus(OptionChainLaunchMode.INSTANCE.getNORMAL_FEATURE_SET(), Feature.BOTTOM_SHEET_UPSELLS), Feature.BUILDER_TAB), Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK), OptionStatisticsLaunchMode.NORMAL_ORDER, SingleLegAction.Order.INSTANCE, null);
        }
    }

    public final boolean hasFeature(Feature feature) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        return this.featureSet.contains(feature);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "", "<init>", "(Ljava/lang/String;I)V", "ACHROMATIC", "BOTTOM_SHEET_UPSELLS", "BUILDER_TAB", "CHAIN_SETTINGS", "DISABLE_DEFAULT_ORDER_FILTER", "DISCLOSURE", "FORCE_BOTTOM_SHEET_FOR_L2", "FORCE_WATCHLIST_BOTTOM_SHEET", "FORCE_IAC_ALERT_SHEET", "FORCE_FOCUSED_CHAIN", "FORCE_SIDE_BY_SIDE_CHAIN_WHEN_ENTERING", "MULTILEG", "POSITION_CLOSING", "ROLLING_HEADER_VIEW", "ONBOARDING_SEARCH_POPUP", "ONBOARDING_DISCLOSURE", "SIDE_BY_SIDE_CHAIN_DEEPLINK", "SIMULATED_RETURN_PRE_TRADE_DEEPLINK", "USE_DEFAULT_PRICING_SETTING", EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Feature {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Feature[] $VALUES;
        public static final Feature ACHROMATIC = new Feature("ACHROMATIC", 0);
        public static final Feature BOTTOM_SHEET_UPSELLS = new Feature("BOTTOM_SHEET_UPSELLS", 1);
        public static final Feature BUILDER_TAB = new Feature("BUILDER_TAB", 2);
        public static final Feature CHAIN_SETTINGS = new Feature("CHAIN_SETTINGS", 3);
        public static final Feature DISABLE_DEFAULT_ORDER_FILTER = new Feature("DISABLE_DEFAULT_ORDER_FILTER", 4);
        public static final Feature DISCLOSURE = new Feature("DISCLOSURE", 5);
        public static final Feature FORCE_BOTTOM_SHEET_FOR_L2 = new Feature("FORCE_BOTTOM_SHEET_FOR_L2", 6);
        public static final Feature FORCE_WATCHLIST_BOTTOM_SHEET = new Feature("FORCE_WATCHLIST_BOTTOM_SHEET", 7);
        public static final Feature FORCE_IAC_ALERT_SHEET = new Feature("FORCE_IAC_ALERT_SHEET", 8);
        public static final Feature FORCE_FOCUSED_CHAIN = new Feature("FORCE_FOCUSED_CHAIN", 9);
        public static final Feature FORCE_SIDE_BY_SIDE_CHAIN_WHEN_ENTERING = new Feature("FORCE_SIDE_BY_SIDE_CHAIN_WHEN_ENTERING", 10);
        public static final Feature MULTILEG = new Feature("MULTILEG", 11);
        public static final Feature POSITION_CLOSING = new Feature("POSITION_CLOSING", 12);
        public static final Feature ROLLING_HEADER_VIEW = new Feature("ROLLING_HEADER_VIEW", 13);
        public static final Feature ONBOARDING_SEARCH_POPUP = new Feature("ONBOARDING_SEARCH_POPUP", 14);
        public static final Feature ONBOARDING_DISCLOSURE = new Feature("ONBOARDING_DISCLOSURE", 15);
        public static final Feature SIDE_BY_SIDE_CHAIN_DEEPLINK = new Feature("SIDE_BY_SIDE_CHAIN_DEEPLINK", 16);
        public static final Feature SIMULATED_RETURN_PRE_TRADE_DEEPLINK = new Feature("SIMULATED_RETURN_PRE_TRADE_DEEPLINK", 17);
        public static final Feature USE_DEFAULT_PRICING_SETTING = new Feature("USE_DEFAULT_PRICING_SETTING", 18);
        public static final Feature WATCHLIST = new Feature(EducationTourElementIds.ADD_TO_WATCHLIST_ELEMENT_ID, 19);

        private static final /* synthetic */ Feature[] $values() {
            return new Feature[]{ACHROMATIC, BOTTOM_SHEET_UPSELLS, BUILDER_TAB, CHAIN_SETTINGS, DISABLE_DEFAULT_ORDER_FILTER, DISCLOSURE, FORCE_BOTTOM_SHEET_FOR_L2, FORCE_WATCHLIST_BOTTOM_SHEET, FORCE_IAC_ALERT_SHEET, FORCE_FOCUSED_CHAIN, FORCE_SIDE_BY_SIDE_CHAIN_WHEN_ENTERING, MULTILEG, POSITION_CLOSING, ROLLING_HEADER_VIEW, ONBOARDING_SEARCH_POPUP, ONBOARDING_DISCLOSURE, SIDE_BY_SIDE_CHAIN_DEEPLINK, SIMULATED_RETURN_PRE_TRADE_DEEPLINK, USE_DEFAULT_PRICING_SETTING, WATCHLIST};
        }

        public static EnumEntries<Feature> getEntries() {
            return $ENTRIES;
        }

        private Feature(String str, int i) {
        }

        static {
            Feature[] featureArr$values = $values();
            $VALUES = featureArr$values;
            $ENTRIES = EnumEntries2.enumEntries(featureArr$values);
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) $VALUES.clone();
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction;", "", "<init>", "()V", "Order", "Roll", "None", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction$None;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction$Order;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction$Roll;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class SingleLegAction {
        public /* synthetic */ SingleLegAction(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction$Order;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Order extends SingleLegAction {
            public static final Order INSTANCE = new Order();

            public boolean equals(Object other) {
                return this == other || (other instanceof Order);
            }

            public int hashCode() {
                return 1107400831;
            }

            public String toString() {
                return "Order";
            }

            private Order() {
                super(null);
            }
        }

        private SingleLegAction() {
        }

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction$Roll;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction;", "<init>", "()V", "EXTRA_SELECTED_INSTRUMENT", "", "getResultData", "Landroid/content/Intent;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "equals", "", "other", "", "hashCode", "", "toString", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Roll extends SingleLegAction {
            public static final String EXTRA_SELECTED_INSTRUMENT = "selectedInstrument";
            public static final Roll INSTANCE = new Roll();

            public boolean equals(Object other) {
                return this == other || (other instanceof Roll);
            }

            public int hashCode() {
                return -795474644;
            }

            public String toString() {
                return "Roll";
            }

            private Roll() {
                super(null);
            }

            public final Intent getResultData(OptionInstrument optionInstrument) {
                Intrinsics.checkNotNullParameter(optionInstrument, "optionInstrument");
                Intent intent = new Intent();
                intent.putExtra(EXTRA_SELECTED_INSTRUMENT, optionInstrument);
                return intent;
            }
        }

        /* compiled from: OptionChainLaunchMode.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction$None;", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$SingleLegAction;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None extends SingleLegAction {
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -795593753;
            }

            public String toString() {
                return "None";
            }

            private None() {
                super(null);
            }
        }
    }

    /* compiled from: OptionChainLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Companion;", "", "<init>", "()V", "NORMAL_FEATURE_SET", "", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode$Feature;", "getNORMAL_FEATURE_SET", "()Ljava/util/Set;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<Feature> getNORMAL_FEATURE_SET() {
            return OptionChainLaunchMode.NORMAL_FEATURE_SET;
        }
    }
}
