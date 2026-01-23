package com.robinhood.shared.user.contracts.auth;

import kotlin.Metadata;

/* compiled from: AuthenticationCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/AuthenticationCallbacks;", "", "onBackupAuthenticationSelected", "", "onAuthenticated", "authenticationType", "Lcom/robinhood/shared/user/contracts/auth/AuthenticationType;", "onAuthenticationFailed", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface AuthenticationCallbacks {
    void onAuthenticated(AuthenticationCallbacks2 authenticationType);

    void onAuthenticationFailed(AuthenticationCallbacks2 authenticationType);

    void onBackupAuthenticationSelected();
}
