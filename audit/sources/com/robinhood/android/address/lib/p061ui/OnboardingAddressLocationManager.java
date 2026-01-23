package com.robinhood.android.address.lib.p061ui;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.Compat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: OnboardingAddressLocationManager.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/OnboardingAddressLocationManager;", "", "locationManager", "Landroid/location/LocationManager;", "setLastKnownLocationBoundsAction", "Lkotlin/Function1;", "Landroid/location/Location;", "", "<init>", "(Landroid/location/LocationManager;Lkotlin/jvm/functions/Function1;)V", "checkPermissionThenSetLastKnownBounds", "baseFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "setLastKnownLocationBounds", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class OnboardingAddressLocationManager {
    private final LocationManager locationManager;
    private final Function1<Location, Unit> setLastKnownLocationBoundsAction;

    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingAddressLocationManager(LocationManager locationManager, Function1<? super Location, Unit> setLastKnownLocationBoundsAction) {
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(setLastKnownLocationBoundsAction, "setLastKnownLocationBoundsAction");
        this.locationManager = locationManager;
        this.setLastKnownLocationBoundsAction = setLastKnownLocationBoundsAction;
    }

    public final void checkPermissionThenSetLastKnownBounds(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        Compat compat = Compat.INSTANCE;
        Context contextRequireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (compat.checkSelfPermission(contextRequireContext, "android.permission.ACCESS_COARSE_LOCATION")) {
            setLastKnownLocationBounds(this.locationManager);
        }
    }

    private final void setLastKnownLocationBounds(LocationManager locationManager) {
        try {
            this.setLastKnownLocationBoundsAction.invoke(locationManager.getLastKnownLocation("network"));
        } catch (SecurityException unused) {
            Timber.INSTANCE.mo3353e("Caught SecurityException when trying to access last known location", new Object[0]);
        }
    }
}
