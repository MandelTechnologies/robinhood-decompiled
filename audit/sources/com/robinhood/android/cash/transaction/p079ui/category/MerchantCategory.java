package com.robinhood.android.cash.transaction.p079ui.category;

import android.content.res.Resources;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MerchantCategory.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001fB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "labelRes", "", "icon", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "getLabelRes", "()I", "getIcon", "AGRICULTURE", "BUSINESS_SERVICES", "DINING", "ENTERTAINMENT", "FINANCIAL_SERVICES", "GOVERNMENT", "GROCERIES", "HEALTHCARE", "OTHER", "SHOPPING", "TRAVEL", "TRANSPORTATION", "UTILITIES", "formatted", "res", "Landroid/content/res/Resources;", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantCategory implements RhEnum<MerchantCategory> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MerchantCategory[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String icon;
    private final int labelRes;
    private final String serverValue;
    public static final MerchantCategory AGRICULTURE = new MerchantCategory("AGRICULTURE", 0, "Agriculture", C10421R.string.merchant_category_agriculture, "🚜");
    public static final MerchantCategory BUSINESS_SERVICES = new MerchantCategory("BUSINESS_SERVICES", 1, "Business Services", C10421R.string.merchant_category_business_services, "💼");
    public static final MerchantCategory DINING = new MerchantCategory("DINING", 2, "Dining", C10421R.string.merchant_category_dining, "🍽️");
    public static final MerchantCategory ENTERTAINMENT = new MerchantCategory("ENTERTAINMENT", 3, "Entertainment", C10421R.string.merchant_category_entertainment, "🎟");
    public static final MerchantCategory FINANCIAL_SERVICES = new MerchantCategory("FINANCIAL_SERVICES", 4, "Financial Services", C10421R.string.merchant_category_financial_services, "🏦");
    public static final MerchantCategory GOVERNMENT = new MerchantCategory("GOVERNMENT", 5, "Government", C10421R.string.merchant_category_government, "🏛️");
    public static final MerchantCategory GROCERIES = new MerchantCategory("GROCERIES", 6, "Groceries", C10421R.string.merchant_category_groceries, "🛒");
    public static final MerchantCategory HEALTHCARE = new MerchantCategory("HEALTHCARE", 7, "Healthcare", C10421R.string.merchant_category_healthcare, "🏥");
    public static final MerchantCategory OTHER = new MerchantCategory("OTHER", 8, "Other", C10421R.string.merchant_category_other, "❓");
    public static final MerchantCategory SHOPPING = new MerchantCategory("SHOPPING", 9, "Shopping", C10421R.string.merchant_category_shopping, "🛍️");
    public static final MerchantCategory TRAVEL = new MerchantCategory("TRAVEL", 10, "Travel", C10421R.string.merchant_category_travel, "✈");
    public static final MerchantCategory TRANSPORTATION = new MerchantCategory("TRANSPORTATION", 11, "Transportation", C10421R.string.merchant_category_transportation, "🚗");
    public static final MerchantCategory UTILITIES = new MerchantCategory("UTILITIES", 12, "Utilities", C10421R.string.merchant_category_utilities, "🚰");

    private static final /* synthetic */ MerchantCategory[] $values() {
        return new MerchantCategory[]{AGRICULTURE, BUSINESS_SERVICES, DINING, ENTERTAINMENT, FINANCIAL_SERVICES, GOVERNMENT, GROCERIES, HEALTHCARE, OTHER, SHOPPING, TRAVEL, TRANSPORTATION, UTILITIES};
    }

    public static EnumEntries<MerchantCategory> getEntries() {
        return $ENTRIES;
    }

    private MerchantCategory(String str, int i, String str2, int i2, String str3) {
        this.serverValue = str2;
        this.labelRes = i2;
        this.icon = str3;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    public final int getLabelRes() {
        return this.labelRes;
    }

    public final String getIcon() {
        return this.icon;
    }

    static {
        MerchantCategory[] merchantCategoryArr$values = $values();
        $VALUES = merchantCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(merchantCategoryArr$values);
        INSTANCE = new Companion(null);
    }

    public final String formatted(Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(res, "res");
        return this.icon + "  " + res.getString(this.labelRes);
    }

    /* compiled from: MerchantCategory.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<MerchantCategory> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(MerchantCategory.values(), MerchantCategory.OTHER, false);
        }
    }

    public static MerchantCategory valueOf(String str) {
        return (MerchantCategory) Enum.valueOf(MerchantCategory.class, str);
    }

    public static MerchantCategory[] values() {
        return (MerchantCategory[]) $VALUES.clone();
    }
}
