package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.utils.ExtensionsKt;
import com.withpersona.sdk2.inquiry.steps.p423ui.databinding.Pi2UiTextBinding;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextComponent.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeView", "Landroid/widget/TextView;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/TextComponent;", "uiComponentHelper", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "config", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Text;", "ui-step-renderer_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.TextComponentKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class TextComponent2 {
    public static final TextView makeView(TextComponent textComponent, UiComponentHelper uiComponentHelper, final Text config) {
        Intrinsics.checkNotNullParameter(textComponent, "<this>");
        Intrinsics.checkNotNullParameter(uiComponentHelper, "uiComponentHelper");
        Intrinsics.checkNotNullParameter(config, "config");
        final Pi2UiTextBinding pi2UiTextBindingInflate = Pi2UiTextBinding.inflate(uiComponentHelper.getLayoutInflater());
        Text.Attributes attributes = config.getAttributes();
        if (attributes != null) {
            TextView textView = pi2UiTextBindingInflate.textView;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            ExtensionsKt.setMarkdown(textView, attributes.getText());
            uiComponentHelper.registerOnLayoutListener(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.TextComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TextComponent2.makeView$lambda$3$lambda$2$lambda$1(config, pi2UiTextBindingInflate);
                }
            });
        }
        TextView root = pi2UiTextBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeView$lambda$3$lambda$2$lambda$1(Text text, Pi2UiTextBinding pi2UiTextBinding) throws IllegalArgumentException {
        TextBasedComponentStyle styles = text.getStyles();
        if (styles != null) {
            TextView textView = pi2UiTextBinding.textView;
            Intrinsics.checkNotNullExpressionValue(textView, "textView");
            TextStyling2.style$default(textView, styles, null, 2, null);
        }
        return Unit.INSTANCE;
    }
}
