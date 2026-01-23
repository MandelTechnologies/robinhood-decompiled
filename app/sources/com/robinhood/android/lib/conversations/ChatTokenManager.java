package com.robinhood.android.lib.conversations;

import android.os.SystemClock;
import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.models.api.ApiSupportAccessToken;
import com.robinhood.models.api.ChannelType;
import com.robinhood.models.api.SupportAccessTokenRequest;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import p479j$.time.Duration;

/* compiled from: ChatTokenManager.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR \u0010\r\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/lib/conversations/ChatTokenManager;", "", "Lcom/robinhood/api/retrofit/PathfinderApi;", "pathfinderApi", "<init>", "(Lcom/robinhood/api/retrofit/PathfinderApi;)V", "", "force", "", "refreshAccessToken", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/robinhood/api/retrofit/PathfinderApi;", "j$/time/Duration", "staleTokenInterval", "Lj$/time/Duration;", "getStaleTokenInterval$lib_conversations_externalDebug", "()Lj$/time/Duration;", "getStaleTokenInterval$lib_conversations_externalDebug$annotations", "()V", "accessToken", "Ljava/lang/String;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "", "lastUpdateTime", "J", "isTokenStale", "()Z", "lib-conversations_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ChatTokenManager {
    private String accessToken;
    private long lastUpdateTime;
    private final Mutex mutex;
    private final PathfinderApi pathfinderApi;
    private final Duration staleTokenInterval;

    /* compiled from: ChatTokenManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.conversations.ChatTokenManager", m3645f = "ChatTokenManager.kt", m3646l = {36, 56}, m3647m = "refreshAccessToken")
    /* renamed from: com.robinhood.android.lib.conversations.ChatTokenManager$refreshAccessToken$1 */
    static final class C202101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C202101(Continuation<? super C202101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatTokenManager.this.refreshAccessToken(false, this);
        }
    }

    /* renamed from: getStaleTokenInterval$lib_conversations_externalDebug$annotations */
    public static /* synthetic */ void m2148x88752c76() {
    }

    public ChatTokenManager(PathfinderApi pathfinderApi) {
        Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
        this.pathfinderApi = pathfinderApi;
        this.staleTokenInterval = Durations.INSTANCE.getTHIRTY_MINUTES();
        this.mutex = Mutex3.Mutex$default(false, 1, null);
    }

    /* renamed from: getStaleTokenInterval$lib_conversations_externalDebug, reason: from getter */
    public final Duration getStaleTokenInterval() {
        return this.staleTokenInterval;
    }

    private final boolean isTokenStale() {
        return Duration.ofMillis(SystemClock.elapsedRealtime() - this.lastUpdateTime).compareTo(this.staleTokenInterval) > 0;
    }

    public static /* synthetic */ Object refreshAccessToken$default(ChatTokenManager chatTokenManager, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return chatTokenManager.refreshAccessToken(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshAccessToken(boolean z, Continuation<? super String> continuation) {
        C202101 c202101;
        String str;
        Mutex mutex;
        if (continuation instanceof C202101) {
            c202101 = (C202101) continuation;
            int i = c202101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c202101.label = i - Integer.MIN_VALUE;
            } else {
                c202101 = new C202101(continuation);
            }
        }
        Object objRefreshAccessToken = c202101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c202101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRefreshAccessToken);
            String str2 = this.accessToken;
            if (str2 != null && !z && !isTokenStale()) {
                return str2;
            }
            PathfinderApi pathfinderApi = this.pathfinderApi;
            SupportAccessTokenRequest supportAccessTokenRequest = new SupportAccessTokenRequest(ChannelType.CHAT);
            c202101.label = 1;
            objRefreshAccessToken = pathfinderApi.refreshAccessToken(supportAccessTokenRequest, c202101);
            if (objRefreshAccessToken != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutex = (Mutex) c202101.L$1;
            str = (String) c202101.L$0;
            ResultKt.throwOnFailure(objRefreshAccessToken);
            try {
                this.lastUpdateTime = SystemClock.elapsedRealtime();
                this.accessToken = str;
                return str;
            } finally {
                mutex.unlock(null);
            }
        }
        ResultKt.throwOnFailure(objRefreshAccessToken);
        String access_token = ((ApiSupportAccessToken) objRefreshAccessToken).getAccess_token();
        Mutex mutex2 = this.mutex;
        c202101.L$0 = access_token;
        c202101.L$1 = mutex2;
        c202101.label = 2;
        if (mutex2.lock(null, c202101) != coroutine_suspended) {
            str = access_token;
            mutex = mutex2;
            this.lastUpdateTime = SystemClock.elapsedRealtime();
            this.accessToken = str;
            return str;
        }
        return coroutine_suspended;
    }
}
