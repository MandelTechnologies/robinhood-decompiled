package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$GridSelectionImageItem extends GeneratedMessageLite<Common$GridSelectionImageItem, C6426a> implements InterfaceC6947y {
    private static final Common$GridSelectionImageItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IMAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Common$GridSelectionImageItem> PARSER;
    private int bitField0_;
    private String id_ = "";
    private Common$RenderedAsset image_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$GridSelectionImageItem$a */
    public static final class C6426a extends GeneratedMessageLite.Builder<Common$GridSelectionImageItem, C6426a> implements InterfaceC6947y {
        public C6426a() {
            super(Common$GridSelectionImageItem.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$GridSelectionImageItem common$GridSelectionImageItem = new Common$GridSelectionImageItem();
        DEFAULT_INSTANCE = common$GridSelectionImageItem;
        GeneratedMessageLite.registerDefaultInstance(Common$GridSelectionImageItem.class, common$GridSelectionImageItem);
    }

    private Common$GridSelectionImageItem() {
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearImage() {
        this.image_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$GridSelectionImageItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeImage(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.image_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == Common$RenderedAsset.getDefaultInstance()) {
            this.image_ = common$RenderedAsset;
        } else {
            this.image_ = Common$RenderedAsset.newBuilder(this.image_).mergeFrom((Common$RenderedAsset.C6473a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6426a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$GridSelectionImageItem parseDelimitedFrom(InputStream inputStream) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteBuffer byteBuffer) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$GridSelectionImageItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setImage(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.image_ = common$RenderedAsset;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$GridSelectionImageItem();
            case 2:
                return new C6426a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "id_", "image_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$GridSelectionImageItem> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$GridSelectionImageItem.class) {
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

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public Common$RenderedAsset getImage() {
        Common$RenderedAsset common$RenderedAsset = this.image_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public boolean hasImage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6426a newBuilder(Common$GridSelectionImageItem common$GridSelectionImageItem) {
        return DEFAULT_INSTANCE.createBuilder(common$GridSelectionImageItem);
    }

    public static Common$GridSelectionImageItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteString byteString) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$GridSelectionImageItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(byte[] bArr) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$GridSelectionImageItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(InputStream inputStream) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$GridSelectionImageItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$GridSelectionImageItem parseFrom(CodedInputStream codedInputStream) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$GridSelectionImageItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$GridSelectionImageItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
