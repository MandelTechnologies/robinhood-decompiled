package com.google.android.gms.maps;

/* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
/* loaded from: classes27.dex */
public interface LocationSource {

    /* compiled from: com.google.android.gms:play-services-maps@@19.0.0 */
    public interface OnLocationChangedListener {
    }

    void activate(OnLocationChangedListener onLocationChangedListener);

    void deactivate();
}
