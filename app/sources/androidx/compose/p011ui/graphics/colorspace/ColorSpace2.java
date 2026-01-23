package androidx.compose.p011ui.graphics.colorspace;

import androidx.collection.IntObjectMap3;
import androidx.compose.p011ui.graphics.colorspace.ColorModel;
import androidx.compose.p011ui.graphics.colorspace.Connector;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ColorSpace.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0010\u001a*\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a(\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a%\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a?\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001aO\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u001d\u001aO\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001a\u0010\u001d\u001a?\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001e\u0010\u0019\u001a?\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001f\u0010\u0019\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020#H\u0000¢\u0006\u0004\b!\u0010$\u001a\u0017\u0010&\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010*\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0000¢\u0006\u0004\b*\u0010+\u001a\u001f\u0010,\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0000¢\u0006\u0004\b,\u0010+\u001a\u001f\u0010-\u001a\u00020#2\u0006\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020#H\u0000¢\u0006\u0004\b-\u0010+\u001a'\u00101\u001a\u00020#2\u0006\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020#H\u0000¢\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m3636d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "destination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "Landroidx/compose/ui/graphics/colorspace/Connector;", "createConnector-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "createConnector", "connect-YBCOT_4", "connect", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "adaptation", "adapt", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "x", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "c", "d", "g", "rcpResponse", "(DDDDDD)D", "response", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "f", "(DDDDDDDD)D", "absRcpResponse", "absResponse", "", "compare", "(Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Z", "", "([F[F)Z", "m", "inverse3x3", "([F)[F", "lhs", "rhs", "mul3x3", "([F[F)[F", "mul3x3Float3", "mul3x3Diag", "matrix", "srcWhitePoint", "dstWhitePoint", "chromaticAdaptation", "([F[F[F)[F", "ui-graphics_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.graphics.colorspace.ColorSpaceKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ColorSpace2 {
    /* renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m6889createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        if (colorSpace == colorSpace2) {
            return Connector.INSTANCE.identity$ui_graphics_release(colorSpace);
        }
        long jM6885getModelxdoWZVw = colorSpace.getModel();
        ColorModel.Companion companion = ColorModel.INSTANCE;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (ColorModel.m6878equalsimpl0(jM6885getModelxdoWZVw, companion.m6883getRgbxdoWZVw()) && ColorModel.m6878equalsimpl0(colorSpace2.getModel(), companion.m6883getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Intrinsics.checkNotNull(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i, defaultConstructorMarker);
        }
        return new Connector(colorSpace, colorSpace2, i, defaultConstructorMarker);
    }

    /* renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m6888connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 2) != 0) {
            i = RenderIntent.INSTANCE.m6898getPerceptualuksYyKA();
        }
        return m6887connectYBCOT_4(colorSpace, colorSpace2, i);
    }

    /* renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m6887connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        int id$ui_graphics_release = colorSpace.getId();
        int id$ui_graphics_release2 = colorSpace2.getId();
        if ((id$ui_graphics_release | id$ui_graphics_release2) < 0) {
            return m6889createConnectorYBCOT_4(colorSpace, colorSpace2, i);
        }
        IntObjectMap3<Connector> connectors = Connector3.getConnectors();
        int i2 = id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (i << 12);
        Connector connectorM6889createConnectorYBCOT_4 = connectors.get(i2);
        if (connectorM6889createConnectorYBCOT_4 == null) {
            connectorM6889createConnectorYBCOT_4 = m6889createConnectorYBCOT_4(colorSpace, colorSpace2, i);
            connectors.set(i2, connectorM6889createConnectorYBCOT_4);
        }
        return connectorM6889createConnectorYBCOT_4;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i, Object obj) {
        if ((i & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    @JvmOverloads
    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.m6878equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m6883getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 * d4 ? (Math.pow(d - d6, 1.0d / d8) - d3) / d2 : (d - d7) / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final double absRcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(rcpResponse(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final double absResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(response(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = f + (f2 * f3) + (f4 * f5);
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        fArr3[1] = (f6 * f7) + (f3 * f8) + (f9 * f5);
        float f10 = fArr[2] * f7;
        float f11 = fArr[5];
        float f12 = f10 + (fArr2[1] * f11);
        float f13 = fArr[8];
        fArr3[2] = f12 + (f5 * f13);
        float f14 = fArr[0];
        float f15 = fArr2[3] * f14;
        float f16 = fArr2[4];
        float f17 = f15 + (f2 * f16);
        float f18 = fArr2[5];
        fArr3[3] = f17 + (f4 * f18);
        float f19 = fArr[1];
        float f20 = fArr2[3];
        fArr3[4] = (f19 * f20) + (f8 * f16) + (f9 * f18);
        float f21 = fArr[2];
        fArr3[5] = (f20 * f21) + (f11 * fArr2[4]) + (f18 * f13);
        float f22 = f14 * fArr2[6];
        float f23 = fArr[3];
        float f24 = fArr2[7];
        float f25 = f22 + (f23 * f24);
        float f26 = fArr2[8];
        fArr3[6] = f25 + (f4 * f26);
        float f27 = fArr2[6];
        fArr3[7] = (f19 * f27) + (fArr[4] * f24) + (f9 * f26);
        fArr3[8] = (f21 * f27) + (fArr[5] * fArr2[7]) + (f13 * f26);
        return fArr3;
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        return fArr2;
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0] * f;
        float f3 = fArr[1];
        float f4 = fArr2[1] * f3;
        float f5 = fArr[2];
        return new float[]{f2, f4, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, fArr));
    }
}
