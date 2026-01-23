package com.robinhood.shared.feature.discovery.p382ui;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeatureDiscoveryViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState;", "", "Loading", "NoContent", "Loaded", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState$Loaded;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState$Loading;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState$NoContent;", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface FeatureDiscoveryViewState {

    /* compiled from: FeatureDiscoveryViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState$Loading;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements FeatureDiscoveryViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1105939056;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: FeatureDiscoveryViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState$NoContent;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NoContent implements FeatureDiscoveryViewState {
        public static final int $stable = 0;
        public static final NoContent INSTANCE = new NoContent();

        public boolean equals(Object other) {
            return this == other || (other instanceof NoContent);
        }

        public int hashCode() {
            return 2094981036;
        }

        public String toString() {
            return "NoContent";
        }

        private NoContent() {
        }
    }

    /* compiled from: FeatureDiscoveryViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState$Loaded;", "Lcom/robinhood/shared/feature/discovery/ui/FeatureDiscoveryViewState;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getComponent", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-feature-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements FeatureDiscoveryViewState {
        public static final int $stable = 8;
        private final UIComponent<GenericAction> component;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, UIComponent uIComponent, int i, Object obj) {
            if ((i & 1) != 0) {
                uIComponent = loaded.component;
            }
            return loaded.copy(uIComponent);
        }

        public final UIComponent<GenericAction> component1() {
            return this.component;
        }

        public final Loaded copy(UIComponent<? extends GenericAction> component) {
            Intrinsics.checkNotNullParameter(component, "component");
            return new Loaded(component);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.component, ((Loaded) other).component);
        }

        public int hashCode() {
            return this.component.hashCode();
        }

        public String toString() {
            return "Loaded(component=" + this.component + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(UIComponent<? extends GenericAction> component) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.component = component;
        }

        public final UIComponent<GenericAction> getComponent() {
            return this.component;
        }
    }
}
