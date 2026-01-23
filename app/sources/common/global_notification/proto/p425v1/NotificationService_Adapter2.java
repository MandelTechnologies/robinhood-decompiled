package common.global_notification.proto.p425v1;

import common.global_notification.proto.p425v1.NotificationService_Adapter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: NotificationService_Adapter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcommon/global_notification/proto/v1/PostNotificationResponseDto;", "request", "Lcommon/global_notification/proto/v1/PostNotificationRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "common.global_notification.proto.v1.NotificationService_Adapter$PostNotificationEndpoint$call$1", m3645f = "NotificationService_Adapter.kt", m3646l = {77}, m3647m = "invokeSuspend")
/* renamed from: common.global_notification.proto.v1.NotificationService_Adapter$PostNotificationEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class NotificationService_Adapter2 extends ContinuationImpl7 implements Function2<PostNotificationRequestDto, Continuation<? super PostNotificationResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationService_Adapter.PostNotificationEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationService_Adapter2(NotificationService_Adapter.PostNotificationEndpoint postNotificationEndpoint, Continuation<? super NotificationService_Adapter2> continuation) {
        super(2, continuation);
        this.this$0 = postNotificationEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationService_Adapter2 notificationService_Adapter2 = new NotificationService_Adapter2(this.this$0, continuation);
        notificationService_Adapter2.L$0 = obj;
        return notificationService_Adapter2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PostNotificationRequestDto postNotificationRequestDto, Continuation<? super PostNotificationResponseDto> continuation) {
        return ((NotificationService_Adapter2) create(postNotificationRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PostNotificationRequestDto postNotificationRequestDto = (PostNotificationRequestDto) this.L$0;
        NotificationService notificationService = this.this$0.service;
        this.label = 1;
        Object objPostNotification = notificationService.PostNotification(postNotificationRequestDto, this);
        return objPostNotification == coroutine_suspended ? coroutine_suspended : objPostNotification;
    }
}
