package com.truelayer.payments.p419ui.components;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntOffset2;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.truelayer.payments.p419ui.components.FastScrollKt;
import com.truelayer.payments.p419ui.utils.Converters3;
import com.truelayer.payments.p419ui.utils.TestTags;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FastScroll.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aG\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0001¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000e\u001a\u00020\n2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aB\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a6\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0 2M\u0010(\u001aI\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010%¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0\"H\u0002¢\u0006\u0004\b)\u0010*\u001a.\u00100\u001a\u00020%*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0013H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a/\u00102\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u00101\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b2\u00103\"\u0014\u00104\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006;²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00106\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010'\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00108\u001a\u00020+8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010:\u001a\b\u0012\u0004\u0012\u00020%0\u00048\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "", "", "indexedItems", "Landroidx/compose/foundation/lazy/LazyListState;", "listState", "Lkotlin/Function0;", "", "scrollableListContent", "FastScrollingContainer", "(Landroidx/compose/ui/Modifier;ZLjava/util/List;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FastScroll", "(Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;II)V", "visible", "Landroidx/compose/ui/unit/Dp;", "offsetX", "", "offsetY", "scrollIndicatorHeight", "labelChar", "SectionIndicator-EUb7tLY", "(ZFFFCLandroidx/compose/runtime/Composer;II)V", "SectionIndicator", "width", "height", "VerticalScrollIndicator-jTDHpeQ", "(FFFFLandroidx/compose/runtime/Composer;II)V", "VerticalScrollIndicator", "scrollState", "Lkotlin/Function1;", "onScrollIndicatorHeight", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "", "positionAsListIndex", "isDragging", "onOffsetY", "fastScrollPositionProvider", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/IntSize;", "elementSize", "scrollbarHeight", "offsetToIndex-mL-hObY", "(Landroidx/compose/foundation/lazy/LazyListState;FJF)I", "offsetToIndex", "offsetIndex", "VibrateOnIndex", "(Ljava/util/List;IZLandroidx/compose/runtime/Composer;I)V", "minInteractionAreaWidth", "F", "showIndexIndicator", "animatedOffsetY", "selfSize", "visibleItemsSize", "distinctIndex", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class FastScrollKt {
    private static final float minInteractionAreaWidth = C2002Dp.m7995constructorimpl(35);

    public static final void FastScrollingContainer(Modifier modifier, final boolean z, final List<Character> indexedItems, final LazyListState listState, final Function2<? super Composer, ? super Integer, Unit> scrollableListContent, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(indexedItems, "indexedItems");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Intrinsics.checkNotNullParameter(scrollableListContent, "scrollableListContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1011184638);
        if ((i2 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1011184638, i, -1, "com.truelayer.payments.ui.components.FastScrollingContainer (FastScroll.kt:69)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
        Alignment topEnd = Alignment.INSTANCE.getTopEnd();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        scrollableListContent.invoke(composerStartRestartGroup, Integer.valueOf((i >> 12) & 14));
        composerStartRestartGroup.startReplaceableGroup(-2044045619);
        if (z) {
            FastScroll(indexedItems, listState, composerStartRestartGroup, ((i >> 6) & 112) | 8, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier2 = modifier;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt.FastScrollingContainer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    FastScrollKt.FastScrollingContainer(modifier2, z, indexedItems, listState, scrollableListContent, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void FastScroll(List<Character> list, final LazyListState listState, Composer composer, final int i, final int i2) {
        final List<Character> list2;
        Float fValueOf = Float.valueOf(0.0f);
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1552682880);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(listState) ? 32 : 16;
        }
        if (i3 == 1 && (i4 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            list2 = list;
        } else {
            List<Character> listEmptyList = i3 != 0 ? CollectionsKt.emptyList() : list;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1552682880, i4, -1, "com.truelayer.payments.ui.components.FastScroll (FastScroll.kt:97)");
            }
            composerStartRestartGroup.startReplaceableGroup(2131324064);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(fValueOf, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2131324195);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(0, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2131324297);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(fValueOf, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2131324414);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(773894976);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup));
                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                objRememberedValue5 = compositionScopedCoroutineScopeCanceller;
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue5).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM5173sizeInqDBjuR0$default = SizeKt.m5173sizeInqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), minInteractionAreaWidth, 0.0f, 0.0f, 0.0f, 14, null);
            composerStartRestartGroup.startReplaceableGroup(2131324746);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<Float, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$FastScroll$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                        invoke(f.floatValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(float f) {
                        FastScrollKt.FastScroll$lambda$9(snapshotState3, f);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierFastScrollPositionProvider = fastScrollPositionProvider(modifierM5173sizeInqDBjuR0$default, listState, (Function1) objRememberedValue6, new Function3<Float, Integer, Boolean, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt.FastScroll.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f, Integer num, Boolean bool) {
                    invoke(f.floatValue(), num, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f, Integer num, boolean z) {
                    FastScrollKt.FastScroll$lambda$3(snapshotState, f);
                    FastScrollKt.FastScroll$lambda$12(snapshotState4, z);
                    if (num != null) {
                        CoroutineScope coroutineScope2 = coroutineScope;
                        SnapshotState<Integer> snapshotState5 = snapshotState2;
                        SnapshotState<Boolean> snapshotState6 = snapshotState4;
                        LazyListState lazyListState = listState;
                        int iIntValue = num.intValue();
                        FastScrollKt.FastScroll$lambda$6(snapshotState5, iIntValue);
                        if (FastScrollKt.FastScroll$lambda$11(snapshotState6)) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new FastScrollKt$FastScroll$2$1$1(lazyListState, iIntValue, null), 3, null);
                        }
                    }
                }
            });
            Alignment topEnd = Alignment.INSTANCE.getTopEnd();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(topEnd, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFastScrollPositionProvider);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-1248814113);
            VibrateOnIndex(listEmptyList, FastScroll$lambda$5(snapshotState2), FastScroll$lambda$11(snapshotState4), composerStartRestartGroup, 8);
            list2 = listEmptyList;
            SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(FastScroll$lambda$2(snapshotState), AnimationSpecKt.spring$default(1.0f, 10000.0f, null, 4, null), 0.0f, null, null, composerStartRestartGroup, 0, 28);
            m27043VerticalScrollIndicatorjTDHpeQ(C2002Dp.m7995constructorimpl(4), Converters3.intoDp(FastScroll$lambda$8(snapshotState3), composerStartRestartGroup, 0), C2002Dp.m7995constructorimpl(8), FastScroll$lambda$16$lambda$14(snapshotState4AnimateFloatAsState), composerStartRestartGroup, 390, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (list2.isEmpty()) {
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                Character ch = (Character) CollectionsKt.getOrNull(list2, FastScroll$lambda$5(snapshotState2));
                composerStartRestartGroup.startReplaceableGroup(2131326014);
                if (ch != null) {
                    m27042SectionIndicatorEUb7tLY(FastScroll$lambda$11(snapshotState4), 0.0f, FastScroll$lambda$16$lambda$14(snapshotState4AnimateFloatAsState), FastScroll$lambda$8(snapshotState3), ch.charValue(), composerStartRestartGroup, 0, 2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt.FastScroll.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    FastScrollKt.FastScroll(list2, listState, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FastScroll$lambda$3(SnapshotState<Float> snapshotState, float f) {
        snapshotState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FastScroll$lambda$6(SnapshotState<Integer> snapshotState, int i) {
        snapshotState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FastScroll$lambda$9(SnapshotState<Float> snapshotState, float f) {
        snapshotState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FastScroll$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* renamed from: SectionIndicator-EUb7tLY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27042SectionIndicatorEUb7tLY(boolean z, float f, float f2, float f3, final char c, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        float f4;
        int i4;
        float f5;
        int i5;
        float f6;
        char c2;
        Composer composer2;
        final boolean z3;
        final float f7;
        final float f8;
        final float f9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2032607456);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 14) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                f4 = f;
                i3 |= composerStartRestartGroup.changed(f4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f5 = f2;
                    i3 |= composerStartRestartGroup.changed(f5) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        f6 = f3;
                        i3 |= composerStartRestartGroup.changed(f6) ? 2048 : 1024;
                    }
                    if ((i2 & 16) != 0) {
                        if ((57344 & i) == 0) {
                            c2 = c;
                            i3 |= composerStartRestartGroup.changed(c2) ? 16384 : 8192;
                        }
                        if ((46811 & i3) == 9362 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            z3 = z2;
                            f9 = f4;
                            f7 = f5;
                            f8 = f6;
                        } else {
                            if (i6 != 0) {
                                z2 = true;
                            }
                            final float fM7995constructorimpl = i7 == 0 ? C2002Dp.m7995constructorimpl(24) : f4;
                            if (i4 != 0) {
                                f5 = 0.0f;
                            }
                            if (i5 != 0) {
                                f6 = 0.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2032607456, i3, -1, "com.truelayer.payments.ui.components.SectionIndicator (FastScroll.kt:169)");
                            }
                            if (z2) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup2 != null) {
                                    final boolean z4 = z2;
                                    final float f10 = f5;
                                    final float f11 = f6;
                                    final char c3 = c2;
                                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$SectionIndicator$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i8) {
                                            FastScrollKt.m27042SectionIndicatorEUb7tLY(z4, fM7995constructorimpl, f10, f11, c3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            boolean z5 = z2;
                            float f12 = f5;
                            float f13 = f6;
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(90);
                            float f14 = 2;
                            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(fM7995constructorimpl2 / f14);
                            final float fCoerceAtLeast = RangesKt.coerceAtLeast((f12 + (f13 / f14)) - Converters3.m27183intoPx8Feqmps(fM7995constructorimpl2, composerStartRestartGroup, 6), 0.0f);
                            Modifier.Companion companion = Modifier.INSTANCE;
                            composerStartRestartGroup.startReplaceableGroup(1242151528);
                            boolean zChanged = ((i3 & 112) == 32) | composerStartRestartGroup.changed(fCoerceAtLeast);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<Density, IntOffset>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$SectionIndicator$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                                        return IntOffset.m8030boximpl(m27048invokeBjo55l4(density));
                                    }

                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                    public final long m27048invokeBjo55l4(Density offset) {
                                        Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                        return IntOffset2.IntOffset(-MathKt.roundToInt(offset.mo5016toPx0680j_4(fM7995constructorimpl)), MathKt.roundToInt(fCoerceAtLeast));
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue);
                            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                            int i8 = MaterialTheme.$stable;
                            Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(TestTag3.testTag(Background3.m4871backgroundbw27NRU(modifierOffset, materialTheme.getColorScheme(composerStartRestartGroup, i8).getPrimary(), RoundedCornerShape2.m5328RoundedCornerShapea9UjIt4(fM7995constructorimpl3, fM7995constructorimpl3, C2002Dp.m7995constructorimpl(0), fM7995constructorimpl3)), TestTags.FAST_SCROLL_SECTION_INDICATOR), fM7995constructorimpl2);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifierWrapContentSize = SizeKt.wrapContentSize(modifierM5169size3ABfNKs, companion2.getCenter(), true);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierWrapContentSize);
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            float f15 = fM7995constructorimpl;
                            composer2 = composerStartRestartGroup;
                            TextKt.m6028Text4IGK_g(String.valueOf(c), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m7655copyp1EtxEg$default(materialTheme.getTypography(composerStartRestartGroup, i8).getTitleMedium(), materialTheme.getColorScheme(composerStartRestartGroup, i8).getOnPrimary(), TextUnit2.getSp(55), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777212, null), composer2, 0, 0, 65534);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z5;
                            f7 = f12;
                            f8 = f13;
                            f9 = f15;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$SectionIndicator$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    FastScrollKt.m27042SectionIndicatorEUb7tLY(z3, f9, f7, f8, c, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    c2 = c;
                    if ((46811 & i3) == 9362) {
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (z2) {
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f6 = f3;
                if ((i2 & 16) != 0) {
                }
                c2 = c;
                if ((46811 & i3) == 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f5 = f2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f6 = f3;
            if ((i2 & 16) != 0) {
            }
            c2 = c;
            if ((46811 & i3) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f4 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f5 = f2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f6 = f3;
        if ((i2 & 16) != 0) {
        }
        c2 = c;
        if ((46811 & i3) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: VerticalScrollIndicator-jTDHpeQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m27043VerticalScrollIndicatorjTDHpeQ(float f, final float f2, float f3, final float f4, Composer composer, final int i, final int i2) {
        int i3;
        float f5;
        final float fM7995constructorimpl;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-370687844);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 896) == 0) {
                f5 = f3;
                i3 |= composerStartRestartGroup.changed(f5) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
            }
            if ((i3 & 5851) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                fM7995constructorimpl = f5;
            } else {
                if (i4 != 0) {
                    f = C2002Dp.m7995constructorimpl(4);
                }
                fM7995constructorimpl = i5 == 0 ? C2002Dp.m7995constructorimpl(8) : f5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-370687844, i3, -1, "com.truelayer.payments.ui.components.VerticalScrollIndicator (FastScroll.kt:216)");
                }
                if (C2002Dp.m7994compareTo0680j_4(f2, C2002Dp.m7995constructorimpl(0)) > 0) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final float f6 = f;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$VerticalScrollIndicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                FastScrollKt.m27043VerticalScrollIndicatorjTDHpeQ(f6, f2, fM7995constructorimpl, f4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(Modifier.INSTANCE, f, f2);
                composerStartRestartGroup.startReplaceableGroup(326169162);
                boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<Density, IntOffset>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$VerticalScrollIndicator$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                            return IntOffset.m8030boximpl(m27049invokeBjo55l4(density));
                        }

                        /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                        public final long m27049invokeBjo55l4(Density offset) {
                            Intrinsics.checkNotNullParameter(offset, "$this$offset");
                            return IntOffset2.IntOffset(MathKt.roundToInt(-offset.mo5016toPx0680j_4(fM7995constructorimpl)), MathKt.roundToInt(f4));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(TestTag3.testTag(Background3.m4871backgroundbw27NRU(OffsetKt.offset(modifierM5171sizeVpY3zN4, (Function1) objRememberedValue), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurface(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(f)), TestTags.VERTICAL_SCROLL_INDICATOR), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final float f7 = f;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$VerticalScrollIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        FastScrollKt.m27043VerticalScrollIndicatorjTDHpeQ(f7, f2, fM7995constructorimpl, f4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        f5 = f3;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) != 1170) {
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (C2002Dp.m7994compareTo0680j_4(f2, C2002Dp.m7995constructorimpl(0)) > 0) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: FastScroll.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.components.FastScrollKt$fastScrollPositionProvider$1 */
    static final class C428471 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function3<Float, Integer, Boolean, Unit> $onOffsetY;
        final /* synthetic */ Function1<Float, Unit> $onScrollIndicatorHeight;
        final /* synthetic */ LazyListState $scrollState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C428471(LazyListState lazyListState, Function3<? super Float, ? super Integer, ? super Boolean, Unit> function3, Function1<? super Float, Unit> function1) {
            super(3);
            this.$scrollState = lazyListState;
            this.$onOffsetY = function3;
            this.$onScrollIndicatorHeight = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(SnapshotState<IntSize> snapshotState, long j) {
            snapshotState.setValue(IntSize.m8055boximpl(j));
        }

        private static final void invoke$lambda$8(SnapshotState<Integer> snapshotState, int i) {
            snapshotState.setValue(Integer.valueOf(i));
        }

        private static final void invoke$lambda$11(SnapshotState<Float> snapshotState, float f) {
            snapshotState.setValue(Float.valueOf(f));
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Composer.Companion companion;
            int i2;
            int i3;
            Float fValueOf = Float.valueOf(0.0f);
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(-1090890050);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090890050, i, -1, "com.truelayer.payments.ui.components.fastScrollPositionProvider.<anonymous> (FastScroll.kt:239)");
            }
            composer.startReplaceableGroup(1294992488);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1294992543);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.INSTANCE.m8064getZeroYbymL2g()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1294992613);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(0, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1294992663);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(fValueOf, null, 2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1294992722);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(fValueOf, null, 2, null);
                composer.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue5;
            composer.endReplaceableGroup();
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) this.$scrollState.getLayoutInfo().getVisibleItemsInfo());
            if (lazyListItemInfo != null) {
                int index = lazyListItemInfo.getIndex();
                LazyListState lazyListState = this.$scrollState;
                Function1<Float, Unit> function1 = this.$onScrollIndicatorHeight;
                Function3<Float, Integer, Boolean, Unit> function3 = this.$onOffsetY;
                companion = companion2;
                float fM8059getHeightimpl = IntSize.m8059getHeightimpl(invoke$lambda$4(snapshotState2)) / lazyListState.getLayoutInfo().getTotalItemsCount();
                invoke$lambda$11(snapshotState4, index * fM8059getHeightimpl);
                int size = lazyListState.getLayoutInfo().getVisibleItemsInfo().size();
                i2 = 1;
                if (Math.abs(size - invoke$lambda$7(snapshotState3)) > 1) {
                    invoke$lambda$8(snapshotState3, size);
                }
                invoke$lambda$14(snapshotState5, invoke$lambda$7(snapshotState3) * fM8059getHeightimpl);
                if (invoke$lambda$13(snapshotState5) >= IntSize.m8059getHeightimpl(invoke$lambda$4(snapshotState2))) {
                    function1.invoke(fValueOf);
                } else {
                    function1.invoke(Float.valueOf(invoke$lambda$13(snapshotState5)));
                    function3.invoke(Float.valueOf(invoke$lambda$10(snapshotState4)), null, Boolean.valueOf(invoke$lambda$1(snapshotState)));
                }
            } else {
                companion = companion2;
                i2 = 1;
            }
            composer.startReplaceableGroup(1294993920);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new Function1<IntSize, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$fastScrollPositionProvider$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                        m27050invokeozmzZPI(intSize.getPackedValue());
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
                    public final void m27050invokeozmzZPI(long j) {
                        FastScrollKt.C428471.invoke$lambda$5(snapshotState2, j);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceableGroup();
            Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(composed, (Function1) objRememberedValue6);
            composer.startReplaceableGroup(1294993968);
            boolean zChanged = composer.changed(density) | composer.changed(this.$scrollState) | composer.changed(this.$onOffsetY);
            int i4 = i2;
            final LazyListState lazyListState2 = this.$scrollState;
            final Function3<Float, Integer, Boolean, Unit> function32 = this.$onOffsetY;
            Object objRememberedValue7 = composer.rememberedValue();
            if (zChanged || objRememberedValue7 == companion.getEmpty()) {
                i3 = i4;
                Object obj = new Function1<MotionEvent, Boolean>() { // from class: com.truelayer.payments.ui.components.FastScrollKt$fastScrollPositionProvider$1$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(MotionEvent motionEvent) {
                        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            if (new PrimitiveRanges2(MathKt.roundToInt(FastScrollKt.C428471.invoke$lambda$10(snapshotState4)), MathKt.roundToInt(FastScrollKt.C428471.invoke$lambda$10(snapshotState4) + RangesKt.coerceAtLeast(FastScrollKt.C428471.invoke$lambda$13(snapshotState5), Converters3.m27184intoPxD5KLDUw(FastScrollKt.minInteractionAreaWidth, density)))).contains(MathKt.roundToInt(motionEvent.getY()))) {
                                FastScrollKt.C428471.invoke$lambda$2(snapshotState, true);
                                function32.invoke(Float.valueOf(motionEvent.getY()), Integer.valueOf(FastScrollKt.m27047offsetToIndexmLhObY(lazyListState2, motionEvent.getY(), FastScrollKt.C428471.invoke$lambda$4(snapshotState2), FastScrollKt.C428471.invoke$lambda$13(snapshotState5))), Boolean.valueOf(FastScrollKt.C428471.invoke$lambda$1(snapshotState)));
                            }
                        } else if (action != 1) {
                            if (action == 2 && IntSize.m8059getHeightimpl(FastScrollKt.C428471.invoke$lambda$4(snapshotState2)) > 0 && FastScrollKt.C428471.invoke$lambda$1(snapshotState)) {
                                function32.invoke(Float.valueOf(motionEvent.getY()), Integer.valueOf(FastScrollKt.m27047offsetToIndexmLhObY(lazyListState2, motionEvent.getY(), FastScrollKt.C428471.invoke$lambda$4(snapshotState2), FastScrollKt.C428471.invoke$lambda$13(snapshotState5))), Boolean.valueOf(FastScrollKt.C428471.invoke$lambda$1(snapshotState)));
                            }
                        } else {
                            FastScrollKt.C428471.invoke$lambda$2(snapshotState, false);
                            function32.invoke(Float.valueOf(motionEvent.getY()), Integer.valueOf(FastScrollKt.m27047offsetToIndexmLhObY(lazyListState2, motionEvent.getY(), FastScrollKt.C428471.invoke$lambda$4(snapshotState2), FastScrollKt.C428471.invoke$lambda$13(snapshotState5))), Boolean.valueOf(FastScrollKt.C428471.invoke$lambda$1(snapshotState)));
                        }
                        return Boolean.TRUE;
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue7 = obj;
            } else {
                i3 = i4;
            }
            composer.endReplaceableGroup();
            Modifier modifierPointerInteropFilter$default = PointerInteropFilter_androidKt.pointerInteropFilter$default(modifierOnSizeChanged, null, (Function1) objRememberedValue7, i3, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierPointerInteropFilter$default;
        }

        private static final void invoke$lambda$14(SnapshotState<Float> snapshotState, float f) {
            snapshotState.setValue(Float.valueOf(f));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$4(SnapshotState<IntSize> snapshotState) {
            return snapshotState.getValue().getPackedValue();
        }

        private static final int invoke$lambda$7(SnapshotState<Integer> snapshotState) {
            return snapshotState.getValue().intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$10(SnapshotState<Float> snapshotState) {
            return snapshotState.getValue().floatValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float invoke$lambda$13(SnapshotState<Float> snapshotState) {
            return snapshotState.getValue().floatValue();
        }
    }

    private static final Modifier fastScrollPositionProvider(Modifier modifier, LazyListState lazyListState, Function1<? super Float, Unit> function1, Function3<? super Float, ? super Integer, ? super Boolean, Unit> function3) {
        return ComposedModifier2.composed$default(modifier, null, new C428471(lazyListState, function3, function1), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: offsetToIndex-mL-hObY, reason: not valid java name */
    public static final int m27047offsetToIndexmLhObY(LazyListState lazyListState, float f, long j, float f2) {
        return RangesKt.coerceIn(MathKt.roundToInt(lazyListState.getLayoutInfo().getTotalItemsCount() * RangesKt.coerceIn((f + (f2 * (f / IntSize.m8059getHeightimpl(j)))) / IntSize.m8059getHeightimpl(j), 0.0f, 1.0f)), 0, lazyListState.getLayoutInfo().getTotalItemsCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VibrateOnIndex(final List<Character> list, final int i, final boolean z, Composer composer, final int i2) {
        Vibrator defaultVibrator;
        Composer composerStartRestartGroup = composer.startRestartGroup(453228335);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(453228335, i2, -1, "com.truelayer.payments.ui.components.VibrateOnIndex (FastScroll.kt:328)");
        }
        composerStartRestartGroup.startReplaceableGroup(-845055770);
        boolean zChanged = composerStartRestartGroup.changed(list);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            List<Character> listDistinct = CollectionsKt.distinct(CollectionsKt.filterNotNull(list));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
            for (Character ch : listDistinct) {
                ch.charValue();
                arrayList.add(Integer.valueOf(list.indexOf(ch)));
            }
            objRememberedValue = SnapshotState3.mutableStateOf$default(arrayList, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && VibrateOnIndex$lambda$22(snapshotState).contains(Integer.valueOf(i)) && z) {
            if (i3 >= 31) {
                composerStartRestartGroup.startReplaceableGroup(-845055398);
                Object systemService = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("vibrator_manager");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                defaultVibrator = FastScrollKt$$ExternalSyntheticApiModelOutline0.m3175m(systemService).getDefaultVibrator();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-845055163);
                defaultVibrator = (Vibrator) ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("vibrator");
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (defaultVibrator != null) {
                defaultVibrator.vibrate(VibrationEffect.createOneShot(20L, -1));
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.FastScrollKt.VibrateOnIndex.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    FastScrollKt.VibrateOnIndex(list, i, z, composer2, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    private static final float FastScroll$lambda$2(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue().floatValue();
    }

    private static final int FastScroll$lambda$5(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue().intValue();
    }

    private static final float FastScroll$lambda$8(SnapshotState<Float> snapshotState) {
        return snapshotState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FastScroll$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float FastScroll$lambda$16$lambda$14(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final List<Integer> VibrateOnIndex$lambda$22(SnapshotState<List<Integer>> snapshotState) {
        return snapshotState.getValue();
    }
}
