package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes21.dex */
public final class Types {
    public static String generatedJsonAdapterName(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    public static ParameterizedType newParameterizedType(Type type2, Type... typeArr) {
        if (typeArr.length == 0) {
            throw new IllegalArgumentException("Missing type arguments for " + type2);
        }
        return new Util.ParameterizedTypeImpl(null, type2, typeArr);
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type2, Type type3, Type... typeArr) {
        if (typeArr.length == 0) {
            throw new IllegalArgumentException("Missing type arguments for " + type3);
        }
        return new Util.ParameterizedTypeImpl(type2, type3, typeArr);
    }

    public static GenericArrayType arrayOf(Type type2) {
        return new Util.GenericArrayTypeImpl(type2);
    }

    public static WildcardType subtypeOf(Type type2) {
        Type[] upperBounds;
        if (type2 instanceof WildcardType) {
            upperBounds = ((WildcardType) type2).getUpperBounds();
        } else {
            upperBounds = new Type[]{type2};
        }
        return new Util.WildcardTypeImpl(upperBounds, Util.EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type2) {
        Type[] lowerBounds;
        if (type2 instanceof WildcardType) {
            lowerBounds = ((WildcardType) type2).getLowerBounds();
        } else {
            lowerBounds = new Type[]{type2};
        }
        return new Util.WildcardTypeImpl(new Type[]{Object.class}, lowerBounds);
    }

    public static Class<?> getRawType(Type type2) {
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type2).getRawType();
        }
        if (type2 instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type2).getGenericComponentType()), 0).getClass();
        }
        if (type2 instanceof TypeVariable) {
            return Object.class;
        }
        if (type2 instanceof WildcardType) {
            return getRawType(((WildcardType) type2).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type2 + "> is of type " + (type2 == null ? "null" : type2.getClass().getName()));
    }

    public static Type collectionElementType(Type type2, Class<?> cls) {
        Type supertype = getSupertype(type2, cls, Collection.class);
        if (supertype instanceof WildcardType) {
            supertype = ((WildcardType) supertype).getUpperBounds()[0];
        }
        if (supertype instanceof ParameterizedType) {
            return ((ParameterizedType) supertype).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static boolean equals(Type type2, Type type3) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type2 == type3) {
            return true;
        }
        if (type2 instanceof Class) {
            if (type3 instanceof GenericArrayType) {
                return equals(((Class) type2).getComponentType(), ((GenericArrayType) type3).getGenericComponentType());
            }
            return type2.equals(type3);
        }
        if (type2 instanceof ParameterizedType) {
            if (!(type3 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type3;
            if (parameterizedType instanceof Util.ParameterizedTypeImpl) {
                actualTypeArguments = ((Util.ParameterizedTypeImpl) parameterizedType).typeArguments;
            } else {
                actualTypeArguments = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof Util.ParameterizedTypeImpl) {
                actualTypeArguments2 = ((Util.ParameterizedTypeImpl) parameterizedType2).typeArguments;
            } else {
                actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            }
            return equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
        }
        if (type2 instanceof GenericArrayType) {
            if (type3 instanceof Class) {
                return equals(((Class) type3).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            if (type3 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type2).getGenericComponentType(), ((GenericArrayType) type3).getGenericComponentType());
            }
            return false;
        }
        if (type2 instanceof WildcardType) {
            if (!(type3 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type2;
            WildcardType wildcardType2 = (WildcardType) type3;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type2 instanceof TypeVariable) || !(type3 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type2;
        TypeVariable typeVariable2 = (TypeVariable) type3;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static Type[] mapKeyAndValueTypes(Type type2, Class<?> cls) {
        if (type2 == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type supertype = getSupertype(type2, cls, Map.class);
        if (supertype instanceof ParameterizedType) {
            return ((ParameterizedType) supertype).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    static Type getSupertype(Type type2, Class<?> cls, Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return Util.resolve(type2, cls, Util.getGenericSupertype(type2, cls, cls2));
    }

    static Type getGenericSuperclass(Type type2) {
        Class<?> rawType = getRawType(type2);
        return Util.resolve(type2, rawType, rawType.getGenericSuperclass());
    }

    static Type arrayComponentType(Type type2) {
        if (type2 instanceof GenericArrayType) {
            return ((GenericArrayType) type2).getGenericComponentType();
        }
        if (type2 instanceof Class) {
            return ((Class) type2).getComponentType();
        }
        return null;
    }
}
