package microgram.android.http;

import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.logging.CrashReporter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import kotlinx.serialization.SerializationExceptions2;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;
import microgram.Message;
import microgram.android.HostMessageDispatcher;
import microgram.networking.HttpRequest;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* compiled from: RealHttpService.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lmicrogram/android/http/RealHttpService;", "Lmicrogram/android/http/HttpService;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lmicrogram/android/HostMessageDispatcher;", "messageDispatcher", "Lokhttp3/Call$Factory;", "callFactory", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/HostMessageDispatcher;Lokhttp3/Call$Factory;)V", "Lokhttp3/OkHttpClient;", "client", "(Lkotlinx/coroutines/CoroutineScope;Lmicrogram/android/HostMessageDispatcher;Lokhttp3/OkHttpClient;)V", "", "requestId", "", "cancel", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmicrogram/Message;", "message", "onRequest", "(Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCancellation", "Lkotlinx/coroutines/CoroutineScope;", "Lmicrogram/android/HostMessageDispatcher;", "Lokhttp3/Call$Factory;", "Lkotlinx/coroutines/sync/Mutex;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "", "Lkotlinx/coroutines/Job;", "jobs", "Ljava/util/Map;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class RealHttpService implements HttpService {
    private static final Json json = Json6.Json$default(null, new Function1() { // from class: microgram.android.http.RealHttpService$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return RealHttpService.json$lambda$5((Json4) obj);
        }
    }, 1, null);
    private final Call.Factory callFactory;
    private final CoroutineScope coroutineScope;
    private final Map<String, Job> jobs;
    private final Mutex lock;
    private final HostMessageDispatcher messageDispatcher;

    /* compiled from: RealHttpService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.http.RealHttpService", m3645f = "RealHttpService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "cancel")
    /* renamed from: microgram.android.http.RealHttpService$cancel$1 */
    static final class C462471 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462471(Continuation<? super C462471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHttpService.this.cancel(null, this);
        }
    }

    /* compiled from: RealHttpService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.http.RealHttpService", m3645f = "RealHttpService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "onRequest")
    /* renamed from: microgram.android.http.RealHttpService$onRequest$1 */
    static final class C462481 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C462481(Continuation<? super C462481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealHttpService.this.onRequest(null, this);
        }
    }

    public RealHttpService(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, Call.Factory callFactory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(callFactory, "callFactory");
        this.coroutineScope = coroutineScope;
        this.messageDispatcher = messageDispatcher;
        this.callFactory = callFactory;
        this.lock = Mutex3.Mutex$default(false, 1, null);
        this.jobs = new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealHttpService(CoroutineScope coroutineScope, HostMessageDispatcher messageDispatcher, OkHttpClient client) {
        this(coroutineScope, messageDispatcher, (Call.Factory) client);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(client, "client");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.http.HttpService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onRequest(Message message, Continuation<? super Boolean> continuation) {
        C462481 c462481;
        final HttpRequest httpRequest;
        Mutex mutex;
        if (continuation instanceof C462481) {
            c462481 = (C462481) continuation;
            int i = c462481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462481.label = i - Integer.MIN_VALUE;
            } else {
                c462481 = new C462481(continuation);
            }
        }
        Object obj = c462481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            String payload = message.getPayload();
            if (payload == null) {
                return boxing.boxBoolean(false);
            }
            try {
                Json json2 = json;
                json2.getSerializersModule();
                HttpRequest httpRequest2 = (HttpRequest) json2.decodeFromString(HttpRequest.INSTANCE.serializer(), payload);
                Mutex mutex2 = this.lock;
                c462481.L$0 = httpRequest2;
                c462481.L$1 = mutex2;
                c462481.label = 1;
                if (mutex2.lock(null, c462481) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                httpRequest = httpRequest2;
                mutex = mutex2;
            } catch (SerializationExceptions2 e) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
                return boxing.boxBoolean(false);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c462481.L$1;
            httpRequest = (HttpRequest) c462481.L$0;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (this.jobs.containsKey(httpRequest.getId())) {
                throw new IllegalStateException("Check failed.");
            }
            Map<String, Job> map = this.jobs;
            String id = httpRequest.getId();
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new RealHttpService2(httpRequest, this, null), 3, null);
            jobLaunch$default.invokeOnCompletion(new Function1() { // from class: microgram.android.http.RealHttpService$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RealHttpService.onRequest$lambda$2$lambda$1$lambda$0(this.f$0, httpRequest, (Throwable) obj2);
                }
            });
            map.put(id, jobLaunch$default);
            Unit unit = Unit.INSTANCE;
            mutex.unlock(null);
            return boxing.boxBoolean(true);
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRequest$lambda$2$lambda$1$lambda$0(RealHttpService realHttpService, HttpRequest httpRequest, Throwable th) {
        BuildersKt__Builders_commonKt.launch$default(realHttpService.coroutineScope, null, null, new RealHttpService3(realHttpService, httpRequest, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // microgram.android.http.HttpService
    public Object onCancellation(Message message, Continuation<? super Boolean> continuation) {
        String payload = message.getPayload();
        return payload == null ? boxing.boxBoolean(false) : cancel(payload, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancel(String str, Continuation<? super Boolean> continuation) {
        C462471 c462471;
        Mutex mutex;
        Unit unit;
        if (continuation instanceof C462471) {
            c462471 = (C462471) continuation;
            int i = c462471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462471.label = i - Integer.MIN_VALUE;
            } else {
                c462471 = new C462471(continuation);
            }
        }
        Object obj = c462471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462471.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            mutex = this.lock;
            c462471.L$0 = str;
            c462471.L$1 = mutex;
            c462471.label = 1;
            if (mutex.lock(null, c462471) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) c462471.L$1;
            String str2 = (String) c462471.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex2;
            str = str2;
        }
        try {
            Job jobRemove = this.jobs.remove(str);
            if (jobRemove != null) {
                Job.DefaultImpls.cancel$default(jobRemove, null, 1, null);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                z = false;
            }
            Boolean boolBoxBoolean = boxing.boxBoolean(z);
            mutex.unlock(null);
            return boolBoxBoolean;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$5(Json4 Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setClassDiscriminator("type");
        Json.setIgnoreUnknownKeys(true);
        Json.setExplicitNulls(false);
        return Unit.INSTANCE;
    }
}
