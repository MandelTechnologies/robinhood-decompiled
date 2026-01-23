package com.robinhood.ceres.p284v1;

import com.robinhood.android.educationtour.EducationTourScreenNames;
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
/* compiled from: FuturesActivityTransCode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityTransCode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "BUY", "SELL", "FUTSWP", "FUTADJ", "CSHSTL", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesActivityTransCode implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FuturesActivityTransCode[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FuturesActivityTransCode> ADAPTER;
    public static final FuturesActivityTransCode BUY;
    public static final FuturesActivityTransCode CSHSTL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FuturesActivityTransCode FUTADJ;
    public static final FuturesActivityTransCode FUTSWP;
    public static final FuturesActivityTransCode SELL;
    public static final FuturesActivityTransCode UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ FuturesActivityTransCode[] $values() {
        return new FuturesActivityTransCode[]{UNSPECIFIED, BUY, SELL, FUTSWP, FUTADJ, CSHSTL};
    }

    @JvmStatic
    public static final FuturesActivityTransCode fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FuturesActivityTransCode> getEntries() {
        return $ENTRIES;
    }

    private FuturesActivityTransCode(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FuturesActivityTransCode futuresActivityTransCode = new FuturesActivityTransCode(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
        UNSPECIFIED = futuresActivityTransCode;
        BUY = new FuturesActivityTransCode("BUY", 1, 1);
        SELL = new FuturesActivityTransCode("SELL", 2, 2);
        FUTSWP = new FuturesActivityTransCode("FUTSWP", 3, 3);
        FUTADJ = new FuturesActivityTransCode("FUTADJ", 4, 4);
        CSHSTL = new FuturesActivityTransCode("CSHSTL", 5, 5);
        FuturesActivityTransCode[] futuresActivityTransCodeArr$values = $values();
        $VALUES = futuresActivityTransCodeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(futuresActivityTransCodeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesActivityTransCode.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FuturesActivityTransCode>(orCreateKotlinClass, syntax, futuresActivityTransCode) { // from class: com.robinhood.ceres.v1.FuturesActivityTransCode$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FuturesActivityTransCode fromValue(int value) {
                return FuturesActivityTransCode.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FuturesActivityTransCode.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesActivityTransCode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/FuturesActivityTransCode;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FuturesActivityTransCode fromValue(int value) {
            if (value == 0) {
                return FuturesActivityTransCode.UNSPECIFIED;
            }
            if (value == 1) {
                return FuturesActivityTransCode.BUY;
            }
            if (value == 2) {
                return FuturesActivityTransCode.SELL;
            }
            if (value == 3) {
                return FuturesActivityTransCode.FUTSWP;
            }
            if (value == 4) {
                return FuturesActivityTransCode.FUTADJ;
            }
            if (value != 5) {
                return null;
            }
            return FuturesActivityTransCode.CSHSTL;
        }
    }

    public static FuturesActivityTransCode valueOf(String str) {
        return (FuturesActivityTransCode) Enum.valueOf(FuturesActivityTransCode.class, str);
    }

    public static FuturesActivityTransCode[] values() {
        return (FuturesActivityTransCode[]) $VALUES.clone();
    }
}
