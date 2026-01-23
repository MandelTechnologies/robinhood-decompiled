package com.robinhood.lib.transfers.nonoriginated;

import bff_money_movement.service.p019v1.DataRowDto;
import bff_money_movement.service.p019v1.GetNonOriginatedTransferInfoResponseDto;
import bff_money_movement.service.p019v1.GetNonOriginatedTransferInfoSectionDto;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoState;
import com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: NonOriginatedAccountInfoStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDataState;", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoViewState;", "<init>", "()V", "reduce", "dataState", "feature-lib-non-originated-transfer-info_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class NonOriginatedAccountInfoStateProvider implements StateProvider<NonOriginatedAccountInfoDataState, NonOriginatedAccountInfoViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public NonOriginatedAccountInfoViewState reduce(NonOriginatedAccountInfoDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        GetNonOriginatedTransferInfoResponseDto nonOriginatedTransferInfoResponseDto = dataState.getNonOriginatedTransferInfoResponseDto();
        if (dataState.getError() != null) {
            return NonOriginatedAccountInfoViewState.Error.INSTANCE;
        }
        if (nonOriginatedTransferInfoResponseDto != null) {
            StandardScreenDataDto screen_data = nonOriginatedTransferInfoResponseDto.getScreen_data();
            if (screen_data == null) {
                throw new IllegalStateException("Required value was null.");
            }
            String title = screen_data.getTitle();
            String subtitle_markdown = screen_data.getSubtitle_markdown();
            String disclosure_markdown = screen_data.getDisclosure_markdown();
            List<GetNonOriginatedTransferInfoSectionDto> sections = nonOriginatedTransferInfoResponseDto.getSections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
            int i = 0;
            for (Object obj : sections) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GetNonOriginatedTransferInfoSectionDto getNonOriginatedTransferInfoSectionDto = (GetNonOriginatedTransferInfoSectionDto) obj;
                List<DataRowDto> data_rows = getNonOriginatedTransferInfoSectionDto.getData_rows();
                boolean zContains = dataState.getExpandedSectionIndexes().contains(Integer.valueOf(i));
                arrayList.add(new NonOriginatedAccountInfoState.Section(data_rows, getNonOriginatedTransferInfoSectionDto.getTitle(), getNonOriginatedTransferInfoSectionDto.getSubtitle_markdown(), getNonOriginatedTransferInfoSectionDto.getCollapsable_count(), zContains));
                i = i2;
            }
            return new NonOriginatedAccountInfoViewState.Loaded(new NonOriginatedAccountInfoState(title, subtitle_markdown, extensions2.toImmutableList(arrayList), disclosure_markdown));
        }
        return NonOriginatedAccountInfoViewState.Loading.INSTANCE;
    }
}
