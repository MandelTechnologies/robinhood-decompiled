package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState2;
import com.robinhood.android.futures.sharedfuturesui.ModifiersKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<Boolean> $showFlattenConfirmationDialog$delegate;
    final /* synthetic */ FuturesDetailViewState $state;
    final /* synthetic */ FuturesDetailViewState2 $viewData;

    FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$6(FuturesDetailViewState2 futuresDetailViewState2, FuturesDetailViewState futuresDetailViewState, SnapshotState<Boolean> snapshotState) {
        this.$viewData = futuresDetailViewState2;
        this.$state = futuresDetailViewState;
        this.$showFlattenConfirmationDialog$delegate = snapshotState;
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
            ComposerKt.traceEventStart(243738990, i, -1, "com.robinhood.android.futures.detail.ui.FuturesDetailContentList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FuturesDetailScreenContent.kt:339)");
        }
        FuturesDetailViewState.PositionData data = ((FuturesDetailViewState2.Position) this.$viewData).getData();
        Modifier modifierM14735scrimGUYwDQI$default = ModifiersKt.m14735scrimGUYwDQI$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 7, null), this.$state.isFtuxInProgress(), null, null, 6, null);
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState = this.$showFlattenConfirmationDialog$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.detail.ui.FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FuturesDetailScreenContentKt$FuturesDetailContentList$3$1$1$6.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PositionSectionKt.PositionSection(data, modifierM14735scrimGUYwDQI$default, (Function0) objRememberedValue, composer, StringResource.$stable | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        FuturesDetailScreenContentKt.FuturesDetailContentList$lambda$25(snapshotState, true);
        return Unit.INSTANCE;
    }
}
