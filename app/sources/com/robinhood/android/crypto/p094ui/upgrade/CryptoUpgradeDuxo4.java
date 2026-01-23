package com.robinhood.android.crypto.p094ui.upgrade;

import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoUpgradeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$onStart$cryptoAccountObservable$1", m3645f = "CryptoUpgradeDuxo.kt", m3646l = {44}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$onStart$cryptoAccountObservable$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoUpgradeDuxo4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends CryptoAccount>>, Object> {
    int label;
    final /* synthetic */ CryptoUpgradeDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoUpgradeDuxo4(CryptoUpgradeDuxo cryptoUpgradeDuxo, Continuation<? super CryptoUpgradeDuxo4> continuation) {
        super(2, continuation);
        this.this$0 = cryptoUpgradeDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoUpgradeDuxo4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends CryptoAccount>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Optional<CryptoAccount>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<CryptoAccount>> continuation) {
        return ((CryptoUpgradeDuxo4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoAccountStore cryptoAccountStore = this.this$0.cryptoAccountStore;
            this.label = 1;
            obj = cryptoAccountStore.fetchCryptoAccount(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Optional3.asOptional(obj);
    }
}
