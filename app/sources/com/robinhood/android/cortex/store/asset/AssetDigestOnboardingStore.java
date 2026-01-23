package com.robinhood.android.cortex.store.asset;

import bonfire.proto.idl.copilot.p032v1.CopilotService;
import bonfire.proto.idl.copilot.p032v1.FlowTypeDto;
import com.robinhood.android.cortex.models.asset.onboarding.AssetDigestOnboarding;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AssetDigestOnboardingStore.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\b\b\u0002\u0010\r\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;", "Lcom/robinhood/store/Store;", "copilotService", "Lbonfire/proto/idl/copilot/v1/CopilotService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lbonfire/proto/idl/copilot/v1/CopilotService;Lcom/robinhood/store/StoreBundle;)V", "onboardingEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lbonfire/proto/idl/copilot/v1/FlowTypeDto;", "Lcom/robinhood/android/cortex/models/asset/onboarding/AssetDigestOnboarding;", "fetchOnboarding", "flowType", "(Lbonfire/proto/idl/copilot/v1/FlowTypeDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pollOnboarding", "Lkotlinx/coroutines/flow/Flow;", "lib-store-cortex_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestOnboardingStore extends Store {
    public static final int $stable = 8;
    private final CopilotService copilotService;
    private final Endpoint<FlowTypeDto, AssetDigestOnboarding> onboardingEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetDigestOnboardingStore(CopilotService copilotService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(copilotService, "copilotService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.copilotService = copilotService;
        this.onboardingEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new AssetDigestOnboardingStore2(this, null), getLogoutKillswitch(), new AssetDigestOnboardingStore3(null), storeBundle.getClock(), null, 16, null);
    }

    public static /* synthetic */ Object fetchOnboarding$default(AssetDigestOnboardingStore assetDigestOnboardingStore, FlowTypeDto flowTypeDto, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            flowTypeDto = FlowTypeDto.TYPE_UNSPECIFIED;
        }
        return assetDigestOnboardingStore.fetchOnboarding(flowTypeDto, continuation);
    }

    public final Object fetchOnboarding(FlowTypeDto flowTypeDto, Continuation<? super AssetDigestOnboarding> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.onboardingEndpoint, flowTypeDto, null, continuation, 2, null);
    }

    public static /* synthetic */ Flow pollOnboarding$default(AssetDigestOnboardingStore assetDigestOnboardingStore, FlowTypeDto flowTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            flowTypeDto = FlowTypeDto.TYPE_UNSPECIFIED;
        }
        return assetDigestOnboardingStore.pollOnboarding(flowTypeDto);
    }

    public final Flow<AssetDigestOnboarding> pollOnboarding(FlowTypeDto flowType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        return Endpoint.DefaultImpls.poll$default(this.onboardingEndpoint, flowType, Durations.INSTANCE.getONE_SECOND(), null, 4, null);
    }
}
