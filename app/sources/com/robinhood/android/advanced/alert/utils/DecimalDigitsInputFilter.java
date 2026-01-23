package com.robinhood.android.advanced.alert.utils;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DecimalDigitsInputFilter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J>\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/utils/DecimalDigitsInputFilter;", "Landroid/text/InputFilter;", "digitsBeforeZero", "", "digitsAfterZero", "<init>", "(II)V", "mPattern", "Ljava/util/regex/Pattern;", "getMPattern", "()Ljava/util/regex/Pattern;", "setMPattern", "(Ljava/util/regex/Pattern;)V", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class DecimalDigitsInputFilter implements InputFilter {
    public static final int $stable = 8;
    private Pattern mPattern;

    public DecimalDigitsInputFilter(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("[0-9]{0,");
        sb.append(i - 1);
        sb.append("}+((\\.[0-9]{0,");
        sb.append(i2 - 1);
        sb.append("})?)||(\\.)?");
        Pattern patternCompile = Pattern.compile(sb.toString());
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this.mPattern = patternCompile;
    }

    public final Pattern getMPattern() {
        return this.mPattern;
    }

    public final void setMPattern(Pattern pattern) {
        Intrinsics.checkNotNullParameter(pattern, "<set-?>");
        this.mPattern = pattern;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        Matcher matcher = this.mPattern.matcher(String.valueOf(dest));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return null;
        }
        return "";
    }
}
