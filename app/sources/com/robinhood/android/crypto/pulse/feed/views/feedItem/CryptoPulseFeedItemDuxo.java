package com.robinhood.android.crypto.pulse.feed.views.feedItem;

import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import java.util.UUID;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoPulseFeedItemDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemViewState;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/android/udf/DuxoBundle;)V", "bind", "", "currencyPairId", "Ljava/util/UUID;", "feature-crypto-pulse_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoPulseFeedItemDuxo extends BaseDuxo4<CryptoPulseFeedItemViewState> {
    public static final int $stable = 8;
    private final CurrencyPairV2Store currencyPairStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPulseFeedItemDuxo(CurrencyPairV2Store currencyPairStore, DuxoBundle duxoBundle) {
        super(new CryptoPulseFeedItemViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.currencyPairStore = currencyPairStore;
    }

    /* compiled from: CryptoPulseFeedItemDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemDuxo$bind$1", m3645f = "CryptoPulseFeedItemDuxo.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemDuxo$bind$1 */
    static final class C129441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $currencyPairId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C129441(UUID uuid, Continuation<? super C129441> continuation) {
            super(2, continuation);
            this.$currencyPairId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoPulseFeedItemDuxo.this.new C129441(this.$currencyPairId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C129441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<UiCurrencyPair> flowStreamCurrencyPairFlow = CryptoPulseFeedItemDuxo.this.currencyPairStore.streamCurrencyPairFlow(this.$currencyPairId);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoPulseFeedItemDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamCurrencyPairFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CryptoPulseFeedItemDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemDuxo$bind$1$1", m3645f = "CryptoPulseFeedItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<UiCurrencyPair, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoPulseFeedItemDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoPulseFeedItemDuxo cryptoPulseFeedItemDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoPulseFeedItemDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiCurrencyPair uiCurrencyPair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(uiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoPulseFeedItemDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/pulse/feed/views/feedItem/CryptoPulseFeedItemViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemDuxo$bind$1$1$1", m3645f = "CryptoPulseFeedItemDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.crypto.pulse.feed.views.feedItem.CryptoPulseFeedItemDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C497371 extends ContinuationImpl7 implements Function2<CryptoPulseFeedItemViewState, Continuation<? super CryptoPulseFeedItemViewState>, Object> {
                final /* synthetic */ UiCurrencyPair $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C497371(UiCurrencyPair uiCurrencyPair, Continuation<? super C497371> continuation) {
                    super(2, continuation);
                    this.$it = uiCurrencyPair;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C497371 c497371 = new C497371(this.$it, continuation);
                    c497371.L$0 = obj;
                    return c497371;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CryptoPulseFeedItemViewState cryptoPulseFeedItemViewState, Continuation<? super CryptoPulseFeedItemViewState> continuation) {
                    return ((C497371) create(cryptoPulseFeedItemViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((CryptoPulseFeedItemViewState) this.L$0).copy(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C497371((UiCurrencyPair) this.L$0, null));
                return Unit.INSTANCE;
            }
        }
    }

    public final void bind(UUID currencyPairId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C129441(currencyPairId, null), 3, null);
    }
}
