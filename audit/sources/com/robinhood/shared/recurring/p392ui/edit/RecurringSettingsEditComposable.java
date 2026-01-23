package com.robinhood.shared.recurring.p392ui.edit;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: RecurringSettingsEditComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.recurring.ui.edit.ComposableSingletons$RecurringSettingsEditComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class RecurringSettingsEditComposable {
    public static final RecurringSettingsEditComposable INSTANCE = new RecurringSettingsEditComposable();
    private static Function2<Composer, Integer, Unit> lambda$705783277 = ComposableLambda3.composableLambdaInstance(705783277, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.ComposableSingletons$RecurringSettingsEditComposableKt$lambda$705783277$1
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
                ComposerKt.traceEventStart(705783277, i, -1, "com.robinhood.shared.recurring.ui.edit.ComposableSingletons$RecurringSettingsEditComposableKt.lambda$705783277.<anonymous> (RecurringSettingsEditComposable.kt:47)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$605832513 = ComposableLambda3.composableLambdaInstance(605832513, false, RecurringSettingsEditComposable3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$122750464 = ComposableLambda3.composableLambdaInstance(122750464, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.recurring.ui.edit.ComposableSingletons$RecurringSettingsEditComposableKt$lambda$122750464$1
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
                ComposerKt.traceEventStart(122750464, i, -1, "com.robinhood.shared.recurring.ui.edit.ComposableSingletons$RecurringSettingsEditComposableKt.lambda$122750464.<anonymous> (RecurringSettingsEditComposable.kt:46)");
            }
            RecurringSettingsEditComposable recurringSettingsEditComposable = RecurringSettingsEditComposable.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(recurringSettingsEditComposable.getLambda$705783277$lib_recurring_ui_externalDebug(), null, recurringSettingsEditComposable.getLambda$605832513$lib_recurring_ui_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$122750464$lib_recurring_ui_externalDebug() {
        return lambda$122750464;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$605832513$lib_recurring_ui_externalDebug() {
        return lambda$605832513;
    }

    public final Function2<Composer, Integer, Unit> getLambda$705783277$lib_recurring_ui_externalDebug() {
        return lambda$705783277;
    }
}
