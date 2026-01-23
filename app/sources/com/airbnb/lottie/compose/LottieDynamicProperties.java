package com.airbnb.lottie.compose;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.value.ScaleXY;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LottieDynamicProperties.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0002\u0010\u0005BÓ\u0001\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003\u0012\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003\u0012\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0003¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b!R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "", "properties", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "(Ljava/util/List;)V", "intProperties", "", "pointFProperties", "Landroid/graphics/PointF;", "floatProperties", "", "scaleProperties", "Lcom/airbnb/lottie/value/ScaleXY;", "colorFilterProperties", "Landroid/graphics/ColorFilter;", "intArrayProperties", "", "typefaceProperties", "Landroid/graphics/Typeface;", "bitmapProperties", "Landroid/graphics/Bitmap;", "charSequenceProperties", "", "pathProperties", "Landroid/graphics/Path;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "addTo", "", ResourceTypes.DRAWABLE, "Lcom/airbnb/lottie/LottieDrawable;", "addTo$lottie_compose_release", "removeFrom", "removeFrom$lottie_compose_release", "lottie-compose_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class LottieDynamicProperties {
    public static final int $stable = 8;
    private final List<LottieDynamicProperties3<Bitmap>> bitmapProperties;
    private final List<LottieDynamicProperties3<CharSequence>> charSequenceProperties;
    private final List<LottieDynamicProperties3<ColorFilter>> colorFilterProperties;
    private final List<LottieDynamicProperties3<Float>> floatProperties;
    private final List<LottieDynamicProperties3<Object[]>> intArrayProperties;
    private final List<LottieDynamicProperties3<Integer>> intProperties;
    private final List<LottieDynamicProperties3<Path>> pathProperties;
    private final List<LottieDynamicProperties3<PointF>> pointFProperties;
    private final List<LottieDynamicProperties3<ScaleXY>> scaleProperties;
    private final List<LottieDynamicProperties3<Typeface>> typefaceProperties;

    public LottieDynamicProperties(List<LottieDynamicProperties3<Integer>> intProperties, List<LottieDynamicProperties3<PointF>> pointFProperties, List<LottieDynamicProperties3<Float>> floatProperties, List<LottieDynamicProperties3<ScaleXY>> scaleProperties, List<LottieDynamicProperties3<ColorFilter>> colorFilterProperties, List<LottieDynamicProperties3<Object[]>> intArrayProperties, List<LottieDynamicProperties3<Typeface>> typefaceProperties, List<LottieDynamicProperties3<Bitmap>> bitmapProperties, List<LottieDynamicProperties3<CharSequence>> charSequenceProperties, List<LottieDynamicProperties3<Path>> pathProperties) {
        Intrinsics.checkNotNullParameter(intProperties, "intProperties");
        Intrinsics.checkNotNullParameter(pointFProperties, "pointFProperties");
        Intrinsics.checkNotNullParameter(floatProperties, "floatProperties");
        Intrinsics.checkNotNullParameter(scaleProperties, "scaleProperties");
        Intrinsics.checkNotNullParameter(colorFilterProperties, "colorFilterProperties");
        Intrinsics.checkNotNullParameter(intArrayProperties, "intArrayProperties");
        Intrinsics.checkNotNullParameter(typefaceProperties, "typefaceProperties");
        Intrinsics.checkNotNullParameter(bitmapProperties, "bitmapProperties");
        Intrinsics.checkNotNullParameter(charSequenceProperties, "charSequenceProperties");
        Intrinsics.checkNotNullParameter(pathProperties, "pathProperties");
        this.intProperties = intProperties;
        this.pointFProperties = pointFProperties;
        this.floatProperties = floatProperties;
        this.scaleProperties = scaleProperties;
        this.colorFilterProperties = colorFilterProperties;
        this.intArrayProperties = intArrayProperties;
        this.typefaceProperties = typefaceProperties;
        this.bitmapProperties = bitmapProperties;
        this.charSequenceProperties = charSequenceProperties;
        this.pathProperties = pathProperties;
    }

    public LottieDynamicProperties(List<? extends LottieDynamicProperties3<?>> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        List<? extends LottieDynamicProperties3<?>> list = properties;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((LottieDynamicProperties3) obj).getProperty$lottie_compose_release() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((LottieDynamicProperties3) obj2).getProperty$lottie_compose_release() instanceof PointF) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((LottieDynamicProperties3) obj3).getProperty$lottie_compose_release() instanceof Float) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (((LottieDynamicProperties3) obj4).getProperty$lottie_compose_release() instanceof ScaleXY) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (((LottieDynamicProperties3) obj5).getProperty$lottie_compose_release() instanceof ColorFilter) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list) {
            if (((LottieDynamicProperties3) obj6).getProperty$lottie_compose_release() instanceof Object[]) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list) {
            if (((LottieDynamicProperties3) obj7).getProperty$lottie_compose_release() instanceof Typeface) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : list) {
            if (((LottieDynamicProperties3) obj8).getProperty$lottie_compose_release() instanceof Bitmap) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list) {
            if (((LottieDynamicProperties3) obj9).getProperty$lottie_compose_release() instanceof CharSequence) {
                arrayList9.add(obj9);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj10 : list) {
            if (((LottieDynamicProperties3) obj10).getProperty$lottie_compose_release() instanceof Path) {
                arrayList10.add(obj10);
            }
        }
        this(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10);
    }

    public final void addTo$lottie_compose_release(LottieDrawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties3 = (LottieDynamicProperties3) it.next();
            drawable.addValueCallback(lottieDynamicProperties3.getKeyPath(), lottieDynamicProperties3.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties3.getCallback$lottie_compose_release()));
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties32 = (LottieDynamicProperties3) it2.next();
            drawable.addValueCallback(lottieDynamicProperties32.getKeyPath(), lottieDynamicProperties32.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties32.getCallback$lottie_compose_release()));
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties33 = (LottieDynamicProperties3) it3.next();
            drawable.addValueCallback(lottieDynamicProperties33.getKeyPath(), lottieDynamicProperties33.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties33.getCallback$lottie_compose_release()));
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties34 = (LottieDynamicProperties3) it4.next();
            drawable.addValueCallback(lottieDynamicProperties34.getKeyPath(), lottieDynamicProperties34.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties34.getCallback$lottie_compose_release()));
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties35 = (LottieDynamicProperties3) it5.next();
            drawable.addValueCallback(lottieDynamicProperties35.getKeyPath(), lottieDynamicProperties35.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties35.getCallback$lottie_compose_release()));
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties36 = (LottieDynamicProperties3) it6.next();
            drawable.addValueCallback(lottieDynamicProperties36.getKeyPath(), lottieDynamicProperties36.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties36.getCallback$lottie_compose_release()));
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties37 = (LottieDynamicProperties3) it7.next();
            drawable.addValueCallback(lottieDynamicProperties37.getKeyPath(), lottieDynamicProperties37.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties37.getCallback$lottie_compose_release()));
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties38 = (LottieDynamicProperties3) it8.next();
            drawable.addValueCallback(lottieDynamicProperties38.getKeyPath(), lottieDynamicProperties38.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties38.getCallback$lottie_compose_release()));
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties39 = (LottieDynamicProperties3) it9.next();
            drawable.addValueCallback(lottieDynamicProperties39.getKeyPath(), lottieDynamicProperties39.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties39.getCallback$lottie_compose_release()));
        }
        Iterator<T> it10 = this.pathProperties.iterator();
        while (it10.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties310 = (LottieDynamicProperties3) it10.next();
            drawable.addValueCallback(lottieDynamicProperties310.getKeyPath(), lottieDynamicProperties310.getProperty$lottie_compose_release(), LottieDynamicProperties2.toValueCallback(lottieDynamicProperties310.getCallback$lottie_compose_release()));
        }
    }

    public final void removeFrom$lottie_compose_release(LottieDrawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Iterator<T> it = this.intProperties.iterator();
        while (it.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties3 = (LottieDynamicProperties3) it.next();
            drawable.addValueCallback(lottieDynamicProperties3.getKeyPath(), lottieDynamicProperties3.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it2 = this.pointFProperties.iterator();
        while (it2.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties32 = (LottieDynamicProperties3) it2.next();
            drawable.addValueCallback(lottieDynamicProperties32.getKeyPath(), lottieDynamicProperties32.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it3 = this.floatProperties.iterator();
        while (it3.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties33 = (LottieDynamicProperties3) it3.next();
            drawable.addValueCallback(lottieDynamicProperties33.getKeyPath(), lottieDynamicProperties33.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it4 = this.scaleProperties.iterator();
        while (it4.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties34 = (LottieDynamicProperties3) it4.next();
            drawable.addValueCallback(lottieDynamicProperties34.getKeyPath(), lottieDynamicProperties34.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it5 = this.colorFilterProperties.iterator();
        while (it5.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties35 = (LottieDynamicProperties3) it5.next();
            drawable.addValueCallback(lottieDynamicProperties35.getKeyPath(), lottieDynamicProperties35.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it6 = this.intArrayProperties.iterator();
        while (it6.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties36 = (LottieDynamicProperties3) it6.next();
            drawable.addValueCallback(lottieDynamicProperties36.getKeyPath(), lottieDynamicProperties36.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it7 = this.typefaceProperties.iterator();
        while (it7.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties37 = (LottieDynamicProperties3) it7.next();
            drawable.addValueCallback(lottieDynamicProperties37.getKeyPath(), lottieDynamicProperties37.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it8 = this.bitmapProperties.iterator();
        while (it8.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties38 = (LottieDynamicProperties3) it8.next();
            drawable.addValueCallback(lottieDynamicProperties38.getKeyPath(), lottieDynamicProperties38.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it9 = this.charSequenceProperties.iterator();
        while (it9.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties39 = (LottieDynamicProperties3) it9.next();
            drawable.addValueCallback(lottieDynamicProperties39.getKeyPath(), lottieDynamicProperties39.getProperty$lottie_compose_release(), null);
        }
        Iterator<T> it10 = this.pathProperties.iterator();
        while (it10.hasNext()) {
            LottieDynamicProperties3 lottieDynamicProperties310 = (LottieDynamicProperties3) it10.next();
            drawable.addValueCallback(lottieDynamicProperties310.getKeyPath(), lottieDynamicProperties310.getProperty$lottie_compose_release(), null);
        }
    }
}
