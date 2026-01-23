package com.robinhood.android.lib.margin.hub;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.margin.hub.api.models.MarginStatusDetailViewResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/lib/margin/hub/api/models/MarginStatusDetailViewResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.MarginHubStore$marginStatusDetailEndpoint$2", m3645f = "MarginHubStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.margin.hub.MarginHubStore$marginStatusDetailEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginHubStore8 extends ContinuationImpl7 implements Function2<MarginStatusDetailViewResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginHubStore8(MarginHubStore marginHubStore, Continuation<? super MarginHubStore8> continuation) {
        super(2, continuation);
        this.this$0 = marginHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginHubStore8 marginHubStore8 = new MarginHubStore8(this.this$0, continuation);
        marginHubStore8.L$0 = obj;
        return marginHubStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MarginStatusDetailViewResponse marginStatusDetailViewResponse, Continuation<? super Unit> continuation) {
        return ((MarginHubStore8) create(marginStatusDetailViewResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MarginStatusDetailViewResponse marginStatusDetailViewResponse = (MarginStatusDetailViewResponse) this.L$0;
            Map map = this.this$0.marginStatusDetailRelays;
            String accountNumber = marginStatusDetailViewResponse.getAccountNumber();
            Object objCreate = map.get(accountNumber);
            if (objCreate == null) {
                objCreate = BehaviorRelay.create();
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                map.put(accountNumber, objCreate);
            }
            ((BehaviorRelay) objCreate).accept(marginStatusDetailViewResponse.toDbModel());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
