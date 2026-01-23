package com.salesforce.android.smi.remote.internal.api.authorization;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.MarginCall;
import com.salesforce.android.smi.common.api.Result;
import com.salesforce.android.smi.database.AuthorizationStore;
import com.salesforce.android.smi.network.api.auth.UserVerificationProvider;
import com.salesforce.android.smi.network.api.auth.UserVerificationToken;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
import com.salesforce.android.smi.network.data.domain.participant.CoreParticipant;
import com.salesforce.android.smi.network.data.model.InstallInfo;
import com.salesforce.android.smi.remote.internal.api.AbstractHttpService;
import com.salesforce.android.smi.remote.internal.api.rest.interceptors.RetryInterceptor;
import com.salesforce.android.smi.remote.internal.dto.request.RevokeTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.UnauthenticatedRenewTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.request.unauthenticated.UnauthenticatedTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.request.userVerification.UserVerificationAuthTokenRequest;
import com.salesforce.android.smi.remote.internal.dto.response.AuthenticatedTokenResponse;
import com.salesforce.android.smi.remote.internal.dto.response.UnauthenticatedTokenResponse;
import io.jsonwebtoken.Claims;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* compiled from: AuthorizationService.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 O2\u00020\u0001:\u0001OB9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0011J(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0082@¢\u0006\u0004\b\u0017\u0010\u0011J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0018\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020#H\u0082@¢\u0006\u0004\b!\u0010$J\u0019\u0010&\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b*\u0010+J \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\b\b\u0002\u0010,\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b-\u0010.J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020%0\u0014H\u0086@¢\u0006\u0004\b/\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\n 8*\u0004\u0018\u000107078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010<\u001a\n 8*\u0004\u0018\u00010;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010'R$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0017\u0010K\u001a\u00020J8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006P"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "Lcom/salesforce/android/smi/remote/internal/api/AbstractHttpService;", "Ljava/net/URL;", "baseUrl", "", "organizationId", "developerName", "", "isUserVerificationRequired", "Lcom/salesforce/android/smi/network/data/model/InstallInfo;", "installInfo", "Lcom/salesforce/android/smi/database/AuthorizationStore;", "authorizationStore", "<init>", "(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;ZLcom/salesforce/android/smi/network/data/model/InstallInfo;Lcom/salesforce/android/smi/database/AuthorizationStore;)V", "Lcom/salesforce/android/smi/network/data/domain/auth/Auth;", "currentAuth", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAuth", "isRenew", "Lcom/salesforce/android/smi/common/api/Result;", "fetchOrRenewAuthorization", "(Lcom/salesforce/android/smi/network/data/domain/auth/Auth;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unauthenticatedFetchTokens", "auth", "unauthenticatedRenewTokens", "(Lcom/salesforce/android/smi/network/data/domain/auth/Auth;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider$ChallengeReason;", "reason", "authenticatedFetchTokens", "(Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider$ChallengeReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/response/UnauthenticatedTokenResponse;", "tokens", "handleTokensResponse", "(Lcom/salesforce/android/smi/remote/internal/dto/response/UnauthenticatedTokenResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/salesforce/android/smi/remote/internal/dto/response/AuthenticatedTokenResponse;", "(Lcom/salesforce/android/smi/remote/internal/dto/response/AuthenticatedTokenResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "updateCache", "(Lcom/salesforce/android/smi/network/data/domain/auth/Auth;)V", "lastEventId", "", "updateLastEventId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "force", "authorization", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeToken", "Ljava/lang/String;", "Z", "Lcom/salesforce/android/smi/network/data/model/InstallInfo;", "Lcom/salesforce/android/smi/database/AuthorizationStore;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationApi;", "api", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationApi;", "authCache", "Lcom/salesforce/android/smi/network/data/domain/auth/Auth;", "getAuthCache", "()Lcom/salesforce/android/smi/network/data/domain/auth/Auth;", "setAuthCache", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;", "userVerificationProvider", "Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;", "getUserVerificationProvider", "()Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;", "setUserVerificationProvider", "(Lcom/salesforce/android/smi/network/api/auth/UserVerificationProvider;)V", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationInterceptor;", "authorizationInterceptor", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationInterceptor;", "getAuthorizationInterceptor", "()Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationInterceptor;", "Companion", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class AuthorizationService extends AbstractHttpService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;
    private final AuthorizationApi api;
    private volatile Auth authCache;
    private final AuthorizationInterceptor authorizationInterceptor;
    private final AuthorizationStore authorizationStore;
    private final String developerName;
    private final InstallInfo installInfo;
    private final boolean isUserVerificationRequired;
    private final Logger logger;
    private final Mutex mutex;
    private final String organizationId;
    private UserVerificationProvider userVerificationProvider;

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "authenticatedFetchTokens")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$authenticatedFetchTokens$1 */
    static final class C423231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C423231(Continuation<? super C423231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.authenticatedFetchTokens(null, this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {256, 80, 82, 84}, m3647m = "authorization")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$authorization$1 */
    static final class C423241 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C423241(Continuation<? super C423241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.authorization(false, this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "handleTokensResponse")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$handleTokensResponse$1 */
    static final class C423251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C423251(Continuation<? super C423251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.handleTokensResponse((UnauthenticatedTokenResponse) null, this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {224}, m3647m = "handleTokensResponse")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$handleTokensResponse$2 */
    static final class C423262 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C423262(Continuation<? super C423262> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.handleTokensResponse((AuthenticatedTokenResponse) null, this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {59}, m3647m = "readAuth")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$readAuth$1 */
    static final class C423271 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C423271(Continuation<? super C423271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.readAuth(this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {95, 96, 100}, m3647m = "revokeToken")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$revokeToken$1 */
    static final class C423281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C423281(Continuation<? super C423281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.revokeToken(this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "unauthenticatedFetchTokens")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$unauthenticatedFetchTokens$1 */
    static final class C423291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C423291(Continuation<? super C423291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.unauthenticatedFetchTokens(this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "unauthenticatedRenewTokens")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$unauthenticatedRenewTokens$1 */
    static final class C423301 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C423301(Continuation<? super C423301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.unauthenticatedRenewTokens(null, this);
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService", m3645f = "AuthorizationService.kt", m3646l = {69}, m3647m = "updateLastEventId")
    /* renamed from: com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$updateLastEventId$1 */
    static final class C423311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C423311(Continuation<? super C423311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthorizationService.this.updateLastEventId(null, this);
        }
    }

    public /* synthetic */ AuthorizationService(URL url, String str, String str2, boolean z, InstallInfo installInfo, AuthorizationStore authorizationStore, DefaultConstructorMarker defaultConstructorMarker) {
        this(url, str, str2, z, installInfo, authorizationStore);
    }

    private AuthorizationService(URL url, String str, String str2, boolean z, InstallInfo installInfo, AuthorizationStore authorizationStore) {
        this.organizationId = str;
        this.developerName = str2;
        this.isUserVerificationRequired = z;
        this.installInfo = installInfo;
        this.authorizationStore = authorizationStore;
        updateCache(null);
        this.mutex = Mutex3.Mutex$default(false, 1, null);
        this.logger = Logger.getLogger(TAG);
        this.api = (AuthorizationApi) getRetrofitBuilder().baseUrl(url).addConverterFactory(MoshiConverterFactory.create(getMoshi())).client(getOkHttpClientBuilder().addInterceptor(RetryInterceptor.Companion.create$default(RetryInterceptor.INSTANCE, 0, 0, 3, null)).build()).build().create(AuthorizationApi.class);
        this.authorizationInterceptor = new AuthorizationInterceptor(this);
    }

    public final void setUserVerificationProvider(UserVerificationProvider userVerificationProvider) {
        this.userVerificationProvider = userVerificationProvider;
    }

    private final Object currentAuth(Continuation<? super Auth> continuation) {
        Auth auth = this.authCache;
        return auth == null ? readAuth(continuation) : auth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAuth(Continuation<? super Auth> continuation) {
        C423271 c423271;
        AuthorizationService authorizationService;
        Object obj;
        if (continuation instanceof C423271) {
            c423271 = (C423271) continuation;
            int i = c423271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423271.label = i - Integer.MIN_VALUE;
            } else {
                c423271 = new C423271(continuation);
            }
        }
        Object obj2 = c423271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423271.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            try {
                AuthorizationStore authorizationStore = this.authorizationStore;
                boolean z = this.isUserVerificationRequired;
                c423271.L$0 = this;
                c423271.label = 1;
                Object obj3 = authorizationStore.read(z, c423271);
                if (obj3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                authorizationService = this;
                obj = obj3;
            } catch (Exception e) {
                e = e;
                authorizationService = this;
                authorizationService.logger.log(Level.WARNING, e.getMessage());
                return null;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authorizationService = (AuthorizationService) c423271.L$0;
            try {
                ResultKt.throwOnFailure(obj2);
                obj = obj2;
            } catch (Exception e2) {
                e = e2;
                authorizationService.logger.log(Level.WARNING, e.getMessage());
                return null;
            }
        }
        authorizationService.updateCache((Auth) obj);
        return (Auth) obj;
    }

    public final AuthorizationInterceptor getAuthorizationInterceptor() {
        return this.authorizationInterceptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateLastEventId(String str, Continuation<? super Integer> continuation) {
        C423311 c423311;
        AuthorizationService authorizationService;
        int iIntValue;
        if (continuation instanceof C423311) {
            c423311 = (C423311) continuation;
            int i = c423311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423311.label = i - Integer.MIN_VALUE;
            } else {
                c423311 = new C423311(continuation);
            }
        }
        Object objUpdateLastEventId = c423311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423311.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUpdateLastEventId);
            try {
                AuthorizationStore authorizationStore = this.authorizationStore;
                boolean z = this.isUserVerificationRequired;
                c423311.L$0 = this;
                c423311.L$1 = str;
                c423311.label = 1;
                objUpdateLastEventId = authorizationStore.updateLastEventId(z, str, c423311);
                if (objUpdateLastEventId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                authorizationService = this;
            } catch (Exception e) {
                e = e;
                authorizationService = this;
                authorizationService.logger.log(Level.WARNING, e.getMessage());
                iIntValue = -1;
                return boxing.boxInt(iIntValue);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c423311.L$1;
            authorizationService = (AuthorizationService) c423311.L$0;
            try {
                ResultKt.throwOnFailure(objUpdateLastEventId);
            } catch (Exception e2) {
                e = e2;
                authorizationService.logger.log(Level.WARNING, e.getMessage());
                iIntValue = -1;
                return boxing.boxInt(iIntValue);
            }
        }
        ((Number) objUpdateLastEventId).intValue();
        Auth auth = authorizationService.authCache;
        if (auth != null) {
            auth.setLastEventId(str);
        }
        iIntValue = ((Number) objUpdateLastEventId).intValue();
        return boxing.boxInt(iIntValue);
    }

    public static /* synthetic */ Object authorization$default(AuthorizationService authorizationService, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return authorizationService.authorization(z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[Catch: all -> 0x0065, Exception -> 0x0069, TRY_LEAVE, TryCatch #5 {Exception -> 0x0069, all -> 0x0065, blocks: (B:27:0x0061, B:42:0x00aa, B:44:0x00ae, B:51:0x00c3, B:53:0x00cf, B:54:0x00d6), top: B:72:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService$authorization$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authorization(boolean z, Continuation<? super Result<Auth>> continuation) throws Throwable {
        ?? c423241;
        boolean z2;
        ?? r8;
        Mutex mutex;
        boolean z3;
        ?? r5;
        Mutex mutex2;
        Result success;
        if (continuation instanceof C423241) {
            C423241 c4232412 = (C423241) continuation;
            int i = c4232412.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4232412.label = i - Integer.MIN_VALUE;
                c423241 = c4232412;
            } else {
                c423241 = new C423241(continuation);
            }
        }
        Object objFetchOrRenewAuthorization = c423241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423241.label;
        try {
            try {
            } catch (Exception e) {
                e = e;
            }
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objFetchOrRenewAuthorization);
                    ?? r11 = this.mutex;
                    c423241.L$0 = this;
                    c423241.L$1 = r11;
                    c423241.Z$0 = z;
                    c423241.label = 1;
                    if (r11.lock(null, c423241) != coroutine_suspended) {
                        z2 = z;
                        z = r11;
                        r8 = this;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            mutex2 = (Mutex) c423241.L$1;
                            ResultKt.throwOnFailure(objFetchOrRenewAuthorization);
                            success = (Result) objFetchOrRenewAuthorization;
                            mutex = mutex2;
                            mutex.unlock(null);
                            return success;
                        }
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) c423241.L$1;
                        ResultKt.throwOnFailure(objFetchOrRenewAuthorization);
                        success = (Result) objFetchOrRenewAuthorization;
                        mutex = mutex2;
                        mutex.unlock(null);
                        return success;
                    }
                    z3 = c423241.Z$0;
                    mutex = (Mutex) c423241.L$1;
                    AuthorizationService authorizationService = (AuthorizationService) c423241.L$0;
                    try {
                        ResultKt.throwOnFailure(objFetchOrRenewAuthorization);
                        r5 = authorizationService;
                        Auth auth = (Auth) objFetchOrRenewAuthorization;
                        if (!z3) {
                            c423241.L$0 = r5;
                            c423241.L$1 = mutex;
                            c423241.label = 3;
                            objFetchOrRenewAuthorization = r5.fetchOrRenewAuthorization(auth, true, c423241);
                            if (objFetchOrRenewAuthorization != coroutine_suspended) {
                                mutex2 = mutex;
                                success = (Result) objFetchOrRenewAuthorization;
                                mutex = mutex2;
                                mutex.unlock(null);
                                return success;
                            }
                        } else if (auth == null || !auth.isVersionEqual(r5.installInfo.getCapabilitiesVersion())) {
                            c423241.L$0 = r5;
                            c423241.L$1 = mutex;
                            c423241.label = 4;
                            objFetchOrRenewAuthorization = r5.fetchOrRenewAuthorization(auth, false, c423241);
                            if (objFetchOrRenewAuthorization != coroutine_suspended) {
                                mutex2 = mutex;
                                success = (Result) objFetchOrRenewAuthorization;
                                mutex = mutex2;
                                mutex.unlock(null);
                                return success;
                            }
                        } else {
                            success = new Result.Success(auth);
                            mutex.unlock(null);
                            return success;
                        }
                        return coroutine_suspended;
                    } catch (Exception e2) {
                        e = e2;
                        z = mutex;
                        c423241 = authorizationService;
                        c423241.logger.log(Level.WARNING, e.getMessage());
                        Result.Error error = new Result.Error(e);
                        z.unlock(null);
                        return error;
                    } catch (Throwable th) {
                        th = th;
                        z = mutex;
                        z.unlock(null);
                        throw th;
                    }
                }
                boolean z4 = c423241.Z$0;
                Mutex mutex3 = (Mutex) c423241.L$1;
                AuthorizationService authorizationService2 = (AuthorizationService) c423241.L$0;
                ResultKt.throwOnFailure(objFetchOrRenewAuthorization);
                z2 = z4;
                z = mutex3;
                r8 = authorizationService2;
                c423241.L$0 = r8;
                c423241.L$1 = z;
                c423241.Z$0 = z2;
                c423241.label = 2;
                Object objCurrentAuth = r8.currentAuth(c423241);
                if (objCurrentAuth != coroutine_suspended) {
                    mutex = z;
                    z3 = z2;
                    objFetchOrRenewAuthorization = objCurrentAuth;
                    r5 = r8;
                    Auth auth2 = (Auth) objFetchOrRenewAuthorization;
                    if (!z3) {
                    }
                }
                return coroutine_suspended;
            } catch (Exception e3) {
                e = e3;
                c423241 = r8;
                c423241.logger.log(Level.WARNING, e.getMessage());
                Result.Error error2 = new Result.Error(e);
                z.unlock(null);
                return error2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002b, B:41:0x00a6, B:43:0x00ae, B:45:0x00ce, B:20:0x0043, B:36:0x0077, B:38:0x007d, B:47:0x00d6, B:23:0x004b, B:32:0x0064, B:26:0x0052, B:28:0x0056, B:49:0x00e3), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:13:0x002b, B:41:0x00a6, B:43:0x00ae, B:45:0x00ce, B:20:0x0043, B:36:0x0077, B:38:0x007d, B:47:0x00d6, B:23:0x004b, B:32:0x0064, B:26:0x0052, B:28:0x0056, B:49:0x00e3), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object revokeToken(Continuation<? super Result<Unit>> continuation) {
        C423281 c423281;
        AuthorizationService authorizationService;
        AuthorizationService authorizationService2;
        Auth auth;
        if (continuation instanceof C423281) {
            c423281 = (C423281) continuation;
            int i = c423281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423281.label = i - Integer.MIN_VALUE;
            } else {
                c423281 = new C423281(continuation);
            }
        }
        Object objRevokeToken = c423281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423281.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRevokeToken);
                if (this.isUserVerificationRequired) {
                    AuthorizationStore authorizationStore = this.authorizationStore;
                    c423281.L$0 = this;
                    c423281.label = 1;
                    objRevokeToken = authorizationStore.read(true, c423281);
                    if (objRevokeToken == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    authorizationService = this;
                } else {
                    return new Result.Error(new Exception("Revoke token is not currently supported for unauthenticated users"));
                }
            } else if (i2 == 1) {
                authorizationService = (AuthorizationService) c423281.L$0;
                ResultKt.throwOnFailure(objRevokeToken);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objRevokeToken);
                    Response response = (Response) objRevokeToken;
                    if (!response.isSuccessful()) {
                        return new Result.Error(new Exception("Revoke token failed: code " + response.code()));
                    }
                    return new Result.Success(Unit.INSTANCE);
                }
                auth = (Auth) c423281.L$1;
                authorizationService2 = (AuthorizationService) c423281.L$0;
                ResultKt.throwOnFailure(objRevokeToken);
                authorizationService2.updateCache(null);
                if (auth == null) {
                    AuthorizationApi authorizationApi = authorizationService2.api;
                    RevokeTokenRequest revokeTokenRequest = new RevokeTokenRequest();
                    String str = "Bearer " + auth.getRawJwt();
                    c423281.L$0 = null;
                    c423281.L$1 = null;
                    c423281.label = 3;
                    objRevokeToken = authorizationApi.revokeToken(revokeTokenRequest, str, c423281);
                } else {
                    return new Result.Error(new Exception("Authorization token does not exist locally"));
                }
            }
            Auth auth2 = (Auth) objRevokeToken;
            AuthorizationStore authorizationStore2 = authorizationService.authorizationStore;
            c423281.L$0 = authorizationService;
            c423281.L$1 = auth2;
            c423281.label = 2;
            if (authorizationStore2.deleteUserVerificationToken(c423281) == coroutine_suspended) {
                return coroutine_suspended;
            }
            authorizationService2 = authorizationService;
            auth = auth2;
            authorizationService2.updateCache(null);
            if (auth == null) {
            }
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    private final Object fetchOrRenewAuthorization(Auth auth, boolean z, Continuation<? super Result<Auth>> continuation) {
        if (this.isUserVerificationRequired) {
            return authenticatedFetchTokens(z ? UserVerificationProvider.ChallengeReason.RENEW : UserVerificationProvider.ChallengeReason.INITIAL, continuation);
        }
        if (auth == null) {
            return unauthenticatedFetchTokens(continuation);
        }
        return unauthenticatedRenewTokens(auth, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unauthenticatedFetchTokens(Continuation<? super Result<Auth>> continuation) {
        C423291 c423291;
        AuthorizationService authorizationService;
        if (continuation instanceof C423291) {
            c423291 = (C423291) continuation;
            int i = c423291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423291.label = i - Integer.MIN_VALUE;
            } else {
                c423291 = new C423291(continuation);
            }
        }
        C423291 c4232912 = c423291;
        Object objFetchUnauthenticatedTokens = c4232912.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4232912.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objFetchUnauthenticatedTokens);
                this.logger.log(Level.INFO, "Fetching unauthenticated tokens");
                UnauthenticatedTokenRequest unauthenticatedTokenRequest = new UnauthenticatedTokenRequest(this.organizationId, this.developerName, this.installInfo.getDeviceId(), this.installInfo.getCapabilitiesVersion());
                AuthorizationApi authorizationApi = this.api;
                String appName = this.installInfo.getAppName();
                String deviceType = this.installInfo.getDeviceType();
                String osName = this.installInfo.getOsName();
                String osVersion = this.installInfo.getOsVersion();
                String clientVersion = this.installInfo.getClientVersion();
                c4232912.L$0 = this;
                c4232912.label = 1;
                objFetchUnauthenticatedTokens = authorizationApi.fetchUnauthenticatedTokens(unauthenticatedTokenRequest, appName, deviceType, osName, osVersion, clientVersion, c4232912);
                if (objFetchUnauthenticatedTokens == coroutine_suspended) {
                    return coroutine_suspended;
                }
                authorizationService = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objFetchUnauthenticatedTokens);
                    return new Result.Success(objFetchUnauthenticatedTokens);
                }
                authorizationService = (AuthorizationService) c4232912.L$0;
                ResultKt.throwOnFailure(objFetchUnauthenticatedTokens);
            }
            c4232912.L$0 = null;
            c4232912.label = 2;
            objFetchUnauthenticatedTokens = authorizationService.handleTokensResponse((UnauthenticatedTokenResponse) objFetchUnauthenticatedTokens, c4232912);
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        if (r12 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object unauthenticatedRenewTokens(Auth auth, Continuation<? super Result<Auth>> continuation) {
        C423301 c423301;
        AuthorizationService authorizationService;
        if (continuation instanceof C423301) {
            c423301 = (C423301) continuation;
            int i = c423301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423301.label = i - Integer.MIN_VALUE;
            } else {
                c423301 = new C423301(continuation);
            }
        }
        C423301 c4233012 = c423301;
        Object objRenewUnauthenticatedTokens = c4233012.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4233012.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRenewUnauthenticatedTokens);
                this.logger.log(Level.INFO, "Renewing unauthenticated tokens");
                UnauthenticatedRenewTokenRequest unauthenticatedRenewTokenRequest = new UnauthenticatedRenewTokenRequest(auth.getRawJwt(), auth.getRefreshToken(), this.installInfo.getDeviceId(), this.installInfo.getCapabilitiesVersion());
                AuthorizationApi authorizationApi = this.api;
                String appName = this.installInfo.getAppName();
                String deviceType = this.installInfo.getDeviceType();
                String osName = this.installInfo.getOsName();
                String osVersion = this.installInfo.getOsVersion();
                String clientVersion = this.installInfo.getClientVersion();
                c4233012.L$0 = this;
                c4233012.label = 1;
                objRenewUnauthenticatedTokens = authorizationApi.renewUnauthenticatedTokens(unauthenticatedRenewTokenRequest, appName, deviceType, osName, osVersion, clientVersion, c4233012);
                if (objRenewUnauthenticatedTokens == coroutine_suspended) {
                    return coroutine_suspended;
                }
                authorizationService = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objRenewUnauthenticatedTokens);
                    return new Result.Success(objRenewUnauthenticatedTokens);
                }
                authorizationService = (AuthorizationService) c4233012.L$0;
                ResultKt.throwOnFailure(objRenewUnauthenticatedTokens);
            }
            c4233012.L$0 = null;
            c4233012.label = 2;
            objRenewUnauthenticatedTokens = authorizationService.handleTokensResponse((UnauthenticatedTokenResponse) objRenewUnauthenticatedTokens, c4233012);
        } catch (Exception e) {
            return new Result.Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:82)|(1:(1:(1:(1:(3:15|77|88)(2:16|17))(4:18|19|50|51))(6:25|26|47|(2:49|76)|50|51))(2:28|29))(4:31|85|32|(3:34|(1:37)|76)(3:58|59|60))|83|38|(3:40|59|60)(6:41|42|80|43|(5:46|47|(0)|50|51)|76)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0155, code lost:
    
        if (r0 == r3) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.salesforce.android.smi.remote.internal.api.authorization.AuthorizationService, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authenticatedFetchTokens(UserVerificationProvider.ChallengeReason challengeReason, Continuation<? super Result<Auth>> continuation) {
        C423231 c423231;
        UserVerificationProvider userVerificationProvider;
        AuthorizationService authorizationService;
        UserVerificationProvider.ChallengeReason challengeReason2 = challengeReason;
        if (continuation instanceof C423231) {
            c423231 = (C423231) continuation;
            int i = c423231.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423231.label = i - Integer.MIN_VALUE;
            } else {
                c423231 = new C423231(continuation);
            }
        }
        C423231 c4232312 = c423231;
        Object objAuthenticatedFetchTokens = c4232312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        AuthorizationService authorizationService2 = c4232312.label;
        try {
            try {
            } catch (Exception e) {
                return new Result.Error(e);
            }
        } catch (HttpException e2) {
            e = e2;
        }
        if (authorizationService2 == 0) {
            ResultKt.throwOnFailure(objAuthenticatedFetchTokens);
            try {
                userVerificationProvider = this.userVerificationProvider;
            } catch (HttpException e3) {
                e = e3;
                authorizationService2 = this;
                Response<?> response = e.response();
                String strConvertErrorBody = authorizationService2.convertErrorBody(response == null ? response.errorBody() : null);
                if (strConvertErrorBody == null) {
                }
                if (challengeReason2.getValue() > UserVerificationProvider.ChallengeReason.RENEW.getValue()) {
                }
            }
            if (userVerificationProvider == null) {
                return new Result.Error(new Exception("Missing mandatory authorization provider when isUserVerificationRequired: true"));
            }
            c4232312.L$0 = this;
            c4232312.L$1 = challengeReason2;
            c4232312.label = 1;
            objAuthenticatedFetchTokens = userVerificationProvider.userVerificationChallenge(challengeReason2, c4232312);
            if (objAuthenticatedFetchTokens != coroutine_suspended) {
                authorizationService2 = this;
            }
            return coroutine_suspended;
        }
        if (authorizationService2 != 1) {
            if (authorizationService2 != 2) {
                if (authorizationService2 != 3) {
                    if (authorizationService2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objAuthenticatedFetchTokens);
                    return (Result) objAuthenticatedFetchTokens;
                }
                ResultKt.throwOnFailure(objAuthenticatedFetchTokens);
                return new Result.Success(objAuthenticatedFetchTokens);
            }
            challengeReason2 = (UserVerificationProvider.ChallengeReason) c4232312.L$1;
            authorizationService = (AuthorizationService) c4232312.L$0;
            ResultKt.throwOnFailure(objAuthenticatedFetchTokens);
            c4232312.L$0 = authorizationService;
            c4232312.L$1 = challengeReason2;
            c4232312.label = 3;
            objAuthenticatedFetchTokens = authorizationService.handleTokensResponse((AuthenticatedTokenResponse) objAuthenticatedFetchTokens, c4232312);
            if (objAuthenticatedFetchTokens == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Success(objAuthenticatedFetchTokens);
        }
        challengeReason2 = (UserVerificationProvider.ChallengeReason) c4232312.L$1;
        AuthorizationService authorizationService3 = (AuthorizationService) c4232312.L$0;
        ResultKt.throwOnFailure(objAuthenticatedFetchTokens);
        authorizationService2 = authorizationService3;
        UserVerificationToken userVerificationToken = (UserVerificationToken) objAuthenticatedFetchTokens;
        if (userVerificationToken == null) {
            return new Result.Error(new Exception("Missing mandatory authorization provider when isUserVerificationRequired: true"));
        }
        authorizationService2.logger.log(Level.INFO, "Fetching authenticated tokens");
        UserVerificationAuthTokenRequest userVerificationAuthTokenRequest = new UserVerificationAuthTokenRequest(authorizationService2.organizationId, authorizationService2.developerName, authorizationService2.installInfo.getDeviceId(), authorizationService2.installInfo.getCapabilitiesVersion(), userVerificationToken.getUserVerificationType(), userVerificationToken.getCustomerIdentityToken());
        AuthorizationApi authorizationApi = authorizationService2.api;
        String appName = authorizationService2.installInfo.getAppName();
        String deviceType = authorizationService2.installInfo.getDeviceType();
        String osName = authorizationService2.installInfo.getOsName();
        String osVersion = authorizationService2.installInfo.getOsVersion();
        String clientVersion = authorizationService2.installInfo.getClientVersion();
        c4232312.L$0 = authorizationService2;
        c4232312.L$1 = challengeReason2;
        c4232312.label = 2;
        AuthorizationService authorizationService4 = authorizationService2;
        try {
            objAuthenticatedFetchTokens = authorizationApi.fetchAuthenticatedTokens(userVerificationAuthTokenRequest, appName, deviceType, osName, osVersion, clientVersion, c4232312);
            if (objAuthenticatedFetchTokens != coroutine_suspended) {
                authorizationService = authorizationService4;
                c4232312.L$0 = authorizationService;
                c4232312.L$1 = challengeReason2;
                c4232312.label = 3;
                objAuthenticatedFetchTokens = authorizationService.handleTokensResponse((AuthenticatedTokenResponse) objAuthenticatedFetchTokens, c4232312);
                if (objAuthenticatedFetchTokens == coroutine_suspended) {
                }
                return new Result.Success(objAuthenticatedFetchTokens);
            }
        } catch (HttpException e4) {
            e = e4;
            authorizationService2 = authorizationService4;
            Response<?> response2 = e.response();
            String strConvertErrorBody2 = authorizationService2.convertErrorBody(response2 == null ? response2.errorBody() : null);
            UserVerificationProvider.ChallengeReason challengeReason3 = (strConvertErrorBody2 == null && StringsKt.contains$default((CharSequence) strConvertErrorBody2, (CharSequence) MarginCall.STATE_EXPIRED, false, 2, (Object) null)) ? UserVerificationProvider.ChallengeReason.EXPIRED : UserVerificationProvider.ChallengeReason.MALFORMED;
            if (challengeReason2.getValue() > UserVerificationProvider.ChallengeReason.RENEW.getValue()) {
                c4232312.L$0 = null;
                c4232312.L$1 = null;
                c4232312.label = 4;
                objAuthenticatedFetchTokens = authorizationService2.authenticatedFetchTokens(challengeReason3, c4232312);
            } else {
                return new Result.Error(e);
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleTokensResponse(UnauthenticatedTokenResponse unauthenticatedTokenResponse, Continuation<? super Auth> continuation) throws Exception {
        C423251 c423251;
        Auth jwt;
        AuthorizationService authorizationService;
        if (continuation instanceof C423251) {
            c423251 = (C423251) continuation;
            int i = c423251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423251.label = i - Integer.MIN_VALUE;
            } else {
                c423251 = new C423251(continuation);
            }
        }
        Object obj = c423251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423251.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            jwt = Auth.INSTANCE.parseJwt(unauthenticatedTokenResponse.getAccessToken(), unauthenticatedTokenResponse.getRefreshToken(), unauthenticatedTokenResponse.getLastEventId(), this.isUserVerificationRequired);
            AuthorizationStore authorizationStore = this.authorizationStore;
            c423251.L$0 = this;
            c423251.L$1 = jwt;
            c423251.label = 1;
            if (authorizationStore.save(jwt, c423251) == coroutine_suspended) {
                return coroutine_suspended;
            }
            authorizationService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jwt = (Auth) c423251.L$1;
            authorizationService = (AuthorizationService) c423251.L$0;
            ResultKt.throwOnFailure(obj);
        }
        authorizationService.updateCache(jwt);
        return jwt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleTokensResponse(AuthenticatedTokenResponse authenticatedTokenResponse, Continuation<? super Auth> continuation) throws Exception {
        C423262 c423262;
        Auth jwt;
        AuthorizationService authorizationService;
        if (continuation instanceof C423262) {
            c423262 = (C423262) continuation;
            int i = c423262.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c423262.label = i - Integer.MIN_VALUE;
            } else {
                c423262 = new C423262(continuation);
            }
        }
        Object obj = c423262.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c423262.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            jwt = Auth.INSTANCE.parseJwt(authenticatedTokenResponse.getAccessToken(), "", authenticatedTokenResponse.getLastEventId(), this.isUserVerificationRequired);
            AuthorizationStore authorizationStore = this.authorizationStore;
            c423262.L$0 = this;
            c423262.L$1 = jwt;
            c423262.label = 1;
            if (authorizationStore.save(jwt, c423262) == coroutine_suspended) {
                return coroutine_suspended;
            }
            authorizationService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jwt = (Auth) c423262.L$1;
            authorizationService = (AuthorizationService) c423262.L$0;
            ResultKt.throwOnFailure(obj);
        }
        authorizationService.updateCache(jwt);
        return jwt;
    }

    private final void updateCache(Auth auth) {
        String subject;
        Claims claims;
        synchronized (this) {
            try {
                this.authCache = auth;
                CoreParticipant.Companion companion = CoreParticipant.INSTANCE;
                Auth auth2 = this.authCache;
                if (auth2 == null || (claims = auth2.getClaims()) == null || (subject = claims.getSubject()) == null) {
                    subject = CoreParticipant.SUBJECT_ID_PLACEHOLDER;
                }
                companion.setLocalSubject(subject);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: AuthorizationService.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService$Companion;", "", "<init>", "()V", "Ljava/net/URL;", "baseUrl", "", "organizationId", "developerName", "", "isAuthenticated", "Lcom/salesforce/android/smi/network/data/model/InstallInfo;", "installInfo", "Lcom/salesforce/android/smi/database/AuthorizationStore;", "authorizationStore", "Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljava/net/URL;Ljava/lang/String;Ljava/lang/String;ZLcom/salesforce/android/smi/network/data/model/InstallInfo;Lcom/salesforce/android/smi/database/AuthorizationStore;)Lcom/salesforce/android/smi/remote/internal/api/authorization/AuthorizationService;", "AUTH_HEADER_BEARER_PREFIX", "Ljava/lang/String;", "remote_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AuthorizationService create(URL baseUrl, String organizationId, String developerName, boolean isAuthenticated, InstallInfo installInfo, AuthorizationStore authorizationStore) {
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(organizationId, "organizationId");
            Intrinsics.checkNotNullParameter(developerName, "developerName");
            Intrinsics.checkNotNullParameter(installInfo, "installInfo");
            Intrinsics.checkNotNullParameter(authorizationStore, "authorizationStore");
            return new AuthorizationService(baseUrl, organizationId, developerName, isAuthenticated, installInfo, authorizationStore, null);
        }
    }

    static {
        String simpleName = AuthorizationService.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        TAG = simpleName;
    }
}
