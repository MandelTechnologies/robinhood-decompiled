package com.robinhood.utils.paging;

import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.utils.extensions.Sequences;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: InterlacedDataSource.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0001;BT\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\n\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u0016*\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0082\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0014J$\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u001e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0002J+\u0010$\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0002¢\u0006\u0002\u0010%J$\u0010&\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000'2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0016J$\u0010)\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000'2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010(H\u0016JA\u0010*\u001a\n\u0012\u0004\u0012\u0002H+\u0018\u00010\u0006\"\u0004\b\u0002\u0010+2)\u0010,\u001a%\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H+0-0\f¢\u0006\u0002\b\rH\u0002J\b\u0010.\u001a\u00020\u001dH\u0016J\u001f\u0010/\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0006H\u0002¢\u0006\u0002\u00100J\u001f\u00101\u001a\u0004\u0018\u00018\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0006H\u0002¢\u0006\u0002\u00100J;\u00102\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u00104\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u00105J+\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00062\u0006\u00103\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00107J+\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00062\u0006\u00104\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00107J3\u00109\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00062\u0006\u00103\u001a\u00028\u00002\u0006\u00104\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00105J\u0012\u0010:\u001a\u00020\u001d*\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0002\b\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0012\u001a\u00028\u0000*\u00028\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00010\tj\b\u0012\u0004\u0012\u00028\u0001`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m3636d2 = {"Lcom/robinhood/utils/paging/InterlacedDataSource;", "KeyT", "", "ValueT", "Landroidx/paging/ItemKeyedDataSource;", "loaders", "", "Lcom/robinhood/utils/paging/PaginationLoader;", "keyComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "keySelector", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/util/List;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "key", "nameConflictsWithGetKey", "(Ljava/lang/Object;)Ljava/lang/Object;", "compareTo", "", "other", "(Ljava/lang/Object;Ljava/lang/Object;)I", "valueComparator", "getKey", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "loadInitial", "", "params", "Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "callback", "Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "loadBeginning", "requestedLoadSize", "loadAround", "(Ljava/lang/Object;ILandroidx/paging/ItemKeyedDataSource$LoadInitialCallback;)V", "loadBefore", "Landroidx/paging/ItemKeyedDataSource$LoadParams;", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "loadAfter", "eachLoader", "R", "query", "Lio/reactivex/Observable;", "invalidate", "computeLowerBound", "(Ljava/util/List;)Ljava/lang/Object;", "computeUpperBound", "merge", "lowerBound", "upperBound", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;", "mergeLowerBounded", "(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "mergeUpperBounded", "mergeFullyBounded", "validateStrictOrdering", "Factory", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class InterlacedDataSource<KeyT, ValueT> extends ItemKeyedDataSource<KeyT, ValueT> {
    private final CompositeDisposable disposables;
    private final Comparator<KeyT> keyComparator;
    private final Function1<ValueT, KeyT> keySelector;
    private final List<PaginationLoader<KeyT, ValueT>> loaders;
    private final Comparator<ValueT> valueComparator;

    public /* synthetic */ InterlacedDataSource(List list, Comparator comparator, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, comparator, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterlacedDataSource(List<? extends PaginationLoader<? super KeyT, ? extends ValueT>> list, Comparator<KeyT> comparator, Function1<? super ValueT, ? extends KeyT> function1) {
        this.loaders = list;
        this.keyComparator = comparator;
        this.keySelector = function1;
        this.disposables = new CompositeDisposable();
        this.valueComparator = new Comparator(this) { // from class: com.robinhood.utils.paging.InterlacedDataSource$valueComparator$1
            final /* synthetic */ InterlacedDataSource<KeyT, ValueT> this$0;

            {
                this.this$0 = this;
            }

            @Override // java.util.Comparator
            public final int compare(ValueT valuet, ValueT valuet2) {
                InterlacedDataSource<KeyT, ValueT> interlacedDataSource = this.this$0;
                Intrinsics.checkNotNull(valuet);
                Object objNameConflictsWithGetKey = interlacedDataSource.nameConflictsWithGetKey(valuet);
                InterlacedDataSource<KeyT, ValueT> interlacedDataSource2 = this.this$0;
                Intrinsics.checkNotNull(valuet2);
                return interlacedDataSource.compareTo(objNameConflictsWithGetKey, interlacedDataSource2.nameConflictsWithGetKey(valuet2));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public final KeyT nameConflictsWithGetKey(ValueT valuet) {
        return this.keySelector.invoke(valuet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int compareTo(KeyT keyt, KeyT keyt2) {
        Intrinsics.checkNotNullParameter(keyt, "<this>");
        return this.keyComparator.compare(keyt, keyt2);
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public KeyT getKey(ValueT item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return nameConflictsWithGetKey(item);
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadInitial(ItemKeyedDataSource.LoadInitialParams<KeyT> params, ItemKeyedDataSource.LoadInitialCallback<ValueT> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        KeyT keyt = params.requestedInitialKey;
        if (keyt != null) {
            loadAround(keyt, params.requestedLoadSize, callback);
        } else {
            loadBeginning(params.requestedLoadSize, callback);
        }
    }

    private final void loadBeginning(final int requestedLoadSize, ItemKeyedDataSource.LoadInitialCallback<ValueT> callback) {
        Iterable iterableEachLoader = eachLoader(new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.loadBeginning$lambda$0(requestedLoadSize, (PaginationLoader) obj);
            }
        });
        if (iterableEachLoader == null) {
            return;
        }
        Iterable iterable = iterableEachLoader;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((BeginningLoad) it.next()).getData());
        }
        Iterator it2 = iterable.iterator();
        int totalCount = 0;
        while (it2.hasNext()) {
            totalCount += ((BeginningLoad) it2.next()).getTotalCount();
        }
        KeyT keytComputeUpperBound = computeUpperBound(arrayList);
        if (keytComputeUpperBound == null) {
            callback.onResult(CollectionsKt.emptyList());
            return;
        }
        List<ValueT> listMergeUpperBounded = mergeUpperBounded(arrayList, keytComputeUpperBound);
        if (listMergeUpperBounded.size() > totalCount || (listMergeUpperBounded.isEmpty() && totalCount > 0)) {
            invalidate();
        } else {
            callback.onResult(listMergeUpperBounded, 0, totalCount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable loadBeginning$lambda$0(int i, PaginationLoader eachLoader) {
        Intrinsics.checkNotNullParameter(eachLoader, "$this$eachLoader");
        return InterlacedDataSource8.loadBeginning(eachLoader, i);
    }

    private final void loadAround(final KeyT key, final int requestedLoadSize, ItemKeyedDataSource.LoadInitialCallback<ValueT> callback) {
        Iterable iterableEachLoader = eachLoader(new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.loadAround$lambda$3(key, requestedLoadSize, (PaginationLoader) obj);
            }
        });
        if (iterableEachLoader == null) {
            return;
        }
        Iterable iterable = iterableEachLoader;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((AroundLoad) it.next()).getBefore());
        }
        List listMerge$default = merge$default(this, arrayList, computeLowerBound(arrayList), null, 2, null);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((AroundLoad) it2.next()).getBoundary());
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((AroundLoad) it3.next()).getAfter());
        }
        List<? extends ValueT> list = SequencesKt.toList(SequencesKt.plus(SequencesKt.plus(CollectionsKt.asSequence(listMerge$default), (Iterable) arrayList2), CollectionsKt.asSequence(merge$default(this, arrayList3, null, computeUpperBound(arrayList3), 1, null))));
        Iterator it4 = iterable.iterator();
        int totalCount = 0;
        int position = 0;
        while (it4.hasNext()) {
            position += ((AroundLoad) it4.next()).getPosition();
        }
        int size = position - listMerge$default.size();
        Iterator it5 = iterable.iterator();
        while (it5.hasNext()) {
            totalCount += ((AroundLoad) it5.next()).getTotalCount();
        }
        if (list.size() > totalCount || ((list.isEmpty() && totalCount > 0) || list.size() + size > totalCount || size < 0)) {
            invalidate();
        } else {
            callback.onResult(list, size, totalCount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable loadAround$lambda$3(Object obj, int i, PaginationLoader eachLoader) {
        Intrinsics.checkNotNullParameter(eachLoader, "$this$eachLoader");
        return InterlacedDataSource8.loadAround(eachLoader, obj, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.paging.ItemKeyedDataSource
    public void loadBefore(ItemKeyedDataSource.LoadParams<KeyT> params, ItemKeyedDataSource.LoadCallback<ValueT> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final KeyT keyt = params.key;
        final int i = params.requestedLoadSize;
        List listEachLoader = eachLoader(new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.loadBefore$lambda$9(keyt, i, (PaginationLoader) obj);
            }
        });
        if (listEachLoader == null) {
            return;
        }
        Object objComputeLowerBound = computeLowerBound(listEachLoader);
        if (objComputeLowerBound == null) {
            callback.onResult(CollectionsKt.emptyList());
        } else {
            callback.onResult(mergeLowerBounded(listEachLoader, objComputeLowerBound));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable loadBefore$lambda$9(Object obj, int i, PaginationLoader eachLoader) {
        Intrinsics.checkNotNullParameter(eachLoader, "$this$eachLoader");
        return eachLoader.loadBefore(obj, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.paging.ItemKeyedDataSource
    public void loadAfter(ItemKeyedDataSource.LoadParams<KeyT> params, ItemKeyedDataSource.LoadCallback<ValueT> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final KeyT keyt = params.key;
        final int i = params.requestedLoadSize;
        List listEachLoader = eachLoader(new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.loadAfter$lambda$10(keyt, i, (PaginationLoader) obj);
            }
        });
        if (listEachLoader == null) {
            return;
        }
        Object objComputeUpperBound = computeUpperBound(listEachLoader);
        if (objComputeUpperBound == null) {
            callback.onResult(CollectionsKt.emptyList());
        } else {
            callback.onResult(mergeUpperBounded(listEachLoader, objComputeUpperBound));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Observable loadAfter$lambda$10(Object obj, int i, PaginationLoader eachLoader) {
        Intrinsics.checkNotNullParameter(eachLoader, "$this$eachLoader");
        return eachLoader.loadAfter(obj, i);
    }

    private final <R> List<R> eachLoader(Function1<? super PaginationLoader<? super KeyT, ? extends ValueT>, ? extends Observable<R>> query) {
        List<PaginationLoader<KeyT, ValueT>> list = this.loaders;
        ArrayList<Observable> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Observable<R> observableRefCount = query.invoke((PaginationLoader) it.next()).distinctUntilChanged().take(2L).publish(new Function() { // from class: com.robinhood.utils.paging.InterlacedDataSource$eachLoader$resultObservables$1$1
                @Override // io.reactivex.functions.Function
                public final ObservableSource<R> apply(Observable<R> observable) {
                    Intrinsics.checkNotNullParameter(observable, "observable");
                    return Observable.merge(observable.take(1L), observable.skip(1L).ignoreElements().toObservable());
                }
            }).doOnTerminate(new Action(this) { // from class: com.robinhood.utils.paging.InterlacedDataSource$eachLoader$resultObservables$1$2
                final /* synthetic */ InterlacedDataSource<KeyT, ValueT> this$0;

                {
                    this.this$0 = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    this.this$0.invalidate();
                }
            }).doOnDispose(new Action(this) { // from class: com.robinhood.utils.paging.InterlacedDataSource$eachLoader$resultObservables$1$3
                final /* synthetic */ InterlacedDataSource<KeyT, ValueT> this$0;

                {
                    this.this$0 = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    this.this$0.invalidate();
                }
            }).replay().refCount();
            Disposable disposableSubscribe = observableRefCount.subscribe();
            if (!this.disposables.add(disposableSubscribe)) {
                disposableSubscribe.dispose();
                return null;
            }
            arrayList.add(observableRefCount);
        }
        try {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (Observable observable : arrayList) {
                if (this.disposables.getDisposed()) {
                    return null;
                }
                arrayList2.add(observable.blockingFirst());
            }
            return arrayList2;
        } catch (NoSuchElementException unused) {
            invalidate();
            return null;
        } catch (RuntimeException e) {
            Iterator<Throwable> itIterator2 = Throwables.causes(e).iterator2();
            while (itIterator2.hasNext()) {
                if (itIterator2.next() instanceof InterruptedException) {
                    invalidate();
                    return null;
                }
            }
            throw e;
        }
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        super.invalidate();
        this.disposables.dispose();
    }

    private final KeyT computeLowerBound(List<? extends List<? extends ValueT>> list) {
        return (KeyT) SequencesKt.maxWithOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.computeLowerBound$lambda$15(this.f$0, (List) obj);
            }
        }), this.keyComparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object computeLowerBound$lambda$15(InterlacedDataSource interlacedDataSource, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        interlacedDataSource.validateStrictOrdering(data);
        Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) data);
        if (objFirstOrNull != null) {
            return interlacedDataSource.nameConflictsWithGetKey(objFirstOrNull);
        }
        return null;
    }

    private final KeyT computeUpperBound(List<? extends List<? extends ValueT>> list) {
        return (KeyT) SequencesKt.minWithOrNull(SequencesKt.mapNotNull(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.computeUpperBound$lambda$16(this.f$0, (List) obj);
            }
        }), this.keyComparator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object computeUpperBound$lambda$16(InterlacedDataSource interlacedDataSource, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        interlacedDataSource.validateStrictOrdering(data);
        Object objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) data);
        if (objLastOrNull != null) {
            return interlacedDataSource.nameConflictsWithGetKey(objLastOrNull);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List merge$default(InterlacedDataSource interlacedDataSource, List list, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        return interlacedDataSource.merge(list, obj, obj2);
    }

    private final List<ValueT> merge(List<? extends List<? extends ValueT>> list, KeyT keyt, KeyT keyt2) {
        if (keyt != null && keyt2 != null) {
            return mergeFullyBounded(list, keyt, keyt2);
        }
        if (keyt != null) {
            return mergeLowerBounded(list, keyt);
        }
        if (keyt2 != null) {
            return mergeUpperBounded(list, keyt2);
        }
        return CollectionsKt.emptyList();
    }

    private final List<ValueT> mergeLowerBounded(List<? extends List<? extends ValueT>> list, final KeyT keyt) {
        return SequencesKt.toList(Sequences.INSTANCE.mergeSorted(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.mergeLowerBounded$lambda$18(this.f$0, keyt, (List) obj);
            }
        }), this.valueComparator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence mergeLowerBounded$lambda$18(final InterlacedDataSource interlacedDataSource, final Object obj, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return SequencesKt.dropWhile(CollectionsKt.asSequence(data), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(InterlacedDataSource.mergeLowerBounded$lambda$18$lambda$17(this.f$0, obj, obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean mergeLowerBounded$lambda$18$lambda$17(InterlacedDataSource interlacedDataSource, Object obj, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return interlacedDataSource.compareTo(interlacedDataSource.nameConflictsWithGetKey(it), obj) < 0;
    }

    private final List<ValueT> mergeUpperBounded(List<? extends List<? extends ValueT>> list, final KeyT keyt) {
        return SequencesKt.toList(Sequences.INSTANCE.mergeSorted(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.mergeUpperBounded$lambda$20(this.f$0, keyt, (List) obj);
            }
        }), this.valueComparator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence mergeUpperBounded$lambda$20(final InterlacedDataSource interlacedDataSource, final Object obj, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return SequencesKt.takeWhile(CollectionsKt.asSequence(data), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(InterlacedDataSource.mergeUpperBounded$lambda$20$lambda$19(this.f$0, obj, obj2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean mergeUpperBounded$lambda$20$lambda$19(InterlacedDataSource interlacedDataSource, Object obj, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return interlacedDataSource.compareTo(interlacedDataSource.nameConflictsWithGetKey(it), obj) <= 0;
    }

    private final List<ValueT> mergeFullyBounded(List<? extends List<? extends ValueT>> list, final KeyT keyt, final KeyT keyt2) {
        return SequencesKt.toList(Sequences.INSTANCE.mergeSorted(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InterlacedDataSource.mergeFullyBounded$lambda$23(this.f$0, keyt, keyt2, (List) obj);
            }
        }), this.valueComparator));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence mergeFullyBounded$lambda$23(final InterlacedDataSource interlacedDataSource, final Object obj, final Object obj2, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return SequencesKt.takeWhile(SequencesKt.dropWhile(CollectionsKt.asSequence(data), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(InterlacedDataSource.mergeFullyBounded$lambda$23$lambda$21(this.f$0, obj, obj3));
            }
        }), new Function1() { // from class: com.robinhood.utils.paging.InterlacedDataSource$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return Boolean.valueOf(InterlacedDataSource.mergeFullyBounded$lambda$23$lambda$22(this.f$0, obj2, obj3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean mergeFullyBounded$lambda$23$lambda$21(InterlacedDataSource interlacedDataSource, Object obj, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return interlacedDataSource.compareTo(interlacedDataSource.nameConflictsWithGetKey(it), obj) < 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean mergeFullyBounded$lambda$23$lambda$22(InterlacedDataSource interlacedDataSource, Object obj, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return interlacedDataSource.compareTo(interlacedDataSource.nameConflictsWithGetKey(it), obj) <= 0;
    }

    private final void validateStrictOrdering(List<? extends ValueT> list) {
        if (list.isEmpty()) {
            return;
        }
        ValueT valuet = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        int i = 1;
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            ValueT valuet2 = list.get(i);
            if (compareTo(nameConflictsWithGetKey(valuet), nameConflictsWithGetKey(valuet2)) >= 0) {
                throw new IllegalStateException(("Elements of upstream data sources must be strictly increasing (found: " + valuet + ", " + valuet2 + ")").toString());
            }
            if (i == lastIndex) {
                return;
            }
            i++;
            valuet = valuet2;
        }
    }

    /* compiled from: InterlacedDataSource.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u0002*\b\b\u0003\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004BR\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00070\u0006\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00020\tj\b\u0012\u0004\u0012\u00028\u0002`\n\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\f¢\u0006\u0002\b\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0011H\u0016R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00028\u00020\tj\b\u0012\u0004\u0012\u00028\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020\f¢\u0006\u0002\b\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/utils/paging/InterlacedDataSource$Factory;", "KeyT", "", "ValueT", "Landroidx/paging/DataSource$Factory;", "loaders", "", "Lcom/robinhood/utils/paging/PaginationLoader;", "keyComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "keySelector", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Ljava/util/List;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/utils/paging/InterlacedDataSource;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Factory<KeyT, ValueT> extends DataSource.Factory<KeyT, ValueT> {
        private final Comparator<KeyT> keyComparator;
        private final Function1<ValueT, KeyT> keySelector;
        private final List<PaginationLoader<KeyT, ValueT>> loaders;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(List<? extends PaginationLoader<? super KeyT, ? extends ValueT>> loaders, Comparator<KeyT> keyComparator, Function1<? super ValueT, ? extends KeyT> keySelector) {
            Intrinsics.checkNotNullParameter(loaders, "loaders");
            Intrinsics.checkNotNullParameter(keyComparator, "keyComparator");
            Intrinsics.checkNotNullParameter(keySelector, "keySelector");
            this.loaders = loaders;
            this.keyComparator = keyComparator;
            this.keySelector = keySelector;
        }

        @Override // androidx.paging.DataSource.Factory
        public InterlacedDataSource<KeyT, ValueT> create() {
            return new InterlacedDataSource<>(this.loaders, this.keyComparator, this.keySelector, null);
        }
    }
}
