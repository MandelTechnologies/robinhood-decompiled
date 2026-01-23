package com.robinhood.store.shareprefs;

import com.robinhood.prefs.EnumPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RealEventOrderFormPreferences.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/shareprefs/RealEventOrderFormPreferences;", "Lcom/robinhood/store/shareprefs/EventOrderFormPreferences;", "lastUsedEcOrderTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/store/shareprefs/LastUsedEcOrderType;", "lastUsedTimeInForcePref", "Lcom/robinhood/store/shareprefs/OrderFormTimeInForce;", "<init>", "(Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/prefs/EnumPreference;)V", "getLastUsedEcOrderType", "setLastUsedEcOrderType", "", "value", "getLastUsedTimeInForce", "setLastUsedTimeInForce", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class RealEventOrderFormPreferences implements EventOrderFormPreferences {
    private final EnumPreference<UserLastUsedEcOrderTypePref2> lastUsedEcOrderTypePref;
    private final EnumPreference<OrderFormTimeInForce> lastUsedTimeInForcePref;

    public RealEventOrderFormPreferences(@UserLastUsedEcOrderTypePref EnumPreference<UserLastUsedEcOrderTypePref2> lastUsedEcOrderTypePref, @LastUsedTimeInForcePrefs EnumPreference<OrderFormTimeInForce> lastUsedTimeInForcePref) {
        Intrinsics.checkNotNullParameter(lastUsedEcOrderTypePref, "lastUsedEcOrderTypePref");
        Intrinsics.checkNotNullParameter(lastUsedTimeInForcePref, "lastUsedTimeInForcePref");
        this.lastUsedEcOrderTypePref = lastUsedEcOrderTypePref;
        this.lastUsedTimeInForcePref = lastUsedTimeInForcePref;
    }

    @Override // com.robinhood.store.shareprefs.EventOrderFormPreferences
    public UserLastUsedEcOrderTypePref2 getLastUsedEcOrderType() {
        return (UserLastUsedEcOrderTypePref2) this.lastUsedEcOrderTypePref.get();
    }

    @Override // com.robinhood.store.shareprefs.EventOrderFormPreferences
    public void setLastUsedEcOrderType(UserLastUsedEcOrderTypePref2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.lastUsedEcOrderTypePref.set(value);
    }

    @Override // com.robinhood.store.shareprefs.EventOrderFormPreferences
    public OrderFormTimeInForce getLastUsedTimeInForce() {
        Enum value = this.lastUsedTimeInForcePref.getValue();
        if (((OrderFormTimeInForce) value) == OrderFormTimeInForce.UNSPECIFIED) {
            value = null;
        }
        return (OrderFormTimeInForce) value;
    }

    @Override // com.robinhood.store.shareprefs.EventOrderFormPreferences
    public void setLastUsedTimeInForce(OrderFormTimeInForce value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.lastUsedTimeInForcePref.set(value);
    }
}
