package nummus.p512v1;

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
import nummus.p512v1.TaxlotabilityResponse;
import okio.ByteString;

/* compiled from: TaxlotabilityResponse.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006 "}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponse;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "state", "Lnummus/v1/TaxlotabilityState;", "disabled_alert", "Lnummus/v1/TaxlotabilityResponse$TaxlotabilityAlert;", "account_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lnummus/v1/TaxlotabilityState;Lnummus/v1/TaxlotabilityResponse$TaxlotabilityAlert;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getState", "()Lnummus/v1/TaxlotabilityState;", "getDisabled_alert", "()Lnummus/v1/TaxlotabilityResponse$TaxlotabilityAlert;", "getAccount_id", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "TaxlotabilityAlert", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TaxlotabilityResponse extends Message {

    @JvmField
    public static final ProtoAdapter<TaxlotabilityResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", schemaIndex = 3, tag = 4)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    @WireField(adapter = "nummus.v1.TaxlotabilityResponse$TaxlotabilityAlert#ADAPTER", jsonName = "disabledAlert", schemaIndex = 2, tag = 3)
    private final TaxlotabilityAlert disabled_alert;

    @WireField(adapter = "nummus.v1.TaxlotabilityState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final TaxlotabilityState state;

    public TaxlotabilityResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29442newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public /* synthetic */ TaxlotabilityResponse(String str, TaxlotabilityState taxlotabilityState, TaxlotabilityAlert taxlotabilityAlert, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TaxlotabilityState.STATE_UNSPECIFIED : taxlotabilityState, (i & 4) != 0 ? null : taxlotabilityAlert, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final TaxlotabilityState getState() {
        return this.state;
    }

    public final TaxlotabilityAlert getDisabled_alert() {
        return this.disabled_alert;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxlotabilityResponse(String currency_pair_id, TaxlotabilityState state, TaxlotabilityAlert taxlotabilityAlert, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = currency_pair_id;
        this.state = state;
        this.disabled_alert = taxlotabilityAlert;
        this.account_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29442newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxlotabilityResponse)) {
            return false;
        }
        TaxlotabilityResponse taxlotabilityResponse = (TaxlotabilityResponse) other;
        return Intrinsics.areEqual(unknownFields(), taxlotabilityResponse.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, taxlotabilityResponse.currency_pair_id) && this.state == taxlotabilityResponse.state && Intrinsics.areEqual(this.disabled_alert, taxlotabilityResponse.disabled_alert) && Intrinsics.areEqual(this.account_id, taxlotabilityResponse.account_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.currency_pair_id.hashCode()) * 37) + this.state.hashCode()) * 37;
        TaxlotabilityAlert taxlotabilityAlert = this.disabled_alert;
        int iHashCode2 = (iHashCode + (taxlotabilityAlert != null ? taxlotabilityAlert.hashCode() : 0)) * 37;
        String str = this.account_id;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("currency_pair_id=" + Internal.sanitize(this.currency_pair_id));
        arrayList.add("state=" + this.state);
        TaxlotabilityAlert taxlotabilityAlert = this.disabled_alert;
        if (taxlotabilityAlert != null) {
            arrayList.add("disabled_alert=" + taxlotabilityAlert);
        }
        String str = this.account_id;
        if (str != null) {
            arrayList.add("account_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxlotabilityResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ TaxlotabilityResponse copy$default(TaxlotabilityResponse taxlotabilityResponse, String str, TaxlotabilityState taxlotabilityState, TaxlotabilityAlert taxlotabilityAlert, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxlotabilityResponse.currency_pair_id;
        }
        if ((i & 2) != 0) {
            taxlotabilityState = taxlotabilityResponse.state;
        }
        if ((i & 4) != 0) {
            taxlotabilityAlert = taxlotabilityResponse.disabled_alert;
        }
        if ((i & 8) != 0) {
            str2 = taxlotabilityResponse.account_id;
        }
        if ((i & 16) != 0) {
            byteString = taxlotabilityResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        TaxlotabilityAlert taxlotabilityAlert2 = taxlotabilityAlert;
        return taxlotabilityResponse.copy(str, taxlotabilityState, taxlotabilityAlert2, str2, byteString2);
    }

    public final TaxlotabilityResponse copy(String currency_pair_id, TaxlotabilityState state, TaxlotabilityAlert disabled_alert, String account_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxlotabilityResponse(currency_pair_id, state, disabled_alert, account_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxlotabilityResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxlotabilityResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.TaxlotabilityResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxlotabilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCurrency_pair_id());
                }
                if (value.getState() != TaxlotabilityState.STATE_UNSPECIFIED) {
                    size += TaxlotabilityState.ADAPTER.encodedSizeWithTag(2, value.getState());
                }
                return size + TaxlotabilityResponse.TaxlotabilityAlert.ADAPTER.encodedSizeWithTag(3, value.getDisabled_alert()) + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getAccount_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxlotabilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                }
                if (value.getState() != TaxlotabilityState.STATE_UNSPECIFIED) {
                    TaxlotabilityState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                TaxlotabilityResponse.TaxlotabilityAlert.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisabled_alert());
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getAccount_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxlotabilityResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getAccount_id());
                TaxlotabilityResponse.TaxlotabilityAlert.ADAPTER.encodeWithTag(writer, 3, (int) value.getDisabled_alert());
                if (value.getState() != TaxlotabilityState.STATE_UNSPECIFIED) {
                    TaxlotabilityState.ADAPTER.encodeWithTag(writer, 2, (int) value.getState());
                }
                if (Intrinsics.areEqual(value.getCurrency_pair_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxlotabilityResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                TaxlotabilityState taxlotabilityStateDecode = TaxlotabilityState.STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                TaxlotabilityResponse.TaxlotabilityAlert taxlotabilityAlertDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                while (true) {
                    TaxlotabilityState taxlotabilityState = taxlotabilityStateDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new TaxlotabilityResponse(strDecode2, taxlotabilityState, taxlotabilityAlertDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                taxlotabilityStateDecode = TaxlotabilityState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            taxlotabilityAlertDecode = TaxlotabilityResponse.TaxlotabilityAlert.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxlotabilityResponse redact(TaxlotabilityResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                TaxlotabilityResponse.TaxlotabilityAlert disabled_alert = value.getDisabled_alert();
                return TaxlotabilityResponse.copy$default(value, null, null, disabled_alert != null ? TaxlotabilityResponse.TaxlotabilityAlert.ADAPTER.redact(disabled_alert) : null, null, ByteString.EMPTY, 11, null);
            }
        };
    }

    /* compiled from: TaxlotabilityResponse.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lnummus/v1/TaxlotabilityResponse$TaxlotabilityAlert;", "Lcom/squareup/wire/Message;", "", "title", "", "message", "dismiss_cta_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getDismiss_cta_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TaxlotabilityAlert extends Message {

        @JvmField
        public static final ProtoAdapter<TaxlotabilityAlert> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dismissCtaText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String dismiss_cta_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String message;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String title;

        public TaxlotabilityAlert() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ TaxlotabilityAlert(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29443newBuilder();
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getDismiss_cta_text() {
            return this.dismiss_cta_text;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxlotabilityAlert(String title, String message, String dismiss_cta_text, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(dismiss_cta_text, "dismiss_cta_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.title = title;
            this.message = message;
            this.dismiss_cta_text = dismiss_cta_text;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29443newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TaxlotabilityAlert)) {
                return false;
            }
            TaxlotabilityAlert taxlotabilityAlert = (TaxlotabilityAlert) other;
            return Intrinsics.areEqual(unknownFields(), taxlotabilityAlert.unknownFields()) && Intrinsics.areEqual(this.title, taxlotabilityAlert.title) && Intrinsics.areEqual(this.message, taxlotabilityAlert.message) && Intrinsics.areEqual(this.dismiss_cta_text, taxlotabilityAlert.dismiss_cta_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.message.hashCode()) * 37) + this.dismiss_cta_text.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("title=" + Internal.sanitize(this.title));
            arrayList.add("message=" + Internal.sanitize(this.message));
            arrayList.add("dismiss_cta_text=" + Internal.sanitize(this.dismiss_cta_text));
            return CollectionsKt.joinToString$default(arrayList, ", ", "TaxlotabilityAlert{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ TaxlotabilityAlert copy$default(TaxlotabilityAlert taxlotabilityAlert, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taxlotabilityAlert.title;
            }
            if ((i & 2) != 0) {
                str2 = taxlotabilityAlert.message;
            }
            if ((i & 4) != 0) {
                str3 = taxlotabilityAlert.dismiss_cta_text;
            }
            if ((i & 8) != 0) {
                byteString = taxlotabilityAlert.unknownFields();
            }
            return taxlotabilityAlert.copy(str, str2, str3, byteString);
        }

        public final TaxlotabilityAlert copy(String title, String message, String dismiss_cta_text, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(dismiss_cta_text, "dismiss_cta_text");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new TaxlotabilityAlert(title, message, dismiss_cta_text, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxlotabilityAlert.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<TaxlotabilityAlert>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: nummus.v1.TaxlotabilityResponse$TaxlotabilityAlert$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TaxlotabilityResponse.TaxlotabilityAlert value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getMessage());
                    }
                    return !Intrinsics.areEqual(value.getDismiss_cta_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getDismiss_cta_text()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TaxlotabilityResponse.TaxlotabilityAlert value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                    }
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                    }
                    if (!Intrinsics.areEqual(value.getDismiss_cta_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDismiss_cta_text());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TaxlotabilityResponse.TaxlotabilityAlert value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getDismiss_cta_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getDismiss_cta_text());
                    }
                    if (!Intrinsics.areEqual(value.getMessage(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getMessage());
                    }
                    if (Intrinsics.areEqual(value.getTitle(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TaxlotabilityResponse.TaxlotabilityAlert redact(TaxlotabilityResponse.TaxlotabilityAlert value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return TaxlotabilityResponse.TaxlotabilityAlert.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TaxlotabilityResponse.TaxlotabilityAlert decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new TaxlotabilityResponse.TaxlotabilityAlert(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
