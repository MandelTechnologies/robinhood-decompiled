package com.robinhood.android.event.detail;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailLiveDataSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$2$4$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventDetailLiveDataSection5 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $endGuideline;
    final /* synthetic */ ConstraintLayoutBaseScope4 $primaryText;
    final /* synthetic */ ConstraintLayoutBaseScope.VerticalAnchor $startGuideline;
    final /* synthetic */ EventDetailLiveDataSectionViewState $state;

    EventDetailLiveDataSection5(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor, ConstraintLayoutBaseScope.VerticalAnchor verticalAnchor2, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState) {
        this.$primaryText = constraintLayoutBaseScope4;
        this.$startGuideline = verticalAnchor;
        this.$endGuideline = verticalAnchor2;
        this.$state = eventDetailLiveDataSectionViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        constrainAs.setWidth(Dimension.INSTANCE.getPreferredWrapContent());
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), this.$primaryText.getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), this.$startGuideline, 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$endGuideline, 0.0f, 0.0f, 6, null);
        constrainAs.setVisibility(this.$state.getSecondaryText() != null ? ConstraintLayoutBaseScope9.INSTANCE.getVisible() : ConstraintLayoutBaseScope9.INSTANCE.getGone());
    }
}
