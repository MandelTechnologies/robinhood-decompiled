package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

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
import microgram.contracts.crypto_trading_tax_lots.proto.p486v1.StreamAvailableTaxLotStrategyViewModelsResponse;
import nummus.p512v1.TaxLotStrategyType;
import okio.ByteString;

/* compiled from: StreamAvailableTaxLotStrategyViewModelsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse;", "Lcom/squareup/wire/Message;", "", "strategy_view_models", "", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$AvailableTaxLotStrategyViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "getStrategy_view_models", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "AvailableTaxLotStrategyViewModel", "StartSecondaryTextContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StreamAvailableTaxLotStrategyViewModelsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse> ADAPTER;

    @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$AvailableTaxLotStrategyViewModel#ADAPTER", jsonName = "strategyViewModels", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<AvailableTaxLotStrategyViewModel> strategy_view_models;

    /* JADX WARN: Multi-variable type inference failed */
    public StreamAvailableTaxLotStrategyViewModelsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28982newBuilder();
    }

    public /* synthetic */ StreamAvailableTaxLotStrategyViewModelsResponse(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamAvailableTaxLotStrategyViewModelsResponse(List<AvailableTaxLotStrategyViewModel> strategy_view_models, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(strategy_view_models, "strategy_view_models");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.strategy_view_models = Internal.immutableCopyOf("strategy_view_models", strategy_view_models);
    }

    public final List<AvailableTaxLotStrategyViewModel> getStrategy_view_models() {
        return this.strategy_view_models;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28982newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamAvailableTaxLotStrategyViewModelsResponse)) {
            return false;
        }
        StreamAvailableTaxLotStrategyViewModelsResponse streamAvailableTaxLotStrategyViewModelsResponse = (StreamAvailableTaxLotStrategyViewModelsResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamAvailableTaxLotStrategyViewModelsResponse.unknownFields()) && Intrinsics.areEqual(this.strategy_view_models, streamAvailableTaxLotStrategyViewModelsResponse.strategy_view_models);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.strategy_view_models.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.strategy_view_models.isEmpty()) {
            arrayList.add("strategy_view_models=" + this.strategy_view_models);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamAvailableTaxLotStrategyViewModelsResponse{", "}", 0, null, null, 56, null);
    }

    public final StreamAvailableTaxLotStrategyViewModelsResponse copy(List<AvailableTaxLotStrategyViewModel> strategy_view_models, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(strategy_view_models, "strategy_view_models");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamAvailableTaxLotStrategyViewModelsResponse(strategy_view_models, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamAvailableTaxLotStrategyViewModelsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamAvailableTaxLotStrategyViewModelsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamAvailableTaxLotStrategyViewModelsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getStrategy_view_models());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getStrategy_view_models());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getStrategy_view_models());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamAvailableTaxLotStrategyViewModelsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamAvailableTaxLotStrategyViewModelsResponse(arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamAvailableTaxLotStrategyViewModelsResponse redact(StreamAvailableTaxLotStrategyViewModelsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy(Internal.m26823redactElements(value.getStrategy_view_models(), StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel.ADAPTER), ByteString.EMPTY);
            }
        };
    }

    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponse.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$AvailableTaxLotStrategyViewModel;", "Lcom/squareup/wire/Message;", "", "start_primary_text", "", "start_secondary_text_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;", "is_selected", "", "strategy_type", "Lnummus/v1/TaxLotStrategyType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;ZLnummus/v1/TaxLotStrategyType;Lokio/ByteString;)V", "getStart_primary_text", "()Ljava/lang/String;", "getStart_secondary_text_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;", "()Z", "getStrategy_type", "()Lnummus/v1/TaxLotStrategyType;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AvailableTaxLotStrategyViewModel extends Message {

        @JvmField
        public static final ProtoAdapter<AvailableTaxLotStrategyViewModel> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isSelected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final boolean is_selected;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startPrimaryText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String start_primary_text;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent#ADAPTER", jsonName = "startSecondaryTextContent", schemaIndex = 1, tag = 2)
        private final StartSecondaryTextContent start_secondary_text_content;

        @WireField(adapter = "nummus.v1.TaxLotStrategyType#ADAPTER", jsonName = "strategyType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final TaxLotStrategyType strategy_type;

        public AvailableTaxLotStrategyViewModel() {
            this(null, null, false, null, null, 31, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28983newBuilder();
        }

        public final String getStart_primary_text() {
            return this.start_primary_text;
        }

        public /* synthetic */ AvailableTaxLotStrategyViewModel(String str, StartSecondaryTextContent startSecondaryTextContent, boolean z, TaxLotStrategyType taxLotStrategyType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : startSecondaryTextContent, (i & 4) != 0 ? false : z, (i & 8) != 0 ? TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED : taxLotStrategyType, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public final StartSecondaryTextContent getStart_secondary_text_content() {
            return this.start_secondary_text_content;
        }

        /* renamed from: is_selected, reason: from getter */
        public final boolean getIs_selected() {
            return this.is_selected;
        }

        public final TaxLotStrategyType getStrategy_type() {
            return this.strategy_type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvailableTaxLotStrategyViewModel(String start_primary_text, StartSecondaryTextContent startSecondaryTextContent, boolean z, TaxLotStrategyType strategy_type, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(start_primary_text, "start_primary_text");
            Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.start_primary_text = start_primary_text;
            this.start_secondary_text_content = startSecondaryTextContent;
            this.is_selected = z;
            this.strategy_type = strategy_type;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28983newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AvailableTaxLotStrategyViewModel)) {
                return false;
            }
            AvailableTaxLotStrategyViewModel availableTaxLotStrategyViewModel = (AvailableTaxLotStrategyViewModel) other;
            return Intrinsics.areEqual(unknownFields(), availableTaxLotStrategyViewModel.unknownFields()) && Intrinsics.areEqual(this.start_primary_text, availableTaxLotStrategyViewModel.start_primary_text) && Intrinsics.areEqual(this.start_secondary_text_content, availableTaxLotStrategyViewModel.start_secondary_text_content) && this.is_selected == availableTaxLotStrategyViewModel.is_selected && this.strategy_type == availableTaxLotStrategyViewModel.strategy_type;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.start_primary_text.hashCode()) * 37;
            StartSecondaryTextContent startSecondaryTextContent = this.start_secondary_text_content;
            int iHashCode2 = ((((iHashCode + (startSecondaryTextContent != null ? startSecondaryTextContent.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_selected)) * 37) + this.strategy_type.hashCode();
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("start_primary_text=" + Internal.sanitize(this.start_primary_text));
            StartSecondaryTextContent startSecondaryTextContent = this.start_secondary_text_content;
            if (startSecondaryTextContent != null) {
                arrayList.add("start_secondary_text_content=" + startSecondaryTextContent);
            }
            arrayList.add("is_selected=" + this.is_selected);
            arrayList.add("strategy_type=" + this.strategy_type);
            return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableTaxLotStrategyViewModel{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ AvailableTaxLotStrategyViewModel copy$default(AvailableTaxLotStrategyViewModel availableTaxLotStrategyViewModel, String str, StartSecondaryTextContent startSecondaryTextContent, boolean z, TaxLotStrategyType taxLotStrategyType, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = availableTaxLotStrategyViewModel.start_primary_text;
            }
            if ((i & 2) != 0) {
                startSecondaryTextContent = availableTaxLotStrategyViewModel.start_secondary_text_content;
            }
            if ((i & 4) != 0) {
                z = availableTaxLotStrategyViewModel.is_selected;
            }
            if ((i & 8) != 0) {
                taxLotStrategyType = availableTaxLotStrategyViewModel.strategy_type;
            }
            if ((i & 16) != 0) {
                byteString = availableTaxLotStrategyViewModel.unknownFields();
            }
            ByteString byteString2 = byteString;
            boolean z2 = z;
            return availableTaxLotStrategyViewModel.copy(str, startSecondaryTextContent, z2, taxLotStrategyType, byteString2);
        }

        public final AvailableTaxLotStrategyViewModel copy(String start_primary_text, StartSecondaryTextContent start_secondary_text_content, boolean is_selected, TaxLotStrategyType strategy_type, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(start_primary_text, "start_primary_text");
            Intrinsics.checkNotNullParameter(strategy_type, "strategy_type");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AvailableTaxLotStrategyViewModel(start_primary_text, start_secondary_text_content, is_selected, strategy_type, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AvailableTaxLotStrategyViewModel.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AvailableTaxLotStrategyViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$AvailableTaxLotStrategyViewModel$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getStart_primary_text(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStart_primary_text());
                    }
                    int iEncodedSizeWithTag = size + StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.ADAPTER.encodedSizeWithTag(2, value.getStart_secondary_text_content());
                    if (value.getIs_selected()) {
                        iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getIs_selected()));
                    }
                    return value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED ? iEncodedSizeWithTag + TaxLotStrategyType.ADAPTER.encodedSizeWithTag(4, value.getStrategy_type()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getStart_primary_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStart_primary_text());
                    }
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getStart_secondary_text_content());
                    if (value.getIs_selected()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_selected()));
                    }
                    if (value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED) {
                        TaxLotStrategyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getStrategy_type());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getStrategy_type() != TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED) {
                        TaxLotStrategyType.ADAPTER.encodeWithTag(writer, 4, (int) value.getStrategy_type());
                    }
                    if (value.getIs_selected()) {
                        ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getIs_selected()));
                    }
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getStart_secondary_text_content());
                    if (Intrinsics.areEqual(value.getStart_primary_text(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getStart_primary_text());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    TaxLotStrategyType taxLotStrategyTypeDecode = TaxLotStrategyType.TAX_LOT_STRATEGY_TYPE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    boolean zBooleanValue = false;
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent startSecondaryTextContentDecode = null;
                    String strDecode = "";
                    while (true) {
                        TaxLotStrategyType taxLotStrategyType = taxLotStrategyTypeDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel(strDecode, startSecondaryTextContentDecode, zBooleanValue, taxLotStrategyType, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                startSecondaryTextContentDecode = StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.ADAPTER.decode(reader);
                            } else if (iNextTag == 3) {
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                            } else if (iNextTag == 4) {
                                try {
                                    taxLotStrategyTypeDecode = TaxLotStrategyType.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel redact(StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent start_secondary_text_content = value.getStart_secondary_text_content();
                    return StreamAvailableTaxLotStrategyViewModelsResponse.AvailableTaxLotStrategyViewModel.copy$default(value, null, start_secondary_text_content != null ? StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.ADAPTER.redact(start_secondary_text_content) : null, false, null, ByteString.EMPTY, 13, null);
                }
            };
        }
    }

    /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponse.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001d\u001e\u001f B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent;", "estimated_loss_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent;", "text_content", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent;Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent;Lokio/ByteString;)V", "getEstimated_gain_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent;", "getEstimated_loss_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent;", "getText_content", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EstimatedGainContent", "EstimatedLossContent", "TextContent", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StartSecondaryTextContent extends Message {

        @JvmField
        public static final ProtoAdapter<StartSecondaryTextContent> ADAPTER;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent#ADAPTER", jsonName = "estimatedGainContent", oneofName = "content_type", schemaIndex = 0, tag = 1)
        private final EstimatedGainContent estimated_gain_content;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent#ADAPTER", jsonName = "estimatedLossContent", oneofName = "content_type", schemaIndex = 1, tag = 2)
        private final EstimatedLossContent estimated_loss_content;

        @WireField(adapter = "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent#ADAPTER", jsonName = "textContent", oneofName = "content_type", schemaIndex = 2, tag = 3)
        private final TextContent text_content;

        public StartSecondaryTextContent() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28984newBuilder();
        }

        public final EstimatedGainContent getEstimated_gain_content() {
            return this.estimated_gain_content;
        }

        public final EstimatedLossContent getEstimated_loss_content() {
            return this.estimated_loss_content;
        }

        public final TextContent getText_content() {
            return this.text_content;
        }

        public /* synthetic */ StartSecondaryTextContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, TextContent textContent, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : estimatedGainContent, (i & 2) != 0 ? null : estimatedLossContent, (i & 4) != 0 ? null : textContent, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartSecondaryTextContent(EstimatedGainContent estimatedGainContent, EstimatedLossContent estimatedLossContent, TextContent textContent, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.estimated_gain_content = estimatedGainContent;
            this.estimated_loss_content = estimatedLossContent;
            this.text_content = textContent;
            if (Internal.countNonNull(estimatedGainContent, estimatedLossContent, textContent) > 1) {
                throw new IllegalArgumentException("At most one of estimated_gain_content, estimated_loss_content, text_content may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28984newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof StartSecondaryTextContent)) {
                return false;
            }
            StartSecondaryTextContent startSecondaryTextContent = (StartSecondaryTextContent) other;
            return Intrinsics.areEqual(unknownFields(), startSecondaryTextContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_content, startSecondaryTextContent.estimated_gain_content) && Intrinsics.areEqual(this.estimated_loss_content, startSecondaryTextContent.estimated_loss_content) && Intrinsics.areEqual(this.text_content, startSecondaryTextContent.text_content);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            int iHashCode2 = (iHashCode + (estimatedGainContent != null ? estimatedGainContent.hashCode() : 0)) * 37;
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            int iHashCode3 = (iHashCode2 + (estimatedLossContent != null ? estimatedLossContent.hashCode() : 0)) * 37;
            TextContent textContent = this.text_content;
            int iHashCode4 = iHashCode3 + (textContent != null ? textContent.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            EstimatedGainContent estimatedGainContent = this.estimated_gain_content;
            if (estimatedGainContent != null) {
                arrayList.add("estimated_gain_content=" + estimatedGainContent);
            }
            EstimatedLossContent estimatedLossContent = this.estimated_loss_content;
            if (estimatedLossContent != null) {
                arrayList.add("estimated_loss_content=" + estimatedLossContent);
            }
            TextContent textContent = this.text_content;
            if (textContent != null) {
                arrayList.add("text_content=" + textContent);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "StartSecondaryTextContent{", "}", 0, null, null, 56, null);
        }

        public final StartSecondaryTextContent copy(EstimatedGainContent estimated_gain_content, EstimatedLossContent estimated_loss_content, TextContent text_content, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new StartSecondaryTextContent(estimated_gain_content, estimated_loss_content, text_content, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StartSecondaryTextContent.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<StartSecondaryTextContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent.ADAPTER.encodedSizeWithTag(1, value.getEstimated_gain_content()) + StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent.ADAPTER.encodedSizeWithTag(2, value.getEstimated_loss_content()) + StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent.ADAPTER.encodedSizeWithTag(3, value.getText_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_content());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getText_content());
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent.ADAPTER.encodeWithTag(writer, 2, (int) value.getEstimated_loss_content());
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent.ADAPTER.encodeWithTag(writer, 1, (int) value.getEstimated_gain_content());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent redact(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent estimated_gain_content = value.getEstimated_gain_content();
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent estimatedGainContentRedact = estimated_gain_content != null ? StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent.ADAPTER.redact(estimated_gain_content) : null;
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent estimated_loss_content = value.getEstimated_loss_content();
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent estimatedLossContentRedact = estimated_loss_content != null ? StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent.ADAPTER.redact(estimated_loss_content) : null;
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent text_content = value.getText_content();
                    return value.copy(estimatedGainContentRedact, estimatedLossContentRedact, text_content != null ? StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent.ADAPTER.redact(text_content) : null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent estimatedGainContentDecode = null;
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent estimatedLossContentDecode = null;
                    StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent textContentDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent(estimatedGainContentDecode, estimatedLossContentDecode, textContentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            estimatedGainContentDecode = StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            estimatedLossContentDecode = StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            textContentDecode = StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent;", "Lcom/squareup/wire/Message;", "", "estimated_gain_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_gain_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedGainContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedGainContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedGainQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_gain_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedGainContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m28985newBuilder();
            }

            public final String getEstimated_gain_quote_amount() {
                return this.estimated_gain_quote_amount;
            }

            public /* synthetic */ EstimatedGainContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedGainContent(String estimated_gain_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_gain_quote_amount = estimated_gain_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m28985newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedGainContent)) {
                    return false;
                }
                EstimatedGainContent estimatedGainContent = (EstimatedGainContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedGainContent.unknownFields()) && Intrinsics.areEqual(this.estimated_gain_quote_amount, estimatedGainContent.estimated_gain_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_gain_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_gain_quote_amount=" + Internal.sanitize(this.estimated_gain_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedGainContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedGainContent copy$default(EstimatedGainContent estimatedGainContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedGainContent.estimated_gain_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedGainContent.unknownFields();
                }
                return estimatedGainContent.copy(str, byteString);
            }

            public final EstimatedGainContent copy(String estimated_gain_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_gain_quote_amount, "estimated_gain_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedGainContent(estimated_gain_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedGainContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedGainContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedGainContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_gain_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_gain_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_gain_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent redact(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedGainContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent;", "Lcom/squareup/wire/Message;", "", "estimated_loss_quote_amount", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getEstimated_loss_quote_amount", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class EstimatedLossContent extends Message {

            @JvmField
            public static final ProtoAdapter<EstimatedLossContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "estimatedLossQuoteAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String estimated_loss_quote_amount;

            /* JADX WARN: Multi-variable type inference failed */
            public EstimatedLossContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m28986newBuilder();
            }

            public final String getEstimated_loss_quote_amount() {
                return this.estimated_loss_quote_amount;
            }

            public /* synthetic */ EstimatedLossContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EstimatedLossContent(String estimated_loss_quote_amount, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.estimated_loss_quote_amount = estimated_loss_quote_amount;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m28986newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EstimatedLossContent)) {
                    return false;
                }
                EstimatedLossContent estimatedLossContent = (EstimatedLossContent) other;
                return Intrinsics.areEqual(unknownFields(), estimatedLossContent.unknownFields()) && Intrinsics.areEqual(this.estimated_loss_quote_amount, estimatedLossContent.estimated_loss_quote_amount);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.estimated_loss_quote_amount.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("estimated_loss_quote_amount=" + Internal.sanitize(this.estimated_loss_quote_amount));
                return CollectionsKt.joinToString$default(arrayList, ", ", "EstimatedLossContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ EstimatedLossContent copy$default(EstimatedLossContent estimatedLossContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = estimatedLossContent.estimated_loss_quote_amount;
                }
                if ((i & 2) != 0) {
                    byteString = estimatedLossContent.unknownFields();
                }
                return estimatedLossContent.copy(str, byteString);
            }

            public final EstimatedLossContent copy(String estimated_loss_quote_amount, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(estimated_loss_quote_amount, "estimated_loss_quote_amount");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new EstimatedLossContent(estimated_loss_quote_amount, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EstimatedLossContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<EstimatedLossContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$EstimatedLossContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEstimated_loss_quote_amount()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getEstimated_loss_quote_amount(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEstimated_loss_quote_amount());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent redact(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.EstimatedLossContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }

        /* compiled from: StreamAvailableTaxLotStrategyViewModelsResponse.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent;", "Lcom/squareup/wire/Message;", "", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TextContent extends Message {

            @JvmField
            public static final ProtoAdapter<TextContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String text;

            /* JADX WARN: Multi-variable type inference failed */
            public TextContent() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m28987newBuilder();
            }

            public final String getText() {
                return this.text;
            }

            public /* synthetic */ TextContent(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextContent(String text, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.text = text;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m28987newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TextContent)) {
                    return false;
                }
                TextContent textContent = (TextContent) other;
                return Intrinsics.areEqual(unknownFields(), textContent.unknownFields()) && Intrinsics.areEqual(this.text, textContent.text);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (unknownFields().hashCode() * 37) + this.text.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("text=" + Internal.sanitize(this.text));
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ TextContent copy$default(TextContent textContent, String str, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = textContent.text;
                }
                if ((i & 2) != 0) {
                    byteString = textContent.unknownFields();
                }
                return textContent.copy(str, byteString);
            }

            public final TextContent copy(String text, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new TextContent(text, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TextContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<TextContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamAvailableTaxLotStrategyViewModelsResponse$StartSecondaryTextContent$TextContent$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        return !Intrinsics.areEqual(value.getText(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText()) : size;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getText(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (Intrinsics.areEqual(value.getText(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent redact(StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return StreamAvailableTaxLotStrategyViewModelsResponse.StartSecondaryTextContent.TextContent.copy$default(value, null, ByteString.EMPTY, 1, null);
                    }
                };
            }
        }
    }
}
