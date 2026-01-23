package com.robinhood.android.user.agent;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.StringPreference;
import com.robinhood.utils.ReleaseVersion;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderUserAgentProvider_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/user/agent/TraderUserAgentProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/user/agent/TraderUserAgentProvider;", "releaseVersion", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/ReleaseVersion;", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-user-agent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TraderUserAgentProvider_Factory implements Factory<TraderUserAgentProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ReleaseVersion> releaseVersion;
    private final Provider<StringPreference> userUuidPref;

    @JvmStatic
    public static final TraderUserAgentProvider_Factory create(Provider<ReleaseVersion> provider, Provider<StringPreference> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final TraderUserAgentProvider newInstance(ReleaseVersion releaseVersion, StringPreference stringPreference) {
        return INSTANCE.newInstance(releaseVersion, stringPreference);
    }

    public TraderUserAgentProvider_Factory(Provider<ReleaseVersion> releaseVersion, Provider<StringPreference> userUuidPref) {
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        this.releaseVersion = releaseVersion;
        this.userUuidPref = userUuidPref;
    }

    @Override // javax.inject.Provider
    public TraderUserAgentProvider get() {
        Companion companion = INSTANCE;
        ReleaseVersion releaseVersion = this.releaseVersion.get();
        Intrinsics.checkNotNullExpressionValue(releaseVersion, "get(...)");
        StringPreference stringPreference = this.userUuidPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        return companion.newInstance(releaseVersion, stringPreference);
    }

    /* compiled from: TraderUserAgentProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/user/agent/TraderUserAgentProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/user/agent/TraderUserAgentProvider_Factory;", "releaseVersion", "Ljavax/inject/Provider;", "Lcom/robinhood/utils/ReleaseVersion;", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "newInstance", "Lcom/robinhood/android/user/agent/TraderUserAgentProvider;", "lib-user-agent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderUserAgentProvider_Factory create(Provider<ReleaseVersion> releaseVersion, Provider<StringPreference> userUuidPref) {
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            return new TraderUserAgentProvider_Factory(releaseVersion, userUuidPref);
        }

        @JvmStatic
        public final TraderUserAgentProvider newInstance(ReleaseVersion releaseVersion, StringPreference userUuidPref) {
            Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
            Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
            return new TraderUserAgentProvider(releaseVersion, userUuidPref);
        }
    }
}
