package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-mlkit-text-recognition-common@@19.1.0 */
/* loaded from: classes27.dex */
final class zza {
    static Rect zza(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    static List zzb(com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar) {
        double dSin = Math.sin(Math.toRadians(zzfVar.zze));
        double dCos = Math.cos(Math.toRadians(zzfVar.zze));
        double d = zzfVar.zza;
        double d2 = zzfVar.zzc;
        Point point = new Point((int) (d + (d2 * dCos)), (int) (zzfVar.zzb + (d2 * dSin)));
        double d3 = point.x;
        int i = zzfVar.zzd;
        double d4 = i * dSin;
        double d5 = pointArr[1].y + (i * dCos);
        Point point2 = pointArr[0];
        int i2 = point2.x;
        Point point3 = pointArr[2];
        int i3 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (d3 - d4), (int) d5), new Point(i2 + (i3 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
