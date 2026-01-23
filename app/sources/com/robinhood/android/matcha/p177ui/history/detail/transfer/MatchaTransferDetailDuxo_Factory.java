package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MatchaTransferStore;
import com.robinhood.android.store.social.SocialBlockingStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.api.matcha.MatchaApi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo;", "matchaApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/matcha/MatchaApi;", "transferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "blockingStore", "Lcom/robinhood/android/store/social/SocialBlockingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MatchaTransferDetailDuxo_Factory implements Factory<MatchaTransferDetailDuxo> {
    private final Provider<SocialBlockingStore> blockingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MatchaApi> matchaApi;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<MatchaTransferDetailStateProvider> stateProvider;
    private final Provider<MatchaTransferStore> transferStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MatchaTransferDetailDuxo_Factory create(Provider<MatchaApi> provider, Provider<MatchaTransferStore> provider2, Provider<SocialBlockingStore> provider3, Provider<DuxoBundle> provider4, Provider<SavedStateHandle> provider5, Provider<MatchaTransferDetailStateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final MatchaTransferDetailDuxo newInstance(MatchaApi matchaApi, MatchaTransferStore matchaTransferStore, SocialBlockingStore socialBlockingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MatchaTransferDetailStateProvider matchaTransferDetailStateProvider) {
        return INSTANCE.newInstance(matchaApi, matchaTransferStore, socialBlockingStore, duxoBundle, savedStateHandle, matchaTransferDetailStateProvider);
    }

    public MatchaTransferDetailDuxo_Factory(Provider<MatchaApi> matchaApi, Provider<MatchaTransferStore> transferStore, Provider<SocialBlockingStore> blockingStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<MatchaTransferDetailStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(transferStore, "transferStore");
        Intrinsics.checkNotNullParameter(blockingStore, "blockingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.matchaApi = matchaApi;
        this.transferStore = transferStore;
        this.blockingStore = blockingStore;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public MatchaTransferDetailDuxo get() {
        Companion companion = INSTANCE;
        MatchaApi matchaApi = this.matchaApi.get();
        Intrinsics.checkNotNullExpressionValue(matchaApi, "get(...)");
        MatchaTransferStore matchaTransferStore = this.transferStore.get();
        Intrinsics.checkNotNullExpressionValue(matchaTransferStore, "get(...)");
        SocialBlockingStore socialBlockingStore = this.blockingStore.get();
        Intrinsics.checkNotNullExpressionValue(socialBlockingStore, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        MatchaTransferDetailStateProvider matchaTransferDetailStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(matchaTransferDetailStateProvider, "get(...)");
        return companion.newInstance(matchaApi, matchaTransferStore, socialBlockingStore, duxoBundle, savedStateHandle, matchaTransferDetailStateProvider);
    }

    /* compiled from: MatchaTransferDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo_Factory;", "matchaApi", "Ljavax/inject/Provider;", "Lcom/robinhood/api/matcha/MatchaApi;", "transferStore", "Lcom/robinhood/android/store/matcha/MatchaTransferStore;", "blockingStore", "Lcom/robinhood/android/store/social/SocialBlockingStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailStateProvider;", "newInstance", "Lcom/robinhood/android/matcha/ui/history/detail/transfer/MatchaTransferDetailDuxo;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MatchaTransferDetailDuxo_Factory create(Provider<MatchaApi> matchaApi, Provider<MatchaTransferStore> transferStore, Provider<SocialBlockingStore> blockingStore, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<MatchaTransferDetailStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(transferStore, "transferStore");
            Intrinsics.checkNotNullParameter(blockingStore, "blockingStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new MatchaTransferDetailDuxo_Factory(matchaApi, transferStore, blockingStore, duxoBundle, savedStateHandle, stateProvider);
        }

        @JvmStatic
        public final MatchaTransferDetailDuxo newInstance(MatchaApi matchaApi, MatchaTransferStore transferStore, SocialBlockingStore blockingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MatchaTransferDetailStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
            Intrinsics.checkNotNullParameter(transferStore, "transferStore");
            Intrinsics.checkNotNullParameter(blockingStore, "blockingStore");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new MatchaTransferDetailDuxo(matchaApi, transferStore, blockingStore, duxoBundle, savedStateHandle, stateProvider);
        }
    }
}
