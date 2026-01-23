package com.robinhood.android.equityscreener.indicators;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.input.OffsetMapping;
import androidx.compose.p011ui.text.input.TransformedText;
import androidx.compose.p011ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: IndicatorRangeSliderSelector.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/indicators/DataTypeTextTransformer;", "Landroidx/compose/ui/text/input/VisualTransformation;", "type", "Lcom/robinhood/android/equityscreener/indicators/DataType;", "<init>", "(Lcom/robinhood/android/equityscreener/indicators/DataType;)V", "prefix", "", "getPrefix", "()Ljava/lang/String;", "postfix", "getPostfix", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.indicators.DataTypeTextTransformer, reason: use source file name */
/* loaded from: classes3.dex */
public final class IndicatorRangeSliderSelector2 implements VisualTransformation {
    public static final int $stable = 0;
    private final String postfix;
    private final String prefix;

    public IndicatorRangeSliderSelector2(IndicatorRangeSliderSelector type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.prefix = type2.getPrefix();
        this.postfix = type2.getPostfix();
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getPostfix() {
        return this.postfix;
    }

    @Override // androidx.compose.p011ui.text.input.VisualTransformation
    public TransformedText filter(final AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        final AnnotatedString annotatedString = new AnnotatedString(this.prefix + ((Object) text) + this.postfix, null, 2, null);
        return new TransformedText(annotatedString, new OffsetMapping() { // from class: com.robinhood.android.equityscreener.indicators.DataTypeTextTransformer$filter$offsetMapping$1
            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                return RangesKt.coerceIn(offset + this.this$0.getPrefix().length(), this.this$0.getPrefix().length(), annotatedString.length() - this.this$0.getPostfix().length());
            }

            @Override // androidx.compose.p011ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                return RangesKt.coerceIn(offset - this.this$0.getPrefix().length(), 0, text.length());
            }
        });
    }
}
