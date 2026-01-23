package androidx.compose.p011ui.graphics.vector;

import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VectorPainter.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\f\u001a\u00020\t*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a$\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aD\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010!\u001a\u00020 H\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a'\u0010)\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010-\u001a\u00020'*\u00020'2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, m3636d2 = {"Landroidx/compose/ui/graphics/vector/ImageVector;", "image", "Landroidx/compose/ui/graphics/vector/VectorPainter;", "rememberVectorPainter", "(Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Dp;", "defaultWidth", "defaultHeight", "Landroidx/compose/ui/geometry/Size;", "obtainSizePx-VpY3zN4", "(Landroidx/compose/ui/unit/Density;FF)J", "obtainSizePx", "defaultSize", "", "viewportWidth", "viewportHeight", "obtainViewportSize-Pq9zytI", "(JFF)J", "obtainViewportSize", "Landroidx/compose/ui/graphics/Color;", "tintColor", "Landroidx/compose/ui/graphics/BlendMode;", "tintBlendMode", "Landroidx/compose/ui/graphics/ColorFilter;", "createColorFilter-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "createColorFilter", "viewportSize", "", "name", "intrinsicColorFilter", "", "autoMirror", "configureVectorPainter-T4PVSW8", "(Landroidx/compose/ui/graphics/vector/VectorPainter;JJLjava/lang/String;Landroidx/compose/ui/graphics/ColorFilter;Z)Landroidx/compose/ui/graphics/vector/VectorPainter;", "configureVectorPainter", "density", "imageVector", "Landroidx/compose/ui/graphics/vector/GroupComponent;", BentoCurrencyPicker.ROOT_TEST_TAG, "createVectorPainterFromImageVector", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/graphics/vector/ImageVector;Landroidx/compose/ui/graphics/vector/GroupComponent;)Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/vector/VectorGroup;", "currentGroup", "createGroupComponent", "(Landroidx/compose/ui/graphics/vector/GroupComponent;Landroidx/compose/ui/graphics/vector/VectorGroup;)Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainterKt, reason: use source file name */
/* loaded from: classes.dex */
public final class VectorPainter3 {
    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float genId = imageVector.getGenId();
        float density2 = density.getDensity();
        boolean zChanged = composer.changed((Float.floatToRawIntBits(density2) & 4294967295L) | (Float.floatToRawIntBits(genId) << 32));
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            Unit unit = Unit.INSTANCE;
            objRememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(objRememberedValue);
        }
        VectorPainter vectorPainter = (VectorPainter) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter;
    }

    /* renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m7032obtainSizePxVpY3zN4(Density density, float f, float f2) {
        float fMo5016toPx0680j_4 = density.mo5016toPx0680j_4(f);
        float fMo5016toPx0680j_42 = density.mo5016toPx0680j_4(f2);
        return Size.m6575constructorimpl((Float.floatToRawIntBits(fMo5016toPx0680j_4) << 32) | (Float.floatToRawIntBits(fMo5016toPx0680j_42) & 4294967295L));
    }

    /* renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m7033obtainViewportSizePq9zytI(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return Size.m6575constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final ColorFilter m7031createColorFilterxETnrds(long j, int i) {
        if (j != 16) {
            return ColorFilter.INSTANCE.m6731tintxETnrds(j, i);
        }
        return null;
    }

    /* renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m7030configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j, long j2, String str, ColorFilter colorFilter, boolean z) {
        vectorPainter.m7028setSizeuvyYCjk$ui_release(j);
        vectorPainter.setAutoMirror$ui_release(z);
        vectorPainter.setIntrinsicColorFilter$ui_release(colorFilter);
        vectorPainter.m7029setViewportSizeuvyYCjk$ui_release(j2);
        vectorPainter.setName$ui_release(str);
        return vectorPainter;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long jM7032obtainSizePxVpY3zN4 = m7032obtainSizePxVpY3zN4(density, imageVector.getDefaultWidth(), imageVector.getDefaultHeight());
        return m7030configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), jM7032obtainSizePxVpY3zN4, m7033obtainViewportSizePq9zytI(jM7032obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m7031createColorFilterxETnrds(imageVector.getTintColor(), imageVector.getTintBlendMode()), imageVector.getAutoMirror());
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, ImageVector3 imageVector3) {
        int size = imageVector3.getSize();
        for (int i = 0; i < size; i++) {
            ImageVector4 imageVector4 = imageVector3.get(i);
            if (imageVector4 instanceof ImageVector5) {
                PathComponent pathComponent = new PathComponent();
                ImageVector5 imageVector5 = (ImageVector5) imageVector4;
                pathComponent.setPathData(imageVector5.getPathData());
                pathComponent.m7020setPathFillTypeoQ8Xj4U(imageVector5.getPathFillType());
                pathComponent.setName(imageVector5.getName());
                pathComponent.setFill(imageVector5.getFill());
                pathComponent.setFillAlpha(imageVector5.getFillAlpha());
                pathComponent.setStroke(imageVector5.getStroke());
                pathComponent.setStrokeAlpha(imageVector5.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(imageVector5.getStrokeLineWidth());
                pathComponent.m7021setStrokeLineCapBeK7IIE(imageVector5.getStrokeLineCap());
                pathComponent.m7022setStrokeLineJoinWw9F2mQ(imageVector5.getStrokeLineJoin());
                pathComponent.setStrokeLineMiter(imageVector5.getStrokeLineMiter());
                pathComponent.setTrimPathStart(imageVector5.getTrimPathStart());
                pathComponent.setTrimPathEnd(imageVector5.getTrimPathEnd());
                pathComponent.setTrimPathOffset(imageVector5.getTrimPathOffset());
                groupComponent.insertAt(i, pathComponent);
            } else if (imageVector4 instanceof ImageVector3) {
                GroupComponent groupComponent2 = new GroupComponent();
                ImageVector3 imageVector32 = (ImageVector3) imageVector4;
                groupComponent2.setName(imageVector32.getName());
                groupComponent2.setRotation(imageVector32.getRotation());
                groupComponent2.setScaleX(imageVector32.getScaleX());
                groupComponent2.setScaleY(imageVector32.getScaleY());
                groupComponent2.setTranslationX(imageVector32.getTranslationX());
                groupComponent2.setTranslationY(imageVector32.getTranslationY());
                groupComponent2.setPivotX(imageVector32.getPivotX());
                groupComponent2.setPivotY(imageVector32.getPivotY());
                groupComponent2.setClipPathData(imageVector32.getClipPathData());
                createGroupComponent(groupComponent2, imageVector32);
                groupComponent.insertAt(i, groupComponent2);
            }
        }
        return groupComponent;
    }
}
