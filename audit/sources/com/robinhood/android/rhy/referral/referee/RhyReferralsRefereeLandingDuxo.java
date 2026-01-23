package com.robinhood.android.rhy.referral.referee;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.mcduckling.prefs.RhyAlwaysShowAddToGPayPref;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.googlepay.DebugAddedCardToGooglePayPref;
import com.robinhood.android.rhy.contracts.RhyReferralStatusTrackingKey;
import com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingEvent;
import com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingViewState;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.librobinhood.data.store.RhyReferralLandingStore;
import com.robinhood.librobinhood.store.PaymentCardStore;
import com.robinhood.librobinhood.store.RhyOverviewAccountStore;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.models.p320db.mcduckling.PaymentCard;
import com.robinhood.models.rhy.referral.p345db.RefereeLanding;
import com.robinhood.models.rhy.referral.p345db.RhyReferralIneligibilityData;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rhy.referral.HasViewedRefereeOfferPref;
import com.robinhood.targetbackend.TargetBackend;
import com.robinhood.utils.Optional;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyReferralsRefereeLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001)Bg\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010 \u001a\u00020\u001eJ\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0006\u0010#\u001a\u00020\u001eJ\u0006\u0010$\u001a\u00020\u001eJ\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState;", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingEvent;", "referralLandingStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralLandingStore;", "rhySuvManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhyOverviewAccountStore", "Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;", "paymentCardStore", "Lcom/robinhood/librobinhood/store/PaymentCardStore;", "targetBackend", "Lcom/robinhood/targetbackend/TargetBackend;", "debugAddedCardToGooglePayPref", "Lcom/robinhood/prefs/BooleanPreference;", "alwaysShowAddToGPayPref", "hasViewedRefereeOfferPref", "stateProvider", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyReferralLandingStore;Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/librobinhood/store/RhyOverviewAccountStore;Lcom/robinhood/librobinhood/store/PaymentCardStore;Lcom/robinhood/targetbackend/TargetBackend;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "isGetPushTokenizeRequestInFlight", "", "onStart", "", "debugAddCardToGooglePayDialogDismissed", "debugOnlyClickAddToGoogleWallet", "debugOnlyAddToGoogleWallet", "showDebugAddCardToGooglePayDialog", "updateGooglePayData", "getPushTokenizeEvent", "ctaClicked", "state", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingViewState$Loaded$CtaType;", "showReferralHistory", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralsRefereeLandingDuxo extends BaseDuxo3<RhyReferralsRefereeLandingDataState, RhyReferralsRefereeLandingViewState, RhyReferralsRefereeLandingEvent> {
    private static final List<GooglePayTokenInfoWrapper> debugGooglePayTokenList;
    private final BooleanPreference alwaysShowAddToGPayPref;
    private final BooleanPreference debugAddedCardToGooglePayPref;
    private final GooglePayManager googlePayManager;
    private final BooleanPreference hasViewedRefereeOfferPref;
    private boolean isGetPushTokenizeRequestInFlight;
    private final PaymentCardStore paymentCardStore;
    private final RhyReferralLandingStore referralLandingStore;
    private final RhyOverviewAccountStore rhyOverviewAccountStore;
    private final RhySuvManger rhySuvManager;
    private final TargetBackend targetBackend;
    public static final int $stable = 8;

    /* compiled from: RhyReferralsRefereeLandingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RhyReferralsRefereeLandingViewState.Loaded.CtaType.values().length];
            try {
                iArr[RhyReferralsRefereeLandingViewState.Loaded.CtaType.FUND_MY_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RhyReferralsRefereeLandingViewState.Loaded.CtaType.ADD_TO_GOOGLE_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RhyReferralsRefereeLandingViewState.Loaded.CtaType.VIEW_CARD_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralsRefereeLandingDuxo(RhyReferralLandingStore referralLandingStore, RhySuvManger rhySuvManager, GooglePayManager googlePayManager, RhyOverviewAccountStore rhyOverviewAccountStore, PaymentCardStore paymentCardStore, TargetBackend targetBackend, @DebugAddedCardToGooglePayPref BooleanPreference debugAddedCardToGooglePayPref, @RhyAlwaysShowAddToGPayPref BooleanPreference alwaysShowAddToGPayPref, @HasViewedRefereeOfferPref BooleanPreference hasViewedRefereeOfferPref, RhyReferralsRefereeLandingStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyReferralsRefereeLandingDataState(null, null, debugAddedCardToGooglePayPref.get() ? debugGooglePayTokenList : null, false, null, null, false, 123, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(referralLandingStore, "referralLandingStore");
        Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(rhyOverviewAccountStore, "rhyOverviewAccountStore");
        Intrinsics.checkNotNullParameter(paymentCardStore, "paymentCardStore");
        Intrinsics.checkNotNullParameter(targetBackend, "targetBackend");
        Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
        Intrinsics.checkNotNullParameter(alwaysShowAddToGPayPref, "alwaysShowAddToGPayPref");
        Intrinsics.checkNotNullParameter(hasViewedRefereeOfferPref, "hasViewedRefereeOfferPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.referralLandingStore = referralLandingStore;
        this.rhySuvManager = rhySuvManager;
        this.googlePayManager = googlePayManager;
        this.rhyOverviewAccountStore = rhyOverviewAccountStore;
        this.paymentCardStore = paymentCardStore;
        this.targetBackend = targetBackend;
        this.debugAddedCardToGooglePayPref = debugAddedCardToGooglePayPref;
        this.alwaysShowAddToGPayPref = alwaysShowAddToGPayPref;
        this.hasViewedRefereeOfferPref = hasViewedRefereeOfferPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.hasViewedRefereeOfferPref.set(true);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C274821(null), 3, null);
        Maybe<List<GooglePayTokenInfoWrapper>> maybeFilter = this.googlePayManager.listTokens().filter(new Predicate() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<GooglePayTokenInfoWrapper> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !RhyReferralsRefereeLandingDuxo.this.debugAddedCardToGooglePayPref.get();
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFilter, "filter(...)");
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, maybeFilter, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
        Observable<Boolean> observableFilter = this.debugAddedCardToGooglePayPref.getChanges().distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo.onStart.5
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return RhyReferralsRefereeLandingDuxo.this.targetBackend.isApollo();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.onStart$lambda$3(this.f$0, (Boolean) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.rhyOverviewAccountStore.streamIsActiveRhyAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.onStart$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<Boolean> observableDistinctUntilChanged = this.alwaysShowAddToGPayPref.getChanges().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.onStart$lambda$5(this.f$0, (Boolean) obj);
            }
        });
        this.paymentCardStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.paymentCardStore.streamActiveRhyCardOptional(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.onStart$lambda$6(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: RhyReferralsRefereeLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$1", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$1 */
    static final class C274821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C274821(Continuation<? super C274821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralsRefereeLandingDuxo.this.new C274821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C274821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RhyReferralLandingStore rhyReferralLandingStore = RhyReferralsRefereeLandingDuxo.this.referralLandingStore;
                    this.label = 1;
                    obj = rhyReferralLandingStore.forceFetchRefereeLanding(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                RefereeLanding refereeLanding = (RefereeLanding) obj;
                RhyReferralsRefereeLandingDuxo.this.applyMutation(new AnonymousClass1(refereeLanding, null));
                RhyReferralIneligibilityData ineligibilityData = refereeLanding.getIneligibilityData();
                if (ineligibilityData != null) {
                    RhyReferralsRefereeLandingDuxo.this.submit(new RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog(ineligibilityData));
                }
            } catch (Throwable th) {
                RhyReferralsRefereeLandingDuxo.this.applyMutation(new AnonymousClass2(th, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RhyReferralsRefereeLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$1$1", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState>, Object> {
            final /* synthetic */ RefereeLanding $refereeLanding;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RefereeLanding refereeLanding, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$refereeLanding = refereeLanding;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$refereeLanding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState> continuation) {
                return ((AnonymousClass1) create(rhyReferralsRefereeLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RhyReferralsRefereeLandingDataState.copy$default((RhyReferralsRefereeLandingDataState) this.L$0, this.$refereeLanding, null, null, false, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            }
        }

        /* compiled from: RhyReferralsRefereeLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$1$2", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f4892$t;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4892$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4892$t, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState> continuation) {
                return ((AnonymousClass2) create(rhyReferralsRefereeLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RhyReferralsRefereeLandingDataState.copy$default((RhyReferralsRefereeLandingDataState) this.L$0, null, this.f4892$t, null, false, null, null, false, 125, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, List list) {
        rhyReferralsRefereeLandingDuxo.applyMutation(new RhyReferralsRefereeLandingDuxo2(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyReferralsRefereeLandingDuxo.applyMutation(new RhyReferralsRefereeLandingDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(final RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, Boolean bool) {
        rhyReferralsRefereeLandingDuxo.withDataState(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.onStart$lambda$3$lambda$2(this.f$0, (RhyReferralsRefereeLandingDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3$lambda$2(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, RhyReferralsRefereeLandingDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<GooglePayTokenInfoWrapper> googlePayTokenList = dataState.getGooglePayTokenList();
        if (googlePayTokenList != null && !googlePayTokenList.isEmpty()) {
            rhyReferralsRefereeLandingDuxo.debugOnlyAddToGoogleWallet();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, boolean z) {
        rhyReferralsRefereeLandingDuxo.applyMutation(new RhyReferralsRefereeLandingDuxo4(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, Boolean bool) {
        rhyReferralsRefereeLandingDuxo.applyMutation(new RhyReferralsRefereeLandingDuxo5(bool, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        rhyReferralsRefereeLandingDuxo.applyMutation(new RhyReferralsRefereeLandingDuxo6((PaymentCard) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralsRefereeLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$debugAddCardToGooglePayDialogDismissed$1", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$debugAddCardToGooglePayDialogDismissed$1 */
    static final class C274791 extends ContinuationImpl7 implements Function2<RhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C274791(Continuation<? super C274791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C274791 c274791 = new C274791(continuation);
            c274791.L$0 = obj;
            return c274791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState> continuation) {
            return ((C274791) create(rhyReferralsRefereeLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyReferralsRefereeLandingDataState.copy$default((RhyReferralsRefereeLandingDataState) this.L$0, null, null, null, false, null, null, false, 119, null);
        }
    }

    public final void debugAddCardToGooglePayDialogDismissed() {
        applyMutation(new C274791(null));
    }

    public final void debugOnlyClickAddToGoogleWallet() {
        this.debugAddedCardToGooglePayPref.set(true);
        debugOnlyAddToGoogleWallet();
    }

    /* compiled from: RhyReferralsRefereeLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$debugOnlyAddToGoogleWallet$1", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$debugOnlyAddToGoogleWallet$1 */
    static final class C274801 extends ContinuationImpl7 implements Function2<RhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C274801(Continuation<? super C274801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C274801 c274801 = new C274801(continuation);
            c274801.L$0 = obj;
            return c274801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState> continuation) {
            return ((C274801) create(rhyReferralsRefereeLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyReferralsRefereeLandingDataState.copy$default((RhyReferralsRefereeLandingDataState) this.L$0, null, null, RhyReferralsRefereeLandingDuxo.debugGooglePayTokenList, false, null, null, false, 115, null);
        }
    }

    private final void debugOnlyAddToGoogleWallet() {
        applyMutation(new C274801(null));
    }

    /* compiled from: RhyReferralsRefereeLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referee/RhyReferralsRefereeLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$showDebugAddCardToGooglePayDialog$1", m3645f = "RhyReferralsRefereeLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$showDebugAddCardToGooglePayDialog$1 */
    static final class C274851 extends ContinuationImpl7 implements Function2<RhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C274851(Continuation<? super C274851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C274851 c274851 = new C274851(continuation);
            c274851.L$0 = obj;
            return c274851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralsRefereeLandingDataState rhyReferralsRefereeLandingDataState, Continuation<? super RhyReferralsRefereeLandingDataState> continuation) {
            return ((C274851) create(rhyReferralsRefereeLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyReferralsRefereeLandingDataState.copy$default((RhyReferralsRefereeLandingDataState) this.L$0, null, null, null, true, null, null, false, 119, null);
        }
    }

    private final void showDebugAddCardToGooglePayDialog() {
        applyMutation(new C274851(null));
    }

    public final void updateGooglePayData() {
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.googlePayManager.listTokens(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.updateGooglePayData$lambda$7(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.updateGooglePayData$lambda$8(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$7(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, List tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        rhyReferralsRefereeLandingDuxo.applyMutation(new RhyReferralsRefereeLandingDuxo7(tokenList, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$8(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyReferralsRefereeLandingDuxo.applyMutation(new RhyReferralsRefereeLandingDuxo8(null));
        return Unit.INSTANCE;
    }

    public final void getPushTokenizeEvent() {
        if (this.isGetPushTokenizeRequestInFlight) {
            return;
        }
        Single<PushTokenizeRequest> singleDoOnSubscribe = this.rhySuvManager.getPushTokenizeEvent().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo.getPushTokenizeEvent.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                RhyReferralsRefereeLandingDuxo.this.isGetPushTokenizeRequestInFlight = true;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.getPushTokenizeEvent$lambda$9(this.f$0, (PushTokenizeRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.getPushTokenizeEvent$lambda$10(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$9(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, PushTokenizeRequest pushTokenizeRequest) {
        Intrinsics.checkNotNull(pushTokenizeRequest);
        rhyReferralsRefereeLandingDuxo.submit(new RhyReferralsRefereeLandingEvent.PushTokenizeEvent(pushTokenizeRequest));
        rhyReferralsRefereeLandingDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$10(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof VerificationRequiredException) {
            rhyReferralsRefereeLandingDuxo.submit(new RhyReferralsRefereeLandingEvent.VerificationRequired((VerificationRequiredException) error));
        }
        rhyReferralsRefereeLandingDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    public final void ctaClicked(final RhyReferralsRefereeLandingViewState.Loaded.CtaType state) {
        Intrinsics.checkNotNullParameter(state, "state");
        withDataState(new Function1() { // from class: com.robinhood.android.rhy.referral.referee.RhyReferralsRefereeLandingDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsRefereeLandingDuxo.ctaClicked$lambda$11(this.f$0, state, (RhyReferralsRefereeLandingDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ctaClicked$lambda$11(RhyReferralsRefereeLandingDuxo rhyReferralsRefereeLandingDuxo, RhyReferralsRefereeLandingViewState.Loaded.CtaType ctaType, RhyReferralsRefereeLandingDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        RefereeLanding refereeLanding = dataState.getRefereeLanding();
        RhyReferralIneligibilityData ineligibilityData = refereeLanding != null ? refereeLanding.getIneligibilityData() : null;
        if (ineligibilityData != null) {
            rhyReferralsRefereeLandingDuxo.submit(new RhyReferralsRefereeLandingEvent.ShowIneligibilityDialog(ineligibilityData));
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[ctaType.ordinal()];
            if (i == 1) {
                rhyReferralsRefereeLandingDuxo.submit(RhyReferralsRefereeLandingEvent.ShowFundMyAccount.INSTANCE);
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                rhyReferralsRefereeLandingDuxo.submit(RhyReferralsRefereeLandingEvent.ShowCardNumber.INSTANCE);
            } else if (rhyReferralsRefereeLandingDuxo.targetBackend.isApollo()) {
                rhyReferralsRefereeLandingDuxo.showDebugAddCardToGooglePayDialog();
            } else {
                rhyReferralsRefereeLandingDuxo.getPushTokenizeEvent();
            }
        }
        return Unit.INSTANCE;
    }

    public final void showReferralHistory() {
        submit(new RhyReferralsRefereeLandingEvent.ShowFragment(RhyReferralStatusTrackingKey.INSTANCE));
    }

    static {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        debugGooglePayTokenList = CollectionsKt.listOf(new GooglePayTokenInfoWrapper(string2, "RobinhoodDebug", "1000", "1000", 3, 3, 5, true, "RobinhoodDebug"));
    }
}
