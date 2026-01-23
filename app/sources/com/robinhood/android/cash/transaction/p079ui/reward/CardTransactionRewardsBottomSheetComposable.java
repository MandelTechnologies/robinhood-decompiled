package com.robinhood.android.cash.transaction.p079ui.reward;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.p079ui.reward.CardTransactionRewardsBottomSheetViewState;
import com.robinhood.android.common.history.p082ui.HistoryRow2;
import com.robinhood.android.common.history.p082ui.HistoryRow3;
import com.robinhood.android.common.history.p082ui.HistoryRow4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.p320db.MerchantReward;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardTransactionRewardsBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"PlaceholderPrimaryText", "", "PlaceholderSecondaryText", "CardTransactionRewardsBottomSheetComposable", "", "state", "Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState;", "onSelectReward", "Lkotlin/Function1;", "Lcom/robinhood/models/db/MerchantReward;", "(Lcom/robinhood/android/cash/transaction/ui/reward/CardTransactionRewardsBottomSheetViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-cash-transaction_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class CardTransactionRewardsBottomSheetComposable {
    private static final String PlaceholderPrimaryText = "XXXX xxxxxxx XXX";
    private static final String PlaceholderSecondaryText = "XXX XX";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardTransactionRewardsBottomSheetComposable$lambda$3(CardTransactionRewardsBottomSheetViewState cardTransactionRewardsBottomSheetViewState, Function1 function1, int i, Composer composer, int i2) {
        CardTransactionRewardsBottomSheetComposable(cardTransactionRewardsBottomSheetViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CardTransactionRewardsBottomSheetComposable(final CardTransactionRewardsBottomSheetViewState state, final Function1<? super MerchantReward, Unit> onSelectReward, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSelectReward, "onSelectReward");
        Composer composerStartRestartGroup = composer.startRestartGroup(-968613175);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(state) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectReward) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-968613175, i2, -1, "com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetComposable (CardTransactionRewardsBottomSheetComposable.kt:23)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10421R.string.rewards_sheet_title, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(Column6.INSTANCE.align(companion, companion2.getCenterHorizontally()), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            if (!(state instanceof CardTransactionRewardsBottomSheetViewState.Loaded)) {
                if (!(state instanceof CardTransactionRewardsBottomSheetViewState.Loading)) {
                    composerStartRestartGroup.startReplaceGroup(516164786);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-1178265250);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-987625918, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetComposableKt$CardTransactionRewardsBottomSheetComposable$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-987625918, i5, -1, "com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetComposable.<anonymous>.<anonymous> (CardTransactionRewardsBottomSheetComposable.kt:49)");
                        }
                        int size = ((CardTransactionRewardsBottomSheetViewState.Loading) state).getRewards().size();
                        for (int i6 = 0; i6 < size; i6++) {
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, "XXXX xxxxxxx XXX", "XXX XX", null, null, null, false, false, false, 0L, null, composer2, 3456, 0, 4083);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1178693980);
                for (final MerchantReward merchantReward : ((CardTransactionRewardsBottomSheetViewState.Loaded) state).getRewards()) {
                    StatefulHistoryEvent<HistoryEvent> statefulHistoryEvent = merchantReward.toStatefulHistoryEvent();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(merchantReward) | ((i4 & 112) == 32);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new HistoryRow2() { // from class: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetComposableKt$CardTransactionRewardsBottomSheetComposable$1$1$1$1
                            @Override // com.robinhood.android.common.history.p082ui.HistoryRow2
                            public final void onHistoryRowClicked(HistoryRow3 it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onSelectReward.invoke(merchantReward);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    HistoryRow4.HistoryRow(statefulHistoryEvent, (HistoryRow2) objRememberedValue, null, false, false, null, null, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composerStartRestartGroup = composer2;
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.transaction.ui.reward.CardTransactionRewardsBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardTransactionRewardsBottomSheetComposable.CardTransactionRewardsBottomSheetComposable$lambda$3(state, onSelectReward, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
