package com.robinhood.android.investFlow.paymentmethod;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.ApiAchRelationship;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowPaymentMethodViewState.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001MBq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020\bJ\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010@\u001a\u00020\bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010B\u001a\u00020\bHÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010D\u001a\u00020\u0010HÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0013HÂ\u0003Jw\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u0010H\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0014\u0010+\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0014\u0010,\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u0011\u00100\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b1\u0010\u001aR\u0011\u00102\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b3\u0010\u001aR\u0011\u00104\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0014\u0010;\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001aR\u0011\u0010<\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u0010\u001a¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodViewState;", "", "selectedRow", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "achRelationships", "", "Lcom/robinhood/models/db/AchRelationship;", "isCrypto", "", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "isBackup", "continueUiEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodViewState$ContinueAction;", "accountNumber", "", "showPaymentMethodAnnotation", "marginSettings", "Lcom/robinhood/android/lib/margin/db/models/MarginSettings;", "<init>", "(Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;Ljava/util/List;ZLcom/robinhood/models/db/phoenix/UnifiedAccountV2;ZLcom/robinhood/udf/UiEvent;Ljava/lang/String;ZLcom/robinhood/android/lib/margin/db/models/MarginSettings;)V", "getSelectedRow", "()Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "getAchRelationships", "()Ljava/util/List;", "()Z", "getUnifiedAccount", "()Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "getContinueUiEvent", "()Lcom/robinhood/udf/UiEvent;", "getAccountNumber", "()Ljava/lang/String;", "getShowPaymentMethodAnnotation", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "accountBuyingPower", "Lcom/robinhood/models/util/Money;", "getAccountBuyingPower", "()Lcom/robinhood/models/util/Money;", "isRetirementAccount", "isJointAccount", "buyingPowerRow", "getBuyingPowerRow", "rows", "getRows", "continueButtonEnabled", "getContinueButtonEnabled", "disclaimerVisible", "getDisclaimerVisible", "disclaimerText", "getDisclaimerText", "getDisclaimerDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "showWithdrawalLimit", "isMarginInvestingEnabled", "showMarginLimit", "getShowMarginLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ContinueAction", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowPaymentMethodViewState {
    public static final int $stable = 8;
    private final Money accountBuyingPower;
    private final String accountNumber;
    private final List<AchRelationship> achRelationships;
    private final UiEvent<ContinueAction> continueUiEvent;
    private final StringResource disclaimerText;
    private final boolean isBackup;
    private final boolean isCrypto;
    private final MarginSettings marginSettings;
    private final InvestFlowPaymentMethodFragment.Row selectedRow;
    private final boolean showPaymentMethodAnnotation;
    private final StringResource titleText;
    private final UnifiedAccountV2 unifiedAccount;

    /* renamed from: component9, reason: from getter */
    private final MarginSettings getMarginSettings() {
        return this.marginSettings;
    }

    public static /* synthetic */ InvestFlowPaymentMethodViewState copy$default(InvestFlowPaymentMethodViewState investFlowPaymentMethodViewState, InvestFlowPaymentMethodFragment.Row row, List list, boolean z, UnifiedAccountV2 unifiedAccountV2, boolean z2, UiEvent uiEvent, String str, boolean z3, MarginSettings marginSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            row = investFlowPaymentMethodViewState.selectedRow;
        }
        if ((i & 2) != 0) {
            list = investFlowPaymentMethodViewState.achRelationships;
        }
        if ((i & 4) != 0) {
            z = investFlowPaymentMethodViewState.isCrypto;
        }
        if ((i & 8) != 0) {
            unifiedAccountV2 = investFlowPaymentMethodViewState.unifiedAccount;
        }
        if ((i & 16) != 0) {
            z2 = investFlowPaymentMethodViewState.isBackup;
        }
        if ((i & 32) != 0) {
            uiEvent = investFlowPaymentMethodViewState.continueUiEvent;
        }
        if ((i & 64) != 0) {
            str = investFlowPaymentMethodViewState.accountNumber;
        }
        if ((i & 128) != 0) {
            z3 = investFlowPaymentMethodViewState.showPaymentMethodAnnotation;
        }
        if ((i & 256) != 0) {
            marginSettings = investFlowPaymentMethodViewState.marginSettings;
        }
        boolean z4 = z3;
        MarginSettings marginSettings2 = marginSettings;
        UiEvent uiEvent2 = uiEvent;
        String str2 = str;
        boolean z5 = z2;
        boolean z6 = z;
        return investFlowPaymentMethodViewState.copy(row, list, z6, unifiedAccountV2, z5, uiEvent2, str2, z4, marginSettings2);
    }

    /* renamed from: component1, reason: from getter */
    public final InvestFlowPaymentMethodFragment.Row getSelectedRow() {
        return this.selectedRow;
    }

    public final List<AchRelationship> component2() {
        return this.achRelationships;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component4, reason: from getter */
    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBackup() {
        return this.isBackup;
    }

    public final UiEvent<ContinueAction> component6() {
        return this.continueUiEvent;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    public final InvestFlowPaymentMethodViewState copy(InvestFlowPaymentMethodFragment.Row selectedRow, List<AchRelationship> achRelationships, boolean isCrypto, UnifiedAccountV2 unifiedAccount, boolean isBackup, UiEvent<ContinueAction> continueUiEvent, String accountNumber, boolean showPaymentMethodAnnotation, MarginSettings marginSettings) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowPaymentMethodViewState(selectedRow, achRelationships, isCrypto, unifiedAccount, isBackup, continueUiEvent, accountNumber, showPaymentMethodAnnotation, marginSettings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowPaymentMethodViewState)) {
            return false;
        }
        InvestFlowPaymentMethodViewState investFlowPaymentMethodViewState = (InvestFlowPaymentMethodViewState) other;
        return Intrinsics.areEqual(this.selectedRow, investFlowPaymentMethodViewState.selectedRow) && Intrinsics.areEqual(this.achRelationships, investFlowPaymentMethodViewState.achRelationships) && this.isCrypto == investFlowPaymentMethodViewState.isCrypto && Intrinsics.areEqual(this.unifiedAccount, investFlowPaymentMethodViewState.unifiedAccount) && this.isBackup == investFlowPaymentMethodViewState.isBackup && Intrinsics.areEqual(this.continueUiEvent, investFlowPaymentMethodViewState.continueUiEvent) && Intrinsics.areEqual(this.accountNumber, investFlowPaymentMethodViewState.accountNumber) && this.showPaymentMethodAnnotation == investFlowPaymentMethodViewState.showPaymentMethodAnnotation && Intrinsics.areEqual(this.marginSettings, investFlowPaymentMethodViewState.marginSettings);
    }

    public int hashCode() {
        InvestFlowPaymentMethodFragment.Row row = this.selectedRow;
        int iHashCode = (((((row == null ? 0 : row.hashCode()) * 31) + this.achRelationships.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        int iHashCode2 = (((iHashCode + (unifiedAccountV2 == null ? 0 : unifiedAccountV2.hashCode())) * 31) + Boolean.hashCode(this.isBackup)) * 31;
        UiEvent<ContinueAction> uiEvent = this.continueUiEvent;
        int iHashCode3 = (((((iHashCode2 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + this.accountNumber.hashCode()) * 31) + Boolean.hashCode(this.showPaymentMethodAnnotation)) * 31;
        MarginSettings marginSettings = this.marginSettings;
        return iHashCode3 + (marginSettings != null ? marginSettings.hashCode() : 0);
    }

    public String toString() {
        return "InvestFlowPaymentMethodViewState(selectedRow=" + this.selectedRow + ", achRelationships=" + this.achRelationships + ", isCrypto=" + this.isCrypto + ", unifiedAccount=" + this.unifiedAccount + ", isBackup=" + this.isBackup + ", continueUiEvent=" + this.continueUiEvent + ", accountNumber=" + this.accountNumber + ", showPaymentMethodAnnotation=" + this.showPaymentMethodAnnotation + ", marginSettings=" + this.marginSettings + ")";
    }

    public InvestFlowPaymentMethodViewState(InvestFlowPaymentMethodFragment.Row row, List<AchRelationship> achRelationships, boolean z, UnifiedAccountV2 unifiedAccountV2, boolean z2, UiEvent<ContinueAction> uiEvent, String accountNumber, boolean z3, MarginSettings marginSettings) {
        int i;
        int i2;
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.selectedRow = row;
        this.achRelationships = achRelationships;
        this.isCrypto = z;
        this.unifiedAccount = unifiedAccountV2;
        this.isBackup = z2;
        this.continueUiEvent = uiEvent;
        this.accountNumber = accountNumber;
        this.showPaymentMethodAnnotation = z3;
        this.marginSettings = marginSettings;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (!z2) {
            i = C19349R.string.invest_flow_payment_method_title;
        } else {
            i = C19349R.string.invest_flow_payment_method_backup_title;
        }
        this.titleText = companion.invoke(i, new Object[0]);
        this.accountBuyingPower = unifiedAccountV2 != null ? unifiedAccountV2.getAccountBuyingPower() : null;
        if (isRetirementAccount() && row == null) {
            stringResourceInvoke = companion.invoke(C19349R.string.invest_flow_payment_method_how_to_earn_the_match, new Object[0]);
        } else {
            if (!z2) {
                i2 = C19349R.string.invest_flow_payment_method_disclaimer;
            } else {
                i2 = C19349R.string.invest_flow_payment_method_backup_disclaimer;
            }
            stringResourceInvoke = companion.invoke(i2, new Object[0]);
        }
        this.disclaimerText = stringResourceInvoke;
    }

    public final InvestFlowPaymentMethodFragment.Row getSelectedRow() {
        return this.selectedRow;
    }

    public /* synthetic */ InvestFlowPaymentMethodViewState(InvestFlowPaymentMethodFragment.Row row, List list, boolean z, UnifiedAccountV2 unifiedAccountV2, boolean z2, UiEvent uiEvent, String str, boolean z3, MarginSettings marginSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : row, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : unifiedAccountV2, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : uiEvent, str, z3, (i & 256) != 0 ? null : marginSettings);
    }

    public final List<AchRelationship> getAchRelationships() {
        return this.achRelationships;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public final boolean isBackup() {
        return this.isBackup;
    }

    public final UiEvent<ContinueAction> getContinueUiEvent() {
        return this.continueUiEvent;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    public final StringResource getTitleText() {
        return this.titleText;
    }

    public final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    public final boolean isRetirementAccount() {
        BrokerageAccountType brokerageAccountType;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        return (unifiedAccountV2 == null || (brokerageAccountType = unifiedAccountV2.getBrokerageAccountType()) == null || !brokerageAccountType.isRetirement()) ? false : true;
    }

    private final boolean isJointAccount() {
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        return (unifiedAccountV2 != null ? unifiedAccountV2.getBrokerageAccountType() : null) == BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
    }

    private final InvestFlowPaymentMethodFragment.Row getBuyingPowerRow() {
        if (isRetirementAccount()) {
            Money money = this.accountBuyingPower;
            return new InvestFlowPaymentMethodFragment.Row.RetirementBuyingPower(money != null ? Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
        }
        if (isJointAccount()) {
            Money money2 = this.accountBuyingPower;
            return new InvestFlowPaymentMethodFragment.Row.JointBuyingPower(money2 != null ? Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
        }
        Money money3 = this.accountBuyingPower;
        return new InvestFlowPaymentMethodFragment.Row.BrokerageBuyingPower(money3 != null ? Money.format$default(money3, null, false, null, false, 0, null, false, null, false, false, 1023, null) : null);
    }

    public final List<InvestFlowPaymentMethodFragment.Row> getRows() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List<AchRelationship> list = this.achRelationships;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new InvestFlowPaymentMethodFragment.Row.AchRelationship((AchRelationship) it.next(), this.showPaymentMethodAnnotation));
        }
        listCreateListBuilder.addAll(arrayList);
        if (!this.isBackup) {
            listCreateListBuilder.add(getBuyingPowerRow());
        }
        listCreateListBuilder.add(InvestFlowPaymentMethodFragment.Row.AddAccount.INSTANCE);
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final boolean getContinueButtonEnabled() {
        return this.selectedRow != null;
    }

    public final boolean getDisclaimerVisible() {
        return !this.isBackup;
    }

    public final StringResource getDisclaimerText() {
        return this.disclaimerText;
    }

    public final Drawable getDisclaimerDrawable(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isRetirementAccount() && this.selectedRow == null) {
            return context.getDrawable(C20690R.drawable.ic_rds_pop_out_16dp);
        }
        return null;
    }

    public final boolean showWithdrawalLimit() {
        InvestFlowPaymentMethodFragment.Row row = this.selectedRow;
        if ((row != null ? row.getPaymentMethod() : null) == ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP) {
            InvestFlowPaymentMethodFragment.Row row2 = this.selectedRow;
            InvestFlowPaymentMethodFragment.Row.AchRelationship achRelationship = row2 instanceof InvestFlowPaymentMethodFragment.Row.AchRelationship ? (InvestFlowPaymentMethodFragment.Row.AchRelationship) row2 : null;
            AchRelationship achRelationship2 = achRelationship != null ? achRelationship.getAchRelationship() : null;
            if ((achRelationship2 != null ? achRelationship2.getBankAccountType() : null) == ApiAchRelationship.BankAccountType.SAVINGS) {
                return true;
            }
        }
        return false;
    }

    private final boolean isMarginInvestingEnabled() {
        MarginSettings marginSettings = this.marginSettings;
        return marginSettings != null && marginSettings.isMarginInvestingEnabled();
    }

    public final boolean getShowMarginLimit() {
        InvestFlowPaymentMethodFragment.Row row = this.selectedRow;
        return (row != null ? row.getPaymentMethod() : null) == ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER && isMarginInvestingEnabled();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InvestFlowPaymentMethodViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodViewState$ContinueAction;", "", "<init>", "(Ljava/lang/String;I)V", "CONTINUE", "WITHDRAWAL_LIMIT_DIALOG", "MARGIN_LIMIT_DIALOG", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContinueAction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContinueAction[] $VALUES;
        public static final ContinueAction CONTINUE = new ContinueAction("CONTINUE", 0);
        public static final ContinueAction WITHDRAWAL_LIMIT_DIALOG = new ContinueAction("WITHDRAWAL_LIMIT_DIALOG", 1);
        public static final ContinueAction MARGIN_LIMIT_DIALOG = new ContinueAction("MARGIN_LIMIT_DIALOG", 2);

        private static final /* synthetic */ ContinueAction[] $values() {
            return new ContinueAction[]{CONTINUE, WITHDRAWAL_LIMIT_DIALOG, MARGIN_LIMIT_DIALOG};
        }

        public static EnumEntries<ContinueAction> getEntries() {
            return $ENTRIES;
        }

        private ContinueAction(String str, int i) {
        }

        static {
            ContinueAction[] continueActionArr$values = $values();
            $VALUES = continueActionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(continueActionArr$values);
        }

        public static ContinueAction valueOf(String str) {
            return (ContinueAction) Enum.valueOf(ContinueAction.class, str);
        }

        public static ContinueAction[] values() {
            return (ContinueAction[]) $VALUES.clone();
        }
    }
}
