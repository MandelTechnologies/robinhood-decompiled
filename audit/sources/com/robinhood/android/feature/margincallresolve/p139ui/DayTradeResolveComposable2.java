package com.robinhood.android.feature.margincallresolve.p139ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.feature.margincallresolve.DayTradeResolveState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DayTradeResolveComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveComposableKt$DayTradeResolveComposable$2$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class DayTradeResolveComposable2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ DayTradeResolveState3 $viewState;

    DayTradeResolveComposable2(DayTradeResolveState3 dayTradeResolveState3, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.$viewState = dayTradeResolveState3;
        this.$coroutineScope = coroutineScope;
        this.$listState = lazyListState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 6) == 0) {
            i |= composer.changed(item) ? 4 : 2;
        }
        if ((i & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-152794342, i, -1, "com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DayTradeResolveComposable.kt:113)");
        }
        AnnotatedString annotatedStringM14521createTitlemxwnekA = DayTradeResolveComposable.m14521createTitlemxwnekA(((DayTradeResolveState3.InDayTradeCall) this.$viewState).getView().getTitle(), ((DayTradeResolveState3.InDayTradeCall) this.$viewState).getView().getAmount(), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getJoule());
        String subtitle = ((DayTradeResolveState3.InDayTradeCall) this.$viewState).getView().getSubtitle();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$listState);
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final LazyListState lazyListState = this.$listState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margincallresolve.ui.DayTradeResolveComposableKt$DayTradeResolveComposable$2$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DayTradeResolveComposable2.invoke$lambda$1$lambda$0(coroutineScope, lazyListState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        DayTradeResolveComposable.NoticeScreen(LazyItemScope.fillParentMaxSize$default(item, Modifier.INSTANCE, 0.0f, 1, null), annotatedStringM14521createTitlemxwnekA, DayTradeResolveComposable.createSubtitle(subtitle, (Function0) objRememberedValue), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, LazyListState lazyListState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DayTradeResolveComposable3(lazyListState, null), 3, null);
        return Unit.INSTANCE;
    }
}
