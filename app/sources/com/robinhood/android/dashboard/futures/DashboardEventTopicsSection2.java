package com.robinhood.android.dashboard.futures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DashboardEventTopicsSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.futures.DashboardEventTopicsSectionKt$DashboardEventTopicsSection$1$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DashboardEventTopicsSection2 extends FunctionReferenceImpl implements Function0<Unit> {
    DashboardEventTopicsSection2(Object obj) {
        super(0, obj, EventTopicsSectionDuxo.class, "onEcHeaderClicked", "onEcHeaderClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((EventTopicsSectionDuxo) this.receiver).onEcHeaderClicked();
    }
}
