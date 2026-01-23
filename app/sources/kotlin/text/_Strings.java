package kotlin.text;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.collections.SlidingWindow3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0005\u001a\u0019\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\r*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u0016\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0010\u001a\u0019\u0010\u0018\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0010\u001a\u0011\u0010\u0019\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001e\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u001c*\n\u0012\u0006\b\u0000\u0012\u00020\u00010\u001b*\u00020\u00002\u0006\u0010\u001d\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 *\u00020\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#*\u00020\u0000¢\u0006\u0004\b$\u0010%\u001a\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010'0&*\u00020\u0000¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010+\u001a\u00020**\u00020\u0000¢\u0006\u0004\b+\u0010,\u001a!\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0.*\u00020\u00002\u0006\u0010-\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u00100\u001a5\u00103\u001a\b\u0012\u0004\u0012\u00020\r0.*\u00020\u00002\u0006\u0010-\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020*H\u0007¢\u0006\u0004\b3\u00104\u001aO\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000.\"\u0004\b\u0000\u00105*\u00020\u00002\u0006\u0010-\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u00102\u001a\u00020*2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u000006H\u0007¢\u0006\u0004\b3\u00108\u001a\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000109*\u00020\u0000¢\u0006\u0004\b:\u0010;¨\u0006<"}, m3636d2 = {"", "", "first", "(Ljava/lang/CharSequence;)C", "firstOrNull", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getOrNull", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "last", "single", "singleOrNull", "", Constants.RequestParamsKeys.APP_NAME_KEY, "drop", "(Ljava/lang/String;I)Ljava/lang/String;", "dropLast", "Lkotlin/ranges/IntRange;", "indices", "slice", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "take", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "takeLast", "reversed", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "C", "destination", "toCollection", "(Ljava/lang/CharSequence;Ljava/util/Collection;)Ljava/util/Collection;", "", "toMutableList", "(Ljava/lang/CharSequence;)Ljava/util/List;", "", "toSet", "(Ljava/lang/CharSequence;)Ljava/util/Set;", "", "Lkotlin/collections/IndexedValue;", "withIndex", "(Ljava/lang/CharSequence;)Ljava/lang/Iterable;", "", "any", "(Ljava/lang/CharSequence;)Z", "size", "", "chunked", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "step", "partialWindows", "windowed", "(Ljava/lang/CharSequence;IIZ)Ljava/util/List;", "R", "Lkotlin/Function1;", "transform", "(Ljava/lang/CharSequence;IIZLkotlin/jvm/functions/Function1;)Ljava/util/List;", "Lkotlin/sequences/Sequence;", "asSequence", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/text/StringsKt")
@SourceDebugExtension
/* renamed from: kotlin.text.StringsKt___StringsKt, reason: use source file name */
/* loaded from: classes23.dex */
public class _Strings extends _StringsJvm {
    public static char first(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(0);
    }

    public static Character firstOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(0));
    }

    public static Character getOrNull(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0 || i >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i));
    }

    public static char last(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(StringsKt__StringsKt.getLastIndex(charSequence));
    }

    public static char single(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static Character singleOrNull(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }

    public static String drop(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        String strSubstring = str.substring(RangesKt.coerceAtMost(i, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String dropLast(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        return take(str, RangesKt.coerceAtLeast(str.length() - i, 0));
    }

    public static String slice(String str, PrimitiveRanges2 indices) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? "" : StringsKt__StringsKt.substring(str, indices);
    }

    public static CharSequence take(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        return charSequence.subSequence(0, RangesKt.coerceAtMost(i, charSequence.length()));
    }

    public static String take(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        String strSubstring = str.substring(0, RangesKt.coerceAtMost(i, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String takeLast(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
        }
        int length = str.length();
        String strSubstring = str.substring(length - RangesKt.coerceAtMost(i, length));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence reversed(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new StringBuilder(charSequence).reverse();
    }

    public static final <C extends Collection<? super Character>> C toCollection(CharSequence charSequence, C destination) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (int i = 0; i < charSequence.length(); i++) {
            destination.add(Character.valueOf(charSequence.charAt(i)));
        }
        return destination;
    }

    public static List<Character> toMutableList(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (List) toCollection(charSequence, new ArrayList(charSequence.length()));
    }

    public static Set<Character> toSet(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            return SetsKt.emptySet();
        }
        if (length == 1) {
            return SetsKt.setOf(Character.valueOf(charSequence.charAt(0)));
        }
        return (Set) toCollection(charSequence, new LinkedHashSet(MapsKt.mapCapacity(RangesKt.coerceAtMost(charSequence.length(), 128))));
    }

    public static Iterable<IndexedValue<Character>> withIndex(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new IndexingIterable(new Function0() { // from class: kotlin.text.StringsKt___StringsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        });
    }

    public static boolean any(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return !(charSequence.length() == 0);
    }

    @SinceKotlin
    public static List<String> chunked(CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i, true);
    }

    @SinceKotlin
    public static final List<String> windowed(CharSequence charSequence, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return windowed(charSequence, i, i2, z, new Function1() { // from class: kotlin.text.StringsKt___StringsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return _Strings.windowed$lambda$23$StringsKt___StringsKt((CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String windowed$lambda$23$StringsKt___StringsKt(CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    @SinceKotlin
    public static final <R> List<R> windowed(CharSequence charSequence, int i, int i2, boolean z, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        SlidingWindow3.checkWindowSizeStep(i, i2);
        int length = charSequence.length();
        int i3 = 0;
        ArrayList arrayList = new ArrayList((length / i2) + (length % i2 == 0 ? 0 : 1));
        while (i3 >= 0 && i3 < length) {
            int i4 = i3 + i;
            if (i4 < 0 || i4 > length) {
                if (!z) {
                    break;
                }
                i4 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i3, i4)));
            i3 += i2;
        }
        return arrayList;
    }

    public static Sequence<Character> asSequence(final CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return ((charSequence instanceof String) && charSequence.length() == 0) ? SequencesKt.emptySequence() : new Sequence<Character>() { // from class: kotlin.text.StringsKt___StringsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<Character> iterator() {
                return StringsKt__StringsKt.iterator(charSequence);
            }
        };
    }
}
