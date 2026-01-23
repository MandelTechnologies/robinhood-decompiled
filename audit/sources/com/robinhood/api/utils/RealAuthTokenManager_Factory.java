package com.robinhood.api.utils;

import android.app.Application;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.OAuthToken;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.MoshiSecurePreference;
import com.robinhood.prefs.TrustedDeviceIdPref;
import com.robinhood.targetbackend.Endpoint;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: RealAuthTokenManager_Factory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\t\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bk\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0003\u0012\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\u00070\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001f\u0010\b\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R%\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/api/utils/RealAuthTokenManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/api/utils/RealAuthTokenManager;", "Ljavax/inject/Provider;", "Landroid/app/Application;", "app", "Lcom/robinhood/api/retrofit/Sheriff;", "Lkotlin/jvm/JvmSuppressWildcards;", "sheriff", "Lcom/robinhood/targetbackend/Endpoint;", "endpoint", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "oAuthTokenPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "trustedDeviceIdPref", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/api/utils/RealAuthTokenManager;", "Ljavax/inject/Provider;", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class RealAuthTokenManager_Factory implements Factory<RealAuthTokenManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Application> app;
    private final Provider<Clock> clock;
    private final Provider<Endpoint> endpoint;
    private final Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref;
    private final Provider<Sheriff> sheriff;
    private final Provider<TrustedDeviceIdPref> trustedDeviceIdPref;

    @JvmStatic
    public static final RealAuthTokenManager_Factory create(Provider<Application> provider, Provider<Sheriff> provider2, Provider<Endpoint> provider3, Provider<MoshiSecurePreference<OAuthToken>> provider4, Provider<TrustedDeviceIdPref> provider5, Provider<Clock> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final RealAuthTokenManager newInstance(Application application, Lazy<Sheriff> lazy, Endpoint endpoint, MoshiSecurePreference<OAuthToken> moshiSecurePreference, TrustedDeviceIdPref trustedDeviceIdPref, Clock clock) {
        return INSTANCE.newInstance(application, lazy, endpoint, moshiSecurePreference, trustedDeviceIdPref, clock);
    }

    public RealAuthTokenManager_Factory(Provider<Application> app, Provider<Sheriff> sheriff, Provider<Endpoint> endpoint, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<Clock> clock) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
        Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.app = app;
        this.sheriff = sheriff;
        this.endpoint = endpoint;
        this.oAuthTokenPref = oAuthTokenPref;
        this.trustedDeviceIdPref = trustedDeviceIdPref;
        this.clock = clock;
    }

    @Override // javax.inject.Provider
    public RealAuthTokenManager get() {
        Companion companion = INSTANCE;
        Application application = this.app.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        Lazy<Sheriff> lazy = DoubleCheck.lazy(this.sheriff);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Endpoint endpoint = this.endpoint.get();
        Intrinsics.checkNotNullExpressionValue(endpoint, "get(...)");
        MoshiSecurePreference<OAuthToken> moshiSecurePreference = this.oAuthTokenPref.get();
        Intrinsics.checkNotNullExpressionValue(moshiSecurePreference, "get(...)");
        TrustedDeviceIdPref trustedDeviceIdPref = this.trustedDeviceIdPref.get();
        Intrinsics.checkNotNullExpressionValue(trustedDeviceIdPref, "get(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        return companion.newInstance(application, lazy, endpoint, moshiSecurePreference, trustedDeviceIdPref, clock);
    }

    /* compiled from: RealAuthTokenManager_Factory.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Js\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0017\u0010\u000e\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\b0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015JU\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/api/utils/RealAuthTokenManager_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Landroid/app/Application;", "app", "Lcom/robinhood/api/retrofit/Sheriff;", "Lkotlin/jvm/JvmSuppressWildcards;", "sheriff", "Lcom/robinhood/targetbackend/Endpoint;", "endpoint", "Lcom/robinhood/prefs/MoshiSecurePreference;", "Lcom/robinhood/models/api/OAuthToken;", "oAuthTokenPref", "Lcom/robinhood/prefs/TrustedDeviceIdPref;", "trustedDeviceIdPref", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/api/utils/RealAuthTokenManager_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/api/utils/RealAuthTokenManager_Factory;", "Ldagger/Lazy;", "Lcom/robinhood/api/utils/RealAuthTokenManager;", "newInstance", "(Landroid/app/Application;Ldagger/Lazy;Lcom/robinhood/targetbackend/Endpoint;Lcom/robinhood/prefs/MoshiSecurePreference;Lcom/robinhood/prefs/TrustedDeviceIdPref;Lj$/time/Clock;)Lcom/robinhood/api/utils/RealAuthTokenManager;", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealAuthTokenManager_Factory create(Provider<Application> app, Provider<Sheriff> sheriff, Provider<Endpoint> endpoint, Provider<MoshiSecurePreference<OAuthToken>> oAuthTokenPref, Provider<TrustedDeviceIdPref> trustedDeviceIdPref, Provider<Clock> clock) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new RealAuthTokenManager_Factory(app, sheriff, endpoint, oAuthTokenPref, trustedDeviceIdPref, clock);
        }

        @JvmStatic
        public final RealAuthTokenManager newInstance(Application app, Lazy<Sheriff> sheriff, Endpoint endpoint, MoshiSecurePreference<OAuthToken> oAuthTokenPref, TrustedDeviceIdPref trustedDeviceIdPref, Clock clock) {
            Intrinsics.checkNotNullParameter(app, "app");
            Intrinsics.checkNotNullParameter(sheriff, "sheriff");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(oAuthTokenPref, "oAuthTokenPref");
            Intrinsics.checkNotNullParameter(trustedDeviceIdPref, "trustedDeviceIdPref");
            Intrinsics.checkNotNullParameter(clock, "clock");
            return new RealAuthTokenManager(app, sheriff, endpoint, oAuthTokenPref, trustedDeviceIdPref, clock);
        }
    }
}
