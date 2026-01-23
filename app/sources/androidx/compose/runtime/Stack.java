package androidx.compose.runtime;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Stack.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0016J\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b\u001f\u0010 R\u0011\u0010$\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0088\u0001\u0005\u0092\u0001\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004¨\u0006%"}, m3636d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "backing", "constructor-impl", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "value", "", "push-impl", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "push", "pop-impl", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "peek-impl", "peek", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Ljava/util/ArrayList;I)Ljava/lang/Object;", "isEmpty-impl", "(Ljava/util/ArrayList;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "", "clear-impl", "(Ljava/util/ArrayList;)V", "clear", "", "toArray-impl", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "toArray", "getSize-impl", "(Ljava/util/ArrayList;)I", "size", "runtime_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class Stack<T> {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m6378constructorimpl(ArrayList<T> arrayList) {
        return arrayList;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m6379constructorimpl$default(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m6378constructorimpl(arrayList);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m6380getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m6386pushimpl(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final T m6385popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m6380getSizeimpl(arrayList) - 1);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m6383peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m6380getSizeimpl(arrayList) - 1);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m6384peekimpl(ArrayList<T> arrayList, int i) {
        return arrayList.get(i);
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m6381isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m6382isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m6381isEmptyimpl(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m6377clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m6387toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            tArr[i] = arrayList.get(i);
        }
        return tArr;
    }
}
