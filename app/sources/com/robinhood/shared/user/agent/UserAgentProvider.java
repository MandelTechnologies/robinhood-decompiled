package com.robinhood.shared.user.agent;

import android.os.Build;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserUuidPref;
import com.robinhood.utils.ReleaseVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserAgentProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u0014*\u00060\u0015j\u0002`\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/user/agent/UserAgentProvider;", "", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "userUuidPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/utils/ReleaseVersion;Lcom/robinhood/prefs/StringPreference;)V", "appName", "", "getAppName", "()Ljava/lang/String;", "_userAgent", "_appAgent", "_userUuid", "userAgent", "getUserAgent", "appAgent", "getAppAgent", "buildAppAgent", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "lib-user-agent_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class UserAgentProvider {
    private String _appAgent;
    private String _userAgent;
    private String _userUuid;
    private final ReleaseVersion releaseVersion;
    private final StringPreference userUuidPref;

    public abstract String getAppName();

    public UserAgentProvider(ReleaseVersion releaseVersion, @UserUuidPref StringPreference userUuidPref) {
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(userUuidPref, "userUuidPref");
        this.releaseVersion = releaseVersion;
        this.userUuidPref = userUuidPref;
        this._userAgent = "";
        this._appAgent = "";
        this._userUuid = "";
    }

    public String getUserAgent() {
        String str = this.userUuidPref.get();
        if (str == null) {
            str = "";
        }
        if (this._userAgent.length() == 0 || !Intrinsics.areEqual(this._userUuid, str)) {
            StringBuilder sb = new StringBuilder(100);
            buildAppAgent(sb);
            if (str.length() > 0) {
                sb.append(" user:");
                sb.append(str);
            }
            this._userAgent = sb.toString();
            this._userUuid = str;
        }
        return this._userAgent;
    }

    public final String getAppAgent() {
        if (this._appAgent.length() == 0) {
            StringBuilder sb = new StringBuilder(100);
            buildAppAgent(sb);
            this._appAgent = sb.toString();
        }
        return this._appAgent;
    }

    private final void buildAppAgent(StringBuilder sb) {
        sb.append(getAppName());
        sb.append("/");
        sb.append(this.releaseVersion.getVersionName());
        sb.append(" (Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(";)");
    }
}
