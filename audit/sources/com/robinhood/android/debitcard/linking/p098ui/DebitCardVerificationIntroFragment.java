package com.robinhood.android.debitcard.linking.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.databinding.FragmentDebitCardVerificationIntroBinding;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationIntroFragment;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.teller.TellerErrorHandler;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.stripe.android.model.CardParams;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: DebitCardVerificationIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0003\u001f !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "<init>", "()V", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "binding", "Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardVerificationIntroBinding;", "getBinding", "()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardVerificationIntroBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DebitCardVerificationIntroFragment extends AutoLoggableDebitCardLinkingFragment {
    public static final String EXIT_DEBIT_CARD_LINKING_FLOW_DIALOG_TAG = "exitDebitCardLinkingFlow";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final Screen.Name protoScreenName;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DebitCardVerificationIntroFragment.class, "binding", "getBinding()Lcom/robinhood/android/debitcard/linking/databinding/FragmentDebitCardVerificationIntroBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DebitCardVerificationIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DebitCardVerificationIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Callbacks;", "", "onContinueLinking", "", "cardParams", "Lcom/stripe/android/model/CardParams;", "onContinueVerification", "instrumentId", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueLinking(CardParams cardParams);

        void onContinueVerification(String instrumentId);
    }

    public DebitCardVerificationIntroFragment() {
        super(C13894R.layout.fragment_debit_card_verification_intro);
        this.protoScreenName = Screen.Name.VERIFY_DEBIT_CARD_SPLASH;
        this.binding = ViewBinding5.viewBinding(this, DebitCardVerificationIntroFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DebitCardVerificationIntroDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DebitCardVerificationIntroFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    private final FragmentDebitCardVerificationIntroBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDebitCardVerificationIntroBinding) value;
    }

    private final DebitCardVerificationIntroDuxo getDuxo() {
        return (DebitCardVerificationIntroDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final FragmentDebitCardVerificationIntroBinding binding = getBinding();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardVerificationIntroFragment.onViewCreated$lambda$9$lambda$2(binding, this, (DebitCardVerificationIntroViewState) obj);
            }
        });
        RdsButton rdsButton = binding.primaryButton;
        Intrinsics.checkNotNull(rdsButton);
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationIntroFragment.onViewCreated$lambda$9$lambda$5$lambda$3(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationIntroFragment.onViewCreated$lambda$9$lambda$5$lambda$4(this.f$0);
            }
        });
        RdsButton rdsButton2 = binding.secondaryButton;
        Intrinsics.checkNotNull(rdsButton2);
        ViewsKt.eventData$default(rdsButton2, false, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationIntroFragment.onViewCreated$lambda$9$lambda$8$lambda$6(this.f$0);
            }
        }, 1, null);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationIntroFragment.onViewCreated$lambda$9$lambda$8$lambda$7(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9$lambda$2(FragmentDebitCardVerificationIntroBinding fragmentDebitCardVerificationIntroBinding, DebitCardVerificationIntroFragment debitCardVerificationIntroFragment, DebitCardVerificationIntroViewState state) {
        Throwable thConsume;
        String strConsume;
        Intrinsics.checkNotNullParameter(state, "state");
        fragmentDebitCardVerificationIntroBinding.content.setVisibility(state.getContentVisibility());
        RhTextView title = fragmentDebitCardVerificationIntroBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextViewsKt.setVisibilityText(title, state.getTitleVisibilityText());
        RhTextView subtitle = fragmentDebitCardVerificationIntroBinding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
        TextViewsKt.setVisibilityText(subtitle, state.getSubtitleVisibilityText());
        fragmentDebitCardVerificationIntroBinding.primaryButton.setLoading(state.getIsPrimaryButtonLoading());
        fragmentDebitCardVerificationIntroBinding.secondaryButton.setLoading(state.getIsSecondaryButtonLoading());
        UiEvent<String> prepareSuccessEvent = state.getPrepareSuccessEvent();
        if (prepareSuccessEvent != null && (strConsume = prepareSuccessEvent.consume()) != null) {
            debitCardVerificationIntroFragment.getCallbacks().onContinueVerification(strConsume);
        }
        UiEvent<Throwable> prepareFailureEvent = state.getPrepareFailureEvent();
        if (prepareFailureEvent != null && (thConsume = prepareFailureEvent.consume()) != null) {
            FragmentActivity fragmentActivityRequireActivity = debitCardVerificationIntroFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            AbsErrorHandler.handleError$default(new TellerErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null), thConsume, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$9$lambda$5$lambda$3(DebitCardVerificationIntroFragment debitCardVerificationIntroFragment) {
        return new UserInteractionEventDescriptor(null, debitCardVerificationIntroFragment.getEventScreen(), UserInteractionEventData.Action.CONTINUE, debitCardVerificationIntroFragment.getLoggingContext(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9$lambda$5$lambda$4(DebitCardVerificationIntroFragment debitCardVerificationIntroFragment) {
        Args args = (Args) INSTANCE.getArgs((Fragment) debitCardVerificationIntroFragment);
        if (args instanceof Args.FromCardParams) {
            debitCardVerificationIntroFragment.getCallbacks().onContinueLinking(((Args.FromCardParams) args).getCardParams());
        } else {
            if (!(args instanceof Args.FromInstrument)) {
                throw new NoWhenBranchMatchedException();
            }
            debitCardVerificationIntroFragment.getDuxo().prepareDebitCardForVerification(((Args.FromInstrument) args).getInstrumentId());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor onViewCreated$lambda$9$lambda$8$lambda$6(DebitCardVerificationIntroFragment debitCardVerificationIntroFragment) {
        return new UserInteractionEventDescriptor(null, debitCardVerificationIntroFragment.getEventScreen(), UserInteractionEventData.Action.CANCEL, debitCardVerificationIntroFragment.getLoggingContext(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9$lambda$8$lambda$7(DebitCardVerificationIntroFragment debitCardVerificationIntroFragment) {
        debitCardVerificationIntroFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* compiled from: DebitCardVerificationIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args;", "Landroid/os/Parcelable;", "FromCardParams", "FromInstrument", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args$FromCardParams;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args$FromInstrument;", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Args extends Parcelable {

        /* compiled from: DebitCardVerificationIntroFragment.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args$FromCardParams;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args;", "cardParams", "Lcom/stripe/android/model/CardParams;", "<init>", "(Lcom/stripe/android/model/CardParams;)V", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FromCardParams implements Args {
            public static final int $stable = CardParams.$stable;
            public static final Parcelable.Creator<FromCardParams> CREATOR = new Creator();
            private final CardParams cardParams;

            /* compiled from: DebitCardVerificationIntroFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<FromCardParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromCardParams createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FromCardParams((CardParams) parcel.readParcelable(FromCardParams.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromCardParams[] newArray(int i) {
                    return new FromCardParams[i];
                }
            }

            public static /* synthetic */ FromCardParams copy$default(FromCardParams fromCardParams, CardParams cardParams, int i, Object obj) {
                if ((i & 1) != 0) {
                    cardParams = fromCardParams.cardParams;
                }
                return fromCardParams.copy(cardParams);
            }

            /* renamed from: component1, reason: from getter */
            public final CardParams getCardParams() {
                return this.cardParams;
            }

            public final FromCardParams copy(CardParams cardParams) {
                Intrinsics.checkNotNullParameter(cardParams, "cardParams");
                return new FromCardParams(cardParams);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FromCardParams) && Intrinsics.areEqual(this.cardParams, ((FromCardParams) other).cardParams);
            }

            public int hashCode() {
                return this.cardParams.hashCode();
            }

            public String toString() {
                return "FromCardParams(cardParams=" + this.cardParams + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.cardParams, flags);
            }

            public FromCardParams(CardParams cardParams) {
                Intrinsics.checkNotNullParameter(cardParams, "cardParams");
                this.cardParams = cardParams;
            }

            public final CardParams getCardParams() {
                return this.cardParams;
            }
        }

        /* compiled from: DebitCardVerificationIntroFragment.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args$FromInstrument;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args;", "instrumentId", "", "<init>", "(Ljava/lang/String;)V", "getInstrumentId", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FromInstrument implements Args {
            public static final int $stable = 0;
            public static final Parcelable.Creator<FromInstrument> CREATOR = new Creator();
            private final String instrumentId;

            /* compiled from: DebitCardVerificationIntroFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<FromInstrument> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromInstrument createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new FromInstrument(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FromInstrument[] newArray(int i) {
                    return new FromInstrument[i];
                }
            }

            public static /* synthetic */ FromInstrument copy$default(FromInstrument fromInstrument, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fromInstrument.instrumentId;
                }
                return fromInstrument.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getInstrumentId() {
                return this.instrumentId;
            }

            public final FromInstrument copy(String instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                return new FromInstrument(instrumentId);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FromInstrument) && Intrinsics.areEqual(this.instrumentId, ((FromInstrument) other).instrumentId);
            }

            public int hashCode() {
                return this.instrumentId.hashCode();
            }

            public String toString() {
                return "FromInstrument(instrumentId=" + this.instrumentId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.instrumentId);
            }

            public FromInstrument(String instrumentId) {
                Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
                this.instrumentId = instrumentId;
            }

            public final String getInstrumentId() {
                return this.instrumentId;
            }
        }
    }

    /* compiled from: DebitCardVerificationIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Args;", "<init>", "()V", "EXIT_DEBIT_CARD_LINKING_FLOW_DIALOG_TAG", "", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DebitCardVerificationIntroFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DebitCardVerificationIntroFragment debitCardVerificationIntroFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, debitCardVerificationIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DebitCardVerificationIntroFragment newInstance(Args args) {
            return (DebitCardVerificationIntroFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DebitCardVerificationIntroFragment debitCardVerificationIntroFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, debitCardVerificationIntroFragment, args);
        }
    }
}
