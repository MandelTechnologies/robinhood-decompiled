package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.withpersona.sdk2.inquiry.shared.R$dimen;
import com.withpersona.sdk2.inquiry.steps.p423ui.R$drawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BrandingComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"makeView", "Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/BrandingComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class BrandingComponent2 {
    public static final View makeView(BrandingComponent brandingComponent, UiComponentHelper uiComponentHelper) {
        Intrinsics.checkNotNullParameter(brandingComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Context context = uiComponentHelper.getContext();
        if (!brandingComponent.getShowBranding()) {
            return null;
        }
        final ShapeableImageView shapeableImageView = new ShapeableImageView(context);
        shapeableImageView.setImageResource(R$drawable.pi2_inquiry_persona_branding);
        shapeableImageView.setAdjustViewBounds(true);
        int dimension = (int) context.getResources().getDimension(R$dimen.startEndMargin);
        shapeableImageView.setPadding(dimension, shapeableImageView.getPaddingTop(), dimension, shapeableImageView.getPaddingBottom());
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.BrandingComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BrandingComponent2.makeView$lambda$2(shapeableImageView);
            }
        });
        return shapeableImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$2(ShapeableImageView shapeableImageView) {
        ViewGroup.LayoutParams layoutParams = shapeableImageView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.horizontalBias = 1.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            shapeableImageView.setLayoutParams(layoutParams2);
            return Unit.INSTANCE;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
