package com.google.mlkit.vision.face;

import android.graphics.PointF;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes27.dex */
public class FaceLandmark {
    private final int zza;
    private final PointF zzb;

    FaceLandmark(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    public PointF getPosition() {
        return this.zzb;
    }

    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceLandmark");
        zzvVarZza.zzb("type", this.zza);
        zzvVarZza.zzc("position", this.zzb);
        return zzvVarZza.toString();
    }
}
