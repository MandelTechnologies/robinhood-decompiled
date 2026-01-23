package com.robinhood.librobinhood.data.store.fee;

import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.models.api.fee.MonetizationModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoFeeTierPreferencesProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferencesProvider;", "", "accountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "feeTierStore", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierStore;)V", "streamCryptoFeeTierPreferences", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferences;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class CryptoFeeTierPreferencesProvider {
    private final CryptoAccountPreferencesStore accountPreferencesStore;
    private final CryptoFeeTierStore feeTierStore;

    /* compiled from: CryptoFeeTierPreferencesProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonetizationModel.values().length];
            try {
                iArr[MonetizationModel.FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonetizationModel.REBATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CryptoFeeTierPreferencesProvider(CryptoAccountPreferencesStore accountPreferencesStore, CryptoFeeTierStore feeTierStore) {
        Intrinsics.checkNotNullParameter(accountPreferencesStore, "accountPreferencesStore");
        Intrinsics.checkNotNullParameter(feeTierStore, "feeTierStore");
        this.accountPreferencesStore = accountPreferencesStore;
        this.feeTierStore = feeTierStore;
    }

    /* compiled from: CryptoFeeTierPreferencesProvider.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider$streamCryptoFeeTierPreferences$1", m3645f = "CryptoFeeTierPreferencesProvider.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider$streamCryptoFeeTierPreferences$1 */
    static final class C348101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C348101(Continuation<? super C348101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoFeeTierPreferencesProvider.this.new C348101(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C348101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CryptoAccountPreferencesStore cryptoAccountPreferencesStore = CryptoFeeTierPreferencesProvider.this.accountPreferencesStore;
                this.label = 1;
                if (cryptoAccountPreferencesStore.m22601refreshAccountPreferencesIoAF18A(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    public final Flow<CryptoFeeTierPreferencesProvider2> streamCryptoFeeTierPreferences(CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C348101(null), 3, null);
        return FlowKt.transformLatest(this.accountPreferencesStore.streamAccountPreferences(), new C34808xa413506b(null, this));
    }
}
