package com.robinhood.android.equitydetail.p123ui.chartIntervals;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.equities.contracts.InstrumentChartIntervalsKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentChartIntervalsStore;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpanInterval;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentChartIntervalsDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDataState;", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentChartIntervalsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore;", "stateProvider", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentChartIntervalsStore;Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onIntervalSelected", "interval", "", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentChartIntervalsDuxo extends BaseDuxo<InstrumentChartIntervalsDataState, InstrumentChartIntervalsStateProvider3> implements HasSavedState {
    private final InstrumentChartIntervalsStore instrumentChartIntervalsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentChartIntervalsDuxo(InstrumentChartIntervalsStore instrumentChartIntervalsStore, InstrumentChartIntervalsStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new InstrumentChartIntervalsDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(instrumentChartIntervalsStore, "instrumentChartIntervalsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.instrumentChartIntervalsStore = instrumentChartIntervalsStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: InstrumentChartIntervalsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equitydetail/ui/chartIntervals/InstrumentChartIntervalsDuxo;", "Lcom/robinhood/android/equities/contracts/InstrumentChartIntervalsKey;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InstrumentChartIntervalsDuxo, InstrumentChartIntervalsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InstrumentChartIntervalsKey getArgs(SavedStateHandle savedStateHandle) {
            return (InstrumentChartIntervalsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InstrumentChartIntervalsKey getArgs(InstrumentChartIntervalsDuxo instrumentChartIntervalsDuxo) {
            return (InstrumentChartIntervalsKey) DuxoCompanion.DefaultImpls.getArgs(this, instrumentChartIntervalsDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        Observable<R> map = this.instrumentChartIntervalsStore.streamChartIntervals(((InstrumentChartIntervalsKey) INSTANCE.getArgs(getSavedStateHandle())).getInstrumentId()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                for (InstrumentChartSpanInterval instrumentChartSpanInterval : ((InstrumentChartIntervals) it).getSpans()) {
                    if (Intrinsics.areEqual(instrumentChartSpanInterval.getSpanId(), ((InstrumentChartIntervalsKey) InstrumentChartIntervalsDuxo.INSTANCE.getArgs(this.this$0.getSavedStateHandle())).getSpanId())) {
                        return Optional3.asOptional(instrumentChartSpanInterval);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((InstrumentChartIntervalsDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.chartIntervals.InstrumentChartIntervalsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentChartIntervalsDuxo.onCreate$lambda$2(this.f$0, (InstrumentChartSpanInterval) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(InstrumentChartIntervalsDuxo instrumentChartIntervalsDuxo, InstrumentChartSpanInterval it) {
        Intrinsics.checkNotNullParameter(it, "it");
        instrumentChartIntervalsDuxo.applyMutation(new InstrumentChartIntervalsDuxo2(it, null));
        return Unit.INSTANCE;
    }

    public final void onIntervalSelected(String interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        InstrumentChartIntervalsStore instrumentChartIntervalsStore = this.instrumentChartIntervalsStore;
        Companion companion = INSTANCE;
        instrumentChartIntervalsStore.updateChartIntervals(((InstrumentChartIntervalsKey) companion.getArgs(getSavedStateHandle())).getInstrumentId(), ((InstrumentChartIntervalsKey) companion.getArgs(getSavedStateHandle())).getSpanId(), interval);
    }
}
