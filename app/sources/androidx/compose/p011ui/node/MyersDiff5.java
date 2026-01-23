package androidx.compose.p011ui.node;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MyersDiff.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, m3636d2 = {"Landroidx/compose/ui/node/Snake;", "", "", WebsocketGatewayConstants.DATA_KEY, "constructor-impl", "([I)[I", "Landroidx/compose/ui/node/IntStack;", "diagonals", "", "addDiagonalToStack-impl", "([ILandroidx/compose/ui/node/IntStack;)V", "addDiagonalToStack", "", "getHasAdditionOrRemoval-impl", "([I)Z", "hasAdditionOrRemoval", "isAddition-impl", "isAddition", "ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.Snake, reason: use source file name */
/* loaded from: classes.dex */
final class MyersDiff5 {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m7394constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m7393addDiagonalToStackimpl(int[] iArr, MyersDiff3 myersDiff3) {
        int iMin;
        int i = iArr[0];
        int i2 = iArr[1];
        if (!m7395getHasAdditionOrRemovalimpl(iArr)) {
            iMin = iArr[2] - iArr[0];
        } else {
            iMin = Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
            i += ((iArr[4] != 0 ? 1 : 0) | (m7396isAdditionimpl(iArr) ? 1 : 0)) ^ 1;
            i2 += ((!m7396isAdditionimpl(iArr) ? 1 : 0) | (iArr[4] != 0 ? 1 : 0)) ^ 1;
        }
        myersDiff3.pushDiagonal(i, i2, iMin);
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m7395getHasAdditionOrRemovalimpl(int[] iArr) {
        return iArr[3] - iArr[1] != iArr[2] - iArr[0];
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m7396isAdditionimpl(int[] iArr) {
        return iArr[3] - iArr[1] > iArr[2] - iArr[0];
    }
}
