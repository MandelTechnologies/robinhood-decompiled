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
/* compiled from: S3URLRequestReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/S3URLRequestReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "S3_URL_REQUEST_REASON_UNSPECIFIED", "S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION", "S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER", "S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS", "S3_URL_REQUEST_REASON_FUTURES_ORDERS", "S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES", "S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS", "S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS", "S3_URL_REQUEST_REASON_MARGIN_CALLS", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class S3URLRequestReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ S3URLRequestReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<S3URLRequestReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_FUTURES_ORDERS;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_MARGIN_CALLS;
    public static final S3URLRequestReason S3_URL_REQUEST_REASON_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ S3URLRequestReason[] $values() {
        return new S3URLRequestReason[]{S3_URL_REQUEST_REASON_UNSPECIFIED, S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION, S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER, S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS, S3_URL_REQUEST_REASON_FUTURES_ORDERS, S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES, S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS, S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS, S3_URL_REQUEST_REASON_MARGIN_CALLS};
    }

    @JvmStatic
    public static final S3URLRequestReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<S3URLRequestReason> getEntries() {
        return $ENTRIES;
    }

    private S3URLRequestReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final S3URLRequestReason s3URLRequestReason = new S3URLRequestReason("S3_URL_REQUEST_REASON_UNSPECIFIED", 0, 0);
        S3_URL_REQUEST_REASON_UNSPECIFIED = s3URLRequestReason;
        S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION = new S3URLRequestReason("S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION", 1, 1);
        S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER = new S3URLRequestReason("S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER", 2, 2);
        S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS = new S3URLRequestReason("S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS", 3, 3);
        S3_URL_REQUEST_REASON_FUTURES_ORDERS = new S3URLRequestReason("S3_URL_REQUEST_REASON_FUTURES_ORDERS", 4, 4);
        S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES = new S3URLRequestReason("S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES", 5, 5);
        S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS = new S3URLRequestReason("S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS", 6, 6);
        S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS = new S3URLRequestReason("S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS", 7, 7);
        S3_URL_REQUEST_REASON_MARGIN_CALLS = new S3URLRequestReason("S3_URL_REQUEST_REASON_MARGIN_CALLS", 8, 8);
        S3URLRequestReason[] s3URLRequestReasonArr$values = $values();
        $VALUES = s3URLRequestReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(s3URLRequestReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(S3URLRequestReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<S3URLRequestReason>(orCreateKotlinClass, syntax, s3URLRequestReason) { // from class: com.robinhood.ceres.v1.S3URLRequestReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public S3URLRequestReason fromValue(int value) {
                return S3URLRequestReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: S3URLRequestReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/S3URLRequestReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/S3URLRequestReason;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final S3URLRequestReason fromValue(int value) {
            switch (value) {
                case 0:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_UNSPECIFIED;
                case 1:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION;
                case 2:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER;
                case 3:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS;
                case 4:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_FUTURES_ORDERS;
                case 5:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES;
                case 6:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS;
                case 7:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS;
                case 8:
                    return S3URLRequestReason.S3_URL_REQUEST_REASON_MARGIN_CALLS;
                default:
                    return null;
            }
        }
    }

    public static S3URLRequestReason valueOf(String str) {
        return (S3URLRequestReason) Enum.valueOf(S3URLRequestReason.class, str);
    }

    public static S3URLRequestReason[] values() {
        return (S3URLRequestReason[]) $VALUES.clone();
    }
}
