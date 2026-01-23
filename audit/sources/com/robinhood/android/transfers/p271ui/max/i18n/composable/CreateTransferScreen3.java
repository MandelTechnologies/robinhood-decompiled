package com.robinhood.android.transfers.p271ui.max.i18n.composable;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: CreateTransferScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$1$7, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferScreen3 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ InternationalTransferDuxo $duxo;
    final /* synthetic */ Function0<Unit> $showFxRateSheet;
    final /* synthetic */ SnapshotState4<InternationalTransferViewState> $state$delegate;

    CreateTransferScreen3(SnapshotState4<InternationalTransferViewState> snapshotState4, InternationalTransferDuxo internationalTransferDuxo, Function0<Unit> function0) {
        this.$state$delegate = snapshotState4;
        this.$duxo = internationalTransferDuxo;
        this.$showFxRateSheet = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1401921895, i, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferScreen.kt:88)");
        }
        final TransferReviewScreenData transferReviewScreenData = CreateTransferScreen.CreateTransferScreen$lambda$0(this.$state$delegate).getTransferReviewScreenData();
        if (transferReviewScreenData != null) {
            final InternationalTransferDuxo internationalTransferDuxo = this.$duxo;
            Function0<Unit> function0 = this.$showFxRateSheet;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(internationalTransferDuxo) | composer.changedInstance(transferReviewScreenData);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$1$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTransferScreen3.invoke$lambda$3$lambda$1$lambda$0(internationalTransferDuxo, transferReviewScreenData);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(internationalTransferDuxo);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CreateTransferScreen4(internationalTransferDuxo);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            TransferReviewScreen2.TransferReviewScreen(function02, (Function0) ((KFunction) objRememberedValue2), transferReviewScreenData, function0, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$1$lambda$0(InternationalTransferDuxo internationalTransferDuxo, TransferReviewScreenData transferReviewScreenData) {
        internationalTransferDuxo.transferContinueSelected(transferReviewScreenData.getAmount());
        return Unit.INSTANCE;
    }
}
