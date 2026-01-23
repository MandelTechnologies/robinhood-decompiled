package com.robinhood.android.cash.merchantrewards.p073ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.mcduckling.MerchantRewardUserState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: MerchantRewardsOverviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$Header$1$1$2, reason: use source file name */
/* loaded from: classes7.dex */
final class MerchantRewardsOverviewComposable5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<Instant, Unit> $onViewHistory;
    final /* synthetic */ MerchantRewardsStateWrapper $wrapper;

    /* JADX WARN: Multi-variable type inference failed */
    MerchantRewardsOverviewComposable5(MerchantRewardsStateWrapper merchantRewardsStateWrapper, Function1<? super Instant, Unit> function1) {
        this.$wrapper = merchantRewardsStateWrapper;
        this.$onViewHistory = function1;
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
            ComposerKt.traceEventStart(-2114923883, i, -1, "com.robinhood.android.cash.merchantrewards.ui.Header.<anonymous>.<anonymous>.<anonymous> (MerchantRewardsOverviewComposable.kt:185)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
        String strStringResource = StringResources_androidKt.stringResource(C10127R.string.cash_merchant_rewards_overview_view_history_button, composer, 0);
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$wrapper) | composer.changed(this.$onViewHistory);
        final MerchantRewardsStateWrapper merchantRewardsStateWrapper = this.$wrapper;
        final Function1<Instant, Unit> function1 = this.$onViewHistory;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardsOverviewComposableKt$Header$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOverviewComposable5.invoke$lambda$2$lambda$1(merchantRewardsStateWrapper, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, false, null, composer, 0, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(MerchantRewardsStateWrapper merchantRewardsStateWrapper, Function1 function1) {
        Instant startAt;
        MerchantRewardUserState state = merchantRewardsStateWrapper.getState();
        if (state != null && (startAt = state.getStartAt()) != null) {
            function1.invoke(startAt);
        }
        return Unit.INSTANCE;
    }
}
