package androidx.compose.material3;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TextFieldDefaults.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100JÀ\u0003\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00108\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\r04H\u0000¢\u0006\u0004\b6\u00107J-\u0010?\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b=\u0010>J-\u0010A\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010>J-\u0010C\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bB\u0010>J-\u0010E\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010>J-\u0010G\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010>J-\u0010I\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bH\u0010>J-\u0010K\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010>J-\u0010M\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010>J-\u0010O\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010>J-\u0010Q\u001a\u00020\u00022\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\u0006\u0010<\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010>J\u001d\u0010\u000b\u001a\u00020\u00022\u0006\u0010;\u001a\u000209H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u001a\u0010U\u001a\u0002092\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010Z\u001a\u0004\b[\u0010\\R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010Z\u001a\u0004\b]\u0010\\R\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010Z\u001a\u0004\b^\u0010\\R\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010Z\u001a\u0004\b_\u0010\\R\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010Z\u001a\u0004\b`\u0010\\R\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010Z\u001a\u0004\ba\u0010\\R\u001d\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010Z\u001a\u0004\bb\u0010\\R\u001d\u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010Z\u001a\u0004\bc\u0010\\R\u001d\u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010Z\u001a\u0004\bd\u0010\\R\u001d\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\be\u0010\\R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010f\u001a\u0004\bg\u0010hR\u001d\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\bi\u0010\\R\u001d\u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\bj\u0010\\R\u001d\u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\bk\u0010\\R\u001d\u0010\u0012\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010Z\u001a\u0004\bl\u0010\\R\u001d\u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010Z\u001a\u0004\bm\u0010\\R\u001d\u0010\u0014\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\bn\u0010\\R\u001d\u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010Z\u001a\u0004\bo\u0010\\R\u001d\u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\bp\u0010\\R\u001d\u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010Z\u001a\u0004\bq\u0010\\R\u001d\u0010\u0018\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010Z\u001a\u0004\br\u0010\\R\u001d\u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\bs\u0010\\R\u001d\u0010\u001a\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\bt\u0010\\R\u001d\u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\bu\u0010\\R\u001d\u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010Z\u001a\u0004\bv\u0010\\R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010Z\u001a\u0004\bw\u0010\\R\u001d\u0010\u001e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010Z\u001a\u0004\bx\u0010\\R\u001d\u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010Z\u001a\u0004\by\u0010\\R\u001d\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b \u0010Z\u001a\u0004\bz\u0010\\R\u001d\u0010!\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b{\u0010\\R\u001d\u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010Z\u001a\u0004\b|\u0010\\R\u001d\u0010#\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010Z\u001a\u0004\b}\u0010\\R\u001d\u0010$\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010Z\u001a\u0004\b~\u0010\\R\u001d\u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010Z\u001a\u0004\b\u007f\u0010\\R\u001e\u0010&\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b&\u0010Z\u001a\u0005\b\u0080\u0001\u0010\\R\u001e\u0010'\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b'\u0010Z\u001a\u0005\b\u0081\u0001\u0010\\R\u001e\u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b(\u0010Z\u001a\u0005\b\u0082\u0001\u0010\\R\u001e\u0010)\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b)\u0010Z\u001a\u0005\b\u0083\u0001\u0010\\R\u001e\u0010*\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b*\u0010Z\u001a\u0005\b\u0084\u0001\u0010\\R\u001e\u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b+\u0010Z\u001a\u0005\b\u0085\u0001\u0010\\R\u001e\u0010,\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b,\u0010Z\u001a\u0005\b\u0086\u0001\u0010\\R\u001e\u0010-\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b-\u0010Z\u001a\u0005\b\u0087\u0001\u0010\\R\u001e\u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\r\n\u0004\b.\u0010Z\u001a\u0005\b\u0088\u0001\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0089\u0001"}, m3636d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-ejIjP34", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/TextFieldColors;", "copy", "Lkotlin/Function0;", "block", "takeOrElse$material3_release", "(Landroidx/compose/foundation/text/selection/TextSelectionColors;Lkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "takeOrElse", "", "enabled", "isError", "focused", "leadingIconColor-XeAY9LY$material3_release", "(ZZZ)J", "leadingIconColor", "trailingIconColor-XeAY9LY$material3_release", "trailingIconColor", "indicatorColor-XeAY9LY$material3_release", "indicatorColor", "containerColor-XeAY9LY$material3_release", "containerColor", "placeholderColor-XeAY9LY$material3_release", "placeholderColor", "labelColor-XeAY9LY$material3_release", "labelColor", "textColor-XeAY9LY$material3_release", "textColor", "supportingTextColor-XeAY9LY$material3_release", "supportingTextColor", "prefixColor-XeAY9LY$material3_release", "prefixColor", "suffixColor-XeAY9LY$material3_release", "suffixColor", "cursorColor-vNxB06k$material3_release", "(Z)J", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getFocusedTextColor-0d7_KjU", "()J", "getUnfocusedTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getErrorTextColor-0d7_KjU", "getFocusedContainerColor-0d7_KjU", "getUnfocusedContainerColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getCursorColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getTextSelectionColors", "()Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getErrorLeadingIconColor-0d7_KjU", "getFocusedTrailingIconColor-0d7_KjU", "getUnfocusedTrailingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getErrorTrailingIconColor-0d7_KjU", "getFocusedLabelColor-0d7_KjU", "getUnfocusedLabelColor-0d7_KjU", "getDisabledLabelColor-0d7_KjU", "getErrorLabelColor-0d7_KjU", "getFocusedPlaceholderColor-0d7_KjU", "getUnfocusedPlaceholderColor-0d7_KjU", "getDisabledPlaceholderColor-0d7_KjU", "getErrorPlaceholderColor-0d7_KjU", "getFocusedSupportingTextColor-0d7_KjU", "getUnfocusedSupportingTextColor-0d7_KjU", "getDisabledSupportingTextColor-0d7_KjU", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "getUnfocusedPrefixColor-0d7_KjU", "getDisabledPrefixColor-0d7_KjU", "getErrorPrefixColor-0d7_KjU", "getFocusedSuffixColor-0d7_KjU", "getUnfocusedSuffixColor-0d7_KjU", "getDisabledSuffixColor-0d7_KjU", "getErrorSuffixColor-0d7_KjU", "material3_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TextFieldColors {
    private final long cursorColor;
    private final long disabledContainerColor;
    private final long disabledIndicatorColor;
    private final long disabledLabelColor;
    private final long disabledLeadingIconColor;
    private final long disabledPlaceholderColor;
    private final long disabledPrefixColor;
    private final long disabledSuffixColor;
    private final long disabledSupportingTextColor;
    private final long disabledTextColor;
    private final long disabledTrailingIconColor;
    private final long errorContainerColor;
    private final long errorCursorColor;
    private final long errorIndicatorColor;
    private final long errorLabelColor;
    private final long errorLeadingIconColor;
    private final long errorPlaceholderColor;
    private final long errorPrefixColor;
    private final long errorSuffixColor;
    private final long errorSupportingTextColor;
    private final long errorTextColor;
    private final long errorTrailingIconColor;
    private final long focusedContainerColor;
    private final long focusedIndicatorColor;
    private final long focusedLabelColor;
    private final long focusedLeadingIconColor;
    private final long focusedPlaceholderColor;
    private final long focusedPrefixColor;
    private final long focusedSuffixColor;
    private final long focusedSupportingTextColor;
    private final long focusedTextColor;
    private final long focusedTrailingIconColor;
    private final SelectionColors textSelectionColors;
    private final long unfocusedContainerColor;
    private final long unfocusedIndicatorColor;
    private final long unfocusedLabelColor;
    private final long unfocusedLeadingIconColor;
    private final long unfocusedPlaceholderColor;
    private final long unfocusedPrefixColor;
    private final long unfocusedSuffixColor;
    private final long unfocusedSupportingTextColor;
    private final long unfocusedTextColor;
    private final long unfocusedTrailingIconColor;

    public /* synthetic */ TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, selectionColors, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42);
    }

    private TextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, SelectionColors selectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42) {
        this.focusedTextColor = j;
        this.unfocusedTextColor = j2;
        this.disabledTextColor = j3;
        this.errorTextColor = j4;
        this.focusedContainerColor = j5;
        this.unfocusedContainerColor = j6;
        this.disabledContainerColor = j7;
        this.errorContainerColor = j8;
        this.cursorColor = j9;
        this.errorCursorColor = j10;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j11;
        this.unfocusedIndicatorColor = j12;
        this.disabledIndicatorColor = j13;
        this.errorIndicatorColor = j14;
        this.focusedLeadingIconColor = j15;
        this.unfocusedLeadingIconColor = j16;
        this.disabledLeadingIconColor = j17;
        this.errorLeadingIconColor = j18;
        this.focusedTrailingIconColor = j19;
        this.unfocusedTrailingIconColor = j20;
        this.disabledTrailingIconColor = j21;
        this.errorTrailingIconColor = j22;
        this.focusedLabelColor = j23;
        this.unfocusedLabelColor = j24;
        this.disabledLabelColor = j25;
        this.errorLabelColor = j26;
        this.focusedPlaceholderColor = j27;
        this.unfocusedPlaceholderColor = j28;
        this.disabledPlaceholderColor = j29;
        this.errorPlaceholderColor = j30;
        this.focusedSupportingTextColor = j31;
        this.unfocusedSupportingTextColor = j32;
        this.disabledSupportingTextColor = j33;
        this.errorSupportingTextColor = j34;
        this.focusedPrefixColor = j35;
        this.unfocusedPrefixColor = j36;
        this.disabledPrefixColor = j37;
        this.errorPrefixColor = j38;
        this.focusedSuffixColor = j39;
        this.unfocusedSuffixColor = j40;
        this.disabledSuffixColor = j41;
        this.errorSuffixColor = j42;
    }

    public final SelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    /* renamed from: copy-ejIjP34, reason: not valid java name */
    public final TextFieldColors m6000copyejIjP34(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, SelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new TextFieldColors(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, takeOrElse$material3_release(textSelectionColors, new Function0<SelectionColors>() { // from class: androidx.compose.material3.TextFieldColors$copy$11
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SelectionColors invoke() {
                return this.this$0.getTextSelectionColors();
            }
        }), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    public final SelectionColors takeOrElse$material3_release(SelectionColors selectionColors, Function0<SelectionColors> function0) {
        return selectionColors == null ? function0.invoke() : selectionColors;
    }

    /* renamed from: leadingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6004leadingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLeadingIconColor;
        }
        if (isError) {
            return this.errorLeadingIconColor;
        }
        if (focused) {
            return this.focusedLeadingIconColor;
        }
        return this.unfocusedLeadingIconColor;
    }

    /* renamed from: trailingIconColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6010trailingIconColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTrailingIconColor;
        }
        if (isError) {
            return this.errorTrailingIconColor;
        }
        if (focused) {
            return this.focusedTrailingIconColor;
        }
        return this.unfocusedTrailingIconColor;
    }

    /* renamed from: indicatorColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6002indicatorColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledIndicatorColor;
        }
        if (isError) {
            return this.errorIndicatorColor;
        }
        if (focused) {
            return this.focusedIndicatorColor;
        }
        return this.unfocusedIndicatorColor;
    }

    /* renamed from: containerColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m5999containerColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledContainerColor;
        }
        if (isError) {
            return this.errorContainerColor;
        }
        if (focused) {
            return this.focusedContainerColor;
        }
        return this.unfocusedContainerColor;
    }

    /* renamed from: placeholderColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6005placeholderColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPlaceholderColor;
        }
        if (isError) {
            return this.errorPlaceholderColor;
        }
        if (focused) {
            return this.focusedPlaceholderColor;
        }
        return this.unfocusedPlaceholderColor;
    }

    /* renamed from: labelColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6003labelColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLabelColor;
        }
        if (isError) {
            return this.errorLabelColor;
        }
        if (focused) {
            return this.focusedLabelColor;
        }
        return this.unfocusedLabelColor;
    }

    /* renamed from: textColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6009textColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTextColor;
        }
        if (isError) {
            return this.errorTextColor;
        }
        if (focused) {
            return this.focusedTextColor;
        }
        return this.unfocusedTextColor;
    }

    /* renamed from: supportingTextColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6008supportingTextColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSupportingTextColor;
        }
        if (isError) {
            return this.errorSupportingTextColor;
        }
        if (focused) {
            return this.focusedSupportingTextColor;
        }
        return this.unfocusedSupportingTextColor;
    }

    /* renamed from: prefixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6006prefixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPrefixColor;
        }
        if (isError) {
            return this.errorPrefixColor;
        }
        if (focused) {
            return this.focusedPrefixColor;
        }
        return this.unfocusedPrefixColor;
    }

    /* renamed from: suffixColor-XeAY9LY$material3_release, reason: not valid java name */
    public final long m6007suffixColorXeAY9LY$material3_release(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSuffixColor;
        }
        if (isError) {
            return this.errorSuffixColor;
        }
        if (focused) {
            return this.focusedSuffixColor;
        }
        return this.unfocusedSuffixColor;
    }

    /* renamed from: cursorColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m6001cursorColorvNxB06k$material3_release(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.m6707equalsimpl0(this.focusedTextColor, textFieldColors.focusedTextColor) && Color.m6707equalsimpl0(this.unfocusedTextColor, textFieldColors.unfocusedTextColor) && Color.m6707equalsimpl0(this.disabledTextColor, textFieldColors.disabledTextColor) && Color.m6707equalsimpl0(this.errorTextColor, textFieldColors.errorTextColor) && Color.m6707equalsimpl0(this.focusedContainerColor, textFieldColors.focusedContainerColor) && Color.m6707equalsimpl0(this.unfocusedContainerColor, textFieldColors.unfocusedContainerColor) && Color.m6707equalsimpl0(this.disabledContainerColor, textFieldColors.disabledContainerColor) && Color.m6707equalsimpl0(this.errorContainerColor, textFieldColors.errorContainerColor) && Color.m6707equalsimpl0(this.cursorColor, textFieldColors.cursorColor) && Color.m6707equalsimpl0(this.errorCursorColor, textFieldColors.errorCursorColor) && Intrinsics.areEqual(this.textSelectionColors, textFieldColors.textSelectionColors) && Color.m6707equalsimpl0(this.focusedIndicatorColor, textFieldColors.focusedIndicatorColor) && Color.m6707equalsimpl0(this.unfocusedIndicatorColor, textFieldColors.unfocusedIndicatorColor) && Color.m6707equalsimpl0(this.disabledIndicatorColor, textFieldColors.disabledIndicatorColor) && Color.m6707equalsimpl0(this.errorIndicatorColor, textFieldColors.errorIndicatorColor) && Color.m6707equalsimpl0(this.focusedLeadingIconColor, textFieldColors.focusedLeadingIconColor) && Color.m6707equalsimpl0(this.unfocusedLeadingIconColor, textFieldColors.unfocusedLeadingIconColor) && Color.m6707equalsimpl0(this.disabledLeadingIconColor, textFieldColors.disabledLeadingIconColor) && Color.m6707equalsimpl0(this.errorLeadingIconColor, textFieldColors.errorLeadingIconColor) && Color.m6707equalsimpl0(this.focusedTrailingIconColor, textFieldColors.focusedTrailingIconColor) && Color.m6707equalsimpl0(this.unfocusedTrailingIconColor, textFieldColors.unfocusedTrailingIconColor) && Color.m6707equalsimpl0(this.disabledTrailingIconColor, textFieldColors.disabledTrailingIconColor) && Color.m6707equalsimpl0(this.errorTrailingIconColor, textFieldColors.errorTrailingIconColor) && Color.m6707equalsimpl0(this.focusedLabelColor, textFieldColors.focusedLabelColor) && Color.m6707equalsimpl0(this.unfocusedLabelColor, textFieldColors.unfocusedLabelColor) && Color.m6707equalsimpl0(this.disabledLabelColor, textFieldColors.disabledLabelColor) && Color.m6707equalsimpl0(this.errorLabelColor, textFieldColors.errorLabelColor) && Color.m6707equalsimpl0(this.focusedPlaceholderColor, textFieldColors.focusedPlaceholderColor) && Color.m6707equalsimpl0(this.unfocusedPlaceholderColor, textFieldColors.unfocusedPlaceholderColor) && Color.m6707equalsimpl0(this.disabledPlaceholderColor, textFieldColors.disabledPlaceholderColor) && Color.m6707equalsimpl0(this.errorPlaceholderColor, textFieldColors.errorPlaceholderColor) && Color.m6707equalsimpl0(this.focusedSupportingTextColor, textFieldColors.focusedSupportingTextColor) && Color.m6707equalsimpl0(this.unfocusedSupportingTextColor, textFieldColors.unfocusedSupportingTextColor) && Color.m6707equalsimpl0(this.disabledSupportingTextColor, textFieldColors.disabledSupportingTextColor) && Color.m6707equalsimpl0(this.errorSupportingTextColor, textFieldColors.errorSupportingTextColor) && Color.m6707equalsimpl0(this.focusedPrefixColor, textFieldColors.focusedPrefixColor) && Color.m6707equalsimpl0(this.unfocusedPrefixColor, textFieldColors.unfocusedPrefixColor) && Color.m6707equalsimpl0(this.disabledPrefixColor, textFieldColors.disabledPrefixColor) && Color.m6707equalsimpl0(this.errorPrefixColor, textFieldColors.errorPrefixColor) && Color.m6707equalsimpl0(this.focusedSuffixColor, textFieldColors.focusedSuffixColor) && Color.m6707equalsimpl0(this.unfocusedSuffixColor, textFieldColors.unfocusedSuffixColor) && Color.m6707equalsimpl0(this.disabledSuffixColor, textFieldColors.disabledSuffixColor) && Color.m6707equalsimpl0(this.errorSuffixColor, textFieldColors.errorSuffixColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m6713hashCodeimpl(this.focusedTextColor) * 31) + Color.m6713hashCodeimpl(this.unfocusedTextColor)) * 31) + Color.m6713hashCodeimpl(this.disabledTextColor)) * 31) + Color.m6713hashCodeimpl(this.errorTextColor)) * 31) + Color.m6713hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m6713hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m6713hashCodeimpl(this.errorContainerColor)) * 31) + Color.m6713hashCodeimpl(this.cursorColor)) * 31) + Color.m6713hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m6713hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m6713hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m6713hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m6713hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m6713hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m6713hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m6713hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m6713hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m6713hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m6713hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m6713hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m6713hashCodeimpl(this.errorLabelColor)) * 31) + Color.m6713hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m6713hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m6713hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m6713hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m6713hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m6713hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m6713hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m6713hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m6713hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m6713hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m6713hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m6713hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m6713hashCodeimpl(this.errorSuffixColor);
    }
}
