package com.withpersona.sdk2.inquiry.shared.p422ui;

import android.text.StaticLayout;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: TextViewUtils.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"calculateLines", "", "Landroid/widget/TextView;", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.ui.TextViewUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class TextViewUtils {
    public static final int calculateLines(TextView textView) {
        int width;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        if (text == null || (width = textView.getWidth()) == 0 || StringsKt.isBlank(text)) {
            return 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), width).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getLineCount();
    }
}
