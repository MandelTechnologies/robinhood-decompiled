package kotlinx.collections.immutable.implementations.immutableList;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"E", "Lkotlinx/collections/immutable/PersistentList;", "persistentVectorOf", "()Lkotlinx/collections/immutable/PersistentList;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "shift", "indexSegment", "(II)I", "vectorSize", "rootSize", "(I)I", "kotlinx-collections-immutable"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class UtilsKt {
    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final int rootSize(int i) {
        return (i - 1) & (-32);
    }

    public static final <E> ImmutableList3<E> persistentVectorOf() {
        return SmallPersistentVector.INSTANCE.getEMPTY();
    }
}
