package androidx.paging;

import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: PagedStorage.jvm.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\"\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001\\B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\b\u0012\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0006\u0010\tJA\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u001eJ\u0017\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010$2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b'\u0010!J\u001d\u0010(\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b*\u0010)J%\u0010,\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n¢\u0006\u0004\b,\u0010\u0019J/\u00100\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b.\u0010/J/\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b1\u0010/J-\u00105\u001a\u00020\u00122\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b3\u00104J-\u00107\u001a\u00020\u00122\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b6\u00104J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:R$\u0010<\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\f0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R$\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR$\u0010C\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR$\u0010\u000f\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bE\u0010BR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010FR$\u0010G\u001a\u00020\n2\u0006\u0010>\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u0016\u0010I\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010@R\u0014\u0010L\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR$\u0010S\u001a\u00020\n2\u0006\u0010O\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010B\"\u0004\bQ\u0010RR\u0011\u0010U\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bT\u0010BR\u0016\u0010W\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010KR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010KR\u0014\u0010[\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010B¨\u0006]"}, m3636d2 = {"Landroidx/paging/PagedStorage;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Landroidx/paging/PlaceholderPaddedList;", "<init>", "()V", "other", "(Landroidx/paging/PagedStorage;)V", "", "leadingNulls", "Landroidx/paging/PagingSource$LoadResult$Page;", "page", "trailingNulls", "positionOffset", "", "counted", "", "init", "(ILandroidx/paging/PagingSource$LoadResult$Page;IIZ)V", "maxSize", "requiredRemaining", "localPageIndex", "needsTrim", "(III)Z", "snapshot", "()Landroidx/paging/PagedStorage;", "Landroidx/paging/PagedStorage$Callback;", "callback", "(ILandroidx/paging/PagingSource$LoadResult$Page;IILandroidx/paging/PagedStorage$Callback;Z)V", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getItem", "(I)Ljava/lang/Object;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingState;", "getRefreshKeyInfo", "(Landroidx/paging/PagedList$Config;)Landroidx/paging/PagingState;", "get", "needsTrimFromFront", "(II)Z", "needsTrimFromEnd", "countToBeAdded", "shouldPreTrimNewPage", "insertNulls", "trimFromFront$paging_common_release", "(ZIILandroidx/paging/PagedStorage$Callback;)Z", "trimFromFront", "trimFromEnd$paging_common_release", "trimFromEnd", "prependPage$paging_common_release", "(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedStorage$Callback;)V", "prependPage", "appendPage$paging_common_release", "appendPage", "", "toString", "()Ljava/lang/String;", "", "pages", "Ljava/util/List;", "<set-?>", "placeholdersBefore", "I", "getPlaceholdersBefore", "()I", "placeholdersAfter", "getPlaceholdersAfter", "getPositionOffset", "Z", "dataCount", "getDataCount", "lastLoadAroundLocalIndex", "getFirstLoadedItem$paging_common_release", "()Ljava/lang/Object;", "firstLoadedItem", "getLastLoadedItem$paging_common_release", "lastLoadedItem", "value", "getLastLoadAroundIndex", "setLastLoadAroundIndex", "(I)V", "lastLoadAroundIndex", "getMiddleOfLoadedRange", "middleOfLoadedRange", "getPrevKey", "prevKey", "getNextKey", "nextKey", "getSize", "size", "Callback", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PagedStorage<T> extends AbstractList<T> implements LegacyPageFetcher.KeyProvider<Object>, PlaceholderPaddedList<T> {
    private boolean counted;
    private int dataCount;
    private int lastLoadAroundLocalIndex;
    private final List<PagingSource.LoadResult.Page<?, T>> pages;
    private int placeholdersAfter;
    private int placeholdersBefore;
    private int positionOffset;

    /* compiled from: PagedStorage.jvm.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m3636d2 = {"Landroidx/paging/PagedStorage$Callback;", "", "onInitialized", "", "count", "", "onPageAppended", "endPosition", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "added", "onPagePrepended", "leadingNulls", "onPagesRemoved", "startOfDrops", "onPagesSwappedToPlaceholder", "paging-common_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface Callback {
        void onInitialized(int count);

        void onPageAppended(int endPosition, int changed, int added);

        void onPagePrepended(int leadingNulls, int changed, int added);

        void onPagesRemoved(int startOfDrops, int count);

        void onPagesSwappedToPlaceholder(int startOfDrops, int count);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) removeAt(i);
    }

    public /* bridge */ Object removeAt(int i) {
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final T getFirstLoadedItem$paging_common_release() {
        return (T) CollectionsKt.first(((PagingSource.LoadResult.Page) CollectionsKt.first((List) this.pages)).getData());
    }

    public final T getLastLoadedItem$paging_common_release() {
        return (T) CollectionsKt.last(((PagingSource.LoadResult.Page) CollectionsKt.last((List) this.pages)).getData());
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getDataCount() {
        return this.dataCount;
    }

    public final int getLastLoadAroundIndex() {
        return getPlaceholdersBefore() + this.lastLoadAroundLocalIndex;
    }

    public final void setLastLoadAroundIndex(int i) {
        this.lastLoadAroundLocalIndex = RangesKt.coerceIn(i - getPlaceholdersBefore(), 0, getDataCount() - 1);
    }

    public final int getMiddleOfLoadedRange() {
        return getPlaceholdersBefore() + (getDataCount() / 2);
    }

    public PagedStorage() {
        this.pages = new ArrayList();
        this.counted = true;
    }

    private PagedStorage(PagedStorage<T> pagedStorage) {
        ArrayList arrayList = new ArrayList();
        this.pages = arrayList;
        this.counted = true;
        arrayList.addAll(pagedStorage.pages);
        this.placeholdersBefore = pagedStorage.getPlaceholdersBefore();
        this.placeholdersAfter = pagedStorage.getPlaceholdersAfter();
        this.positionOffset = pagedStorage.positionOffset;
        this.counted = pagedStorage.counted;
        this.dataCount = pagedStorage.getDataCount();
        this.lastLoadAroundLocalIndex = pagedStorage.lastLoadAroundLocalIndex;
    }

    public final PagedStorage<T> snapshot() {
        return new PagedStorage<>(this);
    }

    private final void init(int leadingNulls, PagingSource.LoadResult.Page<?, T> page, int trailingNulls, int positionOffset, boolean counted) {
        this.placeholdersBefore = leadingNulls;
        this.pages.clear();
        this.pages.add(page);
        this.placeholdersAfter = trailingNulls;
        this.positionOffset = positionOffset;
        this.dataCount = page.getData().size();
        this.counted = counted;
        this.lastLoadAroundLocalIndex = page.getData().size() / 2;
    }

    public final void init(int leadingNulls, PagingSource.LoadResult.Page<?, T> page, int trailingNulls, int positionOffset, Callback callback, boolean counted) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(callback, "callback");
        init(leadingNulls, page, trailingNulls, positionOffset, counted);
        callback.onInitialized(size());
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public Object getPrevKey() {
        if (!this.counted || getPlaceholdersBefore() + this.positionOffset > 0) {
            return ((PagingSource.LoadResult.Page) CollectionsKt.first((List) this.pages)).getPrevKey();
        }
        return null;
    }

    @Override // androidx.paging.LegacyPageFetcher.KeyProvider
    public Object getNextKey() {
        if (!this.counted || getPlaceholdersAfter() > 0) {
            return ((PagingSource.LoadResult.Page) CollectionsKt.last((List) this.pages)).getNextKey();
        }
        return null;
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public T getItem(int index) {
        int size = this.pages.size();
        int i = 0;
        while (i < size) {
            int size2 = this.pages.get(i).getData().size();
            if (size2 > index) {
                break;
            }
            index -= size2;
            i++;
        }
        return this.pages.get(i).getData().get(index);
    }

    public final PagingState<?, T> getRefreshKeyInfo(PagedList.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.pages.isEmpty()) {
            return null;
        }
        List list = CollectionsKt.toList(this.pages);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
        return new PagingState<>(list, Integer.valueOf(getLastLoadAroundIndex()), new PagingConfig(config.pageSize, config.prefetchDistance, config.enablePlaceholders, config.initialLoadSizeHint, config.maxSize, 0, 32, null), getPlaceholdersBefore());
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int index) {
        int placeholdersBefore = index - getPlaceholdersBefore();
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        if (placeholdersBefore < 0 || placeholdersBefore >= getDataCount()) {
            return null;
        }
        return getItem(placeholdersBefore);
    }

    @Override // androidx.paging.PlaceholderPaddedList
    public int getSize() {
        return getPlaceholdersBefore() + getDataCount() + getPlaceholdersAfter();
    }

    private final boolean needsTrim(int maxSize, int requiredRemaining, int localPageIndex) {
        return getDataCount() > maxSize && this.pages.size() > 2 && getDataCount() - this.pages.get(localPageIndex).getData().size() >= requiredRemaining;
    }

    public final boolean needsTrimFromFront(int maxSize, int requiredRemaining) {
        return needsTrim(maxSize, requiredRemaining, 0);
    }

    public final boolean needsTrimFromEnd(int maxSize, int requiredRemaining) {
        return needsTrim(maxSize, requiredRemaining, this.pages.size() - 1);
    }

    public final boolean shouldPreTrimNewPage(int maxSize, int requiredRemaining, int countToBeAdded) {
        return getDataCount() + countToBeAdded > maxSize && this.pages.size() > 1 && getDataCount() >= requiredRemaining;
    }

    public final boolean trimFromFront$paging_common_release(boolean insertNulls, int maxSize, int requiredRemaining, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i = 0;
        while (needsTrimFromFront(maxSize, requiredRemaining)) {
            int size = this.pages.remove(0).getData().size();
            i += size;
            this.dataCount = getDataCount() - size;
        }
        this.lastLoadAroundLocalIndex = RangesKt.coerceAtLeast(this.lastLoadAroundLocalIndex - i, 0);
        if (i > 0) {
            if (insertNulls) {
                int placeholdersBefore = getPlaceholdersBefore();
                this.placeholdersBefore = getPlaceholdersBefore() + i;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i);
            } else {
                this.positionOffset += i;
                callback.onPagesRemoved(getPlaceholdersBefore(), i);
            }
        }
        return i > 0;
    }

    public final boolean trimFromEnd$paging_common_release(boolean insertNulls, int maxSize, int requiredRemaining, Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i = 0;
        while (needsTrimFromEnd(maxSize, requiredRemaining)) {
            List<PagingSource.LoadResult.Page<?, T>> list = this.pages;
            int size = list.remove(list.size() - 1).getData().size();
            i += size;
            this.dataCount = getDataCount() - size;
        }
        this.lastLoadAroundLocalIndex = RangesKt.coerceAtMost(this.lastLoadAroundLocalIndex, getDataCount() - 1);
        if (i > 0) {
            int placeholdersBefore = getPlaceholdersBefore() + getDataCount();
            if (insertNulls) {
                this.placeholdersAfter = getPlaceholdersAfter() + i;
                callback.onPagesSwappedToPlaceholder(placeholdersBefore, i);
            } else {
                callback.onPagesRemoved(placeholdersBefore, i);
            }
        }
        return i > 0;
    }

    public final void prependPage$paging_common_release(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.getData().size();
        if (size == 0) {
            return;
        }
        this.pages.add(0, page);
        this.dataCount = getDataCount() + size;
        int iMin = Math.min(getPlaceholdersBefore(), size);
        int i = size - iMin;
        if (iMin != 0) {
            this.placeholdersBefore = getPlaceholdersBefore() - iMin;
        }
        this.positionOffset -= i;
        if (callback != null) {
            callback.onPagePrepended(getPlaceholdersBefore(), iMin, i);
        }
    }

    public final void appendPage$paging_common_release(PagingSource.LoadResult.Page<?, T> page, Callback callback) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.getData().size();
        if (size == 0) {
            return;
        }
        this.pages.add(page);
        this.dataCount = getDataCount() + size;
        int iMin = Math.min(getPlaceholdersAfter(), size);
        int i = size - iMin;
        if (iMin != 0) {
            this.placeholdersAfter = getPlaceholdersAfter() - iMin;
        }
        if (callback != null) {
            callback.onPageAppended((getPlaceholdersBefore() + getDataCount()) - size, iMin, i);
        }
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return "leading " + getPlaceholdersBefore() + ", dataCount " + getDataCount() + ", trailing " + getPlaceholdersAfter() + ' ' + CollectionsKt.joinToString$default(this.pages, PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null);
    }
}
