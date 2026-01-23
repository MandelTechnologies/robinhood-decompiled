package com.robinhood.shared.microgram.common.services;

import com.robinhood.microgram.authentication.AuthenticationService;
import com.robinhood.shared.security.auth.AuthManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealMicrogramAuthenticationService.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramAuthenticationService;", "Lcom/robinhood/microgram/authentication/AuthenticationService;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "isAuthenticated", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RealMicrogramAuthenticationService implements AuthenticationService {
    private final AuthManager authManager;

    public RealMicrogramAuthenticationService(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        this.authManager = authManager;
    }

    @Override // com.robinhood.microgram.authentication.AuthenticationService
    public Object isAuthenticated(Continuation<? super Boolean> continuation) {
        return boxing.boxBoolean(this.authManager.isLoggedIn());
    }
}
