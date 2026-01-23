package bff_money_movement.service.p019v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FetchCryptoBillingAccountsResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016JP\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponse;", "Lcom/squareup/wire/Message;", "", "daily_total_ach_limit", "Lcom/robinhood/rosetta/common/Money;", "daily_remaining_ach_limit", "daily_total_dcf_limit", "daily_remaining_dcf_limit", "accounts", "", "Lbff_money_movement/service/v1/BillingAccount;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Lcom/robinhood/rosetta/common/Money;Ljava/util/List;Lokio/ByteString;)V", "getDaily_total_ach_limit", "()Lcom/robinhood/rosetta/common/Money;", "getDaily_remaining_ach_limit", "getDaily_total_dcf_limit", "getDaily_remaining_dcf_limit", "getAccounts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class FetchCryptoBillingAccountsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<FetchCryptoBillingAccountsResponse> ADAPTER;

    @WireField(adapter = "bff_money_movement.service.v1.BillingAccount#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 21)
    private final List<BillingAccount> accounts;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dailyRemainingAchLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money daily_remaining_ach_limit;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dailyRemainingDcfLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money daily_remaining_dcf_limit;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dailyTotalAchLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money daily_total_ach_limit;

    @WireField(adapter = "com.robinhood.rosetta.common.Money#ADAPTER", jsonName = "dailyTotalDcfLimit", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money daily_total_dcf_limit;

    public FetchCryptoBillingAccountsResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8413newBuilder();
    }

    public final Money getDaily_total_ach_limit() {
        return this.daily_total_ach_limit;
    }

    public final Money getDaily_remaining_ach_limit() {
        return this.daily_remaining_ach_limit;
    }

    public final Money getDaily_total_dcf_limit() {
        return this.daily_total_dcf_limit;
    }

    public final Money getDaily_remaining_dcf_limit() {
        return this.daily_remaining_dcf_limit;
    }

    public /* synthetic */ FetchCryptoBillingAccountsResponse(Money money, Money money2, Money money3, Money money4, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : money4, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchCryptoBillingAccountsResponse(Money money, Money money2, Money money3, Money money4, List<BillingAccount> accounts2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.daily_total_ach_limit = money;
        this.daily_remaining_ach_limit = money2;
        this.daily_total_dcf_limit = money3;
        this.daily_remaining_dcf_limit = money4;
        this.accounts = Internal.immutableCopyOf("accounts", accounts2);
    }

    public final List<BillingAccount> getAccounts() {
        return this.accounts;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8413newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FetchCryptoBillingAccountsResponse)) {
            return false;
        }
        FetchCryptoBillingAccountsResponse fetchCryptoBillingAccountsResponse = (FetchCryptoBillingAccountsResponse) other;
        return Intrinsics.areEqual(unknownFields(), fetchCryptoBillingAccountsResponse.unknownFields()) && Intrinsics.areEqual(this.daily_total_ach_limit, fetchCryptoBillingAccountsResponse.daily_total_ach_limit) && Intrinsics.areEqual(this.daily_remaining_ach_limit, fetchCryptoBillingAccountsResponse.daily_remaining_ach_limit) && Intrinsics.areEqual(this.daily_total_dcf_limit, fetchCryptoBillingAccountsResponse.daily_total_dcf_limit) && Intrinsics.areEqual(this.daily_remaining_dcf_limit, fetchCryptoBillingAccountsResponse.daily_remaining_dcf_limit) && Intrinsics.areEqual(this.accounts, fetchCryptoBillingAccountsResponse.accounts);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.daily_total_ach_limit;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.daily_remaining_ach_limit;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.daily_total_dcf_limit;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.daily_remaining_dcf_limit;
        int iHashCode5 = ((iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37) + this.accounts.hashCode();
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.daily_total_ach_limit;
        if (money != null) {
            arrayList.add("daily_total_ach_limit=" + money);
        }
        Money money2 = this.daily_remaining_ach_limit;
        if (money2 != null) {
            arrayList.add("daily_remaining_ach_limit=" + money2);
        }
        Money money3 = this.daily_total_dcf_limit;
        if (money3 != null) {
            arrayList.add("daily_total_dcf_limit=" + money3);
        }
        Money money4 = this.daily_remaining_dcf_limit;
        if (money4 != null) {
            arrayList.add("daily_remaining_dcf_limit=" + money4);
        }
        if (!this.accounts.isEmpty()) {
            arrayList.add("accounts=" + this.accounts);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FetchCryptoBillingAccountsResponse{", "}", 0, null, null, 56, null);
    }

    public final FetchCryptoBillingAccountsResponse copy(Money daily_total_ach_limit, Money daily_remaining_ach_limit, Money daily_total_dcf_limit, Money daily_remaining_dcf_limit, List<BillingAccount> accounts2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FetchCryptoBillingAccountsResponse(daily_total_ach_limit, daily_remaining_ach_limit, daily_total_dcf_limit, daily_remaining_dcf_limit, accounts2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FetchCryptoBillingAccountsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FetchCryptoBillingAccountsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.FetchCryptoBillingAccountsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FetchCryptoBillingAccountsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getDaily_total_ach_limit() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getDaily_total_ach_limit());
                }
                if (value.getDaily_remaining_ach_limit() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getDaily_remaining_ach_limit());
                }
                if (value.getDaily_total_dcf_limit() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getDaily_total_dcf_limit());
                }
                if (value.getDaily_remaining_dcf_limit() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getDaily_remaining_dcf_limit());
                }
                return size + BillingAccount.ADAPTER.asRepeated().encodedSizeWithTag(21, value.getAccounts());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FetchCryptoBillingAccountsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getDaily_total_ach_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getDaily_total_ach_limit());
                }
                if (value.getDaily_remaining_ach_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDaily_remaining_ach_limit());
                }
                if (value.getDaily_total_dcf_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getDaily_total_dcf_limit());
                }
                if (value.getDaily_remaining_dcf_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getDaily_remaining_dcf_limit());
                }
                BillingAccount.ADAPTER.asRepeated().encodeWithTag(writer, 21, (int) value.getAccounts());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FetchCryptoBillingAccountsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                BillingAccount.ADAPTER.asRepeated().encodeWithTag(writer, 21, (int) value.getAccounts());
                if (value.getDaily_remaining_dcf_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getDaily_remaining_dcf_limit());
                }
                if (value.getDaily_total_dcf_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getDaily_total_dcf_limit());
                }
                if (value.getDaily_remaining_ach_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getDaily_remaining_ach_limit());
                }
                if (value.getDaily_total_ach_limit() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getDaily_total_ach_limit());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FetchCryptoBillingAccountsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FetchCryptoBillingAccountsResponse(moneyDecode, moneyDecode2, moneyDecode3, moneyDecode4, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        moneyDecode = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        moneyDecode2 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        moneyDecode3 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        moneyDecode4 = Money.ADAPTER.decode(reader);
                    } else if (iNextTag == 21) {
                        arrayList.add(BillingAccount.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FetchCryptoBillingAccountsResponse redact(FetchCryptoBillingAccountsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money daily_total_ach_limit = value.getDaily_total_ach_limit();
                Money moneyRedact = daily_total_ach_limit != null ? Money.ADAPTER.redact(daily_total_ach_limit) : null;
                Money daily_remaining_ach_limit = value.getDaily_remaining_ach_limit();
                Money moneyRedact2 = daily_remaining_ach_limit != null ? Money.ADAPTER.redact(daily_remaining_ach_limit) : null;
                Money daily_total_dcf_limit = value.getDaily_total_dcf_limit();
                Money moneyRedact3 = daily_total_dcf_limit != null ? Money.ADAPTER.redact(daily_total_dcf_limit) : null;
                Money daily_remaining_dcf_limit = value.getDaily_remaining_dcf_limit();
                return value.copy(moneyRedact, moneyRedact2, moneyRedact3, daily_remaining_dcf_limit != null ? Money.ADAPTER.redact(daily_remaining_dcf_limit) : null, Internal.m26823redactElements(value.getAccounts(), BillingAccount.ADAPTER), ByteString.EMPTY);
            }
        };
    }
}
