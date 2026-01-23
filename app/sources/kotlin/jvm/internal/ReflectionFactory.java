package kotlin.jvm.internal;

import java.util.List;
import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty3;
import kotlin.reflect.KProperty4;
import kotlin.reflect.KProperty5;
import kotlin.reflect.KProperty6;
import kotlin.reflect.KProperty7;
import kotlin.reflect.KProperty8;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes21.dex */
public class ReflectionFactory {
    public KFunction function(FunctionReference functionReference) {
        return functionReference;
    }

    public KProperty3 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KProperty4 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KProperty5 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public KProperty6 property0(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KProperty7 property1(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public KProperty8 property2(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new ClassReference(cls);
    }

    @SinceKotlin
    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((FunctionBase) lambda);
    }

    @SinceKotlin
    public String renderLambdaToString(FunctionBase functionBase) {
        String string2 = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string2.startsWith("kotlin.jvm.functions.") ? string2.substring(21) : string2;
    }

    @SinceKotlin
    public KType typeOf(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        return new TypeReference(kClassifier, list, z);
    }
}
