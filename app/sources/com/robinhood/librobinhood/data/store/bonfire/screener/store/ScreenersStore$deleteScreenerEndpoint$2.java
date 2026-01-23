package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.robinhood.equityscreener.models.dao.ScreenersDao;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$deleteScreenerEndpoint$2", m3645f = "ScreenersStore.kt", m3646l = {341}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ScreenersStore$deleteScreenerEndpoint$2 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScreenersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenersStore$deleteScreenerEndpoint$2(ScreenersStore screenersStore, Continuation<? super ScreenersStore$deleteScreenerEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = screenersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenersStore$deleteScreenerEndpoint$2 screenersStore$deleteScreenerEndpoint$2 = new ScreenersStore$deleteScreenerEndpoint$2(this.this$0, continuation);
        screenersStore$deleteScreenerEndpoint$2.L$0 = obj;
        return screenersStore$deleteScreenerEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((ScreenersStore$deleteScreenerEndpoint$2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            ScreenersDao screenersDao = this.this$0.screenersDao;
            this.label = 1;
            if (screenersDao.deleteScreenerAndDraftFilters(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
