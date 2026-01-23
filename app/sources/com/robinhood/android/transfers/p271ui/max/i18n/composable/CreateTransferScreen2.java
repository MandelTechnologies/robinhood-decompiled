package com.robinhood.android.transfers.p271ui.max.i18n.composable;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.i18n.InternationalTransferViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateTransferScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$1$4, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferScreen2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ InternationalTransferDuxo $duxo;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ SnapshotState4<InternationalTransferViewState> $state$delegate;

    CreateTransferScreen2(SnapshotState4<InternationalTransferViewState> snapshotState4, InternationalTransferDuxo internationalTransferDuxo, Navigator navigator) {
        this.$state$delegate = snapshotState4;
        this.$duxo = internationalTransferDuxo;
        this.$navigator = navigator;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1435587344, i, -1, "com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferScreen.kt:64)");
        }
        TransferEditScreenData transferEditScreenData = CreateTransferScreen.CreateTransferScreen$lambda$0(this.$state$delegate).getTransferEditScreenData();
        if (transferEditScreenData != null) {
            final InternationalTransferDuxo internationalTransferDuxo = this.$duxo;
            Navigator navigator = this.$navigator;
            SnapshotState4<InternationalTransferViewState> snapshotState4 = this.$state$delegate;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(internationalTransferDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$1$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateTransferScreen2.invoke$lambda$4$lambda$1$lambda$0(internationalTransferDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(internationalTransferDuxo);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.composable.CreateTransferScreenKt$CreateTransferScreen$1$1$1$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(CreateTransferScreen2.invoke$lambda$4$lambda$3$lambda$2(internationalTransferDuxo, (KeyEvent) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            TransferEditScreen2.TransferEditScreen(transferEditScreenData, function0, (Function1) objRememberedValue2, CreateTransferScreen.CreateTransferScreen$lambda$0(snapshotState4).getTransferSummaryState(), navigator, null, composer, 0, 32);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(InternationalTransferDuxo internationalTransferDuxo) {
        internationalTransferDuxo.continueSelected();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4$lambda$3$lambda$2(InternationalTransferDuxo internationalTransferDuxo, KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internationalTransferDuxo.numpadItemSelected(it);
        return true;
    }
}
