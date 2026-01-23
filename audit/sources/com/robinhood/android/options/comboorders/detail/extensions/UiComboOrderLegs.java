package com.robinhood.android.options.comboorders.detail.extensions;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.combo.api.ApiComboOrder;
import com.robinhood.android.options.combo.p206db.ComboOrderExecution;
import com.robinhood.android.options.combo.p207ui.UiComboOrderLeg;
import com.robinhood.android.options.historydetail.OptionOrderUtils;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.models.history.shared.OrderState;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: UiComboOrderLegs.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"getHistoryDetailLegRowTitleString", "", "Lcom/robinhood/android/options/combo/ui/UiComboOrderLeg;", "resources", "Landroid/content/res/Resources;", "getHistoryDetailLegRowSubtitleString", "getNotationalString", "orderState", "Lcom/robinhood/shared/models/history/shared/OrderState;", "feature-combo-order-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.comboorders.detail.extensions.UiComboOrderLegsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UiComboOrderLegs {

    /* compiled from: UiComboOrderLegs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.comboorders.detail.extensions.UiComboOrderLegsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiComboOrder.InstrumentType.values().length];
            try {
                iArr[ApiComboOrder.InstrumentType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiComboOrder.InstrumentType.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiComboOrder.InstrumentType.OPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getHistoryDetailLegRowTitleString(UiComboOrderLeg uiComboOrderLeg, Resources resources) {
        String equityOrderLegRowTitleString;
        String equityOptionOrderLegRowTitleString;
        Intrinsics.checkNotNullParameter(uiComboOrderLeg, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[uiComboOrderLeg.getLeg().getInstrumentType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                OptionInstrument optionInstrument = uiComboOrderLeg.getOptionInstrument();
                return (optionInstrument == null || (equityOptionOrderLegRowTitleString = OptionOrderUtils.INSTANCE.getEquityOptionOrderLegRowTitleString(resources, optionInstrument)) == null) ? "" : equityOptionOrderLegRowTitleString;
            }
            Instrument instrument = uiComboOrderLeg.getInstrument();
            if (instrument != null && (equityOrderLegRowTitleString = OptionOrderUtils.INSTANCE.getEquityOrderLegRowTitleString(resources, instrument.getSymbol())) != null) {
                return equityOrderLegRowTitleString;
            }
        }
        return "";
    }

    public static final String getHistoryDetailLegRowSubtitleString(UiComboOrderLeg uiComboOrderLeg, Resources resources) {
        String equityOptionOrderLegRowSubtitleResource;
        Intrinsics.checkNotNullParameter(uiComboOrderLeg, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        int i = WhenMappings.$EnumSwitchMapping$0[uiComboOrderLeg.getLeg().getInstrumentType().ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            return OptionOrderUtils.INSTANCE.getEquityOrderLegRowSubtitleString(resources, uiComboOrderLeg.getLeg().getSide(), uiComboOrderLeg.getLeg().getRatioQuantity(), uiComboOrderLeg.getLeg().getPositionEffect());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        OptionInstrument optionInstrument = uiComboOrderLeg.getOptionInstrument();
        return (optionInstrument == null || (equityOptionOrderLegRowSubtitleResource = OptionOrderUtils.INSTANCE.getEquityOptionOrderLegRowSubtitleResource(resources, optionInstrument, uiComboOrderLeg.getLeg().getSide(), uiComboOrderLeg.getLeg().getRatioQuantity(), uiComboOrderLeg.getLeg().getPositionEffect())) == null) ? "" : equityOptionOrderLegRowSubtitleResource;
    }

    public static final String getNotationalString(final UiComboOrderLeg uiComboOrderLeg, OrderState orderState) {
        Intrinsics.checkNotNullParameter(uiComboOrderLeg, "<this>");
        Intrinsics.checkNotNullParameter(orderState, "orderState");
        Sequence<Tuples3> map = SequencesKt.map(CollectionsKt.asSequence(uiComboOrderLeg.getExecutions()), new Function1() { // from class: com.robinhood.android.options.comboorders.detail.extensions.UiComboOrderLegsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UiComboOrderLegs.getNotationalString$lambda$3(uiComboOrderLeg, (ComboOrderExecution) obj);
            }
        });
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (Tuples3 tuples3 : map) {
            BigDecimal bigDecimal = (BigDecimal) tuples3.component1();
            BigDecimal bigDecimal2 = (BigDecimal) tuples3.component2();
            OrderSide orderSide = (OrderSide) tuples3.component3();
            BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(orderSide.getAdjustmentDirection().getMultiplier());
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
            bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        if (Intrinsics.areEqual(orderState.isSuccessful(), Boolean.TRUE)) {
            return Formats.getAmountFormat().format(bigDecimalValueOf);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples3 getNotationalString$lambda$3(UiComboOrderLeg uiComboOrderLeg, ComboOrderExecution execution) {
        BigDecimal quantity;
        Intrinsics.checkNotNullParameter(execution, "execution");
        if (uiComboOrderLeg.getLeg().getInstrumentType() == ApiComboOrder.InstrumentType.EQUITY) {
            quantity = new BigDecimal(1);
        } else {
            quantity = execution.getQuantity();
        }
        return new Tuples3(quantity, execution.getPrice(), uiComboOrderLeg.getLeg().getSide());
    }
}
