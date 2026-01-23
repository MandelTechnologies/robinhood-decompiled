package com.robinhood.shared.security.authmanager;

import com.robinhood.login.LoginStatus;
import com.robinhood.models.api.OAuthToken;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: AuthTokenInjectionManager.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/security/authmanager/AuthTokenInjectionManager;", "", "authManager", "Lcom/robinhood/shared/security/authmanager/RealAuthManager;", "<init>", "(Lcom/robinhood/shared/security/authmanager/RealAuthManager;)V", "loginInternal", "Lio/reactivex/Single;", "Lcom/robinhood/login/LoginStatus;", "oauthToken", "Lcom/robinhood/models/api/OAuthToken;", "logoutLocal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-auth-manager_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class AuthTokenInjectionManager {
    private final RealAuthManager authManager;

    /* compiled from: AuthTokenInjectionManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.security.authmanager.AuthTokenInjectionManager", m3645f = "AuthTokenInjectionManager.kt", m3646l = {26}, m3647m = "logoutLocal")
    /* renamed from: com.robinhood.shared.security.authmanager.AuthTokenInjectionManager$logoutLocal$1 */
    static final class C396261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C396261(Continuation<? super C396261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthTokenInjectionManager.this.logoutLocal(this);
        }
    }

    public AuthTokenInjectionManager(RealAuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.authManager = authManager;
    }

    public final Single<LoginStatus> loginInternal(OAuthToken oauthToken) {
        Intrinsics.checkNotNullParameter(oauthToken, "oauthToken");
        Timber.INSTANCE.mo3356i("Injecting oauthToken", new Object[0]);
        return this.authManager.loginInternal$lib_auth_manager_externalRelease(oauthToken);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object logoutLocal(Continuation<? super OAuthToken> continuation) {
        C396261 c396261;
        if (continuation instanceof C396261) {
            c396261 = (C396261) continuation;
            int i = c396261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c396261.label = i - Integer.MIN_VALUE;
            } else {
                c396261 = new C396261(continuation);
            }
        }
        Object obj = c396261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c396261.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            OAuthToken oAuthToken = (OAuthToken) c396261.L$0;
            ResultKt.throwOnFailure(obj);
            return oAuthToken;
        }
        ResultKt.throwOnFailure(obj);
        OAuthToken value = this.authManager.getOAuthTokenPref().getValue();
        Timber.INSTANCE.mo3356i("Logging out", new Object[0]);
        RealAuthManager realAuthManager = this.authManager;
        c396261.L$0 = value;
        c396261.label = 1;
        return realAuthManager.logoutLocal$lib_auth_manager_externalRelease(c396261) == coroutine_suspended ? coroutine_suspended : value;
    }
}
