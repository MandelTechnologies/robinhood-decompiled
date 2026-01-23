package com.robinhood.android.feature.margin.hub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.hub.MarginHubStore;
import com.robinhood.android.lib.margin.hub.p168db.models.MarginStatusDetailView;
import com.robinhood.android.margin.contracts.MarginStatusDetailFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MarginStatusDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDataState;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "marginHubStore", "Lcom/robinhood/android/lib/margin/hub/MarginHubStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "stateProvider", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/margin/hub/MarginHubStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onResume", "Companion", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class MarginStatusDetailDuxo extends BaseDuxo<MarginStatusDetailDataState, MarginStatusDetailState3> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final MarginHubStore marginHubStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginStatusDetailDuxo(MarginHubStore marginHubStore, AccountProvider accountProvider, MarginStatusDetailState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MarginStatusDetailDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(marginHubStore, "marginHubStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.marginHubStore = marginHubStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C168311(null), 3, null);
    }

    /* compiled from: MarginStatusDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onStart$1", m3645f = "MarginStatusDetailDuxo.kt", m3646l = {33, 35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onStart$1 */
    static final class C168311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168311(Continuation<? super C168311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginStatusDetailDuxo.this.new C168311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r6 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) != r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String accountNumber;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                accountNumber = ((MarginStatusDetailFragmentKey) MarginStatusDetailDuxo.INSTANCE.getArgs((HasSavedState) MarginStatusDetailDuxo.this)).getAccountNumber();
                if (accountNumber == null) {
                    AccountProvider accountProvider = MarginStatusDetailDuxo.this.accountProvider;
                    this.label = 1;
                    obj = accountProvider.getIndividualAccountNumberForced(this);
                } else {
                    Flow<MarginStatusDetailView> flowStreamMarginStatusDetail = MarginStatusDetailDuxo.this.marginHubStore.streamMarginStatusDetail(accountNumber);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginStatusDetailDuxo.this, null);
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            accountNumber = (String) obj;
            Flow<MarginStatusDetailView> flowStreamMarginStatusDetail2 = MarginStatusDetailDuxo.this.marginHubStore.streamMarginStatusDetail(accountNumber);
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(MarginStatusDetailDuxo.this, null);
            this.label = 2;
        }

        /* compiled from: MarginStatusDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "marginStatusDetailResponse", "Lcom/robinhood/android/lib/margin/hub/db/models/MarginStatusDetailView;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onStart$1$1", m3645f = "MarginStatusDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginStatusDetailView, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MarginStatusDetailDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MarginStatusDetailDuxo marginStatusDetailDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = marginStatusDetailDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginStatusDetailView marginStatusDetailView, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(marginStatusDetailView, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: MarginStatusDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onStart$1$1$1", m3645f = "MarginStatusDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onStart$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C500841 extends ContinuationImpl7 implements Function2<MarginStatusDetailDataState, Continuation<? super MarginStatusDetailDataState>, Object> {
                final /* synthetic */ MarginStatusDetailView $marginStatusDetailResponse;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C500841(MarginStatusDetailView marginStatusDetailView, Continuation<? super C500841> continuation) {
                    super(2, continuation);
                    this.$marginStatusDetailResponse = marginStatusDetailView;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C500841 c500841 = new C500841(this.$marginStatusDetailResponse, continuation);
                    c500841.L$0 = obj;
                    return c500841;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MarginStatusDetailDataState marginStatusDetailDataState, Continuation<? super MarginStatusDetailDataState> continuation) {
                    return ((C500841) create(marginStatusDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((MarginStatusDetailDataState) this.L$0).copy(this.$marginStatusDetailResponse);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C500841((MarginStatusDetailView) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C168301(null), 3, null);
    }

    /* compiled from: MarginStatusDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onResume$1", m3645f = "MarginStatusDetailDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.margin.hub.MarginStatusDetailDuxo$onResume$1 */
    static final class C168301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C168301(Continuation<? super C168301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginStatusDetailDuxo.this.new C168301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C168301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String accountNumber;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                accountNumber = ((MarginStatusDetailFragmentKey) MarginStatusDetailDuxo.INSTANCE.getArgs((HasSavedState) MarginStatusDetailDuxo.this)).getAccountNumber();
                if (accountNumber == null) {
                    AccountProvider accountProvider = MarginStatusDetailDuxo.this.accountProvider;
                    this.label = 1;
                    obj = accountProvider.getIndividualAccountNumberForced(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                MarginStatusDetailDuxo.this.marginHubStore.refreshMarginStatusDetail(accountNumber);
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            accountNumber = (String) obj;
            MarginStatusDetailDuxo.this.marginHubStore.refreshMarginStatusDetail(accountNumber);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MarginStatusDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/margin/hub/MarginStatusDetailDuxo;", "Lcom/robinhood/android/margin/contracts/MarginStatusDetailFragmentKey;", "<init>", "()V", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginStatusDetailDuxo, MarginStatusDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginStatusDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (MarginStatusDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginStatusDetailFragmentKey getArgs(MarginStatusDetailDuxo marginStatusDetailDuxo) {
            return (MarginStatusDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, marginStatusDetailDuxo);
        }
    }
}
