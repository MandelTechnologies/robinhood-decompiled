package com.robinhood.android.crypto.p094ui.upgrade;

import com.robinhood.librobinhood.data.store.CryptoUpgradeStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCryptoActivation;
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
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoActivation;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$onStart$activationsObservable$1", m3645f = "CryptoUpgradeDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.ui.upgrade.CryptoUpgradeDuxo$onStart$activationsObservable$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoUpgradeDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiCryptoActivation>>, Object> {
    int label;
    final /* synthetic */ CryptoUpgradeDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoUpgradeDuxo2(CryptoUpgradeDuxo cryptoUpgradeDuxo, Continuation<? super CryptoUpgradeDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoUpgradeDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoUpgradeDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiCryptoActivation>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiCryptoActivation>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiCryptoActivation>> continuation) {
        return ((CryptoUpgradeDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CryptoUpgradeStore cryptoUpgradeStore = this.this$0.cryptoUpgradeStore;
        this.label = 1;
        Object objFetchActivations = cryptoUpgradeStore.fetchActivations(this);
        return objFetchActivations == coroutine_suspended ? coroutine_suspended : objFetchActivations;
    }
}
