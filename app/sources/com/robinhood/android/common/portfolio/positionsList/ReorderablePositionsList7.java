package com.robinhood.android.common.portfolio.positionsList;

import com.robinhood.models.serverdriven.experimental.api.AssetHomeAssetType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReorderablePositionsList.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsListKt$streamAndRememberPositionsListState$8$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class ReorderablePositionsList7 extends FunctionReferenceImpl implements Function1<AssetHomeAssetType, Unit> {
    ReorderablePositionsList7(Object obj) {
        super(1, obj, PositionsListDuxo.class, "onAssetHomeOpened", "onAssetHomeOpened(Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AssetHomeAssetType assetHomeAssetType) {
        invoke2(assetHomeAssetType);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AssetHomeAssetType p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PositionsListDuxo) this.receiver).onAssetHomeOpened(p0);
    }
}
