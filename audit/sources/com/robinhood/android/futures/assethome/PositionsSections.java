package com.robinhood.android.futures.assethome;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.portfolio.position.PositionListItemComposableKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSections.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.ComposableSingletons$PositionsSectionsKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PositionsSections {
    public static final PositionsSections INSTANCE = new PositionsSections();
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$854646825 = ComposableLambda3.composableLambdaInstance(854646825, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.assethome.ComposableSingletons$PositionsSectionsKt$lambda$854646825$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(854646825, i2, -1, "com.robinhood.android.futures.assethome.ComposableSingletons$PositionsSectionsKt.lambda$854646825.<anonymous> (PositionsSections.kt:75)");
            }
            PositionListItemComposableKt.PositionListItemPlaceholder(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$854646825$feature_futures_asset_home_externalDebug() {
        return lambda$854646825;
    }
}
