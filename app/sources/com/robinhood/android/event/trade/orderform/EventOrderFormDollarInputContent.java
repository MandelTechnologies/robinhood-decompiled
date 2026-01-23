package com.robinhood.android.event.trade.orderform;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.trade.EventOrderFormViewState;
import com.robinhood.android.tickerinputview.TickerInputComposable3;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EventOrderFormDollarInputContent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"EventOrderFormDollarInputContent", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;", "isEditing", "", "notionalErrorShakeAnimationId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$NotionalBasedData;ZLjava/util/UUID;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EditingSubText", "state", "Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;", "(Lcom/robinhood/android/event/trade/EventOrderFormViewState$OrderFormContentData$EditingSubTextState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmptyPlaceholder", "", "feature-event-trade_externalDebug", "animateTextChanges", "initialDollarInput", "animateErrorShake"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventOrderFormDollarInputContent {
    private static final String EmptyPlaceholder = "      ";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditingSubText$lambda$18(EventOrderFormViewState.OrderFormContentData.EditingSubTextState editingSubTextState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EditingSubText(editingSubTextState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderFormDollarInputContent$lambda$17(EventOrderFormViewState.OrderFormContentData.NotionalBasedData notionalBasedData, boolean z, UUID uuid, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventOrderFormDollarInputContent(notionalBasedData, z, uuid, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0254  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventOrderFormDollarInputContent(final EventOrderFormViewState.OrderFormContentData.NotionalBasedData data, final boolean z, final UUID uuid, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-332428365);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(data) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(uuid) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-332428365, i3, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContent (EventOrderFormDollarInputContent.kt:42)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(data.getDollarInput(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                if (!EventOrderFormDollarInputContent$lambda$1(snapshotState) && !Intrinsics.areEqual(data.getDollarInput(), EventOrderFormDollarInputContent$lambda$4(snapshotState2))) {
                    EventOrderFormDollarInputContent$lambda$2(snapshotState, true);
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1636057012);
                if (uuid != null) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new EventOrderFormDollarInputContent2(snapshotState3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(uuid, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, (i3 >> 6) & 14);
                }
                composerStartRestartGroup.endReplaceGroup();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(150)), composerStartRestartGroup, 6);
                String dollarInput = data.getDollarInput();
                boolean zEventOrderFormDollarInputContent$lambda$1 = EventOrderFormDollarInputContent$lambda$1(snapshotState);
                boolean zEventOrderFormDollarInputContent$lambda$6 = EventOrderFormDollarInputContent$lambda$6(snapshotState3);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EventOrderFormDollarInputContent.EventOrderFormDollarInputContent$lambda$16$lambda$10$lambda$9(snapshotState3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                TickerInputComposable3.m19249TickerInputComposableuSRqIlo(dollarInput, null, zEventOrderFormDollarInputContent$lambda$1, false, 0.0f, 0, zEventOrderFormDollarInputContent$lambda$6, (Function0) objRememberedValue4, composerStartRestartGroup, 12582912, 58);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(1960509588);
                    composerStartRestartGroup.startReplaceGroup(1448716635);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1448717414);
                    int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM().m7662getFontSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65532, (DefaultConstructorMarker) null));
                    try {
                        StringResource reviewingSubtextLeading = data.getReviewingSubtextLeading();
                        int i7 = StringResource.$stable;
                        builder.append(EventOrderFormScreen3.getText(reviewingSubtextLeading, composerStartRestartGroup, i7));
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1448728955);
                        if (data.getReviewingSubtextTrailing() != null) {
                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM().m7662getFontSizeXSAIIZE(), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65528, (DefaultConstructorMarker) null));
                            try {
                                builder.append(EventOrderFormScreen3.getText(data.getReviewingSubtextTrailing(), composerStartRestartGroup, i7));
                            } finally {
                            }
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = 54;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, null, composerStartRestartGroup, 0, 0, 16318);
                        if (data.getReviewingSubtextTrailing() == null) {
                            BentoText2.m20747BentoText38GnDrw(EmptyPlaceholder, ModifiersKt.bentoPlaceholder$default(companion4, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 6, 0, 16380);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } finally {
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(1960256535);
                    EventOrderFormViewState.OrderFormContentData.EditingSubTextState editingSubtext = data.getEditingSubtext();
                    if (editingSubtext != null) {
                        EditingSubText(editingSubtext, null, composerStartRestartGroup, 0, 2);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i4 = 54;
                }
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(Column5.weight$default(column6, SizeKt.m5156height3ABfNKs(companion4, C2002Dp.m7995constructorimpl(0)), 2.0f, false, 2, null), composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                AnimatedVisibilityKt.AnimatedVisibility(column6, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1451554597, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContentKt$EventOrderFormDollarInputContent$2$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1451554597, i8, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContent.<anonymous>.<anonymous> (EventOrderFormDollarInputContent.kt:124)");
                        }
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion5, 0.0f, bentoTheme2.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 1, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        EventOrderFormViewState.OrderFormContentData.NotionalBasedData notionalBasedData = data;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(center, centerVertically, composer2, 54);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        composer2.startReplaceGroup(1758454055);
                        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                        composer2.startReplaceGroup(1758454830);
                        int iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme2.getColors(composer2, i9).m21426getFg20d7_KjU(), bentoTheme2.getTypography(composer2, i9).getTextM().m7662getFontSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65532, (DefaultConstructorMarker) null));
                        try {
                            StringResource buyingPowerDisplayLeading = notionalBasedData.getBuyingPowerDisplayLeading();
                            int i10 = StringResource.$stable;
                            builder2.append(EventOrderFormScreen3.getText(buyingPowerDisplayLeading, composer2, i10));
                            Unit unit3 = Unit.INSTANCE;
                            builder2.pop(iPushStyle2);
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1758466375);
                            if (notionalBasedData.getBuyingPowerDisplayTrailing() != null) {
                                iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme2.getColors(composer2, i9).m21426getFg20d7_KjU(), bentoTheme2.getTypography(composer2, i9).getTextM().m7662getFontSizeXSAIIZE(), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65528, (DefaultConstructorMarker) null));
                                try {
                                    builder2.append(EventOrderFormScreen3.getText(notionalBasedData.getBuyingPowerDisplayTrailing(), composer2, i10));
                                } finally {
                                }
                            }
                            composer2.endReplaceGroup();
                            AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                            composer2.endReplaceGroup();
                            BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, null, composer2, 0, 0, 16318);
                            composer2.startReplaceGroup(1758491253);
                            if (notionalBasedData.getBuyingPowerDisplayTrailing() == null) {
                                BentoText2.m20747BentoText38GnDrw("      ", ModifiersKt.bentoPlaceholder$default(companion5, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 6, 0, 16380);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } finally {
                        }
                    }
                }, composerStartRestartGroup, i4), composerStartRestartGroup, 1572870 | (i3 & 112), 30);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventOrderFormDollarInputContent.EventOrderFormDollarInputContent$lambda$17(data, z, uuid, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            if (!EventOrderFormDollarInputContent$lambda$1(snapshotState)) {
                EventOrderFormDollarInputContent$lambda$2(snapshotState, true);
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1636057012);
            if (uuid != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion22.getCenterHorizontally();
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, C2002Dp.m7995constructorimpl(150)), composerStartRestartGroup, 6);
                String dollarInput2 = data.getDollarInput();
                boolean zEventOrderFormDollarInputContent$lambda$12 = EventOrderFormDollarInputContent$lambda$1(snapshotState);
                boolean zEventOrderFormDollarInputContent$lambda$62 = EventOrderFormDollarInputContent$lambda$6(snapshotState32);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                TickerInputComposable3.m19249TickerInputComposableuSRqIlo(dollarInput2, null, zEventOrderFormDollarInputContent$lambda$12, false, 0.0f, 0, zEventOrderFormDollarInputContent$lambda$62, (Function0) objRememberedValue4, composerStartRestartGroup, 12582912, 58);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getCenter(), companion22.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    if (z) {
                    }
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(Column5.weight$default(column62, SizeKt.m5156height3ABfNKs(companion42, C2002Dp.m7995constructorimpl(0)), 2.0f, false, 2, null), composerStartRestartGroup, 0);
                    Modifier modifier52 = modifier4;
                    AnimatedVisibilityKt.AnimatedVisibility(column62, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(1451554597, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContentKt$EventOrderFormDollarInputContent$2$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i8) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1451554597, i8, -1, "com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContent.<anonymous>.<anonymous> (EventOrderFormDollarInputContent.kt:124)");
                            }
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default22 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion5, 0.0f, bentoTheme22.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            EventOrderFormViewState.OrderFormContentData.NotionalBasedData notionalBasedData = data;
                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(center, centerVertically, composer2, 54);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default22);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor32 = companion6.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor32);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion6.getSetModifier());
                            Row6 row622 = Row6.INSTANCE;
                            composer2.startReplaceGroup(1758454055);
                            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                            composer2.startReplaceGroup(1758454830);
                            int iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme22.getColors(composer2, i9).m21426getFg20d7_KjU(), bentoTheme22.getTypography(composer2, i9).getTextM().m7662getFontSizeXSAIIZE(), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65532, (DefaultConstructorMarker) null));
                            try {
                                StringResource buyingPowerDisplayLeading = notionalBasedData.getBuyingPowerDisplayLeading();
                                int i10 = StringResource.$stable;
                                builder2.append(EventOrderFormScreen3.getText(buyingPowerDisplayLeading, composer2, i10));
                                Unit unit3 = Unit.INSTANCE;
                                builder2.pop(iPushStyle2);
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1758466375);
                                if (notionalBasedData.getBuyingPowerDisplayTrailing() != null) {
                                    iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme22.getColors(composer2, i9).m21426getFg20d7_KjU(), bentoTheme22.getTypography(composer2, i9).getTextM().m7662getFontSizeXSAIIZE(), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65528, (DefaultConstructorMarker) null));
                                    try {
                                        builder2.append(EventOrderFormScreen3.getText(notionalBasedData.getBuyingPowerDisplayTrailing(), composer2, i10));
                                    } finally {
                                    }
                                }
                                composer2.endReplaceGroup();
                                AnnotatedString annotatedString2 = builder2.toAnnotatedString();
                                composer2.endReplaceGroup();
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, null, null, composer2, 0, 0, 16318);
                                composer2.startReplaceGroup(1758491253);
                                if (notionalBasedData.getBuyingPowerDisplayTrailing() == null) {
                                    BentoText2.m20747BentoText38GnDrw("      ", ModifiersKt.bentoPlaceholder$default(companion5, true, null, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 6, 0, 16380);
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } finally {
                            }
                        }
                    }, composerStartRestartGroup, i4), composerStartRestartGroup, 1572870 | (i3 & 112), 30);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void EventOrderFormDollarInputContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventOrderFormDollarInputContent$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventOrderFormDollarInputContent$lambda$16$lambda$10$lambda$9(SnapshotState snapshotState) {
        EventOrderFormDollarInputContent$lambda$7(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final boolean EventOrderFormDollarInputContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String EventOrderFormDollarInputContent$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean EventOrderFormDollarInputContent$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final void EditingSubText(EventOrderFormViewState.OrderFormContentData.EditingSubTextState editingSubTextState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final EventOrderFormViewState.OrderFormContentData.EditingSubTextState editingSubTextState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1183551873);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(editingSubTextState) : composerStartRestartGroup.changedInstance(editingSubTextState) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(1183551873, i3, -1, "com.robinhood.android.event.trade.orderform.EditingSubText (EventOrderFormDollarInputContent.kt:171)");
            }
            editingSubTextState2 = editingSubTextState;
            AnimatedContentKt.AnimatedContent(editingSubTextState2, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1071397208, true, new Function4<AnimatedContentScope, EventOrderFormViewState.OrderFormContentData.EditingSubTextState, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContentKt.EditingSubText.1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, EventOrderFormViewState.OrderFormContentData.EditingSubTextState editingSubTextState3, Composer composer2, Integer num) {
                    invoke(animatedContentScope, editingSubTextState3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, EventOrderFormViewState.OrderFormContentData.EditingSubTextState animatedState, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(animatedState, "animatedState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1071397208, i5, -1, "com.robinhood.android.event.trade.orderform.EditingSubText.<anonymous> (EventOrderFormDollarInputContent.kt:175)");
                    }
                    Modifier modifier2 = modifier;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifier2);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String text = EventOrderFormScreen3.getText(animatedState.getMessage(), composer2, StringResource.$stable);
                    if (animatedState instanceof EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Loaded) {
                        composer2.startReplaceGroup(-1007554134);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8186);
                        composer2.endReplaceGroup();
                    } else if (animatedState instanceof EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Loading) {
                        composer2.startReplaceGroup(-1007267446);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 11, null), BentoProgressIndicator3.f5151S, bentoTheme2.getColors(composer2, i7).m21426getFg20d7_KjU(), composer2, 48, 0);
                        BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8186);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(animatedState instanceof EventOrderFormViewState.OrderFormContentData.EditingSubTextState.Error)) {
                            composer2.startReplaceGroup(-1833618431);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1006714747);
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(text, null, Color.m6701boximpl(bentoTheme3.getColors(composer2, i8).m21452getNegative0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8186);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            editingSubTextState2 = editingSubTextState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.trade.orderform.EventOrderFormDollarInputContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventOrderFormDollarInputContent.EditingSubText$lambda$18(editingSubTextState2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
