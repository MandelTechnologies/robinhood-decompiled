package com.robinhood.android.futures.trade.p147ui.orderform;

import android.view.KeyEvent;
import androidx.compose.p011ui.text.TextRange;
import com.robinhood.utils.extensions.KeyEvents2;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: KeyEventInputHandler.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"processKeyEvent", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "selection", "Landroidx/compose/ui/text/TextRange;", "event", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "allowDecimal", "", "processKeyEvent-M8tDOmk", "(Ljava/lang/String;JLandroid/view/KeyEvent;Z)Ljava/lang/String;", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.orderform.KeyEventInputHandlerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class KeyEventInputHandler2 {
    /* renamed from: processKeyEvent-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ String m14928processKeyEventM8tDOmk$default(String str, long j, KeyEvent keyEvent, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return m14927processKeyEventM8tDOmk(str, j, keyEvent, z);
    }

    /* renamed from: processKeyEvent-M8tDOmk, reason: not valid java name */
    public static final String m14927processKeyEventM8tDOmk(String s, long j, KeyEvent event, boolean z) {
        Intrinsics.checkNotNullParameter(s, "s");
        Intrinsics.checkNotNullParameter(event, "event");
        int iCoerceAtMost = RangesKt.coerceAtMost(TextRange.m7644getMinimpl(j), s.length());
        int iCoerceAtMost2 = RangesKt.coerceAtMost(TextRange.m7643getMaximpl(j), s.length());
        if (KeyEvents2.isDelete(event)) {
            if (TextRange.m7642getLengthimpl(j) == 0) {
                return StringsKt.removeRange(s, RangesKt.coerceAtLeast(iCoerceAtMost - 1, 0), iCoerceAtMost2).toString();
            }
            return StringsKt.removeRange(s, iCoerceAtMost, iCoerceAtMost2).toString();
        }
        if (KeyEvents2.isDigit(event)) {
            if (s.length() == 0 && event.getNumber() == '0') {
                return s;
            }
            String strSubstring = s.substring(0, iCoerceAtMost);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            char number = event.getNumber();
            String strSubstring2 = s.substring(iCoerceAtMost2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return strSubstring + number + strSubstring2;
        }
        if (!KeyEvents2.isDot(event) || !z || StringsKt.contains$default((CharSequence) s, (CharSequence) ".", false, 2, (Object) null)) {
            return s;
        }
        String strSubstring3 = s.substring(0, iCoerceAtMost);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        String strSubstring4 = s.substring(iCoerceAtMost2);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
        return strSubstring3 + "." + strSubstring4;
    }
}
