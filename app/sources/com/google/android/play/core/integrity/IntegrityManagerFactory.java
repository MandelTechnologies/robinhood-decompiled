package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes27.dex */
public class IntegrityManagerFactory {
    private IntegrityManagerFactory() {
    }

    public static IntegrityManager create(Context context) {
        return C5163z.m912a(context).m909a();
    }

    public static StandardIntegrityManager createStandard(Context context) {
        return C5112ax.m877a(context).mo876a();
    }
}
