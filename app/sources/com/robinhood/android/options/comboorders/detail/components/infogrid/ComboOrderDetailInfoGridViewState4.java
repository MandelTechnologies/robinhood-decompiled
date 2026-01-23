package com.robinhood.android.options.comboorders.detail.components.infogrid;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComboOrderDetailInfoGridViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/DefaultGridItemType;", "", "<init>", "(Ljava/lang/String;I)V", CredentialProviderBaseController.TYPE_TAG, "POSITION_EFFECT", "TIME_IN_FORCE", "SUBMITTED_DATETIME", "LIMIT_PRICE", "FILLED_DATETIME", "FILLED_QUANTITY", "STOP_TRIGGER_PRICE", "QUANTITY", "BACKUP_WITHHOLDING", "NET_CREDIT", "COST_CREDIT", "CONTRACT_FEE", "REGULATORY_FEE", "SALES_TAX", "GOLD_SAVINGS", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.DefaultGridItemType, reason: use source file name */
/* loaded from: classes11.dex */
public final class ComboOrderDetailInfoGridViewState4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ComboOrderDetailInfoGridViewState4[] $VALUES;
    public static final ComboOrderDetailInfoGridViewState4 TYPE = new ComboOrderDetailInfoGridViewState4(CredentialProviderBaseController.TYPE_TAG, 0);
    public static final ComboOrderDetailInfoGridViewState4 POSITION_EFFECT = new ComboOrderDetailInfoGridViewState4("POSITION_EFFECT", 1);
    public static final ComboOrderDetailInfoGridViewState4 TIME_IN_FORCE = new ComboOrderDetailInfoGridViewState4("TIME_IN_FORCE", 2);
    public static final ComboOrderDetailInfoGridViewState4 SUBMITTED_DATETIME = new ComboOrderDetailInfoGridViewState4("SUBMITTED_DATETIME", 3);
    public static final ComboOrderDetailInfoGridViewState4 LIMIT_PRICE = new ComboOrderDetailInfoGridViewState4("LIMIT_PRICE", 4);
    public static final ComboOrderDetailInfoGridViewState4 FILLED_DATETIME = new ComboOrderDetailInfoGridViewState4("FILLED_DATETIME", 5);
    public static final ComboOrderDetailInfoGridViewState4 FILLED_QUANTITY = new ComboOrderDetailInfoGridViewState4("FILLED_QUANTITY", 6);
    public static final ComboOrderDetailInfoGridViewState4 STOP_TRIGGER_PRICE = new ComboOrderDetailInfoGridViewState4("STOP_TRIGGER_PRICE", 7);
    public static final ComboOrderDetailInfoGridViewState4 QUANTITY = new ComboOrderDetailInfoGridViewState4("QUANTITY", 8);
    public static final ComboOrderDetailInfoGridViewState4 BACKUP_WITHHOLDING = new ComboOrderDetailInfoGridViewState4("BACKUP_WITHHOLDING", 9);
    public static final ComboOrderDetailInfoGridViewState4 NET_CREDIT = new ComboOrderDetailInfoGridViewState4("NET_CREDIT", 10);
    public static final ComboOrderDetailInfoGridViewState4 COST_CREDIT = new ComboOrderDetailInfoGridViewState4("COST_CREDIT", 11);
    public static final ComboOrderDetailInfoGridViewState4 CONTRACT_FEE = new ComboOrderDetailInfoGridViewState4("CONTRACT_FEE", 12);
    public static final ComboOrderDetailInfoGridViewState4 REGULATORY_FEE = new ComboOrderDetailInfoGridViewState4("REGULATORY_FEE", 13);
    public static final ComboOrderDetailInfoGridViewState4 SALES_TAX = new ComboOrderDetailInfoGridViewState4("SALES_TAX", 14);
    public static final ComboOrderDetailInfoGridViewState4 GOLD_SAVINGS = new ComboOrderDetailInfoGridViewState4("GOLD_SAVINGS", 15);

    private static final /* synthetic */ ComboOrderDetailInfoGridViewState4[] $values() {
        return new ComboOrderDetailInfoGridViewState4[]{TYPE, POSITION_EFFECT, TIME_IN_FORCE, SUBMITTED_DATETIME, LIMIT_PRICE, FILLED_DATETIME, FILLED_QUANTITY, STOP_TRIGGER_PRICE, QUANTITY, BACKUP_WITHHOLDING, NET_CREDIT, COST_CREDIT, CONTRACT_FEE, REGULATORY_FEE, SALES_TAX, GOLD_SAVINGS};
    }

    public static EnumEntries<ComboOrderDetailInfoGridViewState4> getEntries() {
        return $ENTRIES;
    }

    private ComboOrderDetailInfoGridViewState4(String str, int i) {
    }

    static {
        ComboOrderDetailInfoGridViewState4[] comboOrderDetailInfoGridViewState4Arr$values = $values();
        $VALUES = comboOrderDetailInfoGridViewState4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(comboOrderDetailInfoGridViewState4Arr$values);
    }

    public static ComboOrderDetailInfoGridViewState4 valueOf(String str) {
        return (ComboOrderDetailInfoGridViewState4) Enum.valueOf(ComboOrderDetailInfoGridViewState4.class, str);
    }

    public static ComboOrderDetailInfoGridViewState4[] values() {
        return (ComboOrderDetailInfoGridViewState4[]) $VALUES.clone();
    }
}
