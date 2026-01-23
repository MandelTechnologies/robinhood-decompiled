package com.robinhood.utils.compose.reorderable;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReorderableLazyListScopeImplV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$3$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ T $headerItem;
    final /* synthetic */ ReorderableListState<S> $nestedItemListState;
    final /* synthetic */ DragStateV2 $parentDragState;
    final /* synthetic */ Function2<Integer, S, Object> $sectionContentType;
    final /* synthetic */ SnapshotFloatState2 $sectionHeight$delegate;
    final /* synthetic */ Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> $sectionItemContent;
    final /* synthetic */ Function2<Integer, S, String> $sectionItemKey;
    final /* synthetic */ String $sectionItemKeyPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$3$2(DragStateV2 dragStateV2, ReorderableListState<S> reorderableListState, String str, Function2<? super Integer, ? super S, String> function2, Function2<? super Integer, ? super S, ? extends Object> function22, Function8<? super LazyItemScope, ? super T, ? super S, ? super Boolean, ? super Integer, ? super Boolean, ? super Composer, ? super Integer, Unit> function8, T t, SnapshotFloatState2 snapshotFloatState2, int i) {
        this.$parentDragState = dragStateV2;
        this.$nestedItemListState = reorderableListState;
        this.$sectionItemKeyPrefix = str;
        this.$sectionItemKey = function2;
        this.$sectionContentType = function22;
        this.$sectionItemContent = function8;
        this.$headerItem = t;
        this.$sectionHeight$delegate = snapshotFloatState2;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(166974561, i, -1, "com.robinhood.utils.compose.reorderable.DraggableSectionItem.<anonymous>.<anonymous>.<anonymous> (ReorderableLazyListScopeImplV2.kt:277)");
        }
        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(this.$sectionHeight$delegate.getFloatValue()));
        DragStateV2 dragStateV2 = this.$parentDragState;
        composer.startReplaceGroup(-1224400529);
        boolean zChanged = composer.changed(this.$nestedItemListState) | composer.changed(this.$sectionItemKeyPrefix) | composer.changed(this.$sectionItemKey) | composer.changed(this.$sectionContentType) | composer.changed(this.$sectionItemContent) | composer.changedInstance(this.$headerItem);
        final ReorderableListState<S> reorderableListState = this.$nestedItemListState;
        final String str = this.$sectionItemKeyPrefix;
        final Function2<Integer, S, String> function2 = this.$sectionItemKey;
        final Function2<Integer, S, Object> function22 = this.$sectionContentType;
        final Function8<LazyItemScope, T, S, Boolean, Integer, Boolean, Composer, Integer, Unit> function8 = this.$sectionItemContent;
        final T t = this.$headerItem;
        final int i2 = this.$$dirty;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function1 function1 = new Function1() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$3$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$3$2.invoke$lambda$1$lambda$0(reorderableListState, str, function2, function22, function8, t, i2, (ReorderableLazyListScopeV2) obj);
                }
            };
            composer.updateRememberedValue(function1);
            objRememberedValue = function1;
        }
        composer.endReplaceGroup();
        ReorderableLazyColumnKt.ReorderableLazyColumnV2(modifierM5156height3ABfNKs, null, null, false, null, null, null, false, dragStateV2, (Function1) objRememberedValue, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(ReorderableListState reorderableListState, String str, Function2 function2, Function2 function22, final Function8 function8, final Object obj, final int i, ReorderableLazyListScopeV2 ReorderableLazyColumnV2) {
        Intrinsics.checkNotNullParameter(ReorderableLazyColumnV2, "$this$ReorderableLazyColumnV2");
        ReorderableListStateKt.reorderableItems$default(ReorderableLazyColumnV2, reorderableListState, str, function2, function22, false, false, ComposableLambda3.composableLambdaInstance(-1172068626, true, new Function6<LazyItemScope, S, Integer, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.utils.compose.reorderable.ReorderableLazyListScopeImplV2Kt$DraggableSectionItem$2$3$2$1$1$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Object obj2, Integer num, Boolean bool, Composer composer, Integer num2) {
                invoke(lazyItemScope, (LazyItemScope) obj2, num.intValue(), bool.booleanValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope reorderableItems, S s, int i2, boolean z, Composer composer, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(reorderableItems, "$this$reorderableItems");
                if ((i3 & 6) == 0) {
                    i4 = (composer.changed(reorderableItems) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= (i3 & 64) == 0 ? composer.changed(s) : composer.changedInstance(s) ? 32 : 16;
                }
                if ((i3 & 384) == 0) {
                    i4 |= composer.changed(i2) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    i4 |= composer.changed(z) ? 2048 : 1024;
                }
                if ((i4 & 9363) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1172068626, i4, -1, "com.robinhood.utils.compose.reorderable.DraggableSectionItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReorderableLazyListScopeImplV2.kt:287)");
                }
                int i5 = i4 << 6;
                function8.invoke(reorderableItems, obj, s, Boolean.FALSE, Integer.valueOf(i2), Boolean.valueOf(z), composer, Integer.valueOf((i4 & 14) | 3072 | (((i >> 9) & 8) << 3) | ((i4 << 3) & 896) | (57344 & i5) | (i5 & 458752)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 48, null);
        return Unit.INSTANCE;
    }
}
