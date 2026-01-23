package com.robinhood.android.store.social;

import com.robinhood.api.social.SocialBonfireApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.bonfire.ApiSocialBlockedUser;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SocialBlockingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockedUser;", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.social.SocialBlockingStore$getBlockedUsers$1", m3645f = "SocialBlockingStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.store.social.SocialBlockingStore$getBlockedUsers$1, reason: use source file name */
/* loaded from: classes5.dex */
final class SocialBlockingStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Unit, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiSocialBlockedUser>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SocialBlockingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SocialBlockingStore2(SocialBlockingStore socialBlockingStore, Continuation<? super SocialBlockingStore2> continuation) {
        super(2, continuation);
        this.this$0 = socialBlockingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SocialBlockingStore2 socialBlockingStore2 = new SocialBlockingStore2(this.this$0, continuation);
        socialBlockingStore2.L$0 = obj;
        return socialBlockingStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Unit, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiSocialBlockedUser>> continuation) {
        return invoke2((Tuples2<Unit, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiSocialBlockedUser>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<Unit, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiSocialBlockedUser>> continuation) {
        return ((SocialBlockingStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PaginationCursor paginationCursor = (PaginationCursor) ((Tuples2) this.L$0).component2();
        SocialBonfireApi socialBonfireApi = this.this$0.bonfire;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        this.label = 1;
        Object socialBlockedUsers = socialBonfireApi.getSocialBlockedUsers(10, value, this);
        return socialBlockedUsers == coroutine_suspended ? coroutine_suspended : socialBlockedUsers;
    }
}
