package com.robinhood.android.lib.trade.submission;

import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [DATA] */
/* compiled from: OrderSubmissionManager.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.trade.submission.OrderSubmissionManager$submit$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class OrderSubmissionManager4<DATA> extends FunctionReferenceImpl implements Function1<UUID, Single<DATA>> {
    OrderSubmissionManager4(Object obj) {
        super(1, obj, OrderSubmissionManager.class, "fetchOrder", "fetchOrder(Ljava/util/UUID;)Lio/reactivex/Single;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Single<DATA> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OrderSubmissionManager) this.receiver).fetchOrder(p0);
    }
}
