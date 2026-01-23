package com.robinhood.android.common.recurring.detailPageView;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxDuxo;
import com.robinhood.android.crypto.lib.UiCurrencyPairs;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentsNuxDataState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDataState;", "", "args", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "<init>", "(Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;Lcom/robinhood/shared/app/type/AppType;)V", "getArgs", "()Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "launchRecurringButtonText", "Lcom/robinhood/utils/resource/StringResource;", "getLaunchRecurringButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "descriptionText", "getDescriptionText", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringInvestmentsNuxDataState {
    public static final int $stable = 0;
    private final AppType appType;
    private final RecurringInvestmentsNuxDuxo.InitArgs args;

    /* compiled from: RecurringInvestmentsNuxDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.TRADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.NCW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component2, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    public static /* synthetic */ RecurringInvestmentsNuxDataState copy$default(RecurringInvestmentsNuxDataState recurringInvestmentsNuxDataState, RecurringInvestmentsNuxDuxo.InitArgs initArgs, AppType appType, int i, Object obj) {
        if ((i & 1) != 0) {
            initArgs = recurringInvestmentsNuxDataState.args;
        }
        if ((i & 2) != 0) {
            appType = recurringInvestmentsNuxDataState.appType;
        }
        return recurringInvestmentsNuxDataState.copy(initArgs, appType);
    }

    /* renamed from: component1, reason: from getter */
    public final RecurringInvestmentsNuxDuxo.InitArgs getArgs() {
        return this.args;
    }

    public final RecurringInvestmentsNuxDataState copy(RecurringInvestmentsNuxDuxo.InitArgs args, AppType appType) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(appType, "appType");
        return new RecurringInvestmentsNuxDataState(args, appType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringInvestmentsNuxDataState)) {
            return false;
        }
        RecurringInvestmentsNuxDataState recurringInvestmentsNuxDataState = (RecurringInvestmentsNuxDataState) other;
        return Intrinsics.areEqual(this.args, recurringInvestmentsNuxDataState.args) && this.appType == recurringInvestmentsNuxDataState.appType;
    }

    public int hashCode() {
        return (this.args.hashCode() * 31) + this.appType.hashCode();
    }

    public String toString() {
        return "RecurringInvestmentsNuxDataState(args=" + this.args + ", appType=" + this.appType + ")";
    }

    public RecurringInvestmentsNuxDataState(RecurringInvestmentsNuxDuxo.InitArgs args, AppType appType) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.args = args;
        this.appType = appType;
    }

    public final RecurringInvestmentsNuxDuxo.InitArgs getArgs() {
        return this.args;
    }

    public final StringResource getLaunchRecurringButtonText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            RecurringInvestmentsNuxDuxo.InitArgs initArgs = this.args;
            if (initArgs instanceof RecurringInvestmentsNuxDuxo.InitArgs.Crypto) {
                return StringResource.INSTANCE.invoke(C11595R.string.recurring_crypto_nux_cta, ((RecurringInvestmentsNuxDuxo.InitArgs.Crypto) initArgs).getCurrencyPair().getAssetCurrency().getCode());
            }
            if (!(initArgs instanceof RecurringInvestmentsNuxDuxo.InitArgs.Equity)) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C11595R.string.instrument_detail_recurring_investments_nux_btn, ((RecurringInvestmentsNuxDuxo.InitArgs.Equity) initArgs).getSymbol());
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(this.appType);
            throw new ExceptionsH();
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = C11595R.string.recurring_crypto_nux_cta_global;
        RecurringInvestmentsNuxDuxo.InitArgs initArgs2 = this.args;
        Intrinsics.checkNotNull(initArgs2, "null cannot be cast to non-null type com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxDuxo.InitArgs.Crypto");
        return companion.invoke(i2, UiCurrencyPairs.getSymbolWithTypeSingular(((RecurringInvestmentsNuxDuxo.InitArgs.Crypto) initArgs2).getCurrencyPair()));
    }

    public final StringResource getDescriptionText() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return StringResource.INSTANCE.invoke(C11595R.string.recurring_crypto_nux_description_global_v2, new Object[0]);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(this.appType);
            throw new ExceptionsH();
        }
        RecurringInvestmentsNuxDuxo.InitArgs initArgs = this.args;
        if (initArgs instanceof RecurringInvestmentsNuxDuxo.InitArgs.Crypto) {
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_crypto_nux_description, ((RecurringInvestmentsNuxDuxo.InitArgs.Crypto) initArgs).getCurrencyPair().getAssetCurrency().getCode());
        }
        if (!(initArgs instanceof RecurringInvestmentsNuxDuxo.InitArgs.Equity)) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C11595R.string.instrument_detail_recurring_investments_nux, new Object[0]);
    }

    public final Screen.Name getScreenName() {
        RecurringInvestmentsNuxDuxo.InitArgs initArgs = this.args;
        if (initArgs instanceof RecurringInvestmentsNuxDuxo.InitArgs.Crypto) {
            return Screen.Name.CRYPTO_DETAIL_PAGE;
        }
        if (initArgs instanceof RecurringInvestmentsNuxDuxo.InitArgs.Equity) {
            return Screen.Name.STOCK_DETAIL_PAGE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
