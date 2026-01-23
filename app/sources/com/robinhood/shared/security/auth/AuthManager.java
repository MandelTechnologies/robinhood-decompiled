package com.robinhood.shared.security.auth;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.login.LoginStatus;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.WebauthnChallenge;
import com.robinhood.models.api.WebauthnCredential;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.utils.data.LogoutType;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Standard2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: AuthManager.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001AJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'JE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001aH&¢\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017H&J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\b2\u0006\u0010!\u001a\u00020\u0017H&JJ\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010'\u001a\u00020\u00032\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0017H&J\u001e\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010.J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020100H¦@¢\u0006\u0002\u00102J\u0018\u00103\u001a\u0002042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH¦@¢\u0006\u0002\u00105J\u001e\u00106\u001a\u0002072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u0017H¦@¢\u0006\u0002\u00109J\u000e\u0010:\u001a\u000204H¦@¢\u0006\u0002\u00102J\u001e\u0010;\u001a\u0002072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u0017H¦@¢\u0006\u0002\u00109J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u0016\u0010>\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001aH¦@¢\u0006\u0002\u00105J\u0010\u0010?\u001a\u00020@2\u0006\u0010%\u001a\u00020&H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006B"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/AuthManager;", "", "isLoggedIn", "", "()Z", "isInMiddleOfLoggingIn", "isLoggingOut", "logoutEvent", "Lio/reactivex/Single;", "Landroid/content/Intent;", "getLogoutEvent", "()Lio/reactivex/Single;", "loggedInStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getLoggedInStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "onUserLoaded", "", "user", "Lcom/robinhood/models/db/sheriff/User;", AnalyticsStrings.BUTTON_MAX_WELCOME_LOGIN, "Lcom/robinhood/login/LoginStatus;", "username", "", "password", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "skipPrompt", "requestId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/util/UUID;)Lio/reactivex/Single;", "verifyMfa", "mfa", "verifyWithBackupCode", "backupCode", "initiateLogout", "caller", "Landroid/content/Context;", "logoutType", "Lcom/robinhood/utils/data/LogoutType;", "routeToSignup", "postLogoutIntents", "", "source", "changePassword", "currentPassword", "newPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebauthnCredentials", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/WebauthnCredential;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebauthnChallenge", "Lcom/robinhood/models/api/WebauthnChallenge;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validatePasskeyRegistrationChallenge", "Lcom/robinhood/models/api/Challenge;", "registrationAuthJson", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWebauthnChallenge", "validatePasskeyLoginChallenge", "response", "loginPasskeys", "loginAccountRecovery", "logout", "Lio/reactivex/Completable;", "Empty", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface AuthManager {
    Object changePassword(String str, String str2, Continuation<? super Unit> continuation);

    StateFlow<Boolean> getLoggedInStateFlow();

    Single<Intent> getLogoutEvent();

    Object getWebauthnCredentials(Continuation<? super PaginatedResult<WebauthnCredential>> continuation);

    void initiateLogout(Context caller, LogoutType logoutType, String username, boolean routeToSignup, List<? extends Intent> postLogoutIntents, String source);

    boolean isInMiddleOfLoggingIn();

    boolean isLoggedIn();

    boolean isLoggingOut();

    Single<LoginStatus> login(String username, String password, UUID challengeId, Boolean skipPrompt, UUID requestId);

    Object loginAccountRecovery(UUID uuid, Continuation<? super LoginStatus> continuation);

    Single<LoginStatus> loginPasskeys(UUID challengeId);

    Object loginWebauthnChallenge(Continuation<? super WebauthnChallenge> continuation);

    Completable logout(LogoutType logoutType);

    void onUserLoaded(User user);

    Object registerWebauthnChallenge(UUID uuid, Continuation<? super WebauthnChallenge> continuation);

    Object validatePasskeyLoginChallenge(UUID uuid, String str, Continuation<? super Challenge> continuation);

    Object validatePasskeyRegistrationChallenge(UUID uuid, String str, Continuation<? super Challenge> continuation);

    Single<LoginStatus> verifyMfa(String mfa);

    Single<LoginStatus> verifyWithBackupCode(String backupCode);

    /* compiled from: AuthManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Single login$default(AuthManager authManager, String str, String str2, UUID uuid, Boolean bool, UUID uuid2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 8) != 0) {
                bool = null;
            }
            if ((i & 16) != 0) {
                uuid2 = null;
            }
            return authManager.login(str, str2, uuid, bool, uuid2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void initiateLogout$default(AuthManager authManager, Context context, LogoutType logoutType, String str, boolean z, List list, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initiateLogout");
            }
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            if ((i & 16) != 0) {
                list = CollectionsKt.emptyList();
            }
            if ((i & 32) != 0) {
                str2 = null;
            }
            authManager.initiateLogout(context, logoutType, str, z, list, str2);
        }
    }

    /* compiled from: AuthManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016JA\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u00142\b\u0010&\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0002\u0010'JB\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u00142\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\b\u0010/\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u00103J\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0096@¢\u0006\u0002\u00107J\u0018\u00108\u001a\u0002092\b\u0010#\u001a\u0004\u0018\u00010$H\u0096@¢\u0006\u0002\u0010:J\u001e\u0010;\u001a\u00020<2\u0006\u0010#\u001a\u00020$2\u0006\u0010=\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010>J\u000e\u0010?\u001a\u000209H\u0096@¢\u0006\u0002\u00107J\u001e\u0010@\u001a\u00020<2\u0006\u0010#\u001a\u00020$2\u0006\u0010A\u001a\u00020\u0010H\u0096@¢\u0006\u0002\u0010>J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0016\u0010C\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020$H\u0096@¢\u0006\u0002\u0010:R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006D"}, m3636d2 = {"Lcom/robinhood/shared/security/auth/AuthManager$Empty;", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "()V", "logoutEvent", "", "getLogoutEvent", "()Ljava/lang/Void;", "logout", "Lio/reactivex/Completable;", "logoutType", "Lcom/robinhood/utils/data/LogoutType;", "verifyMfa", "Lio/reactivex/Single;", "Lcom/robinhood/login/LoginStatus;", "mfa", "", "verifyWithBackupCode", "backupCode", "isLoggedIn", "", "()Z", "isInMiddleOfLoggingIn", "isLoggingOut", "loggedInStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getLoggedInStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "onUserLoaded", "", "user", "Lcom/robinhood/models/db/sheriff/User;", AnalyticsStrings.BUTTON_MAX_WELCOME_LOGIN, "username", "password", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "skipPrompt", "requestId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;Ljava/lang/Boolean;Ljava/util/UUID;)Lio/reactivex/Single;", "initiateLogout", "caller", "Landroid/content/Context;", "routeToSignup", "postLogoutIntents", "", "Landroid/content/Intent;", "source", "changePassword", "currentPassword", "newPassword", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebauthnCredentials", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/WebauthnCredential;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWebauthnChallenge", "Lcom/robinhood/models/api/WebauthnChallenge;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validatePasskeyRegistrationChallenge", "Lcom/robinhood/models/api/Challenge;", "registrationAuthJson", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginWebauthnChallenge", "validatePasskeyLoginChallenge", "response", "loginPasskeys", "loginAccountRecovery", "lib-auth_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class Empty implements AuthManager {
        public static final Empty INSTANCE = new Empty();

        @Override // com.robinhood.shared.security.auth.AuthManager
        public void initiateLogout(Context caller, LogoutType logoutType, String username, boolean routeToSignup, List<? extends Intent> postLogoutIntents, String source) {
            Intrinsics.checkNotNullParameter(caller, "caller");
            Intrinsics.checkNotNullParameter(logoutType, "logoutType");
            Intrinsics.checkNotNullParameter(postLogoutIntents, "postLogoutIntents");
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public boolean isInMiddleOfLoggingIn() {
            return false;
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public boolean isLoggedIn() {
            return false;
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public boolean isLoggingOut() {
            return false;
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public void onUserLoaded(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
        }

        private Empty() {
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public /* bridge */ /* synthetic */ Single getLogoutEvent() {
            return (Single) m25654getLogoutEvent();
        }

        /* renamed from: getLogoutEvent, reason: collision with other method in class */
        public Void m25654getLogoutEvent() {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Completable logout(LogoutType logoutType) {
            Intrinsics.checkNotNullParameter(logoutType, "logoutType");
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Single<LoginStatus> verifyMfa(String mfa) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Single<LoginStatus> verifyWithBackupCode(String backupCode) {
            Intrinsics.checkNotNullParameter(backupCode, "backupCode");
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public StateFlow<Boolean> getLoggedInStateFlow() {
            return StateFlow4.MutableStateFlow(Boolean.FALSE);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Single<LoginStatus> login(String username, String password, UUID challengeId, Boolean skipPrompt, UUID requestId) {
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(password, "password");
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Object changePassword(String str, String str2, Continuation<? super Unit> continuation) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Object getWebauthnCredentials(Continuation<? super PaginatedResult<WebauthnCredential>> continuation) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Object registerWebauthnChallenge(UUID uuid, Continuation<? super WebauthnChallenge> continuation) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Object validatePasskeyRegistrationChallenge(UUID uuid, String str, Continuation<? super Challenge> continuation) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Object loginWebauthnChallenge(Continuation<? super WebauthnChallenge> continuation) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Object validatePasskeyLoginChallenge(UUID uuid, String str, Continuation<? super Challenge> continuation) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Single<LoginStatus> loginPasskeys(UUID challengeId) {
            throw new Standard2(null, 1, null);
        }

        @Override // com.robinhood.shared.security.auth.AuthManager
        public Object loginAccountRecovery(UUID uuid, Continuation<? super LoginStatus> continuation) {
            throw new Standard2(null, 1, null);
        }
    }
}
