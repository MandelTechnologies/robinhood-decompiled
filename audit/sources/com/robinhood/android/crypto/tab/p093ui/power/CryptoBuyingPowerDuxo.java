package com.robinhood.android.crypto.tab.p093ui.power;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.models.crypto.p314db.CryptoBuyingPower;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Observable;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: CryptoBuyingPowerDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerDataState;", "Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerViewState;", "cryptoBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;", "hasSeenEuBuyingPowerTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "", "markEuBuyingPowerTooltipSeen", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoBuyingPowerDuxo extends BaseDuxo<CryptoBuyingPowerDataState, CryptoBuyingPowerViewState> {
    public static final int $stable = 8;
    private final CryptoBuyingPowerStore cryptoBuyingPowerStore;
    private final BooleanPreference hasSeenEuBuyingPowerTooltipPref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoBuyingPowerDuxo(CryptoBuyingPowerStore cryptoBuyingPowerStore, @HasSeenEuBuyingPowerTooltipPref BooleanPreference hasSeenEuBuyingPowerTooltipPref, CryptoBuyingPowerDuxo4 stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoBuyingPowerDataState(null, hasSeenEuBuyingPowerTooltipPref.get(), 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(cryptoBuyingPowerStore, "cryptoBuyingPowerStore");
        Intrinsics.checkNotNullParameter(hasSeenEuBuyingPowerTooltipPref, "hasSeenEuBuyingPowerTooltipPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoBuyingPowerStore = cryptoBuyingPowerStore;
        this.hasSeenEuBuyingPowerTooltipPref = hasSeenEuBuyingPowerTooltipPref;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        String currencyCode = Currencies.EUR.getCurrencyCode();
        CryptoBuyingPowerStore cryptoBuyingPowerStore = this.cryptoBuyingPowerStore;
        Intrinsics.checkNotNull(currencyCode);
        cryptoBuyingPowerStore.refresh(true, currencyCode);
        Observable observableDistinctUntilChanged = asObservable(this.cryptoBuyingPowerStore.streamBuyingPowerForCrypto(currencyCode)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoBuyingPowerDuxo.onResume$lambda$0(this.f$0, (CryptoBuyingPower) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C131992(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo, CryptoBuyingPower cryptoBuyingPower) {
        cryptoBuyingPowerDuxo.applyMutation(new CryptoBuyingPowerDuxo3(cryptoBuyingPower, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoBuyingPowerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$2", m3645f = "CryptoBuyingPowerDuxo.kt", m3646l = {89}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$2 */
    static final class C131992 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C131992(Continuation<? super C131992> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoBuyingPowerDuxo.this.new C131992(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C131992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(CryptoBuyingPowerDuxo.this.hasSeenEuBuyingPowerTooltipPref.getChanges()), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoBuyingPowerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoBuyingPowerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$2$1", m3645f = "CryptoBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CryptoBuyingPowerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoBuyingPowerDuxo cryptoBuyingPowerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoBuyingPowerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoBuyingPowerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/power/CryptoBuyingPowerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$2$1$1", m3645f = "CryptoBuyingPowerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.tab.ui.power.CryptoBuyingPowerDuxo$onResume$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497581 extends ContinuationImpl7 implements Function2<CryptoBuyingPowerDataState, Continuation<? super CryptoBuyingPowerDataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497581(boolean z, Continuation<? super C497581> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497581 c497581 = new C497581(this.$it, continuation);
                    c497581.L$0 = obj;
                    return c497581;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoBuyingPowerDataState cryptoBuyingPowerDataState, Continuation<? super CryptoBuyingPowerDataState> continuation) {
                    return ((C497581) create(cryptoBuyingPowerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return CryptoBuyingPowerDataState.copy$default((CryptoBuyingPowerDataState) this.L$0, null, this.$it, 1, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C497581(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void markEuBuyingPowerTooltipSeen() {
        this.hasSeenEuBuyingPowerTooltipPref.set(true);
    }
}
