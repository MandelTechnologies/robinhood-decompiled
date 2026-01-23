package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
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
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
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
import com.robinhood.android.eventcontracts.hub.p134v2.cards.FinalEventCardViewState;
import com.robinhood.android.eventcontracts.hub.p134v2.home.Loggings;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.BentoThemeForPreview;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardUtils2;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.SeedIcon;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FinalEventCard.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a1\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0014\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0015"}, m3636d2 = {"TwelveDpSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "FinalEventCardShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "FinalEventCardHeight", "FinalEventCard", "", "state", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContractRow", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState$ContractViewState;", "quoteTextMaxWidth", "secondaryTextMaxWidth", "ContractRow-djqs-MU", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState$ContractViewState;FFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FinalEventCardPreview", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/FinalEventCardViewState;Landroidx/compose/runtime/Composer;I)V", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FinalEventCard {
    private static final float TwelveDpSpacing = C2002Dp.m7995constructorimpl(12);
    private static final RoundedCornerShape FinalEventCardShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
    private static final float FinalEventCardHeight = C2002Dp.m7995constructorimpl(150);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContractRow_djqs_MU$lambda$6(FinalEventCardViewState.ContractViewState contractViewState, float f, float f2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m14320ContractRowdjqsMU(contractViewState, f, f2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalEventCard$lambda$2(FinalEventCardViewState finalEventCardViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FinalEventCard(finalEventCardViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinalEventCardPreview$lambda$7(FinalEventCardViewState finalEventCardViewState, int i, Composer composer, int i2) {
        FinalEventCardPreview(finalEventCardViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinalEventCard(final FinalEventCardViewState state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        boolean z;
        float fM7995constructorimpl;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(1384634712);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1384634712, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCard (FinalEventCard.kt:81)");
                }
                Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), FinalEventCardHeight, 0.0f, 2, null);
                RoundedCornerShape roundedCornerShape = FinalEventCardShape;
                Modifier modifierClip = Clip.clip(modifierM5158heightInVpY3zN4$default, roundedCornerShape);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(modifierClip, C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), roundedCornerShape), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), Loggings.withCardContext((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getHubCardContext()), true, false, false, true, false, null, 108, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifier4 = modifier3;
                BentoText2.m20747BentoText38GnDrw(state.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, TwelveDpSpacing), composerStartRestartGroup, 6);
                TextMeasurer textMeasurerRememberTextMeasurer = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                float fMeasureMaxWidthInDp = CardUtils2.measureMaxWidthInDp(textMeasurerRememberTextMeasurer, state.getQuoteTextStrings(), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0);
                float fMeasureMaxWidthInDp2 = CardUtils2.measureMaxWidthInDp(textMeasurerRememberTextMeasurer, state.getSecondaryTextStrings(), bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-2064998255);
                int i6 = 0;
                for (FinalEventCardViewState.ContractViewState contractViewState : state.getContractViewStates()) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    FinalEventCardViewState.ContractViewState contractViewState2 = contractViewState;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    if (i6 == CollectionsKt.getLastIndex(state.getContractViewStates())) {
                        z = false;
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                    } else {
                        z = false;
                        fM7995constructorimpl = TwelveDpSpacing;
                    }
                    m14320ContractRowdjqsMU(contractViewState2, fMeasureMaxWidthInDp, fMeasureMaxWidthInDp2, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, fM7995constructorimpl, 7, null), composerStartRestartGroup, 0, 0);
                    i6 = i7;
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FinalEventCard.FinalEventCard$lambda$2(state, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM5158heightInVpY3zN4$default2 = SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), FinalEventCardHeight, 0.0f, 2, null);
            RoundedCornerShape roundedCornerShape2 = FinalEventCardShape;
            Modifier modifierClip2 = Clip.clip(modifierM5158heightInVpY3zN4$default2, roundedCornerShape2);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(BorderKt.m4876borderxT4_qwU(modifierClip2, C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), roundedCornerShape2), bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), Loggings.withCardContext((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getHubCardContext()), true, false, false, true, false, null, 108, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier modifier42 = modifier3;
                BentoText2.m20747BentoText38GnDrw(state.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0, 0, 8190);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, TwelveDpSpacing), composerStartRestartGroup, 6);
                TextMeasurer textMeasurerRememberTextMeasurer2 = TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1);
                float fMeasureMaxWidthInDp3 = CardUtils2.measureMaxWidthInDp(textMeasurerRememberTextMeasurer2, state.getQuoteTextStrings(), TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0);
                float fMeasureMaxWidthInDp22 = CardUtils2.measureMaxWidthInDp(textMeasurerRememberTextMeasurer2, state.getSecondaryTextStrings(), bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-2064998255);
                int i62 = 0;
                while (r3.hasNext()) {
                }
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: ContractRow-djqs-MU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m14320ContractRowdjqsMU(final FinalEventCardViewState.ContractViewState contractViewState, final float f, final float f2, Modifier modifier, Composer composer, final int i, final int i2) {
        FinalEventCardViewState.ContractViewState contractViewState2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String secondaryText;
        Modifier modifier3;
        Row6 row6;
        int i4;
        float f3;
        BentoTheme bentoTheme;
        Modifier.Companion companion;
        String metadata;
        FontWeight fontWeight;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1603656418);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            contractViewState2 = contractViewState;
        } else if ((i & 6) == 0) {
            contractViewState2 = contractViewState;
            i3 = (composerStartRestartGroup.changed(contractViewState2) ? 4 : 2) | i;
        } else {
            contractViewState2 = contractViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            } else {
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1603656418, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.ContractRow (FinalEventCard.kt:144)");
                }
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
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
                Row6 row62 = Row6.INSTANCE;
                SeedIcon.SeedIcon(contractViewState2.getImageUrl(), contractViewState2.getContractColor(), null, false, composerStartRestartGroup, 0, 12);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                secondaryText = contractViewState2.getSecondaryText();
                composerStartRestartGroup.startReplaceGroup(-494955608);
                if (secondaryText != null) {
                    row6 = row62;
                    companion = companion3;
                    bentoTheme = bentoTheme2;
                    i4 = i6;
                    f3 = 0.0f;
                    modifier3 = modifier5;
                } else {
                    modifier3 = modifier5;
                    row6 = row62;
                    i4 = i6;
                    f3 = 0.0f;
                    bentoTheme = bentoTheme2;
                    companion = companion3;
                    BentoText2.m20747BentoText38GnDrw(secondaryText, SizeKt.m5176widthInVpY3zN4$default(companion3, f2, 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 0, 0, 8120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                FontWeight bold = !contractViewState.isBold() ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal();
                Composer composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(contractViewState.getPrimaryText(), Row5.weight$default(row6, companion, 1.0f, false, 2, null), null, null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composer2, 0, 0, 8172);
                Composer composer3 = composer2;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(10)), composer3, 6);
                metadata = contractViewState.getMetadata();
                composer3.startReplaceGroup(-494931862);
                if (metadata != null) {
                    fontWeight = bold;
                } else {
                    TextStyle textS = bentoTheme.getTypography(composer3, i4).getTextS();
                    FontWeight fontWeight2 = bold;
                    BentoText2.m20747BentoText38GnDrw(metadata, null, null, null, fontWeight2, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8174);
                    fontWeight = fontWeight2;
                    composer3 = composer3;
                    float f4 = TwelveDpSpacing;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, f4), composer3, 6);
                    BentoDivider.m20636BentoVerticalDivideraMcp0Q(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer3, i4).m21592getMediumD9Ej5fM()), bentoTheme.getColors(composer3, i4).m21373getBg30d7_KjU(), 0.0f, composer3, 0, 4);
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, f4), composer3, 6);
                }
                composer3.endReplaceGroup();
                Composer composer4 = composer3;
                BentoText2.m20747BentoText38GnDrw(contractViewState.getQuote(), SizeKt.m5176widthInVpY3zN4$default(companion, f, f3, 2, null), null, null, fontWeight, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i4).getTextS(), composer4, 0, 0, 8108);
                composerStartRestartGroup = composer4;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FinalEventCard.ContractRow_djqs_MU$lambda$6(contractViewState, f, f2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Row6 row622 = Row6.INSTANCE;
                SeedIcon.SeedIcon(contractViewState2.getImageUrl(), contractViewState2.getContractColor(), null, false, composerStartRestartGroup, 0, 12);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion32, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                secondaryText = contractViewState2.getSecondaryText();
                composerStartRestartGroup.startReplaceGroup(-494955608);
                if (secondaryText != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (!contractViewState.isBold()) {
                }
                Composer composer22 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(contractViewState.getPrimaryText(), Row5.weight$default(row6, companion, 1.0f, false, 2, null), null, null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composer22, 0, 0, 8172);
                Composer composer32 = composer22;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(10)), composer32, 6);
                metadata = contractViewState.getMetadata();
                composer32.startReplaceGroup(-494931862);
                if (metadata != null) {
                }
                composer32.endReplaceGroup();
                Composer composer42 = composer32;
                BentoText2.m20747BentoText38GnDrw(contractViewState.getQuote(), SizeKt.m5176widthInVpY3zN4$default(companion, f, f3, 2, null), null, null, fontWeight, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer32, i4).getTextS(), composer42, 0, 0, 8108);
                composerStartRestartGroup = composer42;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void FinalEventCardPreview(final FinalEventCardViewState finalEventCardViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1182667837);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(finalEventCardViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1182667837, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardPreview (FinalEventCard.kt:292)");
            }
            BentoThemeForPreview.BentoThemeForPreview(false, ComposableLambda3.rememberComposableLambda(1300968141, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardKt.FinalEventCardPreview.1
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
                        ComposerKt.traceEventStart(1300968141, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardPreview.<anonymous> (FinalEventCard.kt:294)");
                    }
                    FinalEventCard.FinalEventCard(finalEventCardViewState, null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.FinalEventCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FinalEventCard.FinalEventCardPreview$lambda$7(finalEventCardViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
