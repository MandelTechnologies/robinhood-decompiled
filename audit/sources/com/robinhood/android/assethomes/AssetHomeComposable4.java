package com.robinhood.android.assethomes;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.ComposableSingletons$AssetHomeComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeComposable4 {
    public static final AssetHomeComposable4 INSTANCE = new AssetHomeComposable4();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$370285104 = ComposableLambda3.composableLambdaInstance(370285104, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.assethomes.ComposableSingletons$AssetHomeComposableKt$lambda$370285104$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(370285104, i, -1, "com.robinhood.android.assethomes.ComposableSingletons$AssetHomeComposableKt.lambda$370285104.<anonymous> (AssetHomeComposable.kt:181)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21597getXxsmallD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$370285104$feature_asset_homes_externalDebug() {
        return lambda$370285104;
    }
}
