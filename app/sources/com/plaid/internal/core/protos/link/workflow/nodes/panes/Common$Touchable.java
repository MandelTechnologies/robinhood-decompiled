package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$FlexibleComponent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$Touchable extends GeneratedMessageLite<Common$Touchable, C6533a> implements MessageLiteOrBuilder {
    public static final int ACTION_OVERRIDE_FIELD_NUMBER = 2;
    public static final int COMPONENT_FIELD_NUMBER = 1;
    private static final Common$Touchable DEFAULT_INSTANCE;
    private static volatile Parser<Common$Touchable> PARSER;
    private Common$LocalAction actionOverride_;
    private int bitField0_;
    private Common$FlexibleComponent component_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Touchable$a */
    public static final class C6533a extends GeneratedMessageLite.Builder<Common$Touchable, C6533a> implements MessageLiteOrBuilder {
        public C6533a() {
            super(Common$Touchable.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Touchable common$Touchable = new Common$Touchable();
        DEFAULT_INSTANCE = common$Touchable;
        GeneratedMessageLite.registerDefaultInstance(Common$Touchable.class, common$Touchable);
    }

    private Common$Touchable() {
    }

    private void clearActionOverride() {
        this.actionOverride_ = null;
        this.bitField0_ &= -3;
    }

    private void clearComponent() {
        this.component_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$Touchable getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.actionOverride_;
        if (common$LocalAction2 != null && common$LocalAction2 != Common$LocalAction.getDefaultInstance()) {
            common$LocalAction = Common$LocalAction.newBuilder(this.actionOverride_).mergeFrom((Common$LocalAction.C6441b) common$LocalAction).buildPartial();
        }
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 2;
    }

    private void mergeComponent(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        Common$FlexibleComponent common$FlexibleComponent2 = this.component_;
        if (common$FlexibleComponent2 != null && common$FlexibleComponent2 != Common$FlexibleComponent.getDefaultInstance()) {
            common$FlexibleComponent = Common$FlexibleComponent.newBuilder(this.component_).mergeFrom((Common$FlexibleComponent.C6424a) common$FlexibleComponent).buildPartial();
        }
        this.component_ = common$FlexibleComponent;
        this.bitField0_ |= 1;
    }

    public static C6533a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Touchable parseDelimitedFrom(InputStream inputStream) {
        return (Common$Touchable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Touchable parseFrom(ByteString byteString) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Touchable> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setActionOverride(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.actionOverride_ = common$LocalAction;
        this.bitField0_ |= 2;
    }

    private void setComponent(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        this.component_ = common$FlexibleComponent;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Touchable();
            case 2:
                return new C6533a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "component_", "actionOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Touchable> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Touchable.class) {
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

    public Common$LocalAction getActionOverride() {
        Common$LocalAction common$LocalAction = this.actionOverride_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$FlexibleComponent getComponent() {
        Common$FlexibleComponent common$FlexibleComponent = this.component_;
        return common$FlexibleComponent == null ? Common$FlexibleComponent.getDefaultInstance() : common$FlexibleComponent;
    }

    public boolean hasActionOverride() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasComponent() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6533a newBuilder(Common$Touchable common$Touchable) {
        return DEFAULT_INSTANCE.createBuilder(common$Touchable);
    }

    public static Common$Touchable parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Touchable) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Touchable parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Touchable parseFrom(CodedInputStream codedInputStream) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Touchable parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Touchable parseFrom(InputStream inputStream) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Touchable parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Touchable parseFrom(ByteBuffer byteBuffer) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Touchable parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Touchable parseFrom(byte[] bArr) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Touchable parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Touchable) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
