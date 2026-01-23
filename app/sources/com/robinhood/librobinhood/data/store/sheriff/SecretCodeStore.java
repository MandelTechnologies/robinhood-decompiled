package com.robinhood.librobinhood.data.store.sheriff;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.sheriff.secretcode.ApiSecretCode;
import com.robinhood.prefs.LongPreference;
import com.robinhood.prefs.SecureStringPreference;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.prefs.annotation.SecretCodeLastUpdatedPref;
import com.robinhood.prefs.annotation.SecretCodePref;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: SecretCodeStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/sheriff/SecretCodeStore;", "Lcom/robinhood/store/Store;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "trustedDeviceIdPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "secretCodePref", "Lcom/robinhood/prefs/SecureStringPreference;", "secretCodeLastUpdatedPref", "Lcom/robinhood/prefs/LongPreference;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/prefs/TrustedDeviceIdPref;Lcom/robinhood/prefs/SecureStringPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/store/StoreBundle;)V", "refreshEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/sheriff/secretcode/ApiSecretCode;", "refreshSecretCode", "force", "", "getSecretCode", "", "deleteSecretCode", "lib-store-sheriff_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SecretCodeStore extends Store {
    private final Endpoint<Unit, ApiSecretCode> refreshEndpoint;
    private final LongPreference secretCodeLastUpdatedPref;
    private final SecureStringPreference secretCodePref;
    private final Sheriff sheriff;
    private final TrustedDeviceIdPref trustedDeviceIdPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecretCodeStore(Sheriff sheriff, TrustedDeviceIdPref trustedDeviceIdPref, @SecretCodePref SecureStringPreference secretCodePref, @SecretCodeLastUpdatedPref LongPreference secretCodeLastUpdatedPref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(secretCodePref, "secretCodePref");
        Intrinsics.checkNotNullParameter(secretCodeLastUpdatedPref, "secretCodeLastUpdatedPref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.sheriff = sheriff;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.secretCodePref = secretCodePref;
        this.secretCodeLastUpdatedPref = secretCodeLastUpdatedPref;
        this.refreshEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SecretCodeStore2(this, null), getLogoutKillswitch(), new SecretCodeStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final void refreshSecretCode(boolean force) {
        if (force) {
            Endpoint.DefaultImpls.refresh$default(this.refreshEndpoint, Unit.INSTANCE, force, null, 4, null);
            return;
        }
        if (Duration.ofMillis(System.currentTimeMillis() - this.secretCodeLastUpdatedPref.get()).compareTo(Durations.ONE_WEEK) > 0) {
            Endpoint.DefaultImpls.refresh$default(this.refreshEndpoint, Unit.INSTANCE, force, null, 4, null);
        }
    }

    public final String getSecretCode() {
        return this.secretCodePref.get();
    }

    public final void deleteSecretCode() {
        this.secretCodePref.delete();
    }
}
