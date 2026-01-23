package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.prefs.OptionChainSettingsPnlChartTypePref;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: OptionSimulatedReturnPreTradeStore.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnPreTradeStore;", "Lcom/robinhood/store/Store;", "optionChainSettingsPnlChartTypePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/store/StoreBundle;)V", "streamOptionChainSettingsPnlChartType", "Lkotlinx/coroutines/flow/Flow;", "setOptionChainSettingsPnlChartType", "", "type", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class OptionSimulatedReturnPreTradeStore extends Store {
    private final EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSimulatedReturnPreTradeStore(@OptionChainSettingsPnlChartTypePref EnumPreference<OptionChainSettingsPnlChartType> optionChainSettingsPnlChartTypePref, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(optionChainSettingsPnlChartTypePref, "optionChainSettingsPnlChartTypePref");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.optionChainSettingsPnlChartTypePref = optionChainSettingsPnlChartTypePref;
    }

    public final Flow<OptionChainSettingsPnlChartType> streamOptionChainSettingsPnlChartType() {
        return Context7.buffer$default(RxConvert.asFlow(this.optionChainSettingsPnlChartTypePref.getChanges()), Integer.MAX_VALUE, null, 2, null);
    }

    public final void setOptionChainSettingsPnlChartType(OptionChainSettingsPnlChartType type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.optionChainSettingsPnlChartTypePref.set(type2);
    }
}
