package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$TabularListRow extends GeneratedMessageLite<Common$TabularListRow, C6504a> implements InterfaceC6830T {
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int BUTTON_MODAL_FIELD_NUMBER = 4;
    private static final Common$TabularListRow DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 1;
    private static volatile Parser<Common$TabularListRow> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 2;
    private int bitField0_;
    private Common$Modal buttonModal_;
    private Common$ButtonContent button_;
    private Common$AttributedLocalizedString label_;
    private Internal.ProtobufList<Common$AttributedLocalizedString> values_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TabularListRow$a */
    public static final class C6504a extends GeneratedMessageLite.Builder<Common$TabularListRow, C6504a> implements InterfaceC6830T {
        public C6504a() {
            super(Common$TabularListRow.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$TabularListRow common$TabularListRow = new Common$TabularListRow();
        DEFAULT_INSTANCE = common$TabularListRow;
        GeneratedMessageLite.registerDefaultInstance(Common$TabularListRow.class, common$TabularListRow);
    }

    private Common$TabularListRow() {
    }

    private void addAllValues(Iterable<? extends Common$AttributedLocalizedString> iterable) {
        ensureValuesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.values_);
    }

    private void addValues(int i, Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, common$AttributedLocalizedString);
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -3;
    }

    private void clearButtonModal() {
        this.buttonModal_ = null;
        this.bitField0_ &= -5;
    }

    private void clearLabel() {
        this.label_ = null;
        this.bitField0_ &= -2;
    }

    private void clearValues() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        Internal.ProtobufList<Common$AttributedLocalizedString> protobufList = this.values_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.values_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$TabularListRow getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 2;
    }

    private void mergeButtonModal(Common$Modal common$Modal) {
        common$Modal.getClass();
        Common$Modal common$Modal2 = this.buttonModal_;
        if (common$Modal2 != null && common$Modal2 != Common$Modal.getDefaultInstance()) {
            common$Modal = Common$Modal.newBuilder(this.buttonModal_).mergeFrom((Common$Modal.C6446a) common$Modal).buildPartial();
        }
        this.buttonModal_ = common$Modal;
        this.bitField0_ |= 4;
    }

    private void mergeLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.label_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.label_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.label_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6504a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TabularListRow parseDelimitedFrom(InputStream inputStream) {
        return (Common$TabularListRow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TabularListRow parseFrom(ByteString byteString) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$TabularListRow> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    private void setButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 2;
    }

    private void setButtonModal(Common$Modal common$Modal) {
        common$Modal.getClass();
        this.buttonModal_ = common$Modal;
        this.bitField0_ |= 4;
    }

    private void setLabel(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.label_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    private void setValues(int i, Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, common$AttributedLocalizedString);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TabularListRow();
            case 2:
                return new C6504a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "label_", "values_", Common$AttributedLocalizedString.class, "button_", "buttonModal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TabularListRow> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TabularListRow.class) {
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

    public Common$Modal getButtonModal() {
        Common$Modal common$Modal = this.buttonModal_;
        return common$Modal == null ? Common$Modal.getDefaultInstance() : common$Modal;
    }

    public Common$AttributedLocalizedString getLabel() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.label_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$AttributedLocalizedString getValues(int i) {
        return this.values_.get(i);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Common$AttributedLocalizedString> getValuesList() {
        return this.values_;
    }

    public InterfaceC6921l getValuesOrBuilder(int i) {
        return this.values_.get(i);
    }

    public List<? extends InterfaceC6921l> getValuesOrBuilderList() {
        return this.values_;
    }

    public boolean hasButton() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasButtonModal() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 1) != 0;
    }

    private void addValues(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        ensureValuesIsMutable();
        this.values_.add(common$AttributedLocalizedString);
    }

    public static C6504a newBuilder(Common$TabularListRow common$TabularListRow) {
        return DEFAULT_INSTANCE.createBuilder(common$TabularListRow);
    }

    public static Common$TabularListRow parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularListRow) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TabularListRow parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TabularListRow parseFrom(CodedInputStream codedInputStream) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TabularListRow parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$TabularListRow parseFrom(InputStream inputStream) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TabularListRow parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TabularListRow parseFrom(ByteBuffer byteBuffer) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$TabularListRow parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TabularListRow parseFrom(byte[] bArr) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TabularListRow parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TabularListRow) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
