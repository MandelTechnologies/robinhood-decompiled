package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$OrderedListItem extends GeneratedMessageLite<Common$OrderedListItem, C6450a> implements InterfaceC6632H {
    private static final Common$OrderedListItem DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile Parser<Common$OrderedListItem> PARSER;
    private int bitField0_;
    private Common$AttributedLocalizedString description_;
    private Common$AttributedLocalizedString header_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OrderedListItem$a */
    public static final class C6450a extends GeneratedMessageLite.Builder<Common$OrderedListItem, C6450a> implements InterfaceC6632H {
        public C6450a() {
            super(Common$OrderedListItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$OrderedListItem common$OrderedListItem = new Common$OrderedListItem();
        DEFAULT_INSTANCE = common$OrderedListItem;
        GeneratedMessageLite.registerDefaultInstance(Common$OrderedListItem.class, common$OrderedListItem);
    }

    private Common$OrderedListItem() {
    }

    private void clearDescription() {
        this.description_ = null;
        this.bitField0_ &= -3;
    }

    private void clearHeader() {
        this.header_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$OrderedListItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.description_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.description_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.description_ = common$AttributedLocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergeHeader(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.header_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.header_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.header_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6450a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$OrderedListItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OrderedListItem parseFrom(ByteString byteString) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$OrderedListItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.description_ = common$AttributedLocalizedString;
        this.bitField0_ |= 2;
    }

    private void setHeader(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.header_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$OrderedListItem();
            case 2:
                return new C6450a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "header_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$OrderedListItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$OrderedListItem.class) {
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

    public Common$AttributedLocalizedString getDescription() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.description_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$AttributedLocalizedString getHeader() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.header_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHeader() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6450a newBuilder(Common$OrderedListItem common$OrderedListItem) {
        return DEFAULT_INSTANCE.createBuilder(common$OrderedListItem);
    }

    public static Common$OrderedListItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OrderedListItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$OrderedListItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$OrderedListItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$OrderedListItem parseFrom(InputStream inputStream) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OrderedListItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OrderedListItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$OrderedListItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$OrderedListItem parseFrom(byte[] bArr) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$OrderedListItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OrderedListItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
