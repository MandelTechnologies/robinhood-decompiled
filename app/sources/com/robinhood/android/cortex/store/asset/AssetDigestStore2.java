package com.robinhood.android.cortex.store.asset;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestV2RequestDto;
import bonfire.proto.idl.copilot.p032v1.InstrumentDigestV2ResponseDto;
import com.robinhood.android.cortex.models.asset.AssetDigest4;
import com.robinhood.android.cortex.models.asset.AssetType2;
import com.robinhood.android.cortex.store.asset.AssetDigestStore;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestResult;", "key", "Lcom/robinhood/android/cortex/store/asset/AssetDigestStore$AssetDigestKey;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.cortex.store.asset.AssetDigestStore$digestEndpoint$1", m3645f = "AssetDigestStore.kt", m3646l = {53}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.cortex.store.asset.AssetDigestStore$digestEndpoint$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AssetDigestStore2 extends ContinuationImpl7 implements Function2<AssetDigestStore.AssetDigestKey, Continuation<? super AssetDigestStore.AssetDigestResult>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AssetDigestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDigestStore2(AssetDigestStore assetDigestStore, Continuation<? super AssetDigestStore2> continuation) {
        super(2, continuation);
        this.this$0 = assetDigestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetDigestStore2 assetDigestStore2 = new AssetDigestStore2(this.this$0, continuation);
        assetDigestStore2.L$0 = obj;
        return assetDigestStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AssetDigestStore.AssetDigestKey assetDigestKey, Continuation<? super AssetDigestStore.AssetDigestResult> continuation) {
        return ((AssetDigestStore2) create(assetDigestKey, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Exception {
        AssetDigestStore.AssetDigestKey assetDigestKey;
        AssetDigestStore.AssetDigestKey assetDigestKey2;
        Exception exc;
        Integer httpStatusCode;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AssetDigestStore.AssetDigestKey assetDigestKey3 = (AssetDigestStore.AssetDigestKey) this.L$0;
            try {
                CopilotService copilotService = this.this$0.copilotService;
                String accountNumber = assetDigestKey3.getAccountNumber();
                String string2 = assetDigestKey3.getInstrumentId().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                InstrumentDigestV2RequestDto instrumentDigestV2RequestDto = new InstrumentDigestV2RequestDto(accountNumber, string2, false, AssetType2.toDtoModel(assetDigestKey3.getInstrumentType()), 4, null);
                this.L$0 = assetDigestKey3;
                this.L$1 = assetDigestKey3;
                this.label = 1;
                Object objInstrumentDigestV2 = copilotService.InstrumentDigestV2(instrumentDigestV2RequestDto, this);
                if (objInstrumentDigestV2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                assetDigestKey2 = assetDigestKey3;
                obj = objInstrumentDigestV2;
                assetDigestKey = assetDigestKey2;
            } catch (Exception e) {
                e = e;
                assetDigestKey = assetDigestKey3;
                exc = e;
                httpStatusCode = Throwables.getHttpStatusCode(exc);
                if (httpStatusCode == null && httpStatusCode.intValue() == 404) {
                    return new AssetDigestStore.AssetDigestResult.NotFound(assetDigestKey);
                }
                throw exc;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            assetDigestKey2 = (AssetDigestStore.AssetDigestKey) this.L$1;
            assetDigestKey = (AssetDigestStore.AssetDigestKey) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                exc = e;
                httpStatusCode = Throwables.getHttpStatusCode(exc);
                if (httpStatusCode == null) {
                    throw exc;
                }
                throw exc;
            }
        }
        return new AssetDigestStore.AssetDigestResult.Success(assetDigestKey2, AssetDigest4.toUiModel((InstrumentDigestV2ResponseDto) obj));
    }
}
