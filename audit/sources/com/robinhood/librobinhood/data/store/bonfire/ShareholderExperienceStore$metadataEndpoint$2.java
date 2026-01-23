package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.bonfire.QaEventMetadataDao;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ShareholderExperienceStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class ShareholderExperienceStore$metadataEndpoint$2 extends AdaptedFunctionReference implements Function2<QaEventMetadata, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    ShareholderExperienceStore$metadataEndpoint$2(Object obj) {
        super(2, obj, QaEventMetadataDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(QaEventMetadata qaEventMetadata, Continuation<? super Unit> continuation) {
        return ShareholderExperienceStore.metadataEndpoint$insert((QaEventMetadataDao) this.receiver, qaEventMetadata, continuation);
    }
}
