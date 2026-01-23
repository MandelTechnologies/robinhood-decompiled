package com.withpersona.sdk2.inquiry.steps.p423ui.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.RemoteImageComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponent3;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RemoteImageUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"renderToContainer", "Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "centerVertical", "", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class RemoteImageUtils {
    public static /* synthetic */ View renderToContainer$default(RemoteImage remoteImage, ConstraintLayout constraintLayout, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return renderToContainer(remoteImage, constraintLayout, z);
    }

    public static final View renderToContainer(RemoteImage remoteImage, ConstraintLayout container, boolean z) {
        Intrinsics.checkNotNullParameter(remoteImage, "<this>");
        Intrinsics.checkNotNullParameter(container, "container");
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final UiComponentHelper uiComponentHelper = new UiComponentHelper(context);
        View viewMakeView = RemoteImageComponent2.makeView(UiComponent3.toUiComponent(remoteImage), uiComponentHelper, remoteImage);
        container.addView(viewMakeView);
        ViewGroup.LayoutParams layoutParams = viewMakeView.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            if (z) {
                layoutParams2.bottomToBottom = 0;
            }
            viewMakeView.setLayoutParams(layoutParams2);
            ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(container, new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RemoteImageUtils.renderToContainer$lambda$1(uiComponentHelper);
                }
            });
            return viewMakeView;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderToContainer$lambda$1(UiComponentHelper uiComponentHelper) {
        uiComponentHelper.onLayout();
        return Unit.INSTANCE;
    }
}
