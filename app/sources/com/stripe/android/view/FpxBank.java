package com.stripe.android.view;

import com.stripe.android.R$drawable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FpxBank.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\b\u0080\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001#B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, m3636d2 = {"Lcom/stripe/android/view/FpxBank;", "", "Lcom/stripe/android/view/Bank;", "id", "", "code", "displayName", "brandIconResId", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBrandIconResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "()Ljava/lang/String;", "getDisplayName", "getId", "Maybank2U", "Cimb", "PublicBank", "Rhb", "HongLeongBank", "AmBank", "AffinBank", "AllianceBankBusiness", "BankIslam", "BankMuamalat", "BankRakyat", "Bsn", "Hsbc", "Kfh", "Maybank2E", "Ocbc", "StandardChartered", "UobBank", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class FpxBank implements Bank {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FpxBank[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final Integer brandIconResId;
    private final String code;
    private final String displayName;
    private final String id;
    public static final FpxBank Maybank2U = new FpxBank("Maybank2U", 0, "MB2U0227", "maybank2u", "Maybank2U", Integer.valueOf(R$drawable.stripe_ic_bank_maybank));
    public static final FpxBank Cimb = new FpxBank("Cimb", 1, "BCBB0235", "cimb", "CIMB Clicks", Integer.valueOf(R$drawable.stripe_ic_bank_cimb));
    public static final FpxBank PublicBank = new FpxBank("PublicBank", 2, "PBB0233", "public_bank", "Public Bank", Integer.valueOf(R$drawable.stripe_ic_bank_public));
    public static final FpxBank Rhb = new FpxBank("Rhb", 3, "RHB0218", "rhb", "RHB Bank", Integer.valueOf(R$drawable.stripe_ic_bank_rhb));
    public static final FpxBank HongLeongBank = new FpxBank("HongLeongBank", 4, "HLB0224", "hong_leong_bank", "Hong Leong Bank", Integer.valueOf(R$drawable.stripe_ic_bank_hong_leong));
    public static final FpxBank AmBank = new FpxBank("AmBank", 5, "AMBB0209", "ambank", "AmBank", Integer.valueOf(R$drawable.stripe_ic_bank_ambank));
    public static final FpxBank AffinBank = new FpxBank("AffinBank", 6, "ABB0233", "affin_bank", "Affin Bank", Integer.valueOf(R$drawable.stripe_ic_bank_affin));
    public static final FpxBank AllianceBankBusiness = new FpxBank("AllianceBankBusiness", 7, "ABMB0212", "alliance_bank", "Alliance Bank", Integer.valueOf(R$drawable.stripe_ic_bank_alliance));
    public static final FpxBank BankIslam = new FpxBank("BankIslam", 8, "BIMB0340", "bank_islam", "Bank Islam", Integer.valueOf(R$drawable.stripe_ic_bank_islam));
    public static final FpxBank BankMuamalat = new FpxBank("BankMuamalat", 9, "BMMB0341", "bank_muamalat", "Bank Muamalat", Integer.valueOf(R$drawable.stripe_ic_bank_muamalat));
    public static final FpxBank BankRakyat = new FpxBank("BankRakyat", 10, "BKRM0602", "bank_rakyat", "Bank Rakyat", Integer.valueOf(R$drawable.stripe_ic_bank_raykat));
    public static final FpxBank Bsn = new FpxBank("Bsn", 11, "BSN0601", "bsn", "BSN", Integer.valueOf(R$drawable.stripe_ic_bank_bsn));
    public static final FpxBank Hsbc = new FpxBank("Hsbc", 12, "HSBC0223", "hsbc", "HSBC Bank", Integer.valueOf(R$drawable.stripe_ic_bank_hsbc));
    public static final FpxBank Kfh = new FpxBank("Kfh", 13, "KFH0346", "kfh", "KFH", Integer.valueOf(R$drawable.stripe_ic_bank_kfh));
    public static final FpxBank Maybank2E = new FpxBank("Maybank2E", 14, "MBB0228", "maybank2e", "Maybank2E", Integer.valueOf(R$drawable.stripe_ic_bank_maybank));
    public static final FpxBank Ocbc = new FpxBank("Ocbc", 15, "OCBC0229", "ocbc", "OCBC Bank", Integer.valueOf(R$drawable.stripe_ic_bank_ocbc));
    public static final FpxBank StandardChartered = new FpxBank("StandardChartered", 16, "SCB0216", "standard_chartered", "Standard Chartered", Integer.valueOf(R$drawable.stripe_ic_bank_standard_chartered));
    public static final FpxBank UobBank = new FpxBank("UobBank", 17, "UOB0226", "uob", "UOB", Integer.valueOf(R$drawable.stripe_ic_bank_uob));

    private static final /* synthetic */ FpxBank[] $values() {
        return new FpxBank[]{Maybank2U, Cimb, PublicBank, Rhb, HongLeongBank, AmBank, AffinBank, AllianceBankBusiness, BankIslam, BankMuamalat, BankRakyat, Bsn, Hsbc, Kfh, Maybank2E, Ocbc, StandardChartered, UobBank};
    }

    @JvmStatic
    public static final FpxBank get(String str) {
        return INSTANCE.get(str);
    }

    public static EnumEntries<FpxBank> getEntries() {
        return $ENTRIES;
    }

    public static FpxBank valueOf(String str) {
        return (FpxBank) Enum.valueOf(FpxBank.class, str);
    }

    public static FpxBank[] values() {
        return (FpxBank[]) $VALUES.clone();
    }

    private FpxBank(String str, int i, String str2, String str3, String str4, Integer num) {
        this.id = str2;
        this.code = str3;
        this.displayName = str4;
        this.brandIconResId = num;
    }

    @Override // com.stripe.android.view.Bank
    public String getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    @Override // com.stripe.android.view.Bank
    public String getDisplayName() {
        return this.displayName;
    }

    @Override // com.stripe.android.view.Bank
    public Integer getBrandIconResId() {
        return this.brandIconResId;
    }

    static {
        FpxBank[] fpxBankArr$values = $values();
        $VALUES = fpxBankArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fpxBankArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: FpxBank.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m3636d2 = {"Lcom/stripe/android/view/FpxBank$Companion;", "", "()V", "get", "Lcom/stripe/android/view/FpxBank;", "bankCode", "", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FpxBank get(String bankCode) {
            FpxBank next;
            Iterator<FpxBank> it = FpxBank.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(next.getCode(), bankCode)) {
                    break;
                }
            }
            return next;
        }
    }
}
