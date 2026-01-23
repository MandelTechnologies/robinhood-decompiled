package com.robinhood.android.eventcontracts.hub.p134v2.home;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.eventcontracts.contracts.EcUuidType;
import com.robinhood.android.eventcontracts.contracts.EventDetailRoutingFragmentKey;
import com.robinhood.android.eventcontracts.hub.p134v2.navigation.HubRootNavGraphDestinations2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.LocalLifecycleAwareNavigator;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HubNavigationCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000*\u0001\u0006\u001a\r\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\t\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"LocalHubNavigationCallbacks", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubNavigationCallbacks;", "getLocalHubNavigationCallbacks", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "defaultCallbacks", "com/robinhood/android/eventcontracts/hub/v2/home/HubNavigationCallbacksKt$defaultCallbacks$1", "Lcom/robinhood/android/eventcontracts/hub/v2/home/HubNavigationCallbacksKt$defaultCallbacks$1;", "rememberHubNavigationCallbacks", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/eventcontracts/hub/v2/home/HubNavigationCallbacks;", "EVENT_CONTRACT_DISCLOSURE_DETAIL_CONTENTFUL_ID", "", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.home.HubNavigationCallbacksKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class HubNavigationCallbacks2 {
    private static final String EVENT_CONTRACT_DISCLOSURE_DETAIL_CONTENTFUL_ID = "7v5SiKfRAKXLelb9mVpQ12";
    private static final CompositionLocal6<HubNavigationCallbacks> LocalHubNavigationCallbacks = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubNavigationCallbacksKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HubNavigationCallbacks2.defaultCallbacks;
        }
    });
    private static final HubNavigationCallbacks3 defaultCallbacks = new HubNavigationCallbacks() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubNavigationCallbacksKt$defaultCallbacks$1
        @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
        public void navigateToEventDetail(UUID eventId, UUID contractId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
        }

        @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
        public void openNewNodeScreen(UUID nodeId, String entryPointIdentifier) {
            Intrinsics.checkNotNullParameter(nodeId, "nodeId");
            Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
        }

        @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
        public void quotePillClicked(UUID eventId, UUID contractId) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
        }

        @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
        public void showEventContractDisclosure() {
        }
    };

    public static final CompositionLocal6<HubNavigationCallbacks> getLocalHubNavigationCallbacks() {
        return LocalHubNavigationCallbacks;
    }

    public static final HubNavigationCallbacks rememberHubNavigationCallbacks(Composer composer, int i) {
        composer.startReplaceGroup(-252026751);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-252026751, i, -1, "com.robinhood.android.eventcontracts.hub.v2.home.rememberHubNavigationCallbacks (HubNavigationCallbacks.kt:40)");
        }
        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final LifecycleAwareNavigator lifecycleAwareNavigator = (LifecycleAwareNavigator) composer.consume(LocalLifecycleAwareNavigator.getLocalLifecycleAwareNavigator());
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(navigator) | composer.changed(context) | composer.changed(lifecycleAwareNavigator);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new HubNavigationCallbacks() { // from class: com.robinhood.android.eventcontracts.hub.v2.home.HubNavigationCallbacksKt$rememberHubNavigationCallbacks$1$1
                @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
                public void navigateToEventDetail(UUID eventId, UUID contractId) {
                    EventDetailRoutingFragmentKey eventDetailRoutingFragmentKey;
                    Intrinsics.checkNotNullParameter(eventId, "eventId");
                    if (contractId == null) {
                        eventDetailRoutingFragmentKey = new EventDetailRoutingFragmentKey(eventId, EcUuidType.EVENT_ID, null, false, 12, null);
                    } else {
                        eventDetailRoutingFragmentKey = new EventDetailRoutingFragmentKey(contractId, EcUuidType.CONTRACT_ID, null, false, 12, null);
                    }
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, eventDetailRoutingFragmentKey, false, false, false, false, null, false, null, null, 1020, null);
                }

                @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
                public void openNewNodeScreen(UUID nodeId, String entryPointIdentifier) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(nodeId, "nodeId");
                    Intrinsics.checkNotNullParameter(entryPointIdentifier, "entryPointIdentifier");
                    LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, HubRootNavGraphDestinations2.INSTANCE, new HubRootNavGraphDestinations2.Args(entryPointIdentifier, nodeId, null, 4, null), null, null, false, null, 60, null);
                }

                @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
                public void showEventContractDisclosure() {
                    Navigator.DefaultImpls.startActivity$default(navigator, context, new RemoteDisclosureKey("7v5SiKfRAKXLelb9mVpQ12", null, false, false, RemoteDisclosureKey.TintOption.ACHROMATIC, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, null), null, false, null, NavigationType.PRESENT, 28, null);
                }

                @Override // com.robinhood.android.eventcontracts.hub.p134v2.home.HubNavigationCallbacks
                public void quotePillClicked(UUID eventId, UUID contractId) {
                    Intrinsics.checkNotNullParameter(eventId, "eventId");
                    Intrinsics.checkNotNullParameter(contractId, "contractId");
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new EventDetailRoutingFragmentKey(contractId, EcUuidType.CONTRACT_ID, "hub-pill", true), false, false, false, false, null, false, null, null, 1020, null);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        HubNavigationCallbacks4 hubNavigationCallbacks4 = (HubNavigationCallbacks4) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return hubNavigationCallbacks4;
    }
}
