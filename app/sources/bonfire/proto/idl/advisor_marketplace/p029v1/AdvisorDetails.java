package bonfire.proto.idl.advisor_marketplace.p029v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: AdvisorDetails.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016JR\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetails;", "Lcom/squareup/wire/Message;", "", "name", "", "top_value_prop", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValueProp;", "advisor_quick_facts", "", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorQuickFactsRow;", "about_advisor", "Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAbout;", "hobbies", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValueProp;Ljava/util/List;Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAbout;Ljava/util/List;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getTop_value_prop", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorValueProp;", "getAbout_advisor", "()Lbonfire/proto/idl/advisor_marketplace/v1/AdvisorDetailsAbout;", "getAdvisor_quick_facts", "()Ljava/util/List;", "getHobbies", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.advisor_marketplace.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AdvisorDetails extends Message {

    @JvmField
    public static final ProtoAdapter<AdvisorDetails> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetailsAbout#ADAPTER", jsonName = "aboutAdvisor", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AdvisorDetailsAbout about_advisor;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorQuickFactsRow#ADAPTER", jsonName = "advisorQuickFacts", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<AdvisorQuickFactsRow> advisor_quick_facts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> hobbies;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "bonfire.proto.idl.advisor_marketplace.v1.AdvisorValueProp#ADAPTER", jsonName = "topValueProp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final AdvisorValueProp top_value_prop;

    public AdvisorDetails() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8755newBuilder();
    }

    public final String getName() {
        return this.name;
    }

    public /* synthetic */ AdvisorDetails(String str, AdvisorValueProp advisorValueProp, List list, AdvisorDetailsAbout advisorDetailsAbout, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : advisorValueProp, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : advisorDetailsAbout, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AdvisorValueProp getTop_value_prop() {
        return this.top_value_prop;
    }

    public final AdvisorDetailsAbout getAbout_advisor() {
        return this.about_advisor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvisorDetails(String name, AdvisorValueProp advisorValueProp, List<AdvisorQuickFactsRow> advisor_quick_facts, AdvisorDetailsAbout advisorDetailsAbout, List<String> hobbies, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(advisor_quick_facts, "advisor_quick_facts");
        Intrinsics.checkNotNullParameter(hobbies, "hobbies");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.top_value_prop = advisorValueProp;
        this.about_advisor = advisorDetailsAbout;
        this.advisor_quick_facts = Internal.immutableCopyOf("advisor_quick_facts", advisor_quick_facts);
        this.hobbies = Internal.immutableCopyOf("hobbies", hobbies);
    }

    public final List<AdvisorQuickFactsRow> getAdvisor_quick_facts() {
        return this.advisor_quick_facts;
    }

    public final List<String> getHobbies() {
        return this.hobbies;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8755newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AdvisorDetails)) {
            return false;
        }
        AdvisorDetails advisorDetails = (AdvisorDetails) other;
        return Intrinsics.areEqual(unknownFields(), advisorDetails.unknownFields()) && Intrinsics.areEqual(this.name, advisorDetails.name) && Intrinsics.areEqual(this.top_value_prop, advisorDetails.top_value_prop) && Intrinsics.areEqual(this.advisor_quick_facts, advisorDetails.advisor_quick_facts) && Intrinsics.areEqual(this.about_advisor, advisorDetails.about_advisor) && Intrinsics.areEqual(this.hobbies, advisorDetails.hobbies);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37;
        AdvisorValueProp advisorValueProp = this.top_value_prop;
        int iHashCode2 = (((iHashCode + (advisorValueProp != null ? advisorValueProp.hashCode() : 0)) * 37) + this.advisor_quick_facts.hashCode()) * 37;
        AdvisorDetailsAbout advisorDetailsAbout = this.about_advisor;
        int iHashCode3 = ((iHashCode2 + (advisorDetailsAbout != null ? advisorDetailsAbout.hashCode() : 0)) * 37) + this.hobbies.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        AdvisorValueProp advisorValueProp = this.top_value_prop;
        if (advisorValueProp != null) {
            arrayList.add("top_value_prop=" + advisorValueProp);
        }
        if (!this.advisor_quick_facts.isEmpty()) {
            arrayList.add("advisor_quick_facts=" + this.advisor_quick_facts);
        }
        AdvisorDetailsAbout advisorDetailsAbout = this.about_advisor;
        if (advisorDetailsAbout != null) {
            arrayList.add("about_advisor=" + advisorDetailsAbout);
        }
        if (!this.hobbies.isEmpty()) {
            arrayList.add("hobbies=" + Internal.sanitize(this.hobbies));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AdvisorDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AdvisorDetails copy$default(AdvisorDetails advisorDetails, String str, AdvisorValueProp advisorValueProp, List list, AdvisorDetailsAbout advisorDetailsAbout, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advisorDetails.name;
        }
        if ((i & 2) != 0) {
            advisorValueProp = advisorDetails.top_value_prop;
        }
        if ((i & 4) != 0) {
            list = advisorDetails.advisor_quick_facts;
        }
        if ((i & 8) != 0) {
            advisorDetailsAbout = advisorDetails.about_advisor;
        }
        if ((i & 16) != 0) {
            list2 = advisorDetails.hobbies;
        }
        if ((i & 32) != 0) {
            byteString = advisorDetails.unknownFields();
        }
        List list3 = list2;
        ByteString byteString2 = byteString;
        return advisorDetails.copy(str, advisorValueProp, list, advisorDetailsAbout, list3, byteString2);
    }

    public final AdvisorDetails copy(String name, AdvisorValueProp top_value_prop, List<AdvisorQuickFactsRow> advisor_quick_facts, AdvisorDetailsAbout about_advisor, List<String> hobbies, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(advisor_quick_facts, "advisor_quick_facts");
        Intrinsics.checkNotNullParameter(hobbies, "hobbies");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AdvisorDetails(name, top_value_prop, advisor_quick_facts, about_advisor, hobbies, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AdvisorDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AdvisorDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.advisor_marketplace.v1.AdvisorDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AdvisorDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (value.getTop_value_prop() != null) {
                    size += AdvisorValueProp.ADAPTER.encodedSizeWithTag(2, value.getTop_value_prop());
                }
                int iEncodedSizeWithTag = size + AdvisorQuickFactsRow.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAdvisor_quick_facts());
                if (value.getAbout_advisor() != null) {
                    iEncodedSizeWithTag += AdvisorDetailsAbout.ADAPTER.encodedSizeWithTag(4, value.getAbout_advisor());
                }
                return iEncodedSizeWithTag + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.getHobbies());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AdvisorDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (value.getTop_value_prop() != null) {
                    AdvisorValueProp.ADAPTER.encodeWithTag(writer, 2, (int) value.getTop_value_prop());
                }
                AdvisorQuickFactsRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAdvisor_quick_facts());
                if (value.getAbout_advisor() != null) {
                    AdvisorDetailsAbout.ADAPTER.encodeWithTag(writer, 4, (int) value.getAbout_advisor());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, (int) value.getHobbies());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AdvisorDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getHobbies());
                if (value.getAbout_advisor() != null) {
                    AdvisorDetailsAbout.ADAPTER.encodeWithTag(writer, 4, (int) value.getAbout_advisor());
                }
                AdvisorQuickFactsRow.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAdvisor_quick_facts());
                if (value.getTop_value_prop() != null) {
                    AdvisorValueProp.ADAPTER.encodeWithTag(writer, 2, (int) value.getTop_value_prop());
                }
                if (Intrinsics.areEqual(value.getName(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getName());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AdvisorValueProp advisorValuePropDecode = null;
                AdvisorDetailsAbout advisorDetailsAboutDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AdvisorDetails(strDecode, advisorValuePropDecode, arrayList, advisorDetailsAboutDecode, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        advisorValuePropDecode = AdvisorValueProp.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(AdvisorQuickFactsRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        advisorDetailsAboutDecode = AdvisorDetailsAbout.ADAPTER.decode(reader);
                    } else if (iNextTag == 5) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AdvisorDetails redact(AdvisorDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AdvisorValueProp top_value_prop = value.getTop_value_prop();
                AdvisorValueProp advisorValuePropRedact = top_value_prop != null ? AdvisorValueProp.ADAPTER.redact(top_value_prop) : null;
                List listM26823redactElements = Internal.m26823redactElements(value.getAdvisor_quick_facts(), AdvisorQuickFactsRow.ADAPTER);
                AdvisorDetailsAbout about_advisor = value.getAbout_advisor();
                return AdvisorDetails.copy$default(value, null, advisorValuePropRedact, listM26823redactElements, about_advisor != null ? AdvisorDetailsAbout.ADAPTER.redact(about_advisor) : null, null, ByteString.EMPTY, 17, null);
            }
        };
    }
}
