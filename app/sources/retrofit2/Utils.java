package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Unit;
import okhttp3.ResponseBody;
import okio.Buffer;

/* loaded from: classes23.dex */
final class Utils {
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
    private static boolean checkForKotlinUnit = true;

    static RuntimeException methodError(Method method, String str, Object... objArr) {
        return methodError(method, null, str, objArr);
    }

    static RuntimeException methodError(Method method, Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    static RuntimeException parameterError(Method method, Throwable th, int i, String str, Object... objArr) {
        return methodError(method, th, str + " (" + Platform.reflection.describeMethodParameter(method, i) + ")", objArr);
    }

    static RuntimeException parameterError(Method method, int i, String str, Object... objArr) {
        return methodError(method, str + " (" + Platform.reflection.describeMethodParameter(method, i) + ")", objArr);
    }

    static Class<?> getRawType(Type type2) {
        Objects.requireNonNull(type2, "type == null");
        if (type2 instanceof Class) {
            return (Class) type2;
        }
        if (type2 instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type2).getRawType();
            if (!(rawType instanceof Class)) {
                throw new IllegalArgumentException();
            }
            return (Class) rawType;
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
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type2 + "> is of type " + type2.getClass().getName());
    }

    static boolean equals(Type type2, Type type3) {
        if (type2 == type3) {
            return true;
        }
        if (type2 instanceof Class) {
            return type2.equals(type3);
        }
        if (type2 instanceof ParameterizedType) {
            if (!(type3 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type2 instanceof GenericArrayType) {
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

    static Type getGenericSupertype(Type type2, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type2;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static int indexOf(Object[] objArr, Object obj) {
        for (int i = 0; i < objArr.length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    static String typeToString(Type type2) {
        return type2 instanceof Class ? ((Class) type2).getName() : type2.toString();
    }

    static Type getSupertype(Type type2, Class<?> cls, Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return resolve(type2, cls, getGenericSupertype(type2, cls, cls2));
    }

    static Type resolve(Type type2, Class<?> cls, Type type3) {
        Type type4 = type3;
        while (type4 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type4;
            Type typeResolveTypeVariable = resolveTypeVariable(type2, cls, typeVariable);
            if (typeResolveTypeVariable == typeVariable) {
                return typeResolveTypeVariable;
            }
            type4 = typeResolveTypeVariable;
        }
        if (type4 instanceof Class) {
            Class cls2 = (Class) type4;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeResolve = resolve(type2, cls, componentType);
                return componentType == typeResolve ? cls2 : new GenericArrayTypeImpl(typeResolve);
            }
        }
        if (type4 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type4;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeResolve2 = resolve(type2, cls, genericComponentType);
            return genericComponentType == typeResolve2 ? genericArrayType : new GenericArrayTypeImpl(typeResolve2);
        }
        if (type4 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type4;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeResolve3 = resolve(type2, cls, ownerType);
            boolean z = typeResolve3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i = 0; i < length; i++) {
                Type typeResolve4 = resolve(type2, cls, actualTypeArguments[i]);
                if (typeResolve4 != actualTypeArguments[i]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i] = typeResolve4;
                }
            }
            return z ? new ParameterizedTypeImpl(typeResolve3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z2 = type4 instanceof WildcardType;
        Type type5 = type4;
        if (z2) {
            WildcardType wildcardType = (WildcardType) type4;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeResolve5 = resolve(type2, cls, lowerBounds[0]);
                type5 = wildcardType;
                if (typeResolve5 != lowerBounds[0]) {
                    return new WildcardTypeImpl(new Type[]{Object.class}, new Type[]{typeResolve5});
                }
            } else {
                type5 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeResolve6 = resolve(type2, cls, upperBounds[0]);
                    type5 = wildcardType;
                    if (typeResolve6 != upperBounds[0]) {
                        return new WildcardTypeImpl(new Type[]{typeResolve6}, EMPTY_TYPE_ARRAY);
                    }
                }
            }
        }
        return type5;
    }

    private static Type resolveTypeVariable(Type type2, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsDeclaringClassOf = declaringClassOf(typeVariable);
        if (clsDeclaringClassOf != null) {
            Type genericSupertype = getGenericSupertype(type2, cls, clsDeclaringClassOf);
            if (genericSupertype instanceof ParameterizedType) {
                return ((ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(clsDeclaringClassOf.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static void checkNotPrimitive(Type type2) {
        if ((type2 instanceof Class) && ((Class) type2).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean isAnnotationPresent(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static ResponseBody buffer(ResponseBody responseBody) throws IOException {
        Buffer buffer = new Buffer();
        responseBody.source().readAll(buffer);
        return ResponseBody.create(responseBody.contentType(), responseBody.contentLength(), buffer);
    }

    static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type2 = actualTypeArguments[i];
        return type2 instanceof WildcardType ? ((WildcardType) type2).getUpperBounds()[0] : type2;
    }

    static Type getParameterLowerBound(int i, ParameterizedType parameterizedType) {
        Type type2 = parameterizedType.getActualTypeArguments()[i];
        return type2 instanceof WildcardType ? ((WildcardType) type2).getLowerBounds()[0] : type2;
    }

    static boolean hasUnresolvableType(Type type2) {
        if (type2 instanceof Class) {
            return false;
        }
        if (type2 instanceof ParameterizedType) {
            for (Type type3 : ((ParameterizedType) type2).getActualTypeArguments()) {
                if (hasUnresolvableType(type3)) {
                    return true;
                }
            }
            return false;
        }
        if (type2 instanceof GenericArrayType) {
            return hasUnresolvableType(((GenericArrayType) type2).getGenericComponentType());
        }
        if ((type2 instanceof TypeVariable) || (type2 instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type2 + "> is of type " + (type2 == null ? "null" : type2.getClass().getName()));
    }

    static final class ParameterizedTypeImpl implements ParameterizedType {
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        ParameterizedTypeImpl(Type type2, Type type3, Type... typeArr) {
            if (type3 instanceof Class) {
                if ((type2 == null) != (((Class) type3).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type4 : typeArr) {
                Objects.requireNonNull(type4, "typeArgument == null");
                Utils.checkNotPrimitive(type4);
            }
            this.ownerType = type2;
            this.rawType = type3;
            this.typeArguments = (Type[]) typeArr.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && Utils.equals(this, (ParameterizedType) obj);
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Type type2 = this.ownerType;
            return iHashCode ^ (type2 != null ? type2.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.typeArguments;
            if (typeArr.length == 0) {
                return Utils.typeToString(this.rawType);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(Utils.typeToString(this.rawType));
            sb.append("<");
            sb.append(Utils.typeToString(this.typeArguments[0]));
            for (int i = 1; i < this.typeArguments.length; i++) {
                sb.append(", ");
                sb.append(Utils.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* loaded from: classes25.dex */
    private static final class GenericArrayTypeImpl implements GenericArrayType {
        private final Type componentType;

        GenericArrayTypeImpl(Type type2) {
            this.componentType = type2;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && Utils.equals(this, (GenericArrayType) obj);
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return Utils.typeToString(this.componentType) + "[]";
        }
    }

    /* loaded from: classes25.dex */
    private static final class WildcardTypeImpl implements WildcardType {
        private final Type lowerBound;
        private final Type upperBound;

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length == 1) {
                typeArr2[0].getClass();
                Utils.checkNotPrimitive(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    throw new IllegalArgumentException();
                }
                this.lowerBound = typeArr2[0];
                this.upperBound = Object.class;
                return;
            }
            typeArr[0].getClass();
            Utils.checkNotPrimitive(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = typeArr[0];
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type2 = this.lowerBound;
            return type2 != null ? new Type[]{type2} : Utils.EMPTY_TYPE_ARRAY;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && Utils.equals(this, (WildcardType) obj);
        }

        public int hashCode() {
            Type type2 = this.lowerBound;
            return (type2 != null ? type2.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + Utils.typeToString(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + Utils.typeToString(this.upperBound);
        }
    }

    static void throwIfFatal(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static boolean isUnit(Type type2) {
        return checkForKotlinUnit && type2 == Unit.class;
    }
}
