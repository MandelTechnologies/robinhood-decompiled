package com.robinhood.android.common.extensions;

import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.p320db.CuratedListViewMode;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityViewModes.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\"\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"toCuratedListViewMode", "Lcom/robinhood/models/db/CuratedListViewMode;", "Lcom/robinhood/android/common/util/SecurityViewMode;", "analyticsButtonTitle", "", "getAnalyticsButtonTitle", "(Lcom/robinhood/android/common/util/SecurityViewMode;)Ljava/lang/String;", "feature-lib-lists_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.extensions.SecurityViewModesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SecurityViewModes {

    /* compiled from: SecurityViewModes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.extensions.SecurityViewModesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecurityViewMode.values().length];
            try {
                iArr[SecurityViewMode.LAST_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecurityViewMode.PERCENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecurityViewMode.FUTURES_MARGIN_REQUIREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SecurityViewMode.EQUITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SecurityViewMode.TODAYS_DELTA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SecurityViewMode.TOTAL_DELTA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SecurityViewMode.TOTAL_PERCENT_CHANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CuratedListViewMode toCuratedListViewMode(SecurityViewMode securityViewMode) {
        Intrinsics.checkNotNullParameter(securityViewMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[securityViewMode.ordinal()];
        if (i == 1) {
            return CuratedListViewMode.LAST_PRICE;
        }
        if (i == 2) {
            return CuratedListViewMode.PERCENT_CHANGE;
        }
        if (i == 3) {
            return CuratedListViewMode.FUTURES_MARGIN_REQUIREMENT;
        }
        Preconditions.INSTANCE.failUnknownEnumKotlin(securityViewMode);
        throw new ExceptionsH();
    }

    public static final String getAnalyticsButtonTitle(SecurityViewMode securityViewMode) {
        Intrinsics.checkNotNullParameter(securityViewMode, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[securityViewMode.ordinal()]) {
            case 1:
                return AnalyticsStrings.BUTTON_VIEW_MODE_LAST_PRICE;
            case 2:
                return "percent_change";
            case 3:
                return AnalyticsStrings.BUTTON_VIEW_MODE_FUTURES_MARGIN_REQUIREMENT;
            case 4:
                return AnalyticsStrings.BUTTON_VIEW_MODE_EQUITY;
            case 5:
                return AnalyticsStrings.BUTTON_VIEW_MODE_TODAYS_DELTA;
            case 6:
                return AnalyticsStrings.BUTTON_VIEW_MODE_TOTAL_DELTA;
            case 7:
                return AnalyticsStrings.BUTTON_VIEW_MODE_TOTAL_PERCENT_CHANGE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
