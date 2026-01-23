package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;

/* compiled from: NewCapturedType.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor, reason: use source file name */
/* loaded from: classes14.dex */
public final class NewCapturedType2 implements CapturedTypeConstructor {
    private final Lazy _supertypes$delegate;
    private final NewCapturedType2 original;
    private final TypeProjection projection;
    private Function0<? extends List<? extends KotlinType5>> supertypesComputation;
    private final TypeParameterDescriptor typeParameter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _init_$lambda$0(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List initializeSupertypes$lambda$3(List list) {
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo28704getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    public NewCapturedType2(TypeProjection projection, Function0<? extends List<? extends KotlinType5>> function0, NewCapturedType2 newCapturedType2, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.projection = projection;
        this.supertypesComputation = function0;
        this.original = newCapturedType2;
        this.typeParameter = typeParameterDescriptor;
        this._supertypes$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$0
            private final NewCapturedType2 arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return NewCapturedType2._supertypes_delegate$lambda$1(this.arg$0);
            }
        });
    }

    public /* synthetic */ NewCapturedType2(TypeProjection typeProjection, Function0 function0, NewCapturedType2 newCapturedType2, TypeParameterDescriptor typeParameterDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : newCapturedType2, (i & 8) != 0 ? null : typeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public TypeProjection getProjection() {
        return this.projection;
    }

    public /* synthetic */ NewCapturedType2(TypeProjection typeProjection, List list, NewCapturedType2 newCapturedType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, list, (i & 4) != 0 ? null : newCapturedType2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType2(TypeProjection projection, final List<? extends KotlinType5> supertypes, NewCapturedType2 newCapturedType2) {
        this(projection, new Function0(supertypes) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$1
            private final List arg$0;

            {
                this.arg$0 = supertypes;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return NewCapturedType2._init_$lambda$0(this.arg$0);
            }
        }, newCapturedType2, null, 8, null);
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
    }

    private final List<KotlinType5> get_supertypes() {
        return (List) this._supertypes$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _supertypes_delegate$lambda$1(NewCapturedType2 newCapturedType2) {
        Function0<? extends List<? extends KotlinType5>> function0 = newCapturedType2.supertypesComputation;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public final void initializeSupertypes(final List<? extends KotlinType5> supertypes) {
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
        this.supertypesComputation = new Function0(supertypes) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$2
            private final List arg$0;

            {
                this.arg$0 = supertypes;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return NewCapturedType2.initializeSupertypes$lambda$3(this.arg$0);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getSupertypes */
    public List<KotlinType5> mo28705getSupertypes() {
        List<KotlinType5> list = get_supertypes();
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinType type2 = getProjection().getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        return TypeUtils2.getBuiltIns(type2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public NewCapturedType2 refine(final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = getProjection().refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(typeProjectionRefine, "refine(...)");
        Function0 function0 = this.supertypesComputation != null ? new Function0(this, kotlinTypeRefiner) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$3
            private final NewCapturedType2 arg$0;
            private final KotlinTypeRefiner arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = kotlinTypeRefiner;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return NewCapturedType2.refine$lambda$6$lambda$5(this.arg$0, this.arg$1);
            }
        } : null;
        NewCapturedType2 newCapturedType2 = this.original;
        if (newCapturedType2 == null) {
            newCapturedType2 = this;
        }
        return new NewCapturedType2(typeProjectionRefine, function0, newCapturedType2, this.typeParameter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List refine$lambda$6$lambda$5(NewCapturedType2 newCapturedType2, KotlinTypeRefiner kotlinTypeRefiner) {
        List<KotlinType5> listMo28705getSupertypes = newCapturedType2.mo28705getSupertypes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo28705getSupertypes, 10));
        Iterator<T> it = listMo28705getSupertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((KotlinType5) it.next()).refine(kotlinTypeRefiner));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(NewCapturedType2.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedType2 newCapturedType2 = (NewCapturedType2) obj;
        NewCapturedType2 newCapturedType22 = this.original;
        if (newCapturedType22 == null) {
            newCapturedType22 = this;
        }
        NewCapturedType2 newCapturedType23 = newCapturedType2.original;
        if (newCapturedType23 != null) {
            obj = newCapturedType23;
        }
        return newCapturedType22 == obj;
    }

    public int hashCode() {
        NewCapturedType2 newCapturedType2 = this.original;
        return newCapturedType2 != null ? newCapturedType2.hashCode() : super.hashCode();
    }

    public String toString() {
        return "CapturedType(" + getProjection() + ')';
    }
}
