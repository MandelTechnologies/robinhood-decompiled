package com.robinhood.android.transfers.p271ui.max.i18n.details;

import android.content.res.Resources;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.banking.util.ShowFxExchangeRateBottomSheet;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UkBankTransferDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsFragment$Content$1$1$1$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class UkBankTransferDetailsFragment7 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ UkBankTransferDetailsRow $rowItem;
    final /* synthetic */ UkBankTransferDetailsFragment this$0;

    UkBankTransferDetailsFragment7(UkBankTransferDetailsRow ukBankTransferDetailsRow, UkBankTransferDetailsFragment ukBankTransferDetailsFragment) {
        this.$rowItem = ukBankTransferDetailsRow;
        this.this$0 = ukBankTransferDetailsFragment;
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
            ComposerKt.traceEventStart(-1583364800, i, -1, "com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsFragment.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UkBankTransferDetailsFragment.kt:146)");
        }
        StringResource header = this.$rowItem.getHeader();
        Resources resources = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        AnnotatedString annotatedString = new AnnotatedString(header.getText(resources).toString(), null, 2, null);
        StringResource content = this.$rowItem.getContent();
        Resources resources2 = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, this.$rowItem.getBentoIcon(), null, new AnnotatedString(content.getText(resources2).toString(), null, 2, null), null, null, null, null, false, false, 4053, null);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$rowItem) | composer.changedInstance(this.this$0);
        final UkBankTransferDetailsRow ukBankTransferDetailsRow = this.$rowItem;
        final UkBankTransferDetailsFragment ukBankTransferDetailsFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.i18n.details.UkBankTransferDetailsFragment$Content$1$1$1$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UkBankTransferDetailsFragment7.invoke$lambda$1$lambda$0(ukBankTransferDetailsRow, ukBankTransferDetailsFragment);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoDataRowKt.BentoDataRow(bentoDataRowState, null, (Function0) objRememberedValue, composer, BentoDataRowState.$stable, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(UkBankTransferDetailsRow ukBankTransferDetailsRow, UkBankTransferDetailsFragment ukBankTransferDetailsFragment) {
        if (ukBankTransferDetailsRow.getBentoIcon() != null) {
            ShowFxExchangeRateBottomSheet.showFxExchangeRateBottomSheet(ukBankTransferDetailsFragment, ukBankTransferDetailsFragment.getEventScreen());
        }
        return Unit.INSTANCE;
    }
}
