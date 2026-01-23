package com.salesforce.android.smi.network.data.model;

import com.salesforce.android.smi.network.data.domain.auth.Auth;
import kotlin.Metadata;

/* compiled from: InstallBuild.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/model/InstallBuild;", "Lcom/salesforce/android/smi/network/data/model/InstallBuildInfo;", "<init>", "()V", Auth.CAPABILITIES_KEY, "", "getCapabilitiesVersion", "()Ljava/lang/String;", "clientVersion", "getClientVersion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class InstallBuild implements InstallBuildInfo {
    public static final InstallBuild INSTANCE = new InstallBuild();
    private static final String capabilitiesVersion = "254";
    private static final String clientVersion = "1.9.1";

    private InstallBuild() {
    }

    @Override // com.salesforce.android.smi.network.data.model.InstallBuildInfo
    public String getCapabilitiesVersion() {
        return capabilitiesVersion;
    }

    @Override // com.salesforce.android.smi.network.data.model.InstallBuildInfo
    public String getClientVersion() {
        return clientVersion;
    }
}
