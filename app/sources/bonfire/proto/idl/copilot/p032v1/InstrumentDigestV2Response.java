package bonfire.proto.idl.copilot.p032v1;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.ErrorResponse;
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

/* compiled from: InstrumentDigestV2Response.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00016Bm\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 Js\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010 R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b%\u0010 R\"\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b/\u0010 R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105¨\u00067"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;", "Lcom/squareup/wire/Message;", "", "", "account_number", "instrument_id", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "updated_at", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;", ErrorResponse.DETAIL, "digest_id", "", "has_signed_agreement", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "instrument_type", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;Ljava/lang/String;ZLbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/Instant;Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;Ljava/lang/String;ZLbonfire/proto/idl/copilot/v1/InstrumentType;Lokio/ByteString;)Lbonfire/proto/idl/copilot/v1/InstrumentDigestV2Response;", "Ljava/lang/String;", "getAccount_number", "getInstrument_id", "Lj$/time/Instant;", "getUpdated_at", "()Lj$/time/Instant;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;", "getPreview", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestPreview;", "Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;", "getDetail", "()Lbonfire/proto/idl/copilot/v1/InstrumentDigestDetail;", "getDigest_id", "Z", "getHas_signed_agreement", "()Z", "Lbonfire/proto/idl/copilot/v1/InstrumentType;", "getInstrument_type", "()Lbonfire/proto/idl/copilot/v1/InstrumentType;", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class InstrumentDigestV2Response extends Message {

    @JvmField
    public static final ProtoAdapter<InstrumentDigestV2Response> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_number;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentDigestDetail#ADAPTER", schemaIndex = 4, tag = 5)
    private final InstrumentDigestDetail detail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "digestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String digest_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSignedAgreement", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean has_signed_agreement;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentType#ADAPTER", jsonName = "instrumentType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final InstrumentType instrument_type;

    @WireField(adapter = "bonfire.proto.idl.copilot.v1.InstrumentDigestPreview#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final InstrumentDigestPreview preview;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Instant updated_at;

    public InstrumentDigestV2Response() {
        this(null, null, null, null, null, null, false, null, null, 511, null);
    }

    public /* synthetic */ InstrumentDigestV2Response(String str, String str2, Instant instant, InstrumentDigestPreview instrumentDigestPreview, InstrumentDigestDetail instrumentDigestDetail, String str3, boolean z, InstrumentType instrumentType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : instant, (i & 8) != 0 ? null : instrumentDigestPreview, (i & 16) != 0 ? null : instrumentDigestDetail, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED : instrumentType, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8873newBuilder();
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    public final Instant getUpdated_at() {
        return this.updated_at;
    }

    public final InstrumentDigestPreview getPreview() {
        return this.preview;
    }

    public final InstrumentDigestDetail getDetail() {
        return this.detail;
    }

    public final String getDigest_id() {
        return this.digest_id;
    }

    public final boolean getHas_signed_agreement() {
        return this.has_signed_agreement;
    }

    public final InstrumentType getInstrument_type() {
        return this.instrument_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDigestV2Response(String account_number, String instrument_id, Instant instant, InstrumentDigestPreview instrumentDigestPreview, InstrumentDigestDetail instrumentDigestDetail, String digest_id, boolean z, InstrumentType instrument_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_number = account_number;
        this.instrument_id = instrument_id;
        this.updated_at = instant;
        this.preview = instrumentDigestPreview;
        this.detail = instrumentDigestDetail;
        this.digest_id = digest_id;
        this.has_signed_agreement = z;
        this.instrument_type = instrument_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8873newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof InstrumentDigestV2Response)) {
            return false;
        }
        InstrumentDigestV2Response instrumentDigestV2Response = (InstrumentDigestV2Response) other;
        return Intrinsics.areEqual(unknownFields(), instrumentDigestV2Response.unknownFields()) && Intrinsics.areEqual(this.account_number, instrumentDigestV2Response.account_number) && Intrinsics.areEqual(this.instrument_id, instrumentDigestV2Response.instrument_id) && Intrinsics.areEqual(this.updated_at, instrumentDigestV2Response.updated_at) && Intrinsics.areEqual(this.preview, instrumentDigestV2Response.preview) && Intrinsics.areEqual(this.detail, instrumentDigestV2Response.detail) && Intrinsics.areEqual(this.digest_id, instrumentDigestV2Response.digest_id) && this.has_signed_agreement == instrumentDigestV2Response.has_signed_agreement && this.instrument_type == instrumentDigestV2Response.instrument_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.account_number.hashCode()) * 37) + this.instrument_id.hashCode()) * 37;
        Instant instant = this.updated_at;
        int iHashCode2 = (iHashCode + (instant != null ? instant.hashCode() : 0)) * 37;
        InstrumentDigestPreview instrumentDigestPreview = this.preview;
        int iHashCode3 = (iHashCode2 + (instrumentDigestPreview != null ? instrumentDigestPreview.hashCode() : 0)) * 37;
        InstrumentDigestDetail instrumentDigestDetail = this.detail;
        int iHashCode4 = ((((((iHashCode3 + (instrumentDigestDetail != null ? instrumentDigestDetail.hashCode() : 0)) * 37) + this.digest_id.hashCode()) * 37) + Boolean.hashCode(this.has_signed_agreement)) * 37) + this.instrument_type.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        Instant instant = this.updated_at;
        if (instant != null) {
            arrayList.add("updated_at=" + instant);
        }
        InstrumentDigestPreview instrumentDigestPreview = this.preview;
        if (instrumentDigestPreview != null) {
            arrayList.add("preview=" + instrumentDigestPreview);
        }
        InstrumentDigestDetail instrumentDigestDetail = this.detail;
        if (instrumentDigestDetail != null) {
            arrayList.add("detail=" + instrumentDigestDetail);
        }
        arrayList.add("digest_id=" + Internal.sanitize(this.digest_id));
        arrayList.add("has_signed_agreement=" + this.has_signed_agreement);
        arrayList.add("instrument_type=" + this.instrument_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentDigestV2Response{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ InstrumentDigestV2Response copy$default(InstrumentDigestV2Response instrumentDigestV2Response, String str, String str2, Instant instant, InstrumentDigestPreview instrumentDigestPreview, InstrumentDigestDetail instrumentDigestDetail, String str3, boolean z, InstrumentType instrumentType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instrumentDigestV2Response.account_number;
        }
        if ((i & 2) != 0) {
            str2 = instrumentDigestV2Response.instrument_id;
        }
        if ((i & 4) != 0) {
            instant = instrumentDigestV2Response.updated_at;
        }
        if ((i & 8) != 0) {
            instrumentDigestPreview = instrumentDigestV2Response.preview;
        }
        if ((i & 16) != 0) {
            instrumentDigestDetail = instrumentDigestV2Response.detail;
        }
        if ((i & 32) != 0) {
            str3 = instrumentDigestV2Response.digest_id;
        }
        if ((i & 64) != 0) {
            z = instrumentDigestV2Response.has_signed_agreement;
        }
        if ((i & 128) != 0) {
            instrumentType = instrumentDigestV2Response.instrument_type;
        }
        if ((i & 256) != 0) {
            byteString = instrumentDigestV2Response.unknownFields();
        }
        InstrumentType instrumentType2 = instrumentType;
        ByteString byteString2 = byteString;
        String str4 = str3;
        boolean z2 = z;
        InstrumentDigestDetail instrumentDigestDetail2 = instrumentDigestDetail;
        Instant instant2 = instant;
        return instrumentDigestV2Response.copy(str, str2, instant2, instrumentDigestPreview, instrumentDigestDetail2, str4, z2, instrumentType2, byteString2);
    }

    public final InstrumentDigestV2Response copy(String account_number, String instrument_id, Instant updated_at, InstrumentDigestPreview preview, InstrumentDigestDetail detail, String digest_id, boolean has_signed_agreement, InstrumentType instrument_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(digest_id, "digest_id");
        Intrinsics.checkNotNullParameter(instrument_type, "instrument_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new InstrumentDigestV2Response(account_number, instrument_id, updated_at, preview, detail, digest_id, has_signed_agreement, instrument_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentDigestV2Response.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<InstrumentDigestV2Response>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.InstrumentDigestV2Response$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InstrumentDigestV2Response value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                if (value.getUpdated_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(3, value.getUpdated_at());
                }
                if (value.getPreview() != null) {
                    size += InstrumentDigestPreview.ADAPTER.encodedSizeWithTag(4, value.getPreview());
                }
                int iEncodedSizeWithTag = size + InstrumentDigestDetail.ADAPTER.encodedSizeWithTag(5, value.getDetail());
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getDigest_id());
                }
                if (value.getHas_signed_agreement()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getHas_signed_agreement()));
                }
                return value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + InstrumentType.ADAPTER.encodedSizeWithTag(8, value.getInstrument_type()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InstrumentDigestV2Response value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                if (value.getPreview() != null) {
                    InstrumentDigestPreview.ADAPTER.encodeWithTag(writer, 4, (int) value.getPreview());
                }
                InstrumentDigestDetail.ADAPTER.encodeWithTag(writer, 5, (int) value.getDetail());
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDigest_id());
                }
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 8, (int) value.getInstrument_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InstrumentDigestV2Response value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInstrument_type() != InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED) {
                    InstrumentType.ADAPTER.encodeWithTag(writer, 8, (int) value.getInstrument_type());
                }
                if (value.getHas_signed_agreement()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getHas_signed_agreement()));
                }
                if (!Intrinsics.areEqual(value.getDigest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getDigest_id());
                }
                InstrumentDigestDetail.ADAPTER.encodeWithTag(writer, 5, (int) value.getDetail());
                if (value.getPreview() != null) {
                    InstrumentDigestPreview.ADAPTER.encodeWithTag(writer, 4, (int) value.getPreview());
                }
                if (value.getUpdated_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (Intrinsics.areEqual(value.getAccount_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentDigestV2Response decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                InstrumentType instrumentType = InstrumentType.INSTRUMENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Instant instantDecode = null;
                InstrumentDigestPreview instrumentDigestPreviewDecode = null;
                InstrumentDigestDetail instrumentDigestDetailDecode = null;
                boolean zBooleanValue = false;
                InstrumentType instrumentTypeDecode = instrumentType;
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                instantDecode = ProtoAdapter.INSTANT.decode(reader);
                                break;
                            case 4:
                                instrumentDigestPreviewDecode = InstrumentDigestPreview.ADAPTER.decode(reader);
                                break;
                            case 5:
                                instrumentDigestDetailDecode = InstrumentDigestDetail.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 8:
                                try {
                                    instrumentTypeDecode = InstrumentType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new InstrumentDigestV2Response(strDecode2, strDecode3, instantDecode, instrumentDigestPreviewDecode, instrumentDigestDetailDecode, strDecode, zBooleanValue, instrumentTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InstrumentDigestV2Response redact(InstrumentDigestV2Response value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant updated_at = value.getUpdated_at();
                Instant instantRedact = updated_at != null ? ProtoAdapter.INSTANT.redact(updated_at) : null;
                InstrumentDigestPreview preview = value.getPreview();
                InstrumentDigestPreview instrumentDigestPreviewRedact = preview != null ? InstrumentDigestPreview.ADAPTER.redact(preview) : null;
                InstrumentDigestDetail detail = value.getDetail();
                return InstrumentDigestV2Response.copy$default(value, null, null, instantRedact, instrumentDigestPreviewRedact, detail != null ? InstrumentDigestDetail.ADAPTER.redact(detail) : null, null, false, null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, null);
            }
        };
    }
}
