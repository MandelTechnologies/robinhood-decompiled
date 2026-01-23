package com.truelayer.payments.p419ui.screens.providerselection.components;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.core.domain.common.Currency;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SaveAccountDetailsDialog.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SaveAccountDetailsDialog {
    public static final SaveAccountDetailsDialog INSTANCE = new SaveAccountDetailsDialog();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<Row5, Composer, Integer, Unit> f9608lambda1 = ComposableLambda3.composableLambdaInstance(2019584787, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2019584787, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt.lambda-1.<anonymous> (SaveAccountDetailsDialog.kt:103)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.save_account_details_dialog_button_save_details, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<Row5, Composer, Integer, Unit> f9609lambda2 = ComposableLambda3.composableLambdaInstance(-261537131, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-261537131, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt.lambda-2.<anonymous> (SaveAccountDetailsDialog.kt:108)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.save_account_details_dialog_button_not_now, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9610lambda3 = ComposableLambda3.composableLambdaInstance(130132442, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt$lambda-3$1
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
                ComposerKt.traceEventStart(130132442, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt.lambda-3.<anonymous> (SaveAccountDetailsDialog.kt:87)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.save_account_details_dialog_title, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9611lambda4 = ComposableLambda3.composableLambdaInstance(-1894608022, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1894608022, i, -1, "com.truelayer.payments.ui.screens.providerselection.components.ComposableSingletons$SaveAccountDetailsDialogKt.lambda-4.<anonymous> (SaveAccountDetailsDialog.kt:129)");
                }
                SaveAccountDetailsDialog6.SaveAccountDetailsDialog("", null, Currency.Defaults.INSTANCE.getGBP(), null, null, composer, 566, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m27119getLambda1$payments_ui_release() {
        return f9608lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function3<Row5, Composer, Integer, Unit> m27120getLambda2$payments_ui_release() {
        return f9609lambda2;
    }

    /* renamed from: getLambda-3$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27121getLambda3$payments_ui_release() {
        return f9610lambda3;
    }

    /* renamed from: getLambda-4$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27122getLambda4$payments_ui_release() {
        return f9611lambda4;
    }
}
