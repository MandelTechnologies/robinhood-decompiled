package kotlin.collections.unsigned;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;

/* compiled from: _UArraysJvm.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m3636d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "isEmpty", "()Z", "element", "contains-WZ4Q5Ns", "(I)Z", "contains", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "get-pVg5ArA", "(I)I", "get", "indexOf-WZ4Q5Ns", "indexOf", "lastIndexOf-WZ4Q5Ns", "lastIndexOf", "getSize", "()I", "size", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1, reason: use source file name */
/* loaded from: classes14.dex */
public final class _UArraysJvm2 extends AbstractList<UInt> implements RandomAccess {
    final /* synthetic */ int[] $this_asList;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UInt) {
            return m28657containsWZ4Q5Ns(((UInt) obj).getData());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UInt.m28581boximpl(m28658getpVg5ArA(i));
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UInt) {
            return m28659indexOfWZ4Q5Ns(((UInt) obj).getData());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UInt) {
            return m28660lastIndexOfWZ4Q5Ns(((UInt) obj).getData());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return UIntArray.m28595getSizeimpl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UIntArray.m28597isEmptyimpl(this.$this_asList);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m28657containsWZ4Q5Ns(int element) {
        return UIntArray.m28590containsWZ4Q5Ns(this.$this_asList, element);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public int m28658getpVg5ArA(int index) {
        return UIntArray.m28594getpVg5ArA(this.$this_asList, index);
    }

    /* renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m28659indexOfWZ4Q5Ns(int element) {
        return ArraysKt.indexOf(this.$this_asList, element);
    }

    /* renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m28660lastIndexOfWZ4Q5Ns(int element) {
        return ArraysKt.lastIndexOf(this.$this_asList, element);
    }
}
