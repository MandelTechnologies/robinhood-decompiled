package com.robinhood.shared.microgram.common.services;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.robinhood.Logger;
import com.robinhood.idl.Request;
import com.robinhood.idl.Response;
import common.global_notification.proto.p425v1.NotificationService;
import common.global_notification.proto.p425v1.ObserveNotificationRequestDto;
import common.global_notification.proto.p425v1.ObserveNotificationResponseDto;
import common.global_notification.proto.p425v1.PostNotificationRequestDto;
import common.global_notification.proto.p425v1.PostNotificationResponseDto;
import common.global_notification.proto.p425v1.StopObservingNotificationRequestDto;
import common.global_notification.proto.p425v1.StopObservingNotificationResponseDto;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;

/* compiled from: RealNotificationService.kt */
@Metadata(m3635d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\r\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealNotificationService;", "Lcommon/global_notification/proto/v1/NotificationService;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "relay", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcommon/global_notification/proto/v1/PostNotificationRequestDto;", "broadcastReceiverRegistered", "", "broadcastReceiver", "com/robinhood/shared/microgram/common/services/RealNotificationService$broadcastReceiver$1", "Lcom/robinhood/shared/microgram/common/services/RealNotificationService$broadcastReceiver$1;", "PostNotification", "Lcommon/global_notification/proto/v1/PostNotificationResponseDto;", "request", "(Lcommon/global_notification/proto/v1/PostNotificationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ObserveNotification", "Lkotlinx/coroutines/flow/Flow;", "Lcommon/global_notification/proto/v1/ObserveNotificationResponseDto;", "Lcommon/global_notification/proto/v1/ObserveNotificationRequestDto;", "StopObservingNotification", "Lcommon/global_notification/proto/v1/StopObservingNotificationResponseDto;", "Lcommon/global_notification/proto/v1/StopObservingNotificationRequestDto;", "(Lcommon/global_notification/proto/v1/StopObservingNotificationRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class RealNotificationService implements NotificationService, DefaultLifecycleObserver {
    private static final String GLOBAL_NOTIFICATION_ACTION = "com.robinhood.android.GLOBAL_NOTIFICATION";
    private static final String GLOBAL_NOTIFICATION_EXTRA_KEY = "GLOBAL_NOTIFICATION_EXTRA";
    private static final String GLOBAL_NOTIFICATION_ID_KEY = "GLOBAL_NOTIFICATION_ID";
    private final Application application;
    private final RealNotificationService2 broadcastReceiver;
    private boolean broadcastReceiverRegistered;
    private final SharedFlow2<PostNotificationRequestDto> relay;

    public Flow<Response<ObserveNotificationResponseDto>> ObserveNotification(Request<ObserveNotificationRequestDto> request) {
        return NotificationService.DefaultImpls.ObserveNotification(this, request);
    }

    public Object PostNotification(Request<PostNotificationRequestDto> request, Continuation<? super Response<PostNotificationResponseDto>> continuation) {
        return NotificationService.DefaultImpls.PostNotification(this, request, continuation);
    }

    public Object StopObservingNotification(Request<StopObservingNotificationRequestDto> request, Continuation<? super Response<StopObservingNotificationResponseDto>> continuation) {
        return NotificationService.DefaultImpls.StopObservingNotification(this, request, continuation);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.robinhood.shared.microgram.common.services.RealNotificationService$broadcastReceiver$1] */
    public RealNotificationService(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.relay = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.robinhood.shared.microgram.common.services.RealNotificationService$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Map mapEmptyMap;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.areEqual(intent.getAction(), "com.robinhood.android.GLOBAL_NOTIFICATION")) {
                    String stringExtra = intent.getStringExtra("GLOBAL_NOTIFICATION_ID");
                    if (stringExtra == null) {
                        Logger.INSTANCE.mo1681e("Global notification must have an ID", new Object[0]);
                        return;
                    }
                    try {
                        Serializable serializableExtra = intent.getSerializableExtra("GLOBAL_NOTIFICATION_EXTRA");
                        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                        mapEmptyMap = (Map) serializableExtra;
                    } catch (Exception unused) {
                        mapEmptyMap = MapsKt.emptyMap();
                    }
                    this.this$0.relay.tryEmit(new PostNotificationRequestDto(stringExtra, (Map<String, String>) mapEmptyMap));
                    Logger.INSTANCE.mo1679d("Received broadcast notification with id: " + stringExtra + " and metadata: " + mapEmptyMap, new Object[0]);
                }
            }
        };
    }

    @Override // common.global_notification.proto.p425v1.NotificationService
    public Object PostNotification(PostNotificationRequestDto postNotificationRequestDto, Continuation<? super PostNotificationResponseDto> continuation) {
        Logger.INSTANCE.mo1679d("PostNotification for notification_id=" + postNotificationRequestDto.getNotification_id() + " with metadata=" + postNotificationRequestDto.getMetadata(), new Object[0]);
        Intent intent = new Intent(GLOBAL_NOTIFICATION_ACTION);
        intent.putExtra(GLOBAL_NOTIFICATION_ID_KEY, postNotificationRequestDto.getNotification_id());
        intent.putExtra(GLOBAL_NOTIFICATION_EXTRA_KEY, new HashMap(postNotificationRequestDto.getMetadata()));
        this.application.sendBroadcast(intent);
        return new PostNotificationResponseDto();
    }

    @Override // common.global_notification.proto.p425v1.NotificationService
    public Flow<ObserveNotificationResponseDto> ObserveNotification(final ObserveNotificationRequestDto request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Logger.INSTANCE.mo1679d("ObserveNotification for id=" + request.getNotification_id() + " registered:" + this.broadcastReceiverRegistered, new Object[0]);
        if (!this.broadcastReceiverRegistered) {
            this.broadcastReceiverRegistered = true;
            ContextCompat.registerReceiver(this.application, this.broadcastReceiver, new IntentFilter(GLOBAL_NOTIFICATION_ACTION), 2);
        }
        final Flow flowFilterNotNull = FlowKt.filterNotNull(this.relay);
        final Flow<PostNotificationRequestDto> flow = new Flow<PostNotificationRequestDto>() { // from class: com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$filter$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$filter$1$2 */
            public static final class C391892<T> implements FlowCollector {
                final /* synthetic */ ObserveNotificationRequestDto $request$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$filter$1$2", m3645f = "RealNotificationService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C391892.this.emit(null, this);
                    }
                }

                public C391892(FlowCollector flowCollector, ObserveNotificationRequestDto observeNotificationRequestDto) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$request$inlined = observeNotificationRequestDto;
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
                        if (Intrinsics.areEqual(((PostNotificationRequestDto) obj).getNotification_id(), this.$request$inlined.getNotification_id())) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
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
            public Object collect(FlowCollector<? super PostNotificationRequestDto> flowCollector, Continuation continuation) {
                Object objCollect = flowFilterNotNull.collect(new C391892(flowCollector, request), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new Flow<ObserveNotificationResponseDto>() { // from class: com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$map$1$2 */
            public static final class C391902<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$map$1$2", m3645f = "RealNotificationService.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.shared.microgram.common.services.RealNotificationService$ObserveNotification$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C391902.this.emit(null, this);
                    }
                }

                public C391902(FlowCollector flowCollector) {
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
                        ObserveNotificationResponseDto observeNotificationResponseDto = new ObserveNotificationResponseDto(((PostNotificationRequestDto) obj).getMetadata());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(observeNotificationResponseDto, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super ObserveNotificationResponseDto> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C391902(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // common.global_notification.proto.p425v1.NotificationService
    public Object StopObservingNotification(StopObservingNotificationRequestDto stopObservingNotificationRequestDto, Continuation<? super StopObservingNotificationResponseDto> continuation) {
        if (this.broadcastReceiverRegistered) {
            this.application.unregisterReceiver(this.broadcastReceiver);
            this.broadcastReceiverRegistered = false;
        }
        Logger.INSTANCE.mo1679d("StopObservingNotification for notification_id=" + stopObservingNotificationRequestDto.getNotification_id(), new Object[0]);
        return new StopObservingNotificationResponseDto();
    }
}
