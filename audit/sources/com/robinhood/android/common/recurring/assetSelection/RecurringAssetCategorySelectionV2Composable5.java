package com.robinhood.android.common.recurring.assetSelection;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.lib.sweep.enrollment.api.ApiSweepEnrollment;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.recurring.models.RecurringInvestmentCategory2;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringAssetCategorySelectionV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt$lambda$1634650689$1, reason: use source file name */
/* loaded from: classes2.dex */
final class RecurringAssetCategorySelectionV2Composable5 implements Function2<Composer, Integer, Unit> {
    public static final RecurringAssetCategorySelectionV2Composable5 INSTANCE = new RecurringAssetCategorySelectionV2Composable5();

    RecurringAssetCategorySelectionV2Composable5() {
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
            ComposerKt.traceEventStart(1634650689, i, -1, "com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt.lambda$1634650689.<anonymous> (RecurringAssetCategorySelectionV2Composable.kt:480)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        SweepsStatus sweepsStatus = new SweepsStatus(true, new ApiSweepEnrollment(true), new SweepsInterest("", new BigDecimal(String.valueOf(1.5f)), new BigDecimal(String.valueOf(3.75f)), new BigDecimal(String.valueOf(1.5f))));
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(1.0f));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(5800.0f));
        Currency currency = Currencies.USD;
        Money money = Money3.toMoney(bigDecimal2, currency);
        Money money2 = Money3.toMoney(new BigDecimal(String.valueOf(5800.0f)), currency);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.common.recurring.assetSelection.ComposableSingletons$RecurringAssetCategorySelectionV2ComposableKt$lambda$1634650689$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RecurringAssetCategorySelectionV2Composable5.invoke$lambda$1$lambda$0((RecurringInvestmentCategory2) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RecurringAssetCategorySelectionV2Composable7.RecurringAssetCategorySelectionV2Composable(sweepsStatus, bigDecimal, money, money2, "123", null, null, true, true, true, true, (Function1) objRememberedValue, modifierM4872backgroundbw27NRU$default, composer, 920346624, 54, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(RecurringInvestmentCategory2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
