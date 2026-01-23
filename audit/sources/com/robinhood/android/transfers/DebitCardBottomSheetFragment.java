package com.robinhood.android.transfers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.banking.p065ui.CardNetworkTypes;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.debitcard.strings.ApiDebitCardInstruments;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.android.transfers.transferhub.databinding.FragmentDebitCardBottomSheetBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentStatus;
import com.robinhood.models.api.bonfire.paymentinstruments.VerificationMethod;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DebitCardBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\"\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u0017H\u0016J\b\u0010&\u001a\u00020\u0017H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/transfers/DebitCardBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "<init>", "()V", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "getDebitCardInstrumentStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "setDebitCardInstrumentStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;)V", "binding", "Lcom/robinhood/android/transfers/transferhub/databinding/FragmentDebitCardBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/transfers/transferhub/databinding/FragmentDebitCardBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "canDismiss", "", "debitCardActionAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/transfers/DebitCardAction;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "dismiss", "onUnlinkSuccessful", "Args", "Companion", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class DebitCardBottomSheetFragment extends BaseBottomSheetDialogFragment {
    public static final int editExpirationDateRequestCode = 2102;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private boolean canDismiss;
    private final GenericListAdapter<RdsRowView, DebitCardAction> debitCardActionAdapter;
    public DebitCardInstrumentStore debitCardInstrumentStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/transfers/transferhub/databinding/FragmentDebitCardBottomSheetBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DebitCardAction.values().length];
            try {
                iArr[DebitCardAction.UNLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DebitCardAction.VERIFY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DebitCardBottomSheetFragment() {
        super(C30556R.layout.fragment_debit_card_bottom_sheet);
        this.binding = ViewBinding5.viewBinding(this, DebitCardBottomSheetFragment2.INSTANCE);
        this.canDismiss = true;
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C30556R.layout.include_debit_card_action_row;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.debitCardActionAdapter = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.transfers.DebitCardBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DebitCardBottomSheetFragment.debitCardActionAdapter$lambda$2(this.f$0, (RdsRowView) obj, (DebitCardAction) obj2);
            }
        });
    }

    public final DebitCardInstrumentStore getDebitCardInstrumentStore() {
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore;
        if (debitCardInstrumentStore != null) {
            return debitCardInstrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debitCardInstrumentStore");
        return null;
    }

    public final void setDebitCardInstrumentStore(DebitCardInstrumentStore debitCardInstrumentStore) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "<set-?>");
        this.debitCardInstrumentStore = debitCardInstrumentStore;
    }

    private final FragmentDebitCardBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDebitCardBottomSheetBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit debitCardActionAdapter$lambda$2(final DebitCardBottomSheetFragment debitCardBottomSheetFragment, final RdsRowView of, final DebitCardAction debitCardAction) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(debitCardAction, "debitCardAction");
        of.setPrimaryText(debitCardBottomSheetFragment.getString(debitCardAction.getStringResource()));
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.transfers.DebitCardBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardBottomSheetFragment.debitCardActionAdapter$lambda$2$lambda$1(debitCardAction, debitCardBottomSheetFragment, of);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit debitCardActionAdapter$lambda$2$lambda$1(DebitCardAction debitCardAction, final DebitCardBottomSheetFragment debitCardBottomSheetFragment, RdsRowView rdsRowView) {
        int i = WhenMappings.$EnumSwitchMapping$0[debitCardAction.ordinal()];
        if (i == 1) {
            final FragmentDebitCardBottomSheetBinding binding = debitCardBottomSheetFragment.getBinding();
            Completable completableDoOnSubscribe = CompletablesAndroid.observeOnMainThread(debitCardBottomSheetFragment.getDebitCardInstrumentStore().unlinkDebitCardInstrument(((Args) INSTANCE.getArgs((Fragment) debitCardBottomSheetFragment)).getDebitCardInstrumentId())).doOnComplete(new Action() { // from class: com.robinhood.android.transfers.DebitCardBottomSheetFragment$debitCardActionAdapter$1$1$1$1
                @Override // io.reactivex.functions.Action
                public final void run() {
                    binding.dismissButton.setLoading(false);
                    debitCardBottomSheetFragment.canDismiss = true;
                }
            }).doOnDispose(new Action() { // from class: com.robinhood.android.transfers.DebitCardBottomSheetFragment$debitCardActionAdapter$1$1$1$2
                @Override // io.reactivex.functions.Action
                public final void run() {
                    binding.dismissButton.setLoading(false);
                    debitCardBottomSheetFragment.canDismiss = true;
                }
            }).doOnError(new Consumer() { // from class: com.robinhood.android.transfers.DebitCardBottomSheetFragment$debitCardActionAdapter$1$1$1$3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Throwable th) {
                    binding.dismissButton.setLoading(false);
                    debitCardBottomSheetFragment.canDismiss = true;
                }
            }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.DebitCardBottomSheetFragment$debitCardActionAdapter$1$1$1$4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Disposable disposable) {
                    binding.dismissButton.setLoading(true);
                    debitCardBottomSheetFragment.canDismiss = false;
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
            LifecycleHost.DefaultImpls.bind$default(debitCardBottomSheetFragment, completableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new DebitCardBottomSheetFragment7(debitCardBottomSheetFragment), new DebitCardBottomSheetFragment8(Views.getActivityErrorHandler(rdsRowView)));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator navigator = debitCardBottomSheetFragment.getNavigator();
            Context contextRequireContext = debitCardBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.DebitCardDynamicCodeVerification.Standalone(((Args) INSTANCE.getArgs((Fragment) debitCardBottomSheetFragment)).getDebitCardInstrumentId(), PaymentLinkingContext.EntryPoint.LINKED_ACCOUNTS_SECTION_ACTION_SHEET), false, false, false, false, null, false, null, null, 1012, null);
            debitCardBottomSheetFragment.dismiss();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final FragmentDebitCardBottomSheetBinding binding = getBinding();
        binding.debitCardActions.setAdapter(this.debitCardActionAdapter);
        RdsButton dismissButton = binding.dismissButton;
        Intrinsics.checkNotNullExpressionValue(dismissButton, "dismissButton");
        OnClickListeners.onClick(dismissButton, new DebitCardBottomSheetFragment9(this));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDebitCardInstrumentStore().getDebitCardInstrument(((Args) INSTANCE.getArgs((Fragment) this)).getDebitCardInstrumentId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.DebitCardBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardBottomSheetFragment.onViewCreated$lambda$6$lambda$5(binding, this, (ApiPaymentInstrument) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6$lambda$5(FragmentDebitCardBottomSheetBinding fragmentDebitCardBottomSheetBinding, DebitCardBottomSheetFragment debitCardBottomSheetFragment, ApiPaymentInstrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        ApiPaymentInstrumentDetails payment_instrument_details = instrument.getPayment_instrument_details();
        Intrinsics.checkNotNull(payment_instrument_details, "null cannot be cast to non-null type com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails.DebitCard");
        ApiPaymentInstrumentDetails.DebitCard debitCard = (ApiPaymentInstrumentDetails.DebitCard) payment_instrument_details;
        boolean z = instrument.getPayment_instrument_status() == PaymentInstrumentStatus.PENDING_VERIFICATION && debitCard.getVerification_method() != VerificationMethod.SETUP_INTENT;
        RhTextView primaryText = fragmentDebitCardBottomSheetBinding.primaryText;
        Intrinsics.checkNotNullExpressionValue(primaryText, "primaryText");
        TextViewsKt.setVisibilityText(primaryText, debitCardBottomSheetFragment.getString(CardNetworkTypes.getStringResource(debitCard.getCard_network_type())));
        RhTextView secondaryText = fragmentDebitCardBottomSheetBinding.secondaryText;
        Intrinsics.checkNotNullExpressionValue(secondaryText, "secondaryText");
        TextViewsKt.setVisibilityText(secondaryText, debitCardBottomSheetFragment.getString(C30556R.string.debit_card_bottom_sheet_secondary_text, debitCard.getLast4(), debitCardBottomSheetFragment.getString(ApiDebitCardInstruments.getStatusRes(instrument))));
        GenericListAdapter<RdsRowView, DebitCardAction> genericListAdapter = debitCardBottomSheetFragment.debitCardActionAdapter;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(DebitCardAction.VERIFY);
        }
        arrayList.add(DebitCardAction.UNLINK);
        genericListAdapter.submitList(arrayList);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 2102 && resultCode == -1) {
            dismiss();
            RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
            Snackbars snackbars = Snackbars.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            RdsSnackbar rdsSnackbarMake = companion.make(snackbars.findRoot(fragmentActivityRequireActivity), C9631R.string.debit_card_edit_expiration_date_successful, 0);
            rdsSnackbarMake.setLeadingIcon(C20690R.drawable.ic_rds_checkmark_16dp);
            rdsSnackbarMake.show();
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (this.canDismiss) {
            super.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnlinkSuccessful() {
        dismiss();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Snackbars.show(fragmentActivityRequireActivity, C9631R.string.debit_card_unlink_successful, 0);
    }

    /* compiled from: DebitCardBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/DebitCardBottomSheetFragment$Args;", "Landroid/os/Parcelable;", "debitCardInstrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID debitCardInstrumentId;

        /* compiled from: DebitCardBottomSheetFragment.kt */
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
            dest.writeSerializable(this.debitCardInstrumentId);
        }

        public Args(UUID debitCardInstrumentId) {
            Intrinsics.checkNotNullParameter(debitCardInstrumentId, "debitCardInstrumentId");
            this.debitCardInstrumentId = debitCardInstrumentId;
        }

        public final UUID getDebitCardInstrumentId() {
            return this.debitCardInstrumentId;
        }
    }

    /* compiled from: DebitCardBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/DebitCardBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/transfers/DebitCardBottomSheetFragment;", "Lcom/robinhood/android/transfers/DebitCardBottomSheetFragment$Args;", "<init>", "()V", "editExpirationDateRequestCode", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DebitCardBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DebitCardBottomSheetFragment debitCardBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, debitCardBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DebitCardBottomSheetFragment newInstance(Args args) {
            return (DebitCardBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DebitCardBottomSheetFragment debitCardBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, debitCardBottomSheetFragment, args);
        }
    }
}
