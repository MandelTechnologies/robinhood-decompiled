package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.models.p320db.Position;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: EquityTradingSessionChangedStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1$positionQuantity$1", m3645f = "EquityTradingSessionChangedStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore$determineCurrentSessionConfiguration$2$1$positionQuantity$1 */
/* loaded from: classes13.dex */
final class C33837xa1c8d787 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super BigDecimal>, Object> {
    final /* synthetic */ DirectOrder $currentConfiguration;
    final /* synthetic */ UUID $instrumentId;
    final /* synthetic */ EquityTradingSessionChangedStore $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C33837xa1c8d787(EquityTradingSessionChangedStore equityTradingSessionChangedStore, UUID uuid, DirectOrder directOrder, Continuation<? super C33837xa1c8d787> continuation) {
        super(2, continuation);
        this.$this_runCatching = equityTradingSessionChangedStore;
        this.$instrumentId = uuid;
        this.$currentConfiguration = directOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C33837xa1c8d787(this.$this_runCatching, this.$instrumentId, this.$currentConfiguration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BigDecimal> continuation) {
        return ((C33837xa1c8d787) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Position position;
        BigDecimal quantity;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Observable<Optional<Position>> positionForAccountOptional = this.$this_runCatching.positionStore.getPositionForAccountOptional(this.$instrumentId, this.$currentConfiguration.getAccountNumber(), true);
            this.label = 1;
            obj = RxAwait3.awaitFirstOrNull(positionForAccountOptional, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Optional optional = (Optional) obj;
        return (optional == null || (position = (Position) optional.getOrNull()) == null || (quantity = position.getQuantity()) == null) ? BigDecimal.ZERO : quantity;
    }
}
