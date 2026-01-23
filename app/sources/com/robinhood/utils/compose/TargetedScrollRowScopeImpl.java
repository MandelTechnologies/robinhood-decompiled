package com.robinhood.utils.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.HorizontalAlignmentLine;
import androidx.compose.p011ui.layout.Measured;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TargetedScroll.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÂ\u0003J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0015\u0010\u0019\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0097\u0001J\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0097\u0001J!\u0010\u001c\u001a\u00020\u000e*\u00020\u000e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0097\u0001J\r\u0010#\u001a\u00020\u000e*\u00020\u000eH\u0097\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\"HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u001f\u0010+\u001a\u00020\u000e*\u00020\u000e2\b\b\u0001\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020%H\u0097\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006."}, m3636d2 = {"Lcom/robinhood/utils/compose/TargetedScrollRowScopeImpl;", "T", "Lcom/robinhood/utils/compose/TargetedScrollRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "targetedScrollState", "Lcom/robinhood/utils/compose/TargetedScrollState;", "rowScope", "<init>", "(Lcom/robinhood/utils/compose/TargetedScrollState;Landroidx/compose/foundation/layout/RowScope;)V", "scrollState", "Landroidx/compose/foundation/ScrollState;", "getScrollState", "()Landroidx/compose/foundation/ScrollState;", "registerAsScrollTarget", "Landroidx/compose/ui/Modifier;", "key", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;", "centerOn", "", "target", "(Ljava/lang/Object;)V", "scrollTo", "component1", "component2", "copy", "align", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignByBaseline", "equals", "", "other", "", "hashCode", "toString", "", "weight", "", "fill", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final /* data */ class TargetedScrollRowScopeImpl<T> implements TargetedScrollRowScope<T>, Row5 {
    private final Row5 rowScope;
    private final ScrollState scrollState;
    private final TargetedScrollState<T> targetedScrollState;

    private final TargetedScrollState<T> component1() {
        return this.targetedScrollState;
    }

    /* renamed from: component2, reason: from getter */
    private final Row5 getRowScope() {
        return this.rowScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TargetedScrollRowScopeImpl copy$default(TargetedScrollRowScopeImpl targetedScrollRowScopeImpl, TargetedScrollState targetedScrollState, Row5 row5, int i, Object obj) {
        if ((i & 1) != 0) {
            targetedScrollState = targetedScrollRowScopeImpl.targetedScrollState;
        }
        if ((i & 2) != 0) {
            row5 = targetedScrollRowScopeImpl.rowScope;
        }
        return targetedScrollRowScopeImpl.copy(targetedScrollState, row5);
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope, androidx.compose.foundation.layout.Row5
    public Modifier align(Modifier modifier, Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.rowScope.align(modifier, alignment);
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope, androidx.compose.foundation.layout.Row5
    public Modifier alignBy(Modifier modifier, HorizontalAlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        return this.rowScope.alignBy(modifier, alignmentLine);
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope, androidx.compose.foundation.layout.Row5
    public Modifier alignBy(Modifier modifier, Function1<? super Measured, Integer> alignmentLineBlock) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
        return this.rowScope.alignBy(modifier, alignmentLineBlock);
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope, androidx.compose.foundation.layout.Row5
    public Modifier alignByBaseline(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.rowScope.alignByBaseline(modifier);
    }

    public final TargetedScrollRowScopeImpl<T> copy(TargetedScrollState<T> targetedScrollState, Row5 rowScope) {
        Intrinsics.checkNotNullParameter(targetedScrollState, "targetedScrollState");
        Intrinsics.checkNotNullParameter(rowScope, "rowScope");
        return new TargetedScrollRowScopeImpl<>(targetedScrollState, rowScope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetedScrollRowScopeImpl)) {
            return false;
        }
        TargetedScrollRowScopeImpl targetedScrollRowScopeImpl = (TargetedScrollRowScopeImpl) other;
        return Intrinsics.areEqual(this.targetedScrollState, targetedScrollRowScopeImpl.targetedScrollState) && Intrinsics.areEqual(this.rowScope, targetedScrollRowScopeImpl.rowScope);
    }

    public int hashCode() {
        return (this.targetedScrollState.hashCode() * 31) + this.rowScope.hashCode();
    }

    public String toString() {
        return "TargetedScrollRowScopeImpl(targetedScrollState=" + this.targetedScrollState + ", rowScope=" + this.rowScope + ")";
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope, androidx.compose.foundation.layout.Row5
    public Modifier weight(Modifier modifier, float f, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return this.rowScope.weight(modifier, f, z);
    }

    public TargetedScrollRowScopeImpl(TargetedScrollState<T> targetedScrollState, Row5 rowScope) {
        Intrinsics.checkNotNullParameter(targetedScrollState, "targetedScrollState");
        Intrinsics.checkNotNullParameter(rowScope, "rowScope");
        this.targetedScrollState = targetedScrollState;
        this.rowScope = rowScope;
        this.scrollState = targetedScrollState.getScrollState();
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope
    public ScrollState getScrollState() {
        return this.scrollState;
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope
    public Modifier registerAsScrollTarget(Modifier modifier, T t) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return TargetedScrollKt.registerAsScrollTarget(modifier, t, this.targetedScrollState);
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope
    public void centerOn(T target) {
        this.targetedScrollState.centerOn(target);
    }

    @Override // com.robinhood.utils.compose.TargetedScrollRowScope
    public void scrollTo(T target) {
        this.targetedScrollState.scrollTo(target);
    }
}
