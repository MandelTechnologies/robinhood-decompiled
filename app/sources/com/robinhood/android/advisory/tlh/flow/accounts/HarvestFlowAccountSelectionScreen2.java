package com.robinhood.android.advisory.tlh.flow.accounts;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestChooseAccounts;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestChooseAccountsRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HarvestFlowAccountSelectionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.flow.accounts.ComposableSingletons$HarvestFlowAccountSelectionScreenKt$lambda$74963079$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestFlowAccountSelectionScreen2 implements Function2<Composer, Integer, Unit> {
    public static final HarvestFlowAccountSelectionScreen2 INSTANCE = new HarvestFlowAccountSelectionScreen2();

    HarvestFlowAccountSelectionScreen2() {
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
            ComposerKt.traceEventStart(74963079, i, -1, "com.robinhood.android.advisory.tlh.flow.accounts.ComposableSingletons$HarvestFlowAccountSelectionScreenKt.lambda$74963079.<anonymous> (HarvestFlowAccountSelectionScreen.kt:184)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m6727getWhite0d7_KjU(), null, 2, null);
        TaxLossHarvestChooseAccounts taxLossHarvestChooseAccounts = new TaxLossHarvestChooseAccounts("Choose which accounts we should review for gains", "These are your taxable accounts that may have gains. Select all for the most accurate summary.", CollectionsKt.listOf((Object[]) new TaxLossHarvestChooseAccountsRow[]{new TaxLossHarvestChooseAccountsRow("987654321", "Managed Individual", "managed_accounts_24", "We’ll review this account by default", false, true), new TaxLossHarvestChooseAccountsRow("123456789", "Individual", "finance_24", null, true, false), new TaxLossHarvestChooseAccountsRow("123456589", "Joint", "joint_account_24", null, true, false)}));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.flow.accounts.ComposableSingletons$HarvestFlowAccountSelectionScreenKt$lambda$74963079$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return HarvestFlowAccountSelectionScreen2.invoke$lambda$1$lambda$0((List) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HarvestFlowAccountSelectionScreen3.LoadedHarvestFlowAccountSelectionScreen(taxLossHarvestChooseAccounts, (Function1) objRememberedValue, modifierM4872backgroundbw27NRU$default, composer, 432, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
