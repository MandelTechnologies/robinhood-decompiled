package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0017\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\u0004\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\u0004\u0010\t\u001a\u0011\u0010\u0006\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\u0006\u0010\t\u001a\u0011\u0010\u0007\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\u0007\u0010\t\u001a#\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\b*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\bH\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0019\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001b\u001a#\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010 \u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u001f\u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b!\u0010 \u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001f\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010 \u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b#\u0010\u001f\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b#\u0010 \u001a)\u0010'\u001a\u00020\b*\u00020\b2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\b¢\u0006\u0004\b'\u0010(\u001a!\u0010)\u001a\u00020\b*\u00020\b2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010,\u001a\u00020\u0000*\u00020\u00002\u0006\u0010+\u001a\u00020\b¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010/\u001a\u00020\u0000*\u00020\u00002\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b/\u0010-\u001a!\u00100\u001a\u00020\u0000*\u00020\u00002\u0006\u0010+\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b0\u00101\u001a\u0019\u00100\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b0\u0010-\u001a;\u00106\u001a\u00020\u0011*\u00020\b2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0011H\u0000¢\u0006\u0004\b6\u00107\u001a#\u00109\u001a\u00020\u0011*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\b9\u0010:\u001a#\u0010;\u001a\u00020\u0011*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\b;\u0010:\u001a#\u00109\u001a\u00020\u0011*\u00020\b2\u0006\u0010+\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\b9\u0010<\u001a+\u00109\u001a\u00020\u0011*\u00020\b2\u0006\u0010+\u001a\u00020\b2\u0006\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\b9\u0010=\u001a#\u0010;\u001a\u00020\u0011*\u00020\b2\u0006\u0010.\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\b;\u0010<\u001a-\u0010>\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\b>\u0010?\u001a-\u0010@\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\b@\u0010?\u001a=\u0010D\u001a\u00020\n*\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00112\b\b\u0002\u0010A\u001a\u00020\u0011H\u0002¢\u0006\u0004\bB\u0010C\u001aG\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010G*\u00020\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000E2\u0006\u0010$\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u0011H\u0002¢\u0006\u0004\bH\u0010I\u001a-\u0010D\u001a\u00020\n*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\bD\u0010K\u001a-\u0010D\u001a\u00020\n*\u00020\b2\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\bD\u0010M\u001a-\u0010N\u001a\u00020\n*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\bN\u0010K\u001a-\u0010N\u001a\u00020\n*\u00020\b2\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u0011¢\u0006\u0004\bN\u0010M\u001a&\u0010O\u001a\u00020\u0011*\u00020\b2\u0006\u00103\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\bO\u0010<\u001a&\u0010O\u001a\u00020\u0011*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0011H\u0086\u0002¢\u0006\u0004\bO\u0010:\u001a?\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170R*\u00020\b2\u0006\u0010P\u001a\u00020\u00012\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u00112\b\b\u0002\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010T\u001aG\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170R*\u00020\b2\u000e\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000V2\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u00105\u001a\u00020\u00112\b\b\u0002\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\bS\u0010W\u001a\u0017\u0010Y\u001a\u00020X2\u0006\u0010Q\u001a\u00020\nH\u0000¢\u0006\u0004\bY\u0010Z\u001a?\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\b2\u0012\u0010P\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000V\"\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u00112\b\b\u0002\u0010Q\u001a\u00020\n¢\u0006\u0004\b\\\u0010]\u001a7\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00000R*\u00020\b2\n\u0010P\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00112\b\b\u0002\u0010Q\u001a\u00020\n¢\u0006\u0004\b^\u0010_\u001a7\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\b2\n\u0010P\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00112\b\b\u0002\u0010Q\u001a\u00020\n¢\u0006\u0004\b\\\u0010`\u001a1\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\nH\u0002¢\u0006\u0004\ba\u0010b\u001a\u0017\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00000R*\u00020\b¢\u0006\u0004\bc\u0010d\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000[*\u00020\b¢\u0006\u0004\be\u0010f\u001a\u001f\u0010g\u001a\u00020\u0011*\u0004\u0018\u00010\b2\b\u00103\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\bg\u0010h\u001a\u001f\u0010i\u001a\u00020\u0011*\u0004\u0018\u00010\b2\b\u00103\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\bi\u0010h\u001a\u0015\u0010j\u001a\u0004\u0018\u00010\u0011*\u00020\u0000H\u0007¢\u0006\u0004\bj\u0010k\"\u0015\u0010n\u001a\u00020\u0017*\u00020\b8F¢\u0006\u0006\u001a\u0004\bl\u0010m\"\u0015\u0010q\u001a\u00020\n*\u00020\b8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, m3636d2 = {"", "", "", "chars", "trim", "(Ljava/lang/String;[C)Ljava/lang/String;", "trimStart", "trimEnd", "", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "padStart", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "(Ljava/lang/String;IC)Ljava/lang/String;", "padEnd", "", "isBlank", "(Ljava/lang/CharSequence;)Z", "Lkotlin/collections/CharIterator;", "iterator", "(Ljava/lang/CharSequence;)Lkotlin/collections/CharIterator;", "Lkotlin/ranges/IntRange;", "range", "substring", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "substringBefore", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "substringAfter", "substringBeforeLast", "substringAfterLast", "startIndex", "endIndex", "replacement", "replaceRange", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "removeRange", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "prefix", "removePrefix", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "removeSuffix", "removeSurrounding", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "thisOffset", "other", "otherOffset", "ignoreCase", "regionMatchesImpl", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "startsWith", "(Ljava/lang/CharSequence;CZ)Z", "endsWith", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IZ)Z", "indexOfAny", "(Ljava/lang/CharSequence;[CIZ)I", "lastIndexOfAny", "last", "indexOf$StringsKt__StringsKt", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "indexOf", "", "strings", "Lkotlin/Pair;", "findAnyOf$StringsKt__StringsKt", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "findAnyOf", "(Ljava/lang/CharSequence;CIZ)I", "string", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "lastIndexOf", "contains", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "rangesDelimitedBy", "", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "requireNonNegativeLimit", "(I)V", "", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "splitToSequence", "(Ljava/lang/CharSequence;[CZI)Lkotlin/sequences/Sequence;", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "split$StringsKt__StringsKt", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "lineSequence", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "lines", "(Ljava/lang/CharSequence;)Ljava/util/List;", "contentEqualsIgnoreCaseImpl", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "contentEqualsImpl", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "getLastIndex", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/text/StringsKt")
@SourceDebugExtension
/* loaded from: classes23.dex */
public class StringsKt__StringsKt extends StringsJVM2 {
    public static CharSequence trim(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zIsWhitespace = CharJVM.isWhitespace(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zIsWhitespace) {
                    break;
                }
                length--;
            } else if (zIsWhitespace) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String trim(String str, char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zContains = ArraysKt.contains(chars, str.charAt(!z ? i : length));
            if (z) {
                if (!zContains) {
                    break;
                }
                length--;
            } else if (zContains) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static CharSequence trimStart(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!CharJVM.isWhitespace(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    public static String trimStart(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!ArraysKt.contains(chars, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static CharSequence trimEnd(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!CharJVM.isWhitespace(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String trimEnd(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ArraysKt.contains(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static final CharSequence padStart(CharSequence charSequence, int i, char c) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String padStart(String str, int i, char c) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return padStart((CharSequence) str, i, c).toString();
    }

    public static final CharSequence padEnd(CharSequence charSequence, int i, char c) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(charSequence);
        int length = i - charSequence.length();
        int i2 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c);
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return sb;
    }

    public static /* synthetic */ String padEnd$default(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return padEnd(str, i, c);
    }

    public static final String padEnd(String str, int i, char c) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return padEnd((CharSequence) str, i, c).toString();
    }

    public static final PrimitiveIterators3 iterator(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new PrimitiveIterators3() { // from class: kotlin.text.StringsKt__StringsKt.iterator.1
            private int index;

            @Override // kotlin.collections.PrimitiveIterators3
            public char nextChar() {
                CharSequence charSequence2 = charSequence;
                int i = this.index;
                this.index = i + 1;
                return charSequence2.charAt(i);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < charSequence.length();
            }
        };
    }

    public static PrimitiveRanges2 getIndices(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new PrimitiveRanges2(0, charSequence.length() - 1);
    }

    public static int getLastIndex(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String substring(String str, PrimitiveRanges2 range) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String substring(CharSequence charSequence, PrimitiveRanges2 range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static /* synthetic */ String substringBefore$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringBefore(str, c, str2);
    }

    public static final String substringBefore(String str, char c, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBefore$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringBefore(str, str2, str3);
    }

    public static final String substringBefore(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfter$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringAfter(str, c, str2);
    }

    public static String substringAfter(String str, char c, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfter$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringAfter(str, str2, str3);
    }

    public static String substringAfter(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iIndexOf$default = indexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iIndexOf$default + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringBeforeLast(str, c, str2);
    }

    public static final String substringBeforeLast(String str, char c, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringBeforeLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringBeforeLast(str, str2, str3);
    }

    public static String substringBeforeLast(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return substringAfterLast(str, c, str2);
    }

    public static String substringAfterLast(String str, char c, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, c, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf$default + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String substringAfterLast$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return substringAfterLast(str, str2, str3);
    }

    public static final String substringAfterLast(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iLastIndexOf$default = lastIndexOf$default((CharSequence) str, delimiter, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iLastIndexOf$default + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence replaceRange(CharSequence charSequence, int i, int i2, CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(replacement);
        sb.append(charSequence, i2, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    public static CharSequence removeRange(CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append(charSequence, i2, charSequence.length());
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        return sb;
    }

    public static String removePrefix(String str, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!startsWith$default((CharSequence) str, prefix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String removeSuffix(String str, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String removeSurrounding(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !startsWith$default((CharSequence) str, prefix, false, 2, (Object) null) || !endsWith$default((CharSequence) str, suffix, false, 2, (Object) null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String removeSurrounding(String str, CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return removeSurrounding(str, delimiter, delimiter);
    }

    public static final boolean regionMatchesImpl(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!Char.equals(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, c, z);
    }

    public static final boolean startsWith(CharSequence charSequence, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && Char.equals(charSequence.charAt(0), c, z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, c, z);
    }

    public static final boolean endsWith(CharSequence charSequence, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && Char.equals(charSequence.charAt(getLastIndex(charSequence)), c, z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, z);
    }

    public static boolean startsWith(CharSequence charSequence, CharSequence prefix, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z && (charSequence instanceof String) && (prefix instanceof String)) {
            return StringsJVM2.startsWith$default((String) charSequence, (String) prefix, false, 2, null);
        }
        return regionMatchesImpl(charSequence, 0, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return startsWith(charSequence, charSequence2, i, z);
    }

    public static final boolean startsWith(CharSequence charSequence, CharSequence prefix, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z && (charSequence instanceof String) && (prefix instanceof String)) {
            return StringsJVM2.startsWith$default((String) charSequence, (String) prefix, i, false, 4, null);
        }
        return regionMatchesImpl(charSequence, i, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return endsWith(charSequence, charSequence2, z);
    }

    public static final boolean endsWith(CharSequence charSequence, CharSequence suffix, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z && (charSequence instanceof String) && (suffix instanceof String)) {
            return StringsJVM2.endsWith$default((String) charSequence, (String) suffix, false, 2, null);
        }
        return regionMatchesImpl(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z);
    }

    public static /* synthetic */ int indexOfAny$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOfAny(charSequence, cArr, i, z);
    }

    public static final int indexOfAny(CharSequence charSequence, char[] chars, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.single(chars), i);
        }
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i, 0);
        int lastIndex = getLastIndex(charSequence);
        if (iCoerceAtLeast > lastIndex) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iCoerceAtLeast);
            for (char c : chars) {
                if (Char.equals(c, cCharAt, z)) {
                    return iCoerceAtLeast;
                }
            }
            if (iCoerceAtLeast == lastIndex) {
                return -1;
            }
            iCoerceAtLeast++;
        }
    }

    public static final int lastIndexOfAny(CharSequence charSequence, char[] chars, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.single(chars), i);
        }
        for (int iCoerceAtMost = RangesKt.coerceAtMost(i, getLastIndex(charSequence)); -1 < iCoerceAtMost; iCoerceAtMost--) {
            char cCharAt = charSequence.charAt(iCoerceAtMost);
            for (char c : chars) {
                if (Char.equals(c, cCharAt, z)) {
                    return iCoerceAtMost;
                }
            }
        }
        return -1;
    }

    static /* synthetic */ int indexOf$StringsKt__StringsKt$default(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return indexOf$StringsKt__StringsKt(charSequence, charSequence2, i, i2, z, z2);
    }

    private static final int indexOf$StringsKt__StringsKt(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        Progressions2 progressions2DownTo;
        if (!z2) {
            progressions2DownTo = new PrimitiveRanges2(RangesKt.coerceAtLeast(i, 0), RangesKt.coerceAtMost(i2, charSequence.length()));
        } else {
            progressions2DownTo = RangesKt.downTo(RangesKt.coerceAtMost(i, getLastIndex(charSequence)), RangesKt.coerceAtLeast(i2, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int first = progressions2DownTo.getFirst();
            int last = progressions2DownTo.getLast();
            int step = progressions2DownTo.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return -1;
            }
            int i3 = first;
            while (true) {
                String str = (String) charSequence2;
                boolean z3 = z;
                if (StringsJVM2.regionMatches(str, 0, (String) charSequence, i3, str.length(), z3)) {
                    return i3;
                }
                if (i3 == last) {
                    return -1;
                }
                i3 += step;
                z = z3;
            }
        } else {
            boolean z4 = z;
            int first2 = progressions2DownTo.getFirst();
            int last2 = progressions2DownTo.getLast();
            int step2 = progressions2DownTo.getStep();
            if ((step2 <= 0 || first2 > last2) && (step2 >= 0 || last2 > first2)) {
                return -1;
            }
            int i4 = first2;
            while (true) {
                boolean z5 = z4;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z4 = z5;
                if (regionMatchesImpl(charSequence4, 0, charSequence3, i4, charSequence2.length(), z5)) {
                    return i4;
                }
                if (i4 == last2) {
                    return -1;
                }
                i4 += step2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    private static final Tuples2<Integer, String> findAnyOf$StringsKt__StringsKt(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        CharSequence charSequence2;
        Object next;
        boolean z3;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) CollectionsKt.single(collection);
            int iIndexOf$default = !z2 ? indexOf$default(charSequence, str, i, false, 4, (Object) null) : lastIndexOf$default(charSequence, str, i, false, 4, (Object) null);
            if (iIndexOf$default < 0) {
                return null;
            }
            return Tuples4.m3642to(Integer.valueOf(iIndexOf$default), str);
        }
        CharSequence charSequence3 = charSequence;
        Progressions2 primitiveRanges2 = !z2 ? new PrimitiveRanges2(RangesKt.coerceAtLeast(i, 0), charSequence3.length()) : RangesKt.downTo(RangesKt.coerceAtMost(i, getLastIndex(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int first = primitiveRanges2.getFirst();
            int last = primitiveRanges2.getLast();
            int step = primitiveRanges2.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                int i2 = first;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = z;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z3 = z;
                        if (StringsJVM2.regionMatches(str2, 0, (String) charSequence3, i2, str2.length(), z3)) {
                            break;
                        }
                        z = z3;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i2 == last) {
                            break;
                        }
                        i2 += step;
                        z = z3;
                    } else {
                        return Tuples4.m3642to(Integer.valueOf(i2), str3);
                    }
                }
            }
        } else {
            boolean z4 = z;
            int first2 = primitiveRanges2.getFirst();
            int last2 = primitiveRanges2.getLast();
            int step2 = primitiveRanges2.getStep();
            if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                int i3 = first2;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z5 = z4;
                        charSequence2 = charSequence3;
                        z4 = z5;
                        if (regionMatchesImpl(str4, 0, charSequence2, i3, str4.length(), z5)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i3 == last2) {
                            break;
                        }
                        i3 += step2;
                        charSequence3 = charSequence2;
                    } else {
                        return Tuples4.m3642to(Integer.valueOf(i3), str5);
                    }
                }
            }
        }
        return null;
    }

    public static boolean isBlank(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!CharJVM.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, c, i, z);
    }

    public static final int indexOf(CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? indexOfAny(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int indexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOf(charSequence, str, i, z);
    }

    public static final int indexOf(CharSequence charSequence, String string2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string2, "string");
        if (z || !(charSequence instanceof String)) {
            return indexOf$StringsKt__StringsKt$default(charSequence, string2, i, charSequence.length(), z, false, 16, null);
        }
        return ((String) charSequence).indexOf(string2, i);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, c, i, z);
    }

    public static final int lastIndexOf(CharSequence charSequence, char c, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? lastIndexOfAny(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static /* synthetic */ int lastIndexOf$default(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = getLastIndex(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return lastIndexOf(charSequence, str, i, z);
    }

    public static final int lastIndexOf(CharSequence charSequence, String string2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string2, "string");
        if (z || !(charSequence instanceof String)) {
            return indexOf$StringsKt__StringsKt(charSequence, string2, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(string2, i);
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return contains(charSequence, charSequence2, z);
    }

    public static boolean contains(CharSequence charSequence, CharSequence other, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return other instanceof String ? indexOf$default(charSequence, (String) other, 0, z, 2, (Object) null) >= 0 : indexOf$StringsKt__StringsKt$default(charSequence, other, 0, charSequence.length(), z, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean contains$default(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return contains(charSequence, c, z);
    }

    public static boolean contains(CharSequence charSequence, char c, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return indexOf$default(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, cArr, i, z, i2);
    }

    private static final Sequence<PrimitiveRanges2> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        requireNonNegativeLimit(i2);
        return new DelimitedRangesSequence(charSequence, i, i2, new Function2() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.rangesDelimitedBy$lambda$14$StringsKt__StringsKt(cArr, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 rangesDelimitedBy$lambda$14$StringsKt__StringsKt(char[] cArr, boolean z, CharSequence DelimitedRangesSequence, int i) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iIndexOfAny = indexOfAny(DelimitedRangesSequence, cArr, i, z);
        if (iIndexOfAny < 0) {
            return null;
        }
        return Tuples4.m3642to(Integer.valueOf(iIndexOfAny), 1);
    }

    static /* synthetic */ Sequence rangesDelimitedBy$StringsKt__StringsKt$default(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return rangesDelimitedBy$StringsKt__StringsKt(charSequence, strArr, i, z, i2);
    }

    private static final Sequence<PrimitiveRanges2> rangesDelimitedBy$StringsKt__StringsKt(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        requireNonNegativeLimit(i2);
        final List listAsList = ArraysKt.asList(strArr);
        return new DelimitedRangesSequence(charSequence, i, i2, new Function2() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.rangesDelimitedBy$lambda$16$StringsKt__StringsKt(listAsList, z, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 rangesDelimitedBy$lambda$16$StringsKt__StringsKt(List list, boolean z, CharSequence DelimitedRangesSequence, int i) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Tuples2<Integer, String> tuples2FindAnyOf$StringsKt__StringsKt = findAnyOf$StringsKt__StringsKt(DelimitedRangesSequence, list, i, z, false);
        if (tuples2FindAnyOf$StringsKt__StringsKt != null) {
            return Tuples4.m3642to(tuples2FindAnyOf$StringsKt__StringsKt.getFirst(), Integer.valueOf(tuples2FindAnyOf$StringsKt__StringsKt.getSecond().length()));
        }
        return null;
    }

    public static final void requireNonNegativeLimit(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return split(charSequence, strArr, z, i);
    }

    public static final List<String> split(CharSequence charSequence, String[] delimiters, boolean z, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return split$StringsKt__StringsKt(charSequence, str, z, i);
            }
        }
        Iterable iterableAsIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (PrimitiveRanges2) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ Sequence splitToSequence$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return splitToSequence(charSequence, cArr, z, i);
    }

    public static final Sequence<String> splitToSequence(final CharSequence charSequence, char[] delimiters, boolean z, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return SequencesKt.map(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i, 2, (Object) null), new Function1() { // from class: kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__StringsKt.splitToSequence$lambda$20$StringsKt__StringsKt(charSequence, (PrimitiveRanges2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String splitToSequence$lambda$20$StringsKt__StringsKt(CharSequence charSequence, PrimitiveRanges2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return substring(charSequence, it);
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return split(charSequence, cArr, z, i);
    }

    public static final List<String> split(CharSequence charSequence, char[] delimiters, boolean z, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return split$StringsKt__StringsKt(charSequence, String.valueOf(delimiters[0]), z, i);
        }
        Iterable iterableAsIterable = SequencesKt.asIterable(rangesDelimitedBy$StringsKt__StringsKt$default(charSequence, delimiters, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableAsIterable, 10));
        Iterator it = iterableAsIterable.iterator();
        while (it.hasNext()) {
            arrayList.add(substring(charSequence, (PrimitiveRanges2) it.next()));
        }
        return arrayList;
    }

    private static final List<String> split$StringsKt__StringsKt(CharSequence charSequence, String str, boolean z, int i) {
        requireNonNegativeLimit(i);
        int length = 0;
        int iIndexOf = indexOf(charSequence, str, 0, z);
        if (iIndexOf == -1 || i == 1) {
            return CollectionsKt.listOf(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? RangesKt.coerceAtMost(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iIndexOf).toString());
            length = str.length() + iIndexOf;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iIndexOf = indexOf(charSequence, str, length, z);
        } while (iIndexOf != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static Sequence<String> lineSequence(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new Sequence<String>() { // from class: kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator */
            public Iterator<String> iterator2() {
                return new LinesIterator(charSequence);
            }
        };
    }

    public static List<String> lines(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return SequencesKt.toList(lineSequence(charSequence));
    }

    public static final boolean contentEqualsIgnoreCaseImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return StringsJVM2.equals((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Char.equals(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean contentEqualsImpl(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.areEqual(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin
    public static Boolean toBooleanStrictOrNull(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.areEqual(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }
}
