package com.robinhood.android.blackwidow.p068ui.upsell;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1477957913$1 */
/* loaded from: classes7.dex */
final class C9875xe112b9d implements Function2<Composer, Integer, Unit> {
    public static final C9875xe112b9d INSTANCE = new C9875xe112b9d();

    C9875xe112b9d() {
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
            ComposerKt.traceEventStart(1477957913, i, -1, "com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt.lambda$1477957913.<anonymous> (ExploreLegendUpsellComposable.kt:1241)");
        }
        ExploreLegendUpsellViewState.Ready ready = new ExploreLegendUpsellViewState.Ready(extensions2.persistentMapOf(), null, ExploreLegendUpsellDuxo.INSTANCE.getHeroImageUrl$feature_black_widow_upsell_externalDebug(), true, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1477957913$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1477957913$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function02 = (Function0) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.blackwidow.ui.upsell.ComposableSingletons$ExploreLegendUpsellComposableKt$lambda$1477957913$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        ExploreLegendUpsellComposableKt.ExploreLegendContent(ready, function0, function02, (Function0) objRememberedValue3, null, composer, 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
