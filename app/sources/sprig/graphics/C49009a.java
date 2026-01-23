package sprig.graphics;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.singular.sdk.internal.Constants;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0004B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b1\u00102J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bJ \u0010\u0004\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00070\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lsprig/e/a;", "", "", "Lsprig/e/a$a;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()[Lsprig/e/a$a;", "cacheRecord", "", "Ljava/util/UUID;", "workId", "Lkotlin/Function1;", "callback", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "context", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Ljava/io/File;", "c", "Ljava/io/File;", "getCacheDirectory$userleap_release", "()Ljava/io/File;", "setCacheDirectory$userleap_release", "(Ljava/io/File;)V", "cacheDirectory", "d", "getCacheFile$userleap_release", "setCacheFile$userleap_release", "cacheFile", "Lcom/google/gson/Gson;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lcom/google/gson/Gson;", "gson", "", "f", "Ljava/lang/String;", "cacheDirectoryName", "g", "cacheFileName", "Lkotlinx/coroutines/CoroutineScope;", "h", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.e.a */
/* loaded from: classes28.dex */
public final class C49009a {

    /* renamed from: a, reason: from kotlin metadata */
    private Context context;

    /* renamed from: b, reason: from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* renamed from: c, reason: from kotlin metadata */
    private File cacheDirectory;

    /* renamed from: d, reason: from kotlin metadata */
    private File cacheFile;

    /* renamed from: e, reason: from kotlin metadata */
    private final Gson gson;

    /* renamed from: f, reason: from kotlin metadata */
    private final String cacheDirectoryName;

    /* renamed from: g, reason: from kotlin metadata */
    private final String cacheFileName;

    /* renamed from: h, reason: from kotlin metadata */
    private final CoroutineScope coroutineScope;

    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lsprig/e/a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/UUID;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/util/UUID;", "()Ljava/util/UUID;", "workId", "b", "Ljava/lang/String;", "getSurveyId", "()Ljava/lang/String;", "surveyId", "c", "getResponseGroupUid", "responseGroupUid", "d", "getEventDigestJSArray", "eventDigestJSArray", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.a$a, reason: from toString */
    public static final /* data */ class CacheRecord {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final UUID workId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final String surveyId;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private final String responseGroupUid;

        /* renamed from: d, reason: from kotlin metadata and from toString */
        private final String eventDigestJSArray;

        public CacheRecord(UUID workId, String surveyId, String responseGroupUid, String eventDigestJSArray) {
            Intrinsics.checkNotNullParameter(workId, "workId");
            Intrinsics.checkNotNullParameter(surveyId, "surveyId");
            Intrinsics.checkNotNullParameter(responseGroupUid, "responseGroupUid");
            Intrinsics.checkNotNullParameter(eventDigestJSArray, "eventDigestJSArray");
            this.workId = workId;
            this.surveyId = surveyId;
            this.responseGroupUid = responseGroupUid;
            this.eventDigestJSArray = eventDigestJSArray;
        }

        /* renamed from: a, reason: from getter */
        public final UUID getWorkId() {
            return this.workId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CacheRecord)) {
                return false;
            }
            CacheRecord cacheRecord = (CacheRecord) other;
            return Intrinsics.areEqual(this.workId, cacheRecord.workId) && Intrinsics.areEqual(this.surveyId, cacheRecord.surveyId) && Intrinsics.areEqual(this.responseGroupUid, cacheRecord.responseGroupUid) && Intrinsics.areEqual(this.eventDigestJSArray, cacheRecord.eventDigestJSArray);
        }

        public int hashCode() {
            return (((((this.workId.hashCode() * 31) + this.surveyId.hashCode()) * 31) + this.responseGroupUid.hashCode()) * 31) + this.eventDigestJSArray.hashCode();
        }

        public String toString() {
            return "CacheRecord(workId=" + this.workId + ", surveyId=" + this.surveyId + ", responseGroupUid=" + this.responseGroupUid + ", eventDigestJSArray=" + this.eventDigestJSArray + ')';
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.CacheManager$appendCacheRecord$1", m3645f = "CacheManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.a$b */
    static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8334a;

        /* renamed from: c */
        final /* synthetic */ CacheRecord f8336c;

        /* renamed from: d */
        final /* synthetic */ File f8337d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CacheRecord cacheRecord, File file, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f8336c = cacheRecord;
            this.f8337d = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49009a.this.new b(this.f8336c, this.f8337d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws JsonSyntaxException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8334a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String pendingCachesJson = C49009a.this.gson.toJson(ArraysKt.plus(C49009a.this.m4158a(), this.f8336c));
            File file = this.f8337d;
            Intrinsics.checkNotNullExpressionValue(pendingCachesJson, "pendingCachesJson");
            FilesKt.writeText$default(file, pendingCachesJson, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.CacheManager$getCacheRecordsAsync$1", m3645f = "CacheManager.kt", m3646l = {57}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.a$c */
    static final class c extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8338a;

        /* renamed from: c */
        final /* synthetic */ Function1<CacheRecord[], Unit> f8340c;

        @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
        @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.CacheManager$getCacheRecordsAsync$1$1", m3645f = "CacheManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: sprig.e.a$c$a */
        static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            int f8341a;

            /* renamed from: b */
            final /* synthetic */ Function1<CacheRecord[], Unit> f8342b;

            /* renamed from: c */
            final /* synthetic */ CacheRecord[] f8343c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function1<? super CacheRecord[], Unit> function1, CacheRecord[] cacheRecordArr, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f8342b = function1;
                this.f8343c = cacheRecordArr;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f8342b, this.f8343c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8341a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f8342b.invoke(this.f8343c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super CacheRecord[], Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f8340c = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49009a.this.new c(this.f8340c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws JsonSyntaxException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8338a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CacheRecord[] cacheRecordArrM4158a = C49009a.this.m4158a();
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(this.f8340c, cacheRecordArrM4158a, null);
                this.f8338a = 1;
                if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.CacheManager$removeCacheRecord$1", m3645f = "CacheManager.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: sprig.e.a$d */
    static final class d extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8344a;

        /* renamed from: c */
        final /* synthetic */ File f8346c;

        /* renamed from: d */
        final /* synthetic */ UUID f8347d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(File file, UUID uuid, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f8346c = file;
            this.f8347d = uuid;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49009a.this.new d(this.f8346c, this.f8347d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws JsonSyntaxException {
            CacheRecord cacheRecord;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8344a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CacheRecord[] cacheRecordArrM4158a = C49009a.this.m4158a();
            UUID uuid = this.f8347d;
            int length = cacheRecordArrM4158a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cacheRecord = null;
                    break;
                }
                cacheRecord = cacheRecordArrM4158a[i];
                if (Intrinsics.areEqual(cacheRecord.getWorkId(), uuid)) {
                    break;
                }
                i++;
            }
            if (cacheRecord == null) {
                return Unit.INSTANCE;
            }
            Gson gson = C49009a.this.gson;
            UUID uuid2 = this.f8347d;
            ArrayList arrayList = new ArrayList();
            for (CacheRecord cacheRecord2 : cacheRecordArrM4158a) {
                if (!Intrinsics.areEqual(cacheRecord2.getWorkId(), uuid2)) {
                    arrayList.add(cacheRecord2);
                }
            }
            String pendingCachesJson = gson.toJson(arrayList);
            File file = this.f8346c;
            Intrinsics.checkNotNullExpressionValue(pendingCachesJson, "pendingCachesJson");
            FilesKt.writeText$default(file, pendingCachesJson, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    public C49009a(Context context, CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.context = context;
        this.dispatcher = dispatcher;
        this.gson = new Gson();
        this.cacheDirectoryName = "sprig_cache";
        this.cacheFileName = "sprig_cache_records.json";
        this.coroutineScope = CoroutineScope2.CoroutineScope(dispatcher);
        File file = new File(this.context.getApplicationContext().getFilesDir(), "sprig_cache");
        if (!file.exists() && !file.mkdir()) {
            file = null;
        }
        this.cacheDirectory = file;
        File file2 = new File(this.cacheDirectory, "sprig_cache_records.json");
        this.cacheFile = (file2.exists() || file2.createNewFile()) ? file2 : null;
    }

    /* renamed from: a */
    public final void m4163a(CacheRecord cacheRecord) {
        Intrinsics.checkNotNullParameter(cacheRecord, "cacheRecord");
        File file = this.cacheFile;
        if (file == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new b(cacheRecord, file, null), 3, null);
    }

    /* renamed from: a */
    public final void m4161a(UUID workId) {
        Intrinsics.checkNotNullParameter(workId, "workId");
        File file = this.cacheFile;
        if (file == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new d(file, workId, null), 3, null);
    }

    /* renamed from: a */
    public final void m4162a(Function1<? super CacheRecord[], Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new c(callback, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final CacheRecord[] m4158a() throws JsonSyntaxException {
        File file = this.cacheFile;
        if (file == null) {
            return new CacheRecord[0];
        }
        Gson gson = new Gson();
        String text$default = FilesKt.readText$default(file, null, 1, null);
        if (text$default.length() == 0) {
            return new CacheRecord[0];
        }
        Object objFromJson = gson.fromJson(text$default, (Class<Object>) CacheRecord[].class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "gson.fromJson(fileConten…CacheRecord>::class.java)");
        return (CacheRecord[]) objFromJson;
    }

    public /* synthetic */ C49009a(Context context, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
