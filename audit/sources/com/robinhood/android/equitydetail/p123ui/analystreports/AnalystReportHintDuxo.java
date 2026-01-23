package com.robinhood.android.equitydetail.p123ui.analystreports;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.equitydetail.p123ui.analystreports.AnalystReportHintDuxo;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AnalystReportHintDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000bJ\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0015\u001a\u00020\u000fJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000f0\u000f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintState;", "analystHintManager", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintManager;Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "instrumentIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "hintClickedRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "forceHideHintRelay", "onStart", "setInstrumentId", "instrumentId", "hintClicked", "forceHideHint", "mapHintToEvents", "Lio/reactivex/Observable;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent;", "hint", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "HintEvent", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AnalystReportHintDuxo extends OldBaseDuxo<AnalystReportHintState> {
    public static final int $stable = 8;
    private final AnalystReportHintManager analystHintManager;
    private final BehaviorRelay<Unit> forceHideHintRelay;
    private final PublishRelay<Unit> hintClickedRelay;
    private final BehaviorRelay<UUID> instrumentIdRelay;
    private final InstrumentStore instrumentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnalystReportHintDuxo(AnalystReportHintManager analystHintManager, InstrumentStore instrumentStore) {
        super(new AnalystReportHintState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(analystHintManager, "analystHintManager");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.analystHintManager = analystHintManager;
        this.instrumentStore = instrumentStore;
        BehaviorRelay<UUID> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.instrumentIdRelay = behaviorRelayCreate;
        PublishRelay<Unit> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.hintClickedRelay = publishRelayCreate;
        BehaviorRelay<Unit> behaviorRelayCreate2 = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate2, "create(...)");
        this.forceHideHintRelay = behaviorRelayCreate2;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable<R> observableSwitchMap = this.instrumentIdRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends HintEvent> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                Observable<AnalystReportHint> observableTake = AnalystReportHintDuxo.this.analystHintManager.streamAnalystReportHint(instrumentId).take(1L);
                final AnalystReportHintDuxo analystReportHintDuxo = AnalystReportHintDuxo.this;
                return observableTake.switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.onStart.1.1
                    @Override // io.reactivex.functions.Function
                    public final Observable<HintEvent> apply(AnalystReportHint p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        return analystReportHintDuxo.mapHintToEvents(p0);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportHintDuxo.onStart$lambda$2(this.f$0, (AnalystReportHintDuxo.HintEvent) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.instrumentIdRelay.distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Instrument> apply(UUID instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return AnalystReportHintDuxo.this.instrumentStore.getInstrument(instrumentId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        Observable map = observableSwitchMap2.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((Instrument) it).getSymbol());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((AnalystReportHintDuxo$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportHintDuxo.onStart$lambda$4(this.f$0, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(AnalystReportHintDuxo analystReportHintDuxo, HintEvent hintEvent) {
        final AnalystReportHint hint = hintEvent.getHint();
        if (hintEvent instanceof HintEvent.Show) {
            analystReportHintDuxo.analystHintManager.reportHintShown();
            analystReportHintDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnalystReportHintDuxo.onStart$lambda$2$lambda$0(hint, (AnalystReportHintState) obj);
                }
            });
        } else if (hintEvent instanceof HintEvent.Clicked) {
            analystReportHintDuxo.analystHintManager.reportHintClicked(hint);
        } else {
            if (!(hintEvent instanceof HintEvent.Hide)) {
                throw new NoWhenBranchMatchedException();
            }
            analystReportHintDuxo.analystHintManager.reportHintHidden(hint);
            analystReportHintDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnalystReportHintDuxo.onStart$lambda$2$lambda$1((AnalystReportHintState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalystReportHintState onStart$lambda$2$lambda$0(AnalystReportHint analystReportHint, AnalystReportHintState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AnalystReportHintState.copy$default(applyMutation, new UiEvent(analystReportHint), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalystReportHintState onStart$lambda$2$lambda$1(AnalystReportHintState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AnalystReportHintState.copy$default(applyMutation, null, new UiEvent(Unit.INSTANCE), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(AnalystReportHintDuxo analystReportHintDuxo, final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        analystReportHintDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportHintDuxo.onStart$lambda$4$lambda$3(symbol, (AnalystReportHintState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalystReportHintState onStart$lambda$4$lambda$3(String str, AnalystReportHintState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AnalystReportHintState.copy$default(applyMutation, null, null, str, 3, null);
    }

    public final void setInstrumentId(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentIdRelay.accept(instrumentId);
    }

    public final void hintClicked() {
        this.hintClickedRelay.accept(Unit.INSTANCE);
    }

    public final void forceHideHint() {
        this.forceHideHintRelay.accept(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observable<HintEvent> mapHintToEvents(final AnalystReportHint hint) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<HintEvent> observableConcat = Observable.concat(Observable.timer(2L, timeUnit, Schedulers.computation()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.mapHintToEvents.1
            @Override // io.reactivex.functions.Function
            public final HintEvent apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new HintEvent.Show(hint);
            }
        }), Observable.merge(this.hintClickedRelay.map(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.mapHintToEvents.2
            @Override // io.reactivex.functions.Function
            public final HintEvent.Clicked apply(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new HintEvent.Clicked(hint);
            }
        }), Observable.timer(5L, timeUnit, Schedulers.computation()).takeUntil(Observable.merge(this.hintClickedRelay, this.forceHideHintRelay)).ignoreElements().andThen(Observable.just(new HintEvent.Hide(hint)))));
        Intrinsics.checkNotNullExpressionValue(observableConcat, "concat(...)");
        return observableConcat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnalystReportHintDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent;", "", "<init>", "()V", "hint", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "getHint", "()Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "Show", "Clicked", "Hide", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent$Clicked;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent$Hide;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent$Show;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class HintEvent {
        public /* synthetic */ HintEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract AnalystReportHint getHint();

        private HintEvent() {
        }

        /* compiled from: AnalystReportHintDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent$Show;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent;", "hint", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;)V", "getHint", "()Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Show extends HintEvent {
            public static final int $stable = 8;
            private final AnalystReportHint hint;

            public static /* synthetic */ Show copy$default(Show show, AnalystReportHint analystReportHint, int i, Object obj) {
                if ((i & 1) != 0) {
                    analystReportHint = show.hint;
                }
                return show.copy(analystReportHint);
            }

            /* renamed from: component1, reason: from getter */
            public final AnalystReportHint getHint() {
                return this.hint;
            }

            public final Show copy(AnalystReportHint hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                return new Show(hint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Show) && Intrinsics.areEqual(this.hint, ((Show) other).hint);
            }

            public int hashCode() {
                return this.hint.hashCode();
            }

            public String toString() {
                return "Show(hint=" + this.hint + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Show(AnalystReportHint hint) {
                super(null);
                Intrinsics.checkNotNullParameter(hint, "hint");
                this.hint = hint;
            }

            @Override // com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.HintEvent
            public AnalystReportHint getHint() {
                return this.hint;
            }
        }

        /* compiled from: AnalystReportHintDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent$Clicked;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent;", "hint", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;)V", "getHint", "()Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Clicked extends HintEvent {
            public static final int $stable = 8;
            private final AnalystReportHint hint;

            public static /* synthetic */ Clicked copy$default(Clicked clicked, AnalystReportHint analystReportHint, int i, Object obj) {
                if ((i & 1) != 0) {
                    analystReportHint = clicked.hint;
                }
                return clicked.copy(analystReportHint);
            }

            /* renamed from: component1, reason: from getter */
            public final AnalystReportHint getHint() {
                return this.hint;
            }

            public final Clicked copy(AnalystReportHint hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                return new Clicked(hint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Clicked) && Intrinsics.areEqual(this.hint, ((Clicked) other).hint);
            }

            public int hashCode() {
                return this.hint.hashCode();
            }

            public String toString() {
                return "Clicked(hint=" + this.hint + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Clicked(AnalystReportHint hint) {
                super(null);
                Intrinsics.checkNotNullParameter(hint, "hint");
                this.hint = hint;
            }

            @Override // com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.HintEvent
            public AnalystReportHint getHint() {
                return this.hint;
            }
        }

        /* compiled from: AnalystReportHintDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent$Hide;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHintDuxo$HintEvent;", "hint", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "<init>", "(Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;)V", "getHint", "()Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportHint;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Hide extends HintEvent {
            public static final int $stable = 8;
            private final AnalystReportHint hint;

            public static /* synthetic */ Hide copy$default(Hide hide, AnalystReportHint analystReportHint, int i, Object obj) {
                if ((i & 1) != 0) {
                    analystReportHint = hide.hint;
                }
                return hide.copy(analystReportHint);
            }

            /* renamed from: component1, reason: from getter */
            public final AnalystReportHint getHint() {
                return this.hint;
            }

            public final Hide copy(AnalystReportHint hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                return new Hide(hint);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Hide) && Intrinsics.areEqual(this.hint, ((Hide) other).hint);
            }

            public int hashCode() {
                return this.hint.hashCode();
            }

            public String toString() {
                return "Hide(hint=" + this.hint + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Hide(AnalystReportHint hint) {
                super(null);
                Intrinsics.checkNotNullParameter(hint, "hint");
                this.hint = hint;
            }

            @Override // com.robinhood.android.equitydetail.ui.analystreports.AnalystReportHintDuxo.HintEvent
            public AnalystReportHint getHint() {
                return this.hint;
            }
        }
    }
}
