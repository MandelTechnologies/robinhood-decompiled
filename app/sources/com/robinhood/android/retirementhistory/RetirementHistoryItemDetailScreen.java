package com.robinhood.android.retirementhistory;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.retirementhistory.RetirementHistoryItemViewState;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementHistoryItemDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirementhistory.ComposableSingletons$RetirementHistoryItemDetailScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementHistoryItemDetailScreen {
    public static final RetirementHistoryItemDetailScreen INSTANCE = new RetirementHistoryItemDetailScreen();

    /* renamed from: lambda$-1555294149, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9227lambda$1555294149 = ComposableLambda3.composableLambdaInstance(-1555294149, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirementhistory.ComposableSingletons$RetirementHistoryItemDetailScreenKt$lambda$-1555294149$1
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
                ComposerKt.traceEventStart(-1555294149, i, -1, "com.robinhood.android.retirementhistory.ComposableSingletons$RetirementHistoryItemDetailScreenKt.lambda$-1555294149.<anonymous> (RetirementHistoryItemDetailScreen.kt:48)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$603058982 = ComposableLambda3.composableLambdaInstance(603058982, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirementhistory.ComposableSingletons$RetirementHistoryItemDetailScreenKt$lambda$603058982$1
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
                ComposerKt.traceEventStart(603058982, i, -1, "com.robinhood.android.retirementhistory.ComposableSingletons$RetirementHistoryItemDetailScreenKt.lambda$603058982.<anonymous> (RetirementHistoryItemDetailScreen.kt:80)");
            }
            RetirementHistoryItemViewState.Loaded loadingMock = RetirementHistoryItemViewState.INSTANCE.getLoadingMock();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.retirementhistory.ComposableSingletons$RetirementHistoryItemDetailScreenKt$lambda$603058982$1$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return true;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            RetirementHistoryItemDetailScreen5.LoadedState(loadingMock, (SduiActionHandler) objRememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1555294149$feature_retirement_history_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18234getLambda$1555294149$feature_retirement_history_externalDebug() {
        return f9227lambda$1555294149;
    }

    public final Function2<Composer, Integer, Unit> getLambda$603058982$feature_retirement_history_externalDebug() {
        return lambda$603058982;
    }
}
