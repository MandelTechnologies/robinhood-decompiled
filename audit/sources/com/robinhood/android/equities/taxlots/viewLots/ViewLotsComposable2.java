package com.robinhood.android.equities.taxlots.viewLots;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: ViewLotsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equities.taxlots.viewLots.ViewLotsComposableKt$ViewLotsComposable$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class ViewLotsComposable2 extends FunctionReferenceImpl implements Function3<String, UUID, UUID, Job> {
    ViewLotsComposable2(Object obj) {
        super(3, obj, ViewLotsDuxo.class, "bind", "bind(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Job invoke(String p0, UUID p1, UUID p2) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        return ((ViewLotsDuxo) this.receiver).bind(p0, p1, p2);
    }
}
