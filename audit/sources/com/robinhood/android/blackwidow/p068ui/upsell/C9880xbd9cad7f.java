package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1901821025$1 */
/* loaded from: classes7.dex */
final class C9880xbd9cad7f implements Function2<Composer, Integer, Unit> {
    public static final C9880xbd9cad7f INSTANCE = new C9880xbd9cad7f();

    C9880xbd9cad7f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$1$lambda$0() {
        return 4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901821025, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1901821025.<anonymous> (ExploreLegendUpsellComposable.kt:1259)");
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHART_LINE_24;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1901821025$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(C9880xbd9cad7f.invoke$lambda$1$lambda$0());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ExploreLegendUpsellComposableKt.CarouselNavigation(serverToBentoAssetMapper2, "Trade on the chart", PagerStateKt.rememberPagerState(0, 0.0f, (Function0) objRememberedValue, composer, 384, 3), 0, true, false, 4, composer, 1797174, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
