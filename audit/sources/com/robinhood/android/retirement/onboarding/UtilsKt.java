package com.robinhood.android.retirement.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"upsellColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/robinhood/models/api/BrokerageAccountType;", "getUpsellColor", "(Lcom/robinhood/models/api/BrokerageAccountType;Landroidx/compose/runtime/Composer;I)J", "feature-retirement-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class UtilsKt {

    /* compiled from: Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmName
    public static final long getUpsellColor(BrokerageAccountType brokerageAccountType, Composer composer, int i) {
        long xrayLight;
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        composer.startReplaceGroup(-1275181330);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1275181330, i, -1, "com.robinhood.android.retirement.onboarding.<get-upsellColor> (Utils.kt:9)");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
                composer.startReplaceGroup(-1383575657);
                xrayLight = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getXrayLight();
                composer.endReplaceGroup();
                break;
            case 2:
                composer.startReplaceGroup(-1383573229);
                xrayLight = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).getPrime();
                composer.endReplaceGroup();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                composer.startReplaceGroup(-1383565399);
                composer.endReplaceGroup();
                throw new IllegalStateException(("Unsupported account type for retirement tab: " + brokerageAccountType).toString());
            case 8:
                composer.startReplaceGroup(-1383561304);
                composer.endReplaceGroup();
                throw new IllegalStateException("ISA stocks and share brokerage type not supported");
            default:
                composer.startReplaceGroup(-1383577418);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return xrayLight;
    }
}
