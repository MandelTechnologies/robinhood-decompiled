package com.google.mlkit.vision.barcode.common;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;

/* compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
/* loaded from: classes27.dex */
public class Barcode {
    private final BarcodeSource zza;
    private final Rect zzb;
    private final Point[] zzc;

    public Rect getBoundingBox() {
        return this.zzb;
    }

    public Point[] getCornerPoints() {
        return this.zzc;
    }

    public String getDisplayValue() {
        return this.zza.getDisplayValue();
    }

    public int getFormat() {
        int format2 = this.zza.getFormat();
        if (format2 > 4096 || format2 == 0) {
            return -1;
        }
        return format2;
    }

    public String getRawValue() {
        return this.zza.getRawValue();
    }

    public int getValueType() {
        return this.zza.getValueType();
    }

    public Barcode(BarcodeSource barcodeSource, Matrix matrix) {
        this.zza = (BarcodeSource) Preconditions.checkNotNull(barcodeSource);
        Rect boundingBox = barcodeSource.getBoundingBox();
        if (boundingBox != null && matrix != null) {
            CommonConvertUtils.transformRect(boundingBox, matrix);
        }
        this.zzb = boundingBox;
        Point[] cornerPoints = barcodeSource.getCornerPoints();
        if (cornerPoints != null && matrix != null) {
            CommonConvertUtils.transformPointArray(cornerPoints, matrix);
        }
        this.zzc = cornerPoints;
    }
}
