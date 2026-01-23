package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SpacerComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"makeView", "Landroid/view/View;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SpacerComponent2 {
    public static final View makeView(final SpacerComponent spacerComponent, UiComponentHelper uiComponentHelper) {
        Intrinsics.checkNotNullParameter(spacerComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        final View view = new View(uiComponentHelper.getContext());
        uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.SpacerComponentKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpacerComponent2.makeView$lambda$2$lambda$1(view, spacerComponent);
            }
        });
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$2$lambda$1(View view, SpacerComponent spacerComponent) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = RangesKt.coerceAtLeast(spacerComponent.getHeight(), 1);
        view.setLayoutParams(layoutParams);
        return Unit.INSTANCE;
    }
}
