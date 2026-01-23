package com.robinhood.android.acats.plaid.transfer.partial.edit;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData;
import com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo6;
import com.robinhood.android.acats.plaid.transfer.partial.edit.utils.AmountInputVisualTransformation;
import com.robinhood.android.acatsin.util.AcatsInScreenContext;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsPlaidPartialTransferEditComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2$1$1$2, reason: use source file name */
/* loaded from: classes24.dex */
final class AcatsPlaidPartialTransferEditComposable4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ AcatsPlaidPartialTransferEditDuxo $duxo;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $forEditAsset;
    final /* synthetic */ boolean $hasSubZero;
    final /* synthetic */ AcatsInScreenContext $screenContext;
    final /* synthetic */ AcatsPlaidPartialTransferEditDuxo6 $viewState;

    AcatsPlaidPartialTransferEditComposable4(AcatsPlaidPartialTransferEditDuxo6 acatsPlaidPartialTransferEditDuxo6, AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, FocusRequester focusRequester, AcatsInScreenContext acatsInScreenContext, boolean z) {
        this.$viewState = acatsPlaidPartialTransferEditDuxo6;
        this.$forEditAsset = acatsPlaidPartialTransferAssetRowData;
        this.$duxo = acatsPlaidPartialTransferEditDuxo;
        this.$focusRequester = focusRequester;
        this.$screenContext = acatsInScreenContext;
        this.$hasSubZero = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws IOException {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) throws IOException {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(277146498, i, -1, "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsPlaidPartialTransferEditComposable.kt:115)");
        }
        boolean zIsZeroOrLess = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).isZeroOrLess();
        String adjustedAmount = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getAdjustedAmount();
        boolean validAdjustedAmount = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getValidAdjustedAmount();
        AmountInputVisualTransformation amountFormatter = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getAmountFormatter();
        AcatsPlaidPartialTransferEditDuxo4 selectedRow = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getSelectedRow();
        boolean userFinishedEditing = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getUserFinishedEditing();
        boolean showBorrowingFeeTooltip = ((AcatsPlaidPartialTransferEditDuxo6.Ready) this.$viewState).getShowBorrowingFeeTooltip();
        AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData = this.$forEditAsset;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$duxo);
        final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo = this.$duxo;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AcatsPlaidPartialTransferEditComposable4.invoke$lambda$1$lambda$0(acatsPlaidPartialTransferEditDuxo, (AcatsPlaidPartialTransferEditDuxo4) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
        final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo2 = this.$duxo;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2$1$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AcatsPlaidPartialTransferEditComposable4.invoke$lambda$3$lambda$2(acatsPlaidPartialTransferEditDuxo2, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance3 = composer.changedInstance(this.$duxo);
        final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo3 = this.$duxo;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2$1$1$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsPlaidPartialTransferEditComposable4.invoke$lambda$5$lambda$4(acatsPlaidPartialTransferEditDuxo3);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function0 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        FocusRequester focusRequester = this.$focusRequester;
        AcatsInScreenContext acatsInScreenContext = this.$screenContext;
        boolean z = this.$hasSubZero;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance4 = composer.changedInstance(this.$duxo);
        final AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo4 = this.$duxo;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditComposableKt$AcatsPlaidPartialTransferEditComposable$4$2$1$1$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AcatsPlaidPartialTransferEditComposable4.invoke$lambda$7$lambda$6(acatsPlaidPartialTransferEditDuxo4);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        AcatsPlaidPartialTransferEditComposable.AcatsPlaidPartialTransferEditSection(acatsPlaidPartialTransferAssetRowData, adjustedAmount, zIsZeroOrLess, validAdjustedAmount, amountFormatter, selectedRow, function1, function12, function0, focusRequester, userFinishedEditing, acatsInScreenContext, z, showBorrowingFeeTooltip, (Function0) objRememberedValue4, composer, 805306368, AcatsInScreenContext.$stable << 3, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, boolean z) {
        acatsPlaidPartialTransferEditDuxo.updateUserEditingState(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo) {
        acatsPlaidPartialTransferEditDuxo.resetAdjustedAmount();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo, AcatsPlaidPartialTransferEditDuxo4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        acatsPlaidPartialTransferEditDuxo.updateSelectedRow(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo) {
        acatsPlaidPartialTransferEditDuxo.toggleTooltipDisplay();
        return Unit.INSTANCE;
    }
}
