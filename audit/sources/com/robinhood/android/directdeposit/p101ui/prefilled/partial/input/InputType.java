package com.robinhood.android.directdeposit.p101ui.prefilled.partial.input;

import com.robinhood.models.p355ui.DirectDepositAmount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InputType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/InputType;", "", "initialValue", "Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;", "<init>", "(Ljava/lang/String;ILcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;)V", "getInitialValue", "()Lcom/robinhood/models/ui/DirectDepositAmount$PartialPaycheck;", "DOLLARS", "PERCENT", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class InputType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InputType[] $VALUES;
    public static final InputType DOLLARS;
    public static final InputType PERCENT;
    private final DirectDepositAmount.PartialPaycheck initialValue;

    private static final /* synthetic */ InputType[] $values() {
        return new InputType[]{DOLLARS, PERCENT};
    }

    public static EnumEntries<InputType> getEntries() {
        return $ENTRIES;
    }

    private InputType(String str, int i, DirectDepositAmount.PartialPaycheck partialPaycheck) {
        this.initialValue = partialPaycheck;
    }

    public final DirectDepositAmount.PartialPaycheck getInitialValue() {
        return this.initialValue;
    }

    static {
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        DOLLARS = new InputType("DOLLARS", 0, new DirectDepositAmount.PartialPaycheck.Dollars(ZERO));
        PERCENT = new InputType("PERCENT", 1, new DirectDepositAmount.PartialPaycheck.Percent(0));
        InputType[] inputTypeArr$values = $values();
        $VALUES = inputTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(inputTypeArr$values);
    }

    public static InputType valueOf(String str) {
        return (InputType) Enum.valueOf(InputType.class, str);
    }

    public static InputType[] values() {
        return (InputType[]) $VALUES.clone();
    }
}
