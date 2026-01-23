package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiTitleBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TitleComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/TitleComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Title;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class TitleComponent2 {
    public static final TextView makeView(TitleComponent titleComponent, UiComponentHelper uiComponentHelper, final Title config) {
        Intrinsics.checkNotNullParameter(titleComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiTitleBinding pi2UiTitleBindingInflate = Pi2UiTitleBinding.inflate(uiComponentHelper.getLayoutInflater());
        Title.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            TextView textView = pi2UiTitleBindingInflate.textView;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            ExtensionsKt.setMarkdown(textView, attributes.getText());
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.TitleComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TitleComponent2.makeView$lambda$3$lambda$2$lambda$1(config, pi2UiTitleBindingInflate);
                }
            });
        }
        TextView root = pi2UiTitleBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$3$lambda$2$lambda$1(Title title, Pi2UiTitleBinding pi2UiTitleBinding) throws IllegalArgumentException {
        TextBasedComponentStyle styles = title.getStyles();
        if (styles != null) {
            TextView textView = pi2UiTitleBinding.textView;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            TextStyling2.style$default(textView, styles, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
