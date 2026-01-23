package com.robinhood.android.chart.blackwidowadvancedchart.composables.bottomsheets;

import black_widow.contracts.mobile_app_chart.proto.p024v1.TemplateDto;
import com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvanceChartCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChartBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class ChartBottomSheetKt$ChartBottomSheet$2$9$1 extends FunctionReferenceImpl implements Function1<TemplateDto, Unit> {
    ChartBottomSheetKt$ChartBottomSheet$2$9$1(Object obj) {
        super(1, obj, BlackWidowAdvanceChartCallbacks.class, "selectTemplate", "selectTemplate(Lblack_widow/contracts/mobile_app_chart/proto/v1/TemplateDto;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TemplateDto templateDto) {
        invoke2(templateDto);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TemplateDto p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BlackWidowAdvanceChartCallbacks) this.receiver).selectTemplate(p0);
    }
}
