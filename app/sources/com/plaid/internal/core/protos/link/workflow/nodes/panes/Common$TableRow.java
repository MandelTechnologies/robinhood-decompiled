package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$TableRow extends GeneratedMessageLite<Common$TableRow, C6502a> implements InterfaceC6786Q {
    private static final Common$TableRow DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 4;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile Parser<Common$TableRow> PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 3;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Common$RenderedAssetAppearance icon_;
    private Common$LocalizedString label_;
    private int style_;
    private Common$LocalizedString value_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TableRow$a */
    public static final class C6502a extends GeneratedMessageLite.Builder<Common$TableRow, C6502a> implements InterfaceC6786Q {
        public C6502a() {
            super(Common$TableRow.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$TableRow common$TableRow = new Common$TableRow();
        DEFAULT_INSTANCE = common$TableRow;
        GeneratedMessageLite.registerDefaultInstance(Common$TableRow.class, common$TableRow);
    }

    private Common$TableRow() {
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -5;
    }

    private void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -2;
    }

    private void clearStyle() {
        this.style_ = 0;
    }

    private void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$TableRow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 4;
    }

    private void mergeLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.label_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.label_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void mergeValue(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.value_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.value_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.value_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    public static C6502a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TableRow parseDelimitedFrom(InputStream inputStream) {
        return (Common$TableRow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TableRow parseFrom(ByteString byteString) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$TableRow> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 4;
    }

    private void setLabel(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.label_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    private void setStyle(EnumC6797S enumC6797S) {
        this.style_ = enumC6797S.getNumber();
    }

    private void setStyleValue(int i) {
        this.style_ = i;
    }

    private void setValue(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.value_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TableRow();
            case 2:
                return new C6502a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004ဉ\u0002", new Object[]{"bitField0_", "label_", "value_", "style_", "icon_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TableRow> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TableRow.class) {
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

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$LocalizedString getLabel() {
        Common$LocalizedString common$LocalizedString = this.label_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public EnumC6797S getStyle() {
        EnumC6797S enumC6797SForNumber = EnumC6797S.forNumber(this.style_);
        return enumC6797SForNumber == null ? EnumC6797S.UNRECOGNIZED : enumC6797SForNumber;
    }

    public int getStyleValue() {
        return this.style_;
    }

    public Common$LocalizedString getValue() {
        Common$LocalizedString common$LocalizedString = this.value_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6502a newBuilder(Common$TableRow common$TableRow) {
        return DEFAULT_INSTANCE.createBuilder(common$TableRow);
    }

    public static Common$TableRow parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TableRow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TableRow parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TableRow parseFrom(CodedInputStream codedInputStream) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TableRow parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$TableRow parseFrom(InputStream inputStream) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TableRow parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TableRow parseFrom(ByteBuffer byteBuffer) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$TableRow parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TableRow parseFrom(byte[] bArr) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TableRow parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TableRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
