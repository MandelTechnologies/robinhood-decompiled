package com.robinhood.android.options.optionsstring.common;

import android.content.res.Resources;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse2;
import com.robinhood.models.api.ApiOptionTodayTotalReturnResponse3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonApiOptionTodayTotalReturnResponse.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\b"}, m3636d2 = {"getTodaysReturnString", "", "Lcom/robinhood/models/api/CommonApiOptionTodayTotalReturnResponse;", "resources", "Landroid/content/res/Resources;", "getTotalReturnString", "getTodaysReturnStringUnsigned", "getTotalReturnStringUnsigned", "lib-options-string_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.optionsstring.common.CommonApiOptionTodayTotalReturnResponseKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CommonApiOptionTodayTotalReturnResponse2 {
    public static final String getTodaysReturnString(ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, Resources resources) throws Resources.NotFoundException {
        BigDecimal today_return;
        BigDecimal today_return_percent;
        Intrinsics.checkNotNullParameter(apiOptionTodayTotalReturnResponse3, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        boolean z = apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse2;
        if (z) {
            today_return = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getToday_return().getDecimalValue();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            today_return = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getToday_return();
        }
        if (z) {
            today_return_percent = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getToday_return_percent();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            today_return_percent = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getToday_return_percent();
        }
        int i = C11048R.string.general_number_and_percent_change_format;
        String str = Formats.getCurrencyDeltaFormat().format(today_return);
        NumberFormatter percentDeltaFormat = Formats.getPercentDeltaFormat();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalDivide = today_return_percent.divide(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        String string2 = resources.getString(i, str, percentDeltaFormat.format(bigDecimalDivide));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getTotalReturnString(ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, Resources resources) throws Resources.NotFoundException {
        BigDecimal total_return;
        BigDecimal total_return_percent;
        Intrinsics.checkNotNullParameter(apiOptionTodayTotalReturnResponse3, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        boolean z = apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse2;
        if (z) {
            total_return = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getTotal_return().getDecimalValue();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            total_return = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getTotal_return();
        }
        if (z) {
            total_return_percent = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getTotal_return_percent();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            total_return_percent = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getTotal_return_percent();
        }
        int i = C11048R.string.general_number_and_percent_change_format;
        String str = Formats.getCurrencyDeltaFormat().format(total_return);
        NumberFormatter percentDeltaFormat = Formats.getPercentDeltaFormat();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalDivide = total_return_percent.divide(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        String string2 = resources.getString(i, str, percentDeltaFormat.format(bigDecimalDivide));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getTodaysReturnStringUnsigned(ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, Resources resources) throws Resources.NotFoundException {
        BigDecimal today_return;
        BigDecimal today_return_percent;
        Intrinsics.checkNotNullParameter(apiOptionTodayTotalReturnResponse3, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        boolean z = apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse2;
        if (z) {
            today_return = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getToday_return().getDecimalValue();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            today_return = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getToday_return();
        }
        if (z) {
            today_return_percent = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getToday_return_percent();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            today_return_percent = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getToday_return_percent();
        }
        int i = C11048R.string.general_number_and_percent_change_format;
        String str = Formats.getNoSignPriceFormat().format(today_return);
        NumberFormatter noSignPercentFormat = Formats.getNoSignPercentFormat();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalDivide = today_return_percent.divide(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        String string2 = resources.getString(i, str, noSignPercentFormat.format(bigDecimalDivide));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getTotalReturnStringUnsigned(ApiOptionTodayTotalReturnResponse3 apiOptionTodayTotalReturnResponse3, Resources resources) throws Resources.NotFoundException {
        BigDecimal total_return;
        BigDecimal total_return_percent;
        Intrinsics.checkNotNullParameter(apiOptionTodayTotalReturnResponse3, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        boolean z = apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse2;
        if (z) {
            total_return = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getTotal_return().getDecimalValue();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            total_return = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getTotal_return();
        }
        if (z) {
            total_return_percent = ((ApiOptionTodayTotalReturnResponse2) apiOptionTodayTotalReturnResponse3).getTotal_return_percent();
        } else {
            if (!(apiOptionTodayTotalReturnResponse3 instanceof ApiOptionTodayTotalReturnResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            total_return_percent = ((ApiOptionTodayTotalReturnResponse) apiOptionTodayTotalReturnResponse3).getTotal_return_percent();
        }
        int i = C11048R.string.general_number_and_percent_change_format;
        String str = Formats.getNoSignPriceFormat().format(total_return);
        NumberFormatter noSignPercentFormat = Formats.getNoSignPercentFormat();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalDivide = total_return_percent.divide(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        String string2 = resources.getString(i, str, noSignPercentFormat.format(bigDecimalDivide));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
