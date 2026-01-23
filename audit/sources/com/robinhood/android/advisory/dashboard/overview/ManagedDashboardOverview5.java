package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.models.serverdriven.experimental.api.CursorData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ManagedDashboardOverview.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewKt$ManagedDashboardOverview$1$4$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ManagedDashboardOverview5 extends FunctionReferenceImpl implements Function1<CursorData, Unit> {
    ManagedDashboardOverview5(Object obj) {
        super(1, obj, ManagedDashboardOverviewDuxo.class, "onCursorDataChanged", "onCursorDataChanged(Lcom/robinhood/models/serverdriven/experimental/api/CursorData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CursorData cursorData) {
        invoke2(cursorData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CursorData cursorData) {
        ((ManagedDashboardOverviewDuxo) this.receiver).onCursorDataChanged(cursorData);
    }
}
