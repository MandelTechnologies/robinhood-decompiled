package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.QRCode;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: QRCodeComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Landroid/widget/ImageView;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/QRCodeComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/QRCode;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class QRCodeComponent2 {

    /* compiled from: QRCodeComponent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ImageView makeView(QRCodeComponent qRCodeComponent, UiComponentHelper uiComponentHelper, final QRCode config) {
        String value;
        Intrinsics.checkNotNullParameter(qRCodeComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        QRCode.Attributes attributes = config.getAttributes();
        if (attributes != null && (value = attributes.getValue()) != null) {
            int width = qRCodeComponent.getWidth();
            HashMap map = new HashMap();
            map.put(EncodeHintType.MARGIN, 0);
            try {
                BitMatrix bitMatrixEncode = new QRCodeWriter().encode(value, BarcodeFormat.QR_CODE, width, width, map);
                Integer strokeColor = config.getStrokeColor();
                int iIntValue = strokeColor != null ? strokeColor.intValue() : -16777216;
                Integer fillColor = config.getFillColor();
                int iIntValue2 = fillColor != null ? fillColor.intValue() : -1;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.RGB_565);
                for (int i = 0; i < width; i++) {
                    for (int i2 = 0; i2 < width; i2++) {
                        bitmapCreateBitmap.setPixel(i, i2, bitMatrixEncode.get(i, i2) ? iIntValue : iIntValue2);
                    }
                }
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "also(...)");
                final ImageView imageView = new ImageView(uiComponentHelper.getContext());
                imageView.setImageBitmap(bitmapCreateBitmap);
                uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.QRCodeComponentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QRCodeComponent2.makeView$lambda$6$lambda$5(config, imageView);
                    }
                });
                return imageView;
            } catch (WriterException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$6$lambda$5(QRCode qRCode, ImageView imageView) {
        float f;
        StyleElements.SizeSet margin = qRCode.getMargin();
        if (margin != null) {
            ViewUtils5.setMargins(imageView, margin);
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = qRCode.getJustification();
        if (justification != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            int i = WhenMappings.$EnumSwitchMapping$0[justification.ordinal()];
            if (i == 1) {
                f = 0.0f;
            } else if (i == 2) {
                f = 0.5f;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 1.0f;
            }
            layoutParams2.horizontalBias = f;
        }
        imageView.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }
}
