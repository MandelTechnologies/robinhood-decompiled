package com.withpersona.sdk2.camera;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* compiled from: AamvaExtraction.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b%\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b'\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b-\u0010\u0015¨\u0006/"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/AamvaExtraction;", "", "", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIdClass", "getNameFirst", "getNameMiddle", "getNameLast", "getSex", "getAddressStreet1", "getAddressCity", "getAddressState", "getAddressPostalCode", "getIdentificationNumber", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "getExpirationDate", "getBirthdate", "getIssuingCountry", "Companion", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AamvaExtraction {
    private static final Regex BIRTH_DATE;
    private static final Regex CITY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Regex EXPIRY_DATE;
    private static final Regex FIRST_NAME;
    private static final Regex GENDER;
    private static final Regex ISSUE_DATE;
    private static final Regex ISSUING_COUNTRY;
    private static final Regex LAST_NAME;
    private static final Regex LICENSE_NUMBER;
    private static final Regex MIDDLE_NAME;
    private static final Regex STATE;
    private static final Regex STREET;
    private static final Regex ZIP;
    private final String addressCity;
    private final String addressPostalCode;
    private final String addressState;
    private final String addressStreet1;
    private final Date birthdate;
    private final Date expirationDate;
    private final String idClass;
    private final String identificationNumber;
    private final Date issueDate;
    private final String issuingCountry;
    private final String nameFirst;
    private final String nameLast;
    private final String nameMiddle;
    private final String sex;

    public AamvaExtraction() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AamvaExtraction)) {
            return false;
        }
        AamvaExtraction aamvaExtraction = (AamvaExtraction) other;
        return Intrinsics.areEqual(this.idClass, aamvaExtraction.idClass) && Intrinsics.areEqual(this.nameFirst, aamvaExtraction.nameFirst) && Intrinsics.areEqual(this.nameMiddle, aamvaExtraction.nameMiddle) && Intrinsics.areEqual(this.nameLast, aamvaExtraction.nameLast) && Intrinsics.areEqual(this.sex, aamvaExtraction.sex) && Intrinsics.areEqual(this.addressStreet1, aamvaExtraction.addressStreet1) && Intrinsics.areEqual(this.addressCity, aamvaExtraction.addressCity) && Intrinsics.areEqual(this.addressState, aamvaExtraction.addressState) && Intrinsics.areEqual(this.addressPostalCode, aamvaExtraction.addressPostalCode) && Intrinsics.areEqual(this.identificationNumber, aamvaExtraction.identificationNumber) && Intrinsics.areEqual(this.issueDate, aamvaExtraction.issueDate) && Intrinsics.areEqual(this.expirationDate, aamvaExtraction.expirationDate) && Intrinsics.areEqual(this.birthdate, aamvaExtraction.birthdate) && Intrinsics.areEqual(this.issuingCountry, aamvaExtraction.issuingCountry);
    }

    public int hashCode() {
        String str = this.idClass;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameFirst;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode11 = (iHashCode10 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode12 = (iHashCode11 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode13 = (iHashCode12 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "AamvaExtraction(idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11) {
        this.idClass = str;
        this.nameFirst = str2;
        this.nameMiddle = str3;
        this.nameLast = str4;
        this.sex = str5;
        this.addressStreet1 = str6;
        this.addressCity = str7;
        this.addressState = str8;
        this.addressPostalCode = str9;
        this.identificationNumber = str10;
        this.issueDate = date;
        this.expirationDate = date2;
        this.birthdate = date3;
        this.issuingCountry = str11;
    }

    public /* synthetic */ AamvaExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : date, (i & 2048) != 0 ? null : date2, (i & 4096) != 0 ? null : date3, (i & 8192) != 0 ? null : str11);
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final Date getBirthdate() {
        return this.birthdate;
    }

    /* compiled from: AamvaExtraction.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/camera/AamvaExtraction$Companion;", "", "<init>", "()V", "CITY", "Lkotlin/text/Regex;", "STATE", "STREET", "ZIP", "BIRTH_DATE", "EXPIRY_DATE", "FIRST_NAME", "GENDER", "ISSUE_DATE", "ISSUING_COUNTRY", "LAST_NAME", "LICENSE_NUMBER", "MIDDLE_NAME", "fromString", "Lcom/withpersona/sdk2/camera/AamvaExtraction;", "rawText", "", "fieldRegex", "key", "parseField", "fieldPattern", "convertDate", "Ljava/util/Date;", "value", "valid", "", "barcodeText", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AamvaExtraction fromString(String rawText) {
            if (rawText == null || !valid(rawText)) {
                return null;
            }
            return new AamvaExtraction(null, parseField(rawText, AamvaExtraction.FIRST_NAME), parseField(rawText, AamvaExtraction.MIDDLE_NAME), parseField(rawText, AamvaExtraction.LAST_NAME), parseField(rawText, AamvaExtraction.GENDER), parseField(rawText, AamvaExtraction.STREET), parseField(rawText, AamvaExtraction.CITY), parseField(rawText, AamvaExtraction.STATE), parseField(rawText, AamvaExtraction.ZIP), parseField(rawText, AamvaExtraction.LICENSE_NUMBER), convertDate(parseField(rawText, AamvaExtraction.ISSUE_DATE)), convertDate(parseField(rawText, AamvaExtraction.EXPIRY_DATE)), convertDate(parseField(rawText, AamvaExtraction.BIRTH_DATE)), parseField(rawText, AamvaExtraction.ISSUING_COUNTRY), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex fieldRegex(String key) {
            return new Regex("\n" + key + "(.+?)(\n|$)");
        }

        private final String parseField(String rawText, Regex fieldPattern) {
            List<String> groupValues;
            MatchResult matchResultFind$default = Regex.find$default(fieldPattern, rawText, 0, 2, null);
            if (matchResultFind$default == null || (groupValues = matchResultFind$default.getGroupValues()) == null) {
                return null;
            }
            return (String) CollectionsKt.getOrNull(groupValues, 1);
        }

        private final Date convertDate(String value) {
            if (value == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("MMddyyyy", Locale.US).parse(value);
            } catch (Exception unused) {
                return null;
            }
        }

        private final boolean valid(String barcodeText) {
            return (!new Regex("^@\n\\u001e\r(ANSI |AAMVA)\\d{10}.+", RegexOption.DOT_MATCHES_ALL).matches(StringsKt.trim(barcodeText).toString()) || parseField(barcodeText, AamvaExtraction.FIRST_NAME) == null || parseField(barcodeText, AamvaExtraction.LAST_NAME) == null) ? false : true;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        CITY = companion.fieldRegex("DAI");
        STATE = companion.fieldRegex("DAJ");
        STREET = companion.fieldRegex("DAG");
        ZIP = companion.fieldRegex("DAK");
        BIRTH_DATE = companion.fieldRegex("DBB");
        EXPIRY_DATE = companion.fieldRegex("DBA");
        FIRST_NAME = companion.fieldRegex("DAC");
        GENDER = companion.fieldRegex("DBC");
        ISSUE_DATE = companion.fieldRegex("DBD");
        ISSUING_COUNTRY = companion.fieldRegex("DCG");
        LAST_NAME = companion.fieldRegex("DCS");
        LICENSE_NUMBER = companion.fieldRegex("DAQ");
        MIDDLE_NAME = companion.fieldRegex("DAD");
    }
}
