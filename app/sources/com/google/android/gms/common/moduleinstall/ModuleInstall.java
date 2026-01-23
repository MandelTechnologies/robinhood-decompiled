package com.google.android.gms.common.moduleinstall;

import android.content.Context;
import com.google.android.gms.common.moduleinstall.internal.zay;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes27.dex */
public final class ModuleInstall {
    public static ModuleInstallClient getClient(Context context) {
        return new zay(context);
    }
}
