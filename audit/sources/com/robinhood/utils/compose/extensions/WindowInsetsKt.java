package com.robinhood.utils.compose.extensions;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowInsets.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"excludeTop", "Landroidx/compose/foundation/layout/WindowInsets;", "lib-utils-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WindowInsetsKt {
    public static final WindowInsets excludeTop(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        return androidx.compose.foundation.layout.WindowInsetsKt.m5186onlybOOhFvg(windowInsets, WindowInsetsSides.m5191plusgK_yJZ4(companion.m5199getHorizontalJoeWqyM(), companion.m5198getBottomJoeWqyM()));
    }
}
