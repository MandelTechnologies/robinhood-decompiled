package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$SegmentedInput extends GeneratedMessageLite<Common$SegmentedInput, C6494a> implements MessageLiteOrBuilder {
    private static final Common$SegmentedInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile Parser<Common$SegmentedInput> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALIDATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private String id_ = "";
    private int length_;
    private int size_;
    private int type_;
    private Common$TextInputValidation validation_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$a */
    public static final class C6494a extends GeneratedMessageLite.Builder<Common$SegmentedInput, C6494a> implements MessageLiteOrBuilder {
        public C6494a() {
            super(Common$SegmentedInput.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$b */
    public enum EnumC6495b implements Internal.EnumLite {
        INPUT_SIZE_UNKNOWN(0),
        INPUT_SIZE_40(1),
        INPUT_SIZE_48(2),
        INPUT_SIZE_56(3),
        UNRECOGNIZED(-1);

        public static final int INPUT_SIZE_40_VALUE = 1;
        public static final int INPUT_SIZE_48_VALUE = 2;
        public static final int INPUT_SIZE_56_VALUE = 3;
        public static final int INPUT_SIZE_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2280b = new a();

        /* renamed from: a */
        public final int f2282a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6495b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6495b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2283a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6495b.forNumber(i) != null;
            }
        }

        EnumC6495b(int i) {
            this.f2282a = i;
        }

        public static EnumC6495b forNumber(int i) {
            if (i == 0) {
                return INPUT_SIZE_UNKNOWN;
            }
            if (i == 1) {
                return INPUT_SIZE_40;
            }
            if (i == 2) {
                return INPUT_SIZE_48;
            }
            if (i != 3) {
                return null;
            }
            return INPUT_SIZE_56;
        }

        public static Internal.EnumLiteMap<EnumC6495b> internalGetValueMap() {
            return f2280b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2283a;
        }

        @Deprecated
        public static EnumC6495b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2282a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$c */
    public enum EnumC6496c implements Internal.EnumLite {
        INPUT_TYPE_UNKNOWN(0),
        INPUT_TYPE_TEXT(1),
        INPUT_TYPE_NUMBER(2),
        INPUT_TYPE_PASSWORD(3),
        INPUT_TYPE_TELEPHONE(4),
        UNRECOGNIZED(-1);

        public static final int INPUT_TYPE_NUMBER_VALUE = 2;
        public static final int INPUT_TYPE_PASSWORD_VALUE = 3;
        public static final int INPUT_TYPE_TELEPHONE_VALUE = 4;
        public static final int INPUT_TYPE_TEXT_VALUE = 1;
        public static final int INPUT_TYPE_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2284b = new a();

        /* renamed from: a */
        public final int f2286a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$c$a */
        public class a implements Internal.EnumLiteMap<EnumC6496c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6496c.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$c$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2287a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6496c.forNumber(i) != null;
            }
        }

        EnumC6496c(int i) {
            this.f2286a = i;
        }

        public static EnumC6496c forNumber(int i) {
            if (i == 0) {
                return INPUT_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return INPUT_TYPE_TEXT;
            }
            if (i == 2) {
                return INPUT_TYPE_NUMBER;
            }
            if (i == 3) {
                return INPUT_TYPE_PASSWORD;
            }
            if (i != 4) {
                return null;
            }
            return INPUT_TYPE_TELEPHONE;
        }

        public static Internal.EnumLiteMap<EnumC6496c> internalGetValueMap() {
            return f2284b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2287a;
        }

        @Deprecated
        public static EnumC6496c valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2286a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$SegmentedInput common$SegmentedInput = new Common$SegmentedInput();
        DEFAULT_INSTANCE = common$SegmentedInput;
        GeneratedMessageLite.registerDefaultInstance(Common$SegmentedInput.class, common$SegmentedInput);
    }

    private Common$SegmentedInput() {
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearLength() {
        this.length_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearValidation() {
        this.validation_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$SegmentedInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        Common$TextInputValidation common$TextInputValidation2 = this.validation_;
        if (common$TextInputValidation2 != null && common$TextInputValidation2 != Common$TextInputValidation.getDefaultInstance()) {
            common$TextInputValidation = Common$TextInputValidation.newBuilder(this.validation_).mergeFrom((Common$TextInputValidation.C6527a) common$TextInputValidation).buildPartial();
        }
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    public static C6494a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SegmentedInput parseDelimitedFrom(InputStream inputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SegmentedInput parseFrom(ByteString byteString) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$SegmentedInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setLength(int i) {
        this.length_ = i;
    }

    private void setSize(EnumC6495b enumC6495b) {
        this.size_ = enumC6495b.getNumber();
    }

    private void setSizeValue(int i) {
        this.size_ = i;
    }

    private void setType(EnumC6496c enumC6496c) {
        this.type_ = enumC6496c.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    private void setValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SegmentedInput();
            case 2:
                return new C6494a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f\u0005ဉ\u0000", new Object[]{"bitField0_", "id_", "type_", "length_", "size_", "validation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SegmentedInput> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SegmentedInput.class) {
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

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public int getLength() {
        return this.length_;
    }

    public EnumC6495b getSize() {
        EnumC6495b enumC6495bForNumber = EnumC6495b.forNumber(this.size_);
        return enumC6495bForNumber == null ? EnumC6495b.UNRECOGNIZED : enumC6495bForNumber;
    }

    public int getSizeValue() {
        return this.size_;
    }

    public EnumC6496c getType() {
        EnumC6496c enumC6496cForNumber = EnumC6496c.forNumber(this.type_);
        return enumC6496cForNumber == null ? EnumC6496c.UNRECOGNIZED : enumC6496cForNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public Common$TextInputValidation getValidation() {
        Common$TextInputValidation common$TextInputValidation = this.validation_;
        return common$TextInputValidation == null ? Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public boolean hasValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6494a newBuilder(Common$SegmentedInput common$SegmentedInput) {
        return DEFAULT_INSTANCE.createBuilder(common$SegmentedInput);
    }

    public static Common$SegmentedInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(CodedInputStream codedInputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SegmentedInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(InputStream inputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SegmentedInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(ByteBuffer byteBuffer) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$SegmentedInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(byte[] bArr) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SegmentedInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
