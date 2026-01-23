package com.robinhood.android.transfers.i18n;

import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransfersHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class InternationalTransfersHubFragment$onViewCreated$2$1$1$2$1$1 extends FunctionReferenceImpl implements Function1<TransferDirectionV2, Unit> {
    InternationalTransfersHubFragment$onViewCreated$2$1$1$2$1$1(Object obj) {
        super(1, obj, InternationalTransfersHubDuxo.class, "onTransferActionClick", "onTransferActionClick(Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TransferDirectionV2 transferDirectionV2) {
        invoke2(transferDirectionV2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TransferDirectionV2 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InternationalTransfersHubDuxo) this.receiver).onTransferActionClick(p0);
    }
}
