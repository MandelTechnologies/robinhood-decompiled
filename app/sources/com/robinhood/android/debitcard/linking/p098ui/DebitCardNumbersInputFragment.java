package com.robinhood.android.debitcard.linking.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardNumbersInputBinding;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardNumbersInputFragment;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.stripe.android.model.CardParams;
import com.stripe.android.view.CardInputWidget;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DebitCardNumbersInputFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0003&'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "getTransfersBonfireApi", "()Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "setTransfersBonfireApi", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;)V", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "getStripeStore", "()Lcom/robinhood/store/stripe/StripeStore;", "setStripeStore", "(Lcom/robinhood/store/stripe/StripeStore;)V", "binding", "Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardNumbersInputBinding;", "getBinding", "()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardNumbersInputBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Callbacks;", "callbacks$delegate", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "Callbacks", "Args", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardNumbersInputFragment extends AutoLoggableDebitCardLinkingFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final Screen.Name protoScreenName;
    public StripeStore stripeStore;
    public TransfersBonfireApi transfersBonfireApi;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardNumbersInputFragment.class, "binding", "getBinding()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardNumbersInputBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DebitCardNumbersInputFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardNumbersInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Callbacks;", "", "onCardNumbersEntered", "", "cardParams", "Lcom/stripe/android/model/CardParams;", "onAlternativeActionClicked", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAlternativeActionClicked();

        void onCardNumbersEntered(CardParams cardParams);
    }

    public DebitCardNumbersInputFragment() {
        super(C13894R.layout.fragment_debit_card_numbers_input);
        this.binding = ViewBinding5.viewBinding(this, DebitCardNumbersInputFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DebitCardNumbersInputFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.protoScreenName = Screen.Name.DEBIT_CARD_NUMBERS_INPUT;
    }

    public final TransfersBonfireApi getTransfersBonfireApi() {
        TransfersBonfireApi transfersBonfireApi = this.transfersBonfireApi;
        if (transfersBonfireApi != null) {
            return transfersBonfireApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transfersBonfireApi");
        return null;
    }

    public final void setTransfersBonfireApi(TransfersBonfireApi transfersBonfireApi) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "<set-?>");
        this.transfersBonfireApi = transfersBonfireApi;
    }

    public final StripeStore getStripeStore() {
        StripeStore stripeStore = this.stripeStore;
        if (stripeStore != null) {
            return stripeStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stripeStore");
        return null;
    }

    public final void setStripeStore(StripeStore stripeStore) {
        Intrinsics.checkNotNullParameter(stripeStore, "<set-?>");
        this.stripeStore = stripeStore;
    }

    private final FragmentDebitCardNumbersInputBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDebitCardNumbersInputBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getStripeStore().initDebitCardConfiguration();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentDebitCardNumbersInputBinding binding = getBinding();
        CardInputWidget cardInputWidget = binding.cardInputWidget;
        Intrinsics.checkNotNull(cardInputWidget);
        CardInputWidgets.preventSoftInputOnFocus(cardInputWidget);
        CardInputWidgets.limitPostalCodeToFiveCharacters(cardInputWidget);
        CardInputWidgets.announceAutoFocusChange(cardInputWidget);
        LifecycleHost.DefaultImpls.bind$default(this, CardInputWidgets.streamIsValid(cardInputWidget), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardNumbersInputFragment.onViewCreated$lambda$7$lambda$2$lambda$0(binding, ((Boolean) obj).booleanValue());
            }
        });
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getShowMatchaOnboardingDisclosure()) {
            binding.enterDebitCardNumberTitle.setText(cardInputWidget.getResources().getString(C13894R.string.matcha_enter_debit_card_number_title));
            binding.matchaDisclosure.setVisibility(0);
        }
        if (((Args) companion.getArgs((Fragment) this)).getShowDisclosureAndAlternativeAction()) {
            Single map = RxFactory.DefaultImpls.rxSingle$default(this, null, new DebitCardNumbersInputFragment3(this, null), 1, null).map(new Function() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$onViewCreated$1$1$3
                @Override // io.reactivex.functions.Function
                public final Optional<ApiServiceFeeParams> apply(ApiServiceFeeParams it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Optional.INSTANCE.m2972of(it);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(SinglesKt.ignoreNetworkExceptions(map)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DebitCardNumbersInputFragment.onViewCreated$lambda$7$lambda$2$lambda$1(binding, this, (Optional) obj);
                }
            });
            RhTextView debitCardDisclosure = binding.debitCardDisclosure;
            Intrinsics.checkNotNullExpressionValue(debitCardDisclosure, "debitCardDisclosure");
            debitCardDisclosure.setVisibility(8);
            RdsTextButton alternativeActionBtn = binding.alternativeActionBtn;
            Intrinsics.checkNotNullExpressionValue(alternativeActionBtn, "alternativeActionBtn");
            alternativeActionBtn.setVisibility(0);
            cardInputWidget.setCardNumberTextWatcher(new TextWatcher() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$onViewCreated$1$1$5
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    RhTextView debitCardDisclosure2 = binding.debitCardDisclosure;
                    Intrinsics.checkNotNullExpressionValue(debitCardDisclosure2, "debitCardDisclosure");
                    boolean z = true;
                    debitCardDisclosure2.setVisibility(!(s == null || s.length() == 0) ? 0 : 8);
                    RdsTextButton alternativeActionBtn2 = binding.alternativeActionBtn;
                    Intrinsics.checkNotNullExpressionValue(alternativeActionBtn2, "alternativeActionBtn");
                    if (s != null && s.length() != 0) {
                        z = false;
                    }
                    alternativeActionBtn2.setVisibility(z ? 0 : 8);
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, binding.numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new DebitCardNumbersInputFragment6(binding.cardInputWidget));
        RdsButton rdsButton = binding.continueButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardNumbersInputFragment.onViewCreated$lambda$7$lambda$5$lambda$3(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardNumbersInputFragment.onViewCreated$lambda$7$lambda$5$lambda$4(this.f$0, binding);
            }
        });
        RdsTextButton alternativeActionBtn2 = binding.alternativeActionBtn;
        Intrinsics.checkNotNullExpressionValue(alternativeActionBtn2, "alternativeActionBtn");
        OnClickListeners.onClick(alternativeActionBtn2, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardNumbersInputFragment.onViewCreated$lambda$7$lambda$6(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$2$lambda$0(FragmentDebitCardNumbersInputBinding fragmentDebitCardNumbersInputBinding, boolean z) {
        fragmentDebitCardNumbersInputBinding.continueButton.setEnabled(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$2$lambda$1(FragmentDebitCardNumbersInputBinding fragmentDebitCardNumbersInputBinding, DebitCardNumbersInputFragment debitCardNumbersInputFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        ApiServiceFeeParams apiServiceFeeParams = (ApiServiceFeeParams) optional.component1();
        if (apiServiceFeeParams != null) {
            fragmentDebitCardNumbersInputBinding.debitCardDisclosure.setText(debitCardNumbersInputFragment.getString(C13894R.string.link_debit_card_disclosure, apiServiceFeeParams.getPush().getFee_rate(), apiServiceFeeParams.getPush().getMin_fee()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$7$lambda$5$lambda$3(DebitCardNumbersInputFragment debitCardNumbersInputFragment) {
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
        return new UserInteractionEventDescriptor(null, debitCardNumbersInputFragment.getEventScreen(), action, debitCardNumbersInputFragment.getLoggingContext(), component, null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$5$lambda$4(DebitCardNumbersInputFragment debitCardNumbersInputFragment, FragmentDebitCardNumbersInputBinding fragmentDebitCardNumbersInputBinding) {
        Callbacks callbacks = debitCardNumbersInputFragment.getCallbacks();
        CardParams cardParams = fragmentDebitCardNumbersInputBinding.cardInputWidget.getCardParams();
        Intrinsics.checkNotNull(cardParams);
        callbacks.onCardNumbersEntered(cardParams);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7$lambda$6(DebitCardNumbersInputFragment debitCardNumbersInputFragment) {
        debitCardNumbersInputFragment.getCallbacks().onAlternativeActionClicked();
        return Unit.INSTANCE;
    }

    /* compiled from: DebitCardNumbersInputFragment.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Args;", "Landroid/os/Parcelable;", "showDisclosureAndAlternativeAction", "", "showMatchaOnboardingDisclosure", "<init>", "(ZZ)V", "getShowDisclosureAndAlternativeAction", "()Z", "getShowMatchaOnboardingDisclosure", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean showDisclosureAndAlternativeAction;
        private final boolean showMatchaOnboardingDisclosure;

        /* compiled from: DebitCardNumbersInputFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = args.showDisclosureAndAlternativeAction;
            }
            if ((i & 2) != 0) {
                z2 = args.showMatchaOnboardingDisclosure;
            }
            return args.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowDisclosureAndAlternativeAction() {
            return this.showDisclosureAndAlternativeAction;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowMatchaOnboardingDisclosure() {
            return this.showMatchaOnboardingDisclosure;
        }

        public final Args copy(boolean showDisclosureAndAlternativeAction, boolean showMatchaOnboardingDisclosure) {
            return new Args(showDisclosureAndAlternativeAction, showMatchaOnboardingDisclosure);
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
            return this.showDisclosureAndAlternativeAction == args.showDisclosureAndAlternativeAction && this.showMatchaOnboardingDisclosure == args.showMatchaOnboardingDisclosure;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.showDisclosureAndAlternativeAction) * 31) + Boolean.hashCode(this.showMatchaOnboardingDisclosure);
        }

        public String toString() {
            return "Args(showDisclosureAndAlternativeAction=" + this.showDisclosureAndAlternativeAction + ", showMatchaOnboardingDisclosure=" + this.showMatchaOnboardingDisclosure + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showDisclosureAndAlternativeAction ? 1 : 0);
            dest.writeInt(this.showMatchaOnboardingDisclosure ? 1 : 0);
        }

        public Args(boolean z, boolean z2) {
            this.showDisclosureAndAlternativeAction = z;
            this.showMatchaOnboardingDisclosure = z2;
        }

        public final boolean getShowDisclosureAndAlternativeAction() {
            return this.showDisclosureAndAlternativeAction;
        }

        public final boolean getShowMatchaOnboardingDisclosure() {
            return this.showMatchaOnboardingDisclosure;
        }
    }

    /* compiled from: DebitCardNumbersInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Args;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DebitCardNumbersInputFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DebitCardNumbersInputFragment debitCardNumbersInputFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, debitCardNumbersInputFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DebitCardNumbersInputFragment newInstance(Args args) {
            return (DebitCardNumbersInputFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DebitCardNumbersInputFragment debitCardNumbersInputFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, debitCardNumbersInputFragment, args);
        }
    }
}
