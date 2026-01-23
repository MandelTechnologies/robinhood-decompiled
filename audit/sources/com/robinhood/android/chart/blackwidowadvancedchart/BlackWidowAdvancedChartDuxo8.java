package com.robinhood.android.chart.blackwidowadvancedchart;

import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorStateDto;
import black_widow.contracts.mobile_app_chart.proto.p024v1.IndicatorValidationInfoDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BlackWidowAdvancedChartDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"validationErrorMessage", "", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorStateDto;", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.BlackWidowAdvancedChartDuxoKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BlackWidowAdvancedChartDuxo8 {
    public static final String validationErrorMessage(IndicatorStateDto indicatorStateDto) {
        List<IndicatorValidationInfoDto> validation_info;
        Object next;
        String message;
        if (indicatorStateDto != null && (validation_info = indicatorStateDto.getValidation_info()) != null) {
            Iterator<T> it = validation_info.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                IndicatorValidationInfoDto indicatorValidationInfoDto = (IndicatorValidationInfoDto) next;
                if (indicatorValidationInfoDto.getParameter_id_value().length() == 0 && (message = indicatorValidationInfoDto.getMessage()) != null && message.length() != 0) {
                    break;
                }
            }
            IndicatorValidationInfoDto indicatorValidationInfoDto2 = (IndicatorValidationInfoDto) next;
            if (indicatorValidationInfoDto2 != null) {
                return indicatorValidationInfoDto2.getMessage();
            }
        }
        return null;
    }
}
