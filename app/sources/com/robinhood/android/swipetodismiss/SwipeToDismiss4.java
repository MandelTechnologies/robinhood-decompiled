package com.robinhood.android.swipetodismiss;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.swipetodismiss.SwipeToDismiss4;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* compiled from: SwipeToDismiss.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0089\u0001\u0010\u0017\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u00022\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u00122\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0002¢\u0006\u0002\b\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/swipetodismiss/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Lcom/robinhood/android/swipetodismiss/DismissState;", "rememberDismissState", "(Lcom/robinhood/android/swipetodismiss/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/robinhood/android/swipetodismiss/DismissState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "Lcom/robinhood/android/swipetodismiss/DismissDirection;", "directions", "Lcom/robinhood/android/swipetodismiss/ThresholdConfig;", "dismissThresholds", "Landroidx/compose/foundation/layout/RowScope;", "", "Lkotlin/ExtensionFunctionType;", "background", "dismissContent", "Lkotlin/Function0;", "onDragStarted", "SwipeToDismiss", "(Lcom/robinhood/android/swipetodismiss/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "from", "to", "getDismissDirection", "(Lcom/robinhood/android/swipetodismiss/DismissValue;Lcom/robinhood/android/swipetodismiss/DismissValue;)Lcom/robinhood/android/swipetodismiss/DismissDirection;", "Landroidx/compose/ui/unit/Dp;", "DISMISS_THRESHOLD", "F", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.swipetodismiss.SwipeToDismissKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class SwipeToDismiss4 {
    private static final float DISMISS_THRESHOLD = C2002Dp.m7995constructorimpl(56);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToDismiss$lambda$8(SwipeToDismiss2 swipeToDismiss2, Modifier modifier, Set set, Function1 function1, Function3 function3, Function3 function32, Function0 function0, int i, int i2, Composer composer, int i3) {
        SwipeToDismiss(swipeToDismiss2, modifier, set, function1, function3, function32, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberDismissState$lambda$1$lambda$0(SwipeToDismiss3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* compiled from: SwipeToDismiss.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.swipetodismiss.SwipeToDismissKt$SwipeToDismiss$3 */
    static final class C292053 implements Function3<BoxWithConstraints4, Composer, Integer, Unit> {
        final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $background;
        final /* synthetic */ Set<SwipeToDismiss> $directions;
        final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $dismissContent;
        final /* synthetic */ Function1<SwipeToDismiss, ThresholdConfig> $dismissThresholds;
        final /* synthetic */ Function0<Unit> $onDragStarted;
        final /* synthetic */ SwipeToDismiss2 $state;

        /* JADX WARN: Multi-variable type inference failed */
        C292053(Set<? extends SwipeToDismiss> set, Function1<? super SwipeToDismiss, ? extends ThresholdConfig> function1, SwipeToDismiss2 swipeToDismiss2, Function0<Unit> function0, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32) {
            this.$directions = set;
            this.$dismissThresholds = function1;
            this.$state = swipeToDismiss2;
            this.$onDragStarted = function0;
            this.$background = function3;
            this.$dismissContent = function32;
        }

        public final void invoke(BoxWithConstraints4 BoxWithConstraints, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(254615172, i2, -1, "com.robinhood.android.swipetodismiss.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:199)");
            }
            float fM7975getMaxWidthimpl = Constraints.m7975getMaxWidthimpl(BoxWithConstraints.getConstraints());
            boolean z = composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            Float fValueOf = Float.valueOf(0.0f);
            SwipeToDismiss3 swipeToDismiss3 = SwipeToDismiss3.Default;
            Map mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to(fValueOf, swipeToDismiss3));
            Set<SwipeToDismiss> set = this.$directions;
            SwipeToDismiss swipeToDismiss = SwipeToDismiss.StartToEnd;
            if (set.contains(swipeToDismiss)) {
                Tuples2 tuples2M3642to = Tuples4.m3642to(Float.valueOf(fM7975getMaxWidthimpl), SwipeToDismiss3.DismissedToEnd);
                mapMutableMapOf.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
            }
            Set<SwipeToDismiss> set2 = this.$directions;
            SwipeToDismiss swipeToDismiss2 = SwipeToDismiss.EndToStart;
            if (set2.contains(swipeToDismiss2)) {
                Tuples2 tuples2M3642to2 = Tuples4.m3642to(Float.valueOf(-fM7975getMaxWidthimpl), SwipeToDismiss3.DismissedToStart);
                mapMutableMapOf.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
            }
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$dismissThresholds);
            final Function1<SwipeToDismiss, ThresholdConfig> function1 = this.$dismissThresholds;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.android.swipetodismiss.SwipeToDismissKt$SwipeToDismiss$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeToDismiss4.C292053.invoke$lambda$1$lambda$0(function1, (SwipeToDismiss3) obj, (SwipeToDismiss3) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function2 function2 = (Function2) objRememberedValue;
            composer.endReplaceGroup();
            float f = this.$directions.contains(swipeToDismiss2) ? 10.0f : 20.0f;
            float f2 = this.$directions.contains(swipeToDismiss) ? 10.0f : 20.0f;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM19209swipeableJwDH8BQ = SwipeableKt.m19209swipeableJwDH8BQ(companion, this.$state, mapMutableMapOf, Orientation.Horizontal, (544 & 8) != 0 ? true : this.$state.getCurrentValue() == swipeToDismiss3, (544 & 16) != 0 ? false : z, (544 & 32) != 0 ? null : null, (544 & 64) != 0 ? new Function2() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SwipeableKt.swipeable_JwDH8BQ$lambda$11(obj, obj2);
                }
            } : function2, (544 & 128) != 0 ? SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, mapMutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new ResistanceConfig(fM7975getMaxWidthimpl, f, f2), (544 & 256) != 0, (544 & 512) != 0 ? SwipeableDefaults.INSTANCE.m19206getVelocityThresholdD9Ej5fM() : 0.0f, (544 & 1024) != 0 ? new Function0() { // from class: com.robinhood.android.swipetodismiss.SwipeableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : this.$onDragStarted);
            Function3<Row5, Composer, Integer, Unit> function3 = this.$background;
            final SwipeToDismiss2 swipeToDismiss22 = this.$state;
            Function3<Row5, Composer, Integer, Unit> function32 = this.$dismissContent;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM19209swipeableJwDH8BQ);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierMatchParentSize = BoxScopeInstance.INSTANCE.matchParentSize(companion);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierMatchParentSize);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            function3.invoke(row6, composer, 6);
            composer.endNode();
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(swipeToDismiss22);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeToDismissKt$SwipeToDismiss$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SwipeToDismiss4.C292053.invoke$lambda$4$lambda$3$lambda$2(swipeToDismiss22, (Density) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierOffset = OffsetKt.offset(companion, (Function1) objRememberedValue2);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, modifierOffset);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            function32.invoke(row6, composer, 6);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraints4 boxWithConstraints4, Composer composer, Integer num) {
            invoke(boxWithConstraints4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ThresholdConfig invoke$lambda$1$lambda$0(Function1 function1, SwipeToDismiss3 from, SwipeToDismiss3 to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            SwipeToDismiss dismissDirection = SwipeToDismiss4.getDismissDirection(from, to);
            Intrinsics.checkNotNull(dismissDirection);
            return (ThresholdConfig) function1.invoke(dismissDirection);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntOffset invoke$lambda$4$lambda$3$lambda$2(SwipeToDismiss2 swipeToDismiss2, Density offset) {
            Intrinsics.checkNotNullParameter(offset, "$this$offset");
            return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl((MathKt.roundToInt(swipeToDismiss2.getOffset().getValue().floatValue()) << 32) | (0 & 4294967295L)));
        }
    }

    public static final SwipeToDismiss2 rememberDismissState(final SwipeToDismiss3 swipeToDismiss3, final Function1<? super SwipeToDismiss3, Boolean> function1, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1203110723);
        if ((i2 & 1) != 0) {
            swipeToDismiss3 = SwipeToDismiss3.Default;
        }
        if ((i2 & 2) != 0) {
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeToDismissKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(SwipeToDismiss4.rememberDismissState$lambda$1$lambda$0((SwipeToDismiss3) obj));
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1203110723, i, -1, "com.robinhood.android.swipetodismiss.rememberDismissState (SwipeToDismiss.kt:168)");
        }
        Object[] objArr = new Object[0];
        Saver<SwipeToDismiss2, SwipeToDismiss3> Saver = SwipeToDismiss2.INSTANCE.Saver(function1);
        composer.startReplaceGroup(-1633490746);
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(swipeToDismiss3.ordinal())) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(function1)) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.swipetodismiss.SwipeToDismissKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SwipeToDismiss4.rememberDismissState$lambda$3$lambda$2(swipeToDismiss3, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        SwipeToDismiss2 swipeToDismiss2 = (SwipeToDismiss2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return swipeToDismiss2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeToDismiss2 rememberDismissState$lambda$3$lambda$2(SwipeToDismiss3 swipeToDismiss3, Function1 function1) {
        return new SwipeToDismiss2(swipeToDismiss3, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FixedThreshold SwipeToDismiss$lambda$5$lambda$4(SwipeToDismiss it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new FixedThreshold(DISMISS_THRESHOLD, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismiss(final SwipeToDismiss2 state, Modifier modifier, Set<? extends SwipeToDismiss> set, Function1<? super SwipeToDismiss, ? extends ThresholdConfig> function1, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> background, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> dismissContent, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Set<? extends SwipeToDismiss> of;
        int i5;
        Function1<? super SwipeToDismiss, ? extends ThresholdConfig> function12;
        int i6;
        Function0<Unit> function02;
        int i7;
        Function1<? super SwipeToDismiss, ? extends ThresholdConfig> function13;
        Function0<Unit> function03;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-476346834);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    of = set;
                    i3 |= composerStartRestartGroup.changedInstance(of) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(background) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(dismissContent) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        }
                        i7 = i3;
                        if ((599187 & i7) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                        } else {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                of = SetsKt.setOf((Object[]) new SwipeToDismiss[]{SwipeToDismiss.EndToStart, SwipeToDismiss.StartToEnd});
                            }
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.swipetodismiss.SwipeToDismissKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SwipeToDismiss4.SwipeToDismiss$lambda$5$lambda$4((SwipeToDismiss) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                function13 = (Function1) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function13 = function12;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.swipetodismiss.SwipeToDismissKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function03 = (Function0) objRememberedValue2;
                            } else {
                                function03 = function02;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-476346834, i7, -1, "com.robinhood.android.swipetodismiss.SwipeToDismiss (SwipeToDismiss.kt:198)");
                            }
                            function12 = function13;
                            function02 = function03;
                            composer2 = composerStartRestartGroup;
                            Modifier modifier5 = modifier4;
                            BoxWithConstraints.BoxWithConstraints(modifier5, null, false, ComposableLambda3.rememberComposableLambda(254615172, true, new C292053(of, function13, state, function03, background, dismissContent), composerStartRestartGroup, 54), composer2, ((i7 >> 3) & 14) | 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        final Set<? extends SwipeToDismiss> set2 = of;
                        final Function1<? super SwipeToDismiss, ? extends ThresholdConfig> function14 = function12;
                        final Function0<Unit> function04 = function02;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.swipetodismiss.SwipeToDismissKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return SwipeToDismiss4.SwipeToDismiss$lambda$8(state, modifier3, set2, function14, background, dismissContent, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    function02 = function0;
                    i7 = i3;
                    if ((599187 & i7) == 599186) {
                        if (i8 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function12 = function13;
                        function02 = function03;
                        composer2 = composerStartRestartGroup;
                        Modifier modifier52 = modifier4;
                        BoxWithConstraints.BoxWithConstraints(modifier52, null, false, ComposableLambda3.rememberComposableLambda(254615172, true, new C292053(of, function13, state, function03, background, dismissContent), composerStartRestartGroup, 54), composer2, ((i7 >> 3) & 14) | 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                    final Set set22 = of;
                    final Function1 function142 = function12;
                    final Function0 function042 = function02;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                function02 = function0;
                i7 = i3;
                if ((599187 & i7) == 599186) {
                }
                final Set set222 = of;
                final Function1 function1422 = function12;
                final Function0 function0422 = function02;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            of = set;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            function02 = function0;
            i7 = i3;
            if ((599187 & i7) == 599186) {
            }
            final Set set2222 = of;
            final Function1 function14222 = function12;
            final Function0 function04222 = function02;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        of = set;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        function02 = function0;
        i7 = i3;
        if ((599187 & i7) == 599186) {
        }
        final Set set22222 = of;
        final Function1 function142222 = function12;
        final Function0 function042222 = function02;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SwipeToDismiss getDismissDirection(SwipeToDismiss3 swipeToDismiss3, SwipeToDismiss3 swipeToDismiss32) {
        if (swipeToDismiss3 == swipeToDismiss32 && swipeToDismiss3 == SwipeToDismiss3.Default) {
            return null;
        }
        if (swipeToDismiss3 == swipeToDismiss32 && swipeToDismiss3 == SwipeToDismiss3.DismissedToEnd) {
            return SwipeToDismiss.StartToEnd;
        }
        if (swipeToDismiss3 == swipeToDismiss32 && swipeToDismiss3 == SwipeToDismiss3.DismissedToStart) {
            return SwipeToDismiss.EndToStart;
        }
        SwipeToDismiss3 swipeToDismiss33 = SwipeToDismiss3.Default;
        if (swipeToDismiss3 == swipeToDismiss33 && swipeToDismiss32 == SwipeToDismiss3.DismissedToEnd) {
            return SwipeToDismiss.StartToEnd;
        }
        if (swipeToDismiss3 == swipeToDismiss33 && swipeToDismiss32 == SwipeToDismiss3.DismissedToStart) {
            return SwipeToDismiss.EndToStart;
        }
        if (swipeToDismiss3 == SwipeToDismiss3.DismissedToEnd && swipeToDismiss32 == swipeToDismiss33) {
            return SwipeToDismiss.StartToEnd;
        }
        if (swipeToDismiss3 == SwipeToDismiss3.DismissedToStart && swipeToDismiss32 == swipeToDismiss33) {
            return SwipeToDismiss.EndToStart;
        }
        return null;
    }
}
