package com.robinhood.referral;

import android.app.Activity;
import android.content.Intent;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AttributionManager.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0012J'\u0010\u0007\u001a\u00020\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\t2\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\bH&J\b\u0010\u0010\u001a\u00020\bH&J\b\u0010\u0011\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/referral/AttributionManager;", "", "nextScreenFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/referral/AttributionNavigation;", "getNextScreenFlow", "()Lkotlinx/coroutines/flow/Flow;", "handleAttribution", "", "A", "Landroid/app/Activity;", "activity", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "(Landroid/app/Activity;Landroid/content/Intent;)V", "completeAttribution", "clearPersistedData", "resetNextScreenFlow", "Empty", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface AttributionManager {
    void clearPersistedData();

    void completeAttribution();

    Flow<AttributionNavigation> getNextScreenFlow();

    <A extends Activity> void handleAttribution(A activity, Intent data);

    void resetNextScreenFlow();

    /* compiled from: AttributionManager.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/referral/AttributionManager$Empty;", "Lcom/robinhood/referral/AttributionManager;", "<init>", "()V", "nextScreenFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/referral/AttributionNavigation;", "getNextScreenFlow", "()Lkotlinx/coroutines/flow/Flow;", "handleAttribution", "", "A", "Landroid/app/Activity;", "activity", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "(Landroid/app/Activity;Landroid/content/Intent;)V", "completeAttribution", "clearPersistedData", "resetNextScreenFlow", "lib-referral_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Empty implements AttributionManager {
        public static final Empty INSTANCE = new Empty();
        private static final Flow<AttributionNavigation> nextScreenFlow = FlowKt.flowOf((Object[]) new AttributionNavigation[0]);

        @Override // com.robinhood.referral.AttributionManager
        public void clearPersistedData() {
        }

        @Override // com.robinhood.referral.AttributionManager
        public void completeAttribution() {
        }

        @Override // com.robinhood.referral.AttributionManager
        public <A extends Activity> void handleAttribution(A activity, Intent data) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(data, "data");
        }

        @Override // com.robinhood.referral.AttributionManager
        public void resetNextScreenFlow() {
        }

        private Empty() {
        }

        @Override // com.robinhood.referral.AttributionManager
        public Flow<AttributionNavigation> getNextScreenFlow() {
            return nextScreenFlow;
        }
    }
}
