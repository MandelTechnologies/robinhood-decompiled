package com.robinhood.android.creditcard.p091ui.creditapplication.finalterms;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardsComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0012X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Rewards", "", "maxHeight", "", "onCardholderAgreementClick", "Lkotlin/Function0;", "onCreditScoreNoticeClick", "onGoldAgreementClick", "modifier", "Landroidx/compose/ui/Modifier;", "(DLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Reward", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "id", "", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;ILandroidx/compose/runtime/Composer;I)V", "REWARDS_AGREEMENT_BUTTON_KEY", "", "REWARDS_GOLD_AGREEMENT_BUTTON_KEY", "REWARDS_CREDIT_SCORE_BUTTON_KEY", "REWARDS_SIPC_BUTTON_KEY", "REWARDS_LIST_TEST_TAG", "REWARDS_AGREEMENT_BUTTON_TEST_TAG", "REWARDS_GOLD_AGREEMENT_BUTTON_TEST_TAG", "REWARDS_CREDIT_SCORE_BUTTON_TEST_TAG", "REWARDS_SIPC_BUTTON_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RewardsComposableKt {
    public static final String REWARDS_AGREEMENT_BUTTON_KEY = "rewards-agreement-button-key";
    public static final String REWARDS_AGREEMENT_BUTTON_TEST_TAG = "rewards-agreement-button-test-tag";
    public static final String REWARDS_CREDIT_SCORE_BUTTON_KEY = "rewards-credit-score-button-key";
    public static final String REWARDS_CREDIT_SCORE_BUTTON_TEST_TAG = "rewards-credit-score-button-test-tag";
    public static final String REWARDS_GOLD_AGREEMENT_BUTTON_KEY = "rewards-gold-agreement-button-key";
    public static final String REWARDS_GOLD_AGREEMENT_BUTTON_TEST_TAG = "rewards-gold-agreement-button-test-tag";
    public static final String REWARDS_LIST_TEST_TAG = "rewards-list-test-tag";
    public static final String REWARDS_SIPC_BUTTON_KEY = "rewards-sipc-button-key";
    public static final String REWARDS_SIPC_BUTTON_TEST_TAG = "rewards-sipc-button-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Reward$lambda$4(ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, int i2, Composer composer, int i3) {
        Reward(serverToBentoAssetMapper2, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rewards$lambda$2(double d, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Rewards(d, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Rewards(final double d, final Function0<Unit> onCardholderAgreementClick, final Function0<Unit> onCreditScoreNoticeClick, final Function0<Unit> onGoldAgreementClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final EventLogger current;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCardholderAgreementClick, "onCardholderAgreementClick");
        Intrinsics.checkNotNullParameter(onCreditScoreNoticeClick, "onCreditScoreNoticeClick");
        Intrinsics.checkNotNullParameter(onGoldAgreementClick, "onGoldAgreementClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-398342024);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(d) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCardholderAgreementClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCreditScoreNoticeClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGoldAgreementClick) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-398342024, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Rewards (RewardsComposable.kt:48)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier2, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), REWARDS_LIST_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RewardsComposableKt.Rewards$lambda$1$lambda$0(onCardholderAgreementClick, onCreditScoreNoticeClick, onGoldAgreementClick, current, context, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function1);
                    objRememberedValue = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier4 = modifier2;
                LazyDslKt.LazyColumn(modifierTestTag, null, null, false, bottom, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer2, 221184, 462);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RewardsComposableKt.Rewards$lambda$2(d, onCardholderAgreementClick, onCreditScoreNoticeClick, onGoldAgreementClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Arrangement.Vertical bottom2 = Arrangement.INSTANCE.getBottom();
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.m5158heightInVpY3zN4$default(modifier2, 0.0f, C2002Dp.m7995constructorimpl((float) d), 1, null), REWARDS_LIST_TEST_TAG);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(context);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                Function1 function12 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RewardsComposableKt.Rewards$lambda$1$lambda$0(onCardholderAgreementClick, onCreditScoreNoticeClick, onGoldAgreementClick, current, context, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function12);
                objRememberedValue = function12;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier42 = modifier2;
                LazyDslKt.LazyColumn(modifierTestTag2, null, null, false, bottom2, centerHorizontally2, null, false, null, (Function1) objRememberedValue, composer2, 221184, 462);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rewards$lambda$1$lambda$0(final Function0 function0, final Function0 function02, final Function0 function03, EventLogger eventLogger, Context context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        ComposableSingletons$RewardsComposableKt composableSingletons$RewardsComposableKt = ComposableSingletons$RewardsComposableKt.INSTANCE;
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$1973116237$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.m12677getLambda$397157500$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$868913285$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$2134984070$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.m12678getLambda$893912441$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$372158344$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$1638229129$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.m12674getLambda$1390667382$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.m12672getLambda$124596597$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$1141474188$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, REWARDS_AGREEMENT_BUTTON_KEY, null, ComposableLambda3.composableLambdaInstance(-1608598842, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$Rewards$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608598842, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Rewards.<anonymous>.<anonymous>.<anonymous> (RewardsComposable.kt:113)");
                }
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RewardsComposableKt.REWARDS_AGREEMENT_BUTTON_TEST_TAG);
                BentoTextButton2.m20715BentoTextButtonPIknLig(function0, StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_cardholder_agreement, composer, 0), modifierTestTag, new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.LINK_OUT_12, BentoTextButton3.Icon.Position.Trailing), null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), composer, (BentoTextButton3.Icon.Size12.$stable << 9) | 384, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.m12676getLambda$342528057$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, REWARDS_CREDIT_SCORE_BUTTON_KEY, null, ComposableLambda3.composableLambdaInstance(923542728, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$Rewards$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(923542728, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Rewards.<anonymous>.<anonymous>.<anonymous> (RewardsComposable.kt:127)");
                }
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RewardsComposableKt.REWARDS_CREDIT_SCORE_BUTTON_TEST_TAG);
                BentoTextButton2.m20715BentoTextButtonPIknLig(function02, StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_credit_score_notice, composer, 0), modifierTestTag, new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.LINK_OUT_12, BentoTextButton3.Icon.Position.Trailing), null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), composer, (BentoTextButton3.Icon.Size12.$stable << 9) | 384, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.m12675getLambda$2105353783$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, REWARDS_GOLD_AGREEMENT_BUTTON_KEY, null, ComposableLambda3.composableLambdaInstance(-839282998, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$Rewards$1$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-839282998, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Rewards.<anonymous>.<anonymous>.<anonymous> (RewardsComposable.kt:141)");
                }
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, RewardsComposableKt.REWARDS_GOLD_AGREEMENT_BUTTON_TEST_TAG);
                BentoTextButton2.m20715BentoTextButtonPIknLig(function03, StringResources_androidKt.stringResource(C12201R.string.credit_app_final_terms_gold_financial_agreement, composer, 0), modifierTestTag, new BentoTextButton3.Icon.Size12(ServerToBentoAssetMapper2.LINK_OUT_12, BentoTextButton3.Icon.Position.Trailing), null, false, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), composer, (BentoTextButton3.Icon.Size12.$stable << 9) | 384, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$426787787$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.getLambda$1692858572$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$RewardsComposableKt.m12673getLambda$1336037939$feature_credit_card_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, REWARDS_SIPC_BUTTON_KEY, null, ComposableLambda3.composableLambdaInstance(-69967154, true, new RewardsComposableKt$Rewards$1$1$4(eventLogger, context)), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Reward(final ServerToBentoAssetMapper2 serverToBentoAssetMapper2, final int i, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1224998421);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(serverToBentoAssetMapper2.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        int i4 = i3;
        if ((i4 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1224998421, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.finalterms.Reward (RewardsComposable.kt:176)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(size24, null, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(12)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i, composerStartRestartGroup, (i4 >> 3) & 14), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextAnnotation(), composer2, 0, 0, 8126);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.finalterms.RewardsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsComposableKt.Reward$lambda$4(serverToBentoAssetMapper2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
