package com.robinhood.android.crypto.p094ui.detail.recurring;

import android.content.Context;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.common.history.p082ui.HistoryRowsKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailRecurringComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$3$3, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoDetailRecurringComposable5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ SnapshotState4<CryptoDetailRecurringViewState> $viewState$delegate;

    CryptoDetailRecurringComposable5(Navigator navigator, Context context, SnapshotState4<CryptoDetailRecurringViewState> snapshotState4) {
        this.$navigator = navigator;
        this.$context = context;
        this.$viewState$delegate = snapshotState4;
    }

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
            ComposerKt.traceEventStart(783356768, i, -1, "com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposable.<anonymous>.<anonymous> (CryptoDetailRecurringComposable.kt:135)");
        }
        String strStringResource = StringResources_androidKt.stringResource(CryptoDetailRecurringComposable3.CryptoDetailRecurringComposable$lambda$0(this.$viewState$delegate).getCtaText(), composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.recurring.CryptoDetailRecurringComposableKt$CryptoDetailRecurringComposable$3$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoDetailRecurringComposable5.invoke$lambda$1$lambda$0(navigator, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HistoryRowsKt.HistoryFooterTextButton(strStringResource, (Function0) objRememberedValue, null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new RecurringHubFragmentKey(null, 1, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
