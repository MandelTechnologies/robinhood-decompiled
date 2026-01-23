package com.robinhood.android.cortex.digest.asset.onboarding;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.cortex.store.asset.AssetDigestOnboardingStore;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetDigestOnboardingParentDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo;", "assetDigestOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AssetDigestOnboardingParentDuxo_Factory implements Factory<AssetDigestOnboardingParentDuxo> {
    private final Provider<AssetDigestOnboardingStore> assetDigestOnboardingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final AssetDigestOnboardingParentDuxo_Factory create(Provider<AssetDigestOnboardingStore> provider, Provider<DuxoBundle> provider2, Provider<SavedStateHandle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final AssetDigestOnboardingParentDuxo newInstance(AssetDigestOnboardingStore assetDigestOnboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(assetDigestOnboardingStore, duxoBundle, savedStateHandle);
    }

    public AssetDigestOnboardingParentDuxo_Factory(Provider<AssetDigestOnboardingStore> assetDigestOnboardingStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.assetDigestOnboardingStore = assetDigestOnboardingStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public AssetDigestOnboardingParentDuxo get() {
        Companion companion = INSTANCE;
        AssetDigestOnboardingStore assetDigestOnboardingStore = this.assetDigestOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(assetDigestOnboardingStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(assetDigestOnboardingStore, duxoBundle, savedStateHandle);
    }

    /* compiled from: AssetDigestOnboardingParentDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo_Factory;", "assetDigestOnboardingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/android/cortex/store/asset/AssetDigestOnboardingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/cortex/digest/asset/onboarding/AssetDigestOnboardingParentDuxo;", "feature-cortex-digest-asset-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetDigestOnboardingParentDuxo_Factory create(Provider<AssetDigestOnboardingStore> assetDigestOnboardingStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AssetDigestOnboardingParentDuxo_Factory(assetDigestOnboardingStore, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final AssetDigestOnboardingParentDuxo newInstance(AssetDigestOnboardingStore assetDigestOnboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(assetDigestOnboardingStore, "assetDigestOnboardingStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new AssetDigestOnboardingParentDuxo(assetDigestOnboardingStore, duxoBundle, savedStateHandle);
        }
    }
}
