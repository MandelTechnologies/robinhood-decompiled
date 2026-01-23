package com.robinhood.android.options.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderIntentKey.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0003\u0011\u0012\u0013B5\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u0082\u0001\u0002\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "initialAccountNumber", "", "source", "Lrosetta/option/OptionOrderFormSource;", "strategyCode", "transitionReason", "<init>", "(Ljava/lang/String;Lrosetta/option/OptionOrderFormSource;Ljava/lang/String;Ljava/lang/String;)V", "getInitialAccountNumber", "()Ljava/lang/String;", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "getStrategyCode", "getTransitionReason", "FromOptionOrderBundle", "FromAggregatePosition", "Companion", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromAggregatePosition;", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public abstract class OptionOrderIntentKey implements IntentKey, Parcelable {
    public static final String TRANSITION_REASON_DASHBOARD_WIDGET = "dashboardWidgetClose";
    public static final String TRANSITION_REASON_SWIPE_TO_TRADE = "swipeToTrade";
    private final String initialAccountNumber;
    private final OptionOrderFormSource source;
    private final String strategyCode;
    private final String transitionReason;

    public /* synthetic */ OptionOrderIntentKey(String str, OptionOrderFormSource optionOrderFormSource, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, optionOrderFormSource, str2, str3);
    }

    private OptionOrderIntentKey(String str, OptionOrderFormSource optionOrderFormSource, String str2, String str3) {
        this.initialAccountNumber = str;
        this.source = optionOrderFormSource;
        this.strategyCode = str2;
        this.transitionReason = str3;
    }

    public /* synthetic */ OptionOrderIntentKey(String str, OptionOrderFormSource optionOrderFormSource, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : optionOrderFormSource, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, null);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    public OptionOrderFormSource getSource() {
        return this.source;
    }

    public String getStrategyCode() {
        return this.strategyCode;
    }

    public String getTransitionReason() {
        return this.transitionReason;
    }

    /* compiled from: OptionOrderIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010;\u001a\u00020\u0011HÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J§\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010C\u001a\u00020DJ\u0013\u0010E\u001a\u00020\u00112\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020DHÖ\u0001J\t\u0010I\u001a\u00020\u0005HÖ\u0001J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020DR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\u0013\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001f¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromOptionOrderBundle;", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "defaultPricingSettingOverride", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "initialAccountNumber", "", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "orderToReplace", "Lcom/robinhood/models/ui/UiOptionOrder;", "orderIdToPlaceAgain", "Ljava/util/UUID;", "prefilledOrderType", "Lcom/robinhood/models/db/OptionOrderType;", "prefilledTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "shouldSetInitialFocusToLimitPrice", "", "shouldSetInitialFocusToStopPrice", "shouldIgnoreDefaultPricing", "chainDisplayModeForLogging", "Lcom/robinhood/models/ui/OptionChainDisplayMode;", "source", "Lrosetta/option/OptionOrderFormSource;", "strategyCode", "transitionReason", "<init>", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Ljava/lang/String;Lcom/robinhood/models/ui/OptionOrderBundle;Lcom/robinhood/models/ui/UiOptionOrder;Ljava/util/UUID;Lcom/robinhood/models/db/OptionOrderType;Lcom/robinhood/models/db/OrderTimeInForce;ZZZLcom/robinhood/models/ui/OptionChainDisplayMode;Lrosetta/option/OptionOrderFormSource;Ljava/lang/String;Ljava/lang/String;)V", "getDefaultPricingSettingOverride", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getInitialAccountNumber", "()Ljava/lang/String;", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getOrderToReplace", "()Lcom/robinhood/models/ui/UiOptionOrder;", "getOrderIdToPlaceAgain", "()Ljava/util/UUID;", "getPrefilledOrderType", "()Lcom/robinhood/models/db/OptionOrderType;", "getPrefilledTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getShouldSetInitialFocusToLimitPrice", "()Z", "getShouldSetInitialFocusToStopPrice", "getShouldIgnoreDefaultPricing", "getChainDisplayModeForLogging", "()Lcom/robinhood/models/ui/OptionChainDisplayMode;", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "getStrategyCode", "getTransitionReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FromOptionOrderBundle extends OptionOrderIntentKey {
        public static final Parcelable.Creator<FromOptionOrderBundle> CREATOR = new Creator();
        private final OptionChainDisplayMode chainDisplayModeForLogging;
        private final OptionSettings.DefaultPricingSetting defaultPricingSettingOverride;
        private final String initialAccountNumber;
        private final OptionOrderBundle optionOrderBundle;
        private final UUID orderIdToPlaceAgain;
        private final UiOptionOrder orderToReplace;
        private final OptionOrderType prefilledOrderType;
        private final OrderTimeInForce prefilledTimeInForce;
        private final boolean shouldIgnoreDefaultPricing;
        private final boolean shouldSetInitialFocusToLimitPrice;
        private final boolean shouldSetInitialFocusToStopPrice;
        private final OptionOrderFormSource source;
        private final String strategyCode;
        private final String transitionReason;

        /* compiled from: OptionOrderIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<FromOptionOrderBundle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromOptionOrderBundle createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OptionSettings.DefaultPricingSetting defaultPricingSettingValueOf = parcel.readInt() == 0 ? null : OptionSettings.DefaultPricingSetting.valueOf(parcel.readString());
                String string2 = parcel.readString();
                OptionOrderBundle optionOrderBundle = (OptionOrderBundle) parcel.readParcelable(FromOptionOrderBundle.class.getClassLoader());
                UiOptionOrder uiOptionOrder = (UiOptionOrder) parcel.readParcelable(FromOptionOrderBundle.class.getClassLoader());
                UUID uuid = (UUID) parcel.readSerializable();
                OptionOrderType optionOrderTypeValueOf = parcel.readInt() == 0 ? null : OptionOrderType.valueOf(parcel.readString());
                OrderTimeInForce orderTimeInForce = (OrderTimeInForce) parcel.readParcelable(FromOptionOrderBundle.class.getClassLoader());
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new FromOptionOrderBundle(defaultPricingSettingValueOf, string2, optionOrderBundle, uiOptionOrder, uuid, optionOrderTypeValueOf, orderTimeInForce, z3, z2, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : OptionChainDisplayMode.valueOf(parcel.readString()), parcel.readInt() != 0 ? OptionOrderFormSource.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromOptionOrderBundle[] newArray(int i) {
                return new FromOptionOrderBundle[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
            return this.defaultPricingSettingOverride;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getShouldIgnoreDefaultPricing() {
            return this.shouldIgnoreDefaultPricing;
        }

        /* renamed from: component11, reason: from getter */
        public final OptionChainDisplayMode getChainDisplayModeForLogging() {
            return this.chainDisplayModeForLogging;
        }

        /* renamed from: component12, reason: from getter */
        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        /* renamed from: component13, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        /* renamed from: component14, reason: from getter */
        public final String getTransitionReason() {
            return this.transitionReason;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        /* renamed from: component4, reason: from getter */
        public final UiOptionOrder getOrderToReplace() {
            return this.orderToReplace;
        }

        /* renamed from: component5, reason: from getter */
        public final UUID getOrderIdToPlaceAgain() {
            return this.orderIdToPlaceAgain;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionOrderType getPrefilledOrderType() {
            return this.prefilledOrderType;
        }

        /* renamed from: component7, reason: from getter */
        public final OrderTimeInForce getPrefilledTimeInForce() {
            return this.prefilledTimeInForce;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShouldSetInitialFocusToLimitPrice() {
            return this.shouldSetInitialFocusToLimitPrice;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShouldSetInitialFocusToStopPrice() {
            return this.shouldSetInitialFocusToStopPrice;
        }

        public final FromOptionOrderBundle copy(OptionSettings.DefaultPricingSetting defaultPricingSettingOverride, String initialAccountNumber, OptionOrderBundle optionOrderBundle, UiOptionOrder orderToReplace, UUID orderIdToPlaceAgain, OptionOrderType prefilledOrderType, OrderTimeInForce prefilledTimeInForce, boolean shouldSetInitialFocusToLimitPrice, boolean shouldSetInitialFocusToStopPrice, boolean shouldIgnoreDefaultPricing, OptionChainDisplayMode chainDisplayModeForLogging, OptionOrderFormSource source, String strategyCode, String transitionReason) {
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            return new FromOptionOrderBundle(defaultPricingSettingOverride, initialAccountNumber, optionOrderBundle, orderToReplace, orderIdToPlaceAgain, prefilledOrderType, prefilledTimeInForce, shouldSetInitialFocusToLimitPrice, shouldSetInitialFocusToStopPrice, shouldIgnoreDefaultPricing, chainDisplayModeForLogging, source, strategyCode, transitionReason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromOptionOrderBundle)) {
                return false;
            }
            FromOptionOrderBundle fromOptionOrderBundle = (FromOptionOrderBundle) other;
            return this.defaultPricingSettingOverride == fromOptionOrderBundle.defaultPricingSettingOverride && Intrinsics.areEqual(this.initialAccountNumber, fromOptionOrderBundle.initialAccountNumber) && Intrinsics.areEqual(this.optionOrderBundle, fromOptionOrderBundle.optionOrderBundle) && Intrinsics.areEqual(this.orderToReplace, fromOptionOrderBundle.orderToReplace) && Intrinsics.areEqual(this.orderIdToPlaceAgain, fromOptionOrderBundle.orderIdToPlaceAgain) && this.prefilledOrderType == fromOptionOrderBundle.prefilledOrderType && this.prefilledTimeInForce == fromOptionOrderBundle.prefilledTimeInForce && this.shouldSetInitialFocusToLimitPrice == fromOptionOrderBundle.shouldSetInitialFocusToLimitPrice && this.shouldSetInitialFocusToStopPrice == fromOptionOrderBundle.shouldSetInitialFocusToStopPrice && this.shouldIgnoreDefaultPricing == fromOptionOrderBundle.shouldIgnoreDefaultPricing && this.chainDisplayModeForLogging == fromOptionOrderBundle.chainDisplayModeForLogging && this.source == fromOptionOrderBundle.source && Intrinsics.areEqual(this.strategyCode, fromOptionOrderBundle.strategyCode) && Intrinsics.areEqual(this.transitionReason, fromOptionOrderBundle.transitionReason);
        }

        public int hashCode() {
            OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingOverride;
            int iHashCode = (((((defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode()) * 31) + this.initialAccountNumber.hashCode()) * 31) + this.optionOrderBundle.hashCode()) * 31;
            UiOptionOrder uiOptionOrder = this.orderToReplace;
            int iHashCode2 = (iHashCode + (uiOptionOrder == null ? 0 : uiOptionOrder.hashCode())) * 31;
            UUID uuid = this.orderIdToPlaceAgain;
            int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
            OptionOrderType optionOrderType = this.prefilledOrderType;
            int iHashCode4 = (iHashCode3 + (optionOrderType == null ? 0 : optionOrderType.hashCode())) * 31;
            OrderTimeInForce orderTimeInForce = this.prefilledTimeInForce;
            int iHashCode5 = (((((((iHashCode4 + (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode())) * 31) + Boolean.hashCode(this.shouldSetInitialFocusToLimitPrice)) * 31) + Boolean.hashCode(this.shouldSetInitialFocusToStopPrice)) * 31) + Boolean.hashCode(this.shouldIgnoreDefaultPricing)) * 31;
            OptionChainDisplayMode optionChainDisplayMode = this.chainDisplayModeForLogging;
            int iHashCode6 = (iHashCode5 + (optionChainDisplayMode == null ? 0 : optionChainDisplayMode.hashCode())) * 31;
            OptionOrderFormSource optionOrderFormSource = this.source;
            int iHashCode7 = (iHashCode6 + (optionOrderFormSource == null ? 0 : optionOrderFormSource.hashCode())) * 31;
            String str = this.strategyCode;
            int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.transitionReason;
            return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "FromOptionOrderBundle(defaultPricingSettingOverride=" + this.defaultPricingSettingOverride + ", initialAccountNumber=" + this.initialAccountNumber + ", optionOrderBundle=" + this.optionOrderBundle + ", orderToReplace=" + this.orderToReplace + ", orderIdToPlaceAgain=" + this.orderIdToPlaceAgain + ", prefilledOrderType=" + this.prefilledOrderType + ", prefilledTimeInForce=" + this.prefilledTimeInForce + ", shouldSetInitialFocusToLimitPrice=" + this.shouldSetInitialFocusToLimitPrice + ", shouldSetInitialFocusToStopPrice=" + this.shouldSetInitialFocusToStopPrice + ", shouldIgnoreDefaultPricing=" + this.shouldIgnoreDefaultPricing + ", chainDisplayModeForLogging=" + this.chainDisplayModeForLogging + ", source=" + this.source + ", strategyCode=" + this.strategyCode + ", transitionReason=" + this.transitionReason + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingOverride;
            if (defaultPricingSetting == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(defaultPricingSetting.name());
            }
            dest.writeString(this.initialAccountNumber);
            dest.writeParcelable(this.optionOrderBundle, flags);
            dest.writeParcelable(this.orderToReplace, flags);
            dest.writeSerializable(this.orderIdToPlaceAgain);
            OptionOrderType optionOrderType = this.prefilledOrderType;
            if (optionOrderType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(optionOrderType.name());
            }
            dest.writeParcelable(this.prefilledTimeInForce, flags);
            dest.writeInt(this.shouldSetInitialFocusToLimitPrice ? 1 : 0);
            dest.writeInt(this.shouldSetInitialFocusToStopPrice ? 1 : 0);
            dest.writeInt(this.shouldIgnoreDefaultPricing ? 1 : 0);
            OptionChainDisplayMode optionChainDisplayMode = this.chainDisplayModeForLogging;
            if (optionChainDisplayMode == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(optionChainDisplayMode.name());
            }
            OptionOrderFormSource optionOrderFormSource = this.source;
            if (optionOrderFormSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(optionOrderFormSource.name());
            }
            dest.writeString(this.strategyCode);
            dest.writeString(this.transitionReason);
        }

        public /* synthetic */ FromOptionOrderBundle(OptionSettings.DefaultPricingSetting defaultPricingSetting, String str, OptionOrderBundle optionOrderBundle, UiOptionOrder uiOptionOrder, UUID uuid, OptionOrderType optionOrderType, OrderTimeInForce orderTimeInForce, boolean z, boolean z2, boolean z3, OptionChainDisplayMode optionChainDisplayMode, OptionOrderFormSource optionOrderFormSource, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : defaultPricingSetting, str, optionOrderBundle, (i & 8) != 0 ? null : uiOptionOrder, (i & 16) != 0 ? null : uuid, (i & 32) != 0 ? null : optionOrderType, (i & 64) != 0 ? null : orderTimeInForce, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, z3, (i & 1024) != 0 ? null : optionChainDisplayMode, (i & 2048) != 0 ? null : optionOrderFormSource, (i & 4096) != 0 ? null : str2, (i & 8192) != 0 ? null : str3);
        }

        public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
            return this.defaultPricingSettingOverride;
        }

        @Override // com.robinhood.android.options.contracts.OptionOrderIntentKey
        public String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        public final OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        public final UiOptionOrder getOrderToReplace() {
            return this.orderToReplace;
        }

        public final UUID getOrderIdToPlaceAgain() {
            return this.orderIdToPlaceAgain;
        }

        public final OptionOrderType getPrefilledOrderType() {
            return this.prefilledOrderType;
        }

        public final OrderTimeInForce getPrefilledTimeInForce() {
            return this.prefilledTimeInForce;
        }

        public final boolean getShouldSetInitialFocusToLimitPrice() {
            return this.shouldSetInitialFocusToLimitPrice;
        }

        public final boolean getShouldSetInitialFocusToStopPrice() {
            return this.shouldSetInitialFocusToStopPrice;
        }

        public final boolean getShouldIgnoreDefaultPricing() {
            return this.shouldIgnoreDefaultPricing;
        }

        public final OptionChainDisplayMode getChainDisplayModeForLogging() {
            return this.chainDisplayModeForLogging;
        }

        @Override // com.robinhood.android.options.contracts.OptionOrderIntentKey
        public OptionOrderFormSource getSource() {
            return this.source;
        }

        @Override // com.robinhood.android.options.contracts.OptionOrderIntentKey
        public String getStrategyCode() {
            return this.strategyCode;
        }

        @Override // com.robinhood.android.options.contracts.OptionOrderIntentKey
        public String getTransitionReason() {
            return this.transitionReason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromOptionOrderBundle(OptionSettings.DefaultPricingSetting defaultPricingSetting, String initialAccountNumber, OptionOrderBundle optionOrderBundle, UiOptionOrder uiOptionOrder, UUID uuid, OptionOrderType optionOrderType, OrderTimeInForce orderTimeInForce, boolean z, boolean z2, boolean z3, OptionChainDisplayMode optionChainDisplayMode, OptionOrderFormSource optionOrderFormSource, String str, String str2) {
            super(initialAccountNumber, optionOrderFormSource, null, str2, 4, null);
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            this.defaultPricingSettingOverride = defaultPricingSetting;
            this.initialAccountNumber = initialAccountNumber;
            this.optionOrderBundle = optionOrderBundle;
            this.orderToReplace = uiOptionOrder;
            this.orderIdToPlaceAgain = uuid;
            this.prefilledOrderType = optionOrderType;
            this.prefilledTimeInForce = orderTimeInForce;
            this.shouldSetInitialFocusToLimitPrice = z;
            this.shouldSetInitialFocusToStopPrice = z2;
            this.shouldIgnoreDefaultPricing = z3;
            this.chainDisplayModeForLogging = optionChainDisplayMode;
            this.source = optionOrderFormSource;
            this.strategyCode = str;
            this.transitionReason = str2;
        }
    }

    /* compiled from: OptionOrderIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionOrderIntentKey$FromAggregatePosition;", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "aggregatePositionId", "Ljava/util/UUID;", "initialAccountNumber", "", "positionEffect", "Lcom/robinhood/models/db/OrderPositionEffect;", "source", "Lrosetta/option/OptionOrderFormSource;", "transitionReason", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/models/db/OrderPositionEffect;Lrosetta/option/OptionOrderFormSource;Ljava/lang/String;)V", "getAggregatePositionId", "()Ljava/util/UUID;", "getInitialAccountNumber", "()Ljava/lang/String;", "getPositionEffect", "()Lcom/robinhood/models/db/OrderPositionEffect;", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "getTransitionReason", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class FromAggregatePosition extends OptionOrderIntentKey {
        public static final Parcelable.Creator<FromAggregatePosition> CREATOR = new Creator();
        private final UUID aggregatePositionId;
        private final String initialAccountNumber;
        private final OrderPositionEffect positionEffect;
        private final OptionOrderFormSource source;
        private final String transitionReason;

        /* compiled from: OptionOrderIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes11.dex */
        public static final class Creator implements Parcelable.Creator<FromAggregatePosition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromAggregatePosition createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromAggregatePosition((UUID) parcel.readSerializable(), parcel.readString(), OrderPositionEffect.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : OptionOrderFormSource.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromAggregatePosition[] newArray(int i) {
                return new FromAggregatePosition[i];
            }
        }

        public static /* synthetic */ FromAggregatePosition copy$default(FromAggregatePosition fromAggregatePosition, UUID uuid, String str, OrderPositionEffect orderPositionEffect, OptionOrderFormSource optionOrderFormSource, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = fromAggregatePosition.aggregatePositionId;
            }
            if ((i & 2) != 0) {
                str = fromAggregatePosition.initialAccountNumber;
            }
            if ((i & 4) != 0) {
                orderPositionEffect = fromAggregatePosition.positionEffect;
            }
            if ((i & 8) != 0) {
                optionOrderFormSource = fromAggregatePosition.source;
            }
            if ((i & 16) != 0) {
                str2 = fromAggregatePosition.transitionReason;
            }
            String str3 = str2;
            OrderPositionEffect orderPositionEffect2 = orderPositionEffect;
            return fromAggregatePosition.copy(uuid, str, orderPositionEffect2, optionOrderFormSource, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getAggregatePositionId() {
            return this.aggregatePositionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        /* renamed from: component3, reason: from getter */
        public final OrderPositionEffect getPositionEffect() {
            return this.positionEffect;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTransitionReason() {
            return this.transitionReason;
        }

        public final FromAggregatePosition copy(UUID aggregatePositionId, String initialAccountNumber, OrderPositionEffect positionEffect, OptionOrderFormSource source, String transitionReason) {
            Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            return new FromAggregatePosition(aggregatePositionId, initialAccountNumber, positionEffect, source, transitionReason);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FromAggregatePosition)) {
                return false;
            }
            FromAggregatePosition fromAggregatePosition = (FromAggregatePosition) other;
            return Intrinsics.areEqual(this.aggregatePositionId, fromAggregatePosition.aggregatePositionId) && Intrinsics.areEqual(this.initialAccountNumber, fromAggregatePosition.initialAccountNumber) && this.positionEffect == fromAggregatePosition.positionEffect && this.source == fromAggregatePosition.source && Intrinsics.areEqual(this.transitionReason, fromAggregatePosition.transitionReason);
        }

        public int hashCode() {
            int iHashCode = ((((this.aggregatePositionId.hashCode() * 31) + this.initialAccountNumber.hashCode()) * 31) + this.positionEffect.hashCode()) * 31;
            OptionOrderFormSource optionOrderFormSource = this.source;
            int iHashCode2 = (iHashCode + (optionOrderFormSource == null ? 0 : optionOrderFormSource.hashCode())) * 31;
            String str = this.transitionReason;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "FromAggregatePosition(aggregatePositionId=" + this.aggregatePositionId + ", initialAccountNumber=" + this.initialAccountNumber + ", positionEffect=" + this.positionEffect + ", source=" + this.source + ", transitionReason=" + this.transitionReason + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.aggregatePositionId);
            dest.writeString(this.initialAccountNumber);
            dest.writeString(this.positionEffect.name());
            OptionOrderFormSource optionOrderFormSource = this.source;
            if (optionOrderFormSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(optionOrderFormSource.name());
            }
            dest.writeString(this.transitionReason);
        }

        public /* synthetic */ FromAggregatePosition(UUID uuid, String str, OrderPositionEffect orderPositionEffect, OptionOrderFormSource optionOrderFormSource, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, str, orderPositionEffect, (i & 8) != 0 ? null : optionOrderFormSource, (i & 16) != 0 ? null : str2);
        }

        public final UUID getAggregatePositionId() {
            return this.aggregatePositionId;
        }

        @Override // com.robinhood.android.options.contracts.OptionOrderIntentKey
        public String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        public final OrderPositionEffect getPositionEffect() {
            return this.positionEffect;
        }

        @Override // com.robinhood.android.options.contracts.OptionOrderIntentKey
        public OptionOrderFormSource getSource() {
            return this.source;
        }

        @Override // com.robinhood.android.options.contracts.OptionOrderIntentKey
        public String getTransitionReason() {
            return this.transitionReason;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromAggregatePosition(UUID aggregatePositionId, String initialAccountNumber, OrderPositionEffect positionEffect, OptionOrderFormSource optionOrderFormSource, String str) {
            super(initialAccountNumber, optionOrderFormSource, null, str, 4, null);
            Intrinsics.checkNotNullParameter(aggregatePositionId, "aggregatePositionId");
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            Intrinsics.checkNotNullParameter(positionEffect, "positionEffect");
            this.aggregatePositionId = aggregatePositionId;
            this.initialAccountNumber = initialAccountNumber;
            this.positionEffect = positionEffect;
            this.source = optionOrderFormSource;
            this.transitionReason = str;
        }
    }
}
