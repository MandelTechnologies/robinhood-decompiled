package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.p077v2.logging.RhyEventLoggingUtils;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.rhyrewards.p246ui.CashCardOffer;
import com.robinhood.android.rhyrewards.p246ui.CashCardOfferComposable;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsMoreOffersCardView;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import p479j$.time.Clock;

/* compiled from: RhyOverviewCashCardOffersComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/rosetta/eventlogging/Screen;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/rhyrewards/ui/CashCardOffer;", "merchantOffers", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "moreOffers", "Lkotlin/Function1;", "", "showOfferDetails", "Lkotlin/Function0;", "onViewAllOffers", "RhyOverviewCashCardOffersComposable", "(Landroidx/compose/ui/Modifier;Lj$/time/Clock;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCashCardOffersComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewCashCardOffersComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewCashCardOffersComposable$lambda$10(Modifier modifier, Clock clock, Screen screen, Context context, ImmutableList immutableList, ImmutableList immutableList2, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        RhyOverviewCashCardOffersComposable(modifier, clock, screen, context, immutableList, immutableList2, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RhyOverviewCashCardOffersComposable(Modifier modifier, final Clock clock, final Screen loggingScreen, final Context context, final ImmutableList<? extends CashCardOffer> merchantOffers, ImmutableList<MerchantOfferV2> moreOffers, final Function1<? super CashCardOffer, Unit> function1, final Function0<Unit> onViewAllOffers, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final ImmutableList<MerchantOfferV2> immutableList;
        Composer composer2;
        final Modifier modifier3;
        Context loggingContext = context;
        final Function1<? super CashCardOffer, Unit> showOfferDetails = function1;
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(loggingScreen, "loggingScreen");
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(merchantOffers, "merchantOffers");
        Intrinsics.checkNotNullParameter(moreOffers, "moreOffers");
        Intrinsics.checkNotNullParameter(showOfferDetails, "showOfferDetails");
        Intrinsics.checkNotNullParameter(onViewAllOffers, "onViewAllOffers");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1123032092);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(clock) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loggingScreen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loggingContext) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(merchantOffers) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(moreOffers) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showOfferDetails) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onViewAllOffers) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1123032092, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCashCardOffersComposable (RhyOverviewCashCardOffersComposable.kt:46)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            float fM21593getSmallD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Modifier modifier5 = modifier4;
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f = 0.0f;
            boolean z = true;
            int i6 = i3;
            float f2 = fM21593getSmallD9Ej5fM;
            int i7 = 1048576;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10285R.string.rhy_account_cash_card_offers_title, composerStartRestartGroup, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            Composer composer3 = composerStartRestartGroup;
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(ScrollKt.horizontalScroll$default(companion3, ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null), 0.0f, bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer3, i5).m21590getDefaultD9Ej5fM()), companion.getTop(), composer3, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer3.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            boolean z2 = false;
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, f2), composer3, 0);
            composer3.startReplaceGroup(-456012535);
            Composer composer4 = composer3;
            for (final CashCardOffer cashCardOffer : merchantOffers) {
                composer4.startReplaceGroup(-1633490746);
                boolean zChangedInstance = ((i6 & 3670016) == i7 ? z : z2) | composer4.changedInstance(cashCardOffer);
                Object objRememberedValue = composer4.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCashCardOffersComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RhyOverviewCashCardOffersComposable.m1743x934a0256(showOfferDetails, cashCardOffer);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue);
                }
                composer4.endReplaceGroup();
                Composer composer5 = composer4;
                CashCardOfferComposable.CashCardOfferComposable(clock, cashCardOffer, (Function0) objRememberedValue, null, new UserInteractionEventDescriptor(null, loggingScreen, null, Context.copy$default(loggingContext, 0, 0, 0, null, null, null, null, null, 0, null, String.valueOf(cashCardOffer.getId()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.MERCHANT_REWARD_OFFER_CARD, null, null, 6, null), null, 37, null), composer5, (i6 >> 3) & 14, 8);
                loggingContext = context;
                composer4 = composer5;
                f = f;
                z = z;
                i7 = i7;
                f2 = f2;
                z2 = false;
                showOfferDetails = function1;
            }
            float f3 = f;
            boolean z3 = z;
            float f4 = f2;
            Composer composer6 = composer4;
            immutableList = moreOffers;
            composer6.endReplaceGroup();
            composer6.startReplaceGroup(-455993073);
            if (!immutableList.isEmpty()) {
                composer6.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer6.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                if (objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCashCardOffersComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhyOverviewCashCardOffersComposable.m1744x3a9e9fc1((android.content.Context) obj);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer6.endReplaceGroup();
                composer6.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer6.changedInstance(immutableList) | ((i6 & 29360128) == 8388608 ? z3 ? 1 : 0 : false);
                Object objRememberedValue3 = composer6.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCashCardOffersComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return RhyOverviewCashCardOffersComposable.m1745x177af321(immutableList, onViewAllOffers, (MerchantRewardsMoreOffersCardView) obj);
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue3);
                }
                composer6.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function12, null, (Function1) objRememberedValue3, composer6, 6, 2);
            }
            composer6.endReplaceGroup();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion5, f4), composer6, 0);
            composer6.endNode();
            composer2 = composer6;
            BentoTextButton2.m20715BentoTextButtonPIknLig(onViewAllOffers, StringResources_androidKt.stringResource(C10285R.string.rhy_account_cash_card_offers_action, composer6, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion5, f3, composer6, 6, z3 ? 1 : 0), null, null, false, null, composer2, (i6 >> 21) & 14, 120);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
            immutableList = moreOffers;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final ImmutableList<MerchantOfferV2> immutableList2 = immutableList;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCashCardOffersComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewCashCardOffersComposable.RhyOverviewCashCardOffersComposable$lambda$10(modifier3, clock, loggingScreen, context, merchantOffers, immutableList2, function1, onViewAllOffers, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RhyOverviewCashCardOffersComposable$lambda$9$lambda$8$lambda$2$lambda$1$lambda$0 */
    public static final Unit m1743x934a0256(Function1 function1, CashCardOffer cashCardOffer) {
        function1.invoke(cashCardOffer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RhyOverviewCashCardOffersComposable$lambda$9$lambda$8$lambda$4$lambda$3 */
    public static final MerchantRewardsMoreOffersCardView m1744x3a9e9fc1(android.content.Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new MerchantRewardsMoreOffersCardView(it, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RhyOverviewCashCardOffersComposable$lambda$9$lambda$8$lambda$7$lambda$6 */
    public static final Unit m1745x177af321(ImmutableList immutableList, Function0 function0, MerchantRewardsMoreOffersCardView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.bind2((List<MerchantOfferV2>) immutableList);
        OnClickListeners.onClick(it, function0);
        ViewsKt.setLoggingConfig(it, new AutoLoggingConfig(false, false));
        ViewsKt.eventData$default(it, false, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewCashCardOffersComposableKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyOverviewCashCardOffersComposable.m1746x5d0d20bb();
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RhyOverviewCashCardOffersComposable$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5 */
    public static final UserInteractionEventDescriptor m1746x5d0d20bb() {
        return RhyEventLoggingUtils.toRhyTabEventData$default(RhyEventLoggingUtils.INSTANCE, Component.ComponentType.MERCHANT_REWARD_CAROUSEL, UserInteractionEventData.Action.VIEW_ALL_OFFERS, null, 2, null);
    }
}
