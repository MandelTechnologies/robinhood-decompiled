package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.bonfire.RhyCashTabBannerState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RhyCashTabBannerStateStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.RhyCashTabBannerStateStore$pollQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class RhyCashTabBannerStateStore5 extends FunctionReferenceImpl implements Function1<Unit, Flow<? extends RhyCashTabBannerState>> {
    RhyCashTabBannerStateStore5(Object obj) {
        super(1, obj, RhyCashTabBannerStateStore.class, "getRhyCashTabBannerState", "getRhyCashTabBannerState(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<RhyCashTabBannerState> invoke(Unit p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((RhyCashTabBannerStateStore) this.receiver).getRhyCashTabBannerState(p0);
    }
}
