package androidx.compose.p011ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p011ui.text.TextGranularity;
import androidx.compose.p011ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.p011ui.text.android.TextLayout;
import androidx.compose.p011ui.text.android.style.IndentationFixSpan;
import androidx.compose.p011ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p011ui.text.style.Hyphens;
import androidx.compose.p011ui.text.style.LineBreak;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnit2;
import kotlin.Metadata;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\n\u001a\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001cH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0006*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002\u001a\u0016\u0010 \u001a\u00020\u0006*\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m3636d2 = {"shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "attachIndentationFixSpan", "", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "toLayoutTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m7524toLayoutAlignaXe7zB0(int i) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.m7915equalsimpl0(i, companion.m7922getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m7915equalsimpl0(i, companion.m7923getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m7915equalsimpl0(i, companion.m7919getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m7915equalsimpl0(i, companion.m7924getStarte0LSkKk()) && TextAlign.m7915equalsimpl0(i, companion.m7920getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m7526toLayoutHyphenationFrequency3fSNIE(int i) {
        Hyphens.Companion companion = Hyphens.INSTANCE;
        if (Hyphens.m7841equalsimpl0(i, companion.m7845getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m7841equalsimpl0(i, companion.m7846getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m7525toLayoutBreakStrategyxImikfE(int i) {
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.INSTANCE;
        if (LineBreak.Strategy.m7862equalsimpl0(i, companion.m7866getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m7862equalsimpl0(i, companion.m7865getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m7862equalsimpl0(i, companion.m7864getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m7527toLayoutLineBreakStylehpcqdu8(int i) {
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.INSTANCE;
        if (LineBreak.Strictness.m7868equalsimpl0(i, companion.m7870getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m7868equalsimpl0(i, companion.m7871getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m7868equalsimpl0(i, companion.m7872getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m7868equalsimpl0(i, companion.m7873getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m7528toLayoutLineBreakWordStylewPN0Rpw(int i) {
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.INSTANCE;
        return (!LineBreak.WordBreak.m7875equalsimpl0(i, companion.m7877getDefaultjp8hJ3c()) && LineBreak.WordBreak.m7875equalsimpl0(i, companion.m7878getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        if (z && !TextUnit.m8071equalsimpl0(textStyle.m7666getLetterSpacingXSAIIZE(), TextUnit2.getSp(0)) && !TextUnit.m8071equalsimpl0(textStyle.m7666getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m8080getUnspecifiedXSAIIZE())) {
            int iM7669getTextAligne0LSkKk = textStyle.m7669getTextAligne0LSkKk();
            TextAlign.Companion companion = TextAlign.INSTANCE;
            if (!TextAlign.m7915equalsimpl0(iM7669getTextAligne0LSkKk, companion.m7925getUnspecifiede0LSkKk()) && !TextAlign.m7915equalsimpl0(textStyle.m7669getTextAligne0LSkKk(), companion.m7924getStarte0LSkKk()) && !TextAlign.m7915equalsimpl0(textStyle.m7669getTextAligne0LSkKk(), companion.m7921getJustifye0LSkKk())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m7529toLayoutTextGranularityduNsdkg(int i) {
        TextGranularity.Companion companion = TextGranularity.INSTANCE;
        return (!TextGranularity.m7613equalsimpl0(i, companion.m7614getCharacterDRrd7Zo()) && TextGranularity.m7613equalsimpl0(i, companion.m7615getWordDRrd7Zo())) ? 1 : 0;
    }
}
