package com.robinhood.android.options.comboorders.detail.components.infogrid;

import com.robinhood.android.options.combo.p207ui.UiComboOrder;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.bonfire.WithholdingAmount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailInfoGridDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDataState;", "", "uiComboOrder", "Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "withholdingAmountResponse", "Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "shouldShowCatFeeNewCopy", "", "userLocale", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/android/options/combo/ui/UiComboOrder;Lcom/robinhood/models/db/bonfire/WithholdingAmount;ZLcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getUiComboOrder", "()Lcom/robinhood/android/options/combo/ui/UiComboOrder;", "getWithholdingAmountResponse", "()Lcom/robinhood/models/db/bonfire/WithholdingAmount;", "getShouldShowCatFeeNewCopy", "()Z", "getUserLocale", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ComboOrderDetailInfoGridDataState {
    public static final int $stable = 8;
    private final boolean shouldShowCatFeeNewCopy;
    private final UiComboOrder uiComboOrder;
    private final CountryCode.Supported userLocale;
    private final WithholdingAmount withholdingAmountResponse;

    public ComboOrderDetailInfoGridDataState() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ ComboOrderDetailInfoGridDataState copy$default(ComboOrderDetailInfoGridDataState comboOrderDetailInfoGridDataState, UiComboOrder uiComboOrder, WithholdingAmount withholdingAmount, boolean z, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            uiComboOrder = comboOrderDetailInfoGridDataState.uiComboOrder;
        }
        if ((i & 2) != 0) {
            withholdingAmount = comboOrderDetailInfoGridDataState.withholdingAmountResponse;
        }
        if ((i & 4) != 0) {
            z = comboOrderDetailInfoGridDataState.shouldShowCatFeeNewCopy;
        }
        if ((i & 8) != 0) {
            supported = comboOrderDetailInfoGridDataState.userLocale;
        }
        return comboOrderDetailInfoGridDataState.copy(uiComboOrder, withholdingAmount, z, supported);
    }

    /* renamed from: component1, reason: from getter */
    public final UiComboOrder getUiComboOrder() {
        return this.uiComboOrder;
    }

    /* renamed from: component2, reason: from getter */
    public final WithholdingAmount getWithholdingAmountResponse() {
        return this.withholdingAmountResponse;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowCatFeeNewCopy() {
        return this.shouldShowCatFeeNewCopy;
    }

    /* renamed from: component4, reason: from getter */
    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }

    public final ComboOrderDetailInfoGridDataState copy(UiComboOrder uiComboOrder, WithholdingAmount withholdingAmountResponse, boolean shouldShowCatFeeNewCopy, CountryCode.Supported userLocale) {
        return new ComboOrderDetailInfoGridDataState(uiComboOrder, withholdingAmountResponse, shouldShowCatFeeNewCopy, userLocale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboOrderDetailInfoGridDataState)) {
            return false;
        }
        ComboOrderDetailInfoGridDataState comboOrderDetailInfoGridDataState = (ComboOrderDetailInfoGridDataState) other;
        return Intrinsics.areEqual(this.uiComboOrder, comboOrderDetailInfoGridDataState.uiComboOrder) && Intrinsics.areEqual(this.withholdingAmountResponse, comboOrderDetailInfoGridDataState.withholdingAmountResponse) && this.shouldShowCatFeeNewCopy == comboOrderDetailInfoGridDataState.shouldShowCatFeeNewCopy && Intrinsics.areEqual(this.userLocale, comboOrderDetailInfoGridDataState.userLocale);
    }

    public int hashCode() {
        UiComboOrder uiComboOrder = this.uiComboOrder;
        int iHashCode = (uiComboOrder == null ? 0 : uiComboOrder.hashCode()) * 31;
        WithholdingAmount withholdingAmount = this.withholdingAmountResponse;
        int iHashCode2 = (((iHashCode + (withholdingAmount == null ? 0 : withholdingAmount.hashCode())) * 31) + Boolean.hashCode(this.shouldShowCatFeeNewCopy)) * 31;
        CountryCode.Supported supported = this.userLocale;
        return iHashCode2 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "ComboOrderDetailInfoGridDataState(uiComboOrder=" + this.uiComboOrder + ", withholdingAmountResponse=" + this.withholdingAmountResponse + ", shouldShowCatFeeNewCopy=" + this.shouldShowCatFeeNewCopy + ", userLocale=" + this.userLocale + ")";
    }

    public ComboOrderDetailInfoGridDataState(UiComboOrder uiComboOrder, WithholdingAmount withholdingAmount, boolean z, CountryCode.Supported supported) {
        this.uiComboOrder = uiComboOrder;
        this.withholdingAmountResponse = withholdingAmount;
        this.shouldShowCatFeeNewCopy = z;
        this.userLocale = supported;
    }

    public /* synthetic */ ComboOrderDetailInfoGridDataState(UiComboOrder uiComboOrder, WithholdingAmount withholdingAmount, boolean z, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiComboOrder, (i & 2) != 0 ? null : withholdingAmount, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : supported);
    }

    public final UiComboOrder getUiComboOrder() {
        return this.uiComboOrder;
    }

    public final WithholdingAmount getWithholdingAmountResponse() {
        return this.withholdingAmountResponse;
    }

    public final boolean getShouldShowCatFeeNewCopy() {
        return this.shouldShowCatFeeNewCopy;
    }

    public final CountryCode.Supported getUserLocale() {
        return this.userLocale;
    }
}
