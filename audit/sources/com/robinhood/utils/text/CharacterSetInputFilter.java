package com.robinhood.utils.text;

import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: CharacterSetInputFilter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ<\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/utils/text/CharacterSetInputFilter;", "Landroid/text/InputFilter;", "supportedCharset", "", "", "shouldCapInput", "", "<init>", "(Ljava/util/Set;Z)V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "destStart", "destEnd", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CharacterSetInputFilter implements InputFilter {
    private final boolean shouldCapInput;
    private final Set<Character> supportedCharset;

    public CharacterSetInputFilter(Set<Character> supportedCharset, boolean z) {
        Intrinsics.checkNotNullParameter(supportedCharset, "supportedCharset");
        this.supportedCharset = supportedCharset;
        this.shouldCapInput = z;
        Set<Character> set = supportedCharset;
        if ((set instanceof Collection) && set.isEmpty()) {
            return;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (CharsKt.isSurrogate(((Character) it.next()).charValue())) {
                throw new IllegalArgumentException("Supported charset must not contain surrogates");
            }
        }
    }

    public /* synthetic */ CharacterSetInputFilter(Set set, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? true : z);
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int destStart, int destEnd) {
        Intrinsics.checkNotNullParameter(source, "source");
        CharSequence charSequenceSubSequence = source.subSequence(start, end);
        for (int i = 0; i < charSequenceSubSequence.length(); i++) {
            char cCharAt = charSequenceSubSequence.charAt(i);
            if (CharsKt.isSurrogate(cCharAt) || !this.supportedCharset.contains(Character.valueOf(cCharAt))) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceSubSequence);
                int lastIndex = StringsKt.getLastIndex(spannableStringBuilder);
                while (lastIndex >= 0) {
                    char cCharAt2 = spannableStringBuilder.charAt(lastIndex);
                    if (!this.supportedCharset.contains(Character.valueOf(cCharAt2))) {
                        if (this.shouldCapInput && this.supportedCharset.contains(Character.valueOf(Character.toUpperCase(cCharAt2)))) {
                            spannableStringBuilder.replace(lastIndex, lastIndex + 1, (CharSequence) String.valueOf(Character.toUpperCase(cCharAt2)));
                        } else {
                            spannableStringBuilder.delete(lastIndex, lastIndex + 1);
                        }
                    }
                    lastIndex--;
                }
                return spannableStringBuilder;
            }
        }
        return null;
    }
}
