package bonfire.proto.idl.accounts.p028v1;

import com.robinhood.android.car.result.CarResultComposable2;
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
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.PogWithPictogram;

/* compiled from: AccountEligibilityWarning.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarning;", "Lcom/squareup/wire/Message;", "", "title", "", "subtitle", CarResultComposable2.BUTTONS, "", "Lrh_server_driven_ui/v1/Button;", "pog_with_pictogram", "Lrh_server_driven_ui/v1/PogWithPictogram;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lrh_server_driven_ui/v1/PogWithPictogram;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPog_with_pictogram", "()Lrh_server_driven_ui/v1/PogWithPictogram;", "getButtons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class AccountEligibilityWarning extends Message {

    @JvmField
    public static final ProtoAdapter<AccountEligibilityWarning> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Button> buttons;

    @WireField(adapter = "rh_server_driven_ui.v1.PogWithPictogram#ADAPTER", jsonName = "pogWithPictogram", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final PogWithPictogram pog_with_pictogram;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public AccountEligibilityWarning() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ AccountEligibilityWarning(String str, String str2, List list, PogWithPictogram pogWithPictogram, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : pogWithPictogram, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8709newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final PogWithPictogram getPog_with_pictogram() {
        return this.pog_with_pictogram;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountEligibilityWarning(String title, String subtitle, List<Button> buttons, PogWithPictogram pogWithPictogram, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.pog_with_pictogram = pogWithPictogram;
        this.buttons = Internal.immutableCopyOf(CarResultComposable2.BUTTONS, buttons);
    }

    public final List<Button> getButtons() {
        return this.buttons;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8709newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AccountEligibilityWarning)) {
            return false;
        }
        AccountEligibilityWarning accountEligibilityWarning = (AccountEligibilityWarning) other;
        return Intrinsics.areEqual(unknownFields(), accountEligibilityWarning.unknownFields()) && Intrinsics.areEqual(this.title, accountEligibilityWarning.title) && Intrinsics.areEqual(this.subtitle, accountEligibilityWarning.subtitle) && Intrinsics.areEqual(this.buttons, accountEligibilityWarning.buttons) && Intrinsics.areEqual(this.pog_with_pictogram, accountEligibilityWarning.pog_with_pictogram);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.buttons.hashCode()) * 37;
        PogWithPictogram pogWithPictogram = this.pog_with_pictogram;
        int iHashCode2 = iHashCode + (pogWithPictogram != null ? pogWithPictogram.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.buttons.isEmpty()) {
            arrayList.add("buttons=" + this.buttons);
        }
        PogWithPictogram pogWithPictogram = this.pog_with_pictogram;
        if (pogWithPictogram != null) {
            arrayList.add("pog_with_pictogram=" + pogWithPictogram);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AccountEligibilityWarning{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AccountEligibilityWarning copy$default(AccountEligibilityWarning accountEligibilityWarning, String str, String str2, List list, PogWithPictogram pogWithPictogram, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountEligibilityWarning.title;
        }
        if ((i & 2) != 0) {
            str2 = accountEligibilityWarning.subtitle;
        }
        if ((i & 4) != 0) {
            list = accountEligibilityWarning.buttons;
        }
        if ((i & 8) != 0) {
            pogWithPictogram = accountEligibilityWarning.pog_with_pictogram;
        }
        if ((i & 16) != 0) {
            byteString = accountEligibilityWarning.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return accountEligibilityWarning.copy(str, str2, list2, pogWithPictogram, byteString2);
    }

    public final AccountEligibilityWarning copy(String title, String subtitle, List<Button> buttons, PogWithPictogram pog_with_pictogram, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AccountEligibilityWarning(title, subtitle, buttons, pog_with_pictogram, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountEligibilityWarning.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AccountEligibilityWarning>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.AccountEligibilityWarning$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AccountEligibilityWarning value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSubtitle());
                }
                int iEncodedSizeWithTag = size + Button.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getButtons());
                return value.getPog_with_pictogram() != null ? iEncodedSizeWithTag + PogWithPictogram.ADAPTER.encodedSizeWithTag(4, value.getPog_with_pictogram()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AccountEligibilityWarning value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getButtons());
                if (value.getPog_with_pictogram() != null) {
                    PogWithPictogram.ADAPTER.encodeWithTag(writer, 4, (int) value.getPog_with_pictogram());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AccountEligibilityWarning value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPog_with_pictogram() != null) {
                    PogWithPictogram.ADAPTER.encodeWithTag(writer, 4, (int) value.getPog_with_pictogram());
                }
                Button.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getButtons());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSubtitle());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AccountEligibilityWarning decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                PogWithPictogram pogWithPictogramDecode = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new AccountEligibilityWarning(strDecode, strDecode2, arrayList, pogWithPictogramDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(Button.ADAPTER.decode(reader));
                    } else if (iNextTag == 4) {
                        pogWithPictogramDecode = PogWithPictogram.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AccountEligibilityWarning redact(AccountEligibilityWarning value) {
                Intrinsics.checkNotNullParameter(value, "value");
                List listM26823redactElements = Internal.m26823redactElements(value.getButtons(), Button.ADAPTER);
                PogWithPictogram pog_with_pictogram = value.getPog_with_pictogram();
                return AccountEligibilityWarning.copy$default(value, null, null, listM26823redactElements, pog_with_pictogram != null ? PogWithPictogram.ADAPTER.redact(pog_with_pictogram) : null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
