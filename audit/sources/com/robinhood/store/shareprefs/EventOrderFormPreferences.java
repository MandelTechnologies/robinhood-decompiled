package com.robinhood.store.shareprefs;

import kotlin.Metadata;

/* compiled from: EventOrderFormPreferences.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;", "", "getLastUsedEcOrderType", "Lcom/robinhood/store/shareprefs/LastUsedEcOrderType;", "setLastUsedEcOrderType", "", "value", "getLastUsedTimeInForce", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "setLastUsedTimeInForce", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface EventOrderFormPreferences {
    UserLastUsedEcOrderTypePref2 getLastUsedEcOrderType();

    OrderFormTimeInForce getLastUsedTimeInForce();

    void setLastUsedEcOrderType(UserLastUsedEcOrderTypePref2 value);

    void setLastUsedTimeInForce(OrderFormTimeInForce value);
}
