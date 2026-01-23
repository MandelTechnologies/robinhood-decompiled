package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TransferRequestCreator.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.i18n.mcw.TransferRequestCreator", m3645f = "TransferRequestCreator.kt", m3646l = {31, 32}, m3647m = "createTransfer-gIAlu-s$feature_transfers_externalRelease")
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.mcw.TransferRequestCreator$createTransfer$1, reason: use source file name */
/* loaded from: classes9.dex */
final class TransferRequestCreator2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TransferRequestCreator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferRequestCreator2(TransferRequestCreator transferRequestCreator, Continuation<? super TransferRequestCreator2> continuation) {
        super(continuation);
        this.this$0 = transferRequestCreator;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM19870createTransfergIAlus$feature_transfers_externalRelease = this.this$0.m19870createTransfergIAlus$feature_transfers_externalRelease(null, this);
        return objM19870createTransfergIAlus$feature_transfers_externalRelease == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19870createTransfergIAlus$feature_transfers_externalRelease : Result.m28549boximpl(objM19870createTransfergIAlus$feature_transfers_externalRelease);
    }
}
