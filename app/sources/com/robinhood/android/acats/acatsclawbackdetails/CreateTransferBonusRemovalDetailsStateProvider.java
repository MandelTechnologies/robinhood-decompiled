package com.robinhood.android.acats.acatsclawbackdetails;

import bonfire.proto.idl.acats.p027v1.AcatsClawbackDetailsRowDto;
import com.robinhood.android.acats.acatsclawbackdetails.CreateTransferBonusRemovalDetailsViewState;
import com.robinhood.android.udf.StateProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CreateTransferBonusRemovalDetailsStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDataState;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState;", "<init>", "()V", "reduce", "dataState", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class CreateTransferBonusRemovalDetailsStateProvider implements StateProvider<CreateTransferBonusRemovalDetailsDataState, CreateTransferBonusRemovalDetailsViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CreateTransferBonusRemovalDetailsViewState reduce(CreateTransferBonusRemovalDetailsDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getThrowable() != null) {
            return new CreateTransferBonusRemovalDetailsViewState.Failure(dataState.getThrowable());
        }
        if (dataState.getItems().isEmpty()) {
            ArrayList arrayList = new ArrayList(3);
            for (int i = 0; i < 3; i++) {
                arrayList.add(new CreateTransferBonusRemovalDetailsItem("----------------------------------------", "-----------------------------------------------------------------"));
            }
            return new CreateTransferBonusRemovalDetailsViewState.Content(true, "", extensions2.toImmutableList(arrayList));
        }
        String title = dataState.getTitle();
        List<AcatsClawbackDetailsRowDto> items = dataState.getItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
        for (AcatsClawbackDetailsRowDto acatsClawbackDetailsRowDto : items) {
            arrayList2.add(new CreateTransferBonusRemovalDetailsItem(acatsClawbackDetailsRowDto.getTitle(), acatsClawbackDetailsRowDto.getContent()));
        }
        return new CreateTransferBonusRemovalDetailsViewState.Content(false, title, extensions2.toImmutableList(arrayList2));
    }
}
