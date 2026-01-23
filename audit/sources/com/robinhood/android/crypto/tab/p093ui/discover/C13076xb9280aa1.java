package com.robinhood.android.crypto.tab.p093ui.discover;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt$lambda$506469147$1 */
/* loaded from: classes2.dex */
final class C13076xb9280aa1 implements Function2<Composer, Integer, Unit> {
    public static final C13076xb9280aa1 INSTANCE = new C13076xb9280aa1();

    C13076xb9280aa1() {
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
            ComposerKt.traceEventStart(506469147, i, -1, "com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt.lambda$506469147.<anonymous> (CryptoHomeDiscoverExperimentComposable.kt:399)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.discover.ComposableSingletons$CryptoHomeDiscoverExperimentComposableKt$lambda$506469147$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C13076xb9280aa1.invoke$lambda$1$lambda$0((LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(modifierM4872backgroundbw27NRU$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        CryptoHomeDiscoverExperimentComposableKt.loading(LazyColumn);
        return Unit.INSTANCE;
    }
}
