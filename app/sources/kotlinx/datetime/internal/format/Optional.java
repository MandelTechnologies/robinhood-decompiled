package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.internal.format.formatter.Formatter3;
import kotlinx.datetime.internal.format.formatter.Formatter4;
import kotlinx.datetime.internal.format.formatter.FormatterOperation;
import kotlinx.datetime.internal.format.parser.Parser5;
import kotlinx.datetime.internal.format.parser.Parser6;
import kotlinx.datetime.internal.format.parser.UnconditionalModification;

/* compiled from: FormatStructure.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\"B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010 \u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lkotlinx/datetime/internal/format/OptionalFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "", "onZero", "Lkotlinx/datetime/internal/format/FormatStructure;", "format", "<init>", "(Ljava/lang/String;Lkotlinx/datetime/internal/format/FormatStructure;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Ljava/lang/String;", "getOnZero", "Lkotlinx/datetime/internal/format/FormatStructure;", "getFormat", "()Lkotlinx/datetime/internal/format/FormatStructure;", "", "Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault;", "fields", "Ljava/util/List;", "PropertyWithDefault", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: kotlinx.datetime.internal.format.OptionalFormatStructure, reason: from toString */
/* loaded from: classes14.dex */
public final class Optional<T> implements NonConcatenatedFormatStructure<T> {
    private final List<PropertyWithDefault<T, ? extends Object>> fields;
    private final FormatStructure<T> format;
    private final String onZero;

    /* JADX WARN: Multi-variable type inference failed */
    public Optional(String onZero, FormatStructure<? super T> format2) {
        Intrinsics.checkNotNullParameter(onZero, "onZero");
        Intrinsics.checkNotNullParameter(format2, "format");
        this.onZero = onZero;
        this.format = format2;
        List listBasicFormats = FormatStructureKt.basicFormats(format2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listBasicFormats, 10));
        Iterator<T> it = listBasicFormats.iterator();
        while (it.hasNext()) {
            arrayList.add(((FieldFormatDirective) it.next()).getField());
        }
        List listDistinct = CollectionsKt.distinct(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listDistinct, 10));
        Iterator<T> it2 = listDistinct.iterator();
        while (it2.hasNext()) {
            arrayList2.add(PropertyWithDefault.INSTANCE.fromField((FieldSpec) it2.next()));
        }
        this.fields = arrayList2;
    }

    public final FormatStructure<T> getFormat() {
        return this.format;
    }

    public String toString() {
        return "Optional(" + this.onZero + ", " + this.format + ')';
    }

    public boolean equals(Object other) {
        if (!(other instanceof Optional)) {
            return false;
        }
        Optional optional = (Optional) other;
        return Intrinsics.areEqual(this.onZero, optional.onZero) && Intrinsics.areEqual(this.format, optional.format);
    }

    public int hashCode() {
        return (this.onZero.hashCode() * 31) + this.format.hashCode();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public Parser6<T> parser() {
        List listListOf;
        List listEmptyList = CollectionsKt.emptyList();
        Parser6<T> rVar = this.format.parser();
        Parser6<T> rVar2 = new ConstantFormatStructure(this.onZero).parser();
        if (this.fields.isEmpty()) {
            listListOf = CollectionsKt.emptyList();
        } else {
            listListOf = CollectionsKt.listOf(new UnconditionalModification(new Function1<T, Unit>(this) { // from class: kotlinx.datetime.internal.format.OptionalFormatStructure.parser.1
                final /* synthetic */ Optional<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2((C461671) obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                    for (PropertyWithDefault propertyWithDefault : ((Optional) this.this$0).fields) {
                        propertyWithDefault.accessor.trySetWithoutReassigning(t, propertyWithDefault.defaultValue);
                    }
                }
            }));
        }
        return new Parser6<>(listEmptyList, CollectionsKt.listOf((Object[]) new Parser6[]{rVar, Parser5.concat(CollectionsKt.listOf((Object[]) new Parser6[]{rVar2, new Parser6(listListOf, CollectionsKt.emptyList())}))}));
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public Formatter4<T> formatter() {
        Formatter4<T> formatter4 = this.format.formatter();
        List<PropertyWithDefault<T, ? extends Object>> list = this.fields;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PropertyWithDefault propertyWithDefault = (PropertyWithDefault) it.next();
            arrayList.add(new Predicate2(propertyWithDefault.defaultValue, new C46164x66a7504a(propertyWithDefault.accessor)));
        }
        Predicate predicateConjunctionPredicate = Predicate4.conjunctionPredicate(arrayList);
        if (predicateConjunctionPredicate instanceof Predicate5) {
            return new FormatterOperation(this.onZero);
        }
        return new Formatter3(CollectionsKt.listOf((Object[]) new Tuples2[]{Tuples4.m3642to(new C461651(predicateConjunctionPredicate), new FormatterOperation(this.onZero)), Tuples4.m3642to(new C461662(Predicate5.INSTANCE), formatter4)}));
    }

    /* compiled from: FormatStructure.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.OptionalFormatStructure$formatter$1 */
    /* synthetic */ class C461651 extends FunctionReferenceImpl implements Function1<T, Boolean> {
        C461651(Object obj) {
            super(1, obj, Predicate.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t) {
            return Boolean.valueOf(((Predicate) this.receiver).test(t));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((C461651) obj);
        }
    }

    /* compiled from: FormatStructure.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.OptionalFormatStructure$formatter$2 */
    /* synthetic */ class C461662 extends FunctionReferenceImpl implements Function1<Object, Boolean> {
        C461662(Object obj) {
            super(1, obj, Predicate5.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((Predicate5) this.receiver).test(obj));
        }
    }

    /* compiled from: FormatStructure.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000 \u000b*\u0006\b\u0001\u0010\u0001 \u0000*\u0004\b\u0002\u0010\u00022\u00020\u0003:\u0001\u000bB%\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u0006\u001a\u00028\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n¨\u0006\f"}, m3636d2 = {"Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault;", "T", "E", "", "Lkotlinx/datetime/internal/format/Accessor;", "accessor", "defaultValue", "<init>", "(Lkotlinx/datetime/internal/format/Accessor;Ljava/lang/Object;)V", "Lkotlinx/datetime/internal/format/Accessor;", "Ljava/lang/Object;", "Companion", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: kotlinx.datetime.internal.format.OptionalFormatStructure$PropertyWithDefault */
    private static final class PropertyWithDefault<T, E> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FieldSpec3<T, E> accessor;
        private final E defaultValue;

        public /* synthetic */ PropertyWithDefault(FieldSpec3 fieldSpec3, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(fieldSpec3, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PropertyWithDefault(FieldSpec3<? super T, E> fieldSpec3, E e) {
            this.accessor = fieldSpec3;
            this.defaultValue = e;
        }

        /* compiled from: FormatStructure.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0003\u0010\u0005\"\u0004\b\u0004\u0010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\b¨\u0006\t"}, m3636d2 = {"Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault$Companion;", "", "()V", "fromField", "Lkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault;", "T", "E", "field", "Lkotlinx/datetime/internal/format/FieldSpec;", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        /* renamed from: kotlinx.datetime.internal.format.OptionalFormatStructure$PropertyWithDefault$Companion, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final <T, E> PropertyWithDefault<T, E> fromField(FieldSpec<? super T, E> field) {
                Intrinsics.checkNotNullParameter(field, "field");
                E defaultValue = field.getDefaultValue();
                if (defaultValue == null) {
                    throw new IllegalArgumentException(("The field '" + field.getName() + "' does not define a default value").toString());
                }
                return new PropertyWithDefault<>(field.getAccessor(), defaultValue, null);
            }
        }
    }
}
