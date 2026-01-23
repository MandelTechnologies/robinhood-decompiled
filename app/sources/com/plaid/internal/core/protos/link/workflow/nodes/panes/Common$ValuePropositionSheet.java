package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$ValuePropositionSheet extends GeneratedMessageLite<Common$ValuePropositionSheet, C6549a> implements MessageLiteOrBuilder {
    public static final int BODY_FIELD_NUMBER = 3;
    private static final Common$ValuePropositionSheet DEFAULT_INSTANCE;
    private static volatile Parser<Common$ValuePropositionSheet> PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VALUE_PROPOSITIONS_FIELD_NUMBER = 4;
    private int bitField0_;
    private Common$LocalizedString body_;
    private Common$LocalizedString subtitle_;
    private Common$LocalizedString title_;
    private Internal.ProtobufList<ValueProposition> valuePropositions_ = GeneratedMessageLite.emptyProtobufList();

    public static final class ValueProposition extends GeneratedMessageLite<ValueProposition, C6548a> implements InterfaceC6550b {
        private static final ValueProposition DEFAULT_INSTANCE;
        private static volatile Parser<ValueProposition> PARSER = null;
        public static final int TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private Common$TwoToneText text_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet$ValueProposition$a */
        public static final class C6548a extends GeneratedMessageLite.Builder<ValueProposition, C6548a> implements InterfaceC6550b {
            public C6548a() {
                super(ValueProposition.DEFAULT_INSTANCE);
            }
        }

        static {
            ValueProposition valueProposition = new ValueProposition();
            DEFAULT_INSTANCE = valueProposition;
            GeneratedMessageLite.registerDefaultInstance(ValueProposition.class, valueProposition);
        }

        private ValueProposition() {
        }

        private void clearText() {
            this.text_ = null;
            this.bitField0_ &= -2;
        }

        public static ValueProposition getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeText(Common$TwoToneText common$TwoToneText) {
            common$TwoToneText.getClass();
            Common$TwoToneText common$TwoToneText2 = this.text_;
            if (common$TwoToneText2 != null && common$TwoToneText2 != Common$TwoToneText.getDefaultInstance()) {
                common$TwoToneText = Common$TwoToneText.newBuilder(this.text_).mergeFrom((Common$TwoToneText.C6545b) common$TwoToneText).buildPartial();
            }
            this.text_ = common$TwoToneText;
            this.bitField0_ |= 1;
        }

        public static C6548a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ValueProposition parseDelimitedFrom(InputStream inputStream) {
            return (ValueProposition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValueProposition parseFrom(ByteString byteString) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<ValueProposition> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setText(Common$TwoToneText common$TwoToneText) {
            common$TwoToneText.getClass();
            this.text_ = common$TwoToneText;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ValueProposition();
                case 2:
                    return new C6548a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "text_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ValueProposition> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ValueProposition.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public Common$TwoToneText getText() {
            Common$TwoToneText common$TwoToneText = this.text_;
            return common$TwoToneText == null ? Common$TwoToneText.getDefaultInstance() : common$TwoToneText;
        }

        public boolean hasText() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6548a newBuilder(ValueProposition valueProposition) {
            return DEFAULT_INSTANCE.createBuilder(valueProposition);
        }

        public static ValueProposition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValueProposition) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValueProposition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ValueProposition parseFrom(CodedInputStream codedInputStream) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ValueProposition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static ValueProposition parseFrom(InputStream inputStream) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValueProposition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValueProposition parseFrom(ByteBuffer byteBuffer) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static ValueProposition parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ValueProposition parseFrom(byte[] bArr) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ValueProposition parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ValueProposition) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet$a */
    public static final class C6549a extends GeneratedMessageLite.Builder<Common$ValuePropositionSheet, C6549a> implements MessageLiteOrBuilder {
        public C6549a() {
            super(Common$ValuePropositionSheet.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ValuePropositionSheet$b */
    public interface InterfaceC6550b extends MessageLiteOrBuilder {
    }

    static {
        Common$ValuePropositionSheet common$ValuePropositionSheet = new Common$ValuePropositionSheet();
        DEFAULT_INSTANCE = common$ValuePropositionSheet;
        GeneratedMessageLite.registerDefaultInstance(Common$ValuePropositionSheet.class, common$ValuePropositionSheet);
    }

    private Common$ValuePropositionSheet() {
    }

    private void addAllValuePropositions(Iterable<? extends ValueProposition> iterable) {
        ensureValuePropositionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.valuePropositions_);
    }

    private void addValuePropositions(int i, ValueProposition valueProposition) {
        valueProposition.getClass();
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.add(i, valueProposition);
    }

    private void clearBody() {
        this.body_ = null;
        this.bitField0_ &= -5;
    }

    private void clearSubtitle() {
        this.subtitle_ = null;
        this.bitField0_ &= -3;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    private void clearValuePropositions() {
        this.valuePropositions_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValuePropositionsIsMutable() {
        Internal.ProtobufList<ValueProposition> protobufList = this.valuePropositions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.valuePropositions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$ValuePropositionSheet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBody(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.body_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.body_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.body_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void mergeSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.subtitle_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.subtitle_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergeTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6549a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$ValuePropositionSheet parseDelimitedFrom(InputStream inputStream) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ValuePropositionSheet parseFrom(ByteString byteString) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$ValuePropositionSheet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValuePropositions(int i) {
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.remove(i);
    }

    private void setBody(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.body_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setSubtitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.subtitle_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setValuePropositions(int i, ValueProposition valueProposition) {
        valueProposition.getClass();
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.set(i, valueProposition);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$ValuePropositionSheet();
            case 2:
                return new C6549a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"bitField0_", "title_", "subtitle_", "body_", "valuePropositions_", ValueProposition.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$ValuePropositionSheet> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$ValuePropositionSheet.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Common$LocalizedString getBody() {
        Common$LocalizedString common$LocalizedString = this.body_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getSubtitle() {
        Common$LocalizedString common$LocalizedString = this.subtitle_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public ValueProposition getValuePropositions(int i) {
        return this.valuePropositions_.get(i);
    }

    public int getValuePropositionsCount() {
        return this.valuePropositions_.size();
    }

    public List<ValueProposition> getValuePropositionsList() {
        return this.valuePropositions_;
    }

    public InterfaceC6550b getValuePropositionsOrBuilder(int i) {
        return this.valuePropositions_.get(i);
    }

    public List<? extends InterfaceC6550b> getValuePropositionsOrBuilderList() {
        return this.valuePropositions_;
    }

    public boolean hasBody() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSubtitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addValuePropositions(ValueProposition valueProposition) {
        valueProposition.getClass();
        ensureValuePropositionsIsMutable();
        this.valuePropositions_.add(valueProposition);
    }

    public static C6549a newBuilder(Common$ValuePropositionSheet common$ValuePropositionSheet) {
        return DEFAULT_INSTANCE.createBuilder(common$ValuePropositionSheet);
    }

    public static Common$ValuePropositionSheet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ValuePropositionSheet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$ValuePropositionSheet parseFrom(CodedInputStream codedInputStream) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$ValuePropositionSheet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$ValuePropositionSheet parseFrom(InputStream inputStream) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$ValuePropositionSheet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$ValuePropositionSheet parseFrom(ByteBuffer byteBuffer) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$ValuePropositionSheet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$ValuePropositionSheet parseFrom(byte[] bArr) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$ValuePropositionSheet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$ValuePropositionSheet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
