package com.withpersona.sdk2.inquiry.steps.p423ui.styling;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.resources.R$attr;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageStyling.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u001aE\u0010\t\u001a\u00020\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0016\u001a\u00020\b*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "styles", "", "", "originalStrokeColors", "originalFillColors", "originalBackgroundColors", "", "applyStyle", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "Landroid/widget/ImageView;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "component", "applyStyles", "(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;)V", "", "newStrokeColor", "newFillColor", "newBackgroundColor", "replaceColors", "(Lcom/withpersona/sdk2/inquiry/shared/ui/ThemeableLottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;[Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ImageStyling {

    /* compiled from: ImageStyling.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt$WhenMappings */
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

    private static final void applyStyle$applyStyles(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) {
        AttributeStyles.LocalImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f;
        StyleElements.SizeSet marginValue;
        replaceColors(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getStrokeColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getFillColorValue() : null, localImageComponentStyle != null ? localImageComponentStyle.getBackgroundColorValue() : null, strArr, strArr2, strArr3);
        if (localImageComponentStyle != null && (marginValue = localImageComponentStyle.getMarginValue()) != null) {
            ViewUtils5.setMargins(themeableLottieAnimationView, marginValue);
        }
        ViewUtils5.applyWidth(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getWidthValue() : null);
        ViewUtils5.applyHeight(themeableLottieAnimationView, localImageComponentStyle != null ? localImageComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = themeableLottieAnimationView.getLayoutParams();
        if (localImageComponentStyle != null && (justify = localImageComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int i = WhenMappings.$EnumSwitchMapping$0[base2.ordinal()];
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
        themeableLottieAnimationView.setLayoutParams(layoutParams);
    }

    public static final void applyStyle(final ThemeableLottieAnimationView themeableLottieAnimationView, final LocalImageComponentStyle localImageComponentStyle, final String[] originalStrokeColors, final String[] originalFillColors, final String[] originalBackgroundColors) {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(originalBackgroundColors, "originalBackgroundColors");
        if (themeableLottieAnimationView.isLaidOut()) {
            applyStyle$applyStyles(themeableLottieAnimationView, localImageComponentStyle, originalStrokeColors, originalFillColors, originalBackgroundColors);
        } else {
            ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(themeableLottieAnimationView, new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ImageStyling.applyStyle$lambda$3(themeableLottieAnimationView, localImageComponentStyle, originalStrokeColors, originalFillColors, originalBackgroundColors);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit applyStyle$lambda$3(ThemeableLottieAnimationView themeableLottieAnimationView, LocalImageComponentStyle localImageComponentStyle, String[] strArr, String[] strArr2, String[] strArr3) {
        applyStyle$applyStyles(themeableLottieAnimationView, localImageComponentStyle, strArr, strArr2, strArr3);
        return Unit.INSTANCE;
    }

    public static final void applyStyle(ImageView imageView, CombinedStepImagePreview.CombinedStepImagePreviewComponentStyle combinedStepImagePreviewComponentStyle) {
        AttributeStyles.RemoteImageJustifyStyle justify;
        StyleElements.Position base;
        StyleElements.PositionType base2;
        float f;
        StyleElements.SizeSet marginValue;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (combinedStepImagePreviewComponentStyle != null && (marginValue = combinedStepImagePreviewComponentStyle.getMarginValue()) != null) {
            ViewUtils5.setMargins(imageView, marginValue);
        }
        ViewUtils5.applyWidth(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getWidthValue() : null);
        ViewUtils5.applyHeight(imageView, combinedStepImagePreviewComponentStyle != null ? combinedStepImagePreviewComponentStyle.getHeightValue() : null);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (combinedStepImagePreviewComponentStyle != null && (justify = combinedStepImagePreviewComponentStyle.getJustify()) != null && (base = justify.getBase()) != null && (base2 = base.getBase()) != null && (layoutParams instanceof ConstraintLayout.LayoutParams)) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            int i = WhenMappings.$EnumSwitchMapping$0[base2.ordinal()];
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
    }

    public static final void applyStyles(ImageView imageView, RemoteImage component) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        StyleElements.SizeSet margin = component.getMargin();
        if (margin != null) {
            ViewUtils5.setMargins(imageView, margin);
        }
        ViewUtils5.applyWidth(imageView, component.getWidth());
        ViewUtils5.applyHeight(imageView, component.getHeight());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        StyleElements.PositionType justification = component.getJustification();
        if (justification != null) {
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                int i = WhenMappings.$EnumSwitchMapping$0[justification.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        f = 0.5f;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f = 1.0f;
                    }
                }
                layoutParams2.horizontalBias = f;
            }
        } else if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams;
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            layoutParams3.horizontalBias = ResTools.boolFromAttr$default(context, R$attr.personaCenterAlignRemoteAsset, null, false, false, 14, null) ? 0.5f : 0.0f;
        }
        imageView.setLayoutParams(layoutParams);
    }

    public static final void replaceColors(ThemeableLottieAnimationView themeableLottieAnimationView, Integer num, Integer num2, Integer num3, String[] originalStrokeColors, String[] originalFillColors, String[] originalBackgroundColors) {
        Intrinsics.checkNotNullParameter(themeableLottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(originalStrokeColors, "originalStrokeColors");
        Intrinsics.checkNotNullParameter(originalFillColors, "originalFillColors");
        Intrinsics.checkNotNullParameter(originalBackgroundColors, "originalBackgroundColors");
        if (num != null) {
            int iIntValue = num.intValue();
            for (String str : originalStrokeColors) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor(str), iIntValue);
            }
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            for (String str2 : originalFillColors) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor(str2), iIntValue2);
            }
        }
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (String str3 : originalBackgroundColors) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor(str3), iIntValue3);
            }
        }
    }
}
