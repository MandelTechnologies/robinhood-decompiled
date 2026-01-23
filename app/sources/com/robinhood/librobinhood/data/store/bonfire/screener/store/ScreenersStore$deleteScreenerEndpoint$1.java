package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "id"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$deleteScreenerEndpoint$1", m3645f = "ScreenersStore.kt", m3646l = {334}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ScreenersStore$deleteScreenerEndpoint$1 extends ContinuationImpl7 implements Function2<String, Continuation<? super String>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScreenersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenersStore$deleteScreenerEndpoint$1(ScreenersStore screenersStore, Continuation<? super ScreenersStore$deleteScreenerEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = screenersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenersStore$deleteScreenerEndpoint$1 screenersStore$deleteScreenerEndpoint$1 = new ScreenersStore$deleteScreenerEndpoint$1(this.this$0, continuation);
        screenersStore$deleteScreenerEndpoint$1.L$0 = obj;
        return screenersStore$deleteScreenerEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super String> continuation) {
        return ((ScreenersStore$deleteScreenerEndpoint$1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return str;
            } catch (Exception unused) {
                return str;
            }
        }
        ResultKt.throwOnFailure(obj);
        String str2 = (String) this.L$0;
        try {
            ScreenersApi screenersApi = this.this$0.api;
            this.L$0 = str2;
            this.label = 1;
            return screenersApi.deleteScreener(str2, this) == coroutine_suspended ? coroutine_suspended : str2;
        } catch (Exception unused2) {
            return str2;
        }
    }
}
