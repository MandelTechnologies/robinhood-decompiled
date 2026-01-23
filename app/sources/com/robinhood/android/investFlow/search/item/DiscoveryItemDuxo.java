package com.robinhood.android.investFlow.search.item;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoveryItemDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017J\u0006\u0010\u0018\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00110\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDataState;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "disposedKillswitch", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "assetIdRelay", "Ljava/util/UUID;", "onStart", "", "setData", "assetId", "selectedIds", "", "onDispose", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class DiscoveryItemDuxo extends BaseDuxo<DiscoveryItemDataState, DiscoveryItemViewState> {
    public static final int $stable = 8;
    private final PublishSubject<UUID> assetIdRelay;
    private final PublishSubject<Boolean> disposedKillswitch;
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoveryItemDuxo(InstrumentStore instrumentStore, QuoteStore quoteStore, DuxoBundle duxoBundle) {
        super(new DiscoveryItemDataState(null, null, null, false, 15, null), DiscoveryItemDataState.INSTANCE.getStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instrumentStore = instrumentStore;
        this.quoteStore = quoteStore;
        PublishSubject<Boolean> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.disposedKillswitch = publishSubjectCreate;
        PublishSubject<UUID> publishSubjectCreate2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create(...)");
        this.assetIdRelay = publishSubjectCreate2;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable observableTakeUntil = this.assetIdRelay.distinctUntilChanged().flatMap(new Function() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                DiscoveryItemDuxo.this.instrumentStore.refresh(false, id);
                return DiscoveryItemDuxo.this.instrumentStore.getInstrument(id);
            }
        }).takeUntil(this.disposedKillswitch);
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTakeUntil, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DiscoveryItemDuxo.onStart$lambda$0(this.f$0, (Instrument) obj);
            }
        });
        Observable observableTakeUntil2 = this.assetIdRelay.distinctUntilChanged().flatMap(new Function() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Quote> apply(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                return DiscoveryItemDuxo.this.quoteStore.getStreamQuote().asObservable(id);
            }
        }).throttleLatest(10L, TimeUnit.SECONDS, true).takeUntil(this.disposedKillswitch);
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil2, "takeUntil(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTakeUntil2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DiscoveryItemDuxo.onStart$lambda$1(this.f$0, (Quote) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(DiscoveryItemDuxo discoveryItemDuxo, Instrument instrument) {
        discoveryItemDuxo.applyMutation(new DiscoveryItemDuxo2(instrument, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DiscoveryItemDuxo discoveryItemDuxo, Quote quote) {
        discoveryItemDuxo.applyMutation(new DiscoveryItemDuxo3(quote, null));
        return Unit.INSTANCE;
    }

    /* compiled from: DiscoveryItemDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo$setData$1", m3645f = "DiscoveryItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investFlow.search.item.DiscoveryItemDuxo$setData$1 */
    static final class C194151 extends ContinuationImpl7 implements Function2<DiscoveryItemDataState, Continuation<? super DiscoveryItemDataState>, Object> {
        final /* synthetic */ UUID $assetId;
        final /* synthetic */ List<UUID> $selectedIds;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194151(UUID uuid, List<UUID> list, Continuation<? super C194151> continuation) {
            super(2, continuation);
            this.$assetId = uuid;
            this.$selectedIds = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194151 c194151 = new C194151(this.$assetId, this.$selectedIds, continuation);
            c194151.L$0 = obj;
            return c194151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DiscoveryItemDataState discoveryItemDataState, Continuation<? super DiscoveryItemDataState> continuation) {
            return ((C194151) create(discoveryItemDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DiscoveryItemDataState discoveryItemDataState = (DiscoveryItemDataState) this.L$0;
            UUID uuid = this.$assetId;
            return DiscoveryItemDataState.copy$default(discoveryItemDataState, uuid, null, null, this.$selectedIds.contains(uuid), 6, null);
        }
    }

    public final void setData(UUID assetId, List<UUID> selectedIds) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        applyMutation(new C194151(assetId, selectedIds, null));
        this.assetIdRelay.onNext(assetId);
    }

    public final void onDispose() {
        this.disposedKillswitch.onNext(Boolean.TRUE);
    }
}
