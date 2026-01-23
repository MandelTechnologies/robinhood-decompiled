package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.rosetta.eventlogging.RHYContext;
import io.reactivex.Single;
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
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: RhyAccountLoggingStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/rosetta/eventlogging/RHYContext$AccountType;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore$rhyContextAccountTypeEndpoint$1", m3645f = "RhyAccountLoggingStore.kt", m3646l = {78}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyAccountLoggingStore$rhyContextAccountTypeEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyAccountLoggingStore3 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super RHYContext.AccountType>, Object> {
    int label;
    final /* synthetic */ RhyAccountLoggingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyAccountLoggingStore3(RhyAccountLoggingStore rhyAccountLoggingStore, Continuation<? super RhyAccountLoggingStore3> continuation) {
        super(2, continuation);
        this.this$0 = rhyAccountLoggingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyAccountLoggingStore3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super RHYContext.AccountType> continuation) {
        return ((RhyAccountLoggingStore3) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Single single = this.this$0.rhyContextAccountTypeSingle;
            this.label = 1;
            obj = RxAwait3.await(single, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "await(...)");
        return obj;
    }
}
