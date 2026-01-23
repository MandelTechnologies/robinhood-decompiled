package com.robinhood.shared.order.type.education;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.compose.duxo.DuxoComposableCompanion;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.education.order.OrderTypeEducationManager;
import com.robinhood.shared.order.type.OrderTypeDestinations;
import com.robinhood.shared.order.type.education.CryptoOrderTypeEducationDuxo2;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderTypeEducationDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "educationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/education/order/OrderTypeEducationManager;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onContinueClick", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/Order$Configuration;", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoOrderTypeEducationDuxo extends BaseDuxo5<Unit, CryptoOrderTypeEducationDuxo2> implements HasSavedState {
    private final OrderTypeEducationManager educationManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderTypeEducationDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, OrderTypeEducationManager educationManager) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(educationManager, "educationManager");
        this.savedStateHandle = savedStateHandle;
        this.educationManager = educationManager;
    }

    public final void onContinueClick(Order.Configuration configuration, OrderSide orderSide) {
        CryptoOrderTypeEducationDuxo2 cryptoOrderTypeEducationDuxo2;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        this.educationManager.hideEducation(configuration, orderSide);
        if (((OrderTypeDestinations.Args) INSTANCE.getArgs((HasSavedState) this)).getPopBackStackOnContinue()) {
            cryptoOrderTypeEducationDuxo2 = CryptoOrderTypeEducationDuxo2.PopBackStack.INSTANCE;
        } else {
            cryptoOrderTypeEducationDuxo2 = CryptoOrderTypeEducationDuxo2.OnContinue.INSTANCE;
        }
        submit(cryptoOrderTypeEducationDuxo2);
    }

    /* compiled from: CryptoOrderTypeEducationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationDuxo$Companion;", "Lcom/robinhood/compose/duxo/DuxoComposableCompanion;", "Lcom/robinhood/shared/order/type/education/CryptoOrderTypeEducationDuxo;", "Lcom/robinhood/shared/order/type/OrderTypeEducationDest$Args;", "<init>", "()V", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoComposableCompanion<CryptoOrderTypeEducationDuxo, OrderTypeDestinations.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public OrderTypeDestinations.Args getArgs(SavedStateHandle savedStateHandle) {
            return (OrderTypeDestinations.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.compose.duxo.DuxoComposableCompanion
        public OrderTypeDestinations.Args getArgs(CryptoOrderTypeEducationDuxo cryptoOrderTypeEducationDuxo) {
            return (OrderTypeDestinations.Args) DuxoComposableCompanion.DefaultImpls.getArgs(this, cryptoOrderTypeEducationDuxo);
        }
    }
}
