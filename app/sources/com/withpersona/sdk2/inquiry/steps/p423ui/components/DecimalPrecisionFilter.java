package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/DecimalPrecisionFilter;", "Landroid/text/InputFilter;", "precision", "", "<init>", "(I)V", "pattern", "Ljava/util/regex/Pattern;", "getPattern", "()Ljava/util/regex/Pattern;", "pattern$delegate", "Lkotlin/Lazy;", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DecimalPrecisionFilter implements InputFilter {

    /* renamed from: pattern$delegate, reason: from kotlin metadata */
    private final Lazy pattern = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.steps.ui.components.DecimalPrecisionFilter$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DecimalPrecisionFilter.pattern_delegate$lambda$0(this.f$0);
        }
    });
    private final int precision;

    public DecimalPrecisionFilter(int i) {
        this.precision = i;
    }

    private final Pattern getPattern() {
        Object value = this.pattern.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Pattern) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pattern pattern_delegate$lambda$0(DecimalPrecisionFilter decimalPrecisionFilter) {
        return Pattern.compile("-?[0-9]*+((\\.[0-9]{0," + decimalPrecisionFilter.precision + "})?)||(\\.)?");
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        CharSequence charSequenceSubSequence = source.subSequence(start, end);
        CharSequence charSequenceSubSequence2 = dest.subSequence(0, dstart);
        CharSequence charSequenceSubSequence3 = dest.subSequence(dend, dest.length());
        StringBuilder sb = new StringBuilder();
        sb.append((Object) charSequenceSubSequence2);
        sb.append((Object) charSequenceSubSequence);
        sb.append((Object) charSequenceSubSequence3);
        Matcher matcher = getPattern().matcher(StringsKt.replace$default(sb.toString(), ',', '.', false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return null;
        }
        return source.length() == 0 ? dest.subSequence(dstart, dend) : "";
    }
}
