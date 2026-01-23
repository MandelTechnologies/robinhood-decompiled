package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OrderFormStep.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORDER_FORM_STEP_UNSPECIFIED", "REVIEW", "SUBMIT", "INITIAL_LOAD", "EDIT_VALUES", "EDIT_ORDER", "CANCEL_ORDER", "CONFIRM_OPTION_LEG_SELECTION", "SUBMIT_SUCCESS", "REPLACE_ORDER", "ORDER_CHECK", "ORDER_CHECK_ACTION", "ORDER_STATE_CHANGE", "UNMOUNT", "ABORT_ORDER_CHECKS", "ORDER_EXECUTED", "SUBMIT_FAILURE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OrderFormStep implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OrderFormStep[] $VALUES;
    public static final OrderFormStep ABORT_ORDER_CHECKS;

    @JvmField
    public static final ProtoAdapter<OrderFormStep> ADAPTER;
    public static final OrderFormStep CANCEL_ORDER;
    public static final OrderFormStep CONFIRM_OPTION_LEG_SELECTION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OrderFormStep EDIT_ORDER;
    public static final OrderFormStep EDIT_VALUES;
    public static final OrderFormStep INITIAL_LOAD;
    public static final OrderFormStep ORDER_CHECK;
    public static final OrderFormStep ORDER_CHECK_ACTION;
    public static final OrderFormStep ORDER_EXECUTED;
    public static final OrderFormStep ORDER_FORM_STEP_UNSPECIFIED;
    public static final OrderFormStep ORDER_STATE_CHANGE;
    public static final OrderFormStep REPLACE_ORDER;
    public static final OrderFormStep REVIEW;
    public static final OrderFormStep SUBMIT;
    public static final OrderFormStep SUBMIT_FAILURE;
    public static final OrderFormStep SUBMIT_SUCCESS;
    public static final OrderFormStep UNMOUNT;
    private final int value;

    private static final /* synthetic */ OrderFormStep[] $values() {
        return new OrderFormStep[]{ORDER_FORM_STEP_UNSPECIFIED, REVIEW, SUBMIT, INITIAL_LOAD, EDIT_VALUES, EDIT_ORDER, CANCEL_ORDER, CONFIRM_OPTION_LEG_SELECTION, SUBMIT_SUCCESS, REPLACE_ORDER, ORDER_CHECK, ORDER_CHECK_ACTION, ORDER_STATE_CHANGE, UNMOUNT, ABORT_ORDER_CHECKS, ORDER_EXECUTED, SUBMIT_FAILURE};
    }

    @JvmStatic
    public static final OrderFormStep fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OrderFormStep> getEntries() {
        return $ENTRIES;
    }

    private OrderFormStep(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OrderFormStep orderFormStep = new OrderFormStep("ORDER_FORM_STEP_UNSPECIFIED", 0, 0);
        ORDER_FORM_STEP_UNSPECIFIED = orderFormStep;
        REVIEW = new OrderFormStep("REVIEW", 1, 1);
        SUBMIT = new OrderFormStep("SUBMIT", 2, 2);
        INITIAL_LOAD = new OrderFormStep("INITIAL_LOAD", 3, 3);
        EDIT_VALUES = new OrderFormStep("EDIT_VALUES", 4, 4);
        EDIT_ORDER = new OrderFormStep("EDIT_ORDER", 5, 5);
        CANCEL_ORDER = new OrderFormStep("CANCEL_ORDER", 6, 6);
        CONFIRM_OPTION_LEG_SELECTION = new OrderFormStep("CONFIRM_OPTION_LEG_SELECTION", 7, 7);
        SUBMIT_SUCCESS = new OrderFormStep("SUBMIT_SUCCESS", 8, 8);
        REPLACE_ORDER = new OrderFormStep("REPLACE_ORDER", 9, 9);
        ORDER_CHECK = new OrderFormStep("ORDER_CHECK", 10, 10);
        ORDER_CHECK_ACTION = new OrderFormStep("ORDER_CHECK_ACTION", 11, 11);
        ORDER_STATE_CHANGE = new OrderFormStep("ORDER_STATE_CHANGE", 12, 12);
        UNMOUNT = new OrderFormStep("UNMOUNT", 13, 13);
        ABORT_ORDER_CHECKS = new OrderFormStep("ABORT_ORDER_CHECKS", 14, 14);
        ORDER_EXECUTED = new OrderFormStep("ORDER_EXECUTED", 15, 15);
        SUBMIT_FAILURE = new OrderFormStep("SUBMIT_FAILURE", 16, 16);
        OrderFormStep[] orderFormStepArr$values = $values();
        $VALUES = orderFormStepArr$values;
        $ENTRIES = EnumEntries2.enumEntries(orderFormStepArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OrderFormStep.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OrderFormStep>(orCreateKotlinClass, syntax, orderFormStep) { // from class: com.robinhood.rosetta.eventlogging.OrderFormStep$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OrderFormStep fromValue(int value) {
                return OrderFormStep.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OrderFormStep.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OrderFormStep$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OrderFormStep;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderFormStep fromValue(int value) {
            switch (value) {
                case 0:
                    return OrderFormStep.ORDER_FORM_STEP_UNSPECIFIED;
                case 1:
                    return OrderFormStep.REVIEW;
                case 2:
                    return OrderFormStep.SUBMIT;
                case 3:
                    return OrderFormStep.INITIAL_LOAD;
                case 4:
                    return OrderFormStep.EDIT_VALUES;
                case 5:
                    return OrderFormStep.EDIT_ORDER;
                case 6:
                    return OrderFormStep.CANCEL_ORDER;
                case 7:
                    return OrderFormStep.CONFIRM_OPTION_LEG_SELECTION;
                case 8:
                    return OrderFormStep.SUBMIT_SUCCESS;
                case 9:
                    return OrderFormStep.REPLACE_ORDER;
                case 10:
                    return OrderFormStep.ORDER_CHECK;
                case 11:
                    return OrderFormStep.ORDER_CHECK_ACTION;
                case 12:
                    return OrderFormStep.ORDER_STATE_CHANGE;
                case 13:
                    return OrderFormStep.UNMOUNT;
                case 14:
                    return OrderFormStep.ABORT_ORDER_CHECKS;
                case 15:
                    return OrderFormStep.ORDER_EXECUTED;
                case 16:
                    return OrderFormStep.SUBMIT_FAILURE;
                default:
                    return null;
            }
        }
    }

    public static OrderFormStep valueOf(String str) {
        return (OrderFormStep) Enum.valueOf(OrderFormStep.class, str);
    }

    public static OrderFormStep[] values() {
        return (OrderFormStep[]) $VALUES.clone();
    }
}
