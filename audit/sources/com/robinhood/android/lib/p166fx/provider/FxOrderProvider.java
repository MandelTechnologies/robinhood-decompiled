package com.robinhood.android.lib.p166fx.provider;

import com.robinhood.models.p325fx.p326db.FxOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: FxOrderProvider.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/fx/provider/FxOrderProvider;", "", "streamSingle", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/fx/db/FxOrder;", "accountNumber", "", "orderId", "Ljava/util/UUID;", "pollSingle", "lib-fx-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FxOrderProvider {
    Flow<FxOrder> pollSingle(String accountNumber, UUID orderId);

    Flow<FxOrder> streamSingle(String accountNumber, UUID orderId);
}
