package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiProfilePage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ProfilePageStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiProfilePage;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ProfilePageStore$profilePageEndpoint$1", m3645f = "ProfilePageStore.kt", m3646l = {27}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.ProfilePageStore$profilePageEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ProfilePageStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiProfilePage>, Object> {
    final /* synthetic */ Brokeback $brokeback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfilePageStore2(Brokeback brokeback, Continuation<? super ProfilePageStore2> continuation) {
        super(2, continuation);
        this.$brokeback = brokeback;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfilePageStore2(this.$brokeback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiProfilePage> continuation) {
        return ((ProfilePageStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Brokeback brokeback = this.$brokeback;
        this.label = 1;
        Object profilePage = brokeback.getProfilePage(this);
        return profilePage == coroutine_suspended ? coroutine_suspended : profilePage;
    }
}
