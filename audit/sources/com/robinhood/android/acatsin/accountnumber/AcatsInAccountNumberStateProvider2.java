package com.robinhood.android.acatsin.accountnumber;

import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAccountNumberStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, m3636d2 = {"getSubtitleText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/acatsin/accountnumber/AcatsInAccountNumberDataState;", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberStateProviderKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInAccountNumberStateProvider2 {

    /* compiled from: AcatsInAccountNumberStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.accountnumber.AcatsInAccountNumberStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getSubtitleText(AcatsInAccountNumberDataState acatsInAccountNumberDataState) {
        Intrinsics.checkNotNullParameter(acatsInAccountNumberDataState, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[acatsInAccountNumberDataState.getReceivingBrokerageAccountType().ordinal()]) {
            case 1:
            case 2:
                return StringResource.INSTANCE.invoke(C7686R.string.acats_account_number_page_subtitle_matching_account_types, new Object[0]);
            case 3:
            case 4:
                return StringResource.INSTANCE.invoke(C7686R.string.acats_account_number_page_subtitle_individual_or_joint, new Object[0]);
            case 5:
                return null;
            case 6:
            case 7:
                throw new IllegalStateException("Custodial accounts not yet supported");
            case 8:
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
