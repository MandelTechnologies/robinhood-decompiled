package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$SteppedTransitionText extends GeneratedMessageLite<Common$SteppedTransitionText, C6499a> implements MessageLiteOrBuilder {
    private static final Common$SteppedTransitionText DEFAULT_INSTANCE;
    private static volatile Parser<Common$SteppedTransitionText> PARSER = null;
    public static final int TEXT_STEPS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<TextStep> textSteps_ = GeneratedMessageLite.emptyProtobufList();

    public static final class TextStep extends GeneratedMessageLite<TextStep, C6498a> implements InterfaceC6500b {
        public static final int CONTENT_FIELD_NUMBER = 2;
        private static final TextStep DEFAULT_INSTANCE;
        public static final int HEADER_FIELD_NUMBER = 1;
        private static volatile Parser<TextStep> PARSER;
        private int bitField0_;
        private Common$AttributedLocalizedString content_;
        private Common$LocalizedString header_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText$TextStep$a */
        public static final class C6498a extends GeneratedMessageLite.Builder<TextStep, C6498a> implements InterfaceC6500b {
            public C6498a() {
                super(TextStep.DEFAULT_INSTANCE);
            }
        }

        static {
            TextStep textStep = new TextStep();
            DEFAULT_INSTANCE = textStep;
            GeneratedMessageLite.registerDefaultInstance(TextStep.class, textStep);
        }

        private TextStep() {
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -3;
        }

        private void clearHeader() {
            this.header_ = null;
            this.bitField0_ &= -2;
        }

        public static TextStep getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
            if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
                common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
            }
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 2;
        }

        private void mergeHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.header_;
            if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
                common$LocalizedString = Common$LocalizedString.newBuilder(this.header_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        public static C6498a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TextStep parseDelimitedFrom(InputStream inputStream) {
            return (TextStep) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextStep parseFrom(ByteString byteString) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<TextStep> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
            common$AttributedLocalizedString.getClass();
            this.content_ = common$AttributedLocalizedString;
            this.bitField0_ |= 2;
        }

        private void setHeader(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.header_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new TextStep();
                case 2:
                    return new C6498a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "header_", "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TextStep> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TextStep.class) {
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

        public Common$AttributedLocalizedString getContent() {
            Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
            return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
        }

        public Common$LocalizedString getHeader() {
            Common$LocalizedString common$LocalizedString = this.header_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasHeader() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6498a newBuilder(TextStep textStep) {
            return DEFAULT_INSTANCE.createBuilder(textStep);
        }

        public static TextStep parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TextStep) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TextStep parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static TextStep parseFrom(CodedInputStream codedInputStream) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static TextStep parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static TextStep parseFrom(InputStream inputStream) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TextStep parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static TextStep parseFrom(ByteBuffer byteBuffer) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static TextStep parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static TextStep parseFrom(byte[] bArr) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TextStep parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (TextStep) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText$a */
    public static final class C6499a extends GeneratedMessageLite.Builder<Common$SteppedTransitionText, C6499a> implements MessageLiteOrBuilder {
        public C6499a() {
            super(Common$SteppedTransitionText.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SteppedTransitionText$b */
    public interface InterfaceC6500b extends MessageLiteOrBuilder {
    }

    static {
        Common$SteppedTransitionText common$SteppedTransitionText = new Common$SteppedTransitionText();
        DEFAULT_INSTANCE = common$SteppedTransitionText;
        GeneratedMessageLite.registerDefaultInstance(Common$SteppedTransitionText.class, common$SteppedTransitionText);
    }

    private Common$SteppedTransitionText() {
    }

    private void addAllTextSteps(Iterable<? extends TextStep> iterable) {
        ensureTextStepsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.textSteps_);
    }

    private void addTextSteps(int i, TextStep textStep) {
        textStep.getClass();
        ensureTextStepsIsMutable();
        this.textSteps_.add(i, textStep);
    }

    private void clearTextSteps() {
        this.textSteps_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureTextStepsIsMutable() {
        Internal.ProtobufList<TextStep> protobufList = this.textSteps_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.textSteps_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$SteppedTransitionText getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6499a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SteppedTransitionText parseDelimitedFrom(InputStream inputStream) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SteppedTransitionText parseFrom(ByteString byteString) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$SteppedTransitionText> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeTextSteps(int i) {
        ensureTextStepsIsMutable();
        this.textSteps_.remove(i);
    }

    private void setTextSteps(int i, TextStep textStep) {
        textStep.getClass();
        ensureTextStepsIsMutable();
        this.textSteps_.set(i, textStep);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SteppedTransitionText();
            case 2:
                return new C6499a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"textSteps_", TextStep.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SteppedTransitionText> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SteppedTransitionText.class) {
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

    public TextStep getTextSteps(int i) {
        return this.textSteps_.get(i);
    }

    public int getTextStepsCount() {
        return this.textSteps_.size();
    }

    public List<TextStep> getTextStepsList() {
        return this.textSteps_;
    }

    public InterfaceC6500b getTextStepsOrBuilder(int i) {
        return this.textSteps_.get(i);
    }

    public List<? extends InterfaceC6500b> getTextStepsOrBuilderList() {
        return this.textSteps_;
    }

    private void addTextSteps(TextStep textStep) {
        textStep.getClass();
        ensureTextStepsIsMutable();
        this.textSteps_.add(textStep);
    }

    public static C6499a newBuilder(Common$SteppedTransitionText common$SteppedTransitionText) {
        return DEFAULT_INSTANCE.createBuilder(common$SteppedTransitionText);
    }

    public static Common$SteppedTransitionText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SteppedTransitionText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SteppedTransitionText parseFrom(CodedInputStream codedInputStream) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SteppedTransitionText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$SteppedTransitionText parseFrom(InputStream inputStream) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SteppedTransitionText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SteppedTransitionText parseFrom(ByteBuffer byteBuffer) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$SteppedTransitionText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SteppedTransitionText parseFrom(byte[] bArr) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SteppedTransitionText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SteppedTransitionText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
