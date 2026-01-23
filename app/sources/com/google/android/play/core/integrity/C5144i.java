package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.i */
/* loaded from: classes27.dex */
public final class C5144i implements InterfaceC5146k {
    C5144i() {
    }

    @Override // com.google.android.play.core.integrity.InterfaceC5146k
    /* renamed from: a */
    public final ApiException mo902a(Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new IntegrityServiceException(i, null);
    }
}
