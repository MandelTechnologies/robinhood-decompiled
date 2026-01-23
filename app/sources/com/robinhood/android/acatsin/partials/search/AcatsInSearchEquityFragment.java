package com.robinhood.android.acatsin.partials.search;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInSearchEquitySymbolBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.search.RhSearchAdapter;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.search.SearchResponse;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.store.search.SearchStore3;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInSearchEquityFragment.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0002$%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/search/RhSearchAdapter$Callbacks;", "<init>", "()V", "binding", "Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInSearchEquitySymbolBinding;", "getBinding", "()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInSearchEquitySymbolBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment$Callbacks;", "callbacks$delegate", "searchAdapter", "Lcom/robinhood/android/common/search/RhSearchAdapter;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setViewState", "state", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityViewState;", "onItemClicked", "searchItem", "Lcom/robinhood/android/common/search/SearchItem;", "Callbacks", "Companion", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInSearchEquityFragment extends BaseFragment implements RhSearchAdapter.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final RhSearchAdapter searchAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInSearchEquityFragment.class, "binding", "getBinding()Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInSearchEquitySymbolBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInSearchEquityFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInSearchEquityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment$Callbacks;", "", "onInstrumentClicked", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onInstrumentClicked(Instrument instrument);
    }

    public AcatsInSearchEquityFragment() {
        super(C7686R.layout.fragment_acats_in_search_equity_symbol);
        this.binding = ViewBinding5.viewBinding(this, AcatsInSearchEquityFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsInSearchEquityDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.searchAdapter = new RhSearchAdapter(this);
    }

    private final FragmentAcatsInSearchEquitySymbolBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInSearchEquitySymbolBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInSearchEquityDuxo getDuxo() {
        return (AcatsInSearchEquityDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* compiled from: AcatsInSearchEquityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment$onViewCreated$1", m3645f = "AcatsInSearchEquityFragment.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment$onViewCreated$1 */
    static final class C80141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C80141(Continuation<? super C80141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInSearchEquityFragment.this.new C80141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C80141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInSearchEquityFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInSearchEquityFragment $tmp0;

            AnonymousClass1(AcatsInSearchEquityFragment acatsInSearchEquityFragment) {
                this.$tmp0 = acatsInSearchEquityFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInSearchEquityFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInSearchEquityViewState acatsInSearchEquityViewState, Continuation<? super Unit> continuation) throws Throwable {
                Object objInvokeSuspend$setViewState = C80141.invokeSuspend$setViewState(this.$tmp0, acatsInSearchEquityViewState, continuation);
                return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInSearchEquityViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setViewState(AcatsInSearchEquityFragment acatsInSearchEquityFragment, AcatsInSearchEquityViewState acatsInSearchEquityViewState, Continuation continuation) throws Throwable {
            acatsInSearchEquityFragment.setViewState(acatsInSearchEquityViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInSearchEquityViewState> stateFlow = AcatsInSearchEquityFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInSearchEquityFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C80141(null), 1, null);
        FragmentAcatsInSearchEquitySymbolBinding binding = getBinding();
        RecyclerView recyclerView = binding.recyclerview;
        recyclerView.setAdapter(this.searchAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        Intrinsics.checkNotNull(recyclerView);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(recyclerView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RdsTextInputEditText searchToolbarEdt = binding.searchToolbarEdt;
        Intrinsics.checkNotNullExpressionValue(searchToolbarEdt, "searchToolbarEdt");
        Observable<R> map = RxTextView.textChanges(searchToolbarEdt).map(new io.reactivex.functions.Function() { // from class: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment$onViewCreated$2$2
            @Override // io.reactivex.functions.Function
            public final String apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.trim(it.toString()).toString();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new AcatsInSearchEquityFragment4(getDuxo()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(AcatsInSearchEquityViewState state) throws Throwable {
        Object next;
        SearchStore3 searchResult = state.getSearchResult();
        if (Intrinsics.areEqual(searchResult, SearchStore3.Loading.INSTANCE)) {
            requireBaseActivity().showProgressBar(true);
            return;
        }
        if (searchResult instanceof SearchStore3.Error) {
            requireBaseActivity().showProgressBar(false);
            getActivityErrorHandler().invoke2(((SearchStore3.Error) state.getSearchResult()).getThrowable());
            return;
        }
        if (!(searchResult instanceof SearchStore3.Success)) {
            if (searchResult != null) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        requireBaseActivity().showProgressBar(false);
        Iterator<T> it = ((SearchStore3.Success) state.getSearchResult()).getResponses().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((SearchResponse) next) instanceof SearchResponse.Instruments) {
                    break;
                }
            }
        }
        Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.robinhood.models.api.search.SearchResponse.Instruments");
        List<Instrument> instruments = ((SearchResponse.Instruments) next).getInstruments();
        RhSearchAdapter rhSearchAdapter = this.searchAdapter;
        List<Instrument> list = instruments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new SearchItem.InstrumentResult((Instrument) it2.next(), false, false, 6, null));
        }
        rhSearchAdapter.submitList(arrayList);
    }

    @Override // com.robinhood.android.common.search.RhSearchAdapter.Callbacks
    public void onItemClicked(SearchItem searchItem) {
        Intrinsics.checkNotNullParameter(searchItem, "searchItem");
        if (searchItem instanceof SearchItem.InstrumentResult) {
            SearchItem.InstrumentResult instrumentResult = (SearchItem.InstrumentResult) searchItem;
            Instrument instrument = instrumentResult.getInstrument();
            if (instrument.getAffiliateTradability().getAllowsBuyToOpen() && instrument.isActive()) {
                getCallbacks().onInstrumentClicked(instrumentResult.getInstrument());
                LinearLayout root = getBinding().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                ViewsKt.hideKeyboard$default(root, false, 1, null);
                return;
            }
            RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C7686R.id.dialog_id_unsupported_instrument, getString(C7686R.string.acats_in_invalid_instrument_title), null, getString(C7686R.string.acats_in_invalid_instrument_message, instrument.getDisplayName()), null, getString(C11048R.string.general_label_got_it), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097108, null));
            FragmentManager parentFragmentManager = getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
            rhBottomSheetDialogFragment.show(parentFragmentManager, "instrument_unsupported");
            return;
        }
        throw new IllegalStateException(("Unsupported search item: " + searchItem).toString());
    }

    /* compiled from: AcatsInSearchEquityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/acatsin/partials/search/AcatsInSearchEquityFragment;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AcatsInSearchEquityFragment newInstance() {
            return new AcatsInSearchEquityFragment();
        }
    }
}
