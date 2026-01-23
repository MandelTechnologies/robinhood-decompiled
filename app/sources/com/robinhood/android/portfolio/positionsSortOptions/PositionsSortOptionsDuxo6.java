package com.robinhood.android.portfolio.positionsSortOptions;

import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSortOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0006"}, m3636d2 = {"next", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "query", "", "defaultSortDirection", "Lcom/robinhood/android/models/portfolio/api/PositionsSortDirection;", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxoKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PositionsSortOptionsDuxo6 {
    public static final PositionsSortPreference next(PositionsSortPreference positionsSortPreference, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (positionsSortPreference == null || !Intrinsics.areEqual(positionsSortPreference.getSortQuery(), query)) {
            return new PositionsSortPreference(query, defaultSortDirection(query));
        }
        if (positionsSortPreference.getSortDirection() == defaultSortDirection(positionsSortPreference.getSortQuery())) {
            return PositionsSortPreference.copy$default(positionsSortPreference, null, positionsSortPreference.getSortDirection().invert(), 1, null);
        }
        return null;
    }

    private static final PositionsSortDirection defaultSortDirection(String str) {
        return Intrinsics.areEqual(str, "symbol") ? PositionsSortDirection.ASC : PositionsSortDirection.DSC;
    }
}
