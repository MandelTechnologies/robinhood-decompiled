package com.google.android.libraries.identity.googleid;

import androidx.credentials.GetCustomCredentialOption;
import java.util.List;
import kotlin.Metadata;

/* compiled from: com.google.android.libraries.identity.googleid:googleid@@1.1.0 */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001a"}, m3636d2 = {"Lcom/google/android/libraries/identity/googleid/GetGoogleIdOption;", "Landroidx/credentials/GetCustomCredentialOption;", "", "linkedServiceId", "Ljava/lang/String;", "getLinkedServiceId", "()Ljava/lang/String;", "nonce", "getNonce", "serverClientId", "getServerClientId", "", "idTokenDepositionScopes", "Ljava/util/List;", "getIdTokenDepositionScopes", "()Ljava/util/List;", "", "autoSelectEnabled", "Z", "getAutoSelectEnabled", "()Z", "filterByAuthorizedAccounts", "getFilterByAuthorizedAccounts", "requestVerifiedPhoneNumber", "getRequestVerifiedPhoneNumber", "Companion", "java.com.google.android.libraries.identity.googleid.granule_granule"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class GetGoogleIdOption extends GetCustomCredentialOption {
    private final String zza;
    private final String zzb;
    private final boolean zzc;
    private final String zzd;
    private final List zze;
    private final boolean zzf;
    private final boolean zzg;

    /* renamed from: getAutoSelectEnabled, reason: from getter */
    public final boolean getZzg() {
        return this.zzg;
    }

    /* renamed from: getFilterByAuthorizedAccounts, reason: from getter */
    public final boolean getZzc() {
        return this.zzc;
    }

    public final List<String> getIdTokenDepositionScopes() {
        return this.zze;
    }

    /* renamed from: getLinkedServiceId, reason: from getter */
    public final String getZzd() {
        return this.zzd;
    }

    /* renamed from: getNonce, reason: from getter */
    public final String getZzb() {
        return this.zzb;
    }

    /* renamed from: getRequestVerifiedPhoneNumber, reason: from getter */
    public final boolean getZzf() {
        return this.zzf;
    }

    /* renamed from: getServerClientId, reason: from getter */
    public final String getZza() {
        return this.zza;
    }
}
