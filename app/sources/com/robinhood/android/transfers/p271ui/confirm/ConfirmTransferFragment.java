package com.robinhood.android.transfers.p271ui.confirm;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.databinding.FragmentConfirmTransferBinding;
import com.robinhood.android.transfers.p271ui.confirm.ConfirmTransferFragment;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.UUID;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ConfirmTransferFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u0001:\u0003!\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferDuxo;", "getDuxo", "()Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/transfers/databinding/FragmentConfirmTransferBinding;", "getBinding", "()Lcom/robinhood/android/transfers/databinding/FragmentConfirmTransferBinding;", "binding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "bind", "state", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferViewState;", "Callbacks", "Args", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ConfirmTransferFragment extends BaseFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ConfirmTransferFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(ConfirmTransferFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/databinding/FragmentConfirmTransferBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ConfirmTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Callbacks;", "", "onTransferConfirmed", "", "timeline", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$Timeline;", "onTransferDetailRequested", "transferId", "Ljava/util/UUID;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTransferConfirmed(UiPostTransferPage.Timeline timeline);

        void onTransferDetailRequested(UUID transferId);
    }

    public ConfirmTransferFragment() {
        super(C30065R.layout.fragment_confirm_transfer);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof ConfirmTransferFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, ConfirmTransferDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, ConfirmTransferFragment2.INSTANCE);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfirmTransferDuxo getDuxo() {
        return (ConfirmTransferDuxo) this.duxo.getValue();
    }

    private final FragmentConfirmTransferBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentConfirmTransferBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton approveBtn = getBinding().approveBtn;
        Intrinsics.checkNotNullExpressionValue(approveBtn, "approveBtn");
        OnClickListeners.onClick(approveBtn, new C305881(getDuxo()));
        RdsButton cancelBtn = getBinding().cancelBtn;
        Intrinsics.checkNotNullExpressionValue(cancelBtn, "cancelBtn");
        OnClickListeners.onClick(cancelBtn, new C305892(getDuxo()));
        BaseFragment.collectDuxoState$default(this, null, new C305903(null), 1, null);
    }

    /* compiled from: ConfirmTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment$onViewCreated$1 */
    /* synthetic */ class C305881 extends FunctionReferenceImpl implements Function0<Unit> {
        C305881(Object obj) {
            super(0, obj, ConfirmTransferDuxo.class, "confirmTransfer", "confirmTransfer()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfirmTransferDuxo) this.receiver).confirmTransfer();
        }
    }

    /* compiled from: ConfirmTransferFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment$onViewCreated$2 */
    /* synthetic */ class C305892 extends FunctionReferenceImpl implements Function0<Unit> {
        C305892(Object obj) {
            super(0, obj, ConfirmTransferDuxo.class, "abortTransfer", "abortTransfer()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ConfirmTransferDuxo) this.receiver).abortTransfer();
        }
    }

    /* compiled from: ConfirmTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment$onViewCreated$3", m3645f = "ConfirmTransferFragment.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment$onViewCreated$3 */
    static final class C305903 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C305903(Continuation<? super C305903> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConfirmTransferFragment.this.new C305903(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C305903) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ConfirmTransferViewState> stateFlow = ConfirmTransferFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ConfirmTransferFragment.this);
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

        /* compiled from: ConfirmTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ConfirmTransferFragment $tmp0;

            AnonymousClass1(ConfirmTransferFragment confirmTransferFragment) {
                this.$tmp0 = confirmTransferFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ConfirmTransferFragment.class, "bind", "bind(Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(ConfirmTransferViewState confirmTransferDuxo9, Continuation<? super Unit> continuation) throws Throwable {
                Object objInvokeSuspend$bind = C305903.invokeSuspend$bind(this.$tmp0, confirmTransferDuxo9, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((ConfirmTransferViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(ConfirmTransferFragment confirmTransferFragment, ConfirmTransferViewState confirmTransferDuxo9, Continuation continuation) throws Throwable {
            confirmTransferFragment.bind(confirmTransferDuxo9);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(ConfirmTransferViewState state) throws Throwable {
        Throwable thConsume;
        UiPostTransferPage.Timeline timelineConsume;
        UUID uuidConsume;
        Money amount;
        ShimmerLoadingView loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.isLoading() ? 0 : 8);
        RhTextView rhTextView = getBinding().amountTxt;
        AchTransfer transfer = state.getTransfer();
        rhTextView.setText((transfer == null || (amount = transfer.getAmount()) == null) ? null : Money.format$default(amount, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        RhTextView rhTextView2 = getBinding().accountTxt;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView2.setText(state.getAccountText(resources));
        RdsButton approveBtn = getBinding().approveBtn;
        Intrinsics.checkNotNullExpressionValue(approveBtn, "approveBtn");
        approveBtn.setVisibility(state.getAreButtonsVisible() ? 0 : 8);
        getBinding().approveBtn.setLoading(state.isConfirmInFlight());
        RdsButton cancelBtn = getBinding().cancelBtn;
        Intrinsics.checkNotNullExpressionValue(cancelBtn, "cancelBtn");
        cancelBtn.setVisibility(state.getAreButtonsVisible() ? 0 : 8);
        getBinding().cancelBtn.setLoading(state.isAbortInFlight());
        UiEvent<UUID> viewTransferDetailEvent = state.getViewTransferDetailEvent();
        if (viewTransferDetailEvent != null && (uuidConsume = viewTransferDetailEvent.consume()) != null) {
            getCallbacks().onTransferDetailRequested(uuidConsume);
        }
        UiEvent<UiPostTransferPage.Timeline> transferConfirmedEvent = state.getTransferConfirmedEvent();
        if (transferConfirmedEvent != null && (timelineConsume = transferConfirmedEvent.consume()) != null) {
            getCallbacks().onTransferConfirmed(timelineConsume);
        }
        ErrorHandlers.handleErrorEvent(getActivityErrorHandler(), state.getErrorEvent());
        UiEvent<Throwable> loadErrorEvent = state.getLoadErrorEvent();
        if (loadErrorEvent == null || (thConsume = loadErrorEvent.consume()) == null) {
            return;
        }
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, thConsume, true, false, 0, null, 56, null);
    }

    /* compiled from: ConfirmTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Args;", "Landroid/os/Parcelable;", "transferId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getTransferId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID transferId;

        /* compiled from: ConfirmTransferFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.transferId);
        }

        public Args(UUID transferId) {
            Intrinsics.checkNotNullParameter(transferId, "transferId");
            this.transferId = transferId;
        }

        public final UUID getTransferId() {
            return this.transferId;
        }
    }

    /* compiled from: ConfirmTransferFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment;", "Lcom/robinhood/android/transfers/ui/confirm/ConfirmTransferFragment$Args;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ConfirmTransferFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ConfirmTransferFragment confirmTransferFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, confirmTransferFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ConfirmTransferFragment newInstance(Args args) {
            return (ConfirmTransferFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ConfirmTransferFragment confirmTransferFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, confirmTransferFragment, args);
        }
    }
}
