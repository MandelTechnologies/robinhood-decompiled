package com.robinhood.android.api.supportchat;

import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.models.api.ApiSupportSalesforceToken;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import p479j$.time.Instant;
import p479j$.util.Base64;

/* compiled from: SalesforceChatTokenManager.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/api/supportchat/SalesforceChatTokenManager;", "", "pathfinderApi", "Lcom/robinhood/api/retrofit/PathfinderApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/api/retrofit/PathfinderApi;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "cache", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/robinhood/models/api/ApiSupportSalesforceToken;", "invalidateToken", "", "getToken", "isForceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isTokenInvalid", "isTokenExpired", "token", "lib-api-supportchat_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class SalesforceChatTokenManager {
    private final AtomicReference<ApiSupportSalesforceToken> cache;
    private final LazyMoshi moshi;
    private final PathfinderApi pathfinderApi;

    /* compiled from: SalesforceChatTokenManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.api.supportchat.SalesforceChatTokenManager", m3645f = "SalesforceChatTokenManager.kt", m3646l = {30}, m3647m = "getToken")
    /* renamed from: com.robinhood.android.api.supportchat.SalesforceChatTokenManager$getToken$1 */
    static final class C95571 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C95571(Continuation<? super C95571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SalesforceChatTokenManager.this.getToken(false, this);
        }
    }

    public SalesforceChatTokenManager(PathfinderApi pathfinderApi, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.pathfinderApi = pathfinderApi;
        this.moshi = moshi;
        this.cache = new AtomicReference<>(null);
    }

    public final void invalidateToken() {
        this.cache.set(null);
    }

    public static /* synthetic */ Object getToken$default(SalesforceChatTokenManager salesforceChatTokenManager, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return salesforceChatTokenManager.getToken(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getToken(boolean z, Continuation<? super ApiSupportSalesforceToken> continuation) {
        C95571 c95571;
        AtomicReference atomicReference;
        if (continuation instanceof C95571) {
            c95571 = (C95571) continuation;
            int i = c95571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c95571.label = i - Integer.MIN_VALUE;
            } else {
                c95571 = new C95571(continuation);
            }
        }
        Object supportChatSalesforceToken = c95571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c95571.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(supportChatSalesforceToken);
            if (z || isTokenInvalid()) {
                atomicReference = this.cache;
                PathfinderApi pathfinderApi = this.pathfinderApi;
                c95571.L$0 = atomicReference;
                c95571.label = 1;
                supportChatSalesforceToken = pathfinderApi.getSupportChatSalesforceToken(c95571);
                if (supportChatSalesforceToken == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ApiSupportSalesforceToken apiSupportSalesforceToken = this.cache.get();
            Intrinsics.checkNotNullExpressionValue(apiSupportSalesforceToken, "get(...)");
            return apiSupportSalesforceToken;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        atomicReference = (AtomicReference) c95571.L$0;
        ResultKt.throwOnFailure(supportChatSalesforceToken);
        atomicReference.set(supportChatSalesforceToken);
        ApiSupportSalesforceToken apiSupportSalesforceToken2 = this.cache.get();
        Intrinsics.checkNotNullExpressionValue(apiSupportSalesforceToken2, "get(...)");
        return apiSupportSalesforceToken2;
    }

    private final boolean isTokenInvalid() {
        ApiSupportSalesforceToken apiSupportSalesforceToken = this.cache.get();
        return apiSupportSalesforceToken == null || isTokenExpired(apiSupportSalesforceToken);
    }

    private final boolean isTokenExpired(ApiSupportSalesforceToken token) throws Exception {
        try {
            JsonAdapter jsonAdapterAdapter = this.moshi.adapter(JwtClaim.class);
            byte[] bArrDecode = Base64.getDecoder().decode((String) StringsKt.split$default((CharSequence) token.getJwt(), new String[]{"."}, false, 0, 6, (Object) null).get(1));
            Intrinsics.checkNotNull(bArrDecode);
            JwtClaim jwtClaim = (JwtClaim) jsonAdapterAdapter.fromJson(new String(bArrDecode, Charsets.UTF_8));
            if (jwtClaim != null) {
                return Instant.now().getEpochSecond() > jwtClaim.getExpirationEpochS();
            }
            throw new Exception("Invalid JWT claim");
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            return true;
        }
    }
}
