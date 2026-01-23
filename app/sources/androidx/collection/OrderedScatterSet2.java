package androidx.collection;

import androidx.collection.internal.ContainerHelpers;
import androidx.collection.internal.RuntimeHelpers;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OrderedScatterSet.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b \u0010!J\u001e\u0010\u001c\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002¢\u0006\u0004\b\u001c\u0010\"J\u0015\u0010#\u001a\u00020\u00192\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\u001bJ\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b$\u0010\u001dJ\u001b\u0010%\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e¢\u0006\u0004\b%\u0010!J\u001e\u0010$\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002¢\u0006\u0004\b$\u0010\"J\u001b\u0010'\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0003H\u0001¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\fJ\u000f\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0004\b,\u0010\fJ\u000f\u0010/\u001a\u00020\u0007H\u0000¢\u0006\u0004\b.\u0010\fJ\u0017\u00102\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0003H\u0000¢\u0006\u0004\b1\u0010\u0006J\u0013\u00104\u001a\b\u0012\u0004\u0012\u00028\u000003¢\u0006\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m3636d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "", "initialCapacity", "<init>", "(I)V", "", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "()V", "element", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "(I)I", "", "mapping", "fixupNodes", "([J)V", "", "([I)V", "", "add", "(Ljava/lang/Object;)Z", "plusAssign", "(Ljava/lang/Object;)V", "", "elements", "addAll", "(Ljava/lang/Iterable;)Z", "(Ljava/lang/Iterable;)V", "remove", "minusAssign", "removeAll", "", "retainAll", "(Ljava/util/Collection;)Z", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "removeElementAt", "clear", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "", "asMutableSet", "()Ljava/util/Set;", "growthLimit", "I", "collection"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.collection.MutableOrderedScatterSet, reason: use source file name */
/* loaded from: classes4.dex */
public final class OrderedScatterSet2<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public /* synthetic */ OrderedScatterSet2(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public OrderedScatterSet2(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpers.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMap7.unloadedCapacity(i));
    }

    private final void initializeStorage(int initialCapacity) {
        long[] emptyNodes;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMap7.normalizeCapacity(initialCapacity)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.elements = iMax == 0 ? ContainerHelpers.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCache.getEmptyNodes();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
            emptyNodes = jArr;
        }
        this.nodes = emptyNodes;
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMap7.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMap7.loadedCapacity(get_capacity()) - this._size;
    }

    public final boolean add(E element) {
        int size = get_size();
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindAbsoluteInsertIndex] = (i & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((iFindAbsoluteInsertIndex & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
        return get_size() != size;
    }

    public final void plusAssign(E element) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(element);
        this.elements[iFindAbsoluteInsertIndex] = element;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[iFindAbsoluteInsertIndex] = (i & 2147483647L) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((iFindAbsoluteInsertIndex & 2147483647L) << 31) | (jArr[i] & (-4611686016279904257L));
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = get_size();
        plusAssign((Iterable) elements);
        return size != get_size();
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = get_size();
        minusAssign((Iterable) elements);
        return size != get_size();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.contains(elements, objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this._size;
    }

    @PublishedApi
    public final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[index];
        int i4 = (int) ((j2 >> 31) & 2147483647L);
        int i5 = (int) (j2 & 2147483647L);
        if (i4 == Integer.MAX_VALUE) {
            this.head = i5;
        } else {
            jArr2[i4] = (jArr2[i4] & (-2147483648L)) | (i5 & 2147483647L);
        }
        if (i5 == Integer.MAX_VALUE) {
            this.tail = i4;
        } else {
            jArr2[i5] = ((i4 & 2147483647L) << 31) | (jArr2[i5] & (-4611686016279904257L));
        }
        jArr2[index] = 4611686018427387903L;
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMap7.EmptyGroup) {
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        ArraysKt.fill(this.elements, (Object) null, 0, this._capacity);
        ArraysKt.fill$default(this.nodes, 4611686018427387903L, 0, 0, 6, (Object) null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i = this._capacity;
        int i2 = hash1 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    private final int findAbsoluteInsertIndex(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = iFindFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((iFindFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void minusAssign(E element) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            removeElementAt(iNumberOfTrailingZeros);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(E element) {
        int iNumberOfTrailingZeros;
        int iHashCode = (element != null ? element.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE;
        int i3 = this._capacity;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (i2 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            removeElementAt(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8 && Long.compare(ULong.m28605constructorimpl(ULong.m28605constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m28605constructorimpl(ULong.m28605constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) <= 0) {
            dropDeletes$collection();
        } else {
            resizeStorage$collection(ScatterMap7.nextCapacity(this._capacity));
        }
    }

    public final void dropDeletes$collection() {
        int i;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i2 = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i2];
        long j = 9223372034707292159L;
        int i3 = 0;
        ArraysKt.fill(jArr3, 9223372034707292159L, 0, i2);
        int i4 = (i2 + 7) >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            long j2 = jArr[i5] & (-9187201950435737472L);
            jArr[i5] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i6 = lastIndex - 1;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i7 = 0;
        while (i7 != i2) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = (jArr[i8] >> i9) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i7];
                int iHashCode = (obj != null ? obj.hashCode() : i3) * (-862048943);
                int i10 = (iHashCode ^ (iHashCode << 16)) >>> 7;
                long j4 = j;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                int i11 = i10 & i2;
                if (((iFindFirstAvailableSlot - i11) & i2) / 8 == ((i7 - i11) & i2) / 8) {
                    jArr[i8] = ((r11 & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) << i9) | (jArr[i8] & (~(255 << i9)));
                    if (jArr3[i7] == j4) {
                        long j5 = i7;
                        jArr3[i7] = j5 | (j5 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i3];
                    i7++;
                    j = j4;
                } else {
                    int i12 = iFindFirstAvailableSlot >> 3;
                    long j6 = jArr[i12];
                    int i13 = (iFindFirstAvailableSlot & 7) << 3;
                    int i14 = i3;
                    if (((j6 >> i13) & 255) == 128) {
                        int i15 = i7;
                        jArr[i12] = (j6 & (~(255 << i13))) | ((r11 & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) << i13);
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                        objArr[iFindFirstAvailableSlot] = objArr[i15];
                        objArr[i15] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i15];
                        jArr2[i15] = 4611686018427387903L;
                        int i16 = (int) ((jArr3[i15] >> 32) & 4294967295L);
                        if (i16 != Integer.MAX_VALUE) {
                            jArr3[i16] = (jArr3[i16] & (-4294967296L)) | iFindFirstAvailableSlot;
                            jArr3[i15] = (jArr3[i15] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i15] = (Integer.MAX_VALUE << 32) | iFindFirstAvailableSlot;
                        }
                        i = i15;
                        jArr3[iFindFirstAvailableSlot] = Integer.MAX_VALUE | (i << 32);
                    } else {
                        jArr[i12] = ((r11 & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE) << i13) | (j6 & (~(255 << i13)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i7];
                        objArr[i7] = obj2;
                        long j7 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i7];
                        jArr2[i7] = j7;
                        int i17 = (int) ((jArr3[i7] >> 32) & 4294967295L);
                        if (i17 != Integer.MAX_VALUE) {
                            long j8 = iFindFirstAvailableSlot;
                            jArr3[i17] = (jArr3[i17] & (-4294967296L)) | j8;
                            jArr3[i7] = (jArr3[i7] & 4294967295L) | (j8 << 32);
                        } else {
                            long j9 = iFindFirstAvailableSlot;
                            jArr3[i7] = j9 | (j9 << 32);
                            i17 = i7;
                        }
                        jArr3[iFindFirstAvailableSlot] = (i17 << 32) | i7;
                        i = i7 - 1;
                    }
                    jArr[jArr.length - 1] = jArr[i14];
                    i7 = i + 1;
                    j = j4;
                    i3 = i14;
                }
            } else {
                i7++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i2 = this._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i3];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i4 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4 >>> 7);
                long j = i4 & EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE;
                int i5 = iFindFirstAvailableSlot >> 3;
                int i6 = (iFindFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j2 = (jArr4[i5] & (~(255 << i6))) | (j << i6);
                jArr4[i5] = j2;
                jArr4[(((iFindFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr3[iFindFirstAvailableSlot] = obj;
                jArr5[iFindFirstAvailableSlot] = jArr3[i3];
                iArr[i3] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i3++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) (j & 2147483647L);
            long j2 = ((j & (-4611686018427387904L)) | (((int) ((j >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[r9] & 4294967295L))) << 31;
            if (i3 != Integer.MAX_VALUE) {
                i2 = (int) (4294967295L & mapping[i3]);
            }
            jArr[i] = i2 | j2;
            i++;
        }
        int i4 = this.head;
        if (i4 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i4] & 4294967295L);
        }
        int i5 = this.tail;
        if (i5 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i5] & 4294967295L);
        }
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) (j & 2147483647L);
            long j2 = ((j & (-4611686018427387904L)) | (((int) ((j >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[r7])) << 31;
            if (i3 != Integer.MAX_VALUE) {
                i2 = mapping[i3];
            }
            jArr[i] = j2 | i2;
            i++;
        }
        int i4 = this.head;
        if (i4 != Integer.MAX_VALUE) {
            this.head = mapping[i4];
        }
        int i5 = this.tail;
        if (i5 != Integer.MAX_VALUE) {
            this.tail = mapping[i5];
        }
    }

    public final Set<E> asMutableSet() {
        return new OrderedScatterSet3(this);
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((OrderedScatterSet2<E>) it.next());
        }
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((OrderedScatterSet2<E>) it.next());
        }
    }
}
