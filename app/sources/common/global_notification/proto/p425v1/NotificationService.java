package common.global_notification.proto.p425v1;

import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import com.robinhood.idl.RhGenerated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import microgram.annotation.ManagedServices;

/* compiled from: NotificationService.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcommon/global_notification/proto/v1/NotificationService;", "", "Lcommon/global_notification/proto/v1/PostNotificationRequestDto;", "request", "Lcommon/global_notification/proto/v1/PostNotificationResponseDto;", "PostNotification", "(Lcommon/global_notification/proto/v1/PostNotificationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcommon/global_notification/proto/v1/ObserveNotificationRequestDto;", "Lkotlinx/coroutines/flow/Flow;", "Lcommon/global_notification/proto/v1/ObserveNotificationResponseDto;", "ObserveNotification", "(Lcommon/global_notification/proto/v1/ObserveNotificationRequestDto;)Lkotlinx/coroutines/flow/Flow;", "Lcommon/global_notification/proto/v1/StopObservingNotificationRequestDto;", "Lcommon/global_notification/proto/v1/StopObservingNotificationResponseDto;", "StopObservingNotification", "(Lcommon/global_notification/proto/v1/StopObservingNotificationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "global_notification.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@ManagedServices(serviceName = "common.global_notification.proto.v1.NotificationService")
/* loaded from: classes18.dex */
public interface NotificationService {

    /* compiled from: NotificationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "common.global_notification.proto.v1.NotificationService$DefaultImpls", m3645f = "NotificationService.kt", m3646l = {26}, m3647m = "PostNotification")
    /* renamed from: common.global_notification.proto.v1.NotificationService$PostNotification$1 */
    static final class C437851 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C437851(Continuation<? super C437851> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.PostNotification(null, null, this);
        }
    }

    /* compiled from: NotificationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "common.global_notification.proto.v1.NotificationService$DefaultImpls", m3645f = "NotificationService.kt", m3646l = {48}, m3647m = "StopObservingNotification")
    /* renamed from: common.global_notification.proto.v1.NotificationService$StopObservingNotification$1 */
    static final class C437861 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C437861(Continuation<? super C437861> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultImpls.StopObservingNotification(null, null, this);
        }
    }

    Flow<ObserveNotificationResponseDto> ObserveNotification(ObserveNotificationRequestDto request);

    Object PostNotification(PostNotificationRequestDto postNotificationRequestDto, Continuation<? super PostNotificationResponseDto> continuation);

    Object StopObservingNotification(StopObservingNotificationRequestDto stopObservingNotificationRequestDto, Continuation<? super StopObservingNotificationResponseDto> continuation);

    /* compiled from: NotificationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object PostNotification(NotificationService notificationService, Request<PostNotificationRequestDto> request, Continuation<? super Response<PostNotificationResponseDto>> continuation) {
            C437851 c437851;
            if (continuation instanceof C437851) {
                c437851 = (C437851) continuation;
                int i = c437851.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c437851.label = i - Integer.MIN_VALUE;
                } else {
                    c437851 = new C437851(continuation);
                }
            }
            Object objPostNotification = c437851.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c437851.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPostNotification);
                PostNotificationRequestDto data = request.getData();
                c437851.label = 1;
                objPostNotification = notificationService.PostNotification(data, c437851);
                if (objPostNotification == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPostNotification);
            }
            return new Response(objPostNotification, null, 2, null);
        }

        public static Flow<Response<ObserveNotificationResponseDto>> ObserveNotification(NotificationService notificationService, Request<ObserveNotificationRequestDto> request) {
            Intrinsics.checkNotNullParameter(request, "request");
            final Flow<ObserveNotificationResponseDto> flowObserveNotification = notificationService.ObserveNotification(request.getData());
            return new Flow<Response<? extends ObserveNotificationResponseDto>>() { // from class: common.global_notification.proto.v1.NotificationService$DefaultImpls$ObserveNotification$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: common.global_notification.proto.v1.NotificationService$DefaultImpls$ObserveNotification$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "common.global_notification.proto.v1.NotificationService$DefaultImpls$ObserveNotification$$inlined$map$1$2", m3645f = "NotificationService.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: common.global_notification.proto.v1.NotificationService$DefaultImpls$ObserveNotification$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            Response response = new Response((ObserveNotificationResponseDto) obj, null, 2, null);
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(response, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Response<? extends ObserveNotificationResponseDto>> flowCollector, Continuation continuation) {
                    Object objCollect = flowObserveNotification.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object StopObservingNotification(NotificationService notificationService, Request<StopObservingNotificationRequestDto> request, Continuation<? super Response<StopObservingNotificationResponseDto>> continuation) {
            C437861 c437861;
            if (continuation instanceof C437861) {
                c437861 = (C437861) continuation;
                int i = c437861.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c437861.label = i - Integer.MIN_VALUE;
                } else {
                    c437861 = new C437861(continuation);
                }
            }
            Object objStopObservingNotification = c437861.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c437861.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objStopObservingNotification);
                StopObservingNotificationRequestDto data = request.getData();
                c437861.label = 1;
                objStopObservingNotification = notificationService.StopObservingNotification(data, c437861);
                if (objStopObservingNotification == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStopObservingNotification);
            }
            return new Response(objStopObservingNotification, null, 2, null);
        }
    }
}
