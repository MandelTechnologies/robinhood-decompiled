package com.withpersona.sdk2.inquiry.document;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.PickVisualMediaRequest;
import androidx.view.result.PickVisualMediaRequest2;
import androidx.view.result.contract.ActivityResultContracts$PickVisualMedia;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker;
import com.withpersona.sdk2.inquiry.launchers.DocumentsSelectLauncherResult;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.IOStreams;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.Timeout6;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DocumentsSelectWorker.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J&\u0010\u0013\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0082@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output;", "key", "", "context", "Landroid/content/Context;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "launchPicker", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;Lkotlin/jvm/functions/Function0;)V", "doesSameWorkAs", "", "otherWorker", "run", "Lkotlinx/coroutines/flow/Flow;", "handleDocumentResult", "Lkotlinx/coroutines/flow/FlowCollector;", "documentSelectResult", "", "Landroid/net/Uri;", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Output", "Error", "Factory", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class DocumentsSelectWorker implements Worker<Output> {
    private final Context context;
    private final String key;
    private final Function0<Unit> launchPicker;
    private final SdkFilesManager sdkFilesManager;

    public DocumentsSelectWorker(String key, Context context, SdkFilesManager sdkFilesManager, Function0<Unit> launchPicker) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(launchPicker, "launchPicker");
        this.key = key;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
        this.launchPicker = launchPicker;
    }

    @Override // com.squareup.workflow1.Worker
    public boolean doesSameWorkAs(Worker<?> otherWorker) {
        Intrinsics.checkNotNullParameter(otherWorker, "otherWorker");
        return (otherWorker instanceof DocumentsSelectWorker) && Intrinsics.areEqual(this.key, ((DocumentsSelectWorker) otherWorker).key);
    }

    /* compiled from: DocumentsSelectWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1", m3645f = "DocumentsSelectWorker.kt", m3646l = {40, 44, 48, 52}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1 */
    static final class C435701 extends ContinuationImpl7 implements Function2<FlowCollector<? super Output>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C435701(Continuation<? super C435701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C435701 c435701 = DocumentsSelectWorker.this.new C435701(continuation);
            c435701.L$0 = obj;
            return c435701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super Output> flowCollector, Continuation<? super Unit> continuation) {
            return ((C435701) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        
            if (r2.handleDocumentResult(r1, r11, r10) == r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        
            if (r11.collect(r3, r10) != r0) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.L$0;
                DocumentsSelectWorker2 documentsSelectWorker2 = new DocumentsSelectWorker2(null);
                this.L$0 = flowCollector2;
                this.label = 1;
                Object objWithTimeoutOrNull = Timeout6.withTimeoutOrNull(100L, documentsSelectWorker2, this);
                if (objWithTimeoutOrNull != coroutine_suspended) {
                    flowCollector = flowCollector2;
                    obj = objWithTimeoutOrNull;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    throw new ExceptionsH();
                }
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                DocumentsSelectLauncherResult documentsSelectLauncherResult = new DocumentsSelectLauncherResult();
                final DocumentsSelectWorker documentsSelectWorker = DocumentsSelectWorker.this;
                FlowCollector<? super List<? extends Uri>> flowCollector3 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker.run.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((List<? extends Uri>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(List<? extends Uri> list, Continuation<? super Unit> continuation) throws FileNotFoundException {
                        Object objHandleDocumentResult = documentsSelectWorker.handleDocumentResult(flowCollector, list, continuation);
                        return objHandleDocumentResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleDocumentResult : Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 4;
            }
            List list = (List) obj;
            if (list != null) {
                DocumentsSelectWorker documentsSelectWorker3 = DocumentsSelectWorker.this;
                this.L$0 = null;
                this.label = 2;
            } else {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocumentsSelectWorker.this, null);
                this.L$0 = flowCollector;
                this.label = 3;
                if (BuildersKt.withContext(main, anonymousClass1, this) != coroutine_suspended) {
                    DocumentsSelectLauncherResult documentsSelectLauncherResult2 = new DocumentsSelectLauncherResult();
                    final DocumentsSelectWorker documentsSelectWorker4 = DocumentsSelectWorker.this;
                    FlowCollector<? super List<? extends Uri>> flowCollector32 = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker.run.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((List<? extends Uri>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(List<? extends Uri> list2, Continuation<? super Unit> continuation) throws FileNotFoundException {
                            Object objHandleDocumentResult = documentsSelectWorker4.handleDocumentResult(flowCollector, list2, continuation);
                            return objHandleDocumentResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleDocumentResult : Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 4;
                }
            }
            return coroutine_suspended;
        }

        /* compiled from: DocumentsSelectWorker.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$1", m3645f = "DocumentsSelectWorker.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$run$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DocumentsSelectWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocumentsSelectWorker documentsSelectWorker, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = documentsSelectWorker;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.launchPicker.invoke();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.squareup.workflow1.Worker
    public Flow<Output> run() {
        return FlowKt.flowOn(FlowKt.flow(new C435701(null)), Dispatchers.getIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleDocumentResult(FlowCollector<? super Output> flowCollector, List<? extends Uri> list, Continuation<? super Unit> continuation) throws FileNotFoundException {
        String absolutePath;
        File fileNewRandomSessionFile;
        InputStream inputStreamOpenInputStream;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ContentResolver contentResolver = this.context.getContentResolver();
        if (list.isEmpty()) {
            Object objEmit = flowCollector.emit(Output.Cancel.INSTANCE, continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Error error = null;
        for (Uri uri : list) {
            try {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(contentResolver.getType(uri));
                SdkFilesManager sdkFilesManager = this.sdkFilesManager;
                if (extensionFromMimeType == null) {
                    extensionFromMimeType = "jpg";
                }
                fileNewRandomSessionFile = sdkFilesManager.newRandomSessionFile(extensionFromMimeType);
                inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            } catch (FileNotFoundException unused) {
                error = Error.FileNotFound;
                absolutePath = null;
                if (absolutePath != null) {
                }
            } catch (SecurityException unused2) {
                error = Error.PermissionDenied;
                absolutePath = null;
                if (absolutePath != null) {
                }
            }
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fileNewRandomSessionFile);
            try {
                try {
                    IOStreams.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                    Closeable.closeFinally(inputStreamOpenInputStream, null);
                    Closeable.closeFinally(fileOutputStream, null);
                    absolutePath = fileNewRandomSessionFile.getAbsolutePath();
                    if (absolutePath != null) {
                        arrayList.add(absolutePath);
                    }
                } finally {
                }
            } finally {
            }
        }
        if (error == null) {
            Object objEmit2 = flowCollector.emit(new Output.Success(arrayList), continuation);
            if (objEmit2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objEmit2;
            }
        } else {
            Object objEmit3 = flowCollector.emit(new Output.Failure(arrayList, error), continuation);
            if (objEmit3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objEmit3;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: DocumentsSelectWorker.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output;", "", "<init>", "()V", "Success", "Failure", "Cancel", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output$Failure;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output$Success;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Output {
        public /* synthetic */ Output(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocumentsSelectWorker.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output$Success;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output;", "", "", "absoluteFilePaths", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAbsoluteFilePaths", "()Ljava/util/List;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Success extends Output {
            private final List<String> absoluteFilePaths;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.absoluteFilePaths, ((Success) other).absoluteFilePaths);
            }

            public int hashCode() {
                return this.absoluteFilePaths.hashCode();
            }

            public String toString() {
                return "Success(absoluteFilePaths=" + this.absoluteFilePaths + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(List<String> absoluteFilePaths) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePaths, "absoluteFilePaths");
                this.absoluteFilePaths = absoluteFilePaths;
            }

            public final List<String> getAbsoluteFilePaths() {
                return this.absoluteFilePaths;
            }
        }

        private Output() {
        }

        /* compiled from: DocumentsSelectWorker.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output$Failure;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output;", "", "", "absoluteFilePaths", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Error;", "reason", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Error;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAbsoluteFilePaths", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Error;", "getReason", "()Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Error;", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Failure extends Output {
            private final List<String> absoluteFilePaths;
            private final Error reason;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.absoluteFilePaths, failure.absoluteFilePaths) && this.reason == failure.reason;
            }

            public int hashCode() {
                return (this.absoluteFilePaths.hashCode() * 31) + this.reason.hashCode();
            }

            public String toString() {
                return "Failure(absoluteFilePaths=" + this.absoluteFilePaths + ", reason=" + this.reason + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(List<String> absoluteFilePaths, Error reason) {
                super(null);
                Intrinsics.checkNotNullParameter(absoluteFilePaths, "absoluteFilePaths");
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.absoluteFilePaths = absoluteFilePaths;
                this.reason = reason;
            }

            public final List<String> getAbsoluteFilePaths() {
                return this.absoluteFilePaths;
            }
        }

        /* compiled from: DocumentsSelectWorker.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output$Cancel;", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Output;", "<init>", "()V", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Cancel extends Output {
            public static final Cancel INSTANCE = new Cancel();

            private Cancel() {
                super(null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DocumentsSelectWorker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Error;", "", "<init>", "(Ljava/lang/String;I)V", "FileNotFound", "PermissionDenied", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Error {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;
        public static final Error FileNotFound = new Error("FileNotFound", 0);
        public static final Error PermissionDenied = new Error("PermissionDenied", 1);

        private static final /* synthetic */ Error[] $values() {
            return new Error[]{FileNotFound, PermissionDenied};
        }

        public static EnumEntries<Error> getEntries() {
            return $ENTRIES;
        }

        private Error(String str, int i) {
        }

        static {
            Error[] errorArr$values = $values();
            $VALUES = errorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorArr$values);
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* compiled from: DocumentsSelectWorker.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker$Factory;", "", "openDocumentLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "selectFromPhotoLibraryLauncher", "Landroidx/activity/result/PickVisualMediaRequest;", "context", "Landroid/content/Context;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/ActivityResultLauncher;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;)V", "createWithDocumentPicker", "Lcom/withpersona/sdk2/inquiry/document/DocumentsSelectWorker;", "createWithPhotoLibraryPicker", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Factory {
        private final Context context;
        private final ActivityResultLauncher<String[]> openDocumentLauncher;
        private final SdkFilesManager sdkFilesManager;
        private final ActivityResultLauncher<PickVisualMediaRequest> selectFromPhotoLibraryLauncher;

        public Factory(ActivityResultLauncher<String[]> openDocumentLauncher, ActivityResultLauncher<PickVisualMediaRequest> selectFromPhotoLibraryLauncher, Context context, SdkFilesManager sdkFilesManager) {
            Intrinsics.checkNotNullParameter(openDocumentLauncher, "openDocumentLauncher");
            Intrinsics.checkNotNullParameter(selectFromPhotoLibraryLauncher, "selectFromPhotoLibraryLauncher");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
            this.openDocumentLauncher = openDocumentLauncher;
            this.selectFromPhotoLibraryLauncher = selectFromPhotoLibraryLauncher;
            this.context = context;
            this.sdkFilesManager = sdkFilesManager;
        }

        public final DocumentsSelectWorker createWithDocumentPicker() {
            return new DocumentsSelectWorker("DocumentPicker", this.context, this.sdkFilesManager, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$Factory$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentsSelectWorker.Factory.createWithDocumentPicker$lambda$0(this.f$0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createWithDocumentPicker$lambda$0(Factory factory) {
            factory.openDocumentLauncher.launch(new String[]{"image/*", "application/pdf"});
            return Unit.INSTANCE;
        }

        public final DocumentsSelectWorker createWithPhotoLibraryPicker() {
            return new DocumentsSelectWorker("PhotoLibraryPicker", this.context, this.sdkFilesManager, new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker$Factory$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DocumentsSelectWorker.Factory.createWithPhotoLibraryPicker$lambda$1(this.f$0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit createWithPhotoLibraryPicker$lambda$1(Factory factory) {
            factory.selectFromPhotoLibraryLauncher.launch(PickVisualMediaRequest2.PickVisualMediaRequest$default(ActivityResultContracts$PickVisualMedia.ImageOnly.INSTANCE, 0, false, null, 14, null));
            return Unit.INSTANCE;
        }
    }
}
