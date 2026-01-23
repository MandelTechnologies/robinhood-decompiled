package com.robinhood.android.acatsin.partials.search;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.search.SearchContentType;
import com.robinhood.store.search.SearchStore;
import com.robinhood.store.search.SearchStore3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInSearchEquityDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bJ\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityViewState;", "searchStore", "Lcom/robinhood/store/search/SearchStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/search/SearchStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "searchRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "search", "", "query", "onStart", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInSearchEquityDuxo extends BaseDuxo4<AcatsInSearchEquityViewState> {
    public static final int $stable = 8;
    private final PublishRelay<String> searchRelay;
    private final SearchStore searchStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInSearchEquityDuxo(SearchStore searchStore, DuxoBundle duxoBundle) {
        super(new AcatsInSearchEquityViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(searchStore, "searchStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.searchStore = searchStore;
        PublishRelay<String> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.searchRelay = publishRelayCreate;
    }

    public final void search(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() > 0) {
            this.searchRelay.accept(query);
        } else {
            applyMutation(new C80121(null));
        }
    }

    /* compiled from: AcatsInSearchEquityDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityDuxo$search$1", m3645f = "AcatsInSearchEquityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityDuxo$search$1 */
    static final class C80121 extends ContinuationImpl7 implements Function2<AcatsInSearchEquityViewState, Continuation<? super AcatsInSearchEquityViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C80121(Continuation<? super C80121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C80121 c80121 = new C80121(continuation);
            c80121.L$0 = obj;
            return c80121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInSearchEquityViewState acatsInSearchEquityViewState, Continuation<? super AcatsInSearchEquityViewState> continuation) {
            return ((C80121) create(acatsInSearchEquityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((AcatsInSearchEquityViewState) this.L$0).copy(null);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<R> observableSwitchMap = this.searchRelay.switchMap(new Function() { // from class: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends SearchStore3> apply(String query) {
                Intrinsics.checkNotNullParameter(query, "query");
                return SearchStore.search$default(AcatsInSearchEquityDuxo.this.searchStore, query, CollectionsKt.listOf(SearchContentType.INSTRUMENTS), null, null, false, null, 60, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInSearchEquityDuxo.onStart$lambda$0(this.f$0, (SearchStore3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(AcatsInSearchEquityDuxo acatsInSearchEquityDuxo, SearchStore3 searchStore3) {
        acatsInSearchEquityDuxo.applyMutation(new AcatsInSearchEquityDuxo2(searchStore3, null));
        return Unit.INSTANCE;
    }
}
