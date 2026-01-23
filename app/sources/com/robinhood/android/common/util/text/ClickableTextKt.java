package com.robinhood.android.common.util.text;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ClickableText.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m3636d2 = {"buildClickableSpannedString", "Landroid/text/SpannedString;", "text", "", "bold", "", "underline", "action", "Lkotlin/Function0;", "", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ClickableTextKt {
    public static /* synthetic */ SpannedString buildClickableSpannedString$default(CharSequence text, boolean z, boolean z2, Function0 action, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List listMutableListOf = CollectionsKt.mutableListOf(new ActionSpan(z2, new ClickableTextKt$buildClickableSpannedString$1$actionSpan$1(action)));
        if (z) {
            listMutableListOf.add(new StyleSpan(1));
        }
        Object[] array2 = listMutableListOf.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(text);
        for (Object obj2 : objArrCopyOf) {
            spannableStringBuilder.setSpan(obj2, length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public static final SpannedString buildClickableSpannedString(CharSequence text, boolean z, boolean z2, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List listMutableListOf = CollectionsKt.mutableListOf(new ActionSpan(z2, new ClickableTextKt$buildClickableSpannedString$1$actionSpan$1(action)));
        if (z) {
            listMutableListOf.add(new StyleSpan(1));
        }
        Object[] array2 = listMutableListOf.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(text);
        for (Object obj : objArrCopyOf) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }
}
