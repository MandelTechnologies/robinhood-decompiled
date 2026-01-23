package com.robinhood.compose.bento.component.numpad;

import android.view.KeyEvent;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.utils.extensions.KeyEvents2;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0005H\u0000\u001a+\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\f\u001a\u00020\bH\u0002\u001a-\u0010\u0018\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001c\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001f\u0010\u001e\u001a\u00020\u001f*\u00020\u000e2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!H\u0002¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m3636d2 = {"isDelimiter", "", "", "isMinusSign", "filterToNumpadChars", "", "allowNegative", "toDelimiterChar", "Landroid/view/KeyEvent;", "containsDelimiter", "modifyValueForKeyEvent", "Landroidx/compose/ui/text/input/TextFieldValue;", "keyEvent", "selection", "Landroidx/compose/ui/text/TextRange;", "modifyValueForKeyEvent-YmzfRxQ", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroid/view/KeyEvent;JZ)Landroidx/compose/ui/text/input/TextFieldValue;", "handleZeroSelection", "", "newValueList", "", "handleZeroSelection-Sb-Bc2M", "(Ljava/util/List;JLandroid/view/KeyEvent;)V", "appendStart", "handleSelectionReplace", "newChar", "handleSelectionReplace-Sb-Bc2M", "(Ljava/util/List;JC)V", "handleSelectionAddToStart", "handleSelectionAddToStart-Sb-Bc2M", "getSafeStart", "", "list", "", "getSafeStart-72CqOWE", "(JLjava/util/List;)I", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class StringsKt {
    private static final boolean isMinusSign(char c) {
        return c == '-';
    }

    private static final boolean isDelimiter(char c) {
        return SetsKt.setOf((Object[]) new Character[]{'.', ',', ' '}).contains(Character.valueOf(c));
    }

    public static final char toDelimiterChar(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "<this>");
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 55) {
            return ',';
        }
        if (keyCode == 56) {
            return '.';
        }
        if (keyCode == 62) {
            return ' ';
        }
        if (keyCode == 158) {
            return '.';
        }
        throw new IllegalArgumentException("Invalid key code for delimiter");
    }

    public static final boolean containsDelimiter(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.contains$default((CharSequence) str, '.', false, 2, (Object) null) || kotlin.text.StringsKt.contains$default((CharSequence) str, ',', false, 2, (Object) null) || kotlin.text.StringsKt.contains$default((CharSequence) str, ' ', false, 2, (Object) null);
    }

    /* renamed from: modifyValueForKeyEvent-YmzfRxQ, reason: not valid java name */
    public static final TextFieldValue m20904modifyValueForKeyEventYmzfRxQ(TextFieldValue modifyValueForKeyEvent, KeyEvent keyEvent, long j, boolean z) {
        TextRange textRangeM7634boximpl;
        Intrinsics.checkNotNullParameter(modifyValueForKeyEvent, "$this$modifyValueForKeyEvent");
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        List<Character> mutableList = kotlin.text.StringsKt.toMutableList(modifyValueForKeyEvent.getText());
        int iM20900getSafeStart72CqOWE = m20900getSafeStart72CqOWE(j, mutableList);
        if (KeyEvents2.isDelete(keyEvent)) {
            if (mutableList.size() == 0) {
                return new TextFieldValue(modifyValueForKeyEvent.getText(), j, (TextRange) null, 4, (DefaultConstructorMarker) null);
            }
            if (TextRange.m7642getLengthimpl(j) != 0) {
                mutableList.subList(TextRange.m7644getMinimpl(j), TextRange.m7643getMaximpl(j)).clear();
                textRangeM7634boximpl = TextRange.m7634boximpl(TextRange2.TextRange(iM20900getSafeStart72CqOWE, iM20900getSafeStart72CqOWE));
            } else {
                if (iM20900getSafeStart72CqOWE == 0) {
                    return new TextFieldValue(modifyValueForKeyEvent.getText(), j, (TextRange) null, 4, (DefaultConstructorMarker) null);
                }
                int i = iM20900getSafeStart72CqOWE - 1;
                mutableList.remove(i);
                textRangeM7634boximpl = TextRange.m7634boximpl(TextRange2.TextRange(i, i));
            }
        } else if (KeyEvents2.isDigit(keyEvent)) {
            if (TextRange.m7642getLengthimpl(j) == 0) {
                m20903handleZeroSelectionSbBc2M(mutableList, j, keyEvent);
            } else {
                m20902handleSelectionReplaceSbBc2M(mutableList, j, keyEvent.getNumber());
            }
            textRangeM7634boximpl = TextRange.m7634boximpl(TextRange2.TextRange(TextRange.m7644getMinimpl(j) + 1, TextRange.m7644getMinimpl(j) + 1));
        } else if (KeyEvents2.isDelimiter(keyEvent)) {
            if (containsDelimiter(modifyValueForKeyEvent.getText())) {
                return new TextFieldValue(modifyValueForKeyEvent.getText(), j, (TextRange) null, 4, (DefaultConstructorMarker) null);
            }
            if (TextRange.m7642getLengthimpl(j) == 0) {
                m20903handleZeroSelectionSbBc2M(mutableList, j, keyEvent);
            } else {
                m20902handleSelectionReplaceSbBc2M(mutableList, j, toDelimiterChar(keyEvent));
            }
            textRangeM7634boximpl = TextRange.m7634boximpl(TextRange2.TextRange(TextRange.m7644getMinimpl(j) + 1, TextRange.m7644getMinimpl(j) + 1));
        } else if (!KeyEvents2.isMinus(keyEvent) || !z) {
            textRangeM7634boximpl = null;
        } else {
            if (kotlin.text.StringsKt.contains$default((CharSequence) modifyValueForKeyEvent.getText(), '-', false, 2, (Object) null)) {
                return new TextFieldValue(modifyValueForKeyEvent.getText(), j, (TextRange) null, 4, (DefaultConstructorMarker) null);
            }
            if (TextRange.m7642getLengthimpl(j) == 0) {
                appendStart(mutableList, keyEvent);
            } else {
                m20901handleSelectionAddToStartSbBc2M(mutableList, j, '-');
            }
            textRangeM7634boximpl = TextRange.m7634boximpl(TextRange2.TextRange(TextRange.m7644getMinimpl(j) + 1, TextRange.m7644getMinimpl(j) + 1));
        }
        return new TextFieldValue(CollectionsKt.joinToString$default(mutableList, "", null, null, 0, null, null, 62, null), textRangeM7634boximpl != null ? textRangeM7634boximpl.getPackedValue() : j, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: handleZeroSelection-Sb-Bc2M, reason: not valid java name */
    private static final void m20903handleZeroSelectionSbBc2M(List<Character> list, long j, KeyEvent keyEvent) {
        char delimiterChar;
        if (KeyEvents2.isDigit(keyEvent)) {
            delimiterChar = keyEvent.getNumber();
        } else {
            delimiterChar = KeyEvents2.isMinus(keyEvent) ? '-' : toDelimiterChar(keyEvent);
        }
        if (list.size() == 0) {
            list.add(Character.valueOf(delimiterChar));
        } else {
            list.add(RangesKt.coerceIn(m20900getSafeStart72CqOWE(j, list), 0, list.size()), Character.valueOf(delimiterChar));
        }
    }

    private static final void appendStart(List<Character> list, KeyEvent keyEvent) {
        char delimiterChar;
        if (KeyEvents2.isDigit(keyEvent)) {
            delimiterChar = keyEvent.getNumber();
        } else {
            delimiterChar = KeyEvents2.isMinus(keyEvent) ? '-' : toDelimiterChar(keyEvent);
        }
        list.add(0, Character.valueOf(delimiterChar));
    }

    /* renamed from: handleSelectionReplace-Sb-Bc2M, reason: not valid java name */
    private static final void m20902handleSelectionReplaceSbBc2M(List<Character> list, long j, char c) {
        list.subList(TextRange.m7644getMinimpl(j), TextRange.m7643getMaximpl(j)).clear();
        list.add(TextRange.m7644getMinimpl(j), Character.valueOf(c));
    }

    /* renamed from: handleSelectionAddToStart-Sb-Bc2M, reason: not valid java name */
    private static final void m20901handleSelectionAddToStartSbBc2M(List<Character> list, long j, char c) {
        list.subList(TextRange.m7644getMinimpl(j), TextRange.m7643getMaximpl(j)).clear();
        list.add(0, Character.valueOf(c));
    }

    /* renamed from: getSafeStart-72CqOWE, reason: not valid java name */
    private static final int m20900getSafeStart72CqOWE(long j, List<?> list) {
        return RangesKt.coerceIn(TextRange.m7646getStartimpl(j), 0, list.size());
    }

    public static final String filterToNumpadChars(String str, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt) || isDelimiter(cCharAt) || (isMinusSign(cCharAt) && z)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
