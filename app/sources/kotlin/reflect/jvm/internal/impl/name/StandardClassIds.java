package kotlin.reflect.jvm.internal.impl.name;

import com.robinhood.contentful.model.ContentTypeResource;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: StandardClassIds.kt */
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class StandardClassIds {
    private static final ClassId AbstractMap;
    private static final ClassId Annotation;
    private static final ClassId AnnotationRetention;
    private static final ClassId AnnotationTarget;
    private static final ClassId Any;
    private static final ClassId Array;
    private static final FqName BASE_ANNOTATIONS_JVM_PACKAGE;
    private static final FqName BASE_ANNOTATION_PACKAGE;
    private static final FqName BASE_COLLECTIONS_PACKAGE;
    private static final FqName BASE_CONCURRENT_ATOMICS_PACKAGE;
    private static final FqName BASE_CONCURRENT_PACKAGE;
    private static final FqName BASE_CONTRACTS_PACKAGE;
    private static final FqName BASE_COROUTINES_INTRINSICS_PACKAGE;
    private static final FqName BASE_COROUTINES_PACKAGE;
    private static final FqName BASE_ENUMS_PACKAGE;
    private static final FqName BASE_INTERNAL_IR_PACKAGE;
    private static final FqName BASE_INTERNAL_PACKAGE;
    private static final FqName BASE_JVM_FUNCTIONS_PACKAGE;
    private static final FqName BASE_JVM_INTERNAL_PACKAGE;
    private static final FqName BASE_JVM_PACKAGE;
    private static final FqName BASE_KOTLIN_PACKAGE;
    private static final FqName BASE_RANGES_PACKAGE;
    private static final FqName BASE_REFLECT_PACKAGE;
    private static final FqName BASE_SEQUENCES_PACKAGE;
    private static final FqName BASE_TEST_PACKAGE;
    private static final FqName BASE_TEXT_PACKAGE;
    private static final ClassId Boolean;
    private static final ClassId Byte;
    private static final ClassId Char;
    private static final ClassId CharIterator;
    private static final ClassId CharRange;
    private static final ClassId CharSequence;
    private static final ClassId Cloneable;
    private static final ClassId Collection;
    private static final ClassId Comparable;
    private static final ClassId Continuation;
    private static final ClassId DeprecationLevel;
    private static final ClassId Double;
    private static final ClassId Enum;
    private static final ClassId EnumEntries;
    private static final ClassId Float;
    private static final ClassId Function;
    public static final StandardClassIds INSTANCE = new StandardClassIds();
    private static final ClassId Int;
    private static final ClassId IntRange;
    private static final ClassId Iterable;
    private static final ClassId Iterator;
    private static final ClassId KCallable;
    private static final ClassId KClass;
    private static final ClassId KFunction;
    private static final ClassId KMutableProperty;
    private static final ClassId KMutableProperty0;
    private static final ClassId KMutableProperty1;
    private static final ClassId KMutableProperty2;
    private static final ClassId KProperty;
    private static final ClassId KProperty0;
    private static final ClassId KProperty1;
    private static final ClassId KProperty2;
    private static final ClassId KType;
    private static final ClassId List;
    private static final ClassId ListIterator;
    private static final ClassId Long;
    private static final ClassId LongRange;
    private static final ClassId Map;
    private static final ClassId MapEntry;
    private static final ClassId MutableCollection;
    private static final ClassId MutableIterable;
    private static final ClassId MutableIterator;
    private static final ClassId MutableList;
    private static final ClassId MutableListIterator;
    private static final ClassId MutableMap;
    private static final ClassId MutableMapEntry;
    private static final ClassId MutableSet;
    private static final ClassId Nothing;
    private static final ClassId Number;
    private static final ClassId Result;
    private static final ClassId Set;
    private static final ClassId Short;
    private static final ClassId String;
    private static final ClassId Throwable;
    private static final ClassId UByte;
    private static final ClassId UInt;
    private static final ClassId ULong;
    private static final ClassId UShort;
    private static final ClassId Unit;
    private static final Set<ClassId> allBuiltinTypes;
    private static final Set<FqName> builtInsPackages;
    private static final Set<FqName> builtInsPackagesWithDefaultNamedImport;
    private static final Set<ClassId> constantAllowedTypes;
    private static final Map<ClassId, ClassId> elementTypeByPrimitiveArrayType;
    private static final Map<ClassId, ClassId> elementTypeByUnsignedArrayType;
    private static final Map<ClassId, ClassId> primitiveArrayTypeByElementType;
    private static final Set<ClassId> primitiveTypes;
    private static final Set<ClassId> signedIntegerTypes;
    private static final Map<ClassId, ClassId> unsignedArrayTypeByElementType;
    private static final Set<ClassId> unsignedTypes;

    private StandardClassIds() {
    }

    static {
        FqName fqName = new FqName("kotlin");
        BASE_KOTLIN_PACKAGE = fqName;
        Name nameIdentifier = Name.identifier("reflect");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        FqName fqNameChild = fqName.child(nameIdentifier);
        BASE_REFLECT_PACKAGE = fqNameChild;
        Name nameIdentifier2 = Name.identifier("collections");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        FqName fqNameChild2 = fqName.child(nameIdentifier2);
        BASE_COLLECTIONS_PACKAGE = fqNameChild2;
        Name nameIdentifier3 = Name.identifier("sequences");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        BASE_SEQUENCES_PACKAGE = fqName.child(nameIdentifier3);
        Name nameIdentifier4 = Name.identifier("ranges");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        FqName fqNameChild3 = fqName.child(nameIdentifier4);
        BASE_RANGES_PACKAGE = fqNameChild3;
        Name nameIdentifier5 = Name.identifier("jvm");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        FqName fqNameChild4 = fqName.child(nameIdentifier5);
        BASE_JVM_PACKAGE = fqNameChild4;
        Name nameIdentifier6 = Name.identifier("annotations");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        FqName fqNameChild5 = fqName.child(nameIdentifier6);
        Name nameIdentifier7 = Name.identifier("jvm");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        BASE_ANNOTATIONS_JVM_PACKAGE = fqNameChild5.child(nameIdentifier7);
        Name nameIdentifier8 = Name.identifier("internal");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        BASE_JVM_INTERNAL_PACKAGE = fqNameChild4.child(nameIdentifier8);
        Name nameIdentifier9 = Name.identifier("functions");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        BASE_JVM_FUNCTIONS_PACKAGE = fqNameChild4.child(nameIdentifier9);
        Name nameIdentifier10 = Name.identifier("annotation");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        FqName fqNameChild6 = fqName.child(nameIdentifier10);
        BASE_ANNOTATION_PACKAGE = fqNameChild6;
        Name nameIdentifier11 = Name.identifier("internal");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        FqName fqNameChild7 = fqName.child(nameIdentifier11);
        BASE_INTERNAL_PACKAGE = fqNameChild7;
        Name nameIdentifier12 = Name.identifier("ir");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        BASE_INTERNAL_IR_PACKAGE = fqNameChild7.child(nameIdentifier12);
        Name nameIdentifier13 = Name.identifier("coroutines");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        FqName fqNameChild8 = fqName.child(nameIdentifier13);
        BASE_COROUTINES_PACKAGE = fqNameChild8;
        Name nameIdentifier14 = Name.identifier("intrinsics");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        BASE_COROUTINES_INTRINSICS_PACKAGE = fqNameChild8.child(nameIdentifier14);
        Name nameIdentifier15 = Name.identifier("enums");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier15, "identifier(...)");
        BASE_ENUMS_PACKAGE = fqName.child(nameIdentifier15);
        Name nameIdentifier16 = Name.identifier("contracts");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier16, "identifier(...)");
        BASE_CONTRACTS_PACKAGE = fqName.child(nameIdentifier16);
        Name nameIdentifier17 = Name.identifier("concurrent");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier17, "identifier(...)");
        FqName fqNameChild9 = fqName.child(nameIdentifier17);
        BASE_CONCURRENT_PACKAGE = fqNameChild9;
        Name nameIdentifier18 = Name.identifier("atomics");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier18, "identifier(...)");
        FqName fqNameChild10 = fqNameChild9.child(nameIdentifier18);
        BASE_CONCURRENT_ATOMICS_PACKAGE = fqNameChild10;
        Name nameIdentifier19 = Name.identifier("test");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier19, "identifier(...)");
        BASE_TEST_PACKAGE = fqName.child(nameIdentifier19);
        Name nameIdentifier20 = Name.identifier("text");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier20, "identifier(...)");
        BASE_TEXT_PACKAGE = fqName.child(nameIdentifier20);
        builtInsPackagesWithDefaultNamedImport = SetsKt.setOf((Object[]) new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild6});
        builtInsPackages = SetsKt.setOf((Object[]) new FqName[]{fqName, fqNameChild2, fqNameChild3, fqNameChild6, fqNameChild, fqNameChild7, fqNameChild8, fqNameChild10});
        Nothing = StandardClassIds2.baseId("Nothing");
        Unit = StandardClassIds2.baseId("Unit");
        Any = StandardClassIds2.baseId("Any");
        Enum = StandardClassIds2.baseId("Enum");
        Annotation = StandardClassIds2.baseId("Annotation");
        Array = StandardClassIds2.baseId(ContentTypeResource.Field.Type.Array.identifier);
        ClassId classIdBaseId = StandardClassIds2.baseId("Boolean");
        Boolean = classIdBaseId;
        ClassId classIdBaseId2 = StandardClassIds2.baseId("Char");
        Char = classIdBaseId2;
        ClassId classIdBaseId3 = StandardClassIds2.baseId("Byte");
        Byte = classIdBaseId3;
        ClassId classIdBaseId4 = StandardClassIds2.baseId("Short");
        Short = classIdBaseId4;
        ClassId classIdBaseId5 = StandardClassIds2.baseId("Int");
        Int = classIdBaseId5;
        ClassId classIdBaseId6 = StandardClassIds2.baseId("Long");
        Long = classIdBaseId6;
        ClassId classIdBaseId7 = StandardClassIds2.baseId("Float");
        Float = classIdBaseId7;
        ClassId classIdBaseId8 = StandardClassIds2.baseId("Double");
        Double = classIdBaseId8;
        UByte = StandardClassIds2.unsignedId(classIdBaseId3);
        UShort = StandardClassIds2.unsignedId(classIdBaseId4);
        UInt = StandardClassIds2.unsignedId(classIdBaseId5);
        ULong = StandardClassIds2.unsignedId(classIdBaseId6);
        CharSequence = StandardClassIds2.baseId("CharSequence");
        String = StandardClassIds2.baseId("String");
        Throwable = StandardClassIds2.baseId("Throwable");
        Cloneable = StandardClassIds2.baseId("Cloneable");
        KProperty = StandardClassIds2.reflectId("KProperty");
        KMutableProperty = StandardClassIds2.reflectId("KMutableProperty");
        KProperty0 = StandardClassIds2.reflectId("KProperty0");
        KMutableProperty0 = StandardClassIds2.reflectId("KMutableProperty0");
        KProperty1 = StandardClassIds2.reflectId("KProperty1");
        KMutableProperty1 = StandardClassIds2.reflectId("KMutableProperty1");
        KProperty2 = StandardClassIds2.reflectId("KProperty2");
        KMutableProperty2 = StandardClassIds2.reflectId("KMutableProperty2");
        KFunction = StandardClassIds2.reflectId("KFunction");
        KClass = StandardClassIds2.reflectId("KClass");
        KCallable = StandardClassIds2.reflectId("KCallable");
        KType = StandardClassIds2.reflectId("KType");
        Comparable = StandardClassIds2.baseId("Comparable");
        Number = StandardClassIds2.baseId("Number");
        Function = StandardClassIds2.baseId("Function");
        Set<ClassId> of = SetsKt.setOf((Object[]) new ClassId[]{classIdBaseId, classIdBaseId2, classIdBaseId3, classIdBaseId4, classIdBaseId5, classIdBaseId6, classIdBaseId7, classIdBaseId8});
        primitiveTypes = of;
        signedIntegerTypes = SetsKt.setOf((Object[]) new ClassId[]{classIdBaseId3, classIdBaseId4, classIdBaseId5, classIdBaseId6});
        Set<ClassId> set = of;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(obj, StandardClassIds2.primitiveArrayId(((ClassId) obj).getShortClassName()));
        }
        primitiveArrayTypeByElementType = linkedHashMap;
        elementTypeByPrimitiveArrayType = StandardClassIds2.inverseMap(linkedHashMap);
        Set<ClassId> of2 = SetsKt.setOf((Object[]) new ClassId[]{UByte, UShort, UInt, ULong});
        unsignedTypes = of2;
        Set<ClassId> set2 = of2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(set2, 10)), 16));
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, StandardClassIds2.primitiveArrayId(((ClassId) obj2).getShortClassName()));
        }
        unsignedArrayTypeByElementType = linkedHashMap2;
        elementTypeByUnsignedArrayType = StandardClassIds2.inverseMap(linkedHashMap2);
        Set<ClassId> set3 = primitiveTypes;
        Set<ClassId> set4 = unsignedTypes;
        Set setPlus = SetsKt.plus((Set) set3, (Iterable) set4);
        ClassId classId = String;
        constantAllowedTypes = SetsKt.plus((Set<? extends ClassId>) setPlus, classId);
        Continuation = StandardClassIds2.coroutinesId("Continuation");
        Iterator = StandardClassIds2.collectionsId("Iterator");
        Iterable = StandardClassIds2.collectionsId("Iterable");
        Collection = StandardClassIds2.collectionsId("Collection");
        List = StandardClassIds2.collectionsId("List");
        ListIterator = StandardClassIds2.collectionsId("ListIterator");
        Set = StandardClassIds2.collectionsId("Set");
        ClassId classIdCollectionsId = StandardClassIds2.collectionsId("Map");
        Map = classIdCollectionsId;
        AbstractMap = StandardClassIds2.collectionsId("AbstractMap");
        MutableIterator = StandardClassIds2.collectionsId("MutableIterator");
        CharIterator = StandardClassIds2.collectionsId("CharIterator");
        MutableIterable = StandardClassIds2.collectionsId("MutableIterable");
        MutableCollection = StandardClassIds2.collectionsId("MutableCollection");
        MutableList = StandardClassIds2.collectionsId("MutableList");
        MutableListIterator = StandardClassIds2.collectionsId("MutableListIterator");
        MutableSet = StandardClassIds2.collectionsId("MutableSet");
        ClassId classIdCollectionsId2 = StandardClassIds2.collectionsId("MutableMap");
        MutableMap = classIdCollectionsId2;
        Name nameIdentifier21 = Name.identifier("Entry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier21, "identifier(...)");
        MapEntry = classIdCollectionsId.createNestedClassId(nameIdentifier21);
        Name nameIdentifier22 = Name.identifier("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier22, "identifier(...)");
        MutableMapEntry = classIdCollectionsId2.createNestedClassId(nameIdentifier22);
        Result = StandardClassIds2.baseId("Result");
        IntRange = StandardClassIds2.rangesId("IntRange");
        LongRange = StandardClassIds2.rangesId("LongRange");
        CharRange = StandardClassIds2.rangesId("CharRange");
        AnnotationRetention = StandardClassIds2.annotationId("AnnotationRetention");
        AnnotationTarget = StandardClassIds2.annotationId("AnnotationTarget");
        DeprecationLevel = StandardClassIds2.baseId("DeprecationLevel");
        EnumEntries = StandardClassIds2.enumsId("EnumEntries");
        allBuiltinTypes = SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set<? extends ClassId>) SetsKt.plus((Set) set3, (Iterable) set4), classId), Unit), Any), Enum);
    }

    public final FqName getBASE_KOTLIN_PACKAGE() {
        return BASE_KOTLIN_PACKAGE;
    }

    public final FqName getBASE_REFLECT_PACKAGE() {
        return BASE_REFLECT_PACKAGE;
    }

    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return BASE_COLLECTIONS_PACKAGE;
    }

    public final FqName getBASE_RANGES_PACKAGE() {
        return BASE_RANGES_PACKAGE;
    }

    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return BASE_ANNOTATION_PACKAGE;
    }

    public final FqName getBASE_COROUTINES_PACKAGE() {
        return BASE_COROUTINES_PACKAGE;
    }

    public final FqName getBASE_ENUMS_PACKAGE() {
        return BASE_ENUMS_PACKAGE;
    }

    public final ClassId getArray() {
        return Array;
    }

    public final ClassId getKFunction() {
        return KFunction;
    }

    public final ClassId getKClass() {
        return KClass;
    }

    public final ClassId getMutableList() {
        return MutableList;
    }

    public final ClassId getMutableSet() {
        return MutableSet;
    }

    public final ClassId getMutableMap() {
        return MutableMap;
    }

    public final ClassId getEnumEntries() {
        return EnumEntries;
    }
}
