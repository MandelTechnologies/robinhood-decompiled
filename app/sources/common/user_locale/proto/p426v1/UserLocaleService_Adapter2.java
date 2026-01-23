package common.user_locale.proto.p426v1;

import common.user_locale.proto.p426v1.UserLocaleService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UserLocaleService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcommon/user_locale/proto/v1/GetUserLocaleResponseDto;", "request", "Lcommon/user_locale/proto/v1/GetUserLocaleRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "common.user_locale.proto.v1.UserLocaleService_Adapter$GetUserLocaleEndpoint$call$1", m3645f = "UserLocaleService_Adapter.kt", m3646l = {55}, m3647m = "invokeSuspend")
/* renamed from: common.user_locale.proto.v1.UserLocaleService_Adapter$GetUserLocaleEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class UserLocaleService_Adapter2 extends ContinuationImpl7 implements Function2<GetUserLocaleRequestDto, Continuation<? super GetUserLocaleResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserLocaleService_Adapter.GetUserLocaleEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserLocaleService_Adapter2(UserLocaleService_Adapter.GetUserLocaleEndpoint getUserLocaleEndpoint, Continuation<? super UserLocaleService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = getUserLocaleEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserLocaleService_Adapter2 userLocaleService_Adapter2 = new UserLocaleService_Adapter2(this.this$0, continuation);
        userLocaleService_Adapter2.L$0 = obj;
        return userLocaleService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GetUserLocaleRequestDto getUserLocaleRequestDto, Continuation<? super GetUserLocaleResponseDto> continuation) {
        return ((UserLocaleService_Adapter2) create(getUserLocaleRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        GetUserLocaleRequestDto getUserLocaleRequestDto = (GetUserLocaleRequestDto) this.L$0;
        UserLocaleService userLocaleService = this.this$0.service;
        this.label = 1;
        Object objGetUserLocale = userLocaleService.GetUserLocale(getUserLocaleRequestDto, this);
        return objGetUserLocale == coroutine_suspended ? coroutine_suspended : objGetUserLocale;
    }
}
