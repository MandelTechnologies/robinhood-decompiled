package com.robinhood.android.trade.options.extensions;

import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderSource.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toMetaSource", "Lcom/robinhood/rosetta/eventlogging/OptionOrderMeta$Source;", "Lrosetta/option/OptionOrderFormSource;", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.extensions.OptionOrderSourceKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderSource {

    /* compiled from: OptionOrderSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.extensions.OptionOrderSourceKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionOrderFormSource.values().length];
            try {
                iArr[OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionOrderFormSource.OPTION_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OptionOrderFormSource.INSTRUMENT_DETAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OptionOrderFormSource.AGGREGATE_POSITION_DETAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OptionOrderFormSource.STRATEGY_DETAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OptionOrderFormSource.ORDER_DETAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OptionOrderFormSource.ACTIVITY_ITEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OptionOrderFormSource.STRATEGY_ROLL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OptionOrderFormSource.STRATEGY_CHAIN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OptionOrderFormSource.SIMULATED_RETURNS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OptionOrderFormSource.HOME_TAB.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[OptionOrderFormSource.ASSET_HOME.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[OptionOrderFormSource.RETIREMENT_HOME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[OptionOrderFormSource.ORDER_FORM_FLYOVER.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[OptionOrderFormSource.SOCIAL_POST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final OptionOrderMeta.Source toMetaSource(OptionOrderFormSource optionOrderFormSource) {
        Intrinsics.checkNotNullParameter(optionOrderFormSource, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[optionOrderFormSource.ordinal()]) {
            case 1:
                return OptionOrderMeta.Source.SOURCE_UNSPECIFIED;
            case 2:
                return OptionOrderMeta.Source.SOURCE_OPTION_CHAIN;
            case 3:
                return OptionOrderMeta.Source.SOURCE_INSTRUMENT_DETAIL;
            case 4:
                return OptionOrderMeta.Source.SOURCE_AGGREGATE_POSITION;
            case 5:
                return OptionOrderMeta.Source.SOURCE_STRATEGY_DETAIL;
            case 6:
                return OptionOrderMeta.Source.SOURCE_ORDER_DETAIL;
            case 7:
                return OptionOrderMeta.Source.SOURCE_ACTIVITY_ITEM;
            case 8:
                return OptionOrderMeta.Source.SOURCE_STRATEGY_ROLL;
            case 9:
                return OptionOrderMeta.Source.SOURCE_STRATEGY_CHAIN;
            case 10:
                return OptionOrderMeta.Source.SOURCE_SIMULATED_RETURNS;
            case 11:
                return OptionOrderMeta.Source.SOURCE_HOME_TAB;
            case 12:
                return OptionOrderMeta.Source.SOURCE_ASSET_HOME;
            case 13:
                return OptionOrderMeta.Source.SOURCE_RETIREMENT_HOME;
            case 14:
                return OptionOrderMeta.Source.SOURCE_ORDER_FORM_FLYOVER;
            case 15:
                return OptionOrderMeta.Source.SOURCE_SOCIAL_POST;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
