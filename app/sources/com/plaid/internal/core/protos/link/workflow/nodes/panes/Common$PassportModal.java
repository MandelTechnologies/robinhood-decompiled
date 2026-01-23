package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$PassportModal extends GeneratedMessageLite<Common$PassportModal, C6461a> implements MessageLiteOrBuilder {
    private static final Common$PassportModal DEFAULT_INSTANCE;
    private static volatile Parser<Common$PassportModal> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Common$TwoToneText title_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PassportModal$a */
    public static final class C6461a extends GeneratedMessageLite.Builder<Common$PassportModal, C6461a> implements MessageLiteOrBuilder {
        public C6461a() {
            super(Common$PassportModal.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$PassportModal common$PassportModal = new Common$PassportModal();
        DEFAULT_INSTANCE = common$PassportModal;
        GeneratedMessageLite.registerDefaultInstance(Common$PassportModal.class, common$PassportModal);
    }

    private Common$PassportModal() {
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$PassportModal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTitle(Common$TwoToneText common$TwoToneText) {
        common$TwoToneText.getClass();
        Common$TwoToneText common$TwoToneText2 = this.title_;
        if (common$TwoToneText2 != null && common$TwoToneText2 != Common$TwoToneText.getDefaultInstance()) {
            common$TwoToneText = Common$TwoToneText.newBuilder(this.title_).mergeFrom((Common$TwoToneText.C6545b) common$TwoToneText).buildPartial();
        }
        this.title_ = common$TwoToneText;
        this.bitField0_ |= 1;
    }

    public static C6461a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PassportModal parseDelimitedFrom(InputStream inputStream) {
        return (Common$PassportModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PassportModal parseFrom(ByteString byteString) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$PassportModal> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setTitle(Common$TwoToneText common$TwoToneText) {
        common$TwoToneText.getClass();
        this.title_ = common$TwoToneText;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PassportModal();
            case 2:
                return new C6461a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "title_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PassportModal> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$PassportModal.class) {
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

    public Common$TwoToneText getTitle() {
        Common$TwoToneText common$TwoToneText = this.title_;
        return common$TwoToneText == null ? Common$TwoToneText.getDefaultInstance() : common$TwoToneText;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6461a newBuilder(Common$PassportModal common$PassportModal) {
        return DEFAULT_INSTANCE.createBuilder(common$PassportModal);
    }

    public static Common$PassportModal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PassportModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PassportModal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PassportModal parseFrom(CodedInputStream codedInputStream) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PassportModal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$PassportModal parseFrom(InputStream inputStream) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PassportModal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PassportModal parseFrom(ByteBuffer byteBuffer) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$PassportModal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PassportModal parseFrom(byte[] bArr) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PassportModal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PassportModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
