package com.robinhood.android.lists.extensions;

import com.robinhood.models.api.ApiCuratedList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SortDirections.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"analyticsString", "", "Lcom/robinhood/models/api/ApiCuratedList$SortDirection;", "getAnalyticsString", "(Lcom/robinhood/models/api/ApiCuratedList$SortDirection;)Ljava/lang/String;", "feature-lists_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lists.extensions.SortDirectionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SortDirections {

    /* compiled from: SortDirections.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lists.extensions.SortDirectionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCuratedList.SortDirection.values().length];
            try {
                iArr[ApiCuratedList.SortDirection.DESCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCuratedList.SortDirection.ASCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCuratedList.SortDirection.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getAnalyticsString(ApiCuratedList.SortDirection sortDirection) {
        Intrinsics.checkNotNullParameter(sortDirection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sortDirection.ordinal()];
        if (i == 1) {
            return "down";
        }
        if (i == 2) {
            return "up";
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "";
    }
}
