package com.robinhood.android.trade.configuration;

import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationRadioGroupResource.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u001f\b\u0004\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;", "", "radioButtonResources", "", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource$OrderConfigurationRadioButtonResource;", "selectedRadioButtonIndex", "", "<init>", "(Ljava/util/List;I)V", "getRadioButtonResources", "()Ljava/util/List;", "getSelectedRadioButtonIndex", "()I", "setSelectedRadioButtonIndex", "(I)V", "OrderConfigurationRadioButtonResource", "TimeInForce", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource$TimeInForce;", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class OrderConfigurationRadioGroupResource {
    public static final int $stable = 8;
    private final List<OrderConfigurationRadioButtonResource> radioButtonResources;
    private int selectedRadioButtonIndex;

    public /* synthetic */ OrderConfigurationRadioGroupResource(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i);
    }

    private OrderConfigurationRadioGroupResource(List<OrderConfigurationRadioButtonResource> list, int i) {
        this.radioButtonResources = list;
        this.selectedRadioButtonIndex = i;
    }

    public final List<OrderConfigurationRadioButtonResource> getRadioButtonResources() {
        return this.radioButtonResources;
    }

    public final int getSelectedRadioButtonIndex() {
        return this.selectedRadioButtonIndex;
    }

    public final void setSelectedRadioButtonIndex(int i) {
        this.selectedRadioButtonIndex = i;
    }

    /* compiled from: OrderConfigurationRadioGroupResource.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource$OrderConfigurationRadioButtonResource;", "", "identifier", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", "subtitleRes", "subtitleFormatArgs", "", "isChecked", "", "<init>", "(Ljava/lang/Object;IILjava/util/List;Z)V", "getIdentifier", "()Ljava/lang/Object;", "getTitleRes", "()I", "getSubtitleRes", "getSubtitleFormatArgs", "()Ljava/util/List;", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OrderConfigurationRadioButtonResource {
        public static final int $stable = 8;
        private final Object identifier;
        private boolean isChecked;
        private final List<Object> subtitleFormatArgs;
        private final int subtitleRes;
        private final int titleRes;

        public static /* synthetic */ OrderConfigurationRadioButtonResource copy$default(OrderConfigurationRadioButtonResource orderConfigurationRadioButtonResource, Object obj, int i, int i2, List list, boolean z, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = orderConfigurationRadioButtonResource.identifier;
            }
            if ((i3 & 2) != 0) {
                i = orderConfigurationRadioButtonResource.titleRes;
            }
            if ((i3 & 4) != 0) {
                i2 = orderConfigurationRadioButtonResource.subtitleRes;
            }
            if ((i3 & 8) != 0) {
                list = orderConfigurationRadioButtonResource.subtitleFormatArgs;
            }
            if ((i3 & 16) != 0) {
                z = orderConfigurationRadioButtonResource.isChecked;
            }
            boolean z2 = z;
            int i4 = i2;
            return orderConfigurationRadioButtonResource.copy(obj, i, i4, list, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final Object getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* renamed from: component3, reason: from getter */
        public final int getSubtitleRes() {
            return this.subtitleRes;
        }

        public final List<Object> component4() {
            return this.subtitleFormatArgs;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final OrderConfigurationRadioButtonResource copy(Object identifier, int titleRes, int subtitleRes, List<? extends Object> subtitleFormatArgs, boolean isChecked) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(subtitleFormatArgs, "subtitleFormatArgs");
            return new OrderConfigurationRadioButtonResource(identifier, titleRes, subtitleRes, subtitleFormatArgs, isChecked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderConfigurationRadioButtonResource)) {
                return false;
            }
            OrderConfigurationRadioButtonResource orderConfigurationRadioButtonResource = (OrderConfigurationRadioButtonResource) other;
            return Intrinsics.areEqual(this.identifier, orderConfigurationRadioButtonResource.identifier) && this.titleRes == orderConfigurationRadioButtonResource.titleRes && this.subtitleRes == orderConfigurationRadioButtonResource.subtitleRes && Intrinsics.areEqual(this.subtitleFormatArgs, orderConfigurationRadioButtonResource.subtitleFormatArgs) && this.isChecked == orderConfigurationRadioButtonResource.isChecked;
        }

        public int hashCode() {
            return (((((((this.identifier.hashCode() * 31) + Integer.hashCode(this.titleRes)) * 31) + Integer.hashCode(this.subtitleRes)) * 31) + this.subtitleFormatArgs.hashCode()) * 31) + Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "OrderConfigurationRadioButtonResource(identifier=" + this.identifier + ", titleRes=" + this.titleRes + ", subtitleRes=" + this.subtitleRes + ", subtitleFormatArgs=" + this.subtitleFormatArgs + ", isChecked=" + this.isChecked + ")";
        }

        public OrderConfigurationRadioButtonResource(Object identifier, int i, int i2, List<? extends Object> subtitleFormatArgs, boolean z) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(subtitleFormatArgs, "subtitleFormatArgs");
            this.identifier = identifier;
            this.titleRes = i;
            this.subtitleRes = i2;
            this.subtitleFormatArgs = subtitleFormatArgs;
            this.isChecked = z;
        }

        public final Object getIdentifier() {
            return this.identifier;
        }

        public final int getTitleRes() {
            return this.titleRes;
        }

        public final int getSubtitleRes() {
            return this.subtitleRes;
        }

        public /* synthetic */ OrderConfigurationRadioButtonResource(Object obj, int i, int i2, List list, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, i, i2, (i3 & 8) != 0 ? CollectionsKt.emptyList() : list, (i3 & 16) != 0 ? false : z);
        }

        public final List<Object> getSubtitleFormatArgs() {
            return this.subtitleFormatArgs;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }
    }

    /* compiled from: OrderConfigurationRadioGroupResource.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource$TimeInForce;", "Lcom/robinhood/android/trade/configuration/OrderConfigurationRadioGroupResource;", "orderTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "inIndexOptionsCurbHoursExperiment", "", "<init>", "(Lcom/robinhood/models/db/OrderTimeInForce;Z)V", "getOrderTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class TimeInForce extends OrderConfigurationRadioGroupResource {
        public static final int $stable = 8;
        private final boolean inIndexOptionsCurbHoursExperiment;
        private final OrderTimeInForce orderTimeInForce;

        /* compiled from: OrderConfigurationRadioGroupResource.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OrderTimeInForce.values().length];
                try {
                    iArr[OrderTimeInForce.GFD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OrderTimeInForce.GTC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* renamed from: component2, reason: from getter */
        private final boolean getInIndexOptionsCurbHoursExperiment() {
            return this.inIndexOptionsCurbHoursExperiment;
        }

        public static /* synthetic */ TimeInForce copy$default(TimeInForce timeInForce, OrderTimeInForce orderTimeInForce, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                orderTimeInForce = timeInForce.orderTimeInForce;
            }
            if ((i & 2) != 0) {
                z = timeInForce.inIndexOptionsCurbHoursExperiment;
            }
            return timeInForce.copy(orderTimeInForce, z);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        public final TimeInForce copy(OrderTimeInForce orderTimeInForce, boolean inIndexOptionsCurbHoursExperiment) {
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            return new TimeInForce(orderTimeInForce, inIndexOptionsCurbHoursExperiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeInForce)) {
                return false;
            }
            TimeInForce timeInForce = (TimeInForce) other;
            return this.orderTimeInForce == timeInForce.orderTimeInForce && this.inIndexOptionsCurbHoursExperiment == timeInForce.inIndexOptionsCurbHoursExperiment;
        }

        public int hashCode() {
            return (this.orderTimeInForce.hashCode() * 31) + Boolean.hashCode(this.inIndexOptionsCurbHoursExperiment);
        }

        public String toString() {
            return "TimeInForce(orderTimeInForce=" + this.orderTimeInForce + ", inIndexOptionsCurbHoursExperiment=" + this.inIndexOptionsCurbHoursExperiment + ")";
        }

        public final OrderTimeInForce getOrderTimeInForce() {
            return this.orderTimeInForce;
        }

        public TimeInForce(OrderTimeInForce orderTimeInForce, boolean z) {
            int i;
            Intrinsics.checkNotNullParameter(orderTimeInForce, "orderTimeInForce");
            OrderTimeInForce orderTimeInForce2 = OrderTimeInForce.GFD;
            int i2 = C29312R.string.order_radio_button_good_for_day_title;
            if (z) {
                i = C29312R.string.order_radio_button_good_for_day_subtitle_with_extended_hours;
            } else {
                i = C29312R.string.order_radio_button_good_for_day_subtitle;
            }
            int i3 = i;
            int i4 = 0;
            OrderConfigurationRadioButtonResource orderConfigurationRadioButtonResource = new OrderConfigurationRadioButtonResource(orderTimeInForce2, i2, i3, null, orderTimeInForce == orderTimeInForce2, 8, null);
            OrderTimeInForce orderTimeInForce3 = OrderTimeInForce.GTC;
            List listListOf = CollectionsKt.listOf((Object[]) new OrderConfigurationRadioButtonResource[]{orderConfigurationRadioButtonResource, new OrderConfigurationRadioButtonResource(orderTimeInForce3, C29312R.string.order_radio_button_good_till_cancel_title, C29312R.string.order_radio_button_good_till_cancel_subtitle, null, orderTimeInForce == orderTimeInForce3, 8, null)});
            int i5 = WhenMappings.$EnumSwitchMapping$0[orderTimeInForce.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("Invalid order time in force");
                }
                i4 = 1;
            }
            super(listListOf, i4, null);
            this.orderTimeInForce = orderTimeInForce;
            this.inIndexOptionsCurbHoursExperiment = z;
        }
    }
}
