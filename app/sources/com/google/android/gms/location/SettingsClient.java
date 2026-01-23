package com.google.android.gms.location;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* loaded from: classes27.dex */
public interface SettingsClient {
    Task<LocationSettingsResponse> checkLocationSettings(LocationSettingsRequest locationSettingsRequest);
}
