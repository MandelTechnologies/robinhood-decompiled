package com.robinhood.librobinhood.data.store;

import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.minerva.ApiMinervaAccount;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MinervaAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/minerva/ApiMinervaAccount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MinervaAccountStore$accountsMaybe$1$1", m3645f = "MinervaAccountStore.kt", m3646l = {WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.MinervaAccountStore$accountsMaybe$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MinervaAccountStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiMinervaAccount>>, Object> {
    final /* synthetic */ String $cursor;
    int label;
    final /* synthetic */ MinervaAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MinervaAccountStore2(MinervaAccountStore minervaAccountStore, String str, Continuation<? super MinervaAccountStore2> continuation) {
        super(2, continuation);
        this.this$0 = minervaAccountStore;
        this.$cursor = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MinervaAccountStore2(this.this$0, this.$cursor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiMinervaAccount>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiMinervaAccount>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiMinervaAccount>> continuation) {
        return ((MinervaAccountStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Minerva minerva = this.this$0.minerva;
        String str = this.$cursor;
        this.label = 1;
        Object accounts2 = minerva.getAccounts(str, this);
        return accounts2 == coroutine_suspended ? coroutine_suspended : accounts2;
    }
}
