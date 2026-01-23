package com.robinhood.android.markethours.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiMarketHours;
import com.robinhood.models.p320db.MarketHours;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.LocalDate;

/* compiled from: MarketHoursStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"j$/time/LocalDate", InquiryField.DateField.TYPE, "Lcom/robinhood/models/api/ApiMarketHours;", "<anonymous>", "(Lj$/time/LocalDate;)Lcom/robinhood/models/api/ApiMarketHours;"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.markethours.data.store.MarketHoursStore$getMarketHoursEndpoint$1", m3645f = "MarketHoursStore.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.markethours.data.store.MarketHoursStore$getMarketHoursEndpoint$1, reason: use source file name */
/* loaded from: classes17.dex */
final class MarketHoursStore3 extends ContinuationImpl7 implements Function2<LocalDate, Continuation<? super ApiMarketHours>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarketHoursStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarketHoursStore3(MarketHoursStore marketHoursStore, Continuation<? super MarketHoursStore3> continuation) {
        super(2, continuation);
        this.this$0 = marketHoursStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketHoursStore3 marketHoursStore3 = new MarketHoursStore3(this.this$0, continuation);
        marketHoursStore3.L$0 = obj;
        return marketHoursStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LocalDate localDate, Continuation<? super ApiMarketHours> continuation) {
        return ((MarketHoursStore3) create(localDate, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        LocalDate localDate = (LocalDate) this.L$0;
        Brokeback brokeback = this.this$0.brokeback;
        this.label = 1;
        Object marketHours = brokeback.getMarketHours(MarketHours.XNYS, localDate, this);
        return marketHours == coroutine_suspended ? coroutine_suspended : marketHours;
    }
}
