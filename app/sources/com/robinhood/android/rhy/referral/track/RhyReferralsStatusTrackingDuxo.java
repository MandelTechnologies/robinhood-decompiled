package com.robinhood.android.rhy.referral.track;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.rhy.contracts.RhyRefereeLandingKey;
import com.robinhood.android.rhy.contracts.RhyReferralTrackingDetailKey;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.RhyReferralAttributionStore;
import com.robinhood.librobinhood.data.store.RhyReferralRemindStore;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Observable;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
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

/* compiled from: RhyReferralsStatusTrackingDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDataState;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingViewState;", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingEvent;", "rhyReferralAttributionStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;", "rhyReferralRemindStore", "Lcom/robinhood/librobinhood/data/store/RhyReferralRemindStore;", "stateProvider", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/RhyReferralAttributionStore;Lcom/robinhood/librobinhood/data/store/RhyReferralRemindStore;Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "onViewDetails", "referralAttribution", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "onRemind", "remindDialogDismissed", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralsStatusTrackingDuxo extends BaseDuxo3<RhyReferralsStatusTrackingDataState, RhyReferralsStatusTrackingViewState, RhyReferralsStatusTrackingEvent> {
    public static final int $stable = 8;
    private final RhyReferralAttributionStore rhyReferralAttributionStore;
    private final RhyReferralRemindStore rhyReferralRemindStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralsStatusTrackingDuxo(RhyReferralAttributionStore rhyReferralAttributionStore, RhyReferralRemindStore rhyReferralRemindStore, RhyReferralsStatusTrackingStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyReferralsStatusTrackingDataState(null, false, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rhyReferralAttributionStore, "rhyReferralAttributionStore");
        Intrinsics.checkNotNullParameter(rhyReferralRemindStore, "rhyReferralRemindStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rhyReferralAttributionStore = rhyReferralAttributionStore;
        this.rhyReferralRemindStore = rhyReferralRemindStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.rhyReferralAttributionStore.refresh(true);
        this.rhyReferralAttributionStore.refreshList(true);
        Observables observables = Observables.INSTANCE;
        Observable<List<RhyReferralAttribution>> observableDistinctUntilChanged = this.rhyReferralAttributionStore.streamList().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable<Optional<RhyReferralAttribution>> observableDistinctUntilChanged2 = this.rhyReferralAttributionStore.stream().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        Observable observableDistinctUntilChanged3 = observables.combineLatest(observableDistinctUntilChanged, observableDistinctUntilChanged2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged3, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsStatusTrackingDuxo.onStart$lambda$0(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyReferralsStatusTrackingDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyReferralsStatusTrackingDuxo rhyReferralsStatusTrackingDuxo, Tuples2 tuples2) {
        rhyReferralsStatusTrackingDuxo.applyMutation(new RhyReferralsStatusTrackingDuxo2((List) tuples2.component1(), (RhyReferralAttribution) ((Optional) tuples2.component2()).getOrNull(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyReferralsStatusTrackingDuxo rhyReferralsStatusTrackingDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        rhyReferralsStatusTrackingDuxo.submit(new RhyReferralsStatusTrackingEvent.Error(error));
        return Unit.INSTANCE;
    }

    public final void onViewDetails(RhyReferralAttribution referralAttribution) {
        FragmentKey rhyReferralTrackingDetailKey;
        Intrinsics.checkNotNullParameter(referralAttribution, "referralAttribution");
        if (referralAttribution.isReferralOfCurrentUser() && !referralAttribution.isCompleted()) {
            rhyReferralTrackingDetailKey = RhyRefereeLandingKey.INSTANCE;
        } else {
            rhyReferralTrackingDetailKey = new RhyReferralTrackingDetailKey(referralAttribution);
        }
        submit(new RhyReferralsStatusTrackingEvent.ShowFragment(rhyReferralTrackingDetailKey));
    }

    /* compiled from: RhyReferralsStatusTrackingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$onRemind$1", m3645f = "RhyReferralsStatusTrackingDuxo.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$onRemind$1 */
    static final class C275301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RhyReferralAttribution $referralAttribution;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C275301(RhyReferralAttribution rhyReferralAttribution, Continuation<? super C275301> continuation) {
            super(2, continuation);
            this.$referralAttribution = rhyReferralAttribution;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhyReferralsStatusTrackingDuxo.this.new C275301(this.$referralAttribution, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C275301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RhyReferralsStatusTrackingDuxo.this.submit(new RhyReferralsStatusTrackingEvent.ShowSnackbar(C27406R.string.rhy_referral_track_invites_reminder_sending));
                    RhyReferralRemindStore rhyReferralRemindStore = RhyReferralsStatusTrackingDuxo.this.rhyReferralRemindStore;
                    UUID id = this.$referralAttribution.getId();
                    this.label = 1;
                    if (rhyReferralRemindStore.remind(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                RhyReferralsStatusTrackingDuxo.this.rhyReferralAttributionStore.refreshList(true);
                RhyReferralsStatusTrackingDuxo.this.applyMutation(new AnonymousClass1(null));
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                RhyReferralsStatusTrackingDuxo.this.submit(new RhyReferralsStatusTrackingEvent.Error(th));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: RhyReferralsStatusTrackingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$onRemind$1$1", m3645f = "RhyReferralsStatusTrackingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$onRemind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<RhyReferralsStatusTrackingDataState, Continuation<? super RhyReferralsStatusTrackingDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RhyReferralsStatusTrackingDataState rhyReferralsStatusTrackingDataState, Continuation<? super RhyReferralsStatusTrackingDataState> continuation) {
                return ((AnonymousClass1) create(rhyReferralsStatusTrackingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return RhyReferralsStatusTrackingDataState.copy$default((RhyReferralsStatusTrackingDataState) this.L$0, null, true, 1, null);
            }
        }
    }

    public final void onRemind(RhyReferralAttribution referralAttribution) {
        Intrinsics.checkNotNullParameter(referralAttribution, "referralAttribution");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C275301(referralAttribution, null), 3, null);
    }

    /* compiled from: RhyReferralsStatusTrackingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusTrackingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$remindDialogDismissed$1", m3645f = "RhyReferralsStatusTrackingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingDuxo$remindDialogDismissed$1 */
    static final class C275311 extends ContinuationImpl7 implements Function2<RhyReferralsStatusTrackingDataState, Continuation<? super RhyReferralsStatusTrackingDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C275311(Continuation<? super C275311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C275311 c275311 = new C275311(continuation);
            c275311.L$0 = obj;
            return c275311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RhyReferralsStatusTrackingDataState rhyReferralsStatusTrackingDataState, Continuation<? super RhyReferralsStatusTrackingDataState> continuation) {
            return ((C275311) create(rhyReferralsStatusTrackingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RhyReferralsStatusTrackingDataState.copy$default((RhyReferralsStatusTrackingDataState) this.L$0, null, false, 1, null);
        }
    }

    public final void remindDialogDismissed() {
        applyMutation(new C275311(null));
    }
}
