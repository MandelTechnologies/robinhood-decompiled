package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.overview.ManagedReturnsChartState;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ManagedDashboardOverviewDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toSelectedBarInfo", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$SelectedBarInfo;", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedReturnsChartState$ReturnsBar;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDataStateKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ManagedDashboardOverviewDataState2 {

    /* compiled from: ManagedDashboardOverviewDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewDataStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ManagedReturnsChartState.ReturnsType.values().length];
            try {
                iArr[ManagedReturnsChartState.ReturnsType.APPRECIATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagedReturnsChartState.ReturnsType.INCOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagedReturnsChartState.ReturnsType.FEES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ManagedReturnsChartState.SelectedBarInfo toSelectedBarInfo(ManagedReturnsChartState.ReturnsBar returnsBar, BrokerageAccountType brokerageAccountType) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(returnsBar, "<this>");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        ManagedReturnsChartState.ReturnsType type2 = returnsBar.getType();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i3 = iArr[type2.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i = C8626R.string.returns_chart_bar_name_income;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C8626R.string.returns_chart_bar_name_fees;
            }
        } else if (returnsBar.getValue().isNegative()) {
            i = C8626R.string.returns_chart_bar_name_depreciation;
        } else {
            i = C8626R.string.returns_chart_bar_name_appreciation;
        }
        int i4 = iArr[returnsBar.getType().ordinal()];
        if (i4 == 1) {
            i2 = C8626R.string.returns_chart_bar_description_appreciation;
        } else if (i4 != 2) {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = C8626R.string.returns_chart_bar_description_fees;
        } else if (brokerageAccountType.isRetirement()) {
            i2 = C8626R.string.returns_chart_bar_description_income_ira;
        } else {
            i2 = C8626R.string.returns_chart_bar_description_income_non_ira;
        }
        return new ManagedReturnsChartState.SelectedBarInfo(i, i2);
    }
}
