package com.withpersona.sdk2.inquiry.network.dto.p421ui.styling;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import kotlin.Metadata;

/* compiled from: StyleElements.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0005*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"displayMetrics", "Landroid/util/DisplayMetrics;", "kotlin.jvm.PlatformType", "Landroid/util/DisplayMetrics;", "pxToDp", "", "getPxToDp", "(D)D", "network-inquiry_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElementsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class StyleElements2 {
    private static final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getPxToDp(double d) {
        return d / displayMetrics.density;
    }
}
