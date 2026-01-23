package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.font.FontWeight;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.UpcomingEventCard;
import com.robinhood.android.eventcontracts.hub.p134v2.cards.UpcomingEventCardViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks2;
import com.robinhood.android.eventcontracts.hub.p134v2.home.Loggings;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.BentoThemeForPreview;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardUtils2;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.SeedIcon;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon5;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpcomingEventCard.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aC\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0019\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001a"}, m3636d2 = {"TwelveDpSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "ZeroSpacing", "EventCardShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "UpcomingEventCardHeight", "UpcomingEventCard", "", "state", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContractRow", "contractState", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState$ContractViewState;", "tertiaryTextMaxWidth", "allowPillClick", "", "onPillClick", "Lkotlin/Function0;", "ContractRow-EUb7tLY", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState$ContractViewState;FLandroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "UpcomingEventCardPreview", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/UpcomingEventCardViewState;Landroidx/compose/runtime/Composer;I)V", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class UpcomingEventCard {
    private static final float TwelveDpSpacing = C2002Dp.m7995constructorimpl(12);
    private static final float ZeroSpacing = C2002Dp.m7995constructorimpl(0);
    private static final RoundedCornerShape EventCardShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
    private static final float UpcomingEventCardHeight = C2002Dp.m7995constructorimpl(150);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractRow_EUb7tLY$lambda$9(UpcomingEventCardViewState.ContractViewState contractViewState, float f, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        m14326ContractRowEUb7tLY(contractViewState, f, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpcomingEventCard$lambda$0(UpcomingEventCardViewState upcomingEventCardViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UpcomingEventCard(upcomingEventCardViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpcomingEventCardPreview$lambda$10(UpcomingEventCardViewState upcomingEventCardViewState, int i, Composer composer, int i2) {
        UpcomingEventCardPreview(upcomingEventCardViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: UpcomingEventCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$UpcomingEventCard$1 */
    static final class C165471 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ UpcomingEventCardViewState $state;

        C165471(Modifier modifier, UpcomingEventCardViewState upcomingEventCardViewState) {
            this.$modifier = modifier;
            this.$state = upcomingEventCardViewState;
        }

        public final void invoke(Composer composer, int i) {
            int i2;
            UpcomingEventCardViewState upcomingEventCardViewState;
            HubNavigationCallbacks hubNavigationCallbacks;
            Composer composer2;
            boolean z;
            Composer composer3;
            HubNavigationCallbacks hubNavigationCallbacks2;
            BentoTheme bentoTheme;
            HapticFeedback hapticFeedback;
            Modifier.Companion companion;
            int i3;
            UpcomingEventCardViewState upcomingEventCardViewState2;
            int i4;
            Composer composer4;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(359623453, i, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCard.<anonymous> (UpcomingEventCard.kt:106)");
            }
            final HubNavigationCallbacks hubNavigationCallbacks3 = (HubNavigationCallbacks) composer.consume(HubNavigationCallbacks2.getLocalHubNavigationCallbacks());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = InteractionSource2.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
            composer.endReplaceGroup();
            final HapticFeedback hapticFeedback2 = (HapticFeedback) composer.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Modifier modifierClip = Clip.clip(SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null), UpcomingEventCard.UpcomingEventCardHeight, 0.0f, 2, null), UpcomingEventCard.EventCardShape);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme2.getColors(composer, i5).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composer, i5).m21373getBg30d7_KjU(), UpcomingEventCard.EventCardShape);
            boolean zIsTappable = this.$state.isTappable();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(hapticFeedback2) | composer.changedInstance(hubNavigationCallbacks3) | composer.changed(this.$state);
            final UpcomingEventCardViewState upcomingEventCardViewState3 = this.$state;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$UpcomingEventCard$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpcomingEventCard.C165471.invoke$lambda$2$lambda$1(hapticFeedback2, hubNavigationCallbacks3, upcomingEventCardViewState3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM4876borderxT4_qwU, zIsTappable, null, null, (Function0) objRememberedValue2, 6, null), null, true, false, false, true, false, null, 109, null), bentoTheme2.getSpacing(composer, i5).m21590getDefaultD9Ej5fM());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            UpcomingEventCardViewState upcomingEventCardViewState4 = this.$state;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, companion3.getStart(), composer, 6);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion5);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composer.startReplaceGroup(-1465942174);
            if (upcomingEventCardViewState4.getShowLiveIcon()) {
                i2 = i5;
                hubNavigationCallbacks = hubNavigationCallbacks3;
                z = false;
                upcomingEventCardViewState = upcomingEventCardViewState4;
                composer2 = composer;
                LiveStatusIcon5.m14380LiveStatusIconPZHvWI(null, 0.0f, bentoTheme2.getColors(composer, i5).m21425getFg0d7_KjU(), null, composer2, 0, 11);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion5, bentoTheme2.getSpacing(composer2, i2).m21593getSmallD9Ej5fM()), composer2, 0);
            } else {
                i2 = i5;
                upcomingEventCardViewState = upcomingEventCardViewState4;
                hubNavigationCallbacks = hubNavigationCallbacks3;
                composer2 = composer;
                z = false;
            }
            composer2.endReplaceGroup();
            StringResource title = upcomingEventCardViewState.getTitle();
            composer2.startReplaceGroup(-1465933735);
            if (title == null) {
                hubNavigationCallbacks2 = hubNavigationCallbacks;
                composer3 = composer2;
                hapticFeedback = hapticFeedback2;
                companion = companion5;
                i3 = i2;
                upcomingEventCardViewState2 = upcomingEventCardViewState;
                bentoTheme = bentoTheme2;
            } else {
                composer3 = composer;
                hubNavigationCallbacks2 = hubNavigationCallbacks;
                bentoTheme = bentoTheme2;
                hapticFeedback = hapticFeedback2;
                companion = companion5;
                i3 = i2;
                upcomingEventCardViewState2 = upcomingEventCardViewState;
                BentoText2.m20747BentoText38GnDrw(StringUtil2.getText(title, composer2, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i2).getTextS(), composer3, 0, 0, 8190);
                Unit unit = Unit.INSTANCE;
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            String subtitle = upcomingEventCardViewState2.getSubtitle();
            composer3.startReplaceGroup(523204495);
            if (subtitle == null) {
                composer4 = composer3;
                i4 = i3;
            } else {
                int i6 = i3;
                i4 = i6;
                BentoText2.m20747BentoText38GnDrw(subtitle, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, upcomingEventCardViewState2.getTitle() != null ? UpcomingEventCard.TwelveDpSpacing : UpcomingEventCard.ZeroSpacing, 0.0f, 0.0f, 13, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 24576, 0, 8172);
                composer4 = composer3;
                Unit unit2 = Unit.INSTANCE;
            }
            composer4.endReplaceGroup();
            float fMeasureMaxWidthInDp = CardUtils2.measureMaxWidthInDp(TextMeasurerHelper.rememberTextMeasurer(0, composer4, 0, 1), upcomingEventCardViewState2.getTertiaryTextStrings(), bentoTheme.getTypography(composer4, i4).getTextM(), composer4, 0);
            composer4.startReplaceGroup(523227589);
            for (final UpcomingEventCardViewState.ContractViewState contractViewState : upcomingEventCardViewState2.getContractsStates()) {
                String str = "event-card-row-" + contractViewState.getContractId();
                Modifier.Companion companion6 = Modifier.INSTANCE;
                composer4.startReplaceGroup(523233358);
                float fM21595getXsmallD9Ej5fM = contractViewState.getPillState() instanceof CardPills7.QuoteWithPositionPillState ? BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21595getXsmallD9Ej5fM() : UpcomingEventCard.TwelveDpSpacing;
                composer4.endReplaceGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, fM21595getXsmallD9Ej5fM, 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                boolean zIsTappable2 = upcomingEventCardViewState2.isTappable();
                composer4.startReplaceGroup(-1224400529);
                final HapticFeedback hapticFeedback3 = hapticFeedback;
                final HubNavigationCallbacks hubNavigationCallbacks4 = hubNavigationCallbacks2;
                final UpcomingEventCardViewState upcomingEventCardViewState5 = upcomingEventCardViewState2;
                boolean zChangedInstance2 = composer4.changedInstance(hapticFeedback3) | composer4.changedInstance(hubNavigationCallbacks4) | composer4.changed(upcomingEventCardViewState5) | composer4.changedInstance(contractViewState);
                Object objRememberedValue3 = composer4.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$UpcomingEventCard$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpcomingEventCard.C165471.invoke$lambda$11$lambda$10$lambda$7$lambda$6(hapticFeedback3, hubNavigationCallbacks4, upcomingEventCardViewState5, contractViewState);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue3);
                }
                composer4.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default, interactionSource3, null, zIsTappable2, null, null, (Function0) objRememberedValue3, 24, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer4.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(str, null, null, null, new Component(Component.ComponentType.ROW, str, null, 4, null), null, 46, null)), false, false, false, true, false, null, 108, null);
                boolean z2 = upcomingEventCardViewState5.isInAcqStreamlinedTradeFlowExperiment() && !contractViewState.getHasPosition();
                composer4.startReplaceGroup(-1746271574);
                boolean zChangedInstance3 = composer4.changedInstance(hubNavigationCallbacks4) | composer4.changed(upcomingEventCardViewState5) | composer4.changedInstance(contractViewState);
                Object objRememberedValue4 = composer4.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$UpcomingEventCard$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpcomingEventCard.C165471.invoke$lambda$11$lambda$10$lambda$9$lambda$8(hubNavigationCallbacks4, upcomingEventCardViewState5, contractViewState);
                        }
                    };
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                composer4.endReplaceGroup();
                hapticFeedback = hapticFeedback3;
                UpcomingEventCard.m14326ContractRowEUb7tLY(contractViewState, fMeasureMaxWidthInDp, modifierAutoLogEvents$default, z2, (Function0) objRememberedValue4, composer4, 0, 0);
                composer4 = composer;
                hubNavigationCallbacks2 = hubNavigationCallbacks4;
                upcomingEventCardViewState2 = upcomingEventCardViewState5;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(HapticFeedback hapticFeedback, HubNavigationCallbacks hubNavigationCallbacks, UpcomingEventCardViewState upcomingEventCardViewState) {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7042getConfirm5zf0vsI());
            hubNavigationCallbacks.navigateToEventDetail(upcomingEventCardViewState.getEventId(), null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$7$lambda$6(HapticFeedback hapticFeedback, HubNavigationCallbacks hubNavigationCallbacks, UpcomingEventCardViewState upcomingEventCardViewState, UpcomingEventCardViewState.ContractViewState contractViewState) {
            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7042getConfirm5zf0vsI());
            hubNavigationCallbacks.navigateToEventDetail(upcomingEventCardViewState.getEventId(), contractViewState.getContractId());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(HubNavigationCallbacks hubNavigationCallbacks, UpcomingEventCardViewState upcomingEventCardViewState, UpcomingEventCardViewState.ContractViewState contractViewState) {
            hubNavigationCallbacks.quotePillClicked(upcomingEventCardViewState.getEventId(), contractViewState.getContractId());
            return Unit.INSTANCE;
        }
    }

    public static final void UpcomingEventCard(final UpcomingEventCardViewState state, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1646437608);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1646437608, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCard (UpcomingEventCard.kt:100)");
            }
            AutoLoggingCompositionLocals.EventLoggable(Loggings.withCardContext((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getHubCardContext()), ComposableLambda3.rememberComposableLambda(359623453, true, new C165471(modifier, state), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpcomingEventCard.UpcomingEventCard$lambda$0(state, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c0  */
    /* renamed from: ContractRow-EUb7tLY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14326ContractRowEUb7tLY(final UpcomingEventCardViewState.ContractViewState contractViewState, final float f, Modifier modifier, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        UpcomingEventCardViewState.ContractViewState contractViewState2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        Function0<Unit> function03;
        float f2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String tertiaryText;
        int i6;
        BentoTheme bentoTheme;
        int i7;
        boolean z3;
        String secondaryText;
        CardPills7 pillState;
        Modifier modifierAutoLogEvents$default;
        Function0<Unit> function04;
        final Modifier modifier3;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1874946502);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            contractViewState2 = contractViewState;
        } else if ((i & 6) == 0) {
            contractViewState2 = contractViewState;
            i3 = (composerStartRestartGroup.changedInstance(contractViewState2) ? 4 : 2) | i;
        } else {
            contractViewState2 = contractViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function02 = function0;
                        i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function05 = function02;
                    } else {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? false : z2;
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function03 = (Function0) objRememberedValue;
                        } else {
                            function03 = function02;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1874946502, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.ContractRow (UpcomingEventCard.kt:224)");
                        }
                        if (!(contractViewState2.getPillState() instanceof CardPills7.QuoteWithPositionPillState)) {
                            f2 = TwelveDpSpacing;
                        } else {
                            f2 = ZeroSpacing;
                        }
                        float f3 = f2;
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically = companion.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 1.0f, false, 2, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default, 0.0f, f3, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 0.0f, 9, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        SeedIcon.SeedIcon(contractViewState2.getImageUrl(), contractViewState2.getContractColor(), null, false, composerStartRestartGroup, 0, 12);
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        tertiaryText = contractViewState2.getTertiaryText();
                        composerStartRestartGroup.startReplaceGroup(323487377);
                        if (tertiaryText != null) {
                            i7 = i3;
                            z3 = false;
                            i6 = i9;
                            bentoTheme = bentoTheme2;
                        } else {
                            i6 = i9;
                            bentoTheme = bentoTheme2;
                            i7 = i3;
                            z3 = false;
                            BentoText2.m20747BentoText38GnDrw(tertiaryText, SizeKt.m5176widthInVpY3zN4$default(companion3, f, 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 0, 0, 8120);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(contractViewState.getPrimaryText(), row6.weight(companion3, 1.0f, z3), null, null, !contractViewState.isBold() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composer2, 0, 0, 8172);
                        composerStartRestartGroup = composer2;
                        secondaryText = contractViewState.getSecondaryText();
                        composerStartRestartGroup.startReplaceGroup(323512437);
                        if (secondaryText != null) {
                            BentoText2.m20747BentoText38GnDrw(secondaryText, PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 0, 0, 8184);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        pillState = contractViewState.getPillState();
                        composerStartRestartGroup.startReplaceGroup(2144698473);
                        if (pillState != null) {
                            z2 = z4;
                            function04 = function03;
                        } else {
                            Intrinsics.checkNotNull(companion3, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                            if (z4) {
                                modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion3, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-card-pill-" + contractViewState.getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                            } else {
                                modifierAutoLogEvents$default = companion3;
                            }
                            z2 = z4;
                            function04 = function03;
                            CardPills.ContractPill(pillState, modifierAutoLogEvents$default, z2, function04, composerStartRestartGroup, (i7 >> 3) & 8064, 0);
                            Unit unit3 = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        function05 = function04;
                    }
                    final boolean z5 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return UpcomingEventCard.ContractRow_EUb7tLY$lambda$9(contractViewState, f, modifier3, z5, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function02 = function0;
                if ((i3 & 9363) != 9362) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!(contractViewState2.getPillState() instanceof CardPills7.QuoteWithPositionPillState)) {
                    }
                    float f32 = f2;
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, companion32, 1.0f, false, 2, null);
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i92 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default2, 0.0f, f32, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), 0.0f, 9, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            SeedIcon.SeedIcon(contractViewState2.getImageUrl(), contractViewState2.getContractColor(), null, false, composerStartRestartGroup, 0, 12);
                            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            tertiaryText = contractViewState2.getTertiaryText();
                            composerStartRestartGroup.startReplaceGroup(323487377);
                            if (tertiaryText != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Composer composer22 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(contractViewState.getPrimaryText(), row62.weight(companion32, 1.0f, z3), null, null, !contractViewState.isBold() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composer22, 0, 0, 8172);
                            composerStartRestartGroup = composer22;
                            secondaryText = contractViewState.getSecondaryText();
                            composerStartRestartGroup.startReplaceGroup(323512437);
                            if (secondaryText != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            pillState = contractViewState.getPillState();
                            composerStartRestartGroup.startReplaceGroup(2144698473);
                            if (pillState != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            function05 = function04;
                        }
                    }
                }
                final boolean z52 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function02 = function0;
            if ((i3 & 9363) != 9362) {
            }
            final boolean z522 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        if ((i3 & 9363) != 9362) {
        }
        final boolean z5222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void UpcomingEventCardPreview(final UpcomingEventCardViewState upcomingEventCardViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1741730169);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(upcomingEventCardViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741730169, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardPreview (UpcomingEventCard.kt:482)");
            }
            BentoThemeForPreview.BentoThemeForPreview(false, ComposableLambda3.rememberComposableLambda(877892087, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt.UpcomingEventCardPreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(877892087, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardPreview.<anonymous> (UpcomingEventCard.kt:484)");
                    }
                    UpcomingEventCard.UpcomingEventCard(upcomingEventCardViewState, null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.UpcomingEventCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpcomingEventCard.UpcomingEventCardPreview$lambda$10(upcomingEventCardViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
