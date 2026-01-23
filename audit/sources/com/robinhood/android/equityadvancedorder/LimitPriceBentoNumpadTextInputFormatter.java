package com.robinhood.android.equityadvancedorder;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import com.robinhood.android.equityadvancedorder.utils.EquityPriceScaling;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BentoNumpadTextInputFormatters.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0011HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/LimitPriceBentoNumpadTextInputFormatter;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "maxAllowedLength", "", "maxScaleDollar", "maxScaleSubDollar", "preDecimalDigitLimit", "<init>", "(IIII)V", "notAllowedChars", "", "", "format", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "parse", "Ljava/math/BigDecimal;", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class LimitPriceBentoNumpadTextInputFormatter implements BentoNumpadTextInputFormatter {
    public static final int $stable = 8;
    private final int maxAllowedLength;
    private final int maxScaleDollar;
    private final int maxScaleSubDollar;
    private final List<Character> notAllowedChars;
    private final int preDecimalDigitLimit;

    public LimitPriceBentoNumpadTextInputFormatter() {
        this(0, 0, 0, 0, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getMaxAllowedLength() {
        return this.maxAllowedLength;
    }

    /* renamed from: component2, reason: from getter */
    private final int getMaxScaleDollar() {
        return this.maxScaleDollar;
    }

    /* renamed from: component3, reason: from getter */
    private final int getMaxScaleSubDollar() {
        return this.maxScaleSubDollar;
    }

    /* renamed from: component4, reason: from getter */
    private final int getPreDecimalDigitLimit() {
        return this.preDecimalDigitLimit;
    }

    public static /* synthetic */ LimitPriceBentoNumpadTextInputFormatter copy$default(LimitPriceBentoNumpadTextInputFormatter limitPriceBentoNumpadTextInputFormatter, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = limitPriceBentoNumpadTextInputFormatter.maxAllowedLength;
        }
        if ((i5 & 2) != 0) {
            i2 = limitPriceBentoNumpadTextInputFormatter.maxScaleDollar;
        }
        if ((i5 & 4) != 0) {
            i3 = limitPriceBentoNumpadTextInputFormatter.maxScaleSubDollar;
        }
        if ((i5 & 8) != 0) {
            i4 = limitPriceBentoNumpadTextInputFormatter.preDecimalDigitLimit;
        }
        return limitPriceBentoNumpadTextInputFormatter.copy(i, i2, i3, i4);
    }

    public final LimitPriceBentoNumpadTextInputFormatter copy(int maxAllowedLength, int maxScaleDollar, int maxScaleSubDollar, int preDecimalDigitLimit) {
        return new LimitPriceBentoNumpadTextInputFormatter(maxAllowedLength, maxScaleDollar, maxScaleSubDollar, preDecimalDigitLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitPriceBentoNumpadTextInputFormatter)) {
            return false;
        }
        LimitPriceBentoNumpadTextInputFormatter limitPriceBentoNumpadTextInputFormatter = (LimitPriceBentoNumpadTextInputFormatter) other;
        return this.maxAllowedLength == limitPriceBentoNumpadTextInputFormatter.maxAllowedLength && this.maxScaleDollar == limitPriceBentoNumpadTextInputFormatter.maxScaleDollar && this.maxScaleSubDollar == limitPriceBentoNumpadTextInputFormatter.maxScaleSubDollar && this.preDecimalDigitLimit == limitPriceBentoNumpadTextInputFormatter.preDecimalDigitLimit;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.maxAllowedLength) * 31) + Integer.hashCode(this.maxScaleDollar)) * 31) + Integer.hashCode(this.maxScaleSubDollar)) * 31) + Integer.hashCode(this.preDecimalDigitLimit);
    }

    public String toString() {
        return "LimitPriceBentoNumpadTextInputFormatter(maxAllowedLength=" + this.maxAllowedLength + ", maxScaleDollar=" + this.maxScaleDollar + ", maxScaleSubDollar=" + this.maxScaleSubDollar + ", preDecimalDigitLimit=" + this.preDecimalDigitLimit + ")";
    }

    public LimitPriceBentoNumpadTextInputFormatter(int i, int i2, int i3, int i4) {
        this.maxAllowedLength = i;
        this.maxScaleDollar = i2;
        this.maxScaleSubDollar = i3;
        this.preDecimalDigitLimit = i4;
        this.notAllowedChars = CollectionsKt.listOf((Object[]) new Character[]{Character.valueOf(TickerInputView.CURRENCY_SYMBOL), ',', ' '});
    }

    public /* synthetic */ LimitPriceBentoNumpadTextInputFormatter(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 12 : i, (i5 & 2) != 0 ? 2 : i2, (i5 & 4) != 0 ? 4 : i3, (i5 & 8) != 0 ? Integer.MAX_VALUE : i4);
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public TextFieldValue format(TextFieldValue value) {
        String str;
        long j;
        Intrinsics.checkNotNullParameter(value, "value");
        String strSubstringAfter$default = StringsKt.substringAfter$default(value.getText(), TickerInputView.CURRENCY_SYMBOL, (String) null, 2, (Object) null);
        long selection = value.getSelection();
        if (StringsKt.isBlank(strSubstringAfter$default)) {
            return new TextFieldValue("", TextRange.INSTANCE.m7651getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
        }
        int iMaxEquityPriceScale = EquityPriceScaling.maxEquityPriceScale(parse(strSubstringAfter$default));
        List listSplit$default = StringsKt.split$default((CharSequence) strSubstringAfter$default, new char[]{'.'}, false, 0, 6, (Object) null);
        String strTake = StringsKt.take((String) CollectionsKt.first(listSplit$default), this.preDecimalDigitLimit);
        if (StringsKt.isBlank(strTake)) {
            selection = TextRange2.TextRange(TextRange.m7644getMinimpl(selection) + 1, TextRange.m7643getMaximpl(selection) + 1);
            strTake = "0";
        }
        String str2 = "";
        if (listSplit$default.size() > 1) {
            str = "." + StringsKt.take((String) listSplit$default.get(1), iMaxEquityPriceScale);
        } else {
            str = "";
        }
        String str3 = ((Object) strTake) + str;
        if (StringsKt.isBlank(str3)) {
            j = selection;
        } else if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "$", false, 2, (Object) null)) {
            j = selection;
            str2 = str3;
        } else {
            selection = TextRange2.TextRange(TextRange.m7644getMinimpl(selection) + 1, TextRange.m7643getMaximpl(selection) + 1);
            str2 = "$" + str3;
            j = selection;
        }
        return new TextFieldValue(StringsKt.take(str2, this.maxAllowedLength), j, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter
    public BigDecimal parse(String value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            char cCharAt = value.charAt(i);
            if (!this.notAllowedChars.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
            }
        }
        return StringsKt.toBigDecimalOrNull(sb.toString());
    }
}
