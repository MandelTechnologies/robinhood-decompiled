package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.text.MultiParagraph;
import androidx.compose.p011ui.text.TextGranularity;
import androidx.compose.p011ui.text.TextInclusionStrategy;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.EditCommand;
import androidx.compose.p011ui.text.input.EditingBuffer;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HandwritingGesture.android.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\t\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a.\u0010\u001a\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a6\u0010\u001f\u001a\u00020\u0000*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010!\u001a\u00020\u0000*\u00020\u00012\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b!\u0010\"\u001a&\u0010(\u001a\u00020\u0006*\u00020\u00112\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010*\u001a\u00020\u0007*\u00020)2\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+\u001a:\u0010\u001a\u001a\u00020\u0000*\u0004\u0018\u00010,2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a2\u0010(\u001a\u00020\u0006*\u00020,2\u0006\u0010#\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a<\u00107\u001a\u00020\u0000*\u0004\u0018\u00010)2\u0006\u00103\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a(\u0010;\u001a\u00020\u0006*\u00020,2\u0006\u00108\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a#\u0010?\u001a\u00020=2\u0012\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020=0<\"\u00020=H\u0002¢\u0006\u0004\b?\u0010@\u001a\"\u0010E\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0000H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, m3636d2 = {"Landroidx/compose/ui/text/TextRange;", "", "text", "adjustHandwritingDeleteGestureRange-72CqOWE", "(JLjava/lang/CharSequence;)J", "adjustHandwritingDeleteGestureRange", "", "", "isNewline", "(I)Z", "isWhitespace", "isWhitespaceExceptNewline", "isPunctuation", "Landroid/graphics/PointF;", "Landroidx/compose/ui/geometry/Offset;", "toOffset", "(Landroid/graphics/PointF;)J", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "Landroidx/compose/ui/geometry/Rect;", "rectInScreen", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "getRangeForScreenRect-OH9lIzo", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRect", "startRectInScreen", "endRectInScreen", "getRangeForScreenRects-O048IG0", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForScreenRects", "offset", "rangeOfWhitespaces", "(Ljava/lang/CharSequence;I)J", "pointInScreen", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getOffsetForHandwritingGesture-d-4ec7I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getOffsetForHandwritingGesture", "Landroidx/compose/ui/text/TextLayoutResult;", "isBiDiBoundary", "(Landroidx/compose/ui/text/TextLayoutResult;I)Z", "Landroidx/compose/ui/text/MultiParagraph;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "getRangeForScreenRect-O048IG0", "(Landroidx/compose/ui/text/MultiParagraph;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/layout/LayoutCoordinates;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getOffsetForHandwritingGesture-ubNVwUQ", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)I", "startPointInScreen", "endPointerInScreen", "getRangeForRemoveSpaceGesture-5iVPX68", "(Landroidx/compose/ui/text/TextLayoutResult;JJLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/platform/ViewConfiguration;)J", "getRangeForRemoveSpaceGesture", "localPoint", "getLineForHandwritingGesture-d-4ec7I", "(Landroidx/compose/ui/text/MultiParagraph;JLandroidx/compose/ui/platform/ViewConfiguration;)I", "getLineForHandwritingGesture", "", "Landroidx/compose/ui/text/input/EditCommand;", "editCommands", "compoundEditCommand", "([Landroidx/compose/ui/text/input/EditCommand;)Landroidx/compose/ui/text/input/EditCommand;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "b", "enclosure-pWDy79M", "(JJ)J", "enclosure", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class HandwritingGesture_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: adjustHandwritingDeleteGestureRange-72CqOWE, reason: not valid java name */
    public static final long m5463adjustHandwritingDeleteGestureRange72CqOWE(long j, CharSequence charSequence) {
        int iM7646getStartimpl = TextRange.m7646getStartimpl(j);
        int iM7641getEndimpl = TextRange.m7641getEndimpl(j);
        int iCodePointBefore = iM7646getStartimpl > 0 ? Character.codePointBefore(charSequence, iM7646getStartimpl) : 10;
        int iCodePointAt = iM7641getEndimpl < charSequence.length() ? Character.codePointAt(charSequence, iM7641getEndimpl) : 10;
        if (isWhitespaceExceptNewline(iCodePointBefore) && (isWhitespace(iCodePointAt) || isPunctuation(iCodePointAt))) {
            do {
                iM7646getStartimpl -= Character.charCount(iCodePointBefore);
                if (iM7646getStartimpl == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iM7646getStartimpl);
            } while (isWhitespaceExceptNewline(iCodePointBefore));
            return TextRange2.TextRange(iM7646getStartimpl, iM7641getEndimpl);
        }
        if (!isWhitespaceExceptNewline(iCodePointAt)) {
            return j;
        }
        if (!isWhitespace(iCodePointBefore) && !isPunctuation(iCodePointBefore)) {
            return j;
        }
        do {
            iM7641getEndimpl += Character.charCount(iCodePointAt);
            if (iM7641getEndimpl == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iM7641getEndimpl);
        } while (isWhitespaceExceptNewline(iCodePointAt));
        return TextRange2.TextRange(iM7646getStartimpl, iM7641getEndimpl);
    }

    private static final boolean isNewline(int i) {
        int type2 = Character.getType(i);
        return type2 == 14 || type2 == 13 || i == 10;
    }

    private static final boolean isWhitespace(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    private static final boolean isWhitespaceExceptNewline(int i) {
        return isWhitespace(i) && !isNewline(i);
    }

    private static final boolean isPunctuation(int i) {
        int type2 = Character.getType(i);
        return type2 == 23 || type2 == 20 || type2 == 22 || type2 == 30 || type2 == 29 || type2 == 24 || type2 == 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long toOffset(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return Offset.m6535constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRect-OH9lIzo, reason: not valid java name */
    public static final long m5470getRangeForScreenRectOH9lIzo(LegacyTextFieldState legacyTextFieldState, Rect rect, int i, TextInclusionStrategy textInclusionStrategy) {
        TextLayoutResult value;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        return m5469getRangeForScreenRectO048IG0((layoutResult == null || (value = layoutResult.getValue()) == null) ? null : value.getMultiParagraph(), rect, legacyTextFieldState.getLayoutCoordinates(), i, textInclusionStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForScreenRects-O048IG0, reason: not valid java name */
    public static final long m5471getRangeForScreenRectsO048IG0(LegacyTextFieldState legacyTextFieldState, Rect rect, Rect rect2, int i, TextInclusionStrategy textInclusionStrategy) {
        long jM5470getRangeForScreenRectOH9lIzo = m5470getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect, i, textInclusionStrategy);
        if (TextRange.m7640getCollapsedimpl(jM5470getRangeForScreenRectOH9lIzo)) {
            return TextRange.INSTANCE.m7651getZerod9O1mEE();
        }
        long jM5470getRangeForScreenRectOH9lIzo2 = m5470getRangeForScreenRectOH9lIzo(legacyTextFieldState, rect2, i, textInclusionStrategy);
        return TextRange.m7640getCollapsedimpl(jM5470getRangeForScreenRectOH9lIzo2) ? TextRange.INSTANCE.m7651getZerod9O1mEE() : m5464enclosurepWDy79M(jM5470getRangeForScreenRectOH9lIzo, jM5470getRangeForScreenRectOH9lIzo2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rangeOfWhitespaces(CharSequence charSequence, int i) {
        int iCharCount = i;
        while (iCharCount > 0) {
            int iCodePointBefore = CodepointHelpers_jvmKt.codePointBefore(charSequence, iCharCount);
            if (!isWhitespace(iCodePointBefore)) {
                break;
            }
            iCharCount -= Character.charCount(iCodePointBefore);
        }
        while (i < charSequence.length()) {
            int iCodePointAt = CodepointHelpers_jvmKt.codePointAt(charSequence, i);
            if (!isWhitespace(iCodePointAt)) {
                break;
            }
            i += CodepointHelpers_jvmKt.charCount(iCodePointAt);
        }
        return TextRange2.TextRange(iCharCount, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getOffsetForHandwritingGesture-d-4ec7I, reason: not valid java name */
    public static final int m5466getOffsetForHandwritingGestured4ec7I(LegacyTextFieldState legacyTextFieldState, long j, ViewConfiguration viewConfiguration) {
        TextLayoutResult value;
        MultiParagraph multiParagraph;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (layoutResult == null || (value = layoutResult.getValue()) == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return -1;
        }
        return m5467getOffsetForHandwritingGestureubNVwUQ(multiParagraph, j, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBiDiBoundary(TextLayoutResult textLayoutResult, int i) {
        int lineForOffset = textLayoutResult.getLineForOffset(i);
        return (i == textLayoutResult.getLineStart(lineForOffset) || i == TextLayoutResult.getLineEnd$default(textLayoutResult, lineForOffset, false, 2, null)) ? textLayoutResult.getParagraphDirection(i) != textLayoutResult.getBidiRunDirection(i) : textLayoutResult.getBidiRunDirection(i) != textLayoutResult.getBidiRunDirection(i - 1);
    }

    /* renamed from: getRangeForScreenRect-O048IG0, reason: not valid java name */
    private static final long m5469getRangeForScreenRectO048IG0(MultiParagraph multiParagraph, Rect rect, LayoutCoordinates layoutCoordinates, int i, TextInclusionStrategy textInclusionStrategy) {
        if (multiParagraph == null || layoutCoordinates == null) {
            return TextRange.INSTANCE.m7651getZerod9O1mEE();
        }
        return multiParagraph.m7547getRangeForRect86BmAI(rect.m6562translatek4lQ0M(layoutCoordinates.mo7247screenToLocalMKHz9U(Offset.INSTANCE.m6553getZeroF1C5BW0())), i, textInclusionStrategy);
    }

    /* renamed from: getOffsetForHandwritingGesture-ubNVwUQ, reason: not valid java name */
    private static final int m5467getOffsetForHandwritingGestureubNVwUQ(MultiParagraph multiParagraph, long j, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        long jMo7247screenToLocalMKHz9U;
        int iM5465getLineForHandwritingGestured4ec7I;
        if (layoutCoordinates == null || (iM5465getLineForHandwritingGestured4ec7I = m5465getLineForHandwritingGestured4ec7I(multiParagraph, (jMo7247screenToLocalMKHz9U = layoutCoordinates.mo7247screenToLocalMKHz9U(j)), viewConfiguration)) == -1) {
            return -1;
        }
        return multiParagraph.m7546getOffsetForPositionk4lQ0M(Offset.m6537copydBAh8RU$default(jMo7247screenToLocalMKHz9U, 0.0f, (multiParagraph.getLineTop(iM5465getLineForHandwritingGestured4ec7I) + multiParagraph.getLineBottom(iM5465getLineForHandwritingGestured4ec7I)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRangeForRemoveSpaceGesture-5iVPX68, reason: not valid java name */
    public static final long m5468getRangeForRemoveSpaceGesture5iVPX68(TextLayoutResult textLayoutResult, long j, long j2, LayoutCoordinates layoutCoordinates, ViewConfiguration viewConfiguration) {
        if (textLayoutResult == null || layoutCoordinates == null) {
            return TextRange.INSTANCE.m7651getZerod9O1mEE();
        }
        long jMo7247screenToLocalMKHz9U = layoutCoordinates.mo7247screenToLocalMKHz9U(j);
        long jMo7247screenToLocalMKHz9U2 = layoutCoordinates.mo7247screenToLocalMKHz9U(j2);
        int iM5465getLineForHandwritingGestured4ec7I = m5465getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo7247screenToLocalMKHz9U, viewConfiguration);
        int iM5465getLineForHandwritingGestured4ec7I2 = m5465getLineForHandwritingGestured4ec7I(textLayoutResult.getMultiParagraph(), jMo7247screenToLocalMKHz9U2, viewConfiguration);
        if (iM5465getLineForHandwritingGestured4ec7I != -1) {
            if (iM5465getLineForHandwritingGestured4ec7I2 != -1) {
                iM5465getLineForHandwritingGestured4ec7I = Math.min(iM5465getLineForHandwritingGestured4ec7I, iM5465getLineForHandwritingGestured4ec7I2);
            }
            iM5465getLineForHandwritingGestured4ec7I2 = iM5465getLineForHandwritingGestured4ec7I;
        } else if (iM5465getLineForHandwritingGestured4ec7I2 == -1) {
            return TextRange.INSTANCE.m7651getZerod9O1mEE();
        }
        float lineTop = (textLayoutResult.getLineTop(iM5465getLineForHandwritingGestured4ec7I2) + textLayoutResult.getLineBottom(iM5465getLineForHandwritingGestured4ec7I2)) / 2;
        int i = (int) (jMo7247screenToLocalMKHz9U >> 32);
        int i2 = (int) (jMo7247screenToLocalMKHz9U2 >> 32);
        return textLayoutResult.getMultiParagraph().m7547getRangeForRect86BmAI(new Rect(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineTop - 0.1f, Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), lineTop + 0.1f), TextGranularity.INSTANCE.m7614getCharacterDRrd7Zo(), TextInclusionStrategy.INSTANCE.getAnyOverlap());
    }

    /* renamed from: getLineForHandwritingGesture-d-4ec7I, reason: not valid java name */
    private static final int m5465getLineForHandwritingGestured4ec7I(MultiParagraph multiParagraph, long j, ViewConfiguration viewConfiguration) {
        float handwritingGestureLineMargin = viewConfiguration != null ? viewConfiguration.getHandwritingGestureLineMargin() : 0.0f;
        int i = (int) (4294967295L & j);
        int lineForVerticalPosition = multiParagraph.getLineForVerticalPosition(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= multiParagraph.getLineTop(lineForVerticalPosition) - handwritingGestureLineMargin && Float.intBitsToFloat(i) <= multiParagraph.getLineBottom(lineForVerticalPosition) + handwritingGestureLineMargin) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-handwritingGestureLineMargin) && Float.intBitsToFloat(i2) <= multiParagraph.getWidth() + handwritingGestureLineMargin) {
                return lineForVerticalPosition;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditCommand compoundEditCommand(final EditCommand... editCommandArr) {
        return new EditCommand() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.compoundEditCommand.1
            @Override // androidx.compose.p011ui.text.input.EditCommand
            public void applyTo(EditingBuffer buffer) {
                for (EditCommand editCommand : editCommandArr) {
                    editCommand.applyTo(buffer);
                }
            }
        };
    }

    /* renamed from: enclosure-pWDy79M, reason: not valid java name */
    private static final long m5464enclosurepWDy79M(long j, long j2) {
        return TextRange2.TextRange(Math.min(TextRange.m7646getStartimpl(j), TextRange.m7646getStartimpl(j)), Math.max(TextRange.m7641getEndimpl(j2), TextRange.m7641getEndimpl(j2)));
    }
}
