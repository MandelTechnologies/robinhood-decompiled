package com.robinhood.referral;

import android.app.Activity;
import android.content.Intent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CombinedAttributionManager.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u0002H\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/referral/CombinedAttributionManager;", "Lcom/robinhood/referral/AttributionManager;", "branchAttributionManager", "Lcom/robinhood/referral/BranchAttributionManager;", "singularAttributionManager", "Lcom/robinhood/referral/SingularAttributionManager;", "<init>", "(Lcom/robinhood/referral/BranchAttributionManager;Lcom/robinhood/referral/SingularAttributionManager;)V", "nextScreenFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/referral/AttributionNavigation;", "getNextScreenFlow", "()Lkotlinx/coroutines/flow/Flow;", "handleAttribution", "", "A", "Landroid/app/Activity;", "activity", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "(Landroid/app/Activity;Landroid/content/Intent;)V", "completeAttribution", "clearPersistedData", "resetNextScreenFlow", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CombinedAttributionManager implements AttributionManager {
    private final BranchAttributionManager branchAttributionManager;
    private final Flow<AttributionNavigation> nextScreenFlow;
    private final SingularAttributionManager singularAttributionManager;

    public CombinedAttributionManager(BranchAttributionManager branchAttributionManager, SingularAttributionManager singularAttributionManager) {
        Intrinsics.checkNotNullParameter(branchAttributionManager, "branchAttributionManager");
        Intrinsics.checkNotNullParameter(singularAttributionManager, "singularAttributionManager");
        this.branchAttributionManager = branchAttributionManager;
        this.singularAttributionManager = singularAttributionManager;
        this.nextScreenFlow = FlowKt.merge(branchAttributionManager.getNextScreenFlow(), singularAttributionManager.getNextScreenFlow());
    }

    @Override // com.robinhood.referral.AttributionManager
    public Flow<AttributionNavigation> getNextScreenFlow() {
        return this.nextScreenFlow;
    }

    @Override // com.robinhood.referral.AttributionManager
    public <A extends Activity> void handleAttribution(A activity, Intent data) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(data, "data");
        this.branchAttributionManager.handleAttribution(activity, data);
        this.singularAttributionManager.handleAttribution(activity, data);
    }

    @Override // com.robinhood.referral.AttributionManager
    public void completeAttribution() {
        this.branchAttributionManager.completeAttribution();
        this.singularAttributionManager.completeAttribution();
    }

    @Override // com.robinhood.referral.AttributionManager
    public void clearPersistedData() {
        this.branchAttributionManager.clearPersistedData();
        this.singularAttributionManager.clearPersistedData();
    }

    @Override // com.robinhood.referral.AttributionManager
    public void resetNextScreenFlow() {
        this.branchAttributionManager.resetNextScreenFlow();
        this.singularAttributionManager.resetNextScreenFlow();
    }
}
