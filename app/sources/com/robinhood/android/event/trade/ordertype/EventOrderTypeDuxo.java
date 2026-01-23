package com.robinhood.android.event.trade.ordertype;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.event.trade.ordertype.EventOrderTypeFragment;
import com.robinhood.android.models.event.p186db.order.OrderFormOrderType;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.store.shareprefs.EventOrderFormPreferences;
import com.robinhood.store.shareprefs.UserLastUsedEcOrderTypePref2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.mainst.PositionEffectDto;

/* compiled from: EventOrderTypeDuxo.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/event/trade/ordertype/EventOrderTypeDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/event/trade/ordertype/EventOrderTypeState;", "Lcom/robinhood/android/udf/HasSavedState;", "preferences", "Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onUpdateOrderType", "", "type", "Lcom/robinhood/android/models/event/db/order/OrderFormOrderType;", "Companion", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventOrderTypeDuxo extends BaseDuxo4<EventOrderTypeState> implements HasSavedState {
    private final EventOrderFormPreferences preferences;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EventOrderTypeDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderFormOrderType.values().length];
            try {
                iArr[OrderFormOrderType.NOTIONAL_BASED_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderFormOrderType.QUANTITY_BASED_ORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderFormOrderType.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventOrderTypeDuxo(EventOrderFormPreferences preferences, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new EventOrderTypeState(((EventOrderTypeFragment.Args) INSTANCE.getArgs(savedStateHandle)).getPositionEffect() == PositionEffectDto.OPEN), duxoBundle);
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.preferences = preferences;
        this.savedStateHandle = savedStateHandle;
    }

    public final void onUpdateOrderType(OrderFormOrderType type2) {
        UserLastUsedEcOrderTypePref2 userLastUsedEcOrderTypePref2;
        Intrinsics.checkNotNullParameter(type2, "type");
        EventOrderFormPreferences eventOrderFormPreferences = this.preferences;
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            userLastUsedEcOrderTypePref2 = UserLastUsedEcOrderTypePref2.NOTIONAL;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            userLastUsedEcOrderTypePref2 = UserLastUsedEcOrderTypePref2.QUANTITY;
        }
        eventOrderFormPreferences.setLastUsedEcOrderType(userLastUsedEcOrderTypePref2);
    }

    /* compiled from: EventOrderTypeDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/event/trade/ordertype/EventOrderTypeDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/event/trade/ordertype/EventOrderTypeDuxo;", "Lcom/robinhood/android/event/trade/ordertype/EventOrderTypeFragment$Args;", "<init>", "()V", "feature-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<EventOrderTypeDuxo, EventOrderTypeFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventOrderTypeFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (EventOrderTypeFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public EventOrderTypeFragment.Args getArgs(EventOrderTypeDuxo eventOrderTypeDuxo) {
            return (EventOrderTypeFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, eventOrderTypeDuxo);
        }
    }
}
