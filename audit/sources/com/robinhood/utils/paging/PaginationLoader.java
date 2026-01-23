package com.robinhood.utils.paging;

import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PaginationLoader.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\n\b\u0001\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u00052\u0006\u0010\f\u001a\u00020\u0006H&J)\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u00052\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u00052\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\tJ)\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\u00052\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/paging/PaginationLoader;", "KeyT", "", "ValueT", "countTotal", "Lio/reactivex/Observable;", "", "countBefore", "key", "(Ljava/lang/Object;)Lio/reactivex/Observable;", "loadFirst", "", "limit", "loadBefore", "(Ljava/lang/Object;I)Lio/reactivex/Observable;", "loadBoundary", "loadAfter", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface PaginationLoader<KeyT, ValueT> {
    Observable<Integer> countBefore(KeyT key);

    Observable<Integer> countTotal();

    Observable<List<ValueT>> loadAfter(KeyT key, int limit);

    Observable<List<ValueT>> loadBefore(KeyT key, int limit);

    Observable<List<ValueT>> loadBoundary(KeyT key);

    Observable<List<ValueT>> loadFirst(int limit);
}
