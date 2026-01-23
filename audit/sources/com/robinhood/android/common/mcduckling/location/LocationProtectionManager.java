package com.robinhood.android.common.mcduckling.location;

import android.annotation.TargetApi;
import android.app.Application;
import android.app.PendingIntent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import com.robinhood.android.common.util.Compat;
import com.robinhood.librobinhood.data.store.MinervaAccountStore;
import com.robinhood.utils.RhProcessLifecycleOwner;
import io.reactivex.Completable;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocationProtectionManager.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0003J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0006\u0010\u0015\u001a\u00020\u000bJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0016\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001d\u001a\u00020\u000bH\u0002J \u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/location/LocationProtectionManager;", "", "app", "Landroid/app/Application;", "minervaAccountStore", "Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;", "rhProcessLifecycleOwner", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "<init>", "(Landroid/app/Application;Lcom/robinhood/librobinhood/data/store/MinervaAccountStore;Lcom/robinhood/utils/RhProcessLifecycleOwner;)V", "onRequestPermissionResult", "", "grantResults", "", "toggleLocationProtection", "Lio/reactivex/Completable;", "minervaAccountId", "Ljava/util/UUID;", "enable", "toggleLocationUpdates", "hasCoarseLocation", "hasBackgroundLocation", "requestBackgroundPermission", "", "fragment", "Landroidx/fragment/app/Fragment;", "requestCode", "", "requestCoarsePermission", "checkPermissions", "requestPermission", "permission", "", "createLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "Companion", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LocationProtectionManager {
    private static final long LOCATION_FASTEST_UPDATE_INTERVAL_MS = 30000;
    private static final long LOCATION_MAX_WAIT_TIME_MS = 7200000;
    private static final float LOCATION_SMALLEST_DISPLACEMENT_METERS = 500.0f;
    private static final long LOCATION_UPDATE_INTERVAL_MS = 3600000;
    private final Application app;
    private final MinervaAccountStore minervaAccountStore;
    private final RhProcessLifecycleOwner rhProcessLifecycleOwner;

    public LocationProtectionManager(Application app, MinervaAccountStore minervaAccountStore, RhProcessLifecycleOwner rhProcessLifecycleOwner) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(minervaAccountStore, "minervaAccountStore");
        Intrinsics.checkNotNullParameter(rhProcessLifecycleOwner, "rhProcessLifecycleOwner");
        this.app = app;
        this.minervaAccountStore = minervaAccountStore;
        this.rhProcessLifecycleOwner = rhProcessLifecycleOwner;
    }

    public final boolean onRequestPermissionResult(int[] grantResults) {
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (!(grantResults.length == 0)) {
            for (int i : grantResults) {
                if (i == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final Completable toggleLocationProtection(UUID minervaAccountId, boolean enable) {
        Intrinsics.checkNotNullParameter(minervaAccountId, "minervaAccountId");
        if (enable && !checkPermissions()) {
            throw new IllegalStateException("Cannot enable location protection without permission");
        }
        Completable completableAndThen = this.minervaAccountStore.toggleLocationProtection(minervaAccountId, enable).andThen(toggleLocationUpdates(enable));
        Intrinsics.checkNotNullExpressionValue(completableAndThen, "andThen(...)");
        return completableAndThen;
    }

    private final Completable toggleLocationUpdates(final boolean enable) {
        Completable completableFromCallable = Completable.fromCallable(new Callable() { // from class: com.robinhood.android.common.mcduckling.location.LocationProtectionManager.toggleLocationUpdates.1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(LocationProtectionManager.this.app);
                Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
                PendingIntent pendingIntent = LocationProtectionBroadcastReceiver.INSTANCE.getPendingIntent(LocationProtectionManager.this.app);
                if (enable) {
                    Task<Void> taskRequestLocationUpdates = fusedLocationProviderClient.requestLocationUpdates(LocationProtectionManager.this.createLocationRequest(), pendingIntent);
                    Intrinsics.checkNotNullExpressionValue(taskRequestLocationUpdates, "requestLocationUpdates(...)");
                    return LocationProtectionManager3.toCompletable(taskRequestLocationUpdates);
                }
                Task<Void> taskRemoveLocationUpdates = fusedLocationProviderClient.removeLocationUpdates(pendingIntent);
                Intrinsics.checkNotNullExpressionValue(taskRemoveLocationUpdates, "removeLocationUpdates(...)");
                return LocationProtectionManager3.toCompletable(taskRemoveLocationUpdates);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFromCallable, "fromCallable(...)");
        return completableFromCallable;
    }

    public final boolean hasCoarseLocation() {
        return Compat.INSTANCE.checkSelfPermission(this.app, "android.permission.ACCESS_COARSE_LOCATION");
    }

    public final boolean hasBackgroundLocation() {
        return Build.VERSION.SDK_INT < 29 || Compat.INSTANCE.checkSelfPermission(this.app, "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    @TargetApi(29)
    public final void requestBackgroundPermission(Fragment fragment, int requestCode) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        requestPermission(fragment, requestCode, "android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    public final void requestCoarsePermission(Fragment fragment, int requestCode) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        requestPermission(fragment, requestCode, "android.permission.ACCESS_COARSE_LOCATION");
    }

    private final boolean checkPermissions() {
        return hasCoarseLocation() && hasBackgroundLocation();
    }

    private final void requestPermission(Fragment fragment, int requestCode, String permission) {
        this.rhProcessLifecycleOwner.useExtendedTimeout();
        fragment.requestPermissions(new String[]{permission}, requestCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationRequest createLocationRequest() {
        LocationRequest locationRequestBuild = new LocationRequest.Builder(LOCATION_UPDATE_INTERVAL_MS).setPriority(100).setMinUpdateIntervalMillis(30000L).setMaxUpdateDelayMillis(LOCATION_MAX_WAIT_TIME_MS).setMinUpdateDistanceMeters(LOCATION_SMALLEST_DISPLACEMENT_METERS).build();
        Intrinsics.checkNotNullExpressionValue(locationRequestBuild, "build(...)");
        return locationRequestBuild;
    }
}
