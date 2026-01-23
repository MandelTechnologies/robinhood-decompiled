package com.robinhood.android.optionschain.sbschain.table;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainTable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.sbschain.table.OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1", m3645f = "OptionSideBySideChainTable.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OptionSideBySideChainTableDuxo $duxo;
    final /* synthetic */ OptionChainExpirationDateState $expirationDateState;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $sharedScrollValue;
    final /* synthetic */ ImmutableList<UiOptionStrategyLegDisplay> $targetLegs;
    final /* synthetic */ BigDecimal $targetStrikePrice;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1(LazyListState lazyListState, Animatable<Float, AnimationVectors2> animatable, OptionSideBySideChainTableDuxo optionSideBySideChainTableDuxo, OptionChainExpirationDateState optionChainExpirationDateState, ImmutableList<? extends UiOptionStrategyLegDisplay> immutableList, BigDecimal bigDecimal, Continuation<? super OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$sharedScrollValue = animatable;
        this.$duxo = optionSideBySideChainTableDuxo;
        this.$expirationDateState = optionChainExpirationDateState;
        this.$targetLegs = immutableList;
        this.$targetStrikePrice = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1(this.$lazyListState, this.$sharedScrollValue, this.$duxo, this.$expirationDateState, this.$targetLegs, this.$targetStrikePrice, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionSideBySideChainTableKt$OptionSideBySideChainTable$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ScrollPosition scrollPosition;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ScrollPosition scrollPosition2 = new ScrollPosition(this.$lazyListState.getFirstVisibleItemIndex(), this.$lazyListState.getFirstVisibleItemScrollOffset(), this.$sharedScrollValue.getValue().floatValue());
            Animatable<Float, AnimationVectors2> animatable = this.$sharedScrollValue;
            Float fBoxFloat = boxing.boxFloat(0.0f);
            this.L$0 = scrollPosition2;
            this.label = 1;
            if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            scrollPosition = scrollPosition2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scrollPosition = (ScrollPosition) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.$duxo.bind(this.$expirationDateState, this.$targetLegs, this.$targetStrikePrice, scrollPosition);
        return Unit.INSTANCE;
    }
}
