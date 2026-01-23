package com.robinhood.ceres.p284v1;

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
/* compiled from: BrokebackSyncObjectStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BrokebackSyncObjectStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BROKEBACK_SYNC_OBJECT_STATUS_UNSPECIFIED", "PENDING", "REJECTED", "CONFIRMED", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BrokebackSyncObjectStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BrokebackSyncObjectStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BrokebackSyncObjectStatus> ADAPTER;
    public static final BrokebackSyncObjectStatus BROKEBACK_SYNC_OBJECT_STATUS_UNSPECIFIED;
    public static final BrokebackSyncObjectStatus CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BrokebackSyncObjectStatus PENDING;
    public static final BrokebackSyncObjectStatus REJECTED;
    private final int value;

    private static final /* synthetic */ BrokebackSyncObjectStatus[] $values() {
        return new BrokebackSyncObjectStatus[]{BROKEBACK_SYNC_OBJECT_STATUS_UNSPECIFIED, PENDING, REJECTED, CONFIRMED};
    }

    @JvmStatic
    public static final BrokebackSyncObjectStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BrokebackSyncObjectStatus> getEntries() {
        return $ENTRIES;
    }

    private BrokebackSyncObjectStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BrokebackSyncObjectStatus brokebackSyncObjectStatus = new BrokebackSyncObjectStatus("BROKEBACK_SYNC_OBJECT_STATUS_UNSPECIFIED", 0, 0);
        BROKEBACK_SYNC_OBJECT_STATUS_UNSPECIFIED = brokebackSyncObjectStatus;
        PENDING = new BrokebackSyncObjectStatus("PENDING", 1, 1);
        REJECTED = new BrokebackSyncObjectStatus("REJECTED", 2, 2);
        CONFIRMED = new BrokebackSyncObjectStatus("CONFIRMED", 3, 3);
        BrokebackSyncObjectStatus[] brokebackSyncObjectStatusArr$values = $values();
        $VALUES = brokebackSyncObjectStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(brokebackSyncObjectStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BrokebackSyncObjectStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BrokebackSyncObjectStatus>(orCreateKotlinClass, syntax, brokebackSyncObjectStatus) { // from class: com.robinhood.ceres.v1.BrokebackSyncObjectStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BrokebackSyncObjectStatus fromValue(int value) {
                return BrokebackSyncObjectStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BrokebackSyncObjectStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BrokebackSyncObjectStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/BrokebackSyncObjectStatus;", "fromValue", "value", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BrokebackSyncObjectStatus fromValue(int value) {
            if (value == 0) {
                return BrokebackSyncObjectStatus.BROKEBACK_SYNC_OBJECT_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return BrokebackSyncObjectStatus.PENDING;
            }
            if (value == 2) {
                return BrokebackSyncObjectStatus.REJECTED;
            }
            if (value != 3) {
                return null;
            }
            return BrokebackSyncObjectStatus.CONFIRMED;
        }
    }

    public static BrokebackSyncObjectStatus valueOf(String str) {
        return (BrokebackSyncObjectStatus) Enum.valueOf(BrokebackSyncObjectStatus.class, str);
    }

    public static BrokebackSyncObjectStatus[] values() {
        return (BrokebackSyncObjectStatus[]) $VALUES.clone();
    }
}
