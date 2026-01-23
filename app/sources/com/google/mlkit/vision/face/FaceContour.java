package com.google.mlkit.vision.face;

import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes27.dex */
public class FaceContour {
    private final int zza;
    private final List zzb;

    public FaceContour(int i, List list) {
        this.zza = i;
        this.zzb = list;
    }

    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceContour");
        zzvVarZza.zzb("type", this.zza);
        zzvVarZza.zzc("points", this.zzb.toArray());
        return zzvVarZza.toString();
    }
}
