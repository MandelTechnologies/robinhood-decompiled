package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.vault.Vault;
import com.robinhood.vault.Vault2;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VaultStringPreference.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/prefs/VaultStringPreference;", "Lcom/robinhood/prefs/StringPreference;", "vault", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "<init>", "(Lcom/robinhood/vault/Vault;Landroid/content/SharedPreferences;Ljava/lang/String;)V", "convertToStoredString", "input", "convertFromStoredString", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes19.dex */
public final class VaultStringPreference extends StringPreference {
    private final Vault vault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultStringPreference(Vault vault, SharedPreferences preferences, String key) {
        super(preferences, key, null, null, 12, null);
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        this.vault = vault;
    }

    @Override // com.robinhood.prefs.StringPreference
    public String convertToStoredString(String input) {
        if (input != null) {
            return Vault2.encrypt(this.vault, input);
        }
        return null;
    }

    @Override // com.robinhood.prefs.StringPreference
    public String convertFromStoredString(String input) {
        if (super.mo23850isSet() && input != null) {
            try {
                return Vault2.decrypt(this.vault, input);
            } catch (GeneralSecurityException unused) {
            }
        }
        return null;
    }
}
