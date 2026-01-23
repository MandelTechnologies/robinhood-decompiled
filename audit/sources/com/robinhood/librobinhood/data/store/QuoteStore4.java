package com.robinhood.librobinhood.data.store;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.models.api.ApiQuote;
import com.robinhood.models.p355ui.Historical;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: QuoteStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiQuote;", "id", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.QuoteStore$getQuote$1", m3645f = "QuoteStore.kt", m3646l = {92}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.QuoteStore$getQuote$1, reason: use source file name */
/* loaded from: classes13.dex */
final class QuoteStore4 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiQuote>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuoteStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    QuoteStore4(QuoteStore quoteStore, Continuation<? super QuoteStore4> continuation) {
        super(2, continuation);
        this.this$0 = quoteStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuoteStore4 quoteStore4 = new QuoteStore4(this.this$0, continuation);
        quoteStore4.L$0 = obj;
        return quoteStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiQuote> continuation) {
        return ((QuoteStore4) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        EquitiesBrokeback equitiesBrokeback = this.this$0.equitiesBrokeback;
        Boolean boolBoxBoolean = boxing.boxBoolean(true);
        String serverValue = Historical.Bounds.ADT_24_5.getServerValue();
        this.label = 1;
        Object quote$default = EquitiesBrokeback.DefaultImpls.getQuote$default(equitiesBrokeback, uuid, boolBoxBoolean, serverValue, null, this, 8, null);
        return quote$default == coroutine_suspended ? coroutine_suspended : quote$default;
    }
}
