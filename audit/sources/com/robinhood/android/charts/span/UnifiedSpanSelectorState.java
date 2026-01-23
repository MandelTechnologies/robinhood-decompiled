package com.robinhood.android.charts.span;

import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: UnifiedSpanSelector.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Ba\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004HÆ\u0003J\u000e\u0010#\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u0010\u0010(\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010 Jv\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00028\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000f\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 ¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/charts/span/UnifiedSpanSelectorState;", "T", "", "spans", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/charts/span/UnifiedSpan;", "activeSpanId", "onSpanSelected", "Lkotlin/Function1;", "", "showPlaceholder", "", "gradientMaskBrush", "Landroidx/compose/ui/graphics/Brush;", "showFadeScrim", "betweenSpanSpace", "Landroidx/compose/ui/unit/Dp;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/graphics/Brush;ZFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSpans", "()Lkotlinx/collections/immutable/ImmutableList;", "getActiveSpanId", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOnSpanSelected", "()Lkotlin/jvm/functions/Function1;", "getShowPlaceholder", "()Z", "getGradientMaskBrush", "()Landroidx/compose/ui/graphics/Brush;", "getShowFadeScrim", "getBetweenSpanSpace-D9Ej5fM", "()F", "F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7-D9Ej5fM", "copy", "copy-6ZxE2Lo", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/ui/graphics/Brush;ZF)Lcom/robinhood/android/charts/span/UnifiedSpanSelectorState;", "equals", "other", "hashCode", "", "toString", "", "lib-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UnifiedSpanSelectorState<T> {
    public static final int $stable = 0;
    private final T activeSpanId;
    private final float betweenSpanSpace;
    private final Brush gradientMaskBrush;
    private final Function1<T, Unit> onSpanSelected;
    private final boolean showFadeScrim;
    private final boolean showPlaceholder;
    private final ImmutableList<UnifiedSpan<T>> spans;

    public /* synthetic */ UnifiedSpanSelectorState(ImmutableList immutableList, Object obj, Function1 function1, boolean z, Brush brush, boolean z2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, obj, function1, z, brush, z2, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-6ZxE2Lo$default, reason: not valid java name */
    public static /* synthetic */ UnifiedSpanSelectorState m12167copy6ZxE2Lo$default(UnifiedSpanSelectorState unifiedSpanSelectorState, ImmutableList immutableList, Object obj, Function1 function1, boolean z, Brush brush, boolean z2, float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            immutableList = unifiedSpanSelectorState.spans;
        }
        T t = obj;
        if ((i & 2) != 0) {
            t = unifiedSpanSelectorState.activeSpanId;
        }
        if ((i & 4) != 0) {
            function1 = unifiedSpanSelectorState.onSpanSelected;
        }
        if ((i & 8) != 0) {
            z = unifiedSpanSelectorState.showPlaceholder;
        }
        if ((i & 16) != 0) {
            brush = unifiedSpanSelectorState.gradientMaskBrush;
        }
        if ((i & 32) != 0) {
            z2 = unifiedSpanSelectorState.showFadeScrim;
        }
        if ((i & 64) != 0) {
            f = unifiedSpanSelectorState.betweenSpanSpace;
        }
        boolean z3 = z2;
        float f2 = f;
        Brush brush2 = brush;
        Function1 function12 = function1;
        return unifiedSpanSelectorState.m12169copy6ZxE2Lo(immutableList, t, function12, z, brush2, z3, f2);
    }

    public final ImmutableList<UnifiedSpan<T>> component1() {
        return this.spans;
    }

    public final T component2() {
        return this.activeSpanId;
    }

    public final Function1<T, Unit> component3() {
        return this.onSpanSelected;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowPlaceholder() {
        return this.showPlaceholder;
    }

    /* renamed from: component5, reason: from getter */
    public final Brush getGradientMaskBrush() {
        return this.gradientMaskBrush;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShowFadeScrim() {
        return this.showFadeScrim;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBetweenSpanSpace() {
        return this.betweenSpanSpace;
    }

    /* renamed from: copy-6ZxE2Lo, reason: not valid java name */
    public final UnifiedSpanSelectorState<T> m12169copy6ZxE2Lo(ImmutableList<UnifiedSpan<T>> spans, T activeSpanId, Function1<? super T, Unit> onSpanSelected, boolean showPlaceholder, Brush gradientMaskBrush, boolean showFadeScrim, float betweenSpanSpace) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        return new UnifiedSpanSelectorState<>(spans, activeSpanId, onSpanSelected, showPlaceholder, gradientMaskBrush, showFadeScrim, betweenSpanSpace, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedSpanSelectorState)) {
            return false;
        }
        UnifiedSpanSelectorState unifiedSpanSelectorState = (UnifiedSpanSelectorState) other;
        return Intrinsics.areEqual(this.spans, unifiedSpanSelectorState.spans) && Intrinsics.areEqual(this.activeSpanId, unifiedSpanSelectorState.activeSpanId) && Intrinsics.areEqual(this.onSpanSelected, unifiedSpanSelectorState.onSpanSelected) && this.showPlaceholder == unifiedSpanSelectorState.showPlaceholder && Intrinsics.areEqual(this.gradientMaskBrush, unifiedSpanSelectorState.gradientMaskBrush) && this.showFadeScrim == unifiedSpanSelectorState.showFadeScrim && C2002Dp.m7997equalsimpl0(this.betweenSpanSpace, unifiedSpanSelectorState.betweenSpanSpace);
    }

    public int hashCode() {
        int iHashCode = this.spans.hashCode() * 31;
        T t = this.activeSpanId;
        int iHashCode2 = (((((iHashCode + (t == null ? 0 : t.hashCode())) * 31) + this.onSpanSelected.hashCode()) * 31) + Boolean.hashCode(this.showPlaceholder)) * 31;
        Brush brush = this.gradientMaskBrush;
        return ((((iHashCode2 + (brush != null ? brush.hashCode() : 0)) * 31) + Boolean.hashCode(this.showFadeScrim)) * 31) + C2002Dp.m7998hashCodeimpl(this.betweenSpanSpace);
    }

    public String toString() {
        return "UnifiedSpanSelectorState(spans=" + this.spans + ", activeSpanId=" + this.activeSpanId + ", onSpanSelected=" + this.onSpanSelected + ", showPlaceholder=" + this.showPlaceholder + ", gradientMaskBrush=" + this.gradientMaskBrush + ", showFadeScrim=" + this.showFadeScrim + ", betweenSpanSpace=" + C2002Dp.m7999toStringimpl(this.betweenSpanSpace) + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    private UnifiedSpanSelectorState(ImmutableList<UnifiedSpan<T>> spans, T t, Function1<? super T, Unit> onSpanSelected, boolean z, Brush brush, boolean z2, float f) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        Intrinsics.checkNotNullParameter(onSpanSelected, "onSpanSelected");
        this.spans = spans;
        this.activeSpanId = t;
        this.onSpanSelected = onSpanSelected;
        this.showPlaceholder = z;
        this.gradientMaskBrush = brush;
        this.showFadeScrim = z2;
        this.betweenSpanSpace = f;
    }

    public final ImmutableList<UnifiedSpan<T>> getSpans() {
        return this.spans;
    }

    public final T getActiveSpanId() {
        return this.activeSpanId;
    }

    public final Function1<T, Unit> getOnSpanSelected() {
        return this.onSpanSelected;
    }

    public final boolean getShowPlaceholder() {
        return this.showPlaceholder;
    }

    public final Brush getGradientMaskBrush() {
        return this.gradientMaskBrush;
    }

    public final boolean getShowFadeScrim() {
        return this.showFadeScrim;
    }

    public /* synthetic */ UnifiedSpanSelectorState(ImmutableList immutableList, Object obj, Function1 function1, boolean z, Brush brush, boolean z2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableList, obj, function1, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : brush, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? SpanSelector2.INSTANCE.m12141getBetweenSpanSpaceD9Ej5fM() : f, null);
    }

    /* renamed from: getBetweenSpanSpace-D9Ej5fM, reason: not valid java name */
    public final float m12170getBetweenSpanSpaceD9Ej5fM() {
        return this.betweenSpanSpace;
    }
}
