package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AutoSubmitConfiguration;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PhoneInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInput;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$Prompt extends GeneratedMessageLite<Common$Prompt, C6469a> implements InterfaceC6673J {
    public static final int ATTRIBUTED_TEXT_FIELD_NUMBER = 3;
    public static final int AUTO_SUBMIT_CONFIGURATION_FIELD_NUMBER = 6;
    private static final Common$Prompt DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 8;
    public static final int INPUT_FIELD_NUMBER = 2;
    public static final int NOTE_TEXT_FIELD_NUMBER = 4;
    private static volatile Parser<Common$Prompt> PARSER = null;
    public static final int PHONE_INPUT_FIELD_NUMBER = 5;
    public static final int SEGMENTED_INPUT_FIELD_NUMBER = 7;
    public static final int TEXT_FIELD_NUMBER = 1;
    private Common$AttributedLocalizedString attributedText_;
    private Common$AutoSubmitConfiguration autoSubmitConfiguration_;
    private int bitField0_;
    private Common$LocalizedString errorMessage_;
    private Common$TextInput input_;
    private Common$AttributedLocalizedString noteText_;
    private Common$PhoneInput phoneInput_;
    private Common$SegmentedInput segmentedInput_;
    private Common$LocalizedString text_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Prompt$a */
    public static final class C6469a extends GeneratedMessageLite.Builder<Common$Prompt, C6469a> implements InterfaceC6673J {
        public C6469a() {
            super(Common$Prompt.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Prompt common$Prompt = new Common$Prompt();
        DEFAULT_INSTANCE = common$Prompt;
        GeneratedMessageLite.registerDefaultInstance(Common$Prompt.class, common$Prompt);
    }

    private Common$Prompt() {
    }

    private void clearAttributedText() {
        this.attributedText_ = null;
        this.bitField0_ &= -17;
    }

    private void clearAutoSubmitConfiguration() {
        this.autoSubmitConfiguration_ = null;
        this.bitField0_ &= -65;
    }

    private void clearErrorMessage() {
        this.errorMessage_ = null;
        this.bitField0_ &= -129;
    }

    private void clearInput() {
        this.input_ = null;
        this.bitField0_ &= -3;
    }

    private void clearNoteText() {
        this.noteText_ = null;
        this.bitField0_ &= -33;
    }

    private void clearPhoneInput() {
        this.phoneInput_ = null;
        this.bitField0_ &= -5;
    }

    private void clearSegmentedInput() {
        this.segmentedInput_ = null;
        this.bitField0_ &= -9;
    }

    private void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$Prompt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.attributedText_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
            this.attributedText_ = common$AttributedLocalizedString;
        } else {
            this.attributedText_ = Common$AttributedLocalizedString.newBuilder(this.attributedText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    private void mergeAutoSubmitConfiguration(Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
        common$AutoSubmitConfiguration.getClass();
        Common$AutoSubmitConfiguration common$AutoSubmitConfiguration2 = this.autoSubmitConfiguration_;
        if (common$AutoSubmitConfiguration2 == null || common$AutoSubmitConfiguration2 == Common$AutoSubmitConfiguration.getDefaultInstance()) {
            this.autoSubmitConfiguration_ = common$AutoSubmitConfiguration;
        } else {
            this.autoSubmitConfiguration_ = Common$AutoSubmitConfiguration.newBuilder(this.autoSubmitConfiguration_).mergeFrom((Common$AutoSubmitConfiguration.C6397c) common$AutoSubmitConfiguration).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    private void mergeErrorMessage(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.errorMessage_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.errorMessage_ = common$LocalizedString;
        } else {
            this.errorMessage_ = Common$LocalizedString.newBuilder(this.errorMessage_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    private void mergeInput(Common$TextInput common$TextInput) {
        common$TextInput.getClass();
        Common$TextInput common$TextInput2 = this.input_;
        if (common$TextInput2 == null || common$TextInput2 == Common$TextInput.getDefaultInstance()) {
            this.input_ = common$TextInput;
        } else {
            this.input_ = Common$TextInput.newBuilder(this.input_).mergeFrom((Common$TextInput.C6517b) common$TextInput).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeNoteText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.noteText_;
        if (common$AttributedLocalizedString2 == null || common$AttributedLocalizedString2 == Common$AttributedLocalizedString.getDefaultInstance()) {
            this.noteText_ = common$AttributedLocalizedString;
        } else {
            this.noteText_ = Common$AttributedLocalizedString.newBuilder(this.noteText_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    private void mergePhoneInput(Common$PhoneInput common$PhoneInput) {
        common$PhoneInput.getClass();
        Common$PhoneInput common$PhoneInput2 = this.phoneInput_;
        if (common$PhoneInput2 == null || common$PhoneInput2 == Common$PhoneInput.getDefaultInstance()) {
            this.phoneInput_ = common$PhoneInput;
        } else {
            this.phoneInput_ = Common$PhoneInput.newBuilder(this.phoneInput_).mergeFrom((Common$PhoneInput.C6463a) common$PhoneInput).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeSegmentedInput(Common$SegmentedInput common$SegmentedInput) {
        common$SegmentedInput.getClass();
        Common$SegmentedInput common$SegmentedInput2 = this.segmentedInput_;
        if (common$SegmentedInput2 == null || common$SegmentedInput2 == Common$SegmentedInput.getDefaultInstance()) {
            this.segmentedInput_ = common$SegmentedInput;
        } else {
            this.segmentedInput_ = Common$SegmentedInput.newBuilder(this.segmentedInput_).mergeFrom((Common$SegmentedInput.C6494a) common$SegmentedInput).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.text_;
        if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
            this.text_ = common$LocalizedString;
        } else {
            this.text_ = Common$LocalizedString.newBuilder(this.text_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6469a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Prompt parseDelimitedFrom(InputStream inputStream) {
        return (Common$Prompt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Prompt parseFrom(ByteBuffer byteBuffer) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$Prompt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAttributedText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.attributedText_ = common$AttributedLocalizedString;
        this.bitField0_ |= 16;
    }

    private void setAutoSubmitConfiguration(Common$AutoSubmitConfiguration common$AutoSubmitConfiguration) {
        common$AutoSubmitConfiguration.getClass();
        this.autoSubmitConfiguration_ = common$AutoSubmitConfiguration;
        this.bitField0_ |= 64;
    }

    private void setErrorMessage(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.errorMessage_ = common$LocalizedString;
        this.bitField0_ |= 128;
    }

    private void setInput(Common$TextInput common$TextInput) {
        common$TextInput.getClass();
        this.input_ = common$TextInput;
        this.bitField0_ |= 2;
    }

    private void setNoteText(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.noteText_ = common$AttributedLocalizedString;
        this.bitField0_ |= 32;
    }

    private void setPhoneInput(Common$PhoneInput common$PhoneInput) {
        common$PhoneInput.getClass();
        this.phoneInput_ = common$PhoneInput;
        this.bitField0_ |= 4;
    }

    private void setSegmentedInput(Common$SegmentedInput common$SegmentedInput) {
        common$SegmentedInput.getClass();
        this.segmentedInput_ = common$SegmentedInput;
        this.bitField0_ |= 8;
    }

    private void setText(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.text_ = common$LocalizedString;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Prompt();
            case 2:
                return new C6469a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0004\u0004ဉ\u0005\u0005ဉ\u0002\u0006ဉ\u0006\u0007ဉ\u0003\bဉ\u0007", new Object[]{"bitField0_", "text_", "input_", "attributedText_", "noteText_", "phoneInput_", "autoSubmitConfiguration_", "segmentedInput_", "errorMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Prompt> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Prompt.class) {
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

    public Common$AttributedLocalizedString getAttributedText() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.attributedText_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$AutoSubmitConfiguration getAutoSubmitConfiguration() {
        Common$AutoSubmitConfiguration common$AutoSubmitConfiguration = this.autoSubmitConfiguration_;
        return common$AutoSubmitConfiguration == null ? Common$AutoSubmitConfiguration.getDefaultInstance() : common$AutoSubmitConfiguration;
    }

    public Common$LocalizedString getErrorMessage() {
        Common$LocalizedString common$LocalizedString = this.errorMessage_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$TextInput getInput() {
        Common$TextInput common$TextInput = this.input_;
        return common$TextInput == null ? Common$TextInput.getDefaultInstance() : common$TextInput;
    }

    public Common$AttributedLocalizedString getNoteText() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.noteText_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public Common$PhoneInput getPhoneInput() {
        Common$PhoneInput common$PhoneInput = this.phoneInput_;
        return common$PhoneInput == null ? Common$PhoneInput.getDefaultInstance() : common$PhoneInput;
    }

    public Common$SegmentedInput getSegmentedInput() {
        Common$SegmentedInput common$SegmentedInput = this.segmentedInput_;
        return common$SegmentedInput == null ? Common$SegmentedInput.getDefaultInstance() : common$SegmentedInput;
    }

    public Common$LocalizedString getText() {
        Common$LocalizedString common$LocalizedString = this.text_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public boolean hasAttributedText() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAutoSubmitConfiguration() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasInput() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNoteText() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPhoneInput() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSegmentedInput() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6469a newBuilder(Common$Prompt common$Prompt) {
        return DEFAULT_INSTANCE.createBuilder(common$Prompt);
    }

    public static Common$Prompt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Prompt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Prompt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Prompt parseFrom(ByteString byteString) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$Prompt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Prompt parseFrom(byte[] bArr) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Prompt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$Prompt parseFrom(InputStream inputStream) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Prompt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Prompt parseFrom(CodedInputStream codedInputStream) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Prompt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Prompt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
