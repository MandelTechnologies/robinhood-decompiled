package com.robinhood.android.regiongate.compose;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;

/* compiled from: LocalityStringResources.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a3\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\"\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, m3636d2 = {"localityStringResource", "", "usResourceId", "", "gbResourceId", "sgResourceId", "(IIILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "regionGateStringResource", "regionGate", "Lcom/robinhood/android/regiongate/RegionGate;", "inRegionGateId", "notInRegionGateId", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "(Lcom/robinhood/android/regiongate/RegionGate;IILcom/robinhood/android/regiongate/RegionGateProvider;Landroidx/compose/runtime/Composer;II)Ljava/lang/String;", "LocalRegionGateProvider", "Lcom/robinhood/android/regiongate/compose/RegionGateProviderCompositionLocal;", "getLocalRegionGateProvider", "()Lcom/robinhood/android/regiongate/compose/RegionGateProviderCompositionLocal;", "lib-region-gate-compose_externalRelease", "inRegionGate", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.regiongate.compose.LocalityStringResourcesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class LocalityStringResources2 {
    private static final LocalityStringResources3 LocalRegionGateProvider = new LocalityStringResources3(null, 1, 0 == true ? 1 : 0);

    public static final String localityStringResource(int i, int i2, int i3, Composer composer, int i4) {
        String strStringResource;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-835291470, i4, -1, "com.robinhood.android.regiongate.compose.localityStringResource (LocalityStringResources.kt:28)");
        }
        CountryCode countryCode = (CountryCode) composer.consume(LocalityProvider.getLocalLocality());
        if (Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
            composer.startReplaceGroup(443789646);
            strStringResource = StringResources_androidKt.stringResource(i2, composer, (i4 >> 3) & 14);
            composer.endReplaceGroup();
        } else if (Intrinsics.areEqual(countryCode, CountryCode.Supported.UnitedStates.INSTANCE)) {
            composer.startReplaceGroup(443791918);
            strStringResource = StringResources_androidKt.stringResource(i, composer, i4 & 14);
            composer.endReplaceGroup();
        } else if (Intrinsics.areEqual(countryCode, CountryCode.Supported.Singapore.INSTANCE)) {
            composer.startReplaceGroup(443794094);
            strStringResource = StringResources_androidKt.stringResource(i3, composer, (i4 >> 6) & 14);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(872833260);
            composer.endReplaceGroup();
            strStringResource = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strStringResource;
    }

    public static final String regionGateStringResource(RegionGate regionGate, int i, int i2, RegionGateProvider regionGateProvider, Composer composer, int i3, int i4) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(regionGate, "regionGate");
        composer.startReplaceGroup(-1890883216);
        RegionGateProvider current = (i4 & 8) != 0 ? LocalRegionGateProvider.getCurrent(composer, 6) : regionGateProvider;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1890883216, i3, -1, "com.robinhood.android.regiongate.compose.regionGateStringResource (LocalityStringResources.kt:46)");
        }
        Boolean boolRegionGateStringResource$lambda$0 = regionGateStringResource$lambda$0(FlowExtKt.collectAsStateWithLifecycle((Flow<? extends Object>) RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(current, regionGate, false, 2, null), (Object) null, ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle(), (Lifecycle.State) null, (CoroutineContext) null, composer, 48, 12));
        if (Intrinsics.areEqual(boolRegionGateStringResource$lambda$0, Boolean.TRUE)) {
            composer.startReplaceGroup(-367588018);
            strStringResource = StringResources_androidKt.stringResource(i, composer, (i3 >> 3) & 14);
            composer.endReplaceGroup();
        } else if (Intrinsics.areEqual(boolRegionGateStringResource$lambda$0, Boolean.FALSE)) {
            composer.startReplaceGroup(-367586479);
            strStringResource = StringResources_androidKt.stringResource(i2, composer, (i3 >> 6) & 14);
            composer.endReplaceGroup();
        } else {
            if (boolRegionGateStringResource$lambda$0 != null) {
                composer.startReplaceGroup(-367589120);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1489769678);
            composer.endReplaceGroup();
            strStringResource = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strStringResource;
    }

    public static final LocalityStringResources3 getLocalRegionGateProvider() {
        return LocalRegionGateProvider;
    }

    private static final Boolean regionGateStringResource$lambda$0(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue();
    }
}
