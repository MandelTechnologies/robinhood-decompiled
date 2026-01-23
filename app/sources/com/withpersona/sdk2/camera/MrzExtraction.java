package com.withpersona.sdk2.camera;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.singular.sdk.internal.Constants;
import com.withpersona.sdk2.camera.MrzExtraction;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: MrzExtraction.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u0000 02\u00020\u0001:\u00010B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b'\u0010\u0016R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b(\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b)\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b-\u0010,R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b.\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b/\u0010\u0016¨\u00061"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/MrzExtraction;", "", "", "rawText", "idClass", "nameFirst", "nameMiddle", "nameLast", "sex", "addressStreet1", "addressCity", "addressState", "addressPostalCode", "identificationNumber", "Ljava/util/Date;", "issueDate", "expirationDate", "birthdate", "issuingCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRawText", "getIdClass", "getNameFirst", "getNameMiddle", "getNameLast", "getSex", "getAddressStreet1", "getAddressCity", "getAddressState", "getAddressPostalCode", "getIdentificationNumber", "Ljava/util/Date;", "getIssueDate", "()Ljava/util/Date;", "getExpirationDate", "getBirthdate", "getIssuingCountry", "Companion", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class MrzExtraction {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex TD1_LINE1 = new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{9})([0-9]{1})([A-Z0-9<]{15})");
    private static final Regex TD1_LINE2 = new Regex("([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z]{3})([A-Z0-9<]{11})([0-9]{1})");
    private static final Regex TD1_LINE3 = new Regex("([A-Z0-9<]{30})");
    private static final Regex TD2_LINE1 = new Regex("([ACI][A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]{31})");
    private static final Regex TD2_LINE2 = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})([A-Z0-9<]{7})([0-9]{1})");
    private static final Regex TD2_LINE3 = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?<<+)");
    private static final Regex TD3_LINE1 = new Regex("(P[A-Z0-9<]{1})([A-Z]{3})([A-Z0-9<]+?)<<([A-Z0-9<]+<<+)");
    private static final Regex TD3_LINE2 = new Regex("([A-Z0-9<]{9})([0-9]{1})([A-Z]{3})([0-9]{6})([0-9]{1})([MFX<]{1})([0-9]{6})([0-9]{1})?([A-Z0-9<]{14})?([0-9]{1})?([0-9]{1})?");
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
    private final String rawText;
    private final String sex;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzExtraction)) {
            return false;
        }
        MrzExtraction mrzExtraction = (MrzExtraction) other;
        return Intrinsics.areEqual(this.rawText, mrzExtraction.rawText) && Intrinsics.areEqual(this.idClass, mrzExtraction.idClass) && Intrinsics.areEqual(this.nameFirst, mrzExtraction.nameFirst) && Intrinsics.areEqual(this.nameMiddle, mrzExtraction.nameMiddle) && Intrinsics.areEqual(this.nameLast, mrzExtraction.nameLast) && Intrinsics.areEqual(this.sex, mrzExtraction.sex) && Intrinsics.areEqual(this.addressStreet1, mrzExtraction.addressStreet1) && Intrinsics.areEqual(this.addressCity, mrzExtraction.addressCity) && Intrinsics.areEqual(this.addressState, mrzExtraction.addressState) && Intrinsics.areEqual(this.addressPostalCode, mrzExtraction.addressPostalCode) && Intrinsics.areEqual(this.identificationNumber, mrzExtraction.identificationNumber) && Intrinsics.areEqual(this.issueDate, mrzExtraction.issueDate) && Intrinsics.areEqual(this.expirationDate, mrzExtraction.expirationDate) && Intrinsics.areEqual(this.birthdate, mrzExtraction.birthdate) && Intrinsics.areEqual(this.issuingCountry, mrzExtraction.issuingCountry);
    }

    public int hashCode() {
        int iHashCode = this.rawText.hashCode() * 31;
        String str = this.idClass;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameFirst;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameMiddle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nameLast;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sex;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet1;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressPostalCode;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.identificationNumber;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date = this.issueDate;
        int iHashCode12 = (iHashCode11 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.expirationDate;
        int iHashCode13 = (iHashCode12 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.birthdate;
        int iHashCode14 = (iHashCode13 + (date3 == null ? 0 : date3.hashCode())) * 31;
        String str11 = this.issuingCountry;
        return iHashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "MrzExtraction(rawText=" + this.rawText + ", idClass=" + this.idClass + ", nameFirst=" + this.nameFirst + ", nameMiddle=" + this.nameMiddle + ", nameLast=" + this.nameLast + ", sex=" + this.sex + ", addressStreet1=" + this.addressStreet1 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressPostalCode=" + this.addressPostalCode + ", identificationNumber=" + this.identificationNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", birthdate=" + this.birthdate + ", issuingCountry=" + this.issuingCountry + ")";
    }

    public MrzExtraction(String rawText, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Date date, Date date2, Date date3, String str11) {
        Intrinsics.checkNotNullParameter(rawText, "rawText");
        this.rawText = rawText;
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

    public /* synthetic */ MrzExtraction(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Date date, Date date2, Date date3, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : date, (i & 4096) != 0 ? null : date2, (i & 8192) != 0 ? null : date3, (i & 16384) != 0 ? null : str12);
    }

    public final String getRawText() {
        return this.rawText;
    }

    public final String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final Date getBirthdate() {
        return this.birthdate;
    }

    /* compiled from: MrzExtraction.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/MrzExtraction$Companion;", "", "<init>", "()V", "fromString", "Lcom/withpersona/sdk2/camera/MrzExtraction;", "rawText", "", "parseTd1", "cleanText", "parseTd3", "cleanName", "name", "cleanDate", "Ljava/util/Date;", InquiryField.DateField.TYPE, "TD1_LINE1", "Lkotlin/text/Regex;", "TD1_LINE2", "TD1_LINE3", "TD2_LINE1", "TD2_LINE2", "TD2_LINE3", "TD3_LINE1", "TD3_LINE2", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MrzExtraction fromString(String rawText) {
            if (rawText == null) {
                return null;
            }
            String strReplace = new Regex("([\r\t ])").replace(rawText, "");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = strReplace.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            MrzExtraction td1 = parseTd1(upperCase);
            return td1 == null ? parseTd3(upperCase) : td1;
        }

        private final MrzExtraction parseTd1(String cleanText) {
            MatchResult matchResultFind$default;
            MatchResult matchResultFind$default2;
            MatchResult matchResultFind$default3 = Regex.find$default(MrzExtraction.TD1_LINE1, cleanText, 0, 2, null);
            if (matchResultFind$default3 == null || (matchResultFind$default = Regex.find$default(MrzExtraction.TD1_LINE2, cleanText, 0, 2, null)) == null || (matchResultFind$default2 = Regex.find$default(MrzExtraction.TD1_LINE3, StringsKt.replace$default(StringsKt.replace$default(cleanText, matchResultFind$default3.getValue(), "", false, 4, (Object) null), matchResultFind$default.getValue(), "", false, 4, (Object) null), 0, 2, null)) == null) {
                return null;
            }
            String string2 = StringsKt.trim(matchResultFind$default2.getValue()).toString();
            int length = string2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = string2.charAt(!z ? i : length) == '<';
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            List listSplit$default = StringsKt.split$default((CharSequence) string2.subSequence(i, length + 1).toString(), new String[]{"<<"}, false, 0, 6, (Object) null);
            return new MrzExtraction(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new MatchResult[]{matchResultFind$default3, matchResultFind$default, matchResultFind$default2}), "\n", null, null, 0, null, new Function1() { // from class: com.withpersona.sdk2.camera.MrzExtraction$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.parseTd1$lambda$1((MatchResult) obj);
                }
            }, 30, null), null, cleanName((String) CollectionsKt.getOrNull(listSplit$default, 1)), null, cleanName((String) CollectionsKt.getOrNull(listSplit$default, 0)), matchResultFind$default.getGroupValues().get(3), null, null, null, null, matchResultFind$default3.getGroupValues().get(3), null, cleanDate(matchResultFind$default.getGroupValues().get(4)), cleanDate(matchResultFind$default.getGroupValues().get(1)), matchResultFind$default3.getGroupValues().get(2), 3018, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence parseTd1$lambda$1(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }

        private final MrzExtraction parseTd3(String cleanText) {
            MatchResult matchResultFind$default;
            MatchResult matchResultFind$default2 = Regex.find$default(MrzExtraction.TD3_LINE1, cleanText, 0, 2, null);
            if (matchResultFind$default2 == null || (matchResultFind$default = Regex.find$default(MrzExtraction.TD3_LINE2, cleanText, 0, 2, null)) == null) {
                return null;
            }
            return new MrzExtraction(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new MatchResult[]{matchResultFind$default2, matchResultFind$default}), "\n", null, null, 0, null, new Function1() { // from class: com.withpersona.sdk2.camera.MrzExtraction$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MrzExtraction.Companion.parseTd3$lambda$2((MatchResult) obj);
                }
            }, 30, null), null, cleanName(matchResultFind$default2.getGroupValues().get(4)), null, cleanName(matchResultFind$default2.getGroupValues().get(3)), matchResultFind$default.getGroupValues().get(6), null, null, null, null, matchResultFind$default.getGroupValues().get(1), null, cleanDate(matchResultFind$default.getGroupValues().get(7)), cleanDate(matchResultFind$default.getGroupValues().get(4)), matchResultFind$default2.getGroupValues().get(2), 3018, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence parseTd3$lambda$2(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getValue();
        }

        private final String cleanName(String name) {
            if (name == null) {
                return null;
            }
            return StringsKt.trim(StringsKt.replace$default(name, "<", PlaceholderUtils.XXShortPlaceholderText, false, 4, (Object) null)).toString();
        }

        private final Date cleanDate(String date) {
            if (date == null) {
                return null;
            }
            try {
                return new SimpleDateFormat("yyMMdd", Locale.US).parse(new Regex("G").replace(new Regex("S").replace(new Regex("O").replace(new Regex("D").replace(new Regex("L").replace(new Regex("I").replace(date, Constants.SdidMigrationStatusCodes.ALREADY_SDID), Constants.SdidMigrationStatusCodes.ALREADY_SDID), "0"), "0"), Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION), "6"));
            } catch (ParseException unused) {
                return null;
            }
        }
    }
}
