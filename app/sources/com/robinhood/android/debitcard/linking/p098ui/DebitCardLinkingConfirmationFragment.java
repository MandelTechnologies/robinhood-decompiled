package com.robinhood.android.debitcard.linking.p098ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardLinkingConfirmationBinding;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DebitCardLinkingConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingConfirmationFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "getTransferAccountStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "setTransferAccountStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;)V", "binding", "Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "Args", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardLinkingConfirmationFragment extends AutoLoggableDebitCardLinkingFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final Screen.Name protoScreenName;
    public TransferAccountStore transferAccountStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardLinkingConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardLinkingConfirmationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DebitCardLinkingConfirmationFragment() {
        super(C13894R.layout.fragment_debit_card_linking_confirmation);
        this.binding = ViewBinding5.viewBinding(this, DebitCardLinkingConfirmationFragment2.INSTANCE);
        this.protoScreenName = Screen.Name.DEBIT_CARD_LINKING_CONFIRMATION;
    }

    public final TransferAccountStore getTransferAccountStore() {
        TransferAccountStore transferAccountStore = this.transferAccountStore;
        if (transferAccountStore != null) {
            return transferAccountStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transferAccountStore");
        return null;
    }

    public final void setTransferAccountStore(TransferAccountStore transferAccountStore) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "<set-?>");
        this.transferAccountStore = transferAccountStore;
    }

    private final FragmentDebitCardLinkingConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDebitCardLinkingConfirmationBinding) value;
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTransferAccountStore().refresh(true);
        Companion companion = INSTANCE;
        DebitCardLinkingConfiguration configuration = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
        boolean z = configuration instanceof DebitCardLinkingConfiguration.MatchaOnboardingRequest;
        FragmentDebitCardLinkingConfirmationBinding binding = getBinding();
        RdsButton rdsButton = binding.primaryButton;
        Intrinsics.checkNotNull(rdsButton);
        rdsButton.setVisibility(((Args) companion.getArgs((Fragment) this)).getShowTransfersCta() ? 0 : 8);
        OnClickListeners.onClick(rdsButton, new DebitCardLinkingConfirmationFragment3(this));
        if (!z) {
            ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DebitCardLinkingConfirmationFragment.onViewCreated$lambda$4$lambda$1$lambda$0(this.f$0);
                }
            }, 1, null);
        } else {
            rdsButton.setVisibility(0);
            rdsButton.setText(getString(C11048R.string.general_label_continue));
            OnClickListeners.onClick(rdsButton, new DebitCardLinkingConfirmationFragment4(this));
        }
        RdsButton rdsButton2 = binding.secondaryButton;
        Intrinsics.checkNotNull(rdsButton2);
        rdsButton2.setVisibility(((Args) companion.getArgs((Fragment) this)).getShowDoneCta() && !z ? 0 : 8);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardLinkingConfirmationFragment.onViewCreated$lambda$4$lambda$3$lambda$2(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new DebitCardLinkingConfirmationFragment5(this));
        if (z) {
            getBinding().confirmationTitle.setText(getString(C13894R.string.matcha_card_linking_confirmation_title));
            getBinding().confirmationSubtitle.setText(getString(C13894R.string.matcha_onboarding_linking_confirmation_subtitle, ((DebitCardLinkingConfiguration.MatchaOnboardingRequest) configuration).getFirstName()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4$lambda$1$lambda$0(DebitCardLinkingConfirmationFragment debitCardLinkingConfirmationFragment) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DEPOSIT_MONEY;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        return new UserInteractionEventDescriptor(null, debitCardLinkingConfirmationFragment.getEventScreen(), action, debitCardLinkingConfirmationFragment.getLoggingContext(), component, null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4$lambda$3$lambda$2(DebitCardLinkingConfirmationFragment debitCardLinkingConfirmationFragment) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DONE;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        return new UserInteractionEventDescriptor(null, debitCardLinkingConfirmationFragment.getEventScreen(), action, debitCardLinkingConfirmationFragment.getLoggingContext(), component, null, 33, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPrimaryButtonClicked() {
        TransferConfiguration.TransferAccountSelection sinkAccount;
        DebitCardLinkingConfiguration configuration;
        MAXTransferContext.EntryPoint entryPoint;
        TransferConfiguration postDebitCardLinking;
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getConfiguration() instanceof DebitCardLinkingConfiguration.MatchaOnboardingRequest) {
            requireActivity().setResult(-1, new Intent().putExtra("instrumentId", ((Args) companion.getArgs((Fragment) this)).getPaymentInstrumentId()));
        } else {
            ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.DEBIT_CARD;
            BigDecimal amountToTransfer = null;
            TransferConfiguration.TransferAccountSelection transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, transferAccountType, 1, null);
            DebitCardLinkingConfiguration configuration2 = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
            if (!(configuration2 instanceof DebitCardLinkingConfiguration.Standard)) {
                if (!(configuration2 instanceof DebitCardLinkingConfiguration.Recommendations)) {
                    if (!(configuration2 instanceof DebitCardLinkingConfiguration.MatchaOnboardingRequest)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sinkAccount = null;
                    configuration = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
                    if (!(configuration instanceof DebitCardLinkingConfiguration.Standard)) {
                    }
                    BigDecimal bigDecimal = amountToTransfer;
                    if (((Args) companion.getArgs((Fragment) this)).getVerifyOnly()) {
                    }
                    Navigator navigator = getNavigator();
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, fragmentActivityRequireActivity, new Transfer(postDebitCardLinking), null, false, null, null, 60, null);
                } else {
                    sinkAccount = ((DebitCardLinkingConfiguration.Recommendations) configuration2).getSinkAccount();
                    configuration = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
                    if (!(configuration instanceof DebitCardLinkingConfiguration.Standard)) {
                        if (configuration instanceof DebitCardLinkingConfiguration.Recommendations) {
                            amountToTransfer = ((DebitCardLinkingConfiguration.Recommendations) configuration).getAmountToTransfer();
                        } else if (!(configuration instanceof DebitCardLinkingConfiguration.MatchaOnboardingRequest)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    BigDecimal bigDecimal2 = amountToTransfer;
                    if (((Args) companion.getArgs((Fragment) this)).getVerifyOnly()) {
                        postDebitCardLinking = new TransferConfiguration.Standard(new BigDecimal(0), ApiCreateTransferRequest2.ONCE, false, new TransferConfiguration.TransferAccountSelection(null, false, transferAccountType, 3, null), null, null, MAXTransferContext.EntryPoint.LINK_DEBIT_CARD, null, true, false, null, null, false, 7856, null);
                    } else {
                        DebitCardLinkingConfiguration configuration3 = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
                        if (configuration3 instanceof DebitCardLinkingConfiguration.Recommendations) {
                            entryPoint = MAXTransferContext.EntryPoint.FTR_DCF_LINKING;
                        } else if ((configuration3 instanceof DebitCardLinkingConfiguration.Standard) && ((Args) companion.getArgs((Fragment) this)).getConfiguration().getOriginalEntryPoint() == PaymentLinkingContext.EntryPoint.MENU_OF_OPTIONS) {
                            entryPoint = MAXTransferContext.EntryPoint.MENU_OF_OPTIONS;
                        } else {
                            entryPoint = MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                        }
                        postDebitCardLinking = new TransferConfiguration.PostDebitCardLinking(bigDecimal2, transferAccountSelection, sinkAccount, entryPoint, false, 16, null);
                    }
                    Navigator navigator2 = getNavigator();
                    FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator2, fragmentActivityRequireActivity2, new Transfer(postDebitCardLinking), null, false, null, null, 60, null);
                }
            } else {
                sinkAccount = null;
                configuration = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
                if (!(configuration instanceof DebitCardLinkingConfiguration.Standard)) {
                }
                BigDecimal bigDecimal22 = amountToTransfer;
                if (((Args) companion.getArgs((Fragment) this)).getVerifyOnly()) {
                }
                Navigator navigator22 = getNavigator();
                FragmentActivity fragmentActivityRequireActivity22 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity22, "requireActivity(...)");
                Navigator.DefaultImpls.startActivity$default(navigator22, fragmentActivityRequireActivity22, new Transfer(postDebitCardLinking), null, false, null, null, 60, null);
            }
        }
        requireActivity().finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSecondaryButtonClicked() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.setResult(-1, new Intent().putExtra("instrumentId", ((Args) INSTANCE.getArgs((Fragment) this)).getPaymentInstrumentId()));
        fragmentActivityRequireActivity.finish();
    }

    /* compiled from: DebitCardLinkingConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingConfirmationFragment$Args;", "Landroid/os/Parcelable;", "paymentInstrumentId", "Ljava/util/UUID;", "showTransfersCta", "", "showDoneCta", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "verifyOnly", "<init>", "(Ljava/util/UUID;ZZLcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;Z)V", "getPaymentInstrumentId", "()Ljava/util/UUID;", "getShowTransfersCta", "()Z", "getShowDoneCta", "getConfiguration", "()Lcom/robinhood/android/navigation/app/keys/data/DebitCardLinkingConfiguration;", "getVerifyOnly", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DebitCardLinkingConfiguration configuration;
        private final UUID paymentInstrumentId;
        private final boolean showDoneCta;
        private final boolean showTransfersCta;
        private final boolean verifyOnly;

        /* compiled from: DebitCardLinkingConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                DebitCardLinkingConfiguration debitCardLinkingConfiguration;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                DebitCardLinkingConfiguration debitCardLinkingConfiguration2 = (DebitCardLinkingConfiguration) parcel.readParcelable(Args.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z3 = z2;
                    debitCardLinkingConfiguration = debitCardLinkingConfiguration2;
                } else {
                    debitCardLinkingConfiguration = debitCardLinkingConfiguration2;
                    z3 = z;
                }
                return new Args(uuid, z4, z5, debitCardLinkingConfiguration, z3);
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
            dest.writeSerializable(this.paymentInstrumentId);
            dest.writeInt(this.showTransfersCta ? 1 : 0);
            dest.writeInt(this.showDoneCta ? 1 : 0);
            dest.writeParcelable(this.configuration, flags);
            dest.writeInt(this.verifyOnly ? 1 : 0);
        }

        public Args(UUID paymentInstrumentId, boolean z, boolean z2, DebitCardLinkingConfiguration configuration, boolean z3) {
            Intrinsics.checkNotNullParameter(paymentInstrumentId, "paymentInstrumentId");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.paymentInstrumentId = paymentInstrumentId;
            this.showTransfersCta = z;
            this.showDoneCta = z2;
            this.configuration = configuration;
            this.verifyOnly = z3;
        }

        public final UUID getPaymentInstrumentId() {
            return this.paymentInstrumentId;
        }

        public final boolean getShowTransfersCta() {
            return this.showTransfersCta;
        }

        public final boolean getShowDoneCta() {
            return this.showDoneCta;
        }

        public final DebitCardLinkingConfiguration getConfiguration() {
            return this.configuration;
        }

        public final boolean getVerifyOnly() {
            return this.verifyOnly;
        }
    }

    /* compiled from: DebitCardLinkingConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingConfirmationFragment;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingConfirmationFragment$Args;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DebitCardLinkingConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DebitCardLinkingConfirmationFragment debitCardLinkingConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, debitCardLinkingConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DebitCardLinkingConfirmationFragment newInstance(Args args) {
            return (DebitCardLinkingConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DebitCardLinkingConfirmationFragment debitCardLinkingConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, debitCardLinkingConfirmationFragment, args);
        }
    }
}
