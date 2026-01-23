package com.robinhood.shared.feature.discovery.p382ui;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.bonfire.FeatureDiscoveryResponse;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.shared.feature.discovery.p382ui.FeatureDiscoveryViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureDiscoveryDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryDataState;", "", "response", "Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "<init>", "(Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;)V", "getResponse", "()Lcom/robinhood/models/db/bonfire/FeatureDiscoveryResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FeatureDiscoveryDataState {
    private final FeatureDiscoveryResponse response;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureDiscoveryDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FeatureDiscoveryDataState copy$default(FeatureDiscoveryDataState featureDiscoveryDataState, FeatureDiscoveryResponse featureDiscoveryResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            featureDiscoveryResponse = featureDiscoveryDataState.response;
        }
        return featureDiscoveryDataState.copy(featureDiscoveryResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final FeatureDiscoveryResponse getResponse() {
        return this.response;
    }

    public final FeatureDiscoveryDataState copy(FeatureDiscoveryResponse response) {
        return new FeatureDiscoveryDataState(response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FeatureDiscoveryDataState) && Intrinsics.areEqual(this.response, ((FeatureDiscoveryDataState) other).response);
    }

    public int hashCode() {
        FeatureDiscoveryResponse featureDiscoveryResponse = this.response;
        if (featureDiscoveryResponse == null) {
            return 0;
        }
        return featureDiscoveryResponse.hashCode();
    }

    public String toString() {
        return "FeatureDiscoveryDataState(response=" + this.response + ")";
    }

    public FeatureDiscoveryDataState(FeatureDiscoveryResponse featureDiscoveryResponse) {
        this.response = featureDiscoveryResponse;
    }

    public /* synthetic */ FeatureDiscoveryDataState(FeatureDiscoveryResponse featureDiscoveryResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : featureDiscoveryResponse);
    }

    public final FeatureDiscoveryResponse getResponse() {
        return this.response;
    }

    /* compiled from: FeatureDiscoveryDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryDataState;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState;", "<init>", "()V", "reduce", "dataState", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<FeatureDiscoveryDataState, FeatureDiscoveryViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public FeatureDiscoveryViewState reduce(FeatureDiscoveryDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getResponse() == null) {
                return FeatureDiscoveryViewState.Loading.INSTANCE;
            }
            if (dataState.getResponse().getComponent() != null) {
                UIComponent<GenericAction> component = dataState.getResponse().getComponent();
                if (component != null) {
                    return new FeatureDiscoveryViewState.Loaded(component);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            return FeatureDiscoveryViewState.NoContent.INSTANCE;
        }
    }
}
