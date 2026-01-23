package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.Preconditions;
import com.robinhood.vault.Vault;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoshiSecurePreference.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0019\u001a\u00020\u0013H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prefs/MoshiSecurePreference;", "T", "Lcom/robinhood/prefs/SecureStringPreference;", "vault", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "key", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "<init>", "(Lcom/robinhood/vault/Vault;Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;)V", "cachedValue", "Ljava/lang/Object;", "value", "getValue", "()Ljava/lang/Object;", "set", "", "token", "(Ljava/lang/Object;)V", "isSet", "", "()Z", AnalyticsStrings.BUTTON_LIST_DELETE, "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public class MoshiSecurePreference<T> extends SecureStringPreference {
    private final JsonAdapter<T> adapter;
    private T cachedValue;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoshiSecurePreference(Vault vault, SharedPreferences preferences, String key, JsonAdapter<T> adapter) {
        super(vault, preferences, key);
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.adapter = adapter;
    }

    public T getValue() {
        String str;
        if (this.cachedValue == null && (str = super.get()) != null) {
            this.cachedValue = this.adapter.fromJson(str);
        }
        return this.cachedValue;
    }

    public void set(T token) {
        Preconditions.checkNotNull(token);
        this.cachedValue = token;
        super.set(this.adapter.toJson(token));
    }

    @Override // com.robinhood.prefs.StringPreference
    /* renamed from: isSet */
    public boolean mo23850isSet() {
        return this.cachedValue != null || super.mo23850isSet();
    }

    @Override // com.robinhood.prefs.StringPreference
    public void delete() {
        this.cachedValue = null;
        super.delete();
    }
}
