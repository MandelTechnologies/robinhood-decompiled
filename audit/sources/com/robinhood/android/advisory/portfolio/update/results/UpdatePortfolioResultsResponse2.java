package com.robinhood.android.advisory.portfolio.update.results;

import advisory.proto.p008v1.GetModelPortfolioChangeResponseDto;
import advisory.proto.p008v1.ModelPortfolioChangeRowDto;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UpdatePortfolioResultsResponse.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toUiModel", "Lcom/robinhood/android/advisory/portfolio/update/results/ModelPortfolioChangeRow;", "Ladvisory/proto/v1/ModelPortfolioChangeRowDto;", "Lcom/robinhood/android/advisory/portfolio/update/results/UpdatePortfolioResultsResponse;", "Ladvisory/proto/v1/GetModelPortfolioChangeResponseDto;", "feature-advisory-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsResponseKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class UpdatePortfolioResultsResponse2 {
    public static final ModelPortfolioChangeRow toUiModel(ModelPortfolioChangeRowDto modelPortfolioChangeRowDto) {
        Intrinsics.checkNotNullParameter(modelPortfolioChangeRowDto, "<this>");
        return new ModelPortfolioChangeRow(modelPortfolioChangeRowDto.getLabel(), modelPortfolioChangeRowDto.getOriginal_value(), modelPortfolioChangeRowDto.getNew_value(), modelPortfolioChangeRowDto.getDescription(), modelPortfolioChangeRowDto.getValue_color());
    }

    public static final UpdatePortfolioResultsResponse toUiModel(GetModelPortfolioChangeResponseDto getModelPortfolioChangeResponseDto) {
        UpdatePortfolioResultsResponse.Details noChange;
        Intrinsics.checkNotNullParameter(getModelPortfolioChangeResponseDto, "<this>");
        String title = getModelPortfolioChangeResponseDto.getTitle();
        String subtitle = getModelPortfolioChangeResponseDto.getSubtitle();
        GetModelPortfolioChangeResponseDto.DetailsDto details = getModelPortfolioChangeResponseDto.getDetails();
        if (details instanceof GetModelPortfolioChangeResponseDto.DetailsDto.ChangeDetails) {
            GetModelPortfolioChangeResponseDto.DetailsDto.ChangeDetails changeDetails = (GetModelPortfolioChangeResponseDto.DetailsDto.ChangeDetails) details;
            List<ModelPortfolioChangeRowDto> rows = changeDetails.getValue().getRows();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
            Iterator<T> it = rows.iterator();
            while (it.hasNext()) {
                arrayList.add(toUiModel((ModelPortfolioChangeRowDto) it.next()));
            }
            noChange = new UpdatePortfolioResultsResponse.Details.Change(arrayList, changeDetails.getValue().getDisclosure());
        } else {
            if (!(details instanceof GetModelPortfolioChangeResponseDto.DetailsDto.NoChangeDetails)) {
                if (details != null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("No model portfolio change details provided");
            }
            GetModelPortfolioChangeResponseDto.DetailsDto.NoChangeDetails noChangeDetails = (GetModelPortfolioChangeResponseDto.DetailsDto.NoChangeDetails) details;
            noChange = new UpdatePortfolioResultsResponse.Details.NoChange(noChangeDetails.getValue().getLottie_url_dark(), noChangeDetails.getValue().getLottie_url_light());
        }
        return new UpdatePortfolioResultsResponse(title, subtitle, noChange);
    }
}
