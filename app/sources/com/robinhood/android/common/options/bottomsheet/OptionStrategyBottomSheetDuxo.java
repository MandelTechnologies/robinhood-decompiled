package com.robinhood.android.common.options.bottomsheet;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetDuxo;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.indexes.store.IndexStore;
import com.robinhood.android.options.contracts.OptionStrategyBottomSheetFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionUnderlying;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionStrategyBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "indexStore", "Lcom/robinhood/android/indexes/store/IndexStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/indexes/store/IndexStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onBuilderSpreadTap", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "Companion", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionStrategyBottomSheetDuxo extends OldBaseDuxo<OptionStrategyBottomSheetViewState> implements HasSavedState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final QuoteStore equityQuoteStore;
    private final EventLogger eventLogger;
    private final IndexStore indexStore;
    private final OptionQuoteStore optionQuoteStore;
    private final SavedStateHandle savedStateHandle;

    /* compiled from: OptionStrategyBottomSheetDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionStrategyBottomSheetDuxo(EventLogger eventLogger, OptionQuoteStore optionQuoteStore, QuoteStore equityQuoteStore, IndexStore indexStore, SavedStateHandle savedStateHandle) {
        super(new OptionStrategyBottomSheetViewState((OptionStrategyBottomSheetFragmentKey) INSTANCE.getArgs(savedStateHandle), null, null, null, 14, null), null, 2, null);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(indexStore, "indexStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.eventLogger = eventLogger;
        this.optionQuoteStore = optionQuoteStore;
        this.equityQuoteStore = equityQuoteStore;
        this.indexStore = indexStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore;
        ImmutableList<OptionLegBundle> legBundles = ((OptionStrategyBottomSheetFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getOptionOrderBundle().getLegBundles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        Iterator<OptionLegBundle> it = legBundles.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getOptionInstrument().getId());
        }
        Observable<? extends Map<UUID, OptionInstrumentQuote>> observableThrottleLatest = optionQuoteStore.getAllOptionQuotes(arrayList).throttleLatest(1L, TimeUnit.SECONDS, Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableThrottleLatest, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C113072());
        Companion companion = INSTANCE;
        int i = WhenMappings.$EnumSwitchMapping$0[((OptionStrategyBottomSheetFragmentKey) companion.getArgs((HasSavedState) this)).getUiOptionChain().getUnderlyingType().ordinal()];
        if (i == 1) {
            OptionUnderlying optionUnderlying = (OptionUnderlying) CollectionsKt.firstOrNull((List) ((OptionStrategyBottomSheetFragmentKey) companion.getArgs((HasSavedState) this)).getUiOptionChain().getUnderlyings());
            UUID underlyingId = optionUnderlying != null ? optionUnderlying.getUnderlyingId() : null;
            if (underlyingId != null) {
                Observable<Quote> observableDistinctUntilChanged = this.equityQuoteStore.getStreamQuote().asObservable(underlyingId).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
                LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetDuxo$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionStrategyBottomSheetDuxo.onStart$lambda$2(this.f$0, (Quote) obj);
                    }
                });
                return;
            }
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        UUID indexUnderlyingId = ((OptionStrategyBottomSheetFragmentKey) companion.getArgs((HasSavedState) this)).getUiOptionChain().getIndexUnderlyingId();
        if (indexUnderlyingId != null) {
            Observable observableDistinctUntilChanged2 = asObservable(this.indexStore.streamIndexValue(new ApiIndexValueDetailRequest.ApiIndexValueRequestById(indexUnderlyingId))).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetDuxo$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionStrategyBottomSheetDuxo.onStart$lambda$4(this.f$0, (IndexValue) obj);
                }
            });
        }
    }

    /* compiled from: OptionStrategyBottomSheetDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetDuxo$onStart$2 */
    static final class C113072 implements Function1 {
        C113072() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map<UUID, OptionInstrumentQuote>) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(final Map<UUID, OptionInstrumentQuote> map) {
            OptionStrategyBottomSheetDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetDuxo$onStart$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionStrategyBottomSheetDuxo.C113072.invoke$lambda$0(map, (OptionStrategyBottomSheetViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OptionStrategyBottomSheetViewState invoke$lambda$0(Map map, OptionStrategyBottomSheetViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            Intrinsics.checkNotNull(map);
            return OptionStrategyBottomSheetViewState.copy$default(applyMutation, null, null, null, map, 7, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(OptionStrategyBottomSheetDuxo optionStrategyBottomSheetDuxo, final Quote quote) {
        optionStrategyBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBottomSheetDuxo.onStart$lambda$2$lambda$1(quote, (OptionStrategyBottomSheetViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBottomSheetViewState onStart$lambda$2$lambda$1(Quote quote, OptionStrategyBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBottomSheetViewState.copy$default(applyMutation, null, quote, null, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(OptionStrategyBottomSheetDuxo optionStrategyBottomSheetDuxo, final IndexValue indexValue) {
        optionStrategyBottomSheetDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBottomSheetDuxo.onStart$lambda$4$lambda$3(indexValue, (OptionStrategyBottomSheetViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionStrategyBottomSheetViewState onStart$lambda$4$lambda$3(IndexValue indexValue, OptionStrategyBottomSheetViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return OptionStrategyBottomSheetViewState.copy$default(applyMutation, null, null, indexValue, null, 11, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBuilderSpreadTap(UserInteractionEventData.Action action, Component component) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(component, "component");
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, action, new Screen(Screen.Name.OPTION_STRATEGY_CHAIN, null, null, null, 14, null), component, new ComponentHierarchy(new Component(Component.ComponentType.OPTION_STRATEGY_CHAIN_BOTTOM_SHEET, null, null, 6, null), null, null, null, null, 30, null), new Context(0, 0, 0, objArr2, null, objArr, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((OptionStrategyBottomSheetFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getOptionsContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -4194305, -1, -1, -1, -1, 16383, null), false, 32, null);
    }

    /* compiled from: OptionStrategyBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetDuxo;", "Lcom/robinhood/android/options/contracts/OptionStrategyBottomSheetFragmentKey;", "<init>", "()V", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<OptionStrategyBottomSheetDuxo, OptionStrategyBottomSheetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionStrategyBottomSheetFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (OptionStrategyBottomSheetFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public OptionStrategyBottomSheetFragmentKey getArgs(OptionStrategyBottomSheetDuxo optionStrategyBottomSheetDuxo) {
            return (OptionStrategyBottomSheetFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, optionStrategyBottomSheetDuxo);
        }
    }
}
