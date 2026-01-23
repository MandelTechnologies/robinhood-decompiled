package kotlin.reflect.jvm.internal;

import com.robinhood.models.p320db.KaizenExperiment;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.FunctionWithAllInvokes;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.RuntimeTypeMapper2;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.Caller3;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller2;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtils2;
import kotlin.reflect.jvm.internal.impl.resolve.inlineClassesUtils;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.inlineClassManglingRules;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: KFunctionImpl.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B7\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0013J\u0012\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-H\u0002J\u001c\u0010.\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0017H\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020-H\u0002J.\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000305042\n\u0010,\u001a\u0006\u0012\u0002\b\u0003052\u0006\u0010\u0012\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0017H\u0002J\u0013\u0010@\u001a\u00020\u00172\b\u0010A\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010B\u001a\u000208H\u0016J\b\u0010C\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001b\u0010\u0012\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R!\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b&\u0010\"R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u00107\u001a\u0002088VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0018R\u0014\u0010<\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0018R\u0014\u0010=\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0018R\u0014\u0010>\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0018R\u0014\u0010?\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0018¨\u0006D"}, m3636d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "descriptorInitialValue", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "isBound", "", "()Z", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getName", "()Ljava/lang/String;", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/Lazy;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getFunctionWithDefaultParametersForValueClassOverride", "getBoundReceiver", "()Ljava/lang/Object;", "useBoxedBoundReceiver", KaizenExperiment.VARIATION_MEMBER, "Ljava/lang/reflect/Method;", "createStaticMethodCaller", "isCallByToValueClassMangledMethod", "createJvmStaticInObjectCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "createInstanceMethodCaller", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "isDefault", "arity", "", "getArity", "()I", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "equals", "other", "hashCode", "toString", "kotlin-reflection"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(KFunctionImpl.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};

    /* renamed from: caller$delegate, reason: from kotlin metadata */
    private final Lazy caller;
    private final KDeclarationContainerImpl container;

    /* renamed from: defaultCaller$delegate, reason: from kotlin metadata */
    private final Lazy defaultCaller;

    /* renamed from: descriptor$delegate, reason: from kotlin metadata */
    private final ReflectProperties.LazySoftVal descriptor;
    private final Object rawBoundReceiver;
    private final String signature;

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public Object invoke(Object obj, Object obj2, Object obj3) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function8
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.jvm.functions.Function10
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.jvm.functions.Function11
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // kotlin.jvm.functions.Function12
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.jvm.functions.Function13
    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    /* synthetic */ KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kDeclarationContainerImpl, str, str2, functionDescriptor, (i & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    private KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, final String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor = ReflectProperties.lazySoft(functionDescriptor, new Function0(this, str) { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$0
            private final KFunctionImpl arg$0;
            private final String arg$1;

            {
                this.arg$0 = this;
                this.arg$1 = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return KFunctionImpl.descriptor_delegate$lambda$0(this.arg$0, this.arg$1);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.caller = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$1
            private final KFunctionImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return KFunctionImpl.caller_delegate$lambda$4(this.arg$0);
            }
        });
        this.defaultCaller = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KFunctionImpl$$Lambda$2
            private final KFunctionImpl arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public Object invoke() {
                return KFunctionImpl.defaultCaller_delegate$lambda$10(this.arg$0);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(KDeclarationContainerImpl container, String name, String signature, Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(KDeclarationContainerImpl container, FunctionDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        this(container, strAsString, RuntimeTypeMapper.INSTANCE.mapSignature(descriptor).get_signature(), descriptor, null, 16, null);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean isBound() {
        return this.rawBoundReceiver != CallableReference.NO_RECEIVER;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public FunctionDescriptor getDescriptor() {
        T value = this.descriptor.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FunctionDescriptor) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FunctionDescriptor descriptor_delegate$lambda$0(KFunctionImpl kFunctionImpl, String str) {
        return kFunctionImpl.getContainer().findFunctionDescriptor(str, kFunctionImpl.signature);
    }

    @Override // kotlin.reflect.KCallable
    public String getName() {
        String strAsString = getDescriptor().getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public Caller<?> getCaller() {
        return (Caller) this.caller.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Caller caller_delegate$lambda$4(KFunctionImpl kFunctionImpl) throws NoSuchMethodException, SecurityException {
        Object constructor;
        Caller<?> callerCreateInstanceMethodCaller;
        RuntimeTypeMapper2 runtimeTypeMapper2MapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(kFunctionImpl.getDescriptor());
        if (runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.KotlinConstructor) {
            if (kFunctionImpl.isAnnotationConstructor()) {
                Class<?> jClass = kFunctionImpl.getContainer().getJClass();
                List<KParameter> parameters = kFunctionImpl.getParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    Intrinsics.checkNotNull(name);
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(jClass, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            constructor = kFunctionImpl.getContainer().findConstructorBySignature(((RuntimeTypeMapper2.KotlinConstructor) runtimeTypeMapper2MapSignature).getConstructorDesc());
        } else if (runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.KotlinFunction) {
            FunctionDescriptor descriptor = kFunctionImpl.getDescriptor();
            DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
            if (inlineClassesUtils.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof ConstructorDescriptor) && ((ConstructorDescriptor) descriptor).isPrimary()) {
                FunctionDescriptor descriptor2 = kFunctionImpl.getDescriptor();
                KDeclarationContainerImpl container = kFunctionImpl.getContainer();
                String methodDesc = ((RuntimeTypeMapper2.KotlinFunction) runtimeTypeMapper2MapSignature).getMethodDesc();
                List<ValueParameterDescriptor> valueParameters = kFunctionImpl.getDescriptor().getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                return new ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller(descriptor2, container, methodDesc, valueParameters);
            }
            RuntimeTypeMapper2.KotlinFunction kotlinFunction = (RuntimeTypeMapper2.KotlinFunction) runtimeTypeMapper2MapSignature;
            constructor = kFunctionImpl.getContainer().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc());
        } else if (runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.JavaMethod) {
            constructor = ((RuntimeTypeMapper2.JavaMethod) runtimeTypeMapper2MapSignature).getMethod();
            Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else {
            if (!(runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.JavaConstructor)) {
                if (!(runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.FakeJavaAnnotationConstructor)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Method> methods = ((RuntimeTypeMapper2.FakeJavaAnnotationConstructor) runtimeTypeMapper2MapSignature).getMethods();
                Class<?> jClass2 = kFunctionImpl.getContainer().getJClass();
                List<Method> list = methods;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, methods);
            }
            constructor = ((RuntimeTypeMapper2.JavaConstructor) runtimeTypeMapper2MapSignature).getConstructor();
            Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Member");
        }
        if (constructor instanceof Constructor) {
            callerCreateInstanceMethodCaller = kFunctionImpl.createConstructorCaller((Constructor) constructor, kFunctionImpl.getDescriptor(), false);
        } else {
            if (!(constructor instanceof Method)) {
                throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl.getDescriptor() + " (member = " + constructor + ')');
            }
            Method method = (Method) constructor;
            callerCreateInstanceMethodCaller = !Modifier.isStatic(method.getModifiers()) ? kFunctionImpl.createInstanceMethodCaller(method) : kFunctionImpl.getDescriptor().getAnnotations().mo28699findAnnotation(UtilKt.getJVM_STATIC()) != null ? kFunctionImpl.createJvmStaticInObjectCaller(method) : kFunctionImpl.createStaticMethodCaller(method, false);
        }
        return ValueClassAwareCaller2.createValueClassAwareCallerIfNeeded$default(callerCreateInstanceMethodCaller, kFunctionImpl.getDescriptor(), false, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public Caller<?> getDefaultCaller() {
        return (Caller) this.defaultCaller.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Caller defaultCaller_delegate$lambda$10(KFunctionImpl kFunctionImpl) {
        GenericDeclaration genericDeclarationFindDefaultConstructor;
        Caller<?> callerCreateJvmStaticInObjectCaller;
        RuntimeTypeMapper runtimeTypeMapper = RuntimeTypeMapper.INSTANCE;
        RuntimeTypeMapper2 runtimeTypeMapper2MapSignature = runtimeTypeMapper.mapSignature(kFunctionImpl.getDescriptor());
        if (runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.KotlinFunction) {
            FunctionDescriptor descriptor = kFunctionImpl.getDescriptor();
            DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
            if (inlineClassesUtils.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof ConstructorDescriptor) && ((ConstructorDescriptor) descriptor).isPrimary()) {
                throw new KotlinReflectionInternalError(kFunctionImpl.getDescriptor().getContainingDeclaration() + " cannot have default arguments");
            }
            FunctionDescriptor functionWithDefaultParametersForValueClassOverride = kFunctionImpl.getFunctionWithDefaultParametersForValueClassOverride(kFunctionImpl.getDescriptor());
            if (functionWithDefaultParametersForValueClassOverride != null) {
                RuntimeTypeMapper2 runtimeTypeMapper2MapSignature2 = runtimeTypeMapper.mapSignature(functionWithDefaultParametersForValueClassOverride);
                Intrinsics.checkNotNull(runtimeTypeMapper2MapSignature2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                RuntimeTypeMapper2.KotlinFunction kotlinFunction = (RuntimeTypeMapper2.KotlinFunction) runtimeTypeMapper2MapSignature2;
                genericDeclarationFindDefaultConstructor = kFunctionImpl.getContainer().findDefaultMethod(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc(), true);
            } else {
                KDeclarationContainerImpl container = kFunctionImpl.getContainer();
                RuntimeTypeMapper2.KotlinFunction kotlinFunction2 = (RuntimeTypeMapper2.KotlinFunction) runtimeTypeMapper2MapSignature;
                String methodName = kotlinFunction2.getMethodName();
                String methodDesc = kotlinFunction2.getMethodDesc();
                Intrinsics.checkNotNull(kFunctionImpl.getCaller().mo28696getMember());
                genericDeclarationFindDefaultConstructor = container.findDefaultMethod(methodName, methodDesc, !Modifier.isStatic(r5.getModifiers()));
            }
        } else if (runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.KotlinConstructor) {
            if (kFunctionImpl.isAnnotationConstructor()) {
                Class<?> jClass = kFunctionImpl.getContainer().getJClass();
                List<KParameter> parameters = kFunctionImpl.getParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(parameters, 10));
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    String name = ((KParameter) it.next()).getName();
                    Intrinsics.checkNotNull(name);
                    arrayList.add(name);
                }
                return new AnnotationConstructorCaller(jClass, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            genericDeclarationFindDefaultConstructor = kFunctionImpl.getContainer().findDefaultConstructor(((RuntimeTypeMapper2.KotlinConstructor) runtimeTypeMapper2MapSignature).getConstructorDesc());
        } else {
            if (runtimeTypeMapper2MapSignature instanceof RuntimeTypeMapper2.FakeJavaAnnotationConstructor) {
                List<Method> methods = ((RuntimeTypeMapper2.FakeJavaAnnotationConstructor) runtimeTypeMapper2MapSignature).getMethods();
                Class<?> jClass2 = kFunctionImpl.getContainer().getJClass();
                List<Method> list = methods;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, methods);
            }
            genericDeclarationFindDefaultConstructor = null;
        }
        if (genericDeclarationFindDefaultConstructor instanceof Constructor) {
            callerCreateJvmStaticInObjectCaller = kFunctionImpl.createConstructorCaller((Constructor) genericDeclarationFindDefaultConstructor, kFunctionImpl.getDescriptor(), true);
        } else if (!(genericDeclarationFindDefaultConstructor instanceof Method)) {
            callerCreateJvmStaticInObjectCaller = null;
        } else if (kFunctionImpl.getDescriptor().getAnnotations().mo28699findAnnotation(UtilKt.getJVM_STATIC()) != null) {
            DeclarationDescriptor containingDeclaration2 = kFunctionImpl.getDescriptor().getContainingDeclaration();
            Intrinsics.checkNotNull(containingDeclaration2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            callerCreateJvmStaticInObjectCaller = !((ClassDescriptor) containingDeclaration2).isCompanionObject() ? kFunctionImpl.createJvmStaticInObjectCaller((Method) genericDeclarationFindDefaultConstructor) : kFunctionImpl.createStaticMethodCaller((Method) genericDeclarationFindDefaultConstructor, kFunctionImpl.getCaller().isBoundInstanceCallWithValueClasses());
        }
        if (callerCreateJvmStaticInObjectCaller != null) {
            return ValueClassAwareCaller2.createValueClassAwareCallerIfNeeded(callerCreateJvmStaticInObjectCaller, kFunctionImpl.getDescriptor(), true);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final FunctionDescriptor getFunctionWithDefaultParametersForValueClassOverride(FunctionDescriptor descriptor) {
        DeclarationDescriptor containingDeclaration;
        CallableMemberDescriptor next;
        List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            containingDeclaration = descriptor.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
            if (inlineClassesUtils.isValueClass(containingDeclaration)) {
            }
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ValueParameterDescriptor) it.next()).declaresDefaultValue()) {
                    break;
                }
            }
            containingDeclaration = descriptor.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
            if (inlineClassesUtils.isValueClass(containingDeclaration)) {
                Member memberMo28696getMember = getCaller().mo28696getMember();
                Intrinsics.checkNotNull(memberMo28696getMember);
                if (Modifier.isStatic(memberMo28696getMember.getModifiers())) {
                    Iterator<CallableMemberDescriptor> itIterator2 = DescriptorUtils2.overriddenTreeAsSequence(descriptor, false).iterator2();
                    loop0: while (true) {
                        if (!itIterator2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = itIterator2.next();
                        List<ValueParameterDescriptor> valueParameters2 = next.getValueParameters();
                        Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                        List<ValueParameterDescriptor> list2 = valueParameters2;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator<T> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((ValueParameterDescriptor) it2.next()).declaresDefaultValue()) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    if (next instanceof FunctionDescriptor) {
                        return (FunctionDescriptor) next;
                    }
                }
            }
        }
        return null;
    }

    private final Object getBoundReceiver() {
        return ValueClassAwareCaller2.coerceToExpectedReceiverType(this.rawBoundReceiver, getDescriptor());
    }

    private final boolean useBoxedBoundReceiver(Method member) {
        KotlinType type2;
        ReceiverParameterDescriptor dispatchReceiverParameter = getDescriptor().getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null || (type2 = dispatchReceiverParameter.getType()) == null || !inlineClassesUtils.isInlineClassType(type2)) {
            return false;
        }
        Class<?>[] parameterTypes = member.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        Class cls = (Class) ArraysKt.firstOrNull(parameterTypes);
        return cls != null && cls.isInterface();
    }

    private final Caller<?> createStaticMethodCaller(Method member, boolean isCallByToValueClassMangledMethod) {
        if (isBound()) {
            return new CallerImpl.Method.BoundStatic(member, isCallByToValueClassMangledMethod, useBoxedBoundReceiver(member) ? this.rawBoundReceiver : getBoundReceiver());
        }
        return new CallerImpl.Method.Static(member);
    }

    private final CallerImpl.Method createJvmStaticInObjectCaller(Method member) {
        return isBound() ? new CallerImpl.Method.BoundJvmStaticInObject(member) : new CallerImpl.Method.JvmStaticInObject(member);
    }

    private final CallerImpl.Method createInstanceMethodCaller(Method member) {
        return isBound() ? new CallerImpl.Method.BoundInstance(member, getBoundReceiver()) : new CallerImpl.Method.Instance(member);
    }

    private final CallerImpl<Constructor<?>> createConstructorCaller(Constructor<?> member, FunctionDescriptor descriptor, boolean isDefault) {
        if (!isDefault && inlineClassManglingRules.shouldHideConstructorDueToValueClassTypeValueParameters(descriptor)) {
            if (isBound()) {
                return new CallerImpl.AccessorForHiddenBoundConstructor(member, getBoundReceiver());
            }
            return new CallerImpl.AccessorForHiddenConstructor(member);
        }
        if (isBound()) {
            return new CallerImpl.BoundConstructor(member, getBoundReceiver());
        }
        return new CallerImpl.Constructor(member);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return Caller3.getArity(getCaller());
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInline() {
        return getDescriptor().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isExternal() {
        return getDescriptor().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isOperator() {
        return getDescriptor().isOperator();
    }

    @Override // kotlin.reflect.KFunction
    public boolean isInfix() {
        return getDescriptor().isInfix();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return getDescriptor().isSuspend();
    }

    public boolean equals(Object other) {
        KFunctionImpl kFunctionImplAsKFunctionImpl = UtilKt.asKFunctionImpl(other);
        return kFunctionImplAsKFunctionImpl != null && Intrinsics.areEqual(getContainer(), kFunctionImplAsKFunctionImpl.getContainer()) && Intrinsics.areEqual(getName(), kFunctionImplAsKFunctionImpl.getName()) && Intrinsics.areEqual(this.signature, kFunctionImplAsKFunctionImpl.signature) && Intrinsics.areEqual(this.rawBoundReceiver, kFunctionImplAsKFunctionImpl.rawBoundReceiver);
    }

    public int hashCode() {
        return (((getContainer().hashCode() * 31) + getName().hashCode()) * 31) + this.signature.hashCode();
    }

    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderFunction(getDescriptor());
    }
}
