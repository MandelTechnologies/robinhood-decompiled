package com.robinhood.android.options.comboorders.detail.components.infogrid;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.options.combo.ComboOrderStore;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.base.BackupWithholdingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ComboOrderDetailInfoGridDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo;", "backupWithholdingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/base/BackupWithholdingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComboOrderDetailInfoGridDuxo_Factory implements Factory<ComboOrderDetailInfoGridDuxo> {
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<ComboOrderStore> comboOrderStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ComboOrderDetailInfoGridStateProvider> stateProvider;
    private final Provider<UserStore> userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final ComboOrderDetailInfoGridDuxo_Factory create(Provider<BackupWithholdingStore> provider, Provider<ExperimentsStore> provider2, Provider<ComboOrderStore> provider3, Provider<UserStore> provider4, Provider<ComboOrderDetailInfoGridStateProvider> provider5, Provider<DuxoBundle> provider6, Provider<SavedStateHandle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final ComboOrderDetailInfoGridDuxo newInstance(BackupWithholdingStore backupWithholdingStore, ExperimentsStore experimentsStore, ComboOrderStore comboOrderStore, UserStore userStore, ComboOrderDetailInfoGridStateProvider comboOrderDetailInfoGridStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(backupWithholdingStore, experimentsStore, comboOrderStore, userStore, comboOrderDetailInfoGridStateProvider, duxoBundle, savedStateHandle);
    }

    public ComboOrderDetailInfoGridDuxo_Factory(Provider<BackupWithholdingStore> backupWithholdingStore, Provider<ExperimentsStore> experimentsStore, Provider<ComboOrderStore> comboOrderStore, Provider<UserStore> userStore, Provider<ComboOrderDetailInfoGridStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.backupWithholdingStore = backupWithholdingStore;
        this.experimentsStore = experimentsStore;
        this.comboOrderStore = comboOrderStore;
        this.userStore = userStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public ComboOrderDetailInfoGridDuxo get() {
        Companion companion = INSTANCE;
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ComboOrderStore comboOrderStore = this.comboOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(comboOrderStore, "get(...)");
        UserStore userStore = this.userStore.get();
        Intrinsics.checkNotNullExpressionValue(userStore, "get(...)");
        ComboOrderDetailInfoGridStateProvider comboOrderDetailInfoGridStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(comboOrderDetailInfoGridStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(backupWithholdingStore, experimentsStore, comboOrderStore, userStore, comboOrderDetailInfoGridStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: ComboOrderDetailInfoGridDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo_Factory;", "backupWithholdingStore", "Ljavax/inject/Provider;", "Lcom/robinhood/store/base/BackupWithholdingStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "comboOrderStore", "Lcom/robinhood/android/store/options/combo/ComboOrderStore;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "stateProvider", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailInfoGridDuxo;", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ComboOrderDetailInfoGridDuxo_Factory create(Provider<BackupWithholdingStore> backupWithholdingStore, Provider<ExperimentsStore> experimentsStore, Provider<ComboOrderStore> comboOrderStore, Provider<UserStore> userStore, Provider<ComboOrderDetailInfoGridStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ComboOrderDetailInfoGridDuxo_Factory(backupWithholdingStore, experimentsStore, comboOrderStore, userStore, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final ComboOrderDetailInfoGridDuxo newInstance(BackupWithholdingStore backupWithholdingStore, ExperimentsStore experimentsStore, ComboOrderStore comboOrderStore, UserStore userStore, ComboOrderDetailInfoGridStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(comboOrderStore, "comboOrderStore");
            Intrinsics.checkNotNullParameter(userStore, "userStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new ComboOrderDetailInfoGridDuxo(backupWithholdingStore, experimentsStore, comboOrderStore, userStore, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}
