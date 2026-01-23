package androidx.compose.foundation.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.MultiParagraph;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.TextLayoutInput;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextLayoutHelper.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ar\u0010\u0019\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m3636d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.STYLE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "", "maxLines", "", "softWrap", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/Constraints;", "constraints", "canReuse-7_7YC6M", "(Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;J)Z", "canReuse", "offset", "", "getLineHeight", "(Landroidx/compose/ui/text/TextLayoutResult;I)F", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.foundation.text.TextLayoutHelperKt, reason: use source file name */
/* loaded from: classes.dex */
public final class TextLayoutHelper {
    /* renamed from: canReuse-7_7YC6M, reason: not valid java name */
    public static final boolean m5437canReuse7_7YC6M(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z, int i2, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
        if (textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || !Intrinsics.areEqual(layoutInput.getText(), annotatedString) || !layoutInput.getStyle().hasSameLayoutAffectingAttributes(textStyle) || !Intrinsics.areEqual(layoutInput.getPlaceholders(), list) || layoutInput.getMaxLines() != i || layoutInput.getSoftWrap() != z || !TextOverflow.m7955equalsimpl0(layoutInput.getOverflow(), i2) || !Intrinsics.areEqual(layoutInput.getDensity(), density) || layoutInput.getLayoutDirection() != layoutDirection || !Intrinsics.areEqual(layoutInput.getFontFamilyResolver(), resolver) || Constraints.m7977getMinWidthimpl(j) != Constraints.m7977getMinWidthimpl(layoutInput.getConstraints())) {
            return false;
        }
        if (z || TextOverflow.m7955equalsimpl0(i2, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8())) {
            return Constraints.m7975getMaxWidthimpl(j) == Constraints.m7975getMaxWidthimpl(layoutInput.getConstraints()) && Constraints.m7974getMaxHeightimpl(j) == Constraints.m7974getMaxHeightimpl(layoutInput.getConstraints());
        }
        return true;
    }

    public static final float getLineHeight(TextLayoutResult textLayoutResult, int i) {
        if (i < 0 || textLayoutResult.getLayoutInput().getText().length() == 0) {
            return 0.0f;
        }
        int iMin = Math.min(textLayoutResult.getMultiParagraph().getLineForOffset(i), Math.min(textLayoutResult.getMultiParagraph().getMaxLines() - 1, textLayoutResult.getMultiParagraph().getLineCount() - 1));
        if (i > MultiParagraph.getLineEnd$default(textLayoutResult.getMultiParagraph(), iMin, false, 2, null)) {
            return 0.0f;
        }
        return textLayoutResult.getMultiParagraph().getLineHeight(iMin);
    }
}
