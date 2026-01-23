package com.robinhood.android.equityadvancedorder.utils;

import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvancedOrderLoggingManager.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/utils/EquityAdvancedOrderLoggingManager;", "", "<init>", "()V", "getStreamlineButtonPressIdentifier", "", "originEditMode", "Lcom/robinhood/android/trading/contracts/configuration/EditMode;", "STREAMLINED_CONTINUE_TO_DETAIL_EDIT", "getSTREAMLINED_CONTINUE_TO_DETAIL_EDIT$annotations", "STREAMLINED_CONTINUE_TO_REVIEW", "getSTREAMLINED_CONTINUE_TO_REVIEW$annotations", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderLoggingManager {
    public static final int $stable = 0;
    public static final EquityAdvancedOrderLoggingManager INSTANCE = new EquityAdvancedOrderLoggingManager();
    public static final String STREAMLINED_CONTINUE_TO_DETAIL_EDIT = "streamlined_continue_to_detail_edit";
    public static final String STREAMLINED_CONTINUE_TO_REVIEW = "streamlined_continue_to_review";

    /* compiled from: EquityAdvancedOrderLoggingManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderConfiguration2.values().length];
            try {
                iArr[EquityOrderConfiguration2.SIMPLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderConfiguration2.DETAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getSTREAMLINED_CONTINUE_TO_DETAIL_EDIT$annotations() {
    }

    public static /* synthetic */ void getSTREAMLINED_CONTINUE_TO_REVIEW$annotations() {
    }

    private EquityAdvancedOrderLoggingManager() {
    }

    public final String getStreamlineButtonPressIdentifier(EquityOrderConfiguration2 originEditMode) {
        Intrinsics.checkNotNullParameter(originEditMode, "originEditMode");
        int i = WhenMappings.$EnumSwitchMapping$0[originEditMode.ordinal()];
        if (i == 1) {
            return STREAMLINED_CONTINUE_TO_DETAIL_EDIT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return STREAMLINED_CONTINUE_TO_REVIEW;
    }
}
