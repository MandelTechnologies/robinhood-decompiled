package com.mux.stats.sdk.muxstats;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.mux.android.http.HttpClient;
import com.mux.android.http.HttpRequests;
import com.mux.android.http.HttpRequests2;
import com.mux.android.http.HttpRequests4;
import com.mux.stats.sdk.muxstats.INetworkRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.car.result.CarResultComposable2;
import java.net.URL;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MuxNetwork.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JM\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JM\u0010\u0011\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxNetwork;", "Lcom/mux/stats/sdk/muxstats/INetworkRequest;", "Lcom/mux/stats/sdk/muxstats/IDevice;", "device", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/mux/stats/sdk/muxstats/IDevice;Lkotlinx/coroutines/CoroutineScope;)V", "", "domain", "envKey", CarResultComposable2.BODY, "Ljava/util/Hashtable;", "requestHeaders", "Lcom/mux/stats/sdk/muxstats/INetworkRequest$IMuxNetworkRequestsCompletion2;", "completion", "", "postWithCompletion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;Lcom/mux/stats/sdk/muxstats/INetworkRequest$IMuxNetworkRequestsCompletion2;)V", "Lcom/mux/stats/sdk/muxstats/INetworkRequest$IMuxNetworkRequestsCompletion;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;Lcom/mux/stats/sdk/muxstats/INetworkRequest$IMuxNetworkRequestsCompletion;)V", "Lcom/mux/stats/sdk/muxstats/IDevice;", "Lcom/mux/android/http/HttpClient;", "httpClient", "Lcom/mux/android/http/HttpClient;", "Lkotlinx/coroutines/CoroutineScope;", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class MuxNetwork implements INetworkRequest {
    private final CoroutineScope coroutineScope;
    private final IDevice device;
    private final HttpClient httpClient;

    @JvmOverloads
    public MuxNetwork(IDevice device, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.device = device;
        this.httpClient = new HttpClient(MuxNetwork2.networkDevice(device), 0L, 2, null);
        this.coroutineScope = CoroutineScope2.CoroutineScope(coroutineScope.getCoroutineContext());
    }

    @Override // com.mux.stats.sdk.muxstats.INetworkRequest
    public void postWithCompletion(String domain, String envKey, String body, Hashtable<String, String> requestHeaders, INetworkRequest.IMuxNetworkRequestsCompletion2 completion) {
        Map mapEmptyMap;
        if (envKey == null) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getMain(), null, new C57432(completion, null), 2, null);
            return;
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme(Constants.SCHEME);
        if (domain == null) {
            domain = "";
        }
        Uri uriBuild = builderScheme.authority(HttpRequests.beaconAuthority(envKey, domain)).path("android").build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
        URL url = HttpRequests.toURL(uriBuild);
        if (requestHeaders == null) {
            mapEmptyMap = MapsKt.emptyMap();
        } else {
            mapEmptyMap = new LinkedHashMap(MapsKt.mapCapacity(requestHeaders.size()));
            Iterator<T> it = requestHeaders.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                mapEmptyMap.put(entry.getKey(), CollectionsKt.listOf(entry.getValue()));
            }
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C57421(url, mapEmptyMap, body, completion, null), 3, null);
    }

    /* compiled from: MuxNetwork.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$1", m3645f = "MuxNetwork.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$1 */
    static final class C57421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $body;
        final /* synthetic */ INetworkRequest.IMuxNetworkRequestsCompletion2 $completion;
        final /* synthetic */ Map<String, List<String>> $headers;
        final /* synthetic */ URL $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C57421(URL url, Map<String, ? extends List<String>> map, String str, INetworkRequest.IMuxNetworkRequestsCompletion2 iMuxNetworkRequestsCompletion2, Continuation<? super C57421> continuation) {
            super(2, continuation);
            this.$url = url;
            this.$headers = map;
            this.$body = str;
            this.$completion = iMuxNetworkRequestsCompletion2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MuxNetwork.this.new C57421(this.$url, this.$headers, this.$body, this.$completion, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C57421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpClient httpClient = MuxNetwork.this.httpClient;
                HttpRequests2 httpRequests2 = new HttpRequests2(this.$url, this.$headers, null, this.$body, 4, null);
                this.label = 1;
                obj = httpClient.call(httpRequests2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(MuxNetwork.this.coroutineScope, Dispatchers.getMain(), null, new AnonymousClass1(this.$completion, (HttpClient.CallResult) obj, null), 2, null);
            return Unit.INSTANCE;
        }

        /* compiled from: MuxNetwork.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$1$1", m3645f = "MuxNetwork.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ INetworkRequest.IMuxNetworkRequestsCompletion2 $completion;
            final /* synthetic */ HttpClient.CallResult $result;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(INetworkRequest.IMuxNetworkRequestsCompletion2 iMuxNetworkRequestsCompletion2, HttpClient.CallResult callResult, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$completion = iMuxNetworkRequestsCompletion2;
                this.$result = callResult;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$completion, this.$result, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                INetworkRequest.IMuxNetworkRequestsCompletion2 iMuxNetworkRequestsCompletion2 = this.$completion;
                if (iMuxNetworkRequestsCompletion2 != null) {
                    boolean successful = this.$result.getSuccessful();
                    HttpRequests4 response = this.$result.getResponse();
                    iMuxNetworkRequestsCompletion2.onComplete(successful, response != null ? response.getHeaders() : null);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: MuxNetwork.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$2", m3645f = "MuxNetwork.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.mux.stats.sdk.muxstats.MuxNetwork$postWithCompletion$2 */
    static final class C57432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ INetworkRequest.IMuxNetworkRequestsCompletion2 $completion;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C57432(INetworkRequest.IMuxNetworkRequestsCompletion2 iMuxNetworkRequestsCompletion2, Continuation<? super C57432> continuation) {
            super(2, continuation);
            this.$completion = iMuxNetworkRequestsCompletion2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C57432(this.$completion, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C57432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            INetworkRequest.IMuxNetworkRequestsCompletion2 iMuxNetworkRequestsCompletion2 = this.$completion;
            if (iMuxNetworkRequestsCompletion2 != null) {
                iMuxNetworkRequestsCompletion2.onComplete(false, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.mux.stats.sdk.muxstats.INetworkRequest
    public void postWithCompletion(String domain, String envKey, String body, Hashtable<String, String> requestHeaders, final INetworkRequest.IMuxNetworkRequestsCompletion completion) {
        postWithCompletion(domain, envKey, body, requestHeaders, new INetworkRequest.IMuxNetworkRequestsCompletion2() { // from class: com.mux.stats.sdk.muxstats.MuxNetwork$$ExternalSyntheticLambda0
            @Override // com.mux.stats.sdk.muxstats.INetworkRequest.IMuxNetworkRequestsCompletion2
            public final void onComplete(boolean z, Map map) {
                MuxNetwork.postWithCompletion$lambda$2(completion, z, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postWithCompletion$lambda$2(INetworkRequest.IMuxNetworkRequestsCompletion iMuxNetworkRequestsCompletion, boolean z, Map map) {
        if (iMuxNetworkRequestsCompletion != null) {
            iMuxNetworkRequestsCompletion.onComplete(z);
        }
    }
}
