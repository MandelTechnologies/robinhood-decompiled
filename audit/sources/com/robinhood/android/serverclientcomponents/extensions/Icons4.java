package com.robinhood.android.serverclientcomponents.extensions;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.Icon;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Icons.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\" \u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"drawableRes", "", "Lcom/robinhood/models/serverdriven/Icon;", "getDrawableRes$annotations", "(Lcom/robinhood/models/serverdriven/Icon;)V", "getDrawableRes", "(Lcom/robinhood/models/serverdriven/Icon;)I", "lib-server-client-components_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.serverclientcomponents.extensions.IconsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Icons4 {

    /* compiled from: Icons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.serverclientcomponents.extensions.IconsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Icon.values().length];
            try {
                iArr[Icon.CLOCK_16.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Icon.CLOSE_16.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Icon.CLOSE_24.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Icon.CHECKMARK_16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Icon.CHECKMARK_24.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Icon.FAIR_VALUE_24.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Icon.INFO_16.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Icon.INFO_FILLED_16.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Icon.INFO_24.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Icon.INFO_FILLED_24.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Icon.LOCK_16.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Icon.QUESTION_16.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Icon.QUESTION_24.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Icon.RISK_AND_UNCERTAINTY_24.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Icon.ROBINHOOD_24.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Icon.SPARKLE_BULLET_24.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Icon.STAR_FILLED_16.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Icon.UNKNOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Deprecated
    public static /* synthetic */ void getDrawableRes$annotations(Icon icon) {
    }

    public static final int getDrawableRes(Icon icon) {
        switch (icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()]) {
            case -1:
                return 0;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return C20690R.drawable.ic_rds_clock_16dp;
            case 2:
                return C20690R.drawable.ic_rds_close_16dp;
            case 3:
                return C20690R.drawable.ic_rds_close_24dp;
            case 4:
                return C20690R.drawable.ic_rds_checkmark_16dp;
            case 5:
                return C20690R.drawable.ic_rds_checkmark_24dp;
            case 6:
                return C20690R.drawable.ic_rds_fair_value_24dp;
            case 7:
                return C20690R.drawable.ic_rds_info_16dp;
            case 8:
                return C20690R.drawable.ic_rds_info_filled_16dp;
            case 9:
                return C20690R.drawable.ic_rds_info_24dp;
            case 10:
                return C20690R.drawable.ic_rds_info_filled_24dp;
            case 11:
                return C20690R.drawable.ic_rds_lock_16dp;
            case 12:
                return C20690R.drawable.ic_rds_question_16dp;
            case 13:
                return C20690R.drawable.ic_rds_question_24dp;
            case 14:
                return C20690R.drawable.ic_rds_risk_and_uncertainty_24dp;
            case 15:
                return C20690R.drawable.ic_rds_robinhood_24dp;
            case 16:
                return C20690R.drawable.ic_rds_sparkle_bullet_24dp;
            case 17:
                return C20690R.drawable.ic_rds_star_filled_16dp;
            case 18:
                return UnknownIcon.getUnknownIconDrawableRes();
        }
    }
}
