package com.robinhood.android.event.detail;

import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope9;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailLiveDataSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.detail.EventDetailLiveDataSectionKt$EventDetailLiveDataSection$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EventDetailLiveDataSection2 implements Function1<ConstrainScope, Unit> {
    final /* synthetic */ ConstraintLayoutBaseScope4 $leftText;
    final /* synthetic */ float $smallSpacing;
    final /* synthetic */ EventDetailLiveDataSectionViewState $state;

    EventDetailLiveDataSection2(ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, float f, EventDetailLiveDataSectionViewState eventDetailLiveDataSectionViewState) {
        this.$leftText = constraintLayoutBaseScope4;
        this.$smallSpacing = f;
        this.$state = eventDetailLiveDataSectionViewState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ConstrainScope constrainScope) {
        invoke2(constrainScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ConstrainScope constrainAs) {
        ConstraintLayoutBaseScope9 gone;
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), this.$leftText.getStart(), this.$smallSpacing, 0.0f, 4, null);
        ConstrainScope.centerVerticallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
        if (this.$state.getLeftContractState() != null && this.$state.getLeftContractState().isActive()) {
            gone = ConstraintLayoutBaseScope9.INSTANCE.getVisible();
        } else {
            gone = ConstraintLayoutBaseScope9.INSTANCE.getGone();
        }
        constrainAs.setVisibility(gone);
    }
}
