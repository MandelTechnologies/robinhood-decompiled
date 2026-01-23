package com.robinhood.android.rollover401k.steps.interstitial;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverInterstitialResponse;
import com.robinhood.android.rollover401k.steps.interstitial.Rollover401kInterstitialFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.retirement.Retirement401kRolloverStore;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Rollover401kInterstitialDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/interstitial/Rollover401kInterstitialDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/rollover401k/steps/interstitial/Rollover401kInterstitialViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "rolloverStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/Retirement401kRolloverStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class Rollover401kInterstitialDuxo extends BaseDuxo4<Rollover401kInterstitialViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rollover401kInterstitialDuxo(Retirement401kRolloverStore rolloverStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new Rollover401kInterstitialViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(rolloverStore, "rolloverStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        getLifecycleScope().launchWhenStarted(new C277611(rolloverStore, this, null));
    }

    /* compiled from: Rollover401kInterstitialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.interstitial.Rollover401kInterstitialDuxo$1", m3645f = "Rollover401kInterstitialDuxo.kt", m3646l = {25}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.interstitial.Rollover401kInterstitialDuxo$1 */
    static final class C277611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Retirement401kRolloverStore $rolloverStore;
        int label;
        final /* synthetic */ Rollover401kInterstitialDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C277611(Retirement401kRolloverStore retirement401kRolloverStore, Rollover401kInterstitialDuxo rollover401kInterstitialDuxo, Continuation<? super C277611> continuation) {
            super(2, continuation);
            this.$rolloverStore = retirement401kRolloverStore;
            this.this$0 = rollover401kInterstitialDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C277611(this.$rolloverStore, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Retirement401kRolloverStore retirement401kRolloverStore = this.$rolloverStore;
                Companion companion = Rollover401kInterstitialDuxo.INSTANCE;
                String type2 = ((Rollover401kInterstitialFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getType();
                String transactionId = ((Rollover401kInterstitialFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getTransactionId();
                this.label = 1;
                obj = retirement401kRolloverStore.get401kRolloverInterstitial(type2, transactionId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.applyMutation(new AnonymousClass1((ApiRetirement401kRolloverInterstitialResponse) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: Rollover401kInterstitialDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/interstitial/Rollover401kInterstitialViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.interstitial.Rollover401kInterstitialDuxo$1$1", m3645f = "Rollover401kInterstitialDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rollover401k.steps.interstitial.Rollover401kInterstitialDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Rollover401kInterstitialViewState, Continuation<? super Rollover401kInterstitialViewState>, Object> {
            final /* synthetic */ ApiRetirement401kRolloverInterstitialResponse $interstitialResponse;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiRetirement401kRolloverInterstitialResponse apiRetirement401kRolloverInterstitialResponse, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$interstitialResponse = apiRetirement401kRolloverInterstitialResponse;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$interstitialResponse, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Rollover401kInterstitialViewState rollover401kInterstitialViewState, Continuation<? super Rollover401kInterstitialViewState> continuation) {
                return ((AnonymousClass1) create(rollover401kInterstitialViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((Rollover401kInterstitialViewState) this.L$0).copy(this.$interstitialResponse);
            }
        }
    }

    /* compiled from: Rollover401kInterstitialDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/interstitial/Rollover401kInterstitialDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rollover401k/steps/interstitial/Rollover401kInterstitialDuxo;", "Lcom/robinhood/android/rollover401k/steps/interstitial/Rollover401kInterstitialFragment$Args;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<Rollover401kInterstitialDuxo, Rollover401kInterstitialFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Rollover401kInterstitialFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (Rollover401kInterstitialFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Rollover401kInterstitialFragment.Args getArgs(Rollover401kInterstitialDuxo rollover401kInterstitialDuxo) {
            return (Rollover401kInterstitialFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, rollover401kInterstitialDuxo);
        }
    }
}
