package com.robinhood.android.support.supporthub;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.support.supporthub.ConciergeOnboardingEvent;
import com.robinhood.android.support.supporthub.ConciergeOnboardingViewState;
import com.robinhood.android.support.supporthub.ConciergeOnboardingViewState2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.supporthub.SupportHubStore;
import com.robinhood.shared.support.contracts.ConciergeOnboardingFragmentKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ConciergeOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001&B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002J\b\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00150\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "supportHubStore", "Lcom/robinhood/librobinhood/data/store/supporthub/SupportHubStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/supporthub/SupportHubStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "subScreenCurrent", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/robinhood/android/support/supporthub/SubScreen;", "subScreensSequence", "Lkotlinx/collections/immutable/PersistentList;", "onCreate", "", "handleContinue", "currentScreen", "handleBackward", "", "decidesSubScreens", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkEligibility", "calculateIfUseCloseNavButton", "nextIndex", "", "calculateIfUseEndButton", "lastIndex", "calculateProgressPercentage", "", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ConciergeOnboardingDuxo extends BaseDuxo5<ConciergeOnboardingViewState, ConciergeOnboardingEvent> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;
    private final AtomicReference<ConciergeOnboardingViewState2> subScreenCurrent;
    private final AtomicReference<ImmutableList3<ConciergeOnboardingViewState2>> subScreensSequence;
    private final SupportHubStore supportHubStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE}, m3647m = "checkEligibility")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$checkEligibility$1 */
    static final class C290431 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C290431(Continuation<? super C290431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConciergeOnboardingDuxo.this.checkEligibility(this);
        }
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "decidesSubScreens")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$decidesSubScreens$1 */
    static final class C290471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C290471(Continuation<? super C290471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConciergeOnboardingDuxo.this.decidesSubScreens(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean calculateIfUseCloseNavButton(int nextIndex) {
        return nextIndex == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean calculateIfUseEndButton(int nextIndex, int lastIndex) {
        return nextIndex == lastIndex;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConciergeOnboardingDuxo(SupportHubStore supportHubStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new ConciergeOnboardingViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(supportHubStore, "supportHubStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.supportHubStore = supportHubStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.subScreenCurrent = new AtomicReference<>(ConciergeOnboardingViewState2.Welcome.INSTANCE);
        this.subScreensSequence = new AtomicReference<>();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C290501(null));
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$onCreate$1", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$onCreate$1 */
    static final class C290501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C290501(Continuation<? super C290501> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290501 c290501 = ConciergeOnboardingDuxo.this.new C290501(continuation);
            c290501.L$0 = obj;
            return c290501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C290501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ConciergeOnboardingDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$onCreate$1$1", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConciergeOnboardingDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ConciergeOnboardingDuxo conciergeOnboardingDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = conciergeOnboardingDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ConciergeOnboardingDuxo conciergeOnboardingDuxo = this.this$0;
                    this.label = 1;
                    if (conciergeOnboardingDuxo.checkEligibility(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(ConciergeOnboardingDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleContinue(ConciergeOnboardingViewState2 currentScreen) {
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        ImmutableList3<ConciergeOnboardingViewState2> immutableList3 = this.subScreensSequence.get();
        this.subScreenCurrent.set(currentScreen);
        if (Intrinsics.areEqual(currentScreen, ConciergeOnboardingViewState2.Welcome.INSTANCE)) {
            this.supportHubStore.markConciergeOnboardingCheckpoint(Boolean.TRUE, null);
        } else if (Intrinsics.areEqual(currentScreen, ConciergeOnboardingViewState2.PerksDedicatedExpert.INSTANCE)) {
            this.supportHubStore.markConciergeOnboardingCheckpoint(null, Boolean.TRUE);
        } else {
            Unit unit = Unit.INSTANCE;
        }
        int iIndexOf = immutableList3.indexOf(this.subScreenCurrent.get()) + 1;
        if (iIndexOf >= immutableList3.size()) {
            submit(ConciergeOnboardingEvent.ShowSupportHub.INSTANCE);
        } else {
            this.subScreenCurrent.set(immutableList3.get(iIndexOf));
            applyMutation(new C290491(immutableList3, iIndexOf, this, null));
        }
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$handleContinue$1", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$handleContinue$1 */
    static final class C290491 extends ContinuationImpl7 implements Function2<ConciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState>, Object> {
        final /* synthetic */ int $nextAt;
        final /* synthetic */ ImmutableList3<ConciergeOnboardingViewState2> $screens;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConciergeOnboardingDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C290491(ImmutableList3<? extends ConciergeOnboardingViewState2> immutableList3, int i, ConciergeOnboardingDuxo conciergeOnboardingDuxo, Continuation<? super C290491> continuation) {
            super(2, continuation);
            this.$screens = immutableList3;
            this.$nextAt = i;
            this.this$0 = conciergeOnboardingDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290491 c290491 = new C290491(this.$screens, this.$nextAt, this.this$0, continuation);
            c290491.L$0 = obj;
            return c290491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConciergeOnboardingViewState conciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState> continuation) {
            return ((C290491) create(conciergeOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConciergeOnboardingViewState conciergeOnboardingViewState = (ConciergeOnboardingViewState) this.L$0;
            ConciergeOnboardingViewState2 conciergeOnboardingViewState2 = this.$screens.get(this.$nextAt);
            boolean zCalculateIfUseCloseNavButton = this.this$0.calculateIfUseCloseNavButton(this.$nextAt);
            ConciergeOnboardingDuxo conciergeOnboardingDuxo = this.this$0;
            int i = this.$nextAt;
            ImmutableList3<ConciergeOnboardingViewState2> immutableList3 = this.$screens;
            Intrinsics.checkNotNull(immutableList3);
            boolean zCalculateIfUseEndButton = conciergeOnboardingDuxo.calculateIfUseEndButton(i, CollectionsKt.getLastIndex(immutableList3));
            float fCalculateProgressPercentage = this.this$0.calculateProgressPercentage();
            ImmutableList3<ConciergeOnboardingViewState2> immutableList32 = this.$screens;
            Intrinsics.checkNotNull(immutableList32);
            return conciergeOnboardingViewState.copy(new ConciergeOnboardingViewState.InitialLoadingState.Loaded(conciergeOnboardingViewState2, zCalculateIfUseCloseNavButton, zCalculateIfUseEndButton, fCalculateProgressPercentage, immutableList32));
        }
    }

    public final boolean handleBackward() {
        ImmutableList3<ConciergeOnboardingViewState2> immutableList3 = this.subScreensSequence.get();
        ConciergeOnboardingViewState2 conciergeOnboardingViewState2 = this.subScreenCurrent.get();
        int iIndexOf = immutableList3.indexOf(conciergeOnboardingViewState2) - 1;
        if (iIndexOf < 0) {
            return false;
        }
        boolean zM88m = PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m88m(this.subScreenCurrent, conciergeOnboardingViewState2, immutableList3.get(iIndexOf));
        if (zM88m) {
            applyMutation(new C290481(immutableList3, iIndexOf, this, null));
        }
        return zM88m;
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$handleBackward$1", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$handleBackward$1 */
    static final class C290481 extends ContinuationImpl7 implements Function2<ConciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState>, Object> {
        final /* synthetic */ int $nextAt;
        final /* synthetic */ ImmutableList3<ConciergeOnboardingViewState2> $screens;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConciergeOnboardingDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C290481(ImmutableList3<? extends ConciergeOnboardingViewState2> immutableList3, int i, ConciergeOnboardingDuxo conciergeOnboardingDuxo, Continuation<? super C290481> continuation) {
            super(2, continuation);
            this.$screens = immutableList3;
            this.$nextAt = i;
            this.this$0 = conciergeOnboardingDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290481 c290481 = new C290481(this.$screens, this.$nextAt, this.this$0, continuation);
            c290481.L$0 = obj;
            return c290481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConciergeOnboardingViewState conciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState> continuation) {
            return ((C290481) create(conciergeOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConciergeOnboardingViewState conciergeOnboardingViewState = (ConciergeOnboardingViewState) this.L$0;
            ConciergeOnboardingViewState2 conciergeOnboardingViewState2 = this.$screens.get(this.$nextAt);
            boolean zCalculateIfUseCloseNavButton = this.this$0.calculateIfUseCloseNavButton(this.$nextAt);
            ConciergeOnboardingDuxo conciergeOnboardingDuxo = this.this$0;
            int i = this.$nextAt;
            ImmutableList3<ConciergeOnboardingViewState2> immutableList3 = this.$screens;
            Intrinsics.checkNotNull(immutableList3);
            boolean zCalculateIfUseEndButton = conciergeOnboardingDuxo.calculateIfUseEndButton(i, CollectionsKt.getLastIndex(immutableList3));
            float fCalculateProgressPercentage = this.this$0.calculateProgressPercentage();
            ImmutableList3<ConciergeOnboardingViewState2> immutableList32 = this.$screens;
            Intrinsics.checkNotNull(immutableList32);
            return conciergeOnboardingViewState.copy(new ConciergeOnboardingViewState.InitialLoadingState.Loaded(conciergeOnboardingViewState2, zCalculateIfUseCloseNavButton, zCalculateIfUseEndButton, fCalculateProgressPercentage, immutableList32));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decidesSubScreens(Continuation<? super Unit> continuation) {
        C290471 c290471;
        List listEmptyList;
        if (continuation instanceof C290471) {
            c290471 = (C290471) continuation;
            int i = c290471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c290471.label = i - Integer.MIN_VALUE;
            } else {
                c290471 = new C290471(continuation);
            }
        }
        Object objFirst = c290471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c290471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{ConciergeOnboardingVideoExperiment.INSTANCE}, false, null, 6, null);
            c290471.label = 1;
            objFirst = FlowKt.first(flowStreamStateFlow$default, c290471);
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFirst);
        }
        if (((Boolean) objFirst).booleanValue()) {
            listEmptyList = CollectionsKt.listOf(ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.subScreensSequence.set(extensions2.toPersistentList(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.listOf(ConciergeOnboardingViewState2.Welcome.INSTANCE), (Iterable) listEmptyList), (Iterable) CollectionsKt.listOf((Object[]) new ConciergeOnboardingViewState2[]{ConciergeOnboardingViewState2.PerksPrioritySupport.INSTANCE, ConciergeOnboardingViewState2.PerksDedicatedExpert.INSTANCE}))));
        return Unit.INSTANCE;
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$checkEligibility$2", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$checkEligibility$2 */
    static final class C290442 extends ContinuationImpl7 implements Function2<ConciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C290442(Continuation<? super C290442> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290442 c290442 = new C290442(continuation);
            c290442.L$0 = obj;
            return c290442;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConciergeOnboardingViewState conciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState> continuation) {
            return ((C290442) create(conciergeOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((ConciergeOnboardingViewState) this.L$0).copy(ConciergeOnboardingViewState.InitialLoadingState.Loading.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(1:50)|(1:(1:(3:12|29|(7:31|34|35|48|36|45|46)(4:32|33|45|46))(2:16|17))(1:18))(5:20|52|21|(1:23)|28)|24|(1:26)|34|35|48|36|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r14 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        com.robinhood.utils.logging.CrashReporter.INSTANCE.reportNonFatal(r14, false, new com.robinhood.utils.logging.EventMetadata(com.robinhood.utils.logging.SentryTeam.SUPPORT_X, kotlin.collections.MapsKt.mapOf(kotlin.Tuples4.m3642to("feature", "concierge_onboarding")), null, 4, null));
        applyMutation(new com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo.C290464(r14, null));
        submit(com.robinhood.android.support.supporthub.ConciergeOnboardingEvent.ShowErrorDialog.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d2, code lost:
    
        throw r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkEligibility(Continuation<? super Unit> continuation) throws Throwable {
        C290431 c290431;
        Throwable th;
        if (continuation instanceof C290431) {
            c290431 = (C290431) continuation;
            int i = c290431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c290431.label = i - Integer.MIN_VALUE;
            } else {
                c290431 = new C290431(continuation);
            }
        }
        Object objIsEligibleForConciergeOnboardingExperience = c290431.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c290431.label;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        if (i2 == 0) {
            ResultKt.throwOnFailure(objIsEligibleForConciergeOnboardingExperience);
            applyMutation(new C290442(null));
            try {
                c290431.label = 1;
                if (decidesSubScreens(c290431) == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                if (th instanceof CancellationException) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objIsEligibleForConciergeOnboardingExperience);
                if (((Boolean) objIsEligibleForConciergeOnboardingExperience).booleanValue()) {
                    ImmutableList3<ConciergeOnboardingViewState2> immutableList3 = this.subScreensSequence.get();
                    ConciergeOnboardingViewState2 conciergeOnboardingViewState2 = this.subScreenCurrent.get();
                    applyMutation(new C290453(conciergeOnboardingViewState2, this, immutableList3.indexOf(conciergeOnboardingViewState2), immutableList3, null));
                    return Unit.INSTANCE;
                }
                submit(ConciergeOnboardingEvent.ShowSupportHub.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objIsEligibleForConciergeOnboardingExperience);
        }
        if (((ConciergeOnboardingFragmentKey) INSTANCE.getArgs((HasSavedState) this)).getHasEligibilityCheck()) {
            SupportHubStore supportHubStore = this.supportHubStore;
            c290431.label = 2;
            objIsEligibleForConciergeOnboardingExperience = supportHubStore.isEligibleForConciergeOnboardingExperience(c290431);
        }
        ImmutableList3<ConciergeOnboardingViewState2> immutableList32 = this.subScreensSequence.get();
        ConciergeOnboardingViewState2 conciergeOnboardingViewState22 = this.subScreenCurrent.get();
        applyMutation(new C290453(conciergeOnboardingViewState22, this, immutableList32.indexOf(conciergeOnboardingViewState22), immutableList32, null));
        return Unit.INSTANCE;
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$checkEligibility$3", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$checkEligibility$3 */
    static final class C290453 extends ContinuationImpl7 implements Function2<ConciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState>, Object> {
        final /* synthetic */ int $currentIndex;
        final /* synthetic */ ConciergeOnboardingViewState2 $currentScreen;
        final /* synthetic */ ImmutableList3<ConciergeOnboardingViewState2> $screens;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ConciergeOnboardingDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C290453(ConciergeOnboardingViewState2 conciergeOnboardingViewState2, ConciergeOnboardingDuxo conciergeOnboardingDuxo, int i, ImmutableList3<? extends ConciergeOnboardingViewState2> immutableList3, Continuation<? super C290453> continuation) {
            super(2, continuation);
            this.$currentScreen = conciergeOnboardingViewState2;
            this.this$0 = conciergeOnboardingDuxo;
            this.$currentIndex = i;
            this.$screens = immutableList3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290453 c290453 = new C290453(this.$currentScreen, this.this$0, this.$currentIndex, this.$screens, continuation);
            c290453.L$0 = obj;
            return c290453;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConciergeOnboardingViewState conciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState> continuation) {
            return ((C290453) create(conciergeOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ConciergeOnboardingViewState conciergeOnboardingViewState = (ConciergeOnboardingViewState) this.L$0;
            ConciergeOnboardingViewState2 conciergeOnboardingViewState2 = this.$currentScreen;
            Intrinsics.checkNotNull(conciergeOnboardingViewState2);
            boolean zCalculateIfUseCloseNavButton = this.this$0.calculateIfUseCloseNavButton(this.$currentIndex);
            ConciergeOnboardingDuxo conciergeOnboardingDuxo = this.this$0;
            int i = this.$currentIndex;
            ImmutableList3<ConciergeOnboardingViewState2> immutableList3 = this.$screens;
            Intrinsics.checkNotNull(immutableList3);
            boolean zCalculateIfUseEndButton = conciergeOnboardingDuxo.calculateIfUseEndButton(i, CollectionsKt.getLastIndex(immutableList3));
            float fCalculateProgressPercentage = this.this$0.calculateProgressPercentage();
            ImmutableList3<ConciergeOnboardingViewState2> immutableList32 = this.$screens;
            Intrinsics.checkNotNull(immutableList32);
            return conciergeOnboardingViewState.copy(new ConciergeOnboardingViewState.InitialLoadingState.Loaded(conciergeOnboardingViewState2, zCalculateIfUseCloseNavButton, zCalculateIfUseEndButton, fCalculateProgressPercentage, immutableList32));
        }
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$checkEligibility$4", m3645f = "ConciergeOnboardingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingDuxo$checkEligibility$4 */
    static final class C290464 extends ContinuationImpl7 implements Function2<ConciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState>, Object> {

        /* renamed from: $t */
        final /* synthetic */ Throwable f4974$t;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C290464(Throwable th, Continuation<? super C290464> continuation) {
            super(2, continuation);
            this.f4974$t = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290464 c290464 = new C290464(this.f4974$t, continuation);
            c290464.L$0 = obj;
            return c290464;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConciergeOnboardingViewState conciergeOnboardingViewState, Continuation<? super ConciergeOnboardingViewState> continuation) {
            return ((C290464) create(conciergeOnboardingViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((ConciergeOnboardingViewState) this.L$0).copy(new ConciergeOnboardingViewState.InitialLoadingState.Error(this.f4974$t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float calculateProgressPercentage() {
        ImmutableList3<ConciergeOnboardingViewState2> immutableList3 = this.subScreensSequence.get();
        Intrinsics.checkNotNullExpressionValue(immutableList3, "get(...)");
        ArrayList arrayList = new ArrayList();
        for (ConciergeOnboardingViewState2 conciergeOnboardingViewState2 : immutableList3) {
            ConciergeOnboardingViewState2 conciergeOnboardingViewState22 = conciergeOnboardingViewState2;
            if ((conciergeOnboardingViewState22 instanceof ConciergeOnboardingViewState2.PerksPrioritySupport) || (conciergeOnboardingViewState22 instanceof ConciergeOnboardingViewState2.PerksDedicatedExpert)) {
                arrayList.add(conciergeOnboardingViewState2);
            }
        }
        int size = arrayList.size();
        if (arrayList.indexOf(this.subScreenCurrent.get()) < 0) {
            return 0.0f;
        }
        return (r1 + 1) / size;
    }

    /* compiled from: ConciergeOnboardingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingDuxo;", "Lcom/robinhood/shared/support/contracts/ConciergeOnboardingFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ConciergeOnboardingDuxo, ConciergeOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConciergeOnboardingFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (ConciergeOnboardingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ConciergeOnboardingFragmentKey getArgs(ConciergeOnboardingDuxo conciergeOnboardingDuxo) {
            return (ConciergeOnboardingFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, conciergeOnboardingDuxo);
        }
    }
}
