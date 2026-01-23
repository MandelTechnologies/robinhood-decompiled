package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.equityscreener.models.api.ApiScreenerResponse;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.equityscreener.models.p294db.Screener3;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/equityscreener/models/db/Screener;", "id", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$screenerEndpoint$1", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ScreenersStore$screenerEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Optional<? extends Screener>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScreenersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenersStore$screenerEndpoint$1(ScreenersStore screenersStore, Continuation<? super ScreenersStore$screenerEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = screenersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenersStore$screenerEndpoint$1 screenersStore$screenerEndpoint$1 = new ScreenersStore$screenerEndpoint$1(this.this$0, continuation);
        screenersStore$screenerEndpoint$1.L$0 = obj;
        return screenersStore$screenerEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super Optional<? extends Screener>> continuation) {
        return invoke2(str, (Continuation<? super Optional<Screener>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super Optional<Screener>> continuation) {
        return ((ScreenersStore$screenerEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            ScreenersApi screenersApi = this.this$0.api;
            Boolean boolBoxBoolean = boxing.boxBoolean(true);
            this.label = 1;
            obj = screenersApi.getScreener(str, boolBoxBoolean, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Optional3.asOptional(Screener3.toDbModel((ApiScreenerResponse) obj, 0));
    }
}
