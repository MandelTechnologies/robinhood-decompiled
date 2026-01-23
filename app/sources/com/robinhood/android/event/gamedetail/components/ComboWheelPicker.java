package com.robinhood.android.event.gamedetail.components;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
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
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.input.pointer.util.VelocityTracker;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.TextStyle2;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.Velocity;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ComboWheelPicker.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0002\u001a-\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u0015*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\bH\u0003¢\u0006\u0002\u0010!\u001a\u001f\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0003H\u0003¢\u0006\u0002\u0010&\u001a\r\u0010'\u001a\u00020\u0015H\u0003¢\u0006\u0002\u0010(\u001a\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*H\u0002\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0013\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010\"\u000e\u0010\"\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"rememberComboWheelPickerState", "Lcom/robinhood/android/event/gamedetail/components/ComboWheelPickerState;", "key", "", "initialIndex", "", "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;II)Lcom/robinhood/android/event/gamedetail/components/ComboWheelPickerState;", "ItemHeight", "", "SecondItemCompressionFactor", "ThirdItemCompressionFactor", "calculateVisualOffset", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "scrollOffset", "ContainerHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SelectionChipShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "SelectionChipHeight", "ComboWheelPicker", "", "items", "Lkotlinx/collections/immutable/ImmutableList;", "state", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/event/gamedetail/components/ComboWheelPickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ComboWheelPickerItem", "Landroidx/compose/foundation/layout/BoxScope;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "(Landroidx/compose/foundation/layout/BoxScope;Ljava/lang/String;IFLandroidx/compose/runtime/Composer;I)V", "StrikeLoadingPlaceholder", "ComboWheelPickerItemText", "distanceFromCenter", "text", "(FLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ComboWheelPickerPreview", "(Landroidx/compose/runtime/Composer;I)V", "createComboPreviewElements", "Lkotlinx/collections/immutable/PersistentList;", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ComboWheelPicker {
    private static final float ItemHeight = 110.0f;
    private static final float SecondItemCompressionFactor = 0.55f;
    private static final String StrikeLoadingPlaceholder = "    ";
    private static final float ThirdItemCompressionFactor = 0.4f;
    private static final float ContainerHeight = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
    private static final RoundedCornerShape SelectionChipShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(66));
    private static final float SelectionChipHeight = C2002Dp.m7995constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboWheelPicker$lambda$14(ImmutableList immutableList, ComboWheelPicker7 comboWheelPicker7, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ComboWheelPicker(immutableList, comboWheelPicker7, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboWheelPicker$lambda$2(ImmutableList immutableList, ComboWheelPicker7 comboWheelPicker7, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ComboWheelPicker(immutableList, comboWheelPicker7, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboWheelPickerItem$lambda$20(BoxScope boxScope, String str, int i, float f, int i2, Composer composer, int i3) {
        ComboWheelPickerItem(boxScope, str, i, f, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboWheelPickerItemText$lambda$21(float f, String str, int i, Composer composer, int i2) {
        ComboWheelPickerItemText(f, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboWheelPickerPreview$lambda$22(int i, Composer composer, int i2) {
        ComboWheelPickerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingContent$lambda$16(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingContent(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final ComboWheelPicker7 rememberComboWheelPickerState(String key, final int i, Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(key, "key");
        composer.startReplaceGroup(1476142851);
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1476142851, i2, -1, "com.robinhood.android.event.gamedetail.components.rememberComboWheelPickerState (ComboWheelPicker.kt:92)");
        }
        Object[] objArr = {Integer.valueOf(i)};
        Saver<ComboWheelPicker7, Integer> saver = ComboWheelPicker7.INSTANCE.getSaver();
        composer.startReplaceGroup(5004770);
        boolean z = (((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComboWheelPicker.rememberComboWheelPickerState$lambda$1$lambda$0(i);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ComboWheelPicker7 comboWheelPicker7 = (ComboWheelPicker7) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, key, (Function0) objRememberedValue, composer, (i2 << 6) & 896, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return comboWheelPicker7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComboWheelPicker7 rememberComboWheelPickerState$lambda$1$lambda$0(int i) {
        return new ComboWheelPicker7(i);
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

    /* JADX WARN: Removed duplicated region for block: B:152:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ComboWheelPicker(final ImmutableList<String> items, final ComboWheelPicker7 state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final ComboWheelPicker7 comboWheelPicker7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-191015748);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(items) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-191015748, i3, -1, "com.robinhood.android.event.gamedetail.components.ComboWheelPicker (ComboWheelPicker.kt:145)");
                }
                composerStartRestartGroup.startReplaceGroup(1117464592);
                if (!items.isEmpty()) {
                    LoadingContent(modifier4, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier5 = modifier4;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ComboWheelPicker.ComboWheelPicker$lambda$2(items, state, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier6 = modifier4;
                comboWheelPicker7 = state;
                composerStartRestartGroup.endReplaceGroup();
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ComboWheelPicker.ComboWheelPicker$lambda$4$lambda$3(comboWheelPicker7, items);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Integer numValueOf = Integer.valueOf(items.size());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i5 = i3 & 112;
                int i6 = i3 & 14;
                boolean z = (i5 == 32) | (i6 == 4);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new ComboWheelPicker2(comboWheelPicker7, items, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = (i5 == 32) | (i6 == 4) | composerStartRestartGroup.changedInstance(hapticFeedback);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ComboWheelPicker3(comboWheelPicker7, items, hapticFeedback, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(comboWheelPicker7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, (i3 >> 3) & 14);
                Integer numValueOf2 = Integer.valueOf(items.size());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z2 = (i5 == 32) | (i6 == 4);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new ComboWheelPicker4(comboWheelPicker7, items, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(numValueOf2, comboWheelPicker7, (Function2) objRememberedValue5, composerStartRestartGroup, i5);
                Modifier modifierClipToBounds = Clip.clipToBounds(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null), ContainerHeight));
                Integer numValueOf3 = Integer.valueOf(items.size());
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = (i5 == 32) | composerStartRestartGroup.changedInstance(coroutineScope) | (i6 == 4);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new PointerInputEventHandler() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1
                        @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new C163081(comboWheelPicker7, new VelocityTracker(), coroutineScope, items, null), continuation);
                            return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                        }

                        /* compiled from: ComboWheelPicker.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1", m3645f = "ComboWheelPicker.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m3647m = "invokeSuspend")
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1 */
                        static final class C163081 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ CoroutineScope $coroutineScope;
                            final /* synthetic */ ImmutableList<String> $items;
                            final /* synthetic */ ComboWheelPicker7 $state;
                            final /* synthetic */ VelocityTracker $velocityTracker;
                            private /* synthetic */ Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C163081(ComboWheelPicker7 comboWheelPicker7, VelocityTracker velocityTracker, CoroutineScope coroutineScope, ImmutableList<String> immutableList, Continuation<? super C163081> continuation) {
                                super(2, continuation);
                                this.$state = comboWheelPicker7;
                                this.$velocityTracker = velocityTracker;
                                this.$coroutineScope = coroutineScope;
                                this.$items = immutableList;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C163081 c163081 = new C163081(this.$state, this.$velocityTracker, this.$coroutineScope, this.$items, continuation);
                                c163081.L$0 = obj;
                                return c163081;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((C163081) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
                            
                                if (androidx.compose.foundation.gestures.DragGestureDetectorKt.m4979dragjO51t88(r1, r3, r9, r10) == r0) goto L16;
                             */
                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                C163081 c163081;
                                AwaitPointerEventScope awaitPointerEventScope;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                                    this.L$0 = awaitPointerEventScope2;
                                    this.label = 1;
                                    c163081 = this;
                                    obj = TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, null, c163081, 3, null);
                                    if (obj != coroutine_suspended) {
                                        awaitPointerEventScope = awaitPointerEventScope2;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    c163081 = this;
                                    c163081.$state.setVelocity$feature_game_detail_externalDebug(Velocity.m8102getYimpl(c163081.$velocityTracker.m7217calculateVelocity9UxMQ8M()));
                                    c163081.$state.setDragging$feature_game_detail_externalDebug(false);
                                    return Unit.INSTANCE;
                                }
                                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                c163081 = this;
                                c163081.$state.setDragging$feature_game_detail_externalDebug(true);
                                c163081.$velocityTracker.resetTracking();
                                long id = ((PointerInputChange) obj).getId();
                                final VelocityTracker velocityTracker = c163081.$velocityTracker;
                                final ComboWheelPicker7 comboWheelPicker7 = c163081.$state;
                                final CoroutineScope coroutineScope = c163081.$coroutineScope;
                                final ImmutableList<String> immutableList = c163081.$items;
                                Function1 function1 = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0057: CONSTRUCTOR (r9v1 'function1' kotlin.jvm.functions.Function1) = 
                                      (r11v5 'velocityTracker' androidx.compose.ui.input.pointer.util.VelocityTracker A[DONT_INLINE])
                                      (r5v1 'comboWheelPicker7' com.robinhood.android.event.gamedetail.components.ComboWheelPickerState A[DONT_INLINE])
                                      (r6v1 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                                      (r8v1 'immutableList' kotlinx.collections.immutable.ImmutableList<java.lang.String> A[DONT_INLINE])
                                     A[DECLARE_VAR, MD:(androidx.compose.ui.input.pointer.util.VelocityTracker, com.robinhood.android.event.gamedetail.components.ComboWheelPickerState, kotlinx.coroutines.CoroutineScope, kotlinx.collections.immutable.ImmutableList):void (m)] call: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.ui.input.pointer.util.VelocityTracker, com.robinhood.android.event.gamedetail.components.ComboWheelPickerState, kotlinx.coroutines.CoroutineScope, kotlinx.collections.immutable.ImmutableList):void type: CONSTRUCTOR in method: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 15 more
                                    */
                                /*
                                    this = this;
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r1 = r10.label
                                    r2 = 2
                                    r3 = 1
                                    if (r1 == 0) goto L24
                                    if (r1 == r3) goto L1b
                                    if (r1 != r2) goto L13
                                    kotlin.ResultKt.throwOnFailure(r11)
                                    r7 = r10
                                    goto L66
                                L13:
                                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r11.<init>(r0)
                                    throw r11
                                L1b:
                                    java.lang.Object r1 = r10.L$0
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r1
                                    kotlin.ResultKt.throwOnFailure(r11)
                                    r7 = r10
                                    goto L3d
                                L24:
                                    kotlin.ResultKt.throwOnFailure(r11)
                                    java.lang.Object r11 = r10.L$0
                                    r4 = r11
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p011ui.input.pointer.AwaitPointerEventScope) r4
                                    r10.L$0 = r4
                                    r10.label = r3
                                    r5 = 0
                                    r6 = 0
                                    r8 = 3
                                    r9 = 0
                                    r7 = r10
                                    java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetector4.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                                    if (r11 != r0) goto L3c
                                    goto L65
                                L3c:
                                    r1 = r4
                                L3d:
                                    androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p011ui.input.pointer.PointerInputChange) r11
                                    com.robinhood.android.event.gamedetail.components.ComboWheelPickerState r4 = r7.$state
                                    r4.setDragging$feature_game_detail_externalDebug(r3)
                                    androidx.compose.ui.input.pointer.util.VelocityTracker r3 = r7.$velocityTracker
                                    r3.resetTracking()
                                    long r3 = r11.getId()
                                    androidx.compose.ui.input.pointer.util.VelocityTracker r11 = r7.$velocityTracker
                                    com.robinhood.android.event.gamedetail.components.ComboWheelPickerState r5 = r7.$state
                                    kotlinx.coroutines.CoroutineScope r6 = r7.$coroutineScope
                                    kotlinx.collections.immutable.ImmutableList<java.lang.String> r8 = r7.$items
                                    com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1$$ExternalSyntheticLambda0 r9 = new com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$ComboWheelPicker$5$1$1$$ExternalSyntheticLambda0
                                    r9.<init>(r11, r5, r6, r8)
                                    r11 = 0
                                    r7.L$0 = r11
                                    r7.label = r2
                                    java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m4979dragjO51t88(r1, r3, r9, r10)
                                    if (r11 != r0) goto L66
                                L65:
                                    return r0
                                L66:
                                    androidx.compose.ui.input.pointer.util.VelocityTracker r11 = r7.$velocityTracker
                                    long r0 = r11.m7217calculateVelocity9UxMQ8M()
                                    com.robinhood.android.event.gamedetail.components.ComboWheelPickerState r11 = r7.$state
                                    float r0 = androidx.compose.p011ui.unit.Velocity.m8102getYimpl(r0)
                                    r11.setVelocity$feature_game_detail_externalDebug(r0)
                                    com.robinhood.android.event.gamedetail.components.ComboWheelPickerState r11 = r7.$state
                                    r0 = 0
                                    r11.setDragging$feature_game_detail_externalDebug(r0)
                                    kotlin.Unit r11 = kotlin.Unit.INSTANCE
                                    return r11
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.event.gamedetail.components.ComboWheelPicker5.C163081.invokeSuspend(java.lang.Object):java.lang.Object");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invokeSuspend$lambda$0(VelocityTracker velocityTracker, ComboWheelPicker7 comboWheelPicker7, CoroutineScope coroutineScope, ImmutableList immutableList, PointerInputChange pointerInputChange) {
                                velocityTracker.m7216addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition());
                                long jPositionChange = PointerEventKt.positionChange(pointerInputChange);
                                comboWheelPicker7.setDragOffset$feature_game_detail_externalDebug(comboWheelPicker7.getDragOffset$feature_game_detail_externalDebug() + Float.intBitsToFloat((int) (4294967295L & jPositionChange)));
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ComboWheelPicker6(comboWheelPicker7, jPositionChange, immutableList, null), 3, null);
                                pointerInputChange.consume();
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierClipToBounds, numValueOf3, (PointerInputEventHandler) objRememberedValue6);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierPointerInput);
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
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierClip = Clip.clip(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth(companion4, 0.42f), SelectionChipHeight), SelectionChipShape);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composerStartRestartGroup, i7).m21372getBg20d7_KjU(), null, 2, null), composerStartRestartGroup, 0);
                Brush.Companion companion5 = Brush.INSTANCE;
                Color colorM6701boximpl = Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU());
                Color.Companion companion6 = Color.INSTANCE;
                final Brush brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(companion5, CollectionsKt.listOf((Object[]) new Color[]{colorM6701boximpl, Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU()), Color.m6701boximpl(companion6.m6725getTransparent0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null);
                Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion4);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(brushM6682verticalGradient8A3gB4$default);
                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ComboWheelPicker.ComboWheelPicker$lambda$13$lambda$10$lambda$9(brushM6682verticalGradient8A3gB4$default, (ContentDrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(modifierMatchParentSize, (Function1) objRememberedValue7);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierDrawWithContent);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(564514304);
                Iterator it = ((Iterable) snapshotState4.getValue()).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    ComboWheelPickerItem(boxScopeInstance, items.get(iIntValue), iIntValue, comboWheelPicker7.getScrollOffset$feature_game_detail_externalDebug().getValue().floatValue(), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                comboWheelPicker7 = state;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final ComboWheelPicker7 comboWheelPicker72 = comboWheelPicker7;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ComboWheelPicker.ComboWheelPicker$lambda$14(items, comboWheelPicker72, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1117464592);
            if (!items.isEmpty()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PrimitiveRanges2 ComboWheelPicker$lambda$4$lambda$3(ComboWheelPicker7 comboWheelPicker7, ImmutableList immutableList) {
        int iRoundToInt = MathKt.roundToInt(comboWheelPicker7.getScrollOffset$feature_game_detail_externalDebug().getValue().floatValue() / ItemHeight);
        return new PrimitiveRanges2(RangesKt.coerceAtLeast(iRoundToInt - 3, 0), RangesKt.coerceAtMost(iRoundToInt + 3, CollectionsKt.getLastIndex(immutableList)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComboWheelPicker$lambda$13$lambda$10$lambda$9(Brush brush, ContentDrawScope drawWithContent) {
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        drawWithContent.drawContent();
        DrawScope.m6957drawRectAsUm42w$default(drawWithContent, brush, 0L, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        return Unit.INSTANCE;
    }

    private static final void LoadingContent(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2130898840);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2130898840, i3, -1, "com.robinhood.android.event.gamedetail.components.LoadingContent (ComboWheelPicker.kt:282)");
            }
            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), ContainerHeight);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5156height3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComboWheelPickerItem(boxScopeInstance, null, 0, 0.0f, composerStartRestartGroup, 3510);
            ComboWheelPickerItem(boxScopeInstance, null, 1, 0.0f, composerStartRestartGroup, 3510);
            ComboWheelPickerItem(boxScopeInstance, null, 2, 0.0f, composerStartRestartGroup, 3510);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboWheelPicker.LoadingContent$lambda$16(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ComboWheelPickerItem(final BoxScope boxScope, final String str, final int i, final float f, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1671736011);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
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
                ComposerKt.traceEventStart(1671736011, i3, -1, "com.robinhood.android.event.gamedetail.components.ComboWheelPickerItem (ComboWheelPicker.kt:311)");
            }
            final float fCalculateVisualOffset = calculateVisualOffset(i, f);
            float fAbs = Math.abs((i * ItemHeight) - f);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(companion, companion2.getCenter());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(fCalculateVisualOffset);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComboWheelPicker.ComboWheelPickerItem$lambda$18$lambda$17(fCalculateVisualOffset, (Density) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ComboWheelPickerItemText(fAbs, str, composerStartRestartGroup, i3 & 112);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboWheelPicker.ComboWheelPickerItem$lambda$20(boxScope, str, i, f, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ComboWheelPickerItem$lambda$18$lambda$17(float f, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(f) & 4294967295L) | (0 << 32)));
    }

    private static final void ComboWheelPickerItemText(final float f, final String str, Composer composer, final int i) {
        int i2;
        final long jM21427getFg30d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(2064886340);
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
                ComposerKt.traceEventStart(2064886340, i2, -1, "com.robinhood.android.event.gamedetail.components.ComboWheelPickerItemText (ComboWheelPicker.kt:333)");
            }
            final String str2 = str == null ? StrikeLoadingPlaceholder : str;
            boolean z = str == null;
            float fCoerceIn = RangesKt.coerceIn(f / 220.0f, 0.0f, 1.0f);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final TextStyle textStyleLerp = TextStyle2.lerp(bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleLarge(), bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), fCoerceIn);
            if (f < 55.0f) {
                composerStartRestartGroup.startReplaceGroup(80899270);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(80900103);
                jM21427getFg30d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21427getFg30d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(-1855619116, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt.ComboWheelPickerItemText.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1855619116, i4, -1, "com.robinhood.android.event.gamedetail.components.ComboWheelPickerItemText.<anonymous> (ComboWheelPicker.kt:344)");
                    }
                    int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    BentoText2.m20747BentoText38GnDrw(str2, Modifier.INSTANCE, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textStyleLerp, composer2, 48, 0, 8120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboWheelPicker.ComboWheelPickerItemText$lambda$21(f, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ComboWheelPickerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(461644269);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(461644269, i, -1, "com.robinhood.android.event.gamedetail.components.ComboWheelPickerPreview (ComboWheelPicker.kt:356)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComboWheelPicker8.INSTANCE.getLambda$1595655989$feature_game_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.ComboWheelPickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComboWheelPicker.ComboWheelPickerPreview$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImmutableList3<String> createComboPreviewElements() {
        return extensions2.persistentListOf("-6.5", "-5.5", "-4.5", "-3.5", "-2.5", "-1.5", "-0.5", "+0.5", "+1.5", "+2.5");
    }
}
