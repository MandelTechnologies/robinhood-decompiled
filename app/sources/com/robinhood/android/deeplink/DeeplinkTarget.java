package com.robinhood.android.deeplink;

import android.content.Intent;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.hammer.android.RequiresHammerPlugin;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: DeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u0019H&¢\u0006\u0002\u0010\u001aR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0012\u0010\u0013\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/deeplink/DeeplinkTarget;", "Lcom/robinhood/hammer/android/RequiresHammerPlugin;", "Lcom/robinhood/android/deeplink/BaseDeepLinkPath;", "deprecated", "", "getDeprecated", "()Z", "experiment", "Lcom/robinhood/experiments/ExperimentDeclaration;", "getExperiment", "()Lcom/robinhood/experiments/ExperimentDeclaration;", "isLongRunning", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRegionGates", "()Ljava/util/Set;", "requireAuthentication", "getRequireAuthentication", "shouldClearTop", "getShouldClearTop", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "Lcom/robinhood/android/deeplink/IdlDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "lib-deeplink_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface DeeplinkTarget extends RequiresHammerPlugin, BaseDeepLinkPath {
    boolean getDeprecated();

    ExperimentDeclaration<?> getExperiment();

    Intent[] getIntents(DeeplinkTarget2 deeplinkContext);

    Set<RegionGate> getRegionGates();

    boolean getRequireAuthentication();

    boolean getShouldClearTop();

    /* renamed from: isLongRunning */
    boolean getIsLongRunning();
}
