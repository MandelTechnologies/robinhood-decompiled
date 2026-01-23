package com.robinhood.android.portfolio.pnl.p215ui;

import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.util.Money;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiProfitAndLossTradeGroup.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003JU\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;", "", "id", "", "displayName", "groupSize", "", "realizedReturn", "Lcom/robinhood/models/util/Money;", "realizedReturnPercentage", "Lcom/robinhood/idl/IdlDecimal;", "nullOutGroupPnl", "", "assetClasses", "", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/robinhood/models/util/Money;Lcom/robinhood/idl/IdlDecimal;ZLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getDisplayName", "getGroupSize", "()I", "getRealizedReturn", "()Lcom/robinhood/models/util/Money;", "getRealizedReturnPercentage", "()Lcom/robinhood/idl/IdlDecimal;", "getNullOutGroupPnl", "()Z", "getAssetClasses", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "lib-models-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UiProfitAndLossTradeGroup {
    private final List<AssetClass> assetClasses;
    private final String displayName;
    private final int groupSize;
    private final String id;
    private final boolean nullOutGroupPnl;
    private final Money realizedReturn;
    private final IdlDecimal realizedReturnPercentage;

    public static /* synthetic */ UiProfitAndLossTradeGroup copy$default(UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup, String str, String str2, int i, Money money, IdlDecimal idlDecimal, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uiProfitAndLossTradeGroup.id;
        }
        if ((i2 & 2) != 0) {
            str2 = uiProfitAndLossTradeGroup.displayName;
        }
        if ((i2 & 4) != 0) {
            i = uiProfitAndLossTradeGroup.groupSize;
        }
        if ((i2 & 8) != 0) {
            money = uiProfitAndLossTradeGroup.realizedReturn;
        }
        if ((i2 & 16) != 0) {
            idlDecimal = uiProfitAndLossTradeGroup.realizedReturnPercentage;
        }
        if ((i2 & 32) != 0) {
            z = uiProfitAndLossTradeGroup.nullOutGroupPnl;
        }
        if ((i2 & 64) != 0) {
            list = uiProfitAndLossTradeGroup.assetClasses;
        }
        boolean z2 = z;
        List list2 = list;
        IdlDecimal idlDecimal2 = idlDecimal;
        int i3 = i;
        return uiProfitAndLossTradeGroup.copy(str, str2, i3, money, idlDecimal2, z2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getGroupSize() {
        return this.groupSize;
    }

    /* renamed from: component4, reason: from getter */
    public final Money getRealizedReturn() {
        return this.realizedReturn;
    }

    /* renamed from: component5, reason: from getter */
    public final IdlDecimal getRealizedReturnPercentage() {
        return this.realizedReturnPercentage;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getNullOutGroupPnl() {
        return this.nullOutGroupPnl;
    }

    public final List<AssetClass> component7() {
        return this.assetClasses;
    }

    public final UiProfitAndLossTradeGroup copy(String id, String displayName, int groupSize, Money realizedReturn, IdlDecimal realizedReturnPercentage, boolean nullOutGroupPnl, List<? extends AssetClass> assetClasses) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(realizedReturn, "realizedReturn");
        Intrinsics.checkNotNullParameter(realizedReturnPercentage, "realizedReturnPercentage");
        Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
        return new UiProfitAndLossTradeGroup(id, displayName, groupSize, realizedReturn, realizedReturnPercentage, nullOutGroupPnl, assetClasses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiProfitAndLossTradeGroup)) {
            return false;
        }
        UiProfitAndLossTradeGroup uiProfitAndLossTradeGroup = (UiProfitAndLossTradeGroup) other;
        return Intrinsics.areEqual(this.id, uiProfitAndLossTradeGroup.id) && Intrinsics.areEqual(this.displayName, uiProfitAndLossTradeGroup.displayName) && this.groupSize == uiProfitAndLossTradeGroup.groupSize && Intrinsics.areEqual(this.realizedReturn, uiProfitAndLossTradeGroup.realizedReturn) && Intrinsics.areEqual(this.realizedReturnPercentage, uiProfitAndLossTradeGroup.realizedReturnPercentage) && this.nullOutGroupPnl == uiProfitAndLossTradeGroup.nullOutGroupPnl && Intrinsics.areEqual(this.assetClasses, uiProfitAndLossTradeGroup.assetClasses);
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.displayName.hashCode()) * 31) + Integer.hashCode(this.groupSize)) * 31) + this.realizedReturn.hashCode()) * 31) + this.realizedReturnPercentage.hashCode()) * 31) + Boolean.hashCode(this.nullOutGroupPnl)) * 31) + this.assetClasses.hashCode();
    }

    public String toString() {
        return "UiProfitAndLossTradeGroup(id=" + this.id + ", displayName=" + this.displayName + ", groupSize=" + this.groupSize + ", realizedReturn=" + this.realizedReturn + ", realizedReturnPercentage=" + this.realizedReturnPercentage + ", nullOutGroupPnl=" + this.nullOutGroupPnl + ", assetClasses=" + this.assetClasses + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiProfitAndLossTradeGroup(String id, String displayName, int i, Money realizedReturn, IdlDecimal realizedReturnPercentage, boolean z, List<? extends AssetClass> assetClasses) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(realizedReturn, "realizedReturn");
        Intrinsics.checkNotNullParameter(realizedReturnPercentage, "realizedReturnPercentage");
        Intrinsics.checkNotNullParameter(assetClasses, "assetClasses");
        this.id = id;
        this.displayName = displayName;
        this.groupSize = i;
        this.realizedReturn = realizedReturn;
        this.realizedReturnPercentage = realizedReturnPercentage;
        this.nullOutGroupPnl = z;
        this.assetClasses = assetClasses;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getGroupSize() {
        return this.groupSize;
    }

    public final Money getRealizedReturn() {
        return this.realizedReturn;
    }

    public final IdlDecimal getRealizedReturnPercentage() {
        return this.realizedReturnPercentage;
    }

    public final boolean getNullOutGroupPnl() {
        return this.nullOutGroupPnl;
    }

    public final List<AssetClass> getAssetClasses() {
        return this.assetClasses;
    }
}
