package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.CryptoTaxLotSelectionService;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamTaxLotViewModelsResponseDto;
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.UpdateTaxLotsSortRequestDto;

/* compiled from: CryptoTaxLotSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onHeaderClicked$1$1", m3645f = "CryptoTaxLotSelectionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionDuxo$onHeaderClicked$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoTaxLotSelectionDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StreamTaxLotViewModelsResponseDto.HeaderDto.SortableDto $sortableDto;
    int label;
    final /* synthetic */ CryptoTaxLotSelectionDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTaxLotSelectionDuxo2(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, StreamTaxLotViewModelsResponseDto.HeaderDto.SortableDto sortableDto, Continuation<? super CryptoTaxLotSelectionDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTaxLotSelectionDuxo;
        this.$sortableDto = sortableDto;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoTaxLotSelectionDuxo2(this.this$0, this.$sortableDto, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoTaxLotSelectionDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoTaxLotSelectionService cryptoTaxLotSelectionService = this.this$0.taxLotSelectionService;
            UpdateTaxLotsSortRequestDto updateTaxLotsSortRequestDto = new UpdateTaxLotsSortRequestDto(this.$sortableDto.getSort_type(), this.$sortableDto.getNext_sort_direction());
            this.label = 1;
            if (cryptoTaxLotSelectionService.UpdateTaxLotsSort(updateTaxLotsSortRequestDto, this) == coroutine_suspended) {
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
