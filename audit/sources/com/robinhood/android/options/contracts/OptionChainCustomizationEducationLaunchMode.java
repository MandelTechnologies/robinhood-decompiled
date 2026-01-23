package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.api.OptionStrategyType;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainCustomizationEducationLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "()V", "MainChain", "StrategyBuilder", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode$MainChain;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode$StrategyBuilder;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class OptionChainCustomizationEducationLaunchMode implements FragmentKey {
    public /* synthetic */ OptionChainCustomizationEducationLaunchMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionChainCustomizationEducationLaunchMode() {
    }

    /* compiled from: OptionChainCustomizationEducationLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode$MainChain;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "<init>", "(Lcom/robinhood/models/db/OrderSide;)V", "getOrderSide", "()Lcom/robinhood/models/db/OrderSide;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class MainChain extends OptionChainCustomizationEducationLaunchMode {
        public static final Parcelable.Creator<MainChain> CREATOR = new Creator();
        private final OrderSide orderSide;

        /* compiled from: OptionChainCustomizationEducationLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<MainChain> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MainChain createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MainChain(OrderSide.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MainChain[] newArray(int i) {
                return new MainChain[i];
            }
        }

        public static /* synthetic */ MainChain copy$default(MainChain mainChain, OrderSide orderSide, int i, Object obj) {
            if ((i & 1) != 0) {
                orderSide = mainChain.orderSide;
            }
            return mainChain.copy(orderSide);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        public final MainChain copy(OrderSide orderSide) {
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            return new MainChain(orderSide);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MainChain) && this.orderSide == ((MainChain) other).orderSide;
        }

        public int hashCode() {
            return this.orderSide.hashCode();
        }

        public String toString() {
            return "MainChain(orderSide=" + this.orderSide + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.orderSide.name());
        }

        public final OrderSide getOrderSide() {
            return this.orderSide;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainChain(OrderSide orderSide) {
            super(null);
            Intrinsics.checkNotNullParameter(orderSide, "orderSide");
            this.orderSide = orderSide;
        }
    }

    /* compiled from: OptionChainCustomizationEducationLaunchMode.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode$StrategyBuilder;", "Lcom/robinhood/android/options/contracts/OptionChainCustomizationEducationLaunchMode;", "strategyType", "Lcom/robinhood/models/api/OptionStrategyType;", "<init>", "(Lcom/robinhood/models/api/OptionStrategyType;)V", "getStrategyType", "()Lcom/robinhood/models/api/OptionStrategyType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StrategyBuilder extends OptionChainCustomizationEducationLaunchMode {
        public static final Parcelable.Creator<StrategyBuilder> CREATOR = new Creator();
        private final OptionStrategyType strategyType;

        /* compiled from: OptionChainCustomizationEducationLaunchMode.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<StrategyBuilder> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyBuilder createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StrategyBuilder(OptionStrategyType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StrategyBuilder[] newArray(int i) {
                return new StrategyBuilder[i];
            }
        }

        public static /* synthetic */ StrategyBuilder copy$default(StrategyBuilder strategyBuilder, OptionStrategyType optionStrategyType, int i, Object obj) {
            if ((i & 1) != 0) {
                optionStrategyType = strategyBuilder.strategyType;
            }
            return strategyBuilder.copy(optionStrategyType);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionStrategyType getStrategyType() {
            return this.strategyType;
        }

        public final StrategyBuilder copy(OptionStrategyType strategyType) {
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            return new StrategyBuilder(strategyType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StrategyBuilder) && this.strategyType == ((StrategyBuilder) other).strategyType;
        }

        public int hashCode() {
            return this.strategyType.hashCode();
        }

        public String toString() {
            return "StrategyBuilder(strategyType=" + this.strategyType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.strategyType.name());
        }

        public final OptionStrategyType getStrategyType() {
            return this.strategyType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StrategyBuilder(OptionStrategyType strategyType) {
            super(null);
            Intrinsics.checkNotNullParameter(strategyType, "strategyType");
            this.strategyType = strategyType;
        }
    }
}
