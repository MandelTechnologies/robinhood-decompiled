package crypto_perpetuals.service.p440v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import crypto_perpetuals.common.p435v1.Money;
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

/* compiled from: GetPositionHealthResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001b\u001a\u00020\u0002H\u0017J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\fH\u0016Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m3636d2 = {"Lcrypto_perpetuals/service/v1/GetPositionHealthResponse;", "Lcom/squareup/wire/Message;", "", "unsettled_open_pnl", "Lcrypto_perpetuals/common/v1/Money;", "settled_open_pnl", "open_pnl", "unsettled_closed_pnl", "settled_closed_pnl", "closed_pnl", "lifetime_pnl", "account_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Lcrypto_perpetuals/common/v1/Money;Ljava/lang/String;Lokio/ByteString;)V", "getUnsettled_open_pnl", "()Lcrypto_perpetuals/common/v1/Money;", "getSettled_open_pnl", "getOpen_pnl", "getUnsettled_closed_pnl", "getSettled_closed_pnl", "getClosed_pnl", "getLifetime_pnl", "getAccount_id", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_perpetuals.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class GetPositionHealthResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPositionHealthResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String account_id;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "closedPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Money closed_pnl;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "lifetimePnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Money lifetime_pnl;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "openPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Money open_pnl;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "settledClosedPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Money settled_closed_pnl;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "settledOpenPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Money settled_open_pnl;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "unsettledClosedPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Money unsettled_closed_pnl;

    @WireField(adapter = "crypto_perpetuals.common.v1.Money#ADAPTER", jsonName = "unsettledOpenPnl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Money unsettled_open_pnl;

    public GetPositionHealthResponse() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27875newBuilder();
    }

    public final Money getUnsettled_open_pnl() {
        return this.unsettled_open_pnl;
    }

    public final Money getSettled_open_pnl() {
        return this.settled_open_pnl;
    }

    public final Money getOpen_pnl() {
        return this.open_pnl;
    }

    public final Money getUnsettled_closed_pnl() {
        return this.unsettled_closed_pnl;
    }

    public final Money getSettled_closed_pnl() {
        return this.settled_closed_pnl;
    }

    public final Money getClosed_pnl() {
        return this.closed_pnl;
    }

    public final Money getLifetime_pnl() {
        return this.lifetime_pnl;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetPositionHealthResponse(Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Money money7, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : money, (i & 2) != 0 ? null : money2, (i & 4) != 0 ? null : money3, (i & 8) != 0 ? null : money4, (i & 16) != 0 ? null : money5, (i & 32) != 0 ? null : money6, (i & 64) != 0 ? null : money7, (i & 128) != 0 ? "" : str, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPositionHealthResponse(Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Money money7, String account_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.unsettled_open_pnl = money;
        this.settled_open_pnl = money2;
        this.open_pnl = money3;
        this.unsettled_closed_pnl = money4;
        this.settled_closed_pnl = money5;
        this.closed_pnl = money6;
        this.lifetime_pnl = money7;
        this.account_id = account_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27875newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPositionHealthResponse)) {
            return false;
        }
        GetPositionHealthResponse getPositionHealthResponse = (GetPositionHealthResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPositionHealthResponse.unknownFields()) && Intrinsics.areEqual(this.unsettled_open_pnl, getPositionHealthResponse.unsettled_open_pnl) && Intrinsics.areEqual(this.settled_open_pnl, getPositionHealthResponse.settled_open_pnl) && Intrinsics.areEqual(this.open_pnl, getPositionHealthResponse.open_pnl) && Intrinsics.areEqual(this.unsettled_closed_pnl, getPositionHealthResponse.unsettled_closed_pnl) && Intrinsics.areEqual(this.settled_closed_pnl, getPositionHealthResponse.settled_closed_pnl) && Intrinsics.areEqual(this.closed_pnl, getPositionHealthResponse.closed_pnl) && Intrinsics.areEqual(this.lifetime_pnl, getPositionHealthResponse.lifetime_pnl) && Intrinsics.areEqual(this.account_id, getPositionHealthResponse.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Money money = this.unsettled_open_pnl;
        int iHashCode2 = (iHashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.settled_open_pnl;
        int iHashCode3 = (iHashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.open_pnl;
        int iHashCode4 = (iHashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.unsettled_closed_pnl;
        int iHashCode5 = (iHashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.settled_closed_pnl;
        int iHashCode6 = (iHashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.closed_pnl;
        int iHashCode7 = (iHashCode6 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Money money7 = this.lifetime_pnl;
        int iHashCode8 = ((iHashCode7 + (money7 != null ? money7.hashCode() : 0)) * 37) + this.account_id.hashCode();
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.unsettled_open_pnl;
        if (money != null) {
            arrayList.add("unsettled_open_pnl=" + money);
        }
        Money money2 = this.settled_open_pnl;
        if (money2 != null) {
            arrayList.add("settled_open_pnl=" + money2);
        }
        Money money3 = this.open_pnl;
        if (money3 != null) {
            arrayList.add("open_pnl=" + money3);
        }
        Money money4 = this.unsettled_closed_pnl;
        if (money4 != null) {
            arrayList.add("unsettled_closed_pnl=" + money4);
        }
        Money money5 = this.settled_closed_pnl;
        if (money5 != null) {
            arrayList.add("settled_closed_pnl=" + money5);
        }
        Money money6 = this.closed_pnl;
        if (money6 != null) {
            arrayList.add("closed_pnl=" + money6);
        }
        Money money7 = this.lifetime_pnl;
        if (money7 != null) {
            arrayList.add("lifetime_pnl=" + money7);
        }
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPositionHealthResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPositionHealthResponse copy$default(GetPositionHealthResponse getPositionHealthResponse, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Money money7, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            money = getPositionHealthResponse.unsettled_open_pnl;
        }
        if ((i & 2) != 0) {
            money2 = getPositionHealthResponse.settled_open_pnl;
        }
        if ((i & 4) != 0) {
            money3 = getPositionHealthResponse.open_pnl;
        }
        if ((i & 8) != 0) {
            money4 = getPositionHealthResponse.unsettled_closed_pnl;
        }
        if ((i & 16) != 0) {
            money5 = getPositionHealthResponse.settled_closed_pnl;
        }
        if ((i & 32) != 0) {
            money6 = getPositionHealthResponse.closed_pnl;
        }
        if ((i & 64) != 0) {
            money7 = getPositionHealthResponse.lifetime_pnl;
        }
        if ((i & 128) != 0) {
            str = getPositionHealthResponse.account_id;
        }
        if ((i & 256) != 0) {
            byteString = getPositionHealthResponse.unknownFields();
        }
        String str2 = str;
        ByteString byteString2 = byteString;
        Money money8 = money6;
        Money money9 = money7;
        Money money10 = money5;
        Money money11 = money3;
        return getPositionHealthResponse.copy(money, money2, money11, money4, money10, money8, money9, str2, byteString2);
    }

    public final GetPositionHealthResponse copy(Money unsettled_open_pnl, Money settled_open_pnl, Money open_pnl, Money unsettled_closed_pnl, Money settled_closed_pnl, Money closed_pnl, Money lifetime_pnl, String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPositionHealthResponse(unsettled_open_pnl, settled_open_pnl, open_pnl, unsettled_closed_pnl, settled_closed_pnl, closed_pnl, lifetime_pnl, account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPositionHealthResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPositionHealthResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: crypto_perpetuals.service.v1.GetPositionHealthResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPositionHealthResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getUnsettled_open_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(1, value.getUnsettled_open_pnl());
                }
                if (value.getSettled_open_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(2, value.getSettled_open_pnl());
                }
                if (value.getOpen_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(3, value.getOpen_pnl());
                }
                if (value.getUnsettled_closed_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(4, value.getUnsettled_closed_pnl());
                }
                if (value.getSettled_closed_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(5, value.getSettled_closed_pnl());
                }
                if (value.getClosed_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(6, value.getClosed_pnl());
                }
                if (value.getLifetime_pnl() != null) {
                    size += Money.ADAPTER.encodedSizeWithTag(7, value.getLifetime_pnl());
                }
                return !Intrinsics.areEqual(value.getAccount_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getAccount_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPositionHealthResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUnsettled_open_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getUnsettled_open_pnl());
                }
                if (value.getSettled_open_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getSettled_open_pnl());
                }
                if (value.getOpen_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpen_pnl());
                }
                if (value.getUnsettled_closed_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getUnsettled_closed_pnl());
                }
                if (value.getSettled_closed_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getSettled_closed_pnl());
                }
                if (value.getClosed_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getClosed_pnl());
                }
                if (value.getLifetime_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getLifetime_pnl());
                }
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAccount_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPositionHealthResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getAccount_id());
                }
                if (value.getLifetime_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 7, (int) value.getLifetime_pnl());
                }
                if (value.getClosed_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 6, (int) value.getClosed_pnl());
                }
                if (value.getSettled_closed_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 5, (int) value.getSettled_closed_pnl());
                }
                if (value.getUnsettled_closed_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 4, (int) value.getUnsettled_closed_pnl());
                }
                if (value.getOpen_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 3, (int) value.getOpen_pnl());
                }
                if (value.getSettled_open_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 2, (int) value.getSettled_open_pnl());
                }
                if (value.getUnsettled_open_pnl() != null) {
                    Money.ADAPTER.encodeWithTag(writer, 1, (int) value.getUnsettled_open_pnl());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPositionHealthResponse redact(GetPositionHealthResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Money unsettled_open_pnl = value.getUnsettled_open_pnl();
                Money moneyRedact = unsettled_open_pnl != null ? Money.ADAPTER.redact(unsettled_open_pnl) : null;
                Money settled_open_pnl = value.getSettled_open_pnl();
                Money moneyRedact2 = settled_open_pnl != null ? Money.ADAPTER.redact(settled_open_pnl) : null;
                Money open_pnl = value.getOpen_pnl();
                Money moneyRedact3 = open_pnl != null ? Money.ADAPTER.redact(open_pnl) : null;
                Money unsettled_closed_pnl = value.getUnsettled_closed_pnl();
                Money moneyRedact4 = unsettled_closed_pnl != null ? Money.ADAPTER.redact(unsettled_closed_pnl) : null;
                Money settled_closed_pnl = value.getSettled_closed_pnl();
                Money moneyRedact5 = settled_closed_pnl != null ? Money.ADAPTER.redact(settled_closed_pnl) : null;
                Money closed_pnl = value.getClosed_pnl();
                Money moneyRedact6 = closed_pnl != null ? Money.ADAPTER.redact(closed_pnl) : null;
                Money lifetime_pnl = value.getLifetime_pnl();
                return GetPositionHealthResponse.copy$default(value, moneyRedact, moneyRedact2, moneyRedact3, moneyRedact4, moneyRedact5, moneyRedact6, lifetime_pnl != null ? Money.ADAPTER.redact(lifetime_pnl) : null, null, ByteString.EMPTY, 128, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPositionHealthResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Money moneyDecode = null;
                Money moneyDecode2 = null;
                Money moneyDecode3 = null;
                Money moneyDecode4 = null;
                Money moneyDecode5 = null;
                Money moneyDecode6 = null;
                String strDecode = "";
                Money moneyDecode7 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                moneyDecode = Money.ADAPTER.decode(reader);
                                break;
                            case 2:
                                moneyDecode7 = Money.ADAPTER.decode(reader);
                                break;
                            case 3:
                                moneyDecode2 = Money.ADAPTER.decode(reader);
                                break;
                            case 4:
                                moneyDecode3 = Money.ADAPTER.decode(reader);
                                break;
                            case 5:
                                moneyDecode4 = Money.ADAPTER.decode(reader);
                                break;
                            case 6:
                                moneyDecode5 = Money.ADAPTER.decode(reader);
                                break;
                            case 7:
                                moneyDecode6 = Money.ADAPTER.decode(reader);
                                break;
                            case 8:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetPositionHealthResponse(moneyDecode, moneyDecode7, moneyDecode2, moneyDecode3, moneyDecode4, moneyDecode5, moneyDecode6, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
