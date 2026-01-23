package com.robinhood.android.gold.hub.boost;

import com.robinhood.android.gold.lib.hub.api.ApiGoldSweepHub;
import com.robinhood.android.gold.lib.hub.store.GoldHubStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldDepositBoostSweepHubDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostSweepHubDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostSweepHubViewState;", "goldHubStore", "Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/lib/hub/store/GoldHubStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "switchTab", "newTabIndex", "", "newTab", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostTab;", "feature-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDepositBoostSweepHubDuxo extends BaseDuxo4<GoldDepositBoostSweepHubViewState> {
    public static final int $stable = 8;
    private final GoldHubStore goldHubStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoldDepositBoostSweepHubDuxo(GoldHubStore goldHubStore, DuxoBundle duxoBundle) {
        super(new GoldDepositBoostSweepHubViewState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(goldHubStore, "goldHubStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldHubStore = goldHubStore;
    }

    /* compiled from: GoldDepositBoostSweepHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubDuxo$onStart$1", m3645f = "GoldDepositBoostSweepHubDuxo.kt", m3646l = {23}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubDuxo$onStart$1 */
    static final class C178041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C178041(Continuation<? super C178041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldDepositBoostSweepHubDuxo.this.new C178041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C178041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldHubStore goldHubStore = GoldDepositBoostSweepHubDuxo.this.goldHubStore;
                    this.label = 1;
                    obj = goldHubStore.fetchGoldSweepHub(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GoldDepositBoostSweepHubDuxo.this.applyMutation(new AnonymousClass1((ApiGoldSweepHub) obj, null));
            } catch (Throwable unused) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GoldDepositBoostSweepHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostSweepHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubDuxo$onStart$1$1", m3645f = "GoldDepositBoostSweepHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldDepositBoostSweepHubViewState, Continuation<? super GoldDepositBoostSweepHubViewState>, Object> {
            final /* synthetic */ ApiGoldSweepHub $goldSweepHub;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiGoldSweepHub apiGoldSweepHub, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$goldSweepHub = apiGoldSweepHub;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$goldSweepHub, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldDepositBoostSweepHubViewState goldDepositBoostSweepHubViewState, Continuation<? super GoldDepositBoostSweepHubViewState> continuation) {
                return ((AnonymousClass1) create(goldDepositBoostSweepHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return GoldDepositBoostSweepHubViewState.copy$default((GoldDepositBoostSweepHubViewState) this.L$0, this.$goldSweepHub, null, 2, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C178041(null), 3, null);
    }

    public final void switchTab(int newTabIndex) {
        switchTab(GoldDepositBoostTab.INSTANCE.fromInt(newTabIndex));
    }

    /* compiled from: GoldDepositBoostSweepHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/hub/boost/GoldDepositBoostSweepHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubDuxo$switchTab$1", m3645f = "GoldDepositBoostSweepHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.hub.boost.GoldDepositBoostSweepHubDuxo$switchTab$1 */
    static final class C178051 extends ContinuationImpl7 implements Function2<GoldDepositBoostSweepHubViewState, Continuation<? super GoldDepositBoostSweepHubViewState>, Object> {
        final /* synthetic */ GoldDepositBoostTab $newTab;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C178051(GoldDepositBoostTab goldDepositBoostTab, Continuation<? super C178051> continuation) {
            super(2, continuation);
            this.$newTab = goldDepositBoostTab;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C178051 c178051 = new C178051(this.$newTab, continuation);
            c178051.L$0 = obj;
            return c178051;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GoldDepositBoostSweepHubViewState goldDepositBoostSweepHubViewState, Continuation<? super GoldDepositBoostSweepHubViewState> continuation) {
            return ((C178051) create(goldDepositBoostSweepHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return GoldDepositBoostSweepHubViewState.copy$default((GoldDepositBoostSweepHubViewState) this.L$0, null, this.$newTab, 1, null);
        }
    }

    public final void switchTab(GoldDepositBoostTab newTab) {
        Intrinsics.checkNotNullParameter(newTab, "newTab");
        applyMutation(new C178051(newTab, null));
    }
}
