package identi.service.p471v1.models_workflow.p472v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.PlaidBankList$Action;
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

/* compiled from: PlaidBankList.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004&'()B5\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"identi/service/v1/models_workflow/v1/PlaidBankList$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action;", "", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Proceed;", "proceed", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$CustomerAbandon;", "customer_abandon", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Fallback;", "fallback", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Proceed;Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Fallback;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Proceed;Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Fallback;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action;", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Proceed;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Proceed;", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$CustomerAbandon;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$CustomerAbandon;", "Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Fallback;", "getFallback", "()Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Fallback;", "Companion", "Proceed", "CustomerAbandon", "Fallback", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PlaidBankList$Action extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidBankList$Action> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidBankList$Action$CustomerAbandon#ADAPTER", jsonName = "customerAbandon", oneofName = "type", schemaIndex = 1, tag = 2)
    private final CustomerAbandon customer_abandon;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidBankList$Action$Fallback#ADAPTER", oneofName = "type", schemaIndex = 2, tag = 3)
    private final Fallback fallback;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidBankList$Action$Proceed#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Proceed proceed;

    public PlaidBankList$Action() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28372newBuilder();
    }

    public final Proceed getProceed() {
        return this.proceed;
    }

    public final CustomerAbandon getCustomer_abandon() {
        return this.customer_abandon;
    }

    public final Fallback getFallback() {
        return this.fallback;
    }

    public /* synthetic */ PlaidBankList$Action(Proceed proceed, CustomerAbandon customerAbandon, Fallback fallback, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : proceed, (i & 2) != 0 ? null : customerAbandon, (i & 4) != 0 ? null : fallback, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidBankList$Action(Proceed proceed, CustomerAbandon customerAbandon, Fallback fallback, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.proceed = proceed;
        this.customer_abandon = customerAbandon;
        this.fallback = fallback;
        if (Internal.countNonNull(proceed, customerAbandon, fallback) > 1) {
            throw new IllegalArgumentException("At most one of proceed, customer_abandon, fallback may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28372newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidBankList$Action)) {
            return false;
        }
        PlaidBankList$Action plaidBankList$Action = (PlaidBankList$Action) other;
        return Intrinsics.areEqual(unknownFields(), plaidBankList$Action.unknownFields()) && Intrinsics.areEqual(this.proceed, plaidBankList$Action.proceed) && Intrinsics.areEqual(this.customer_abandon, plaidBankList$Action.customer_abandon) && Intrinsics.areEqual(this.fallback, plaidBankList$Action.fallback);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Proceed proceed = this.proceed;
        int iHashCode2 = (iHashCode + (proceed != null ? proceed.hashCode() : 0)) * 37;
        CustomerAbandon customerAbandon = this.customer_abandon;
        int iHashCode3 = (iHashCode2 + (customerAbandon != null ? customerAbandon.hashCode() : 0)) * 37;
        Fallback fallback = this.fallback;
        int iHashCode4 = iHashCode3 + (fallback != null ? fallback.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Proceed proceed = this.proceed;
        if (proceed != null) {
            arrayList.add("proceed=" + proceed);
        }
        CustomerAbandon customerAbandon = this.customer_abandon;
        if (customerAbandon != null) {
            arrayList.add("customer_abandon=" + customerAbandon);
        }
        Fallback fallback = this.fallback;
        if (fallback != null) {
            arrayList.add("fallback=" + fallback);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final PlaidBankList$Action copy(Proceed proceed, CustomerAbandon customer_abandon, Fallback fallback, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidBankList$Action(proceed, customer_abandon, fallback, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidBankList$Action.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidBankList$Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidBankList$Action$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidBankList$Action decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PlaidBankList$Action.Proceed proceedDecode = null;
                PlaidBankList$Action.CustomerAbandon customerAbandonDecode = null;
                PlaidBankList$Action.Fallback fallbackDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaidBankList$Action(proceedDecode, customerAbandonDecode, fallbackDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        proceedDecode = PlaidBankList$Action.Proceed.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        customerAbandonDecode = PlaidBankList$Action.CustomerAbandon.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        fallbackDecode = PlaidBankList$Action.Fallback.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidBankList$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + PlaidBankList$Action.Proceed.ADAPTER.encodedSizeWithTag(1, value.getProceed()) + PlaidBankList$Action.CustomerAbandon.ADAPTER.encodedSizeWithTag(2, value.getCustomer_abandon()) + PlaidBankList$Action.Fallback.ADAPTER.encodedSizeWithTag(3, value.getFallback());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidBankList$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidBankList$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
                PlaidBankList$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                PlaidBankList$Action.Fallback.ADAPTER.encodeWithTag(writer, 3, (int) value.getFallback());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidBankList$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PlaidBankList$Action.Fallback.ADAPTER.encodeWithTag(writer, 3, (int) value.getFallback());
                PlaidBankList$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                PlaidBankList$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidBankList$Action redact(PlaidBankList$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidBankList$Action.Proceed proceed = value.getProceed();
                PlaidBankList$Action.Proceed proceedRedact = proceed != null ? PlaidBankList$Action.Proceed.ADAPTER.redact(proceed) : null;
                PlaidBankList$Action.CustomerAbandon customer_abandon = value.getCustomer_abandon();
                PlaidBankList$Action.CustomerAbandon customerAbandonRedact = customer_abandon != null ? PlaidBankList$Action.CustomerAbandon.ADAPTER.redact(customer_abandon) : null;
                PlaidBankList$Action.Fallback fallback = value.getFallback();
                return value.copy(proceedRedact, customerAbandonRedact, fallback != null ? PlaidBankList$Action.Fallback.ADAPTER.redact(fallback) : null, ByteString.EMPTY);
            }
        };
    }

    /* compiled from: PlaidBankList.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J(\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Proceed;", "Lcom/squareup/wire/Message;", "", "android_package_name", "", "redirect_uri", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getAndroid_package_name", "()Ljava/lang/String;", "getRedirect_uri", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Proceed extends Message {

        @JvmField
        public static final ProtoAdapter<Proceed> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "androidPackageName", oneofName = "params", schemaIndex = 0, tag = 1)
        private final String android_package_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "redirectUri", oneofName = "params", schemaIndex = 1, tag = 2)
        private final String redirect_uri;

        public Proceed() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28375newBuilder();
        }

        public final String getAndroid_package_name() {
            return this.android_package_name;
        }

        public final String getRedirect_uri() {
            return this.redirect_uri;
        }

        public /* synthetic */ Proceed(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Proceed(String str, String str2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.android_package_name = str;
            this.redirect_uri = str2;
            if (Internal.countNonNull(str, str2) > 1) {
                throw new IllegalArgumentException("At most one of android_package_name, redirect_uri may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28375newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Proceed)) {
                return false;
            }
            Proceed proceed = (Proceed) other;
            return Intrinsics.areEqual(unknownFields(), proceed.unknownFields()) && Intrinsics.areEqual(this.android_package_name, proceed.android_package_name) && Intrinsics.areEqual(this.redirect_uri, proceed.redirect_uri);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.android_package_name;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.redirect_uri;
            int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.android_package_name;
            if (str != null) {
                arrayList.add("android_package_name=" + Internal.sanitize(str));
            }
            String str2 = this.redirect_uri;
            if (str2 != null) {
                arrayList.add("redirect_uri=" + Internal.sanitize(str2));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Proceed{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Proceed copy$default(Proceed proceed, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = proceed.android_package_name;
            }
            if ((i & 2) != 0) {
                str2 = proceed.redirect_uri;
            }
            if ((i & 4) != 0) {
                byteString = proceed.unknownFields();
            }
            return proceed.copy(str, str2, byteString);
        }

        public final Proceed copy(String android_package_name, String redirect_uri, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Proceed(android_package_name, redirect_uri, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Proceed.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Proceed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidBankList$Action$Proceed$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$Action.Proceed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    String strDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PlaidBankList$Action.Proceed(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PlaidBankList$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    return size + protoAdapter.encodedSizeWithTag(1, value.getAndroid_package_name()) + protoAdapter.encodedSizeWithTag(2, value.getRedirect_uri());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PlaidBankList$Action.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAndroid_package_name());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getRedirect_uri());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PlaidBankList$Action.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getRedirect_uri());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAndroid_package_name());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$Action.Proceed redact(PlaidBankList$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return PlaidBankList$Action.Proceed.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: PlaidBankList.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$CustomerAbandon;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CustomerAbandon extends Message {

        @JvmField
        public static final ProtoAdapter<CustomerAbandon> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomerAbandon() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28373newBuilder();
        }

        public /* synthetic */ CustomerAbandon(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerAbandon(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28373newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof CustomerAbandon) && Intrinsics.areEqual(unknownFields(), ((CustomerAbandon) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "CustomerAbandon{}";
        }

        public final CustomerAbandon copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CustomerAbandon(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomerAbandon.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CustomerAbandon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidBankList$Action$CustomerAbandon$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$Action.CustomerAbandon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new PlaidBankList$Action.CustomerAbandon(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PlaidBankList$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PlaidBankList$Action.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PlaidBankList$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$Action.CustomerAbandon redact(PlaidBankList$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: PlaidBankList.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidBankList$Action$Fallback;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Fallback extends Message {

        @JvmField
        public static final ProtoAdapter<Fallback> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Fallback() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28374newBuilder();
        }

        public /* synthetic */ Fallback(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fallback(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28374newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Fallback) && Intrinsics.areEqual(unknownFields(), ((Fallback) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Fallback{}";
        }

        public final Fallback copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Fallback(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Fallback.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Fallback>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidBankList$Action$Fallback$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$Action.Fallback decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new PlaidBankList$Action.Fallback(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PlaidBankList$Action.Fallback value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PlaidBankList$Action.Fallback value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PlaidBankList$Action.Fallback value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PlaidBankList$Action.Fallback redact(PlaidBankList$Action.Fallback value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }
}
