package com.robinhood.ceres.p284v1;

import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FuturesManualCashCorrection.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B¥\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010/\u001a\u00020\u0002H\u0017J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J¤\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001c¨\u00069"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FuturesManualCashCorrection;", "Lcom/squareup/wire/Message;", "", "id", "", "account_id", "amount", "Lcom/robinhood/rosetta/common/Money;", "reason", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReason;", "direction", "Lcom/robinhood/ceres/v1/ManualCashCorrectionDirection;", "employee_alias", "notes", "status", "Lcom/robinhood/ceres/v1/ManualCashCorrectionStatus;", "trade_date", "Lcom/robinhood/rosetta/common/Date;", "ref_id", "created_at", "updated_at", "account_number", "rhs_account_number", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/ceres/v1/ManualCashCorrectionReason;Lcom/robinhood/ceres/v1/ManualCashCorrectionDirection;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/ManualCashCorrectionStatus;Lcom/robinhood/rosetta/common/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getAccount_id", "getAmount", "()Lcom/robinhood/rosetta/common/Money;", "getReason", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionReason;", "getDirection", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionDirection;", "getEmployee_alias", "getNotes", "getStatus", "()Lcom/robinhood/ceres/v1/ManualCashCorrectionStatus;", "getTrade_date", "()Lcom/robinhood/rosetta/common/Date;", "getRef_id", "getCreated_at", "getUpdated_at", "getAccount_number", "getRhs_account_number", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FuturesManualCashCorrection extends Message {

    @JvmField
    public static final ProtoAdapter<FuturesManualCashCorrection> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final String account_number;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money amount;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String created_at;

    @WireField(adapter = "com.robinhood.ceres.v1.ManualCashCorrectionDirection#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final ManualCashCorrectionDirection direction;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "employeeAlias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String employee_alias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String notes;

    @WireField(adapter = "com.robinhood.ceres.v1.ManualCashCorrectionReason#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ManualCashCorrectionReason reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "refId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String ref_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", schemaIndex = 13, tag = 14)
    private final String rhs_account_number;

    @WireField(adapter = "com.robinhood.ceres.v1.ManualCashCorrectionStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final ManualCashCorrectionStatus status;

    @WireField(adapter = "com.robinhood.rosetta.common.Date#ADAPTER", jsonName = "tradeDate", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Date trade_date;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String updated_at;

    public FuturesManualCashCorrection() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public /* synthetic */ FuturesManualCashCorrection(String str, String str2, Money money, ManualCashCorrectionReason manualCashCorrectionReason, ManualCashCorrectionDirection manualCashCorrectionDirection, String str3, String str4, ManualCashCorrectionStatus manualCashCorrectionStatus, Date date, String str5, String str6, String str7, String str8, String str9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : money, (i & 8) != 0 ? ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED : manualCashCorrectionReason, (i & 16) != 0 ? ManualCashCorrectionDirection.MANUAL_CASH_CORRECTION_DIRECTION_UNSPECIFIED : manualCashCorrectionDirection, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? ManualCashCorrectionStatus.MANUAL_CASH_CORRECTION_STATUS_UNSPECIFIED : manualCashCorrectionStatus, (i & 256) != 0 ? null : date, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7, (i & 4096) == 0 ? str8 : "", (i & 8192) == 0 ? str9 : null, (i & 16384) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20323newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final Money getAmount() {
        return this.amount;
    }

    public final ManualCashCorrectionReason getReason() {
        return this.reason;
    }

    public final ManualCashCorrectionDirection getDirection() {
        return this.direction;
    }

    public final String getEmployee_alias() {
        return this.employee_alias;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final ManualCashCorrectionStatus getStatus() {
        return this.status;
    }

    public final Date getTrade_date() {
        return this.trade_date;
    }

    public final String getRef_id() {
        return this.ref_id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesManualCashCorrection(String id, String account_id, Money money, ManualCashCorrectionReason reason, ManualCashCorrectionDirection direction, String employee_alias, String str, ManualCashCorrectionStatus status, Date date, String ref_id, String created_at, String updated_at, String account_number, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.account_id = account_id;
        this.amount = money;
        this.reason = reason;
        this.direction = direction;
        this.employee_alias = employee_alias;
        this.notes = str;
        this.status = status;
        this.trade_date = date;
        this.ref_id = ref_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.account_number = account_number;
        this.rhs_account_number = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20323newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FuturesManualCashCorrection)) {
            return false;
        }
        FuturesManualCashCorrection futuresManualCashCorrection = (FuturesManualCashCorrection) other;
        return Intrinsics.areEqual(unknownFields(), futuresManualCashCorrection.unknownFields()) && Intrinsics.areEqual(this.id, futuresManualCashCorrection.id) && Intrinsics.areEqual(this.account_id, futuresManualCashCorrection.account_id) && Intrinsics.areEqual(this.amount, futuresManualCashCorrection.amount) && this.reason == futuresManualCashCorrection.reason && this.direction == futuresManualCashCorrection.direction && Intrinsics.areEqual(this.employee_alias, futuresManualCashCorrection.employee_alias) && Intrinsics.areEqual(this.notes, futuresManualCashCorrection.notes) && this.status == futuresManualCashCorrection.status && Intrinsics.areEqual(this.trade_date, futuresManualCashCorrection.trade_date) && Intrinsics.areEqual(this.ref_id, futuresManualCashCorrection.ref_id) && Intrinsics.areEqual(this.created_at, futuresManualCashCorrection.created_at) && Intrinsics.areEqual(this.updated_at, futuresManualCashCorrection.updated_at) && Intrinsics.areEqual(this.account_number, futuresManualCashCorrection.account_number) && Intrinsics.areEqual(this.rhs_account_number, futuresManualCashCorrection.rhs_account_number);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.account_id.hashCode()) * 37;
        Money money = this.amount;
        int iHashCode2 = (((((((iHashCode + (money != null ? money.hashCode() : 0)) * 37) + this.reason.hashCode()) * 37) + this.direction.hashCode()) * 37) + this.employee_alias.hashCode()) * 37;
        String str = this.notes;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 37) + this.status.hashCode()) * 37;
        Date date = this.trade_date;
        int iHashCode4 = (((((((((iHashCode3 + (date != null ? date.hashCode() : 0)) * 37) + this.ref_id.hashCode()) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37) + this.account_number.hashCode()) * 37;
        String str2 = this.rhs_account_number;
        int iHashCode5 = iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        Money money = this.amount;
        if (money != null) {
            arrayList.add("amount=" + money);
        }
        arrayList.add("reason=" + this.reason);
        arrayList.add("direction=" + this.direction);
        arrayList.add("employee_alias=" + Internal.sanitize(this.employee_alias));
        String str = this.notes;
        if (str != null) {
            arrayList.add("notes=" + Internal.sanitize(str));
        }
        arrayList.add("status=" + this.status);
        Date date = this.trade_date;
        if (date != null) {
            arrayList.add("trade_date=" + date);
        }
        arrayList.add("ref_id=" + Internal.sanitize(this.ref_id));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        String str2 = this.rhs_account_number;
        if (str2 != null) {
            arrayList.add("rhs_account_number=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FuturesManualCashCorrection{", "}", 0, null, null, 56, null);
    }

    public final FuturesManualCashCorrection copy(String id, String account_id, Money amount, ManualCashCorrectionReason reason, ManualCashCorrectionDirection direction, String employee_alias, String notes, ManualCashCorrectionStatus status, Date trade_date, String ref_id, String created_at, String updated_at, String account_number, String rhs_account_number, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FuturesManualCashCorrection(id, account_id, amount, reason, direction, employee_alias, notes, status, trade_date, ref_id, created_at, updated_at, account_number, rhs_account_number, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FuturesManualCashCorrection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FuturesManualCashCorrection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.FuturesManualCashCorrection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FuturesManualCashCorrection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAccount_id());
                }
                if (value.getAmount() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getAmount());
                }
                if (value.getReason() != ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED) {
                    size += ManualCashCorrectionReason.ADAPTER.encodedSizeWithTag(4, value.getReason());
                }
                if (value.getDirection() != ManualCashCorrectionDirection.MANUAL_CASH_CORRECTION_DIRECTION_UNSPECIFIED) {
                    size += ManualCashCorrectionDirection.ADAPTER.encodedSizeWithTag(5, value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getEmployee_alias());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(7, value.getNotes());
                if (value.getStatus() != ManualCashCorrectionStatus.MANUAL_CASH_CORRECTION_STATUS_UNSPECIFIED) {
                    iEncodedSizeWithTag += ManualCashCorrectionStatus.ADAPTER.encodedSizeWithTag(8, value.getStatus());
                }
                if (value.getTrade_date() != null) {
                    iEncodedSizeWithTag += Date.ADAPTER.encodedSizeWithTag(9, value.getTrade_date());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(10, value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(11, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(12, value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(13, value.getAccount_number());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(14, value.getRhs_account_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FuturesManualCashCorrection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (value.getReason() != ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED) {
                    ManualCashCorrectionReason.ADAPTER.encodeWithTag(writer, 4, (int) value.getReason());
                }
                if (value.getDirection() != ManualCashCorrectionDirection.MANUAL_CASH_CORRECTION_DIRECTION_UNSPECIFIED) {
                    ManualCashCorrectionDirection.ADAPTER.encodeWithTag(writer, 5, (int) value.getDirection());
                }
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getEmployee_alias());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNotes());
                if (value.getStatus() != ManualCashCorrectionStatus.MANUAL_CASH_CORRECTION_STATUS_UNSPECIFIED) {
                    ManualCashCorrectionStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getStatus());
                }
                if (value.getTrade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 9, (int) value.getTrade_date());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getRef_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getAccount_number());
                }
                protoAdapter.encodeWithTag(writer, 14, (int) value.getRhs_account_number());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FuturesManualCashCorrection value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 14, (int) value.getRhs_account_number());
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    protoAdapter.encodeWithTag(writer, 13, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getRef_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getRef_id());
                }
                if (value.getTrade_date() != null) {
                    Date.ADAPTER.encodeWithTag(writer, 9, (int) value.getTrade_date());
                }
                if (value.getStatus() != ManualCashCorrectionStatus.MANUAL_CASH_CORRECTION_STATUS_UNSPECIFIED) {
                    ManualCashCorrectionStatus.ADAPTER.encodeWithTag(writer, 8, (int) value.getStatus());
                }
                protoAdapter.encodeWithTag(writer, 7, (int) value.getNotes());
                if (!Intrinsics.areEqual(value.getEmployee_alias(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getEmployee_alias());
                }
                if (value.getDirection() != ManualCashCorrectionDirection.MANUAL_CASH_CORRECTION_DIRECTION_UNSPECIFIED) {
                    ManualCashCorrectionDirection.ADAPTER.encodeWithTag(writer, 5, (int) value.getDirection());
                }
                if (value.getReason() != ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED) {
                    ManualCashCorrectionReason.ADAPTER.encodeWithTag(writer, 4, (int) value.getReason());
                }
                if (value.getAmount() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getAmount());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_id());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FuturesManualCashCorrection decode(ProtoReader reader) throws IOException {
                ManualCashCorrectionDirection manualCashCorrectionDirection;
                ManualCashCorrectionStatus manualCashCorrectionStatus;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ManualCashCorrectionReason manualCashCorrectionReason = ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED;
                ManualCashCorrectionDirection manualCashCorrectionDirection2 = ManualCashCorrectionDirection.MANUAL_CASH_CORRECTION_DIRECTION_UNSPECIFIED;
                ManualCashCorrectionStatus manualCashCorrectionStatus2 = ManualCashCorrectionStatus.MANUAL_CASH_CORRECTION_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                ManualCashCorrectionReason manualCashCorrectionReasonDecode = manualCashCorrectionReason;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                Money moneyDecode = null;
                String strDecode7 = null;
                Date dateDecode = null;
                String strDecode8 = null;
                ManualCashCorrectionStatus manualCashCorrectionStatusDecode = manualCashCorrectionStatus2;
                String strDecode9 = strDecode6;
                ManualCashCorrectionDirection manualCashCorrectionDirectionDecode = manualCashCorrectionDirection2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                manualCashCorrectionDirection = manualCashCorrectionDirectionDecode;
                                manualCashCorrectionStatus = manualCashCorrectionStatusDecode;
                                str = strDecode9;
                                try {
                                    manualCashCorrectionReasonDecode = ManualCashCorrectionReason.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                                manualCashCorrectionDirectionDecode = manualCashCorrectionDirection;
                                strDecode9 = str;
                                manualCashCorrectionStatusDecode = manualCashCorrectionStatus;
                                break;
                            case 5:
                                manualCashCorrectionDirection = manualCashCorrectionDirectionDecode;
                                manualCashCorrectionStatus = manualCashCorrectionStatusDecode;
                                str = strDecode9;
                                try {
                                    manualCashCorrectionDirectionDecode = ManualCashCorrectionDirection.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                                strDecode9 = str;
                                manualCashCorrectionStatusDecode = manualCashCorrectionStatus;
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                try {
                                    manualCashCorrectionStatusDecode = ManualCashCorrectionStatus.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    manualCashCorrectionDirection = manualCashCorrectionDirectionDecode;
                                    manualCashCorrectionStatus = manualCashCorrectionStatusDecode;
                                    str = strDecode9;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            case 9:
                                dateDecode = Date.ADAPTER.decode(reader);
                                break;
                            case 10:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 14:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                manualCashCorrectionDirection = manualCashCorrectionDirectionDecode;
                                manualCashCorrectionStatus = manualCashCorrectionStatusDecode;
                                str = strDecode9;
                                manualCashCorrectionDirectionDecode = manualCashCorrectionDirection;
                                strDecode9 = str;
                                manualCashCorrectionStatusDecode = manualCashCorrectionStatus;
                                break;
                        }
                    } else {
                        return new FuturesManualCashCorrection(strDecode9, strDecode, moneyDecode, manualCashCorrectionReasonDecode, manualCashCorrectionDirectionDecode, strDecode2, strDecode7, manualCashCorrectionStatusDecode, dateDecode, strDecode3, strDecode4, strDecode5, strDecode6, strDecode8, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FuturesManualCashCorrection redact(FuturesManualCashCorrection value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money amount = value.getAmount();
                Money moneyRedact = amount != null ? Money.ADAPTER.redact(amount) : null;
                Date trade_date = value.getTrade_date();
                return value.copy((16123 & 1) != 0 ? value.id : null, (16123 & 2) != 0 ? value.account_id : null, (16123 & 4) != 0 ? value.amount : moneyRedact, (16123 & 8) != 0 ? value.reason : null, (16123 & 16) != 0 ? value.direction : null, (16123 & 32) != 0 ? value.employee_alias : null, (16123 & 64) != 0 ? value.notes : null, (16123 & 128) != 0 ? value.status : null, (16123 & 256) != 0 ? value.trade_date : trade_date != null ? Date.ADAPTER.redact(trade_date) : null, (16123 & 512) != 0 ? value.ref_id : null, (16123 & 1024) != 0 ? value.created_at : null, (16123 & 2048) != 0 ? value.updated_at : null, (16123 & 4096) != 0 ? value.account_number : null, (16123 & 8192) != 0 ? value.rhs_account_number : null, (16123 & 16384) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }
}
