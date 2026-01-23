package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import com.robinhood.models.api.ErrorResponse;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes27.dex */
public abstract class SplitInstallSessionState {
    public static SplitInstallSessionState zzd(Bundle bundle) {
        return new zza(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt(ErrorResponse.ERROR_CODE), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    @Deprecated
    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();

    abstract List zza();

    abstract List zzb();

    abstract List zzc();
}
