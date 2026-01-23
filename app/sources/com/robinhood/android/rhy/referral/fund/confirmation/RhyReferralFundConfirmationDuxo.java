package com.robinhood.android.rhy.referral.fund.confirmation;

import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.robinhood.android.common.mcduckling.util.GooglePayManager;
import com.robinhood.android.common.mcduckling.util.RhySuvManger;
import com.robinhood.android.googlepay.DebugAddedCardToGooglePayPref;
import com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.models.api.minerva.VerificationRequiredException;
import com.robinhood.models.p320db.mcduckling.GooglePayTokenInfoWrapper;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.AddToGooglePayTappedPref;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralFundConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001cB=\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0006\u0010\u001a\u001a\u00020\u0015J\u0006\u0010\u001b\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDataState;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationViewState;", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationEvent;", "googlePayManager", "Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;", "rhySuvManager", "Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;", "debugAddedCardToGooglePayPref", "Lcom/robinhood/prefs/BooleanPreference;", "addToGooglePayTappedPref", "stateProvider", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/common/mcduckling/util/GooglePayManager;Lcom/robinhood/android/common/mcduckling/util/RhySuvManger;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "isGetPushTokenizeRequestInFlight", "", "onStart", "", "getPushTokenizeEvent", "debugAddCardToGooglePayDialogDismissed", "debugOnlyClickAddToGoogleWallet", "debugOnlyAddToGoogleWallet", "showDebugAddCardToGooglePayDialog", "updateGooglePayData", "Companion", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralFundConfirmationDuxo extends BaseDuxo3<RhyReferralFundConfirmationDataState, RhyReferralFundConfirmationViewState, RhyReferralFundConfirmationEvent> {
    private static final List<GooglePayTokenInfoWrapper> debugGooglePayTokenList;
    private final BooleanPreference addToGooglePayTappedPref;
    private final BooleanPreference debugAddedCardToGooglePayPref;
    private final GooglePayManager googlePayManager;
    private boolean isGetPushTokenizeRequestInFlight;
    private final RhySuvManger rhySuvManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralFundConfirmationDuxo(GooglePayManager googlePayManager, RhySuvManger rhySuvManager, @DebugAddedCardToGooglePayPref BooleanPreference debugAddedCardToGooglePayPref, @AddToGooglePayTappedPref BooleanPreference addToGooglePayTappedPref, RhyReferralFundConfirmationStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyReferralFundConfirmationDataState(null, false, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(rhySuvManager, "rhySuvManager");
        Intrinsics.checkNotNullParameter(debugAddedCardToGooglePayPref, "debugAddedCardToGooglePayPref");
        Intrinsics.checkNotNullParameter(addToGooglePayTappedPref, "addToGooglePayTappedPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.googlePayManager = googlePayManager;
        this.rhySuvManager = rhySuvManager;
        this.debugAddedCardToGooglePayPref = debugAddedCardToGooglePayPref;
        this.addToGooglePayTappedPref = addToGooglePayTappedPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Maybe<List<GooglePayTokenInfoWrapper>> maybeFilter = this.googlePayManager.listTokens().filter(new Predicate() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo.onStart.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(List<GooglePayTokenInfoWrapper> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !RhyReferralFundConfirmationDuxo.this.debugAddedCardToGooglePayPref.get();
            }
        });
        Intrinsics.checkNotNullExpressionValue(maybeFilter, "filter(...)");
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, maybeFilter, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
        Observable<Boolean> observableFilter = this.debugAddedCardToGooglePayPref.getChanges().distinctUntilChanged().filter(new Predicate() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo.onStart.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Boolean it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.booleanValue();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.onStart$lambda$3(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, List list) {
        rhyReferralFundConfirmationDuxo.applyMutation(new RhyReferralFundConfirmationDuxo2(list, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyReferralFundConfirmationDuxo.applyMutation(new RhyReferralFundConfirmationDuxo3(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(final RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, Boolean bool) {
        rhyReferralFundConfirmationDuxo.withDataState(new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.onStart$lambda$3$lambda$2(this.f$0, (RhyReferralFundConfirmationDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3$lambda$2(RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, RhyReferralFundConfirmationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<GooglePayTokenInfoWrapper> googlePayTokenList = dataState.getGooglePayTokenList();
        if (googlePayTokenList != null && !googlePayTokenList.isEmpty()) {
            rhyReferralFundConfirmationDuxo.debugOnlyAddToGoogleWallet();
        }
        return Unit.INSTANCE;
    }

    public final void getPushTokenizeEvent() {
        if (this.isGetPushTokenizeRequestInFlight) {
            return;
        }
        Single<PushTokenizeRequest> singleDoOnSubscribe = this.rhySuvManager.getPushTokenizeEvent().doOnSubscribe(new Consumer() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo.getPushTokenizeEvent.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                RhyReferralFundConfirmationDuxo.this.isGetPushTokenizeRequestInFlight = true;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.getPushTokenizeEvent$lambda$4(this.f$0, (PushTokenizeRequest) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.getPushTokenizeEvent$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$4(RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, PushTokenizeRequest pushTokenizeRequest) {
        Intrinsics.checkNotNull(pushTokenizeRequest);
        rhyReferralFundConfirmationDuxo.submit(new RhyReferralFundConfirmationEvent.PushTokenize(pushTokenizeRequest));
        rhyReferralFundConfirmationDuxo.addToGooglePayTappedPref.set(true);
        rhyReferralFundConfirmationDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getPushTokenizeEvent$lambda$5(RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof VerificationRequiredException) {
            rhyReferralFundConfirmationDuxo.submit(new RhyReferralFundConfirmationEvent.VerificationRequired((VerificationRequiredException) error));
        }
        rhyReferralFundConfirmationDuxo.isGetPushTokenizeRequestInFlight = false;
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralFundConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$debugAddCardToGooglePayDialogDismissed$1", m3645f = "RhyReferralFundConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$debugAddCardToGooglePayDialogDismissed$1 */
    static final class C274421 extends ContinuationImpl7 implements Function2<RhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C274421(Continuation<? super C274421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C274421 c274421 = new C274421(continuation);
            c274421.L$0 = obj;
            return c274421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralFundConfirmationDataState rhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState> continuation) {
            return ((C274421) create(rhyReferralFundConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyReferralFundConfirmationDataState.copy$default((RhyReferralFundConfirmationDataState) this.L$0, null, false, 1, null);
        }
    }

    public final void debugAddCardToGooglePayDialogDismissed() {
        applyMutation(new C274421(null));
    }

    public final void debugOnlyClickAddToGoogleWallet() {
        this.debugAddedCardToGooglePayPref.set(true);
        debugOnlyAddToGoogleWallet();
    }

    /* compiled from: RhyReferralFundConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$debugOnlyAddToGoogleWallet$1", m3645f = "RhyReferralFundConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$debugOnlyAddToGoogleWallet$1 */
    static final class C274431 extends ContinuationImpl7 implements Function2<RhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C274431(Continuation<? super C274431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C274431 c274431 = new C274431(continuation);
            c274431.L$0 = obj;
            return c274431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralFundConfirmationDataState rhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState> continuation) {
            return ((C274431) create(rhyReferralFundConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((RhyReferralFundConfirmationDataState) this.L$0).copy(RhyReferralFundConfirmationDuxo.INSTANCE.getDebugGooglePayTokenList$feature_rhy_referral_externalDebug(), false);
        }
    }

    private final void debugOnlyAddToGoogleWallet() {
        applyMutation(new C274431(null));
    }

    /* compiled from: RhyReferralFundConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$showDebugAddCardToGooglePayDialog$1", m3645f = "RhyReferralFundConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$showDebugAddCardToGooglePayDialog$1 */
    static final class C274471 extends ContinuationImpl7 implements Function2<RhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C274471(Continuation<? super C274471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C274471 c274471 = new C274471(continuation);
            c274471.L$0 = obj;
            return c274471;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralFundConfirmationDataState rhyReferralFundConfirmationDataState, Continuation<? super RhyReferralFundConfirmationDataState> continuation) {
            return ((C274471) create(rhyReferralFundConfirmationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyReferralFundConfirmationDataState.copy$default((RhyReferralFundConfirmationDataState) this.L$0, null, true, 1, null);
        }
    }

    public final void showDebugAddCardToGooglePayDialog() {
        applyMutation(new C274471(null));
    }

    public final void updateGooglePayData() {
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.googlePayManager.listTokens(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.updateGooglePayData$lambda$6(this.f$0, (List) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.fund.confirmation.RhyReferralFundConfirmationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralFundConfirmationDuxo.updateGooglePayData$lambda$7(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$6(RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, List tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        rhyReferralFundConfirmationDuxo.applyMutation(new RhyReferralFundConfirmationDuxo4(tokenList, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateGooglePayData$lambda$7(RhyReferralFundConfirmationDuxo rhyReferralFundConfirmationDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyReferralFundConfirmationDuxo.applyMutation(new RhyReferralFundConfirmationDuxo5(null));
        return Unit.INSTANCE;
    }

    /* compiled from: RhyReferralFundConfirmationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/confirmation/RhyReferralFundConfirmationDuxo$Companion;", "", "<init>", "()V", "debugGooglePayTokenList", "", "Lcom/robinhood/models/db/mcduckling/GooglePayTokenInfoWrapper;", "getDebugGooglePayTokenList$feature_rhy_referral_externalDebug$annotations", "getDebugGooglePayTokenList$feature_rhy_referral_externalDebug", "()Ljava/util/List;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDebugGooglePayTokenList$feature_rhy_referral_externalDebug$annotations */
        public static /* synthetic */ void m2443x32e7058a() {
        }

        private Companion() {
        }

        public final List<GooglePayTokenInfoWrapper> getDebugGooglePayTokenList$feature_rhy_referral_externalDebug() {
            return RhyReferralFundConfirmationDuxo.debugGooglePayTokenList;
        }
    }

    static {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        debugGooglePayTokenList = CollectionsKt.listOf(new GooglePayTokenInfoWrapper(string2, "RobinhoodDebug", "1000", "1000", 3, 3, 5, true, "RobinhoodDebug"));
    }
}
