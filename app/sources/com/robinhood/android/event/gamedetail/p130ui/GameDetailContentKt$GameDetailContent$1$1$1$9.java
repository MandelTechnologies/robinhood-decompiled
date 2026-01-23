package com.robinhood.android.event.gamedetail.p130ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.event.gamedetail.GameDetailViewState;
import com.robinhood.android.event.gamedetail.builders.AboutEventType;
import com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks;
import com.robinhood.android.event.gamedetail.callbacks.GdpCommonCallbacks;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: GameDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class GameDetailContentKt$GameDetailContent$1$1$1$9 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ GameDetailScreenCallbacks $callbacks;
    final /* synthetic */ GdpCommonCallbacks $commonCallbacks;
    final /* synthetic */ GameDetailViewState $viewState;

    GameDetailContentKt$GameDetailContent$1$1$1$9(GameDetailViewState gameDetailViewState, GdpCommonCallbacks gdpCommonCallbacks, GameDetailScreenCallbacks gameDetailScreenCallbacks) {
        this.$viewState = gameDetailViewState;
        this.$commonCallbacks = gdpCommonCallbacks;
        this.$callbacks = gameDetailScreenCallbacks;
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
            ComposerKt.traceEventStart(-1408600497, i, -1, "com.robinhood.android.event.gamedetail.ui.GameDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GameDetailContent.kt:234)");
        }
        ImmutableList<AboutEventType> aboutEventTypes = this.$viewState.getAboutEventTypes();
        AboutEventType selectedAboutEventType = this.$viewState.getSelectedAboutEventType();
        GdpCommonCallbacks gdpCommonCallbacks = this.$commonCallbacks;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(gdpCommonCallbacks);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new GameDetailContentKt$GameDetailContent$1$1$1$9$1$1(gdpCommonCallbacks);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Function1 function1 = (Function1) ((KFunction) objRememberedValue);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.$callbacks);
        final GameDetailScreenCallbacks gameDetailScreenCallbacks = this.$callbacks;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.GameDetailContentKt$GameDetailContent$1$1$1$9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GameDetailContentKt$GameDetailContent$1$1$1$9.invoke$lambda$2$lambda$1(gameDetailScreenCallbacks);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        GameDetailAbout.GameDetailAbout(aboutEventTypes, selectedAboutEventType, function1, (Function0) objRememberedValue2, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(GameDetailScreenCallbacks gameDetailScreenCallbacks) {
        gameDetailScreenCallbacks.onEventFaqClick();
        return Unit.INSTANCE;
    }
}
