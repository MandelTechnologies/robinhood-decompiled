package com.robinhood.android.common.util.extensions;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClipboardManagers.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"FRESH_THRESHOLD_MILLIS", "", "getMfaCode", "", "Landroid/content/ClipboardManager;", "timestampCompat", "", "Landroid/content/ClipDescription;", "getTimestampCompat", "(Landroid/content/ClipDescription;)Ljava/lang/Long;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.ClipboardManagersKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class ClipboardManagers {
    private static final int FRESH_THRESHOLD_MILLIS = 60000;

    public static final String getMfaCode(ClipboardManager clipboardManager) {
        CharSequence text;
        Long timestampCompat;
        Intrinsics.checkNotNullParameter(clipboardManager, "<this>");
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip == null) {
            return null;
        }
        int itemCount = primaryClip.getItemCount();
        ClipDescription description = primaryClip.getDescription();
        long jCurrentTimeMillis = System.currentTimeMillis() - ((description == null || (timestampCompat = getTimestampCompat(description)) == null) ? System.currentTimeMillis() : timestampCompat.longValue());
        if (itemCount > 0 && jCurrentTimeMillis < 60000) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            String string2 = (itemAt == null || (text = itemAt.getText()) == null) ? null : text.toString();
            if (string2 != null && string2.length() == 6) {
                for (int i = 0; i < string2.length(); i++) {
                    if (Character.isDigit(string2.charAt(i))) {
                    }
                }
                return string2;
            }
        }
        return null;
    }

    public static final Long getTimestampCompat(ClipDescription clipDescription) {
        Intrinsics.checkNotNullParameter(clipDescription, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            return Long.valueOf(clipDescription.getTimestamp());
        }
        return null;
    }
}
