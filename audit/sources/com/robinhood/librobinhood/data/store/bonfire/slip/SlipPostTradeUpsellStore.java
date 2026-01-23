package com.robinhood.librobinhood.data.store.bonfire.slip;

import com.robinhood.android.margin.contracts.SlipUpsellKey;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.retrofit.SlipApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.prefs.LastTimePromptedForSlipUpsell;
import com.robinhood.librobinhood.data.store.prefs.SlipUpsellPromptCount;
import com.robinhood.models.api.ApiSlipUpsellResponse;
import com.robinhood.models.api.ApiSlipUpsellResponse2;
import com.robinhood.prefs.LongPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Maybe;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SlipPostTradeUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR&\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\u00150\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/slip/SlipPostTradeUpsellStore;", "Lcom/robinhood/store/Store;", "slipApi", "Lcom/robinhood/api/retrofit/SlipApi;", "lastTimePromptedForSlipUpsell", "Lcom/robinhood/prefs/LongPreference;", "slipUpsellPromptCount", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/SlipApi;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/prefs/LongPreference;Lcom/robinhood/store/StoreBundle;)V", "getLastTimePromptedForSlipUpsell", "()Lcom/robinhood/prefs/LongPreference;", "setLastTimePromptedForSlipUpsell", "(Lcom/robinhood/prefs/LongPreference;)V", "getSlipUpsellPromptCount", "setSlipUpsellPromptCount", "slipUpsellEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/api/ApiSlipUpsellResponse;", "getSlipUpsell", "Lio/reactivex/Maybe;", "Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "accountNumber", "orderId", "Companion", "lib-store-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SlipPostTradeUpsellStore extends Store {
    public static final long MAX_PROMPT_COUNT = 2;
    public static final long MIN_PROMPT_GAP_MILLIS = 604800000;
    public static final long MIN_PROMPT_RESET_MILLIS = 2592000000L;
    private LongPreference lastTimePromptedForSlipUpsell;
    private final Endpoint<Tuples2<String, String>, ApiSlipUpsellResponse> slipUpsellEndpoint;
    private LongPreference slipUpsellPromptCount;

    public final LongPreference getLastTimePromptedForSlipUpsell() {
        return this.lastTimePromptedForSlipUpsell;
    }

    public final void setLastTimePromptedForSlipUpsell(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.lastTimePromptedForSlipUpsell = longPreference;
    }

    public final LongPreference getSlipUpsellPromptCount() {
        return this.slipUpsellPromptCount;
    }

    public final void setSlipUpsellPromptCount(LongPreference longPreference) {
        Intrinsics.checkNotNullParameter(longPreference, "<set-?>");
        this.slipUpsellPromptCount = longPreference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipPostTradeUpsellStore(SlipApi slipApi, @LastTimePromptedForSlipUpsell LongPreference lastTimePromptedForSlipUpsell, @SlipUpsellPromptCount LongPreference slipUpsellPromptCount, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(slipApi, "slipApi");
        Intrinsics.checkNotNullParameter(lastTimePromptedForSlipUpsell, "lastTimePromptedForSlipUpsell");
        Intrinsics.checkNotNullParameter(slipUpsellPromptCount, "slipUpsellPromptCount");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.lastTimePromptedForSlipUpsell = lastTimePromptedForSlipUpsell;
        this.slipUpsellPromptCount = slipUpsellPromptCount;
        this.slipUpsellEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new SlipPostTradeUpsellStore2(slipApi, null), getLogoutKillswitch(), new SlipPostTradeUpsellStore3(null), storeBundle.getClock(), null, 16, null);
    }

    /* compiled from: SlipPostTradeUpsellStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore$getSlipUpsell$1", m3645f = "SlipPostTradeUpsellStore.kt", m3646l = {54, 61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore$getSlipUpsell$1 */
    static final class C347771 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SlipUpsellKey>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ String $orderId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C347771(String str, String str2, Continuation<? super C347771> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
            this.$orderId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SlipPostTradeUpsellStore.this.new C347771(this.$accountNumber, this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SlipUpsellKey> continuation) {
            return ((C347771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        
            if (r15 == r0) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
        
            if (r15 == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C347771 c347771;
            C347771 c3477712;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    c3477712 = this;
                    return ApiSlipUpsellResponse2.toKey((ApiSlipUpsellResponse) obj, c3477712.$accountNumber);
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c347771 = this;
                return ApiSlipUpsellResponse2.toKey((ApiSlipUpsellResponse) obj, c347771.$accountNumber);
            }
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long orNull = SlipPostTradeUpsellStore.this.getSlipUpsellPromptCount().getOrNull();
            long jLongValue = orNull != null ? orNull.longValue() : 0L;
            Long orNull2 = SlipPostTradeUpsellStore.this.getLastTimePromptedForSlipUpsell().getOrNull();
            long jLongValue2 = orNull2 != null ? orNull2.longValue() : 0L;
            if (jLongValue <= 2 && jLongValue2 < jCurrentTimeMillis - SlipPostTradeUpsellStore.MIN_PROMPT_GAP_MILLIS) {
                Endpoint endpoint = SlipPostTradeUpsellStore.this.slipUpsellEndpoint;
                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountNumber, this.$orderId);
                this.label = 1;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint, tuples2M3642to, null, this, 2, null);
                c3477712 = this;
            } else {
                if (jLongValue <= 2 || jLongValue2 > jCurrentTimeMillis - 2592000000L) {
                    return null;
                }
                SlipPostTradeUpsellStore.this.getSlipUpsellPromptCount().set(0L);
                Endpoint endpoint2 = SlipPostTradeUpsellStore.this.slipUpsellEndpoint;
                Tuples2 tuples2M3642to2 = Tuples4.m3642to(this.$accountNumber, this.$orderId);
                this.label = 2;
                obj = Endpoint.DefaultImpls.forceFetch$default(endpoint2, tuples2M3642to2, null, this, 2, null);
                c347771 = this;
            }
            return coroutine_suspended;
        }
    }

    public final Maybe<SlipUpsellKey> getSlipUpsell(String accountNumber, String orderId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return RxFactory.DefaultImpls.rxMaybe$default(this, null, new C347771(accountNumber, orderId, null), 1, null);
    }
}
