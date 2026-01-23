package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes24.dex */
public final class Common$AttributedLocalizedString extends GeneratedMessageLite<Common$AttributedLocalizedString, C6390c> implements InterfaceC6921l {
    public static final int ACTIONS_FIELD_NUMBER = 2;
    public static final int ASSETS_FIELD_NUMBER = 3;
    private static final Common$AttributedLocalizedString DEFAULT_INSTANCE;
    public static final int LOCALIZED_STRING_FIELD_NUMBER = 1;
    private static volatile Parser<Common$AttributedLocalizedString> PARSER;
    private MapFieldLite<String, Common$LocalAction> actions_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, Common$RenderedAssetAppearance> assets_ = MapFieldLite.emptyMapField();
    private int bitField0_;
    private Common$LocalizedString localizedString_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString$a */
    public static final class C6388a {

        /* renamed from: a */
        public static final MapEntryLite<String, Common$LocalAction> f2195a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Common$LocalAction.getDefaultInstance());
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString$b */
    public static final class C6389b {

        /* renamed from: a */
        public static final MapEntryLite<String, Common$RenderedAssetAppearance> f2196a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Common$RenderedAssetAppearance.getDefaultInstance());
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString$c */
    public static final class C6390c extends GeneratedMessageLite.Builder<Common$AttributedLocalizedString, C6390c> implements InterfaceC6921l {
        public C6390c() {
            super(Common$AttributedLocalizedString.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$AttributedLocalizedString common$AttributedLocalizedString = new Common$AttributedLocalizedString();
        DEFAULT_INSTANCE = common$AttributedLocalizedString;
        GeneratedMessageLite.registerDefaultInstance(Common$AttributedLocalizedString.class, common$AttributedLocalizedString);
    }

    private Common$AttributedLocalizedString() {
    }

    private void clearLocalizedString() {
        this.localizedString_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$AttributedLocalizedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Common$LocalAction> getMutableActionsMap() {
        return internalGetMutableActions();
    }

    private Map<String, Common$RenderedAssetAppearance> getMutableAssetsMap() {
        return internalGetMutableAssets();
    }

    private MapFieldLite<String, Common$LocalAction> internalGetActions() {
        return this.actions_;
    }

    private MapFieldLite<String, Common$RenderedAssetAppearance> internalGetAssets() {
        return this.assets_;
    }

    private MapFieldLite<String, Common$LocalAction> internalGetMutableActions() {
        if (!this.actions_.isMutable()) {
            this.actions_ = this.actions_.mutableCopy();
        }
        return this.actions_;
    }

    private MapFieldLite<String, Common$RenderedAssetAppearance> internalGetMutableAssets() {
        if (!this.assets_.isMutable()) {
            this.assets_ = this.assets_.mutableCopy();
        }
        return this.assets_;
    }

    private void mergeLocalizedString(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.localizedString_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.localizedString_ = common$LocalizedString;
        } else {
            this.localizedString_ = Common$LocalizedString.newBuilder(this.localizedString_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6390c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$AttributedLocalizedString parseDelimitedFrom(InputStream inputStream) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteBuffer byteBuffer) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$AttributedLocalizedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLocalizedString(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.localizedString_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public boolean containsActions(String str) {
        str.getClass();
        return internalGetActions().containsKey(str);
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
                return new Common$AttributedLocalizedString();
            case 2:
                return new C6390c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u0001ဉ\u0000\u00022\u00032", new Object[]{"bitField0_", "localizedString_", "actions_", C6388a.f2195a, "assets_", C6389b.f2196a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$AttributedLocalizedString> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$AttributedLocalizedString.class) {
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
    public Map<String, Common$LocalAction> getActions() {
        return getActionsMap();
    }

    public int getActionsCount() {
        return internalGetActions().size();
    }

    public Map<String, Common$LocalAction> getActionsMap() {
        return Collections.unmodifiableMap(internalGetActions());
    }

    public Common$LocalAction getActionsOrDefault(String str, Common$LocalAction common$LocalAction) {
        str.getClass();
        MapFieldLite<String, Common$LocalAction> mapFieldLiteInternalGetActions = internalGetActions();
        return mapFieldLiteInternalGetActions.containsKey(str) ? mapFieldLiteInternalGetActions.get(str) : common$LocalAction;
    }

    public Common$LocalAction getActionsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, Common$LocalAction> mapFieldLiteInternalGetActions = internalGetActions();
        if (mapFieldLiteInternalGetActions.containsKey(str)) {
            return mapFieldLiteInternalGetActions.get(str);
        }
        throw new IllegalArgumentException();
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

    public Common$LocalizedString getLocalizedString() {
        Common$LocalizedString common$LocalizedString = this.localizedString_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasLocalizedString() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6390c newBuilder(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        return DEFAULT_INSTANCE.createBuilder(common$AttributedLocalizedString);
    }

    public static Common$AttributedLocalizedString parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteString byteString) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$AttributedLocalizedString parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(byte[] bArr) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$AttributedLocalizedString parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(InputStream inputStream) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AttributedLocalizedString parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AttributedLocalizedString parseFrom(CodedInputStream codedInputStream) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$AttributedLocalizedString parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedLocalizedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
