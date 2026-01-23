package com.robinhood.shared.order.type.selection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.shared.education.order.OrderTypeEducationManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/order/type/selection/CryptoOrderTypeSelectionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "educationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderTypeSelectionDuxo_Factory implements Factory<OrderTypeSelectionDuxo> {
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<OrderTypeEducationManager> educationManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OrderTypeSelectionDuxo2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderTypeSelectionDuxo_Factory create(Provider<DuxoBundle> provider, Provider<OrderTypeSelectionDuxo2> provider2, Provider<SavedStateHandle> provider3, Provider<OrderTypeEducationManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OrderTypeSelectionDuxo newInstance(DuxoBundle duxoBundle, OrderTypeSelectionDuxo2 orderTypeSelectionDuxo2, SavedStateHandle savedStateHandle, OrderTypeEducationManager orderTypeEducationManager) {
        return INSTANCE.newInstance(duxoBundle, orderTypeSelectionDuxo2, savedStateHandle, orderTypeEducationManager);
    }

    public OrderTypeSelectionDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<OrderTypeSelectionDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<OrderTypeEducationManager> educationManager) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(educationManager, "educationManager");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.educationManager = educationManager;
    }

    @Override // javax.inject.Provider
    public OrderTypeSelectionDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OrderTypeSelectionDuxo2 orderTypeSelectionDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(orderTypeSelectionDuxo2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        OrderTypeEducationManager orderTypeEducationManager = this.educationManager.get();
        Intrinsics.checkNotNullExpressionValue(orderTypeEducationManager, "get(...)");
        return companion.newInstance(duxoBundle, orderTypeSelectionDuxo2, savedStateHandle, orderTypeEducationManager);
    }

    /* compiled from: OrderTypeSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/order/type/selection/CryptoOrderTypeSelectionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "educationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "newInstance", "Lcom/robinhood/shared/order/type/selection/OrderTypeSelectionDuxo;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderTypeSelectionDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<OrderTypeSelectionDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<OrderTypeEducationManager> educationManager) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(educationManager, "educationManager");
            return new OrderTypeSelectionDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, educationManager);
        }

        @JvmStatic
        public final OrderTypeSelectionDuxo newInstance(DuxoBundle duxoBundle, OrderTypeSelectionDuxo2 stateProvider, SavedStateHandle savedStateHandle, OrderTypeEducationManager educationManager) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(educationManager, "educationManager");
            return new OrderTypeSelectionDuxo(duxoBundle, stateProvider, savedStateHandle, educationManager);
        }
    }
}
