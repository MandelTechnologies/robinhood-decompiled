package com.robinhood.android.common.util;

import android.annotation.SuppressLint;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.g11n.Locales2;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.datetime.LocalDates4;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.PrimitiveIterators6;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;
import p479j$.time.LocalDate;

/* compiled from: InternationalInfo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 42\u00020\u0001:\u0003564B\u0093\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012'\u0010\u0011\u001a#\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bj\u0002`\u0010\u0012'\u0010\u0014\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b!\u0010\u0019R8\u0010\u0011\u001a#\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bj\u0002`\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R8\u0010\u0014\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00040\u000bj\u0002`\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b%\u0010$R\u0014\u0010)\u001a\u00020&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010\u0019R\u0011\u0010-\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010\u0019R\u0011\u0010/\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b.\u0010\u0019R\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010\u0019R\u0011\u00103\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b2\u0010\u0019\u0082\u0001\u000278¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/common/util/InternationalInfo;", "", "", "countryCallingCode", "", "supportsOpeningRhAccount", "allowGoogle", "phoneNumberHint", "phoneNumberTemplate", "dobHint", "dobTemplate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dateOfBirth", "j$/time/LocalDate", "Lcom/robinhood/android/common/util/ParseDateOfBirth;", "parseDateOfBirth", "phoneNumber", "Lcom/robinhood/android/common/util/ValidatePhoneNumber;", "validatePhoneNumber", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/String;", "getCountryCallingCode", "()Ljava/lang/String;", "Z", "getSupportsOpeningRhAccount", "()Z", "getAllowGoogle", "getPhoneNumberHint", "getPhoneNumberTemplate", "getDobHint", "getDobTemplate", "Lkotlin/jvm/functions/Function1;", "getParseDateOfBirth", "()Lkotlin/jvm/functions/Function1;", "getValidatePhoneNumber", "Lcom/robinhood/iso/countrycode/CountryCode;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "countryCode", "getDisplayCountry", "displayCountry", "getTwoDigitIsoCode", "twoDigitIsoCode", "getDisplayCountryPhoneCode", "displayCountryPhoneCode", "getCountryCodePhoneNumberTemplate", "countryCodePhoneNumberTemplate", "getCountryCodePhoneNumberHint", "countryCodePhoneNumberHint", "Companion", "Supported", "UnSupported", "Lcom/robinhood/android/common/util/InternationalInfo$Supported;", "Lcom/robinhood/android/common/util/InternationalInfo$UnSupported;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class InternationalInfo {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final List<InternationalInfo> internationalInfos;
    private final boolean allowGoogle;
    private final String countryCallingCode;
    private final String dobHint;
    private final String dobTemplate;
    private final Function1<String, LocalDate> parseDateOfBirth;
    private final String phoneNumberHint;
    private final String phoneNumberTemplate;
    private final boolean supportsOpeningRhAccount;
    private final Function1<String, Boolean> validatePhoneNumber;

    public /* synthetic */ InternationalInfo(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2, str3, str4, str5, function1, function12);
    }

    @JvmStatic
    public static final InternationalInfo fromCountryCode(List<? extends InternationalInfo> list, CountryCode countryCode) {
        return INSTANCE.fromCountryCode(list, countryCode);
    }

    @JvmStatic
    public static final Supported fromSupportedCountryCode(List<? extends InternationalInfo> list, CountryCode.Supported supported) {
        return INSTANCE.fromSupportedCountryCode(list, supported);
    }

    public static final List<InternationalInfo> getInternationalInfos() {
        return INSTANCE.getInternationalInfos();
    }

    public abstract CountryCode getCountryCode();

    /* JADX WARN: Multi-variable type inference failed */
    private InternationalInfo(String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, Function1<? super String, LocalDate> function1, Function1<? super String, Boolean> function12) {
        this.countryCallingCode = str;
        this.supportsOpeningRhAccount = z;
        this.allowGoogle = z2;
        this.phoneNumberHint = str2;
        this.phoneNumberTemplate = str3;
        this.dobHint = str4;
        this.dobTemplate = str5;
        this.parseDateOfBirth = function1;
        this.validatePhoneNumber = function12;
    }

    public final String getCountryCallingCode() {
        return this.countryCallingCode;
    }

    public final boolean getSupportsOpeningRhAccount() {
        return this.supportsOpeningRhAccount;
    }

    public final boolean getAllowGoogle() {
        return this.allowGoogle;
    }

    public final String getPhoneNumberHint() {
        return this.phoneNumberHint;
    }

    public final String getPhoneNumberTemplate() {
        return this.phoneNumberTemplate;
    }

    public final String getDobHint() {
        return this.dobHint;
    }

    public final String getDobTemplate() {
        return this.dobTemplate;
    }

    public final Function1<String, LocalDate> getParseDateOfBirth() {
        return this.parseDateOfBirth;
    }

    public final Function1<String, Boolean> getValidatePhoneNumber() {
        return this.validatePhoneNumber;
    }

    public final String getDisplayCountry() {
        return CountryCode.getDisplayCountry$default(getCountryCode(), null, 1, null);
    }

    public final String getTwoDigitIsoCode() {
        return getCountryCode().getIso3166CountryCode();
    }

    public final String getDisplayCountryPhoneCode() {
        return "+" + this.countryCallingCode;
    }

    public final String getCountryCodePhoneNumberTemplate() {
        return getDisplayCountryPhoneCode() + PlaceholderUtils.XXShortPlaceholderText + this.phoneNumberTemplate;
    }

    public final String getCountryCodePhoneNumberHint() {
        return getDisplayCountryPhoneCode() + PlaceholderUtils.XXShortPlaceholderText + this.phoneNumberHint;
    }

    /* compiled from: InternationalInfo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012'\u0010\u0013\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rj\u0002`\u0012\u0012'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/util/InternationalInfo$Supported;", "Lcom/robinhood/android/common/util/InternationalInfo;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "countryCode", "", "countryCallingCode", "", "supportsOpeningRhAccount", "allowGoogle", "phoneNumberHint", "phoneNumberTemplate", "dobHint", "dobTemplate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dateOfBirth", "j$/time/LocalDate", "Lcom/robinhood/android/common/util/ParseDateOfBirth;", "parseDateOfBirth", "phoneNumber", "Lcom/robinhood/android/common/util/ValidatePhoneNumber;", "validatePhoneNumber", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Supported extends InternationalInfo {
        public static final int $stable = 8;
        private final CountryCode.Supported countryCode;

        @Override // com.robinhood.android.common.util.InternationalInfo
        public CountryCode.Supported getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Supported(CountryCode.Supported countryCode, String countryCallingCode, boolean z, boolean z2, String phoneNumberHint, String phoneNumberTemplate, String dobHint, String dobTemplate, Function1<? super String, LocalDate> parseDateOfBirth, Function1<? super String, Boolean> validatePhoneNumber) {
            super(countryCallingCode, z, z2, phoneNumberHint, phoneNumberTemplate, dobHint, dobTemplate, parseDateOfBirth, validatePhoneNumber, null);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(countryCallingCode, "countryCallingCode");
            Intrinsics.checkNotNullParameter(phoneNumberHint, "phoneNumberHint");
            Intrinsics.checkNotNullParameter(phoneNumberTemplate, "phoneNumberTemplate");
            Intrinsics.checkNotNullParameter(dobHint, "dobHint");
            Intrinsics.checkNotNullParameter(dobTemplate, "dobTemplate");
            Intrinsics.checkNotNullParameter(parseDateOfBirth, "parseDateOfBirth");
            Intrinsics.checkNotNullParameter(validatePhoneNumber, "validatePhoneNumber");
            this.countryCode = countryCode;
        }
    }

    /* compiled from: InternationalInfo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012'\u0010\u0013\u001a#\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rj\u0002`\u0012\u0012'\u0010\u0016\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00060\rj\u0002`\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/util/InternationalInfo$UnSupported;", "Lcom/robinhood/android/common/util/InternationalInfo;", "Lcom/robinhood/iso/countrycode/CountryCode;", "countryCode", "", "countryCallingCode", "", "supportsOpeningRhAccount", "allowGoogle", "phoneNumberHint", "phoneNumberTemplate", "dobHint", "dobTemplate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "dateOfBirth", "j$/time/LocalDate", "Lcom/robinhood/android/common/util/ParseDateOfBirth;", "parseDateOfBirth", "phoneNumber", "Lcom/robinhood/android/common/util/ValidatePhoneNumber;", "validatePhoneNumber", "<init>", "(Lcom/robinhood/iso/countrycode/CountryCode;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/iso/countrycode/CountryCode;", "getCountryCode", "()Lcom/robinhood/iso/countrycode/CountryCode;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UnSupported extends InternationalInfo {
        public static final int $stable = 8;
        private final CountryCode countryCode;

        @Override // com.robinhood.android.common.util.InternationalInfo
        public CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnSupported(CountryCode countryCode, String countryCallingCode, boolean z, boolean z2, String phoneNumberHint, String phoneNumberTemplate, String dobHint, String dobTemplate, Function1<? super String, LocalDate> parseDateOfBirth, Function1<? super String, Boolean> validatePhoneNumber) {
            super(countryCallingCode, z, z2, phoneNumberHint, phoneNumberTemplate, dobHint, dobTemplate, parseDateOfBirth, validatePhoneNumber, null);
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(countryCallingCode, "countryCallingCode");
            Intrinsics.checkNotNullParameter(phoneNumberHint, "phoneNumberHint");
            Intrinsics.checkNotNullParameter(phoneNumberTemplate, "phoneNumberTemplate");
            Intrinsics.checkNotNullParameter(dobHint, "dobHint");
            Intrinsics.checkNotNullParameter(dobTemplate, "dobTemplate");
            Intrinsics.checkNotNullParameter(parseDateOfBirth, "parseDateOfBirth");
            Intrinsics.checkNotNullParameter(validatePhoneNumber, "validatePhoneNumber");
            this.countryCode = countryCode;
        }
    }

    /* compiled from: InternationalInfo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005H\u0003J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u001b\u001a\u00020\u0007J\f\u0010\u001c\u001a\u00020\u0007*\u00020\u0007H\u0002R\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/util/InternationalInfo$Companion;", "", "<init>", "()V", "forNonSupportedCountry", "Lcom/robinhood/android/common/util/InternationalInfo;", "twoDigitIsoCode", "", "countryCallingCode", "fromCountryCode", "infos", "", "countryCode", "Lcom/robinhood/iso/countrycode/CountryCode;", "fromSupportedCountryCode", "Lcom/robinhood/android/common/util/InternationalInfo$Supported;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "internationalInfos", "getInternationalInfos$annotations", "getInternationalInfos", "()Ljava/util/List;", "sortedInternationalInfos", "getSortedInternationalInfos", "compareLocaleAndIsSupported", "", SduiFeatureDiscovery3.INFO_TAG, "determineInfoFromPhoneNumber", "phoneNumber", "stripNumberToDigits", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInternationalInfos$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InternationalInfo forNonSupportedCountry(String twoDigitIsoCode, String countryCallingCode) {
            return new UnSupported(CountryCode.INSTANCE.getInstance(twoDigitIsoCode), countryCallingCode, false, false, "             ", "#############", "YYYY / MM / DD", "#### / ## / ##", new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InternationalInfo.Companion.forNonSupportedCountry$lambda$0((String) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(InternationalInfo.Companion.forNonSupportedCountry$lambda$1((String) obj));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LocalDate forNonSupportedCountry$lambda$0(String dobStr) {
            Intrinsics.checkNotNullParameter(dobStr, "dobStr");
            if (dobStr.length() <= 6) {
                return null;
            }
            String strSubstring = dobStr.substring(0, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = dobStr.substring(4, 6);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            String strSubstring3 = dobStr.substring(6);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            return LocalDates4.toLocalDateOrNull(strSubstring + "-" + strSubstring2 + "-" + strSubstring3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean forNonSupportedCountry$lambda$1(String str) {
            return str != null && str.length() > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InternationalInfo fromCountryCode$default(Companion companion, List list, CountryCode countryCode, int i, Object obj) {
            if ((i & 1) != 0) {
                list = companion.getInternationalInfos();
            }
            return companion.fromCountryCode(list, countryCode);
        }

        @JvmStatic
        public final InternationalInfo fromCountryCode(List<? extends InternationalInfo> infos, CountryCode countryCode) {
            Intrinsics.checkNotNullParameter(infos, "infos");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            for (InternationalInfo internationalInfo : infos) {
                if (Intrinsics.areEqual(internationalInfo.getCountryCode(), countryCode)) {
                    return internationalInfo;
                }
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(countryCode);
            throw new ExceptionsH();
        }

        @JvmStatic
        public final Supported fromSupportedCountryCode(List<? extends InternationalInfo> infos, CountryCode.Supported countryCode) {
            Intrinsics.checkNotNullParameter(infos, "infos");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            for (InternationalInfo internationalInfo : infos) {
                if (Intrinsics.areEqual(internationalInfo.getCountryCode(), countryCode)) {
                    Intrinsics.checkNotNull(internationalInfo, "null cannot be cast to non-null type com.robinhood.android.common.util.InternationalInfo.Supported");
                    return (Supported) internationalInfo;
                }
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(countryCode);
            throw new ExceptionsH();
        }

        public final List<InternationalInfo> getInternationalInfos() {
            return InternationalInfo.internationalInfos;
        }

        private final String stripNumberToDigits(String str) throws IOException {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        }

        public final List<InternationalInfo> getSortedInternationalInfos() {
            return CollectionsKt.sortedWith(getInternationalInfos(), new Comparator() { // from class: com.robinhood.android.common.util.InternationalInfo$Companion$special$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Boolean.valueOf(this.$receiver$inlined.compareLocaleAndIsSupported((InternationalInfo) t)), Boolean.valueOf(this.$receiver$inlined.compareLocaleAndIsSupported((InternationalInfo) t2)));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"LocaleGetDefaultNoCategory"})
        public final boolean compareLocaleAndIsSupported(InternationalInfo info) {
            CountryCode countryCode = info.getCountryCode();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            return (Intrinsics.areEqual(countryCode, Locales2.getCountryCode(locale)) && info.getSupportsOpeningRhAccount()) ? false : true;
        }

        public final List<InternationalInfo> determineInfoFromPhoneNumber(String phoneNumber) throws IOException {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Iterator<T> it = getInternationalInfos().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int length = InternationalInfo.INSTANCE.stripNumberToDigits(((InternationalInfo) it.next()).getCountryCallingCode()).length();
            while (it.hasNext()) {
                int length2 = InternationalInfo.INSTANCE.stripNumberToDigits(((InternationalInfo) it.next()).getCountryCallingCode()).length();
                if (length < length2) {
                    length = length2;
                }
            }
            String strStripNumberToDigits = stripNumberToDigits(phoneNumber);
            Progressions2 progressions2DownTo = RangesKt.downTo(RangesKt.coerceAtMost(strStripNumberToDigits.length(), length), 1);
            ArrayList<String> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(progressions2DownTo, 10));
            Iterator<Integer> it2 = progressions2DownTo.iterator();
            while (it2.hasNext()) {
                String strSubstring = strStripNumberToDigits.substring(0, ((PrimitiveIterators6) it2).nextInt());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
            }
            for (String str : arrayList) {
                List<InternationalInfo> internationalInfos = getInternationalInfos();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : internationalInfos) {
                    if (Intrinsics.areEqual(InternationalInfo.INSTANCE.stripNumberToDigits(((InternationalInfo) obj).getCountryCallingCode()), str)) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2;
                }
            }
            return CollectionsKt.emptyList();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        internationalInfos = CollectionsKt.listOf((Object[]) new InternationalInfo[]{new Supported(CountryCode.Supported.UnitedStates.INSTANCE, Constants.SdidMigrationStatusCodes.ALREADY_SDID, true, true, "( ––– ) ––– - ––––", "( ### ) ### - ####", "MM / DD / YYYY", "## / ## / ####", new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalInfo.internationalInfos$lambda$0((String) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InternationalInfo.internationalInfos$lambda$1((String) obj));
            }
        }), companion.forNonSupportedCountry("AF", "93"), companion.forNonSupportedCountry("AX", "358"), companion.forNonSupportedCountry("AL", "355"), companion.forNonSupportedCountry("DZ", "213"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_AS, "1-684"), companion.forNonSupportedCountry("AD", "376"), companion.forNonSupportedCountry("AO", "244"), companion.forNonSupportedCountry("AI", "1-264"), companion.forNonSupportedCountry("AQ", "672"), companion.forNonSupportedCountry("AG", "1-268"), companion.forNonSupportedCountry("AR", "54"), companion.forNonSupportedCountry("AM", "374"), companion.forNonSupportedCountry("AW", "297"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_AU, "61"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_AT, "43"), companion.forNonSupportedCountry("AZ", "994"), companion.forNonSupportedCountry("BS", "1-242"), companion.forNonSupportedCountry("BH", "973"), companion.forNonSupportedCountry("BD", "880"), companion.forNonSupportedCountry("BB", "1-246"), companion.forNonSupportedCountry("BY", "375"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_BE, "32"), companion.forNonSupportedCountry("BZ", "501"), companion.forNonSupportedCountry("BJ", "229"), companion.forNonSupportedCountry("BM", "1-441"), companion.forNonSupportedCountry("BT", "975"), companion.forNonSupportedCountry("BO", "591"), companion.forNonSupportedCountry("BQ", "599"), companion.forNonSupportedCountry("BA", "387"), companion.forNonSupportedCountry("BW", "267"), companion.forNonSupportedCountry("BV", "47"), companion.forNonSupportedCountry("BR", "55"), companion.forNonSupportedCountry("IO", "246"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_BN, "673"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_BG, "359"), companion.forNonSupportedCountry("BF", "226"), companion.forNonSupportedCountry("BI", "257"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_KH, "855"), companion.forNonSupportedCountry("CM", "237"), companion.forNonSupportedCountry("CA", Constants.SdidMigrationStatusCodes.ALREADY_SDID), companion.forNonSupportedCountry("CV", "238"), companion.forNonSupportedCountry("KY", "1-345"), companion.forNonSupportedCountry("CF", "236"), companion.forNonSupportedCountry("TD", "235"), companion.forNonSupportedCountry("CL", "56"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_CN, "86"), companion.forNonSupportedCountry("CX", "61"), companion.forNonSupportedCountry("CC", "61"), companion.forNonSupportedCountry("CO", "57"), companion.forNonSupportedCountry("KM", "269"), companion.forNonSupportedCountry("CG", "242"), companion.forNonSupportedCountry("CD", "243"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_CK, "682"), companion.forNonSupportedCountry("CR", "506"), companion.forNonSupportedCountry("CI", "225"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_HR, "385"), companion.forNonSupportedCountry("CU", "53"), companion.forNonSupportedCountry("CW", "599"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_CY, "357"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_CZ, "420"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_DK, "45"), companion.forNonSupportedCountry("DJ", "253"), companion.forNonSupportedCountry("DM", "1-767"), companion.forNonSupportedCountry("DO", "1-809"), companion.forNonSupportedCountry("EC", "593"), companion.forNonSupportedCountry("EG", "20"), companion.forNonSupportedCountry("SV", "503"), companion.forNonSupportedCountry("GQ", "240"), companion.forNonSupportedCountry("ER", "291"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_EE, "372"), companion.forNonSupportedCountry("ET", "251"), companion.forNonSupportedCountry("FK", "500"), companion.forNonSupportedCountry("FO", "298"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_FJ, "679"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_FI, "358"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_FR, "33"), companion.forNonSupportedCountry("GF", "33"), companion.forNonSupportedCountry("PF", "689"), companion.forNonSupportedCountry("TF", "33"), companion.forNonSupportedCountry("GA", "241"), companion.forNonSupportedCountry("GM", "220"), companion.forNonSupportedCountry("GE", "995"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_DE, "49"), companion.forNonSupportedCountry("GH", "233"), companion.forNonSupportedCountry("GI", "350"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_GR, "30"), companion.forNonSupportedCountry("GL", "299"), companion.forNonSupportedCountry("GD", "1-473"), companion.forNonSupportedCountry("GP", "33"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_GU, "1-671"), companion.forNonSupportedCountry("GT", "502"), companion.forNonSupportedCountry("GG", "44-1481"), companion.forNonSupportedCountry("GN", "224"), companion.forNonSupportedCountry("GW", "245"), companion.forNonSupportedCountry("GY", "592"), companion.forNonSupportedCountry("HT", "509"), companion.forNonSupportedCountry("HM", "672"), companion.forNonSupportedCountry("VA", "264"), companion.forNonSupportedCountry("HN", "504"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_HK, "852"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_HU, "36"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_IS, "354"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_IN, "91"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_ID, "62"), companion.forNonSupportedCountry("IR", "98"), companion.forNonSupportedCountry("IQ", "964"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_IE, "353"), companion.forNonSupportedCountry("IM", "44-1624"), companion.forNonSupportedCountry("IL", "972"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_IT, "39"), companion.forNonSupportedCountry("JM", "1-876"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_JP, "81"), companion.forNonSupportedCountry("JE", "44-1534"), companion.forNonSupportedCountry("JO", "962"), companion.forNonSupportedCountry("KZ", "7"), companion.forNonSupportedCountry("KE", "254"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_KI, "686"), companion.forNonSupportedCountry("KP", "850"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_KR, "82"), companion.forNonSupportedCountry("KW", "965"), companion.forNonSupportedCountry("KG", "996"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_LA, "856"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_LV, "371"), companion.forNonSupportedCountry("LB", "961"), companion.forNonSupportedCountry("LS", "266"), companion.forNonSupportedCountry("LR", "231"), companion.forNonSupportedCountry("LY", "218"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_LI, "423"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_LT, "370"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_LU, "352"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_MO, "853"), companion.forNonSupportedCountry("MK", "389"), companion.forNonSupportedCountry("MG", "261"), companion.forNonSupportedCountry("MW", "265"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_MY, "60"), companion.forNonSupportedCountry("MV", "960"), companion.forNonSupportedCountry("ML", "223"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_MT, "356"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_MH, "692"), companion.forNonSupportedCountry("MQ", "33"), companion.forNonSupportedCountry("MR", "222"), companion.forNonSupportedCountry("MU", "230"), companion.forNonSupportedCountry("YT", "262"), companion.forNonSupportedCountry("MX", "52"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_FM, "691"), companion.forNonSupportedCountry("MD", "373"), companion.forNonSupportedCountry("MC", "377"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_MN, "976"), companion.forNonSupportedCountry("ME", "382"), companion.forNonSupportedCountry("MS", "1-664"), companion.forNonSupportedCountry("MA", "212"), companion.forNonSupportedCountry("MZ", "258"), companion.forNonSupportedCountry("MM", "95"), companion.forNonSupportedCountry("NA", "264"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_NR, "674"), companion.forNonSupportedCountry("NP", "977"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_NL, "31"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_NC, "687"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_NZ, "64"), companion.forNonSupportedCountry("NI", "505"), companion.forNonSupportedCountry("NE", "227"), companion.forNonSupportedCountry("NG", "234"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_NU, "683"), companion.forNonSupportedCountry("NF", "6723"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_MP, "1-670"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_NO, "47"), companion.forNonSupportedCountry("OM", "968"), companion.forNonSupportedCountry("PK", "92"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_PW, "680"), companion.forNonSupportedCountry("PS", "970"), companion.forNonSupportedCountry("PA", "507"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_PG, "675"), companion.forNonSupportedCountry("PY", "595"), companion.forNonSupportedCountry("PE", "51"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_PH, "63"), companion.forNonSupportedCountry("PN", "64"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_PL, "48"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_PT, "351"), companion.forNonSupportedCountry("PR", "1-787"), companion.forNonSupportedCountry("QA", "974"), companion.forNonSupportedCountry("RE", "262"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_RO, "40"), companion.forNonSupportedCountry("RU", "7"), companion.forNonSupportedCountry("RW", "250"), companion.forNonSupportedCountry("BL", "590"), companion.forNonSupportedCountry("SH", "290"), companion.forNonSupportedCountry("KN", "1-869"), companion.forNonSupportedCountry("LC", "1-758"), companion.forNonSupportedCountry("MF", "590"), companion.forNonSupportedCountry("PM", "508"), companion.forNonSupportedCountry("VC", "1-784"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_WS, "685"), companion.forNonSupportedCountry("SM", "378"), companion.forNonSupportedCountry("ST", "239"), companion.forNonSupportedCountry("SA", "966"), companion.forNonSupportedCountry("SN", "221"), companion.forNonSupportedCountry("RS", "381"), companion.forNonSupportedCountry("SC", "248"), companion.forNonSupportedCountry("SL", "232"), new Supported(CountryCode.Supported.Singapore.INSTANCE, "65", true, true, "____ ____", "#### ####", "DD / MM / YYYY", "## / ## / ####", new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalInfo.internationalInfos$lambda$2((String) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InternationalInfo.internationalInfos$lambda$3((String) obj));
            }
        }), companion.forNonSupportedCountry("SX", "1-721"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_SK, "421"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_SI, "386"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_SB, "677"), companion.forNonSupportedCountry("SO", "252"), companion.forNonSupportedCountry("ZA", "27"), companion.forNonSupportedCountry("GS", "995"), companion.forNonSupportedCountry("SS", "211"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_ES, "34"), companion.forNonSupportedCountry("LK", "94"), companion.forNonSupportedCountry("SD", "249"), companion.forNonSupportedCountry("SR", "597"), companion.forNonSupportedCountry("SJ", "47"), companion.forNonSupportedCountry("SZ", "268"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_SE, "46"), companion.forNonSupportedCountry("CH", "41"), companion.forNonSupportedCountry("SY", "963"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_TW, "886"), companion.forNonSupportedCountry("TJ", "992"), companion.forNonSupportedCountry("TZ", "255"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_TH, "66"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_TL, "670"), companion.forNonSupportedCountry("TG", "228"), companion.forNonSupportedCountry("TK", "690"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_TO, "676"), companion.forNonSupportedCountry("TT", "1-868"), companion.forNonSupportedCountry("TN", "216"), companion.forNonSupportedCountry("TR", "90"), companion.forNonSupportedCountry("TM", "993"), companion.forNonSupportedCountry("TC", "1-649"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_TV, "688"), companion.forNonSupportedCountry("UG", "256"), companion.forNonSupportedCountry("UA", "380"), companion.forNonSupportedCountry("AE", "971"), new Supported(CountryCode.Supported.UnitedKingdom.INSTANCE, "44", true, true, "–––– ––––––", "#### ######", "DD / MM / YYYY", "## / ## / ####", new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternationalInfo.internationalInfos$lambda$4((String) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.util.InternationalInfo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(InternationalInfo.internationalInfos$lambda$5((String) obj));
            }
        }), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_UM, Constants.SdidMigrationStatusCodes.ALREADY_SDID), companion.forNonSupportedCountry("UY", "598"), companion.forNonSupportedCountry("UZ", "998"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_VU, "678"), companion.forNonSupportedCountry("VE", "58"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_VN, "84"), companion.forNonSupportedCountry("VG", "1-284"), companion.forNonSupportedCountry(CountryCode.COUNTRY_CODE_VI, "1-340"), companion.forNonSupportedCountry("WF", "681"), companion.forNonSupportedCountry("EH", "212"), companion.forNonSupportedCountry("YE", "967"), companion.forNonSupportedCountry("ZM", "260"), companion.forNonSupportedCountry("ZW", "263")});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate internationalInfos$lambda$0(String dobStr) {
        Intrinsics.checkNotNullParameter(dobStr, "dobStr");
        if (dobStr.length() <= 4) {
            return null;
        }
        String strSubstring = dobStr.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = dobStr.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = dobStr.substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        return LocalDates4.toLocalDateOrNull(strSubstring + "-" + strSubstring2 + "-" + strSubstring3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean internationalInfos$lambda$1(String str) {
        return str != null && str.length() == 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate internationalInfos$lambda$2(String dobStr) {
        Intrinsics.checkNotNullParameter(dobStr, "dobStr");
        if (dobStr.length() <= 4) {
            return null;
        }
        String strSubstring = dobStr.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = dobStr.substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = dobStr.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        return LocalDates4.toLocalDateOrNull(strSubstring + "-" + strSubstring2 + "-" + strSubstring3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean internationalInfos$lambda$3(String str) {
        return str != null && str.length() == 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate internationalInfos$lambda$4(String dobStr) {
        Intrinsics.checkNotNullParameter(dobStr, "dobStr");
        if (dobStr.length() <= 4) {
            return null;
        }
        String strSubstring = dobStr.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strSubstring2 = dobStr.substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        String strSubstring3 = dobStr.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        return LocalDates4.toLocalDateOrNull(strSubstring + "-" + strSubstring2 + "-" + strSubstring3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean internationalInfos$lambda$5(String str) {
        return str != null && str.length() == 10;
    }
}
