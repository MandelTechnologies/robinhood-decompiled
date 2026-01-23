package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContract;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.launchers.RequestPermissionResult;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PermissionRequestWorker.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0012B)\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output;", "requestPermissionsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "context", "Landroid/content/Context;", "permission", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/Permission;)V", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "Output", "Factory", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PermissionRequestWorker implements Worker<Output> {
    private final Context context;
    private final PermissionsState permission;
    private final ActivityResultLauncher<String> requestPermissionsLauncher;

    public PermissionRequestWorker(ActivityResultLauncher<String> requestPermissionsLauncher, Context context, PermissionsState permission) {
        Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.requestPermissionsLauncher = requestPermissionsLauncher;
        this.context = context;
        this.permission = permission;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof PermissionRequestWorker) && ((PermissionRequestWorker) otherWorker).permission == this.permission;
    }

    /* compiled from: PermissionRequestWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorker$run$1", m3645f = "PermissionRequestWorker.kt", m3646l = {32, 36}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorker$run$1 */
    static final class C437061 extends ContinuationImpl7 implements Function2<FlowCollector<? super Output>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C437061(Continuation<? super C437061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C437061 c437061 = PermissionRequestWorker.this.new C437061(continuation);
            c437061.L$0 = obj;
            return c437061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Output> flowCollector, Continuation<? super Unit> continuation) {
            return ((C437061) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
        
            if (r1.collect(r3, r6) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                throw new ExceptionsH();
            }
            ResultKt.throwOnFailure(obj);
            final FlowCollector flowCollector = (FlowCollector) this.L$0;
            ActivityResultContract.SynchronousResult synchronousResult = PermissionRequestWorker.this.requestPermissionsLauncher.getContract().getSynchronousResult(PermissionRequestWorker.this.context, PermissionsState4.toPermissionString(PermissionRequestWorker.this.permission));
            if (!Intrinsics.areEqual(synchronousResult != null ? synchronousResult.getValue() : null, boxing.boxBoolean(true))) {
                PermissionRequestWorker.this.requestPermissionsLauncher.launch(PermissionsState4.toPermissionString(PermissionRequestWorker.this.permission));
                RequestPermissionResult requestPermissionResult = new RequestPermissionResult();
                FlowCollector<? super Boolean> flowCollector2 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorker.run.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            Object objEmit = flowCollector.emit(Output.Success.INSTANCE, continuation);
                            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                        }
                        Object objEmit2 = flowCollector.emit(Output.Denied.INSTANCE, continuation);
                        return objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit2 : Unit.INSTANCE;
                    }
                };
                this.label = 2;
            } else {
                Output.Success success = Output.Success.INSTANCE;
                this.label = 1;
            }
            return coroutine_suspended;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        return FlowKt.flow(new C437061(null));
    }

    /* compiled from: PermissionRequestWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output;", "", "<init>", "()V", "Success", "Denied", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output$Denied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output$Success;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PermissionRequestWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output$Success;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Output {
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return 1972662456;
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

        /* compiled from: PermissionRequestWorker.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output$Denied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Output;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Denied extends Output {
            public static final Denied INSTANCE = new Denied();

            public boolean equals(Object other) {
                return this == other || (other instanceof Denied);
            }

            public int hashCode() {
                return 1697964102;
            }

            public String toString() {
                return "Denied";
            }

            private Denied() {
                super(null);
            }
        }
    }

    /* compiled from: PermissionRequestWorker.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker$Factory;", "", "context", "Landroid/content/Context;", "requestPermissionsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "<init>", "(Landroid/content/Context;Landroidx/activity/result/ActivityResultLauncher;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorker;", "permission", "Lcom/withpersona/sdk2/inquiry/permissions/Permission;", "permissions_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final Context context;
        private final ActivityResultLauncher<String> requestPermissionsLauncher;

        public Factory(Context context, ActivityResultLauncher<String> requestPermissionsLauncher) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(requestPermissionsLauncher, "requestPermissionsLauncher");
            this.context = context;
            this.requestPermissionsLauncher = requestPermissionsLauncher;
        }

        public final PermissionRequestWorker create(PermissionsState permission) {
            Intrinsics.checkNotNullParameter(permission, "permission");
            return new PermissionRequestWorker(this.requestPermissionsLauncher, this.context, permission);
        }
    }
}
