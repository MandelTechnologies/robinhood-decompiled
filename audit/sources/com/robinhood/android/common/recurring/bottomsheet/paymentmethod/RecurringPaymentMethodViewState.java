package com.robinhood.android.common.recurring.bottomsheet.paymentmethod;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.converters.recurring.Recurring2;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecurringPaymentMethodViewState.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÂ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÂ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\t\u0010/\u001a\u00020\u0003HÂ\u0003Jq\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u000206HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010 \u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodViewState;", "", "showPaymentMethodAnnotation", "", "selectedRow", "Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "achRelationships", "", "Lcom/robinhood/models/db/AchRelationship;", "isCrypto", "isBackup", "equityBuyingPower", "Lcom/robinhood/models/util/Money;", "cryptoBuyingPower", "initialLoggingContext", "Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "showGenericBuyingPower", "<init>", "(ZLcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;Ljava/util/List;ZZLcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/rosetta/eventlogging/RecurringContext;Z)V", "getShowPaymentMethodAnnotation", "()Z", "getSelectedRow", "()Lcom/robinhood/android/common/recurring/bottomsheet/paymentmethod/RecurringPaymentMethodBottomSheet$Row;", "getAchRelationships", "()Ljava/util/List;", "buyingPower", "getBuyingPower", "()Lcom/robinhood/models/util/Money;", "buyingPowerRow", "getBuyingPowerRow", "rows", "getRows", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/RecurringContext;", "disclaimerString", "Lcom/robinhood/utils/resource/StringResource;", "getDisclaimerString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class RecurringPaymentMethodViewState {
    public static final int $stable = 8;
    private final List<AchRelationship> achRelationships;
    private final Money cryptoBuyingPower;
    private final Money equityBuyingPower;
    private final RecurringContext initialLoggingContext;
    private final boolean isBackup;
    private final boolean isCrypto;
    private final RecurringPaymentMethodBottomSheet.Row selectedRow;
    private final boolean showGenericBuyingPower;
    private final boolean showPaymentMethodAnnotation;

    /* renamed from: component6, reason: from getter */
    private final Money getEquityBuyingPower() {
        return this.equityBuyingPower;
    }

    /* renamed from: component7, reason: from getter */
    private final Money getCryptoBuyingPower() {
        return this.cryptoBuyingPower;
    }

    /* renamed from: component8, reason: from getter */
    private final RecurringContext getInitialLoggingContext() {
        return this.initialLoggingContext;
    }

    /* renamed from: component9, reason: from getter */
    private final boolean getShowGenericBuyingPower() {
        return this.showGenericBuyingPower;
    }

    public static /* synthetic */ RecurringPaymentMethodViewState copy$default(RecurringPaymentMethodViewState recurringPaymentMethodViewState, boolean z, RecurringPaymentMethodBottomSheet.Row row, List list, boolean z2, boolean z3, Money money, Money money2, RecurringContext recurringContext, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = recurringPaymentMethodViewState.showPaymentMethodAnnotation;
        }
        if ((i & 2) != 0) {
            row = recurringPaymentMethodViewState.selectedRow;
        }
        if ((i & 4) != 0) {
            list = recurringPaymentMethodViewState.achRelationships;
        }
        if ((i & 8) != 0) {
            z2 = recurringPaymentMethodViewState.isCrypto;
        }
        if ((i & 16) != 0) {
            z3 = recurringPaymentMethodViewState.isBackup;
        }
        if ((i & 32) != 0) {
            money = recurringPaymentMethodViewState.equityBuyingPower;
        }
        if ((i & 64) != 0) {
            money2 = recurringPaymentMethodViewState.cryptoBuyingPower;
        }
        if ((i & 128) != 0) {
            recurringContext = recurringPaymentMethodViewState.initialLoggingContext;
        }
        if ((i & 256) != 0) {
            z4 = recurringPaymentMethodViewState.showGenericBuyingPower;
        }
        RecurringContext recurringContext2 = recurringContext;
        boolean z5 = z4;
        Money money3 = money;
        Money money4 = money2;
        boolean z6 = z3;
        List list2 = list;
        return recurringPaymentMethodViewState.copy(z, row, list2, z2, z6, money3, money4, recurringContext2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    /* renamed from: component2, reason: from getter */
    public final RecurringPaymentMethodBottomSheet.Row getSelectedRow() {
        return this.selectedRow;
    }

    public final List<AchRelationship> component3() {
        return this.achRelationships;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBackup() {
        return this.isBackup;
    }

    public final RecurringPaymentMethodViewState copy(boolean showPaymentMethodAnnotation, RecurringPaymentMethodBottomSheet.Row selectedRow, List<AchRelationship> achRelationships, boolean isCrypto, boolean isBackup, Money equityBuyingPower, Money cryptoBuyingPower, RecurringContext initialLoggingContext, boolean showGenericBuyingPower) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        return new RecurringPaymentMethodViewState(showPaymentMethodAnnotation, selectedRow, achRelationships, isCrypto, isBackup, equityBuyingPower, cryptoBuyingPower, initialLoggingContext, showGenericBuyingPower);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringPaymentMethodViewState)) {
            return false;
        }
        RecurringPaymentMethodViewState recurringPaymentMethodViewState = (RecurringPaymentMethodViewState) other;
        return this.showPaymentMethodAnnotation == recurringPaymentMethodViewState.showPaymentMethodAnnotation && Intrinsics.areEqual(this.selectedRow, recurringPaymentMethodViewState.selectedRow) && Intrinsics.areEqual(this.achRelationships, recurringPaymentMethodViewState.achRelationships) && this.isCrypto == recurringPaymentMethodViewState.isCrypto && this.isBackup == recurringPaymentMethodViewState.isBackup && Intrinsics.areEqual(this.equityBuyingPower, recurringPaymentMethodViewState.equityBuyingPower) && Intrinsics.areEqual(this.cryptoBuyingPower, recurringPaymentMethodViewState.cryptoBuyingPower) && Intrinsics.areEqual(this.initialLoggingContext, recurringPaymentMethodViewState.initialLoggingContext) && this.showGenericBuyingPower == recurringPaymentMethodViewState.showGenericBuyingPower;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showPaymentMethodAnnotation) * 31;
        RecurringPaymentMethodBottomSheet.Row row = this.selectedRow;
        int iHashCode2 = (((((((iHashCode + (row == null ? 0 : row.hashCode())) * 31) + this.achRelationships.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + Boolean.hashCode(this.isBackup)) * 31;
        Money money = this.equityBuyingPower;
        int iHashCode3 = (iHashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.cryptoBuyingPower;
        int iHashCode4 = (iHashCode3 + (money2 == null ? 0 : money2.hashCode())) * 31;
        RecurringContext recurringContext = this.initialLoggingContext;
        return ((iHashCode4 + (recurringContext != null ? recurringContext.hashCode() : 0)) * 31) + Boolean.hashCode(this.showGenericBuyingPower);
    }

    public String toString() {
        return "RecurringPaymentMethodViewState(showPaymentMethodAnnotation=" + this.showPaymentMethodAnnotation + ", selectedRow=" + this.selectedRow + ", achRelationships=" + this.achRelationships + ", isCrypto=" + this.isCrypto + ", isBackup=" + this.isBackup + ", equityBuyingPower=" + this.equityBuyingPower + ", cryptoBuyingPower=" + this.cryptoBuyingPower + ", initialLoggingContext=" + this.initialLoggingContext + ", showGenericBuyingPower=" + this.showGenericBuyingPower + ")";
    }

    public RecurringPaymentMethodViewState(boolean z, RecurringPaymentMethodBottomSheet.Row row, List<AchRelationship> achRelationships, boolean z2, boolean z3, Money money, Money money2, RecurringContext recurringContext, boolean z4) {
        Intrinsics.checkNotNullParameter(achRelationships, "achRelationships");
        this.showPaymentMethodAnnotation = z;
        this.selectedRow = row;
        this.achRelationships = achRelationships;
        this.isCrypto = z2;
        this.isBackup = z3;
        this.equityBuyingPower = money;
        this.cryptoBuyingPower = money2;
        this.initialLoggingContext = recurringContext;
        this.showGenericBuyingPower = z4;
    }

    public final boolean getShowPaymentMethodAnnotation() {
        return this.showPaymentMethodAnnotation;
    }

    public final RecurringPaymentMethodBottomSheet.Row getSelectedRow() {
        return this.selectedRow;
    }

    public /* synthetic */ RecurringPaymentMethodViewState(boolean z, RecurringPaymentMethodBottomSheet.Row row, List list, boolean z2, boolean z3, Money money, Money money2, RecurringContext recurringContext, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : row, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : money, (i & 64) != 0 ? null : money2, (i & 128) != 0 ? null : recurringContext, (i & 256) != 0 ? false : z4);
    }

    public final List<AchRelationship> getAchRelationships() {
        return this.achRelationships;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final boolean isBackup() {
        return this.isBackup;
    }

    public final Money getBuyingPower() {
        return this.isCrypto ? this.cryptoBuyingPower : this.equityBuyingPower;
    }

    private final RecurringPaymentMethodBottomSheet.Row getBuyingPowerRow() {
        if (this.showGenericBuyingPower) {
            return RecurringPaymentMethodBottomSheet.Row.GenericBuyingPower.INSTANCE;
        }
        if (getBuyingPower() == null) {
            return null;
        }
        if (this.isCrypto) {
            Money buyingPower = getBuyingPower();
            Intrinsics.checkNotNull(buyingPower);
            return new RecurringPaymentMethodBottomSheet.Row.CryptoBuyingPower(buyingPower);
        }
        Money buyingPower2 = getBuyingPower();
        Intrinsics.checkNotNull(buyingPower2);
        return new RecurringPaymentMethodBottomSheet.Row.EquityBuyingPower(buyingPower2);
    }

    public final List<RecurringPaymentMethodBottomSheet.Row> getRows() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List<AchRelationship> list = this.achRelationships;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecurringPaymentMethodBottomSheet.Row.AchRelationship((AchRelationship) it.next(), this.showPaymentMethodAnnotation));
        }
        listCreateListBuilder.addAll(arrayList);
        RecurringPaymentMethodBottomSheet.Row buyingPowerRow = getBuyingPowerRow();
        if (buyingPowerRow != null) {
            listCreateListBuilder.add(buyingPowerRow);
        }
        listCreateListBuilder.add(RecurringPaymentMethodBottomSheet.Row.AddAccount.INSTANCE);
        if (this.isBackup) {
            listCreateListBuilder.add(RecurringPaymentMethodBottomSheet.Row.RemoveBackup.INSTANCE);
        }
        return CollectionsKt.build(listCreateListBuilder);
    }

    public final RecurringContext getLoggingContext() {
        RecurringContext recurringContext = this.initialLoggingContext;
        if (recurringContext != null) {
            RecurringPaymentMethodBottomSheet.Row row = this.selectedRow;
            RecurringContext recurringContextCopy$default = RecurringContext.copy$default(recurringContext, null, null, null, null, Recurring2.toProtobuf(row != null ? row.getPaymentMethod() : null), 0.0d, null, null, 0.0d, null, null, 2031, null);
            if (recurringContextCopy$default != null) {
                return recurringContextCopy$default;
            }
        }
        return new RecurringContext(null, null, null, null, null, 0.0d, null, null, 0.0d, null, null, 2047, null);
    }

    public final StringResource getDisclaimerString() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        boolean z = this.isBackup;
        if (z && this.isCrypto) {
            i = C11595R.string.crypto_recurring_source_of_funds_ach_disclaimer;
        } else if (z) {
            i = C11595R.string.recurring_backup_payment_method_disclaimer_equity;
        } else {
            i = C11595R.string.recurring_unified_creation_flow_payment_method_disclaimer;
        }
        return companion.invoke(i, new Object[0]);
    }
}
