package com.robinhood.android.waitlist.util;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RichTextExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0006"}, m3636d2 = {"showRichText", "", "Lcom/robinhood/android/designsystem/text/RhTextView;", "richText", "Lcom/robinhood/models/serverdriven/db/RichText;", "setRichText", "feature-waitlist_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.waitlist.util.RichTextExtensionsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RichTextExtensions2 {
    public static final void showRichText(RhTextView rhTextView, RichText richText) {
        Intrinsics.checkNotNullParameter(rhTextView, "<this>");
        Intrinsics.checkNotNullParameter(richText, "richText");
        setRichText(rhTextView, richText);
        rhTextView.setVisibility(0);
    }

    public static final void setRichText(RhTextView rhTextView, RichText richText) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(rhTextView, "<this>");
        Intrinsics.checkNotNullParameter(richText, "richText");
        Context context = rhTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int themeColor = ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary);
        Context context2 = rhTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        rhTextView.setText(RichTexts.toSpannableString$default(richText, context2, Integer.valueOf(themeColor), false, null, 12, null));
        rhTextView.setVisibility(0);
    }
}
