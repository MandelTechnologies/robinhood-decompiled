package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$OAuthGuidance extends GeneratedMessageLite<Common$OAuthGuidance, C6448a> implements MessageLiteOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 2;
    private static final Common$OAuthGuidance DEFAULT_INSTANCE;
    public static final int GUIDANCE_CHECKLIST_ITEMS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Common$OAuthGuidance> PARSER;
    private int bitField0_;
    private String color_ = "";
    private Internal.ProtobufList<Common$AttributedLocalizedString> guidanceChecklistItems_ = GeneratedMessageLite.emptyProtobufList();
    private Common$LocalizedString name_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OAuthGuidance$a */
    public static final class C6448a extends GeneratedMessageLite.Builder<Common$OAuthGuidance, C6448a> implements MessageLiteOrBuilder {
        public C6448a() {
            super(Common$OAuthGuidance.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$OAuthGuidance common$OAuthGuidance = new Common$OAuthGuidance();
        DEFAULT_INSTANCE = common$OAuthGuidance;
        GeneratedMessageLite.registerDefaultInstance(Common$OAuthGuidance.class, common$OAuthGuidance);
    }

    private Common$OAuthGuidance() {
    }

    private void addAllGuidanceChecklistItems(Iterable<? extends Common$AttributedLocalizedString> iterable) {
        ensureGuidanceChecklistItemsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.guidanceChecklistItems_);
    }

    private void addGuidanceChecklistItems(int i, Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.add(i, common$AttributedLocalizedString);
    }

    private void clearColor() {
        this.color_ = getDefaultInstance().getColor();
    }

    private void clearGuidanceChecklistItems() {
        this.guidanceChecklistItems_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureGuidanceChecklistItemsIsMutable() {
        Internal.ProtobufList<Common$AttributedLocalizedString> protobufList = this.guidanceChecklistItems_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.guidanceChecklistItems_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$OAuthGuidance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeName(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.name_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.name_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.name_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6448a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$OAuthGuidance parseDelimitedFrom(InputStream inputStream) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OAuthGuidance parseFrom(ByteString byteString) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$OAuthGuidance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeGuidanceChecklistItems(int i) {
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.remove(i);
    }

    private void setColor(String str) {
        str.getClass();
        this.color_ = str;
    }

    private void setColorBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.color_ = byteString.toStringUtf8();
    }

    private void setGuidanceChecklistItems(int i, Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.set(i, common$AttributedLocalizedString);
    }

    private void setName(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.name_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$OAuthGuidance();
            case 2:
                return new C6448a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b", new Object[]{"bitField0_", "name_", "color_", "guidanceChecklistItems_", Common$AttributedLocalizedString.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$OAuthGuidance> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$OAuthGuidance.class) {
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

    public String getColor() {
        return this.color_;
    }

    public ByteString getColorBytes() {
        return ByteString.copyFromUtf8(this.color_);
    }

    public Common$AttributedLocalizedString getGuidanceChecklistItems(int i) {
        return this.guidanceChecklistItems_.get(i);
    }

    public int getGuidanceChecklistItemsCount() {
        return this.guidanceChecklistItems_.size();
    }

    public List<Common$AttributedLocalizedString> getGuidanceChecklistItemsList() {
        return this.guidanceChecklistItems_;
    }

    public InterfaceC6921l getGuidanceChecklistItemsOrBuilder(int i) {
        return this.guidanceChecklistItems_.get(i);
    }

    public List<? extends InterfaceC6921l> getGuidanceChecklistItemsOrBuilderList() {
        return this.guidanceChecklistItems_;
    }

    public Common$LocalizedString getName() {
        Common$LocalizedString common$LocalizedString = this.name_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addGuidanceChecklistItems(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        ensureGuidanceChecklistItemsIsMutable();
        this.guidanceChecklistItems_.add(common$AttributedLocalizedString);
    }

    public static C6448a newBuilder(Common$OAuthGuidance common$OAuthGuidance) {
        return DEFAULT_INSTANCE.createBuilder(common$OAuthGuidance);
    }

    public static Common$OAuthGuidance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OAuthGuidance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$OAuthGuidance parseFrom(CodedInputStream codedInputStream) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$OAuthGuidance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$OAuthGuidance parseFrom(InputStream inputStream) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OAuthGuidance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OAuthGuidance parseFrom(ByteBuffer byteBuffer) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$OAuthGuidance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$OAuthGuidance parseFrom(byte[] bArr) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$OAuthGuidance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OAuthGuidance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
