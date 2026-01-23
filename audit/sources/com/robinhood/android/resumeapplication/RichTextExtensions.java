package com.robinhood.android.resumeapplication;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RichTextExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m3636d2 = {"setRichText", "", "Lcom/robinhood/android/designsystem/text/RhTextView;", "richText", "Lcom/robinhood/models/serverdriven/experimental/api/RichText;", "feature-lib-resume-application_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.resumeapplication.RichTextExtensionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RichTextExtensions {
    public static final void setRichText(RhTextView rhTextView, RichText richText) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(rhTextView, "<this>");
        Intrinsics.checkNotNullParameter(richText, "richText");
        rhTextView.setVisibility(0);
        Context context = rhTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1);
        Context context2 = rhTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rhTextView.setText(IconExtensions.toSpannableString$default(richText, context2, Integer.valueOf(themeColor), true, null, 8, null));
    }
}
