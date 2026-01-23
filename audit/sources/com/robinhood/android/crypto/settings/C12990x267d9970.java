package com.robinhood.android.crypto.settings;

import androidx.paging.PagedList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.store.history.HistoryStore;
import com.robinhood.utils.Optional2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;
import p479j$.time.Instant;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "CryptoSettingsDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.settings.CryptoSettingsDuxo$onCreate$1$2$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes2.dex */
public final class C12990x267d9970 extends ContinuationImpl7 implements Function3<FlowCollector<? super PagedList<StatefulHistoryEvent<? extends HistoryEvent>>>, Instant, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoSettingsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12990x267d9970(Continuation continuation, CryptoSettingsDuxo cryptoSettingsDuxo) {
        super(3, continuation);
        this.this$0 = cryptoSettingsDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super PagedList<StatefulHistoryEvent<? extends HistoryEvent>>> flowCollector, Instant instant, Continuation<? super Unit> continuation) {
        C12990x267d9970 c12990x267d9970 = new C12990x267d9970(continuation, this.this$0);
        c12990x267d9970.L$0 = flowCollector;
        c12990x267d9970.L$1 = instant;
        return c12990x267d9970.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Instant instant = (Instant) this.L$1;
            HistoryStore historyStore = this.this$0.historyStore;
            Observable observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
            Observable observableJust2 = Observable.just(SetsKt.setOf(HistoryTransactionType.CRYPTO_TRANSFER));
            Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
            Observable observableJust3 = Observable.just(instant);
            Intrinsics.checkNotNullExpressionValue(observableJust3, "just(...)");
            Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(HistoryStore.stream$default(historyStore, observableJust, observableJust2, observableJust3, null, null, 5, 24, null)), Integer.MAX_VALUE, null, 2, null);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowBuffer$default, this) == coroutine_suspended) {
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
}
