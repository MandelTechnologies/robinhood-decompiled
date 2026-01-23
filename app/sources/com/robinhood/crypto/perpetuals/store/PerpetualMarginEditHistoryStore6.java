package com.robinhood.crypto.perpetuals.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.regiongate.PerpetualsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMarginEdit;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMarginEdit2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import crypto_perpetuals.position.p439v1.MarginEditDto;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.ListMarginEditsRequestDto;
import crypto_perpetuals.service.p440v1.ListMarginEditsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PerpetualMarginEditHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualMarginEdit;", "<destruct>", "Lkotlin/Pair;", "Lcrypto_perpetuals/service/v1/ListMarginEditsRequestDto;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$paginatedMarginEditEndpoint$1", m3645f = "PerpetualMarginEditHistoryStore.kt", m3646l = {62, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsMarginEditHistoryStore$paginatedMarginEditEndpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualMarginEditHistoryStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends ListMarginEditsRequestDto, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends PerpetualMarginEdit>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PerpetualMarginEditHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualMarginEditHistoryStore6(PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, Continuation<? super PerpetualMarginEditHistoryStore6> continuation) {
        super(2, continuation);
        this.this$0 = perpetualMarginEditHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualMarginEditHistoryStore6 perpetualMarginEditHistoryStore6 = new PerpetualMarginEditHistoryStore6(this.this$0, continuation);
        perpetualMarginEditHistoryStore6.L$0 = obj;
        return perpetualMarginEditHistoryStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ListMarginEditsRequestDto, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends PerpetualMarginEdit>> continuation) {
        return invoke2((Tuples2<ListMarginEditsRequestDto, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<PerpetualMarginEdit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ListMarginEditsRequestDto, PaginationCursor> tuples2, Continuation<? super PaginatedResult<PerpetualMarginEdit>> continuation) {
        return ((PerpetualMarginEditHistoryStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[LOOP:0: B:30:0x00b3->B:32:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ListMarginEditsRequestDto listMarginEditsRequestDto;
        PaginationCursor paginationCursor;
        PaginationCursor paginationCursor2;
        String value;
        ListMarginEditsRequestDto listMarginEditsRequestDtoCopy$default;
        Iterator<T> it;
        String next_token;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        PaginationCursor paginationCursor3 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            ListMarginEditsRequestDto listMarginEditsRequestDto2 = (ListMarginEditsRequestDto) tuples2.component1();
            PaginationCursor paginationCursor4 = (PaginationCursor) tuples2.component2();
            Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, PerpetualsRegionGate.INSTANCE, false, 2, null);
            this.L$0 = listMarginEditsRequestDto2;
            this.L$1 = paginationCursor4;
            this.label = 1;
            Object objFirst = FlowKt.first(flowStreamRegionGateStateFlow$default, this);
            if (objFirst != coroutine_suspended) {
                listMarginEditsRequestDto = listMarginEditsRequestDto2;
                paginationCursor = paginationCursor4;
                obj = objFirst;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paginationCursor2 = (PaginationCursor) this.L$0;
            ResultKt.throwOnFailure(obj);
            ListMarginEditsResponseDto listMarginEditsResponseDto = (ListMarginEditsResponseDto) obj;
            List<MarginEditDto> margin_edits = listMarginEditsResponseDto.getMargin_edits();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(margin_edits, 10));
            it = margin_edits.iterator();
            while (it.hasNext()) {
                arrayList.add(PerpetualMarginEdit2.toDbModel((MarginEditDto) it.next()));
            }
            next_token = listMarginEditsResponseDto.getNext_token();
            if (next_token != null) {
                if (arrayList.isEmpty()) {
                    next_token = null;
                }
                if (next_token != null) {
                    paginationCursor3 = new PaginationCursor(next_token);
                }
            }
            return new PaginatedResult(arrayList, paginationCursor2, paginationCursor3);
        }
        paginationCursor = (PaginationCursor) this.L$1;
        ListMarginEditsRequestDto listMarginEditsRequestDto3 = (ListMarginEditsRequestDto) this.L$0;
        ResultKt.throwOnFailure(obj);
        listMarginEditsRequestDto = listMarginEditsRequestDto3;
        if (((Boolean) obj).booleanValue()) {
            if (paginationCursor != null && (value = paginationCursor.getValue()) != null && (listMarginEditsRequestDtoCopy$default = ListMarginEditsRequestDto.copy$default(listMarginEditsRequestDto, null, null, null, value, 7, null)) != null) {
                listMarginEditsRequestDto = listMarginEditsRequestDtoCopy$default;
            }
            CryptoPerpetualsService cryptoPerpetualsService = this.this$0.service;
            this.L$0 = paginationCursor;
            this.L$1 = null;
            this.label = 2;
            obj = cryptoPerpetualsService.ListMarginEdits(listMarginEditsRequestDto, this);
            if (obj != coroutine_suspended) {
                paginationCursor2 = paginationCursor;
                ListMarginEditsResponseDto listMarginEditsResponseDto2 = (ListMarginEditsResponseDto) obj;
                List<MarginEditDto> margin_edits2 = listMarginEditsResponseDto2.getMargin_edits();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(margin_edits2, 10));
                it = margin_edits2.iterator();
                while (it.hasNext()) {
                }
                next_token = listMarginEditsResponseDto2.getNext_token();
                if (next_token != null) {
                }
                return new PaginatedResult(arrayList2, paginationCursor2, paginationCursor3);
            }
            return coroutine_suspended;
        }
        return new PaginatedResult(CollectionsKt.emptyList(), null, null, 6, null);
    }
}
