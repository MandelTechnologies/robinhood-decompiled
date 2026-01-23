package com.robinhood.android.equities.taxlots.table;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxLotsTableHelpers.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableHelpersKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TaxLotsTableHelpers {
    public static final TaxLotsTableHelpers INSTANCE = new TaxLotsTableHelpers();

    /* renamed from: lambda$-1325230823, reason: not valid java name */
    private static Function3<BoxScope, Composer, Integer, Unit> f8892lambda$1325230823 = ComposableLambda3.composableLambdaInstance(-1325230823, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableHelpersKt$lambda$-1325230823$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope boxScope, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(boxScope, "<this>");
            if ((i & 6) == 0) {
                i |= composer.changed(boxScope) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1325230823, i, -1, "com.robinhood.android.equities.taxlots.table.ComposableSingletons$TaxLotsTableHelpersKt.lambda$-1325230823.<anonymous> (TaxLotsTableHelpers.kt:144)");
            }
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1325230823$lib_tax_lots_externalDebug, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m13630getLambda$1325230823$lib_tax_lots_externalDebug() {
        return f8892lambda$1325230823;
    }
}
