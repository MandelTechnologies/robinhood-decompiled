package com.robinhood.android.pictureinpicture.pip.shared;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0011\u0010\u0002\u001a\u00020\u0003*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"toWidgetPerformanceString", "", "widgetStyle", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "(Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "feature-pip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class UtilKt {
    public static final String toWidgetPerformanceString(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default((String) CollectionsKt.last(StringsKt.split$default((CharSequence) str, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null)), "(", "", false, 4, (Object) null), ")", "", false, 4, (Object) null);
        return strReplace$default.length() == 0 ? (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null)) : strReplace$default;
    }

    public static final CursorData.SubDisplayText widgetStyle(CursorData.SubDisplayText subDisplayText, Composer composer, int i) {
        CursorData.DisplayText displayTextM11995copybw27NRU$default;
        Intrinsics.checkNotNullParameter(subDisplayText, "<this>");
        composer.startReplaceGroup(1430521628);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1430521628, i, -1, "com.robinhood.android.pictureinpicture.pip.shared.widgetStyle (Util.kt:19)");
        }
        composer.startReplaceGroup(341753367);
        CursorData.IconDisplayText main = subDisplayText.getMain();
        TextStyle style = main.getStyle();
        composer.startReplaceGroup(341755040);
        if (style == null) {
            style = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS();
        }
        composer.endReplaceGroup();
        CursorData.IconDisplayText iconDisplayTextM11999copyiJQMabo$default = CursorData.IconDisplayText.m11999copyiJQMabo$default(main, null, 0L, null, null, TextStyle.m7655copyp1EtxEg$default(style, 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 15, null);
        composer.endReplaceGroup();
        CursorData.DisplayText description = subDisplayText.getDescription();
        composer.startReplaceGroup(341760600);
        if (description == null) {
            displayTextM11995copybw27NRU$default = null;
        } else {
            TextStyle style2 = description.getStyle();
            composer.startReplaceGroup(1927507288);
            if (style2 == null) {
                style2 = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS();
            }
            composer.endReplaceGroup();
            displayTextM11995copybw27NRU$default = CursorData.DisplayText.m11995copybw27NRU$default(CursorData.DisplayText.m11995copybw27NRU$default(description, null, 0L, style2, 3, null), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU(), null, 5, null);
        }
        CursorData.DisplayText displayText = displayTextM11995copybw27NRU$default;
        composer.endReplaceGroup();
        CursorData.SubDisplayText subDisplayTextCopy$default = CursorData.SubDisplayText.copy$default(subDisplayText, iconDisplayTextM11999copyiJQMabo$default, displayText, null, 4, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return subDisplayTextCopy$default;
    }
}
