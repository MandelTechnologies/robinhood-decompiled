package com.robinhood.android.markdown.util;

import android.text.SpannableString;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkdownString.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/markdown/util/MarkdownString;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toSpanned", "Landroid/text/SpannableString;", "markwon", "Lio/noties/markwon/Markwon;", "toSpanned-impl", "(Ljava/lang/String;Lio/noties/markwon/Markwon;)Landroid/text/SpannableString;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lib-markdown_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class MarkdownString {
    private final String value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MarkdownString m16300boximpl(String str) {
        return new MarkdownString(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m16301constructorimpl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m16302equalsimpl(String str, Object obj) {
        return (obj instanceof MarkdownString) && Intrinsics.areEqual(str, ((MarkdownString) obj).m16307unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m16303equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m16304hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m16306toStringimpl(String str) {
        return "MarkdownString(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m16302equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m16304hashCodeimpl(this.value);
    }

    public String toString() {
        return m16306toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m16307unboximpl() {
        return this.value;
    }

    private /* synthetic */ MarkdownString(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    /* renamed from: toSpanned-impl, reason: not valid java name */
    public static final SpannableString m16305toSpannedimpl(String str, Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        return new SpannableString(markwon.toMarkdown(str));
    }
}
