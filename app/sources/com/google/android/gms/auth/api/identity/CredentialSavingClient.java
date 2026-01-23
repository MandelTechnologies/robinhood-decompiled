package com.google.android.gms.auth.api.identity;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* loaded from: classes27.dex */
public interface CredentialSavingClient {
    @Deprecated
    Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest);
}
