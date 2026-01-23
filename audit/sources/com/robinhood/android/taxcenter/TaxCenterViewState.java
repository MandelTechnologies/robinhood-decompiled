package com.robinhood.android.taxcenter;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TaxCenterViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterViewState;", "", "<init>", "()V", "Loading", "Ready", "Lcom/robinhood/android/taxcenter/TaxCenterViewState$Loading;", "Lcom/robinhood/android/taxcenter/TaxCenterViewState$Ready;", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public abstract class TaxCenterViewState {
    public static final int $stable = 0;

    public /* synthetic */ TaxCenterViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private TaxCenterViewState() {
    }

    /* compiled from: TaxCenterViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterViewState$Loading;", "Lcom/robinhood/android/taxcenter/TaxCenterViewState;", "<init>", "()V", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends TaxCenterViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: TaxCenterViewState.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterViewState$Ready;", "Lcom/robinhood/android/taxcenter/TaxCenterViewState;", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "taxCenterFeatureGateState", "", "<init>", "(Ljava/util/List;Z)V", "getContent", "()Ljava/util/List;", "getTaxCenterFeatureGateState", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready extends TaxCenterViewState {
        public static final int $stable = 8;
        private final List<UIComponent<GenericAction>> content;
        private final boolean taxCenterFeatureGateState;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = ready.content;
            }
            if ((i & 2) != 0) {
                z = ready.taxCenterFeatureGateState;
            }
            return ready.copy(list, z);
        }

        public final List<UIComponent<GenericAction>> component1() {
            return this.content;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getTaxCenterFeatureGateState() {
            return this.taxCenterFeatureGateState;
        }

        public final Ready copy(List<? extends UIComponent<? extends GenericAction>> content, boolean taxCenterFeatureGateState) {
            Intrinsics.checkNotNullParameter(content, "content");
            return new Ready(content, taxCenterFeatureGateState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.content, ready.content) && this.taxCenterFeatureGateState == ready.taxCenterFeatureGateState;
        }

        public int hashCode() {
            return (this.content.hashCode() * 31) + Boolean.hashCode(this.taxCenterFeatureGateState);
        }

        public String toString() {
            return "Ready(content=" + this.content + ", taxCenterFeatureGateState=" + this.taxCenterFeatureGateState + ")";
        }

        public final List<UIComponent<GenericAction>> getContent() {
            return this.content;
        }

        public final boolean getTaxCenterFeatureGateState() {
            return this.taxCenterFeatureGateState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(List<? extends UIComponent<? extends GenericAction>> content, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
            this.taxCenterFeatureGateState = z;
        }
    }
}
