package com.robinhood.android.directipo.allocation.p104ui;

import android.content.res.Resources;
import com.robinhood.directipo.models.p293ui.UiDirectIpoSummary;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoSummaryFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoSummaryFragment$statItemAdapter$1, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class DirectIpoSummaryFragment3 extends FunctionReferenceImpl implements Function2<DirectIpoSummaryStatItemView, UiDirectIpoSummary.StatItem, Unit> {
    public static final DirectIpoSummaryFragment3 INSTANCE = new DirectIpoSummaryFragment3();

    DirectIpoSummaryFragment3() {
        super(2, DirectIpoSummaryStatItemView.class, "bind", "bind(Lcom/robinhood/directipo/models/ui/UiDirectIpoSummary$StatItem;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(DirectIpoSummaryStatItemView directIpoSummaryStatItemView, UiDirectIpoSummary.StatItem statItem) throws Resources.NotFoundException {
        invoke2(directIpoSummaryStatItemView, statItem);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(DirectIpoSummaryStatItemView p0, UiDirectIpoSummary.StatItem p1) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        p0.bind(p1);
    }
}
