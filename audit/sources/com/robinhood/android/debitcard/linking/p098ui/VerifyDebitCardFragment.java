package com.robinhood.android.debitcard.linking.p098ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.databinding.FragmentVerifyDebitCardBinding;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrumentDetails;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.UUID;
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

/* compiled from: VerifyDebitCardFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0003\"#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "binding", "Lcom/robinhood/android/debitcard/linking/databinding/FragmentVerifyDebitCardBinding;", "getBinding", "()Lcom/robinhood/android/debitcard/linking/databinding/FragmentVerifyDebitCardBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Callbacks;", "callbacks$delegate", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "getDebitCardInstrumentStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "setDebitCardInstrumentStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setSubtitleText", "last4", "", "Callbacks", "Args", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VerifyDebitCardFragment extends AutoLoggableDebitCardLinkingFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public DebitCardInstrumentStore debitCardInstrumentStore;
    private final Screen.Name protoScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(VerifyDebitCardFragment.class, "binding", "getBinding()Lcom/robinhood/android/debitcard/linking/databinding/FragmentVerifyDebitCardBinding;", 0)), Reflection.property1(new PropertyReference1Impl(VerifyDebitCardFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: VerifyDebitCardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Callbacks;", "", "onSubmitVerificationCode", "", "verificationCode", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSubmitVerificationCode(String verificationCode);
    }

    public VerifyDebitCardFragment() {
        super(C13894R.layout.fragment_verify_debit_card);
        this.protoScreenName = Screen.Name.VERIFY_DEBIT_CARD_CODE_ENTRY;
        this.binding = ViewBinding5.viewBinding(this, VerifyDebitCardFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    private final FragmentVerifyDebitCardBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentVerifyDebitCardBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentVerifyDebitCardBinding binding = getBinding();
        final int integer = getResources().getInteger(C13894R.integer.debit_card_verification_code_length);
        RdsTextInputEditText debitCardVerificationCodeInput = binding.debitCardVerificationCodeInput;
        Intrinsics.checkNotNullExpressionValue(debitCardVerificationCodeInput, "debitCardVerificationCodeInput");
        Observable<R> map = RxTextView.textChanges(debitCardVerificationCodeInput).map(new Function() { // from class: com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment$onViewCreated$1$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.length() == integer);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyDebitCardFragment.onViewCreated$lambda$4$lambda$0(binding, (Boolean) obj);
            }
        });
        RdsButton rdsButton = binding.continueButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VerifyDebitCardFragment.onViewCreated$lambda$4$lambda$3$lambda$1(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VerifyDebitCardFragment.onViewCreated$lambda$4$lambda$3$lambda$2(this.f$0, binding);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, binding.numpad.getKeyEvents(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new VerifyDebitCardFragment4(binding.debitCardVerificationCodeInput));
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDebitCardInstrumentStore().getDebitCardInstrument(((Args) INSTANCE.getArgs((Fragment) this)).getDebitCardInstrumentId())), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyDebitCardFragment.onViewCreated$lambda$5(this.f$0, (ApiPaymentInstrument) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VerifyDebitCardFragment.onViewCreated$lambda$6(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$0(FragmentVerifyDebitCardBinding fragmentVerifyDebitCardBinding, Boolean bool) {
        RdsButton rdsButton = fragmentVerifyDebitCardBinding.continueButton;
        Intrinsics.checkNotNull(bool);
        rdsButton.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$4$lambda$3$lambda$1(VerifyDebitCardFragment verifyDebitCardFragment) {
        return new UserInteractionEventDescriptor(null, verifyDebitCardFragment.getEventScreen(), UserInteractionEventData.Action.CONTINUE, verifyDebitCardFragment.getLoggingContext(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3$lambda$2(VerifyDebitCardFragment verifyDebitCardFragment, FragmentVerifyDebitCardBinding fragmentVerifyDebitCardBinding) {
        Callbacks callbacks = verifyDebitCardFragment.getCallbacks();
        Editable text = fragmentVerifyDebitCardBinding.debitCardVerificationCodeInput.getText();
        Intrinsics.checkNotNull(text);
        callbacks.onSubmitVerificationCode(text.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(VerifyDebitCardFragment verifyDebitCardFragment, ApiPaymentInstrument it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ApiPaymentInstrumentDetails payment_instrument_details = it.getPayment_instrument_details();
        ApiPaymentInstrumentDetails.DebitCard debitCard = payment_instrument_details instanceof ApiPaymentInstrumentDetails.DebitCard ? (ApiPaymentInstrumentDetails.DebitCard) payment_instrument_details : null;
        verifyDebitCardFragment.setSubtitleText(debitCard != null ? debitCard.getLast4() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(VerifyDebitCardFragment verifyDebitCardFragment, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        verifyDebitCardFragment.setSubtitleText(null);
        return Unit.INSTANCE;
    }

    private final void setSubtitleText(String last4) {
        String string2;
        RhTextView rhTextView = getBinding().verifyDebitCardSubtitle;
        if (last4 == null || last4.length() == 0) {
            string2 = requireContext().getString(C13894R.string.verify_debit_card_subtitle);
        } else {
            string2 = requireContext().getString(C13894R.string.verify_debit_card_subtitle_with_last_4, last4);
        }
        rhTextView.setText(string2);
    }

    /* compiled from: VerifyDebitCardFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Args;", "Landroid/os/Parcelable;", "debitCardInstrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getDebitCardInstrumentId", "()Ljava/util/UUID;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID debitCardInstrumentId;

        /* compiled from: VerifyDebitCardFragment.kt */
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

    /* compiled from: VerifyDebitCardFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment;", "Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Args;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<VerifyDebitCardFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(VerifyDebitCardFragment verifyDebitCardFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, verifyDebitCardFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public VerifyDebitCardFragment newInstance(Args args) {
            return (VerifyDebitCardFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(VerifyDebitCardFragment verifyDebitCardFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, verifyDebitCardFragment, args);
        }
    }
}
