package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$HyperlinkContent extends GeneratedMessageLite<Common$HyperlinkContent, C6427a> implements MessageLiteOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final Common$HyperlinkContent DEFAULT_INSTANCE;
    private static volatile Parser<Common$HyperlinkContent> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private Common$LocalAction action_;
    private int bitField0_;
    private Common$LocalizedString text_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$HyperlinkContent$a */
    public static final class C6427a extends GeneratedMessageLite.Builder<Common$HyperlinkContent, C6427a> implements MessageLiteOrBuilder {
        public C6427a() {
            super(Common$HyperlinkContent.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$HyperlinkContent common$HyperlinkContent = new Common$HyperlinkContent();
        DEFAULT_INSTANCE = common$HyperlinkContent;
        GeneratedMessageLite.registerDefaultInstance(Common$HyperlinkContent.class, common$HyperlinkContent);
    }

    private Common$HyperlinkContent() {
    }

    private void clearAction() {
        this.action_ = null;
        this.bitField0_ &= -3;
    }

    private void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$HyperlinkContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.action_;
        if (common$LocalAction2 == null || common$LocalAction2 == Common$LocalAction.getDefaultInstance()) {
            this.action_ = common$LocalAction;
        } else {
            this.action_ = Common$LocalAction.newBuilder(this.action_).mergeFrom((Common$LocalAction.C6441b) common$LocalAction).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.text_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.text_ = common$LocalizedString;
        } else {
            this.text_ = Common$LocalizedString.newBuilder(this.text_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6427a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$HyperlinkContent parseDelimitedFrom(InputStream inputStream) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$HyperlinkContent parseFrom(ByteBuffer byteBuffer) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$HyperlinkContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.action_ = common$LocalAction;
        this.bitField0_ |= 2;
    }

    private void setText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$HyperlinkContent();
            case 2:
                return new C6427a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "text_", "action_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$HyperlinkContent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$HyperlinkContent.class) {
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

    public Common$LocalAction getAction() {
        Common$LocalAction common$LocalAction = this.action_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$LocalizedString getText() {
        Common$LocalizedString common$LocalizedString = this.text_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasAction() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6427a newBuilder(Common$HyperlinkContent common$HyperlinkContent) {
        return DEFAULT_INSTANCE.createBuilder(common$HyperlinkContent);
    }

    public static Common$HyperlinkContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(ByteString byteString) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$HyperlinkContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(byte[] bArr) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$HyperlinkContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(InputStream inputStream) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$HyperlinkContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$HyperlinkContent parseFrom(CodedInputStream codedInputStream) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$HyperlinkContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$HyperlinkContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
