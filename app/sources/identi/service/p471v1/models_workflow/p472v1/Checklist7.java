package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
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
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import identi.service.p471v1.models_workflow.p472v1.Checklist7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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

/* compiled from: Checklist.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002/0Bi\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJo\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u001eR\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b+\u0010\u001eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, m3636d2 = {"identi/service/v1/models_workflow/v1/Checklist$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;", "", "", "header_title", "", "markdown_items", Footer.f10637type, WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "", "primary_cta_enable_delay_seconds", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "secondary_cta_callback", "secondary_cta_deeplink", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;Ljava/lang/String;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams;", "Ljava/lang/String;", "getHeader_title", "getFooter", "getPrimary_cta", "I", "getPrimary_cta_enable_delay_seconds", "getSecondary_cta", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "getSecondary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "getSecondary_cta_deeplink", "Ljava/util/List;", "getMarkdown_items", "()Ljava/util/List;", "Companion", "Callback", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.Checklist$ScreenParams, reason: use source file name */
/* loaded from: classes14.dex */
public final class Checklist7 extends Message {

    @JvmField
    public static final ProtoAdapter<Checklist7> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String footer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "headerTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String header_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markdownItems", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> markdown_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String primary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "primaryCtaEnableDelaySeconds", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int primary_cta_enable_delay_seconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String secondary_cta;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Checklist$ScreenParams$Callback#ADAPTER", jsonName = "secondaryCtaCallback", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Callback secondary_cta_callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCtaDeeplink", schemaIndex = 7, tag = 8)
    private final String secondary_cta_deeplink;

    public Checklist7() {
        this(null, null, null, null, 0, null, null, null, null, 511, null);
    }

    public /* synthetic */ Checklist7(String str, List list, String str2, String str3, int i, String str4, Callback callback, String str5, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? Callback.CALLBACK_UNSPECIFIED : callback, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28279newBuilder();
    }

    public final String getHeader_title() {
        return this.header_title;
    }

    public final String getFooter() {
        return this.footer;
    }

    public final String getPrimary_cta() {
        return this.primary_cta;
    }

    public final int getPrimary_cta_enable_delay_seconds() {
        return this.primary_cta_enable_delay_seconds;
    }

    public final String getSecondary_cta() {
        return this.secondary_cta;
    }

    public final Callback getSecondary_cta_callback() {
        return this.secondary_cta_callback;
    }

    public final String getSecondary_cta_deeplink() {
        return this.secondary_cta_deeplink;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Checklist7(String header_title, List<String> markdown_items, String footer, String primary_cta, int i, String secondary_cta, Callback secondary_cta_callback, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(header_title, "header_title");
        Intrinsics.checkNotNullParameter(markdown_items, "markdown_items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(secondary_cta, "secondary_cta");
        Intrinsics.checkNotNullParameter(secondary_cta_callback, "secondary_cta_callback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.header_title = header_title;
        this.footer = footer;
        this.primary_cta = primary_cta;
        this.primary_cta_enable_delay_seconds = i;
        this.secondary_cta = secondary_cta;
        this.secondary_cta_callback = secondary_cta_callback;
        this.secondary_cta_deeplink = str;
        this.markdown_items = Internal.immutableCopyOf("markdown_items", markdown_items);
    }

    public final List<String> getMarkdown_items() {
        return this.markdown_items;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28279newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Checklist7)) {
            return false;
        }
        Checklist7 checklist7 = (Checklist7) other;
        return Intrinsics.areEqual(unknownFields(), checklist7.unknownFields()) && Intrinsics.areEqual(this.header_title, checklist7.header_title) && Intrinsics.areEqual(this.markdown_items, checklist7.markdown_items) && Intrinsics.areEqual(this.footer, checklist7.footer) && Intrinsics.areEqual(this.primary_cta, checklist7.primary_cta) && this.primary_cta_enable_delay_seconds == checklist7.primary_cta_enable_delay_seconds && Intrinsics.areEqual(this.secondary_cta, checklist7.secondary_cta) && this.secondary_cta_callback == checklist7.secondary_cta_callback && Intrinsics.areEqual(this.secondary_cta_deeplink, checklist7.secondary_cta_deeplink);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.header_title.hashCode()) * 37) + this.markdown_items.hashCode()) * 37) + this.footer.hashCode()) * 37) + this.primary_cta.hashCode()) * 37) + Integer.hashCode(this.primary_cta_enable_delay_seconds)) * 37) + this.secondary_cta.hashCode()) * 37) + this.secondary_cta_callback.hashCode()) * 37;
        String str = this.secondary_cta_deeplink;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("header_title=" + Internal.sanitize(this.header_title));
        if (!this.markdown_items.isEmpty()) {
            arrayList.add("markdown_items=" + Internal.sanitize(this.markdown_items));
        }
        arrayList.add("footer=" + Internal.sanitize(this.footer));
        arrayList.add("primary_cta=" + Internal.sanitize(this.primary_cta));
        arrayList.add("primary_cta_enable_delay_seconds=" + this.primary_cta_enable_delay_seconds);
        arrayList.add("secondary_cta=" + Internal.sanitize(this.secondary_cta));
        arrayList.add("secondary_cta_callback=" + this.secondary_cta_callback);
        String str = this.secondary_cta_deeplink;
        if (str != null) {
            arrayList.add("secondary_cta_deeplink=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Checklist7 copy$default(Checklist7 checklist7, String str, List list, String str2, String str3, int i, String str4, Callback callback, String str5, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = checklist7.header_title;
        }
        if ((i2 & 2) != 0) {
            list = checklist7.markdown_items;
        }
        if ((i2 & 4) != 0) {
            str2 = checklist7.footer;
        }
        if ((i2 & 8) != 0) {
            str3 = checklist7.primary_cta;
        }
        if ((i2 & 16) != 0) {
            i = checklist7.primary_cta_enable_delay_seconds;
        }
        if ((i2 & 32) != 0) {
            str4 = checklist7.secondary_cta;
        }
        if ((i2 & 64) != 0) {
            callback = checklist7.secondary_cta_callback;
        }
        if ((i2 & 128) != 0) {
            str5 = checklist7.secondary_cta_deeplink;
        }
        if ((i2 & 256) != 0) {
            byteString = checklist7.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        String str7 = str4;
        Callback callback2 = callback;
        int i3 = i;
        String str8 = str2;
        return checklist7.copy(str, list, str8, str3, i3, str7, callback2, str6, byteString2);
    }

    public final Checklist7 copy(String header_title, List<String> markdown_items, String footer, String primary_cta, int primary_cta_enable_delay_seconds, String secondary_cta, Callback secondary_cta_callback, String secondary_cta_deeplink, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(header_title, "header_title");
        Intrinsics.checkNotNullParameter(markdown_items, "markdown_items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(secondary_cta, "secondary_cta");
        Intrinsics.checkNotNullParameter(secondary_cta_callback, "secondary_cta_callback");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Checklist7(header_title, markdown_items, footer, primary_cta, primary_cta_enable_delay_seconds, secondary_cta, secondary_cta_callback, secondary_cta_deeplink, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Checklist7.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Checklist7>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.Checklist$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Checklist7 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeader_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeader_title());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getMarkdown_items());
                if (!Intrinsics.areEqual(value.getFooter(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getFooter());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getPrimary_cta());
                }
                if (value.getPrimary_cta_enable_delay_seconds() != 0) {
                    iEncodedSizeWithTag += ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getPrimary_cta_enable_delay_seconds()));
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getSecondary_cta());
                }
                if (value.getSecondary_cta_callback() != Checklist7.Callback.CALLBACK_UNSPECIFIED) {
                    iEncodedSizeWithTag += Checklist7.Callback.ADAPTER.encodedSizeWithTag(7, value.getSecondary_cta_callback());
                }
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(8, value.getSecondary_cta_deeplink());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Checklist7 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeader_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeader_title());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getMarkdown_items());
                if (!Intrinsics.areEqual(value.getFooter(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getFooter());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getPrimary_cta());
                }
                if (value.getPrimary_cta_enable_delay_seconds() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPrimary_cta_enable_delay_seconds()));
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getSecondary_cta());
                }
                if (value.getSecondary_cta_callback() != Checklist7.Callback.CALLBACK_UNSPECIFIED) {
                    Checklist7.Callback.ADAPTER.encodeWithTag(writer, 7, (int) value.getSecondary_cta_callback());
                }
                protoAdapter.encodeWithTag(writer, 8, (int) value.getSecondary_cta_deeplink());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Checklist7 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getSecondary_cta_deeplink());
                if (value.getSecondary_cta_callback() != Checklist7.Callback.CALLBACK_UNSPECIFIED) {
                    Checklist7.Callback.ADAPTER.encodeWithTag(writer, 7, (int) value.getSecondary_cta_callback());
                }
                if (!Intrinsics.areEqual(value.getSecondary_cta(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getSecondary_cta());
                }
                if (value.getPrimary_cta_enable_delay_seconds() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getPrimary_cta_enable_delay_seconds()));
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getPrimary_cta());
                }
                if (!Intrinsics.areEqual(value.getFooter(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getFooter());
                }
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getMarkdown_items());
                if (Intrinsics.areEqual(value.getHeader_title(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getHeader_title());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Checklist7 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                Checklist7.Callback callback = Checklist7.Callback.CALLBACK_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                int iIntValue = 0;
                String strDecode3 = null;
                Checklist7.Callback callbackDecode = callback;
                String strDecode4 = strDecode2;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 3:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                try {
                                    callbackDecode = Checklist7.Callback.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 8:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Checklist7(strDecode4, arrayList, strDecode5, strDecode, iIntValue, strDecode2, callbackDecode, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Checklist7 redact(Checklist7 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Checklist7.copy$default(value, null, null, null, null, 0, null, null, null, ByteString.EMPTY, 255, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Checklist.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "DEEPLINK", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.Checklist$ScreenParams$Callback */
    public static final class Callback implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Callback[] $VALUES;
        public static final Callback ACTION;

        @JvmField
        public static final ProtoAdapter<Callback> ADAPTER;
        public static final Callback CALLBACK_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Callback DEEPLINK;
        public static final Callback EXIT;
        private final int value;

        private static final /* synthetic */ Callback[] $values() {
            return new Callback[]{CALLBACK_UNSPECIFIED, EXIT, ACTION, DEEPLINK};
        }

        @JvmStatic
        public static final Callback fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Callback> getEntries() {
            return $ENTRIES;
        }

        private Callback(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Callback callback = new Callback("CALLBACK_UNSPECIFIED", 0, 0);
            CALLBACK_UNSPECIFIED = callback;
            EXIT = new Callback("EXIT", 1, 1);
            ACTION = new Callback("ACTION", 2, 2);
            DEEPLINK = new Callback("DEEPLINK", 3, 3);
            Callback[] callbackArr$values = $values();
            $VALUES = callbackArr$values;
            $ENTRIES = EnumEntries2.enumEntries(callbackArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Callback.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Callback>(orCreateKotlinClass, syntax, callback) { // from class: identi.service.v1.models_workflow.v1.Checklist$ScreenParams$Callback$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Checklist7.Callback fromValue(int value) {
                    return Checklist7.Callback.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Checklist.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/Checklist$ScreenParams$Callback;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: identi.service.v1.models_workflow.v1.Checklist$ScreenParams$Callback$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Callback fromValue(int value) {
                if (value == 0) {
                    return Callback.CALLBACK_UNSPECIFIED;
                }
                if (value == 1) {
                    return Callback.EXIT;
                }
                if (value == 2) {
                    return Callback.ACTION;
                }
                if (value != 3) {
                    return null;
                }
                return Callback.DEEPLINK;
            }
        }

        public static Callback valueOf(String str) {
            return (Callback) Enum.valueOf(Callback.class, str);
        }

        public static Callback[] values() {
            return (Callback[]) $VALUES.clone();
        }
    }
}
