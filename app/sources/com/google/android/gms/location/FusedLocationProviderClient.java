package com.google.android.gms.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* loaded from: classes27.dex */
public interface FusedLocationProviderClient {
    Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken);

    Task<Location> getLastLocation();

    Task<Void> removeLocationUpdates(PendingIntent pendingIntent);

    Task<Void> removeLocationUpdates(LocationCallback locationCallback);

    Task<Void> requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent);

    Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper);
}
