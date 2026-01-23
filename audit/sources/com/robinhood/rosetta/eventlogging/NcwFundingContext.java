package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.NcwFundingContext;
import com.robinhood.rosetta.eventlogging.Screen;
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

/* compiled from: NcwFundingContext.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016JX\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContext;", "Lcom/squareup/wire/Message;", "", "funding_session_id", "", "session_flow", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "deeplink", "token_selected", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "final_robinhood_app_transfer_screen", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "connect_id", "source_screen", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen$Name;Lokio/ByteString;)V", "getFunding_session_id", "()Ljava/lang/String;", "getSession_flow", "()Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "getDeeplink", "getToken_selected", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "getFinal_robinhood_app_transfer_screen", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getConnect_id", "getSource_screen", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "SessionFlow", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class NcwFundingContext extends Message {

    @JvmField
    public static final ProtoAdapter<NcwFundingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "connectId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String connect_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String deeplink;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen$Name#ADAPTER", jsonName = "finalRobinhoodAppTransferScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Screen.Name final_robinhood_app_transfer_screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fundingSessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String funding_session_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.NcwFundingContext$SessionFlow#ADAPTER", jsonName = "sessionFlow", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SessionFlow session_flow;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen$Name#ADAPTER", jsonName = "sourceScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Screen.Name source_screen;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", jsonName = "tokenSelected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CryptoAssetContext token_selected;

    public NcwFundingContext() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public /* synthetic */ NcwFundingContext(String str, SessionFlow sessionFlow, String str2, CryptoAssetContext cryptoAssetContext, Screen.Name name, String str3, Screen.Name name2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SessionFlow.FLOW_UNSPECIFIED : sessionFlow, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : cryptoAssetContext, (i & 16) != 0 ? Screen.Name.NAME_UNSPECIFIED : name, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? Screen.Name.NAME_UNSPECIFIED : name2, (i & 128) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24394newBuilder();
    }

    public final String getFunding_session_id() {
        return this.funding_session_id;
    }

    public final SessionFlow getSession_flow() {
        return this.session_flow;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final CryptoAssetContext getToken_selected() {
        return this.token_selected;
    }

    public final Screen.Name getFinal_robinhood_app_transfer_screen() {
        return this.final_robinhood_app_transfer_screen;
    }

    public final String getConnect_id() {
        return this.connect_id;
    }

    public final Screen.Name getSource_screen() {
        return this.source_screen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NcwFundingContext(String funding_session_id, SessionFlow session_flow, String deeplink, CryptoAssetContext cryptoAssetContext, Screen.Name final_robinhood_app_transfer_screen, String connect_id, Screen.Name source_screen, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(funding_session_id, "funding_session_id");
        Intrinsics.checkNotNullParameter(session_flow, "session_flow");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(final_robinhood_app_transfer_screen, "final_robinhood_app_transfer_screen");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.funding_session_id = funding_session_id;
        this.session_flow = session_flow;
        this.deeplink = deeplink;
        this.token_selected = cryptoAssetContext;
        this.final_robinhood_app_transfer_screen = final_robinhood_app_transfer_screen;
        this.connect_id = connect_id;
        this.source_screen = source_screen;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24394newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof NcwFundingContext)) {
            return false;
        }
        NcwFundingContext ncwFundingContext = (NcwFundingContext) other;
        return Intrinsics.areEqual(unknownFields(), ncwFundingContext.unknownFields()) && Intrinsics.areEqual(this.funding_session_id, ncwFundingContext.funding_session_id) && this.session_flow == ncwFundingContext.session_flow && Intrinsics.areEqual(this.deeplink, ncwFundingContext.deeplink) && Intrinsics.areEqual(this.token_selected, ncwFundingContext.token_selected) && this.final_robinhood_app_transfer_screen == ncwFundingContext.final_robinhood_app_transfer_screen && Intrinsics.areEqual(this.connect_id, ncwFundingContext.connect_id) && this.source_screen == ncwFundingContext.source_screen;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.funding_session_id.hashCode()) * 37) + this.session_flow.hashCode()) * 37) + this.deeplink.hashCode()) * 37;
        CryptoAssetContext cryptoAssetContext = this.token_selected;
        int iHashCode2 = ((((((iHashCode + (cryptoAssetContext != null ? cryptoAssetContext.hashCode() : 0)) * 37) + this.final_robinhood_app_transfer_screen.hashCode()) * 37) + this.connect_id.hashCode()) * 37) + this.source_screen.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("funding_session_id=" + Internal.sanitize(this.funding_session_id));
        arrayList.add("session_flow=" + this.session_flow);
        arrayList.add("deeplink=" + Internal.sanitize(this.deeplink));
        CryptoAssetContext cryptoAssetContext = this.token_selected;
        if (cryptoAssetContext != null) {
            arrayList.add("token_selected=" + cryptoAssetContext);
        }
        arrayList.add("final_robinhood_app_transfer_screen=" + this.final_robinhood_app_transfer_screen);
        arrayList.add("connect_id=" + Internal.sanitize(this.connect_id));
        arrayList.add("source_screen=" + this.source_screen);
        return CollectionsKt.joinToString$default(arrayList, ", ", "NcwFundingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ NcwFundingContext copy$default(NcwFundingContext ncwFundingContext, String str, SessionFlow sessionFlow, String str2, CryptoAssetContext cryptoAssetContext, Screen.Name name, String str3, Screen.Name name2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ncwFundingContext.funding_session_id;
        }
        if ((i & 2) != 0) {
            sessionFlow = ncwFundingContext.session_flow;
        }
        if ((i & 4) != 0) {
            str2 = ncwFundingContext.deeplink;
        }
        if ((i & 8) != 0) {
            cryptoAssetContext = ncwFundingContext.token_selected;
        }
        if ((i & 16) != 0) {
            name = ncwFundingContext.final_robinhood_app_transfer_screen;
        }
        if ((i & 32) != 0) {
            str3 = ncwFundingContext.connect_id;
        }
        if ((i & 64) != 0) {
            name2 = ncwFundingContext.source_screen;
        }
        if ((i & 128) != 0) {
            byteString = ncwFundingContext.unknownFields();
        }
        Screen.Name name3 = name2;
        ByteString byteString2 = byteString;
        Screen.Name name4 = name;
        String str4 = str3;
        return ncwFundingContext.copy(str, sessionFlow, str2, cryptoAssetContext, name4, str4, name3, byteString2);
    }

    public final NcwFundingContext copy(String funding_session_id, SessionFlow session_flow, String deeplink, CryptoAssetContext token_selected, Screen.Name final_robinhood_app_transfer_screen, String connect_id, Screen.Name source_screen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(funding_session_id, "funding_session_id");
        Intrinsics.checkNotNullParameter(session_flow, "session_flow");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(final_robinhood_app_transfer_screen, "final_robinhood_app_transfer_screen");
        Intrinsics.checkNotNullParameter(connect_id, "connect_id");
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new NcwFundingContext(funding_session_id, session_flow, deeplink, token_selected, final_robinhood_app_transfer_screen, connect_id, source_screen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NcwFundingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<NcwFundingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.NcwFundingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NcwFundingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getFunding_session_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getFunding_session_id());
                }
                if (value.getSession_flow() != NcwFundingContext.SessionFlow.FLOW_UNSPECIFIED) {
                    size += NcwFundingContext.SessionFlow.ADAPTER.encodedSizeWithTag(2, value.getSession_flow());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDeeplink());
                }
                if (value.getToken_selected() != null) {
                    size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(4, value.getToken_selected());
                }
                Screen.Name final_robinhood_app_transfer_screen = value.getFinal_robinhood_app_transfer_screen();
                Screen.Name name = Screen.Name.NAME_UNSPECIFIED;
                if (final_robinhood_app_transfer_screen != name) {
                    size += Screen.Name.ADAPTER.encodedSizeWithTag(5, value.getFinal_robinhood_app_transfer_screen());
                }
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getConnect_id());
                }
                return value.getSource_screen() != name ? size + Screen.Name.ADAPTER.encodedSizeWithTag(7, value.getSource_screen()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NcwFundingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getFunding_session_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFunding_session_id());
                }
                if (value.getSession_flow() != NcwFundingContext.SessionFlow.FLOW_UNSPECIFIED) {
                    NcwFundingContext.SessionFlow.ADAPTER.encodeWithTag(writer, 2, (int) value.getSession_flow());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeeplink());
                }
                if (value.getToken_selected() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getToken_selected());
                }
                Screen.Name final_robinhood_app_transfer_screen = value.getFinal_robinhood_app_transfer_screen();
                Screen.Name name = Screen.Name.NAME_UNSPECIFIED;
                if (final_robinhood_app_transfer_screen != name) {
                    Screen.Name.ADAPTER.encodeWithTag(writer, 5, (int) value.getFinal_robinhood_app_transfer_screen());
                }
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getConnect_id());
                }
                if (value.getSource_screen() != name) {
                    Screen.Name.ADAPTER.encodeWithTag(writer, 7, (int) value.getSource_screen());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NcwFundingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Screen.Name source_screen = value.getSource_screen();
                Screen.Name name = Screen.Name.NAME_UNSPECIFIED;
                if (source_screen != name) {
                    Screen.Name.ADAPTER.encodeWithTag(writer, 7, (int) value.getSource_screen());
                }
                if (!Intrinsics.areEqual(value.getConnect_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getConnect_id());
                }
                if (value.getFinal_robinhood_app_transfer_screen() != name) {
                    Screen.Name.ADAPTER.encodeWithTag(writer, 5, (int) value.getFinal_robinhood_app_transfer_screen());
                }
                if (value.getToken_selected() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 4, (int) value.getToken_selected());
                }
                if (!Intrinsics.areEqual(value.getDeeplink(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDeeplink());
                }
                if (value.getSession_flow() != NcwFundingContext.SessionFlow.FLOW_UNSPECIFIED) {
                    NcwFundingContext.SessionFlow.ADAPTER.encodeWithTag(writer, 2, (int) value.getSession_flow());
                }
                if (Intrinsics.areEqual(value.getFunding_session_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getFunding_session_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public NcwFundingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                NcwFundingContext.SessionFlow sessionFlowDecode = NcwFundingContext.SessionFlow.FLOW_UNSPECIFIED;
                Screen.Name name = Screen.Name.NAME_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                CryptoAssetContext cryptoAssetContextDecode = null;
                Screen.Name nameDecode = name;
                Screen.Name nameDecode2 = nameDecode;
                while (true) {
                    NcwFundingContext.SessionFlow sessionFlow = sessionFlowDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        sessionFlowDecode = NcwFundingContext.SessionFlow.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    cryptoAssetContextDecode = CryptoAssetContext.ADAPTER.decode(reader);
                                    break;
                                case 5:
                                    try {
                                        nameDecode = Screen.Name.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 6:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    try {
                                        nameDecode2 = Screen.Name.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new NcwFundingContext(strDecode, sessionFlow, strDecode2, cryptoAssetContextDecode, nameDecode, strDecode3, nameDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NcwFundingContext redact(NcwFundingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoAssetContext token_selected = value.getToken_selected();
                return NcwFundingContext.copy$default(value, null, null, null, token_selected != null ? CryptoAssetContext.ADAPTER.redact(token_selected) : null, null, null, null, ByteString.EMPTY, 119, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwFundingContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FLOW_UNSPECIFIED", "ONBOARDING", "WALLET_HUB", "BUYING_PROMPT", "RECEIVE_FLOW", "OTHER", "NUX_FUNDING_PROMPT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SessionFlow implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SessionFlow[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SessionFlow> ADAPTER;
        public static final SessionFlow BUYING_PROMPT;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SessionFlow FLOW_UNSPECIFIED;
        public static final SessionFlow NUX_FUNDING_PROMPT;
        public static final SessionFlow ONBOARDING;
        public static final SessionFlow OTHER;
        public static final SessionFlow RECEIVE_FLOW;
        public static final SessionFlow WALLET_HUB;
        private final int value;

        private static final /* synthetic */ SessionFlow[] $values() {
            return new SessionFlow[]{FLOW_UNSPECIFIED, ONBOARDING, WALLET_HUB, BUYING_PROMPT, RECEIVE_FLOW, OTHER, NUX_FUNDING_PROMPT};
        }

        @JvmStatic
        public static final SessionFlow fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SessionFlow> getEntries() {
            return $ENTRIES;
        }

        private SessionFlow(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SessionFlow sessionFlow = new SessionFlow("FLOW_UNSPECIFIED", 0, 0);
            FLOW_UNSPECIFIED = sessionFlow;
            ONBOARDING = new SessionFlow("ONBOARDING", 1, 1);
            WALLET_HUB = new SessionFlow("WALLET_HUB", 2, 2);
            BUYING_PROMPT = new SessionFlow("BUYING_PROMPT", 3, 3);
            RECEIVE_FLOW = new SessionFlow("RECEIVE_FLOW", 4, 4);
            OTHER = new SessionFlow("OTHER", 5, 5);
            NUX_FUNDING_PROMPT = new SessionFlow("NUX_FUNDING_PROMPT", 6, 6);
            SessionFlow[] sessionFlowArr$values = $values();
            $VALUES = sessionFlowArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sessionFlowArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SessionFlow.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SessionFlow>(orCreateKotlinClass, syntax, sessionFlow) { // from class: com.robinhood.rosetta.eventlogging.NcwFundingContext$SessionFlow$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public NcwFundingContext.SessionFlow fromValue(int value) {
                    return NcwFundingContext.SessionFlow.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: NcwFundingContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/NcwFundingContext$SessionFlow;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SessionFlow fromValue(int value) {
                switch (value) {
                    case 0:
                        return SessionFlow.FLOW_UNSPECIFIED;
                    case 1:
                        return SessionFlow.ONBOARDING;
                    case 2:
                        return SessionFlow.WALLET_HUB;
                    case 3:
                        return SessionFlow.BUYING_PROMPT;
                    case 4:
                        return SessionFlow.RECEIVE_FLOW;
                    case 5:
                        return SessionFlow.OTHER;
                    case 6:
                        return SessionFlow.NUX_FUNDING_PROMPT;
                    default:
                        return null;
                }
            }
        }

        public static SessionFlow valueOf(String str) {
            return (SessionFlow) Enum.valueOf(SessionFlow.class, str);
        }

        public static SessionFlow[] values() {
            return (SessionFlow[]) $VALUES.clone();
        }
    }
}
