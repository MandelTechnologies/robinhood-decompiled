package com.robinhood.rosetta.i18n;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Affiliate.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/Affiliate;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AFFILIATE_UNSPECIFIED", "RHS", "RHF", "RHI", "RHC", "RHUK", "RHCE", "RHD", "RHSG", "RAM", "RH_MONEY", "RCT", "Companion", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Affiliate implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Affiliate[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Affiliate> ADAPTER;
    public static final Affiliate AFFILIATE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Affiliate RAM;
    public static final Affiliate RCT;
    public static final Affiliate RHC;
    public static final Affiliate RHCE;
    public static final Affiliate RHD;
    public static final Affiliate RHF;
    public static final Affiliate RHI;
    public static final Affiliate RHS;
    public static final Affiliate RHSG;
    public static final Affiliate RHUK;
    public static final Affiliate RH_MONEY;
    private final int value;

    private static final /* synthetic */ Affiliate[] $values() {
        return new Affiliate[]{AFFILIATE_UNSPECIFIED, RHS, RHF, RHI, RHC, RHUK, RHCE, RHD, RHSG, RAM, RH_MONEY, RCT};
    }

    @JvmStatic
    public static final Affiliate fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Affiliate> getEntries() {
        return $ENTRIES;
    }

    private Affiliate(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Affiliate affiliate = new Affiliate("AFFILIATE_UNSPECIFIED", 0, 0);
        AFFILIATE_UNSPECIFIED = affiliate;
        RHS = new Affiliate("RHS", 1, 1);
        RHF = new Affiliate("RHF", 2, 2);
        RHI = new Affiliate("RHI", 3, 3);
        RHC = new Affiliate("RHC", 4, 4);
        RHUK = new Affiliate("RHUK", 5, 5);
        RHCE = new Affiliate("RHCE", 6, 6);
        RHD = new Affiliate("RHD", 7, 7);
        RHSG = new Affiliate("RHSG", 8, 8);
        RAM = new Affiliate("RAM", 9, 9);
        RH_MONEY = new Affiliate("RH_MONEY", 10, 10);
        RCT = new Affiliate("RCT", 11, 11);
        Affiliate[] affiliateArr$values = $values();
        $VALUES = affiliateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(affiliateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Affiliate.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Affiliate>(orCreateKotlinClass, syntax, affiliate) { // from class: com.robinhood.rosetta.i18n.Affiliate$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Affiliate fromValue(int value) {
                return Affiliate.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Affiliate.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/Affiliate$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/i18n/Affiliate;", "fromValue", "value", "", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Affiliate fromValue(int value) {
            switch (value) {
                case 0:
                    return Affiliate.AFFILIATE_UNSPECIFIED;
                case 1:
                    return Affiliate.RHS;
                case 2:
                    return Affiliate.RHF;
                case 3:
                    return Affiliate.RHI;
                case 4:
                    return Affiliate.RHC;
                case 5:
                    return Affiliate.RHUK;
                case 6:
                    return Affiliate.RHCE;
                case 7:
                    return Affiliate.RHD;
                case 8:
                    return Affiliate.RHSG;
                case 9:
                    return Affiliate.RAM;
                case 10:
                    return Affiliate.RH_MONEY;
                case 11:
                    return Affiliate.RCT;
                default:
                    return null;
            }
        }
    }

    public static Affiliate valueOf(String str) {
        return (Affiliate) Enum.valueOf(Affiliate.class, str);
    }

    public static Affiliate[] values() {
        return (Affiliate[]) $VALUES.clone();
    }
}
