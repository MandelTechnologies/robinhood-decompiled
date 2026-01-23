package com.robinhood.utils;

import android.content.ClipData;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ClipboardUtil.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/utils/ClipboardUtil;", "", "<init>", "()V", "copyToClipboardWithHapticFeedback", "", "text", "", "clipboardLabel", "view", "Landroid/view/View;", "showToast", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ClipboardUtil {
    public static final int $stable = 0;
    public static final ClipboardUtil INSTANCE = new ClipboardUtil();

    private ClipboardUtil() {
    }

    public static /* synthetic */ void copyToClipboardWithHapticFeedback$default(ClipboardUtil clipboardUtil, String str, String str2, View view, boolean z, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 8) != 0) {
            z = true;
        }
        clipboardUtil.copyToClipboardWithHapticFeedback(str, str2, view, z);
    }

    public final void copyToClipboardWithHapticFeedback(String text, String clipboardLabel, View view, boolean showToast) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(clipboardLabel, "clipboardLabel");
        Intrinsics.checkNotNullParameter(view, "view");
        if (StringsKt.isBlank(text)) {
            return;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNull(context);
        ContextSystemServices.getClipboardManager(context).setPrimaryClip(ClipData.newPlainText(clipboardLabel, text));
        if (showToast) {
            ContextsUiExtensions.showShortToast(context, C41827R.string.general_copied_to_clipboard);
        }
        view.performHapticFeedback(0);
    }
}
