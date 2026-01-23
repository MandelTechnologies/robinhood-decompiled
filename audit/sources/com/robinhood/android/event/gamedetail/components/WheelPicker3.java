package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.models.event.ContractSide;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WheelPicker.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001aB\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000f0\u0015H\u0007¢\u0006\u0002\u0010\u0018\u001a)\u0010\u0019\u001a\u00020\u000f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0002\u0010#\u001a\r\u0010$\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010%\u001a\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0'H\u0000\u001a\u0018\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n\"\u000e\u0010\u001e\u001a\u00020\u001fX\u0082T¢\u0006\u0002\n\u0000¨\u0006,²\u0006%\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u000f0\u0015X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"ItemHeight", "", "SecondItemCompressionFactor", "ThirdItemCompressionFactor", "calculateVisualOffset", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "scrollOffset", "ContainerHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SelectionChipShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "SelectionChipHeight", "WheelPicker", "", "state", "Lcom/robinhood/android/event/gamedetail/components/WheelPickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "onItemSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lcom/robinhood/android/event/gamedetail/components/WheelPickerState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "WheelPickerItem", "Landroidx/compose/foundation/layout/BoxScope;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;IFLandroidx/compose/runtime/Composer;I)V", "StrikeLoadingPlaceholder", "", "WheelPickerItemText", "distanceFromCenter", "text", "(FLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "WheelPickerPreview", "(Landroidx/compose/runtime/Composer;I)V", "createPreviewContractElements", "Lkotlinx/collections/immutable/PersistentList;", "createContractElement", "contractId", "Ljava/util/UUID;", "contractDisplayText", "feature-game-detail_externalDebug", "currentOnItemSelected", "isDragging", "", "dragOffset"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.WheelPickerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class WheelPicker3 {
    private static final float ItemHeight = 110.0f;
    private static final float SecondItemCompressionFactor = 0.55f;
    private static final String StrikeLoadingPlaceholder = "----";
    private static final float ThirdItemCompressionFactor = 0.4f;
    private static final float ContainerHeight = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
    private static final RoundedCornerShape SelectionChipShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(66));
    private static final float SelectionChipHeight = C2002Dp.m7995constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelPicker$lambda$12(WheelPickerState wheelPickerState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        WheelPicker(wheelPickerState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelPickerItem$lambda$16(BoxScope boxScope, ContractElement contractElement, int i, float f, int i2, Composer composer, int i3) {
        WheelPickerItem(boxScope, contractElement, i, f, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelPickerItemText$lambda$17(float f, String str, int i, Composer composer, int i2) {
        WheelPickerItemText(f, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WheelPickerPreview$lambda$18(int i, Composer composer, int i2) {
        WheelPickerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final float calculateVisualOffset(int i, float f) {
        float f2 = (i * ItemHeight) - f;
        float fAbs = Math.abs(f2 / ItemHeight);
        if (fAbs <= 1.0f) {
            return f2;
        }
        if (fAbs <= 2.0f) {
            float fSignum = Math.signum(f2) * ItemHeight;
            return fSignum + ((f2 - fSignum) * SecondItemCompressionFactor);
        }
        float fSignum2 = Math.signum(f2);
        return (170.5f * fSignum2) + ((f2 - (fSignum2 * 220.0f)) * 0.4f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Integer, Unit> WheelPicker$lambda$0(SnapshotState4<? extends Function1<? super Integer, Unit>> snapshotState4) {
        return (Function1) snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WheelPicker$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WheelPicker(final WheelPickerState state, Modifier modifier, final Function1<? super Integer, Unit> onItemSelected, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SnapshotState4 snapshotState4RememberUpdatedState;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue2;
        Animatable animatable;
        Object objRememberedValue3;
        SnapshotState snapshotState;
        Object objRememberedValue4;
        SnapshotFloatState2 snapshotFloatState2;
        int i4;
        boolean zChangedInstance;
        Object objRememberedValue5;
        Animatable animatable2;
        int i5;
        Unit unit;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        Unit unit2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onItemSelected, "onItemSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(984367115);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onItemSelected) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(984367115, i3, -1, "com.robinhood.android.event.gamedetail.components.WheelPicker (WheelPicker.kt:90)");
                }
                snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onItemSelected, composerStartRestartGroup, (i3 >> 6) & 14);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = Animatable2.Animatable$default(state.getSelectedIndex() * ItemHeight, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                animatable = (Animatable) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(WheelPicker$lambda$3(snapshotState));
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                i4 = i3 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | (i4 != 4) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    animatable2 = animatable;
                    i5 = i4;
                    objRememberedValue5 = new WheelPicker4(animatable2, state, snapshotState, snapshotState4RememberUpdatedState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    i5 = i4;
                    animatable2 = animatable;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ContainerHeight);
                unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable2) | (i5 == 4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    Animatable animatable3 = animatable2;
                    unit2 = unit;
                    WheelPicker5 wheelPicker5 = new WheelPicker5(snapshotState, coroutineScope, snapshotFloatState2, animatable3, state);
                    animatable2 = animatable3;
                    composerStartRestartGroup.updateRememberedValue(wheelPicker5);
                    objRememberedValue6 = wheelPicker5;
                } else {
                    unit2 = unit;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierM5156height3ABfNKs, unit2, (PointerInputEventHandler) objRememberedValue6);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
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
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.42f), SelectionChipHeight), SelectionChipShape), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-528718072);
                int i7 = 0;
                for (ContractElement contractElement : state.getItems()) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    WheelPickerItem(boxScopeInstance, contractElement, i7, ((Number) animatable2.getValue()).floatValue(), composerStartRestartGroup, 6);
                    i7 = i8;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WheelPicker3.WheelPicker$lambda$12(state, modifier3, onItemSelected, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onItemSelected, composerStartRestartGroup, (i3 >> 6) & 14);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            animatable = (Animatable) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf2 = Boolean.valueOf(WheelPicker$lambda$3(snapshotState));
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            i4 = i3 & 14;
            zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | (i4 != 4) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                animatable2 = animatable;
                i5 = i4;
                objRememberedValue5 = new WheelPicker4(animatable2, state, snapshotState, snapshotState4RememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
                Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ContainerHeight);
                unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable2) | (i5 == 4);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    Animatable animatable32 = animatable2;
                    unit2 = unit;
                    WheelPicker5 wheelPicker52 = new WheelPicker5(snapshotState, coroutineScope, snapshotFloatState2, animatable32, state);
                    animatable2 = animatable32;
                    composerStartRestartGroup.updateRememberedValue(wheelPicker52);
                    objRememberedValue6 = wheelPicker52;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierM5156height3ABfNKs2, unit2, (PointerInputEventHandler) objRememberedValue6);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
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
                        BoxKt.Box(Background3.m4872backgroundbw27NRU$default(Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.42f), SelectionChipHeight), SelectionChipShape), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(-528718072);
                        int i72 = 0;
                        while (r0.hasNext()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WheelPicker$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void WheelPickerItem(final BoxScope boxScope, final ContractElement contractElement, final int i, final float f, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1793596684);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(contractElement) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1793596684, i3, -1, "com.robinhood.android.event.gamedetail.components.WheelPickerItem (WheelPicker.kt:159)");
            }
            final float fCalculateVisualOffset = calculateVisualOffset(i, f);
            float fAbs = Math.abs((i * ItemHeight) - f);
            float f2 = fAbs < ItemHeight ? 1.0f : fAbs < 220.0f ? 0.6f : fAbs < 330.0f ? 0.4f : 0.0f;
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(companion, companion2.getCenter());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(fCalculateVisualOffset);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WheelPicker3.WheelPickerItem$lambda$14$lambda$13(fCalculateVisualOffset, (Density) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAlpha = Alpha.alpha(SizeKt.fillMaxWidth$default(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue), 0.0f, 1, null), f2);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlpha);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            WheelPickerItemText(fAbs, contractElement.getContractDisplayText(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WheelPicker3.WheelPickerItem$lambda$16(boxScope, contractElement, i, f, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset WheelPickerItem$lambda$14$lambda$13(float f, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(f) & 4294967295L) | (0 << 32)));
    }

    private static final void WheelPickerItemText(final float f, final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-951154536);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-951154536, i2, -1, "com.robinhood.android.event.gamedetail.components.WheelPickerItemText (WheelPicker.kt:190)");
            }
            boolean z = f < 55.0f;
            boolean z2 = f < 165.0f;
            String str2 = str == null ? StrikeLoadingPlaceholder : str;
            boolean z3 = str == null;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1945108321);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                TextStyle displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(str2, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, z3, null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8120);
                composer2.endReplaceGroup();
            } else {
                String str3 = str2;
                if (z2) {
                    composerStartRestartGroup.startReplaceGroup(-1944754115);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, z3, null, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composer2, 0, 0, 8120);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1944404900);
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    TextStyle textS = bentoTheme3.getTypography(composerStartRestartGroup, i5).getTextS();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(str3, ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, z3, null, 2, null), Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU()), null, FontWeight.INSTANCE.getMedium(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8104);
                    composer2.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WheelPicker3.WheelPickerItemText$lambda$17(f, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void WheelPickerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1554970773);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554970773, i, -1, "com.robinhood.android.event.gamedetail.components.WheelPickerPreview (WheelPicker.kt:233)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, WheelPicker.INSTANCE.m14196getLambda$588175693$feature_game_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.WheelPickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WheelPicker3.WheelPickerPreview$lambda$18(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final ImmutableList3<ContractElement> createPreviewContractElements() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNull(uuidRandomUUID);
        return extensions2.persistentListOf(createContractElement(uuidRandomUUID, "-6.5"), createContractElement(uuidRandomUUID, "-5.5"), createContractElement(uuidRandomUUID, "-4.5"), createContractElement(uuidRandomUUID, "-3.5"), createContractElement(uuidRandomUUID, "-2.5"), createContractElement(uuidRandomUUID, "-1.5"), createContractElement(uuidRandomUUID, "-0.5"), createContractElement(uuidRandomUUID, "+0.5"), createContractElement(uuidRandomUUID, "+1.5"), createContractElement(uuidRandomUUID, "+2.5"));
    }

    private static final ContractElement createContractElement(UUID uuid, String str) {
        return new ContractElement(uuid, str, ContractSide.CONTRACT_SIDE_YES, false);
    }
}
