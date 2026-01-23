package com.robinhood.api.utils;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.PaginatedResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: NetworkRefreshPaginated.kt */
@kotlin.Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.NetworkRefreshPaginated$saveAction$1$1, reason: use source file name */
/* loaded from: classes16.dex */
/* synthetic */ class NetworkRefreshPaginated2<T> extends FunctionReferenceImpl implements Function1<PaginatedResult<? extends T>, Unit> {
    NetworkRefreshPaginated2(Object obj) {
        super(1, obj, SaveAction.class, AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "save(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((PaginatedResult) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(PaginatedResult<? extends T> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((SaveAction) this.receiver).save(p0);
    }
}
