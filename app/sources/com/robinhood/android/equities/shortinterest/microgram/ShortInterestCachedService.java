package com.robinhood.android.equities.shortinterest.microgram;

import com.robinhood.coroutines.job.CachedJobManager7;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import microgram.contracts.equity_short_interest.proto.p488v1.StreamShortInterestSectionResponseDto;

/* compiled from: ShortInterestCachedService.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/equities/shortinterest/microgram/ShortInterestCachedService;", "Lcom/robinhood/coroutines/job/RetainableCachedJob;", "streamShortInterestSection", "Lkotlinx/coroutines/flow/Flow;", "Lmicrogram/contracts/equity_short_interest/proto/v1/StreamShortInterestSectionResponseDto;", "instrumentId", "Ljava/util/UUID;", "lib-short-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface ShortInterestCachedService extends CachedJobManager7 {
    Flow<StreamShortInterestSectionResponseDto> streamShortInterestSection(UUID instrumentId);
}
