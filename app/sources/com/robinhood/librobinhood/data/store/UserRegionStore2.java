package com.robinhood.librobinhood.data.store;

import com.robinhood.api.odyssey.RegionApi;
import com.robinhood.models.api.UserRegion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;

/* compiled from: UserRegionStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/UserRegion;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserRegionStore$getRegionEndpoint$1", m3645f = "UserRegionStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.UserRegionStore$getRegionEndpoint$1, reason: use source file name */
/* loaded from: classes20.dex */
final class UserRegionStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super UserRegion>, Object> {
    int label;
    final /* synthetic */ UserRegionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRegionStore2(UserRegionStore userRegionStore, Continuation<? super UserRegionStore2> continuation) {
        super(2, continuation);
        this.this$0 = userRegionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserRegionStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super UserRegion> continuation) {
        return ((UserRegionStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RegionApi regionApi = this.this$0.regionApi;
                this.label = 1;
                obj = regionApi.getUserRegion(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return (UserRegion) obj;
        } catch (HttpException unused) {
            return this.this$0.defaultRegion;
        }
    }
}
