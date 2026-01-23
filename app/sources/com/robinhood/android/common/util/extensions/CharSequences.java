package com.robinhood.android.common.util.extensions;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.robinhood.android.common.util.text.ActionSpan;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CharSequences.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m3636d2 = {"buildTextWithClickableLink", "", "bold", "", "underline", "linkText", "action", "Lkotlin/Function0;", "", "addUnderlineToText", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.CharSequencesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CharSequences {
    public static /* synthetic */ CharSequence buildTextWithClickableLink$default(CharSequence charSequence, boolean z, boolean z2, CharSequence linkText, Function0 action, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        Intrinsics.checkNotNullParameter(action, "action");
        ActionSpan actionSpan = new ActionSpan(false, (Function0) new CharSequences2(action), 1, (DefaultConstructorMarker) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append(' ');
        List listMutableListOf = CollectionsKt.mutableListOf(actionSpan);
        if (z) {
            listMutableListOf.add(new StyleSpan(1));
        }
        if (z2) {
            listMutableListOf.add(new UnderlineSpan());
        }
        Object[] array2 = listMutableListOf.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(linkText);
        for (Object obj2 : objArrCopyOf) {
            spannableStringBuilder.setSpan(obj2, length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public static final CharSequence buildTextWithClickableLink(CharSequence charSequence, boolean z, boolean z2, CharSequence linkText, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        Intrinsics.checkNotNullParameter(action, "action");
        ActionSpan actionSpan = new ActionSpan(false, (Function0) new CharSequences2(action), 1, (DefaultConstructorMarker) null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append(' ');
        List listMutableListOf = CollectionsKt.mutableListOf(actionSpan);
        if (z) {
            listMutableListOf.add(new StyleSpan(1));
        }
        if (z2) {
            listMutableListOf.add(new UnderlineSpan());
        }
        Object[] array2 = listMutableListOf.toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array2, array2.length);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(linkText);
        for (Object obj : objArrCopyOf) {
            spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 17);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public static final CharSequence addUnderlineToText(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        return spannableString;
    }
}
