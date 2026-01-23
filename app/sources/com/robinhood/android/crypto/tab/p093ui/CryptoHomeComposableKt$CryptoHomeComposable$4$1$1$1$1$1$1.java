package com.robinhood.android.crypto.tab.p093ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.crypto.tab.p093ui.header.CryptoHomeHeaderComposable;
import com.robinhood.compose.bento.theme.BentoTheme4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoHomeComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<BentoTheme4> $direction$delegate;
    final /* synthetic */ Function1<BentoTheme4, Unit> $onDirectionChanged;
    final /* synthetic */ SnapshotState4<CryptoHomeViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$1(SnapshotState<BentoTheme4> snapshotState, Function1<? super BentoTheme4, Unit> function1, SnapshotState4<CryptoHomeViewState> snapshotState4) {
        this.$direction$delegate = snapshotState;
        this.$onDirectionChanged = function1;
        this.$viewState$delegate = snapshotState4;
    }

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
            ComposerKt.traceEventStart(-207311500, i, -1, "com.robinhood.android.crypto.tab.ui.CryptoHomeComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoHomeComposable.kt:336)");
        }
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$direction$delegate) | composer.changed(this.$onDirectionChanged);
        final Function1<BentoTheme4, Unit> function1 = this.$onDirectionChanged;
        final SnapshotState<BentoTheme4> snapshotState = this.$direction$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoHomeComposableKt$CryptoHomeComposable$4$1$1$1$1$1$1.invoke$lambda$1$lambda$0(function1, snapshotState, (BentoTheme4) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoHomeHeaderComposable.CryptoHomeHeaderComposable((Function1) objRememberedValue, CryptoHomeComposableKt.CryptoHomeComposable$lambda$0(this.$viewState$delegate).getAccountNumber(), null, null, null, composer, 0, 28);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SnapshotState snapshotState, BentoTheme4 newDirection) {
        Intrinsics.checkNotNullParameter(newDirection, "newDirection");
        snapshotState.setValue(newDirection);
        function1.invoke(newDirection);
        return Unit.INSTANCE;
    }
}
