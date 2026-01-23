package com.robinhood.android.rhy.referral.referrer;

import com.robinhood.android.rhy.contracts.RhyReferralContactListKey;
import com.robinhood.android.rhy.contracts.RhyReferralStatusTrackingKey;
import com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.RhyReferralLandingStore;
import com.robinhood.models.rhy.referral.p345db.ReferrerLanding;
import com.robinhood.models.rhy.referral.p345db.RhyReferralIneligibilityData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyReferralsReferrerLandingDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingDataState;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingViewState;", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingEvent;", "referralLandingStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralLandingStore;", "stateProvider", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyReferralLandingStore;Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "showReferralHistory", "inviteContacts", "shareLink", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralsReferrerLandingDuxo extends BaseDuxo3<RhyReferralsReferrerLandingDataState, RhyReferralsReferrerLandingViewState, RhyReferralsReferrerLandingEvent> {
    public static final int $stable = 8;
    private final RhyReferralLandingStore referralLandingStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralsReferrerLandingDuxo(RhyReferralLandingStore referralLandingStore, RhyReferralsReferrerLandingStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyReferralsReferrerLandingDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(referralLandingStore, "referralLandingStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.referralLandingStore = referralLandingStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C275081(null), 3, null);
    }

    /* compiled from: RhyReferralsReferrerLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$onStart$1", m3645f = "RhyReferralsReferrerLandingDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$onStart$1 */
    static final class C275081 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C275081(Continuation<? super C275081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralsReferrerLandingDuxo.this.new C275081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C275081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RhyReferralLandingStore rhyReferralLandingStore = RhyReferralsReferrerLandingDuxo.this.referralLandingStore;
                    this.label = 1;
                    obj = rhyReferralLandingStore.forceFetchReferrerLanding(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ReferrerLanding referrerLanding = (ReferrerLanding) obj;
                RhyReferralsReferrerLandingDuxo.this.applyMutation(new AnonymousClass1(referrerLanding, null));
                RhyReferralIneligibilityData ineligibilityData = referrerLanding.getIneligibilityData();
                if (ineligibilityData != null) {
                    RhyReferralsReferrerLandingDuxo.this.submit(new RhyReferralsReferrerLandingEvent.ShowIneligibilityDialog(ineligibilityData));
                }
            } catch (Throwable th) {
                RhyReferralsReferrerLandingDuxo.this.applyMutation(new AnonymousClass2(th, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RhyReferralsReferrerLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$onStart$1$1", m3645f = "RhyReferralsReferrerLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RhyReferralsReferrerLandingDataState, Continuation<? super RhyReferralsReferrerLandingDataState>, Object> {
            final /* synthetic */ ReferrerLanding $referrerLanding;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ReferrerLanding referrerLanding, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$referrerLanding = referrerLanding;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$referrerLanding, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RhyReferralsReferrerLandingDataState rhyReferralsReferrerLandingDataState, Continuation<? super RhyReferralsReferrerLandingDataState> continuation) {
                return ((AnonymousClass1) create(rhyReferralsReferrerLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RhyReferralsReferrerLandingDataState.copy$default((RhyReferralsReferrerLandingDataState) this.L$0, this.$referrerLanding, null, 2, null);
            }
        }

        /* compiled from: RhyReferralsReferrerLandingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/referrer/RhyReferralsReferrerLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$onStart$1$2", m3645f = "RhyReferralsReferrerLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<RhyReferralsReferrerLandingDataState, Continuation<? super RhyReferralsReferrerLandingDataState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f4893$t;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4893$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4893$t, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RhyReferralsReferrerLandingDataState rhyReferralsReferrerLandingDataState, Continuation<? super RhyReferralsReferrerLandingDataState> continuation) {
                return ((AnonymousClass2) create(rhyReferralsReferrerLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RhyReferralsReferrerLandingDataState.copy$default((RhyReferralsReferrerLandingDataState) this.L$0, null, this.f4893$t, 1, null);
            }
        }
    }

    public final void showReferralHistory() {
        submit(new RhyReferralsReferrerLandingEvent.ShowFragment(RhyReferralStatusTrackingKey.INSTANCE));
    }

    public final void inviteContacts() {
        withDataState(new Function1() { // from class: com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsReferrerLandingDuxo.inviteContacts$lambda$0(this.f$0, (RhyReferralsReferrerLandingDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inviteContacts$lambda$0(RhyReferralsReferrerLandingDuxo rhyReferralsReferrerLandingDuxo, RhyReferralsReferrerLandingDataState dataState) {
        String shareText;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ReferrerLanding referrerLanding = dataState.getReferrerLanding();
        RhyReferralIneligibilityData ineligibilityData = referrerLanding != null ? referrerLanding.getIneligibilityData() : null;
        if (ineligibilityData != null) {
            rhyReferralsReferrerLandingDuxo.submit(new RhyReferralsReferrerLandingEvent.ShowIneligibilityDialog(ineligibilityData));
        } else {
            ReferrerLanding referrerLanding2 = dataState.getReferrerLanding();
            if (referrerLanding2 == null || (shareText = referrerLanding2.getShareText()) == null) {
                return Unit.INSTANCE;
            }
            rhyReferralsReferrerLandingDuxo.submit(new RhyReferralsReferrerLandingEvent.ShowFragment(new RhyReferralContactListKey(shareText)));
        }
        return Unit.INSTANCE;
    }

    public final void shareLink() {
        withDataState(new Function1() { // from class: com.robinhood.android.rhy.referral.referrer.RhyReferralsReferrerLandingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsReferrerLandingDuxo.shareLink$lambda$2(this.f$0, (RhyReferralsReferrerLandingDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareLink$lambda$2(RhyReferralsReferrerLandingDuxo rhyReferralsReferrerLandingDuxo, RhyReferralsReferrerLandingDataState dataState) {
        String shareText;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ReferrerLanding referrerLanding = dataState.getReferrerLanding();
        RhyReferralIneligibilityData ineligibilityData = referrerLanding != null ? referrerLanding.getIneligibilityData() : null;
        if (ineligibilityData != null) {
            rhyReferralsReferrerLandingDuxo.submit(new RhyReferralsReferrerLandingEvent.ShowIneligibilityDialog(ineligibilityData));
        } else {
            ReferrerLanding referrerLanding2 = dataState.getReferrerLanding();
            if (referrerLanding2 != null && (shareText = referrerLanding2.getShareText()) != null) {
                rhyReferralsReferrerLandingDuxo.submit(new RhyReferralsReferrerLandingEvent.ShareLink(shareText));
            }
        }
        return Unit.INSTANCE;
    }
}
