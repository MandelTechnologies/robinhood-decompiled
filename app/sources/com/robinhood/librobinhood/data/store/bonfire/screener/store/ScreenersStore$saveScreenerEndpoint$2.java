package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.equityscreener.models.dao.ScreenersDao;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$SaveScreenerResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$saveScreenerEndpoint$2", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, EnumC7081g.f2775xbcb7e6f3}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ScreenersStore$saveScreenerEndpoint$2 extends ContinuationImpl7 implements Function2<ScreenersStore.SaveScreenerResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScreenersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenersStore$saveScreenerEndpoint$2(ScreenersStore screenersStore, Continuation<? super ScreenersStore$saveScreenerEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = screenersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScreenersStore$saveScreenerEndpoint$2 screenersStore$saveScreenerEndpoint$2 = new ScreenersStore$saveScreenerEndpoint$2(this.this$0, continuation);
        screenersStore$saveScreenerEndpoint$2.L$0 = obj;
        return screenersStore$saveScreenerEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ScreenersStore.SaveScreenerResponse saveScreenerResponse, Continuation<? super Unit> continuation) {
        return ((ScreenersStore$saveScreenerEndpoint$2) create(saveScreenerResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r6.insert(r1, r5) != r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ScreenersStore.SaveScreenerResponse saveScreenerResponse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            saveScreenerResponse = (ScreenersStore.SaveScreenerResponse) this.L$0;
            if (saveScreenerResponse.getSavedScreener() != null) {
                ScreenersDao screenersDao = this.this$0.screenersDao;
                String oldId = saveScreenerResponse.getOldId();
                this.L$0 = saveScreenerResponse;
                this.label = 1;
                if (screenersDao.deleteScreenerAndDraftFilters(oldId, this) != coroutine_suspended) {
                    ScreenersDao screenersDao2 = this.this$0.screenersDao;
                    Screener savedScreener = saveScreenerResponse.getSavedScreener();
                    this.L$0 = null;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        saveScreenerResponse = (ScreenersStore.SaveScreenerResponse) this.L$0;
        ResultKt.throwOnFailure(obj);
        ScreenersDao screenersDao22 = this.this$0.screenersDao;
        Screener savedScreener2 = saveScreenerResponse.getSavedScreener();
        this.L$0 = null;
        this.label = 2;
    }
}
