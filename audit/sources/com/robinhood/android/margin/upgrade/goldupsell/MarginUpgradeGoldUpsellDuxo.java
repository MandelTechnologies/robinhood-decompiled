package com.robinhood.android.margin.upgrade.goldupsell;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.margin.GoldUpsellStore;
import com.robinhood.android.lib.margin.api.ApiGoldUpsell;
import com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragment;
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

/* compiled from: MarginUpgradeGoldUpsellDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0011B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDataState;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "goldUpsellStore", "Lcom/robinhood/android/lib/margin/GoldUpsellStore;", "stateProvider", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/lib/margin/GoldUpsellStore;Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginUpgradeGoldUpsellDuxo extends BaseDuxo<MarginUpgradeGoldUpsellDataState, MarginUpgradeGoldUpsellState3> implements HasSavedState {
    private final GoldUpsellStore goldUpsellStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginUpgradeGoldUpsellDuxo(GoldUpsellStore goldUpsellStore, MarginUpgradeGoldUpsellState2 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new MarginUpgradeGoldUpsellDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(goldUpsellStore, "goldUpsellStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldUpsellStore = goldUpsellStore;
        this.savedStateHandle = savedStateHandle;
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C211671(null), 3, null);
    }

    /* compiled from: MarginUpgradeGoldUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellDuxo$1", m3645f = "MarginUpgradeGoldUpsellDuxo.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellDuxo$1 */
    static final class C211671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C211671(Continuation<? super C211671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeGoldUpsellDuxo.this.new C211671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C211671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldUpsellStore goldUpsellStore = MarginUpgradeGoldUpsellDuxo.this.goldUpsellStore;
                    String accountNumber = ((MarginUpgradeGoldUpsellFragment.Args) MarginUpgradeGoldUpsellDuxo.INSTANCE.getArgs((HasSavedState) MarginUpgradeGoldUpsellDuxo.this)).getAccountNumber();
                    this.label = 1;
                    obj = goldUpsellStore.getGoldUpsell(accountNumber, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MarginUpgradeGoldUpsellDuxo.this.applyMutation(new AnonymousClass1((ApiGoldUpsell) obj, null));
            } catch (Exception e) {
                MarginUpgradeGoldUpsellDuxo.this.applyMutation(new AnonymousClass2(e, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: MarginUpgradeGoldUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellDuxo$1$1", m3645f = "MarginUpgradeGoldUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<MarginUpgradeGoldUpsellDataState, Continuation<? super MarginUpgradeGoldUpsellDataState>, Object> {
            final /* synthetic */ ApiGoldUpsell $goldUpsell;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiGoldUpsell apiGoldUpsell, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$goldUpsell = apiGoldUpsell;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$goldUpsell, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeGoldUpsellDataState marginUpgradeGoldUpsellDataState, Continuation<? super MarginUpgradeGoldUpsellDataState> continuation) {
                return ((AnonymousClass1) create(marginUpgradeGoldUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeGoldUpsellDataState.copy$default((MarginUpgradeGoldUpsellDataState) this.L$0, this.$goldUpsell.getUpsell(), null, 2, null);
            }
        }

        /* compiled from: MarginUpgradeGoldUpsellDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellDuxo$1$2", m3645f = "MarginUpgradeGoldUpsellDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellDuxo$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<MarginUpgradeGoldUpsellDataState, Continuation<? super MarginUpgradeGoldUpsellDataState>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f4538$e;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.f4538$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f4538$e, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MarginUpgradeGoldUpsellDataState marginUpgradeGoldUpsellDataState, Continuation<? super MarginUpgradeGoldUpsellDataState> continuation) {
                return ((AnonymousClass2) create(marginUpgradeGoldUpsellDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return MarginUpgradeGoldUpsellDataState.copy$default((MarginUpgradeGoldUpsellDataState) this.L$0, null, this.f4538$e, 1, null);
            }
        }
    }

    /* compiled from: MarginUpgradeGoldUpsellDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellDuxo;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MarginUpgradeGoldUpsellDuxo, MarginUpgradeGoldUpsellFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeGoldUpsellFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MarginUpgradeGoldUpsellFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MarginUpgradeGoldUpsellFragment.Args getArgs(MarginUpgradeGoldUpsellDuxo marginUpgradeGoldUpsellDuxo) {
            return (MarginUpgradeGoldUpsellFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, marginUpgradeGoldUpsellDuxo);
        }
    }
}
