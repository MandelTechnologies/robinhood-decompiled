package com.robinhood.android.equities.equityscreener.crud.create;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.Spacing2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateScreenerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.equityscreener.crud.create.ComposableSingletons$CreateScreenerComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class CreateScreenerComposable {
    public static final CreateScreenerComposable INSTANCE = new CreateScreenerComposable();
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> lambda$457073403 = ComposableLambda3.composableLambdaInstance(457073403, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.ComposableSingletons$CreateScreenerComposableKt$lambda$457073403$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 48) == 0) {
                i2 |= composer.changed(i) ? 32 : 16;
            }
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(457073403, i2, -1, "com.robinhood.android.equities.equityscreener.crud.create.ComposableSingletons$CreateScreenerComposableKt.lambda$457073403.<anonymous> (CreateScreenerComposable.kt:104)");
            }
            PresetScreenerCard4.PlaceholderPresetCard(CreateScreenerComposable3.m13542rowItemPaddingoZzcvok(Modifier.INSTANCE, i, 3, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> getLambda$457073403$lib_equity_screener_externalDebug() {
        return lambda$457073403;
    }
}
