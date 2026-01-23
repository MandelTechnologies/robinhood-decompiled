package com.robinhood.android.internalassettransfers.review;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PreSubmitWarningsCheckUseCase;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.DuxoBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nimbus.service.p511v1.NimbusService;

/* compiled from: InternalAssetTransferReviewDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo;", "nimbusService", "Ljavax/inject/Provider;", "Lnimbus/service/v1/NimbusService;", "preSubmitWarningsCheckUseCase", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class InternalAssetTransferReviewDuxo_Factory implements Factory<InternalAssetTransferReviewDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<NimbusService> nimbusService;
    private final Provider<PreSubmitWarningsCheckUseCase> preSubmitWarningsCheckUseCase;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<InternalAssetTransferReviewStateProvider> stateProvider;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final InternalAssetTransferReviewDuxo_Factory create(Provider<NimbusService> provider, Provider<PreSubmitWarningsCheckUseCase> provider2, Provider<SuvWorkflowManager> provider3, Provider<InternalAssetTransferReviewStateProvider> provider4, Provider<DuxoBundle> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final InternalAssetTransferReviewDuxo newInstance(NimbusService nimbusService, PreSubmitWarningsCheckUseCase preSubmitWarningsCheckUseCase, SuvWorkflowManager suvWorkflowManager, InternalAssetTransferReviewStateProvider internalAssetTransferReviewStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(nimbusService, preSubmitWarningsCheckUseCase, suvWorkflowManager, internalAssetTransferReviewStateProvider, duxoBundle, savedStateHandle);
    }

    public InternalAssetTransferReviewDuxo_Factory(Provider<NimbusService> nimbusService, Provider<PreSubmitWarningsCheckUseCase> preSubmitWarningsCheckUseCase, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<InternalAssetTransferReviewStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
        Intrinsics.checkNotNullParameter(preSubmitWarningsCheckUseCase, "preSubmitWarningsCheckUseCase");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.nimbusService = nimbusService;
        this.preSubmitWarningsCheckUseCase = preSubmitWarningsCheckUseCase;
        this.suvWorkflowManager = suvWorkflowManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public InternalAssetTransferReviewDuxo get() {
        Companion companion = INSTANCE;
        NimbusService nimbusService = this.nimbusService.get();
        Intrinsics.checkNotNullExpressionValue(nimbusService, "get(...)");
        PreSubmitWarningsCheckUseCase preSubmitWarningsCheckUseCase = this.preSubmitWarningsCheckUseCase.get();
        Intrinsics.checkNotNullExpressionValue(preSubmitWarningsCheckUseCase, "get(...)");
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        InternalAssetTransferReviewStateProvider internalAssetTransferReviewStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(internalAssetTransferReviewStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(nimbusService, preSubmitWarningsCheckUseCase, suvWorkflowManager, internalAssetTransferReviewStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: InternalAssetTransferReviewDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo_Factory;", "nimbusService", "Ljavax/inject/Provider;", "Lnimbus/service/v1/NimbusService;", "preSubmitWarningsCheckUseCase", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PreSubmitWarningsCheckUseCase;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDuxo;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InternalAssetTransferReviewDuxo_Factory create(Provider<NimbusService> nimbusService, Provider<PreSubmitWarningsCheckUseCase> preSubmitWarningsCheckUseCase, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<InternalAssetTransferReviewStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
            Intrinsics.checkNotNullParameter(preSubmitWarningsCheckUseCase, "preSubmitWarningsCheckUseCase");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InternalAssetTransferReviewDuxo_Factory(nimbusService, preSubmitWarningsCheckUseCase, suvWorkflowManager, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final InternalAssetTransferReviewDuxo newInstance(NimbusService nimbusService, PreSubmitWarningsCheckUseCase preSubmitWarningsCheckUseCase, SuvWorkflowManager suvWorkflowManager, InternalAssetTransferReviewStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(nimbusService, "nimbusService");
            Intrinsics.checkNotNullParameter(preSubmitWarningsCheckUseCase, "preSubmitWarningsCheckUseCase");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new InternalAssetTransferReviewDuxo(nimbusService, preSubmitWarningsCheckUseCase, suvWorkflowManager, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
