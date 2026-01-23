package com.robinhood.android.trade.equity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.utils.extensions.StringsKt;
import com.singular.sdk.internal.Constants;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: InstrumentDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/deeplink/InstrumentDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class InstrumentDeeplinkTarget extends DeeplinkTarget4 {
    public static final InstrumentDeeplinkTarget INSTANCE = new InstrumentDeeplinkTarget();
    public static final int $stable = 8;

    /* compiled from: InstrumentDeeplinkTarget.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderSide.values().length];
            try {
                iArr[EquityOrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EquityOrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EquityOrderSide.SELL_SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private InstrumentDeeplinkTarget() {
        super("instrument", false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        Intent[] intentArr;
        int i;
        IntentKey equityOrderWithSymbol;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("symbol");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter2 != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter2);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            uuid2 = uuid;
        } else {
            uuid2 = null;
        }
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("account_number");
        if (uuid2 != null || queryParameter != null) {
            String queryParameter4 = deeplinkContext.getUri().getQueryParameter(Constants.RequestParamsKeys.DEVELOPER_API_KEY);
            if (queryParameter4 != null) {
                String queryParameter5 = deeplinkContext.getUri().getQueryParameter("completion_url");
                EquityOrderSide.Companion companion = EquityOrderSide.INSTANCE;
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = queryParameter4.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                EquityOrderSide equityOrderSideFromServerValue = companion.fromServerValue(lowerCase);
                int i2 = equityOrderSideFromServerValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[equityOrderSideFromServerValue.ordinal()];
                if (i2 == -1) {
                    throw new IllegalStateException(("Unknown action (side): " + queryParameter4).toString());
                }
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Cannot use a deeplink for SELL_SHORT orders. Use SELL instead.");
                }
                String queryParameter6 = deeplinkContext.getUri().getQueryParameter("action_source");
                Timber.INSTANCE.mo3356i("Handling InstrumentDeeplinkTarget symbol=" + queryParameter + " id=" + uuid2 + " action_source=" + queryParameter6, new Object[0]);
                EquityOrderFlowSource equityOrderFlowSourceFromDeepLinkActionSource$default = EquityOrderFlowSource.Companion.fromDeepLinkActionSource$default(EquityOrderFlowSource.INSTANCE, queryParameter6, false, 2, null);
                if (uuid2 != null) {
                    if (equityOrderFlowSourceFromDeepLinkActionSource$default == null) {
                        equityOrderFlowSourceFromDeepLinkActionSource$default = EquityOrderFlowSource.DEEPLINK_INSTRUMENT;
                    }
                    EquityOrderFlowSource equityOrderFlowSource = equityOrderFlowSourceFromDeepLinkActionSource$default;
                    i = 1;
                    equityOrderWithSymbol = new EquityOrderActivityIntentKey.WithId(uuid2, equityOrderSideFromServerValue, equityOrderFlowSource, null, queryParameter3, queryParameter5, null, false, false, WaitlistAnimationConstants.MIDDLE_YAW_FRAME, null);
                } else {
                    i = 1;
                    if (queryParameter == null) {
                        throw new IllegalStateException("Impossible!");
                    }
                    Intrinsics.checkNotNull(equityOrderSideFromServerValue);
                    equityOrderWithSymbol = new LegacyIntentKey.EquityOrderWithSymbol(queryParameter, equityOrderSideFromServerValue, queryParameter5, false, queryParameter3, 8, null);
                }
                intentArr = new Intent[i];
                intentArr[0] = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), equityOrderWithSymbol, null, false, 12, null);
            } else {
                InstrumentDetailSource instrumentDetailSourceFromServerValue = InstrumentDetailSource.INSTANCE.fromServerValue(deeplinkContext.getUri().getQueryParameter("source"), InstrumentDetailSource.DEEPLINK_INSTRUMENT);
                String queryParameter7 = deeplinkContext.getUri().getQueryParameter("show_in_tab");
                if (queryParameter7 == null) {
                    queryParameter7 = "true";
                }
                boolean z = Boolean.parseBoolean(queryParameter7);
                if (uuid2 != null) {
                    intentArr = new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new LegacyFragmentKey.EquityInstrumentDetail(uuid2, null, queryParameter3, instrumentDetailSourceFromServerValue, false, 18, null), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
                } else {
                    Navigator navigator = deeplinkContext.getNavigator();
                    Context context = deeplinkContext.getContext();
                    Intrinsics.checkNotNull(queryParameter);
                    intentArr = new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new LegacyFragmentKey.EquityInstrumentDetail(queryParameter, instrumentDetailSourceFromServerValue, queryParameter3), false, z, false, null, false, false, false, false, false, null, false, 8180, null)};
                }
            }
            return intentArr;
        }
        return new Intent[0];
    }
}
