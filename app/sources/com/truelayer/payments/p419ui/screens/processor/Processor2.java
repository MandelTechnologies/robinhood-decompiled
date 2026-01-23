package com.truelayer.payments.p419ui.screens.processor;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.truelayer.payments.p419ui.screens.coordinator.FlowCoordinator;
import com.truelayer.payments.p419ui.screens.processor.ProcessorResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: Processor.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Processor", "", "context", "Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;", "onSuccess", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Successful;", "onFailure", "Lcom/truelayer/payments/ui/screens/processor/ProcessorResult$Failure;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/truelayer/payments/ui/screens/processor/ProcessorContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.processor.ProcessorKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Processor2 {
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Processor(final ProcessorContext context, Function1<? super ProcessorResult.Successful, Unit> onSuccess, Function1<? super ProcessorResult.Failure, Unit> onFailure, CoroutineDispatcher coroutineDispatcher, Composer composer, final int i, final int i2) {
        int i3;
        final Function1<? super ProcessorResult.Successful, Unit> function1;
        final Function1<? super ProcessorResult.Failure, Unit> function12;
        final CoroutineDispatcher coroutineDispatcher2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1069556720);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(context) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSuccess) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFailure) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 1024;
        }
        if (i4 != 8 || (i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i4 != 0) {
                    i3 &= -7169;
                }
                CoroutineDispatcher coroutineDispatcher3 = coroutineDispatcher;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                FlowCoordinator.FlowCoordinator(ProcessorContext.intoPaymentContext$payments_ui_release$default(context, false, null, 3, null), onSuccess, onFailure, coroutineDispatcher3, composerStartRestartGroup, (i3 & 112) | 4096 | (i3 & 896), 0);
                function1 = onSuccess;
                function12 = onFailure;
                if (ComposerKt.isTraceInProgress()) {
                }
                coroutineDispatcher2 = coroutineDispatcher3;
            } else {
                if (i4 != 0) {
                    coroutineDispatcher = Dispatchers.getIO();
                    i3 &= -7169;
                }
                CoroutineDispatcher coroutineDispatcher32 = coroutineDispatcher;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1069556720, i3, -1, "com.truelayer.payments.ui.screens.processor.Processor (Processor.kt:13)");
                }
                FlowCoordinator.FlowCoordinator(ProcessorContext.intoPaymentContext$payments_ui_release$default(context, false, null, 3, null), onSuccess, onFailure, coroutineDispatcher32, composerStartRestartGroup, (i3 & 112) | 4096 | (i3 & 896), 0);
                function1 = onSuccess;
                function12 = onFailure;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                coroutineDispatcher2 = coroutineDispatcher32;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            coroutineDispatcher2 = coroutineDispatcher;
            function12 = onFailure;
            function1 = onSuccess;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.processor.ProcessorKt.Processor.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    Processor2.Processor(context, function1, function12, coroutineDispatcher2, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
