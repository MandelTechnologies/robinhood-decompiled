package com.withpersona.sdk2.inquiry.permissions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.launchers.ResolvableApiLauncherResult;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DeviceFeatureRequestWorker.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\f\rB!\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output;", "resolvableApiLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "context", "Landroid/content/Context;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;)V", "run", "Lkotlinx/coroutines/flow/Flow;", "Output", "Factory", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DeviceFeatureRequestWorker implements Worker<Output> {
    private final Context context;
    private final ActivityResultLauncher<IntentSenderRequest> resolvableApiLauncher;

    /* compiled from: DeviceFeatureRequestWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        DeviceFeatureRequestWorker create();
    }

    public DeviceFeatureRequestWorker(ActivityResultLauncher<IntentSenderRequest> resolvableApiLauncher, Context context) {
        Intrinsics.checkNotNullParameter(resolvableApiLauncher, "resolvableApiLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.resolvableApiLauncher = resolvableApiLauncher;
        this.context = context;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    /* compiled from: DeviceFeatureRequestWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1", m3645f = "DeviceFeatureRequestWorker.kt", m3646l = {102, 61, 67, 76, 84}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1 */
    static final class C437031 extends ContinuationImpl7 implements Function2<FlowCollector<? super Output>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C437031(Continuation<? super C437031> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437031 c437031 = DeviceFeatureRequestWorker.this.new C437031(continuation);
            c437031.L$0 = obj;
            return c437031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Output> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437031) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ef, code lost:
        
            if (r1.emit(r13, r12) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
        
            if (r1.emit(r13, r12) == r0) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x015b, code lost:
        
            if (r1.emit(r13, r12) != r0) goto L46;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v23 */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
            } catch (IntentSender.SendIntentException unused) {
                Output.NotSupported notSupported = Output.NotSupported.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 5;
            }
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                LocationRequest locationRequestBuild = new LocationRequest.Builder(10000L).setPriority(100).setMinUpdateIntervalMillis(5000L).build();
                Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
                LocationSettingsRequest locationSettingsRequestBuild = new LocationSettingsRequest.Builder().addLocationRequest(locationRequestBuild).setAlwaysShow(true).build();
                Intrinsics.checkNotNullExpressionValue(locationSettingsRequestBuild, "build(...)");
                SettingsClient settingsClient = LocationServices.getSettingsClient(DeviceFeatureRequestWorker.this.context);
                Intrinsics.checkNotNullExpressionValue(settingsClient, "getSettingsClient(...)");
                this.L$0 = flowCollector2;
                this.L$1 = locationSettingsRequestBuild;
                this.L$2 = settingsClient;
                this.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                Task<LocationSettingsResponse> taskCheckLocationSettings = settingsClient.checkLocationSettings(locationSettingsRequestBuild);
                Intrinsics.checkNotNullExpressionValue(taskCheckLocationSettings, "checkLocationSettings(...)");
                final Function1<LocationSettingsResponse, Unit> function1 = new Function1<LocationSettingsResponse, Unit>() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1$locationSettingsResult$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(LocationSettingsResponse locationSettingsResponse) {
                        invoke2(locationSettingsResponse);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(LocationSettingsResponse locationSettingsResponse) {
                        cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(locationSettingsResponse))));
                    }
                };
                taskCheckLocationSettings.addOnSuccessListener(new OnSuccessListener(function1) { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$sam$com_google_android_gms_tasks_OnSuccessListener$0
                    private final /* synthetic */ Function1 function;

                    {
                        Intrinsics.checkNotNullParameter(function1, "function");
                        this.function = function1;
                    }

                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj2) {
                        this.function.invoke(obj2);
                    }
                });
                taskCheckLocationSettings.addOnFailureListener(new OnFailureListener() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1$locationSettingsResult$1$2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exception) {
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        CancellableContinuation<Result<? extends LocationSettingsResponse>> cancellableContinuation = cancellableContinuationImpl;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m28550constructorimpl(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(exception)))));
                    }
                });
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(this);
                }
                if (result != coroutine_suspended) {
                    flowCollector = flowCollector2;
                    obj = result;
                }
                return coroutine_suspended;
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (r1 == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (r1 != 4) {
                    if (r1 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                FlowCollector flowCollector3 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = flowCollector3;
                throw new ExceptionsH();
            }
            FlowCollector flowCollector4 = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
            flowCollector = flowCollector4;
            Object value = ((Result) obj).getValue();
            if (Result.m28556isSuccessimpl(value)) {
                Output.Success success = Output.Success.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 2;
            } else {
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
                if (!(thM28553exceptionOrNullimpl instanceof ResolvableApiException)) {
                    Output.NotSupported notSupported2 = Output.NotSupported.INSTANCE;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                } else {
                    PendingIntent resolution = ((ResolvableApiException) thM28553exceptionOrNullimpl).getResolution();
                    Intrinsics.checkNotNullExpressionValue(resolution, "getResolution(...)");
                    DeviceFeatureRequestWorker.this.resolvableApiLauncher.launch(new IntentSenderRequest.Builder(resolution).build());
                    ResolvableApiLauncherResult resolvableApiLauncherResult = new ResolvableApiLauncherResult();
                    FlowCollector<? super ActivityResult> flowCollector5 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker.run.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((ActivityResult) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(ActivityResult activityResult, Continuation<? super Unit> continuation) {
                            if (activityResult != null && activityResult.getResultCode() == -1) {
                                Object objEmit = flowCollector.emit(Output.Success.INSTANCE, continuation);
                                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                            }
                            Object objEmit2 = flowCollector.emit(Output.Denied.INSTANCE, continuation);
                            return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
                        }
                    };
                    this.L$0 = flowCollector;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    r1 = flowCollector;
                    if (resolvableApiLauncherResult.collect(flowCollector5, this) == coroutine_suspended) {
                    }
                    throw new ExceptionsH();
                }
            }
            return coroutine_suspended;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        return FlowKt.flow(new C437031(null));
    }

    /* compiled from: DeviceFeatureRequestWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output;", "", "<init>", "()V", "Success", "NotSupported", "Denied", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output$Denied;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output$NotSupported;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output$Success;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DeviceFeatureRequestWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output$Success;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Output {
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return -190170683;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
                super(null);
            }
        }

        private Output() {
        }

        /* compiled from: DeviceFeatureRequestWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output$NotSupported;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class NotSupported extends Output {
            public static final NotSupported INSTANCE = new NotSupported();

            public boolean equals(Object other) {
                return this == other || (other instanceof NotSupported);
            }

            public int hashCode() {
                return 726963865;
            }

            public String toString() {
                return "NotSupported";
            }

            private NotSupported() {
                super(null);
            }
        }

        /* compiled from: DeviceFeatureRequestWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output$Denied;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Denied extends Output {
            public static final Denied INSTANCE = new Denied();

            public boolean equals(Object other) {
                return this == other || (other instanceof Denied);
            }

            public int hashCode() {
                return -588562023;
            }

            public String toString() {
                return "Denied";
            }

            private Denied() {
                super(null);
            }
        }
    }
}
