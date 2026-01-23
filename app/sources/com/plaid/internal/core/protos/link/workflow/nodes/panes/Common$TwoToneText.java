package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes24.dex */
public final class Common$TwoToneText extends GeneratedMessageLite<Common$TwoToneText, C6545b> implements MessageLiteOrBuilder {
    public static final int ASSETS_FIELD_NUMBER = 3;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Common$TwoToneText DEFAULT_INSTANCE;
    public static final int LEADING_FIELD_NUMBER = 1;
    private static volatile Parser<Common$TwoToneText> PARSER;
    private MapFieldLite<String, Common$RenderedAssetAppearance> assets_ = MapFieldLite.emptyMapField();
    private int bitField0_;
    private Common$LocalizedString content_;
    private Common$LocalizedString leading_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText$a */
    public static final class C6544a {

        /* renamed from: a */
        public static final MapEntryLite<String, Common$RenderedAssetAppearance> f2325a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Common$RenderedAssetAppearance.getDefaultInstance());
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TwoToneText$b */
    public static final class C6545b extends GeneratedMessageLite.Builder<Common$TwoToneText, C6545b> implements MessageLiteOrBuilder {
        public C6545b() {
            super(Common$TwoToneText.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$TwoToneText common$TwoToneText = new Common$TwoToneText();
        DEFAULT_INSTANCE = common$TwoToneText;
        GeneratedMessageLite.registerDefaultInstance(Common$TwoToneText.class, common$TwoToneText);
    }

    private Common$TwoToneText() {
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -3;
    }

    private void clearLeading() {
        this.leading_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$TwoToneText getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Common$RenderedAssetAppearance> getMutableAssetsMap() {
        return internalGetMutableAssets();
    }

    private MapFieldLite<String, Common$RenderedAssetAppearance> internalGetAssets() {
        return this.assets_;
    }

    private MapFieldLite<String, Common$RenderedAssetAppearance> internalGetMutableAssets() {
        if (!this.assets_.isMutable()) {
            this.assets_ = this.assets_.mutableCopy();
        }
        return this.assets_;
    }

    private void mergeContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.content_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.content_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void mergeLeading(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.leading_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.leading_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.leading_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6545b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TwoToneText parseDelimitedFrom(InputStream inputStream) {
        return (Common$TwoToneText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TwoToneText parseFrom(ByteString byteString) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$TwoToneText> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setLeading(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.leading_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public boolean containsAssets(String str) {
        str.getClass();
        return internalGetAssets().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TwoToneText();
            case 2:
                return new C6545b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00032", new Object[]{"bitField0_", "leading_", "content_", "assets_", C6544a.f2325a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TwoToneText> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TwoToneText.class) {
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

    @Deprecated
    public Map<String, Common$RenderedAssetAppearance> getAssets() {
        return getAssetsMap();
    }

    public int getAssetsCount() {
        return internalGetAssets().size();
    }

    public Map<String, Common$RenderedAssetAppearance> getAssetsMap() {
        return Collections.unmodifiableMap(internalGetAssets());
    }

    public Common$RenderedAssetAppearance getAssetsOrDefault(String str, Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        str.getClass();
        MapFieldLite<String, Common$RenderedAssetAppearance> mapFieldLiteInternalGetAssets = internalGetAssets();
        return mapFieldLiteInternalGetAssets.containsKey(str) ? mapFieldLiteInternalGetAssets.get(str) : common$RenderedAssetAppearance;
    }

    public Common$RenderedAssetAppearance getAssetsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Common$RenderedAssetAppearance> mapFieldLiteInternalGetAssets = internalGetAssets();
        if (mapFieldLiteInternalGetAssets.containsKey(str)) {
            return mapFieldLiteInternalGetAssets.get(str);
        }
        throw new IllegalArgumentException();
    }

    public Common$LocalizedString getContent() {
        Common$LocalizedString common$LocalizedString = this.content_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$LocalizedString getLeading() {
        Common$LocalizedString common$LocalizedString = this.leading_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLeading() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6545b newBuilder(Common$TwoToneText common$TwoToneText) {
        return DEFAULT_INSTANCE.createBuilder(common$TwoToneText);
    }

    public static Common$TwoToneText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TwoToneText) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TwoToneText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TwoToneText parseFrom(CodedInputStream codedInputStream) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TwoToneText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$TwoToneText parseFrom(InputStream inputStream) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TwoToneText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TwoToneText parseFrom(ByteBuffer byteBuffer) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$TwoToneText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TwoToneText parseFrom(byte[] bArr) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TwoToneText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TwoToneText) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
