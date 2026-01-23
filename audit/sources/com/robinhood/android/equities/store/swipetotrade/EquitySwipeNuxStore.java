package com.robinhood.android.equities.store.swipetotrade;

import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.prefs.IntPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: EquitySwipeNuxStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0012J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equities/store/swipetotrade/EquitySwipeNuxStore;", "Lcom/robinhood/store/Store;", "peekLastShownPref", "Lcom/robinhood/prefs/StringPreference;", "peekCountPref", "Lcom/robinhood/prefs/IntPreference;", "tooltipLastShownPref", "tradesSinceLastPeekOrSwipePref", "lastSwipePref", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/store/StoreBundle;)V", "showPeek", "Lkotlinx/coroutines/flow/Flow;", "", "tooltip", "Lcom/robinhood/utils/resource/StringResource;", "showTooltip", "onPeekShown", "", "onTooltipShown", "onSwipe", "onTrade", "lib-store-equity-swipetotrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EquitySwipeNuxStore extends Store {
    private final ExperimentsStore experimentsStore;
    private final StringPreference lastSwipePref;
    private final IntPreference peekCountPref;
    private final StringPreference peekLastShownPref;
    private final RegionGateProvider regionGateProvider;
    private final StringPreference tooltipLastShownPref;
    private final IntPreference tradesSinceLastPeekOrSwipePref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquitySwipeNuxStore(@EquitySwipeNuxModule4 StringPreference peekLastShownPref, @EquitySwipeNuxModule3 IntPreference peekCountPref, @EquitySwipeNuxModule5 StringPreference tooltipLastShownPref, @EquitySwipeNuxModule6 IntPreference tradesSinceLastPeekOrSwipePref, @EquitySwipeNuxModule2 StringPreference lastSwipePref, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(peekLastShownPref, "peekLastShownPref");
        Intrinsics.checkNotNullParameter(peekCountPref, "peekCountPref");
        Intrinsics.checkNotNullParameter(tooltipLastShownPref, "tooltipLastShownPref");
        Intrinsics.checkNotNullParameter(tradesSinceLastPeekOrSwipePref, "tradesSinceLastPeekOrSwipePref");
        Intrinsics.checkNotNullParameter(lastSwipePref, "lastSwipePref");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.peekLastShownPref = peekLastShownPref;
        this.peekCountPref = peekCountPref;
        this.tooltipLastShownPref = tooltipLastShownPref;
        this.tradesSinceLastPeekOrSwipePref = tradesSinceLastPeekOrSwipePref;
        this.lastSwipePref = lastSwipePref;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
    }

    public final Flow<Boolean> showPeek() {
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, false, null, 4, null)), Integer.MAX_VALUE, null, 2, null), new EquitySwipeNuxStore$showPeek$$inlined$flatMapLatest$1(null, this));
    }

    public final Flow<StringResource> tooltip() {
        return FlowKt.transformLatest(Context7.buffer$default(RxConvert.asFlow(ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{EquitiesSwipeToTradeExperiment.INSTANCE}, false, null, 4, null)), Integer.MAX_VALUE, null, 2, null), new EquitySwipeNuxStore$tooltip$$inlined$flatMapLatest$1(null, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Boolean> showTooltip() {
        return FlowKt.combine(Context7.buffer$default(RxConvert.asFlow(this.peekCountPref.getChanges()), Integer.MAX_VALUE, null, 2, null), Context7.buffer$default(RxConvert.asFlow(this.tooltipLastShownPref.changes()), Integer.MAX_VALUE, null, 2, null), new C148041(null));
    }

    /* compiled from: EquitySwipeNuxStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, m3636d2 = {"<anonymous>", "", "peekCount", "", "<destruct>", "Lcom/robinhood/utils/Optional;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$showTooltip$1", m3645f = "EquitySwipeNuxStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equities.store.swipetotrade.EquitySwipeNuxStore$showTooltip$1 */
    static final class C148041 extends ContinuationImpl7 implements Function3<Integer, Optional<? extends String>, Continuation<? super Boolean>, Object> {
        /* synthetic */ int I$0;
        /* synthetic */ Object L$0;
        int label;

        C148041(Continuation<? super C148041> continuation) {
            super(3, continuation);
        }

        public final Object invoke(int i, Optional<String> optional, Continuation<? super Boolean> continuation) {
            C148041 c148041 = new C148041(continuation);
            c148041.I$0 = i;
            c148041.L$0 = optional;
            return c148041.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Optional<? extends String> optional, Continuation<? super Boolean> continuation) {
            return invoke(num.intValue(), (Optional<String>) optional, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return boxing.boxBoolean(this.I$0 > 0 && ((String) ((Optional) this.L$0).component1()) == null);
        }
    }

    public final void onPeekShown() {
        this.peekLastShownPref.set(Instant.now().toString());
        IntPreference intPreference = this.peekCountPref;
        intPreference.set(intPreference.get() + 1);
        this.tradesSinceLastPeekOrSwipePref.set(0);
    }

    public final void onTooltipShown() {
        this.tooltipLastShownPref.set(Instant.now().toString());
    }

    public final void onSwipe() {
        this.lastSwipePref.set(Instant.now().toString());
        this.tradesSinceLastPeekOrSwipePref.set(0);
    }

    public final void onTrade() {
        IntPreference intPreference = this.tradesSinceLastPeekOrSwipePref;
        intPreference.set(intPreference.get() + 1);
    }
}
