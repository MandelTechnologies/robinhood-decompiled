package internal_asset_transfers.proto.p475v1;

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
/* compiled from: IATIneligibilityReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INELIGIBILITY_REASON_UNSPECIFIED", "REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH", "REASON_ACCOUNT_DISABLED", "REASON_ACTIVE_RESTRICTION", "REASON_ACTIVE_PAST_DUE_MARGIN_CALL", "REASON_ACCOUNT_DEFICIT", "REASON_OPEN_FUTURES_POSITION", "Companion", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class IATIneligibilityReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IATIneligibilityReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<IATIneligibilityReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IATIneligibilityReason INELIGIBILITY_REASON_UNSPECIFIED;
    public static final IATIneligibilityReason REASON_ACCOUNT_DEFICIT;
    public static final IATIneligibilityReason REASON_ACCOUNT_DISABLED;
    public static final IATIneligibilityReason REASON_ACTIVE_PAST_DUE_MARGIN_CALL;
    public static final IATIneligibilityReason REASON_ACTIVE_RESTRICTION;
    public static final IATIneligibilityReason REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH;
    public static final IATIneligibilityReason REASON_OPEN_FUTURES_POSITION;
    private final int value;

    private static final /* synthetic */ IATIneligibilityReason[] $values() {
        return new IATIneligibilityReason[]{INELIGIBILITY_REASON_UNSPECIFIED, REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH, REASON_ACCOUNT_DISABLED, REASON_ACTIVE_RESTRICTION, REASON_ACTIVE_PAST_DUE_MARGIN_CALL, REASON_ACCOUNT_DEFICIT, REASON_OPEN_FUTURES_POSITION};
    }

    @JvmStatic
    public static final IATIneligibilityReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<IATIneligibilityReason> getEntries() {
        return $ENTRIES;
    }

    private IATIneligibilityReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final IATIneligibilityReason iATIneligibilityReason = new IATIneligibilityReason("INELIGIBILITY_REASON_UNSPECIFIED", 0, 0);
        INELIGIBILITY_REASON_UNSPECIFIED = iATIneligibilityReason;
        REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH = new IATIneligibilityReason("REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH", 1, 1);
        REASON_ACCOUNT_DISABLED = new IATIneligibilityReason("REASON_ACCOUNT_DISABLED", 2, 2);
        REASON_ACTIVE_RESTRICTION = new IATIneligibilityReason("REASON_ACTIVE_RESTRICTION", 3, 3);
        REASON_ACTIVE_PAST_DUE_MARGIN_CALL = new IATIneligibilityReason("REASON_ACTIVE_PAST_DUE_MARGIN_CALL", 4, 4);
        REASON_ACCOUNT_DEFICIT = new IATIneligibilityReason("REASON_ACCOUNT_DEFICIT", 5, 5);
        REASON_OPEN_FUTURES_POSITION = new IATIneligibilityReason("REASON_OPEN_FUTURES_POSITION", 6, 6);
        IATIneligibilityReason[] iATIneligibilityReasonArr$values = $values();
        $VALUES = iATIneligibilityReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iATIneligibilityReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IATIneligibilityReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<IATIneligibilityReason>(orCreateKotlinClass, syntax, iATIneligibilityReason) { // from class: internal_asset_transfers.proto.v1.IATIneligibilityReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public IATIneligibilityReason fromValue(int value) {
                return IATIneligibilityReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: IATIneligibilityReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Linternal_asset_transfers/proto/v1/IATIneligibilityReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Linternal_asset_transfers/proto/v1/IATIneligibilityReason;", "fromValue", "value", "", "internal_asset_transfers.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IATIneligibilityReason fromValue(int value) {
            switch (value) {
                case 0:
                    return IATIneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
                case 1:
                    return IATIneligibilityReason.REASON_BROKERAGE_ACCOUNT_TYPE_MISMATCH;
                case 2:
                    return IATIneligibilityReason.REASON_ACCOUNT_DISABLED;
                case 3:
                    return IATIneligibilityReason.REASON_ACTIVE_RESTRICTION;
                case 4:
                    return IATIneligibilityReason.REASON_ACTIVE_PAST_DUE_MARGIN_CALL;
                case 5:
                    return IATIneligibilityReason.REASON_ACCOUNT_DEFICIT;
                case 6:
                    return IATIneligibilityReason.REASON_OPEN_FUTURES_POSITION;
                default:
                    return null;
            }
        }
    }

    public static IATIneligibilityReason valueOf(String str) {
        return (IATIneligibilityReason) Enum.valueOf(IATIneligibilityReason.class, str);
    }

    public static IATIneligibilityReason[] values() {
        return (IATIneligibilityReason[]) $VALUES.clone();
    }
}
