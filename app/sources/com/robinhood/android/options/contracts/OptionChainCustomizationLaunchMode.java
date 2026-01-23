package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "()V", "MainChain", "StrategyBuilder", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode$MainChain;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode$StrategyBuilder;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class OptionChainCustomizationLaunchMode implements FragmentKey {
    public /* synthetic */ OptionChainCustomizationLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionChainCustomizationLaunchMode() {
    }

    /* compiled from: OptionChainCustomizationLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode$MainChain;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "initialHighlightedMetric", "Lcom/robinhood/android/options/contracts/InitialHighlightedMetric;", "<init>", "(Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/android/options/contracts/InitialHighlightedMetric;)V", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "getInitialHighlightedMetric", "()Lcom/robinhood/android/options/contracts/InitialHighlightedMetric;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MainChain extends OptionChainCustomizationLaunchMode {
        public static final Parcelable.Creator<MainChain> CREATOR = new Creator();
        private final OptionChainCustomizationLaunchMode2 initialHighlightedMetric;
        private final OrderSide orderSide;

        /* compiled from: OptionChainCustomizationLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<MainChain> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MainChain createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MainChain(OrderSide.valueOf(parcel.readString()), OptionChainCustomizationLaunchMode2.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MainChain[] newArray(int i) {
                return new MainChain[i];
            }
        }

        public static /* synthetic */ MainChain copy$default(MainChain mainChain, OrderSide orderSide, OptionChainCustomizationLaunchMode2 optionChainCustomizationLaunchMode2, int i, Object obj) {
            if ((i & 1) != 0) {
                orderSide = mainChain.orderSide;
            }
            if ((i & 2) != 0) {
                optionChainCustomizationLaunchMode2 = mainChain.initialHighlightedMetric;
            }
            return mainChain.copy(orderSide, optionChainCustomizationLaunchMode2);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionChainCustomizationLaunchMode2 getInitialHighlightedMetric() {
            return this.initialHighlightedMetric;
        }

        public final MainChain copy(OrderSide orderSide, OptionChainCustomizationLaunchMode2 initialHighlightedMetric) {
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(initialHighlightedMetric, "initialHighlightedMetric");
            return new MainChain(orderSide, initialHighlightedMetric);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainChain)) {
                return false;
            }
            MainChain mainChain = (MainChain) other;
            return this.orderSide == mainChain.orderSide && this.initialHighlightedMetric == mainChain.initialHighlightedMetric;
        }

        public int hashCode() {
            return (this.orderSide.hashCode() * 31) + this.initialHighlightedMetric.hashCode();
        }

        public String toString() {
            return "MainChain(orderSide=" + this.orderSide + ", initialHighlightedMetric=" + this.initialHighlightedMetric + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.orderSide.name());
            dest.writeString(this.initialHighlightedMetric.name());
        }

        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        public /* synthetic */ MainChain(OrderSide orderSide, OptionChainCustomizationLaunchMode2 optionChainCustomizationLaunchMode2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(orderSide, (i & 2) != 0 ? OptionChainCustomizationLaunchMode2.METRIC_ONE : optionChainCustomizationLaunchMode2);
        }

        public final OptionChainCustomizationLaunchMode2 getInitialHighlightedMetric() {
            return this.initialHighlightedMetric;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainChain(OrderSide orderSide, OptionChainCustomizationLaunchMode2 initialHighlightedMetric) {
            super(null);
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            Intrinsics.checkNotNullParameter(initialHighlightedMetric, "initialHighlightedMetric");
            this.orderSide = orderSide;
            this.initialHighlightedMetric = initialHighlightedMetric;
        }
    }

    /* compiled from: OptionChainCustomizationLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode$StrategyBuilder;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationLaunchMode;", "strategyType", "Lcom/robinhood/models/api/OptionStrategyType;", "source", "", "<init>", "(Lcom/robinhood/models/api/OptionStrategyType;Ljava/lang/String;)V", "getStrategyType", "()Lcom/robinhood/models/api/OptionStrategyType;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StrategyBuilder extends OptionChainCustomizationLaunchMode {
        public static final Parcelable.Creator<StrategyBuilder> CREATOR = new Creator();
        private final String source;
        private final OptionStrategyType strategyType;

        /* compiled from: OptionChainCustomizationLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<StrategyBuilder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyBuilder createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StrategyBuilder(OptionStrategyType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyBuilder[] newArray(int i) {
                return new StrategyBuilder[i];
            }
        }

        public static /* synthetic */ StrategyBuilder copy$default(StrategyBuilder strategyBuilder, OptionStrategyType optionStrategyType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                optionStrategyType = strategyBuilder.strategyType;
            }
            if ((i & 2) != 0) {
                str = strategyBuilder.source;
            }
            return strategyBuilder.copy(optionStrategyType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionStrategyType getStrategyType() {
            return this.strategyType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final StrategyBuilder copy(OptionStrategyType strategyType, String source) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new StrategyBuilder(strategyType, source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StrategyBuilder)) {
                return false;
            }
            StrategyBuilder strategyBuilder = (StrategyBuilder) other;
            return this.strategyType == strategyBuilder.strategyType && Intrinsics.areEqual(this.source, strategyBuilder.source);
        }

        public int hashCode() {
            int iHashCode = this.strategyType.hashCode() * 31;
            String str = this.source;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "StrategyBuilder(strategyType=" + this.strategyType + ", source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.strategyType.name());
            dest.writeString(this.source);
        }

        public /* synthetic */ StrategyBuilder(OptionStrategyType optionStrategyType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(optionStrategyType, (i & 2) != 0 ? null : str);
        }

        public final OptionStrategyType getStrategyType() {
            return this.strategyType;
        }

        public final String getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrategyBuilder(OptionStrategyType strategyType, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.strategyType = strategyType;
            this.source = str;
        }
    }
}
