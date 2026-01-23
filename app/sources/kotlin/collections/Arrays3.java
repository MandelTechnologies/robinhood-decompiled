package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Arrays.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a?\u0010\u000e\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"T", "", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringImpl", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "result", "", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "contentDeepToStringInternal", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
/* renamed from: kotlin.collections.ArraysKt__ArraysKt, reason: use source file name */
/* loaded from: classes21.dex */
public class Arrays3 extends ArraysJVM {
    @SinceKotlin
    @PublishedApi
    @JvmName
    public static <T> String contentDeepToString(T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder((RangesKt.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new ArrayList());
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
                Unit unit = Unit.INSTANCE;
            } else if (objArr instanceof byte[]) {
                String string2 = Arrays.toString((byte[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                sb.append(string2);
            } else if (objArr instanceof short[]) {
                String string3 = Arrays.toString((short[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                sb.append(string3);
            } else if (objArr instanceof int[]) {
                String string4 = Arrays.toString((int[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                sb.append(string4);
            } else if (objArr instanceof long[]) {
                String string5 = Arrays.toString((long[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string5, "toString(...)");
                sb.append(string5);
            } else if (objArr instanceof float[]) {
                String string6 = Arrays.toString((float[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string6, "toString(...)");
                sb.append(string6);
            } else if (objArr instanceof double[]) {
                String string7 = Arrays.toString((double[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string7, "toString(...)");
                sb.append(string7);
            } else if (objArr instanceof char[]) {
                String string8 = Arrays.toString((char[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string8, "toString(...)");
                sb.append(string8);
            } else if (objArr instanceof boolean[]) {
                String string9 = Arrays.toString((boolean[]) objArr);
                Intrinsics.checkNotNullExpressionValue(string9, "toString(...)");
                sb.append(string9);
            } else if (objArr instanceof UByteArray) {
                sb.append(UArraysKt.m28673contentToString2csIQuQ(((UByteArray) objArr).getStorage()));
            } else if (objArr instanceof UShortArray) {
                sb.append(UArraysKt.m28675contentToStringd6D3K8(((UShortArray) objArr).getStorage()));
            } else if (objArr instanceof UIntArray) {
                sb.append(UArraysKt.m28674contentToStringXUkPCBk(((UIntArray) objArr).getStorage()));
            } else if (objArr instanceof ULongArray) {
                sb.append(UArraysKt.m28676contentToStringuLth9ew(((ULongArray) objArr).getStorage()));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }
}
