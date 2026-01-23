package com.robinhood.android.transfers.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SpannableStringBuilders.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001a\u001a\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000b"}, m3636d2 = {"appendRetirementIcon", "", "Landroid/text/SpannableStringBuilder;", "context", "Landroid/content/Context;", "appendBrokerageIcon", "appendRetirementBadgeText", "badgeText", "", "appendBrokerageBadgeText", "appendBrokerageEnokiBadgeText", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.util.SpannableStringBuildersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class SpannableStringBuilders2 {
    public static final void appendRetirementIcon(SpannableStringBuilder spannableStringBuilder, Context context) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = context.getDrawable(C20690R.drawable.ic_rds_retirement_16dp);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        drawableMutate.setTint(ThemeColors.getThemeColor(context, C20690R.attr.colorPositive));
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "apply(...)");
        SpannableStringBuilders spannableStringBuilders = new SpannableStringBuilders(drawableMutate, context.getResources().getDimensionPixelSize(C30065R.dimen.retirement_badge_icon_offset));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(' ');
        spannableStringBuilder.setSpan(spannableStringBuilders, length, spannableStringBuilder.length(), 17);
    }

    public static final void appendBrokerageIcon(SpannableStringBuilder spannableStringBuilder, Context context) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = context.getDrawable(C20690R.drawable.ic_rds_finance_12dp);
        Intrinsics.checkNotNull(drawable);
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
        drawableMutate.setTint(ThemeColors.getThemeColor(context, C20690R.attr.colorPositive));
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "apply(...)");
        SpannableStringBuilders spannableStringBuilders = new SpannableStringBuilders(drawableMutate, context.getResources().getDimensionPixelSize(C30065R.dimen.brokerage_badge_icon_offset));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(' ');
        spannableStringBuilder.setSpan(spannableStringBuilders, length, spannableStringBuilder.length(), 17);
    }

    public static final void appendRetirementBadgeText(SpannableStringBuilder spannableStringBuilder, Context context, String badgeText) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(badgeText, "badgeText");
        appendRetirementIcon(spannableStringBuilder, context);
        spannableStringBuilder.append(' ');
        Object[] objArr = {new StyleSpan(1), new ForegroundColorSpan(ThemeColors.getThemeColor(context, C20690R.attr.colorPositive))};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) badgeText);
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
    }

    public static final void appendBrokerageBadgeText(SpannableStringBuilder spannableStringBuilder, Context context, String badgeText) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(badgeText, "badgeText");
        Object[] objArr = {new StyleSpan(1), new ForegroundColorSpan(ThemeColors.getThemeColor(context, C20690R.attr.colorPositive))};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) badgeText);
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
    }

    public static final void appendBrokerageEnokiBadgeText(SpannableStringBuilder spannableStringBuilder, Context context, String badgeText) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(badgeText, "badgeText");
        appendBrokerageIcon(spannableStringBuilder, context);
        spannableStringBuilder.append(' ');
        Object[] objArr = {new StyleSpan(1), new ForegroundColorSpan(ThemeColors.getThemeColor(context, C20690R.attr.colorPositive))};
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) badgeText);
        for (int i = 0; i < 2; i++) {
            spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
        }
    }
}
