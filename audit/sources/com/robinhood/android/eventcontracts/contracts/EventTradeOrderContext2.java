package com.robinhood.android.eventcontracts.contracts;

import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;
import rosetta.mainst.SideDto;

/* compiled from: EventTradeOrderContext.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"toProtoLoggingModel", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$OrderSide;", "Lrosetta/mainst/SideDto;", "Lcom/robinhood/rosetta/eventlogging/EventContractOrderContext$EventOrderPositionEffect;", "Lrosetta/mainst/PositionEffectDto;", "contracts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.contracts.EventTradeOrderContextKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventTradeOrderContext2 {

    /* compiled from: EventTradeOrderContext.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.contracts.EventTradeOrderContextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SideDto.values().length];
            try {
                iArr[SideDto.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SideDto.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SideDto.SIDE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SideDto.SELL_SHORT_EXEMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SideDto.SELL_SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PositionEffectDto.values().length];
            try {
                iArr2[PositionEffectDto.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PositionEffectDto.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PositionEffectDto.POSITION_EFFECT_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final EventContractOrderContext.OrderSide toProtoLoggingModel(SideDto sideDto) {
        Intrinsics.checkNotNullParameter(sideDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[sideDto.ordinal()];
        if (i == 1) {
            return EventContractOrderContext.OrderSide.BUY;
        }
        if (i == 2) {
            return EventContractOrderContext.OrderSide.SELL;
        }
        if (i != 3 && i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Invalid side " + sideDto).toString());
    }

    public static final EventContractOrderContext.EventOrderPositionEffect toProtoLoggingModel(PositionEffectDto positionEffectDto) {
        Intrinsics.checkNotNullParameter(positionEffectDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[positionEffectDto.ordinal()];
        if (i == 1) {
            return EventContractOrderContext.EventOrderPositionEffect.OPEN;
        }
        if (i == 2) {
            return EventContractOrderContext.EventOrderPositionEffect.CLOSE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(("Invalid position effect " + positionEffectDto).toString());
    }
}
