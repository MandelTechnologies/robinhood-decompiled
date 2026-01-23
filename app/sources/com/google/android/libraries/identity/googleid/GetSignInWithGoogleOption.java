package com.google.android.libraries.identity.googleid;

import androidx.credentials.GetCustomCredentialOption;
import kotlin.Metadata;

/* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.0 */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, m3636d2 = {"Lcom/google/android/libraries/identity/googleid/GetSignInWithGoogleOption;", "Landroidx/credentials/GetCustomCredentialOption;", "", "hostedDomainFilter", "Ljava/lang/String;", "getHostedDomainFilter", "()Ljava/lang/String;", "nonce", "getNonce", "serverClientId", "getServerClientId", "Companion", "java.com.google.android.libraries.identity.googleid.granule_granule"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class GetSignInWithGoogleOption extends GetCustomCredentialOption {
    private final String zza;
    private final String zzb;
    private final String zzc;

    /* renamed from: getHostedDomainFilter, reason: from getter */
    public final String getZzb() {
        return this.zzb;
    }

    /* renamed from: getNonce, reason: from getter */
    public final String getZzc() {
        return this.zzc;
    }

    /* renamed from: getServerClientId, reason: from getter */
    public final String getZza() {
        return this.zza;
    }
}
