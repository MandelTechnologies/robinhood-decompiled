package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes24.dex */
public final class Common$TemplatedKey extends GeneratedMessageLite<Common$TemplatedKey, C6505a> implements MessageLiteOrBuilder {
    private static final Common$TemplatedKey DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<Common$TemplatedKey> PARSER = null;
    public static final int REPLACEMENTS_FIELD_NUMBER = 2;
    private MapFieldLite<String, String> replacements_ = MapFieldLite.emptyMapField();
    private String key_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey$a */
    public static final class C6505a extends GeneratedMessageLite.Builder<Common$TemplatedKey, C6505a> implements MessageLiteOrBuilder {
        public C6505a() {
            super(Common$TemplatedKey.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey$b */
    public static final class C6506b {

        /* renamed from: a */
        public static final MapEntryLite<String, String> f2288a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f2288a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        Common$TemplatedKey common$TemplatedKey = new Common$TemplatedKey();
        DEFAULT_INSTANCE = common$TemplatedKey;
        GeneratedMessageLite.registerDefaultInstance(Common$TemplatedKey.class, common$TemplatedKey);
    }

    private Common$TemplatedKey() {
    }

    private void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    public static Common$TemplatedKey getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableReplacementsMap() {
        return internalGetMutableReplacements();
    }

    private MapFieldLite<String, String> internalGetMutableReplacements() {
        if (!this.replacements_.isMutable()) {
            this.replacements_ = this.replacements_.mutableCopy();
        }
        return this.replacements_;
    }

    private MapFieldLite<String, String> internalGetReplacements() {
        return this.replacements_;
    }

    public static C6505a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TemplatedKey parseDelimitedFrom(InputStream inputStream) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TemplatedKey parseFrom(ByteBuffer byteBuffer) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$TemplatedKey> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    private void setKeyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    public boolean containsReplacements(String str) {
        str.getClass();
        return internalGetReplacements().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TemplatedKey();
            case 2:
                return new C6505a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"key_", "replacements_", C6506b.f2288a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TemplatedKey> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TemplatedKey.class) {
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

    public String getKey() {
        return this.key_;
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    @Deprecated
    public Map<String, String> getReplacements() {
        return getReplacementsMap();
    }

    public int getReplacementsCount() {
        return internalGetReplacements().size();
    }

    public Map<String, String> getReplacementsMap() {
        return Collections.unmodifiableMap(internalGetReplacements());
    }

    public String getReplacementsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetReplacements = internalGetReplacements();
        return mapFieldLiteInternalGetReplacements.containsKey(str) ? mapFieldLiteInternalGetReplacements.get(str) : str2;
    }

    public String getReplacementsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetReplacements = internalGetReplacements();
        if (mapFieldLiteInternalGetReplacements.containsKey(str)) {
            return mapFieldLiteInternalGetReplacements.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static C6505a newBuilder(Common$TemplatedKey common$TemplatedKey) {
        return DEFAULT_INSTANCE.createBuilder(common$TemplatedKey);
    }

    public static Common$TemplatedKey parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TemplatedKey parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TemplatedKey parseFrom(ByteString byteString) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$TemplatedKey parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TemplatedKey parseFrom(byte[] bArr) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TemplatedKey parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$TemplatedKey parseFrom(InputStream inputStream) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TemplatedKey parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TemplatedKey parseFrom(CodedInputStream codedInputStream) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TemplatedKey parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TemplatedKey) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
