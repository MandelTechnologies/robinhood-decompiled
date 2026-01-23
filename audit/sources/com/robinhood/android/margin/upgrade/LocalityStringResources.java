package com.robinhood.android.margin.upgrade;

import android.content.res.Resources;
import com.robinhood.android.stringscodegen.runtime.CountryGroups;
import com.robinhood.android.stringscodegen.runtime.StringsCodegenRuntimeManager;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "", "margin_upgrade_confirmation_secondary_cta", "", "getMargin_upgrade_confirmation_secondary_cta", "()Ljava/lang/String;", "margin_upgrade_review_investment_profile_title", "getMargin_upgrade_review_investment_profile_title", "margin_upgrade_confirmation_description_to_deposit", "to_deposit", "margin_upgrade_confirmation_description_to_deposit_short", "Impl", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface LocalityStringResources {
    String getMargin_upgrade_confirmation_secondary_cta();

    String getMargin_upgrade_review_investment_profile_title();

    String margin_upgrade_confirmation_description_to_deposit(String to_deposit);

    String margin_upgrade_confirmation_description_to_deposit_short(String to_deposit);

    /* compiled from: Strings.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/LocalityStringResources$Impl;", "Lcom/robinhood/android/margin/upgrade/LocalityStringResources;", "resources", "Landroid/content/res/Resources;", "runtimeManager", "Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;)V", "margin_upgrade_confirmation_secondary_cta", "", "getMargin_upgrade_confirmation_secondary_cta", "()Ljava/lang/String;", "margin_upgrade_review_investment_profile_title", "getMargin_upgrade_review_investment_profile_title", "margin_upgrade_confirmation_description_to_deposit", "to_deposit", "margin_upgrade_confirmation_description_to_deposit_short", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        @Override // com.robinhood.android.margin.upgrade.LocalityStringResources
        public String getMargin_upgrade_confirmation_secondary_cta() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C21137R.string.margin_confirmation_close_label;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C21137R.string.margin_confirmation_dismiss_label;
            } else {
                i = C21137R.string.margin_confirmation_dismiss_label;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.margin.upgrade.LocalityStringResources
        public String getMargin_upgrade_review_investment_profile_title() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C21137R.string.gated_margin_upgrade_review_investment_profile_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C21137R.string.margin_upgrade_review_investment_profile;
            } else {
                i = C21137R.string.margin_upgrade_review_investment_profile;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.margin.upgrade.LocalityStringResources
        public String margin_upgrade_confirmation_description_to_deposit(String to_deposit) throws Resources.NotFoundException {
            int i;
            Intrinsics.checkNotNullParameter(to_deposit, "to_deposit");
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C21137R.string.gated_margin_upgrade_confirmation_description_to_deposit_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C21137R.string.margin_upgrade_confirmation_description_to_deposit;
            } else {
                i = C21137R.string.margin_upgrade_confirmation_description_to_deposit;
            }
            String string2 = this.resources.getString(i, to_deposit);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.margin.upgrade.LocalityStringResources
        public String margin_upgrade_confirmation_description_to_deposit_short(String to_deposit) throws Resources.NotFoundException {
            int i;
            Intrinsics.checkNotNullParameter(to_deposit, "to_deposit");
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C21137R.string.f4534x4035b153;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C21137R.string.margin_upgrade_confirmation_description_to_deposit_short;
            } else {
                i = C21137R.string.margin_upgrade_confirmation_description_to_deposit_short;
            }
            String string2 = this.resources.getString(i, to_deposit);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
    }
}
