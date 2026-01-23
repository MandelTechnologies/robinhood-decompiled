package com.robinhood.shared.lists.quickadd.extensions;

import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionPositionType;
import com.robinhood.models.p320db.OrderPositionEffect;
import com.robinhood.models.p320db.OrderSide;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionInstruments.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getOpenPositionStrategyCode", "", "Lcom/robinhood/models/db/OptionInstrument;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "lib-lists-quickadd_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.lists.quickadd.extensions.OptionInstrumentsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class OptionInstruments3 {

    /* compiled from: OptionInstruments.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.lists.quickadd.extensions.OptionInstrumentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionPositionType.values().length];
            try {
                iArr[OptionPositionType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionPositionType.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String getOpenPositionStrategyCode(OptionInstrument optionInstrument, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(optionInstrument, "<this>");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        int i = WhenMappings.$EnumSwitchMapping$0[OptionPositionType.INSTANCE.m2736of(orderSide, OrderPositionEffect.OPEN).ordinal()];
        if (i == 1) {
            return optionInstrument.getLongStrategyCode();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return optionInstrument.getShortStrategyCode();
    }
}
