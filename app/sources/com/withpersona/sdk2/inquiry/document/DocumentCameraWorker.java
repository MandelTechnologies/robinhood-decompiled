package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.view.result.ActivityResultLauncher;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker;
import com.withpersona.sdk2.inquiry.launchers.PictureLauncherResult;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: DocumentCameraWorker.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B)\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output;", "pictureLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;)V", "launchTakePicture", "", "errorMessage", "", "run", "Lkotlinx/coroutines/flow/Flow;", "Companion", "Output", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DocumentCameraWorker implements Worker<Output> {
    private final Context context;
    private final ActivityResultLauncher<Uri> pictureLauncher;
    private final SdkFilesManager sdkFilesManager;

    public DocumentCameraWorker(ActivityResultLauncher<Uri> pictureLauncher, Context context, SdkFilesManager sdkFilesManager) {
        Intrinsics.checkNotNullParameter(pictureLauncher, "pictureLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.pictureLauncher = pictureLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    public final boolean launchTakePicture(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        try {
            Context context = this.context;
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".persona.provider", this.sdkFilesManager.newSessionFile("document_camera_photo.jpg"));
            ActivityResultLauncher<Uri> activityResultLauncher = this.pictureLauncher;
            Intrinsics.checkNotNull(uriForFile);
            activityResultLauncher.launch(uriForFile);
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(this.context, errorMessage, 0).show();
            return false;
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        final PictureLauncherResult pictureLauncherResult = new PictureLauncherResult();
        return new Flow<Output>() { // from class: com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2 */
            public static final class C435612<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ DocumentCameraWorker this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2", m3645f = "DocumentCameraWorker.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentCameraWorker$run$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C435612.this.emit(null, this);
                    }
                }

                public C435612(FlowCollector flowCollector, DocumentCameraWorker documentCameraWorker) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = documentCameraWorker;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    DocumentCameraWorker.Output success;
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
                        if (((Boolean) obj).booleanValue()) {
                            File fileNewSessionFile = this.this$0.sdkFilesManager.newSessionFile("document_camera_photo.jpg");
                            File fileNewRandomSessionFile = this.this$0.sdkFilesManager.newRandomSessionFile("jpg");
                            if (fileNewSessionFile.renameTo(fileNewRandomSessionFile)) {
                                String absolutePath = fileNewRandomSessionFile.getAbsolutePath();
                                Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                success = new DocumentCameraWorker.Output.Success(absolutePath);
                            } else {
                                success = DocumentCameraWorker.Output.Cancel.INSTANCE;
                            }
                        } else {
                            success = DocumentCameraWorker.Output.Cancel.INSTANCE;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(success, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super DocumentCameraWorker.Output> flowCollector, Continuation continuation) {
                Object objCollect = pictureLauncherResult.collect(new C435612(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* compiled from: DocumentCameraWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output;", "", "<init>", "()V", "Success", "Cancel", "Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output$Success;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentCameraWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output$Success;", "Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output;", "absoluteFilePath", "", "<init>", "(Ljava/lang/String;)V", "getAbsoluteFilePath", "()Ljava/lang/String;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Output {
            private final String absoluteFilePath;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String absoluteFilePath) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
            }

            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }
        }

        private Output() {
        }

        /* compiled from: DocumentCameraWorker.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output;", "<init>", "()V", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Cancel extends Output {
            public static final Cancel INSTANCE = new Cancel();

            private Cancel() {
                super(null);
            }
        }
    }
}
