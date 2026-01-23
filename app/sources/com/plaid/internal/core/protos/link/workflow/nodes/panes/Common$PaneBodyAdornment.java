package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$PaneBodyAdornment extends GeneratedMessageLite<Common$PaneBodyAdornment, C6457a> implements MessageLiteOrBuilder {
    public static final int BUTTON_FIELD_NUMBER = 4;
    private static final Common$PaneBodyAdornment DEFAULT_INSTANCE;
    public static final int FIRST_LINE_CONTENT_FIELD_NUMBER = 1;
    public static final int ICON_FIELD_NUMBER = 3;
    public static final int OVERLAPPING_ICONS_FIELD_NUMBER = 5;
    private static volatile Parser<Common$PaneBodyAdornment> PARSER = null;
    public static final int SECOND_LINE_CONTENT_FIELD_NUMBER = 2;
    private int bitField0_;
    private Common$ButtonContent button_;
    private Common$TextContent firstLineContent_;
    private Common$RenderedAssetAppearance icon_;
    private OverlappingIcons overlappingIcons_;
    private Common$TextContent secondLineContent_;

    public static final class OverlappingIcons extends GeneratedMessageLite<OverlappingIcons, C6456a> implements MessageLiteOrBuilder {
        private static final OverlappingIcons DEFAULT_INSTANCE;
        public static final int ICONS_FIELD_NUMBER = 1;
        private static volatile Parser<OverlappingIcons> PARSER;
        private Internal.ProtobufList<Common$RenderedAssetAppearance> icons_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment$OverlappingIcons$a */
        public static final class C6456a extends GeneratedMessageLite.Builder<OverlappingIcons, C6456a> implements MessageLiteOrBuilder {
            public C6456a() {
                super(OverlappingIcons.DEFAULT_INSTANCE);
            }
        }

        static {
            OverlappingIcons overlappingIcons = new OverlappingIcons();
            DEFAULT_INSTANCE = overlappingIcons;
            GeneratedMessageLite.registerDefaultInstance(OverlappingIcons.class, overlappingIcons);
        }

        private OverlappingIcons() {
        }

        private void addAllIcons(Iterable<? extends Common$RenderedAssetAppearance> iterable) {
            ensureIconsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.icons_);
        }

        private void addIcons(int i, Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            ensureIconsIsMutable();
            this.icons_.add(i, common$RenderedAssetAppearance);
        }

        private void clearIcons() {
            this.icons_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureIconsIsMutable() {
            Internal.ProtobufList<Common$RenderedAssetAppearance> protobufList = this.icons_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.icons_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static OverlappingIcons getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6456a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OverlappingIcons parseDelimitedFrom(InputStream inputStream) {
            return (OverlappingIcons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OverlappingIcons parseFrom(ByteString byteString) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<OverlappingIcons> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeIcons(int i) {
            ensureIconsIsMutable();
            this.icons_.remove(i);
        }

        private void setIcons(int i, Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            ensureIconsIsMutable();
            this.icons_.set(i, common$RenderedAssetAppearance);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OverlappingIcons();
                case 2:
                    return new C6456a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"icons_", Common$RenderedAssetAppearance.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OverlappingIcons> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OverlappingIcons.class) {
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

        public Common$RenderedAssetAppearance getIcons(int i) {
            return this.icons_.get(i);
        }

        public int getIconsCount() {
            return this.icons_.size();
        }

        public List<Common$RenderedAssetAppearance> getIconsList() {
            return this.icons_;
        }

        public InterfaceC6674K getIconsOrBuilder(int i) {
            return this.icons_.get(i);
        }

        public List<? extends InterfaceC6674K> getIconsOrBuilderList() {
            return this.icons_;
        }

        private void addIcons(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            ensureIconsIsMutable();
            this.icons_.add(common$RenderedAssetAppearance);
        }

        public static C6456a newBuilder(OverlappingIcons overlappingIcons) {
            return DEFAULT_INSTANCE.createBuilder(overlappingIcons);
        }

        public static OverlappingIcons parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingIcons) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OverlappingIcons parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OverlappingIcons parseFrom(CodedInputStream codedInputStream) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OverlappingIcons parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static OverlappingIcons parseFrom(InputStream inputStream) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OverlappingIcons parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OverlappingIcons parseFrom(ByteBuffer byteBuffer) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static OverlappingIcons parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OverlappingIcons parseFrom(byte[] bArr) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OverlappingIcons parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OverlappingIcons) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PaneBodyAdornment$a */
    public static final class C6457a extends GeneratedMessageLite.Builder<Common$PaneBodyAdornment, C6457a> implements MessageLiteOrBuilder {
        public C6457a() {
            super(Common$PaneBodyAdornment.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$PaneBodyAdornment common$PaneBodyAdornment = new Common$PaneBodyAdornment();
        DEFAULT_INSTANCE = common$PaneBodyAdornment;
        GeneratedMessageLite.registerDefaultInstance(Common$PaneBodyAdornment.class, common$PaneBodyAdornment);
    }

    private Common$PaneBodyAdornment() {
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -9;
    }

    private void clearFirstLineContent() {
        this.firstLineContent_ = null;
        this.bitField0_ &= -2;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -5;
    }

    private void clearOverlappingIcons() {
        this.overlappingIcons_ = null;
        this.bitField0_ &= -17;
    }

    private void clearSecondLineContent() {
        this.secondLineContent_ = null;
        this.bitField0_ &= -3;
    }

    public static Common$PaneBodyAdornment getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    private void mergeFirstLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        Common$TextContent common$TextContent2 = this.firstLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder(this.firstLineContent_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 1;
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

    private void mergeOverlappingIcons(OverlappingIcons overlappingIcons) {
        overlappingIcons.getClass();
        OverlappingIcons overlappingIcons2 = this.overlappingIcons_;
        if (overlappingIcons2 != null && overlappingIcons2 != OverlappingIcons.getDefaultInstance()) {
            overlappingIcons = OverlappingIcons.newBuilder(this.overlappingIcons_).mergeFrom((OverlappingIcons.C6456a) overlappingIcons).buildPartial();
        }
        this.overlappingIcons_ = overlappingIcons;
        this.bitField0_ |= 16;
    }

    private void mergeSecondLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        Common$TextContent common$TextContent2 = this.secondLineContent_;
        if (common$TextContent2 != null && common$TextContent2 != Common$TextContent.getDefaultInstance()) {
            common$TextContent = Common$TextContent.newBuilder(this.secondLineContent_).mergeFrom((Common$TextContent.C6509c) common$TextContent).buildPartial();
        }
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    public static C6457a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$PaneBodyAdornment parseDelimitedFrom(InputStream inputStream) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneBodyAdornment parseFrom(ByteString byteString) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$PaneBodyAdornment> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    private void setFirstLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.firstLineContent_ = common$TextContent;
        this.bitField0_ |= 1;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 4;
    }

    private void setOverlappingIcons(OverlappingIcons overlappingIcons) {
        overlappingIcons.getClass();
        this.overlappingIcons_ = overlappingIcons;
        this.bitField0_ |= 16;
    }

    private void setSecondLineContent(Common$TextContent common$TextContent) {
        common$TextContent.getClass();
        this.secondLineContent_ = common$TextContent;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$PaneBodyAdornment();
            case 2:
                return new C6457a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "firstLineContent_", "secondLineContent_", "icon_", "button_", "overlappingIcons_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$PaneBodyAdornment> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$PaneBodyAdornment.class) {
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

    public Common$ButtonContent getButton() {
        Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public Common$TextContent getFirstLineContent() {
        Common$TextContent common$TextContent = this.firstLineContent_;
        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public OverlappingIcons getOverlappingIcons() {
        OverlappingIcons overlappingIcons = this.overlappingIcons_;
        return overlappingIcons == null ? OverlappingIcons.getDefaultInstance() : overlappingIcons;
    }

    public Common$TextContent getSecondLineContent() {
        Common$TextContent common$TextContent = this.secondLineContent_;
        return common$TextContent == null ? Common$TextContent.getDefaultInstance() : common$TextContent;
    }

    public boolean hasButton() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFirstLineContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOverlappingIcons() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSecondLineContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6457a newBuilder(Common$PaneBodyAdornment common$PaneBodyAdornment) {
        return DEFAULT_INSTANCE.createBuilder(common$PaneBodyAdornment);
    }

    public static Common$PaneBodyAdornment parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneBodyAdornment parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$PaneBodyAdornment parseFrom(CodedInputStream codedInputStream) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$PaneBodyAdornment parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$PaneBodyAdornment parseFrom(InputStream inputStream) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$PaneBodyAdornment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$PaneBodyAdornment parseFrom(ByteBuffer byteBuffer) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$PaneBodyAdornment parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$PaneBodyAdornment parseFrom(byte[] bArr) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$PaneBodyAdornment parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$PaneBodyAdornment) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
