package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker3;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* compiled from: AbstractTypeChecker.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractNullabilityChecker, reason: use source file name */
/* loaded from: classes14.dex */
public final class AbstractTypeChecker2 {
    public static final AbstractTypeChecker2 INSTANCE = new AbstractTypeChecker2();

    private AbstractTypeChecker2() {
    }

    public final boolean isPossibleSubtype(AbstractTypeChecker3 state, RigidTypeMarker subType, RigidTypeMarker superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return runIsPossibleSubtype(state, subType, superType);
    }

    private final boolean runIsPossibleSubtype(AbstractTypeChecker3 abstractTypeChecker3, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        TypeSystemContext typeSystemContext = abstractTypeChecker3.getTypeSystemContext();
        if (AbstractTypeChecker.RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(rigidTypeMarker))) {
                abstractTypeChecker3.isAllowedTypeVariable(rigidTypeMarker);
            }
            if (!typeSystemContext.isSingleClassifierType(rigidTypeMarker2)) {
                abstractTypeChecker3.isAllowedTypeVariable(rigidTypeMarker2);
            }
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker2) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker) || typeSystemContext.isNotNullTypeParameter(rigidTypeMarker)) {
            return true;
        }
        if ((rigidTypeMarker instanceof CapturedTypeMarker) && typeSystemContext.isProjectionNotNull((CapturedTypeMarker) rigidTypeMarker)) {
            return true;
        }
        AbstractTypeChecker2 abstractTypeChecker2 = INSTANCE;
        if (abstractTypeChecker2.hasNotNullSupertype(abstractTypeChecker3, rigidTypeMarker, AbstractTypeChecker3.SupertypesPolicy.LowerIfFlexible.INSTANCE)) {
            return true;
        }
        if (typeSystemContext.isDefinitelyNotNullType(rigidTypeMarker2) || abstractTypeChecker2.hasNotNullSupertype(abstractTypeChecker3, rigidTypeMarker2, AbstractTypeChecker3.SupertypesPolicy.UpperIfFlexible.INSTANCE) || typeSystemContext.isClassType(rigidTypeMarker)) {
            return false;
        }
        return abstractTypeChecker2.hasPathByNotMarkedNullableNodes(abstractTypeChecker3, rigidTypeMarker, typeSystemContext.typeConstructor(rigidTypeMarker2));
    }

    public final boolean hasNotNullSupertype(AbstractTypeChecker3 abstractTypeChecker3, RigidTypeMarker type2, AbstractTypeChecker3.SupertypesPolicy supertypesPolicy) {
        Intrinsics.checkNotNullParameter(abstractTypeChecker3, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        TypeSystemContext typeSystemContext = abstractTypeChecker3.getTypeSystemContext();
        if ((typeSystemContext.isClassType(type2) && !typeSystemContext.isMarkedNullable(type2)) || typeSystemContext.isDefinitelyNotNullType(type2)) {
            return true;
        }
        abstractTypeChecker3.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = abstractTypeChecker3.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = abstractTypeChecker3.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(type2);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                AbstractTypeChecker3.SupertypesPolicy supertypesPolicy2 = typeSystemContext.isMarkedNullable(rigidTypeMarkerPop) ? AbstractTypeChecker3.SupertypesPolicy.None.INSTANCE : supertypesPolicy;
                if (Intrinsics.areEqual(supertypesPolicy2, AbstractTypeChecker3.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy2 = null;
                }
                if (supertypesPolicy2 == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = abstractTypeChecker3.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo28708transformType = supertypesPolicy2.mo28708transformType(abstractTypeChecker3, it.next());
                        if ((typeSystemContext.isClassType(rigidTypeMarkerMo28708transformType) && !typeSystemContext.isMarkedNullable(rigidTypeMarkerMo28708transformType)) || typeSystemContext.isDefinitelyNotNullType(rigidTypeMarkerMo28708transformType)) {
                            abstractTypeChecker3.clear();
                            return true;
                        }
                        supertypesDeque.add(rigidTypeMarkerMo28708transformType);
                    }
                }
            }
        }
        abstractTypeChecker3.clear();
        return false;
    }

    public final boolean hasPathByNotMarkedNullableNodes(AbstractTypeChecker3 state, RigidTypeMarker start, TypeConstructorMarker end) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        TypeSystemContext typeSystemContext = state.getTypeSystemContext();
        if (INSTANCE.isApplicableAsEndNode(state, start, end)) {
            return true;
        }
        state.initialize();
        ArrayDeque<RigidTypeMarker> supertypesDeque = state.getSupertypesDeque();
        Intrinsics.checkNotNull(supertypesDeque);
        Set<RigidTypeMarker> supertypesSet = state.getSupertypesSet();
        Intrinsics.checkNotNull(supertypesSet);
        supertypesDeque.push(start);
        while (!supertypesDeque.isEmpty()) {
            RigidTypeMarker rigidTypeMarkerPop = supertypesDeque.pop();
            Intrinsics.checkNotNull(rigidTypeMarkerPop);
            if (supertypesSet.add(rigidTypeMarkerPop)) {
                AbstractTypeChecker3.SupertypesPolicy supertypesPolicy = typeSystemContext.isMarkedNullable(rigidTypeMarkerPop) ? AbstractTypeChecker3.SupertypesPolicy.None.INSTANCE : AbstractTypeChecker3.SupertypesPolicy.LowerIfFlexible.INSTANCE;
                if (Intrinsics.areEqual(supertypesPolicy, AbstractTypeChecker3.SupertypesPolicy.None.INSTANCE)) {
                    supertypesPolicy = null;
                }
                if (supertypesPolicy == null) {
                    continue;
                } else {
                    TypeSystemContext typeSystemContext2 = state.getTypeSystemContext();
                    Iterator<KotlinTypeMarker> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(rigidTypeMarkerPop)).iterator();
                    while (it.hasNext()) {
                        RigidTypeMarker rigidTypeMarkerMo28708transformType = supertypesPolicy.mo28708transformType(state, it.next());
                        if (INSTANCE.isApplicableAsEndNode(state, rigidTypeMarkerMo28708transformType, end)) {
                            state.clear();
                            return true;
                        }
                        supertypesDeque.add(rigidTypeMarkerMo28708transformType);
                    }
                }
            }
        }
        state.clear();
        return false;
    }

    private final boolean isApplicableAsEndNode(AbstractTypeChecker3 abstractTypeChecker3, RigidTypeMarker rigidTypeMarker, TypeConstructorMarker typeConstructorMarker) {
        TypeSystemContext typeSystemContext = abstractTypeChecker3.getTypeSystemContext();
        if (typeSystemContext.isNothing(rigidTypeMarker)) {
            return true;
        }
        if (typeSystemContext.isMarkedNullable(rigidTypeMarker)) {
            return false;
        }
        if (abstractTypeChecker3.isStubTypeEqualsToAnything() && typeSystemContext.isStubType(rigidTypeMarker)) {
            return true;
        }
        return typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(rigidTypeMarker), typeConstructorMarker);
    }
}
