package com.robinhood.android.common.buysell;

import android.content.res.Resources;
import com.robinhood.android.stringscodegen.runtime.CountryGroups;
import com.robinhood.android.stringscodegen.runtime.StringsCodegenRuntimeManager;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/LocalityStringResources;", "", "instrument_detail_buy_error_margin_call", "", "getInstrument_detail_buy_error_margin_call", "()Ljava/lang/String;", "Impl", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface LocalityStringResources {
    String getInstrument_detail_buy_error_margin_call();

    /* compiled from: Strings.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/buysell/LocalityStringResources$Impl;", "Lcom/robinhood/android/common/buysell/LocalityStringResources;", "resources", "Landroid/content/res/Resources;", "runtimeManager", "Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;)V", "instrument_detail_buy_error_margin_call", "", "getInstrument_detail_buy_error_margin_call", "()Ljava/lang/String;", "lib-buy-sell-helper_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Impl implements LocalityStringResources {
        private final Resources resources;
        private final StringsCodegenRuntimeManager runtimeManager;

        public Impl(Resources resources, StringsCodegenRuntimeManager runtimeManager) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(runtimeManager, "runtimeManager");
            this.resources = resources;
            this.runtimeManager = runtimeManager;
        }

        @Override // com.robinhood.android.common.buysell.LocalityStringResources
        public String getInstrument_detail_buy_error_margin_call() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedKingdom.INSTANCE) || CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C11070R.string.gated_instrument_detail_buysell_error_margin_call_non_us;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C11070R.string.instrument_detail_buysell_error_margin_call;
            } else {
                i = C11070R.string.instrument_detail_buysell_error_margin_call;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
    }
}
