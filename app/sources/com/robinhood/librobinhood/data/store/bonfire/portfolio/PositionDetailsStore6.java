package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.InstrumentDetails3;
import com.robinhood.android.models.portfolio.PositionDetails;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: PositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/portfolio/PositionDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$positionDetailsQuery$2$1", m3645f = "PositionDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$positionDetailsQuery$2$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionDetailsStore6 extends ContinuationImpl7 implements Function2<PositionDetails, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionDetailsStore6(PositionDetailsStore positionDetailsStore, Continuation<? super PositionDetailsStore6> continuation) {
        super(2, continuation);
        this.this$0 = positionDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionDetailsStore6 positionDetailsStore6 = new PositionDetailsStore6(this.this$0, continuation);
        positionDetailsStore6.L$0 = obj;
        return positionDetailsStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionDetails positionDetails, Continuation<? super Unit> continuation) {
        return ((PositionDetailsStore6) create(positionDetails, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PositionDetails positionDetails = (PositionDetails) this.L$0;
        if (positionDetails != null) {
            positionDetails.setChart((InstrumentDetails3.Chart) this.this$0.chartCache.get(positionDetails.getInstrumentId()));
        }
        return Unit.INSTANCE;
    }
}
