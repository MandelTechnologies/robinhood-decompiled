package com.truelayer.payments.p419ui.screens.components;

import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BankUnavailableDialog.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.components.ComposableSingletons$BankUnavailableDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BankUnavailableDialog2 {
    public static final BankUnavailableDialog2 INSTANCE = new BankUnavailableDialog2();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9584lambda1 = ComposableLambda3.composableLambdaInstance(849756497, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.ComposableSingletons$BankUnavailableDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(849756497, i, -1, "com.truelayer.payments.ui.screens.components.ComposableSingletons$BankUnavailableDialogKt.lambda-1.<anonymous> (BankUnavailableDialog.kt:21)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.bank_unavailable, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27092getLambda1$payments_ui_release() {
        return f9584lambda1;
    }
}
