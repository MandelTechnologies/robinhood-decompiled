package com.robinhood.android.blackwidow;

import android.content.res.Resources;
import com.robinhood.android.stringscodegen.runtime.CountryGroups;
import com.robinhood.android.stringscodegen.runtime.StringsCodegenRuntimeManager;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001:\u0001\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/LocalityStringResources;", "", "custom_intervals_desc", "", "getCustom_intervals_desc", "()Ljava/lang/String;", "drawing_tools_desc", "getDrawing_tools_desc", "gated_options_select_your_presets", "getGated_options_select_your_presets", "technical_indicators_desc", "getTechnical_indicators_desc", "terms_message", "getTerms_message", "trade_on_the_chart_desc", "getTrade_on_the_chart_desc", "Impl", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface LocalityStringResources {
    String getCustom_intervals_desc();

    String getDrawing_tools_desc();

    String getGated_options_select_your_presets();

    String getTechnical_indicators_desc();

    String getTerms_message();

    String getTrade_on_the_chart_desc();

    /* compiled from: Strings.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/LocalityStringResources$Impl;", "Lcom/robinhood/android/blackwidow/LocalityStringResources;", "resources", "Landroid/content/res/Resources;", "runtimeManager", "Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;)V", "custom_intervals_desc", "", "getCustom_intervals_desc", "()Ljava/lang/String;", "drawing_tools_desc", "getDrawing_tools_desc", "gated_options_select_your_presets", "getGated_options_select_your_presets", "technical_indicators_desc", "getTechnical_indicators_desc", "terms_message", "getTerms_message", "trade_on_the_chart_desc", "getTrade_on_the_chart_desc", "feature-black-widow-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Impl implements LocalityStringResources {
        public static final int $stable = 8;
        private final Resources resources;
        private final StringsCodegenRuntimeManager runtimeManager;

        public Impl(Resources resources, StringsCodegenRuntimeManager runtimeManager) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(runtimeManager, "runtimeManager");
            this.resources = resources;
            this.runtimeManager = runtimeManager;
        }

        @Override // com.robinhood.android.blackwidow.LocalityStringResources
        public String getCustom_intervals_desc() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C9859R.string.custom_intervals_desc_gb;
            } else if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C9859R.string.custom_intervals_desc_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C9859R.string.custom_intervals_desc_us;
            } else {
                i = C9859R.string.custom_intervals_desc_us;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.blackwidow.LocalityStringResources
        public String getDrawing_tools_desc() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C9859R.string.drawing_tools_desc_gb;
            } else if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C9859R.string.drawing_tools_desc_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C9859R.string.drawing_tools_desc_us;
            } else {
                i = C9859R.string.drawing_tools_desc_us;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.blackwidow.LocalityStringResources
        public String getGated_options_select_your_presets() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C9859R.string.gated_options_select_your_presets_gb;
            } else if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C9859R.string.gated_options_select_your_presets_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C9859R.string.gated_options_select_your_presets_us;
            } else {
                i = C9859R.string.gated_options_select_your_presets_us;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.blackwidow.LocalityStringResources
        public String getTechnical_indicators_desc() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C9859R.string.technical_indicators_desc_gb;
            } else if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C9859R.string.technical_indicators_desc_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C9859R.string.technical_indicators_desc_us;
            } else {
                i = C9859R.string.technical_indicators_desc_us;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.blackwidow.LocalityStringResources
        public String getTerms_message() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C9859R.string.gated_options_terms_message_gb;
            } else if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C9859R.string.gated_options_terms_message_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C9859R.string.gated_etf_options_rhf_terms_message_us;
            } else {
                i = C9859R.string.gated_etf_options_rhf_terms_message_us;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.blackwidow.LocalityStringResources
        public String getTrade_on_the_chart_desc() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                i = C9859R.string.trade_on_the_chart_desc_gb;
            } else if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C9859R.string.trade_on_the_chart_desc_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C9859R.string.trade_on_the_chart_desc_us;
            } else {
                i = C9859R.string.trade_on_the_chart_desc_us;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
    }
}
