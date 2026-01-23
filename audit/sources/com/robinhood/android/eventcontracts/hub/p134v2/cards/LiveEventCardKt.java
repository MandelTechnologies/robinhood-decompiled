package com.robinhood.android.eventcontracts.hub.p134v2.cards;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope6;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks;
import com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks2;
import com.robinhood.android.eventcontracts.hub.p134v2.home.Loggings;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.BentoThemeForPreview;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.CardPills7;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.ScoreDivider;
import com.robinhood.android.eventcontracts.hub.p134v2.p135ui.SeedIcon;
import com.robinhood.android.eventcontracts.sharedeventui.C16594R;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.eventcontracts.sharedeventui.LastTradePriceBar5;
import com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon5;
import com.robinhood.android.eventcontracts.sharedeventui.StringUtil2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.android.ticker.WrappedTickerKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.resource.StringResource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LiveEventCard.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"LiveEventCardHeight", "Landroidx/compose/ui/unit/Dp;", "F", "LiveEventCardShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "LiveEventCard", "", "state", "Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLiveEventCard", "(Lcom/robinhood/android/eventcontracts/hub/v2/cards/LiveEventCardViewState;Landroidx/compose/runtime/Composer;I)V", "feature-hub-v2_externalDebug", "cardWidth", "", "leftAlpha", "rightAlpha"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LiveEventCardKt {
    private static final float LiveEventCardHeight = C2002Dp.m7995constructorimpl(150);
    private static final RoundedCornerShape LiveEventCardShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveEventCard$lambda$32(LiveEventCardViewState liveEventCardViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LiveEventCard(liveEventCardViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLiveEventCard$lambda$33(LiveEventCardViewState liveEventCardViewState, int i, Composer composer, int i2) {
        PreviewLiveEventCard(liveEventCardViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final float LiveEventCard$lambda$3(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float LiveEventCard$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031f  */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LiveEventCard(final LiveEventCardViewState liveEventCardViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        HubNavigationCallbacks hubNavigationCallbacks;
        Object objRememberedValue;
        Composer.Companion companion;
        UserInteractionEventDescriptor userInteractionEventDescriptorWithCardContext;
        EventLogger eventLogger;
        float f;
        final Color color;
        final Color color2;
        EventLogger eventLogger2;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState;
        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2;
        Object objRememberedValue2;
        final SnapshotFloatState2 snapshotFloatState2;
        boolean zChanged;
        Object objRememberedValue3;
        boolean zChangedInstance;
        HubNavigationCallbacks hubNavigationCallbacks2;
        Object liveEventCardKt$LiveEventCard$3$1;
        final Modifier modifier4;
        int i4;
        float f2;
        ?? r12;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue4;
        final Measurer2 measurer2;
        Object objRememberedValue5;
        Object objRememberedValue6;
        final SnapshotState snapshotState;
        Object objRememberedValue7;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Object objRememberedValue8;
        final SnapshotState snapshotState2;
        final int i5;
        boolean zChanged2;
        Object objRememberedValue9;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl2;
        final SnapshotState snapshotState3;
        Object objRememberedValue10;
        boolean zChangedInstance2;
        Object objRememberedValue11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final LiveEventCardViewState state = liveEventCardViewState;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-311604520);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-311604520, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCard (LiveEventCard.kt:134)");
                }
                hubNavigationCallbacks = (HubNavigationCallbacks) composerStartRestartGroup.consume(HubNavigationCallbacks2.getLocalHubNavigationCallbacks());
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                DayNightColor contractColor = state.getLeftContractViewState().getContractColor();
                composerStartRestartGroup.startReplaceGroup(1195776093);
                Color colorM6701boximpl = contractColor != null ? null : Color.m6701boximpl(contractColor.getColor(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                Color colorM6701boximpl2 = colorM6701boximpl == null ? Color.m6701boximpl(Color.m6705copywmQWz5c$default(colorM6701boximpl.getValue(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)) : null;
                DayNightColor contractColor2 = state.getRightContractViewState().getContractColor();
                composerStartRestartGroup.startReplaceGroup(1195779453);
                Color colorM6701boximpl3 = contractColor2 != null ? null : Color.m6701boximpl(contractColor2.getColor(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                Color colorM6701boximpl4 = colorM6701boximpl3 == null ? Color.m6701boximpl(Color.m6705copywmQWz5c$default(colorM6701boximpl3.getValue(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null)) : null;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                userInteractionEventDescriptorWithCardContext = Loggings.withCardContext((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getHubCardContext());
                if (state.getLeftContractViewState().getShowGradientBackground()) {
                    eventLogger = current;
                    f = 0.0f;
                } else {
                    eventLogger = current;
                    f = 1.0f;
                }
                color = colorM6701boximpl2;
                color2 = colorM6701boximpl4;
                eventLogger2 = eventLogger;
                snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f, AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(state.getRightContractViewState().getShowGradientBackground() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                Modifier modifierClip = Clip.clip(SizeKt.fillMaxWidth$default(SizeKt.m5158heightInVpY3zN4$default(modifier3, LiveEventCardHeight, 0.0f, 2, null), 0.0f, 1, null), LiveEventCardShape);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), null, 2, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 != companion.getEmpty()) {
                    snapshotFloatState2 = snapshotFloatState22;
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveEventCardKt.LiveEventCard$lambda$6$lambda$5(snapshotFloatState2, (LayoutCoordinates) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    snapshotFloatState2 = snapshotFloatState22;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM4872backgroundbw27NRU$default, (Function1) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(color) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(color2) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveEventCardKt.LiveEventCard$lambda$10$lambda$9(color, color2, snapshotState4AnimateFloatAsState, snapshotState4AnimateFloatAsState2, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(DrawModifierKt.drawBehind(modifierOnGloballyPositioned, (Function1) objRememberedValue3), userInteractionEventDescriptorWithCardContext, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorWithCardContext) | composerStartRestartGroup.changedInstance(eventLogger2) | composerStartRestartGroup.changedInstance(hubNavigationCallbacks);
                Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue12 == companion.getEmpty()) {
                    hubNavigationCallbacks2 = hubNavigationCallbacks;
                    modifier4 = modifier3;
                    SnapshotFloatState2 snapshotFloatState23 = snapshotFloatState2;
                    i4 = 2;
                    f2 = 0.0f;
                    r12 = 0;
                    liveEventCardKt$LiveEventCard$3$1 = new LiveEventCardKt$LiveEventCard$3$1(state, userInteractionEventDescriptorWithCardContext, eventLogger2, hubNavigationCallbacks2, snapshotFloatState23);
                    composerStartRestartGroup.updateRememberedValue(liveEventCardKt$LiveEventCard$3$1);
                } else {
                    hubNavigationCallbacks2 = hubNavigationCallbacks;
                    modifier4 = modifier3;
                    liveEventCardKt$LiveEventCard$3$1 = objRememberedValue12;
                    i4 = 2;
                    f2 = 0.0f;
                    r12 = 0;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierAutoLogEvents$default, unit, (PointerInputEventHandler) liveEventCardKt$LiveEventCard$3$1);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r12);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), f2, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1003410150);
                composerStartRestartGroup.startReplaceGroup(212064437);
                composerStartRestartGroup.endReplaceGroup();
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Measurer2(density);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                measurer2 = (Measurer2) objRememberedValue4;
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new ConstraintLayoutScope();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue5;
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, i4, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                snapshotState = (SnapshotState) objRememberedValue6;
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue7;
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                snapshotState2 = (SnapshotState) objRememberedValue8;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(measurer2);
                i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                zChanged2 = zChangedInstance3 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new MeasurePolicy() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                            return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                        }

                        @Override // androidx.compose.p011ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            snapshotState2.getValue();
                            long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                            snapshotState.getValue();
                            int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                            int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    measurer22.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                    snapshotState3 = snapshotState;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue9;
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new Function0<Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState3.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl2.setKnownDirty(true);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                final Function0 function0 = (Function0) objRememberedValue10;
                zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue11, 1, null);
                final HubNavigationCallbacks hubNavigationCallbacks3 = hubNavigationCallbacks2;
                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:107:0x0692  */
                    /* JADX WARN: Removed duplicated region for block: B:110:0x06ab  */
                    /* JADX WARN: Removed duplicated region for block: B:111:0x06b4  */
                    /* JADX WARN: Removed duplicated region for block: B:116:0x07d1  */
                    /* JADX WARN: Removed duplicated region for block: B:119:0x07f2  */
                    /* JADX WARN: Removed duplicated region for block: B:124:0x0861  */
                    /* JADX WARN: Removed duplicated region for block: B:129:0x08ab  */
                    /* JADX WARN: Removed duplicated region for block: B:132:0x08c8  */
                    /* JADX WARN: Removed duplicated region for block: B:137:0x0937  */
                    /* JADX WARN: Removed duplicated region for block: B:140:0x0957  */
                    /* JADX WARN: Removed duplicated region for block: B:141:0x095d  */
                    /* JADX WARN: Removed duplicated region for block: B:144:0x097c  */
                    /* JADX WARN: Removed duplicated region for block: B:147:0x099d  */
                    /* JADX WARN: Removed duplicated region for block: B:150:0x09a9  */
                    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x01cd  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0229  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0235  */
                    /* JADX WARN: Removed duplicated region for block: B:33:0x0239  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x0266  */
                    /* JADX WARN: Removed duplicated region for block: B:41:0x02cc  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x02db  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x03b3  */
                    /* JADX WARN: Removed duplicated region for block: B:55:0x0423  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x043e  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x0440  */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x0472  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x04c3  */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x04fa  */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x0523  */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x0573  */
                    /* JADX WARN: Removed duplicated region for block: B:85:0x05bd  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x05c9  */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x05cd  */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x05fa  */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x0623  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer2, int i8) {
                        long j;
                        Object objRememberedValue13;
                        Composer.Companion companion3;
                        boolean zChanged3;
                        Object objRememberedValue14;
                        int currentCompositeKeyHash2;
                        Composer composerM6388constructorimpl2;
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
                        String secondaryText;
                        ConstraintLayoutScope constraintLayoutScope2;
                        C16542xa684c109 c16542xa684c109;
                        Modifier.Companion companion4;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                        BentoTheme bentoTheme2;
                        int i9;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                        Composer composer3;
                        Modifier.Companion companion5;
                        BentoTheme bentoTheme3;
                        int i10;
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                        boolean zChanged4;
                        Object objRememberedValue15;
                        Composer composer4;
                        boolean zChanged5;
                        Object objRememberedValue16;
                        String metadata;
                        boolean zChanged6;
                        Object objRememberedValue17;
                        boolean zChanged7;
                        Object objRememberedValue18;
                        int currentCompositeKeyHash3;
                        Composer composerM6388constructorimpl3;
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
                        Modifier.Companion companion6;
                        String secondaryText2;
                        ConstraintLayoutScope constraintLayoutScope3;
                        Modifier.Companion companion7;
                        BentoTheme bentoTheme4;
                        int i11;
                        boolean zChanged8;
                        Object objRememberedValue19;
                        boolean zChangedInstance4;
                        Object objRememberedValue20;
                        boolean zChanged9;
                        Object objRememberedValue21;
                        boolean zChangedInstance5;
                        Object objRememberedValue22;
                        Object objRememberedValue23;
                        int i12;
                        Color colorM6701boximpl5;
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState2.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope;
                        composer2.startReplaceGroup(1316323609);
                        BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                        int i13 = BentoTheme.$stable;
                        float fM21593getSmallD9Ej5fM = bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM();
                        float fM21590getDefaultD9Ej5fM = bentoTheme5.getSpacing(composer2, i13).m21590getDefaultD9Ej5fM();
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component10 = constrainedLayoutReferencesCreateRefs.component10();
                        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, 0.0f, 2, null);
                        long jM21425getFg0d7_KjU = bentoTheme5.getColors(composer2, i13).m21425getFg0d7_KjU();
                        Modifier.Companion companion8 = Modifier.INSTANCE;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged10 = composer2.changed(constraintLayoutBaseScope4Component9);
                        Object objRememberedValue24 = composer2.rememberedValue();
                        if (!zChanged10) {
                            j = jM21425getFg0d7_KjU;
                            if (objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                            }
                            composer2.endReplaceGroup();
                            LiveStatusIcon5.m14380LiveStatusIconPZHvWI(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component10, (Function1) objRememberedValue24), 0.0f, j, null, composer2, 0, 10);
                            String text = StringUtil2.getText(liveEventCardViewState.getPrimaryText(), composer2, StringResource.$stable);
                            TextStyle textS = bentoTheme5.getTypography(composer2, i13).getTextS();
                            long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(bentoTheme5.getColors(composer2, i13).m21425getFg0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue13 = composer2.rememberedValue();
                            companion3 = Composer.INSTANCE;
                            if (objRememberedValue13 == companion3.getEmpty()) {
                                objRememberedValue13 = LiveEventCardKt$LiveEventCard$4$1$2$1.INSTANCE;
                                composer2.updateRememberedValue(objRememberedValue13);
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(text, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue13), bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM6705copywmQWz5c$default), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8184);
                            composer2.startReplaceGroup(-1633490746);
                            zChanged3 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                            objRememberedValue14 = composer2.rememberedValue();
                            if (!zChanged3 || objRememberedValue14 == companion3.getEmpty()) {
                                objRememberedValue14 = new LiveEventCardKt$LiveEventCard$4$1$3$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                                composer2.updateRememberedValue(objRememberedValue14);
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue14), 0.0f, bentoTheme5.getSpacing(composer2, i13).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            Alignment.Companion companion9 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion9.getCenterVertically();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer2, 54);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion10.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.useNode();
                            } else {
                                composer2.createNode(constructor2);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion10.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion10.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion10.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion10.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            SeedIcon.SeedIcon(liveEventCardViewState.getLeftContractViewState().getImageUrl(), liveEventCardViewState.getLeftContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion8, 0.0f, 0.0f, bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, composer2, 0, 8);
                            secondaryText = liveEventCardViewState.getLeftContractViewState().getSecondaryText();
                            composer2.startReplaceGroup(486332623);
                            if (secondaryText != null) {
                                constraintLayoutScope2 = constraintLayoutScope4;
                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component1;
                                bentoTheme2 = bentoTheme5;
                                i9 = i13;
                                c16542xa684c109 = this;
                                companion4 = companion8;
                                composer3 = composer2;
                            } else {
                                constraintLayoutScope2 = constraintLayoutScope4;
                                c16542xa684c109 = this;
                                companion4 = companion8;
                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                bentoTheme2 = bentoTheme5;
                                i9 = i13;
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component1;
                                composer3 = composer2;
                                BentoText2.m20747BentoText38GnDrw(secondaryText, PaddingKt.m5146paddingqDBjuR0$default(companion8, 0.0f, 0.0f, bentoTheme5.getSpacing(composer2, i13).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme5.getColors(composer2, i13).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme5.getTypography(composer2, i13).getTextS(), composer3, 0, 0, 8184);
                            }
                            composer3.endReplaceGroup();
                            String primaryText = liveEventCardViewState.getLeftContractViewState().getPrimaryText();
                            BentoTheme bentoTheme6 = bentoTheme2;
                            int i14 = i9;
                            TextStyle textM = bentoTheme6.getTypography(composer3, i14).getTextM();
                            FontWeight.Companion companion11 = FontWeight.INSTANCE;
                            Modifier.Companion companion12 = companion4;
                            int i15 = i9;
                            BentoText2.m20747BentoText38GnDrw(primaryText, PaddingKt.m5146paddingqDBjuR0$default(row6.weight(companion12, 1.0f, false), 0.0f, 0.0f, bentoTheme6.getSpacing(composer3, i14).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, companion11.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8172);
                            composer3.startReplaceGroup(486355476);
                            if (liveEventCardViewState.getLeftContractViewState().isActive()) {
                                companion5 = companion12;
                                bentoTheme3 = bentoTheme6;
                                i10 = i15;
                            } else {
                                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                                DayNightColor contractColor3 = liveEventCardViewState.getLeftContractViewState().getContractColor();
                                composer3.startReplaceGroup(486363900);
                                if (contractColor3 == null) {
                                    colorM6701boximpl5 = null;
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                    colorM6701boximpl5 = Color.m6701boximpl(contractColor3.getColor(composer3, 0));
                                }
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(486362592);
                                bentoTheme3 = bentoTheme6;
                                i10 = i15;
                                long jM21426getFg20d7_KjU = colorM6701boximpl5 == null ? bentoTheme3.getColors(composer3, i10).m21426getFg20d7_KjU() : colorM6701boximpl5.getValue();
                                composer3.endReplaceGroup();
                                companion5 = companion12;
                                BentoIcon2.m20644BentoIconFU0evQE(size12, StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer3, i12), jM21426getFg20d7_KjU, PaddingKt.m5146paddingqDBjuR0$default(companion12, 0.0f, 0.0f, bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer3, BentoIcon4.Size12.$stable, 48);
                            }
                            composer3.endReplaceGroup();
                            composer3.endNode();
                            String metadata2 = liveEventCardViewState.getLeftContractViewState().getMetadata();
                            String str = metadata2 != null ? "-" : metadata2;
                            TickerTextState.Style style = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
                            long jM21425getFg0d7_KjU2 = bentoTheme3.getColors(composer3, i10).m21425getFg0d7_KjU();
                            composer3.startReplaceGroup(-1746271574);
                            constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
                            zChanged4 = composer3.changed(constraintLayoutBaseScope43) | composer3.changed(constraintLayoutBaseScope4Component5) | composer3.changed(fM21593getSmallD9Ej5fM);
                            objRememberedValue15 = composer3.rememberedValue();
                            if (!zChanged4 || objRememberedValue15 == companion3.getEmpty()) {
                                objRememberedValue15 = new LiveEventCardKt$LiveEventCard$4$1$5$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                                composer3.updateRememberedValue(objRememberedValue15);
                            }
                            composer3.endReplaceGroup();
                            ConstraintLayoutScope constraintLayoutScope5 = constraintLayoutScope2;
                            composer4 = composer3;
                            WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion5, constraintLayoutBaseScope4, (Function1) objRememberedValue15), 0.0f, bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), str, jM21425getFg0d7_KjU2, style, composer4, 3072);
                            composer4.startReplaceGroup(5004770);
                            zChanged5 = composer4.changed(constraintLayoutBaseScope43);
                            objRememberedValue16 = composer4.rememberedValue();
                            if (!zChanged5 || objRememberedValue16 == companion3.getEmpty()) {
                                objRememberedValue16 = new LiveEventCardKt$LiveEventCard$4$1$6$1(constraintLayoutBaseScope43);
                                composer4.updateRememberedValue(objRememberedValue16);
                            }
                            composer4.endReplaceGroup();
                            ScoreDivider.ScoreDivider(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion5, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue16), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer4, 0, 0);
                            metadata = liveEventCardViewState.getRightContractViewState().getMetadata();
                            if (metadata == null) {
                                metadata = "-";
                            }
                            long jM21425getFg0d7_KjU3 = bentoTheme3.getColors(composer4, i10).m21425getFg0d7_KjU();
                            composer4.startReplaceGroup(-1746271574);
                            zChanged6 = composer4.changed(constraintLayoutBaseScope43) | composer4.changed(constraintLayoutBaseScope4Component5) | composer4.changed(fM21593getSmallD9Ej5fM);
                            objRememberedValue17 = composer4.rememberedValue();
                            if (!zChanged6 || objRememberedValue17 == companion3.getEmpty()) {
                                objRememberedValue17 = new LiveEventCardKt$LiveEventCard$4$1$7$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                                composer4.updateRememberedValue(objRememberedValue17);
                            }
                            composer4.endReplaceGroup();
                            WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion5, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue17), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), metadata, jM21425getFg0d7_KjU3, style, composer4, 3072);
                            composer4.startReplaceGroup(-1633490746);
                            zChanged7 = composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(constraintLayoutBaseScope43);
                            objRememberedValue18 = composer4.rememberedValue();
                            if (!zChanged7 || objRememberedValue18 == companion3.getEmpty()) {
                                objRememberedValue18 = new LiveEventCardKt$LiveEventCard$4$1$8$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope43);
                                composer4.updateRememberedValue(objRememberedValue18);
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope5.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getEnd(), companion9.getCenterVertically(), composer4, 54);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default2);
                            Function0<ComposeUiNode> constructor3 = companion10.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.useNode();
                            } else {
                                composer4.createNode(constructor3);
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion10.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion10.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion10.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion10.getSetModifier());
                            composer4.startReplaceGroup(-1009832703);
                            if (liveEventCardViewState.getRightContractViewState().isActive()) {
                                companion6 = companion5;
                            } else {
                                BentoIcon4.Size12 size122 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                                DayNightColor contractColor4 = liveEventCardViewState.getRightContractViewState().getContractColor();
                                composer4.startReplaceGroup(-1009824219);
                                Color colorM6701boximpl6 = contractColor4 == null ? null : Color.m6701boximpl(contractColor4.getColor(composer4, 0));
                                composer4.endReplaceGroup();
                                composer4.startReplaceGroup(-1009825558);
                                long jM21426getFg20d7_KjU2 = colorM6701boximpl6 == null ? bentoTheme3.getColors(composer4, i10).m21426getFg20d7_KjU() : colorM6701boximpl6.getValue();
                                composer4.endReplaceGroup();
                                companion6 = companion5;
                                BentoIcon2.m20644BentoIconFU0evQE(size122, StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer4, 0), jM21426getFg20d7_KjU2, PaddingKt.m5146paddingqDBjuR0$default(companion6, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer4, BentoIcon4.Size12.$stable, 48);
                            }
                            composer4.endReplaceGroup();
                            secondaryText2 = liveEventCardViewState.getRightContractViewState().getSecondaryText();
                            composer4.startReplaceGroup(-1009813509);
                            if (secondaryText2 != null) {
                                constraintLayoutScope3 = constraintLayoutScope5;
                                bentoTheme4 = bentoTheme3;
                                i11 = i10;
                                companion7 = companion6;
                            } else {
                                constraintLayoutScope3 = constraintLayoutScope5;
                                companion7 = companion6;
                                bentoTheme4 = bentoTheme3;
                                i11 = i10;
                                BentoText2.m20747BentoText38GnDrw(secondaryText2, PaddingKt.m5146paddingqDBjuR0$default(companion6, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme3.getColors(composer4, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer4, i10).getTextS(), composer4, 0, 0, 8184);
                            }
                            composer4.endReplaceGroup();
                            BentoTheme bentoTheme7 = bentoTheme4;
                            int i16 = i11;
                            Modifier.Companion companion13 = companion7;
                            BentoText2.m20747BentoText38GnDrw(liveEventCardViewState.getRightContractViewState().getPrimaryText(), PaddingKt.m5146paddingqDBjuR0$default(row6.weight(companion13, 1.0f, false), bentoTheme7.getSpacing(composer4, i16).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion11.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme7.getTypography(composer4, i16).getTextM(), composer4, 24576, 0, 8172);
                            SeedIcon.SeedIcon(liveEventCardViewState.getRightContractViewState().getImageUrl(), liveEventCardViewState.getRightContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion13, bentoTheme7.getSpacing(composer4, i16).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), true, composer4, 3072, 0);
                            composer4.endNode();
                            CardPills7 pillState = liveEventCardViewState.getLeftContractViewState().getPillState();
                            composer4.startReplaceGroup(-1224400529);
                            zChanged8 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                            objRememberedValue19 = composer4.rememberedValue();
                            if (!zChanged8 || objRememberedValue19 == companion3.getEmpty()) {
                                objRememberedValue19 = new LiveEventCardKt$LiveEventCard$4$1$10$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                                composer4.updateRememberedValue(objRememberedValue19);
                            }
                            composer4.endReplaceGroup();
                            ConstraintLayoutScope constraintLayoutScope6 = constraintLayoutScope3;
                            Modifier modifierConstrainAs = constraintLayoutScope6.constrainAs(companion13, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue19);
                            if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                                modifierConstrainAs = ModifiersKt.autoLogEvents$default(modifierConstrainAs, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-card-pill-" + liveEventCardViewState.getLeftContractViewState().getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                            }
                            Modifier modifier5 = modifierConstrainAs;
                            boolean zIsInAcqStreamlinedTradeFlowExperiment = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                            composer4.startReplaceGroup(-1633490746);
                            zChangedInstance4 = composer4.changedInstance(hubNavigationCallbacks3) | composer4.changed(liveEventCardViewState);
                            objRememberedValue20 = composer4.rememberedValue();
                            if (!zChangedInstance4 || objRememberedValue20 == companion3.getEmpty()) {
                                objRememberedValue20 = new LiveEventCardKt$LiveEventCard$4$1$12$1(hubNavigationCallbacks3, liveEventCardViewState);
                                composer4.updateRememberedValue(objRememberedValue20);
                            }
                            composer4.endReplaceGroup();
                            CardPills.ContractPill(pillState, modifier5, zIsInAcqStreamlinedTradeFlowExperiment, (Function0) objRememberedValue20, composer4, 0, 0);
                            CardPills7 pillState2 = liveEventCardViewState.getRightContractViewState().getPillState();
                            composer4.startReplaceGroup(-1224400529);
                            zChanged9 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                            objRememberedValue21 = composer4.rememberedValue();
                            if (!zChanged9 || objRememberedValue21 == companion3.getEmpty()) {
                                objRememberedValue21 = new LiveEventCardKt$LiveEventCard$4$1$13$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                                composer4.updateRememberedValue(objRememberedValue21);
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierConstrainAs2 = constraintLayoutScope6.constrainAs(companion13, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue21);
                            if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                                modifierConstrainAs2 = ModifiersKt.autoLogEvents$default(modifierConstrainAs2, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-card-pill-" + liveEventCardViewState.getRightContractViewState().getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                            }
                            Modifier modifier6 = modifierConstrainAs2;
                            boolean zIsInAcqStreamlinedTradeFlowExperiment2 = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                            composer4.startReplaceGroup(-1633490746);
                            zChangedInstance5 = composer4.changedInstance(hubNavigationCallbacks3) | composer4.changed(liveEventCardViewState);
                            objRememberedValue22 = composer4.rememberedValue();
                            if (!zChangedInstance5 || objRememberedValue22 == companion3.getEmpty()) {
                                objRememberedValue22 = new LiveEventCardKt$LiveEventCard$4$1$15$1(hubNavigationCallbacks3, liveEventCardViewState);
                                composer4.updateRememberedValue(objRememberedValue22);
                            }
                            composer4.endReplaceGroup();
                            CardPills.ContractPill(pillState2, modifier6, zIsInAcqStreamlinedTradeFlowExperiment2, (Function0) objRememberedValue22, composer4, 0, 0);
                            Float progress = liveEventCardViewState.getProgress();
                            float fFloatValue = progress == null ? progress.floatValue() : 1.0f;
                            long progressBarActiveColor = liveEventCardViewState.getProgressBarActiveColor(composer4, 0);
                            long progressBarBackgroundColor = liveEventCardViewState.getProgressBarBackgroundColor(composer4, 0);
                            composer4.startReplaceGroup(1849434622);
                            objRememberedValue23 = composer4.rememberedValue();
                            if (objRememberedValue23 == companion3.getEmpty()) {
                                objRememberedValue23 = LiveEventCardKt$LiveEventCard$4$1$16$1.INSTANCE;
                                composer4.updateRememberedValue(objRememberedValue23);
                            }
                            composer4.endReplaceGroup();
                            LastTradePriceBar5.m14375LastTradePriceBareopBjH0(fFloatValue, progressBarActiveColor, progressBarBackgroundColor, constraintLayoutScope6.constrainAs(companion13, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue23), composer4, 0, 0);
                            composer4.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                                EffectsKt.SideEffect(function0, composer4, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        j = jM21425getFg0d7_KjU;
                        objRememberedValue24 = new LiveEventCardKt$LiveEventCard$4$1$1$1(constraintLayoutBaseScope4Component9);
                        composer2.updateRememberedValue(objRememberedValue24);
                        composer2.endReplaceGroup();
                        LiveStatusIcon5.m14380LiveStatusIconPZHvWI(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component10, (Function1) objRememberedValue24), 0.0f, j, null, composer2, 0, 10);
                        String text2 = StringUtil2.getText(liveEventCardViewState.getPrimaryText(), composer2, StringResource.$stable);
                        TextStyle textS2 = bentoTheme5.getTypography(composer2, i13).getTextS();
                        long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(bentoTheme5.getColors(composer2, i13).m21425getFg0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue13 = composer2.rememberedValue();
                        companion3 = Composer.INSTANCE;
                        if (objRememberedValue13 == companion3.getEmpty()) {
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(text2, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue13), bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM6705copywmQWz5c$default2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer2, 0, 0, 8184);
                        composer2.startReplaceGroup(-1633490746);
                        zChanged3 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                        objRememberedValue14 = composer2.rememberedValue();
                        if (!zChanged3) {
                            objRememberedValue14 = new LiveEventCardKt$LiveEventCard$4$1$3$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                            composer2.updateRememberedValue(objRememberedValue14);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue14), 0.0f, bentoTheme5.getSpacing(composer2, i13).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        Alignment.Companion companion92 = Alignment.INSTANCE;
                        Alignment.Vertical centerVertically2 = companion92.getCenterVertically();
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composer2, 54);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default3);
                        ComposeUiNode.Companion companion102 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor22 = companion102.getConstructor();
                        if (composer2.getApplier() == null) {
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion102.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion102.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion102.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion102.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        SeedIcon.SeedIcon(liveEventCardViewState.getLeftContractViewState().getImageUrl(), liveEventCardViewState.getLeftContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion8, 0.0f, 0.0f, bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, composer2, 0, 8);
                        secondaryText = liveEventCardViewState.getLeftContractViewState().getSecondaryText();
                        composer2.startReplaceGroup(486332623);
                        if (secondaryText != null) {
                        }
                        composer3.endReplaceGroup();
                        String primaryText2 = liveEventCardViewState.getLeftContractViewState().getPrimaryText();
                        BentoTheme bentoTheme62 = bentoTheme2;
                        int i142 = i9;
                        TextStyle textM2 = bentoTheme62.getTypography(composer3, i142).getTextM();
                        FontWeight.Companion companion112 = FontWeight.INSTANCE;
                        Modifier.Companion companion122 = companion4;
                        int i152 = i9;
                        BentoText2.m20747BentoText38GnDrw(primaryText2, PaddingKt.m5146paddingqDBjuR0$default(row62.weight(companion122, 1.0f, false), 0.0f, 0.0f, bentoTheme62.getSpacing(composer3, i142).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, companion112.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer3, 24576, 0, 8172);
                        composer3.startReplaceGroup(486355476);
                        if (liveEventCardViewState.getLeftContractViewState().isActive()) {
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        String metadata22 = liveEventCardViewState.getLeftContractViewState().getMetadata();
                        if (metadata22 != null) {
                        }
                        TickerTextState.Style style2 = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
                        long jM21425getFg0d7_KjU22 = bentoTheme3.getColors(composer3, i10).m21425getFg0d7_KjU();
                        composer3.startReplaceGroup(-1746271574);
                        constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
                        zChanged4 = composer3.changed(constraintLayoutBaseScope43) | composer3.changed(constraintLayoutBaseScope4Component5) | composer3.changed(fM21593getSmallD9Ej5fM);
                        objRememberedValue15 = composer3.rememberedValue();
                        if (!zChanged4) {
                            objRememberedValue15 = new LiveEventCardKt$LiveEventCard$4$1$5$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                            composer3.updateRememberedValue(objRememberedValue15);
                        }
                        composer3.endReplaceGroup();
                        ConstraintLayoutScope constraintLayoutScope52 = constraintLayoutScope2;
                        composer4 = composer3;
                        WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4, (Function1) objRememberedValue15), 0.0f, bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), str, jM21425getFg0d7_KjU22, style2, composer4, 3072);
                        composer4.startReplaceGroup(5004770);
                        zChanged5 = composer4.changed(constraintLayoutBaseScope43);
                        objRememberedValue16 = composer4.rememberedValue();
                        if (!zChanged5) {
                            objRememberedValue16 = new LiveEventCardKt$LiveEventCard$4$1$6$1(constraintLayoutBaseScope43);
                            composer4.updateRememberedValue(objRememberedValue16);
                        }
                        composer4.endReplaceGroup();
                        ScoreDivider.ScoreDivider(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue16), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer4, 0, 0);
                        metadata = liveEventCardViewState.getRightContractViewState().getMetadata();
                        if (metadata == null) {
                        }
                        long jM21425getFg0d7_KjU32 = bentoTheme3.getColors(composer4, i10).m21425getFg0d7_KjU();
                        composer4.startReplaceGroup(-1746271574);
                        zChanged6 = composer4.changed(constraintLayoutBaseScope43) | composer4.changed(constraintLayoutBaseScope4Component5) | composer4.changed(fM21593getSmallD9Ej5fM);
                        objRememberedValue17 = composer4.rememberedValue();
                        if (!zChanged6) {
                            objRememberedValue17 = new LiveEventCardKt$LiveEventCard$4$1$7$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                            composer4.updateRememberedValue(objRememberedValue17);
                        }
                        composer4.endReplaceGroup();
                        WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue17), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), metadata, jM21425getFg0d7_KjU32, style2, composer4, 3072);
                        composer4.startReplaceGroup(-1633490746);
                        zChanged7 = composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(constraintLayoutBaseScope43);
                        objRememberedValue18 = composer4.rememberedValue();
                        if (!zChanged7) {
                            objRememberedValue18 = new LiveEventCardKt$LiveEventCard$4$1$8$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope43);
                            composer4.updateRememberedValue(objRememberedValue18);
                        }
                        composer4.endReplaceGroup();
                        Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getEnd(), companion92.getCenterVertically(), composer4, 54);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default22);
                        Function0<ComposeUiNode> constructor32 = companion102.getConstructor();
                        if (composer4.getApplier() == null) {
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion102.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion102.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion102.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion102.getSetModifier());
                        composer4.startReplaceGroup(-1009832703);
                        if (liveEventCardViewState.getRightContractViewState().isActive()) {
                        }
                        composer4.endReplaceGroup();
                        secondaryText2 = liveEventCardViewState.getRightContractViewState().getSecondaryText();
                        composer4.startReplaceGroup(-1009813509);
                        if (secondaryText2 != null) {
                        }
                        composer4.endReplaceGroup();
                        BentoTheme bentoTheme72 = bentoTheme4;
                        int i162 = i11;
                        Modifier.Companion companion132 = companion7;
                        BentoText2.m20747BentoText38GnDrw(liveEventCardViewState.getRightContractViewState().getPrimaryText(), PaddingKt.m5146paddingqDBjuR0$default(row62.weight(companion132, 1.0f, false), bentoTheme72.getSpacing(composer4, i162).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion112.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme72.getTypography(composer4, i162).getTextM(), composer4, 24576, 0, 8172);
                        SeedIcon.SeedIcon(liveEventCardViewState.getRightContractViewState().getImageUrl(), liveEventCardViewState.getRightContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion132, bentoTheme72.getSpacing(composer4, i162).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), true, composer4, 3072, 0);
                        composer4.endNode();
                        CardPills7 pillState3 = liveEventCardViewState.getLeftContractViewState().getPillState();
                        composer4.startReplaceGroup(-1224400529);
                        zChanged8 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                        objRememberedValue19 = composer4.rememberedValue();
                        if (!zChanged8) {
                            objRememberedValue19 = new LiveEventCardKt$LiveEventCard$4$1$10$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                            composer4.updateRememberedValue(objRememberedValue19);
                        }
                        composer4.endReplaceGroup();
                        ConstraintLayoutScope constraintLayoutScope62 = constraintLayoutScope3;
                        Modifier modifierConstrainAs3 = constraintLayoutScope62.constrainAs(companion132, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue19);
                        if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                        }
                        Modifier modifier52 = modifierConstrainAs3;
                        boolean zIsInAcqStreamlinedTradeFlowExperiment3 = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                        composer4.startReplaceGroup(-1633490746);
                        zChangedInstance4 = composer4.changedInstance(hubNavigationCallbacks3) | composer4.changed(liveEventCardViewState);
                        objRememberedValue20 = composer4.rememberedValue();
                        if (!zChangedInstance4) {
                            objRememberedValue20 = new LiveEventCardKt$LiveEventCard$4$1$12$1(hubNavigationCallbacks3, liveEventCardViewState);
                            composer4.updateRememberedValue(objRememberedValue20);
                        }
                        composer4.endReplaceGroup();
                        CardPills.ContractPill(pillState3, modifier52, zIsInAcqStreamlinedTradeFlowExperiment3, (Function0) objRememberedValue20, composer4, 0, 0);
                        CardPills7 pillState22 = liveEventCardViewState.getRightContractViewState().getPillState();
                        composer4.startReplaceGroup(-1224400529);
                        zChanged9 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                        objRememberedValue21 = composer4.rememberedValue();
                        if (!zChanged9) {
                            objRememberedValue21 = new LiveEventCardKt$LiveEventCard$4$1$13$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                            composer4.updateRememberedValue(objRememberedValue21);
                        }
                        composer4.endReplaceGroup();
                        Modifier modifierConstrainAs22 = constraintLayoutScope62.constrainAs(companion132, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue21);
                        if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                        }
                        Modifier modifier62 = modifierConstrainAs22;
                        boolean zIsInAcqStreamlinedTradeFlowExperiment22 = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                        composer4.startReplaceGroup(-1633490746);
                        zChangedInstance5 = composer4.changedInstance(hubNavigationCallbacks3) | composer4.changed(liveEventCardViewState);
                        objRememberedValue22 = composer4.rememberedValue();
                        if (!zChangedInstance5) {
                            objRememberedValue22 = new LiveEventCardKt$LiveEventCard$4$1$15$1(hubNavigationCallbacks3, liveEventCardViewState);
                            composer4.updateRememberedValue(objRememberedValue22);
                        }
                        composer4.endReplaceGroup();
                        CardPills.ContractPill(pillState22, modifier62, zIsInAcqStreamlinedTradeFlowExperiment22, (Function0) objRememberedValue22, composer4, 0, 0);
                        Float progress2 = liveEventCardViewState.getProgress();
                        if (progress2 == null) {
                        }
                        long progressBarActiveColor2 = liveEventCardViewState.getProgressBarActiveColor(composer4, 0);
                        long progressBarBackgroundColor2 = liveEventCardViewState.getProgressBarBackgroundColor(composer4, 0);
                        composer4.startReplaceGroup(1849434622);
                        objRememberedValue23 = composer4.rememberedValue();
                        if (objRememberedValue23 == companion3.getEmpty()) {
                        }
                        composer4.endReplaceGroup();
                        LastTradePriceBar5.m14375LastTradePriceBareopBjH0(fFloatValue, progressBarActiveColor2, progressBarBackgroundColor2, constraintLayoutScope62.constrainAs(companion132, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue23), composer4, 0, 0);
                        composer4.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                };
                state = liveEventCardViewState;
                LayoutKt.MultiMeasureLayout(modifierSemantics$default, ComposableLambda3.rememberComposableLambda(1200550679, true, function2, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiveEventCardKt.LiveEventCard$lambda$32(state, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            hubNavigationCallbacks = (HubNavigationCallbacks) composerStartRestartGroup.consume(HubNavigationCallbacks2.getLocalHubNavigationCallbacks());
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            DayNightColor contractColor3 = state.getLeftContractViewState().getContractColor();
            composerStartRestartGroup.startReplaceGroup(1195776093);
            if (contractColor3 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (colorM6701boximpl == null) {
            }
            DayNightColor contractColor22 = state.getRightContractViewState().getContractColor();
            composerStartRestartGroup.startReplaceGroup(1195779453);
            if (contractColor22 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            if (colorM6701boximpl3 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotFloatState2 snapshotFloatState222 = (SnapshotFloatState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            userInteractionEventDescriptorWithCardContext = Loggings.withCardContext((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), state.getHubCardContext());
            if (state.getLeftContractViewState().getShowGradientBackground()) {
            }
            color = colorM6701boximpl2;
            color2 = colorM6701boximpl4;
            eventLogger2 = eventLogger;
            snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f, AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(state.getRightContractViewState().getShowGradientBackground() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier modifierClip2 = Clip.clip(SizeKt.fillMaxWidth$default(SizeKt.m5158heightInVpY3zN4$default(modifier3, LiveEventCardHeight, 0.0f, 2, null), 0.0f, 1, null), LiveEventCardShape);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierClip2, bentoTheme2.getColors(composerStartRestartGroup, i72).m21372getBg20d7_KjU(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 != companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierM4872backgroundbw27NRU$default2, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChanged = composerStartRestartGroup.changed(color) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState) | composerStartRestartGroup.changed(color2) | composerStartRestartGroup.changed(snapshotState4AnimateFloatAsState2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LiveEventCardKt.LiveEventCard$lambda$10$lambda$9(color, color2, snapshotState4AnimateFloatAsState, snapshotState4AnimateFloatAsState2, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(DrawModifierKt.drawBehind(modifierOnGloballyPositioned2, (Function1) objRememberedValue3), userInteractionEventDescriptorWithCardContext, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptorWithCardContext) | composerStartRestartGroup.changedInstance(eventLogger2) | composerStartRestartGroup.changedInstance(hubNavigationCallbacks);
                Object objRememberedValue122 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    hubNavigationCallbacks2 = hubNavigationCallbacks;
                    modifier4 = modifier3;
                    SnapshotFloatState2 snapshotFloatState232 = snapshotFloatState2;
                    i4 = 2;
                    f2 = 0.0f;
                    r12 = 0;
                    liveEventCardKt$LiveEventCard$3$1 = new LiveEventCardKt$LiveEventCard$3$1(state, userInteractionEventDescriptorWithCardContext, eventLogger2, hubNavigationCallbacks2, snapshotFloatState232);
                    composerStartRestartGroup.updateRememberedValue(liveEventCardKt$LiveEventCard$3$1);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierAutoLogEvents$default2, unit2, (PointerInputEventHandler) liveEventCardKt$LiveEventCard$3$1);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r12);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, r12);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM()), f2, 1, null);
                        composerStartRestartGroup.startReplaceGroup(-1003410150);
                        composerStartRestartGroup.startReplaceGroup(212064437);
                        composerStartRestartGroup.endReplaceGroup();
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                        }
                        measurer2 = (Measurer2) objRememberedValue4;
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        final ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) objRememberedValue5;
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue6;
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                        }
                        constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue7;
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue8;
                        boolean zChangedInstance32 = composerStartRestartGroup.changedInstance(measurer2);
                        i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                        zChanged2 = zChangedInstance32 | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2) {
                            objRememberedValue9 = new MeasurePolicy() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$2
                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicHeight(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                                    return super.minIntrinsicWidth(intrinsicMeasureScope, list, i8);
                                }

                                @Override // androidx.compose.p011ui.layout.MeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List list, long j) {
                                    final Map linkedHashMap = new LinkedHashMap();
                                    snapshotState2.getValue();
                                    long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                                    snapshotState.getValue();
                                    int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                    int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                    final Measurer2 measurer22 = measurer2;
                                    return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            measurer22.performLayout(placementScope, list, linkedHashMap);
                                        }
                                    }, 4, null);
                                }
                            };
                            constraintSetForInlineDsl2 = constraintSetForInlineDsl;
                            snapshotState3 = snapshotState;
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            MeasurePolicy measurePolicy2 = (MeasurePolicy) objRememberedValue9;
                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue10 == companion.getEmpty()) {
                            }
                            final Function0 function02 = (Function0) objRememberedValue10;
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue11 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$4
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierFillMaxWidth$default2, false, (Function1) objRememberedValue11, 1, null);
                                final HubNavigationCallbacks hubNavigationCallbacks32 = hubNavigationCallbacks2;
                                Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$LiveEventCard$lambda$31$$inlined$ConstraintLayout$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:107:0x0692  */
                                    /* JADX WARN: Removed duplicated region for block: B:110:0x06ab  */
                                    /* JADX WARN: Removed duplicated region for block: B:111:0x06b4  */
                                    /* JADX WARN: Removed duplicated region for block: B:116:0x07d1  */
                                    /* JADX WARN: Removed duplicated region for block: B:119:0x07f2  */
                                    /* JADX WARN: Removed duplicated region for block: B:124:0x0861  */
                                    /* JADX WARN: Removed duplicated region for block: B:129:0x08ab  */
                                    /* JADX WARN: Removed duplicated region for block: B:132:0x08c8  */
                                    /* JADX WARN: Removed duplicated region for block: B:137:0x0937  */
                                    /* JADX WARN: Removed duplicated region for block: B:140:0x0957  */
                                    /* JADX WARN: Removed duplicated region for block: B:141:0x095d  */
                                    /* JADX WARN: Removed duplicated region for block: B:144:0x097c  */
                                    /* JADX WARN: Removed duplicated region for block: B:147:0x099d  */
                                    /* JADX WARN: Removed duplicated region for block: B:150:0x09a9  */
                                    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
                                    /* JADX WARN: Removed duplicated region for block: B:21:0x0141  */
                                    /* JADX WARN: Removed duplicated region for block: B:26:0x01cd  */
                                    /* JADX WARN: Removed duplicated region for block: B:29:0x0229  */
                                    /* JADX WARN: Removed duplicated region for block: B:32:0x0235  */
                                    /* JADX WARN: Removed duplicated region for block: B:33:0x0239  */
                                    /* JADX WARN: Removed duplicated region for block: B:38:0x0266  */
                                    /* JADX WARN: Removed duplicated region for block: B:41:0x02cc  */
                                    /* JADX WARN: Removed duplicated region for block: B:42:0x02db  */
                                    /* JADX WARN: Removed duplicated region for block: B:45:0x03b3  */
                                    /* JADX WARN: Removed duplicated region for block: B:55:0x0423  */
                                    /* JADX WARN: Removed duplicated region for block: B:58:0x043e  */
                                    /* JADX WARN: Removed duplicated region for block: B:59:0x0440  */
                                    /* JADX WARN: Removed duplicated region for block: B:64:0x0472  */
                                    /* JADX WARN: Removed duplicated region for block: B:69:0x04c3  */
                                    /* JADX WARN: Removed duplicated region for block: B:72:0x04fa  */
                                    /* JADX WARN: Removed duplicated region for block: B:77:0x0523  */
                                    /* JADX WARN: Removed duplicated region for block: B:82:0x0573  */
                                    /* JADX WARN: Removed duplicated region for block: B:85:0x05bd  */
                                    /* JADX WARN: Removed duplicated region for block: B:88:0x05c9  */
                                    /* JADX WARN: Removed duplicated region for block: B:89:0x05cd  */
                                    /* JADX WARN: Removed duplicated region for block: B:94:0x05fa  */
                                    /* JADX WARN: Removed duplicated region for block: B:97:0x0623  */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final void invoke(Composer composer2, int i8) {
                                        long j;
                                        Object objRememberedValue13;
                                        Composer.Companion companion3;
                                        boolean zChanged3;
                                        Object objRememberedValue14;
                                        int currentCompositeKeyHash2;
                                        Composer composerM6388constructorimpl2;
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
                                        String secondaryText;
                                        ConstraintLayoutScope constraintLayoutScope22;
                                        C16542xa684c109 c16542xa684c109;
                                        Modifier.Companion companion4;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                                        BentoTheme bentoTheme22;
                                        int i9;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                                        Composer composer3;
                                        Modifier.Companion companion5;
                                        BentoTheme bentoTheme3;
                                        int i10;
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope43;
                                        boolean zChanged4;
                                        Object objRememberedValue15;
                                        Composer composer4;
                                        boolean zChanged5;
                                        Object objRememberedValue16;
                                        String metadata;
                                        boolean zChanged6;
                                        Object objRememberedValue17;
                                        boolean zChanged7;
                                        Object objRememberedValue18;
                                        int currentCompositeKeyHash3;
                                        Composer composerM6388constructorimpl3;
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
                                        Modifier.Companion companion6;
                                        String secondaryText2;
                                        ConstraintLayoutScope constraintLayoutScope3;
                                        Modifier.Companion companion7;
                                        BentoTheme bentoTheme4;
                                        int i11;
                                        boolean zChanged8;
                                        Object objRememberedValue19;
                                        boolean zChangedInstance4;
                                        Object objRememberedValue20;
                                        boolean zChanged9;
                                        Object objRememberedValue21;
                                        boolean zChangedInstance5;
                                        Object objRememberedValue22;
                                        Object objRememberedValue23;
                                        int i12;
                                        Color colorM6701boximpl5;
                                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1200550679, i8, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                                        }
                                        snapshotState2.setValue(Unit.INSTANCE);
                                        int helpersHashCode = constraintLayoutScope2.getHelpersHashCode();
                                        constraintLayoutScope2.reset();
                                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                                        composer2.startReplaceGroup(1316323609);
                                        BentoTheme bentoTheme5 = BentoTheme.INSTANCE;
                                        int i13 = BentoTheme.$stable;
                                        float fM21593getSmallD9Ej5fM = bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM();
                                        float fM21590getDefaultD9Ej5fM = bentoTheme5.getSpacing(composer2, i13).m21590getDefaultD9Ej5fM();
                                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope4.createRefs();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component6 = constrainedLayoutReferencesCreateRefs.component6();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component7 = constrainedLayoutReferencesCreateRefs.component7();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component8 = constrainedLayoutReferencesCreateRefs.component8();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component9 = constrainedLayoutReferencesCreateRefs.component9();
                                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component10 = constrainedLayoutReferencesCreateRefs.component10();
                                        ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchorM8136createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m8136createBottomBarrier3ABfNKs$default(constraintLayoutScope4, new ConstraintLayoutBaseScope6[]{constraintLayoutBaseScope4Component1, constraintLayoutBaseScope4Component2, constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component4, constraintLayoutBaseScope4Component5}, 0.0f, 2, null);
                                        long jM21425getFg0d7_KjU = bentoTheme5.getColors(composer2, i13).m21425getFg0d7_KjU();
                                        Modifier.Companion companion8 = Modifier.INSTANCE;
                                        composer2.startReplaceGroup(5004770);
                                        boolean zChanged10 = composer2.changed(constraintLayoutBaseScope4Component9);
                                        Object objRememberedValue24 = composer2.rememberedValue();
                                        if (!zChanged10) {
                                            j = jM21425getFg0d7_KjU;
                                            if (objRememberedValue24 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            composer2.endReplaceGroup();
                                            LiveStatusIcon5.m14380LiveStatusIconPZHvWI(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component10, (Function1) objRememberedValue24), 0.0f, j, null, composer2, 0, 10);
                                            String text2 = StringUtil2.getText(liveEventCardViewState.getPrimaryText(), composer2, StringResource.$stable);
                                            TextStyle textS2 = bentoTheme5.getTypography(composer2, i13).getTextS();
                                            long jM6705copywmQWz5c$default2 = Color.m6705copywmQWz5c$default(bentoTheme5.getColors(composer2, i13).m21425getFg0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                                            composer2.startReplaceGroup(1849434622);
                                            objRememberedValue13 = composer2.rememberedValue();
                                            companion3 = Composer.INSTANCE;
                                            if (objRememberedValue13 == companion3.getEmpty()) {
                                                objRememberedValue13 = LiveEventCardKt$LiveEventCard$4$1$2$1.INSTANCE;
                                                composer2.updateRememberedValue(objRememberedValue13);
                                            }
                                            composer2.endReplaceGroup();
                                            BentoText2.m20747BentoText38GnDrw(text2, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue13), bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM6705copywmQWz5c$default2), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composer2, 0, 0, 8184);
                                            composer2.startReplaceGroup(-1633490746);
                                            zChanged3 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                                            objRememberedValue14 = composer2.rememberedValue();
                                            if (!zChanged3 || objRememberedValue14 == companion3.getEmpty()) {
                                                objRememberedValue14 = new LiveEventCardKt$LiveEventCard$4$1$3$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                                                composer2.updateRememberedValue(objRememberedValue14);
                                            }
                                            composer2.endReplaceGroup();
                                            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue14), 0.0f, bentoTheme5.getSpacing(composer2, i13).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            Alignment.Companion companion92 = Alignment.INSTANCE;
                                            Alignment.Vertical centerVertically2 = companion92.getCenterVertically();
                                            Arrangement arrangement2 = Arrangement.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composer2, 54);
                                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default3);
                                            ComposeUiNode.Companion companion102 = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor22 = companion102.getConstructor();
                                            if (composer2.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.useNode();
                                            } else {
                                                composer2.createNode(constructor22);
                                            }
                                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy3, companion102.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion102.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash2 = companion102.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion102.getSetModifier());
                                            Row6 row62 = Row6.INSTANCE;
                                            SeedIcon.SeedIcon(liveEventCardViewState.getLeftContractViewState().getImageUrl(), liveEventCardViewState.getLeftContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion8, 0.0f, 0.0f, bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, composer2, 0, 8);
                                            secondaryText = liveEventCardViewState.getLeftContractViewState().getSecondaryText();
                                            composer2.startReplaceGroup(486332623);
                                            if (secondaryText != null) {
                                                constraintLayoutScope22 = constraintLayoutScope4;
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component1;
                                                bentoTheme22 = bentoTheme5;
                                                i9 = i13;
                                                c16542xa684c109 = this;
                                                companion4 = companion8;
                                                composer3 = composer2;
                                            } else {
                                                constraintLayoutScope22 = constraintLayoutScope4;
                                                c16542xa684c109 = this;
                                                companion4 = companion8;
                                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component3;
                                                bentoTheme22 = bentoTheme5;
                                                i9 = i13;
                                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component1;
                                                composer3 = composer2;
                                                BentoText2.m20747BentoText38GnDrw(secondaryText, PaddingKt.m5146paddingqDBjuR0$default(companion8, 0.0f, 0.0f, bentoTheme5.getSpacing(composer2, i13).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme5.getColors(composer2, i13).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme5.getTypography(composer2, i13).getTextS(), composer3, 0, 0, 8184);
                                            }
                                            composer3.endReplaceGroup();
                                            String primaryText2 = liveEventCardViewState.getLeftContractViewState().getPrimaryText();
                                            BentoTheme bentoTheme62 = bentoTheme22;
                                            int i142 = i9;
                                            TextStyle textM2 = bentoTheme62.getTypography(composer3, i142).getTextM();
                                            FontWeight.Companion companion112 = FontWeight.INSTANCE;
                                            Modifier.Companion companion122 = companion4;
                                            int i152 = i9;
                                            BentoText2.m20747BentoText38GnDrw(primaryText2, PaddingKt.m5146paddingqDBjuR0$default(row62.weight(companion122, 1.0f, false), 0.0f, 0.0f, bentoTheme62.getSpacing(composer3, i142).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, companion112.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composer3, 24576, 0, 8172);
                                            composer3.startReplaceGroup(486355476);
                                            if (liveEventCardViewState.getLeftContractViewState().isActive()) {
                                                companion5 = companion122;
                                                bentoTheme3 = bentoTheme62;
                                                i10 = i152;
                                            } else {
                                                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                                                DayNightColor contractColor32 = liveEventCardViewState.getLeftContractViewState().getContractColor();
                                                composer3.startReplaceGroup(486363900);
                                                if (contractColor32 == null) {
                                                    colorM6701boximpl5 = null;
                                                    i12 = 0;
                                                } else {
                                                    i12 = 0;
                                                    colorM6701boximpl5 = Color.m6701boximpl(contractColor32.getColor(composer3, 0));
                                                }
                                                composer3.endReplaceGroup();
                                                composer3.startReplaceGroup(486362592);
                                                bentoTheme3 = bentoTheme62;
                                                i10 = i152;
                                                long jM21426getFg20d7_KjU = colorM6701boximpl5 == null ? bentoTheme3.getColors(composer3, i10).m21426getFg20d7_KjU() : colorM6701boximpl5.getValue();
                                                composer3.endReplaceGroup();
                                                companion5 = companion122;
                                                BentoIcon2.m20644BentoIconFU0evQE(size12, StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer3, i12), jM21426getFg20d7_KjU, PaddingKt.m5146paddingqDBjuR0$default(companion122, 0.0f, 0.0f, bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, false, composer3, BentoIcon4.Size12.$stable, 48);
                                            }
                                            composer3.endReplaceGroup();
                                            composer3.endNode();
                                            String metadata22 = liveEventCardViewState.getLeftContractViewState().getMetadata();
                                            String str = metadata22 != null ? "-" : metadata22;
                                            TickerTextState.Style style2 = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
                                            long jM21425getFg0d7_KjU22 = bentoTheme3.getColors(composer3, i10).m21425getFg0d7_KjU();
                                            composer3.startReplaceGroup(-1746271574);
                                            constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
                                            zChanged4 = composer3.changed(constraintLayoutBaseScope43) | composer3.changed(constraintLayoutBaseScope4Component5) | composer3.changed(fM21593getSmallD9Ej5fM);
                                            objRememberedValue15 = composer3.rememberedValue();
                                            if (!zChanged4 || objRememberedValue15 == companion3.getEmpty()) {
                                                objRememberedValue15 = new LiveEventCardKt$LiveEventCard$4$1$5$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                                                composer3.updateRememberedValue(objRememberedValue15);
                                            }
                                            composer3.endReplaceGroup();
                                            ConstraintLayoutScope constraintLayoutScope52 = constraintLayoutScope22;
                                            composer4 = composer3;
                                            WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4, (Function1) objRememberedValue15), 0.0f, bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), str, jM21425getFg0d7_KjU22, style2, composer4, 3072);
                                            composer4.startReplaceGroup(5004770);
                                            zChanged5 = composer4.changed(constraintLayoutBaseScope43);
                                            objRememberedValue16 = composer4.rememberedValue();
                                            if (!zChanged5 || objRememberedValue16 == companion3.getEmpty()) {
                                                objRememberedValue16 = new LiveEventCardKt$LiveEventCard$4$1$6$1(constraintLayoutBaseScope43);
                                                composer4.updateRememberedValue(objRememberedValue16);
                                            }
                                            composer4.endReplaceGroup();
                                            ScoreDivider.ScoreDivider(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue16), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer4, 0, 0);
                                            metadata = liveEventCardViewState.getRightContractViewState().getMetadata();
                                            if (metadata == null) {
                                                metadata = "-";
                                            }
                                            long jM21425getFg0d7_KjU32 = bentoTheme3.getColors(composer4, i10).m21425getFg0d7_KjU();
                                            composer4.startReplaceGroup(-1746271574);
                                            zChanged6 = composer4.changed(constraintLayoutBaseScope43) | composer4.changed(constraintLayoutBaseScope4Component5) | composer4.changed(fM21593getSmallD9Ej5fM);
                                            objRememberedValue17 = composer4.rememberedValue();
                                            if (!zChanged6 || objRememberedValue17 == companion3.getEmpty()) {
                                                objRememberedValue17 = new LiveEventCardKt$LiveEventCard$4$1$7$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                                                composer4.updateRememberedValue(objRememberedValue17);
                                            }
                                            composer4.endReplaceGroup();
                                            WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue17), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), metadata, jM21425getFg0d7_KjU32, style2, composer4, 3072);
                                            composer4.startReplaceGroup(-1633490746);
                                            zChanged7 = composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(constraintLayoutBaseScope43);
                                            objRememberedValue18 = composer4.rememberedValue();
                                            if (!zChanged7 || objRememberedValue18 == companion3.getEmpty()) {
                                                objRememberedValue18 = new LiveEventCardKt$LiveEventCard$4$1$8$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope43);
                                                composer4.updateRememberedValue(objRememberedValue18);
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope52.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getEnd(), companion92.getCenterVertically(), composer4, 54);
                                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                            CompositionLocalMap currentCompositionLocalMap32 = composer4.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default22);
                                            Function0<ComposeUiNode> constructor32 = companion102.getConstructor();
                                            if (composer4.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer4.startReusableNode();
                                            if (composer4.getInserting()) {
                                                composer4.useNode();
                                            } else {
                                                composer4.createNode(constructor32);
                                            }
                                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion102.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion102.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash3 = companion102.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion102.getSetModifier());
                                            composer4.startReplaceGroup(-1009832703);
                                            if (liveEventCardViewState.getRightContractViewState().isActive()) {
                                                companion6 = companion5;
                                            } else {
                                                BentoIcon4.Size12 size122 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.DOT_12);
                                                DayNightColor contractColor4 = liveEventCardViewState.getRightContractViewState().getContractColor();
                                                composer4.startReplaceGroup(-1009824219);
                                                Color colorM6701boximpl6 = contractColor4 == null ? null : Color.m6701boximpl(contractColor4.getColor(composer4, 0));
                                                composer4.endReplaceGroup();
                                                composer4.startReplaceGroup(-1009825558);
                                                long jM21426getFg20d7_KjU2 = colorM6701boximpl6 == null ? bentoTheme3.getColors(composer4, i10).m21426getFg20d7_KjU() : colorM6701boximpl6.getValue();
                                                composer4.endReplaceGroup();
                                                companion6 = companion5;
                                                BentoIcon2.m20644BentoIconFU0evQE(size122, StringResources_androidKt.stringResource(C16594R.string.active_event_content_description, composer4, 0), jM21426getFg20d7_KjU2, PaddingKt.m5146paddingqDBjuR0$default(companion6, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composer4, BentoIcon4.Size12.$stable, 48);
                                            }
                                            composer4.endReplaceGroup();
                                            secondaryText2 = liveEventCardViewState.getRightContractViewState().getSecondaryText();
                                            composer4.startReplaceGroup(-1009813509);
                                            if (secondaryText2 != null) {
                                                constraintLayoutScope3 = constraintLayoutScope52;
                                                bentoTheme4 = bentoTheme3;
                                                i11 = i10;
                                                companion7 = companion6;
                                            } else {
                                                constraintLayoutScope3 = constraintLayoutScope52;
                                                companion7 = companion6;
                                                bentoTheme4 = bentoTheme3;
                                                i11 = i10;
                                                BentoText2.m20747BentoText38GnDrw(secondaryText2, PaddingKt.m5146paddingqDBjuR0$default(companion6, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(bentoTheme3.getColors(composer4, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer4, i10).getTextS(), composer4, 0, 0, 8184);
                                            }
                                            composer4.endReplaceGroup();
                                            BentoTheme bentoTheme72 = bentoTheme4;
                                            int i162 = i11;
                                            Modifier.Companion companion132 = companion7;
                                            BentoText2.m20747BentoText38GnDrw(liveEventCardViewState.getRightContractViewState().getPrimaryText(), PaddingKt.m5146paddingqDBjuR0$default(row62.weight(companion132, 1.0f, false), bentoTheme72.getSpacing(composer4, i162).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion112.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme72.getTypography(composer4, i162).getTextM(), composer4, 24576, 0, 8172);
                                            SeedIcon.SeedIcon(liveEventCardViewState.getRightContractViewState().getImageUrl(), liveEventCardViewState.getRightContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion132, bentoTheme72.getSpacing(composer4, i162).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), true, composer4, 3072, 0);
                                            composer4.endNode();
                                            CardPills7 pillState3 = liveEventCardViewState.getLeftContractViewState().getPillState();
                                            composer4.startReplaceGroup(-1224400529);
                                            zChanged8 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                                            objRememberedValue19 = composer4.rememberedValue();
                                            if (!zChanged8 || objRememberedValue19 == companion3.getEmpty()) {
                                                objRememberedValue19 = new LiveEventCardKt$LiveEventCard$4$1$10$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                                                composer4.updateRememberedValue(objRememberedValue19);
                                            }
                                            composer4.endReplaceGroup();
                                            ConstraintLayoutScope constraintLayoutScope62 = constraintLayoutScope3;
                                            Modifier modifierConstrainAs3 = constraintLayoutScope62.constrainAs(companion132, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue19);
                                            if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                                                modifierConstrainAs3 = ModifiersKt.autoLogEvents$default(modifierConstrainAs3, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-card-pill-" + liveEventCardViewState.getLeftContractViewState().getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                                            }
                                            Modifier modifier52 = modifierConstrainAs3;
                                            boolean zIsInAcqStreamlinedTradeFlowExperiment3 = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                                            composer4.startReplaceGroup(-1633490746);
                                            zChangedInstance4 = composer4.changedInstance(hubNavigationCallbacks32) | composer4.changed(liveEventCardViewState);
                                            objRememberedValue20 = composer4.rememberedValue();
                                            if (!zChangedInstance4 || objRememberedValue20 == companion3.getEmpty()) {
                                                objRememberedValue20 = new LiveEventCardKt$LiveEventCard$4$1$12$1(hubNavigationCallbacks32, liveEventCardViewState);
                                                composer4.updateRememberedValue(objRememberedValue20);
                                            }
                                            composer4.endReplaceGroup();
                                            CardPills.ContractPill(pillState3, modifier52, zIsInAcqStreamlinedTradeFlowExperiment3, (Function0) objRememberedValue20, composer4, 0, 0);
                                            CardPills7 pillState22 = liveEventCardViewState.getRightContractViewState().getPillState();
                                            composer4.startReplaceGroup(-1224400529);
                                            zChanged9 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                                            objRememberedValue21 = composer4.rememberedValue();
                                            if (!zChanged9 || objRememberedValue21 == companion3.getEmpty()) {
                                                objRememberedValue21 = new LiveEventCardKt$LiveEventCard$4$1$13$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                                                composer4.updateRememberedValue(objRememberedValue21);
                                            }
                                            composer4.endReplaceGroup();
                                            Modifier modifierConstrainAs22 = constraintLayoutScope62.constrainAs(companion132, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue21);
                                            if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                                                modifierConstrainAs22 = ModifiersKt.autoLogEvents$default(modifierConstrainAs22, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "event-card-pill-" + liveEventCardViewState.getRightContractViewState().getContractId(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                                            }
                                            Modifier modifier62 = modifierConstrainAs22;
                                            boolean zIsInAcqStreamlinedTradeFlowExperiment22 = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                                            composer4.startReplaceGroup(-1633490746);
                                            zChangedInstance5 = composer4.changedInstance(hubNavigationCallbacks32) | composer4.changed(liveEventCardViewState);
                                            objRememberedValue22 = composer4.rememberedValue();
                                            if (!zChangedInstance5 || objRememberedValue22 == companion3.getEmpty()) {
                                                objRememberedValue22 = new LiveEventCardKt$LiveEventCard$4$1$15$1(hubNavigationCallbacks32, liveEventCardViewState);
                                                composer4.updateRememberedValue(objRememberedValue22);
                                            }
                                            composer4.endReplaceGroup();
                                            CardPills.ContractPill(pillState22, modifier62, zIsInAcqStreamlinedTradeFlowExperiment22, (Function0) objRememberedValue22, composer4, 0, 0);
                                            Float progress2 = liveEventCardViewState.getProgress();
                                            float fFloatValue = progress2 == null ? progress2.floatValue() : 1.0f;
                                            long progressBarActiveColor2 = liveEventCardViewState.getProgressBarActiveColor(composer4, 0);
                                            long progressBarBackgroundColor2 = liveEventCardViewState.getProgressBarBackgroundColor(composer4, 0);
                                            composer4.startReplaceGroup(1849434622);
                                            objRememberedValue23 = composer4.rememberedValue();
                                            if (objRememberedValue23 == companion3.getEmpty()) {
                                                objRememberedValue23 = LiveEventCardKt$LiveEventCard$4$1$16$1.INSTANCE;
                                                composer4.updateRememberedValue(objRememberedValue23);
                                            }
                                            composer4.endReplaceGroup();
                                            LastTradePriceBar5.m14375LastTradePriceBareopBjH0(fFloatValue, progressBarActiveColor2, progressBarBackgroundColor2, constraintLayoutScope62.constrainAs(companion132, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue23), composer4, 0, 0);
                                            composer4.endReplaceGroup();
                                            if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                                EffectsKt.SideEffect(function02, composer4, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                return;
                                            }
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        j = jM21425getFg0d7_KjU;
                                        objRememberedValue24 = new LiveEventCardKt$LiveEventCard$4$1$1$1(constraintLayoutBaseScope4Component9);
                                        composer2.updateRememberedValue(objRememberedValue24);
                                        composer2.endReplaceGroup();
                                        LiveStatusIcon5.m14380LiveStatusIconPZHvWI(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component10, (Function1) objRememberedValue24), 0.0f, j, null, composer2, 0, 10);
                                        String text22 = StringUtil2.getText(liveEventCardViewState.getPrimaryText(), composer2, StringResource.$stable);
                                        TextStyle textS22 = bentoTheme5.getTypography(composer2, i13).getTextS();
                                        long jM6705copywmQWz5c$default22 = Color.m6705copywmQWz5c$default(bentoTheme5.getColors(composer2, i13).m21425getFg0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                                        composer2.startReplaceGroup(1849434622);
                                        objRememberedValue13 = composer2.rememberedValue();
                                        companion3 = Composer.INSTANCE;
                                        if (objRememberedValue13 == companion3.getEmpty()) {
                                        }
                                        composer2.endReplaceGroup();
                                        BentoText2.m20747BentoText38GnDrw(text22, PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component9, (Function1) objRememberedValue13), bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), Color.m6701boximpl(jM6705copywmQWz5c$default22), null, null, null, null, 0, false, 0, 0, null, 0, textS22, composer2, 0, 0, 8184);
                                        composer2.startReplaceGroup(-1633490746);
                                        zChanged3 = composer2.changed(constraintLayoutBaseScope4Component3) | composer2.changed(constraintLayoutBaseScope4Component9);
                                        objRememberedValue14 = composer2.rememberedValue();
                                        if (!zChanged3) {
                                            objRememberedValue14 = new LiveEventCardKt$LiveEventCard$4$1$3$1(constraintLayoutBaseScope4Component3, constraintLayoutBaseScope4Component9);
                                            composer2.updateRememberedValue(objRememberedValue14);
                                        }
                                        composer2.endReplaceGroup();
                                        Modifier modifierM5146paddingqDBjuR0$default32 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope4.constrainAs(companion8, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue14), 0.0f, bentoTheme5.getSpacing(composer2, i13).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        Alignment.Companion companion922 = Alignment.INSTANCE;
                                        Alignment.Vertical centerVertically22 = companion922.getCenterVertically();
                                        Arrangement arrangement22 = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy32 = Row2.rowMeasurePolicy(arrangement22.getStart(), centerVertically22, composer2, 54);
                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                        CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier222 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default32);
                                        ComposeUiNode.Companion companion1022 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor222 = companion1022.getConstructor();
                                        if (composer2.getApplier() == null) {
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                        }
                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy32, companion1022.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap222, companion1022.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion1022.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl2.getInserting()) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier222, companion1022.getSetModifier());
                                        Row6 row622 = Row6.INSTANCE;
                                        SeedIcon.SeedIcon(liveEventCardViewState.getLeftContractViewState().getImageUrl(), liveEventCardViewState.getLeftContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion8, 0.0f, 0.0f, bentoTheme5.getSpacing(composer2, i13).m21593getSmallD9Ej5fM(), 0.0f, 11, null), false, composer2, 0, 8);
                                        secondaryText = liveEventCardViewState.getLeftContractViewState().getSecondaryText();
                                        composer2.startReplaceGroup(486332623);
                                        if (secondaryText != null) {
                                        }
                                        composer3.endReplaceGroup();
                                        String primaryText22 = liveEventCardViewState.getLeftContractViewState().getPrimaryText();
                                        BentoTheme bentoTheme622 = bentoTheme22;
                                        int i1422 = i9;
                                        TextStyle textM22 = bentoTheme622.getTypography(composer3, i1422).getTextM();
                                        FontWeight.Companion companion1122 = FontWeight.INSTANCE;
                                        Modifier.Companion companion1222 = companion4;
                                        int i1522 = i9;
                                        BentoText2.m20747BentoText38GnDrw(primaryText22, PaddingKt.m5146paddingqDBjuR0$default(row622.weight(companion1222, 1.0f, false), 0.0f, 0.0f, bentoTheme622.getSpacing(composer3, i1422).m21595getXsmallD9Ej5fM(), 0.0f, 11, null), null, null, companion1122.getBold(), null, null, 0, false, 0, 0, null, 0, textM22, composer3, 24576, 0, 8172);
                                        composer3.startReplaceGroup(486355476);
                                        if (liveEventCardViewState.getLeftContractViewState().isActive()) {
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        String metadata222 = liveEventCardViewState.getLeftContractViewState().getMetadata();
                                        if (metadata222 != null) {
                                        }
                                        TickerTextState.Style style22 = TickerTextState.Style.REGULAR_MEDIUM_BOLD;
                                        long jM21425getFg0d7_KjU222 = bentoTheme3.getColors(composer3, i10).m21425getFg0d7_KjU();
                                        composer3.startReplaceGroup(-1746271574);
                                        constraintLayoutBaseScope43 = constraintLayoutBaseScope42;
                                        zChanged4 = composer3.changed(constraintLayoutBaseScope43) | composer3.changed(constraintLayoutBaseScope4Component5) | composer3.changed(fM21593getSmallD9Ej5fM);
                                        objRememberedValue15 = composer3.rememberedValue();
                                        if (!zChanged4) {
                                            objRememberedValue15 = new LiveEventCardKt$LiveEventCard$4$1$5$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                                            composer3.updateRememberedValue(objRememberedValue15);
                                        }
                                        composer3.endReplaceGroup();
                                        ConstraintLayoutScope constraintLayoutScope522 = constraintLayoutScope22;
                                        composer4 = composer3;
                                        WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope522.constrainAs(companion5, constraintLayoutBaseScope4, (Function1) objRememberedValue15), 0.0f, bentoTheme3.getSpacing(composer3, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), str, jM21425getFg0d7_KjU222, style22, composer4, 3072);
                                        composer4.startReplaceGroup(5004770);
                                        zChanged5 = composer4.changed(constraintLayoutBaseScope43);
                                        objRememberedValue16 = composer4.rememberedValue();
                                        if (!zChanged5) {
                                            objRememberedValue16 = new LiveEventCardKt$LiveEventCard$4$1$6$1(constraintLayoutBaseScope43);
                                            composer4.updateRememberedValue(objRememberedValue16);
                                        }
                                        composer4.endReplaceGroup();
                                        ScoreDivider.ScoreDivider(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope522.constrainAs(companion5, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue16), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), composer4, 0, 0);
                                        metadata = liveEventCardViewState.getRightContractViewState().getMetadata();
                                        if (metadata == null) {
                                        }
                                        long jM21425getFg0d7_KjU322 = bentoTheme3.getColors(composer4, i10).m21425getFg0d7_KjU();
                                        composer4.startReplaceGroup(-1746271574);
                                        zChanged6 = composer4.changed(constraintLayoutBaseScope43) | composer4.changed(constraintLayoutBaseScope4Component5) | composer4.changed(fM21593getSmallD9Ej5fM);
                                        objRememberedValue17 = composer4.rememberedValue();
                                        if (!zChanged6) {
                                            objRememberedValue17 = new LiveEventCardKt$LiveEventCard$4$1$7$1(constraintLayoutBaseScope43, constraintLayoutBaseScope4Component5, fM21593getSmallD9Ej5fM);
                                            composer4.updateRememberedValue(objRememberedValue17);
                                        }
                                        composer4.endReplaceGroup();
                                        WrappedTickerKt.m19244TickerTextFNF3uiM(PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope522.constrainAs(companion5, constraintLayoutBaseScope4Component4, (Function1) objRememberedValue17), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), metadata, jM21425getFg0d7_KjU322, style22, composer4, 3072);
                                        composer4.startReplaceGroup(-1633490746);
                                        zChanged7 = composer4.changed(constraintLayoutBaseScope4Component4) | composer4.changed(constraintLayoutBaseScope43);
                                        objRememberedValue18 = composer4.rememberedValue();
                                        if (!zChanged7) {
                                            objRememberedValue18 = new LiveEventCardKt$LiveEventCard$4$1$8$1(constraintLayoutBaseScope4Component4, constraintLayoutBaseScope43);
                                            composer4.updateRememberedValue(objRememberedValue18);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierM5146paddingqDBjuR0$default222 = PaddingKt.m5146paddingqDBjuR0$default(constraintLayoutScope522.constrainAs(companion5, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18), 0.0f, bentoTheme3.getSpacing(composer4, i10).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy222 = Row2.rowMeasurePolicy(arrangement22.getEnd(), companion922.getCenterVertically(), composer4, 54);
                                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap322 = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier322 = ComposedModifier2.materializeModifier(composer4, modifierM5146paddingqDBjuR0$default222);
                                        Function0<ComposeUiNode> constructor322 = companion1022.getConstructor();
                                        if (composer4.getApplier() == null) {
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                        }
                                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy222, companion1022.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap322, companion1022.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash3 = companion1022.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl3.getInserting()) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier322, companion1022.getSetModifier());
                                        composer4.startReplaceGroup(-1009832703);
                                        if (liveEventCardViewState.getRightContractViewState().isActive()) {
                                        }
                                        composer4.endReplaceGroup();
                                        secondaryText2 = liveEventCardViewState.getRightContractViewState().getSecondaryText();
                                        composer4.startReplaceGroup(-1009813509);
                                        if (secondaryText2 != null) {
                                        }
                                        composer4.endReplaceGroup();
                                        BentoTheme bentoTheme722 = bentoTheme4;
                                        int i1622 = i11;
                                        Modifier.Companion companion1322 = companion7;
                                        BentoText2.m20747BentoText38GnDrw(liveEventCardViewState.getRightContractViewState().getPrimaryText(), PaddingKt.m5146paddingqDBjuR0$default(row622.weight(companion1322, 1.0f, false), bentoTheme722.getSpacing(composer4, i1622).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, null, companion1122.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme722.getTypography(composer4, i1622).getTextM(), composer4, 24576, 0, 8172);
                                        SeedIcon.SeedIcon(liveEventCardViewState.getRightContractViewState().getImageUrl(), liveEventCardViewState.getRightContractViewState().getContractColor(), PaddingKt.m5146paddingqDBjuR0$default(companion1322, bentoTheme722.getSpacing(composer4, i1622).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), true, composer4, 3072, 0);
                                        composer4.endNode();
                                        CardPills7 pillState32 = liveEventCardViewState.getLeftContractViewState().getPillState();
                                        composer4.startReplaceGroup(-1224400529);
                                        zChanged8 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                                        objRememberedValue19 = composer4.rememberedValue();
                                        if (!zChanged8) {
                                            objRememberedValue19 = new LiveEventCardKt$LiveEventCard$4$1$10$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                                            composer4.updateRememberedValue(objRememberedValue19);
                                        }
                                        composer4.endReplaceGroup();
                                        ConstraintLayoutScope constraintLayoutScope622 = constraintLayoutScope3;
                                        Modifier modifierConstrainAs32 = constraintLayoutScope622.constrainAs(companion1322, constraintLayoutBaseScope4Component6, (Function1) objRememberedValue19);
                                        if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                                        }
                                        Modifier modifier522 = modifierConstrainAs32;
                                        boolean zIsInAcqStreamlinedTradeFlowExperiment32 = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                                        composer4.startReplaceGroup(-1633490746);
                                        zChangedInstance4 = composer4.changedInstance(hubNavigationCallbacks32) | composer4.changed(liveEventCardViewState);
                                        objRememberedValue20 = composer4.rememberedValue();
                                        if (!zChangedInstance4) {
                                            objRememberedValue20 = new LiveEventCardKt$LiveEventCard$4$1$12$1(hubNavigationCallbacks32, liveEventCardViewState);
                                            composer4.updateRememberedValue(objRememberedValue20);
                                        }
                                        composer4.endReplaceGroup();
                                        CardPills.ContractPill(pillState32, modifier522, zIsInAcqStreamlinedTradeFlowExperiment32, (Function0) objRememberedValue20, composer4, 0, 0);
                                        CardPills7 pillState222 = liveEventCardViewState.getRightContractViewState().getPillState();
                                        composer4.startReplaceGroup(-1224400529);
                                        zChanged9 = composer4.changed(horizontalAnchorM8136createBottomBarrier3ABfNKs$default) | composer4.changed(liveEventCardViewState) | composer4.changed(constraintLayoutBaseScope4Component8) | composer4.changed(fM21590getDefaultD9Ej5fM);
                                        objRememberedValue21 = composer4.rememberedValue();
                                        if (!zChanged9) {
                                            objRememberedValue21 = new LiveEventCardKt$LiveEventCard$4$1$13$1(horizontalAnchorM8136createBottomBarrier3ABfNKs$default, liveEventCardViewState, constraintLayoutBaseScope4Component8, fM21590getDefaultD9Ej5fM);
                                            composer4.updateRememberedValue(objRememberedValue21);
                                        }
                                        composer4.endReplaceGroup();
                                        Modifier modifierConstrainAs222 = constraintLayoutScope622.constrainAs(companion1322, constraintLayoutBaseScope4Component7, (Function1) objRememberedValue21);
                                        if (liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment()) {
                                        }
                                        Modifier modifier622 = modifierConstrainAs222;
                                        boolean zIsInAcqStreamlinedTradeFlowExperiment222 = liveEventCardViewState.isInAcqStreamlinedTradeFlowExperiment();
                                        composer4.startReplaceGroup(-1633490746);
                                        zChangedInstance5 = composer4.changedInstance(hubNavigationCallbacks32) | composer4.changed(liveEventCardViewState);
                                        objRememberedValue22 = composer4.rememberedValue();
                                        if (!zChangedInstance5) {
                                            objRememberedValue22 = new LiveEventCardKt$LiveEventCard$4$1$15$1(hubNavigationCallbacks32, liveEventCardViewState);
                                            composer4.updateRememberedValue(objRememberedValue22);
                                        }
                                        composer4.endReplaceGroup();
                                        CardPills.ContractPill(pillState222, modifier622, zIsInAcqStreamlinedTradeFlowExperiment222, (Function0) objRememberedValue22, composer4, 0, 0);
                                        Float progress22 = liveEventCardViewState.getProgress();
                                        if (progress22 == null) {
                                        }
                                        long progressBarActiveColor22 = liveEventCardViewState.getProgressBarActiveColor(composer4, 0);
                                        long progressBarBackgroundColor22 = liveEventCardViewState.getProgressBarBackgroundColor(composer4, 0);
                                        composer4.startReplaceGroup(1849434622);
                                        objRememberedValue23 = composer4.rememberedValue();
                                        if (objRememberedValue23 == companion3.getEmpty()) {
                                        }
                                        composer4.endReplaceGroup();
                                        LastTradePriceBar5.m14375LastTradePriceBareopBjH0(fFloatValue, progressBarActiveColor22, progressBarBackgroundColor22, constraintLayoutScope622.constrainAs(companion1322, constraintLayoutBaseScope4Component8, (Function1) objRememberedValue23), composer4, 0, 0);
                                        composer4.endReplaceGroup();
                                        if (constraintLayoutScope2.getHelpersHashCode() != helpersHashCode) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                    }
                                };
                                state = liveEventCardViewState;
                                LayoutKt.MultiMeasureLayout(modifierSemantics$default2, ComposableLambda3.rememberComposableLambda(1200550679, true, function22, composerStartRestartGroup, 54), measurePolicy2, composerStartRestartGroup, 48, 0);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveEventCard$lambda$6$lambda$5(SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue((int) (coordinates.mo7241getSizeYbymL2g() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveEventCard$lambda$10$lambda$9(Color color, Color color2, SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, DrawScope drawBehind) {
        int i;
        Float fValueOf = Float.valueOf(0.5f);
        Float fValueOf2 = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
        if (color != null) {
            long value = color.getValue();
            Brush.Companion companion = Brush.INSTANCE;
            Tuples2[] tuples2Arr = {Tuples4.m3642to(fValueOf2, Color.m6701boximpl(value)), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()))};
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) / 2;
            i = 2;
            DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6681radialGradientP_VxKs$default(companion, tuples2Arr, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) * 0.75f, 0, 8, (Object) null), 0L, 0L, LiveEventCard$lambda$3(snapshotState4), null, null, 0, 118, null);
        } else {
            i = 2;
        }
        if (color2 != null) {
            long value2 = color2.getValue();
            Brush.Companion companion2 = Brush.INSTANCE;
            Tuples2[] tuples2Arr2 = {Tuples4.m3642to(fValueOf2, Color.m6701boximpl(value2)), Tuples4.m3642to(fValueOf, Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()))};
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) / i;
            DrawScope.m6957drawRectAsUm42w$default(drawBehind, Brush.Companion.m6681radialGradientP_VxKs$default(companion2, tuples2Arr2, Offset.m6535constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat3) & 4294967295L)), Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) * 0.75f, 0, 8, (Object) null), 0L, 0L, LiveEventCard$lambda$4(snapshotState42), null, null, 0, 118, null);
        }
        return Unit.INSTANCE;
    }

    private static final void PreviewLiveEventCard(final LiveEventCardViewState liveEventCardViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-342726653);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(liveEventCardViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-342726653, i2, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.PreviewLiveEventCard (LiveEventCard.kt:601)");
            }
            BentoThemeForPreview.BentoThemeForPreview(false, ComposableLambda3.rememberComposableLambda(619467635, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt.PreviewLiveEventCard.1
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
                        ComposerKt.traceEventStart(619467635, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.cards.PreviewLiveEventCard.<anonymous> (LiveEventCard.kt:603)");
                    }
                    LiveEventCardKt.LiveEventCard(liveEventCardViewState, null, composer2, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.cards.LiveEventCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiveEventCardKt.PreviewLiveEventCard$lambda$33(liveEventCardViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
