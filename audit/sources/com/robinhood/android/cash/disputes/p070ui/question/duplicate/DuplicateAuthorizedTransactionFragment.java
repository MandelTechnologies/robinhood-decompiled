package com.robinhood.android.cash.disputes.p070ui.question.duplicate;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.FragmentDuplicateAuthorizedTransactionBinding;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionCallbacks;
import com.robinhood.android.cash.disputes.p070ui.question.DisputeQuestionResponse;
import com.robinhood.android.cash.disputes.p070ui.transaction.TransactionSingleSelectionAdapter;
import com.robinhood.android.cash.disputes.view.DateSelectionView;
import com.robinhood.android.cash.disputes.view.transaction.TransactionSingleSelectionRowView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.mcduckling.SettledCardTransaction;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: DuplicateAuthorizedTransactionFragment.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002FEB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R/\u0010;\u001a\u0004\u0018\u00010\u00172\b\u00104\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R/\u0010?\u001a\u0004\u0018\u00010\u00172\b\u00104\u001a\u0004\u0018\u00010\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/cash/disputes/view/DateSelectionView$DateRangeCallbacks;", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter$Callbacks;", "<init>", "()V", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionViewState;", "viewState", "", "bind", "(Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionViewState;)V", "Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;", "authorizedTransaction", "answerQuestion", "(Lcom/robinhood/models/db/mcduckling/SettledCardTransaction;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lkotlin/Pair;", "j$/time/LocalDate", "dateRange", "onDateRangeSelected", "(Lkotlin/Pair;)V", "transaction", "onSingleTransactionSelected", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionDuxo;", "duxo", "Lcom/robinhood/android/cash/disputes/databinding/FragmentDuplicateAuthorizedTransactionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/FragmentDuplicateAuthorizedTransactionBinding;", "binding", "Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "callbacks$delegate", "getCallbacks", "()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", "callbacks", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter;", "adapter", "Lcom/robinhood/android/cash/disputes/ui/transaction/TransactionSingleSelectionAdapter;", "<set-?>", "selectedDateStart$delegate", "Lkotlin/properties/ReadWriteProperty;", "getSelectedDateStart", "()Lj$/time/LocalDate;", "setSelectedDateStart", "(Lj$/time/LocalDate;)V", "selectedDateStart", "selectedDateEnd$delegate", "getSelectedDateEnd", "setSelectedDateEnd", "selectedDateEnd", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Args", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DuplicateAuthorizedTransactionFragment extends BaseFragment implements RegionGated, DateSelectionView.DateRangeCallbacks, TransactionSingleSelectionAdapter.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final TransactionSingleSelectionAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: selectedDateEnd$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedDateEnd;

    /* renamed from: selectedDateStart$delegate, reason: from kotlin metadata */
    private final Interfaces3 selectedDateStart;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DuplicateAuthorizedTransactionFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/FragmentDuplicateAuthorizedTransactionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DuplicateAuthorizedTransactionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/disputes/ui/question/DisputeQuestionCallbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DuplicateAuthorizedTransactionFragment.class, "selectedDateStart", "getSelectedDateStart()Ljava/time/LocalDate;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DuplicateAuthorizedTransactionFragment.class, "selectedDateEnd", "getSelectedDateEnd()Ljava/time/LocalDate;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DuplicateAuthorizedTransactionFragment() {
        super(C10007R.layout.fragment_duplicate_authorized_transaction);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DuplicateAuthorizedTransactionDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DuplicateAuthorizedTransactionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DisputeQuestionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DisputeQuestionCallbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.adapter = new TransactionSingleSelectionAdapter(this, null, 2, 0 == true ? 1 : 0);
        Interfaces interfacesSavedSerializable = BindSavedState2.savedSerializable(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.selectedDateStart = (Interfaces3) interfacesSavedSerializable.provideDelegate(this, kPropertyArr[2]);
        this.selectedDateEnd = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[3]);
    }

    private final DuplicateAuthorizedTransactionDuxo getDuxo() {
        return (DuplicateAuthorizedTransactionDuxo) this.duxo.getValue();
    }

    private final FragmentDuplicateAuthorizedTransactionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDuplicateAuthorizedTransactionBinding) value;
    }

    private final DisputeQuestionCallbacks getCallbacks() {
        return (DisputeQuestionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final LocalDate getSelectedDateStart() {
        return (LocalDate) this.selectedDateStart.getValue(this, $$delegatedProperties[2]);
    }

    private final void setSelectedDateStart(LocalDate localDate) {
        this.selectedDateStart.setValue(this, $$delegatedProperties[2], localDate);
    }

    private final LocalDate getSelectedDateEnd() {
        return (LocalDate) this.selectedDateEnd.getValue(this, $$delegatedProperties[3]);
    }

    private final void setSelectedDateEnd(LocalDate localDate) {
        this.selectedDateEnd.setValue(this, $$delegatedProperties[3], localDate);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DateSelectionView dateSelectionView = getBinding().duplicateTransactionDateSelection;
        dateSelectionView.setDateRangeCallbacks(this);
        LocalDate selectedDateStart = getSelectedDateStart();
        LocalDate selectedDateEnd = getSelectedDateEnd();
        if (selectedDateStart != null && selectedDateEnd != null) {
            DateSelectionView.setDateSelection$default(dateSelectionView, selectedDateStart, selectedDateEnd, false, 4, null);
        }
        RecyclerView recyclerView = getBinding().duplicateTransactionRecyclerView;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.adapter);
        TransactionSingleSelectionRowView transactionSingleSelectionRowView = getBinding().duplicateTransactionPreviousSelectionRow;
        transactionSingleSelectionRowView.setDividerVisible(false);
        transactionSingleSelectionRowView.setEnabled(false);
        transactionSingleSelectionRowView.setChecked(true);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C100234(this));
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment.onViewCreated.5
            @Override // io.reactivex.functions.Function
            public final Optional<LocalDate> apply(DuplicateAuthorizedTransactionViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getEarliestAvailableDate());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionFragment.onViewCreated$lambda$3(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment.onViewCreated.7
            @Override // io.reactivex.functions.Function
            public final List<SettledCardTransaction> apply(DuplicateAuthorizedTransactionViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSortedCardTransactions();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DuplicateAuthorizedTransactionFragment.onViewCreated$lambda$4(this.f$0, (List) obj);
            }
        });
        DisputeQuestionResponse previousQuestionResponse = getCallbacks().getPreviousQuestionResponse(((Args) INSTANCE.getArgs((Fragment) this)).getQuestion().getId());
        DisputeQuestionResponse.DuplicateAuthorizedTransaction duplicateAuthorizedTransaction = (DisputeQuestionResponse.DuplicateAuthorizedTransaction) (previousQuestionResponse instanceof DisputeQuestionResponse.DuplicateAuthorizedTransaction ? previousQuestionResponse : null);
        if (duplicateAuthorizedTransaction != null) {
            getDuxo().updatePreFillTransaction(duplicateAuthorizedTransaction);
        }
    }

    /* compiled from: DuplicateAuthorizedTransactionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment$onViewCreated$4 */
    /* synthetic */ class C100234 extends FunctionReferenceImpl implements Function1<DuplicateAuthorizedTransactionViewState, Unit> {
        C100234(Object obj) {
            super(1, obj, DuplicateAuthorizedTransactionFragment.class, "bind", "bind(Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DuplicateAuthorizedTransactionViewState duplicateAuthorizedTransactionViewState) {
            invoke2(duplicateAuthorizedTransactionViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DuplicateAuthorizedTransactionViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DuplicateAuthorizedTransactionFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(DuplicateAuthorizedTransactionFragment duplicateAuthorizedTransactionFragment, Optional optional) {
        duplicateAuthorizedTransactionFragment.getBinding().duplicateTransactionDateSelection.setEarliestAvailableDate((LocalDate) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(DuplicateAuthorizedTransactionFragment duplicateAuthorizedTransactionFragment, List list) {
        duplicateAuthorizedTransactionFragment.adapter.submitList(list);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.cash.disputes.view.DateSelectionView.DateRangeCallbacks
    public void onDateRangeSelected(Tuples2<LocalDate, LocalDate> dateRange) {
        Intrinsics.checkNotNullParameter(dateRange, "dateRange");
        setSelectedDateStart(dateRange.getFirst());
        setSelectedDateEnd(dateRange.getSecond());
        getDuxo().updateSelectedDateRange(dateRange.getFirst(), dateRange.getSecond());
    }

    @Override // com.robinhood.android.cash.disputes.ui.transaction.TransactionSingleSelectionAdapter.Callbacks
    public void onSingleTransactionSelected(SettledCardTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        getDuxo().setAuthorizedTransaction(transaction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final DuplicateAuthorizedTransactionViewState viewState) {
        SettledCardTransaction settledCardTransactionConsume;
        Tuples2<LocalDate, LocalDate> tuples2Consume;
        getBinding().duplicateTransactionTitle.setText(viewState.getTitleText());
        RhTextView rhTextView = getBinding().duplicateTransactionSubtitle;
        rhTextView.setText(viewState.getSubtitleText());
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(viewState.isSubtitleVisible() ? 0 : 8);
        SettledCardTransaction duplicateTransaction = viewState.getDuplicateTransaction();
        if (duplicateTransaction != null) {
            getBinding().duplicateTransactionPreviousSelectionRow.bindCardTransaction(duplicateTransaction, true);
        }
        RhTextView duplicateTransactionEmptyTitle = getBinding().duplicateTransactionEmptyTitle;
        Intrinsics.checkNotNullExpressionValue(duplicateTransactionEmptyTitle, "duplicateTransactionEmptyTitle");
        duplicateTransactionEmptyTitle.setVisibility(viewState.isEmptyStateVisible() ? 0 : 8);
        RhTextView duplicateTransactionEmptyDescription = getBinding().duplicateTransactionEmptyDescription;
        Intrinsics.checkNotNullExpressionValue(duplicateTransactionEmptyDescription, "duplicateTransactionEmptyDescription");
        duplicateTransactionEmptyDescription.setVisibility(viewState.isEmptyStateVisible() ? 0 : 8);
        ImageView duplicateTransactionEmptyImage = getBinding().duplicateTransactionEmptyImage;
        Intrinsics.checkNotNullExpressionValue(duplicateTransactionEmptyImage, "duplicateTransactionEmptyImage");
        duplicateTransactionEmptyImage.setVisibility(viewState.isEmptyStateVisible() ? 0 : 8);
        RdsButton rdsButton = getBinding().duplicateTransactionContinueButton;
        rdsButton.setEnabled(viewState.isContinueEnabled());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.question.duplicate.DuplicateAuthorizedTransactionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DuplicateAuthorizedTransactionFragment.bind$lambda$9$lambda$8(viewState, this);
            }
        });
        UiEvent<Tuples2<LocalDate, LocalDate>> initialDateRangeSelectionEvent = viewState.getInitialDateRangeSelectionEvent();
        if (initialDateRangeSelectionEvent != null && (tuples2Consume = initialDateRangeSelectionEvent.consume()) != null) {
            getBinding().duplicateTransactionDateSelection.setDateSelection(tuples2Consume.getFirst(), tuples2Consume.getSecond(), true);
        }
        UiEvent<SettledCardTransaction> authorizedTransactionPreFillEvent = viewState.getAuthorizedTransactionPreFillEvent();
        if (authorizedTransactionPreFillEvent == null || (settledCardTransactionConsume = authorizedTransactionPreFillEvent.consume()) == null) {
            return;
        }
        this.adapter.setSelectedTransaction(settledCardTransactionConsume);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9$lambda$8(DuplicateAuthorizedTransactionViewState duplicateAuthorizedTransactionViewState, DuplicateAuthorizedTransactionFragment duplicateAuthorizedTransactionFragment) {
        if (duplicateAuthorizedTransactionViewState.getAuthorizedTransaction() != null) {
            duplicateAuthorizedTransactionFragment.answerQuestion(duplicateAuthorizedTransactionViewState.getAuthorizedTransaction());
        }
        return Unit.INSTANCE;
    }

    private final void answerQuestion(SettledCardTransaction authorizedTransaction) {
        DisputeQuestionCallbacks callbacks = getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onQuestionAnswered(new DisputeQuestionResponse.DuplicateAuthorizedTransaction(((Args) companion.getArgs((Fragment) this)).getQuestion(), ((Args) companion.getArgs((Fragment) this)).getQuestion().getNextId(), authorizedTransaction));
    }

    /* compiled from: DuplicateAuthorizedTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionFragment$Args;", "Landroid/os/Parcelable;", "question", "Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;", "duplicateTransactionId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;Ljava/util/UUID;)V", "getQuestion", "()Lcom/robinhood/models/ui/DisputeQuestionnaire$Question$DuplicateAuthorizedTransactionInput;", "getDuplicateTransactionId", "()Ljava/util/UUID;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID duplicateTransactionId;
        private final DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput question;

        /* compiled from: DuplicateAuthorizedTransactionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput duplicateAuthorizedTransactionInput, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                duplicateAuthorizedTransactionInput = args.question;
            }
            if ((i & 2) != 0) {
                uuid = args.duplicateTransactionId;
            }
            return args.copy(duplicateAuthorizedTransactionInput, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput getQuestion() {
            return this.question;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getDuplicateTransactionId() {
            return this.duplicateTransactionId;
        }

        public final Args copy(DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput question, UUID duplicateTransactionId) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(duplicateTransactionId, "duplicateTransactionId");
            return new Args(question, duplicateTransactionId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.question, args.question) && Intrinsics.areEqual(this.duplicateTransactionId, args.duplicateTransactionId);
        }

        public int hashCode() {
            return (this.question.hashCode() * 31) + this.duplicateTransactionId.hashCode();
        }

        public String toString() {
            return "Args(question=" + this.question + ", duplicateTransactionId=" + this.duplicateTransactionId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.question, flags);
            dest.writeSerializable(this.duplicateTransactionId);
        }

        public Args(DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput question, UUID duplicateTransactionId) {
            Intrinsics.checkNotNullParameter(question, "question");
            Intrinsics.checkNotNullParameter(duplicateTransactionId, "duplicateTransactionId");
            this.question = question;
            this.duplicateTransactionId = duplicateTransactionId;
        }

        public final DisputeQuestionnaire.Question.DuplicateAuthorizedTransactionInput getQuestion() {
            return this.question;
        }

        public final UUID getDuplicateTransactionId() {
            return this.duplicateTransactionId;
        }
    }

    /* compiled from: DuplicateAuthorizedTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionFragment;", "Lcom/robinhood/android/cash/disputes/ui/question/duplicate/DuplicateAuthorizedTransactionFragment$Args;", "<init>", "()V", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DuplicateAuthorizedTransactionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DuplicateAuthorizedTransactionFragment duplicateAuthorizedTransactionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, duplicateAuthorizedTransactionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DuplicateAuthorizedTransactionFragment newInstance(Args args) {
            return (DuplicateAuthorizedTransactionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DuplicateAuthorizedTransactionFragment duplicateAuthorizedTransactionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, duplicateAuthorizedTransactionFragment, args);
        }
    }
}
