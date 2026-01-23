package androidx.compose.p011ui.text.platform;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.EmojiSupportMatch;
import androidx.compose.p011ui.text.ParagraphIntrinsics;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlatformParagraphStyle;
import androidx.compose.p011ui.text.PlatformTextStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.TextDirection;
import androidx.compose.p011ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00022\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a&\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m3636d2 = {"hasEmojiCompat", "", "Landroidx/compose/ui/text/TextStyle;", "getHasEmojiCompat", "(Landroidx/compose/ui/text/TextStyle;)Z", "ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", ResourceTypes.STYLE, "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-HklW4sA", "(ILandroidx/compose/ui/text/intl/LocaleList;)I", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m7801resolveTextDirectionHeuristicsHklW4sA(int i, LocaleList localeList) {
        Locale platformLocale;
        TextDirection.Companion companion = TextDirection.INSTANCE;
        if (TextDirection.m7929equalsimpl0(i, companion.m7934getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m7929equalsimpl0(i, companion.m7935getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m7929equalsimpl0(i, companion.m7936getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m7929equalsimpl0(i, companion.m7937getRtls_7Xco())) {
            return 1;
        }
        if (TextDirection.m7929equalsimpl0(i, companion.m7933getContents_7Xco()) ? true : TextDirection.m7929equalsimpl0(i, companion.m7938getUnspecifieds_7Xco())) {
            if (localeList == null || (platformLocale = localeList.get(0).getPlatformLocale()) == null) {
                platformLocale = Locale.getDefault();
            }
            int layoutDirectionFromLocale = TextUtilsCompat.getLayoutDirectionFromLocale(platformLocale);
            return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
        }
        throw new IllegalStateException("Invalid TextDirection.");
    }

    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : EmojiSupportMatch.m7533boximpl(paragraphSyle.getEmojiSupportMatch())) == null ? false : EmojiSupportMatch.m7536equalsimpl0(r1.getValue(), EmojiSupportMatch.INSTANCE.m7542getNone_3YsG6Y()));
    }
}
