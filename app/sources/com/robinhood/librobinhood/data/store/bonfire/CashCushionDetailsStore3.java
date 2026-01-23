package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.p320db.bonfire.CashCushionDetails;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CashCushionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.CashCushionDetailsStore$endpoint$2", m3645f = "CashCushionDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.CashCushionDetailsStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CashCushionDetailsStore3 extends ContinuationImpl7 implements Function2<UIComponent<? extends GenericAction>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CashCushionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashCushionDetailsStore3(CashCushionDetailsStore cashCushionDetailsStore, Continuation<? super CashCushionDetailsStore3> continuation) {
        super(2, continuation);
        this.this$0 = cashCushionDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CashCushionDetailsStore3 cashCushionDetailsStore3 = new CashCushionDetailsStore3(this.this$0, continuation);
        cashCushionDetailsStore3.L$0 = obj;
        return cashCushionDetailsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UIComponent<? extends GenericAction> uIComponent, Continuation<? super Unit> continuation) {
        return ((CashCushionDetailsStore3) create(uIComponent, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert(new CashCushionDetails((UIComponent) this.L$0, 0, 2, null));
        return Unit.INSTANCE;
    }
}
