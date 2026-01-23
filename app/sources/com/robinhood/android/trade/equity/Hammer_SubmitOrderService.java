package com.robinhood.android.trade.equity;

import android.app.Service;
import com.robinhood.hammer.android.service.ServiceComponentManager;
import com.robinhood.hammer.android.service.ServiceComponentManagerHolder;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_SubmitOrderService.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b1\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/Hammer_SubmitOrderService;", "Landroid/app/Service;", "Lcom/robinhood/hammer/android/service/ServiceComponentManagerHolder;", "<init>", "()V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/service/ServiceComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/service/ServiceComponentManager;", "componentManager$delegate", "Lkotlin/Lazy;", "inject", "", "onCreate", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes9.dex */
public abstract class Hammer_SubmitOrderService extends Service implements ServiceComponentManagerHolder {
    public static final int $stable = 8;

    /* renamed from: componentManager$delegate, reason: from kotlin metadata */
    private final Lazy componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_SubmitOrderService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final ServiceComponentManager getComponentManager() {
        return (ServiceComponentManager) this.componentManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ServiceComponentManager componentManager_delegate$lambda$0(Hammer_SubmitOrderService hammer_SubmitOrderService) {
        return new ServiceComponentManager(hammer_SubmitOrderService);
    }

    private Hammer_SubmitOrderService() {
        this.componentManager = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.trade.equity.Hammer_SubmitOrderService$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Hammer_SubmitOrderService.componentManager_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final void inject() {
        if (this.injected) {
            return;
        }
        Hammer_SubmitOrderService2 hammer_SubmitOrderService2 = (Hammer_SubmitOrderService2) getComponentManager().get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.trade.equity.SubmitOrderService");
        hammer_SubmitOrderService2.inject((SubmitOrderService) this);
        this.injected = true;
    }

    @Override // android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }
}
