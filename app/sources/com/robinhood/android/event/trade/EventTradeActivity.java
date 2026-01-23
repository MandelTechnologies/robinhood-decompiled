package com.robinhood.android.event.trade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.event.trade.EventOrderFormFragment;
import com.robinhood.android.event.trade.ordertype.EventOrderTypeFragment;
import com.robinhood.android.eventcontracts.contracts.EventAttestationFragmentKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityKey;
import com.robinhood.android.eventcontracts.contracts.EventTradeActivityResultContract;
import com.robinhood.android.futures.contracts.FuturesEventExplainerFragmentKey;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventTradeActivity.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u001bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0017\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventTradeActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/event/trade/EventOrderFormFragment$Callbacks;", "Lcom/robinhood/android/futures/contracts/FuturesEventExplainerFragmentKey$Callbacks;", "Lcom/robinhood/android/event/trade/ordertype/EventOrderTypeFragment$Callback;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDismissExplainer", "exitOrderForm", "exitOrderFormAfterOrderSubmission", "restartOrderFormInIoc", "defaultQuantity", "", "(Ljava/lang/Integer;)V", "restartOrderFormInNotional", "defaultNotional", "Ljava/math/BigDecimal;", "showOrderTypePage", "onNotionalInputSelected", "onQuantityInputSelected", "routeToAttestation", "attestationType", "", "Companion", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventTradeActivity extends BaseActivity implements EventOrderFormFragment.Callbacks, FuturesEventExplainerFragmentKey.Callbacks, EventOrderTypeFragment.Callback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = BaseActivity.$stable;

    public EventTradeActivity() {
        super(C11048R.layout.activity_fragment_container);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            int i = C11048R.id.fragment_container;
            EventOrderFormFragment.Companion companion = EventOrderFormFragment.INSTANCE;
            Companion companion2 = INSTANCE;
            setFragment(i, companion.newInstance((Parcelable) new EventOrderFormFragment.Args(((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEventOrderContext(), ((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEntryPoint(), null, null, 12, null)));
        }
    }

    @Override // com.robinhood.android.futures.contracts.FuturesEventExplainerFragmentKey.Callbacks
    public void onDismissExplainer() {
        onBackPressed();
    }

    @Override // com.robinhood.android.event.trade.EventOrderFormFragment.Callbacks
    public void exitOrderForm() {
        finish();
    }

    @Override // com.robinhood.android.event.trade.EventOrderFormFragment.Callbacks
    public void exitOrderFormAfterOrderSubmission() {
        NavigationActivityResultContract3.finishWithResult(this, EventTradeActivityResultContract.Result.OrderSubmitted.INSTANCE);
    }

    @Override // com.robinhood.android.event.trade.EventOrderFormFragment.Callbacks
    public void restartOrderFormInIoc(Integer defaultQuantity) {
        EventOrderFormFragment.Companion companion = EventOrderFormFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new EventOrderFormFragment.Args(((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEventOrderContext(), ((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEntryPoint(), new EventOrderFormFragment.Args.InitialState.QuantityOrder(defaultQuantity), null, 8, null)));
    }

    @Override // com.robinhood.android.event.trade.EventOrderFormFragment.Callbacks
    public void restartOrderFormInNotional(BigDecimal defaultNotional) {
        EventOrderFormFragment.Companion companion = EventOrderFormFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new EventOrderFormFragment.Args(((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEventOrderContext(), ((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEntryPoint(), new EventOrderFormFragment.Args.InitialState.NotionalOrder(defaultNotional), null, 8, null)));
    }

    @Override // com.robinhood.android.event.trade.EventOrderFormFragment.Callbacks
    public void showOrderTypePage() {
        replaceFragment(EventOrderTypeFragment.INSTANCE.newInstance((Parcelable) new EventOrderTypeFragment.Args(((EventTradeActivityKey) INSTANCE.getExtras((Activity) this)).getEventOrderContext().getPositionEffect())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.event.trade.ordertype.EventOrderTypeFragment.Callback
    public void onNotionalInputSelected() {
        EventOrderFormFragment.Companion companion = EventOrderFormFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new EventOrderFormFragment.Args(((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEventOrderContext(), ((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEntryPoint(), new EventOrderFormFragment.Args.InitialState.NotionalOrder(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 8, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.event.trade.ordertype.EventOrderTypeFragment.Callback
    public void onQuantityInputSelected() {
        EventOrderFormFragment.Companion companion = EventOrderFormFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new EventOrderFormFragment.Args(((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEventOrderContext(), ((EventTradeActivityKey) companion2.getExtras((Activity) this)).getEntryPoint(), new EventOrderFormFragment.Args.InitialState.QuantityOrder(null, 1, 0 == true ? 1 : 0), 0 == true ? 1 : 0, 8, null)));
    }

    @Override // com.robinhood.android.event.trade.EventOrderFormFragment.Callbacks
    public void routeToAttestation(String attestationType) {
        Intrinsics.checkNotNullParameter(attestationType, "attestationType");
        finish();
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new EventAttestationFragmentKey(attestationType, ((EventTradeActivityKey) INSTANCE.getExtras((Activity) this)).getEventOrderContext()), false, false, false, false, null, false, null, null, 1020, null);
    }

    /* compiled from: EventTradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/trade/EventTradeActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/event/trade/EventTradeActivity;", "Lcom/robinhood/android/eventcontracts/contracts/EventTradeActivityKey;", "<init>", "()V", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<EventTradeActivity, EventTradeActivityKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public EventTradeActivityKey getExtras(EventTradeActivity eventTradeActivity) {
            return (EventTradeActivityKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, eventTradeActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, EventTradeActivityKey eventTradeActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, eventTradeActivityKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, EventTradeActivityKey eventTradeActivityKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, eventTradeActivityKey);
        }
    }
}
