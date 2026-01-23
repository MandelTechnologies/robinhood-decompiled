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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TemplatedKey;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes24.dex */
public final class Common$AttributedString extends GeneratedMessageLite<Common$AttributedString, C6392b> implements MessageLiteOrBuilder {
    public static final int ACTIONS_FIELD_NUMBER = 4;
    private static final Common$AttributedString DEFAULT_INSTANCE;
    public static final int HTML_ESCAPED_TRANSLATION_FIELD_NUMBER = 2;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<Common$AttributedString> PARSER = null;
    public static final int TEMPLATED_KEY_FIELD_NUMBER = 3;
    private Object keyOrTranslation_;
    private int keyOrTranslationCase_ = 0;
    private MapFieldLite<String, Common$LocalAction> actions_ = MapFieldLite.emptyMapField();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString$a */
    public static final class C6391a {

        /* renamed from: a */
        public static final MapEntryLite<String, Common$LocalAction> f2197a = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Common$LocalAction.getDefaultInstance());
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString$b */
    public static final class C6392b extends GeneratedMessageLite.Builder<Common$AttributedString, C6392b> implements MessageLiteOrBuilder {
        public C6392b() {
            super(Common$AttributedString.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedString$c */
    public enum EnumC6393c {
        KEY(1),
        HTML_ESCAPED_TRANSLATION(2),
        TEMPLATED_KEY(3),
        KEYORTRANSLATION_NOT_SET(0);


        /* renamed from: a */
        public final int f2199a;

        EnumC6393c(int i) {
            this.f2199a = i;
        }

        public static EnumC6393c forNumber(int i) {
            if (i == 0) {
                return KEYORTRANSLATION_NOT_SET;
            }
            if (i == 1) {
                return KEY;
            }
            if (i == 2) {
                return HTML_ESCAPED_TRANSLATION;
            }
            if (i != 3) {
                return null;
            }
            return TEMPLATED_KEY;
        }

        public int getNumber() {
            return this.f2199a;
        }

        @Deprecated
        public static EnumC6393c valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Common$AttributedString common$AttributedString = new Common$AttributedString();
        DEFAULT_INSTANCE = common$AttributedString;
        GeneratedMessageLite.registerDefaultInstance(Common$AttributedString.class, common$AttributedString);
    }

    private Common$AttributedString() {
    }

    private void clearHtmlEscapedTranslation() {
        if (this.keyOrTranslationCase_ == 2) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    private void clearKey() {
        if (this.keyOrTranslationCase_ == 1) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    private void clearKeyOrTranslation() {
        this.keyOrTranslationCase_ = 0;
        this.keyOrTranslation_ = null;
    }

    private void clearTemplatedKey() {
        if (this.keyOrTranslationCase_ == 3) {
            this.keyOrTranslationCase_ = 0;
            this.keyOrTranslation_ = null;
        }
    }

    public static Common$AttributedString getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Common$LocalAction> getMutableActionsMap() {
        return internalGetMutableActions();
    }

    private MapFieldLite<String, Common$LocalAction> internalGetActions() {
        return this.actions_;
    }

    private MapFieldLite<String, Common$LocalAction> internalGetMutableActions() {
        if (!this.actions_.isMutable()) {
            this.actions_ = this.actions_.mutableCopy();
        }
        return this.actions_;
    }

    private void mergeTemplatedKey(Common$TemplatedKey common$TemplatedKey) {
        common$TemplatedKey.getClass();
        if (this.keyOrTranslationCase_ != 3 || this.keyOrTranslation_ == Common$TemplatedKey.getDefaultInstance()) {
            this.keyOrTranslation_ = common$TemplatedKey;
        } else {
            this.keyOrTranslation_ = Common$TemplatedKey.newBuilder((Common$TemplatedKey) this.keyOrTranslation_).mergeFrom((Common$TemplatedKey.C6505a) common$TemplatedKey).buildPartial();
        }
        this.keyOrTranslationCase_ = 3;
    }

    public static C6392b newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$AttributedString parseDelimitedFrom(InputStream inputStream) {
        return (Common$AttributedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AttributedString parseFrom(ByteBuffer byteBuffer) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$AttributedString> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHtmlEscapedTranslation(String str) {
        str.getClass();
        this.keyOrTranslationCase_ = 2;
        this.keyOrTranslation_ = str;
    }

    private void setHtmlEscapedTranslationBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 2;
    }

    private void setKey(String str) {
        str.getClass();
        this.keyOrTranslationCase_ = 1;
        this.keyOrTranslation_ = str;
    }

    private void setKeyBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyOrTranslation_ = byteString.toStringUtf8();
        this.keyOrTranslationCase_ = 1;
    }

    private void setTemplatedKey(Common$TemplatedKey common$TemplatedKey) {
        common$TemplatedKey.getClass();
        this.keyOrTranslation_ = common$TemplatedKey;
        this.keyOrTranslationCase_ = 3;
    }

    public boolean containsActions(String str) {
        str.getClass();
        return internalGetActions().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$AttributedString();
            case 2:
                return new C6392b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003<\u0000\u00042", new Object[]{"keyOrTranslation_", "keyOrTranslationCase_", Common$TemplatedKey.class, "actions_", C6391a.f2197a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$AttributedString> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$AttributedString.class) {
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

    public EnumC6393c getKeyOrTranslationCase() {
        return EnumC6393c.forNumber(this.keyOrTranslationCase_);
    }

    public Common$TemplatedKey getTemplatedKey() {
        return this.keyOrTranslationCase_ == 3 ? (Common$TemplatedKey) this.keyOrTranslation_ : Common$TemplatedKey.getDefaultInstance();
    }

    public boolean hasHtmlEscapedTranslation() {
        return this.keyOrTranslationCase_ == 2;
    }

    public boolean hasKey() {
        return this.keyOrTranslationCase_ == 1;
    }

    public boolean hasTemplatedKey() {
        return this.keyOrTranslationCase_ == 3;
    }

    public static C6392b newBuilder(Common$AttributedString common$AttributedString) {
        return DEFAULT_INSTANCE.createBuilder(common$AttributedString);
    }

    public static Common$AttributedString parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedString) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AttributedString parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public String getHtmlEscapedTranslation() {
        return this.keyOrTranslationCase_ == 2 ? (String) this.keyOrTranslation_ : "";
    }

    public ByteString getHtmlEscapedTranslationBytes() {
        return ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 2 ? (String) this.keyOrTranslation_ : "");
    }

    public String getKey() {
        return this.keyOrTranslationCase_ == 1 ? (String) this.keyOrTranslation_ : "";
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.keyOrTranslationCase_ == 1 ? (String) this.keyOrTranslation_ : "");
    }

    public static Common$AttributedString parseFrom(ByteString byteString) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$AttributedString parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$AttributedString parseFrom(byte[] bArr) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$AttributedString parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$AttributedString parseFrom(InputStream inputStream) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$AttributedString parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$AttributedString parseFrom(CodedInputStream codedInputStream) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$AttributedString parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$AttributedString) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
