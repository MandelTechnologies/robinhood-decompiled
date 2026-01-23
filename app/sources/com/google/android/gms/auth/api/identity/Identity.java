package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p555authapi.zbaf;
import com.google.android.gms.internal.p555authapi.zbap;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes27.dex */
public final class Identity {
    public static CredentialSavingClient getCredentialSavingClient(Activity activity) {
        return new zbaf((Activity) Preconditions.checkNotNull(activity), new zbh());
    }

    public static SignInClient getSignInClient(Activity activity) {
        return new zbap((Activity) Preconditions.checkNotNull(activity), new zbu());
    }

    public static SignInClient getSignInClient(Context context) {
        return new zbap((Context) Preconditions.checkNotNull(context), new zbu());
    }
}
