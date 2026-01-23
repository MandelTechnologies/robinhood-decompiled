package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.Snapshot;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.StatefulWorkflow2;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.SnapshotParcels;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles2;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.resources.R$string;
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

/* compiled from: PermissionRequestWorkflow.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003 !\"B!\b\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J@\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00032$\u0010\u0015\u001a 0\u0016R\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J*\u0010\u001b\u001a\u00020\u0018*\u00180\u001cR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "", "applicationContext", "Landroid/content/Context;", "permissionRequestWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Factory;", "deviceFeatureRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Factory;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;)V", "initialState", "props", "snapshot", "Lcom/squareup/workflow1/Snapshot;", "render", "renderProps", "renderState", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "launchAppSettings", "", "snapshotState", "state", "complete", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "output", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "Props", "Output", "PermissionRequestState", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class PermissionRequestWorkflow extends StatefulWorkflow<Props, PermissionRequestState, Output, Object> {
    private final Context applicationContext;
    private final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow;
    private final PermissionRequestWorker.Factory permissionRequestWorkerFactory;

    /* compiled from: PermissionRequestWorkflow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceFeatureState3.values().length];
            try {
                iArr[DeviceFeatureState3.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceFeatureState3.Failure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceFeatureState3.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public PermissionRequestState initialState(Props props, Snapshot snapshot) {
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
            PermissionRequestState permissionRequestState = (PermissionRequestState) parcelable;
            if (permissionRequestState != null) {
                return permissionRequestState;
            }
        }
        return PermissionRequestState.CheckPermissionState.INSTANCE;
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public /* bridge */ /* synthetic */ Object render(Props props, PermissionRequestState permissionRequestState, StatefulWorkflow<? super Props, PermissionRequestState, ? extends Output, ? extends Object>.RenderContext renderContext) {
        return render2(props, permissionRequestState, (StatefulWorkflow<? super Props, PermissionRequestState, Output, ? extends Object>.RenderContext) renderContext);
    }

    public PermissionRequestWorkflow(Context applicationContext, PermissionRequestWorker.Factory permissionRequestWorkerFactory, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkerFactory, "permissionRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkflow, "deviceFeatureRequestWorkflow");
        this.applicationContext = applicationContext;
        this.permissionRequestWorkerFactory = permissionRequestWorkerFactory;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
    }

    /* compiled from: PermissionRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1", m3645f = "PermissionRequestWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1 */
    static final class C437071 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Props, PermissionRequestState, Output, Object>.RenderContext $context;
        final /* synthetic */ Props $renderProps;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437071(Props props, StatefulWorkflow<? super Props, PermissionRequestState, Output, ? extends Object>.RenderContext renderContext, Continuation<? super C437071> continuation) {
            super(2, continuation);
            this.$renderProps = props;
            this.$context = renderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PermissionRequestWorkflow.this.new C437071(this.$renderProps, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (PermissionsUtils.hasPermission(PermissionRequestWorkflow.this.applicationContext, this.$renderProps.getPermission())) {
                    this.$context.getActionSink().send(StatefulWorkflow2.action$default(PermissionRequestWorkflow.this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PermissionRequestWorkflow.C437071.invokeSuspend$lambda$0((WorkflowAction.Updater) obj2);
                        }
                    }, 1, null));
                } else {
                    this.$context.getActionSink().send(StatefulWorkflow2.action$default(PermissionRequestWorkflow.this, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return PermissionRequestWorkflow.C437071.invokeSuspend$lambda$1((WorkflowAction.Updater) obj2);
                        }
                    }, 1, null));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WorkflowAction.Updater updater) {
            updater.setState(PermissionRequestState.RequestDeviceFeature.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(WorkflowAction.Updater updater) {
            updater.setState(PermissionRequestState.CheckPermissionRationaleState.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: render, reason: avoid collision after fix types in other method */
    public Object render2(final Props renderProps, PermissionRequestState renderState, final StatefulWorkflow<? super Props, PermissionRequestState, Output, ? extends Object>.RenderContext context) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(renderState, PermissionRequestState.CheckPermissionState.INSTANCE)) {
            context.runningSideEffect("check_permission_state", new C437071(renderProps, context, null));
            return null;
        }
        if (Intrinsics.areEqual(renderState, PermissionRequestState.CheckPermissionRationaleState.INSTANCE)) {
            return new ScreenWithTransition(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$1(context, this, ((Boolean) obj).booleanValue());
                }
            }), ScreenWithTransition2.NONE);
        }
        if (Intrinsics.areEqual(renderState, PermissionRequestState.ShowRequestPermissionRationale.INSTANCE)) {
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(R$string.pi2_permissions_continue);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyles2 styles = renderProps.getStyles();
            Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.render$lambda$3(context, this);
                }
            };
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(R$string.pi2_permissions_cancel);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            return new ScreenWithTransition(new BottomSheetDialogView(title, rationale, str, styles, function0, negativeButtonText, new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.render$lambda$5(context, this, renderProps);
                }
            }), ScreenWithTransition2.NONE);
        }
        if (Intrinsics.areEqual(renderState, PermissionRequestState.RequestPermission.INSTANCE)) {
            Workflows.runningWorker(context, this.permissionRequestWorkerFactory.create(renderProps.getPermission()), Reflection.typeOf(PermissionRequestWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$11(this.f$0, context, renderProps, (PermissionRequestWorker.Output) obj);
                }
            });
            return null;
        }
        if (Intrinsics.areEqual(renderState, PermissionRequestState.RequestDeviceFeature.INSTANCE)) {
            if (renderProps.isPermissionLocation()) {
                return BaseRenderContext.DefaultImpls.renderChild$default(context, this.deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow.Props(PermissionsState4.toFeature(renderProps.getPermission()), renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getPositiveButtonText(), renderProps.getGpsFeatureModalNegativeButton(), renderProps.getStyles()), null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PermissionRequestWorkflow.render$lambda$15(this.f$0, context, renderProps, (DeviceFeatureRequestWorkflow.Output) obj);
                    }
                }, 4, null);
            }
            context.runningSideEffect("request_device_feature", new C437087(context, this, renderProps, null));
            return null;
        }
        if (Intrinsics.areEqual(renderState, PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE)) {
            return new ScreenWithTransition(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$18(context, this, renderProps, ((Boolean) obj).booleanValue());
                }
            }), ScreenWithTransition2.NONE);
        }
        if (Intrinsics.areEqual(renderState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE)) {
            String title2 = renderProps.getTitle();
            String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
            String positiveButtonText2 = renderProps.getPositiveButtonText();
            if (positiveButtonText2 == null) {
                positiveButtonText2 = this.applicationContext.getString(R$string.pi2_permissions_settings);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
            }
            String str2 = positiveButtonText2;
            StepStyles2 styles2 = renderProps.getStyles();
            Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.render$lambda$20(this.f$0, context, renderProps);
                }
            };
            String negativeButtonText2 = renderProps.getNegativeButtonText();
            if (negativeButtonText2 == null) {
                negativeButtonText2 = this.applicationContext.getString(R$string.pi2_permissions_cancel);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
            }
            return new ScreenWithTransition(new BottomSheetDialogView(title2, rationaleWhenPermanentlyDenied, str2, styles2, function02, negativeButtonText2, new Function0() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionRequestWorkflow.render$lambda$22(context, this, renderProps);
                }
            }), ScreenWithTransition2.NONE);
        }
        if (Intrinsics.areEqual(renderState, PermissionRequestState.Complete.INSTANCE)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1(StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow, final boolean z) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$1$lambda$0(z, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$1$lambda$0(boolean z, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z) {
            action.setState(PermissionRequestState.ShowRequestPermissionRationale.INSTANCE);
        } else {
            action.setState(PermissionRequestState.RequestPermission.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$3(StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$3$lambda$2((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$3$lambda$2(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(PermissionRequestState.RequestPermission.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$5(StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$5$lambda$4(this.f$0, props, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$5$lambda$4(PermissionRequestWorkflow permissionRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.PermissionRejected));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$11(final PermissionRequestWorkflow permissionRequestWorkflow, final StatefulWorkflow.RenderContext renderContext, final Props props, PermissionRequestWorker.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it, PermissionRequestWorker.Output.Success.INSTANCE)) {
            return StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$11$lambda$7(renderContext, permissionRequestWorkflow, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (Intrinsics.areEqual(it, PermissionRequestWorker.Output.Denied.INSTANCE)) {
            return StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$11$lambda$10(renderContext, permissionRequestWorkflow, props, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$11$lambda$7(StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$11$lambda$7$lambda$6((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$11$lambda$7$lambda$6(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(PermissionRequestState.RequestDeviceFeature.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$11$lambda$10(StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (((Props) action.getProps()).getOptional()) {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$11$lambda$10$lambda$8(this.f$0, props, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$11$lambda$10$lambda$9((WorkflowAction.Updater) obj);
                }
            }, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$11$lambda$10$lambda$8(PermissionRequestWorkflow permissionRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.PermissionRejected));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$11$lambda$10$lambda$9(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(PermissionRequestState.CheckPermissionPermanentlyDenied.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction render$lambda$15(final PermissionRequestWorkflow permissionRequestWorkflow, final StatefulWorkflow.RenderContext renderContext, final Props props, final DeviceFeatureRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$15$lambda$14(it, renderContext, permissionRequestWorkflow, props, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$15$lambda$14(DeviceFeatureRequestWorkflow.Output output, StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i = WhenMappings.$EnumSwitchMapping$0[output.getDeviceFeatureState().getResult().ordinal()];
        if (i == 1) {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$15$lambda$14$lambda$12(this.f$0, props, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else if (i == 2) {
            permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.PermissionRejected));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$15$lambda$14$lambda$13(this.f$0, props, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$15$lambda$14$lambda$12(PermissionRequestWorkflow permissionRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.PermissionGranted));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$15$lambda$14$lambda$13(PermissionRequestWorkflow permissionRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.SettingsLaunched));
        return Unit.INSTANCE;
    }

    /* compiled from: PermissionRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7", m3645f = "PermissionRequestWorkflow.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7 */
    static final class C437087 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<Props, PermissionRequestState, Output, Object>.RenderContext $context;
        final /* synthetic */ Props $renderProps;
        int label;
        final /* synthetic */ PermissionRequestWorkflow this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C437087(StatefulWorkflow<? super Props, PermissionRequestState, Output, ? extends Object>.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow, Props props, Continuation<? super C437087> continuation) {
            super(2, continuation);
            this.$context = renderContext;
            this.this$0 = permissionRequestWorkflow;
            this.$renderProps = props;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437087(this.$context, this.this$0, this.$renderProps, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437087) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Sink<WorkflowAction<? super Props, PermissionRequestState, ? extends Output>> actionSink = this.$context.getActionSink();
            final PermissionRequestWorkflow permissionRequestWorkflow = this.this$0;
            final Props props = this.$renderProps;
            actionSink.send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return PermissionRequestWorkflow.C437087.invokeSuspend$lambda$0(permissionRequestWorkflow, props, (WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(PermissionRequestWorkflow permissionRequestWorkflow, Props props, WorkflowAction.Updater updater) {
            permissionRequestWorkflow.complete(updater, new PermissionState(props.getPermission(), PermissionsState2.PermissionGranted));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$18(final StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props, final boolean z) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$18$lambda$17(z, permissionRequestWorkflow, props, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$18$lambda$17(boolean z, PermissionRequestWorkflow permissionRequestWorkflow, Props props, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (z) {
            permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.PermissionRejected));
        } else {
            renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PermissionRequestWorkflow.render$lambda$18$lambda$17$lambda$16((WorkflowAction.Updater) obj);
                }
            }, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$18$lambda$17$lambda$16(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$20(final PermissionRequestWorkflow permissionRequestWorkflow, StatefulWorkflow.RenderContext renderContext, final Props props) {
        permissionRequestWorkflow.launchAppSettings();
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$20$lambda$19(this.f$0, props, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$20$lambda$19(PermissionRequestWorkflow permissionRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.SettingsLaunched));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$22(StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow permissionRequestWorkflow, final Props props) {
        renderContext.getActionSink().send(StatefulWorkflow2.action$default(permissionRequestWorkflow, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionRequestWorkflow.render$lambda$22$lambda$21(this.f$0, props, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit render$lambda$22$lambda$21(PermissionRequestWorkflow permissionRequestWorkflow, Props props, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        permissionRequestWorkflow.complete(action, new PermissionState(props.getPermission(), PermissionsState2.PermissionRejected));
        return Unit.INSTANCE;
    }

    private final void launchAppSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    @Override // com.squareup.workflow1.StatefulWorkflow
    public Snapshot snapshotState(PermissionRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return SnapshotParcels.toSnapshot(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void complete(WorkflowAction<? super Props, PermissionRequestState, Output>.Updater updater, PermissionState permissionState) {
        updater.setOutput(new Output(permissionState));
    }

    /* compiled from: PermissionRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b%\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b&\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b'\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b(\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010 ¨\u0006."}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "permission", "", "optional", "", "title", "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/Permission;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "getPermission", "()Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "Z", "getOptional", "()Z", "Ljava/lang/String;", "getTitle", "getRationale", "getRationaleWhenPermanentlyDenied", "getPositiveButtonText", "getNegativeButtonText", "getGpsFeatureTitle", "getGpsFeatureRationale", "getGpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "isPermissionLocation", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Props {
        private final String gpsFeatureModalNegativeButton;
        private final String gpsFeatureRationale;
        private final String gpsFeatureTitle;
        private final String negativeButtonText;
        private final boolean optional;
        private final PermissionsState permission;
        private final String positiveButtonText;
        private final String rationale;
        private final String rationaleWhenPermanentlyDenied;
        private final StepStyles2 styles;
        private final String title;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.permission == props.permission && this.optional == props.optional && Intrinsics.areEqual(this.title, props.title) && Intrinsics.areEqual(this.rationale, props.rationale) && Intrinsics.areEqual(this.rationaleWhenPermanentlyDenied, props.rationaleWhenPermanentlyDenied) && Intrinsics.areEqual(this.positiveButtonText, props.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, props.negativeButtonText) && Intrinsics.areEqual(this.gpsFeatureTitle, props.gpsFeatureTitle) && Intrinsics.areEqual(this.gpsFeatureRationale, props.gpsFeatureRationale) && Intrinsics.areEqual(this.gpsFeatureModalNegativeButton, props.gpsFeatureModalNegativeButton) && Intrinsics.areEqual(this.styles, props.styles);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.permission.hashCode() * 31) + Boolean.hashCode(this.optional)) * 31) + this.title.hashCode()) * 31) + this.rationale.hashCode()) * 31) + this.rationaleWhenPermanentlyDenied.hashCode()) * 31;
            String str = this.positiveButtonText;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButtonText;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsFeatureTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsFeatureRationale;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureModalNegativeButton;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            StepStyles2 stepStyles2 = this.styles;
            return iHashCode6 + (stepStyles2 != null ? stepStyles2.hashCode() : 0);
        }

        public String toString() {
            return "Props(permission=" + this.permission + ", optional=" + this.optional + ", title=" + this.title + ", rationale=" + this.rationale + ", rationaleWhenPermanentlyDenied=" + this.rationaleWhenPermanentlyDenied + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalNegativeButton=" + this.gpsFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }

        public Props(PermissionsState permission, boolean z, String title, String rationale, String rationaleWhenPermanentlyDenied, String str, String str2, String str3, String str4, String str5, StepStyles2 stepStyles2) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rationale, "rationale");
            Intrinsics.checkNotNullParameter(rationaleWhenPermanentlyDenied, "rationaleWhenPermanentlyDenied");
            this.permission = permission;
            this.optional = z;
            this.title = title;
            this.rationale = rationale;
            this.rationaleWhenPermanentlyDenied = rationaleWhenPermanentlyDenied;
            this.positiveButtonText = str;
            this.negativeButtonText = str2;
            this.gpsFeatureTitle = str3;
            this.gpsFeatureRationale = str4;
            this.gpsFeatureModalNegativeButton = str5;
            this.styles = stepStyles2;
        }

        public final PermissionsState getPermission() {
            return this.permission;
        }

        public final boolean getOptional() {
            return this.optional;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getRationale() {
            return this.rationale;
        }

        public final String getRationaleWhenPermanentlyDenied() {
            return this.rationaleWhenPermanentlyDenied;
        }

        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        public final String getNegativeButtonText() {
            return this.negativeButtonText;
        }

        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        public final String getGpsFeatureModalNegativeButton() {
            return this.gpsFeatureModalNegativeButton;
        }

        public final StepStyles2 getStyles() {
            return this.styles;
        }

        public final boolean isPermissionLocation() {
            PermissionsState permissionsState = this.permission;
            return permissionsState == PermissionsState.RoughLocation || permissionsState == PermissionsState.PreciseLocation;
        }
    }

    /* compiled from: PermissionRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "getPermissionState", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Output {
        private final PermissionState permissionState;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.areEqual(this.permissionState, ((Output) other).permissionState);
        }

        public int hashCode() {
            return this.permissionState.hashCode();
        }

        public String toString() {
            return "Output(permissionState=" + this.permissionState + ")";
        }

        public Output(PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.permissionState = permissionState;
        }

        public final PermissionState getPermissionState() {
            return this.permissionState;
        }
    }

    /* compiled from: PermissionRequestWorkflow.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Landroid/os/Parcelable;", "<init>", "()V", "CheckPermissionState", "CheckPermissionRationaleState", "ShowRequestPermissionRationale", "RequestPermission", "RequestDeviceFeature", "CheckPermissionPermanentlyDenied", "ShowPermissionPermanentlyDeniedMessage", "Complete", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class PermissionRequestState implements Parcelable {
        public /* synthetic */ PermissionRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PermissionRequestState() {
        }

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class CheckPermissionState extends PermissionRequestState {
            public static final CheckPermissionState INSTANCE = new CheckPermissionState();
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPermissionState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPermissionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionState.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPermissionState[] newArray(int i) {
                    return new CheckPermissionState[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckPermissionState);
            }

            public int hashCode() {
                return -885686570;
            }

            public String toString() {
                return "CheckPermissionState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private CheckPermissionState() {
                super(null);
            }
        }

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class CheckPermissionRationaleState extends PermissionRequestState {
            public static final CheckPermissionRationaleState INSTANCE = new CheckPermissionRationaleState();
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPermissionRationaleState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPermissionRationaleState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionRationaleState.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPermissionRationaleState[] newArray(int i) {
                    return new CheckPermissionRationaleState[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckPermissionRationaleState);
            }

            public int hashCode() {
                return -1860465355;
            }

            public String toString() {
                return "CheckPermissionRationaleState";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private CheckPermissionRationaleState() {
                super(null);
            }
        }

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ShowRequestPermissionRationale extends PermissionRequestState {
            public static final ShowRequestPermissionRationale INSTANCE = new ShowRequestPermissionRationale();
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShowRequestPermissionRationale> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowRequestPermissionRationale createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowRequestPermissionRationale.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowRequestPermissionRationale[] newArray(int i) {
                    return new ShowRequestPermissionRationale[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowRequestPermissionRationale);
            }

            public int hashCode() {
                return 120525746;
            }

            public String toString() {
                return "ShowRequestPermissionRationale";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private ShowRequestPermissionRationale() {
                super(null);
            }
        }

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class RequestPermission extends PermissionRequestState {
            public static final RequestPermission INSTANCE = new RequestPermission();
            public static final Parcelable.Creator<RequestPermission> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<RequestPermission> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPermission createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestPermission.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RequestPermission[] newArray(int i) {
                    return new RequestPermission[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RequestPermission);
            }

            public int hashCode() {
                return -2052298174;
            }

            public String toString() {
                return "RequestPermission";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private RequestPermission() {
                super(null);
            }
        }

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class RequestDeviceFeature extends PermissionRequestState {
            public static final RequestDeviceFeature INSTANCE = new RequestDeviceFeature();
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
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
                return -1821218195;
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

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class CheckPermissionPermanentlyDenied extends PermissionRequestState {
            public static final CheckPermissionPermanentlyDenied INSTANCE = new CheckPermissionPermanentlyDenied();
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<CheckPermissionPermanentlyDenied> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPermissionPermanentlyDenied createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionPermanentlyDenied.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CheckPermissionPermanentlyDenied[] newArray(int i) {
                    return new CheckPermissionPermanentlyDenied[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckPermissionPermanentlyDenied);
            }

            public int hashCode() {
                return -367421189;
            }

            public String toString() {
                return "CheckPermissionPermanentlyDenied";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private CheckPermissionPermanentlyDenied() {
                super(null);
            }
        }

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class ShowPermissionPermanentlyDeniedMessage extends PermissionRequestState {
            public static final ShowPermissionPermanentlyDeniedMessage INSTANCE = new ShowPermissionPermanentlyDeniedMessage();
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowPermissionPermanentlyDeniedMessage createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPermissionPermanentlyDeniedMessage.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShowPermissionPermanentlyDeniedMessage[] newArray(int i) {
                    return new ShowPermissionPermanentlyDeniedMessage[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowPermissionPermanentlyDeniedMessage);
            }

            public int hashCode() {
                return -1723010119;
            }

            public String toString() {
                return "ShowPermissionPermanentlyDeniedMessage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private ShowPermissionPermanentlyDeniedMessage() {
                super(null);
            }
        }

        /* compiled from: PermissionRequestWorkflow.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Complete extends PermissionRequestState {
            public static final Complete INSTANCE = new Complete();
            public static final Parcelable.Creator<Complete> CREATOR = new Creator();

            /* compiled from: PermissionRequestWorkflow.kt */
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
                return 1563807797;
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
