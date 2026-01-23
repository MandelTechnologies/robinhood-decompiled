package com.robinhood.android.directdeposit.p101ui.accountinfo;

import android.content.res.Resources;
import android.widget.TextView;
import com.robinhood.utils.ClipboardUtil;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextViews.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"copyTextOnClick", "", "Landroid/widget/TextView;", "clipboardLabel", "", "feature-direct-deposit_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class TextViewsKt {
    public static final void copyTextOnClick(final TextView textView, final String clipboardLabel) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(clipboardLabel, "clipboardLabel");
        OnClickListeners.onClick(textView, new Function0() { // from class: com.robinhood.android.directdeposit.ui.accountinfo.TextViewsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextViewsKt.copyTextOnClick$lambda$0(textView, clipboardLabel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyTextOnClick$lambda$0(TextView textView, String str) throws Resources.NotFoundException {
        ClipboardUtil.copyToClipboardWithHapticFeedback$default(ClipboardUtil.INSTANCE, textView.getText().toString(), str, textView, false, 8, null);
        return Unit.INSTANCE;
    }
}
