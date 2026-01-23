package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.investmentstracker.linking.models.AccountListViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: InvestmentsTrackerAddAccountItem.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAddAccountItemKt$lambda$-1935760765$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InvestmentsTrackerAddAccountItem2 implements Function2<Composer, Integer, Unit> {
    public static final InvestmentsTrackerAddAccountItem2 INSTANCE = new InvestmentsTrackerAddAccountItem2();

    InvestmentsTrackerAddAccountItem2() {
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
            ComposerKt.traceEventStart(-1935760765, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAddAccountItemKt.lambda$-1935760765.<anonymous> (InvestmentsTrackerAddAccountItem.kt:31)");
        }
        AccountListViewState accountListViewState = new AccountListViewState(extensions2.persistentListOf(), false, null, null, 12, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAddAccountItemKt$lambda$-1935760765$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAddAccountItem4.InvestmentsTrackerAddAccountItem(accountListViewState, (Function0) objRememberedValue, null, composer, 48, 4);
        AccountListViewState accountListViewState2 = new AccountListViewState(extensions2.persistentListOf(), true, null, null, 12, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerAddAccountItemKt$lambda$-1935760765$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InvestmentsTrackerAddAccountItem4.InvestmentsTrackerAddAccountItem(accountListViewState2, (Function0) objRememberedValue2, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
