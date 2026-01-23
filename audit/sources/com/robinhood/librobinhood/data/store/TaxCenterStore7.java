package com.robinhood.librobinhood.data.store;

import com.robinhood.android.models.taxcenter.dao.TaxCenterTimelineDao;
import com.robinhood.android.models.taxcenter.p195db.TaxCenterTimeline;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: TaxCenterStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.TaxCenterStore$timelineEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class TaxCenterStore7 extends AdaptedFunctionReference implements Function2<TaxCenterTimeline, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    TaxCenterStore7(Object obj) {
        super(2, obj, TaxCenterTimelineDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TaxCenterTimeline taxCenterTimeline, Continuation<? super Unit> continuation) {
        return TaxCenterStore.timelineEndpoint$insert((TaxCenterTimelineDao) this.receiver, taxCenterTimeline, continuation);
    }
}
