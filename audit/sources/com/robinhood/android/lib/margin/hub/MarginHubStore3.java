package com.robinhood.android.lib.margin.hub;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.lib.margin.hub.api.models.ApiBuyingPowerHubView;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/android/lib/margin/hub/api/models/ApiBuyingPowerHubView;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.MarginHubStore$buyingPowerHubEndpoint$2", m3645f = "MarginHubStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.margin.hub.MarginHubStore$buyingPowerHubEndpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginHubStore3 extends ContinuationImpl7 implements Function2<ApiBuyingPowerHubView, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginHubStore3(MarginHubStore marginHubStore, Continuation<? super MarginHubStore3> continuation) {
        super(2, continuation);
        this.this$0 = marginHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginHubStore3 marginHubStore3 = new MarginHubStore3(this.this$0, continuation);
        marginHubStore3.L$0 = obj;
        return marginHubStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiBuyingPowerHubView apiBuyingPowerHubView, Continuation<? super Unit> continuation) {
        return ((MarginHubStore3) create(apiBuyingPowerHubView, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ApiBuyingPowerHubView apiBuyingPowerHubView = (ApiBuyingPowerHubView) this.L$0;
            Map map = this.this$0.buyingPowerHubRelays;
            String accountNumber = apiBuyingPowerHubView.getAccountNumber();
            Object objCreate = map.get(accountNumber);
            if (objCreate == null) {
                objCreate = BehaviorRelay.create();
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                map.put(accountNumber, objCreate);
            }
            ((BehaviorRelay) objCreate).accept(apiBuyingPowerHubView.toDbModel());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
