package com.robinhood.android.optionsrolling.p209ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.optionsrolling.C24772R;
import com.robinhood.android.optionsrolling.databinding.MergeRollingStatsViewBinding;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RollingSubheaderView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindings", "Lcom/robinhood/android/optionsrolling/databinding/MergeRollingStatsViewBinding;", "getBindings", "()Lcom/robinhood/android/optionsrolling/databinding/MergeRollingStatsViewBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "RollingSubheaderData", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class RollingSubheaderView extends FrameLayout implements Bindable<RollingSubheaderData> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RollingSubheaderView.class, "bindings", "getBindings()Lcom/robinhood/android/optionsrolling/databinding/MergeRollingStatsViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RollingSubheaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C24772R.layout.merge_rolling_stats_view, true);
        this.bindings = ViewBinding5.viewBinding(this, RollingSubheaderView2.INSTANCE);
    }

    public /* synthetic */ RollingSubheaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* compiled from: RollingSubheaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData;", "", "<init>", "()V", "SelectContract", "RollingStats", "Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData$RollingStats;", "Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData$SelectContract;", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class RollingSubheaderData {
        public static final int $stable = 0;

        public /* synthetic */ RollingSubheaderData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private RollingSubheaderData() {
        }

        /* compiled from: RollingSubheaderView.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData$SelectContract;", "Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData;", "<init>", "()V", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SelectContract extends RollingSubheaderData {
            public static final int $stable = 0;
            public static final SelectContract INSTANCE = new SelectContract();

            private SelectContract() {
                super(null);
            }
        }

        /* compiled from: RollingSubheaderView.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData$RollingStats;", "Lcom/robinhood/android/optionsrolling/ui/view/RollingSubheaderView$RollingSubheaderData;", "direction", "Lcom/robinhood/models/db/OrderDirection;", "netCost", "Ljava/math/BigDecimal;", "totalCost", "timeIncrease", "", "<init>", "(Lcom/robinhood/models/db/OrderDirection;Ljava/math/BigDecimal;Ljava/math/BigDecimal;I)V", "getDirection", "()Lcom/robinhood/models/db/OrderDirection;", "getNetCost", "()Ljava/math/BigDecimal;", "getTotalCost", "getTimeIncrease", "()I", "netCostTitle", "Lcom/robinhood/utils/resource/StringResource;", "getNetCostTitle", "()Lcom/robinhood/utils/resource/StringResource;", "totalCostTitle", "getTotalCostTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-rolling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RollingStats extends RollingSubheaderData {
            public static final int $stable = 8;
            private final OrderDirection direction;
            private final BigDecimal netCost;
            private final StringResource netCostTitle;
            private final int timeIncrease;
            private final BigDecimal totalCost;
            private final StringResource totalCostTitle;

            /* compiled from: RollingSubheaderView.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[OrderDirection.values().length];
                    try {
                        iArr[OrderDirection.DEBIT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[OrderDirection.CREDIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public static /* synthetic */ RollingStats copy$default(RollingStats rollingStats, OrderDirection orderDirection, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    orderDirection = rollingStats.direction;
                }
                if ((i2 & 2) != 0) {
                    bigDecimal = rollingStats.netCost;
                }
                if ((i2 & 4) != 0) {
                    bigDecimal2 = rollingStats.totalCost;
                }
                if ((i2 & 8) != 0) {
                    i = rollingStats.timeIncrease;
                }
                return rollingStats.copy(orderDirection, bigDecimal, bigDecimal2, i);
            }

            /* renamed from: component1, reason: from getter */
            public final OrderDirection getDirection() {
                return this.direction;
            }

            /* renamed from: component2, reason: from getter */
            public final BigDecimal getNetCost() {
                return this.netCost;
            }

            /* renamed from: component3, reason: from getter */
            public final BigDecimal getTotalCost() {
                return this.totalCost;
            }

            /* renamed from: component4, reason: from getter */
            public final int getTimeIncrease() {
                return this.timeIncrease;
            }

            public final RollingStats copy(OrderDirection direction, BigDecimal netCost, BigDecimal totalCost, int timeIncrease) {
                Intrinsics.checkNotNullParameter(direction, "direction");
                Intrinsics.checkNotNullParameter(netCost, "netCost");
                Intrinsics.checkNotNullParameter(totalCost, "totalCost");
                return new RollingStats(direction, netCost, totalCost, timeIncrease);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RollingStats)) {
                    return false;
                }
                RollingStats rollingStats = (RollingStats) other;
                return this.direction == rollingStats.direction && Intrinsics.areEqual(this.netCost, rollingStats.netCost) && Intrinsics.areEqual(this.totalCost, rollingStats.totalCost) && this.timeIncrease == rollingStats.timeIncrease;
            }

            public int hashCode() {
                return (((((this.direction.hashCode() * 31) + this.netCost.hashCode()) * 31) + this.totalCost.hashCode()) * 31) + Integer.hashCode(this.timeIncrease);
            }

            public String toString() {
                return "RollingStats(direction=" + this.direction + ", netCost=" + this.netCost + ", totalCost=" + this.totalCost + ", timeIncrease=" + this.timeIncrease + ")";
            }

            public final OrderDirection getDirection() {
                return this.direction;
            }

            public final BigDecimal getNetCost() {
                return this.netCost;
            }

            public final BigDecimal getTotalCost() {
                return this.totalCost;
            }

            public final int getTimeIncrease() {
                return this.timeIncrease;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RollingStats(OrderDirection direction, BigDecimal netCost, BigDecimal totalCost, int i) {
                int i2;
                int i3;
                super(null);
                Intrinsics.checkNotNullParameter(direction, "direction");
                Intrinsics.checkNotNullParameter(netCost, "netCost");
                Intrinsics.checkNotNullParameter(totalCost, "totalCost");
                this.direction = direction;
                this.netCost = netCost;
                this.totalCost = totalCost;
                this.timeIncrease = i;
                StringResource.Companion companion = StringResource.INSTANCE;
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                int i4 = iArr[direction.ordinal()];
                if (i4 == 1) {
                    i2 = C24772R.string.options_rolling_net_debit_title_text;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = C24772R.string.options_rolling_net_credit_title_text;
                }
                this.netCostTitle = companion.invoke(i2, new Object[0]);
                int i5 = iArr[direction.ordinal()];
                if (i5 == 1) {
                    i3 = C24772R.string.options_rolling_total_debit_title_text;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = C24772R.string.options_rolling_total_credit_title_text;
                }
                this.totalCostTitle = companion.invoke(i3, new Object[0]);
            }

            public final StringResource getNetCostTitle() {
                return this.netCostTitle;
            }

            public final StringResource getTotalCostTitle() {
                return this.totalCostTitle;
            }
        }
    }

    private final MergeRollingStatsViewBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeRollingStatsViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RollingSubheaderData state) throws Resources.NotFoundException {
        String quantityString;
        Intrinsics.checkNotNullParameter(state, "state");
        MergeRollingStatsViewBinding bindings = getBindings();
        TextView optionsRollingSelectContractSubtitle = bindings.optionsRollingSelectContractSubtitle;
        Intrinsics.checkNotNullExpressionValue(optionsRollingSelectContractSubtitle, "optionsRollingSelectContractSubtitle");
        optionsRollingSelectContractSubtitle.setVisibility(state instanceof RollingSubheaderData.SelectContract ? 0 : 8);
        ConstraintLayout optionsRollingDataSubtitle = bindings.optionsRollingDataSubtitle;
        Intrinsics.checkNotNullExpressionValue(optionsRollingDataSubtitle, "optionsRollingDataSubtitle");
        boolean z = state instanceof RollingSubheaderData.RollingStats;
        optionsRollingDataSubtitle.setVisibility(z ? 0 : 8);
        if (z) {
            RhTextView rhTextView = bindings.optionsRollingNetCostTitle;
            RollingSubheaderData.RollingStats rollingStats = (RollingSubheaderData.RollingStats) state;
            StringResource netCostTitle = rollingStats.getNetCostTitle();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView.setText(netCostTitle.getText(resources));
            bindings.optionsRollingNetCost.setText(Formats.getPriceFormat().format(rollingStats.getNetCost()));
            RhTextView rhTextView2 = bindings.optionsRollingTotalCostTitle;
            StringResource totalCostTitle = rollingStats.getTotalCostTitle();
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            rhTextView2.setText(totalCostTitle.getText(resources2));
            bindings.optionsRollingTotalCredit.setText(Formats.getPriceFormat().format(rollingStats.getTotalCost()));
            RhTextView rhTextView3 = bindings.optionsRollingTimeIncrease;
            if (rollingStats.getTimeIncrease() == 0) {
                quantityString = ViewsKt.getString(this, C24772R.string.options_rolling_no_change_text);
            } else {
                quantityString = getResources().getQuantityString(C24772R.plurals.options_rolling_time_left_text, Math.abs(rollingStats.getTimeIncrease()), Formats.getIntegerDeltaFormat().format(Integer.valueOf(rollingStats.getTimeIncrease())));
                Intrinsics.checkNotNull(quantityString);
            }
            rhTextView3.setText(quantityString);
        }
    }
}
