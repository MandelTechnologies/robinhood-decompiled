package com.robinhood.android.lib.webview.extensions;

import com.robinhood.android.designsystem.prefs.Theme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Themes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"jsonName", "", "Lcom/robinhood/android/designsystem/prefs/Theme;", "getJsonName", "(Lcom/robinhood/android/designsystem/prefs/Theme;)Ljava/lang/String;", "lib-webview_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.webview.extensions.ThemesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class Themes2 {

    /* compiled from: Themes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.webview.extensions.ThemesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Theme.values().length];
            try {
                iArr[Theme.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Theme.SYSTEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Theme.DAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Theme.NIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getJsonName(Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1 || i == 2) {
            return "market_hours";
        }
        if (i == 3) {
            return "light";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "dark";
    }
}
