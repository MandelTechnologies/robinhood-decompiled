package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.ESignature;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiSignatureFieldBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.view.ViewUtils5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ESignatureComponent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, m3636d2 = {"makeView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ESignatureComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature;", "applyStyles", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/databinding/Pi2UiSignatureFieldBinding;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ESignature$ESignatureComponentStyle;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ESignatureComponent2 {
    public static final ConstraintLayout makeView(final ESignatureComponent eSignatureComponent, UiComponentHelper uiComponentHelper, final ESignature config) {
        Intrinsics.checkNotNullParameter(eSignatureComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiSignatureFieldBinding pi2UiSignatureFieldBindingInflate = Pi2UiSignatureFieldBinding.inflate(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ESignatureComponent2.makeView$lambda$7$lambda$6(config, pi2UiSignatureFieldBindingInflate, eSignatureComponent);
            }
        });
        pi2UiSignatureFieldBindingInflate.getRoot().setTag(pi2UiSignatureFieldBindingInflate);
        ConstraintLayout root = pi2UiSignatureFieldBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$7$lambda$6(ESignature eSignature, final Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding, final ESignatureComponent eSignatureComponent) throws IllegalArgumentException {
        String prefill;
        ESignature.Attributes attributes = eSignature.getAttributes();
        if (attributes != null && (prefill = attributes.getPrefill()) != null) {
            Context context = pi2UiSignatureFieldBinding.signaturePreview.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageLoader imageLoaderBuild = new ImageLoader.Builder(context).crossfade(true).crossfade(100).build();
            Context context2 = pi2UiSignatureFieldBinding.signaturePreview.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            imageLoaderBuild.enqueue(new ImageRequest.Builder(context2).data(prefill).target(new Target() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.ESignatureComponentKt$makeView$lambda$7$lambda$6$lambda$4$$inlined$target$1
                @Override // coil.target.Target
                public void onStart(Drawable placeholder) {
                    pi2UiSignatureFieldBinding.addSignatureLabel.setVisibility(8);
                    pi2UiSignatureFieldBinding.editSignatureIcon.setVisibility(8);
                    pi2UiSignatureFieldBinding.signaturePreview.setVisibility(8);
                }

                @Override // coil.target.Target
                public void onSuccess(Drawable result) {
                    Bitmap bitmap;
                    BitmapDrawable bitmapDrawable = result instanceof BitmapDrawable ? (BitmapDrawable) result : null;
                    if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
                        return;
                    }
                    eSignatureComponent.getBitmapController().setValue(bitmap);
                    pi2UiSignatureFieldBinding.signaturePreview.setVisibility(0);
                    pi2UiSignatureFieldBinding.editSignatureIcon.setVisibility(0);
                }

                @Override // coil.target.Target
                public void onError(Drawable error) {
                    pi2UiSignatureFieldBinding.addSignatureLabel.setVisibility(0);
                }
            }).build());
        }
        ESignature.ESignatureComponentStyle styles = eSignature.getStyles();
        if (styles != null) {
            Intrinsics.checkNotNull(pi2UiSignatureFieldBinding);
            applyStyles(pi2UiSignatureFieldBinding, styles);
        }
        return Unit.INSTANCE;
    }

    private static final void applyStyles(Pi2UiSignatureFieldBinding pi2UiSignatureFieldBinding, ESignature.ESignatureComponentStyle eSignatureComponentStyle) throws IllegalArgumentException {
        Drawable drawableMutate;
        TextView addSignatureLabel = pi2UiSignatureFieldBinding.addSignatureLabel;
        Intrinsics.checkNotNullExpressionValue(addSignatureLabel, "addSignatureLabel");
        TextStyling2.style$default(addSignatureLabel, eSignatureComponentStyle.getInputTextStyle().getPlaceholderTextBasedStyle(), null, 2, null);
        Integer signaturePreviewBackgroundColor = eSignatureComponentStyle.getSignaturePreviewBackgroundColor();
        if (signaturePreviewBackgroundColor != null) {
            pi2UiSignatureFieldBinding.signatureContainer.setCardBackgroundColor(signaturePreviewBackgroundColor.intValue());
        }
        Integer fillColorValue = eSignatureComponentStyle.getFillColorValue();
        if (fillColorValue != null) {
            int iIntValue = fillColorValue.intValue();
            Drawable drawable = pi2UiSignatureFieldBinding.editSignatureIcon.getDrawable();
            if (drawable != null && (drawableMutate = drawable.mutate()) != null) {
                drawableMutate.setTint(iIntValue);
            }
        }
        TextView errorLabel = pi2UiSignatureFieldBinding.errorLabel;
        Intrinsics.checkNotNullExpressionValue(errorLabel, "errorLabel");
        TextStyling2.style$default(errorLabel, eSignatureComponentStyle.getInputTextStyle().getErrorTextStyle(), null, 2, null);
        TextView label = pi2UiSignatureFieldBinding.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        TextStyling2.style$default(label, eSignatureComponentStyle.getInputTextStyle().getLabelTextBasedStyle(), null, 2, null);
        StyleElements.SizeSet margins = eSignatureComponentStyle.getMargins();
        if (margins != null) {
            ConstraintLayout root = pi2UiSignatureFieldBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ViewUtils5.setMargins(root, margins);
        }
        Integer baseBorderColorValue = eSignatureComponentStyle.getInputTextStyle().getBaseBorderColorValue();
        if (baseBorderColorValue != null) {
            pi2UiSignatureFieldBinding.signatureContainer.setStrokeColor(baseBorderColorValue.intValue());
        }
        Double borderWidthValue = eSignatureComponentStyle.getInputTextStyle().getBorderWidthValue();
        if (borderWidthValue != null) {
            pi2UiSignatureFieldBinding.signatureContainer.setStrokeWidth((int) Math.ceil(ExtensionsKt.getDpToPx(borderWidthValue.doubleValue())));
        }
        Double borderRadiusValue = eSignatureComponentStyle.getInputTextStyle().getBorderRadiusValue();
        if (borderRadiusValue != null) {
            pi2UiSignatureFieldBinding.signatureContainer.setRadius((float) ExtensionsKt.getDpToPx(borderRadiusValue.doubleValue()));
        }
    }
}
