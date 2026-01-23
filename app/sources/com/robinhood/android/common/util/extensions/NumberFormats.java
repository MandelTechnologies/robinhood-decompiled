package com.robinhood.android.common.util.extensions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: NumberFormats.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0001\u001a&\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0001¨\u0006\t"}, m3636d2 = {"formatNullable", "", "Ljava/text/NumberFormat;", "any", "", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "formatMultiple", "values", "", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.util.extensions.NumberFormatsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class NumberFormats {
    public static /* synthetic */ String formatNullable$default(NumberFormat numberFormat, Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "-";
        }
        return formatNullable(numberFormat, obj, str);
    }

    public static final String formatNullable(NumberFormat numberFormat, Object obj, String str) {
        String str2;
        Intrinsics.checkNotNullParameter(numberFormat, "<this>");
        Intrinsics.checkNotNullParameter(str, "default");
        return (obj == null || (str2 = numberFormat.format(obj)) == null) ? str : str2;
    }

    public static /* synthetic */ String formatMultiple$default(NumberFormat numberFormat, Iterable iterable, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "-";
        }
        return formatMultiple(numberFormat, iterable, str);
    }

    public static final String formatMultiple(NumberFormat numberFormat, Iterable<? extends Object> iterable, String str) {
        Sequence sequenceAsSequence;
        Sequence sequenceFilterNotNull;
        Sequence map;
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(numberFormat, "<this>");
        Intrinsics.checkNotNullParameter(str, "default");
        if (iterable != null && (sequenceAsSequence = CollectionsKt.asSequence(iterable)) != null && (sequenceFilterNotNull = SequencesKt.filterNotNull(sequenceAsSequence)) != null && (map = SequencesKt.map(sequenceFilterNotNull, new C118731(numberFormat))) != null && (strJoinToString$default = SequencesKt.joinToString$default(map, null, null, null, 0, null, null, 63, null)) != null) {
            if (strJoinToString$default.length() <= 0) {
                strJoinToString$default = null;
            }
            if (strJoinToString$default != null) {
                return strJoinToString$default;
            }
        }
        return str;
    }

    /* compiled from: NumberFormats.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.util.extensions.NumberFormatsKt$formatMultiple$1 */
    /* synthetic */ class C118731 extends FunctionReferenceImpl implements Function1<Object, String> {
        C118731(Object obj) {
            super(1, obj, NumberFormat.class, "format", "format(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Object obj) {
            return ((NumberFormat) this.receiver).format(obj);
        }
    }
}
