package com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.android.trade.equity.databinding.NotEnoughSharesV2DialogFragmentBinding;
import com.robinhood.android.trade.equity.p261ui.dialog.notenoughshares.NotEnoughSharesDuxo;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: NotEnoughSharesDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020'H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogFragment;", "Lcom/robinhood/android/common/ui/BaseDialogFragment;", "<init>", "()V", "bindings", "Lcom/robinhood/android/trade/equity/databinding/NotEnoughSharesV2DialogFragmentBinding;", "getBindings", "()Lcom/robinhood/android/trade/equity/databinding/NotEnoughSharesV2DialogFragmentBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogCallbacks;", "getCallbacks", "()Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogCallbacks;", "callbacks$delegate", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "rowAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesRowViewState;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setState", "state", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesViewState;", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class NotEnoughSharesDialogFragment extends BaseDialogFragment {

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Navigator navigator;
    private final GenericListAdapter<RdsRowView, NotEnoughSharesRowViewState> rowAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NotEnoughSharesDialogFragment.class, "bindings", "getBindings()Lcom/robinhood/android/trade/equity/databinding/NotEnoughSharesV2DialogFragmentBinding;", 0)), Reflection.property1(new PropertyReference1Impl(NotEnoughSharesDialogFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public NotEnoughSharesDialogFragment() {
        super(C29365R.layout.not_enough_shares_v2_dialog_fragment);
        this.bindings = ViewBinding5.viewBinding(this, NotEnoughSharesDialogFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, NotEnoughSharesDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(NotEnoughSharesDialogCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.rowAdapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NotEnoughSharesDialogFragment.rowAdapter$lambda$0((RdsRowView) obj, (NotEnoughSharesRowViewState) obj2);
            }
        });
    }

    private final NotEnoughSharesV2DialogFragmentBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (NotEnoughSharesV2DialogFragmentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotEnoughSharesDuxo getDuxo() {
        return (NotEnoughSharesDuxo) this.duxo.getValue();
    }

    private final NotEnoughSharesDialogCallbacks getCallbacks() {
        return (NotEnoughSharesDialogCallbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rowAdapter$lambda$0(RdsRowView of, NotEnoughSharesRowViewState item) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        String string2 = of.getResources().getString(item.getLabelRes());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        RdsRowView.bind$default(of, string2, null, Formats.getIntegerFormat().format(item.getValue()), null, null, 26, null);
        of.setShowBottomDivider(false);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBindings().notEnoughSharesRows.setAdapter(this.rowAdapter);
        BaseDialogFragment.collectDuxoState$default(this, null, new C295241(null), 1, null);
    }

    /* compiled from: NotEnoughSharesDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$onViewCreated$1", m3645f = "NotEnoughSharesDialogFragment.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$onViewCreated$1 */
    static final class C295241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C295241(Continuation<? super C295241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NotEnoughSharesDialogFragment.this.new C295241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C295241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: NotEnoughSharesDialogFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ NotEnoughSharesDialogFragment $tmp0;

            AnonymousClass1(NotEnoughSharesDialogFragment notEnoughSharesDialogFragment) {
                this.$tmp0 = notEnoughSharesDialogFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, NotEnoughSharesDialogFragment.class, "setState", "setState(Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(NotEnoughSharesViewState notEnoughSharesViewState, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                Object objInvokeSuspend$setState = C295241.invokeSuspend$setState(this.$tmp0, notEnoughSharesViewState, continuation);
                return objInvokeSuspend$setState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((NotEnoughSharesViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<NotEnoughSharesViewState> stateFlow = NotEnoughSharesDialogFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NotEnoughSharesDialogFragment.this);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setState(NotEnoughSharesDialogFragment notEnoughSharesDialogFragment, NotEnoughSharesViewState notEnoughSharesViewState, Continuation continuation) throws Resources.NotFoundException {
            notEnoughSharesDialogFragment.setState(notEnoughSharesViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(final NotEnoughSharesViewState state) throws Resources.NotFoundException {
        CharSequence text;
        NotEnoughSharesV2DialogFragmentBinding bindings = getBindings();
        RhTextView rhTextView = bindings.titleTxt;
        StringResource titleRes = state.getTitleRes();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(titleRes.getText(resources));
        RhTextView rhTextView2 = bindings.messageTxt;
        StringResource dialogMessageRes = state.getDialogMessageRes();
        if (dialogMessageRes != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text = dialogMessageRes.getText(resources2);
        } else {
            text = null;
        }
        rhTextView2.setText(text);
        this.rowAdapter.submitList(state.getNotEnoughSharesRows());
        RdsRowView totalSellableSharesRow = bindings.totalSellableSharesRow;
        Intrinsics.checkNotNullExpressionValue(totalSellableSharesRow, "totalSellableSharesRow");
        totalSellableSharesRow.setVisibility(state.getShowTotalSellableShares() ? 0 : 8);
        View divider = bindings.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        RdsRowView totalSellableSharesRow2 = bindings.totalSellableSharesRow;
        Intrinsics.checkNotNullExpressionValue(totalSellableSharesRow2, "totalSellableSharesRow");
        divider.setVisibility(totalSellableSharesRow2.getVisibility() == 0 ? 0 : 8);
        bindings.totalSellableSharesRow.setMetadataPrimaryText(state.getTotalSellableShares());
        RdsButton viewPendingOrdersBtn = bindings.viewPendingOrdersBtn;
        Intrinsics.checkNotNullExpressionValue(viewPendingOrdersBtn, "viewPendingOrdersBtn");
        viewPendingOrdersBtn.setVisibility(state.getShowPendingOrderButton() ? 0 : 8);
        RdsButton viewPendingOrdersBtn2 = bindings.viewPendingOrdersBtn;
        Intrinsics.checkNotNullExpressionValue(viewPendingOrdersBtn2, "viewPendingOrdersBtn");
        OnClickListeners.onClick(viewPendingOrdersBtn2, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotEnoughSharesDialogFragment.setState$lambda$4$lambda$1(this.f$0);
            }
        });
        RdsButton sellAllBtn = bindings.sellAllBtn;
        Intrinsics.checkNotNullExpressionValue(sellAllBtn, "sellAllBtn");
        sellAllBtn.setVisibility(state.getShowSellAllButton() ? 0 : 8);
        RdsButton sellAllBtn2 = bindings.sellAllBtn;
        Intrinsics.checkNotNullExpressionValue(sellAllBtn2, "sellAllBtn");
        OnClickListeners.onClick(sellAllBtn2, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotEnoughSharesDialogFragment.setState$lambda$4$lambda$2(this.f$0);
            }
        });
        RdsButton dismissBtn = bindings.dismissBtn;
        Intrinsics.checkNotNullExpressionValue(dismissBtn, "dismissBtn");
        OnClickListeners.onClick(dismissBtn, new Function0() { // from class: com.robinhood.android.trade.equity.ui.dialog.notenoughshares.NotEnoughSharesDialogFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NotEnoughSharesDialogFragment.setState$lambda$4$lambda$3(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$4$lambda$1(NotEnoughSharesDialogFragment notEnoughSharesDialogFragment) {
        Navigator navigator = notEnoughSharesDialogFragment.getNavigator();
        FragmentActivity fragmentActivityRequireActivity = notEnoughSharesDialogFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new WatchListIntentKey(WatchListIntentKey2.ORDERS), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$4$lambda$2(NotEnoughSharesDialogFragment notEnoughSharesDialogFragment) {
        notEnoughSharesDialogFragment.getCallbacks().onNotEnoughDialogSellAllClicked();
        notEnoughSharesDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setState$lambda$4$lambda$3(NotEnoughSharesViewState notEnoughSharesViewState, NotEnoughSharesDialogFragment notEnoughSharesDialogFragment) {
        if (notEnoughSharesViewState.getHasNoSellableShares()) {
            notEnoughSharesDialogFragment.getCallbacks().onNotEnoughDialogNoSellableQuantity();
        }
        notEnoughSharesDialogFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: NotEnoughSharesDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDialogFragment;", "Lcom/robinhood/android/trade/equity/ui/dialog/notenoughshares/NotEnoughSharesDuxo$Args;", "<init>", "()V", "newInstance", "targetFragment", "Landroidx/fragment/app/Fragment;", "args", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<NotEnoughSharesDialogFragment, NotEnoughSharesDuxo.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public NotEnoughSharesDuxo.Args getArgs(NotEnoughSharesDialogFragment notEnoughSharesDialogFragment) {
            return (NotEnoughSharesDuxo.Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, notEnoughSharesDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NotEnoughSharesDialogFragment newInstance(NotEnoughSharesDuxo.Args args) {
            return (NotEnoughSharesDialogFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NotEnoughSharesDialogFragment notEnoughSharesDialogFragment, NotEnoughSharesDuxo.Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, notEnoughSharesDialogFragment, args);
        }

        public final NotEnoughSharesDialogFragment newInstance(Fragment targetFragment, NotEnoughSharesDuxo.Args args) {
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(args, "args");
            NotEnoughSharesDialogFragment notEnoughSharesDialogFragment = (NotEnoughSharesDialogFragment) newInstance((Parcelable) args);
            Preconditions.checkImplementsInterface(targetFragment, NotEnoughSharesDialogCallbacks.class);
            notEnoughSharesDialogFragment.setTargetFragment(targetFragment, 0);
            return notEnoughSharesDialogFragment;
        }
    }
}
