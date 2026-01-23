package com.robinhood.android.rhy.backorder.p242ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.api.retrofit.Minerva;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.ApiShippingAddress;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import java.util.UUID;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CardBackorderSubmissionFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0003\u001e\u001f B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0017H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "minerva", "Lcom/robinhood/api/retrofit/Minerva;", "getMinerva", "()Lcom/robinhood/api/retrofit/Minerva;", "setMinerva", "(Lcom/robinhood/api/retrofit/Minerva;)V", "callbacks", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class CardBackorderSubmissionFragment extends GenericComposeFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardBackorderSubmissionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderSubmissionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    public Minerva minerva;

    /* compiled from: CardBackorderSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Callbacks;", "", "onCardBackorderAddressUpdated", "", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCardBackorderAddressUpdated();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final Minerva getMinerva() {
        Minerva minerva = this.minerva;
        if (minerva != null) {
            return minerva;
        }
        Intrinsics.throwUninitializedPropertyAccessException("minerva");
        return null;
    }

    public final void setMinerva(Minerva minerva) {
        Intrinsics.checkNotNullParameter(minerva, "<set-?>");
        this.minerva = minerva;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    public void ComposeContent() {
        LoadingScreenComposablesKt.ListLoadingScreenComposable$default(null, true, true, 3, 1, null);
    }

    /* compiled from: CardBackorderSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.backorder.ui.CardBackorderSubmissionFragment$onCreate$1", m3645f = "CardBackorderSubmissionFragment.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.backorder.ui.CardBackorderSubmissionFragment$onCreate$1 */
    static final class C273541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C273541(Continuation<? super C273541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardBackorderSubmissionFragment.this.new C273541(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C273541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Minerva minerva = CardBackorderSubmissionFragment.this.getMinerva();
                Companion companion = CardBackorderSubmissionFragment.INSTANCE;
                UUID cardId = ((Args) companion.getArgs((Fragment) CardBackorderSubmissionFragment.this)).getCardId();
                ApiShippingAddress.Request apiShippingAddressRequest = ((Args) companion.getArgs((Fragment) CardBackorderSubmissionFragment.this)).getApiShippingAddressRequest();
                this.label = 1;
                if (minerva.updateCardShippingAddress(cardId, apiShippingAddressRequest, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(CompletableDelay2.minTimeInFlight$default(RxFactory.DefaultImpls.rxCompletable$default(this, null, new C273541(null), 1, null), 1000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C273552(getCallbacks()), new Function1() { // from class: com.robinhood.android.rhy.backorder.ui.CardBackorderSubmissionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardBackorderSubmissionFragment.onCreate$lambda$0(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CardBackorderSubmissionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhy.backorder.ui.CardBackorderSubmissionFragment$onCreate$2 */
    /* synthetic */ class C273552 extends FunctionReferenceImpl implements Function0<Unit> {
        C273552(Object obj) {
            super(0, obj, Callbacks.class, "onCardBackorderAddressUpdated", "onCardBackorderAddressUpdated()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Callbacks) this.receiver).onCardBackorderAddressUpdated();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CardBackorderSubmissionFragment cardBackorderSubmissionFragment, Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (!AbsErrorHandler.handleError$default(cardBackorderSubmissionFragment.getActivityErrorHandler(), t, false, 2, null)) {
            throw t;
        }
        cardBackorderSubmissionFragment.getParentFragmentManager().popBackStack();
        return Unit.INSTANCE;
    }

    /* compiled from: CardBackorderSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Args;", "Landroid/os/Parcelable;", "paymentCard", "Lcom/robinhood/models/db/mcduckling/PaymentCard;", "newShippingAddress", "Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;", "<init>", "(Lcom/robinhood/models/db/mcduckling/PaymentCard;Lcom/robinhood/android/common/mcduckling/address/CardShippingAddress;)V", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "apiShippingAddressRequest", "Lcom/robinhood/models/api/ApiShippingAddress$Request;", "getApiShippingAddressRequest", "()Lcom/robinhood/models/api/ApiShippingAddress$Request;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CardShippingAddress newShippingAddress;
        private final PaymentCard paymentCard;

        /* compiled from: CardBackorderSubmissionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((PaymentCard) parcel.readParcelable(Args.class.getClassLoader()), (CardShippingAddress) parcel.readParcelable(Args.class.getClassLoader()));
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
            dest.writeParcelable(this.newShippingAddress, flags);
        }

        public Args(PaymentCard paymentCard, CardShippingAddress newShippingAddress) {
            Intrinsics.checkNotNullParameter(paymentCard, "paymentCard");
            Intrinsics.checkNotNullParameter(newShippingAddress, "newShippingAddress");
            this.paymentCard = paymentCard;
            this.newShippingAddress = newShippingAddress;
        }

        public final UUID getCardId() {
            return this.paymentCard.getId();
        }

        public final ApiShippingAddress.Request getApiShippingAddressRequest() {
            return this.newShippingAddress.getMailingAddress().getAddress().toRequest();
        }
    }

    /* compiled from: CardBackorderSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment;", "Lcom/robinhood/android/rhy/backorder/ui/CardBackorderSubmissionFragment$Args;", "<init>", "()V", "feature-card-back-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardBackorderSubmissionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardBackorderSubmissionFragment cardBackorderSubmissionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardBackorderSubmissionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardBackorderSubmissionFragment newInstance(Args args) {
            return (CardBackorderSubmissionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardBackorderSubmissionFragment cardBackorderSubmissionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardBackorderSubmissionFragment, args);
        }
    }
}
