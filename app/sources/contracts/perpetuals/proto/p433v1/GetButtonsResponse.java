package contracts.perpetuals.proto.p433v1;

import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositManualSetupComposable;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import contracts.perpetuals.proto.p433v1.GetButtonsResponse;
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

/* compiled from: GetButtonsResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003 !\"B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0006H\u0016J<\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponse;", "Lcom/squareup/wire/Message;", "", "source_screen", "Lcontracts/perpetuals/proto/v1/SourceScreen;", "perpetual_contract_id", "", "button_bar", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ButtonBar;", "expandable_buttons", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ExpandableButtons;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcontracts/perpetuals/proto/v1/SourceScreen;Ljava/lang/String;Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ButtonBar;Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ExpandableButtons;Lokio/ByteString;)V", "getSource_screen", "()Lcontracts/perpetuals/proto/v1/SourceScreen;", "getPerpetual_contract_id", "()Ljava/lang/String;", "getButton_bar", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ButtonBar;", "getExpandable_buttons", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ExpandableButtons;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ButtonBar", "ExpandableButtons", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetButtonsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetButtonsResponse> ADAPTER;

    @WireField(adapter = "contracts.perpetuals.proto.v1.GetButtonsResponse$ButtonBar#ADAPTER", jsonName = DirectDepositManualSetupComposable.BUTTON_BAR_TAG, oneofName = "display_type", schemaIndex = 2, tag = 3)
    private final ButtonBar button_bar;

    @WireField(adapter = "contracts.perpetuals.proto.v1.GetButtonsResponse$ExpandableButtons#ADAPTER", jsonName = "expandableButtons", oneofName = "display_type", schemaIndex = 3, tag = 4)
    private final ExpandableButtons expandable_buttons;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "perpetualContractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String perpetual_contract_id;

    @WireField(adapter = "contracts.perpetuals.proto.v1.SourceScreen#ADAPTER", jsonName = "sourceScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SourceScreen source_screen;

    public GetButtonsResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27771newBuilder();
    }

    public final SourceScreen getSource_screen() {
        return this.source_screen;
    }

    public /* synthetic */ GetButtonsResponse(SourceScreen sourceScreen, String str, ButtonBar buttonBar, ExpandableButtons expandableButtons, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SourceScreen.SOURCE_SCREEN_UNSPECIFIED : sourceScreen, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : buttonBar, (i & 8) != 0 ? null : expandableButtons, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getPerpetual_contract_id() {
        return this.perpetual_contract_id;
    }

    public final ButtonBar getButton_bar() {
        return this.button_bar;
    }

    public final ExpandableButtons getExpandable_buttons() {
        return this.expandable_buttons;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetButtonsResponse(SourceScreen source_screen, String perpetual_contract_id, ButtonBar buttonBar, ExpandableButtons expandableButtons, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source_screen = source_screen;
        this.perpetual_contract_id = perpetual_contract_id;
        this.button_bar = buttonBar;
        this.expandable_buttons = expandableButtons;
        if (Internal.countNonNull(buttonBar, expandableButtons) > 1) {
            throw new IllegalArgumentException("At most one of button_bar, expandable_buttons may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27771newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetButtonsResponse)) {
            return false;
        }
        GetButtonsResponse getButtonsResponse = (GetButtonsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getButtonsResponse.unknownFields()) && this.source_screen == getButtonsResponse.source_screen && Intrinsics.areEqual(this.perpetual_contract_id, getButtonsResponse.perpetual_contract_id) && Intrinsics.areEqual(this.button_bar, getButtonsResponse.button_bar) && Intrinsics.areEqual(this.expandable_buttons, getButtonsResponse.expandable_buttons);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.source_screen.hashCode()) * 37) + this.perpetual_contract_id.hashCode()) * 37;
        ButtonBar buttonBar = this.button_bar;
        int iHashCode2 = (iHashCode + (buttonBar != null ? buttonBar.hashCode() : 0)) * 37;
        ExpandableButtons expandableButtons = this.expandable_buttons;
        int iHashCode3 = iHashCode2 + (expandableButtons != null ? expandableButtons.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source_screen=" + this.source_screen);
        arrayList.add("perpetual_contract_id=" + Internal.sanitize(this.perpetual_contract_id));
        ButtonBar buttonBar = this.button_bar;
        if (buttonBar != null) {
            arrayList.add("button_bar=" + buttonBar);
        }
        ExpandableButtons expandableButtons = this.expandable_buttons;
        if (expandableButtons != null) {
            arrayList.add("expandable_buttons=" + expandableButtons);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetButtonsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetButtonsResponse copy$default(GetButtonsResponse getButtonsResponse, SourceScreen sourceScreen, String str, ButtonBar buttonBar, ExpandableButtons expandableButtons, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceScreen = getButtonsResponse.source_screen;
        }
        if ((i & 2) != 0) {
            str = getButtonsResponse.perpetual_contract_id;
        }
        if ((i & 4) != 0) {
            buttonBar = getButtonsResponse.button_bar;
        }
        if ((i & 8) != 0) {
            expandableButtons = getButtonsResponse.expandable_buttons;
        }
        if ((i & 16) != 0) {
            byteString = getButtonsResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        ButtonBar buttonBar2 = buttonBar;
        return getButtonsResponse.copy(sourceScreen, str, buttonBar2, expandableButtons, byteString2);
    }

    public final GetButtonsResponse copy(SourceScreen source_screen, String perpetual_contract_id, ButtonBar button_bar, ExpandableButtons expandable_buttons, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetButtonsResponse(source_screen, perpetual_contract_id, button_bar, expandable_buttons, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetButtonsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetButtonsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.perpetuals.proto.v1.GetButtonsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetButtonsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getSource_screen() != SourceScreen.SOURCE_SCREEN_UNSPECIFIED) {
                    size += SourceScreen.ADAPTER.encodedSizeWithTag(1, value.getSource_screen());
                }
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPerpetual_contract_id());
                }
                return size + GetButtonsResponse.ButtonBar.ADAPTER.encodedSizeWithTag(3, value.getButton_bar()) + GetButtonsResponse.ExpandableButtons.ADAPTER.encodedSizeWithTag(4, value.getExpandable_buttons());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetButtonsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSource_screen() != SourceScreen.SOURCE_SCREEN_UNSPECIFIED) {
                    SourceScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_screen());
                }
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerpetual_contract_id());
                }
                GetButtonsResponse.ButtonBar.ADAPTER.encodeWithTag(writer, 3, (int) value.getButton_bar());
                GetButtonsResponse.ExpandableButtons.ADAPTER.encodeWithTag(writer, 4, (int) value.getExpandable_buttons());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetButtonsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GetButtonsResponse.ExpandableButtons.ADAPTER.encodeWithTag(writer, 4, (int) value.getExpandable_buttons());
                GetButtonsResponse.ButtonBar.ADAPTER.encodeWithTag(writer, 3, (int) value.getButton_bar());
                if (!Intrinsics.areEqual(value.getPerpetual_contract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerpetual_contract_id());
                }
                if (value.getSource_screen() != SourceScreen.SOURCE_SCREEN_UNSPECIFIED) {
                    SourceScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_screen());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetButtonsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SourceScreen sourceScreenDecode = SourceScreen.SOURCE_SCREEN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                GetButtonsResponse.ButtonBar buttonBarDecode = null;
                GetButtonsResponse.ExpandableButtons expandableButtonsDecode = null;
                String strDecode = "";
                while (true) {
                    SourceScreen sourceScreen = sourceScreenDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetButtonsResponse(sourceScreen, strDecode, buttonBarDecode, expandableButtonsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            try {
                                sourceScreenDecode = SourceScreen.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            buttonBarDecode = GetButtonsResponse.ButtonBar.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            expandableButtonsDecode = GetButtonsResponse.ExpandableButtons.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetButtonsResponse redact(GetButtonsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GetButtonsResponse.ButtonBar button_bar = value.getButton_bar();
                GetButtonsResponse.ButtonBar buttonBarRedact = button_bar != null ? GetButtonsResponse.ButtonBar.ADAPTER.redact(button_bar) : null;
                GetButtonsResponse.ExpandableButtons expandable_buttons = value.getExpandable_buttons();
                return GetButtonsResponse.copy$default(value, null, null, buttonBarRedact, expandable_buttons != null ? GetButtonsResponse.ExpandableButtons.ADAPTER.redact(expandable_buttons) : null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* compiled from: GetButtonsResponse.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J,\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ButtonBar;", "Lcom/squareup/wire/Message;", "", "helper_text", "", CarResultComposable2.BUTTONS, "", "Lrh_server_driven_ui/v1/Button;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getHelper_text", "()Ljava/lang/String;", "getButtons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonBar extends Message {

        @JvmField
        public static final ProtoAdapter<ButtonBar> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        private final List<Button> buttons;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "helperText", schemaIndex = 0, tag = 1)
        private final String helper_text;

        public ButtonBar() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27772newBuilder();
        }

        public final String getHelper_text() {
            return this.helper_text;
        }

        public /* synthetic */ ButtonBar(String str, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonBar(String str, List<Button> buttons, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.helper_text = str;
            this.buttons = Internal.immutableCopyOf(CarResultComposable2.BUTTONS, buttons);
        }

        public final List<Button> getButtons() {
            return this.buttons;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27772newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ButtonBar)) {
                return false;
            }
            ButtonBar buttonBar = (ButtonBar) other;
            return Intrinsics.areEqual(unknownFields(), buttonBar.unknownFields()) && Intrinsics.areEqual(this.helper_text, buttonBar.helper_text) && Intrinsics.areEqual(this.buttons, buttonBar.buttons);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            String str = this.helper_text;
            int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.buttons.hashCode();
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.helper_text;
            if (str != null) {
                arrayList.add("helper_text=" + Internal.sanitize(str));
            }
            if (!this.buttons.isEmpty()) {
                arrayList.add("buttons=" + this.buttons);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ButtonBar{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ButtonBar copy$default(ButtonBar buttonBar, String str, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonBar.helper_text;
            }
            if ((i & 2) != 0) {
                list = buttonBar.buttons;
            }
            if ((i & 4) != 0) {
                byteString = buttonBar.unknownFields();
            }
            return buttonBar.copy(str, list, byteString);
        }

        public final ButtonBar copy(String helper_text, List<Button> buttons, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ButtonBar(helper_text, buttons, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ButtonBar.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ButtonBar>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.perpetuals.proto.v1.GetButtonsResponse$ButtonBar$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetButtonsResponse.ButtonBar value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHelper_text()) + Button.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getButtons());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetButtonsResponse.ButtonBar value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHelper_text());
                    Button.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getButtons());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetButtonsResponse.ButtonBar value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    Button.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getButtons());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHelper_text());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetButtonsResponse.ButtonBar decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetButtonsResponse.ButtonBar(strDecode, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            arrayList.add(Button.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetButtonsResponse.ButtonBar redact(GetButtonsResponse.ButtonBar value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GetButtonsResponse.ButtonBar.copy$default(value, null, Internal.m26823redactElements(value.getButtons(), Button.ADAPTER), ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: GetButtonsResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J>\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ExpandableButtons;", "Lcom/squareup/wire/Message;", "", CarResultComposable2.BUTTONS, "", "Lrh_server_driven_ui/v1/Button;", "left_title", "", "left_subtitle", "expand_button_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getLeft_title", "()Ljava/lang/String;", "getLeft_subtitle", "getExpand_button_title", "getButtons", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ExpandableButtons extends Message {

        @JvmField
        public static final ProtoAdapter<ExpandableButtons> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.Button#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<Button> buttons;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "expandButtonTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String expand_button_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "leftSubtitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String left_subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "leftTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String left_title;

        public ExpandableButtons() {
            this(null, null, null, null, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m27773newBuilder();
        }

        public /* synthetic */ ExpandableButtons(List list, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getLeft_title() {
            return this.left_title;
        }

        public final String getLeft_subtitle() {
            return this.left_subtitle;
        }

        public final String getExpand_button_title() {
            return this.expand_button_title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpandableButtons(List<Button> buttons, String left_title, String left_subtitle, String expand_button_title, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(left_title, "left_title");
            Intrinsics.checkNotNullParameter(left_subtitle, "left_subtitle");
            Intrinsics.checkNotNullParameter(expand_button_title, "expand_button_title");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.left_title = left_title;
            this.left_subtitle = left_subtitle;
            this.expand_button_title = expand_button_title;
            this.buttons = Internal.immutableCopyOf(CarResultComposable2.BUTTONS, buttons);
        }

        public final List<Button> getButtons() {
            return this.buttons;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m27773newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ExpandableButtons)) {
                return false;
            }
            ExpandableButtons expandableButtons = (ExpandableButtons) other;
            return Intrinsics.areEqual(unknownFields(), expandableButtons.unknownFields()) && Intrinsics.areEqual(this.buttons, expandableButtons.buttons) && Intrinsics.areEqual(this.left_title, expandableButtons.left_title) && Intrinsics.areEqual(this.left_subtitle, expandableButtons.left_subtitle) && Intrinsics.areEqual(this.expand_button_title, expandableButtons.expand_button_title);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((((unknownFields().hashCode() * 37) + this.buttons.hashCode()) * 37) + this.left_title.hashCode()) * 37) + this.left_subtitle.hashCode()) * 37) + this.expand_button_title.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.buttons.isEmpty()) {
                arrayList.add("buttons=" + this.buttons);
            }
            arrayList.add("left_title=" + Internal.sanitize(this.left_title));
            arrayList.add("left_subtitle=" + Internal.sanitize(this.left_subtitle));
            arrayList.add("expand_button_title=" + Internal.sanitize(this.expand_button_title));
            return CollectionsKt.joinToString$default(arrayList, ", ", "ExpandableButtons{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ExpandableButtons copy$default(ExpandableButtons expandableButtons, List list, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = expandableButtons.buttons;
            }
            if ((i & 2) != 0) {
                str = expandableButtons.left_title;
            }
            if ((i & 4) != 0) {
                str2 = expandableButtons.left_subtitle;
            }
            if ((i & 8) != 0) {
                str3 = expandableButtons.expand_button_title;
            }
            if ((i & 16) != 0) {
                byteString = expandableButtons.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str4 = str2;
            return expandableButtons.copy(list, str, str4, str3, byteString2);
        }

        public final ExpandableButtons copy(List<Button> buttons, String left_title, String left_subtitle, String expand_button_title, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(left_title, "left_title");
            Intrinsics.checkNotNullParameter(left_subtitle, "left_subtitle");
            Intrinsics.checkNotNullParameter(expand_button_title, "expand_button_title");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ExpandableButtons(buttons, left_title, left_subtitle, expand_button_title, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ExpandableButtons.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ExpandableButtons>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: contracts.perpetuals.proto.v1.GetButtonsResponse$ExpandableButtons$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetButtonsResponse.ExpandableButtons value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size() + Button.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getButtons());
                    if (!Intrinsics.areEqual(value.getLeft_title(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getLeft_title());
                    }
                    if (!Intrinsics.areEqual(value.getLeft_subtitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLeft_subtitle());
                    }
                    return !Intrinsics.areEqual(value.getExpand_button_title(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getExpand_button_title()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetButtonsResponse.ExpandableButtons value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Button.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getButtons());
                    if (!Intrinsics.areEqual(value.getLeft_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLeft_title());
                    }
                    if (!Intrinsics.areEqual(value.getLeft_subtitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLeft_subtitle());
                    }
                    if (!Intrinsics.areEqual(value.getExpand_button_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExpand_button_title());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetButtonsResponse.ExpandableButtons value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getExpand_button_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getExpand_button_title());
                    }
                    if (!Intrinsics.areEqual(value.getLeft_subtitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLeft_subtitle());
                    }
                    if (!Intrinsics.areEqual(value.getLeft_title(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getLeft_title());
                    }
                    Button.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getButtons());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetButtonsResponse.ExpandableButtons decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetButtonsResponse.ExpandableButtons(arrayList, strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(Button.ADAPTER.decode(reader));
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetButtonsResponse.ExpandableButtons redact(GetButtonsResponse.ExpandableButtons value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GetButtonsResponse.ExpandableButtons.copy$default(value, Internal.m26823redactElements(value.getButtons(), Button.ADAPTER), null, null, null, ByteString.EMPTY, 14, null);
                }
            };
        }
    }
}
