package com.robinhood.shared.common.lib.formats.currency;

import android.view.KeyEvent;
import com.robinhood.g11n.Locales2;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyEvents.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"isDecimalSeparator", "", "Landroid/view/KeyEvent;", "locale", "Ljava/util/Locale;", "lib-formats-currency_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.lib.formats.currency.KeyEventsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class KeyEvents {
    public static final boolean isDecimalSeparator(KeyEvent keyEvent, Locale locale) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        KeyEvent second = Locales2.getDecimalSeparator(locale).getSecond();
        if (keyEvent.getAction() == second.getAction()) {
            return keyEvent.getKeyCode() == second.getKeyCode() || keyEvent.getNumber() == second.getNumber();
        }
        return false;
    }
}
