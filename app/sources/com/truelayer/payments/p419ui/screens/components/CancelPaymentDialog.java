package com.truelayer.payments.p419ui.screens.components;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.models.PaymentContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CancelPaymentDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\n"}, m3636d2 = {"CancelPaymentDialog", "", "paymentType", "Lcom/truelayer/payments/ui/models/PaymentContext$PaymentType;", "onDismiss", "Lkotlin/Function0;", "onAbort", "(Lcom/truelayer/payments/ui/models/PaymentContext$PaymentType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "getStringResources", "Lcom/truelayer/payments/ui/screens/components/ErrorDialogResourceIds;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.components.CancelPaymentDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CancelPaymentDialog {

    /* compiled from: CancelPaymentDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.truelayer.payments.ui.screens.components.CancelPaymentDialogKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentContext.PaymentType.values().length];
            try {
                iArr[PaymentContext.PaymentType.SinglePayment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentContext.PaymentType.Mandate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CancelPaymentDialog(final PaymentContext.PaymentType paymentType, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        Function0<Unit> function04;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(paymentType, "paymentType");
        Composer composerStartRestartGroup = composer.startRestartGroup(-64302260);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(paymentType) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 896) == 0) {
                    function04 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
                }
                if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Function0<Unit> function07 = i5 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.components.CancelPaymentDialogKt.CancelPaymentDialog.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    } : function03;
                    Function0<Unit> function08 = i4 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.components.CancelPaymentDialogKt.CancelPaymentDialog.2
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }
                    } : function04;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-64302260, i3, -1, "com.truelayer.payments.ui.screens.components.CancelPaymentDialog (CancelPaymentDialog.kt:12)");
                    }
                    ErrorDialogResourceIds stringResources = getStringResources(paymentType);
                    ErrorDialog6.ErrorDialog(StringResources_androidKt.stringResource(stringResources.getTitle(), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(stringResources.getMessage(), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(stringResources.getContinue(), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(stringResources.getDismiss(), composerStartRestartGroup, 0), function08, function07, false, false, composerStartRestartGroup, (57344 & (i3 << 6)) | ((i3 << 12) & 458752), 192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function05 = function08;
                    function06 = function07;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function06 = function03;
                    function05 = function04;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.CancelPaymentDialogKt.CancelPaymentDialog.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            CancelPaymentDialog.CancelPaymentDialog(paymentType, function06, function05, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function04 = function02;
            if ((i3 & 731) != 146) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ErrorDialogResourceIds stringResources2 = getStringResources(paymentType);
                ErrorDialog6.ErrorDialog(StringResources_androidKt.stringResource(stringResources2.getTitle(), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(stringResources2.getMessage(), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(stringResources2.getContinue(), composerStartRestartGroup, 0), StringResources_androidKt.stringResource(stringResources2.getDismiss(), composerStartRestartGroup, 0), function08, function07, false, false, composerStartRestartGroup, (57344 & (i3 << 6)) | ((i3 << 12) & 458752), 192);
                if (ComposerKt.isTraceInProgress()) {
                }
                function05 = function08;
                function06 = function07;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function03 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function04 = function02;
        if ((i3 & 731) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final ErrorDialogResourceIds getStringResources(PaymentContext.PaymentType paymentType) {
        int i = WhenMappings.$EnumSwitchMapping$0[paymentType.ordinal()];
        if (i == 1) {
            return new ErrorDialogResourceIds(C42830R.string.cancel_payment_title, C42830R.string.cancel_payment_text, C42830R.string.cancel_payment_no_button, C42830R.string.cancel_payment_yes_button);
        }
        if (i == 2) {
            return new ErrorDialogResourceIds(C42830R.string.cancel_mandate_title, C42830R.string.cancel_mandate_text, C42830R.string.cancel_mandate_no_button, C42830R.string.cancel_mandate_yes_button);
        }
        throw new NoWhenBranchMatchedException();
    }
}
