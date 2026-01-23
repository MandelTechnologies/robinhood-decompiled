package com.robinhood.utils.paging;

import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import com.robinhood.utils.paging.ItemKeyedDataSources8;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ItemKeyedDataSources.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u0001H\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t\u001aF\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\f*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u000f\u001aF\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u0011\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\f*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013\u001aF\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\f0\u0011\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\f*\u00020\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\f0\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"copy", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "KeyT", "", "requestedInitialKey", "requestedLoadSize", "", "placeholdersEnabled", "", "(Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Ljava/lang/Object;IZ)Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "loadInitial", "Lcom/robinhood/utils/paging/ItemKeyedLoadResult;", "ValueT", "Landroidx/paging/ItemKeyedDataSource;", "params", "(Landroidx/paging/ItemKeyedDataSource;Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBefore", "Lcom/robinhood/utils/paging/ItemKeyedLoadResult$Page;", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "(Landroidx/paging/ItemKeyedDataSource;Landroidx/paging/ItemKeyedDataSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAfter", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.paging.ItemKeyedDataSourcesKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ItemKeyedDataSources {
    public static /* synthetic */ ItemKeyedDataSource.LoadInitialParams copy$default(ItemKeyedDataSource.LoadInitialParams loadInitialParams, Object obj, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = loadInitialParams.requestedInitialKey;
        }
        if ((i2 & 2) != 0) {
            i = loadInitialParams.requestedLoadSize;
        }
        if ((i2 & 4) != 0) {
            z = loadInitialParams.placeholdersEnabled;
        }
        return copy(loadInitialParams, obj, i, z);
    }

    public static final <KeyT> ItemKeyedDataSource.LoadInitialParams<KeyT> copy(ItemKeyedDataSource.LoadInitialParams<KeyT> loadInitialParams, KeyT keyt, int i, boolean z) {
        Intrinsics.checkNotNullParameter(loadInitialParams, "<this>");
        return new ItemKeyedDataSource.LoadInitialParams<>(keyt, i, z);
    }

    public static final <KeyT, ValueT> Object loadInitial(ItemKeyedDataSource<KeyT, ValueT> itemKeyedDataSource, ItemKeyedDataSource.LoadInitialParams<KeyT> loadInitialParams, Continuation<? super ItemKeyedDataSources8<? extends ValueT>> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        itemKeyedDataSource.addInvalidatedCallback(new DataSource.InvalidatedCallback() { // from class: com.robinhood.utils.paging.ItemKeyedDataSourcesKt$loadInitial$2$1
            @Override // androidx.paging.DataSource.InvalidatedCallback
            public final void onInvalidated() {
                Continuation<ItemKeyedDataSources8<? extends ValueT>> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new CancellationException())));
            }
        });
        itemKeyedDataSource.loadInitial(loadInitialParams, new ItemKeyedDataSource.LoadInitialCallback<ValueT>() { // from class: com.robinhood.utils.paging.ItemKeyedDataSourcesKt$loadInitial$2$2
            @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends ValueT> data, int position, int totalCount) {
                Intrinsics.checkNotNullParameter(data, "data");
                Continuation<ItemKeyedDataSources8<? extends ValueT>> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(new ItemKeyedDataSources8.Initial(data, position, totalCount)));
            }

            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends ValueT> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                Continuation<ItemKeyedDataSources8<? extends ValueT>> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(new ItemKeyedDataSources8.Page(data)));
            }
        });
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final <KeyT, ValueT> Object loadBefore(ItemKeyedDataSource<KeyT, ValueT> itemKeyedDataSource, ItemKeyedDataSource.LoadParams<KeyT> loadParams, Continuation<? super ItemKeyedDataSources8.Page<? extends ValueT>> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        itemKeyedDataSource.addInvalidatedCallback(new DataSource.InvalidatedCallback() { // from class: com.robinhood.utils.paging.ItemKeyedDataSourcesKt$loadBefore$2$1
            @Override // androidx.paging.DataSource.InvalidatedCallback
            public final void onInvalidated() {
                Continuation<ItemKeyedDataSources8.Page<? extends ValueT>> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new CancellationException())));
            }
        });
        itemKeyedDataSource.loadBefore(loadParams, new ItemKeyedDataSource.LoadCallback<ValueT>() { // from class: com.robinhood.utils.paging.ItemKeyedDataSourcesKt$loadBefore$2$2
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends ValueT> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                Continuation<ItemKeyedDataSources8.Page<? extends ValueT>> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(new ItemKeyedDataSources8.Page(data)));
            }
        });
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static final <KeyT, ValueT> Object loadAfter(ItemKeyedDataSource<KeyT, ValueT> itemKeyedDataSource, ItemKeyedDataSource.LoadParams<KeyT> loadParams, Continuation<? super ItemKeyedDataSources8.Page<? extends ValueT>> continuation) {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        itemKeyedDataSource.addInvalidatedCallback(new DataSource.InvalidatedCallback() { // from class: com.robinhood.utils.paging.ItemKeyedDataSourcesKt$loadAfter$2$1
            @Override // androidx.paging.DataSource.InvalidatedCallback
            public final void onInvalidated() {
                Continuation<ItemKeyedDataSources8.Page<? extends ValueT>> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(new CancellationException())));
            }
        });
        itemKeyedDataSource.loadAfter(loadParams, new ItemKeyedDataSource.LoadCallback<ValueT>() { // from class: com.robinhood.utils.paging.ItemKeyedDataSourcesKt$loadAfter$2$2
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends ValueT> data) {
                Intrinsics.checkNotNullParameter(data, "data");
                Continuation<ItemKeyedDataSources8.Page<? extends ValueT>> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(new ItemKeyedDataSources8.Page(data)));
            }
        });
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
