package sprig.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.FilesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Yield;
import org.json.JSONException;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 12\u00020\u0001:\u0001\u0005B\u0019\u0012\u0006\u0010.\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b/\u00100J\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J/\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\u00020\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ,\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r0\fJ&\u0010\u0005\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J%\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u001c\u0010\u001f\u001a\n \n*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010\u00048F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\u0005\u0010*\"\u0004\b+\u0010,\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, m3636d2 = {"Lsprig/e/f;", "", "", "subDirectory", "Ljava/io/File;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "startTime", "endTime", "", "kotlin.jvm.PlatformType", "(JJ)[Ljava/lang/String;", "Lkotlin/Function1;", "", "callback", "name", "Landroid/graphics/Bitmap;", "bitmap", "", "jpegQuality", "Lsprig/e/l;", "metrics", "currentTime", "threshold", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "Lsprig/g/a;", "c", "Lsprig/g/a;", "logger", "Lkotlinx/coroutines/CoroutineScope;", "d", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/io/File;", "()Ljava/io/File;", "setCurrentDirectory", "(Ljava/io/File;)V", "currentDirectory", "context", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "f", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.e.f */
/* loaded from: classes28.dex */
public final class C49014f {

    /* renamed from: a, reason: from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* renamed from: b, reason: from kotlin metadata */
    private final Context appContext;

    /* renamed from: c, reason: from kotlin metadata */
    private final C49029a logger;

    /* renamed from: d, reason: from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* renamed from: e, reason: from kotlin metadata */
    private File currentDirectory;

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.FileManager$copyFiles$1", m3645f = "FileManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: sprig.e.f$b */
    static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8356a;

        /* renamed from: b */
        private /* synthetic */ Object f8357b;

        /* renamed from: d */
        final /* synthetic */ Function1<String, Unit> f8359d;

        /* renamed from: e */
        final /* synthetic */ long f8360e;

        /* renamed from: f */
        final /* synthetic */ long f8361f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super String, Unit> function1, long j, long j2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8359d = function1;
            this.f8360e = j;
            this.f8361f = j2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = C49014f.this.new b(this.f8359d, this.f8360e, this.f8361f, continuation);
            bVar.f8357b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objM28550constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8356a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            File fileM4180a = C49014f.this.m4180a();
            String path = null;
            if (fileM4180a == null) {
                this.f8359d.invoke(null);
                return Unit.INSTANCE;
            }
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()");
            File fileM4172a = C49014f.this.m4172a(string2);
            if (fileM4172a == null) {
                this.f8359d.invoke(null);
                return Unit.INSTANCE;
            }
            String[] strArrM4178a = C49014f.this.m4178a(this.f8360e, this.f8361f);
            Function1<String, Unit> function1 = this.f8359d;
            try {
                Result.Companion companion = Result.INSTANCE;
                for (String it : strArrM4178a) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    FilesKt.copyTo$default(C49015g.m4187b(it, fileM4180a), new File(fileM4172a, it), false, 0, 6, null);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            C49014f c49014f = C49014f.this;
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                path = fileM4172a.getPath();
            } else {
                FilesKt.deleteRecursively(fileM4172a);
                C49029a c49029a = c49014f.logger;
                String message = thM28553exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                C49029a.m4295a(c49029a, "Error copying files", null, message, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, 50, null);
            }
            function1.invoke(path);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.FileManager", m3645f = "FileManager.kt", m3646l = {81}, m3647m = "removeOldFiles")
    /* renamed from: sprig.e.f$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a */
        Object f8362a;

        /* renamed from: b */
        Object f8363b;

        /* renamed from: c */
        int f8364c;

        /* renamed from: d */
        int f8365d;

        /* renamed from: e */
        /* synthetic */ Object f8366e;

        /* renamed from: g */
        int f8368g;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.f8366e = obj;
            this.f8368g |= Integer.MIN_VALUE;
            return C49014f.this.m4181a(0L, 0L, this);
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.FileManager$saveImage$1", m3645f = "FileManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: sprig.e.f$d */
    static final class d extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8369a;

        /* renamed from: b */
        final /* synthetic */ C49020l f8370b;

        /* renamed from: c */
        final /* synthetic */ C49014f f8371c;

        /* renamed from: d */
        final /* synthetic */ String f8372d;

        /* renamed from: e */
        final /* synthetic */ Bitmap f8373e;

        /* renamed from: f */
        final /* synthetic */ int f8374f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C49020l c49020l, C49014f c49014f, String str, Bitmap bitmap, int i, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f8370b = c49020l;
            this.f8371c = c49014f;
            this.f8372d = str;
            this.f8373e = bitmap;
            this.f8374f = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new d(this.f8370b, this.f8371c, this.f8372d, this.f8373e, this.f8374f, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8369a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C49020l c49020l = this.f8370b;
            EnumC49017i enumC49017i = EnumC49017i.FILE_WRITE;
            C49014f c49014f = this.f8371c;
            String str = this.f8372d;
            Bitmap bitmap = this.f8373e;
            int i = this.f8374f;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            long jCurrentTimeMillis = System.currentTimeMillis();
            File file = new File(c49014f.m4180a(), str);
            countDownLatch.countDown();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (bitmap.isRecycled()) {
                    Unit unit = Unit.INSTANCE;
                    Closeable.closeFinally(fileOutputStream, null);
                    return unit;
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
                fileOutputStream.flush();
                bitmap.recycle();
                Unit unit2 = Unit.INSTANCE;
                Closeable.closeFinally(fileOutputStream, null);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                executorServiceNewSingleThreadExecutor.execute(new RunnableC49019k(countDownLatch, jCurrentTimeMillis, c49020l, enumC49017i));
                executorServiceNewSingleThreadExecutor.shutdown();
                return Unit.INSTANCE;
            } finally {
            }
        }
    }

    public C49014f(Context context, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.appContext = context.getApplicationContext();
        this.logger = new C49029a();
        this.coroutineScope = CoroutineScope2.CoroutineScope(dispatcher);
    }

    /* renamed from: a */
    public final File m4180a() {
        File file = this.currentDirectory;
        if (file != null) {
            return file;
        }
        File fileM4174a = m4174a(this, (String) null, 1, (Object) null);
        this.currentDirectory = fileM4174a;
        return fileM4174a;
    }

    public /* synthetic */ C49014f(Context context, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* renamed from: a */
    static /* synthetic */ File m4174a(C49014f c49014f, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c49014f.m4172a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final File m4172a(String subDirectory) {
        String str = "sprig";
        if (subDirectory != null) {
            if ((subDirectory.length() > 0 ? subDirectory : null) != null) {
                String str2 = "sprig" + File.separator + subDirectory;
                if (str2 != null) {
                    str = str2;
                }
            }
        }
        File file = new File(this.appContext.getFilesDir(), str);
        if (file.exists() || file.mkdir()) {
            return file;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final String[] m4178a(final long startTime, final long endTime) {
        File fileM4180a = m4180a();
        String[] list = fileM4180a != null ? fileM4180a.list(new FilenameFilter() { // from class: sprig.e.f$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return C49014f.m4177a(startTime, endTime, file, str);
            }
        }) : null;
        return list == null ? new String[0] : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m4177a(long j, long j2, File file, String name) throws NumberFormatException {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        if (!TextUtils.isDigitsOnly(name)) {
            return false;
        }
        long j3 = Long.parseLong(name);
        return j <= j3 && j3 <= j2;
    }

    /* renamed from: a */
    public final void m4182a(long startTime, long endTime, Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(callback, startTime, endTime, null), 3, null);
    }

    /* renamed from: a */
    public final void m4183a(String name, Bitmap bitmap, int jpegQuality, C49020l metrics) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new d(metrics, this, name, bitmap, jpegQuality, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0074 -> B:23:0x0077). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4181a(long j, long j2, Continuation<? super Unit> continuation) {
        c cVar;
        String[] strArr;
        int length;
        int i;
        String str;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.f8368g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.f8368g = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        }
        Object obj = cVar.f8366e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cVar.f8368g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            File fileM4180a = m4180a();
            String path = fileM4180a != null ? fileM4180a.getPath() : null;
            String[] strArrM4178a = m4178a(0L, j - j2);
            strArr = strArrM4178a;
            length = strArrM4178a.length;
            i = 0;
            str = path;
            if (i < length) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = cVar.f8365d;
            i = cVar.f8364c;
            strArr = (String[]) cVar.f8363b;
            str = (String) cVar.f8362a;
            ResultKt.throwOnFailure(obj);
            i++;
            if (i < length) {
                new File(str, strArr[i]).delete();
                cVar.f8362a = str;
                cVar.f8363b = strArr;
                cVar.f8364c = i;
                cVar.f8365d = length;
                cVar.f8368g = 1;
                if (Yield.yield(cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i++;
                if (i < length) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Object m4175a(C49014f c49014f, long j, long j2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = 600000;
        }
        return c49014f.m4181a(j, j2, (Continuation<? super Unit>) continuation);
    }
}
