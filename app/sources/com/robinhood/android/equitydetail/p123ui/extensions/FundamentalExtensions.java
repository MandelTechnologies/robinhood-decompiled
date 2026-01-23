package com.robinhood.android.equitydetail.p123ui.extensions;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Fundamental;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FundamentalExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getTradeVolumeTodayText", "", "Lcom/robinhood/shared/equities/models/instrumentdetails/db/Fundamental;", "context", "Landroid/content/Context;", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.extensions.Fundamentals, reason: use source file name */
/* loaded from: classes3.dex */
public final class FundamentalExtensions {
    public static final CharSequence getTradeVolumeTodayText(Fundamental fundamental, Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(fundamental, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        NumberFormatter integerFormat = Formats.getIntegerFormat();
        BigDecimal volume = fundamental.getVolume();
        Intrinsics.checkNotNull(volume);
        String str = integerFormat.format(volume);
        String string2 = context.getString(C15314R.string.instrument_detail_todays_volume);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        int iRequireThemeAttribute = ContextsUiExtensions.requireThemeAttribute(context, C20690R.attr.textAppearanceRegularSmall);
        int themeColor = ThemeColors.getThemeColor(context, R.attr.textColorSecondary);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(context, iRequireThemeAttribute);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(themeColor);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        Object[] objArr = {textAppearanceSpan, foregroundColorSpan};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) string2);
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }
}
