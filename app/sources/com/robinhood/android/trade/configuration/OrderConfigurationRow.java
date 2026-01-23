package com.robinhood.android.trade.configuration;

import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.IconWithAction;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationRow.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "", "<init>", "()V", "RowWithResourceConfig", "RowWithRadioGroupConfig", "RowWithOrderConfiguration", "OptionSectionHeader", "Option", "RadioGroupBased", "EquityDirectOrder", "Recurring", "OptionUpsell", "Header", "Disclosure", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Disclosure;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$EquityDirectOrder;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Header;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Option;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$OptionSectionHeader;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$OptionUpsell;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RadioGroupBased;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Recurring;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class OrderConfigurationRow {
    public static final int $stable = 0;

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithOrderConfiguration;", "", "orderConfig", "Lcom/robinhood/models/db/Order$Configuration;", "getOrderConfig", "()Lcom/robinhood/models/db/Order$Configuration;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RowWithOrderConfiguration {
        Order.Configuration getOrderConfig();
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithRadioGroupConfig;", "", "radioGroupConfig", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;", "getRadioGroupConfig", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RowWithRadioGroupConfig {
        OrderConfigurationRadioGroupResource getRadioGroupConfig();
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithResourceConfig;", "", "resourceConfig", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "getResourceConfig", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RowWithResourceConfig {
        OrderConfigurationResource getResourceConfig();
    }

    public /* synthetic */ OrderConfigurationRow(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OrderConfigurationRow() {
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$OptionSectionHeader;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "<init>", "(I)V", "getTitleRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionSectionHeader extends OrderConfigurationRow {
        public static final int $stable = 0;
        private final int titleRes;

        public static /* synthetic */ OptionSectionHeader copy$default(OptionSectionHeader optionSectionHeader, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = optionSectionHeader.titleRes;
            }
            return optionSectionHeader.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        public final OptionSectionHeader copy(int titleRes) {
            return new OptionSectionHeader(titleRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionSectionHeader) && this.titleRes == ((OptionSectionHeader) other).titleRes;
        }

        public int hashCode() {
            return Integer.hashCode(this.titleRes);
        }

        public String toString() {
            return "OptionSectionHeader(titleRes=" + this.titleRes + ")";
        }

        public OptionSectionHeader(int i) {
            super(null);
            this.titleRes = i;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Option;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithResourceConfig;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithOrderConfiguration;", "resourceConfig", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "orderConfig", "Lcom/robinhood/models/db/Order$Configuration;", "<init>", "(Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;Lcom/robinhood/models/db/Order$Configuration;)V", "getResourceConfig", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "getOrderConfig", "()Lcom/robinhood/models/db/Order$Configuration;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Option extends OrderConfigurationRow implements RowWithResourceConfig, RowWithOrderConfiguration {
        public static final int $stable = 8;
        private final Order.Configuration orderConfig;
        private final OrderConfigurationResource resourceConfig;

        public static /* synthetic */ Option copy$default(Option option, OrderConfigurationResource orderConfigurationResource, Order.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                orderConfigurationResource = option.resourceConfig;
            }
            if ((i & 2) != 0) {
                configuration = option.orderConfig;
            }
            return option.copy(orderConfigurationResource, configuration);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderConfigurationResource getResourceConfig() {
            return this.resourceConfig;
        }

        /* renamed from: component2, reason: from getter */
        public final Order.Configuration getOrderConfig() {
            return this.orderConfig;
        }

        public final Option copy(OrderConfigurationResource resourceConfig, Order.Configuration orderConfig) {
            Intrinsics.checkNotNullParameter(resourceConfig, "resourceConfig");
            Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
            return new Option(resourceConfig, orderConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.areEqual(this.resourceConfig, option.resourceConfig) && this.orderConfig == option.orderConfig;
        }

        public int hashCode() {
            return (this.resourceConfig.hashCode() * 31) + this.orderConfig.hashCode();
        }

        public String toString() {
            return "Option(resourceConfig=" + this.resourceConfig + ", orderConfig=" + this.orderConfig + ")";
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationRow.RowWithResourceConfig
        public OrderConfigurationResource getResourceConfig() {
            return this.resourceConfig;
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationRow.RowWithOrderConfiguration
        public Order.Configuration getOrderConfig() {
            return this.orderConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Option(OrderConfigurationResource resourceConfig, Order.Configuration orderConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(resourceConfig, "resourceConfig");
            Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
            this.resourceConfig = resourceConfig;
            this.orderConfig = orderConfig;
        }
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RadioGroupBased;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithRadioGroupConfig;", "radioGroupConfig", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;", "<init>", "(Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;)V", "getRadioGroupConfig", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RadioGroupBased extends OrderConfigurationRow implements RowWithRadioGroupConfig {
        public static final int $stable = 8;
        private final OrderConfigurationRadioGroupResource radioGroupConfig;

        public static /* synthetic */ RadioGroupBased copy$default(RadioGroupBased radioGroupBased, OrderConfigurationRadioGroupResource orderConfigurationRadioGroupResource, int i, Object obj) {
            if ((i & 1) != 0) {
                orderConfigurationRadioGroupResource = radioGroupBased.radioGroupConfig;
            }
            return radioGroupBased.copy(orderConfigurationRadioGroupResource);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderConfigurationRadioGroupResource getRadioGroupConfig() {
            return this.radioGroupConfig;
        }

        public final RadioGroupBased copy(OrderConfigurationRadioGroupResource radioGroupConfig) {
            Intrinsics.checkNotNullParameter(radioGroupConfig, "radioGroupConfig");
            return new RadioGroupBased(radioGroupConfig);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RadioGroupBased) && Intrinsics.areEqual(this.radioGroupConfig, ((RadioGroupBased) other).radioGroupConfig);
        }

        public int hashCode() {
            return this.radioGroupConfig.hashCode();
        }

        public String toString() {
            return "RadioGroupBased(radioGroupConfig=" + this.radioGroupConfig + ")";
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationRow.RowWithRadioGroupConfig
        public OrderConfigurationRadioGroupResource getRadioGroupConfig() {
            return this.radioGroupConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RadioGroupBased(OrderConfigurationRadioGroupResource radioGroupConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(radioGroupConfig, "radioGroupConfig");
            this.radioGroupConfig = radioGroupConfig;
        }
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0015¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$EquityDirectOrder;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithResourceConfig;", "resourceConfig", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "orderConfig", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "disabled", "", "disabledByShortPosition", "isTaxLots", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "isBuyToClose", "<init>", "(Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;ZZZLcom/robinhood/models/db/EquityOrderSide;Z)V", "getResourceConfig", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "getOrderConfig", "()Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "getDisabled", "()Z", "getDisabledByShortPosition", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EquityDirectOrder extends OrderConfigurationRow implements RowWithResourceConfig {
        public static final int $stable = 8;
        private final boolean disabled;
        private final boolean disabledByShortPosition;
        private final boolean isBuyToClose;
        private final boolean isTaxLots;
        private final DirectOrder orderConfig;
        private final OrderConfigurationResource resourceConfig;
        private final EquityOrderSide side;

        public static /* synthetic */ EquityDirectOrder copy$default(EquityDirectOrder equityDirectOrder, OrderConfigurationResource orderConfigurationResource, DirectOrder directOrder, boolean z, boolean z2, boolean z3, EquityOrderSide equityOrderSide, boolean z4, int i, Object obj) {
            if ((i & 1) != 0) {
                orderConfigurationResource = equityDirectOrder.resourceConfig;
            }
            if ((i & 2) != 0) {
                directOrder = equityDirectOrder.orderConfig;
            }
            if ((i & 4) != 0) {
                z = equityDirectOrder.disabled;
            }
            if ((i & 8) != 0) {
                z2 = equityDirectOrder.disabledByShortPosition;
            }
            if ((i & 16) != 0) {
                z3 = equityDirectOrder.isTaxLots;
            }
            if ((i & 32) != 0) {
                equityOrderSide = equityDirectOrder.side;
            }
            if ((i & 64) != 0) {
                z4 = equityDirectOrder.isBuyToClose;
            }
            EquityOrderSide equityOrderSide2 = equityOrderSide;
            boolean z5 = z4;
            boolean z6 = z3;
            boolean z7 = z;
            return equityDirectOrder.copy(orderConfigurationResource, directOrder, z7, z2, z6, equityOrderSide2, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderConfigurationResource getResourceConfig() {
            return this.resourceConfig;
        }

        /* renamed from: component2, reason: from getter */
        public final DirectOrder getOrderConfig() {
            return this.orderConfig;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getDisabled() {
            return this.disabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getDisabledByShortPosition() {
            return this.disabledByShortPosition;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsTaxLots() {
            return this.isTaxLots;
        }

        /* renamed from: component6, reason: from getter */
        public final EquityOrderSide getSide() {
            return this.side;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsBuyToClose() {
            return this.isBuyToClose;
        }

        public final EquityDirectOrder copy(OrderConfigurationResource resourceConfig, DirectOrder orderConfig, boolean disabled, boolean disabledByShortPosition, boolean isTaxLots, EquityOrderSide side, boolean isBuyToClose) {
            Intrinsics.checkNotNullParameter(resourceConfig, "resourceConfig");
            Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
            Intrinsics.checkNotNullParameter(side, "side");
            return new EquityDirectOrder(resourceConfig, orderConfig, disabled, disabledByShortPosition, isTaxLots, side, isBuyToClose);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EquityDirectOrder)) {
                return false;
            }
            EquityDirectOrder equityDirectOrder = (EquityDirectOrder) other;
            return Intrinsics.areEqual(this.resourceConfig, equityDirectOrder.resourceConfig) && Intrinsics.areEqual(this.orderConfig, equityDirectOrder.orderConfig) && this.disabled == equityDirectOrder.disabled && this.disabledByShortPosition == equityDirectOrder.disabledByShortPosition && this.isTaxLots == equityDirectOrder.isTaxLots && this.side == equityDirectOrder.side && this.isBuyToClose == equityDirectOrder.isBuyToClose;
        }

        public int hashCode() {
            return (((((((((((this.resourceConfig.hashCode() * 31) + this.orderConfig.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Boolean.hashCode(this.disabledByShortPosition)) * 31) + Boolean.hashCode(this.isTaxLots)) * 31) + this.side.hashCode()) * 31) + Boolean.hashCode(this.isBuyToClose);
        }

        public String toString() {
            return "EquityDirectOrder(resourceConfig=" + this.resourceConfig + ", orderConfig=" + this.orderConfig + ", disabled=" + this.disabled + ", disabledByShortPosition=" + this.disabledByShortPosition + ", isTaxLots=" + this.isTaxLots + ", side=" + this.side + ", isBuyToClose=" + this.isBuyToClose + ")";
        }

        public /* synthetic */ EquityDirectOrder(OrderConfigurationResource orderConfigurationResource, DirectOrder directOrder, boolean z, boolean z2, boolean z3, EquityOrderSide equityOrderSide, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(orderConfigurationResource, directOrder, z, z2, (i & 16) != 0 ? false : z3, equityOrderSide, z4);
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationRow.RowWithResourceConfig
        public OrderConfigurationResource getResourceConfig() {
            return this.resourceConfig;
        }

        public final DirectOrder getOrderConfig() {
            return this.orderConfig;
        }

        public final boolean getDisabled() {
            return this.disabled;
        }

        public final boolean getDisabledByShortPosition() {
            return this.disabledByShortPosition;
        }

        public final boolean isTaxLots() {
            return this.isTaxLots;
        }

        public final EquityOrderSide getSide() {
            return this.side;
        }

        public final boolean isBuyToClose() {
            return this.isBuyToClose;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EquityDirectOrder(OrderConfigurationResource resourceConfig, DirectOrder orderConfig, boolean z, boolean z2, boolean z3, EquityOrderSide side, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(resourceConfig, "resourceConfig");
            Intrinsics.checkNotNullParameter(orderConfig, "orderConfig");
            Intrinsics.checkNotNullParameter(side, "side");
            this.resourceConfig = resourceConfig;
            this.orderConfig = orderConfig;
            this.disabled = z;
            this.disabledByShortPosition = z2;
            this.isTaxLots = z3;
            this.side = side;
            this.isBuyToClose = z4;
        }
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Recurring;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$RowWithResourceConfig;", "resourceConfig", "Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "disabledByShortPosition", "", "isRecurringTradable", "recurringTradabilityReason", "Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "symbol", "", "<init>", "(Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;ZZLcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;Ljava/lang/String;)V", "getResourceConfig", "()Lcom/robinhood/android/trade/configuration/OrderConfigurationResource;", "getDisabledByShortPosition", "()Z", "getRecurringTradabilityReason", "()Lcom/robinhood/models/db/bonfire/InstrumentRecurringTradability$RecurringTradableReason;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Recurring extends OrderConfigurationRow implements RowWithResourceConfig {
        public static final int $stable = 8;
        private final boolean disabledByShortPosition;
        private final boolean isRecurringTradable;
        private final InstrumentRecurringTradability.RecurringTradableReason recurringTradabilityReason;
        private final OrderConfigurationResource resourceConfig;
        private final String symbol;

        public static /* synthetic */ Recurring copy$default(Recurring recurring, OrderConfigurationResource orderConfigurationResource, boolean z, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                orderConfigurationResource = recurring.resourceConfig;
            }
            if ((i & 2) != 0) {
                z = recurring.disabledByShortPosition;
            }
            if ((i & 4) != 0) {
                z2 = recurring.isRecurringTradable;
            }
            if ((i & 8) != 0) {
                recurringTradableReason = recurring.recurringTradabilityReason;
            }
            if ((i & 16) != 0) {
                str = recurring.symbol;
            }
            String str2 = str;
            boolean z3 = z2;
            return recurring.copy(orderConfigurationResource, z, z3, recurringTradableReason, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderConfigurationResource getResourceConfig() {
            return this.resourceConfig;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getDisabledByShortPosition() {
            return this.disabledByShortPosition;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRecurringTradable() {
            return this.isRecurringTradable;
        }

        /* renamed from: component4, reason: from getter */
        public final InstrumentRecurringTradability.RecurringTradableReason getRecurringTradabilityReason() {
            return this.recurringTradabilityReason;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        public final Recurring copy(OrderConfigurationResource resourceConfig, boolean disabledByShortPosition, boolean isRecurringTradable, InstrumentRecurringTradability.RecurringTradableReason recurringTradabilityReason, String symbol) {
            Intrinsics.checkNotNullParameter(resourceConfig, "resourceConfig");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new Recurring(resourceConfig, disabledByShortPosition, isRecurringTradable, recurringTradabilityReason, symbol);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Recurring)) {
                return false;
            }
            Recurring recurring = (Recurring) other;
            return Intrinsics.areEqual(this.resourceConfig, recurring.resourceConfig) && this.disabledByShortPosition == recurring.disabledByShortPosition && this.isRecurringTradable == recurring.isRecurringTradable && Intrinsics.areEqual(this.recurringTradabilityReason, recurring.recurringTradabilityReason) && Intrinsics.areEqual(this.symbol, recurring.symbol);
        }

        public int hashCode() {
            int iHashCode = ((((this.resourceConfig.hashCode() * 31) + Boolean.hashCode(this.disabledByShortPosition)) * 31) + Boolean.hashCode(this.isRecurringTradable)) * 31;
            InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason = this.recurringTradabilityReason;
            return ((iHashCode + (recurringTradableReason == null ? 0 : recurringTradableReason.hashCode())) * 31) + this.symbol.hashCode();
        }

        public String toString() {
            return "Recurring(resourceConfig=" + this.resourceConfig + ", disabledByShortPosition=" + this.disabledByShortPosition + ", isRecurringTradable=" + this.isRecurringTradable + ", recurringTradabilityReason=" + this.recurringTradabilityReason + ", symbol=" + this.symbol + ")";
        }

        @Override // com.robinhood.android.trade.configuration.OrderConfigurationRow.RowWithResourceConfig
        public OrderConfigurationResource getResourceConfig() {
            return this.resourceConfig;
        }

        public final boolean getDisabledByShortPosition() {
            return this.disabledByShortPosition;
        }

        public final boolean isRecurringTradable() {
            return this.isRecurringTradable;
        }

        public final InstrumentRecurringTradability.RecurringTradableReason getRecurringTradabilityReason() {
            return this.recurringTradabilityReason;
        }

        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recurring(OrderConfigurationResource resourceConfig, boolean z, boolean z2, InstrumentRecurringTradability.RecurringTradableReason recurringTradableReason, String symbol) {
            super(null);
            Intrinsics.checkNotNullParameter(resourceConfig, "resourceConfig");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.resourceConfig = resourceConfig;
            this.disabledByShortPosition = z;
            this.isRecurringTradable = z2;
            this.recurringTradabilityReason = recurringTradableReason;
            this.symbol = symbol;
        }
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$OptionUpsell;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "isUk", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionUpsell extends OrderConfigurationRow {
        public static final int $stable = 0;
        private final boolean isUk;

        public static /* synthetic */ OptionUpsell copy$default(OptionUpsell optionUpsell, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = optionUpsell.isUk;
            }
            return optionUpsell.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsUk() {
            return this.isUk;
        }

        public final OptionUpsell copy(boolean isUk) {
            return new OptionUpsell(isUk);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionUpsell) && this.isUk == ((OptionUpsell) other).isUk;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isUk);
        }

        public String toString() {
            return "OptionUpsell(isUk=" + this.isUk + ")";
        }

        public final boolean isUk() {
            return this.isUk;
        }

        public OptionUpsell(boolean z) {
            super(null);
            this.isUk = z;
        }
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Header;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "isInTopPosition", "", "iconWithAction", "Lcom/robinhood/models/serverdriven/experimental/api/IconWithAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "forAchromatic", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "<init>", "(IZLcom/robinhood/models/serverdriven/experimental/api/IconWithAction;ZLcom/robinhood/android/designsystem/style/DayNightOverlay;)V", "getTitleRes", "()I", "()Z", "getIconWithAction", "()Lcom/robinhood/models/serverdriven/experimental/api/IconWithAction;", "getForAchromatic", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Header extends OrderConfigurationRow {
        public static final int $stable = 8;
        private final DayNightOverlay dayNightOverlay;
        private final boolean forAchromatic;
        private final IconWithAction<GenericAction> iconWithAction;
        private final boolean isInTopPosition;
        private final int titleRes;

        public static /* synthetic */ Header copy$default(Header header, int i, boolean z, IconWithAction iconWithAction, boolean z2, DayNightOverlay dayNightOverlay, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = header.titleRes;
            }
            if ((i2 & 2) != 0) {
                z = header.isInTopPosition;
            }
            if ((i2 & 4) != 0) {
                iconWithAction = header.iconWithAction;
            }
            if ((i2 & 8) != 0) {
                z2 = header.forAchromatic;
            }
            if ((i2 & 16) != 0) {
                dayNightOverlay = header.dayNightOverlay;
            }
            DayNightOverlay dayNightOverlay2 = dayNightOverlay;
            IconWithAction iconWithAction2 = iconWithAction;
            return header.copy(i, z, iconWithAction2, z2, dayNightOverlay2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInTopPosition() {
            return this.isInTopPosition;
        }

        public final IconWithAction<GenericAction> component3() {
            return this.iconWithAction;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getForAchromatic() {
            return this.forAchromatic;
        }

        /* renamed from: component5, reason: from getter */
        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        public final Header copy(int titleRes, boolean isInTopPosition, IconWithAction<? extends GenericAction> iconWithAction, boolean forAchromatic, DayNightOverlay dayNightOverlay) {
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            return new Header(titleRes, isInTopPosition, iconWithAction, forAchromatic, dayNightOverlay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Header)) {
                return false;
            }
            Header header = (Header) other;
            return this.titleRes == header.titleRes && this.isInTopPosition == header.isInTopPosition && Intrinsics.areEqual(this.iconWithAction, header.iconWithAction) && this.forAchromatic == header.forAchromatic && this.dayNightOverlay == header.dayNightOverlay;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.titleRes) * 31) + Boolean.hashCode(this.isInTopPosition)) * 31;
            IconWithAction<GenericAction> iconWithAction = this.iconWithAction;
            return ((((iHashCode + (iconWithAction == null ? 0 : iconWithAction.hashCode())) * 31) + Boolean.hashCode(this.forAchromatic)) * 31) + this.dayNightOverlay.hashCode();
        }

        public String toString() {
            return "Header(titleRes=" + this.titleRes + ", isInTopPosition=" + this.isInTopPosition + ", iconWithAction=" + this.iconWithAction + ", forAchromatic=" + this.forAchromatic + ", dayNightOverlay=" + this.dayNightOverlay + ")";
        }

        public /* synthetic */ Header(int i, boolean z, IconWithAction iconWithAction, boolean z2, DayNightOverlay dayNightOverlay, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z, (i2 & 4) != 0 ? null : iconWithAction, (i2 & 8) != 0 ? false : z2, dayNightOverlay);
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final boolean isInTopPosition() {
            return this.isInTopPosition;
        }

        public final IconWithAction<GenericAction> getIconWithAction() {
            return this.iconWithAction;
        }

        public final boolean getForAchromatic() {
            return this.forAchromatic;
        }

        public final DayNightOverlay getDayNightOverlay() {
            return this.dayNightOverlay;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Header(int i, boolean z, IconWithAction<? extends GenericAction> iconWithAction, boolean z2, DayNightOverlay dayNightOverlay) {
            super(null);
            Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
            this.titleRes = i;
            this.isInTopPosition = z;
            this.iconWithAction = iconWithAction;
            this.forAchromatic = z2;
            this.dayNightOverlay = dayNightOverlay;
        }
    }

    /* compiled from: OrderConfigurationRow.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRow$Disclosure;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRow;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disclosure extends OrderConfigurationRow {
        public static final int $stable = 0;
        public static final Disclosure INSTANCE = new Disclosure();

        public boolean equals(Object other) {
            return this == other || (other instanceof Disclosure);
        }

        public int hashCode() {
            return -898026689;
        }

        public String toString() {
            return "Disclosure";
        }

        private Disclosure() {
            super(null);
        }
    }
}
