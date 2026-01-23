package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.portfolio.PositionsSortOptionsDao;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.models.PositionsOrderingUpdateRequest;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$reorderPositions$1", m3645f = "PositionsV2Store.kt", m3646l = {EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$reorderPositions$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ long $delay;
    final /* synthetic */ List<UUID> $instrumentIds;
    final /* synthetic */ PositionInstrumentType $instrumentType;
    final /* synthetic */ PositionsLocation $positionsLocation;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$reorderPositions$1(long j, PositionsV2Store positionsV2Store, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, List<UUID> list, Continuation<? super PositionsV2Store$reorderPositions$1> continuation) {
        super(2, continuation);
        this.$delay = j;
        this.this$0 = positionsV2Store;
        this.$accountNumber = str;
        this.$instrumentType = positionInstrumentType;
        this.$positionsLocation = positionsLocation;
        this.$instrumentIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsV2Store$reorderPositions$1(this.$delay, this.this$0, this.$accountNumber, this.$instrumentType, this.$positionsLocation, this.$instrumentIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsV2Store$reorderPositions$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r3.updateSortOptions(r4, r5, null, null, r10) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PositionsV2Store$reorderPositions$1 positionsV2Store$reorderPositions$1;
        AssetType sortOptionsAssetType;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.$delay;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(j, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            positionsV2Store$reorderPositions$1 = this;
            sortOptionsAssetType = positionsV2Store$reorderPositions$1.this$0.toSortOptionsAssetType(positionsV2Store$reorderPositions$1.$instrumentType);
            if (sortOptionsAssetType != null) {
                PositionsV2Store positionsV2Store = positionsV2Store$reorderPositions$1.this$0;
                String str = positionsV2Store$reorderPositions$1.$accountNumber;
                PositionsSortOptionsDao positionsSortOptionsDao = positionsV2Store.sortOptionsDao;
                positionsV2Store$reorderPositions$1.label = 3;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        PostEndpoint postEndpoint = this.this$0.postPositionsOrderingEndpoint;
        PositionsOrderingUpdateRequest.CustomOrder customOrder = new PositionsOrderingUpdateRequest.CustomOrder(this.$accountNumber, this.$instrumentType, this.$positionsLocation, this.$instrumentIds);
        this.label = 2;
        positionsV2Store$reorderPositions$1 = this;
        if (PostEndpoint.DefaultImpls.post$default(postEndpoint, customOrder, null, positionsV2Store$reorderPositions$1, 2, null) != coroutine_suspended) {
            sortOptionsAssetType = positionsV2Store$reorderPositions$1.this$0.toSortOptionsAssetType(positionsV2Store$reorderPositions$1.$instrumentType);
            if (sortOptionsAssetType != null) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
