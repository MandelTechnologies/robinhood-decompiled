package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class Common$Box extends GeneratedMessageLite<Common$Box, C6402d> implements MessageLiteOrBuilder {
    public static final int AS_FIELD_NUMBER = 7;
    public static final int BORDER_BOTTOM_FIELD_NUMBER = 4;
    public static final int BORDER_COLOR_FIELD_NUMBER = 8;
    public static final int BORDER_LEFT_FIELD_NUMBER = 5;
    public static final int BORDER_RIGHT_FIELD_NUMBER = 3;
    public static final int BORDER_TOP_FIELD_NUMBER = 2;
    public static final int COMPONENTS_FIELD_NUMBER = 1;
    private static final Common$Box DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 6;
    public static final int FLEX_DIRECTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_BEHAVIOR_FIELD_NUMBER = 11;
    public static final int JUSTIFY_CONTENT_FIELD_NUMBER = 9;
    private static volatile Parser<Common$Box> PARSER;
    private int as_;
    private int borderBottom_;
    private int borderColor_;
    private int borderLeft_;
    private int borderRight_;
    private int borderTop_;
    private Internal.ProtobufList<Common$FlexibleComponent> components_ = GeneratedMessageLite.emptyProtobufList();
    private int display_;
    private int flexDirection_;
    private int heightBehavior_;
    private int justifyContent_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$a */
    public enum EnumC6399a implements Internal.EnumLite {
        AS_DIV(0),
        AS_SPAN(1),
        UNRECOGNIZED(-1);

        public static final int AS_DIV_VALUE = 0;
        public static final int AS_SPAN_VALUE = 1;

        /* renamed from: b */
        public static final a f2204b = new a();

        /* renamed from: a */
        public final int f2206a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$a$a */
        public class a implements Internal.EnumLiteMap<EnumC6399a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6399a.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$a$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2207a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6399a.forNumber(i) != null;
            }
        }

        EnumC6399a(int i) {
            this.f2206a = i;
        }

        public static EnumC6399a forNumber(int i) {
            if (i == 0) {
                return AS_DIV;
            }
            if (i != 1) {
                return null;
            }
            return AS_SPAN;
        }

        public static Internal.EnumLiteMap<EnumC6399a> internalGetValueMap() {
            return f2204b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2207a;
        }

        @Deprecated
        public static EnumC6399a valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2206a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$b */
    public enum EnumC6400b implements Internal.EnumLite {
        BORDER_NONE(0),
        BORDER_STANDARD(1),
        UNRECOGNIZED(-1);

        public static final int BORDER_NONE_VALUE = 0;
        public static final int BORDER_STANDARD_VALUE = 1;

        /* renamed from: b */
        public static final a f2208b = new a();

        /* renamed from: a */
        public final int f2210a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$b$a */
        public class a implements Internal.EnumLiteMap<EnumC6400b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6400b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2211a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6400b.forNumber(i) != null;
            }
        }

        EnumC6400b(int i) {
            this.f2210a = i;
        }

        public static EnumC6400b forNumber(int i) {
            if (i == 0) {
                return BORDER_NONE;
            }
            if (i != 1) {
                return null;
            }
            return BORDER_STANDARD;
        }

        public static Internal.EnumLiteMap<EnumC6400b> internalGetValueMap() {
            return f2208b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2211a;
        }

        @Deprecated
        public static EnumC6400b valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2210a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$c */
    public enum EnumC6401c implements Internal.EnumLite {
        BORDER_COLOR_CONTRAST_DEFAULT(0),
        BORDER_COLOR_CONTRAST_LOW(1),
        BORDER_COLOR_CONTRAST_HIGH(2),
        BORDER_COLOR_STATE_DEFAULT(3),
        BORDER_COLOR_STATE_ERROR(4),
        BORDER_COLOR_STATE_INFO(5),
        BORDER_COLOR_STATE_SUCCESS(6),
        BORDER_COLOR_STATE_WARNING(7),
        BORDER_COLOR_STATUS_DEFAULT(8),
        BORDER_COLOR_STATUS_ERROR(9),
        BORDER_COLOR_STATUS_INFO(10),
        BORDER_COLOR_STATUS_SUCCESS(11),
        BORDER_COLOR_STATUS_WARNING(12),
        UNRECOGNIZED(-1);

        public static final int BORDER_COLOR_CONTRAST_DEFAULT_VALUE = 0;
        public static final int BORDER_COLOR_CONTRAST_HIGH_VALUE = 2;
        public static final int BORDER_COLOR_CONTRAST_LOW_VALUE = 1;
        public static final int BORDER_COLOR_STATE_DEFAULT_VALUE = 3;
        public static final int BORDER_COLOR_STATE_ERROR_VALUE = 4;
        public static final int BORDER_COLOR_STATE_INFO_VALUE = 5;
        public static final int BORDER_COLOR_STATE_SUCCESS_VALUE = 6;
        public static final int BORDER_COLOR_STATE_WARNING_VALUE = 7;
        public static final int BORDER_COLOR_STATUS_DEFAULT_VALUE = 8;
        public static final int BORDER_COLOR_STATUS_ERROR_VALUE = 9;
        public static final int BORDER_COLOR_STATUS_INFO_VALUE = 10;
        public static final int BORDER_COLOR_STATUS_SUCCESS_VALUE = 11;
        public static final int BORDER_COLOR_STATUS_WARNING_VALUE = 12;

        /* renamed from: b */
        public static final a f2212b = new a();

        /* renamed from: a */
        public final int f2214a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$c$a */
        public class a implements Internal.EnumLiteMap<EnumC6401c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6401c.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$c$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2215a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6401c.forNumber(i) != null;
            }
        }

        EnumC6401c(int i) {
            this.f2214a = i;
        }

        public static EnumC6401c forNumber(int i) {
            switch (i) {
                case 0:
                    return BORDER_COLOR_CONTRAST_DEFAULT;
                case 1:
                    return BORDER_COLOR_CONTRAST_LOW;
                case 2:
                    return BORDER_COLOR_CONTRAST_HIGH;
                case 3:
                    return BORDER_COLOR_STATE_DEFAULT;
                case 4:
                    return BORDER_COLOR_STATE_ERROR;
                case 5:
                    return BORDER_COLOR_STATE_INFO;
                case 6:
                    return BORDER_COLOR_STATE_SUCCESS;
                case 7:
                    return BORDER_COLOR_STATE_WARNING;
                case 8:
                    return BORDER_COLOR_STATUS_DEFAULT;
                case 9:
                    return BORDER_COLOR_STATUS_ERROR;
                case 10:
                    return BORDER_COLOR_STATUS_INFO;
                case 11:
                    return BORDER_COLOR_STATUS_SUCCESS;
                case 12:
                    return BORDER_COLOR_STATUS_WARNING;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<EnumC6401c> internalGetValueMap() {
            return f2212b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2215a;
        }

        @Deprecated
        public static EnumC6401c valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2214a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$d */
    public static final class C6402d extends GeneratedMessageLite.Builder<Common$Box, C6402d> implements MessageLiteOrBuilder {
        public C6402d() {
            super(Common$Box.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$e */
    public enum EnumC6403e implements Internal.EnumLite {
        DISPLAY_INLINE(0),
        DISPLAY_BLOCK(1),
        DISPLAY_INLINE_BLOCK(2),
        DISPLAY_FLEX(3),
        DISPLAY_INLINE_FLEX(4),
        DISPLAY_GRID(5),
        DISPLAY_INLINE_GRID(6),
        UNRECOGNIZED(-1);

        public static final int DISPLAY_BLOCK_VALUE = 1;
        public static final int DISPLAY_FLEX_VALUE = 3;
        public static final int DISPLAY_GRID_VALUE = 5;
        public static final int DISPLAY_INLINE_BLOCK_VALUE = 2;
        public static final int DISPLAY_INLINE_FLEX_VALUE = 4;
        public static final int DISPLAY_INLINE_GRID_VALUE = 6;
        public static final int DISPLAY_INLINE_VALUE = 0;

        /* renamed from: b */
        public static final a f2216b = new a();

        /* renamed from: a */
        public final int f2218a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$e$a */
        public class a implements Internal.EnumLiteMap<EnumC6403e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6403e.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$e$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2219a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6403e.forNumber(i) != null;
            }
        }

        EnumC6403e(int i) {
            this.f2218a = i;
        }

        public static EnumC6403e forNumber(int i) {
            switch (i) {
                case 0:
                    return DISPLAY_INLINE;
                case 1:
                    return DISPLAY_BLOCK;
                case 2:
                    return DISPLAY_INLINE_BLOCK;
                case 3:
                    return DISPLAY_FLEX;
                case 4:
                    return DISPLAY_INLINE_FLEX;
                case 5:
                    return DISPLAY_GRID;
                case 6:
                    return DISPLAY_INLINE_GRID;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<EnumC6403e> internalGetValueMap() {
            return f2216b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2219a;
        }

        @Deprecated
        public static EnumC6403e valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2218a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$f */
    public enum EnumC6404f implements Internal.EnumLite {
        HEIGHT_BEHAVIOR_DEFAULT(0),
        HEIGHT_BEHAVIOR_100_PERCENT(1),
        UNRECOGNIZED(-1);

        public static final int HEIGHT_BEHAVIOR_100_PERCENT_VALUE = 1;
        public static final int HEIGHT_BEHAVIOR_DEFAULT_VALUE = 0;

        /* renamed from: b */
        public static final a f2220b = new a();

        /* renamed from: a */
        public final int f2222a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$f$a */
        public class a implements Internal.EnumLiteMap<EnumC6404f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC6404f.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Box$f$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2223a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC6404f.forNumber(i) != null;
            }
        }

        EnumC6404f(int i) {
            this.f2222a = i;
        }

        public static EnumC6404f forNumber(int i) {
            if (i == 0) {
                return HEIGHT_BEHAVIOR_DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return HEIGHT_BEHAVIOR_100_PERCENT;
        }

        public static Internal.EnumLiteMap<EnumC6404f> internalGetValueMap() {
            return f2220b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2223a;
        }

        @Deprecated
        public static EnumC6404f valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2222a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Common$Box common$Box = new Common$Box();
        DEFAULT_INSTANCE = common$Box;
        GeneratedMessageLite.registerDefaultInstance(Common$Box.class, common$Box);
    }

    private Common$Box() {
    }

    private void addAllComponents(Iterable<? extends Common$FlexibleComponent> iterable) {
        ensureComponentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.components_);
    }

    private void addComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.add(i, common$FlexibleComponent);
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void clearBorderBottom() {
        this.borderBottom_ = 0;
    }

    private void clearBorderColor() {
        this.borderColor_ = 0;
    }

    private void clearBorderLeft() {
        this.borderLeft_ = 0;
    }

    private void clearBorderRight() {
        this.borderRight_ = 0;
    }

    private void clearBorderTop() {
        this.borderTop_ = 0;
    }

    private void clearComponents() {
        this.components_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDisplay() {
        this.display_ = 0;
    }

    private void clearFlexDirection() {
        this.flexDirection_ = 0;
    }

    private void clearHeightBehavior() {
        this.heightBehavior_ = 0;
    }

    private void clearJustifyContent() {
        this.justifyContent_ = 0;
    }

    private void ensureComponentsIsMutable() {
        Internal.ProtobufList<Common$FlexibleComponent> protobufList = this.components_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.components_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Common$Box getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6402d newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Box parseDelimitedFrom(InputStream inputStream) {
        return (Common$Box) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Box parseFrom(ByteString byteString) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Box> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeComponents(int i) {
        ensureComponentsIsMutable();
        this.components_.remove(i);
    }

    private void setAs(EnumC6399a enumC6399a) {
        this.as_ = enumC6399a.getNumber();
    }

    private void setAsValue(int i) {
        this.as_ = i;
    }

    private void setBorderBottom(EnumC6400b enumC6400b) {
        this.borderBottom_ = enumC6400b.getNumber();
    }

    private void setBorderBottomValue(int i) {
        this.borderBottom_ = i;
    }

    private void setBorderColor(EnumC6401c enumC6401c) {
        this.borderColor_ = enumC6401c.getNumber();
    }

    private void setBorderColorValue(int i) {
        this.borderColor_ = i;
    }

    private void setBorderLeft(EnumC6400b enumC6400b) {
        this.borderLeft_ = enumC6400b.getNumber();
    }

    private void setBorderLeftValue(int i) {
        this.borderLeft_ = i;
    }

    private void setBorderRight(EnumC6400b enumC6400b) {
        this.borderRight_ = enumC6400b.getNumber();
    }

    private void setBorderRightValue(int i) {
        this.borderRight_ = i;
    }

    private void setBorderTop(EnumC6400b enumC6400b) {
        this.borderTop_ = enumC6400b.getNumber();
    }

    private void setBorderTopValue(int i) {
        this.borderTop_ = i;
    }

    private void setComponents(int i, Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.set(i, common$FlexibleComponent);
    }

    private void setDisplay(EnumC6403e enumC6403e) {
        this.display_ = enumC6403e.getNumber();
    }

    private void setDisplayValue(int i) {
        this.display_ = i;
    }

    private void setFlexDirection(EnumC6939u enumC6939u) {
        this.flexDirection_ = enumC6939u.getNumber();
    }

    private void setFlexDirectionValue(int i) {
        this.flexDirection_ = i;
    }

    private void setHeightBehavior(EnumC6404f enumC6404f) {
        this.heightBehavior_ = enumC6404f.getNumber();
    }

    private void setHeightBehaviorValue(int i) {
        this.heightBehavior_ = i;
    }

    private void setJustifyContent(EnumC6935s enumC6935s) {
        this.justifyContent_ = enumC6935s.getNumber();
    }

    private void setJustifyContentValue(int i) {
        this.justifyContent_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Box();
            case 2:
                return new C6402d();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\f\b\f\t\f\n\f\u000b\f", new Object[]{"components_", Common$FlexibleComponent.class, "borderTop_", "borderRight_", "borderBottom_", "borderLeft_", "display_", "as_", "borderColor_", "justifyContent_", "flexDirection_", "heightBehavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Box> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$Box.class) {
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

    public EnumC6399a getAs() {
        EnumC6399a enumC6399aForNumber = EnumC6399a.forNumber(this.as_);
        return enumC6399aForNumber == null ? EnumC6399a.UNRECOGNIZED : enumC6399aForNumber;
    }

    public int getAsValue() {
        return this.as_;
    }

    public EnumC6400b getBorderBottom() {
        EnumC6400b enumC6400bForNumber = EnumC6400b.forNumber(this.borderBottom_);
        return enumC6400bForNumber == null ? EnumC6400b.UNRECOGNIZED : enumC6400bForNumber;
    }

    public int getBorderBottomValue() {
        return this.borderBottom_;
    }

    public EnumC6401c getBorderColor() {
        EnumC6401c enumC6401cForNumber = EnumC6401c.forNumber(this.borderColor_);
        return enumC6401cForNumber == null ? EnumC6401c.UNRECOGNIZED : enumC6401cForNumber;
    }

    public int getBorderColorValue() {
        return this.borderColor_;
    }

    public EnumC6400b getBorderLeft() {
        EnumC6400b enumC6400bForNumber = EnumC6400b.forNumber(this.borderLeft_);
        return enumC6400bForNumber == null ? EnumC6400b.UNRECOGNIZED : enumC6400bForNumber;
    }

    public int getBorderLeftValue() {
        return this.borderLeft_;
    }

    public EnumC6400b getBorderRight() {
        EnumC6400b enumC6400bForNumber = EnumC6400b.forNumber(this.borderRight_);
        return enumC6400bForNumber == null ? EnumC6400b.UNRECOGNIZED : enumC6400bForNumber;
    }

    public int getBorderRightValue() {
        return this.borderRight_;
    }

    public EnumC6400b getBorderTop() {
        EnumC6400b enumC6400bForNumber = EnumC6400b.forNumber(this.borderTop_);
        return enumC6400bForNumber == null ? EnumC6400b.UNRECOGNIZED : enumC6400bForNumber;
    }

    public int getBorderTopValue() {
        return this.borderTop_;
    }

    public Common$FlexibleComponent getComponents(int i) {
        return this.components_.get(i);
    }

    public int getComponentsCount() {
        return this.components_.size();
    }

    public List<Common$FlexibleComponent> getComponentsList() {
        return this.components_;
    }

    public InterfaceC6943w getComponentsOrBuilder(int i) {
        return this.components_.get(i);
    }

    public List<? extends InterfaceC6943w> getComponentsOrBuilderList() {
        return this.components_;
    }

    public EnumC6403e getDisplay() {
        EnumC6403e enumC6403eForNumber = EnumC6403e.forNumber(this.display_);
        return enumC6403eForNumber == null ? EnumC6403e.UNRECOGNIZED : enumC6403eForNumber;
    }

    public int getDisplayValue() {
        return this.display_;
    }

    public EnumC6939u getFlexDirection() {
        EnumC6939u enumC6939uForNumber = EnumC6939u.forNumber(this.flexDirection_);
        return enumC6939uForNumber == null ? EnumC6939u.UNRECOGNIZED : enumC6939uForNumber;
    }

    public int getFlexDirectionValue() {
        return this.flexDirection_;
    }

    public EnumC6404f getHeightBehavior() {
        EnumC6404f enumC6404fForNumber = EnumC6404f.forNumber(this.heightBehavior_);
        return enumC6404fForNumber == null ? EnumC6404f.UNRECOGNIZED : enumC6404fForNumber;
    }

    public int getHeightBehaviorValue() {
        return this.heightBehavior_;
    }

    public EnumC6935s getJustifyContent() {
        EnumC6935s enumC6935sForNumber = EnumC6935s.forNumber(this.justifyContent_);
        return enumC6935sForNumber == null ? EnumC6935s.UNRECOGNIZED : enumC6935sForNumber;
    }

    public int getJustifyContentValue() {
        return this.justifyContent_;
    }

    private void addComponents(Common$FlexibleComponent common$FlexibleComponent) {
        common$FlexibleComponent.getClass();
        ensureComponentsIsMutable();
        this.components_.add(common$FlexibleComponent);
    }

    public static C6402d newBuilder(Common$Box common$Box) {
        return DEFAULT_INSTANCE.createBuilder(common$Box);
    }

    public static Common$Box parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Box parseFrom(CodedInputStream codedInputStream) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Box parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(InputStream inputStream) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Box parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Box parseFrom(ByteBuffer byteBuffer) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Box parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Box parseFrom(byte[] bArr) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Box parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Box) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
