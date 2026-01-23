package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: PortfolioSharingContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PortfolioSharingContext;", "Lcom/squareup/wire/Message;", "", "show_portfolio_value", "", "show_first_name", "attach_referral_link", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZZLokio/ByteString;)V", "getShow_portfolio_value", "()Z", "getShow_first_name", "getAttach_referral_link", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PortfolioSharingContext extends Message {

    @JvmField
    public static final ProtoAdapter<PortfolioSharingContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "attachReferralLink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean attach_referral_link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showFirstName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean show_first_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "showPortfolioValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean show_portfolio_value;

    public PortfolioSharingContext() {
        this(false, false, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24505newBuilder();
    }

    public final boolean getShow_portfolio_value() {
        return this.show_portfolio_value;
    }

    public final boolean getShow_first_name() {
        return this.show_first_name;
    }

    public final boolean getAttach_referral_link() {
        return this.attach_referral_link;
    }

    public /* synthetic */ PortfolioSharingContext(boolean z, boolean z2, boolean z3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfolioSharingContext(boolean z, boolean z2, boolean z3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.show_portfolio_value = z;
        this.show_first_name = z2;
        this.attach_referral_link = z3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24505newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PortfolioSharingContext)) {
            return false;
        }
        PortfolioSharingContext portfolioSharingContext = (PortfolioSharingContext) other;
        return Intrinsics.areEqual(unknownFields(), portfolioSharingContext.unknownFields()) && this.show_portfolio_value == portfolioSharingContext.show_portfolio_value && this.show_first_name == portfolioSharingContext.show_first_name && this.attach_referral_link == portfolioSharingContext.attach_referral_link;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + java.lang.Boolean.hashCode(this.show_portfolio_value)) * 37) + java.lang.Boolean.hashCode(this.show_first_name)) * 37) + java.lang.Boolean.hashCode(this.attach_referral_link);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("show_portfolio_value=" + this.show_portfolio_value);
        arrayList.add("show_first_name=" + this.show_first_name);
        arrayList.add("attach_referral_link=" + this.attach_referral_link);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfolioSharingContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PortfolioSharingContext copy$default(PortfolioSharingContext portfolioSharingContext, boolean z, boolean z2, boolean z3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = portfolioSharingContext.show_portfolio_value;
        }
        if ((i & 2) != 0) {
            z2 = portfolioSharingContext.show_first_name;
        }
        if ((i & 4) != 0) {
            z3 = portfolioSharingContext.attach_referral_link;
        }
        if ((i & 8) != 0) {
            byteString = portfolioSharingContext.unknownFields();
        }
        return portfolioSharingContext.copy(z, z2, z3, byteString);
    }

    public final PortfolioSharingContext copy(boolean show_portfolio_value, boolean show_first_name, boolean attach_referral_link, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PortfolioSharingContext(show_portfolio_value, show_first_name, attach_referral_link, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioSharingContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PortfolioSharingContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PortfolioSharingContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PortfolioSharingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getShow_portfolio_value()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, java.lang.Boolean.valueOf(value.getShow_portfolio_value()));
                }
                if (value.getShow_first_name()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(2, java.lang.Boolean.valueOf(value.getShow_first_name()));
                }
                return value.getAttach_referral_link() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, java.lang.Boolean.valueOf(value.getAttach_referral_link())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PortfolioSharingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getShow_portfolio_value()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getShow_portfolio_value()));
                }
                if (value.getShow_first_name()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getShow_first_name()));
                }
                if (value.getAttach_referral_link()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getAttach_referral_link()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PortfolioSharingContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAttach_referral_link()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) java.lang.Boolean.valueOf(value.getAttach_referral_link()));
                }
                if (value.getShow_first_name()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) java.lang.Boolean.valueOf(value.getShow_first_name()));
                }
                if (value.getShow_portfolio_value()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) java.lang.Boolean.valueOf(value.getShow_portfolio_value()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioSharingContext redact(PortfolioSharingContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PortfolioSharingContext.copy$default(value, false, false, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PortfolioSharingContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PortfolioSharingContext(zBooleanValue, zBooleanValue2, zBooleanValue3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 3) {
                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
