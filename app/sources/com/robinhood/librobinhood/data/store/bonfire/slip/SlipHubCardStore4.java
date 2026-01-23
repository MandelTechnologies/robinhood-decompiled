package com.robinhood.librobinhood.data.store.bonfire.slip;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: SlipHubCardStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore$refreshAllAccounts$1$launchedCoroutines$1$1", m3645f = "SlipHubCardStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipHubCardStore$refreshAllAccounts$1$launchedCoroutines$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SlipHubCardStore4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ boolean $force;
    int label;
    final /* synthetic */ SlipHubCardStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SlipHubCardStore4(SlipHubCardStore slipHubCardStore, String str, boolean z, Continuation<? super SlipHubCardStore4> continuation) {
        super(2, continuation);
        this.this$0 = slipHubCardStore;
        this.$accountNumber = str;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SlipHubCardStore4(this.this$0, this.$accountNumber, this.$force, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((SlipHubCardStore4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.this$0.refresh(this.$accountNumber, this.$force);
    }
}
