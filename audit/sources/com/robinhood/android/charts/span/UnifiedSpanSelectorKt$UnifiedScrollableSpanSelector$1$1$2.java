package com.robinhood.android.charts.span;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.utils.compose.TargetedScrollRowScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: UnifiedSpanSelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2<T> implements Function3<TargetedScrollRowScope<T>, Composer, Integer, Unit> {
    final /* synthetic */ T $activeSpanId;
    final /* synthetic */ float $endScrimWidth;
    final /* synthetic */ float $horizontalPadding;
    final /* synthetic */ Function1<T, Unit> $onSpanSelected;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ boolean $showPlaceholder;
    final /* synthetic */ ImmutableList<UnifiedSpan<T>> $spans;
    final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $trailingListItem;
    final /* synthetic */ UnifiedSpanSelectorState<T> $unifiedSpanSelectorState;

    /* JADX WARN: Multi-variable type inference failed */
    UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2(float f, UnifiedSpanSelectorState<T> unifiedSpanSelectorState, ImmutableList<UnifiedSpan<T>> immutableList, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, float f2, T t, Function1<? super T, Unit> function1, boolean z, ScrollState scrollState) {
        this.$horizontalPadding = f;
        this.$unifiedSpanSelectorState = unifiedSpanSelectorState;
        this.$spans = immutableList;
        this.$trailingListItem = function3;
        this.$endScrimWidth = f2;
        this.$activeSpanId = t;
        this.$onSpanSelected = function1;
        this.$showPlaceholder = z;
        this.$scrollState = scrollState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
        invoke((TargetedScrollRowScope) obj, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$5$lambda$1$lambda$0(TargetedScrollRowScope targetedScrollRowScope, UnifiedSpan unifiedSpan, Function1 function1) {
        targetedScrollRowScope.centerOn(unifiedSpan.getId());
        function1.invoke(unifiedSpan.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(TargetedScrollRowScope targetedScrollRowScope, UnifiedSpan unifiedSpan) {
        targetedScrollRowScope.centerOn(unifiedSpan.getId());
        return Unit.INSTANCE;
    }

    public final void invoke(final TargetedScrollRowScope<T> TargetedScrollRow, Composer composer, int i) {
        boolean z;
        SpanDotState spanDotState;
        Intrinsics.checkNotNullParameter(TargetedScrollRow, "$this$TargetedScrollRow");
        int i2 = (i & 6) == 0 ? i | (composer.changed(TargetedScrollRow) ? 4 : 2) : i;
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1685591677, i2, -1, "com.robinhood.android.charts.span.UnifiedScrollableSpanSelector.<anonymous>.<anonymous>.<anonymous> (UnifiedSpanSelector.kt:193)");
        }
        boolean z2 = false;
        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(this.$horizontalPadding - this.$unifiedSpanSelectorState.m12170getBetweenSpanSpaceD9Ej5fM())), composer, 0);
        composer.startReplaceGroup(650936826);
        ImmutableList<UnifiedSpan<T>> immutableList = this.$spans;
        T t = this.$activeSpanId;
        final Function1<T, Unit> function1 = this.$onSpanSelected;
        boolean z3 = this.$showPlaceholder;
        ScrollState scrollState = this.$scrollState;
        for (final UnifiedSpan<T> unifiedSpan : immutableList) {
            boolean zAreEqual = Intrinsics.areEqual(unifiedSpan.getId(), t);
            composer.startReplaceGroup(-1746271574);
            int i3 = i2 & 14;
            boolean zChangedInstance = (i3 == 4 ? true : z2) | composer.changedInstance(unifiedSpan) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2.invoke$lambda$5$lambda$1$lambda$0(TargetedScrollRow, unifiedSpan, function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(650954350);
            Modifier modifierRegisterAsScrollTarget = TargetedScrollRow.registerAsScrollTarget(ModifiersKt.bentoPlaceholder(SizeKt.m5174width3ABfNKs(unifiedSpan.getModifier(), UnifiedSpanSelectorKt.getWidth(unifiedSpan)), (zAreEqual && z3) ? true : z2, SpanSelector3.getSpanButtonShape()), unifiedSpan.getId());
            String educationId = unifiedSpan.getEducationId();
            if (educationId != null) {
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = (i3 == 4) | composer.changedInstance(unifiedSpan);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.charts.span.UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2.invoke$lambda$5$lambda$4$lambda$3$lambda$2(TargetedScrollRow, unifiedSpan);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                Modifier modifierEducationTourId$default = com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(modifierRegisterAsScrollTarget, educationId, function0, (Function0) objRememberedValue2, scrollState.isScrollInProgress(), false, 16, null);
                if (modifierEducationTourId$default != null) {
                    modifierRegisterAsScrollTarget = modifierEducationTourId$default;
                }
            }
            composer.endReplaceGroup();
            boolean z4 = z3;
            String text = unifiedSpan.getText();
            boolean hasCustomIntervals = unifiedSpan.getHasCustomIntervals();
            if (unifiedSpan.getHasBlinkingDot()) {
                spanDotState = new SpanDotState(zAreEqual);
                z = z4;
            } else {
                z = z4;
                spanDotState = null;
            }
            ScrollState scrollState2 = scrollState;
            SpanSelector3.SpanButton(modifierRegisterAsScrollTarget, function0, text, zAreEqual, spanDotState, hasCustomIntervals, !zAreEqual && z, composer, 0, 0);
            function1 = function1;
            z3 = z;
            scrollState = scrollState2;
            z2 = false;
        }
        composer.endReplaceGroup();
        composer.startReplaceGroup(650981142);
        if (this.$trailingListItem != null) {
            Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, this.$unifiedSpanSelectorState.m12170getBetweenSpanSpaceD9Ej5fM()), composer, 0);
            this.$trailingListItem.invoke(TargetedScrollRow, composer, Integer.valueOf(i2 & 14));
        }
        composer.endReplaceGroup();
        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(this.$endScrimWidth - this.$unifiedSpanSelectorState.m12170getBetweenSpanSpaceD9Ej5fM())), composer, 0);
        T t2 = this.$activeSpanId;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance3 = composer.changedInstance(this.$activeSpanId) | ((i2 & 14) == 4);
        T t3 = this.$activeSpanId;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new UnifiedSpanSelectorKt$UnifiedScrollableSpanSelector$1$1$2$2$1(TargetedScrollRow, t3, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(t2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
