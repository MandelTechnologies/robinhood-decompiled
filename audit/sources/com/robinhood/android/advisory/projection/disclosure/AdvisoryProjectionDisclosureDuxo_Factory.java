package com.robinhood.android.advisory.projection.disclosure;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.store.advisory.AdvisoryProjectionStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryProjectionDisclosureDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "projectionStore", "Lcom/robinhood/store/advisory/AdvisoryProjectionStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class AdvisoryProjectionDisclosureDuxo_Factory implements Factory<AdvisoryProjectionDisclosureDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<AdvisoryProjectionStore> projectionStore;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AdvisoryProjectionDisclosureDuxo_Factory create(Provider<DuxoBundle> provider, Provider<SavedStateHandle> provider2, Provider<AdvisoryProjectionStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AdvisoryProjectionDisclosureDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AdvisoryProjectionStore advisoryProjectionStore) {
        return INSTANCE.newInstance(duxoBundle, savedStateHandle, advisoryProjectionStore);
    }

    public AdvisoryProjectionDisclosureDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AdvisoryProjectionStore> projectionStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(projectionStore, "projectionStore");
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.projectionStore = projectionStore;
    }

    @Override // javax.inject.Provider
    public AdvisoryProjectionDisclosureDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AdvisoryProjectionStore advisoryProjectionStore = this.projectionStore.get();
        Intrinsics.checkNotNullExpressionValue(advisoryProjectionStore, "get(...)");
        return companion.newInstance(duxoBundle, savedStateHandle, advisoryProjectionStore);
    }

    /* compiled from: AdvisoryProjectionDisclosureDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "projectionStore", "Lcom/robinhood/store/advisory/AdvisoryProjectionStore;", "newInstance", "Lcom/robinhood/android/advisory/projection/disclosure/AdvisoryProjectionDisclosureDuxo;", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AdvisoryProjectionDisclosureDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<AdvisoryProjectionStore> projectionStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(projectionStore, "projectionStore");
            return new AdvisoryProjectionDisclosureDuxo_Factory(duxoBundle, savedStateHandle, projectionStore);
        }

        @JvmStatic
        public final AdvisoryProjectionDisclosureDuxo newInstance(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AdvisoryProjectionStore projectionStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(projectionStore, "projectionStore");
            return new AdvisoryProjectionDisclosureDuxo(duxoBundle, savedStateHandle, projectionStore);
        }
    }
}
