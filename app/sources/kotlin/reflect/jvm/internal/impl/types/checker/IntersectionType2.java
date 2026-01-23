package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType4;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes2;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypes5;
import kotlin.reflect.jvm.internal.impl.types.StubTypes2;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.flexibleTypes2;

/* compiled from: IntersectionType.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector, reason: use source file name */
/* loaded from: classes14.dex */
public final class IntersectionType2 {
    public static final IntersectionType2 INSTANCE = new IntersectionType2();

    private IntersectionType2() {
    }

    public final KotlinType4 intersectTypes$descriptors(List<? extends KotlinType4> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<KotlinType4> arrayList = new ArrayList();
        for (KotlinType4 kotlinType4 : types) {
            if (kotlinType4.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> collectionMo28705getSupertypes = kotlinType4.getConstructor().mo28705getSupertypes();
                Intrinsics.checkNotNullExpressionValue(collectionMo28705getSupertypes, "getSupertypes(...)");
                Collection<KotlinType> collection = collectionMo28705getSupertypes;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
                for (KotlinType kotlinType : collection) {
                    Intrinsics.checkNotNull(kotlinType);
                    KotlinType4 kotlinType4UpperIfFlexible = flexibleTypes2.upperIfFlexible(kotlinType);
                    if (kotlinType4.isMarkedNullable()) {
                        kotlinType4UpperIfFlexible = kotlinType4UpperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(kotlinType4UpperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(kotlinType4);
            }
        }
        ResultNullability resultNullabilityCombine = ResultNullability.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            resultNullabilityCombine = resultNullabilityCombine.combine((KotlinType5) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (KotlinType4 kotlinType4MakeSimpleTypeDefinitelyNotNullOrNotNull$default : arrayList) {
            if (resultNullabilityCombine == ResultNullability.NOT_NULL) {
                if (kotlinType4MakeSimpleTypeDefinitelyNotNullOrNotNull$default instanceof NewCapturedType) {
                    kotlinType4MakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypes5.withNotNullProjection((NewCapturedType) kotlinType4MakeSimpleTypeDefinitelyNotNullOrNotNull$default);
                }
                kotlinType4MakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypes5.makeSimpleTypeDefinitelyNotNullOrNotNull$default(kotlinType4MakeSimpleTypeDefinitelyNotNullOrNotNull$default, false, 1, null);
            }
            linkedHashSet.add(kotlinType4MakeSimpleTypeDefinitelyNotNullOrNotNull$default);
        }
        List<? extends KotlinType4> list = types;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((KotlinType4) it2.next()).getAttributes());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((TypeAttributes) next).intersect((TypeAttributes) it3.next());
        }
        return intersectTypesWithoutIntersectionType(linkedHashSet).replaceAttributes((TypeAttributes) next);
    }

    private final KotlinType4 intersectTypesWithoutIntersectionType(final Set<? extends KotlinType4> set) {
        if (set.size() == 1) {
            return (KotlinType4) CollectionsKt.single(set);
        }
        new Function0(set) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$$Lambda$0
            private final Set arg$0;

            {
                this.arg$0 = set;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return IntersectionType2.intersectTypesWithoutIntersectionType$lambda$6(this.arg$0);
            }
        };
        Set<? extends KotlinType4> set2 = set;
        Collection<KotlinType4> collectionFilterTypes = filterTypes(set2, new IntersectionType3(this));
        collectionFilterTypes.isEmpty();
        KotlinType4 kotlinType4FindIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(collectionFilterTypes);
        if (kotlinType4FindIntersectionType != null) {
            return kotlinType4FindIntersectionType;
        }
        Collection<KotlinType4> collectionFilterTypes2 = filterTypes(collectionFilterTypes, new IntersectionType4(NewKotlinTypeChecker.Companion.getDefault()));
        collectionFilterTypes2.isEmpty();
        return collectionFilterTypes2.size() < 2 ? (KotlinType4) CollectionsKt.single(collectionFilterTypes2) : new IntersectionTypeConstructor(set2).createType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String intersectTypesWithoutIntersectionType$lambda$6(Set set) {
        return "This collections cannot be empty! input types: " + CollectionsKt.joinToString$default(set, null, null, null, 0, null, null, 63, null);
    }

    private final Collection<KotlinType4> filterTypes(Collection<? extends KotlinType4> collection, Function2<? super KotlinType4, ? super KotlinType4, Boolean> function2) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            KotlinType4 kotlinType4 = (KotlinType4) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    KotlinType4 kotlinType42 = (KotlinType4) it2.next();
                    if (kotlinType42 != kotlinType4) {
                        Intrinsics.checkNotNull(kotlinType42);
                        Intrinsics.checkNotNull(kotlinType4);
                        if (function2.invoke(kotlinType42, kotlinType4).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStrictSupertype(KotlinType kotlinType, KotlinType kotlinType2) {
        NewKotlinTypeChecker2 newKotlinTypeChecker2 = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeChecker2.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeChecker2.isSubtypeOf(kotlinType2, kotlinType);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability */
    private static final class ResultNullability {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResultNullability[] $VALUES;
        public static final ResultNullability START = new START("START", 0);
        public static final ResultNullability ACCEPT_NULL = new ACCEPT_NULL("ACCEPT_NULL", 1);
        public static final ResultNullability UNKNOWN = new UNKNOWN("UNKNOWN", 2);
        public static final ResultNullability NOT_NULL = new NOT_NULL("NOT_NULL", 3);

        private static final /* synthetic */ ResultNullability[] $values() {
            return new ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        public /* synthetic */ ResultNullability(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public abstract ResultNullability combine(KotlinType5 kotlinType5);

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability$START */
        static final class START extends ResultNullability {
            START(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.IntersectionType2.ResultNullability
            public ResultNullability combine(KotlinType5 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        private ResultNullability(String str, int i) {
        }

        static {
            ResultNullability[] resultNullabilityArr$values = $values();
            $VALUES = resultNullabilityArr$values;
            $ENTRIES = EnumEntries2.enumEntries(resultNullabilityArr$values);
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability$ACCEPT_NULL */
        static final class ACCEPT_NULL extends ResultNullability {
            ACCEPT_NULL(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.IntersectionType2.ResultNullability
            public ResultNullability combine(KotlinType5 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability$UNKNOWN */
        static final class UNKNOWN extends ResultNullability {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.IntersectionType2.ResultNullability
            public ResultNullability combine(KotlinType5 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                ResultNullability resultNullability = getResultNullability(nextType);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$ResultNullability$NOT_NULL */
        static final class NOT_NULL extends ResultNullability {
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.IntersectionType2.ResultNullability
            public NOT_NULL combine(KotlinType5 nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }

            NOT_NULL(String str, int i) {
                super(str, i, null);
            }
        }

        protected final ResultNullability getResultNullability(KotlinType5 kotlinType5) {
            Intrinsics.checkNotNullParameter(kotlinType5, "<this>");
            return kotlinType5.isMarkedNullable() ? ACCEPT_NULL : ((kotlinType5 instanceof SpecialTypes2) && (((SpecialTypes2) kotlinType5).getOriginal() instanceof StubTypes2)) ? NOT_NULL : kotlinType5 instanceof StubTypes2 ? UNKNOWN : NewKotlinTypeChecker3.INSTANCE.isSubtypeOfAny(kotlinType5) ? NOT_NULL : UNKNOWN;
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) $VALUES.clone();
        }
    }
}
