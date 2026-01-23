package com.robinhood.librobinhood.data.store.bonfire.screener.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.equityscreener.models.api.ApiScreenerResponse;
import com.robinhood.equityscreener.models.api.ApiScreenersResponse;
import com.robinhood.equityscreener.models.api.ScreenerOrder;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.equityscreener.models.p294db.Screener3;
import com.robinhood.librobinhood.data.store.bonfire.screener.api.ScreenersApi;
import com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenersStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/librobinhood/data/store/bonfire/screener/store/ScreenersStore$ScreenersResponse;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.screener.store.ScreenersStore$screenersEndpoint$1", m3645f = "ScreenersStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class ScreenersStore$screenersEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ScreenersStore.ScreenersResponse>, Object> {
    int label;
    final /* synthetic */ ScreenersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenersStore$screenersEndpoint$1(ScreenersStore screenersStore, Continuation<? super ScreenersStore$screenersEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = screenersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScreenersStore$screenersEndpoint$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ScreenersStore.ScreenersResponse> continuation) {
        return ((ScreenersStore$screenersEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScreenersApi screenersApi = this.this$0.api;
            Boolean boolBoxBoolean = boxing.boxBoolean(true);
            this.label = 1;
            obj = screenersApi.getScreeners(boolBoxBoolean, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List<ApiScreenerResponse> results = ((ApiScreenersResponse) obj).getResults();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj2 : results) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Screener dbModel = Screener3.toDbModel((ApiScreenerResponse) obj2, i3);
            if (dbModel != null) {
                arrayList.add(dbModel);
            }
            i2 = i3;
        }
        return new ScreenersStore.ScreenersResponse(arrayList, ScreenerOrder.DEFAULT);
    }
}
