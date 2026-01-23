package com.robinhood.librobinhood.data.store;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* compiled from: OptionChainStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionChainStore$streamActiveUiOptionUnderlierByOptionChain$1 extends FunctionReferenceImpl implements Function1<UUID, Job> {
    OptionChainStore$streamActiveUiOptionUnderlierByOptionChain$1(Object obj) {
        super(1, obj, OptionChainStore.class, "pingOptionChainJob", "pingOptionChainJob(Ljava/util/UUID;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Job invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionChainStore) this.receiver).pingOptionChainJob(p0);
    }
}
