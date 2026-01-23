package com.robinhood.android.charts;

import android.annotation.SuppressLint;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Interactions.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0010*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0013*\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a²\u0006\u000e\u0010\u0019\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onScrub", "Lkotlin/Function0;", "onScrubStopped", "scrubDetection", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "", "longPressTimeoutMillis", "content", "ChartViewConfigurationProvider", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/ViewConfiguration;", "Landroidx/compose/runtime/ProvidedValue;", "providesWithScrubListener", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Ljava/lang/Long;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/ProvidedValue;", "T", "", "Lcom/robinhood/android/charts/InteractionState;", "key", "getDefaulted", "(Ljava/util/Map;Lcom/robinhood/android/charts/InteractionState;)Ljava/lang/Object;", "dragOffset", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.InteractionsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Interactions2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartViewConfigurationProvider$lambda$0(Long l, Function2 function2, int i, int i2, Composer composer, int i3) {
        ChartViewConfigurationProvider(l, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: Interactions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.InteractionsKt$scrubDetection$1 */
    static final class C109721 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function1<Offset, Unit> $onScrub;
        final /* synthetic */ Function0<Unit> $onScrubStopped;

        /* JADX WARN: Multi-variable type inference failed */
        C109721(Function1<? super Offset, Unit> function1, Function0<Unit> function0) {
            this.$onScrub = function1;
            this.$onScrubStopped = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Offset> snapshotState, long j) {
            snapshotState.setValue(Offset.m6534boximpl(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(SnapshotState<Offset> snapshotState) {
            return snapshotState.getValue().getPackedValue();
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-1923466393);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1923466393, i, -1, "com.robinhood.android.charts.scrubDetection.<anonymous> (Interactions.kt:31)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.INSTANCE.m6553getZeroF1C5BW0()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(this.$onScrub, composer, 0);
            SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(this.$onScrubStopped, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$onScrub) | composer.changed(this.$onScrubStopped);
            Function1<Offset, Unit> function1 = this.$onScrub;
            Function0<Unit> function0 = this.$onScrubStopped;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Interactions4(function1, snapshotState, function0);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(composed, snapshotState4RememberUpdatedState, snapshotState4RememberUpdatedState2, (PointerInputEventHandler) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierPointerInput;
        }
    }

    @SuppressLint({"UnnecessaryComposedModifier"})
    public static final Modifier scrubDetection(Modifier modifier, Function1<? super Offset, Unit> onScrub, Function0<Unit> onScrubStopped) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Intrinsics.checkNotNullParameter(onScrubStopped, "onScrubStopped");
        return ComposedModifier2.composed$default(modifier, null, new C109721(onScrub, onScrubStopped), 1, null);
    }

    private static final ProvidedValue<ViewConfiguration> providesWithScrubListener(CompositionLocal6<ViewConfiguration> compositionLocal6, final Long l, Composer composer, int i) {
        composer.startReplaceGroup(1225914938);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1225914938, i, -1, "com.robinhood.android.charts.providesWithScrubListener (Interactions.kt:92)");
        }
        final ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(compositionLocal6);
        ProvidedValue<ViewConfiguration> providedValueProvides = compositionLocal6.provides(new ViewConfiguration() { // from class: com.robinhood.android.charts.InteractionsKt$providesWithScrubListener$modifiedViewConfiguration$1
            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public /* bridge */ /* synthetic */ float getHandwritingGestureLineMargin() {
                return super.getHandwritingGestureLineMargin();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public /* bridge */ /* synthetic */ float getHandwritingSlop() {
                return super.getHandwritingSlop();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public /* bridge */ /* synthetic */ float getMaximumFlingVelocity() {
                return super.getMaximumFlingVelocity();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            /* renamed from: getMinimumTouchTargetSize-MYxV2XQ */
            public /* bridge */ /* synthetic */ long mo7313getMinimumTouchTargetSizeMYxV2XQ() {
                return super.mo7313getMinimumTouchTargetSizeMYxV2XQ();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public long getDoubleTapMinTimeMillis() {
                return viewConfiguration.getDoubleTapMinTimeMillis();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public long getDoubleTapTimeoutMillis() {
                return viewConfiguration.getDoubleTapTimeoutMillis();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public long getLongPressTimeoutMillis() {
                Long l2 = l;
                return l2 != null ? l2.longValue() : viewConfiguration.getLongPressTimeoutMillis();
            }

            @Override // androidx.compose.p011ui.platform.ViewConfiguration
            public float getTouchSlop() {
                return viewConfiguration.getTouchSlop();
            }
        });
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return providedValueProvides;
    }

    public static final void ChartViewConfigurationProvider(final Long l, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-563764809);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                l = 200L;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563764809, i3, -1, "com.robinhood.android.charts.ChartViewConfigurationProvider (Interactions.kt:83)");
            }
            CompositionLocal3.CompositionLocalProvider(providesWithScrubListener(CompositionLocalsKt.getLocalViewConfiguration(), l, composerStartRestartGroup, (i3 << 3) & 112), ComposableLambda3.rememberComposableLambda(2082923767, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.InteractionsKt.ChartViewConfigurationProvider.1
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
                        ComposerKt.traceEventStart(2082923767, i5, -1, "com.robinhood.android.charts.ChartViewConfigurationProvider.<anonymous> (Interactions.kt:85)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.InteractionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Interactions2.ChartViewConfigurationProvider$lambda$0(l, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <T> T getDefaulted(Map<Interactions, ? extends T> map, Interactions key) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        T t = map.get(Interactions.DEFAULT);
        if (t != null) {
            return map.getOrDefault(key, t);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
