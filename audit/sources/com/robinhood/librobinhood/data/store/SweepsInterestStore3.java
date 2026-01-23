package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiSweepsInterest;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SweepsInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/models/api/ApiSweepsInterest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SweepsInterestStore$sweepsInterestEndpoint$2", m3645f = "SweepsInterestStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.SweepsInterestStore$sweepsInterestEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SweepsInterestStore3 extends ContinuationImpl7 implements Function2<Tuples2<? extends Optional<? extends String>, ? extends ApiSweepsInterest>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SweepsInterestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepsInterestStore3(SweepsInterestStore sweepsInterestStore, Continuation<? super SweepsInterestStore3> continuation) {
        super(2, continuation);
        this.this$0 = sweepsInterestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SweepsInterestStore3 sweepsInterestStore3 = new SweepsInterestStore3(this.this$0, continuation);
        sweepsInterestStore3.L$0 = obj;
        return sweepsInterestStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Optional<? extends String>, ? extends ApiSweepsInterest> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<? extends Optional<String>, ApiSweepsInterest>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Optional<String>, ApiSweepsInterest> tuples2, Continuation<? super Unit> continuation) {
        return ((SweepsInterestStore3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            Optional optional = (Optional) tuples2.component1();
            this.this$0.dao.insertSweepsInterest((ApiSweepsInterest) tuples2.component2(), (String) optional.getOrNull());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
