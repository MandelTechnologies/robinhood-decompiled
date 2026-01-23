package com.robinhood.android.optionsexercise.assignment;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo;
import com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionQuote;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarlyAssignmentOptionPickerDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0019\u001aB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo$EarlyAssignmentOptionPickerViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "equityQuoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/OptionPositionStore;Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "assignedOptionInstrumentChainId", "Ljava/util/UUID;", "assignedOptionContractType", "Lcom/robinhood/models/db/OptionContractType;", "underlyingEquityId", "onResume", "", "EarlyAssignmentOptionPickerViewState", "Companion", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class EarlyAssignmentOptionPickerDuxo extends OldBaseDuxo<EarlyAssignmentOptionPickerViewState> implements HasSavedState {
    private static final long DEBOUNCE_TIMEOUT = 500;
    private final AccountProvider accountProvider;
    private final OptionContractType assignedOptionContractType;
    private final UUID assignedOptionInstrumentChainId;
    private final QuoteStore equityQuoteStore;
    private final OptionPositionStore optionPositionStore;
    private final OptionQuoteStore optionQuoteStore;
    private final SavedStateHandle savedStateHandle;
    private final UUID underlyingEquityId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EarlyAssignmentOptionPickerDuxo(AccountProvider accountProvider, QuoteStore equityQuoteStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, SavedStateHandle savedStateHandle) {
        super(new EarlyAssignmentOptionPickerViewState(null, null, false, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(equityQuoteStore, "equityQuoteStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.equityQuoteStore = equityQuoteStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.savedStateHandle = savedStateHandle;
        Companion companion = INSTANCE;
        this.assignedOptionInstrumentChainId = ((EarlyAssignmentOptionPickerFragment.Args) companion.getArgs(getSavedStateHandle())).getAssignedOptionInstrumentContext().getOptionInstrument().getOptionChainId();
        this.assignedOptionContractType = ((EarlyAssignmentOptionPickerFragment.Args) companion.getArgs(getSavedStateHandle())).getAssignedOptionInstrumentContext().getOptionInstrument().getContractType();
        this.underlyingEquityId = ((EarlyAssignmentOptionPickerFragment.Args) companion.getArgs(getSavedStateHandle())).getAssignedOptionInstrumentContext().getUnderlyingEquityId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        Observable<String> observableJust;
        super.onResume();
        this.equityQuoteStore.refresh(false, this.underlyingEquityId);
        LifecycleHost.DefaultImpls.bind$default(this, this.equityQuoteStore.getStreamQuote().asObservable(this.underlyingEquityId), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyAssignmentOptionPickerDuxo.onResume$lambda$1(this.f$0, (Quote) obj);
            }
        });
        String accountNumber = ((EarlyAssignmentOptionPickerFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getAccountNumber();
        if (accountNumber == null) {
            observableJust = this.accountProvider.streamIndividualAccountNumber();
        } else {
            observableJust = Observable.just(accountNumber);
        }
        Observable observableDebounce = observableJust.switchMap(new Function() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo.onResume.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<UiOptionInstrumentPosition>> apply(String accountNumber2) {
                Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                return EarlyAssignmentOptionPickerDuxo.this.optionPositionStore.getUiOptionPositionsForEarlyAssignment(accountNumber2, EarlyAssignmentOptionPickerDuxo.this.assignedOptionInstrumentChainId, EarlyAssignmentOptionPickerDuxo.this.assignedOptionContractType);
            }
        }).flatMap(new Function() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo.onResume.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Quote, List<Tuples2<UiOptionInstrumentPosition, OptionInstrumentQuote>>>> apply(final List<UiOptionInstrumentPosition> uiOptionPositions) {
                Intrinsics.checkNotNullParameter(uiOptionPositions, "uiOptionPositions");
                List<UiOptionInstrumentPosition> list = uiOptionPositions;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((UiOptionInstrumentPosition) it.next()).getOptionInstrument().getId());
                }
                EarlyAssignmentOptionPickerDuxo.this.equityQuoteStore.refresh(false, EarlyAssignmentOptionPickerDuxo.this.underlyingEquityId);
                Observable<Quote> observableAsObservable = EarlyAssignmentOptionPickerDuxo.this.equityQuoteStore.getStreamQuote().asObservable(EarlyAssignmentOptionPickerDuxo.this.underlyingEquityId);
                EarlyAssignmentOptionPickerDuxo.this.optionQuoteStore.refresh(false, (List<UUID>) arrayList);
                Observable<R> map = EarlyAssignmentOptionPickerDuxo.this.optionQuoteStore.getAllOptionQuotes(arrayList).map(new Function() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo$onResume$3$positionListObs$1
                    @Override // io.reactivex.functions.Function
                    public final List<Tuples2<UiOptionInstrumentPosition, OptionInstrumentQuote>> apply(Map<UUID, OptionInstrumentQuote> optionQuotesMap) {
                        Intrinsics.checkNotNullParameter(optionQuotesMap, "optionQuotesMap");
                        List<UiOptionInstrumentPosition> list2 = uiOptionPositions;
                        Intrinsics.checkNotNull(list2);
                        List<UiOptionInstrumentPosition> list3 = list2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                        for (UiOptionInstrumentPosition uiOptionInstrumentPosition : list3) {
                            arrayList2.add(Tuples4.m3642to(uiOptionInstrumentPosition, optionQuotesMap.get(uiOptionInstrumentPosition.getOptionInstrument().getId())));
                        }
                        return arrayList2;
                    }
                });
                Observables observables = Observables.INSTANCE;
                Intrinsics.checkNotNull(map);
                return observables.combineLatest(observableAsObservable, map);
            }
        }).debounce(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDebounce, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyAssignmentOptionPickerDuxo.onResume$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(EarlyAssignmentOptionPickerDuxo earlyAssignmentOptionPickerDuxo, final Quote quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        earlyAssignmentOptionPickerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyAssignmentOptionPickerDuxo.onResume$lambda$1$lambda$0(quote, (EarlyAssignmentOptionPickerDuxo.EarlyAssignmentOptionPickerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyAssignmentOptionPickerViewState onResume$lambda$1$lambda$0(Quote quote, EarlyAssignmentOptionPickerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return EarlyAssignmentOptionPickerViewState.copy$default(applyMutation, quote, null, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(EarlyAssignmentOptionPickerDuxo earlyAssignmentOptionPickerDuxo, Tuples2 tuples2) {
        final Quote quote = (Quote) tuples2.component1();
        final List list = (List) tuples2.component2();
        earlyAssignmentOptionPickerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.optionsexercise.assignment.EarlyAssignmentOptionPickerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EarlyAssignmentOptionPickerDuxo.onResume$lambda$3$lambda$2(quote, list, (EarlyAssignmentOptionPickerDuxo.EarlyAssignmentOptionPickerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EarlyAssignmentOptionPickerViewState onResume$lambda$3$lambda$2(Quote quote, List list, EarlyAssignmentOptionPickerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(list);
        return applyMutation.copy(quote, list, false);
    }

    /* compiled from: EarlyAssignmentOptionPickerDuxo.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\nHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo$EarlyAssignmentOptionPickerViewState;", "", "equityQuote", "Lcom/robinhood/models/db/Quote;", "positionList", "", "Lkotlin/Pair;", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "Lcom/robinhood/models/db/OptionQuote;", "showLoadingView", "", "<init>", "(Lcom/robinhood/models/db/Quote;Ljava/util/List;Z)V", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "getPositionList", "()Ljava/util/List;", "getShowLoadingView", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class EarlyAssignmentOptionPickerViewState {
        public static final int $stable = 8;
        private final Quote equityQuote;
        private final List<Tuples2<UiOptionInstrumentPosition, OptionQuote>> positionList;
        private final boolean showLoadingView;

        public EarlyAssignmentOptionPickerViewState() {
            this(null, null, false, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EarlyAssignmentOptionPickerViewState copy$default(EarlyAssignmentOptionPickerViewState earlyAssignmentOptionPickerViewState, Quote quote, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                quote = earlyAssignmentOptionPickerViewState.equityQuote;
            }
            if ((i & 2) != 0) {
                list = earlyAssignmentOptionPickerViewState.positionList;
            }
            if ((i & 4) != 0) {
                z = earlyAssignmentOptionPickerViewState.showLoadingView;
            }
            return earlyAssignmentOptionPickerViewState.copy(quote, list, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Quote getEquityQuote() {
            return this.equityQuote;
        }

        public final List<Tuples2<UiOptionInstrumentPosition, OptionQuote>> component2() {
            return this.positionList;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowLoadingView() {
            return this.showLoadingView;
        }

        public final EarlyAssignmentOptionPickerViewState copy(Quote equityQuote, List<? extends Tuples2<UiOptionInstrumentPosition, ? extends OptionQuote>> positionList, boolean showLoadingView) {
            Intrinsics.checkNotNullParameter(positionList, "positionList");
            return new EarlyAssignmentOptionPickerViewState(equityQuote, positionList, showLoadingView);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EarlyAssignmentOptionPickerViewState)) {
                return false;
            }
            EarlyAssignmentOptionPickerViewState earlyAssignmentOptionPickerViewState = (EarlyAssignmentOptionPickerViewState) other;
            return Intrinsics.areEqual(this.equityQuote, earlyAssignmentOptionPickerViewState.equityQuote) && Intrinsics.areEqual(this.positionList, earlyAssignmentOptionPickerViewState.positionList) && this.showLoadingView == earlyAssignmentOptionPickerViewState.showLoadingView;
        }

        public int hashCode() {
            Quote quote = this.equityQuote;
            return ((((quote == null ? 0 : quote.hashCode()) * 31) + this.positionList.hashCode()) * 31) + Boolean.hashCode(this.showLoadingView);
        }

        public String toString() {
            return "EarlyAssignmentOptionPickerViewState(equityQuote=" + this.equityQuote + ", positionList=" + this.positionList + ", showLoadingView=" + this.showLoadingView + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EarlyAssignmentOptionPickerViewState(Quote quote, List<? extends Tuples2<UiOptionInstrumentPosition, ? extends OptionQuote>> positionList, boolean z) {
            Intrinsics.checkNotNullParameter(positionList, "positionList");
            this.equityQuote = quote;
            this.positionList = positionList;
            this.showLoadingView = z;
        }

        public final Quote getEquityQuote() {
            return this.equityQuote;
        }

        public /* synthetic */ EarlyAssignmentOptionPickerViewState(Quote quote, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : quote, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? true : z);
        }

        public final List<Tuples2<UiOptionInstrumentPosition, OptionQuote>> getPositionList() {
            return this.positionList;
        }

        public final boolean getShowLoadingView() {
            return this.showLoadingView;
        }
    }

    /* compiled from: EarlyAssignmentOptionPickerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerDuxo;", "Lcom/robinhood/android/optionsexercise/assignment/EarlyAssignmentOptionPickerFragment$Args;", "<init>", "()V", "DEBOUNCE_TIMEOUT", "", "feature-options-exercise_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EarlyAssignmentOptionPickerDuxo, EarlyAssignmentOptionPickerFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EarlyAssignmentOptionPickerFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EarlyAssignmentOptionPickerFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EarlyAssignmentOptionPickerFragment.Args getArgs(EarlyAssignmentOptionPickerDuxo earlyAssignmentOptionPickerDuxo) {
            return (EarlyAssignmentOptionPickerFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, earlyAssignmentOptionPickerDuxo);
        }
    }
}
