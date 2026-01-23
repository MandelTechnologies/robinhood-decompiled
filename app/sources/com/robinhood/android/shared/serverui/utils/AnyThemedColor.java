package com.robinhood.android.shared.serverui.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.theme.SduiColors;
import com.robinhood.compose.theme.SduiColors3;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: AnyThemedColor.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0004\u001a\u00020\u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t*\"\u0010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\n"}, m3636d2 = {"AnyThemedColor", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "Lrh_server_driven_ui/v1/ThemedColorDto;", "toComposeColorDefaulted", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/android/shared/serverui/utils/AnyThemedColor;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "toComposeColorDefaulted-iJQMabo", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;JLandroidx/compose/runtime/Composer;II)J", "lib-sdui-utils_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.shared.serverui.utils.AnyThemedColorKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AnyThemedColor {
    /* renamed from: toComposeColorDefaulted-iJQMabo, reason: not valid java name */
    public static final long m18895toComposeColorDefaultediJQMabo(UiObject<ThemedColor, ThemedColorDto> uiObject, long j, Composer composer, int i, int i2) {
        Composer composer2;
        composer.startReplaceGroup(-1772066562);
        if ((i2 & 1) != 0) {
            j = ((SduiColors) composer.consume(SduiColors3.getLocalSduiColors())).getFg(composer, 0);
        }
        long jM18897toComposeColorDefaultediJQMabo = j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1772066562, i, -1, "com.robinhood.android.shared.serverui.utils.toComposeColorDefaulted (AnyThemedColor.kt:13)");
        }
        if (uiObject == null) {
            composer.startReplaceGroup(2146054789);
            composer.endReplaceGroup();
            composer2 = composer;
        } else if (uiObject instanceof UiObject.Legacy) {
            composer.startReplaceGroup(2146056094);
            composer2 = composer;
            jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18896toComposeColorDefaultediJQMabo((ThemedColor) ((UiObject.Legacy) uiObject).getValue(), jM18897toComposeColorDefaultediJQMabo, composer2, i & 112, 0);
            composer2.endReplaceGroup();
        } else {
            composer2 = composer;
            if (!(uiObject instanceof UiObject.Idl)) {
                composer2.startReplaceGroup(2146054112);
                composer2.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer2.startReplaceGroup(2146058078);
            jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo((ThemedColorDto) ((UiObject.Idl) uiObject).getValue(), jM18897toComposeColorDefaultediJQMabo, composer2, i & 112, 0);
            composer2.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return jM18897toComposeColorDefaultediJQMabo;
    }
}
