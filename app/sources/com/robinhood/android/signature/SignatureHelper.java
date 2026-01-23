package com.robinhood.android.signature;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.Base64;
import com.robinhood.android.signature.SignatureView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

/* compiled from: SignatureHelper.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u001a\u0010\u0013\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/signature/SignatureHelper;", "", "<init>", "()V", "getPaint", "Landroid/graphics/Paint;", "resources", "Landroid/content/res/Resources;", "drawSignatureToBitmap", "Landroid/graphics/Bitmap;", "signature", "Lcom/robinhood/android/signature/SignatureView$Signature;", "paintColor", "", "(Lcom/robinhood/android/signature/SignatureView$Signature;Landroid/content/res/Resources;Ljava/lang/Integer;)Landroid/graphics/Bitmap;", "createSvg", "", "svgWidth", "svgHeight", "encodeSvg", "lib-signature_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SignatureHelper {
    public static final SignatureHelper INSTANCE = new SignatureHelper();

    private SignatureHelper() {
    }

    public final Paint getPaint(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(resources.getDimension(C28531R.dimen.signature_view_stroke_width));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new CornerPathEffect(resources.getDimension(C28531R.dimen.signature_view_corner_path_effect)));
        return paint;
    }

    public final Bitmap drawSignatureToBitmap(SignatureView.Signature signature, Resources resources, Integer paintColor) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(signature.getSize().getWidth(), signature.getSize().getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Paint paint = getPaint(resources);
        if (paintColor != null) {
            paint.setColor(paintColor.intValue());
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Iterator<T> it = signature.getPathData().iterator();
        while (it.hasNext()) {
            ((SignatureView.SignaturePath) it.next()).draw(canvas, paint);
        }
        return bitmapCreateBitmap;
    }

    public final String createSvg(SignatureView.Signature signature, int svgWidth, int svgHeight) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        SimpleSvgBuilder simpleSvgBuilder = new SimpleSvgBuilder(signature.getSize().getWidth(), signature.getSize().getHeight(), svgWidth, svgHeight);
        for (SignatureView.SignaturePath signaturePath : signature.getPathData()) {
            PointF moveCoordinates = signaturePath.getMoveCoordinates();
            simpleSvgBuilder.moveTo(moveCoordinates.x, moveCoordinates.y);
            for (PointF pointF : signaturePath.getLineCoordinates()) {
                simpleSvgBuilder.lineTo(pointF.x, pointF.y);
            }
        }
        return simpleSvgBuilder.buildSvg();
    }

    public final String encodeSvg(SignatureView.Signature signature, int i, int i2) {
        Intrinsics.checkNotNullParameter(signature, "<this>");
        byte[] bytes = createSvg(signature, i, i2).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
