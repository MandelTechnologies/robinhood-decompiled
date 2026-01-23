package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountRecommendationSelectionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$LoadedAccountRecommendationSelectionScreen$1$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AccountRecommendationSelectionScreen4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ AccountRecommendationSelectionScreen $callbacks;
    final /* synthetic */ AccountRecommendationSelectionViewState $state;

    AccountRecommendationSelectionScreen4(AccountRecommendationSelectionViewState accountRecommendationSelectionViewState, AccountRecommendationSelectionScreen accountRecommendationSelectionScreen) {
        this.$state = accountRecommendationSelectionViewState;
        this.$callbacks = accountRecommendationSelectionScreen;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(AccountRecommendationSelectionScreen accountRecommendationSelectionScreen, AccountRecommendationSelectionViewState accountRecommendationSelectionViewState) {
        accountRecommendationSelectionScreen.onGetAccountRecommendationClicked(accountRecommendationSelectionViewState.getIntroViewModel());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(AccountRecommendationSelectionScreen accountRecommendationSelectionScreen, AccountRecommendationSelectionViewState accountRecommendationSelectionViewState) {
        accountRecommendationSelectionScreen.onAccountRecommendationDeclined(accountRecommendationSelectionViewState.getAccountSelectionIntro());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1623915104, i, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.LoadedAccountRecommendationSelectionScreen.<anonymous>.<anonymous>.<anonymous> (AccountRecommendationSelectionScreen.kt:48)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
        final AccountRecommendationSelectionViewState accountRecommendationSelectionViewState = this.$state;
        final AccountRecommendationSelectionScreen accountRecommendationSelectionScreen = this.$callbacks;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        Modifier modifierAutoLogRowEvents = UtilsKt.autoLogRowEvents(companion, accountRecommendationSelectionViewState.getRecommendedComponent().getIdentifier());
        String label = accountRecommendationSelectionViewState.getRecommendedComponent().getLabel();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(accountRecommendationSelectionScreen) | composer.changedInstance(accountRecommendationSelectionViewState);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$LoadedAccountRecommendationSelectionScreen$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountRecommendationSelectionScreen4.invoke$lambda$4$lambda$1$lambda$0(accountRecommendationSelectionScreen, accountRecommendationSelectionViewState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogRowEvents, null, label, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, 0, 0, 2042);
        Modifier modifierAutoLogRowEvents2 = UtilsKt.autoLogRowEvents(companion, accountRecommendationSelectionViewState.getSelfDirectedComponent().getIdentifier());
        String label2 = accountRecommendationSelectionViewState.getSelfDirectedComponent().getLabel();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(accountRecommendationSelectionScreen) | composer.changedInstance(accountRecommendationSelectionViewState);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.selection.AccountRecommendationSelectionScreenKt$LoadedAccountRecommendationSelectionScreen$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountRecommendationSelectionScreen4.invoke$lambda$4$lambda$3$lambda$2(accountRecommendationSelectionScreen, accountRecommendationSelectionViewState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogRowEvents2, null, label2, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composer, 0, 0, 2042);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
