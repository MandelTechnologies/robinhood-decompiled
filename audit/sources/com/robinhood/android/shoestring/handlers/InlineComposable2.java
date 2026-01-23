package com.robinhood.android.shoestring.handlers;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddCircle;
import androidx.compose.material.icons.filled.Share2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InlineComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shoestring.handlers.ComposableSingletons$InlineComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class InlineComposable2 {
    public static final InlineComposable2 INSTANCE = new InlineComposable2();

    /* renamed from: lambda$-2036505310, reason: not valid java name */
    private static Function3<String, Composer, Integer, Unit> f9248lambda$2036505310 = ComposableLambda3.composableLambdaInstance(-2036505310, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.shoestring.handlers.ComposableSingletons$InlineComposableKt$lambda$-2036505310$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2036505310, i, -1, "com.robinhood.android.shoestring.handlers.ComposableSingletons$InlineComposableKt.lambda$-2036505310.<anonymous> (InlineComposable.kt:88)");
            }
            ImageKt.Image(AddCircle.getAddCircle(Icons.INSTANCE.getDefault()), "add circle", SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, Color.INSTANCE.m6720getGray0d7_KjU(), 0, 2, null), composer, 1573296, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-722247118, reason: not valid java name */
    private static Function3<String, Composer, Integer, Unit> f9249lambda$722247118 = ComposableLambda3.composableLambdaInstance(-722247118, false, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.shoestring.handlers.ComposableSingletons$InlineComposableKt$lambda$-722247118$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer, Integer num) {
            invoke(str, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(String it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-722247118, i, -1, "com.robinhood.android.shoestring.handlers.ComposableSingletons$InlineComposableKt.lambda$-722247118.<anonymous> (InlineComposable.kt:100)");
            }
            ImageKt.Image(Share2.getShare(Icons.INSTANCE.getDefault()), AnalyticsStrings.BUTTON_TITLE_IPO_ACCESS_RESULTS_ALLOCATED_SHARE, SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, Color.INSTANCE.m6721getGreen0d7_KjU(), 0, 2, null), composer, 1573296, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2036505310$lib_shoestring_externalDebug, reason: not valid java name */
    public final Function3<String, Composer, Integer, Unit> m18928getLambda$2036505310$lib_shoestring_externalDebug() {
        return f9248lambda$2036505310;
    }

    /* renamed from: getLambda$-722247118$lib_shoestring_externalDebug, reason: not valid java name */
    public final Function3<String, Composer, Integer, Unit> m18929getLambda$722247118$lib_shoestring_externalDebug() {
        return f9249lambda$722247118;
    }
}
