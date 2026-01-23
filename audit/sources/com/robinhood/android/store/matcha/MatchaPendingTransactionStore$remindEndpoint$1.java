package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.MatchaTransactionType;
import com.robinhood.api.matcha.MatchaApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaPendingTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/matcha/api/MatchaTransactionType;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore$remindEndpoint$1", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class MatchaPendingTransactionStore$remindEndpoint$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends MatchaTransactionType>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaPendingTransactionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaPendingTransactionStore$remindEndpoint$1(MatchaPendingTransactionStore matchaPendingTransactionStore, Continuation<? super MatchaPendingTransactionStore$remindEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = matchaPendingTransactionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaPendingTransactionStore$remindEndpoint$1 matchaPendingTransactionStore$remindEndpoint$1 = new MatchaPendingTransactionStore$remindEndpoint$1(this.this$0, continuation);
        matchaPendingTransactionStore$remindEndpoint$1.L$0 = obj;
        return matchaPendingTransactionStore$remindEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends MatchaTransactionType> tuples2, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<UUID, ? extends MatchaTransactionType>) tuples2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ? extends MatchaTransactionType> tuples2, Continuation<? super Unit> continuation) {
        return ((MatchaPendingTransactionStore$remindEndpoint$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            MatchaTransactionType matchaTransactionType = (MatchaTransactionType) tuples2.component2();
            MatchaApi matchaApi = this.this$0.api;
            this.label = 1;
            if (matchaApi.remindTransaction(uuid, matchaTransactionType, this) == coroutine_suspended) {
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
