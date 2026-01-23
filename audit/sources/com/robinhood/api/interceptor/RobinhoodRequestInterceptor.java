package com.robinhood.api.interceptor;

import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.api.RobinhoodService;
import com.robinhood.api.utils.ApiExperimentManager;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.http.Headers;
import com.robinhood.utils.logging.CrashReporter;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import java.util.TimeZone;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: RobinhoodRequestInterceptor.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/api/interceptor/RobinhoodRequestInterceptor;", "Lokhttp3/Interceptor;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "userAgentProvider", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "authTokenManager", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "localeConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "apiExperimentManager", "Lcom/robinhood/api/utils/ApiExperimentManager;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/robinhood/shared/user/agent/UserAgentProvider;Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;Lcom/robinhood/api/utils/ApiExperimentManager;Lcom/robinhood/targetbackend/TargetBackend;)V", "shouldEnableFullExtended", "", "robinhoodServices", "Lkotlin/enums/EnumEntries;", "Lcom/robinhood/api/RobinhoodService;", "authDomains", "", "", "intercept", "Lokhttp3/Response;", TransitionReason.OPTION_TRADE_CHAIN, "Lokhttp3/Interceptor$Chain;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RobinhoodRequestInterceptor implements Interceptor {
    private final Set<String> authDomains;
    private final AuthTokenManager authTokenManager;
    private final LocaleConfiguration localeConfiguration;
    private final EnumEntries<RobinhoodService> robinhoodServices;
    private volatile boolean shouldEnableFullExtended;
    private final UserAgentProvider userAgentProvider;

    /* compiled from: RobinhoodRequestInterceptor.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetBackend.EnumC41639Id.values().length];
            try {
                iArr[TargetBackend.EnumC41639Id.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.STAGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.EXTERNAL_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.EXTERNAL_DEGRADED_TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.NAMESPACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.CUSTOM_HOSTNAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TargetBackend.EnumC41639Id.UAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RobinhoodRequestInterceptor(@RootCoroutineScope CoroutineScope coroutineScope, UserAgentProvider userAgentProvider, AuthTokenManager authTokenManager, LocaleConfiguration localeConfiguration, ApiExperimentManager apiExperimentManager, TargetBackend targetBackend) {
        Set<String> of;
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
        Intrinsics.checkNotNullParameter(apiExperimentManager, "apiExperimentManager");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        this.userAgentProvider = userAgentProvider;
        this.authTokenManager = authTokenManager;
        this.localeConfiguration = localeConfiguration;
        this.robinhoodServices = RobinhoodService.getEntries();
        switch (WhenMappings.$EnumSwitchMapping$0[targetBackend.getId().ordinal()]) {
            case 1:
            case 2:
                of = SetsKt.setOf(DeepLinkPath.URL_BASE);
                break;
            case 3:
            case 4:
            case 5:
                of = SetsKt.setOf((Object[]) new String[]{"rhinternal.net", "rhapollo.net", "api-staging.x1creditcard.com"});
                break;
            case 6:
                of = null;
                break;
            case 7:
                of = SetsKt.setOf((Object[]) new String[]{"rhinternal.net", "rhapollo.net", "api-staging.x1creditcard.com", "10.0.2.2"});
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.authDomains = of;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C315911(apiExperimentManager, null), 3, null);
    }

    /* compiled from: RobinhoodRequestInterceptor.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.api.interceptor.RobinhoodRequestInterceptor$1", m3645f = "RobinhoodRequestInterceptor.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.api.interceptor.RobinhoodRequestInterceptor$1 */
    /* loaded from: classes16.dex */
    static final class C315911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiExperimentManager $apiExperimentManager;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C315911(ApiExperimentManager apiExperimentManager, Continuation<? super C315911> continuation) {
            super(2, continuation);
            this.$apiExperimentManager = apiExperimentManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RobinhoodRequestInterceptor.this.new C315911(this.$apiExperimentManager, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C315911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            RobinhoodRequestInterceptor robinhoodRequestInterceptor;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RobinhoodRequestInterceptor robinhoodRequestInterceptor2 = RobinhoodRequestInterceptor.this;
                ApiExperimentManager apiExperimentManager = this.$apiExperimentManager;
                this.L$0 = robinhoodRequestInterceptor2;
                this.label = 1;
                Object objShouldEnableFullExtendedHours = apiExperimentManager.shouldEnableFullExtendedHours(this);
                if (objShouldEnableFullExtendedHours == coroutine_suspended) {
                    return coroutine_suspended;
                }
                robinhoodRequestInterceptor = robinhoodRequestInterceptor2;
                obj = objShouldEnableFullExtendedHours;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                robinhoodRequestInterceptor = (RobinhoodRequestInterceptor) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            robinhoodRequestInterceptor.shouldEnableFullExtended = ((Boolean) obj).booleanValue();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String authorizationHeader;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        builderNewBuilder.addHeader(Headers.USER_AGENT, this.userAgentProvider.getUserAgent());
        builderNewBuilder.addHeader(Headers.LANGUAGE, this.localeConfiguration.acceptLanguageHeader());
        for (RobinhoodService robinhoodService : this.robinhoodServices) {
            builderNewBuilder.addHeader(robinhoodService.getApiVersionHeader(), robinhoodService.getApiVersionNumber());
        }
        String id = TimeZone.getDefault().getID();
        Intrinsics.checkNotNullExpressionValue(id, "getID(...)");
        builderNewBuilder.addHeader(Headers.TIME_ZONE_ID, id);
        if (this.shouldEnableFullExtended) {
            builderNewBuilder.addHeader(Headers.FULL_EXTENDED_HOURS_REQUEST, "enabled");
        }
        builderNewBuilder.addHeader(Headers.OPTION_LATE_CLOSE_REQUEST, "enabled");
        builderNewBuilder.addHeader(Headers.HYPER_EXTENDED_REQUEST, "enabled");
        boolean z = request.header(Headers.OMIT_AUTH_HEADER) != null;
        String host = request.getUrl().getHost();
        if (!z) {
            Set<String> set = this.authDomains;
            if (set == null) {
                authorizationHeader = this.authTokenManager.getAuthorizationHeader();
                if (authorizationHeader != null) {
                }
            } else {
                Set<String> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str : set2) {
                        if (!Intrinsics.areEqual(host, str)) {
                            if (StringsKt.endsWith$default(host, "." + str, false, 2, (Object) null)) {
                            }
                        }
                        authorizationHeader = this.authTokenManager.getAuthorizationHeader();
                        if (authorizationHeader != null) {
                            builderNewBuilder.addHeader("Authorization", authorizationHeader);
                        }
                    }
                }
            }
        }
        Request requestBuild = builderNewBuilder.build();
        try {
            return chain.proceed(requestBuild);
        } catch (SSLPeerUnverifiedException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            if (StringsKt.startsWith$default(message, "Certificate pinning failure!", false, 2, (Object) null)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RobinhoodRequestInterceptor2(requestBuild.getUrl().getHost(), e), false, null, 4, null);
                throw e;
            }
            throw e;
        }
    }
}
