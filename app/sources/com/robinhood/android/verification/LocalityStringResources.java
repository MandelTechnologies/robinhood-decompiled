package com.robinhood.android.verification;

import android.content.res.Resources;
import com.robinhood.android.stringscodegen.runtime.CountryGroups;
import com.robinhood.android.stringscodegen.runtime.StringsCodegenRuntimeManager;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Strings.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/verification/LocalityStringResources;", "", "phone_value_prop_one_primary", "", "getPhone_value_prop_one_primary", "()Ljava/lang/String;", "phone_value_prop_one_secondary", "getPhone_value_prop_one_secondary", "phone_value_prop_subtitle", "getPhone_value_prop_subtitle", "phone_value_prop_two_secondary", "getPhone_value_prop_two_secondary", "Impl", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface LocalityStringResources {
    String getPhone_value_prop_one_primary();

    String getPhone_value_prop_one_secondary();

    String getPhone_value_prop_subtitle();

    String getPhone_value_prop_two_secondary();

    /* compiled from: Strings.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/verification/LocalityStringResources$Impl;", "Lcom/robinhood/android/verification/LocalityStringResources;", "resources", "Landroid/content/res/Resources;", "runtimeManager", "Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;)V", "phone_value_prop_one_primary", "", "getPhone_value_prop_one_primary", "()Ljava/lang/String;", "phone_value_prop_one_secondary", "getPhone_value_prop_one_secondary", "phone_value_prop_subtitle", "getPhone_value_prop_subtitle", "phone_value_prop_two_secondary", "getPhone_value_prop_two_secondary", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        @Override // com.robinhood.android.verification.LocalityStringResources
        public String getPhone_value_prop_one_primary() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C31368R.string.phone_value_prop_one_primary_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C31368R.string.phone_value_prop_one_primary;
            } else {
                i = C31368R.string.phone_value_prop_one_primary;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.verification.LocalityStringResources
        public String getPhone_value_prop_one_secondary() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C31368R.string.phone_value_prop_one_secondary_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C31368R.string.phone_value_prop_one_secondary;
            } else {
                i = C31368R.string.phone_value_prop_one_secondary;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.verification.LocalityStringResources
        public String getPhone_value_prop_subtitle() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C31368R.string.phone_value_prop_subtitle_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C31368R.string.phone_value_prop_subtitle;
            } else {
                i = C31368R.string.phone_value_prop_subtitle;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        @Override // com.robinhood.android.verification.LocalityStringResources
        public String getPhone_value_prop_two_secondary() throws Resources.NotFoundException {
            int i;
            CountryCode userLocality = this.runtimeManager.getUserLocality();
            if (CollectionsKt.contains(CountryGroups.INSTANCE.getRHSG_COUNTRIES(), userLocality)) {
                i = C31368R.string.phone_value_prop_two_secondary_rhsg;
            } else if (Intrinsics.areEqual(userLocality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i = C31368R.string.phone_value_prop_two_secondary;
            } else {
                i = C31368R.string.phone_value_prop_two_secondary;
            }
            String string2 = this.resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
    }
}
