package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: UkQueuedDepositConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.ComposableSingletons$UkQueuedDepositConfirmationComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkQueuedDepositConfirmationComposable {
    public static final UkQueuedDepositConfirmationComposable INSTANCE = new UkQueuedDepositConfirmationComposable();
    private static Function2<Composer, Integer, Unit> lambda$229982027 = ComposableLambda3.composableLambdaInstance(229982027, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.ComposableSingletons$UkQueuedDepositConfirmationComposableKt$lambda$229982027$1
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
                ComposerKt.traceEventStart(229982027, i, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.confirmation.ComposableSingletons$UkQueuedDepositConfirmationComposableKt.lambda$229982027.<anonymous> (UkQueuedDepositConfirmationComposable.kt:113)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("------ ----"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 384, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$229982027$feature_transfers_externalRelease() {
        return lambda$229982027;
    }
}
