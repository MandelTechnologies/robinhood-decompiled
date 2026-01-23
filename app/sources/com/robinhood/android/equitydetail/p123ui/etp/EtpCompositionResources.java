package com.robinhood.android.equitydetail.p123ui.etp;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.singular.sdk.internal.Constants;
import java.text.BreakIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EtpCompositionResources.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001¨\u0006\b"}, m3636d2 = {"getColorInt", "", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "context", "Landroid/content/Context;", "takeSentences", "", Constants.RequestParamsKeys.APP_NAME_KEY, "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionResourcesKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EtpCompositionResources {
    public static final int getColorInt(ThemedColor themedColor, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (themedColor == null) {
            return ThemeColors.getThemeColor(context, C20690R.attr.colorBackground3);
        }
        ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = ServerToBentoColorMapper.INSTANCE.mapDayNightSelectorServerColor(themedColor.getLight(), themedColor.getDark());
        if (resourceReferences4MapDayNightSelectorServerColor != null) {
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            Integer numResolve = resourceReferences4MapDayNightSelectorServerColor.resolve(theme);
            if (numResolve != null) {
                return numResolve.intValue();
            }
        }
        return ThemeColors.getThemeColor(context, C20690R.attr.colorBackground3);
    }

    public static final String takeSentences(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.isBlank(str)) {
            return str;
        }
        BreakIterator sentenceInstance = BreakIterator.getSentenceInstance();
        sentenceInstance.setText(str);
        int next = sentenceInstance.next();
        int i2 = 0;
        while (next != -1 && i2 < i) {
            i2++;
            int next2 = sentenceInstance.next();
            if (next2 == -1 || i2 == i) {
                String strSubstring = str.substring(sentenceInstance.first(), next);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return StringsKt.trimEnd(strSubstring).toString();
            }
            next = next2;
        }
        return str;
    }
}
