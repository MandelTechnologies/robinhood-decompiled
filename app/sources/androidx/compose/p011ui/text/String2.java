package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.intl.Locale;
import androidx.compose.p011ui.text.platform.AndroidStringDelegate_androidKt;
import kotlin.Metadata;

/* compiled from: String.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"", "Landroidx/compose/ui/text/intl/Locale;", "locale", "toLowerCase", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/Locale;)Ljava/lang/String;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "stringDelegate", "Landroidx/compose/ui/text/PlatformStringDelegate;", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.StringKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class String2 {
    private static final String stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    public static final String toLowerCase(String str, Locale locale) {
        return stringDelegate.toLowerCase(str, locale.getPlatformLocale());
    }
}
