package com.truelayer.payments.p419ui.screens.components;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.theme.ModifiersKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BankUnavailableDialog.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"BankUnavailableDialog", "", "bankName", "", "buttonText", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class BankUnavailableDialog {
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankUnavailableDialog(final String bankName, String str, final Function0<Unit> onDismiss, Composer composer, final int i, final int i2) {
        int i3;
        final String strStringResource;
        final String str2;
        Intrinsics.checkNotNullParameter(bankName, "bankName");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(1357789388);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(bankName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(str)) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                    strStringResource = StringResources_androidKt.stringResource(C42830R.string.f6471ok, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1357789388, i3, -1, "com.truelayer.payments.ui.screens.components.BankUnavailableDialog (BankUnavailableDialog.kt:17)");
                }
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                ErrorDialog6.ErrorDialog(BankUnavailableDialog2.INSTANCE.m27092getLambda1$payments_ui_release(), ComposableLambda3.composableLambda(composerStartRestartGroup, 1796923440, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt.BankUnavailableDialog.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1796923440, i4, -1, "com.truelayer.payments.ui.screens.components.BankUnavailableDialog.<anonymous> (BankUnavailableDialog.kt:22)");
                        }
                        TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.bank_unavailable_dialog_text, new Object[]{bankName}, composer2, 64), ModifiersKt.verticalScroll$default(Modifier.INSTANCE, scrollStateRememberScrollState, false, null, false, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), ComposableLambda3.composableLambda(composerStartRestartGroup, -1550876913, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt.BankUnavailableDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1550876913, i4, -1, "com.truelayer.payments.ui.screens.components.BankUnavailableDialog.<anonymous> (BankUnavailableDialog.kt:24)");
                            }
                            Function0<Unit> function0 = onDismiss;
                            final String str3 = strStringResource;
                            ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableLambda3.composableLambda(composer2, -602726670, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt.BankUnavailableDialog.2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                    invoke(row5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 TextButton, Composer composer3, int i5) {
                                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                    if ((i5 & 81) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-602726670, i5, -1, "com.truelayer.payments.ui.screens.components.BankUnavailableDialog.<anonymous>.<anonymous> (BankUnavailableDialog.kt:25)");
                                    }
                                    String str4 = str3;
                                    Locale ROOT = Locale.ROOT;
                                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                    String upperCase = str4.toUpperCase(ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                    TextKt.m6028Text4IGK_g(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 805306368, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), null, onDismiss, true, true, composerStartRestartGroup, ((i3 << 6) & 57344) | 1769910, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = strStringResource;
            }
            strStringResource = str;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            ErrorDialog6.ErrorDialog(BankUnavailableDialog2.INSTANCE.m27092getLambda1$payments_ui_release(), ComposableLambda3.composableLambda(composerStartRestartGroup, 1796923440, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt.BankUnavailableDialog.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1796923440, i4, -1, "com.truelayer.payments.ui.screens.components.BankUnavailableDialog.<anonymous> (BankUnavailableDialog.kt:22)");
                    }
                    TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.bank_unavailable_dialog_text, new Object[]{bankName}, composer2, 64), ModifiersKt.verticalScroll$default(Modifier.INSTANCE, scrollStateRememberScrollState2, false, null, false, 14, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), ComposableLambda3.composableLambda(composerStartRestartGroup, -1550876913, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt.BankUnavailableDialog.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1550876913, i4, -1, "com.truelayer.payments.ui.screens.components.BankUnavailableDialog.<anonymous> (BankUnavailableDialog.kt:24)");
                        }
                        Function0<Unit> function0 = onDismiss;
                        final String str3 = strStringResource;
                        ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableLambda3.composableLambda(composer2, -602726670, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt.BankUnavailableDialog.2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 TextButton, Composer composer3, int i5) {
                                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                                if ((i5 & 81) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-602726670, i5, -1, "com.truelayer.payments.ui.screens.components.BankUnavailableDialog.<anonymous>.<anonymous> (BankUnavailableDialog.kt:25)");
                                }
                                String str4 = str3;
                                Locale ROOT = Locale.ROOT;
                                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                                String upperCase = str4.toUpperCase(ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                TextKt.m6028Text4IGK_g(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), composer2, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), null, onDismiss, true, true, composerStartRestartGroup, ((i3 << 6) & 57344) | 1769910, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
            str2 = strStringResource;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.BankUnavailableDialogKt.BankUnavailableDialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    BankUnavailableDialog.BankUnavailableDialog(bankName, str2, onDismiss, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
