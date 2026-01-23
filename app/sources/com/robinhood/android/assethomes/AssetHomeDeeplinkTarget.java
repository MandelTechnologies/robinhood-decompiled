package com.robinhood.android.assethomes;

import android.content.Context;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.equities.contracts.AssetHomeContract;
import com.robinhood.android.equities.contracts.ScreenerTableKeys2;
import com.robinhood.android.futures.contracts.FuturesAssetHomeFragmentKey;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.android.models.portfolio.api.AssetType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.DeepLinkIntentKey;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.FuturesTradingRegionGate;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.rosetta.eventlogging.PortfolioAccountType;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/assethomes/AssetHomeDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "resolveDestinationIntent", "feature-asset-homes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AssetHomeDeeplinkTarget extends DeeplinkTarget4 {
    public static final AssetHomeDeeplinkTarget INSTANCE = new AssetHomeDeeplinkTarget();
    public static final int $stable = 8;

    private AssetHomeDeeplinkTarget() {
        super(ScreenerTableKeys2.AssetHome, false, true, true, false, false, null, 114, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        Intent mainIntent = deeplinkContext.getMainIntent();
        Intent intentResolveDestinationIntent = resolveDestinationIntent(deeplinkContext);
        if (intentResolveDestinationIntent == null) {
            intentResolveDestinationIntent = Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new DeepLinkIntentKey.UnrecognizedDeepLink(false, false, null, 7, null), null, false, 12, null);
        }
        return new Intent[]{mainIntent, intentResolveDestinationIntent};
    }

    private final Intent resolveDestinationIntent(DeeplinkTarget2 deeplinkContext) {
        String upperCase;
        String lowerCase;
        Tuples2 tuples2M3642to;
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("asset_type");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter(InstantCashConstants.ACCOUNT_TYPE_KEY);
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("source");
        AssetType.Companion companion = AssetType.INSTANCE;
        if (queryParameter2 != null) {
            upperCase = queryParameter2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        AssetType assetTypeFromServerValue = companion.fromServerValue(upperCase);
        boolean regionGateState$default = DeeplinkTarget2.getRegionGateState$default(deeplinkContext, new RegionGate[]{EtfRegionGate.INSTANCE}, false, 2, null);
        if (assetTypeFromServerValue == AssetType.EQUITY && !regionGateState$default) {
            return null;
        }
        boolean regionGateState$default2 = DeeplinkTarget2.getRegionGateState$default(deeplinkContext, new RegionGate[]{OptionsRegionGate.INSTANCE}, false, 2, null);
        if (assetTypeFromServerValue == AssetType.OPTIONS && !regionGateState$default2) {
            return null;
        }
        boolean regionGateState$default3 = DeeplinkTarget2.getRegionGateState$default(deeplinkContext, new RegionGate[]{FuturesTradingRegionGate.INSTANCE}, false, 2, null);
        if (assetTypeFromServerValue == AssetType.FUTURES) {
            if (regionGateState$default3) {
                return Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new FuturesAssetHomeFragmentKey(queryParameter, new Screen(Screen.Name.NAME_UNSPECIFIED, queryParameter4 == null ? "" : queryParameter4, null, null, 12, null)), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
            }
            return null;
        }
        if (queryParameter3 != null) {
            lowerCase = queryParameter3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (Intrinsics.areEqual(lowerCase, "individual") || !Intrinsics.areEqual(lowerCase, "retirement")) {
            tuples2M3642to = Tuples4.m3642to(FragmentTab.HOME, PortfolioAccountType.INDIVIDUAL);
        } else {
            if (!DeeplinkTarget2.getRegionGateState$default(deeplinkContext, new RegionGate[]{RetirementRegionGate.INSTANCE}, false, 2, null)) {
                return null;
            }
            tuples2M3642to = Tuples4.m3642to(FragmentTab.RETIREMENT, PortfolioAccountType.RETIREMENT);
        }
        FragmentTab fragmentTab = (FragmentTab) tuples2M3642to.component1();
        PortfolioAccountType portfolioAccountType = (PortfolioAccountType) tuples2M3642to.component2();
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        if (assetTypeFromServerValue == null) {
            assetTypeFromServerValue = (AssetType) companion.getDefault();
        }
        return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new AssetHomeContract.Key(queryParameter, portfolioAccountType, assetTypeFromServerValue, new Screen(Screen.Name.NAME_UNSPECIFIED, queryParameter4 == null ? "" : queryParameter4, null, null, 12, null), fragmentTab), false, false, false, null, false, false, false, false, false, null, false, 8188, null);
    }
}
