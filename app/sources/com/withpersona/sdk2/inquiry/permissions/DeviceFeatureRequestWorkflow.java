package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.SnapshotParcels;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.inquiry_session.GpsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransition;
import com.withpersona.sdk2.inquiry.shared.p422ui.ScreenWithTransition2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;

/* compiled from: DeviceFeatureRequestWorkflow.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003\u001e\u001f B\u0019\b\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J@\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00032$\u0010\u0013\u001a 0\u0014R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J*\u0010\u0017\u001a\u00020\u0018*\u00180\u0019R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$Output;", "", "applicationContext", "Landroid/content/Context;", "deviceFeatureRequestWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Factory;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Factory;)V", "initialState", "props", "snapshot", "Lcom/squareup/workflow1/Snapshot;", "render", "renderProps", "renderState", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "snapshotState", "state", "complete", "", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "output", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "enableGpsFeatureFromSettings", "Props", "Output", "DeviceFeatureRequestState", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DeviceFeatureRequestWorkflow extends StatefulWorkflow<Props, DeviceFeatureRequestState, Output, Object> {
    private final Context applicationContext;
    private final DeviceFeatureRequestWorker.Factory deviceFeatureRequestWorkerFactory;

    @Override // com.squareup.workflow1.StatefulWorkflow
    public /* bridge */ /* synthetic */ Object render(Props props, DeviceFeatureRequestState deviceFeatureRequestState, StatefulWorkflow<? super Props, DeviceFeatureRequestState, ? extends Output, ? extends Object>.RenderContext renderContext) {
        return render2(props, deviceFeatureRequestState, (StatefulWorkflow<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.RenderContext) renderContext);
    }

    public DeviceFeatureRequestWorkflow(Context applicationContext, DeviceFeatureRequestWorker.Factory deviceFeatureRequestWorkerFactory) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        this.applicationContext = applicationContext;
        this.deviceFeatureRequestWorkerFactory = deviceFeatureRequestWorkerFactory;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public DeviceFeatureRequestState initialState(Props props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            ByteString byteStringBytes = snapshot.bytes();
            Parcelable parcelable = null;
            if (byteStringBytes.size() <= 0) {
                byteStringBytes = null;
            }
            if (byteStringBytes != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] byteArray = byteStringBytes.toByteArray();
                parcelObtain.unmarshall(byteArray, 0, byteArray.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.checkNotNull(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            DeviceFeatureRequestState deviceFeatureRequestState = (DeviceFeatureRequestState) parcelable;
            if (deviceFeatureRequestState != null) {
                return deviceFeatureRequestState;
            }
        }
        return DeviceFeatureRequestState.CheckDeviceFeatureState.INSTANCE;
    }

    /* compiled from: DeviceFeatureRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1", m3645f = "DeviceFeatureRequestWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1 */
    static final class C437051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Props, DeviceFeatureRequestState, Output, Object>.RenderContext $context;
        final /* synthetic */ Props $renderProps;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437051(StatefulWorkflow<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.RenderContext renderContext, Props props, Continuation<? super C437051> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.$renderProps = props;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceFeatureRequestWorkflow.this.new C437051(this.$context, this.$renderProps, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (GpsUtils.isGpsEnabled(DeviceFeatureRequestWorkflow.this.applicationContext)) {
                    Sink<WorkflowAction<? super Props, DeviceFeatureRequestState, ? extends Output>> actionSink = this.$context.getActionSink();
                    final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = DeviceFeatureRequestWorkflow.this;
                    final Props props = this.$renderProps;
                    actionSink.send(StatefulWorkflow2.action$default(deviceFeatureRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return DeviceFeatureRequestWorkflow.C437051.invokeSuspend$lambda$0(deviceFeatureRequestWorkflow, props, (WorkflowAction.Updater) obj2);
                        }
                    }, 1, null));
                } else {
                    this.$context.getActionSink().send(StatefulWorkflow2.action$default(DeviceFeatureRequestWorkflow.this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return DeviceFeatureRequestWorkflow.C437051.invokeSuspend$lambda$1((WorkflowAction.Updater) obj2);
                        }
                    }, 1, null));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, WorkflowAction.Updater updater) {
            deviceFeatureRequestWorkflow.complete(updater, new DeviceFeatureState(props.getFeature(), DeviceFeatureState3.Success));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(WorkflowAction.Updater updater) {
            updater.setState(DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: render, reason: avoid collision after fix types in other method */
    public Object render2(final Props renderProps, DeviceFeatureRequestState renderState, final StatefulWorkflow<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.RenderContext context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(renderState, DeviceFeatureRequestState.CheckDeviceFeatureState.INSTANCE)) {
            context.runningSideEffect("check_device_feature_state", new C437051(context, renderProps, null));
            return null;
        }
        if (Intrinsics.areEqual(renderState, DeviceFeatureRequestState.ShowDeviceFeaturePrompt.INSTANCE)) {
            String requestFeatureTitle = renderProps.getRequestFeatureTitle();
            if (requestFeatureTitle == null) {
                requestFeatureTitle = "Couldn't access location feature";
            }
            String requestFeatureRationale = renderProps.getRequestFeatureRationale();
            if (requestFeatureRationale == null) {
                requestFeatureRationale = "Location is turned off, please allow access to your device's location feature";
            }
            String requestFeatureModalPositiveButton = renderProps.getRequestFeatureModalPositiveButton();
            if (requestFeatureModalPositiveButton == null) {
                requestFeatureModalPositiveButton = "Allow";
            }
            StepStyles2 styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceFeatureRequestWorkflow.render$lambda$1(context, this);
                }
            };
            String requestFeatureModalNegativeButton = renderProps.getRequestFeatureModalNegativeButton();
            if (requestFeatureModalNegativeButton == null) {
                requestFeatureModalNegativeButton = "Cancel";
            }
            return new ScreenWithTransition(new BottomSheetDialogView(requestFeatureTitle, requestFeatureRationale, requestFeatureModalPositiveButton, styles, function0, requestFeatureModalNegativeButton, new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceFeatureRequestWorkflow.render$lambda$3(context, this, renderProps);
                }
            }), ScreenWithTransition2.NONE);
        }
        if (Intrinsics.areEqual(renderState, DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE)) {
            Workflows.runningWorker(context, this.deviceFeatureRequestWorkerFactory.create(), Reflection.typeOf(DeviceFeatureRequestWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.render$lambda$7(this.f$0, renderProps, (DeviceFeatureRequestWorker.Output) obj);
                }
            });
            return null;
        }
        if (Intrinsics.areEqual(renderState, DeviceFeatureRequestState.Complete.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(StatefulWorkflow.RenderContext renderContext, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(deviceFeatureRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.render$lambda$1$lambda$0((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1$lambda$0(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(DeviceFeatureRequestState.RequestDeviceFeature.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$3(StatefulWorkflow.RenderContext renderContext, final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, final Props props) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(deviceFeatureRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.render$lambda$3$lambda$2(this.f$0, props, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$3$lambda$2(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.complete(action, new DeviceFeatureState(props.getFeature(), DeviceFeatureState3.Failure));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$7(final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, final Props props, DeviceFeatureRequestWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof DeviceFeatureRequestWorker.Output.Success) {
            return StatefulWorkflow2.action$default(deviceFeatureRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.render$lambda$7$lambda$4(this.f$0, props, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof DeviceFeatureRequestWorker.Output.Denied) {
            return StatefulWorkflow2.action$default(deviceFeatureRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DeviceFeatureRequestWorkflow.render$lambda$7$lambda$5(this.f$0, props, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof DeviceFeatureRequestWorker.Output.NotSupported)) {
            throw new NoWhenBranchMatchedException();
        }
        deviceFeatureRequestWorkflow.enableGpsFeatureFromSettings();
        return StatefulWorkflow2.action$default(deviceFeatureRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceFeatureRequestWorkflow.render$lambda$7$lambda$6(this.f$0, props, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$7$lambda$4(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.complete(action, new DeviceFeatureState(props.getFeature(), DeviceFeatureState3.Success));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$7$lambda$5(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.complete(action, new DeviceFeatureState(props.getFeature(), DeviceFeatureState3.Failure));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$7$lambda$6(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        deviceFeatureRequestWorkflow.complete(action, new DeviceFeatureState(props.getFeature(), DeviceFeatureState3.SettingsLaunched));
        return Unit.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Snapshot snapshotState(DeviceFeatureRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SnapshotParcels.toSnapshot(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void complete(WorkflowAction<? super Props, DeviceFeatureRequestState, Output>.Updater updater, DeviceFeatureState deviceFeatureState) {
        updater.setOutput(new Output(deviceFeatureState));
    }

    private final void enableGpsFeatureFromSettings() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    /* compiled from: DeviceFeatureRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$Props;", "", "Lcom/withpersona/sdk2/inquiry/permissions/Feature;", "feature", "", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalPositiveButton", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/Feature;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/permissions/Feature;", "getFeature", "()Lcom/withpersona/sdk2/inquiry/permissions/Feature;", "Ljava/lang/String;", "getRequestFeatureTitle", "getRequestFeatureRationale", "getRequestFeatureModalPositiveButton", "getRequestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Props {
        private final DeviceFeatureState2 feature;
        private final String requestFeatureModalNegativeButton;
        private final String requestFeatureModalPositiveButton;
        private final String requestFeatureRationale;
        private final String requestFeatureTitle;
        private final StepStyles2 styles;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.feature == props.feature && Intrinsics.areEqual(this.requestFeatureTitle, props.requestFeatureTitle) && Intrinsics.areEqual(this.requestFeatureRationale, props.requestFeatureRationale) && Intrinsics.areEqual(this.requestFeatureModalPositiveButton, props.requestFeatureModalPositiveButton) && Intrinsics.areEqual(this.requestFeatureModalNegativeButton, props.requestFeatureModalNegativeButton) && Intrinsics.areEqual(this.styles, props.styles);
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            String str = this.requestFeatureTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestFeatureRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestFeatureModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestFeatureModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            StepStyles2 stepStyles2 = this.styles;
            return iHashCode5 + (stepStyles2 != null ? stepStyles2.hashCode() : 0);
        }

        public String toString() {
            return "Props(feature=" + this.feature + ", requestFeatureTitle=" + this.requestFeatureTitle + ", requestFeatureRationale=" + this.requestFeatureRationale + ", requestFeatureModalPositiveButton=" + this.requestFeatureModalPositiveButton + ", requestFeatureModalNegativeButton=" + this.requestFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }

        public Props(DeviceFeatureState2 feature, String str, String str2, String str3, String str4, StepStyles2 stepStyles2) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.feature = feature;
            this.requestFeatureTitle = str;
            this.requestFeatureRationale = str2;
            this.requestFeatureModalPositiveButton = str3;
            this.requestFeatureModalNegativeButton = str4;
            this.styles = stepStyles2;
        }

        public final DeviceFeatureState2 getFeature() {
            return this.feature;
        }

        public final String getRequestFeatureTitle() {
            return this.requestFeatureTitle;
        }

        public final String getRequestFeatureRationale() {
            return this.requestFeatureRationale;
        }

        public final String getRequestFeatureModalPositiveButton() {
            return this.requestFeatureModalPositiveButton;
        }

        public final String getRequestFeatureModalNegativeButton() {
            return this.requestFeatureModalNegativeButton;
        }

        public final StepStyles2 getStyles() {
            return this.styles;
        }
    }

    /* compiled from: DeviceFeatureRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$Output;", "", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "deviceFeatureState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "getDeviceFeatureState", "()Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Output {
        private final DeviceFeatureState deviceFeatureState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.areEqual(this.deviceFeatureState, ((Output) other).deviceFeatureState);
        }

        public int hashCode() {
            return this.deviceFeatureState.hashCode();
        }

        public String toString() {
            return "Output(deviceFeatureState=" + this.deviceFeatureState + ")";
        }

        public Output(DeviceFeatureState deviceFeatureState) {
            Intrinsics.checkNotNullParameter(deviceFeatureState, "deviceFeatureState");
            this.deviceFeatureState = deviceFeatureState;
        }

        public final DeviceFeatureState getDeviceFeatureState() {
            return this.deviceFeatureState;
        }
    }

    /* compiled from: DeviceFeatureRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "CheckDeviceFeatureState", "ShowDeviceFeaturePrompt", "RequestDeviceFeature", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class DeviceFeatureRequestState implements Parcelable {
        public /* synthetic */ DeviceFeatureRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DeviceFeatureRequestState() {
        }

        /* compiled from: DeviceFeatureRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class CheckDeviceFeatureState extends DeviceFeatureRequestState {
            public static final CheckDeviceFeatureState INSTANCE = new CheckDeviceFeatureState();
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new Creator();

            /* compiled from: DeviceFeatureRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckDeviceFeatureState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckDeviceFeatureState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckDeviceFeatureState.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckDeviceFeatureState[] newArray(int i) {
                    return new CheckDeviceFeatureState[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckDeviceFeatureState);
            }

            public int hashCode() {
                return -86189441;
            }

            public String toString() {
                return "CheckDeviceFeatureState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private CheckDeviceFeatureState() {
                super(null);
            }
        }

        /* compiled from: DeviceFeatureRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ShowDeviceFeaturePrompt extends DeviceFeatureRequestState {
            public static final ShowDeviceFeaturePrompt INSTANCE = new ShowDeviceFeaturePrompt();
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new Creator();

            /* compiled from: DeviceFeatureRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShowDeviceFeaturePrompt> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowDeviceFeaturePrompt createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowDeviceFeaturePrompt.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowDeviceFeaturePrompt[] newArray(int i) {
                    return new ShowDeviceFeaturePrompt[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowDeviceFeaturePrompt);
            }

            public int hashCode() {
                return 725044653;
            }

            public String toString() {
                return "ShowDeviceFeaturePrompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private ShowDeviceFeaturePrompt() {
                super(null);
            }
        }

        /* compiled from: DeviceFeatureRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class RequestDeviceFeature extends DeviceFeatureRequestState {
            public static final RequestDeviceFeature INSTANCE = new RequestDeviceFeature();
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new Creator();

            /* compiled from: DeviceFeatureRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RequestDeviceFeature> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestDeviceFeature createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestDeviceFeature[] newArray(int i) {
                    return new RequestDeviceFeature[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RequestDeviceFeature);
            }

            public int hashCode() {
                return 1991921803;
            }

            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private RequestDeviceFeature() {
                super(null);
            }
        }

        /* compiled from: DeviceFeatureRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Complete extends DeviceFeatureRequestState {
            public static final Complete INSTANCE = new Complete();
            public static final Parcelable.Creator<Complete> CREATOR = new Creator();

            /* compiled from: DeviceFeatureRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Complete> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete[] newArray(int i) {
                    return new Complete[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Complete);
            }

            public int hashCode() {
                return 92238675;
            }

            public String toString() {
                return "Complete";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Complete() {
                super(null);
            }
        }
    }
}
