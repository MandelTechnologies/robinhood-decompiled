package com.robinhood.android.crypto.tab.p093ui;

import com.robinhood.android.crypto.tab.p093ui.discover.CryptoHomeDiscoverState;
import com.robinhood.models.crypto.p314db.home.CryptoHomeDiscover;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.CryptoHomeDuxo$onStart$10$1", m3645f = "CryptoHomeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CryptoHomeDuxo$onStart$10$1 extends ContinuationImpl7 implements Function2<CryptoHomeDataState, Continuation<? super CryptoHomeDataState>, Object> {
    final /* synthetic */ CryptoHomeDiscover $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHomeDuxo$onStart$10$1(CryptoHomeDiscover cryptoHomeDiscover, Continuation<? super CryptoHomeDuxo$onStart$10$1> continuation) {
        super(2, continuation);
        this.$it = cryptoHomeDiscover;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHomeDuxo$onStart$10$1 cryptoHomeDuxo$onStart$10$1 = new CryptoHomeDuxo$onStart$10$1(this.$it, continuation);
        cryptoHomeDuxo$onStart$10$1.L$0 = obj;
        return cryptoHomeDuxo$onStart$10$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CryptoHomeDataState cryptoHomeDataState, Continuation<? super CryptoHomeDataState> continuation) {
        return ((CryptoHomeDuxo$onStart$10$1) create(cryptoHomeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [kotlinx.collections.immutable.ImmutableMap] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ImmutableMap<Boolean, CryptoHomeDiscover> data;
        Map mapPlus;
        ?? immutableMap;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CryptoHomeDataState cryptoHomeDataState = (CryptoHomeDataState) this.L$0;
        ImmutableMap3 immutableMap3PersistentMapOf = extensions2.persistentMapOf(Tuples4.m3642to(boxing.boxBoolean(this.$it.getTradeable()), this.$it));
        CryptoHomeDiscoverState discoverState$feature_crypto_tab_externalDebug = cryptoHomeDataState.getDiscoverState$feature_crypto_tab_externalDebug();
        if (discoverState$feature_crypto_tab_externalDebug != null && (data = discoverState$feature_crypto_tab_externalDebug.getData()) != null && (mapPlus = MapsKt.plus(data, immutableMap3PersistentMapOf)) != null && (immutableMap = extensions2.toImmutableMap(mapPlus)) != 0) {
            immutableMap3PersistentMapOf = immutableMap;
        }
        return CryptoHomeDataState.copy$default(cryptoHomeDataState, null, null, null, new CryptoHomeDiscoverState(immutableMap3PersistentMapOf, this.$it.getTradeable()), null, null, null, false, null, false, null, false, false, 8183, null);
    }
}
