package com.robinhood.store.futures;

import com.robinhood.android.models.futures.dao.FuturesCashCorrectionDao;
import com.robinhood.android.models.futures.p189db.FuturesCashCorrection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: FuturesCashCorrectionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.store.futures.FuturesCashCorrectionStore$getCashCorrectionQuery$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class FuturesCashCorrectionStore2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends FuturesCashCorrection>> {
    FuturesCashCorrectionStore2(Object obj) {
        super(1, obj, FuturesCashCorrectionDao.class, "getCashCorrection", "getCashCorrection(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<FuturesCashCorrection> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((FuturesCashCorrectionDao) this.receiver).getCashCorrection(p0);
    }
}
