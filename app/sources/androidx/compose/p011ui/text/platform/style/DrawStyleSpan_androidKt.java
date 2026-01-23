package androidx.compose.p011ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import kotlin.Metadata;

/* compiled from: DrawStyleSpan.android.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, m3636d2 = {"toAndroidCap", "Landroid/graphics/Paint$Cap;", "Landroidx/compose/ui/graphics/StrokeCap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidJoin", "Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeJoin;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m7824toAndroidJoinWw9F2mQ(int i) {
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        return StrokeJoin.m6852equalsimpl0(i, companion.m6856getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m6852equalsimpl0(i, companion.m6857getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m6852equalsimpl0(i, companion.m6855getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m7823toAndroidCapBeK7IIE(int i) {
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        return StrokeCap.m6845equalsimpl0(i, companion.m6848getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m6845equalsimpl0(i, companion.m6849getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m6845equalsimpl0(i, companion.m6850getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }
}
