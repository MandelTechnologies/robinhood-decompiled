package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.graphics.vector.PathBuilder;
import androidx.compose.p011ui.graphics.vector.VectorKt;
import androidx.compose.p011ui.unit.C2002Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcUnit.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"_acUnit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AcUnit", "Landroidx/compose/material/icons/Icons$Filled;", "getAcUnit", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material.icons.filled.AcUnitKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class AcUnit {
    private static ImageVector _acUnit;

    public static final ImageVector getAcUnit(Icons.Filled filled) {
        ImageVector imageVector = _acUnit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AcUnit", C2002Dp.m7995constructorimpl(24.0f), C2002Dp.m7995constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m6716getBlack0d7_KjU(), null);
        int iM6848getButtKaPHkGw = StrokeCap.INSTANCE.m6848getButtKaPHkGw();
        int iM6855getBevelLxFBmk8 = StrokeJoin.INSTANCE.m6855getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-4.17f);
        pathBuilder.lineToRelative(3.24f, -3.24f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.lineTo(15.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(4.66f, -4.66f);
        pathBuilder.lineToRelative(-1.42f, -1.41f);
        pathBuilder.lineTo(13.0f, 6.17f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.17f);
        pathBuilder.lineTo(7.76f, 2.93f);
        pathBuilder.lineTo(6.34f, 4.34f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineTo(4.34f, 6.34f);
        pathBuilder.lineTo(2.93f, 7.76f);
        pathBuilder.lineTo(6.17f, 11.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(4.17f);
        pathBuilder.lineToRelative(-3.24f, 3.24f);
        pathBuilder.lineToRelative(1.41f, 1.42f);
        pathBuilder.lineTo(9.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-4.66f, 4.66f);
        pathBuilder.lineToRelative(1.42f, 1.41f);
        pathBuilder.lineTo(11.0f, 17.83f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-4.17f);
        pathBuilder.lineToRelative(3.24f, 3.24f);
        pathBuilder.lineToRelative(1.42f, -1.41f);
        pathBuilder.lineTo(13.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(4.66f, 4.66f);
        pathBuilder.lineToRelative(1.41f, -1.42f);
        pathBuilder.lineTo(17.83f, 13.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = builder.m7019addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM6848getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM6855getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _acUnit = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
