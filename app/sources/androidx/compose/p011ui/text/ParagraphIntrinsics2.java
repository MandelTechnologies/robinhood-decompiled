package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.p011ui.unit.Density;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ParagraphIntrinsics.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"", "text", "Landroidx/compose/ui/text/TextStyle;", ResourceTypes.STYLE, "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "ParagraphIntrinsics", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;)Landroidx/compose/ui/text/ParagraphIntrinsics;", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.ParagraphIntrinsicsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ParagraphIntrinsics2 {
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list2) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }
}
