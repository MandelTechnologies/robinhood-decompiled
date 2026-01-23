package com.robinhood.android.rhy.backorder.p242ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.GenericActionableInformationFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Set;
import java.util.UUID;
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

/* compiled from: CardBackorderIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0003\"#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\t\u0010\u001b\u001a\u00020\u001cH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment;", "Lcom/robinhood/android/common/GenericActionableInformationFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "getPaymentCardStore", "()Lcom/robinhood/librobinhood/store/PaymentCardStore;", "setPaymentCardStore", "(Lcom/robinhood/librobinhood/store/PaymentCardStore;)V", "callbacks", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "state", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroViewState;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class CardBackorderIntroFragment extends GenericActionableInformationFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardBackorderIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    public PaymentCardStore paymentCardStore;

    /* compiled from: CardBackorderIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Callbacks;", "", "onChangeMailingAddressSelected", "", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onChangeMailingAddressSelected(PaymentCard paymentCard);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final PaymentCardStore getPaymentCardStore() {
        PaymentCardStore paymentCardStore = this.paymentCardStore;
        if (paymentCardStore != null) {
            return paymentCardStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("paymentCardStore");
        return null;
    }

    public final void setPaymentCardStore(PaymentCardStore paymentCardStore) {
        Intrinsics.checkNotNullParameter(paymentCardStore, "<set-?>");
        this.paymentCardStore = paymentCardStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        getPaymentCardStore().refresh(true);
        Observable observableDoOnNext = getPaymentCardStore().streamActiveCashManagementCard().map(new Function() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final CardBackorderIntroViewState apply(PaymentCard card) {
                Intrinsics.checkNotNullParameter(card, "card");
                return new CardBackorderIntroViewState(card, ((Args) CardBackorderIntroFragment.INSTANCE.getArgs((Fragment) CardBackorderIntroFragment.this)).getIsFromRhy());
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment.onStart.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CardBackorderIntroFragment.this.setActionLoading(true);
            }
        }).doOnNext(new Consumer() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment.onStart.3
            @Override // io.reactivex.functions.Consumer
            public final void accept(CardBackorderIntroViewState cardBackorderIntroViewState) {
                CardBackorderIntroFragment.this.setActionLoading(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnNext, "doOnNext(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservableDelay2.minTimeInFlight$default(observableDoOnNext, 1000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null), new C273524(this), new Function1() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardBackorderIntroFragment.onStart$lambda$0(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: CardBackorderIntroFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment$onStart$4 */
    /* synthetic */ class C273524 extends FunctionReferenceImpl implements Function1<CardBackorderIntroViewState, Unit> {
        C273524(Object obj) {
            super(1, obj, CardBackorderIntroFragment.class, "bind", "bind(Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardBackorderIntroViewState cardBackorderIntroViewState) {
            invoke2(cardBackorderIntroViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardBackorderIntroViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardBackorderIntroFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CardBackorderIntroFragment cardBackorderIntroFragment, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!AbsErrorHandler.handleError$default(cardBackorderIntroFragment.getActivityErrorHandler(), t, false, 2, null)) {
            throw t;
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            bind(new CardBackorderIntroViewState(((Args) companion.getArgs((Fragment) this)).getPaymentCard(), ((Args) companion.getArgs((Fragment) this)).getIsFromRhy()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final CardBackorderIntroViewState state) {
        GenericActionableInformationFragment.TextType text;
        final UUID id;
        setTitle(toText(state.getTitle()));
        setIllustration(toDrawableIllustration(state.getIllustration()));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        setDescription(toText(state.getDescription(contextRequireContext)));
        Integer primaryAction = state.getPrimaryAction();
        if (primaryAction == null || (text = toText(primaryAction.intValue())) == null) {
            text = GenericActionableInformationFragment.TextType.Empty.INSTANCE;
        }
        setPrimaryAction(text);
        setSecondaryAction(toText(state.getSecondaryAction()));
        onSecondaryActionClick(new Function0() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardBackorderIntroFragment.bind$lambda$1(this.f$0, state);
            }
        });
        PaymentCard paymentCard = state.getPaymentCard();
        if (paymentCard == null || (id = paymentCard.getId()) == null) {
            return;
        }
        onPrimaryActionClick(new Function0() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderIntroFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardBackorderIntroFragment.bind$lambda$3$lambda$2(this.f$0, id);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(CardBackorderIntroFragment cardBackorderIntroFragment, CardBackorderIntroViewState cardBackorderIntroViewState) {
        cardBackorderIntroFragment.getCallbacks().onChangeMailingAddressSelected(cardBackorderIntroViewState.getPaymentCard());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3$lambda$2(CardBackorderIntroFragment cardBackorderIntroFragment, UUID uuid) {
        Navigator navigator = cardBackorderIntroFragment.getNavigator();
        Context contextRequireContext = cardBackorderIntroFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.ActivateCard(uuid), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CardBackorderIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Args;", "Landroid/os/Parcelable;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "isFromRhy", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Z)V", "getPaymentCard", "()Lcom/robinhood/models/db/mcduckling/PaymentCard;", "()Z", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isFromRhy;
        private final PaymentCard paymentCard;

        /* compiled from: CardBackorderIntroFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((PaymentCard) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
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
            dest.writeParcelable(this.paymentCard, flags);
            dest.writeInt(this.isFromRhy ? 1 : 0);
        }

        public Args(PaymentCard paymentCard, boolean z) {
            this.paymentCard = paymentCard;
            this.isFromRhy = z;
        }

        public final PaymentCard getPaymentCard() {
            return this.paymentCard;
        }

        /* renamed from: isFromRhy, reason: from getter */
        public final boolean getIsFromRhy() {
            return this.isFromRhy;
        }
    }

    /* compiled from: CardBackorderIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment;", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderIntroFragment$Args;", "<init>", "()V", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardBackorderIntroFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardBackorderIntroFragment cardBackorderIntroFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardBackorderIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardBackorderIntroFragment newInstance(Args args) {
            return (CardBackorderIntroFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardBackorderIntroFragment cardBackorderIntroFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardBackorderIntroFragment, args);
        }
    }
}
