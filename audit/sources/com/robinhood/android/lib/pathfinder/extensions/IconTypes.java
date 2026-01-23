package com.robinhood.android.lib.pathfinder.extensions;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.models.api.pathfinder.contexts.IconType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IconTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"start", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "Lcom/robinhood/models/api/pathfinder/contexts/IconType;", "getStart", "(Lcom/robinhood/models/api/pathfinder/contexts/IconType;)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Start;", "lib-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.extensions.IconTypesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class IconTypes {

    /* compiled from: IconTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.pathfinder.extensions.IconTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.BANKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.CLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconType.SPARK_BULLET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconType.TRIANGLE_ALERT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IconType.DOCUMENTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IconType.BUBBLE_CHECKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IconType.PERSON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET1.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET5.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET6.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET7.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET8.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[IconType.NUMBERED_BULLET9.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[IconType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[IconType.RHF_BROKERAGE_ACCOUNT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[IconType.RHY_SPENDING_ACCOUNT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[IconType.DOT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[IconType.FINANCE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[IconType.TRANSFERS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[IconType.BUBBLE_EMPTY.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BentoBaseRowState.Start getStart(IconType iconType) {
        Intrinsics.checkNotNullParameter(iconType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[iconType.ordinal()]) {
            case 1:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BANKING_24, null, null, 6, null);
            case 2:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.CLOCK_24, null, null, 6, null);
            case 3:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, null, 6, null);
            case 4:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.TRIANGLE_ALERT_24, null, null, 6, null);
            case 5:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.DOCUMENTS_24, null, null, 6, null);
            case 6:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BUBBLE_CHECKED_24, null, null, 6, null);
            case 7:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.PERSON_24, null, null, 6, null);
            case 8:
                return new BentoBaseRowState.Start.NumberPog(1);
            case 9:
                return new BentoBaseRowState.Start.NumberPog(2);
            case 10:
                return new BentoBaseRowState.Start.NumberPog(3);
            case 11:
                return new BentoBaseRowState.Start.NumberPog(4);
            case 12:
                return new BentoBaseRowState.Start.NumberPog(5);
            case 13:
                return new BentoBaseRowState.Start.NumberPog(6);
            case 14:
                return new BentoBaseRowState.Start.NumberPog(7);
            case 15:
                return new BentoBaseRowState.Start.NumberPog(8);
            case 16:
                return new BentoBaseRowState.Start.NumberPog(9);
            case 17:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.SPARKLE_BULLET_24, null, null, 6, null);
            case 18:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.OPTIONS_VOLATILE_24, null, null, 6, null);
            case 19:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.CASH_24, null, null, 6, null);
            case 20:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.DOT_24, null, null, 6, null);
            case 21:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.FINANCE_24, null, null, 6, null);
            case 22:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.TRANSFERS_24, null, null, 6, null);
            case 23:
                return new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BUBBLE_EMPTY_24, null, null, 6, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
