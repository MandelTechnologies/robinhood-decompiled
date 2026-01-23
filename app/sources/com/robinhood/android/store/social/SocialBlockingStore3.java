package com.robinhood.android.store.social;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiSocialBlockedUser;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SocialBlockingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockedUser;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.social.SocialBlockingStore$getBlockedUsers$2", m3645f = "SocialBlockingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.social.SocialBlockingStore$getBlockedUsers$2, reason: use source file name */
/* loaded from: classes5.dex */
final class SocialBlockingStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiSocialBlockedUser>, Continuation<? super Unit>, Object> {
    int label;

    SocialBlockingStore3(Continuation<? super SocialBlockingStore3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SocialBlockingStore3(continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiSocialBlockedUser> paginatedResult, Continuation<? super Unit> continuation) {
        return ((SocialBlockingStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiSocialBlockedUser> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiSocialBlockedUser>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
