package bonfire.proto.idl.copilot.p032v1;

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
import p479j$.time.Instant;

/* compiled from: GetPortfolioDigestResponse.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00012Bm\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJs\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\u001fR\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\"\u0010\t\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101¨\u00063"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "Lcom/squareup/wire/Message;", "", "", "account_number", "digest_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "read_at", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;", "digest_content_needs_onboarding", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;", "digest_content_has_onboarded", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGold;", "digest_content_needs_gold", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGold;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGold;Lokio/ByteString;)Lbonfire/proto/idl/copilot/v1/GetPortfolioDigestResponse;", "Ljava/lang/String;", "getAccount_number", "getDigest_id", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "getRead_at", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;", "getDigest_content_needs_onboarding", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsOnboarding;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;", "getDigest_content_has_onboarded", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestHasOnboarded;", "Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGold;", "getDigest_content_needs_gold", "()Lbonfire/proto/idl/copilot/v1/PortfolioDigestNeedsGold;", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetPortfolioDigestResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetPortfolioDigestResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestHasOnboarded#ADAPTER", jsonName = "digestContentHasOnboarded", oneofName = "digest_content", schemaIndex = 5, tag = 52)
    private final PortfolioDigestHasOnboarded digest_content_has_onboarded;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestNeedsGold#ADAPTER", jsonName = "digestContentNeedsGold", oneofName = "digest_content", schemaIndex = 6, tag = 53)
    private final PortfolioDigestNeedsGold digest_content_needs_gold;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.PortfolioDigestNeedsOnboarding#ADAPTER", jsonName = "digestContentNeedsOnboarding", oneofName = "digest_content", schemaIndex = 4, tag = 51)
    private final PortfolioDigestNeedsOnboarding digest_content_needs_onboarding;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String digest_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "readAt", schemaIndex = 3, tag = 4)
    private final Instant read_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant updated_at;

    public GetPortfolioDigestResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ GetPortfolioDigestResponse(String str, String str2, Instant instant, Instant instant2, PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboarding, PortfolioDigestHasOnboarded portfolioDigestHasOnboarded, PortfolioDigestNeedsGold portfolioDigestNeedsGold, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instant2, (i & 16) != 0 ? null : portfolioDigestNeedsOnboarding, (i & 32) != 0 ? null : portfolioDigestHasOnboarded, (i & 64) != 0 ? null : portfolioDigestNeedsGold, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8866newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final Instant getRead_at() {
        return this.read_at;
    }

    public final PortfolioDigestNeedsOnboarding getDigest_content_needs_onboarding() {
        return this.digest_content_needs_onboarding;
    }

    public final PortfolioDigestHasOnboarded getDigest_content_has_onboarded() {
        return this.digest_content_has_onboarded;
    }

    public final PortfolioDigestNeedsGold getDigest_content_needs_gold() {
        return this.digest_content_needs_gold;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfolioDigestResponse(String account_number, String digest_id, Instant instant, Instant instant2, PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboarding, PortfolioDigestHasOnboarded portfolioDigestHasOnboarded, PortfolioDigestNeedsGold portfolioDigestNeedsGold, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.digest_id = digest_id;
        this.updated_at = instant;
        this.read_at = instant2;
        this.digest_content_needs_onboarding = portfolioDigestNeedsOnboarding;
        this.digest_content_has_onboarded = portfolioDigestHasOnboarded;
        this.digest_content_needs_gold = portfolioDigestNeedsGold;
        if (Internal.countNonNull(portfolioDigestNeedsOnboarding, portfolioDigestHasOnboarded, portfolioDigestNeedsGold) > 1) {
            throw new IllegalArgumentException("At most one of digest_content_needs_onboarding, digest_content_has_onboarded, digest_content_needs_gold may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8866newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetPortfolioDigestResponse)) {
            return false;
        }
        GetPortfolioDigestResponse getPortfolioDigestResponse = (GetPortfolioDigestResponse) other;
        return Intrinsics.areEqual(unknownFields(), getPortfolioDigestResponse.unknownFields()) && Intrinsics.areEqual(this.account_number, getPortfolioDigestResponse.account_number) && Intrinsics.areEqual(this.digest_id, getPortfolioDigestResponse.digest_id) && Intrinsics.areEqual(this.updated_at, getPortfolioDigestResponse.updated_at) && Intrinsics.areEqual(this.read_at, getPortfolioDigestResponse.read_at) && Intrinsics.areEqual(this.digest_content_needs_onboarding, getPortfolioDigestResponse.digest_content_needs_onboarding) && Intrinsics.areEqual(this.digest_content_has_onboarded, getPortfolioDigestResponse.digest_content_has_onboarded) && Intrinsics.areEqual(this.digest_content_needs_gold, getPortfolioDigestResponse.digest_content_needs_gold);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.digest_id.hashCode()) * 37;
        Instant instant = this.updated_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        Instant instant2 = this.read_at;
        int iHashCode3 = (iHashCode2 + (instant2 != null ? instant2.hashCode() : 0)) * 37;
        PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboarding = this.digest_content_needs_onboarding;
        int iHashCode4 = (iHashCode3 + (portfolioDigestNeedsOnboarding != null ? portfolioDigestNeedsOnboarding.hashCode() : 0)) * 37;
        PortfolioDigestHasOnboarded portfolioDigestHasOnboarded = this.digest_content_has_onboarded;
        int iHashCode5 = (iHashCode4 + (portfolioDigestHasOnboarded != null ? portfolioDigestHasOnboarded.hashCode() : 0)) * 37;
        PortfolioDigestNeedsGold portfolioDigestNeedsGold = this.digest_content_needs_gold;
        int iHashCode6 = iHashCode5 + (portfolioDigestNeedsGold != null ? portfolioDigestNeedsGold.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        Instant instant = this.updated_at;
        if (instant != null) {
            arrayList.add("updated_at=" + instant);
        }
        Instant instant2 = this.read_at;
        if (instant2 != null) {
            arrayList.add("read_at=" + instant2);
        }
        PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboarding = this.digest_content_needs_onboarding;
        if (portfolioDigestNeedsOnboarding != null) {
            arrayList.add("digest_content_needs_onboarding=" + portfolioDigestNeedsOnboarding);
        }
        PortfolioDigestHasOnboarded portfolioDigestHasOnboarded = this.digest_content_has_onboarded;
        if (portfolioDigestHasOnboarded != null) {
            arrayList.add("digest_content_has_onboarded=" + portfolioDigestHasOnboarded);
        }
        PortfolioDigestNeedsGold portfolioDigestNeedsGold = this.digest_content_needs_gold;
        if (portfolioDigestNeedsGold != null) {
            arrayList.add("digest_content_needs_gold=" + portfolioDigestNeedsGold);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfolioDigestResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetPortfolioDigestResponse copy$default(GetPortfolioDigestResponse getPortfolioDigestResponse, String str, String str2, Instant instant, Instant instant2, PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboarding, PortfolioDigestHasOnboarded portfolioDigestHasOnboarded, PortfolioDigestNeedsGold portfolioDigestNeedsGold, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPortfolioDigestResponse.account_number;
        }
        if ((i & 2) != 0) {
            str2 = getPortfolioDigestResponse.digest_id;
        }
        if ((i & 4) != 0) {
            instant = getPortfolioDigestResponse.updated_at;
        }
        if ((i & 8) != 0) {
            instant2 = getPortfolioDigestResponse.read_at;
        }
        if ((i & 16) != 0) {
            portfolioDigestNeedsOnboarding = getPortfolioDigestResponse.digest_content_needs_onboarding;
        }
        if ((i & 32) != 0) {
            portfolioDigestHasOnboarded = getPortfolioDigestResponse.digest_content_has_onboarded;
        }
        if ((i & 64) != 0) {
            portfolioDigestNeedsGold = getPortfolioDigestResponse.digest_content_needs_gold;
        }
        if ((i & 128) != 0) {
            byteString = getPortfolioDigestResponse.unknownFields();
        }
        PortfolioDigestNeedsGold portfolioDigestNeedsGold2 = portfolioDigestNeedsGold;
        ByteString byteString2 = byteString;
        PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboarding2 = portfolioDigestNeedsOnboarding;
        PortfolioDigestHasOnboarded portfolioDigestHasOnboarded2 = portfolioDigestHasOnboarded;
        return getPortfolioDigestResponse.copy(str, str2, instant, instant2, portfolioDigestNeedsOnboarding2, portfolioDigestHasOnboarded2, portfolioDigestNeedsGold2, byteString2);
    }

    public final GetPortfolioDigestResponse copy(String account_number, String digest_id, Instant updated_at, Instant read_at, PortfolioDigestNeedsOnboarding digest_content_needs_onboarding, PortfolioDigestHasOnboarded digest_content_has_onboarded, PortfolioDigestNeedsGold digest_content_needs_gold, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetPortfolioDigestResponse(account_number, digest_id, updated_at, read_at, digest_content_needs_onboarding, digest_content_has_onboarded, digest_content_needs_gold, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetPortfolioDigestResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetPortfolioDigestResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.GetPortfolioDigestResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetPortfolioDigestResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDigest_id());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getUpdated_at());
                }
                return size + ProtoAdapter.INSTANT.encodedSizeWithTag(4, value.getRead_at()) + PortfolioDigestNeedsOnboarding.ADAPTER.encodedSizeWithTag(51, value.getDigest_content_needs_onboarding()) + PortfolioDigestHasOnboarded.ADAPTER.encodedSizeWithTag(52, value.getDigest_content_has_onboarded()) + PortfolioDigestNeedsGold.ADAPTER.encodedSizeWithTag(53, value.getDigest_content_needs_gold());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetPortfolioDigestResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDigest_id());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                ProtoAdapter.INSTANT.encodeWithTag(writer, 4, (int) value.getRead_at());
                PortfolioDigestNeedsOnboarding.ADAPTER.encodeWithTag(writer, 51, (int) value.getDigest_content_needs_onboarding());
                PortfolioDigestHasOnboarded.ADAPTER.encodeWithTag(writer, 52, (int) value.getDigest_content_has_onboarded());
                PortfolioDigestNeedsGold.ADAPTER.encodeWithTag(writer, 53, (int) value.getDigest_content_needs_gold());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetPortfolioDigestResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PortfolioDigestNeedsGold.ADAPTER.encodeWithTag(writer, 53, (int) value.getDigest_content_needs_gold());
                PortfolioDigestHasOnboarded.ADAPTER.encodeWithTag(writer, 52, (int) value.getDigest_content_has_onboarded());
                PortfolioDigestNeedsOnboarding.ADAPTER.encodeWithTag(writer, 51, (int) value.getDigest_content_needs_onboarding());
                ProtoAdapter<Instant> protoAdapter = ProtoAdapter.INSTANT;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getRead_at());
                if (value.getUpdated_at() != null) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDigest_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestResponse redact(GetPortfolioDigestResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                Instant read_at = value.getRead_at();
                Instant instantRedact2 = read_at != null ? ProtoAdapter.INSTANT.redact(read_at) : null;
                PortfolioDigestNeedsOnboarding digest_content_needs_onboarding = value.getDigest_content_needs_onboarding();
                PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboardingRedact = digest_content_needs_onboarding != null ? PortfolioDigestNeedsOnboarding.ADAPTER.redact(digest_content_needs_onboarding) : null;
                PortfolioDigestHasOnboarded digest_content_has_onboarded = value.getDigest_content_has_onboarded();
                PortfolioDigestHasOnboarded portfolioDigestHasOnboardedRedact = digest_content_has_onboarded != null ? PortfolioDigestHasOnboarded.ADAPTER.redact(digest_content_has_onboarded) : null;
                PortfolioDigestNeedsGold digest_content_needs_gold = value.getDigest_content_needs_gold();
                return GetPortfolioDigestResponse.copy$default(value, null, null, instantRedact, instantRedact2, portfolioDigestNeedsOnboardingRedact, portfolioDigestHasOnboardedRedact, digest_content_needs_gold != null ? PortfolioDigestNeedsGold.ADAPTER.redact(digest_content_needs_gold) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetPortfolioDigestResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                Instant instantDecode2 = null;
                PortfolioDigestNeedsOnboarding portfolioDigestNeedsOnboardingDecode = null;
                PortfolioDigestHasOnboarded portfolioDigestHasOnboardedDecode = null;
                PortfolioDigestNeedsGold portfolioDigestNeedsGoldDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetPortfolioDigestResponse(strDecode, strDecode2, instantDecode, instantDecode2, portfolioDigestNeedsOnboardingDecode, portfolioDigestHasOnboardedDecode, portfolioDigestNeedsGoldDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 4) {
                        instantDecode2 = ProtoAdapter.INSTANT.decode(reader);
                    } else {
                        switch (iNextTag) {
                            case 51:
                                portfolioDigestNeedsOnboardingDecode = PortfolioDigestNeedsOnboarding.ADAPTER.decode(reader);
                                break;
                            case 52:
                                portfolioDigestHasOnboardedDecode = PortfolioDigestHasOnboarded.ADAPTER.decode(reader);
                                break;
                            case 53:
                                portfolioDigestNeedsGoldDecode = PortfolioDigestNeedsGold.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    }
                }
            }
        };
    }
}
