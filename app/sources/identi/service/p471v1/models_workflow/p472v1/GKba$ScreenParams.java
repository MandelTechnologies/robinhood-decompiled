package identi.service.p471v1.models_workflow.p472v1;

import com.plaid.internal.EnumC7081g;
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
import identi.service.p471v1.models_workflow.p472v1.GKba$ScreenParams;
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

/* compiled from: GKba.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003123Bo\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJu\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b&\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b*\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKba$ScreenParams", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;", "", "", "heading", "subheading", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "secondary_cta_callback", "close_button_callback", "", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field;", "fields", "", "requires_recaptcha", "Lokio/ByteString;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;Ljava/util/List;Ljava/lang/Boolean;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;Ljava/util/List;Ljava/lang/Boolean;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams;", "Ljava/lang/String;", "getHeading", "getSubheading", "getPrimary_cta", "getSecondary_cta", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "getSecondary_cta_callback", "()Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "getClose_button_callback", "Ljava/lang/Boolean;", "getRequires_recaptcha", "()Ljava/lang/Boolean;", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Companion", "Field", "Callback", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GKba$ScreenParams extends Message {

    @JvmField
    public static final ProtoAdapter<GKba$ScreenParams> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$ScreenParams$Callback#ADAPTER", jsonName = "closeButtonCallback", schemaIndex = 5, tag = 6)
    private final Callback close_button_callback;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$ScreenParams$Field#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<Field> fields;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String heading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryCta", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String primary_cta;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "requiresRecaptcha", schemaIndex = 7, tag = 8)
    private final Boolean requires_recaptcha;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryCta", schemaIndex = 3, tag = 4)
    private final String secondary_cta;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$ScreenParams$Callback#ADAPTER", jsonName = "secondaryCtaCallback", schemaIndex = 4, tag = 5)
    private final Callback secondary_cta_callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subheading;

    public GKba$ScreenParams() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ GKba$ScreenParams(String str, String str2, String str3, String str4, Callback callback, Callback callback2, List list, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : callback, (i & 32) != 0 ? null : callback2, (i & 64) != 0 ? CollectionsKt.emptyList() : list, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28331newBuilder();
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public final String getPrimary_cta() {
        return this.primary_cta;
    }

    public final String getSecondary_cta() {
        return this.secondary_cta;
    }

    public final Callback getSecondary_cta_callback() {
        return this.secondary_cta_callback;
    }

    public final Callback getClose_button_callback() {
        return this.close_button_callback;
    }

    public final Boolean getRequires_recaptcha() {
        return this.requires_recaptcha;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GKba$ScreenParams(String heading, String subheading, String primary_cta, String str, Callback callback, Callback callback2, List<Field> fields, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.heading = heading;
        this.subheading = subheading;
        this.primary_cta = primary_cta;
        this.secondary_cta = str;
        this.secondary_cta_callback = callback;
        this.close_button_callback = callback2;
        this.requires_recaptcha = bool;
        this.fields = Internal.immutableCopyOf("fields", fields);
    }

    public final List<Field> getFields() {
        return this.fields;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28331newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GKba$ScreenParams)) {
            return false;
        }
        GKba$ScreenParams gKba$ScreenParams = (GKba$ScreenParams) other;
        return Intrinsics.areEqual(unknownFields(), gKba$ScreenParams.unknownFields()) && Intrinsics.areEqual(this.heading, gKba$ScreenParams.heading) && Intrinsics.areEqual(this.subheading, gKba$ScreenParams.subheading) && Intrinsics.areEqual(this.primary_cta, gKba$ScreenParams.primary_cta) && Intrinsics.areEqual(this.secondary_cta, gKba$ScreenParams.secondary_cta) && this.secondary_cta_callback == gKba$ScreenParams.secondary_cta_callback && this.close_button_callback == gKba$ScreenParams.close_button_callback && Intrinsics.areEqual(this.fields, gKba$ScreenParams.fields) && Intrinsics.areEqual(this.requires_recaptcha, gKba$ScreenParams.requires_recaptcha);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.heading.hashCode()) * 37) + this.subheading.hashCode()) * 37) + this.primary_cta.hashCode()) * 37;
        String str = this.secondary_cta;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Callback callback = this.secondary_cta_callback;
        int iHashCode3 = (iHashCode2 + (callback != null ? callback.hashCode() : 0)) * 37;
        Callback callback2 = this.close_button_callback;
        int iHashCode4 = (((iHashCode3 + (callback2 != null ? callback2.hashCode() : 0)) * 37) + this.fields.hashCode()) * 37;
        Boolean bool = this.requires_recaptcha;
        int iHashCode5 = iHashCode4 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("heading=" + Internal.sanitize(this.heading));
        arrayList.add("subheading=" + Internal.sanitize(this.subheading));
        arrayList.add("primary_cta=" + Internal.sanitize(this.primary_cta));
        String str = this.secondary_cta;
        if (str != null) {
            arrayList.add("secondary_cta=" + Internal.sanitize(str));
        }
        Callback callback = this.secondary_cta_callback;
        if (callback != null) {
            arrayList.add("secondary_cta_callback=" + callback);
        }
        Callback callback2 = this.close_button_callback;
        if (callback2 != null) {
            arrayList.add("close_button_callback=" + callback2);
        }
        if (!this.fields.isEmpty()) {
            arrayList.add("fields=" + this.fields);
        }
        Boolean bool = this.requires_recaptcha;
        if (bool != null) {
            arrayList.add("requires_recaptcha=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScreenParams{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GKba$ScreenParams copy$default(GKba$ScreenParams gKba$ScreenParams, String str, String str2, String str3, String str4, Callback callback, Callback callback2, List list, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gKba$ScreenParams.heading;
        }
        if ((i & 2) != 0) {
            str2 = gKba$ScreenParams.subheading;
        }
        if ((i & 4) != 0) {
            str3 = gKba$ScreenParams.primary_cta;
        }
        if ((i & 8) != 0) {
            str4 = gKba$ScreenParams.secondary_cta;
        }
        if ((i & 16) != 0) {
            callback = gKba$ScreenParams.secondary_cta_callback;
        }
        if ((i & 32) != 0) {
            callback2 = gKba$ScreenParams.close_button_callback;
        }
        if ((i & 64) != 0) {
            list = gKba$ScreenParams.fields;
        }
        if ((i & 128) != 0) {
            bool = gKba$ScreenParams.requires_recaptcha;
        }
        if ((i & 256) != 0) {
            byteString = gKba$ScreenParams.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        Callback callback3 = callback2;
        List list2 = list;
        Callback callback4 = callback;
        String str5 = str3;
        return gKba$ScreenParams.copy(str, str2, str5, str4, callback4, callback3, list2, bool2, byteString2);
    }

    public final GKba$ScreenParams copy(String heading, String subheading, String primary_cta, String secondary_cta, Callback secondary_cta_callback, Callback close_button_callback, List<Field> fields, Boolean requires_recaptcha, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(subheading, "subheading");
        Intrinsics.checkNotNullParameter(primary_cta, "primary_cta");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GKba$ScreenParams(heading, subheading, primary_cta, secondary_cta, secondary_cta_callback, close_button_callback, fields, requires_recaptcha, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GKba$ScreenParams.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GKba$ScreenParams>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.GKba$ScreenParams$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GKba$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHeading());
                }
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubheading());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrimary_cta());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSecondary_cta());
                ProtoAdapter<GKba$ScreenParams.Callback> protoAdapter = GKba$ScreenParams.Callback.ADAPTER;
                return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, value.getSecondary_cta_callback()) + protoAdapter.encodedSizeWithTag(6, value.getClose_button_callback()) + GKba$ScreenParams.Field.ADAPTER.asRepeated().encodedSizeWithTag(7, value.getFields()) + ProtoAdapter.BOOL.encodedSizeWithTag(8, value.getRequires_recaptcha());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GKba$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getHeading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHeading());
                }
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubheading());
                }
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSecondary_cta());
                ProtoAdapter<GKba$ScreenParams.Callback> protoAdapter = GKba$ScreenParams.Callback.ADAPTER;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSecondary_cta_callback());
                protoAdapter.encodeWithTag(writer, 6, (int) value.getClose_button_callback());
                GKba$ScreenParams.Field.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getRequires_recaptcha());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GKba$ScreenParams value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) value.getRequires_recaptcha());
                GKba$ScreenParams.Field.ADAPTER.asRepeated().encodeWithTag(writer, 7, (int) value.getFields());
                ProtoAdapter<GKba$ScreenParams.Callback> protoAdapter = GKba$ScreenParams.Callback.ADAPTER;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getClose_button_callback());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getSecondary_cta_callback());
                ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 4, (int) value.getSecondary_cta());
                if (!Intrinsics.areEqual(value.getPrimary_cta(), "")) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getPrimary_cta());
                }
                if (!Intrinsics.areEqual(value.getSubheading(), "")) {
                    protoAdapter2.encodeWithTag(writer, 2, (int) value.getSubheading());
                }
                if (Intrinsics.areEqual(value.getHeading(), "")) {
                    return;
                }
                protoAdapter2.encodeWithTag(writer, 1, (int) value.getHeading());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GKba$ScreenParams decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = null;
                GKba$ScreenParams.Callback callbackDecode = null;
                GKba$ScreenParams.Callback callbackDecode2 = null;
                Boolean boolDecode = null;
                String strDecode4 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                try {
                                    callbackDecode = GKba$ScreenParams.Callback.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 6:
                                try {
                                    callbackDecode2 = GKba$ScreenParams.Callback.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 7:
                                arrayList.add(GKba$ScreenParams.Field.ADAPTER.decode(reader));
                                break;
                            case 8:
                                boolDecode = ProtoAdapter.BOOL.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GKba$ScreenParams(strDecode4, strDecode, strDecode2, strDecode3, callbackDecode, callbackDecode2, arrayList, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GKba$ScreenParams redact(GKba$ScreenParams value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GKba$ScreenParams.copy$default(value, null, null, null, null, null, null, Internal.m26823redactElements(value.getFields(), GKba$ScreenParams.Field.ADAPTER), null, ByteString.EMPTY, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
            }
        };
    }

    /* compiled from: GKba.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015¨\u0006 "}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field;", "Lcom/squareup/wire/Message;", "", "type", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "name", "", "placeholder", "id", "is_optional", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getType", "()Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "getName", "()Ljava/lang/String;", "getPlaceholder", "getId", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Type", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Field extends Message {

        @JvmField
        public static final ProtoAdapter<Field> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isOptional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final boolean is_optional;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        private final String placeholder;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$ScreenParams$Field$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Type type;

        public Field() {
            this(null, null, null, null, false, null, 63, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28332newBuilder();
        }

        public final Type getType() {
            return this.type;
        }

        public /* synthetic */ Field(Type type2, String str, String str2, String str3, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Type.TYPE_UNSPECIFIED : type2, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getName() {
            return this.name;
        }

        public final String getPlaceholder() {
            return this.placeholder;
        }

        public final String getId() {
            return this.id;
        }

        /* renamed from: is_optional, reason: from getter */
        public final boolean getIs_optional() {
            return this.is_optional;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(Type type2, String name, String str, String id, boolean z, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.type = type2;
            this.name = name;
            this.placeholder = str;
            this.id = id;
            this.is_optional = z;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28332newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return Intrinsics.areEqual(unknownFields(), field.unknownFields()) && this.type == field.type && Intrinsics.areEqual(this.name, field.name) && Intrinsics.areEqual(this.placeholder, field.placeholder) && Intrinsics.areEqual(this.id, field.id) && this.is_optional == field.is_optional;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.type.hashCode()) * 37) + this.name.hashCode()) * 37;
            String str = this.placeholder;
            int iHashCode2 = ((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.id.hashCode()) * 37) + Boolean.hashCode(this.is_optional);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("type=" + this.type);
            arrayList.add("name=" + Internal.sanitize(this.name));
            String str = this.placeholder;
            if (str != null) {
                arrayList.add("placeholder=" + Internal.sanitize(str));
            }
            arrayList.add("id=" + Internal.sanitize(this.id));
            arrayList.add("is_optional=" + this.is_optional);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Field{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Field copy$default(Field field, Type type2, String str, String str2, String str3, boolean z, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = field.type;
            }
            if ((i & 2) != 0) {
                str = field.name;
            }
            if ((i & 4) != 0) {
                str2 = field.placeholder;
            }
            if ((i & 8) != 0) {
                str3 = field.id;
            }
            if ((i & 16) != 0) {
                z = field.is_optional;
            }
            if ((i & 32) != 0) {
                byteString = field.unknownFields();
            }
            boolean z2 = z;
            ByteString byteString2 = byteString;
            return field.copy(type2, str, str2, str3, z2, byteString2);
        }

        public final Field copy(Type type2, String name, String placeholder, String id, boolean is_optional, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Field(type2, name, placeholder, id, is_optional, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Field.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Field>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.GKba$ScreenParams$Field$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GKba$ScreenParams.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getType() != GKba$ScreenParams.Field.Type.TYPE_UNSPECIFIED) {
                        size += GKba$ScreenParams.Field.Type.ADAPTER.encodedSizeWithTag(1, value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getName());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(3, value.getPlaceholder());
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getId());
                    }
                    return value.getIs_optional() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(5, Boolean.valueOf(value.getIs_optional())) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GKba$ScreenParams.Field value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getType() != GKba$ScreenParams.Field.Type.TYPE_UNSPECIFIED) {
                        GKba$ScreenParams.Field.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getName());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPlaceholder());
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        protoAdapter.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    if (value.getIs_optional()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_optional()));
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GKba$ScreenParams.Field value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getIs_optional()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 5, (int) Boolean.valueOf(value.getIs_optional()));
                    }
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getId());
                    }
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPlaceholder());
                    if (!Intrinsics.areEqual(value.getName(), "")) {
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getName());
                    }
                    if (value.getType() != GKba$ScreenParams.Field.Type.TYPE_UNSPECIFIED) {
                        GKba$ScreenParams.Field.Type.ADAPTER.encodeWithTag(writer, 1, (int) value.getType());
                    }
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GKba$ScreenParams.Field decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    GKba$ScreenParams.Field.Type typeDecode = GKba$ScreenParams.Field.Type.TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    boolean zBooleanValue = false;
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        GKba$ScreenParams.Field.Type type2 = typeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GKba$ScreenParams.Field(type2, strDecode2, strDecode, strDecode3, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                try {
                                    typeDecode = GKba$ScreenParams.Field.Type.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 4) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 5) {
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GKba$ScreenParams.Field redact(GKba$ScreenParams.Field value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GKba$ScreenParams.Field.copy$default(value, null, null, null, null, false, ByteString.EMPTY, 31, null);
                }
            };
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GKba.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "PLAIN_TEXT", "DATE", "SSN", "PHONE_NUMBER", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Type implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @JvmField
            public static final ProtoAdapter<Type> ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final Type DATE;
            public static final Type PHONE_NUMBER;
            public static final Type PLAIN_TEXT;
            public static final Type SSN;
            public static final Type TYPE_UNSPECIFIED;
            private final int value;

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{TYPE_UNSPECIFIED, PLAIN_TEXT, DATE, SSN, PHONE_NUMBER};
            }

            @JvmStatic
            public static final Type fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i, int i2) {
                this.value = i2;
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            static {
                final Type type2 = new Type("TYPE_UNSPECIFIED", 0, 0);
                TYPE_UNSPECIFIED = type2;
                PLAIN_TEXT = new Type("PLAIN_TEXT", 1, 1);
                DATE = new Type("DATE", 2, 2);
                SSN = new Type("SSN", 3, 3);
                PHONE_NUMBER = new Type("PHONE_NUMBER", 4, 4);
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: identi.service.v1.models_workflow.v1.GKba$ScreenParams$Field$Type$Companion$ADAPTER$1
                    /* JADX INFO: Access modifiers changed from: protected */
                    @Override // com.squareup.wire.EnumAdapter
                    public GKba$ScreenParams.Field.Type fromValue(int value) {
                        return GKba$ScreenParams.Field.Type.INSTANCE.fromValue(value);
                    }
                };
            }

            /* compiled from: GKba.kt */
            @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Field$Type;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @JvmStatic
                public final Type fromValue(int value) {
                    if (value == 0) {
                        return Type.TYPE_UNSPECIFIED;
                    }
                    if (value == 1) {
                        return Type.PLAIN_TEXT;
                    }
                    if (value == 2) {
                        return Type.DATE;
                    }
                    if (value == 3) {
                        return Type.SSN;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return Type.PHONE_NUMBER;
                }
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GKba.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Callback implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Callback[] $VALUES;
        public static final Callback ACTION;

        @JvmField
        public static final ProtoAdapter<Callback> ADAPTER;
        public static final Callback CALLBACK_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Callback EXIT;
        private final int value;

        private static final /* synthetic */ Callback[] $values() {
            return new Callback[]{CALLBACK_UNSPECIFIED, EXIT, ACTION};
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
            Callback[] callbackArr$values = $values();
            $VALUES = callbackArr$values;
            $ENTRIES = EnumEntries2.enumEntries(callbackArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Callback.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Callback>(orCreateKotlinClass, syntax, callback) { // from class: identi.service.v1.models_workflow.v1.GKba$ScreenParams$Callback$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public GKba$ScreenParams.Callback fromValue(int value) {
                    return GKba$ScreenParams.Callback.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: GKba.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/GKba$ScreenParams$Callback;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                if (value != 2) {
                    return null;
                }
                return Callback.ACTION;
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
