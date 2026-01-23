package com.robinhood.android.advisory.withdrawal;

import advisory.proto.p008v1.GetFullWithdrawalSummaryResponseDto;
import advisory.proto.p008v1.WithdrawalSummaryBottomSheetDto;
import advisory.proto.p008v1.WithdrawalSummaryItemDto;
import com.robinhood.android.advisory.withdrawal.FullWithdrawalSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FullWithdrawalSummary.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toUiModel", "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary$Item;", "Ladvisory/proto/v1/WithdrawalSummaryItemDto;", "Lcom/robinhood/android/advisory/withdrawal/FullWithdrawalSummary;", "Ladvisory/proto/v1/GetFullWithdrawalSummaryResponseDto;", "feature-advisory-full-withdrawal_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.withdrawal.FullWithdrawalSummaryKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class FullWithdrawalSummary2 {
    public static final FullWithdrawalSummary.Item toUiModel(WithdrawalSummaryItemDto withdrawalSummaryItemDto) {
        Intrinsics.checkNotNullParameter(withdrawalSummaryItemDto, "<this>");
        String title = withdrawalSummaryItemDto.getTitle();
        String value = withdrawalSummaryItemDto.getValue();
        WithdrawalSummaryBottomSheetDto bottom_sheet = withdrawalSummaryItemDto.getBottom_sheet();
        return new FullWithdrawalSummary.Item(title, value, bottom_sheet != null ? new FullWithdrawalSummary.BottomSheetData(bottom_sheet.getTitle(), bottom_sheet.getContent()) : null);
    }

    public static final FullWithdrawalSummary toUiModel(GetFullWithdrawalSummaryResponseDto getFullWithdrawalSummaryResponseDto) {
        Intrinsics.checkNotNullParameter(getFullWithdrawalSummaryResponseDto, "<this>");
        String title = getFullWithdrawalSummaryResponseDto.getTitle();
        String subtitle = getFullWithdrawalSummaryResponseDto.getSubtitle();
        List<WithdrawalSummaryItemDto> breakdown = getFullWithdrawalSummaryResponseDto.getBreakdown();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(breakdown, 10));
        Iterator<T> it = breakdown.iterator();
        while (it.hasNext()) {
            arrayList.add(toUiModel((WithdrawalSummaryItemDto) it.next()));
        }
        WithdrawalSummaryItemDto amount_received = getFullWithdrawalSummaryResponseDto.getAmount_received();
        return new FullWithdrawalSummary(title, subtitle, arrayList, amount_received != null ? toUiModel(amount_received) : null, getFullWithdrawalSummaryResponseDto.getDisclosure());
    }
}
