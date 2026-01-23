package com.robinhood.android.futures.sharedfuturesui;

import com.robinhood.compose.bento.theme.BentoColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesColors.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"futuresAskColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/compose/bento/theme/BentoColors;", "getFuturesAskColor", "(Lcom/robinhood/compose/bento/theme/BentoColors;)J", "futuresBidColor", "getFuturesBidColor", "lib-shared-futures-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.sharedfuturesui.FuturesColorsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesColors {
    public static final long getFuturesAskColor(BentoColors bentoColors) {
        Intrinsics.checkNotNullParameter(bentoColors, "<this>");
        return bentoColors.m21452getNegative0d7_KjU();
    }

    public static final long getFuturesBidColor(BentoColors bentoColors) {
        Intrinsics.checkNotNullParameter(bentoColors, "<this>");
        return bentoColors.m21456getPositive0d7_KjU();
    }
}
