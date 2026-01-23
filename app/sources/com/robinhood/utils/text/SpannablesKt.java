package com.robinhood.utils.text;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.utils.text.Spans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: Spannables.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001aA\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u0004*\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\r\u001a$\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u001a\u0016\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t\u001a\u0015\u0010\u0014\u001a\u00020\u000f\"\u0006\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0010H\u0086\b\u001a\n\u0010\u0015\u001a\u00020\u0002*\u00020\u0016\u001a9\u0010\u0017\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000b2\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\u001b¢\u0006\u0002\b\u001cH\u0086\bø\u0001\u0000\u001aF\u0010\u001d\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\u000e\b\u0004\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0%H\u0086\bø\u0001\u0000\u001a2\u0010&\u001a\u00020\u000f\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\u0004*\u00020\u00102\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, m3636d2 = {"getSpanRange", "Lkotlin/ranges/IntRange;", "Landroid/text/Spanned;", "tag", "", "getSpans", "", "T", "type", "Ljava/lang/Class;", "start", "", "end", "(Landroid/text/Spanned;Ljava/lang/Class;II)[Ljava/lang/Object;", "setSpan", "", "Landroid/text/Spannable;", "what", "range", "flags", "removeSpans", "copyToSpanned", "", "inSpans", "Landroid/text/SpannableStringBuilder;", "span", "builderAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "appendClickableSpan", "text", "", "appendOnNewLine", "", "bold", "underline", "action", "Lkotlin/Function0;", "replaceSpans", "transform", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class SpannablesKt {
    public static final /* synthetic */ <T> void replaceSpans(Spannable spannable, Function1<? super T, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int length = spannable.length();
        Intrinsics.reifiedOperationMarker(4, "T");
        for (Object obj : spannable.getSpans(0, length, Object.class)) {
            int spanFlags = spannable.getSpanFlags(obj);
            if (spanFlags != 0) {
                PrimitiveRanges2 spanRange = getSpanRange(spannable, obj);
                Intrinsics.checkNotNull(spanRange);
                Object objInvoke = transform.invoke(obj);
                if (!Intrinsics.areEqual(obj, objInvoke)) {
                    if (objInvoke != null) {
                        setSpan(spannable, objInvoke, spanRange, spanFlags);
                    }
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final PrimitiveRanges2 getSpanRange(Spanned spanned, Object tag) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        int spanStart = spanned.getSpanStart(tag);
        int spanEnd = spanned.getSpanEnd(tag);
        if (spanStart == -1 || spanEnd == -1) {
            return null;
        }
        return new PrimitiveRanges2(spanStart, RangesKt.coerceAtLeast(spanEnd - 1, spanStart));
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, Class cls, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = spanned.length();
        }
        return getSpans(spanned, cls, i, i2);
    }

    public static final <T> T[] getSpans(Spanned spanned, Class<T> type2, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        T[] tArr = (T[]) spanned.getSpans(i, i2, type2);
        Intrinsics.checkNotNullExpressionValue(tArr, "getSpans(...)");
        return tArr;
    }

    public static /* synthetic */ void setSpan$default(Spannable spannable, Object obj, PrimitiveRanges2 primitiveRanges2, int i, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            i = 17;
        }
        setSpan(spannable, obj, primitiveRanges2, i);
    }

    public static final void setSpan(Spannable spannable, Object what, PrimitiveRanges2 range, int i) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(what, "what");
        Intrinsics.checkNotNullParameter(range, "range");
        spannable.setSpan(what, range.getFirst(), range.getLast() + 1, i);
    }

    public static final void removeSpans(Spannable spannable, Class<?> type2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        for (Object obj : getSpans$default(spannable, type2, 0, 0, 6, null)) {
            spannable.removeSpan(obj);
        }
    }

    public static final /* synthetic */ <T> void removeSpans(Spannable spannable) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        removeSpans(spannable, Object.class);
    }

    public static final Spanned copyToSpanned(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new SpannedString(charSequence);
    }

    public static final SpannableStringBuilder inSpans(SpannableStringBuilder spannableStringBuilder, Object span, int i, Function1<? super SpannableStringBuilder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        int length = spannableStringBuilder.length();
        builderAction.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(span, length, spannableStringBuilder.length(), i);
        return spannableStringBuilder;
    }

    public static /* synthetic */ SpannableStringBuilder appendClickableSpan$default(SpannableStringBuilder spannableStringBuilder, String text, boolean z, boolean z2, boolean z3, Function0 action, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        spannableStringBuilder.append((CharSequence) (z ? "\n" : PlaceholderUtils.XXShortPlaceholderText));
        Spans spans = Spans.INSTANCE;
        Spans.C420031 c420031 = new Spans.C420031(z3, z2, action);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) text);
        spannableStringBuilder.setSpan(c420031, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder appendClickableSpan(SpannableStringBuilder spannableStringBuilder, String text, boolean z, boolean z2, boolean z3, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        spannableStringBuilder.append((CharSequence) (z ? "\n" : PlaceholderUtils.XXShortPlaceholderText));
        Spans spans = Spans.INSTANCE;
        Spans.C420031 c420031 = new Spans.C420031(z3, z2, action);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) text);
        spannableStringBuilder.setSpan(c420031, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
