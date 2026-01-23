package com.robinhood.p2p;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.prefs.StringPreference;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/p2p/MatchaManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/p2p/MatchaManager;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MatchaManager_Factory implements Factory<MatchaManager> {
    private final Provider<MatchaApi> matchaApi;
    private final Provider<StringPreference> matchaOnboardingDataPref;
    private final Provider<LazyMoshi> moshi;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaManager_Factory create(Provider<LazyMoshi> provider, Provider<MatchaApi> provider2, Provider<StringPreference> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final MatchaManager newInstance(LazyMoshi lazyMoshi, MatchaApi matchaApi, StringPreference stringPreference) {
        return INSTANCE.newInstance(lazyMoshi, matchaApi, stringPreference);
    }

    public MatchaManager_Factory(Provider<LazyMoshi> moshi, Provider<MatchaApi> matchaApi, Provider<StringPreference> matchaOnboardingDataPref) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(matchaOnboardingDataPref, "matchaOnboardingDataPref");
        this.moshi = moshi;
        this.matchaApi = matchaApi;
        this.matchaOnboardingDataPref = matchaOnboardingDataPref;
    }

    @Override // javax.inject.Provider
    public MatchaManager get() {
        Companion companion = INSTANCE;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        MatchaApi matchaApi = this.matchaApi.get();
        Intrinsics.checkNotNullExpressionValue(matchaApi, "get(...)");
        StringPreference stringPreference = this.matchaOnboardingDataPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        return companion.newInstance(lazyMoshi, matchaApi, stringPreference);
    }

    /* compiled from: MatchaManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/p2p/MatchaManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/p2p/MatchaManager_Factory;", "moshi", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "matchaOnboardingDataPref", "Lcom/robinhood/prefs/StringPreference;", "newInstance", "Lcom/robinhood/p2p/MatchaManager;", "lib-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaManager_Factory create(Provider<LazyMoshi> moshi, Provider<MatchaApi> matchaApi, Provider<StringPreference> matchaOnboardingDataPref) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(matchaOnboardingDataPref, "matchaOnboardingDataPref");
            return new MatchaManager_Factory(moshi, matchaApi, matchaOnboardingDataPref);
        }

        @JvmStatic
        public final MatchaManager newInstance(LazyMoshi moshi, MatchaApi matchaApi, StringPreference matchaOnboardingDataPref) {
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(matchaOnboardingDataPref, "matchaOnboardingDataPref");
            return new MatchaManager(moshi, matchaApi, matchaOnboardingDataPref);
        }
    }
}
