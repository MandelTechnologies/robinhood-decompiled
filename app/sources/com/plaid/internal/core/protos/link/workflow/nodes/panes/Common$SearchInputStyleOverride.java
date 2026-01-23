package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int64Value;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.StringValue;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$SearchInputStyleOverride extends GeneratedMessageLite<Common$SearchInputStyleOverride, C6493a> implements MessageLiteOrBuilder {
    public static final int ACTIVE_BORDER_COLOR_FIELD_NUMBER = 2;
    public static final int BORDER_RADIUS_FIELD_NUMBER = 1;
    private static final Common$SearchInputStyleOverride DEFAULT_INSTANCE;
    private static volatile Parser<Common$SearchInputStyleOverride> PARSER;
    private StringValue activeBorderColor_;
    private int bitField0_;
    private Int64Value borderRadius_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SearchInputStyleOverride$a */
    public static final class C6493a extends GeneratedMessageLite.Builder<Common$SearchInputStyleOverride, C6493a> implements MessageLiteOrBuilder {
        public C6493a() {
            super(Common$SearchInputStyleOverride.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SearchInputStyleOverride common$SearchInputStyleOverride = new Common$SearchInputStyleOverride();
        DEFAULT_INSTANCE = common$SearchInputStyleOverride;
        GeneratedMessageLite.registerDefaultInstance(Common$SearchInputStyleOverride.class, common$SearchInputStyleOverride);
    }

    private Common$SearchInputStyleOverride() {
    }

    private void clearActiveBorderColor() {
        this.activeBorderColor_ = null;
        this.bitField0_ &= -3;
    }

    private void clearBorderRadius() {
        this.borderRadius_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$SearchInputStyleOverride getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeActiveBorderColor(StringValue stringValue) {
        stringValue.getClass();
        StringValue stringValue2 = this.activeBorderColor_;
        if (stringValue2 == null || stringValue2 == StringValue.getDefaultInstance()) {
            this.activeBorderColor_ = stringValue;
        } else {
            this.activeBorderColor_ = StringValue.newBuilder(this.activeBorderColor_).mergeFrom((StringValue.Builder) stringValue).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeBorderRadius(Int64Value int64Value) {
        int64Value.getClass();
        Int64Value int64Value2 = this.borderRadius_;
        if (int64Value2 == null || int64Value2 == Int64Value.getDefaultInstance()) {
            this.borderRadius_ = int64Value;
        } else {
            this.borderRadius_ = Int64Value.newBuilder(this.borderRadius_).mergeFrom((Int64Value.Builder) int64Value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6493a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SearchInputStyleOverride parseDelimitedFrom(InputStream inputStream) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SearchInputStyleOverride parseFrom(ByteBuffer byteBuffer) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SearchInputStyleOverride> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setActiveBorderColor(StringValue stringValue) {
        stringValue.getClass();
        this.activeBorderColor_ = stringValue;
        this.bitField0_ |= 2;
    }

    private void setBorderRadius(Int64Value int64Value) {
        int64Value.getClass();
        this.borderRadius_ = int64Value;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SearchInputStyleOverride();
            case 2:
                return new C6493a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "borderRadius_", "activeBorderColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SearchInputStyleOverride> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SearchInputStyleOverride.class) {
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

    public StringValue getActiveBorderColor() {
        StringValue stringValue = this.activeBorderColor_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    public Int64Value getBorderRadius() {
        Int64Value int64Value = this.borderRadius_;
        return int64Value == null ? Int64Value.getDefaultInstance() : int64Value;
    }

    public boolean hasActiveBorderColor() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBorderRadius() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6493a newBuilder(Common$SearchInputStyleOverride common$SearchInputStyleOverride) {
        return DEFAULT_INSTANCE.createBuilder(common$SearchInputStyleOverride);
    }

    public static Common$SearchInputStyleOverride parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SearchInputStyleOverride parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SearchInputStyleOverride parseFrom(ByteString byteString) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$SearchInputStyleOverride parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SearchInputStyleOverride parseFrom(byte[] bArr) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SearchInputStyleOverride parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SearchInputStyleOverride parseFrom(InputStream inputStream) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SearchInputStyleOverride parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SearchInputStyleOverride parseFrom(CodedInputStream codedInputStream) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SearchInputStyleOverride parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SearchInputStyleOverride) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
