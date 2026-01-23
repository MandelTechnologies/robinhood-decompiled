package com.robinhood.android.lib.webview.extensions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.ColorScheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ColorSchemes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"jsonName", "", "Lcom/robinhood/android/designsystem/style/ColorScheme;", "getJsonName", "(Lcom/robinhood/android/designsystem/style/ColorScheme;)Ljava/lang/String;", "lib-webview_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.webview.extensions.ColorSchemesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ColorSchemes {

    /* compiled from: ColorSchemes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.webview.extensions.ColorSchemesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorScheme.values().length];
            try {
                iArr[ColorScheme.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorScheme.ALTERNATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getJsonName(ColorScheme colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[colorScheme.ordinal()];
        if (i == 1) {
            return AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_RED_GREEN_COLORBLIND;
    }
}
