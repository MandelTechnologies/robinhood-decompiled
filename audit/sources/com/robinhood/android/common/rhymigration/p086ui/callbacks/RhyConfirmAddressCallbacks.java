package com.robinhood.android.common.rhymigration.p086ui.callbacks;

import com.robinhood.models.p355ui.identi.ShippingAddress;
import kotlin.Metadata;

/* compiled from: RhyConfirmAddressCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/rhymigration/ui/callbacks/RhyConfirmAddressCallbacks;", "", "onAddressConfirmed", "", "shippingAddress", "Lcom/robinhood/models/ui/identi/ShippingAddress;", "onAddressError", "error", "", "feature-lib-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface RhyConfirmAddressCallbacks {
    void onAddressConfirmed(ShippingAddress shippingAddress);

    void onAddressError(Throwable error);
}
