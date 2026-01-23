package androidx.compose.p011ui.node;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MyersDiff.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aZ\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aZ\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001a?\u0010&\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010*\u001a\u00020\n*\u00020\u00162\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0002¢\u0006\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m3636d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "cb", "Landroidx/compose/ui/node/IntStack;", "calculateDiff", "(IILandroidx/compose/ui/node/DiffCallback;)Landroidx/compose/ui/node/IntStack;", "diagonals", "callback", "", "applyDiff", "(Landroidx/compose/ui/node/IntStack;Landroidx/compose/ui/node/DiffCallback;)V", "executeDiff", "(IILandroidx/compose/ui/node/DiffCallback;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/CenteredArray;", "forward", "backward", "", "snake", "", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "midPoint", "d", "forward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "backward-4l5_RBY", "startX", "startY", "endX", "endY", "reverse", WebsocketGatewayConstants.DATA_KEY, "fillSnake", "(IIIIZ[I)V", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "j", "swap", "([III)V", "ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.MyersDiffKt, reason: use source file name */
/* loaded from: classes.dex */
public final class MyersDiff4 {
    private static final MyersDiff3 calculateDiff(int i, int i2, MyersDiff2 myersDiff2) {
        char c = 1;
        int i3 = ((i + i2) + 1) / 2;
        MyersDiff3 myersDiff3 = new MyersDiff3(i3 * 3);
        MyersDiff3 myersDiff32 = new MyersDiff3(i3 * 4);
        myersDiff32.pushRange(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] iArrM7282constructorimpl = MyersDiff.m7282constructorimpl(new int[i4]);
        int[] iArrM7282constructorimpl2 = MyersDiff.m7282constructorimpl(new int[i4]);
        int[] iArrM7394constructorimpl = MyersDiff5.m7394constructorimpl(new int[5]);
        while (myersDiff32.isNotEmpty()) {
            int iPop = myersDiff32.pop();
            int iPop2 = myersDiff32.pop();
            int iPop3 = myersDiff32.pop();
            int iPop4 = myersDiff32.pop();
            int[] iArr = iArrM7394constructorimpl;
            if (m7348midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, myersDiff2, iArrM7282constructorimpl, iArrM7282constructorimpl2, iArrM7394constructorimpl)) {
                char c2 = c;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c]) > 0) {
                    MyersDiff5.m7393addDiagonalToStackimpl(iArr, myersDiff3);
                }
                myersDiff32.pushRange(iPop4, iArr[0], iPop2, iArr[c2]);
                myersDiff32.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM7394constructorimpl = iArr;
                c = c2;
            } else {
                iArrM7394constructorimpl = iArr;
            }
        }
        myersDiff3.sortDiagonals();
        myersDiff3.pushDiagonal(i, i2, 0);
        return myersDiff3;
    }

    private static final void applyDiff(MyersDiff3 myersDiff3, MyersDiff2 myersDiff2) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < myersDiff3.getLastIndex()) {
            int i4 = i + 2;
            int i5 = myersDiff3.get(i) - myersDiff3.get(i4);
            int i6 = myersDiff3.get(i + 1) - myersDiff3.get(i4);
            int i7 = myersDiff3.get(i4);
            i += 3;
            while (i2 < i5) {
                myersDiff2.remove(i3, i2);
                i2++;
            }
            while (i3 < i6) {
                myersDiff2.insert(i3);
                i3++;
            }
            while (true) {
                int i8 = i7 - 1;
                if (i7 > 0) {
                    myersDiff2.same(i2, i3);
                    i2++;
                    i3++;
                    i7 = i8;
                }
            }
        }
    }

    public static final void executeDiff(int i, int i2, MyersDiff2 myersDiff2) {
        applyDiff(calculateDiff(i, i2, myersDiff2), myersDiff2);
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m7348midPointq5eDKzI(int i, int i2, int i3, int i4, MyersDiff2 myersDiff2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            int[] iArr4 = iArr;
            MyersDiff.m7285setimpl(iArr4, 1, i);
            int[] iArr5 = iArr2;
            MyersDiff.m7285setimpl(iArr5, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                if (m7347forward4l5_RBY(i, i2, i3, i4, myersDiff2, iArr4, iArr5, i8, iArr3) || m7346backward4l5_RBY(i, i2, i3, i4, myersDiff2, iArr, iArr2, i8, iArr3)) {
                    return true;
                }
                i8++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m7347forward4l5_RBY(int i, int i2, int i3, int i4, MyersDiff2 myersDiff2, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM7283getimpl;
        int i6;
        ?? r16;
        int i7 = (i2 - i) - (i4 - i3);
        int i8 = 1;
        boolean z = (Math.abs(i7) & 1) == 1;
        int i9 = -i5;
        int i10 = i9;
        while (i10 <= i5) {
            if (i10 == i9 || (i10 != i5 && MyersDiff.m7283getimpl(iArr, i10 + 1) > MyersDiff.m7283getimpl(iArr, i10 - 1))) {
                iM7283getimpl = MyersDiff.m7283getimpl(iArr, i10 + 1);
                i6 = iM7283getimpl;
            } else {
                iM7283getimpl = MyersDiff.m7283getimpl(iArr, i10 - 1);
                i6 = iM7283getimpl + 1;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = i11 - ((i5 != 0 ? i8 : 0) & (i6 == iM7283getimpl ? i8 : 0));
            while (i6 < i2 && i11 < i4) {
                if (!myersDiff2.areItemsTheSame(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            MyersDiff.m7285setimpl(iArr, i10, i6);
            if (z) {
                int i13 = i7 - i10;
                r16 = i8;
                r16 = r16;
                if (i13 >= i9 + 1) {
                    r16 = r16;
                    if (i13 <= i5 - 1) {
                        if (MyersDiff.m7283getimpl(iArr2, i13) <= i6) {
                            fillSnake(iM7283getimpl, i12, i6, i11, false, iArr3);
                            return r16;
                        }
                    }
                }
                i10 += 2;
                i8 = r16;
            } else {
                r16 = i8;
            }
            i10 += 2;
            i8 = r16;
        }
        return false;
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m7346backward4l5_RBY(int i, int i2, int i3, int i4, MyersDiff2 myersDiff2, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        int iM7283getimpl;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        boolean z = (i8 & 1) == 0;
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 == i9 || (i10 != i5 && MyersDiff.m7283getimpl(iArr2, i10 + 1) < MyersDiff.m7283getimpl(iArr2, i10 - 1))) {
                iM7283getimpl = MyersDiff.m7283getimpl(iArr2, i10 + 1);
                i6 = iM7283getimpl;
            } else {
                iM7283getimpl = MyersDiff.m7283getimpl(iArr2, i10 - 1);
                i6 = iM7283getimpl - 1;
            }
            int i11 = i4 - ((i2 - i6) - i10);
            int i12 = ((i5 != 0 ? 1 : 0) & (i6 == iM7283getimpl ? 1 : 0)) + i11;
            while (i6 > i && i11 > i3) {
                if (!myersDiff2.areItemsTheSame(i6 - 1, i11 - 1)) {
                    break;
                }
                i6--;
                i11--;
            }
            MyersDiff.m7285setimpl(iArr2, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 && i7 <= i5) {
                if (MyersDiff.m7283getimpl(iArr, i7) >= i6) {
                    fillSnake(i6, i11, iM7283getimpl, i12, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
