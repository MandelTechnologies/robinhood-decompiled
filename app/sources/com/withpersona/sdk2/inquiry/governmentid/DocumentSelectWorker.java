package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.view.result.ActivityResultLauncher;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherResult;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
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
import kotlin.p481io.Closeable;
import kotlin.p481io.IOStreams;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DocumentSelectWorker.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B/\b\u0007\u0012\u0014\b\u0001\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output;", "openDocumentLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "context", "Landroid/content/Context;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;)V", "launchSelectDocument", "", "extractFileNameFromUri", "file", "Landroid/net/Uri;", "run", "Lkotlinx/coroutines/flow/Flow;", "Output", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DocumentSelectWorker implements Worker<Output> {
    private final Context context;
    private final ActivityResultLauncher<String[]> openDocumentLauncher;
    private final SdkFilesManager sdkFilesManager;

    public DocumentSelectWorker(ActivityResultLauncher<String[]> openDocumentLauncher, Context context, SdkFilesManager sdkFilesManager) {
        Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.openDocumentLauncher = openDocumentLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    public final void launchSelectDocument() {
        this.openDocumentLauncher.launch(new String[]{"image/*", "application/pdf"});
    }

    public final String extractFileNameFromUri(Uri file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Cursor cursorQuery = this.context.getContentResolver().query(file, null, null, null, null);
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
        }
        String string2 = cursorQuery != null ? cursorQuery.getString(Math.max(cursorQuery.getColumnIndex("_display_name"), 0)) : null;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string2;
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        final DocumentSelectLauncherResult documentSelectLauncherResult = new DocumentSelectLauncherResult();
        return FlowKt.flowOn(new Flow<Output>() { // from class: com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2 */
            public static final class C435832<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ DocumentSelectWorker this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2", m3645f = "DocumentSelectWorker.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker$run$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C435832.this.emit(null, this);
                    }
                }

                public C435832(FlowCollector flowCollector, DocumentSelectWorker documentSelectWorker) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = documentSelectWorker;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws FileNotFoundException {
                    AnonymousClass1 anonymousClass1;
                    DocumentSelectWorker.Output success;
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
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            String type2 = this.this$0.context.getContentResolver().getType(uri);
                            String strExtractFileNameFromUri = this.this$0.extractFileNameFromUri(uri);
                            String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(type2);
                            if (extensionFromMimeType == null) {
                                extensionFromMimeType = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
                            }
                            SdkFilesManager sdkFilesManager = this.this$0.sdkFilesManager;
                            Intrinsics.checkNotNull(extensionFromMimeType);
                            File fileNewRandomSessionFile = sdkFilesManager.newRandomSessionFile(extensionFromMimeType);
                            InputStream inputStreamOpenInputStream = this.this$0.context.getContentResolver().openInputStream(uri);
                            Intrinsics.checkNotNull(inputStreamOpenInputStream);
                            FileOutputStream fileOutputStream = new FileOutputStream(fileNewRandomSessionFile);
                            try {
                                try {
                                    IOStreams.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                                    Closeable.closeFinally(inputStreamOpenInputStream, null);
                                    Closeable.closeFinally(fileOutputStream, null);
                                    String absolutePath = fileNewRandomSessionFile.getAbsolutePath();
                                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                                    success = new DocumentSelectWorker.Output.Success(absolutePath, strExtractFileNameFromUri);
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            success = DocumentSelectWorker.Output.Cancel.INSTANCE;
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
            public Object collect(FlowCollector<? super DocumentSelectWorker.Output> flowCollector, Continuation continuation) {
                Object objCollect = documentSelectLauncherResult.collect(new C435832(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, Dispatchers.getIO());
    }

    /* compiled from: DocumentSelectWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output;", "", "<init>", "()V", "Success", "Cancel", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output$Success;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentSelectWorker.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output$Success;", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output;", "absoluteFilePath", "", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAbsoluteFilePath", "()Ljava/lang/String;", "getFileName", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Success extends Output {
            private final String absoluteFilePath;
            private final String fileName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(String absoluteFilePath, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
                this.absoluteFilePath = absoluteFilePath;
                this.fileName = str;
            }

            public final String getAbsoluteFilePath() {
                return this.absoluteFilePath;
            }

            public final String getFileName() {
                return this.fileName;
            }
        }

        private Output() {
        }

        /* compiled from: DocumentSelectWorker.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output;", "<init>", "()V", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Cancel extends Output {
            public static final Cancel INSTANCE = new Cancel();

            private Cancel() {
                super(null);
            }
        }
    }
}
