package com.robinhood.android.advisory.onboarding.marketing;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.contracts.StrategiesValuePropsKey;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.advisory.p304db.onboarding.StrategiesValuePropsData;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StrategiesValuePropsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDataState;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsScreenViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "onboardingStore", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/userleap/UserLeapManager;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "fetchValueProps", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "trackTapCtaEvent", AnalyticsStrings.BUTTON_MENU_OF_OPTIONS_RETRY, "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class StrategiesValuePropsDuxo extends BaseDuxo<StrategiesValuePropsDataState, StrategiesValuePropsScreenViewState> implements HasSavedState {
    private final AdvisoryOnboardingStore onboardingStore;
    private final SavedStateHandle savedStateHandle;
    private final SurveyManager3 userLeapManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: StrategiesValuePropsDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo", m3645f = "StrategiesValuePropsDuxo.kt", m3646l = {36}, m3647m = "fetchValueProps")
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$fetchValueProps$1 */
    static final class C88821 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C88821(Continuation<? super C88821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StrategiesValuePropsDuxo.this.fetchValueProps(this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StrategiesValuePropsDuxo(AdvisoryOnboardingStore onboardingStore, SurveyManager3 userLeapManager, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        Intrinsics.checkNotNullParameter(userLeapManager, "userLeapManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        String source = ((StrategiesValuePropsKey) INSTANCE.getArgs(savedStateHandle)).getSource();
        super(new StrategiesValuePropsDataState(null, null, source == null ? "" : source, 3, null), StrategiesValuePropsDataState.INSTANCE, duxoBundle);
        this.onboardingStore = onboardingStore;
        this.userLeapManager = userLeapManager;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: StrategiesValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$fetchValueProps$2", m3645f = "StrategiesValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$fetchValueProps$2 */
    static final class C88832 extends ContinuationImpl7 implements Function2<StrategiesValuePropsDataState, Continuation<? super StrategiesValuePropsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C88832(Continuation<? super C88832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88832 c88832 = new C88832(continuation);
            c88832.L$0 = obj;
            return c88832;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(StrategiesValuePropsDataState strategiesValuePropsDataState, Continuation<? super StrategiesValuePropsDataState> continuation) {
            return ((C88832) create(strategiesValuePropsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return StrategiesValuePropsDataState.copy$default((StrategiesValuePropsDataState) this.L$0, null, null, null, 5, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchValueProps(Continuation<? super Unit> continuation) {
        C88821 c88821;
        TrackingEvent trackingEvent;
        if (continuation instanceof C88821) {
            c88821 = (C88821) continuation;
            int i = c88821.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c88821.label = i - Integer.MIN_VALUE;
            } else {
                c88821 = new C88821(continuation);
            }
        }
        Object objStreamValueProps = c88821.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c88821.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objStreamValueProps);
                applyMutation(new C88832(null));
                AdvisoryOnboardingStore advisoryOnboardingStore = this.onboardingStore;
                String campaign = ((StrategiesValuePropsKey) INSTANCE.getArgs((HasSavedState) this)).getCampaign();
                c88821.label = 1;
                objStreamValueProps = advisoryOnboardingStore.streamValueProps(campaign, c88821);
                if (objStreamValueProps == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objStreamValueProps);
            }
            StrategiesValuePropsData strategiesValuePropsData = (StrategiesValuePropsData) objStreamValueProps;
            applyMutation(new C88843(strategiesValuePropsData, null));
            if (strategiesValuePropsData.isGoldVariant()) {
                trackingEvent = TrackingEvent.ADVISORY_SAW_VALUE_PROP_GOLD;
            } else {
                trackingEvent = TrackingEvent.ADVISORY_SAW_VALUE_PROP_NON_GOLD;
            }
            this.userLeapManager.track(trackingEvent);
        } catch (Exception e) {
            applyMutation(new C88854(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: StrategiesValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$fetchValueProps$3", m3645f = "StrategiesValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$fetchValueProps$3 */
    static final class C88843 extends ContinuationImpl7 implements Function2<StrategiesValuePropsDataState, Continuation<? super StrategiesValuePropsDataState>, Object> {
        final /* synthetic */ StrategiesValuePropsData $valuePropsData;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88843(StrategiesValuePropsData strategiesValuePropsData, Continuation<? super C88843> continuation) {
            super(2, continuation);
            this.$valuePropsData = strategiesValuePropsData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88843 c88843 = new C88843(this.$valuePropsData, continuation);
            c88843.L$0 = obj;
            return c88843;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(StrategiesValuePropsDataState strategiesValuePropsDataState, Continuation<? super StrategiesValuePropsDataState> continuation) {
            return ((C88843) create(strategiesValuePropsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return StrategiesValuePropsDataState.copy$default((StrategiesValuePropsDataState) this.L$0, this.$valuePropsData, null, null, 6, null);
        }
    }

    /* compiled from: StrategiesValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$fetchValueProps$4", m3645f = "StrategiesValuePropsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$fetchValueProps$4 */
    static final class C88854 extends ContinuationImpl7 implements Function2<StrategiesValuePropsDataState, Continuation<? super StrategiesValuePropsDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f3914$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C88854(Exception exc, Continuation<? super C88854> continuation) {
            super(2, continuation);
            this.f3914$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C88854 c88854 = new C88854(this.f3914$e, continuation);
            c88854.L$0 = obj;
            return c88854;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(StrategiesValuePropsDataState strategiesValuePropsDataState, Continuation<? super StrategiesValuePropsDataState> continuation) {
            return ((C88854) create(strategiesValuePropsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return StrategiesValuePropsDataState.copy$default((StrategiesValuePropsDataState) this.L$0, null, this.f3914$e, null, 5, null);
        }
    }

    /* compiled from: StrategiesValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$onStart$1", m3645f = "StrategiesValuePropsDuxo.kt", m3646l = {58}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$onStart$1 */
    static final class C88861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C88861(Continuation<? super C88861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategiesValuePropsDuxo.this.new C88861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C88861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StrategiesValuePropsDuxo strategiesValuePropsDuxo = StrategiesValuePropsDuxo.this;
                this.label = 1;
                if (strategiesValuePropsDuxo.fetchValueProps(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C88861(null));
    }

    public final void trackTapCtaEvent() {
        withDataState(new Function1() { // from class: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StrategiesValuePropsDuxo.trackTapCtaEvent$lambda$0(this.f$0, (StrategiesValuePropsDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackTapCtaEvent$lambda$0(StrategiesValuePropsDuxo strategiesValuePropsDuxo, StrategiesValuePropsDataState ds) {
        TrackingEvent trackingEvent;
        Intrinsics.checkNotNullParameter(ds, "ds");
        StrategiesValuePropsData data = ds.getData();
        if (data != null && data.isGoldVariant()) {
            trackingEvent = TrackingEvent.ADVISORY_TAP_CTA_VALUE_PROP_GOLD;
        } else {
            trackingEvent = TrackingEvent.ADVISORY_TAP_CTA_VALUE_PROP_NON_GOLD;
        }
        strategiesValuePropsDuxo.userLeapManager.track(trackingEvent);
        return Unit.INSTANCE;
    }

    /* compiled from: StrategiesValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$retry$1", m3645f = "StrategiesValuePropsDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.marketing.StrategiesValuePropsDuxo$retry$1 */
    static final class C88871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C88871(Continuation<? super C88871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StrategiesValuePropsDuxo.this.new C88871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C88871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StrategiesValuePropsDuxo strategiesValuePropsDuxo = StrategiesValuePropsDuxo.this;
                this.label = 1;
                if (strategiesValuePropsDuxo.fetchValueProps(this) == coroutine_suspended) {
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

    public final void retry() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C88871(null), 3, null);
    }

    /* compiled from: StrategiesValuePropsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/marketing/StrategiesValuePropsDuxo;", "Lcom/robinhood/android/advisory/contracts/StrategiesValuePropsKey;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<StrategiesValuePropsDuxo, StrategiesValuePropsKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public StrategiesValuePropsKey getArgs(SavedStateHandle savedStateHandle) {
            return (StrategiesValuePropsKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public StrategiesValuePropsKey getArgs(StrategiesValuePropsDuxo strategiesValuePropsDuxo) {
            return (StrategiesValuePropsKey) DuxoCompanion.DefaultImpls.getArgs(this, strategiesValuePropsDuxo);
        }
    }
}
