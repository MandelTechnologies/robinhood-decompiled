package com.robinhood.utils.compose.reorderable;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReorderableLazyListScopeImplV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2 implements Function4<Boolean, Boolean, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $headerIndex;
    final /* synthetic */ T $headerItem;
    final /* synthetic */ Function8<LazyItemScope, T, Integer, Boolean, Boolean, Function1<? super Boolean, Unit>, Composer, Integer, Unit> $headerItemContent;
    final /* synthetic */ InteractionSource3 $interactionSource;
    final /* synthetic */ ReorderableListState<S> $nestedItemListState;
    final /* synthetic */ DragStateV2 $parentDragState;
    final /* synthetic */ Function2<Integer, S, Object> $sectionContentType;
    final /* synthetic */ SnapshotState<Boolean> $sectionExpanded$delegate;
    final /* synthetic */ SnapshotFloatState2 $sectionHeight$delegate;
    final /* synthetic */ Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> $sectionItemContent;
    final /* synthetic */ Function2<Integer, S, String> $sectionItemKey;
    final /* synthetic */ String $sectionItemKeyPrefix;
    final /* synthetic */ ImmutableList<S> $sectionItems;
    final /* synthetic */ boolean $sectionItemsConsistentSize;
    final /* synthetic */ LazyItemScope $this_DraggableSectionItem;

    /* JADX WARN: Multi-variable type inference failed */
    ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2(ImmutableList<? extends S> immutableList, boolean z, Function8<? super LazyItemScope, ? super T, ? super S, ? super Boolean, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> function8, LazyItemScope lazyItemScope, T t, int i, SnapshotFloatState2 snapshotFloatState2, Function8<? super LazyItemScope, ? super T, ? super Integer, ? super Boolean, ? super Boolean, ? super Function1<? super Boolean, Unit>, ? super Composer, ? super Integer, Unit> function82, int i2, SnapshotState<Boolean> snapshotState, DragStateV2 dragStateV2, ReorderableListState<S> reorderableListState, String str, Function2<? super Integer, ? super S, String> function2, Function2<? super Integer, ? super S, ? extends Object> function22, InteractionSource3 interactionSource3) {
        this.$sectionItems = immutableList;
        this.$sectionItemsConsistentSize = z;
        this.$sectionItemContent = function8;
        this.$this_DraggableSectionItem = lazyItemScope;
        this.$headerItem = t;
        this.$$dirty = i;
        this.$sectionHeight$delegate = snapshotFloatState2;
        this.$headerItemContent = function82;
        this.$headerIndex = i2;
        this.$sectionExpanded$delegate = snapshotState;
        this.$parentDragState = dragStateV2;
        this.$nestedItemListState = reorderableListState;
        this.$sectionItemKeyPrefix = str;
        this.$sectionItemKey = function2;
        this.$sectionContentType = function22;
        this.$interactionSource = interactionSource3;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Composer composer, Integer num) {
        invoke(bool.booleanValue(), bool2.booleanValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
        ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$9(snapshotState, z);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, boolean z2, Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composer.changed(z2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2044630545, i3, -1, "com.robinhood.utils.compose.reorderable.DraggableSectionItem.<anonymous> (ReorderableLazyListScopeImplV2.kt:256)");
        }
        composer.startReplaceGroup(-2089897331);
        if (!this.$sectionItems.isEmpty()) {
            final boolean z3 = this.$sectionItemsConsistentSize;
            final Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> function8 = this.$sectionItemContent;
            final LazyItemScope lazyItemScope = this.$this_DraggableSectionItem;
            final T t = this.$headerItem;
            final ImmutableList<S> immutableList = this.$sectionItems;
            final int i4 = this.$$dirty;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1693950741, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2.1
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
                        ComposerKt.traceEventStart(1693950741, i5, -1, "com.robinhood.utils.compose.reorderable.DraggableSectionItem.<anonymous>.<anonymous> (ReorderableLazyListScopeImplV2.kt:259)");
                    }
                    if (z3) {
                        composer2.startReplaceGroup(-1379149919);
                        function8.invoke(lazyItemScope, t, CollectionsKt.first(immutableList), Boolean.TRUE, 0, Boolean.FALSE, composer2, Integer.valueOf((((i4 >> 9) & 8) << 3) | 224256));
                        composer2.endReplaceGroup();
                    } else {
                        int i6 = 0;
                        composer2.startReplaceGroup(-1379034382);
                        List list = immutableList;
                        Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> function82 = function8;
                        LazyItemScope lazyItemScope2 = lazyItemScope;
                        T t2 = t;
                        int i7 = i4;
                        for (Object obj : list) {
                            int i8 = i6 + 1;
                            if (i6 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            function82.invoke(lazyItemScope2, t2, obj, Boolean.TRUE, Integer.valueOf(i6), Boolean.FALSE, composer2, Integer.valueOf((((i7 >> 9) & 8) << 3) | 199680));
                            i6 = i8;
                        }
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            final boolean z4 = this.$sectionItemsConsistentSize;
            final ImmutableList<S> immutableList2 = this.$sectionItems;
            final SnapshotFloatState2 snapshotFloatState2 = this.$sectionHeight$delegate;
            ReorderableLazyListScopeImplV2Kt.SubCompose(composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(-301516768, true, new Function3<C2002Dp, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(C2002Dp c2002Dp, Composer composer2, Integer num) {
                    m26630invoke8Feqmps(c2002Dp.getValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-8Feqmps, reason: not valid java name */
                public final void m26630invoke8Feqmps(float f, Composer composer2, int i5) {
                    if ((i5 & 6) == 0) {
                        i5 |= composer2.changed(f) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-301516768, i5, -1, "com.robinhood.utils.compose.reorderable.DraggableSectionItem.<anonymous>.<anonymous> (ReorderableLazyListScopeImplV2.kt:267)");
                    }
                    SnapshotFloatState2 snapshotFloatState22 = snapshotFloatState2;
                    if (z4) {
                        f *= immutableList2.size();
                    }
                    snapshotFloatState22.setFloatValue(f);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 54);
        }
        composer.endReplaceGroup();
        Function8<LazyItemScope, T, Integer, Boolean, Boolean, Function1<? super Boolean, Unit>, Composer, Integer, Unit> function82 = this.$headerItemContent;
        LazyItemScope lazyItemScope2 = this.$this_DraggableSectionItem;
        T t2 = this.$headerItem;
        int i5 = this.$headerIndex;
        int i6 = this.$$dirty;
        List list = this.$sectionItems;
        final SnapshotState<Boolean> snapshotState = this.$sectionExpanded$delegate;
        DragStateV2 dragStateV2 = this.$parentDragState;
        ReorderableListState<S> reorderableListState = this.$nestedItemListState;
        String str = this.$sectionItemKeyPrefix;
        Function2<Integer, S, String> function2 = this.$sectionItemKey;
        Function2<Integer, S, Object> function22 = this.$sectionContentType;
        Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> function83 = this.$sectionItemContent;
        SnapshotFloatState2 snapshotFloatState22 = this.$sectionHeight$delegate;
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        Integer numValueOf = Integer.valueOf(i5);
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean boolValueOf2 = Boolean.valueOf(ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$8(snapshotState));
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2.invoke$lambda$2$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        function82.invoke(lazyItemScope2, t2, numValueOf, boolValueOf, boolValueOf2, (Function1) objRememberedValue, composer, Integer.valueOf(((i3 << 9) & 7168) | (((i6 >> 9) & 8) << 3) | 196608));
        AnimatedVisibilityKt.AnimatedVisibility(column6, (!ReorderableLazyListScopeImplV2Kt.DraggableSectionItem_Bn9xFrM$lambda$8(snapshotState) || z2 || list.isEmpty()) ? false : true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(166974561, true, new ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$3$2(dragStateV2, reorderableListState, str, function2, function22, function83, t2, snapshotFloatState22, i6), composer, 54), composer, 1572870, 30);
        composer.endNode();
        Boolean boolValueOf3 = Boolean.valueOf(z2);
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance = composer.changedInstance(this.$sectionItems) | ((i3 & 112) == 32);
        ImmutableList<S> immutableList3 = this.$sectionItems;
        InteractionSource3 interactionSource3 = this.$interactionSource;
        SnapshotState<Boolean> snapshotState2 = this.$sectionExpanded$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion3.getEmpty()) {
            ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1 reorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1 = new ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1(z2, immutableList3, interactionSource3, snapshotState2, null);
            composer.updateRememberedValue(reorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1);
            objRememberedValue2 = reorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$4$1;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, (i3 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
