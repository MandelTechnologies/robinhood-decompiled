package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilterableFields.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/FilterableFields;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FILTERABLE_FIELDS_UNSPECIFIED", "FILTERABLE_FIELDS_DATE", "FILTERABLE_FIELDS_SYMBOL", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FilterableFields implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FilterableFields[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FilterableFields> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FilterableFields FILTERABLE_FIELDS_DATE;
    public static final FilterableFields FILTERABLE_FIELDS_SYMBOL;
    public static final FilterableFields FILTERABLE_FIELDS_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ FilterableFields[] $values() {
        return new FilterableFields[]{FILTERABLE_FIELDS_UNSPECIFIED, FILTERABLE_FIELDS_DATE, FILTERABLE_FIELDS_SYMBOL};
    }

    @JvmStatic
    public static final FilterableFields fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FilterableFields> getEntries() {
        return $ENTRIES;
    }

    private FilterableFields(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FilterableFields filterableFields = new FilterableFields("FILTERABLE_FIELDS_UNSPECIFIED", 0, 0);
        FILTERABLE_FIELDS_UNSPECIFIED = filterableFields;
        FILTERABLE_FIELDS_DATE = new FilterableFields("FILTERABLE_FIELDS_DATE", 1, 1);
        FILTERABLE_FIELDS_SYMBOL = new FilterableFields("FILTERABLE_FIELDS_SYMBOL", 2, 2);
        FilterableFields[] filterableFieldsArr$values = $values();
        $VALUES = filterableFieldsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(filterableFieldsArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FilterableFields.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FilterableFields>(orCreateKotlinClass, syntax, filterableFields) { // from class: com.robinhood.chatbot.proto.v1.FilterableFields$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FilterableFields fromValue(int value) {
                return FilterableFields.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FilterableFields.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/FilterableFields$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/chatbot/proto/v1/FilterableFields;", "fromValue", "value", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FilterableFields fromValue(int value) {
            if (value == 0) {
                return FilterableFields.FILTERABLE_FIELDS_UNSPECIFIED;
            }
            if (value == 1) {
                return FilterableFields.FILTERABLE_FIELDS_DATE;
            }
            if (value != 2) {
                return null;
            }
            return FilterableFields.FILTERABLE_FIELDS_SYMBOL;
        }
    }

    public static FilterableFields valueOf(String str) {
        return (FilterableFields) Enum.valueOf(FilterableFields.class, str);
    }

    public static FilterableFields[] values() {
        return (FilterableFields[]) $VALUES.clone();
    }
}
