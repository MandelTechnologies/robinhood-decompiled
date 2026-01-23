package com.truelayer.payments.p419ui.screens.providerselection.scheme;

import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SchemeSelectionContainer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.providerselection.scheme.ComposableSingletons$SchemeSelectionContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SchemeSelectionContainer {
    public static final SchemeSelectionContainer INSTANCE = new SchemeSelectionContainer();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<Row5, Composer, Integer, Unit> f9615lambda1 = ComposableLambda3.composableLambdaInstance(1617137233, false, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.ComposableSingletons$SchemeSelectionContainerKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1617137233, i, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.ComposableSingletons$SchemeSelectionContainerKt.lambda-1.<anonymous> (SchemeSelectionContainer.kt:165)");
            }
            TextKt.m6028Text4IGK_g(StringResources_androidKt.stringResource(C42830R.string.button_continue, composer, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f9616lambda2 = ComposableLambda3.composableLambdaInstance(-465330245, false, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.scheme.ComposableSingletons$SchemeSelectionContainerKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-465330245, i, -1, "com.truelayer.payments.ui.screens.providerselection.scheme.ComposableSingletons$SchemeSelectionContainerKt.lambda-2.<anonymous> (SchemeSelectionContainer.kt:282)");
                }
                SchemeSelectionContainer4.SchemeSelectionContainer("You can decide if you want your money now or later. Your bank may charge a fee", SchemeSelectionContainer4.previewSchemes(), null, null, null, composer, 454, 24);
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
    public final Function3<Row5, Composer, Integer, Unit> m27126getLambda1$payments_ui_release() {
        return f9615lambda1;
    }

    /* renamed from: getLambda-2$payments_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m27127getLambda2$payments_ui_release() {
        return f9616lambda2;
    }
}
