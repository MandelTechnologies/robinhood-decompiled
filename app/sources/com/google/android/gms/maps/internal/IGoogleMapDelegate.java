package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public interface IGoogleMapDelegate extends IInterface {
    com.google.android.gms.internal.maps.zzah addMarker(MarkerOptions markerOptions) throws RemoteException;

    void animateCamera(IObjectWrapper iObjectWrapper) throws RemoteException;

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzd zzdVar) throws RemoteException;

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, zzd zzdVar) throws RemoteException;

    void clear() throws RemoteException;

    CameraPosition getCameraPosition() throws RemoteException;

    IProjectionDelegate getProjection() throws RemoteException;

    IUiSettingsDelegate getUiSettings() throws RemoteException;

    void moveCamera(IObjectWrapper iObjectWrapper) throws RemoteException;

    void setBuildingsEnabled(boolean z) throws RemoteException;

    void setContentDescription(String str) throws RemoteException;

    boolean setIndoorEnabled(boolean z) throws RemoteException;

    void setInfoWindowAdapter(zzi zziVar) throws RemoteException;

    void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException;

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException;

    boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException;

    void setMapType(int i) throws RemoteException;

    void setMaxZoomPreference(float f) throws RemoteException;

    void setMinZoomPreference(float f) throws RemoteException;

    void setMyLocationEnabled(boolean z) throws RemoteException;

    void setOnCameraIdleListener(zzp zzpVar) throws RemoteException;

    void setOnCameraMoveCanceledListener(zzr zzrVar) throws RemoteException;

    void setOnCameraMoveListener(zzt zztVar) throws RemoteException;

    void setOnCameraMoveStartedListener(zzv zzvVar) throws RemoteException;

    void setOnCircleClickListener(zzx zzxVar) throws RemoteException;

    void setOnGroundOverlayClickListener(zzz zzzVar) throws RemoteException;

    void setOnIndoorStateChangeListener(zzab zzabVar) throws RemoteException;

    void setOnInfoWindowClickListener(zzad zzadVar) throws RemoteException;

    void setOnInfoWindowCloseListener(zzaf zzafVar) throws RemoteException;

    void setOnInfoWindowLongClickListener(zzah zzahVar) throws RemoteException;

    void setOnMapClickListener(zzan zzanVar) throws RemoteException;

    void setOnMapLoadedCallback(zzap zzapVar) throws RemoteException;

    void setOnMapLongClickListener(zzar zzarVar) throws RemoteException;

    void setOnMarkerClickListener(zzav zzavVar) throws RemoteException;

    void setOnMarkerDragListener(zzax zzaxVar) throws RemoteException;

    void setOnMyLocationButtonClickListener(zzaz zzazVar) throws RemoteException;

    void setOnMyLocationClickListener(zzbd zzbdVar) throws RemoteException;

    void setOnPoiClickListener(zzbf zzbfVar) throws RemoteException;

    void setOnPolygonClickListener(zzbh zzbhVar) throws RemoteException;

    void setOnPolylineClickListener(zzbj zzbjVar) throws RemoteException;

    void setPadding(int i, int i2, int i3, int i4) throws RemoteException;

    void setTrafficEnabled(boolean z) throws RemoteException;

    void stopAnimation() throws RemoteException;
}
