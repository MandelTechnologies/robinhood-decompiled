package com.robinhood.android.common.buysell;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.Tradability;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BuySellHelper.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0005J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J*\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0005J.\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u0005H\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/BuySellHelper;", "", "<init>", "()V", "isOptionEnabled", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/buysell/BuySellData;", "activeOptionChain", "Lcom/robinhood/models/db/OptionChain;", "optionPositions", "", "Lcom/robinhood/models/ui/UiOptionInstrumentPosition;", "ignoreOptionsAccess", "isLadderEnabled", "isInEtfSupportedRegion", "ladderSupportsInstrument", "instrument", "Lcom/robinhood/models/db/Instrument;", "ladderSupportsAccount", "account", "Lcom/robinhood/models/db/Account;", "getTradabilityError", "", "context", "Landroid/content/Context;", "subzeroMember", "isEtfEnabled", "getTradabilityErrorStringResource", "Lcom/robinhood/utils/resource/StringResource;", "localityStringResources", "Lcom/robinhood/android/common/buysell/LocalityStringResources;", "BuySellHelperEntryPoint", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BuySellHelper {
    public static final BuySellHelper INSTANCE = new BuySellHelper();

    /* compiled from: BuySellHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/BuySellHelper$BuySellHelperEntryPoint;", "", "buySellLocalityStringResources", "Lcom/robinhood/android/common/buysell/LocalityStringResources;", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface BuySellHelperEntryPoint {
        LocalityStringResources buySellLocalityStringResources();
    }

    /* compiled from: BuySellHelper.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BuySellHelper() {
    }

    public final String getTradabilityError(Context context, BuySellData data, boolean subzeroMember, boolean isEtfEnabled) throws Resources.NotFoundException {
        ComponentCallbacks2 componentCallbacks2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (context instanceof Application) {
            componentCallbacks2 = (Application) context;
        } else {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            componentCallbacks2 = (Application) applicationContext;
        }
        StringResource tradabilityErrorStringResource = getTradabilityErrorStringResource(data, subzeroMember, ((BuySellHelperEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).buySellLocalityStringResources(), isEtfEnabled);
        if (tradabilityErrorStringResource == null) {
            return null;
        }
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        CharSequence text = tradabilityErrorStringResource.getText(resources);
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final boolean isOptionEnabled(BuySellData data, OptionChain activeOptionChain, List<UiOptionInstrumentPosition> optionPositions, boolean ignoreOptionsAccess) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(optionPositions, "optionPositions");
        return (!data.getAccountIsManaged() && ((data.getAccountHasAccessToOptions() || (ignoreOptionsAccess && data.getAccountCanUpgradeToOptions())) && activeOptionChain != null)) || !optionPositions.isEmpty();
    }

    public final boolean isLadderEnabled(BuySellData data, boolean isInEtfSupportedRegion) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ladderSupportsInstrument(data.getInstrument(), isInEtfSupportedRegion) && ladderSupportsAccount(data.getAccount());
    }

    private final boolean ladderSupportsInstrument(Instrument instrument, boolean isInEtfSupportedRegion) {
        if (instrument.getAffiliateTradability() == Tradability.TRADABLE) {
            return isInEtfSupportedRegion || !instrument.isEtp();
        }
        return false;
    }

    private final boolean ladderSupportsAccount(Account account) {
        return (account == null || account.isManaged()) ? false : true;
    }

    public static /* synthetic */ String getTradabilityError$default(BuySellHelper buySellHelper, Context context, BuySellData buySellData, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return buySellHelper.getTradabilityError(context, buySellData, z, z2);
    }

    public static /* synthetic */ StringResource getTradabilityErrorStringResource$default(BuySellHelper buySellHelper, BuySellData buySellData, boolean z, LocalityStringResources localityStringResources, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            localityStringResources = null;
        }
        return buySellHelper.getTradabilityErrorStringResource(buySellData, z, localityStringResources, z2);
    }

    @SuppressLint({"UsingCodegenResourceDirectly"})
    public final StringResource getTradabilityErrorStringResource(BuySellData data, boolean subzeroMember, LocalityStringResources localityStringResources, boolean isEtfEnabled) {
        StringResource stringResourceInvoke;
        Intrinsics.checkNotNullParameter(data, "data");
        Instrument instrument = data.getInstrument();
        Tradability affiliateTradability = instrument.getAffiliateTradability();
        if (affiliateTradability == Tradability.UNTRADABLE) {
            if (data.getInstrument().isEtp() && !isEtfEnabled) {
                return StringResource.INSTANCE.invoke(C11070R.string.gated_etf_instrument_detail_buysell_error, new Object[0]);
            }
            if (data.getUserHasShares()) {
                return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_not_tradeable, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_not_tradeable_no_position, new Object[0]);
        }
        if (affiliateTradability == Tradability.POSITION_CLOSING_ONLY) {
            if (data.getUserHasShares()) {
                return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_position_closing_only, new Object[0]);
            }
            if (Intrinsics.areEqual(instrument.getType(), Instrument.TYPE_WRT)) {
                return StringResource.INSTANCE.invoke(C11070R.string.f3975x20e1c4de, new Object[0]);
            }
            return StringResource.INSTANCE.invoke(C11070R.string.f3974x5935bb00, new Object[0]);
        }
        if (!instrument.isActive()) {
            String state = instrument.getState();
            if (Intrinsics.areEqual(state, Instrument.STATE_INACTIVE)) {
                return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_instrument_inactive, new Object[0]);
            }
            if (Intrinsics.areEqual(state, Instrument.STATE_UNLISTED)) {
                return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_instrument_unlisted, new Object[0]);
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(instrument.getState());
            throw new ExceptionsH();
        }
        if (data.getIsTradingHalted()) {
            return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_trading_halted, new Object[0]);
        }
        if (data.getHasAccount() && data.getAccountRestrictsOpeningPositions()) {
            Account account = data.getAccount();
            BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
            switch (brokerageAccountType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
                case -1:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return StringResource.INSTANCE.invoke(C11070R.string.f3972x634745a4, new Object[0]);
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    return StringResource.INSTANCE.invoke(C11070R.string.f3976x6c3b1e10, new Object[0]);
                case 2:
                    return StringResource.INSTANCE.invoke(C11070R.string.f3977x5b817b5e, new Object[0]);
                case 3:
                    return StringResource.INSTANCE.invoke(C11070R.string.f3973x7a721894, new Object[0]);
            }
        }
        if (data.isInMarginCall()) {
            if (subzeroMember) {
                return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_margin_call_subzero, new Object[0]);
            }
            return (localityStringResources == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(localityStringResources.getInstrument_detail_buy_error_margin_call())) == null) ? StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_margin_call, new Object[0]) : stringResourceInvoke;
        }
        if (data.getHasAccount()) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C11070R.string.instrument_detail_buysell_error_no_account, new Object[0]);
    }
}
