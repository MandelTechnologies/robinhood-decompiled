package com.robinhood.android.acatsin.intro;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.acatsin.intro.AcatsInIntroContract;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.bonfire.ApiAcatsWelcomeContents;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import io.reactivex.Single;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInIntroDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/acatsin/intro/AcatsIntroScreenCallbacks;", "acatsBrokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/acatsin/intro/AcatsInIntroStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "navEventCounter", "", "onResume", "", "onContinue", "onPageChange", "newPageIndex", "onBack", "logPageChange", "prevPage", "nextPage", "getScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "pageIndex", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInIntroDuxo extends BaseDuxo<AcatsInIntroDataState, AcatsInIntroViewState> implements HasSavedState, AcatsIntroScreenCallbacks {
    private final AcatsBrokerageStore acatsBrokerageStore;
    private final EventLogger eventLogger;
    private int navEventCounter;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInIntroDuxo(AcatsBrokerageStore acatsBrokerageStore, EventLogger eventLogger, AcatsInIntroStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(acatsBrokerageStore, "acatsBrokerageStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        ApiAcatsBonusPromoInfo promoInfo = ((AcatsInIntroContract.Key) INSTANCE.getArgs(savedStateHandle)).getPromoInfo();
        super(new AcatsInIntroDataState(null, 0, null, null, promoInfo != null ? promoInfo.is_active() : false, null, null, 111, null), stateProvider, duxoBundle);
        this.acatsBrokerageStore = acatsBrokerageStore;
        this.eventLogger = eventLogger;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AcatsInIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDuxo;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInIntroDuxo, AcatsInIntroContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInIntroContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInIntroContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInIntroContract.Key getArgs(AcatsInIntroDuxo acatsInIntroDuxo) {
            return (AcatsInIntroContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInIntroDuxo);
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        Single<ApiAcatsWelcomeContents> single = this.acatsBrokerageStore.getWelcomeContents().filter(new Predicate() { // from class: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo.onResume.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(ApiAcatsWelcomeContents it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !it.getPages().isEmpty();
            }
        }).toSingle();
        Intrinsics.checkNotNullExpressionValue(single, "toSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, single, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInIntroDuxo.onResume$lambda$0(this.f$0, (ApiAcatsWelcomeContents) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInIntroDuxo.onResume$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(AcatsInIntroDuxo acatsInIntroDuxo, ApiAcatsWelcomeContents apiAcatsWelcomeContents) {
        acatsInIntroDuxo.applyMutation(new AcatsInIntroDuxo2(acatsInIntroDuxo, apiAcatsWelcomeContents, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(AcatsInIntroDuxo acatsInIntroDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logScreenAppear$default(acatsInIntroDuxo.eventLogger, null, acatsInIntroDuxo.getScreen(0), null, null, ((AcatsInIntroContract.Key) INSTANCE.getArgs((HasSavedState) acatsInIntroDuxo)).getScreenContext().toEventContext(), 13, null);
        acatsInIntroDuxo.applyMutation(new AcatsInIntroDuxo3(acatsInIntroDuxo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onContinue$1", m3645f = "AcatsInIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onContinue$1 */
    static final class C79421 extends ContinuationImpl7 implements Function2<AcatsInIntroDataState, Continuation<? super AcatsInIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C79421(Continuation<? super C79421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79421 c79421 = AcatsInIntroDuxo.this.new C79421(continuation);
            c79421.L$0 = obj;
            return c79421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInIntroDataState acatsInIntroDataState, Continuation<? super AcatsInIntroDataState> continuation) {
            return ((C79421) create(acatsInIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInIntroDataState acatsInIntroDataState = (AcatsInIntroDataState) this.L$0;
            if (acatsInIntroDataState.getPages() == null || acatsInIntroDataState.getPageIndex() >= acatsInIntroDataState.getPages().size() - 1) {
                EventLogger.DefaultImpls.logScreenDisappear$default(AcatsInIntroDuxo.this.eventLogger, null, AcatsInIntroDuxo.this.getScreen(acatsInIntroDataState.getPageIndex()), null, null, null, 29, null);
                int i = AcatsInIntroDuxo.this.navEventCounter;
                AcatsInIntroDuxo.this.navEventCounter = i + 1;
                return AcatsInIntroDataState.copy$default(acatsInIntroDataState, null, 0, null, new UiEvent(boxing.boxInt(i)), false, null, null, 119, null);
            }
            int pageIndex = acatsInIntroDataState.getPageIndex() + 1;
            AcatsInIntroDuxo.this.logPageChange(acatsInIntroDataState.getPageIndex(), pageIndex);
            return AcatsInIntroDataState.copy$default(acatsInIntroDataState, null, pageIndex, null, null, false, null, null, 125, null);
        }
    }

    @Override // com.robinhood.android.acatsin.intro.AcatsIntroScreenCallbacks
    public void onContinue() {
        applyMutation(new C79421(null));
    }

    /* compiled from: AcatsInIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onPageChange$1", m3645f = "AcatsInIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onPageChange$1 */
    static final class C79431 extends ContinuationImpl7 implements Function2<AcatsInIntroDataState, Continuation<? super AcatsInIntroDataState>, Object> {
        final /* synthetic */ int $newPageIndex;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C79431(int i, Continuation<? super C79431> continuation) {
            super(2, continuation);
            this.$newPageIndex = i;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79431 c79431 = AcatsInIntroDuxo.this.new C79431(this.$newPageIndex, continuation);
            c79431.L$0 = obj;
            return c79431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInIntroDataState acatsInIntroDataState, Continuation<? super AcatsInIntroDataState> continuation) {
            return ((C79431) create(acatsInIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AcatsInIntroDataState acatsInIntroDataState = (AcatsInIntroDataState) this.L$0;
                AcatsInIntroDuxo.this.logPageChange(acatsInIntroDataState.getPageIndex(), this.$newPageIndex);
                return AcatsInIntroDataState.copy$default(acatsInIntroDataState, null, this.$newPageIndex, null, null, false, null, null, 125, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.acatsin.intro.AcatsIntroScreenCallbacks
    public void onPageChange(int newPageIndex) {
        applyMutation(new C79431(newPageIndex, null));
    }

    /* compiled from: AcatsInIntroDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onBack$1", m3645f = "AcatsInIntroDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.intro.AcatsInIntroDuxo$onBack$1 */
    static final class C79411 extends ContinuationImpl7 implements Function2<AcatsInIntroDataState, Continuation<? super AcatsInIntroDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C79411(Continuation<? super C79411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C79411 c79411 = AcatsInIntroDuxo.this.new C79411(continuation);
            c79411.L$0 = obj;
            return c79411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInIntroDataState acatsInIntroDataState, Continuation<? super AcatsInIntroDataState> continuation) {
            return ((C79411) create(acatsInIntroDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInIntroDataState acatsInIntroDataState = (AcatsInIntroDataState) this.L$0;
            if (acatsInIntroDataState.getPageIndex() <= 0) {
                EventLogger.DefaultImpls.logScreenDisappear$default(AcatsInIntroDuxo.this.eventLogger, null, AcatsInIntroDuxo.this.getScreen(acatsInIntroDataState.getPageIndex()), null, null, null, 29, null);
                int i = AcatsInIntroDuxo.this.navEventCounter;
                AcatsInIntroDuxo.this.navEventCounter = i + 1;
                return AcatsInIntroDataState.copy$default(acatsInIntroDataState, null, 0, new UiEvent(boxing.boxInt(i)), null, false, null, null, 123, null);
            }
            int pageIndex = acatsInIntroDataState.getPageIndex() - 1;
            AcatsInIntroDuxo.this.logPageChange(acatsInIntroDataState.getPageIndex(), pageIndex);
            return AcatsInIntroDataState.copy$default(acatsInIntroDataState, null, pageIndex, null, null, false, null, null, 125, null);
        }
    }

    @Override // com.robinhood.android.acatsin.intro.AcatsIntroScreenCallbacks
    public void onBack() {
        applyMutation(new C79411(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPageChange(int prevPage, int nextPage) {
        EventLogger eventLogger = this.eventLogger;
        Screen screen = getScreen(nextPage);
        Companion companion = INSTANCE;
        EventLogger.DefaultImpls.logScreenAppear$default(eventLogger, null, screen, null, null, ((AcatsInIntroContract.Key) companion.getArgs((HasSavedState) this)).getScreenContext().toEventContext(), 13, null);
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, getScreen(prevPage), null, null, ((AcatsInIntroContract.Key) companion.getArgs((HasSavedState) this)).getScreenContext().toEventContext(), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getScreen(int pageIndex) {
        return new Screen(Screen.Name.ACATS_IN_INTRO, ((AcatsInIntroContract.Key) INSTANCE.getArgs((HasSavedState) this)).getScreenContext().getSource(), String.valueOf(pageIndex), null, 8, null);
    }
}
