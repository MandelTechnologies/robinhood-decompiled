package com.robinhood.android.lib.store.instant;

import com.robinhood.android.lib.models.instant.p169db.InstantDepositCard;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: InstantDepositsCardStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "card", "Lcom/robinhood/android/lib/models/instant/db/InstantDepositCard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.store.instant.InstantDepositsCardStore$endpoint$2", m3645f = "InstantDepositsCardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.store.instant.InstantDepositsCardStore$endpoint$2, reason: use source file name */
/* loaded from: classes8.dex */
final class InstantDepositsCardStore3 extends ContinuationImpl7 implements Function2<InstantDepositCard, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InstantDepositsCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantDepositsCardStore3(InstantDepositsCardStore instantDepositsCardStore, Continuation<? super InstantDepositsCardStore3> continuation) {
        super(2, continuation);
        this.this$0 = instantDepositsCardStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstantDepositsCardStore3 instantDepositsCardStore3 = new InstantDepositsCardStore3(this.this$0, continuation);
        instantDepositsCardStore3.L$0 = obj;
        return instantDepositsCardStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InstantDepositCard instantDepositCard, Continuation<? super Unit> continuation) {
        return ((InstantDepositsCardStore3) create(instantDepositCard, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InstantDepositCard instantDepositCard = (InstantDepositCard) this.L$0;
            StateFlow2 stateFlow2 = this.this$0.cache;
            do {
                value = stateFlow2.getValue();
            } while (!stateFlow2.compareAndSet(value, MapsKt.plus((Map) value, Tuples4.m3642to(instantDepositCard.getAccountNumber(), instantDepositCard))));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
