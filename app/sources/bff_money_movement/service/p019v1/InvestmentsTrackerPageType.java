package bff_money_movement.service.p019v1;

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
/* compiled from: InvestmentsTrackerPageType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerPageType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PAGE_UNSPECIFIED", "HOME", "ACCOUNT", "ALLOCATION_VIEW", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InvestmentsTrackerPageType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestmentsTrackerPageType[] $VALUES;
    public static final InvestmentsTrackerPageType ACCOUNT;

    @JvmField
    public static final ProtoAdapter<InvestmentsTrackerPageType> ADAPTER;
    public static final InvestmentsTrackerPageType ALLOCATION_VIEW;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InvestmentsTrackerPageType HOME;
    public static final InvestmentsTrackerPageType PAGE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ InvestmentsTrackerPageType[] $values() {
        return new InvestmentsTrackerPageType[]{PAGE_UNSPECIFIED, HOME, ACCOUNT, ALLOCATION_VIEW};
    }

    @JvmStatic
    public static final InvestmentsTrackerPageType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InvestmentsTrackerPageType> getEntries() {
        return $ENTRIES;
    }

    private InvestmentsTrackerPageType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InvestmentsTrackerPageType investmentsTrackerPageType = new InvestmentsTrackerPageType("PAGE_UNSPECIFIED", 0, 0);
        PAGE_UNSPECIFIED = investmentsTrackerPageType;
        HOME = new InvestmentsTrackerPageType("HOME", 1, 1);
        ACCOUNT = new InvestmentsTrackerPageType("ACCOUNT", 2, 2);
        ALLOCATION_VIEW = new InvestmentsTrackerPageType("ALLOCATION_VIEW", 3, 3);
        InvestmentsTrackerPageType[] investmentsTrackerPageTypeArr$values = $values();
        $VALUES = investmentsTrackerPageTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investmentsTrackerPageTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerPageType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InvestmentsTrackerPageType>(orCreateKotlinClass, syntax, investmentsTrackerPageType) { // from class: bff_money_movement.service.v1.InvestmentsTrackerPageType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InvestmentsTrackerPageType fromValue(int value) {
                return InvestmentsTrackerPageType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InvestmentsTrackerPageType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerPageType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/InvestmentsTrackerPageType;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InvestmentsTrackerPageType fromValue(int value) {
            if (value == 0) {
                return InvestmentsTrackerPageType.PAGE_UNSPECIFIED;
            }
            if (value == 1) {
                return InvestmentsTrackerPageType.HOME;
            }
            if (value == 2) {
                return InvestmentsTrackerPageType.ACCOUNT;
            }
            if (value != 3) {
                return null;
            }
            return InvestmentsTrackerPageType.ALLOCATION_VIEW;
        }
    }

    public static InvestmentsTrackerPageType valueOf(String str) {
        return (InvestmentsTrackerPageType) Enum.valueOf(InvestmentsTrackerPageType.class, str);
    }

    public static InvestmentsTrackerPageType[] values() {
        return (InvestmentsTrackerPageType[]) $VALUES.clone();
    }
}
