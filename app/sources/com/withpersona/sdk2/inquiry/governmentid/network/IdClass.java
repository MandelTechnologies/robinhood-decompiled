package com.withpersona.sdk2.inquiry.governmentid.network;

import com.singular.sdk.internal.Constants;
import com.withpersona.sdk2.inquiry.governmentid.IdIcon;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IdClass.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001e\u001a\u00020\u001fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006!"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "", "<init>", "(Ljava/lang/String;I)V", "DriverLicense", "StateID", "Keypass", "MilitaryID", "MyNumberCard", "NRIC", "OFWID", "Passport", "PermanentResidentCard", "ResidencyPermit", "StudentPermit", "SocialSecurityID", "UMID", "VoterID", "PassportCard", "PostalID", "Visa", "WorkPermit", "CitizenshipCertificate", "ConsularID", "ForeignerID", "HealthInsuranceCard", "LongTermPass", "NBICertificate", "PermanentAccountNumber", "Unknown", "toIcon", "Lcom/withpersona/sdk2/inquiry/governmentid/IdIcon;", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class IdClass {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IdClass[] $VALUES;
    public static final IdClass CitizenshipCertificate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IdClass ConsularID;
    public static final IdClass DriverLicense;
    public static final IdClass ForeignerID;
    public static final IdClass HealthInsuranceCard;
    public static final String KeyAutoClassification = "auto-classification";
    public static final IdClass Keypass;
    public static final IdClass LongTermPass;
    public static final IdClass MilitaryID;
    public static final IdClass MyNumberCard;
    public static final IdClass NBICertificate;
    public static final IdClass NRIC;
    public static final IdClass OFWID;
    public static final IdClass Passport;
    public static final IdClass PassportCard;
    public static final IdClass PermanentAccountNumber;
    public static final IdClass PermanentResidentCard;
    public static final IdClass PostalID;
    public static final IdClass ResidencyPermit;
    public static final IdClass SocialSecurityID;
    public static final IdClass StateID;
    public static final IdClass StudentPermit;
    public static final IdClass UMID;
    public static final IdClass Unknown;
    public static final IdClass Visa;
    public static final IdClass VoterID;
    public static final IdClass WorkPermit;
    private static final Map<String, IdClass> codes;

    /* compiled from: IdClass.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdClass.values().length];
            try {
                iArr[IdClass.DriverLicense.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdClass.StateID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdClass.Keypass.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IdClass.MilitaryID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IdClass.MyNumberCard.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IdClass.NRIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IdClass.OFWID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IdClass.Passport.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IdClass.PermanentResidentCard.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IdClass.ResidencyPermit.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IdClass.StudentPermit.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IdClass.SocialSecurityID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IdClass.UMID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IdClass.VoterID.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[IdClass.PassportCard.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[IdClass.PostalID.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[IdClass.Visa.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[IdClass.WorkPermit.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[IdClass.CitizenshipCertificate.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[IdClass.ConsularID.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[IdClass.ForeignerID.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[IdClass.HealthInsuranceCard.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[IdClass.LongTermPass.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[IdClass.NBICertificate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[IdClass.PermanentAccountNumber.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[IdClass.Unknown.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ IdClass[] $values() {
        return new IdClass[]{DriverLicense, StateID, Keypass, MilitaryID, MyNumberCard, NRIC, OFWID, Passport, PermanentResidentCard, ResidencyPermit, StudentPermit, SocialSecurityID, UMID, VoterID, PassportCard, PostalID, Visa, WorkPermit, CitizenshipCertificate, ConsularID, ForeignerID, HealthInsuranceCard, LongTermPass, NBICertificate, PermanentAccountNumber, Unknown};
    }

    public static EnumEntries<IdClass> getEntries() {
        return $ENTRIES;
    }

    private IdClass(String str, int i) {
    }

    static {
        IdClass idClass = new IdClass("DriverLicense", 0);
        DriverLicense = idClass;
        IdClass idClass2 = new IdClass("StateID", 1);
        StateID = idClass2;
        IdClass idClass3 = new IdClass("Keypass", 2);
        Keypass = idClass3;
        IdClass idClass4 = new IdClass("MilitaryID", 3);
        MilitaryID = idClass4;
        IdClass idClass5 = new IdClass("MyNumberCard", 4);
        MyNumberCard = idClass5;
        IdClass idClass6 = new IdClass("NRIC", 5);
        NRIC = idClass6;
        IdClass idClass7 = new IdClass("OFWID", 6);
        OFWID = idClass7;
        IdClass idClass8 = new IdClass("Passport", 7);
        Passport = idClass8;
        IdClass idClass9 = new IdClass("PermanentResidentCard", 8);
        PermanentResidentCard = idClass9;
        IdClass idClass10 = new IdClass("ResidencyPermit", 9);
        ResidencyPermit = idClass10;
        IdClass idClass11 = new IdClass("StudentPermit", 10);
        StudentPermit = idClass11;
        IdClass idClass12 = new IdClass("SocialSecurityID", 11);
        SocialSecurityID = idClass12;
        IdClass idClass13 = new IdClass("UMID", 12);
        UMID = idClass13;
        IdClass idClass14 = new IdClass("VoterID", 13);
        VoterID = idClass14;
        IdClass idClass15 = new IdClass("PassportCard", 14);
        PassportCard = idClass15;
        IdClass idClass16 = new IdClass("PostalID", 15);
        PostalID = idClass16;
        IdClass idClass17 = new IdClass("Visa", 16);
        Visa = idClass17;
        IdClass idClass18 = new IdClass("WorkPermit", 17);
        WorkPermit = idClass18;
        IdClass idClass19 = new IdClass("CitizenshipCertificate", 18);
        CitizenshipCertificate = idClass19;
        IdClass idClass20 = new IdClass("ConsularID", 19);
        ConsularID = idClass20;
        IdClass idClass21 = new IdClass("ForeignerID", 20);
        ForeignerID = idClass21;
        IdClass idClass22 = new IdClass("HealthInsuranceCard", 21);
        HealthInsuranceCard = idClass22;
        IdClass idClass23 = new IdClass("LongTermPass", 22);
        LongTermPass = idClass23;
        IdClass idClass24 = new IdClass("NBICertificate", 23);
        NBICertificate = idClass24;
        IdClass idClass25 = new IdClass("PermanentAccountNumber", 24);
        PermanentAccountNumber = idClass25;
        Unknown = new IdClass("Unknown", 25);
        IdClass[] idClassArr$values = $values();
        $VALUES = idClassArr$values;
        $ENTRIES = EnumEntries2.enumEntries(idClassArr$values);
        INSTANCE = new Companion(null);
        codes = MapsKt.mapOf(Tuples4.m3642to("dl", idClass), Tuples4.m3642to("id", idClass2), Tuples4.m3642to("keyp", idClass3), Tuples4.m3642to("mid", idClass4), Tuples4.m3642to("myn", idClass5), Tuples4.m3642to("nric", idClass6), Tuples4.m3642to("ofw", idClass7), Tuples4.m3642to(Constants.REVENUE_PRODUCT_PRICE_KEY, idClass8), Tuples4.m3642to("pr", idClass9), Tuples4.m3642to("rp", idClass10), Tuples4.m3642to("sp", idClass11), Tuples4.m3642to("sss", idClass12), Tuples4.m3642to("umid", idClass13), Tuples4.m3642to("vid", idClass14), Tuples4.m3642to("ppc", idClass15), Tuples4.m3642to("pid", idClass16), Tuples4.m3642to("visa", idClass17), Tuples4.m3642to("wp", idClass18), Tuples4.m3642to("cct", idClass19), Tuples4.m3642to("cid", idClass20), Tuples4.m3642to("foid", idClass21), Tuples4.m3642to("hic", idClass22), Tuples4.m3642to("ltpass", idClass23), Tuples4.m3642to("nbi", idClass24), Tuples4.m3642to("pan", idClass25));
    }

    public final IdIcon toIcon() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return IdIcon.Card;
            case 2:
                return IdIcon.Flag;
            case 3:
                return IdIcon.Card;
            case 4:
                return IdIcon.Card;
            case 5:
                return IdIcon.Card;
            case 6:
                return IdIcon.Card;
            case 7:
                return IdIcon.Card;
            case 8:
                return IdIcon.World;
            case 9:
                return IdIcon.House;
            case 10:
                return IdIcon.House;
            case 11:
                return IdIcon.Card;
            case 12:
                return IdIcon.Card;
            case 13:
                return IdIcon.Card;
            case 14:
                return IdIcon.Card;
            case 15:
                return IdIcon.World;
            case 16:
                return IdIcon.Card;
            case 17:
                return IdIcon.World;
            case 18:
                return IdIcon.Card;
            case 19:
                return IdIcon.Card;
            case 20:
                return IdIcon.Card;
            case 21:
                return IdIcon.Card;
            case 22:
                return IdIcon.Card;
            case 23:
                return IdIcon.Card;
            case 24:
                return IdIcon.Card;
            case 25:
                return IdIcon.Card;
            case 26:
                throw new RuntimeException("IdClass is 'UNKNOWN'.");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: IdClass.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass$Companion;", "", "<init>", "()V", "KeyAutoClassification", "", "fromAbbreviation", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "abbr", "codes", "", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IdClass fromAbbreviation(String abbr) {
            Intrinsics.checkNotNullParameter(abbr, "abbr");
            IdClass idClass = (IdClass) IdClass.codes.get(abbr);
            return idClass == null ? IdClass.Unknown : idClass;
        }
    }

    public static IdClass valueOf(String str) {
        return (IdClass) Enum.valueOf(IdClass.class, str);
    }

    public static IdClass[] values() {
        return (IdClass[]) $VALUES.clone();
    }
}
