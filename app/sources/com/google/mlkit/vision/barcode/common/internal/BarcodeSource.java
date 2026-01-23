package com.google.mlkit.vision.barcode.common.internal;

import android.graphics.Point;
import android.graphics.Rect;

/* compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
/* loaded from: classes27.dex */
public interface BarcodeSource {
    Rect getBoundingBox();

    Point[] getCornerPoints();

    String getDisplayValue();

    int getFormat();

    String getRawValue();

    int getValueType();
}
