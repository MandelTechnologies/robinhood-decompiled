package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ChallengeReplacementInfo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JL\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo;", "Lcom/squareup/wire/Message;", "", "old_challenge_id", "", "old_challenge_type", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "new_challenge_id", "new_challenge_type", "is_silent", "", "flow_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;ZLjava/lang/String;Lokio/ByteString;)V", "getOld_challenge_id", "()Ljava/lang/String;", "getOld_challenge_type", "()Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "getNew_challenge_id", "getNew_challenge_type", "()Z", "getFlow_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ChallengeType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ChallengeReplacementInfo extends Message {

    @JvmField
    public static final ProtoAdapter<ChallengeReplacementInfo> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "flowId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String flow_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSilent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean is_silent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newChallengeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String new_challenge_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo$ChallengeType#ADAPTER", jsonName = "newChallengeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ChallengeType new_challenge_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "oldChallengeId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String old_challenge_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo$ChallengeType#ADAPTER", jsonName = "oldChallengeType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final ChallengeType old_challenge_type;

    public ChallengeReplacementInfo() {
        this(null, null, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ ChallengeReplacementInfo(String str, ChallengeType challengeType, String str2, ChallengeType challengeType2, boolean z, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ChallengeType.CHALLENGE_TYPE_UNSPECIFIED : challengeType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ChallengeType.CHALLENGE_TYPE_UNSPECIFIED : challengeType2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24069newBuilder();
    }

    public final String getOld_challenge_id() {
        return this.old_challenge_id;
    }

    public final ChallengeType getOld_challenge_type() {
        return this.old_challenge_type;
    }

    public final String getNew_challenge_id() {
        return this.new_challenge_id;
    }

    public final ChallengeType getNew_challenge_type() {
        return this.new_challenge_type;
    }

    /* renamed from: is_silent, reason: from getter */
    public final boolean getIs_silent() {
        return this.is_silent;
    }

    public final String getFlow_id() {
        return this.flow_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeReplacementInfo(String old_challenge_id, ChallengeType old_challenge_type, String new_challenge_id, ChallengeType new_challenge_type, boolean z, String flow_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(old_challenge_id, "old_challenge_id");
        Intrinsics.checkNotNullParameter(old_challenge_type, "old_challenge_type");
        Intrinsics.checkNotNullParameter(new_challenge_id, "new_challenge_id");
        Intrinsics.checkNotNullParameter(new_challenge_type, "new_challenge_type");
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.old_challenge_id = old_challenge_id;
        this.old_challenge_type = old_challenge_type;
        this.new_challenge_id = new_challenge_id;
        this.new_challenge_type = new_challenge_type;
        this.is_silent = z;
        this.flow_id = flow_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24069newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ChallengeReplacementInfo)) {
            return false;
        }
        ChallengeReplacementInfo challengeReplacementInfo = (ChallengeReplacementInfo) other;
        return Intrinsics.areEqual(unknownFields(), challengeReplacementInfo.unknownFields()) && Intrinsics.areEqual(this.old_challenge_id, challengeReplacementInfo.old_challenge_id) && this.old_challenge_type == challengeReplacementInfo.old_challenge_type && Intrinsics.areEqual(this.new_challenge_id, challengeReplacementInfo.new_challenge_id) && this.new_challenge_type == challengeReplacementInfo.new_challenge_type && this.is_silent == challengeReplacementInfo.is_silent && Intrinsics.areEqual(this.flow_id, challengeReplacementInfo.flow_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.old_challenge_id.hashCode()) * 37) + this.old_challenge_type.hashCode()) * 37) + this.new_challenge_id.hashCode()) * 37) + this.new_challenge_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_silent)) * 37) + this.flow_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("old_challenge_id=" + Internal.sanitize(this.old_challenge_id));
        arrayList.add("old_challenge_type=" + this.old_challenge_type);
        arrayList.add("new_challenge_id=" + Internal.sanitize(this.new_challenge_id));
        arrayList.add("new_challenge_type=" + this.new_challenge_type);
        arrayList.add("is_silent=" + this.is_silent);
        arrayList.add("flow_id=" + Internal.sanitize(this.flow_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChallengeReplacementInfo{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ChallengeReplacementInfo copy$default(ChallengeReplacementInfo challengeReplacementInfo, String str, ChallengeType challengeType, String str2, ChallengeType challengeType2, boolean z, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeReplacementInfo.old_challenge_id;
        }
        if ((i & 2) != 0) {
            challengeType = challengeReplacementInfo.old_challenge_type;
        }
        if ((i & 4) != 0) {
            str2 = challengeReplacementInfo.new_challenge_id;
        }
        if ((i & 8) != 0) {
            challengeType2 = challengeReplacementInfo.new_challenge_type;
        }
        if ((i & 16) != 0) {
            z = challengeReplacementInfo.is_silent;
        }
        if ((i & 32) != 0) {
            str3 = challengeReplacementInfo.flow_id;
        }
        if ((i & 64) != 0) {
            byteString = challengeReplacementInfo.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        boolean z2 = z;
        String str5 = str2;
        return challengeReplacementInfo.copy(str, challengeType, str5, challengeType2, z2, str4, byteString2);
    }

    public final ChallengeReplacementInfo copy(String old_challenge_id, ChallengeType old_challenge_type, String new_challenge_id, ChallengeType new_challenge_type, boolean is_silent, String flow_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(old_challenge_id, "old_challenge_id");
        Intrinsics.checkNotNullParameter(old_challenge_type, "old_challenge_type");
        Intrinsics.checkNotNullParameter(new_challenge_id, "new_challenge_id");
        Intrinsics.checkNotNullParameter(new_challenge_type, "new_challenge_type");
        Intrinsics.checkNotNullParameter(flow_id, "flow_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ChallengeReplacementInfo(old_challenge_id, old_challenge_type, new_challenge_id, new_challenge_type, is_silent, flow_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChallengeReplacementInfo.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ChallengeReplacementInfo>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ChallengeReplacementInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getOld_challenge_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getOld_challenge_id());
                }
                ChallengeReplacementInfo.ChallengeType old_challenge_type = value.getOld_challenge_type();
                ChallengeReplacementInfo.ChallengeType challengeType = ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                if (old_challenge_type != challengeType) {
                    size += ChallengeReplacementInfo.ChallengeType.ADAPTER.encodedSizeWithTag(2, value.getOld_challenge_type());
                }
                if (!Intrinsics.areEqual(value.getNew_challenge_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getNew_challenge_id());
                }
                if (value.getNew_challenge_type() != challengeType) {
                    size += ChallengeReplacementInfo.ChallengeType.ADAPTER.encodedSizeWithTag(4, value.getNew_challenge_type());
                }
                if (value.getIs_silent()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(5, java.lang.Boolean.valueOf(value.getIs_silent()));
                }
                return !Intrinsics.areEqual(value.getFlow_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getFlow_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ChallengeReplacementInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getOld_challenge_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOld_challenge_id());
                }
                ChallengeReplacementInfo.ChallengeType old_challenge_type = value.getOld_challenge_type();
                ChallengeReplacementInfo.ChallengeType challengeType = ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                if (old_challenge_type != challengeType) {
                    ChallengeReplacementInfo.ChallengeType.ADAPTER.encodeWithTag(writer, 2, (int) value.getOld_challenge_type());
                }
                if (!Intrinsics.areEqual(value.getNew_challenge_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNew_challenge_id());
                }
                if (value.getNew_challenge_type() != challengeType) {
                    ChallengeReplacementInfo.ChallengeType.ADAPTER.encodeWithTag(writer, 4, (int) value.getNew_challenge_type());
                }
                if (value.getIs_silent()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getIs_silent()));
                }
                if (!Intrinsics.areEqual(value.getFlow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFlow_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ChallengeReplacementInfo value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFlow_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getFlow_id());
                }
                if (value.getIs_silent()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) java.lang.Boolean.valueOf(value.getIs_silent()));
                }
                ChallengeReplacementInfo.ChallengeType new_challenge_type = value.getNew_challenge_type();
                ChallengeReplacementInfo.ChallengeType challengeType = ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                if (new_challenge_type != challengeType) {
                    ChallengeReplacementInfo.ChallengeType.ADAPTER.encodeWithTag(writer, 4, (int) value.getNew_challenge_type());
                }
                if (!Intrinsics.areEqual(value.getNew_challenge_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getNew_challenge_id());
                }
                if (value.getOld_challenge_type() != challengeType) {
                    ChallengeReplacementInfo.ChallengeType.ADAPTER.encodeWithTag(writer, 2, (int) value.getOld_challenge_type());
                }
                if (Intrinsics.areEqual(value.getOld_challenge_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getOld_challenge_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ChallengeReplacementInfo decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ChallengeReplacementInfo.ChallengeType challengeType = ChallengeReplacementInfo.ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                boolean zBooleanValue = false;
                ChallengeReplacementInfo.ChallengeType challengeTypeDecode = challengeType;
                ChallengeReplacementInfo.ChallengeType challengeTypeDecode2 = challengeTypeDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                try {
                                    challengeTypeDecode = ChallengeReplacementInfo.ChallengeType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                try {
                                    challengeTypeDecode2 = ChallengeReplacementInfo.ChallengeType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 5:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 6:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new ChallengeReplacementInfo(strDecode, challengeTypeDecode, strDecode2, challengeTypeDecode2, zBooleanValue, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ChallengeReplacementInfo redact(ChallengeReplacementInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ChallengeReplacementInfo.copy$default(value, null, null, null, null, false, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChallengeReplacementInfo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CHALLENGE_TYPE_UNSPECIFIED", "SMS", "APP", "BACKUP_CODE", "EMAIL", "PROMPT", "WEBAUTHN", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ChallengeType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ChallengeType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ChallengeType> ADAPTER;
        public static final ChallengeType APP;
        public static final ChallengeType BACKUP_CODE;
        public static final ChallengeType CHALLENGE_TYPE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ChallengeType EMAIL;
        public static final ChallengeType PROMPT;
        public static final ChallengeType SMS;
        public static final ChallengeType WEBAUTHN;
        private final int value;

        private static final /* synthetic */ ChallengeType[] $values() {
            return new ChallengeType[]{CHALLENGE_TYPE_UNSPECIFIED, SMS, APP, BACKUP_CODE, EMAIL, PROMPT, WEBAUTHN};
        }

        @JvmStatic
        public static final ChallengeType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ChallengeType> getEntries() {
            return $ENTRIES;
        }

        private ChallengeType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ChallengeType challengeType = new ChallengeType("CHALLENGE_TYPE_UNSPECIFIED", 0, 0);
            CHALLENGE_TYPE_UNSPECIFIED = challengeType;
            SMS = new ChallengeType("SMS", 1, 1);
            APP = new ChallengeType("APP", 2, 2);
            BACKUP_CODE = new ChallengeType("BACKUP_CODE", 3, 3);
            EMAIL = new ChallengeType("EMAIL", 4, 4);
            PROMPT = new ChallengeType("PROMPT", 5, 5);
            WEBAUTHN = new ChallengeType("WEBAUTHN", 6, 6);
            ChallengeType[] challengeTypeArr$values = $values();
            $VALUES = challengeTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(challengeTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ChallengeType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ChallengeType>(orCreateKotlinClass, syntax, challengeType) { // from class: com.robinhood.rosetta.eventlogging.ChallengeReplacementInfo$ChallengeType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ChallengeReplacementInfo.ChallengeType fromValue(int value) {
                    return ChallengeReplacementInfo.ChallengeType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ChallengeReplacementInfo.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ChallengeReplacementInfo$ChallengeType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ChallengeType fromValue(int value) {
                switch (value) {
                    case 0:
                        return ChallengeType.CHALLENGE_TYPE_UNSPECIFIED;
                    case 1:
                        return ChallengeType.SMS;
                    case 2:
                        return ChallengeType.APP;
                    case 3:
                        return ChallengeType.BACKUP_CODE;
                    case 4:
                        return ChallengeType.EMAIL;
                    case 5:
                        return ChallengeType.PROMPT;
                    case 6:
                        return ChallengeType.WEBAUTHN;
                    default:
                        return null;
                }
            }
        }

        public static ChallengeType valueOf(String str) {
            return (ChallengeType) Enum.valueOf(ChallengeType.class, str);
        }

        public static ChallengeType[] values() {
            return (ChallengeType[]) $VALUES.clone();
        }
    }
}
