package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.widget.ImageView;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.CombinedStepImagePreview;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2UiImageViewBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.ImageStyling;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImagePreviewComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Landroid/widget/ImageView;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ImagePreviewComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ImagePreviewComponent2 {
    public static final ImageView makeView(ImagePreviewComponent imagePreviewComponent, UiComponentHelper uiComponentHelper, final CombinedStepImagePreview config) {
        Intrinsics.checkNotNullParameter(imagePreviewComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiImageViewBinding pi2UiImageViewBindingInflate = Pi2UiImageViewBinding.inflate(uiComponentHelper.getLayoutInflater());
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.ImagePreviewComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ImagePreviewComponent2.makeView$lambda$1$lambda$0(pi2UiImageViewBindingInflate, config);
            }
        });
        ImageView root = pi2UiImageViewBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$1$lambda$0(Pi2UiImageViewBinding pi2UiImageViewBinding, CombinedStepImagePreview combinedStepImagePreview) {
        ImageView imageView = pi2UiImageViewBinding.imageView;
        Intrinsics.checkNotNullExpressionValue(imageView, "imageView");
        ImageStyling.applyStyle(imageView, combinedStepImagePreview.getStyles());
        return Unit.INSTANCE;
    }
}
