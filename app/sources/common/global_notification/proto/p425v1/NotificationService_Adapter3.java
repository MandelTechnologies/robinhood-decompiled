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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcommon/global_notification/proto/v1/StopObservingNotificationResponseDto;", "request", "Lcommon/global_notification/proto/v1/StopObservingNotificationRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "common.global_notification.proto.v1.NotificationService_Adapter$StopObservingNotificationEndpoint$call$1", m3645f = "NotificationService_Adapter.kt", m3646l = {95}, m3647m = "invokeSuspend")
/* renamed from: common.global_notification.proto.v1.NotificationService_Adapter$StopObservingNotificationEndpoint$call$1, reason: use source file name */
/* loaded from: classes18.dex */
final class NotificationService_Adapter3 extends ContinuationImpl7 implements Function2<StopObservingNotificationRequestDto, Continuation<? super StopObservingNotificationResponseDto>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationService_Adapter.StopObservingNotificationEndpoint this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationService_Adapter3(NotificationService_Adapter.StopObservingNotificationEndpoint stopObservingNotificationEndpoint, Continuation<? super NotificationService_Adapter3> continuation) {
        super(2, continuation);
        this.this$0 = stopObservingNotificationEndpoint;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NotificationService_Adapter3 notificationService_Adapter3 = new NotificationService_Adapter3(this.this$0, continuation);
        notificationService_Adapter3.L$0 = obj;
        return notificationService_Adapter3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StopObservingNotificationRequestDto stopObservingNotificationRequestDto, Continuation<? super StopObservingNotificationResponseDto> continuation) {
        return ((NotificationService_Adapter3) create(stopObservingNotificationRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
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
        StopObservingNotificationRequestDto stopObservingNotificationRequestDto = (StopObservingNotificationRequestDto) this.L$0;
        NotificationService notificationService = this.this$0.service;
        this.label = 1;
        Object objStopObservingNotification = notificationService.StopObservingNotification(stopObservingNotificationRequestDto, this);
        return objStopObservingNotification == coroutine_suspended ? coroutine_suspended : objStopObservingNotification;
    }
}
