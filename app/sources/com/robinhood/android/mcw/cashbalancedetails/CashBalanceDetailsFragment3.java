package com.robinhood.android.mcw.cashbalancedetails;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CashBalanceDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.cashbalancedetails.ComposableSingletons$CashBalanceDetailsFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CashBalanceDetailsFragment3 {
    public static final CashBalanceDetailsFragment3 INSTANCE = new CashBalanceDetailsFragment3();

    /* renamed from: lambda$-1775787240, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9115lambda$1775787240 = ComposableLambda3.composableLambdaInstance(-1775787240, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.cashbalancedetails.ComposableSingletons$CashBalanceDetailsFragmentKt$lambda$-1775787240$1
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
                ComposerKt.traceEventStart(-1775787240, i, -1, "com.robinhood.android.mcw.cashbalancedetails.ComposableSingletons$CashBalanceDetailsFragmentKt.lambda$-1775787240.<anonymous> (CashBalanceDetailsFragment.kt:76)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1247232303 = ComposableLambda3.composableLambdaInstance(1247232303, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.cashbalancedetails.ComposableSingletons$CashBalanceDetailsFragmentKt$lambda$1247232303$1
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
                ComposerKt.traceEventStart(1247232303, i, -1, "com.robinhood.android.mcw.cashbalancedetails.ComposableSingletons$CashBalanceDetailsFragmentKt.lambda$1247232303.<anonymous> (CashBalanceDetailsFragment.kt:134)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1834594043, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9116lambda$1834594043 = ComposableLambda3.composableLambdaInstance(-1834594043, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.cashbalancedetails.ComposableSingletons$CashBalanceDetailsFragmentKt$lambda$-1834594043$1
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
                ComposerKt.traceEventStart(-1834594043, i, -1, "com.robinhood.android.mcw.cashbalancedetails.ComposableSingletons$CashBalanceDetailsFragmentKt.lambda$-1834594043.<anonymous> (CashBalanceDetailsFragment.kt:149)");
            }
            HistoryRowsKt.DefaultHistoryHeader(null, StringResources_androidKt.stringResource(C21666R.string.mcw_cash_balance_details_history_title, composer, 0), composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1775787240$feature_mcw_cash_balance_details_externalDebug */
    public final Function2<Composer, Integer, Unit> m2172x60e53485() {
        return f9115lambda$1775787240;
    }

    /* renamed from: getLambda$-1834594043$feature_mcw_cash_balance_details_externalDebug */
    public final Function2<Composer, Integer, Unit> m2173xb57d2b3a() {
        return f9116lambda$1834594043;
    }

    /* renamed from: getLambda$1247232303$feature_mcw_cash_balance_details_externalDebug */
    public final Function2<Composer, Integer, Unit> m2174xa95a3d57() {
        return lambda$1247232303;
    }
}
