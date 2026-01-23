package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.models.advisory.p304db.ManagedAccountState;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.userleap.survey.TrackingEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyHelper.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m3636d2 = {"mapAccountDataToSurveyEvent", "Lcom/robinhood/userleap/survey/TrackingEvent;", "managedAccountState", "Lcom/robinhood/models/advisory/db/ManagedAccountState;", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "lib-advisory-dashboard_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.SurveyHelperKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class SurveyHelper {

    /* compiled from: SurveyHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.SurveyHelperKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ManagedAccountState.values().length];
            try {
                iArr2[ManagedAccountState.FUNDED_PENDING_INVESTMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ManagedAccountState.INVESTED_PENDING_RETURNS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ManagedAccountState.INVESTED_RETURNS_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ManagedAccountState.UNFUNDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ManagedAccountState.UNFUNDED_PENDING_DEPOSIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ManagedAccountState.UNSPECIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ManagedAccountState.FUNDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ManagedAccountState.CLOSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TrackingEvent mapAccountDataToSurveyEvent(ManagedAccountState managedAccountState, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(managedAccountState, "managedAccountState");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        switch (WhenMappings.$EnumSwitchMapping$1[managedAccountState.ordinal()]) {
            case 1:
            case 2:
            case 3:
                int i = WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()];
                if (i == 1) {
                    return TrackingEvent.ADVISORY_FUNDED_INVESTED_FOLLOW_UP_INDIVIDUAL;
                }
                if (i == 2) {
                    return TrackingEvent.ADVISORY_FUNDED_INVESTED_FOLLOW_UP_ROTH;
                }
                if (i != 3) {
                    return null;
                }
                return TrackingEvent.ADVISORY_FUNDED_INVESTED_FOLLOW_UP_TRAD;
            case 4:
            case 5:
                int i2 = WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()];
                if (i2 == 1) {
                    return TrackingEvent.ADVISORY_UNFUNDED_FOLLOW_UP_INDIVIDUAL;
                }
                if (i2 == 2) {
                    return TrackingEvent.ADVISORY_UNFUNDED_FOLLOW_UP_ROTH;
                }
                if (i2 != 3) {
                    return null;
                }
                return TrackingEvent.ADVISORY_UNFUNDED_FOLLOW_UP_TRAD;
            case 6:
            case 7:
            case 8:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
