package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAsset;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$RenderedAssetAppearance extends GeneratedMessageLite<Common$RenderedAssetAppearance, C6475a> implements InterfaceC6674K {
    public static final int DARK_APPEARANCE_FIELD_NUMBER = 1;
    private static final Common$RenderedAssetAppearance DEFAULT_INSTANCE;
    public static final int LIGHT_APPEARANCE_FIELD_NUMBER = 2;
    private static volatile Parser<Common$RenderedAssetAppearance> PARSER;
    private int bitField0_;
    private Common$RenderedAsset darkAppearance_;
    private Common$RenderedAsset lightAppearance_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance$a */
    public static final class C6475a extends GeneratedMessageLite.Builder<Common$RenderedAssetAppearance, C6475a> implements InterfaceC6674K {
        public C6475a() {
            super(Common$RenderedAssetAppearance.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = new Common$RenderedAssetAppearance();
        DEFAULT_INSTANCE = common$RenderedAssetAppearance;
        GeneratedMessageLite.registerDefaultInstance(Common$RenderedAssetAppearance.class, common$RenderedAssetAppearance);
    }

    private Common$RenderedAssetAppearance() {
    }

    private void clearDarkAppearance() {
        this.darkAppearance_ = null;
        this.bitField0_ &= -2;
    }

    private void clearLightAppearance() {
        this.lightAppearance_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$RenderedAssetAppearance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDarkAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.darkAppearance_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == Common$RenderedAsset.getDefaultInstance()) {
            this.darkAppearance_ = common$RenderedAsset;
        } else {
            this.darkAppearance_ = Common$RenderedAsset.newBuilder(this.darkAppearance_).mergeFrom((Common$RenderedAsset.C6473a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeLightAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        Common$RenderedAsset common$RenderedAsset2 = this.lightAppearance_;
        if (common$RenderedAsset2 == null || common$RenderedAsset2 == Common$RenderedAsset.getDefaultInstance()) {
            this.lightAppearance_ = common$RenderedAsset;
        } else {
            this.lightAppearance_ = Common$RenderedAsset.newBuilder(this.lightAppearance_).mergeFrom((Common$RenderedAsset.C6473a) common$RenderedAsset).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6475a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$RenderedAssetAppearance parseDelimitedFrom(InputStream inputStream) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteBuffer byteBuffer) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$RenderedAssetAppearance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDarkAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.darkAppearance_ = common$RenderedAsset;
        this.bitField0_ |= 1;
    }

    private void setLightAppearance(Common$RenderedAsset common$RenderedAsset) {
        common$RenderedAsset.getClass();
        this.lightAppearance_ = common$RenderedAsset;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$RenderedAssetAppearance();
            case 2:
                return new C6475a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "darkAppearance_", "lightAppearance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$RenderedAssetAppearance> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$RenderedAssetAppearance.class) {
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

    public Common$RenderedAsset getDarkAppearance() {
        Common$RenderedAsset common$RenderedAsset = this.darkAppearance_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public Common$RenderedAsset getLightAppearance() {
        Common$RenderedAsset common$RenderedAsset = this.lightAppearance_;
        return common$RenderedAsset == null ? Common$RenderedAsset.getDefaultInstance() : common$RenderedAsset;
    }

    public boolean hasDarkAppearance() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLightAppearance() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6475a newBuilder(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        return DEFAULT_INSTANCE.createBuilder(common$RenderedAssetAppearance);
    }

    public static Common$RenderedAssetAppearance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteString byteString) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$RenderedAssetAppearance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(byte[] bArr) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$RenderedAssetAppearance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(InputStream inputStream) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$RenderedAssetAppearance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$RenderedAssetAppearance parseFrom(CodedInputStream codedInputStream) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$RenderedAssetAppearance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$RenderedAssetAppearance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
