package com.robinhood.android.common.options.tradebar;

import com.robinhood.android.indexes.models.p159db.Index;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.models.api.accountswitcher.OptionsAccountSwitcherId;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrumentPosition;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OptionStrategyInfo;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher;
import com.robinhood.models.p355ui.UiAggregateOptionPositionFull;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDetailPageTradebarDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u00049:;<B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010$\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030&¢\u0006\u0002\b'J\u001f\u0010(\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070&¢\u0006\u0002\b'J\u001f\u0010)\u001a\u00020\u00002\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050&¢\u0006\u0002\b'J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0007HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003Jg\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001J\u0013\u00104\u001a\u00020\r2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState;", "", "globalData", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$GlobalData;", "pageSpecificDerivedData", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "pageSpecificData", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificData;", "selfFetchMode", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "fixedAccountNumber", "", "shouldHideErrorBanner", "", "shouldHideStatLabelForSingleAccount", "source", "Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;", "useSduiAccountSwitcher", "<init>", "(Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$GlobalData;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificData;Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;Ljava/lang/String;ZZLcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;Z)V", "getGlobalData", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$GlobalData;", "getPageSpecificDerivedData", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "getPageSpecificData", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificData;", "getSelfFetchMode", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "getFixedAccountNumber", "()Ljava/lang/String;", "getShouldHideErrorBanner", "()Z", "getShouldHideStatLabelForSingleAccount", "getSource", "()Lcom/robinhood/android/common/options/tradebar/OptionsTradeBarSource;", "getUseSduiAccountSwitcher", "copyGlobalData", "copyMethod", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "copyPageSpecificData", "copyPageSpecificDerivedData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "GlobalData", "PageSpecificData", "PageSpecificDerivedData", "DataFetchMode", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OptionsDetailPageTradebarDataState {
    public static final int $stable = 8;
    private final String fixedAccountNumber;
    private final GlobalData globalData;
    private final PageSpecificData pageSpecificData;
    private final PageSpecificDerivedData pageSpecificDerivedData;
    private final DataFetchMode.SelfFetch selfFetchMode;
    private final boolean shouldHideErrorBanner;
    private final boolean shouldHideStatLabelForSingleAccount;
    private final OptionsTradeBarSource source;
    private final boolean useSduiAccountSwitcher;

    public static /* synthetic */ OptionsDetailPageTradebarDataState copy$default(OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState, GlobalData globalData, PageSpecificDerivedData pageSpecificDerivedData, PageSpecificData pageSpecificData, DataFetchMode.SelfFetch selfFetch, String str, boolean z, boolean z2, OptionsTradeBarSource optionsTradeBarSource, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            globalData = optionsDetailPageTradebarDataState.globalData;
        }
        if ((i & 2) != 0) {
            pageSpecificDerivedData = optionsDetailPageTradebarDataState.pageSpecificDerivedData;
        }
        if ((i & 4) != 0) {
            pageSpecificData = optionsDetailPageTradebarDataState.pageSpecificData;
        }
        if ((i & 8) != 0) {
            selfFetch = optionsDetailPageTradebarDataState.selfFetchMode;
        }
        if ((i & 16) != 0) {
            str = optionsDetailPageTradebarDataState.fixedAccountNumber;
        }
        if ((i & 32) != 0) {
            z = optionsDetailPageTradebarDataState.shouldHideErrorBanner;
        }
        if ((i & 64) != 0) {
            z2 = optionsDetailPageTradebarDataState.shouldHideStatLabelForSingleAccount;
        }
        if ((i & 128) != 0) {
            optionsTradeBarSource = optionsDetailPageTradebarDataState.source;
        }
        if ((i & 256) != 0) {
            z3 = optionsDetailPageTradebarDataState.useSduiAccountSwitcher;
        }
        OptionsTradeBarSource optionsTradeBarSource2 = optionsTradeBarSource;
        boolean z4 = z3;
        boolean z5 = z;
        boolean z6 = z2;
        String str2 = str;
        PageSpecificData pageSpecificData2 = pageSpecificData;
        return optionsDetailPageTradebarDataState.copy(globalData, pageSpecificDerivedData, pageSpecificData2, selfFetch, str2, z5, z6, optionsTradeBarSource2, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final GlobalData getGlobalData() {
        return this.globalData;
    }

    /* renamed from: component2, reason: from getter */
    public final PageSpecificDerivedData getPageSpecificDerivedData() {
        return this.pageSpecificDerivedData;
    }

    /* renamed from: component3, reason: from getter */
    public final PageSpecificData getPageSpecificData() {
        return this.pageSpecificData;
    }

    /* renamed from: component4, reason: from getter */
    public final DataFetchMode.SelfFetch getSelfFetchMode() {
        return this.selfFetchMode;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFixedAccountNumber() {
        return this.fixedAccountNumber;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldHideErrorBanner() {
        return this.shouldHideErrorBanner;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldHideStatLabelForSingleAccount() {
        return this.shouldHideStatLabelForSingleAccount;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionsTradeBarSource getSource() {
        return this.source;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    public final OptionsDetailPageTradebarDataState copy(GlobalData globalData, PageSpecificDerivedData pageSpecificDerivedData, PageSpecificData pageSpecificData, DataFetchMode.SelfFetch selfFetchMode, String fixedAccountNumber, boolean shouldHideErrorBanner, boolean shouldHideStatLabelForSingleAccount, OptionsTradeBarSource source, boolean useSduiAccountSwitcher) {
        Intrinsics.checkNotNullParameter(globalData, "globalData");
        Intrinsics.checkNotNullParameter(pageSpecificDerivedData, "pageSpecificDerivedData");
        Intrinsics.checkNotNullParameter(pageSpecificData, "pageSpecificData");
        Intrinsics.checkNotNullParameter(source, "source");
        return new OptionsDetailPageTradebarDataState(globalData, pageSpecificDerivedData, pageSpecificData, selfFetchMode, fixedAccountNumber, shouldHideErrorBanner, shouldHideStatLabelForSingleAccount, source, useSduiAccountSwitcher);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageTradebarDataState)) {
            return false;
        }
        OptionsDetailPageTradebarDataState optionsDetailPageTradebarDataState = (OptionsDetailPageTradebarDataState) other;
        return Intrinsics.areEqual(this.globalData, optionsDetailPageTradebarDataState.globalData) && Intrinsics.areEqual(this.pageSpecificDerivedData, optionsDetailPageTradebarDataState.pageSpecificDerivedData) && Intrinsics.areEqual(this.pageSpecificData, optionsDetailPageTradebarDataState.pageSpecificData) && Intrinsics.areEqual(this.selfFetchMode, optionsDetailPageTradebarDataState.selfFetchMode) && Intrinsics.areEqual(this.fixedAccountNumber, optionsDetailPageTradebarDataState.fixedAccountNumber) && this.shouldHideErrorBanner == optionsDetailPageTradebarDataState.shouldHideErrorBanner && this.shouldHideStatLabelForSingleAccount == optionsDetailPageTradebarDataState.shouldHideStatLabelForSingleAccount && this.source == optionsDetailPageTradebarDataState.source && this.useSduiAccountSwitcher == optionsDetailPageTradebarDataState.useSduiAccountSwitcher;
    }

    public int hashCode() {
        int iHashCode = ((((this.globalData.hashCode() * 31) + this.pageSpecificDerivedData.hashCode()) * 31) + this.pageSpecificData.hashCode()) * 31;
        DataFetchMode.SelfFetch selfFetch = this.selfFetchMode;
        int iHashCode2 = (iHashCode + (selfFetch == null ? 0 : selfFetch.hashCode())) * 31;
        String str = this.fixedAccountNumber;
        return ((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldHideErrorBanner)) * 31) + Boolean.hashCode(this.shouldHideStatLabelForSingleAccount)) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.useSduiAccountSwitcher);
    }

    public String toString() {
        return "OptionsDetailPageTradebarDataState(globalData=" + this.globalData + ", pageSpecificDerivedData=" + this.pageSpecificDerivedData + ", pageSpecificData=" + this.pageSpecificData + ", selfFetchMode=" + this.selfFetchMode + ", fixedAccountNumber=" + this.fixedAccountNumber + ", shouldHideErrorBanner=" + this.shouldHideErrorBanner + ", shouldHideStatLabelForSingleAccount=" + this.shouldHideStatLabelForSingleAccount + ", source=" + this.source + ", useSduiAccountSwitcher=" + this.useSduiAccountSwitcher + ")";
    }

    public OptionsDetailPageTradebarDataState(GlobalData globalData, PageSpecificDerivedData pageSpecificDerivedData, PageSpecificData pageSpecificData, DataFetchMode.SelfFetch selfFetch, String str, boolean z, boolean z2, OptionsTradeBarSource source, boolean z3) {
        Intrinsics.checkNotNullParameter(globalData, "globalData");
        Intrinsics.checkNotNullParameter(pageSpecificDerivedData, "pageSpecificDerivedData");
        Intrinsics.checkNotNullParameter(pageSpecificData, "pageSpecificData");
        Intrinsics.checkNotNullParameter(source, "source");
        this.globalData = globalData;
        this.pageSpecificDerivedData = pageSpecificDerivedData;
        this.pageSpecificData = pageSpecificData;
        this.selfFetchMode = selfFetch;
        this.fixedAccountNumber = str;
        this.shouldHideErrorBanner = z;
        this.shouldHideStatLabelForSingleAccount = z2;
        this.source = source;
        this.useSduiAccountSwitcher = z3;
    }

    public /* synthetic */ OptionsDetailPageTradebarDataState(GlobalData globalData, PageSpecificDerivedData pageSpecificDerivedData, PageSpecificData pageSpecificData, DataFetchMode.SelfFetch selfFetch, String str, boolean z, boolean z2, OptionsTradeBarSource optionsTradeBarSource, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GlobalData(null, null, null, null, false, false, 63, null) : globalData, (i & 2) != 0 ? new PageSpecificDerivedData(null, null, null, null, null, null, false, null, null, null, null, null, 4095, null) : pageSpecificDerivedData, (i & 4) != 0 ? new PageSpecificData(false, 0L, 3, null) : pageSpecificData, (i & 8) != 0 ? null : selfFetch, (i & 16) != 0 ? null : str, z, z2, optionsTradeBarSource, (i & 256) != 0 ? false : z3);
    }

    public final GlobalData getGlobalData() {
        return this.globalData;
    }

    public final PageSpecificDerivedData getPageSpecificDerivedData() {
        return this.pageSpecificDerivedData;
    }

    public final PageSpecificData getPageSpecificData() {
        return this.pageSpecificData;
    }

    public final DataFetchMode.SelfFetch getSelfFetchMode() {
        return this.selfFetchMode;
    }

    public final String getFixedAccountNumber() {
        return this.fixedAccountNumber;
    }

    public final boolean getShouldHideErrorBanner() {
        return this.shouldHideErrorBanner;
    }

    public final boolean getShouldHideStatLabelForSingleAccount() {
        return this.shouldHideStatLabelForSingleAccount;
    }

    public final OptionsTradeBarSource getSource() {
        return this.source;
    }

    public final boolean getUseSduiAccountSwitcher() {
        return this.useSduiAccountSwitcher;
    }

    /* compiled from: OptionsDetailPageTradebarDataState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$GlobalData;", "", "allAccounts", "", "Lcom/robinhood/models/db/Account;", "currentAccount", "optionSettings", "Lcom/robinhood/models/db/OptionSettings;", "currentOrNextMarketDates", "Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "isLegContext", "", "inSelloutImprovementExperiment", "<init>", "(Ljava/util/List;Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/OptionSettings;Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;ZZ)V", "getAllAccounts", "()Ljava/util/List;", "getCurrentAccount", "()Lcom/robinhood/models/db/Account;", "getOptionSettings", "()Lcom/robinhood/models/db/OptionSettings;", "getCurrentOrNextMarketDates", "()Lcom/robinhood/models/db/OptionCurrentOrNextMarketDates;", "()Z", "getInSelloutImprovementExperiment", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class GlobalData {
        public static final int $stable = 8;
        private final List<Account> allAccounts;
        private final Account currentAccount;
        private final OptionCurrentOrNextMarketDates currentOrNextMarketDates;
        private final boolean inSelloutImprovementExperiment;
        private final boolean isLegContext;
        private final OptionSettings optionSettings;

        public GlobalData() {
            this(null, null, null, null, false, false, 63, null);
        }

        public static /* synthetic */ GlobalData copy$default(GlobalData globalData, List list, Account account, OptionSettings optionSettings, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = globalData.allAccounts;
            }
            if ((i & 2) != 0) {
                account = globalData.currentAccount;
            }
            if ((i & 4) != 0) {
                optionSettings = globalData.optionSettings;
            }
            if ((i & 8) != 0) {
                optionCurrentOrNextMarketDates = globalData.currentOrNextMarketDates;
            }
            if ((i & 16) != 0) {
                z = globalData.isLegContext;
            }
            if ((i & 32) != 0) {
                z2 = globalData.inSelloutImprovementExperiment;
            }
            boolean z3 = z;
            boolean z4 = z2;
            return globalData.copy(list, account, optionSettings, optionCurrentOrNextMarketDates, z3, z4);
        }

        public final List<Account> component1() {
            return this.allAccounts;
        }

        /* renamed from: component2, reason: from getter */
        public final Account getCurrentAccount() {
            return this.currentAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionSettings getOptionSettings() {
            return this.optionSettings;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
            return this.currentOrNextMarketDates;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsLegContext() {
            return this.isLegContext;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getInSelloutImprovementExperiment() {
            return this.inSelloutImprovementExperiment;
        }

        public final GlobalData copy(List<Account> allAccounts, Account currentAccount, OptionSettings optionSettings, OptionCurrentOrNextMarketDates currentOrNextMarketDates, boolean isLegContext, boolean inSelloutImprovementExperiment) {
            Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
            return new GlobalData(allAccounts, currentAccount, optionSettings, currentOrNextMarketDates, isLegContext, inSelloutImprovementExperiment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GlobalData)) {
                return false;
            }
            GlobalData globalData = (GlobalData) other;
            return Intrinsics.areEqual(this.allAccounts, globalData.allAccounts) && Intrinsics.areEqual(this.currentAccount, globalData.currentAccount) && Intrinsics.areEqual(this.optionSettings, globalData.optionSettings) && Intrinsics.areEqual(this.currentOrNextMarketDates, globalData.currentOrNextMarketDates) && this.isLegContext == globalData.isLegContext && this.inSelloutImprovementExperiment == globalData.inSelloutImprovementExperiment;
        }

        public int hashCode() {
            int iHashCode = this.allAccounts.hashCode() * 31;
            Account account = this.currentAccount;
            int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
            OptionSettings optionSettings = this.optionSettings;
            int iHashCode3 = (iHashCode2 + (optionSettings == null ? 0 : optionSettings.hashCode())) * 31;
            OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates = this.currentOrNextMarketDates;
            return ((((iHashCode3 + (optionCurrentOrNextMarketDates != null ? optionCurrentOrNextMarketDates.hashCode() : 0)) * 31) + Boolean.hashCode(this.isLegContext)) * 31) + Boolean.hashCode(this.inSelloutImprovementExperiment);
        }

        public String toString() {
            return "GlobalData(allAccounts=" + this.allAccounts + ", currentAccount=" + this.currentAccount + ", optionSettings=" + this.optionSettings + ", currentOrNextMarketDates=" + this.currentOrNextMarketDates + ", isLegContext=" + this.isLegContext + ", inSelloutImprovementExperiment=" + this.inSelloutImprovementExperiment + ")";
        }

        public GlobalData(List<Account> allAccounts, Account account, OptionSettings optionSettings, OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDates, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(allAccounts, "allAccounts");
            this.allAccounts = allAccounts;
            this.currentAccount = account;
            this.optionSettings = optionSettings;
            this.currentOrNextMarketDates = optionCurrentOrNextMarketDates;
            this.isLegContext = z;
            this.inSelloutImprovementExperiment = z2;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ GlobalData(java.util.List r2, com.robinhood.models.p320db.Account r3, com.robinhood.models.p320db.OptionSettings r4, com.robinhood.models.p320db.OptionCurrentOrNextMarketDates r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Le
                r3 = r0
            Le:
                r9 = r8 & 4
                if (r9 == 0) goto L13
                r4 = r0
            L13:
                r9 = r8 & 8
                if (r9 == 0) goto L18
                r5 = r0
            L18:
                r9 = r8 & 16
                r0 = 0
                if (r9 == 0) goto L1e
                r6 = r0
            L1e:
                r8 = r8 & 32
                if (r8 == 0) goto L2a
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L31
            L2a:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L31:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState.GlobalData.<init>(java.util.List, com.robinhood.models.db.Account, com.robinhood.models.db.OptionSettings, com.robinhood.models.db.OptionCurrentOrNextMarketDates, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<Account> getAllAccounts() {
            return this.allAccounts;
        }

        public final Account getCurrentAccount() {
            return this.currentAccount;
        }

        public final OptionSettings getOptionSettings() {
            return this.optionSettings;
        }

        public final OptionCurrentOrNextMarketDates getCurrentOrNextMarketDates() {
            return this.currentOrNextMarketDates;
        }

        public final boolean isLegContext() {
            return this.isLegContext;
        }

        public final boolean getInSelloutImprovementExperiment() {
            return this.inSelloutImprovementExperiment;
        }
    }

    /* compiled from: OptionsDetailPageTradebarDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificData;", "", "loadingAccountSwitcher", "", "timestampTradeButtonTapped", "", "<init>", "(ZJ)V", "getLoadingAccountSwitcher", "()Z", "getTimestampTradeButtonTapped", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PageSpecificData {
        public static final int $stable = 0;
        private final boolean loadingAccountSwitcher;
        private final long timestampTradeButtonTapped;

        public PageSpecificData() {
            this(false, 0L, 3, null);
        }

        public static /* synthetic */ PageSpecificData copy$default(PageSpecificData pageSpecificData, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pageSpecificData.loadingAccountSwitcher;
            }
            if ((i & 2) != 0) {
                j = pageSpecificData.timestampTradeButtonTapped;
            }
            return pageSpecificData.copy(z, j);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getLoadingAccountSwitcher() {
            return this.loadingAccountSwitcher;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestampTradeButtonTapped() {
            return this.timestampTradeButtonTapped;
        }

        public final PageSpecificData copy(boolean loadingAccountSwitcher, long timestampTradeButtonTapped) {
            return new PageSpecificData(loadingAccountSwitcher, timestampTradeButtonTapped);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageSpecificData)) {
                return false;
            }
            PageSpecificData pageSpecificData = (PageSpecificData) other;
            return this.loadingAccountSwitcher == pageSpecificData.loadingAccountSwitcher && this.timestampTradeButtonTapped == pageSpecificData.timestampTradeButtonTapped;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.loadingAccountSwitcher) * 31) + Long.hashCode(this.timestampTradeButtonTapped);
        }

        public String toString() {
            return "PageSpecificData(loadingAccountSwitcher=" + this.loadingAccountSwitcher + ", timestampTradeButtonTapped=" + this.timestampTradeButtonTapped + ")";
        }

        public PageSpecificData(boolean z, long j) {
            this.loadingAccountSwitcher = z;
            this.timestampTradeButtonTapped = j;
        }

        public /* synthetic */ PageSpecificData(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
        }

        public final boolean getLoadingAccountSwitcher() {
            return this.loadingAccountSwitcher;
        }

        public final long getTimestampTradeButtonTapped() {
            return this.timestampTradeButtonTapped;
        }
    }

    /* compiled from: OptionsDetailPageTradebarDataState.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0095\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\u0013\u0010N\u001a\u00020\u000f2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020QHÖ\u0001J\t\u0010R\u001a\u00020SHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u00104\u001a\u0004\u0018\u000105¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u00108\u001a\u0004\u0018\u000109¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0019\u0010<\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006T"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "", "direction", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "indexInstrument", "Lcom/robinhood/android/indexes/models/db/Index;", "equityQuote", "Lcom/robinhood/models/db/Quote;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "oppositePositionFromWatchlist", "Lcom/robinhood/models/db/OptionInstrumentPosition;", "optionsAccountSwitcher", "Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "showRollingActionItem", "", "uiAggregatePositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "uiOptionInstrumentPositionIncludingZeroQuantity", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "uiOptionUnderlier", "Lcom/robinhood/models/ui/UiOptionUnderlier;", "uiStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "uiOptionChain", "Lcom/robinhood/models/ui/UiOptionChain;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/Direction;Lcom/robinhood/android/indexes/models/db/Index;Lcom/robinhood/models/db/Quote;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/models/db/OptionInstrumentPosition;Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;ZLcom/robinhood/models/ui/UiAggregateOptionPositionFull;Lcom/robinhood/models/ui/UiOptionInstrumentPosition;Lcom/robinhood/models/ui/UiOptionUnderlier;Lcom/robinhood/models/ui/UiOptionStrategyInfo;Lcom/robinhood/models/ui/UiOptionChain;)V", "getDirection", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "getIndexInstrument", "()Lcom/robinhood/android/indexes/models/db/Index;", "getEquityQuote", "()Lcom/robinhood/models/db/Quote;", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getOppositePositionFromWatchlist", "()Lcom/robinhood/models/db/OptionInstrumentPosition;", "getOptionsAccountSwitcher", "()Lcom/robinhood/models/db/accountswitcher/OptionsAccountSwitcher;", "getShowRollingActionItem", "()Z", "getUiAggregatePositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiAggregateOptionPositionFull;", "getUiOptionInstrumentPositionIncludingZeroQuantity", "()Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "getUiOptionUnderlier", "()Lcom/robinhood/models/ui/UiOptionUnderlier;", "getUiStrategyInfo", "()Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "getUiOptionChain", "()Lcom/robinhood/models/ui/UiOptionChain;", "optionsAccountSwitcherId", "Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "getOptionsAccountSwitcherId", "()Lcom/robinhood/models/api/accountswitcher/OptionsAccountSwitcherId;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "chainIds", "", "Ljava/util/UUID;", "getChainIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class PageSpecificDerivedData {
        public static final int $stable = 8;
        private final List<UUID> chainIds;
        private final Direction direction;
        private final Quote equityQuote;
        private final Index indexInstrument;
        private final IndexValue indexValue;
        private final OptionInstrumentPosition oppositePositionFromWatchlist;
        private final OptionsAccountSwitcher optionsAccountSwitcher;
        private final OptionsAccountSwitcherId optionsAccountSwitcherId;
        private final boolean showRollingActionItem;
        private final UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity;
        private final UiOptionChain uiOptionChain;
        private final UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity;
        private final UiOptionUnderlier uiOptionUnderlier;
        private final UiOptionStrategyInfo uiStrategyInfo;
        private final UnderlyingQuote underlyingQuote;

        /* compiled from: OptionsDetailPageTradebarDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OptionChain.UnderlyingType.values().length];
                try {
                    iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public PageSpecificDerivedData() {
            this(null, null, null, null, null, null, false, null, null, null, null, null, 4095, null);
        }

        public static /* synthetic */ PageSpecificDerivedData copy$default(PageSpecificDerivedData pageSpecificDerivedData, Direction direction, Index index, Quote quote, IndexValue indexValue, OptionInstrumentPosition optionInstrumentPosition, OptionsAccountSwitcher optionsAccountSwitcher, boolean z, UiAggregateOptionPositionFull uiAggregateOptionPosition2, UiOptionInstrumentPosition uiOptionInstrumentPosition, UiOptionUnderlier uiOptionUnderlier, UiOptionStrategyInfo uiOptionStrategyInfo, UiOptionChain uiOptionChain, int i, Object obj) {
            if ((i & 1) != 0) {
                direction = pageSpecificDerivedData.direction;
            }
            if ((i & 2) != 0) {
                index = pageSpecificDerivedData.indexInstrument;
            }
            if ((i & 4) != 0) {
                quote = pageSpecificDerivedData.equityQuote;
            }
            if ((i & 8) != 0) {
                indexValue = pageSpecificDerivedData.indexValue;
            }
            if ((i & 16) != 0) {
                optionInstrumentPosition = pageSpecificDerivedData.oppositePositionFromWatchlist;
            }
            if ((i & 32) != 0) {
                optionsAccountSwitcher = pageSpecificDerivedData.optionsAccountSwitcher;
            }
            if ((i & 64) != 0) {
                z = pageSpecificDerivedData.showRollingActionItem;
            }
            if ((i & 128) != 0) {
                uiAggregateOptionPosition2 = pageSpecificDerivedData.uiAggregatePositionIncludingZeroQuantity;
            }
            if ((i & 256) != 0) {
                uiOptionInstrumentPosition = pageSpecificDerivedData.uiOptionInstrumentPositionIncludingZeroQuantity;
            }
            if ((i & 512) != 0) {
                uiOptionUnderlier = pageSpecificDerivedData.uiOptionUnderlier;
            }
            if ((i & 1024) != 0) {
                uiOptionStrategyInfo = pageSpecificDerivedData.uiStrategyInfo;
            }
            if ((i & 2048) != 0) {
                uiOptionChain = pageSpecificDerivedData.uiOptionChain;
            }
            UiOptionStrategyInfo uiOptionStrategyInfo2 = uiOptionStrategyInfo;
            UiOptionChain uiOptionChain2 = uiOptionChain;
            UiOptionInstrumentPosition uiOptionInstrumentPosition2 = uiOptionInstrumentPosition;
            UiOptionUnderlier uiOptionUnderlier2 = uiOptionUnderlier;
            boolean z2 = z;
            UiAggregateOptionPositionFull uiAggregateOptionPosition22 = uiAggregateOptionPosition2;
            OptionInstrumentPosition optionInstrumentPosition2 = optionInstrumentPosition;
            OptionsAccountSwitcher optionsAccountSwitcher2 = optionsAccountSwitcher;
            return pageSpecificDerivedData.copy(direction, index, quote, indexValue, optionInstrumentPosition2, optionsAccountSwitcher2, z2, uiAggregateOptionPosition22, uiOptionInstrumentPosition2, uiOptionUnderlier2, uiOptionStrategyInfo2, uiOptionChain2);
        }

        /* renamed from: component1, reason: from getter */
        public final Direction getDirection() {
            return this.direction;
        }

        /* renamed from: component10, reason: from getter */
        public final UiOptionUnderlier getUiOptionUnderlier() {
            return this.uiOptionUnderlier;
        }

        /* renamed from: component11, reason: from getter */
        public final UiOptionStrategyInfo getUiStrategyInfo() {
            return this.uiStrategyInfo;
        }

        /* renamed from: component12, reason: from getter */
        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        /* renamed from: component2, reason: from getter */
        public final Index getIndexInstrument() {
            return this.indexInstrument;
        }

        /* renamed from: component3, reason: from getter */
        public final Quote getEquityQuote() {
            return this.equityQuote;
        }

        /* renamed from: component4, reason: from getter */
        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionInstrumentPosition getOppositePositionFromWatchlist() {
            return this.oppositePositionFromWatchlist;
        }

        /* renamed from: component6, reason: from getter */
        public final OptionsAccountSwitcher getOptionsAccountSwitcher() {
            return this.optionsAccountSwitcher;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShowRollingActionItem() {
            return this.showRollingActionItem;
        }

        /* renamed from: component8, reason: from getter */
        public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
            return this.uiAggregatePositionIncludingZeroQuantity;
        }

        /* renamed from: component9, reason: from getter */
        public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
            return this.uiOptionInstrumentPositionIncludingZeroQuantity;
        }

        public final PageSpecificDerivedData copy(Direction direction, Index indexInstrument, Quote equityQuote, IndexValue indexValue, OptionInstrumentPosition oppositePositionFromWatchlist, OptionsAccountSwitcher optionsAccountSwitcher, boolean showRollingActionItem, UiAggregateOptionPositionFull uiAggregatePositionIncludingZeroQuantity, UiOptionInstrumentPosition uiOptionInstrumentPositionIncludingZeroQuantity, UiOptionUnderlier uiOptionUnderlier, UiOptionStrategyInfo uiStrategyInfo, UiOptionChain uiOptionChain) {
            Intrinsics.checkNotNullParameter(direction, "direction");
            return new PageSpecificDerivedData(direction, indexInstrument, equityQuote, indexValue, oppositePositionFromWatchlist, optionsAccountSwitcher, showRollingActionItem, uiAggregatePositionIncludingZeroQuantity, uiOptionInstrumentPositionIncludingZeroQuantity, uiOptionUnderlier, uiStrategyInfo, uiOptionChain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageSpecificDerivedData)) {
                return false;
            }
            PageSpecificDerivedData pageSpecificDerivedData = (PageSpecificDerivedData) other;
            return this.direction == pageSpecificDerivedData.direction && Intrinsics.areEqual(this.indexInstrument, pageSpecificDerivedData.indexInstrument) && Intrinsics.areEqual(this.equityQuote, pageSpecificDerivedData.equityQuote) && Intrinsics.areEqual(this.indexValue, pageSpecificDerivedData.indexValue) && Intrinsics.areEqual(this.oppositePositionFromWatchlist, pageSpecificDerivedData.oppositePositionFromWatchlist) && Intrinsics.areEqual(this.optionsAccountSwitcher, pageSpecificDerivedData.optionsAccountSwitcher) && this.showRollingActionItem == pageSpecificDerivedData.showRollingActionItem && Intrinsics.areEqual(this.uiAggregatePositionIncludingZeroQuantity, pageSpecificDerivedData.uiAggregatePositionIncludingZeroQuantity) && Intrinsics.areEqual(this.uiOptionInstrumentPositionIncludingZeroQuantity, pageSpecificDerivedData.uiOptionInstrumentPositionIncludingZeroQuantity) && Intrinsics.areEqual(this.uiOptionUnderlier, pageSpecificDerivedData.uiOptionUnderlier) && Intrinsics.areEqual(this.uiStrategyInfo, pageSpecificDerivedData.uiStrategyInfo) && Intrinsics.areEqual(this.uiOptionChain, pageSpecificDerivedData.uiOptionChain);
        }

        public int hashCode() {
            int iHashCode = this.direction.hashCode() * 31;
            Index index = this.indexInstrument;
            int iHashCode2 = (iHashCode + (index == null ? 0 : index.hashCode())) * 31;
            Quote quote = this.equityQuote;
            int iHashCode3 = (iHashCode2 + (quote == null ? 0 : quote.hashCode())) * 31;
            IndexValue indexValue = this.indexValue;
            int iHashCode4 = (iHashCode3 + (indexValue == null ? 0 : indexValue.hashCode())) * 31;
            OptionInstrumentPosition optionInstrumentPosition = this.oppositePositionFromWatchlist;
            int iHashCode5 = (iHashCode4 + (optionInstrumentPosition == null ? 0 : optionInstrumentPosition.hashCode())) * 31;
            OptionsAccountSwitcher optionsAccountSwitcher = this.optionsAccountSwitcher;
            int iHashCode6 = (((iHashCode5 + (optionsAccountSwitcher == null ? 0 : optionsAccountSwitcher.hashCode())) * 31) + Boolean.hashCode(this.showRollingActionItem)) * 31;
            UiAggregateOptionPositionFull uiAggregateOptionPosition2 = this.uiAggregatePositionIncludingZeroQuantity;
            int iHashCode7 = (iHashCode6 + (uiAggregateOptionPosition2 == null ? 0 : uiAggregateOptionPosition2.hashCode())) * 31;
            UiOptionInstrumentPosition uiOptionInstrumentPosition = this.uiOptionInstrumentPositionIncludingZeroQuantity;
            int iHashCode8 = (iHashCode7 + (uiOptionInstrumentPosition == null ? 0 : uiOptionInstrumentPosition.hashCode())) * 31;
            UiOptionUnderlier uiOptionUnderlier = this.uiOptionUnderlier;
            int iHashCode9 = (iHashCode8 + (uiOptionUnderlier == null ? 0 : uiOptionUnderlier.hashCode())) * 31;
            UiOptionStrategyInfo uiOptionStrategyInfo = this.uiStrategyInfo;
            int iHashCode10 = (iHashCode9 + (uiOptionStrategyInfo == null ? 0 : uiOptionStrategyInfo.hashCode())) * 31;
            UiOptionChain uiOptionChain = this.uiOptionChain;
            return iHashCode10 + (uiOptionChain != null ? uiOptionChain.hashCode() : 0);
        }

        public String toString() {
            return "PageSpecificDerivedData(direction=" + this.direction + ", indexInstrument=" + this.indexInstrument + ", equityQuote=" + this.equityQuote + ", indexValue=" + this.indexValue + ", oppositePositionFromWatchlist=" + this.oppositePositionFromWatchlist + ", optionsAccountSwitcher=" + this.optionsAccountSwitcher + ", showRollingActionItem=" + this.showRollingActionItem + ", uiAggregatePositionIncludingZeroQuantity=" + this.uiAggregatePositionIncludingZeroQuantity + ", uiOptionInstrumentPositionIncludingZeroQuantity=" + this.uiOptionInstrumentPositionIncludingZeroQuantity + ", uiOptionUnderlier=" + this.uiOptionUnderlier + ", uiStrategyInfo=" + this.uiStrategyInfo + ", uiOptionChain=" + this.uiOptionChain + ")";
        }

        public PageSpecificDerivedData(Direction direction, Index index, Quote quote, IndexValue indexValue, OptionInstrumentPosition optionInstrumentPosition, OptionsAccountSwitcher optionsAccountSwitcher, boolean z, UiAggregateOptionPositionFull uiAggregateOptionPosition2, UiOptionInstrumentPosition uiOptionInstrumentPosition, UiOptionUnderlier uiOptionUnderlier, UiOptionStrategyInfo uiOptionStrategyInfo, UiOptionChain uiOptionChain) {
            OptionsAccountSwitcherId strategyCode;
            OptionStrategyInfo optionStrategyInfo;
            Instrument instrument;
            OptionChain optionChain;
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.direction = direction;
            this.indexInstrument = index;
            this.equityQuote = quote;
            this.indexValue = indexValue;
            this.oppositePositionFromWatchlist = optionInstrumentPosition;
            this.optionsAccountSwitcher = optionsAccountSwitcher;
            this.showRollingActionItem = z;
            this.uiAggregatePositionIncludingZeroQuantity = uiAggregateOptionPosition2;
            this.uiOptionInstrumentPositionIncludingZeroQuantity = uiOptionInstrumentPosition;
            this.uiOptionUnderlier = uiOptionUnderlier;
            this.uiStrategyInfo = uiOptionStrategyInfo;
            this.uiOptionChain = uiOptionChain;
            List<UUID> listListOf = null;
            if (uiAggregateOptionPosition2 != null) {
                strategyCode = new OptionsAccountSwitcherId.AggregatePositionId(uiAggregateOptionPosition2.getId());
            } else if (uiOptionInstrumentPosition != null) {
                strategyCode = new OptionsAccountSwitcherId.InstrumentId(uiOptionInstrumentPosition.getOptionInstrument().getId());
            } else {
                strategyCode = ((uiOptionStrategyInfo == null || (optionStrategyInfo = uiOptionStrategyInfo.getOptionStrategyInfo()) == null) ? null : optionStrategyInfo.getStrategyCode()) != null ? new OptionsAccountSwitcherId.StrategyCode(uiOptionStrategyInfo.getOptionStrategyInfo().getStrategyCode()) : null;
            }
            this.optionsAccountSwitcherId = strategyCode;
            this.underlyingQuote = UnderlyingQuote.INSTANCE.getUnderlyingQuote(quote, indexValue);
            OptionChain.UnderlyingType underlyingType = uiOptionStrategyInfo != null ? uiOptionStrategyInfo.getUnderlyingType() : null;
            int i = underlyingType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[underlyingType.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    UUID tradableChainId = (uiOptionChain == null || (optionChain = uiOptionChain.getOptionChain()) == null || (tradableChainId = optionChain.getId()) == null) ? (uiOptionUnderlier == null || (instrument = uiOptionUnderlier.getInstrument()) == null) ? null : instrument.getTradableChainId() : tradableChainId;
                    if (tradableChainId != null) {
                        listListOf = CollectionsKt.listOf(tradableChainId);
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (index != null) {
                        listListOf = index.getTradableChainIds();
                    }
                }
            }
            this.chainIds = listListOf;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ PageSpecificDerivedData(com.robinhood.models.serverdriven.experimental.api.Direction r2, com.robinhood.android.indexes.models.p159db.Index r3, com.robinhood.models.p320db.Quote r4, com.robinhood.android.indexes.models.p159db.IndexValue r5, com.robinhood.models.p320db.OptionInstrumentPosition r6, com.robinhood.models.p320db.accountswitcher.OptionsAccountSwitcher r7, boolean r8, com.robinhood.models.p355ui.UiAggregateOptionPositionFull r9, com.robinhood.models.p355ui.UiOptionInstrumentPosition r10, com.robinhood.models.p355ui.UiOptionUnderlier r11, com.robinhood.models.p355ui.UiOptionStrategyInfo r12, com.robinhood.models.p355ui.UiOptionChain r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r1 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L6
                com.robinhood.models.serverdriven.experimental.api.Direction r2 = com.robinhood.models.serverdriven.experimental.api.Direction.f5855UP
            L6:
                r15 = r14 & 2
                r0 = 0
                if (r15 == 0) goto Lc
                r3 = r0
            Lc:
                r15 = r14 & 4
                if (r15 == 0) goto L11
                r4 = r0
            L11:
                r15 = r14 & 8
                if (r15 == 0) goto L16
                r5 = r0
            L16:
                r15 = r14 & 16
                if (r15 == 0) goto L1b
                r6 = r0
            L1b:
                r15 = r14 & 32
                if (r15 == 0) goto L20
                r7 = r0
            L20:
                r15 = r14 & 64
                if (r15 == 0) goto L25
                r8 = 0
            L25:
                r15 = r14 & 128(0x80, float:1.794E-43)
                if (r15 == 0) goto L2a
                r9 = r0
            L2a:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L2f
                r10 = r0
            L2f:
                r15 = r14 & 512(0x200, float:7.175E-43)
                if (r15 == 0) goto L34
                r11 = r0
            L34:
                r15 = r14 & 1024(0x400, float:1.435E-42)
                if (r15 == 0) goto L39
                r12 = r0
            L39:
                r14 = r14 & 2048(0x800, float:2.87E-42)
                if (r14 == 0) goto L4b
                r15 = r0
                r13 = r11
                r14 = r12
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L58
            L4b:
                r15 = r13
                r14 = r12
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L58:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState.PageSpecificDerivedData.<init>(com.robinhood.models.serverdriven.experimental.api.Direction, com.robinhood.android.indexes.models.db.Index, com.robinhood.models.db.Quote, com.robinhood.android.indexes.models.db.IndexValue, com.robinhood.models.db.OptionInstrumentPosition, com.robinhood.models.db.accountswitcher.OptionsAccountSwitcher, boolean, com.robinhood.models.ui.UiAggregateOptionPositionFull, com.robinhood.models.ui.UiOptionInstrumentPosition, com.robinhood.models.ui.UiOptionUnderlier, com.robinhood.models.ui.UiOptionStrategyInfo, com.robinhood.models.ui.UiOptionChain, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final Index getIndexInstrument() {
            return this.indexInstrument;
        }

        public final Quote getEquityQuote() {
            return this.equityQuote;
        }

        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        public final OptionInstrumentPosition getOppositePositionFromWatchlist() {
            return this.oppositePositionFromWatchlist;
        }

        public final OptionsAccountSwitcher getOptionsAccountSwitcher() {
            return this.optionsAccountSwitcher;
        }

        public final boolean getShowRollingActionItem() {
            return this.showRollingActionItem;
        }

        public final UiAggregateOptionPositionFull getUiAggregatePositionIncludingZeroQuantity() {
            return this.uiAggregatePositionIncludingZeroQuantity;
        }

        public final UiOptionInstrumentPosition getUiOptionInstrumentPositionIncludingZeroQuantity() {
            return this.uiOptionInstrumentPositionIncludingZeroQuantity;
        }

        public final UiOptionUnderlier getUiOptionUnderlier() {
            return this.uiOptionUnderlier;
        }

        public final UiOptionStrategyInfo getUiStrategyInfo() {
            return this.uiStrategyInfo;
        }

        public final UiOptionChain getUiOptionChain() {
            return this.uiOptionChain;
        }

        public final OptionsAccountSwitcherId getOptionsAccountSwitcherId() {
            return this.optionsAccountSwitcherId;
        }

        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }

        public final List<UUID> getChainIds() {
            return this.chainIds;
        }
    }

    public final OptionsDetailPageTradebarDataState copyGlobalData(Function1<? super GlobalData, GlobalData> copyMethod) {
        Intrinsics.checkNotNullParameter(copyMethod, "copyMethod");
        return copy$default(this, copyMethod.invoke(this.globalData), null, null, null, null, false, false, null, false, 510, null);
    }

    public final OptionsDetailPageTradebarDataState copyPageSpecificData(Function1<? super PageSpecificData, PageSpecificData> copyMethod) {
        Intrinsics.checkNotNullParameter(copyMethod, "copyMethod");
        return copy$default(this, null, null, copyMethod.invoke(this.pageSpecificData), null, null, false, false, null, false, 507, null);
    }

    public final OptionsDetailPageTradebarDataState copyPageSpecificDerivedData(Function1<? super PageSpecificDerivedData, PageSpecificDerivedData> copyMethod) {
        Intrinsics.checkNotNullParameter(copyMethod, "copyMethod");
        return copy$default(this, null, copyMethod.invoke(this.pageSpecificDerivedData), null, null, null, false, false, null, false, 509, null);
    }

    /* compiled from: OptionsDetailPageTradebarDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode;", "", "isLegContext", "", "<init>", "(Z)V", "()Z", "PassIn", "SelfFetch", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$PassIn;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class DataFetchMode {
        public static final int $stable = 0;
        private final boolean isLegContext;

        public /* synthetic */ DataFetchMode(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        private DataFetchMode(boolean z) {
            this.isLegContext = z;
        }

        /* renamed from: isLegContext, reason: from getter */
        public boolean getIsLegContext() {
            return this.isLegContext;
        }

        /* compiled from: OptionsDetailPageTradebarDataState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$PassIn;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode;", "pageSpecificDerivedData", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "isLegContext", "", "<init>", "(Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;Z)V", "getPageSpecificDerivedData", "()Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$PageSpecificDerivedData;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PassIn extends DataFetchMode {
            public static final int $stable = 8;
            private final boolean isLegContext;
            private final PageSpecificDerivedData pageSpecificDerivedData;

            public static /* synthetic */ PassIn copy$default(PassIn passIn, PageSpecificDerivedData pageSpecificDerivedData, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    pageSpecificDerivedData = passIn.pageSpecificDerivedData;
                }
                if ((i & 2) != 0) {
                    z = passIn.isLegContext;
                }
                return passIn.copy(pageSpecificDerivedData, z);
            }

            /* renamed from: component1, reason: from getter */
            public final PageSpecificDerivedData getPageSpecificDerivedData() {
                return this.pageSpecificDerivedData;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsLegContext() {
                return this.isLegContext;
            }

            public final PassIn copy(PageSpecificDerivedData pageSpecificDerivedData, boolean isLegContext) {
                Intrinsics.checkNotNullParameter(pageSpecificDerivedData, "pageSpecificDerivedData");
                return new PassIn(pageSpecificDerivedData, isLegContext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PassIn)) {
                    return false;
                }
                PassIn passIn = (PassIn) other;
                return Intrinsics.areEqual(this.pageSpecificDerivedData, passIn.pageSpecificDerivedData) && this.isLegContext == passIn.isLegContext;
            }

            public int hashCode() {
                return (this.pageSpecificDerivedData.hashCode() * 31) + Boolean.hashCode(this.isLegContext);
            }

            public String toString() {
                return "PassIn(pageSpecificDerivedData=" + this.pageSpecificDerivedData + ", isLegContext=" + this.isLegContext + ")";
            }

            public final PageSpecificDerivedData getPageSpecificDerivedData() {
                return this.pageSpecificDerivedData;
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState.DataFetchMode
            /* renamed from: isLegContext */
            public boolean getIsLegContext() {
                return this.isLegContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PassIn(PageSpecificDerivedData pageSpecificDerivedData, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(pageSpecificDerivedData, "pageSpecificDerivedData");
                this.pageSpecificDerivedData = pageSpecificDerivedData;
                this.isLegContext = z;
            }
        }

        /* compiled from: OptionsDetailPageTradebarDataState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode$SelfFetch;", "Lcom/robinhood/android/common/options/tradebar/OptionsDetailPageTradebarDataState$DataFetchMode;", "activeChartSpan", "Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "strategyCode", "", "isLegContext", "", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;Ljava/lang/String;Z)V", "getActiveChartSpan", "()Lcom/robinhood/models/serverdriven/experimental/api/DisplaySpan;", "getStrategyCode", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-options-trade-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SelfFetch extends DataFetchMode {
            public static final int $stable = 0;
            private final DisplaySpan activeChartSpan;
            private final boolean isLegContext;
            private final String strategyCode;

            public static /* synthetic */ SelfFetch copy$default(SelfFetch selfFetch, DisplaySpan displaySpan, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    displaySpan = selfFetch.activeChartSpan;
                }
                if ((i & 2) != 0) {
                    str = selfFetch.strategyCode;
                }
                if ((i & 4) != 0) {
                    z = selfFetch.isLegContext;
                }
                return selfFetch.copy(displaySpan, str, z);
            }

            /* renamed from: component1, reason: from getter */
            public final DisplaySpan getActiveChartSpan() {
                return this.activeChartSpan;
            }

            /* renamed from: component2, reason: from getter */
            public final String getStrategyCode() {
                return this.strategyCode;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsLegContext() {
                return this.isLegContext;
            }

            public final SelfFetch copy(DisplaySpan activeChartSpan, String strategyCode, boolean isLegContext) {
                Intrinsics.checkNotNullParameter(activeChartSpan, "activeChartSpan");
                Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
                return new SelfFetch(activeChartSpan, strategyCode, isLegContext);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelfFetch)) {
                    return false;
                }
                SelfFetch selfFetch = (SelfFetch) other;
                return this.activeChartSpan == selfFetch.activeChartSpan && Intrinsics.areEqual(this.strategyCode, selfFetch.strategyCode) && this.isLegContext == selfFetch.isLegContext;
            }

            public int hashCode() {
                return (((this.activeChartSpan.hashCode() * 31) + this.strategyCode.hashCode()) * 31) + Boolean.hashCode(this.isLegContext);
            }

            public String toString() {
                return "SelfFetch(activeChartSpan=" + this.activeChartSpan + ", strategyCode=" + this.strategyCode + ", isLegContext=" + this.isLegContext + ")";
            }

            public final DisplaySpan getActiveChartSpan() {
                return this.activeChartSpan;
            }

            public final String getStrategyCode() {
                return this.strategyCode;
            }

            @Override // com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarDataState.DataFetchMode
            /* renamed from: isLegContext */
            public boolean getIsLegContext() {
                return this.isLegContext;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SelfFetch(DisplaySpan activeChartSpan, String strategyCode, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(activeChartSpan, "activeChartSpan");
                Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
                this.activeChartSpan = activeChartSpan;
                this.strategyCode = strategyCode;
                this.isLegContext = z;
            }
        }
    }
}
