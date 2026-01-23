package com.robinhood.android.user.agent;

import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.shared.user.agent.UserAgentProvider;
import com.robinhood.utils.ReleaseVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderUserAgentProvider.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/user/agent/TraderUserAgentProvider;", "Lcom/robinhood/shared/user/agent/UserAgentProvider;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/utils/ReleaseVersion;Lcom/robinhood/prefs/StringPreference;)V", "appName", "", "getAppName", "()Ljava/lang/String;", "lib-user-agent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class TraderUserAgentProvider extends UserAgentProvider {
    private final String appName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TraderUserAgentProvider(ReleaseVersion releaseVersion, @UserUuidPref StringPreference userUuidPref) {
        super(releaseVersion, userUuidPref);
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        this.appName = "Robinhood";
    }

    @Override // com.robinhood.shared.user.agent.UserAgentProvider
    public String getAppName() {
        return this.appName;
    }
}
