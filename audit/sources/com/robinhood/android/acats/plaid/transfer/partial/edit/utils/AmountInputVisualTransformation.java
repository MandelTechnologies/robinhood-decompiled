package com.robinhood.android.acats.plaid.transfer.partial.edit.utils;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: AmountInputVisualTransformation.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "numberOfDecimals", "", "isCurrency", "", "<init>", "(IZ)V", "locale", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "symbols", "Ljava/text/DecimalFormatSymbols;", "integerFormatter", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "FixedCursorOffsetMapping", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AmountInputVisualTransformation implements VisualTransformation {
    public static final int $stable = 0;
    private final NumberFormatter integerFormatter;
    private final boolean isCurrency;
    private final Locale locale;
    private final int numberOfDecimals;
    private final DecimalFormatSymbols symbols;

    /* JADX WARN: Multi-variable type inference failed */
    public AmountInputVisualTransformation() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public AmountInputVisualTransformation(int i, boolean z) {
        this.numberOfDecimals = i;
        this.isCurrency = z;
        Locale locale = Locale.getDefault(Locale.Category.FORMAT);
        this.locale = locale;
        this.symbols = DecimalFormatSymbols.getInstance(locale);
        this.integerFormatter = Formats.getIntegerFormat();
    }

    public /* synthetic */ AmountInputVisualTransformation(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? false : z);
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(AnnotatedString text) {
        BigDecimal bigDecimalOrNull;
        String str;
        Object objValueOf;
        Intrinsics.checkNotNullParameter(text, "text");
        char groupingSeparator = this.symbols.getGroupingSeparator();
        char decimalSeparator = this.symbols.getDecimalSeparator();
        char zeroDigit = this.symbols.getZeroDigit();
        String text2 = text.getText();
        String strRemovePrefix = StringsKt.removePrefix(StringsKt.contains$default((CharSequence) text2, decimalSeparator, false, 2, (Object) null) ? (String) CollectionsKt.first(StringsKt.split$default((CharSequence) text2, new char[]{decimalSeparator}, false, 0, 6, (Object) null)) : text2, "$");
        boolean zStartsWith$default = StringsKt.startsWith$default(strRemovePrefix, "-", false, 2, (Object) null);
        if (zStartsWith$default) {
            strRemovePrefix = StringsKt.removePrefix(strRemovePrefix, "-");
        }
        String strRemovePrefix2 = StringsKt.removePrefix(strRemovePrefix, "0");
        if (zStartsWith$default && strRemovePrefix2.length() > 0) {
            strRemovePrefix2 = "-" + strRemovePrefix2;
        }
        String str2 = strRemovePrefix2;
        String str3 = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) text2, new char[]{decimalSeparator}, false, 0, 6, (Object) null), 1);
        String strReplace = new Regex("[" + groupingSeparator + "$]").replace(str2, "");
        String strValueOf = (strReplace.length() == 0 || Intrinsics.areEqual(strReplace, "-") || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(strReplace)) == null || (str = this.integerFormatter.format(bigDecimalOrNull)) == null) ? String.valueOf(zeroDigit) : str;
        if (str3 == null) {
            objValueOf = "";
        } else if (str3.length() > 0) {
            objValueOf = decimalSeparator + ((String) CollectionsKt.first((List) StringsKt.chunked(str3, this.numberOfDecimals)));
        } else {
            objValueOf = Character.valueOf(decimalSeparator);
        }
        String str4 = (this.isCurrency ? "$" : "") + strValueOf + objValueOf;
        return new TransformedText(new AnnotatedString(str4, text.getSpanStyles(), text.getParagraphStyles()), new FixedCursorOffsetMapping(text2.length(), str4.length()));
    }

    /* compiled from: AmountInputVisualTransformation.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation$FixedCursorOffsetMapping;", "Landroidx/compose/ui/text/input/OffsetMapping;", "contentLength", "", "formattedContentLength", "<init>", "(II)V", "originalToTransformed", "offset", "transformedToOriginal", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class FixedCursorOffsetMapping implements OffsetMapping {
        private final int contentLength;
        private final int formattedContentLength;

        public FixedCursorOffsetMapping(int i, int i2) {
            this.contentLength = i;
            this.formattedContentLength = i2;
        }

        @Override // androidx.compose.p011ui.text.input.OffsetMapping
        public int originalToTransformed(int offset) {
            return this.formattedContentLength;
        }

        @Override // androidx.compose.p011ui.text.input.OffsetMapping
        public int transformedToOriginal(int offset) {
            return this.contentLength;
        }
    }
}
