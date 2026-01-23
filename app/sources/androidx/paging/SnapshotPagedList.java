package androidx.paging;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnapshotPagedList.jvm.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Landroidx/paging/SnapshotPagedList;", "", "T", "Landroidx/paging/PagedList;", "pagedList", "<init>", "(Landroidx/paging/PagedList;)V", "Lkotlin/Function2;", "Landroidx/paging/LoadType;", "Landroidx/paging/LoadState;", "", "callback", "dispatchCurrentLoadState", "(Lkotlin/jvm/functions/Function2;)V", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "loadAroundInternal", "(I)V", "Landroidx/paging/PagedList;", "", "isImmutable", "Z", "()Z", "isDetached", "getLastKey", "()Ljava/lang/Object;", "lastKey", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public final class SnapshotPagedList<T> extends PagedList<T> {
    private final boolean isDetached;
    private final boolean isImmutable;
    private final PagedList<T> pagedList;

    @Override // androidx.paging.PagedList
    public void dispatchCurrentLoadState(Function2<? super LoadType, ? super LoadState, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // androidx.paging.PagedList
    public void loadAroundInternal(int index) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotPagedList(PagedList<T> pagedList) {
        super(pagedList.getPagingSource(), pagedList.getCoroutineScope(), pagedList.getNotifyDispatcher(), pagedList.getStorage$paging_common_release().snapshot(), pagedList.getConfig());
        Intrinsics.checkNotNullParameter(pagedList, "pagedList");
        this.pagedList = pagedList;
        this.isImmutable = true;
        this.isDetached = true;
    }

    @Override // androidx.paging.PagedList
    /* renamed from: isImmutable, reason: from getter */
    public boolean getIsImmutable() {
        return this.isImmutable;
    }

    @Override // androidx.paging.PagedList
    public Object getLastKey() {
        return this.pagedList.getLastKey();
    }

    @Override // androidx.paging.PagedList
    /* renamed from: isDetached, reason: from getter */
    public boolean getIsDetached() {
        return this.isDetached;
    }
}
