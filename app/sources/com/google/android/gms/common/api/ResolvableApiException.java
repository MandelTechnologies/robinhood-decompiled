package com.google.android.gms.common.api;

import android.app.PendingIntent;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes27.dex */
public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    public PendingIntent getResolution() {
        return getStatus().getResolution();
    }
}
