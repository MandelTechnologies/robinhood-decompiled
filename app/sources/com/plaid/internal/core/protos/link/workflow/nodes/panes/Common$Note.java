package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.EnumC7081g;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$Note extends GeneratedMessageLite<Common$Note, C6447a> implements MessageLiteOrBuilder {
    private static final Common$Note DEFAULT_INSTANCE;
    public static final int FIXED_WIDTH_FIELD_NUMBER = 3;
    public static final int ICON_FIELD_NUMBER = 6;
    private static volatile Parser<Common$Note> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 7;
    public static final int SMALL_SIZE_FIELD_NUMBER = 4;
    public static final int SOLID_FIELD_NUMBER = 5;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean fixedWidth_;
    private int icon_;
    private int size_;
    private boolean smallSize_;
    private boolean solid_;
    private Common$LocalizedString text_;
    private int type_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Note$a */
    public static final class C6447a extends GeneratedMessageLite.Builder<Common$Note, C6447a> implements MessageLiteOrBuilder {
        public C6447a() {
            super(Common$Note.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Note common$Note = new Common$Note();
        DEFAULT_INSTANCE = common$Note;
        GeneratedMessageLite.registerDefaultInstance(Common$Note.class, common$Note);
    }

    private Common$Note() {
    }

    private void clearFixedWidth() {
        this.fixedWidth_ = false;
    }

    private void clearIcon() {
        this.icon_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearSmallSize() {
        this.smallSize_ = false;
    }

    private void clearSolid() {
        this.solid_ = false;
    }

    private void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    private void clearType() {
        this.type_ = 0;
    }

    public static Common$Note getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.text_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.text_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6447a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Note parseDelimitedFrom(InputStream inputStream) {
        return (Common$Note) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Note parseFrom(ByteString byteString) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Note> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFixedWidth(boolean z) {
        this.fixedWidth_ = z;
    }

    private void setIcon(EnumC7081g enumC7081g) {
        this.icon_ = enumC7081g.getNumber();
    }

    private void setIconValue(int i) {
        this.icon_ = i;
    }

    private void setSize(EnumC6590D enumC6590D) {
        this.size_ = enumC6590D.getNumber();
    }

    private void setSizeValue(int i) {
        this.size_ = i;
    }

    private void setSmallSize(boolean z) {
        this.smallSize_ = z;
    }

    private void setSolid(boolean z) {
        this.solid_ = z;
    }

    private void setText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setType(EnumC6591E enumC6591E) {
        this.type_ = enumC6591E.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Note();
            case 2:
                return new C6447a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u0007\u0004\u0007\u0005\u0007\u0006\f\u0007\f", new Object[]{"bitField0_", "text_", "type_", "fixedWidth_", "smallSize_", "solid_", "icon_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Note> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Note.class) {
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

    public boolean getFixedWidth() {
        return this.fixedWidth_;
    }

    public EnumC7081g getIcon() {
        EnumC7081g enumC7081gForNumber = EnumC7081g.forNumber(this.icon_);
        return enumC7081gForNumber == null ? EnumC7081g.UNRECOGNIZED : enumC7081gForNumber;
    }

    public int getIconValue() {
        return this.icon_;
    }

    public EnumC6590D getSize() {
        EnumC6590D enumC6590DForNumber = EnumC6590D.forNumber(this.size_);
        return enumC6590DForNumber == null ? EnumC6590D.UNRECOGNIZED : enumC6590DForNumber;
    }

    public int getSizeValue() {
        return this.size_;
    }

    public boolean getSmallSize() {
        return this.smallSize_;
    }

    public boolean getSolid() {
        return this.solid_;
    }

    public Common$LocalizedString getText() {
        Common$LocalizedString common$LocalizedString = this.text_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public EnumC6591E getType() {
        EnumC6591E enumC6591EForNumber = EnumC6591E.forNumber(this.type_);
        return enumC6591EForNumber == null ? EnumC6591E.UNRECOGNIZED : enumC6591EForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6447a newBuilder(Common$Note common$Note) {
        return DEFAULT_INSTANCE.createBuilder(common$Note);
    }

    public static Common$Note parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Note parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Note parseFrom(CodedInputStream codedInputStream) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Note parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Note parseFrom(InputStream inputStream) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Note parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Note parseFrom(ByteBuffer byteBuffer) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Note parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Note parseFrom(byte[] bArr) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Note parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Note) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
