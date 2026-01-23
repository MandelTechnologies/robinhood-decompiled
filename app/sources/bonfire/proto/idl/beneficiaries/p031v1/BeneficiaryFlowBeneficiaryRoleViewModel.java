package bonfire.proto.idl.beneficiaries.p031v1;

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
import rh_server_driven_ui.p531v1.UIComponent;

/* compiled from: BeneficiaryFlowBeneficiaryRoleViewModel.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "Lcom/squareup/wire/Message;", "", "title", "", "cards", "", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleCard;", "footer_components", "Lrh_server_driven_ui/v1/UIComponent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getCards", "()Ljava/util/List;", "getFooter_components", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.beneficiaries.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BeneficiaryFlowBeneficiaryRoleViewModel extends Message {

    @JvmField
    public static final ProtoAdapter<BeneficiaryFlowBeneficiaryRoleViewModel> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleCard#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<BeneficiaryFlowBeneficiaryRoleCard> cards;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", jsonName = "footerComponents", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<UIComponent> footer_components;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public BeneficiaryFlowBeneficiaryRoleViewModel() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8802newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ BeneficiaryFlowBeneficiaryRoleViewModel(String str, List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryFlowBeneficiaryRoleViewModel(String title, List<BeneficiaryFlowBeneficiaryRoleCard> cards, List<UIComponent> footer_components, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(footer_components, "footer_components");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.cards = Internal.immutableCopyOf("cards", cards);
        this.footer_components = Internal.immutableCopyOf("footer_components", footer_components);
    }

    public final List<BeneficiaryFlowBeneficiaryRoleCard> getCards() {
        return this.cards;
    }

    public final List<UIComponent> getFooter_components() {
        return this.footer_components;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8802newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BeneficiaryFlowBeneficiaryRoleViewModel)) {
            return false;
        }
        BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel = (BeneficiaryFlowBeneficiaryRoleViewModel) other;
        return Intrinsics.areEqual(unknownFields(), beneficiaryFlowBeneficiaryRoleViewModel.unknownFields()) && Intrinsics.areEqual(this.title, beneficiaryFlowBeneficiaryRoleViewModel.title) && Intrinsics.areEqual(this.cards, beneficiaryFlowBeneficiaryRoleViewModel.cards) && Intrinsics.areEqual(this.footer_components, beneficiaryFlowBeneficiaryRoleViewModel.footer_components);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.cards.hashCode()) * 37) + this.footer_components.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        if (!this.cards.isEmpty()) {
            arrayList.add("cards=" + this.cards);
        }
        if (!this.footer_components.isEmpty()) {
            arrayList.add("footer_components=" + this.footer_components);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BeneficiaryFlowBeneficiaryRoleViewModel{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeneficiaryFlowBeneficiaryRoleViewModel copy$default(BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, String str, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beneficiaryFlowBeneficiaryRoleViewModel.title;
        }
        if ((i & 2) != 0) {
            list = beneficiaryFlowBeneficiaryRoleViewModel.cards;
        }
        if ((i & 4) != 0) {
            list2 = beneficiaryFlowBeneficiaryRoleViewModel.footer_components;
        }
        if ((i & 8) != 0) {
            byteString = beneficiaryFlowBeneficiaryRoleViewModel.unknownFields();
        }
        return beneficiaryFlowBeneficiaryRoleViewModel.copy(str, list, list2, byteString);
    }

    public final BeneficiaryFlowBeneficiaryRoleViewModel copy(String title, List<BeneficiaryFlowBeneficiaryRoleCard> cards, List<UIComponent> footer_components, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(footer_components, "footer_components");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BeneficiaryFlowBeneficiaryRoleViewModel(title, cards, footer_components, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BeneficiaryFlowBeneficiaryRoleViewModel.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BeneficiaryFlowBeneficiaryRoleViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.beneficiaries.v1.BeneficiaryFlowBeneficiaryRoleViewModel$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BeneficiaryFlowBeneficiaryRoleViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                return size + BeneficiaryFlowBeneficiaryRoleCard.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getCards()) + UIComponent.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getFooter_components());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BeneficiaryFlowBeneficiaryRoleViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                BeneficiaryFlowBeneficiaryRoleCard.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCards());
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getFooter_components());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BeneficiaryFlowBeneficiaryRoleViewModel value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                UIComponent.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getFooter_components());
                BeneficiaryFlowBeneficiaryRoleCard.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getCards());
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowBeneficiaryRoleViewModel decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BeneficiaryFlowBeneficiaryRoleViewModel(strDecode, arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(BeneficiaryFlowBeneficiaryRoleCard.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(UIComponent.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BeneficiaryFlowBeneficiaryRoleViewModel redact(BeneficiaryFlowBeneficiaryRoleViewModel value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return BeneficiaryFlowBeneficiaryRoleViewModel.copy$default(value, null, Internal.m26823redactElements(value.getCards(), BeneficiaryFlowBeneficiaryRoleCard.ADAPTER), Internal.m26823redactElements(value.getFooter_components(), UIComponent.ADAPTER), ByteString.EMPTY, 1, null);
            }
        };
    }
}
