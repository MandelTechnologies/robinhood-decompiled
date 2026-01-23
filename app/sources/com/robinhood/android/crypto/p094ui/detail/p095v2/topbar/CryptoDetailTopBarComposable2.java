package com.robinhood.android.crypto.p094ui.detail.p095v2.topbar;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoDetailTopBarComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt$lambda$-16581924$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoDetailTopBarComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoDetailTopBarComposable2 INSTANCE = new CryptoDetailTopBarComposable2();

    CryptoDetailTopBarComposable2() {
    }

    private static final float invoke$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
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
            ComposerKt.traceEventStart(-16581924, i, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt.lambda$-16581924.<anonymous> (CryptoDetailTopBarComposable.kt:288)");
        }
        boolean z = invoke$lambda$0(InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composer, 0, 1), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1000, 0, Easing3.getLinearEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), null, composer, (InfiniteTransition.$stable | 432) | (InfiniteRepeatableSpec.$stable << 9), 8)) > 0.5f;
        CryptoDetailTopBarViewState cryptoDetailTopBarViewState = new CryptoDetailTopBarViewState(null, "$3708.80", "Ethereum", true, extensions2.persistentListOf(CryptoDetailTopBarAction.Pip.INSTANCE, CryptoDetailTopBarAction.AdvancedAlerts.INSTANCE, new CryptoDetailTopBarAction.AddToList("Add BTC to List")));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt$lambda$-16581924$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt$lambda$-16581924$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailTopBarComposable2.invoke$lambda$4$lambda$3((CryptoDetailTopBarAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoDetailTopBarComposable7.TopBarInternal(cryptoDetailTopBarViewState, z, function0, (Function1) objRememberedValue2, null, composer, 3456, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(CryptoDetailTopBarAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
