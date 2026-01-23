package com.robinhood.android.rhy.cardactivation.p243ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.common.mcduckling.p084ui.WizardFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.googlepay.GooglePayPushTokenizeManager;
import com.robinhood.android.rhy.cardactivation.C27358R;
import com.robinhood.android.rhy.cardactivation.databinding.FragmentCardActivationSuccessBinding;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CardActivationSuccessFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessFragment;", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessDuxo;", "getDuxo", "()Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSuccessBinding;", "getBinding", "()Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSuccessBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "googlePayPushTokenizeManager", "Lcom/robinhood/android/googlepay/GooglePayPushTokenizeManager;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onStart", "onBackPressed", "", "onBindViewState", "state", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessViewState;", "Args", "Companion", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class CardActivationSuccessFragment extends WizardFragment {
    public static final int REQUEST_PUSH_TOKENIZE = 1;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GooglePayPushTokenizeManager googlePayPushTokenizeManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardActivationSuccessFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSuccessBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CardActivationSuccessFragment() {
        super(C27358R.layout.fragment_card_activation_success);
        this.duxo = OldDuxos.oldDuxo(this, CardActivationSuccessDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CardActivationSuccessFragment2.INSTANCE);
        this.googlePayPushTokenizeManager = new GooglePayPushTokenizeManager();
    }

    private final CardActivationSuccessDuxo getDuxo() {
        return (CardActivationSuccessDuxo) this.duxo.getValue();
    }

    private final FragmentCardActivationSuccessBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardActivationSuccessBinding) value;
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.WizardFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getViewLifecycleOwner().getLifecycle().addObserver(this.googlePayPushTokenizeManager);
        RdsButton cardActivationLaterBtn = getBinding().cardActivationLaterBtn;
        Intrinsics.checkNotNullExpressionValue(cardActivationLaterBtn, "cardActivationLaterBtn");
        OnClickListeners.onClick(cardActivationLaterBtn, new C273791(requireActivity()));
    }

    /* compiled from: CardActivationSuccessFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessFragment$onViewCreated$1 */
    /* synthetic */ class C273791 extends FunctionReferenceImpl implements Function0<Unit> {
        C273791(Object obj) {
            super(0, obj, FragmentActivity.class, "finish", "finish()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FragmentActivity) this.receiver).finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        baseActivity.showCloseIcon();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C273771(this));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(fragmentActivityRequireActivity).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C273782(getDuxo()));
    }

    /* compiled from: CardActivationSuccessFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessFragment$onStart$1 */
    /* synthetic */ class C273771 extends FunctionReferenceImpl implements Function1<CardActivationSuccessViewState, Unit> {
        C273771(Object obj) {
            super(1, obj, CardActivationSuccessFragment.class, "onBindViewState", "onBindViewState(Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardActivationSuccessViewState cardActivationSuccessViewState) throws Throwable {
            invoke2(cardActivationSuccessViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardActivationSuccessViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardActivationSuccessFragment) this.receiver).onBindViewState(p0);
        }
    }

    /* compiled from: CardActivationSuccessFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessFragment$onStart$2 */
    /* synthetic */ class C273782 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C273782(Object obj) {
            super(1, obj, CardActivationSuccessDuxo.class, "setDayNightOverlay", "setDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardActivationSuccessDuxo) this.receiver).setDayNightOverlay(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBindViewState(final CardActivationSuccessViewState state) throws Throwable {
        Throwable thConsume;
        PushTokenizeRequest pushTokenizeRequestConsume;
        RdsButton rdsButton = getBinding().cardActivationActionBtn;
        rdsButton.setText(getText(state.getActionButtonText()));
        rdsButton.setLoading(state.isGooglePayPushTokenizeLoading());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSuccessFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardActivationSuccessFragment.onBindViewState$lambda$1$lambda$0(state, this);
            }
        });
        ImageView imageView = getBinding().cardActivationGooglePayImageView;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(state.isGooglePayImageViewVisible() ? 0 : 8);
        imageView.setImageResource(state.getActionButtonDrawable());
        RdsButton cardActivationLaterBtn = getBinding().cardActivationLaterBtn;
        Intrinsics.checkNotNullExpressionValue(cardActivationLaterBtn, "cardActivationLaterBtn");
        cardActivationLaterBtn.setVisibility(state.isLaterButtonVisible() ? 0 : 8);
        UiEvent<PushTokenizeRequest> pushTokenizeEvent = state.getPushTokenizeEvent();
        if (pushTokenizeEvent != null && (pushTokenizeRequestConsume = pushTokenizeEvent.consume()) != null) {
            GooglePayPushTokenizeManager googlePayPushTokenizeManager = this.googlePayPushTokenizeManager;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            googlePayPushTokenizeManager.pushTokenize(fragmentActivityRequireActivity, pushTokenizeRequestConsume, 1);
        }
        UiEvent<Throwable> error = state.getError();
        if (error != null && (thConsume = error.consume()) != null && !AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
            throw thConsume;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewState$lambda$1$lambda$0(CardActivationSuccessViewState cardActivationSuccessViewState, CardActivationSuccessFragment cardActivationSuccessFragment) {
        if (cardActivationSuccessViewState.isGooglePayActionVisible()) {
            cardActivationSuccessFragment.getDuxo().getPushTokenizeRequest();
        } else {
            cardActivationSuccessFragment.requireActivity().finish();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CardActivationSuccessFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessFragment$Args;", "Landroid/os/Parcelable;", "cardId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getCardId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID cardId;

        /* compiled from: CardActivationSuccessFragment.kt */
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

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.cardId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCardId() {
            return this.cardId;
        }

        public final Args copy(UUID cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return new Args(cardId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.cardId, ((Args) other).cardId);
        }

        public int hashCode() {
            return this.cardId.hashCode();
        }

        public String toString() {
            return "Args(cardId=" + this.cardId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.cardId);
        }

        public Args(UUID cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.cardId = cardId;
        }

        public final UUID getCardId() {
            return this.cardId;
        }
    }

    /* compiled from: CardActivationSuccessFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessFragment;", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSuccessFragment$Args;", "<init>", "()V", "REQUEST_PUSH_TOKENIZE", "", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardActivationSuccessFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardActivationSuccessFragment cardActivationSuccessFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardActivationSuccessFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardActivationSuccessFragment newInstance(Args args) {
            return (CardActivationSuccessFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardActivationSuccessFragment cardActivationSuccessFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardActivationSuccessFragment, args);
        }
    }
}
