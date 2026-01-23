package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$TextContent extends GeneratedMessageLite<Common$TextContent, C6509c> implements MessageLiteOrBuilder {
    public static final int ALIGN_FIELD_NUMBER = 5;
    public static final int AS_FIELD_NUMBER = 1;
    public static final int CASING_FIELD_NUMBER = 7;
    public static final int CONTENT_FIELD_NUMBER = 4;
    public static final int CONTRAST_FIELD_NUMBER = 8;
    private static final Common$TextContent DEFAULT_INSTANCE;
    public static final int FONT_FIELD_NUMBER = 6;
    public static final int LINE_HEIGHT_FIELD_NUMBER = 9;
    private static volatile Parser<Common$TextContent> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WEIGHT_FIELD_NUMBER = 3;
    private int align_;
    private int as_;
    private int bitField0_;
    private int casing_;
    private Common$AttributedLocalizedString content_;
    private int contrast_;
    private int font_;
    private int lineHeight_;
    private int size_;
    private int weight_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$a */
    public enum EnumC6507a implements Internal.EnumLite {
        ALIGN_START(0),
        ALIGN_END(1),
        ALIGN_LEFT(2),
        ALIGN_RIGHT(3),
        ALIGN_CENTER(4),
        UNRECOGNIZED(-1);

        public static final int ALIGN_CENTER_VALUE = 4;
        public static final int ALIGN_END_VALUE = 1;
        public static final int ALIGN_LEFT_VALUE = 2;
        public static final int ALIGN_RIGHT_VALUE = 3;
        public static final int ALIGN_START_VALUE = 0;

        /* renamed from: b */
        public static final a f2289b = new a();

        /* renamed from: a */
        public final int f2291a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$a$a */
        public class a implements Internal.EnumLiteMap<EnumC6507a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6507a.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$a$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2292a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6507a.forNumber(i) != null;
            }
        }

        EnumC6507a(int i) {
            this.f2291a = i;
        }

        public static EnumC6507a forNumber(int i) {
            if (i == 0) {
                return ALIGN_START;
            }
            if (i == 1) {
                return ALIGN_END;
            }
            if (i == 2) {
                return ALIGN_LEFT;
            }
            if (i == 3) {
                return ALIGN_RIGHT;
            }
            if (i != 4) {
                return null;
            }
            return ALIGN_CENTER;
        }

        public static Internal.EnumLiteMap<EnumC6507a> internalGetValueMap() {
            return f2289b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2292a;
        }

        @Deprecated
        public static EnumC6507a valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2291a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$b */
    public enum EnumC6508b implements Internal.EnumLite {
        AS_CODE(0),
        AS_H1(1),
        AS_H2(2),
        AS_H3(3),
        AS_H4(4),
        AS_H5(5),
        AS_H6(6),
        AS_P(7),
        AS_SMALL(8),
        AS_SPAN(9),
        UNRECOGNIZED(-1);

        public static final int AS_CODE_VALUE = 0;
        public static final int AS_H1_VALUE = 1;
        public static final int AS_H2_VALUE = 2;
        public static final int AS_H3_VALUE = 3;
        public static final int AS_H4_VALUE = 4;
        public static final int AS_H5_VALUE = 5;
        public static final int AS_H6_VALUE = 6;
        public static final int AS_P_VALUE = 7;
        public static final int AS_SMALL_VALUE = 8;
        public static final int AS_SPAN_VALUE = 9;

        /* renamed from: b */
        public static final a f2293b = new a();

        /* renamed from: a */
        public final int f2295a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6508b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6508b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2296a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6508b.forNumber(i) != null;
            }
        }

        EnumC6508b(int i) {
            this.f2295a = i;
        }

        public static EnumC6508b forNumber(int i) {
            switch (i) {
                case 0:
                    return AS_CODE;
                case 1:
                    return AS_H1;
                case 2:
                    return AS_H2;
                case 3:
                    return AS_H3;
                case 4:
                    return AS_H4;
                case 5:
                    return AS_H5;
                case 6:
                    return AS_H6;
                case 7:
                    return AS_P;
                case 8:
                    return AS_SMALL;
                case 9:
                    return AS_SPAN;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<EnumC6508b> internalGetValueMap() {
            return f2293b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2296a;
        }

        @Deprecated
        public static EnumC6508b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2295a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$c */
    public static final class C6509c extends GeneratedMessageLite.Builder<Common$TextContent, C6509c> implements MessageLiteOrBuilder {
        public C6509c() {
            super(Common$TextContent.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$d */
    public enum EnumC6510d implements Internal.EnumLite {
        CASING_NONE(0),
        CASING_CAPITALIZE(1),
        CASING_LOWERCASE(2),
        CASING_UPPERCASE(3),
        UNRECOGNIZED(-1);

        public static final int CASING_CAPITALIZE_VALUE = 1;
        public static final int CASING_LOWERCASE_VALUE = 2;
        public static final int CASING_NONE_VALUE = 0;
        public static final int CASING_UPPERCASE_VALUE = 3;

        /* renamed from: b */
        public static final a f2297b = new a();

        /* renamed from: a */
        public final int f2299a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$d$a */
        public class a implements Internal.EnumLiteMap<EnumC6510d> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6510d.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$d$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2300a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6510d.forNumber(i) != null;
            }
        }

        EnumC6510d(int i) {
            this.f2299a = i;
        }

        public static EnumC6510d forNumber(int i) {
            if (i == 0) {
                return CASING_NONE;
            }
            if (i == 1) {
                return CASING_CAPITALIZE;
            }
            if (i == 2) {
                return CASING_LOWERCASE;
            }
            if (i != 3) {
                return null;
            }
            return CASING_UPPERCASE;
        }

        public static Internal.EnumLiteMap<EnumC6510d> internalGetValueMap() {
            return f2297b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2300a;
        }

        @Deprecated
        public static EnumC6510d valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2299a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$e */
    public enum EnumC6511e implements Internal.EnumLite {
        CONTRAST_DEFAULT(0),
        CONTRAST_LOW(1),
        CONTRAST_HIGH(2),
        CONTRAST_INVERSE_DEFAULT(3),
        CONTRAST_INVERSE_LOW(4),
        CONTRAST_INVERSE_HIGH(5),
        UNRECOGNIZED(-1);

        public static final int CONTRAST_DEFAULT_VALUE = 0;
        public static final int CONTRAST_HIGH_VALUE = 2;
        public static final int CONTRAST_INVERSE_DEFAULT_VALUE = 3;
        public static final int CONTRAST_INVERSE_HIGH_VALUE = 5;
        public static final int CONTRAST_INVERSE_LOW_VALUE = 4;
        public static final int CONTRAST_LOW_VALUE = 1;

        /* renamed from: b */
        public static final a f2301b = new a();

        /* renamed from: a */
        public final int f2303a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$e$a */
        public class a implements Internal.EnumLiteMap<EnumC6511e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6511e.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$e$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2304a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6511e.forNumber(i) != null;
            }
        }

        EnumC6511e(int i) {
            this.f2303a = i;
        }

        public static EnumC6511e forNumber(int i) {
            if (i == 0) {
                return CONTRAST_DEFAULT;
            }
            if (i == 1) {
                return CONTRAST_LOW;
            }
            if (i == 2) {
                return CONTRAST_HIGH;
            }
            if (i == 3) {
                return CONTRAST_INVERSE_DEFAULT;
            }
            if (i == 4) {
                return CONTRAST_INVERSE_LOW;
            }
            if (i != 5) {
                return null;
            }
            return CONTRAST_INVERSE_HIGH;
        }

        public static Internal.EnumLiteMap<EnumC6511e> internalGetValueMap() {
            return f2301b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2304a;
        }

        @Deprecated
        public static EnumC6511e valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2303a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$f */
    public enum EnumC6512f implements Internal.EnumLite {
        FONT_SANS(0),
        FONT_MONO(1),
        UNRECOGNIZED(-1);

        public static final int FONT_MONO_VALUE = 1;
        public static final int FONT_SANS_VALUE = 0;

        /* renamed from: b */
        public static final a f2305b = new a();

        /* renamed from: a */
        public final int f2307a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$f$a */
        public class a implements Internal.EnumLiteMap<EnumC6512f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6512f.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$f$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2308a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6512f.forNumber(i) != null;
            }
        }

        EnumC6512f(int i) {
            this.f2307a = i;
        }

        public static EnumC6512f forNumber(int i) {
            if (i == 0) {
                return FONT_SANS;
            }
            if (i != 1) {
                return null;
            }
            return FONT_MONO;
        }

        public static Internal.EnumLiteMap<EnumC6512f> internalGetValueMap() {
            return f2305b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2308a;
        }

        @Deprecated
        public static EnumC6512f valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2307a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$g */
    public enum EnumC6513g implements Internal.EnumLite {
        FONT_WEIGHT_NORMAL(0),
        FONT_WEIGHT_BOLD(1),
        FONT_WEIGHT_MEDIUM(2),
        FONT_WEIGHT_SEMI_BOLD(3),
        FONT_WEIGHT_EXTRA_BOLD(4),
        UNRECOGNIZED(-1);

        public static final int FONT_WEIGHT_BOLD_VALUE = 1;
        public static final int FONT_WEIGHT_EXTRA_BOLD_VALUE = 4;
        public static final int FONT_WEIGHT_MEDIUM_VALUE = 2;
        public static final int FONT_WEIGHT_NORMAL_VALUE = 0;
        public static final int FONT_WEIGHT_SEMI_BOLD_VALUE = 3;

        /* renamed from: b */
        public static final a f2309b = new a();

        /* renamed from: a */
        public final int f2311a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$g$a */
        public class a implements Internal.EnumLiteMap<EnumC6513g> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6513g.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$g$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2312a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6513g.forNumber(i) != null;
            }
        }

        EnumC6513g(int i) {
            this.f2311a = i;
        }

        public static EnumC6513g forNumber(int i) {
            if (i == 0) {
                return FONT_WEIGHT_NORMAL;
            }
            if (i == 1) {
                return FONT_WEIGHT_BOLD;
            }
            if (i == 2) {
                return FONT_WEIGHT_MEDIUM;
            }
            if (i == 3) {
                return FONT_WEIGHT_SEMI_BOLD;
            }
            if (i != 4) {
                return null;
            }
            return FONT_WEIGHT_EXTRA_BOLD;
        }

        public static Internal.EnumLiteMap<EnumC6513g> internalGetValueMap() {
            return f2309b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2312a;
        }

        @Deprecated
        public static EnumC6513g valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2311a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$TextContent common$TextContent = new Common$TextContent();
        DEFAULT_INSTANCE = common$TextContent;
        GeneratedMessageLite.registerDefaultInstance(Common$TextContent.class, common$TextContent);
    }

    private Common$TextContent() {
    }

    private void clearAlign() {
        this.align_ = 0;
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void clearCasing() {
        this.casing_ = 0;
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    private void clearContrast() {
        this.contrast_ = 0;
    }

    private void clearFont() {
        this.font_ = 0;
    }

    private void clearLineHeight() {
        this.lineHeight_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearWeight() {
        this.weight_ = 0;
    }

    public static Common$TextContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.C6390c) common$AttributedLocalizedString).buildPartial();
        }
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    public static C6509c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TextContent parseDelimitedFrom(InputStream inputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextContent parseFrom(ByteString byteString) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$TextContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlign(EnumC6507a enumC6507a) {
        this.align_ = enumC6507a.getNumber();
    }

    private void setAlignValue(int i) {
        this.align_ = i;
    }

    private void setAs(EnumC6508b enumC6508b) {
        this.as_ = enumC6508b.getNumber();
    }

    private void setAsValue(int i) {
        this.as_ = i;
    }

    private void setCasing(EnumC6510d enumC6510d) {
        this.casing_ = enumC6510d.getNumber();
    }

    private void setCasingValue(int i) {
        this.casing_ = i;
    }

    private void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    private void setContrast(EnumC6511e enumC6511e) {
        this.contrast_ = enumC6511e.getNumber();
    }

    private void setContrastValue(int i) {
        this.contrast_ = i;
    }

    private void setFont(EnumC6512f enumC6512f) {
        this.font_ = enumC6512f.getNumber();
    }

    private void setFontValue(int i) {
        this.font_ = i;
    }

    private void setLineHeight(int i) {
        this.lineHeight_ = i;
    }

    private void setSize(int i) {
        this.size_ = i;
    }

    private void setWeight(EnumC6513g enumC6513g) {
        this.weight_ = enumC6513g.getNumber();
    }

    private void setWeightValue(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TextContent();
            case 2:
                return new C6509c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004ဉ\u0000\u0005\f\u0006\f\u0007\f\b\f\t\u000b", new Object[]{"bitField0_", "as_", "size_", "weight_", "content_", "align_", "font_", "casing_", "contrast_", "lineHeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TextContent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$TextContent.class) {
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

    public EnumC6507a getAlign() {
        EnumC6507a enumC6507aForNumber = EnumC6507a.forNumber(this.align_);
        return enumC6507aForNumber == null ? EnumC6507a.UNRECOGNIZED : enumC6507aForNumber;
    }

    public int getAlignValue() {
        return this.align_;
    }

    public EnumC6508b getAs() {
        EnumC6508b enumC6508bForNumber = EnumC6508b.forNumber(this.as_);
        return enumC6508bForNumber == null ? EnumC6508b.UNRECOGNIZED : enumC6508bForNumber;
    }

    public int getAsValue() {
        return this.as_;
    }

    public EnumC6510d getCasing() {
        EnumC6510d enumC6510dForNumber = EnumC6510d.forNumber(this.casing_);
        return enumC6510dForNumber == null ? EnumC6510d.UNRECOGNIZED : enumC6510dForNumber;
    }

    public int getCasingValue() {
        return this.casing_;
    }

    public Common$AttributedLocalizedString getContent() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public EnumC6511e getContrast() {
        EnumC6511e enumC6511eForNumber = EnumC6511e.forNumber(this.contrast_);
        return enumC6511eForNumber == null ? EnumC6511e.UNRECOGNIZED : enumC6511eForNumber;
    }

    public int getContrastValue() {
        return this.contrast_;
    }

    public EnumC6512f getFont() {
        EnumC6512f enumC6512fForNumber = EnumC6512f.forNumber(this.font_);
        return enumC6512fForNumber == null ? EnumC6512f.UNRECOGNIZED : enumC6512fForNumber;
    }

    public int getFontValue() {
        return this.font_;
    }

    public int getLineHeight() {
        return this.lineHeight_;
    }

    public int getSize() {
        return this.size_;
    }

    public EnumC6513g getWeight() {
        EnumC6513g enumC6513gForNumber = EnumC6513g.forNumber(this.weight_);
        return enumC6513gForNumber == null ? EnumC6513g.UNRECOGNIZED : enumC6513gForNumber;
    }

    public int getWeightValue() {
        return this.weight_;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6509c newBuilder(Common$TextContent common$TextContent) {
        return DEFAULT_INSTANCE.createBuilder(common$TextContent);
    }

    public static Common$TextContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(CodedInputStream codedInputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TextContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(InputStream inputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(ByteBuffer byteBuffer) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$TextContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(byte[] bArr) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TextContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
