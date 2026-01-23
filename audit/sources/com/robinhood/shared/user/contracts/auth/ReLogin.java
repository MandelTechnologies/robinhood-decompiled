package com.robinhood.shared.user.contracts.auth;

import android.content.Intent;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReLogin.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/ReLogin;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "username", "", "currentUserId", "routeToSignup", "", "postLogoutIntents", "", "Landroid/content/Intent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z[Landroid/content/Intent;)V", "getUsername", "()Ljava/lang/String;", "getCurrentUserId", "getRouteToSignup", "()Z", "getPostLogoutIntents", "()[Landroid/content/Intent;", "[Landroid/content/Intent;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ReLogin implements IntentKey {
    private final String currentUserId;
    private final Intent[] postLogoutIntents;
    private final boolean routeToSignup;
    private final String username;

    public ReLogin() {
        this(null, null, false, null, 15, null);
    }

    public ReLogin(String str, String str2, boolean z, Intent[] postLogoutIntents) {
        Intrinsics.checkNotNullParameter(postLogoutIntents, "postLogoutIntents");
        this.username = str;
        this.currentUserId = str2;
        this.routeToSignup = z;
        this.postLogoutIntents = postLogoutIntents;
    }

    public /* synthetic */ ReLogin(String str, String str2, boolean z, Intent[] intentArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new Intent[0] : intentArr);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public final boolean getRouteToSignup() {
        return this.routeToSignup;
    }

    public final Intent[] getPostLogoutIntents() {
        return this.postLogoutIntents;
    }
}
