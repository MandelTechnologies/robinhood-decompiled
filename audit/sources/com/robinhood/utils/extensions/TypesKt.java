package com.robinhood.utils.extensions;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Types.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\b*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\"\u001a\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m3636d2 = {"rawType", "Ljava/lang/Class;", "Ljava/lang/reflect/Type;", "getRawType", "(Ljava/lang/reflect/Type;)Ljava/lang/Class;", "bindingVariablesFrom", "contextType", "Ljava/lang/reflect/ParameterizedType;", "Ljava/lang/reflect/WildcardType;", "Ljava/lang/reflect/TypeVariable;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class TypesKt {
    public static final Class<?> getRawType(Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Class<?> rawType = com.squareup.moshi.Types.getRawType(type2);
        Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
        return rawType;
    }

    public static final Type bindingVariablesFrom(Type type2, Type contextType) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        return !(contextType instanceof ParameterizedType) ? type2 : type2 instanceof ParameterizedType ? bindingVariablesFrom((ParameterizedType) type2, (ParameterizedType) contextType) : type2 instanceof WildcardType ? bindingVariablesFrom((WildcardType) type2, (ParameterizedType) contextType) : type2 instanceof TypeVariable ? bindingVariablesFrom((TypeVariable<?>) type2, (ParameterizedType) contextType) : type2;
    }

    private static final ParameterizedType bindingVariablesFrom(ParameterizedType parameterizedType, ParameterizedType parameterizedType2) {
        ParameterizedType parameterizedTypeNewParameterizedTypeWithOwner;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        ArrayList arrayList = new ArrayList(actualTypeArguments.length);
        for (Type type2 : actualTypeArguments) {
            Intrinsics.checkNotNull(type2);
            arrayList.add(bindingVariablesFrom(type2, parameterizedType2));
        }
        Type[] typeArr = (Type[]) arrayList.toArray(new Type[0]);
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType != null && (parameterizedTypeNewParameterizedTypeWithOwner = com.squareup.moshi.Types.newParameterizedTypeWithOwner(ownerType, parameterizedType.getRawType(), (Type[]) Arrays.copyOf(typeArr, typeArr.length))) != null) {
            return parameterizedTypeNewParameterizedTypeWithOwner;
        }
        ParameterizedType parameterizedTypeNewParameterizedType = com.squareup.moshi.Types.newParameterizedType(parameterizedType.getRawType(), (Type[]) Arrays.copyOf(typeArr, typeArr.length));
        Intrinsics.checkNotNullExpressionValue(parameterizedTypeNewParameterizedType, "newParameterizedType(...)");
        return parameterizedTypeNewParameterizedType;
    }

    private static final WildcardType bindingVariablesFrom(WildcardType wildcardType, ParameterizedType parameterizedType) {
        Type[] upperBounds = wildcardType.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        ArrayList arrayList = new ArrayList(upperBounds.length);
        for (Type type2 : upperBounds) {
            Intrinsics.checkNotNull(type2);
            arrayList.add(bindingVariablesFrom(type2, parameterizedType));
        }
        Type[] typeArr = (Type[]) arrayList.toArray(new Type[0]);
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
        ArrayList arrayList2 = new ArrayList(lowerBounds.length);
        for (Type type3 : lowerBounds) {
            Intrinsics.checkNotNull(type3);
            arrayList2.add(bindingVariablesFrom(type3, parameterizedType));
        }
        return new Util.WildcardTypeImpl(typeArr, (Type[]) arrayList2.toArray(new Type[0]));
    }

    private static final Type bindingVariablesFrom(TypeVariable<?> typeVariable, ParameterizedType parameterizedType) {
        Type rawType = parameterizedType.getRawType();
        Class cls = rawType instanceof Class ? (Class) rawType : null;
        if (cls != null) {
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Intrinsics.checkNotNull(typeParameters);
            int length = typeParameters.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (Intrinsics.areEqual(typeParameters[i], typeVariable)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == typeParameters.length) {
                    Type type2 = actualTypeArguments[i];
                    Intrinsics.checkNotNullExpressionValue(type2, "get(...)");
                    return type2;
                }
            }
        }
        return typeVariable;
    }
}
