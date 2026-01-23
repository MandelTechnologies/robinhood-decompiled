package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.descriptorUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionNInfo;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.context;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.context4;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtil;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.load.kotlin.methodSignatureBuildingUtils;
import kotlin.reflect.jvm.internal.impl.load.kotlin.methodSignatureMapping3;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.deprecation.DescriptorBasedDeprecationInfo2;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtils2;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType5;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtils2;
import kotlin.text.StringsKt;

/* compiled from: signatureEnhancement.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement, reason: use source file name */
/* loaded from: classes21.dex */
public final class signatureEnhancement {
    private final typeEnhancement3 typeEnhancement;

    public signatureEnhancement(typeEnhancement3 typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.typeEnhancement = typeEnhancement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(context4 c, Collection<? extends D> platformSignatures) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<? extends D> collection = platformSignatures;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), c));
        }
        return arrayList;
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d, context4 context4Var) {
        ClassifierDescriptor topLevelContainingClassifier = descriptorUtil.getTopLevelContainingClassifier(d);
        if (topLevelContainingClassifier == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
        List<JavaAnnotation> list = moduleAnnotations;
        if (list == null || list.isEmpty()) {
            return d.getAnnotations();
        }
        List<JavaAnnotation> list2 = moduleAnnotations;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(context4Var, (JavaAnnotation) it.next(), true));
        }
        return Annotations.Companion.create(CollectionsKt.plus((Iterable) d.getAnnotations(), (Iterable) arrayList));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0223, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final <D extends CallableMemberDescriptor> D enhanceSignature(D d, context4 context4Var) {
        D d2;
        KotlinType kotlinTypeEnhanceValueParameter;
        predefinedEnhancementInfo2 predefinedenhancementinfo2;
        boolean z;
        boolean z2;
        boolean z3;
        KotlinType type2;
        List<predefinedEnhancementInfo4> parametersInfo;
        String errorsSinceLanguageVersion;
        PropertyDescriptorImpl propertyDescriptorImpl;
        PropertyGetterDescriptorImpl getter;
        if (!(d instanceof JavaCallableMemberDescriptor)) {
            return d;
        }
        if (d.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE || d.getOriginal().getOverriddenDescriptors().size() != 1) {
            context4 context4VarCopyWithNewDefaultTypeQualifiers = context.copyWithNewDefaultTypeQualifiers(context4Var, getDefaultAnnotations(d, context4Var));
            if (!(d instanceof JavaPropertyDescriptor) || (getter = (propertyDescriptorImpl = (PropertyDescriptorImpl) d).getGetter()) == null || getter.isDefault()) {
                d2 = d;
            } else {
                PropertyGetterDescriptorImpl getter2 = propertyDescriptorImpl.getGetter();
                Intrinsics.checkNotNull(getter2);
                d2 = getter2;
            }
            KotlinType type3 = null;
            if (d.getExtensionReceiverParameter() != null) {
                FunctionDescriptor functionDescriptor = d2 instanceof FunctionDescriptor ? (FunctionDescriptor) d2 : null;
                kotlinTypeEnhanceValueParameter = enhanceValueParameter(d, functionDescriptor != null ? (ValueParameterDescriptor) functionDescriptor.getUserData(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER) : null, context4VarCopyWithNewDefaultTypeQualifiers, null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$0
                    @Override // kotlin.jvm.functions.Function1
                    public Object invoke(Object obj) {
                        return signatureEnhancement.enhanceSignature$lambda$2((CallableMemberDescriptor) obj);
                    }
                });
            } else {
                kotlinTypeEnhanceValueParameter = null;
            }
            JavaMethodDescriptor javaMethodDescriptor = d instanceof JavaMethodDescriptor ? (JavaMethodDescriptor) d : null;
            int i = 0;
            if (javaMethodDescriptor != null) {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                DeclarationDescriptor containingDeclaration = javaMethodDescriptor.getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                String strSignature = methodSignatureBuildingUtils.signature(signatureBuildingComponents, (ClassDescriptor) containingDeclaration, methodSignatureMapping3.computeJvmDescriptor$default(javaMethodDescriptor, false, false, 3, null));
                if (strSignature != null) {
                    predefinedEnhancementInfo2 warningModeClone = predefinedEnhancementInfo.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE().get(strSignature);
                    if (warningModeClone == null) {
                        warningModeClone = null;
                    } else {
                        if (warningModeClone.getErrorsSinceLanguageVersion() != null && ((errorsSinceLanguageVersion = warningModeClone.getErrorsSinceLanguageVersion()) == null || !StringsKt.startsWith$default(errorsSinceLanguageVersion, "2.", false, 2, (Object) null))) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (warningModeClone.getErrorsSinceLanguageVersion() != null) {
                            warningModeClone = warningModeClone.getWarningModeClone();
                        }
                    }
                    predefinedenhancementinfo2 = warningModeClone;
                } else {
                    predefinedenhancementinfo2 = null;
                }
                if (predefinedenhancementinfo2 != null) {
                    predefinedenhancementinfo2.getParametersInfo().size();
                    ((JavaMethodDescriptor) d).getValueParameters().size();
                }
                boolean z4 = (UtilsKt.isJspecifyEnabledInStrictMode(context4Var.getComponents().getJavaTypeEnhancementState()) || context4VarCopyWithNewDefaultTypeQualifiers.getComponents().getSettings().getIgnoreNullabilityForErasedValueParameters()) && UtilsKt.hasErasedValueParameters(d);
                List<ValueParameterDescriptor> valueParameters = d2.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                List<ValueParameterDescriptor> list = valueParameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (final ValueParameterDescriptor valueParameterDescriptor : list) {
                    arrayList.add(enhanceValueParameter(d, valueParameterDescriptor, context4VarCopyWithNewDefaultTypeQualifiers, (predefinedenhancementinfo2 == null || (parametersInfo = predefinedenhancementinfo2.getParametersInfo()) == null) ? null : (predefinedEnhancementInfo4) CollectionsKt.getOrNull(parametersInfo, valueParameterDescriptor.getIndex()), z4, new Function1(valueParameterDescriptor) { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$1
                        private final ValueParameterDescriptor arg$0;

                        {
                            this.arg$0 = valueParameterDescriptor;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Object invoke(Object obj) {
                            return signatureEnhancement.enhanceSignature$lambda$9$lambda$8(this.arg$0, (CallableMemberDescriptor) obj);
                        }
                    }));
                }
                PropertyDescriptor propertyDescriptor = d instanceof PropertyDescriptor ? (PropertyDescriptor) d : null;
                KotlinType kotlinTypeEnhance$default = enhance$default(this, d, d2, true, context4VarCopyWithNewDefaultTypeQualifiers, (propertyDescriptor == null || !JavaDescriptorUtil.isJavaField(propertyDescriptor)) ? AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE : AnnotationQualifierApplicabilityType.FIELD, predefinedenhancementinfo2 != null ? predefinedenhancementinfo2.getReturnTypeInfo() : null, false, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$2
                    @Override // kotlin.jvm.functions.Function1
                    public Object invoke(Object obj) {
                        return signatureEnhancement.enhanceSignature$lambda$10((CallableMemberDescriptor) obj);
                    }
                }, 32, null);
                KotlinType returnType = d.getReturnType();
                Intrinsics.checkNotNull(returnType);
                if (containsFunctionN(returnType)) {
                    z = true;
                    Tuples2<CallableDescriptor.UserDataKey<?>, ?> tuples2M3642to = z ? Tuples4.m3642to(DescriptorBasedDeprecationInfo2.getDEPRECATED_FUNCTION_KEY(), new DeprecationCausedByFunctionNInfo(d)) : null;
                    if (kotlinTypeEnhanceValueParameter == null && kotlinTypeEnhance$default == null) {
                        if (!arrayList.isEmpty()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((KotlinType) it.next()) != null) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    }
                    JavaCallableMemberDescriptor javaCallableMemberDescriptor = (JavaCallableMemberDescriptor) d;
                    if (kotlinTypeEnhanceValueParameter == null) {
                        ReceiverParameterDescriptor extensionReceiverParameter = d.getExtensionReceiverParameter();
                        if (extensionReceiverParameter != null) {
                            type3 = extensionReceiverParameter.getType();
                        }
                    } else {
                        type3 = kotlinTypeEnhanceValueParameter;
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (Object obj : arrayList) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        KotlinType type4 = (KotlinType) obj;
                        if (type4 == null) {
                            type4 = d.getValueParameters().get(i).getType();
                            Intrinsics.checkNotNullExpressionValue(type4, "getType(...)");
                        }
                        arrayList2.add(type4);
                        i = i2;
                    }
                    if (kotlinTypeEnhance$default == null) {
                        kotlinTypeEnhance$default = d.getReturnType();
                        Intrinsics.checkNotNull(kotlinTypeEnhance$default);
                    }
                    JavaCallableMemberDescriptor javaCallableMemberDescriptorEnhance = javaCallableMemberDescriptor.enhance(type3, arrayList2, kotlinTypeEnhance$default, tuples2M3642to);
                    Intrinsics.checkNotNull(javaCallableMemberDescriptorEnhance, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    return javaCallableMemberDescriptorEnhance;
                }
                ReceiverParameterDescriptor extensionReceiverParameter2 = d.getExtensionReceiverParameter();
                if (!((extensionReceiverParameter2 == null || (type2 = extensionReceiverParameter2.getType()) == null) ? false : containsFunctionN(type2))) {
                    List<ValueParameterDescriptor> valueParameters2 = d.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                    List<ValueParameterDescriptor> list2 = valueParameters2;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        z3 = false;
                        if (z3) {
                        }
                        if (z) {
                        }
                        if (kotlinTypeEnhanceValueParameter == null) {
                        }
                        JavaCallableMemberDescriptor javaCallableMemberDescriptor2 = (JavaCallableMemberDescriptor) d;
                        if (kotlinTypeEnhanceValueParameter == null) {
                        }
                        ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                        while (r7.hasNext()) {
                        }
                        if (kotlinTypeEnhance$default == null) {
                        }
                        JavaCallableMemberDescriptor javaCallableMemberDescriptorEnhance2 = javaCallableMemberDescriptor2.enhance(type3, arrayList22, kotlinTypeEnhance$default, tuples2M3642to);
                        Intrinsics.checkNotNull(javaCallableMemberDescriptorEnhance2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                        return javaCallableMemberDescriptorEnhance2;
                    }
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        KotlinType type5 = ((ValueParameterDescriptor) it2.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type5, "getType(...)");
                        if (containsFunctionN(type5)) {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = false;
                    if (z3) {
                        z = false;
                    }
                    if (z) {
                    }
                    if (kotlinTypeEnhanceValueParameter == null) {
                        if (!arrayList.isEmpty()) {
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    }
                    JavaCallableMemberDescriptor javaCallableMemberDescriptor22 = (JavaCallableMemberDescriptor) d;
                    if (kotlinTypeEnhanceValueParameter == null) {
                    }
                    ArrayList arrayList222 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    while (r7.hasNext()) {
                    }
                    if (kotlinTypeEnhance$default == null) {
                    }
                    JavaCallableMemberDescriptor javaCallableMemberDescriptorEnhance22 = javaCallableMemberDescriptor22.enhance(type3, arrayList222, kotlinTypeEnhance$default, tuples2M3642to);
                    Intrinsics.checkNotNull(javaCallableMemberDescriptorEnhance22, "null cannot be cast to non-null type D of org.jetbrains.kotlin.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature");
                    return javaCallableMemberDescriptorEnhance22;
                }
            }
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$2(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ReceiverParameterDescriptor extensionReceiverParameter = it.getExtensionReceiverParameter();
        Intrinsics.checkNotNull(extensionReceiverParameter);
        KotlinType type2 = extensionReceiverParameter.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$9$lambda$8(ValueParameterDescriptor valueParameterDescriptor, CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType type2 = it.getValueParameters().get(valueParameterDescriptor.getIndex()).getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType enhanceSignature$lambda$10(CallableMemberDescriptor it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KotlinType returnType = it.getReturnType();
        Intrinsics.checkNotNull(returnType);
        return returnType;
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, context4 context) {
        KotlinType kotlinType;
        KotlinType kotlinTypeEnhance$default;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends KotlinType> list = bounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (KotlinType kotlinType2 : list) {
            if (TypeUtils2.contains(kotlinType2, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$3
                @Override // kotlin.jvm.functions.Function1
                public Object invoke(Object obj) {
                    return Boolean.valueOf(signatureEnhancement.enhanceTypeParameterBounds$lambda$15$lambda$14((KotlinType5) obj));
                }
            })) {
                kotlinType = kotlinType2;
            } else {
                kotlinType = kotlinType2;
                kotlinTypeEnhance$default = enhance$default(this, new signatureEnhancement2(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), kotlinType, CollectionsKt.emptyList(), null, false, 12, null);
                if (kotlinTypeEnhance$default == null) {
                }
                arrayList.add(kotlinTypeEnhance$default);
            }
            kotlinTypeEnhance$default = kotlinType;
            arrayList.add(kotlinTypeEnhance$default);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enhanceTypeParameterBounds$lambda$15$lambda$14(KotlinType5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it instanceof RawType;
    }

    public final KotlinType enhanceSuperType(KotlinType type2, context4 context) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        KotlinType kotlinTypeEnhance$default = enhance$default(this, new signatureEnhancement2(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type2, CollectionsKt.emptyList(), null, false, 12, null);
        return kotlinTypeEnhance$default == null ? type2 : kotlinTypeEnhance$default;
    }

    private final boolean containsFunctionN(KotlinType kotlinType) {
        return TypeUtils.contains(kotlinType, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$$Lambda$4
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return signatureEnhancement.containsFunctionN$lambda$16((KotlinType5) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean containsFunctionN$lambda$16(KotlinType5 kotlinType5) {
        ClassifierDescriptor classifierDescriptorMo28704getDeclarationDescriptor = kotlinType5.getConstructor().mo28704getDeclarationDescriptor();
        if (classifierDescriptorMo28704getDeclarationDescriptor == null) {
            return Boolean.FALSE;
        }
        Name name = classifierDescriptorMo28704getDeclarationDescriptor.getName();
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        return Boolean.valueOf(Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtils2.fqNameOrNull(classifierDescriptorMo28704getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME()));
    }

    private final KotlinType enhanceValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, context4 context4Var, predefinedEnhancementInfo4 predefinedenhancementinfo4, boolean z, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        context4 context4VarCopyWithNewDefaultTypeQualifiers;
        return enhance(callableMemberDescriptor, valueParameterDescriptor, false, (valueParameterDescriptor == null || (context4VarCopyWithNewDefaultTypeQualifiers = context.copyWithNewDefaultTypeQualifiers(context4Var, valueParameterDescriptor.getAnnotations())) == null) ? context4Var : context4VarCopyWithNewDefaultTypeQualifiers, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, predefinedenhancementinfo4, z, function1);
    }

    static /* synthetic */ KotlinType enhance$default(signatureEnhancement signatureenhancement, CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, context4 context4Var, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, predefinedEnhancementInfo4 predefinedenhancementinfo4, boolean z2, Function1 function1, int i, Object obj) {
        return signatureenhancement.enhance(callableMemberDescriptor, annotated, z, context4Var, annotationQualifierApplicabilityType, predefinedenhancementinfo4, (i & 32) != 0 ? false : z2, function1);
    }

    private final KotlinType enhance(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, context4 context4Var, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, predefinedEnhancementInfo4 predefinedenhancementinfo4, boolean z2, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        signatureEnhancement2 signatureenhancement2 = new signatureEnhancement2(annotated, z, context4Var, annotationQualifierApplicabilityType, false, 16, null);
        KotlinType kotlinTypeInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            Intrinsics.checkNotNull(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return enhance(signatureenhancement2, kotlinTypeInvoke, arrayList, predefinedenhancementinfo4, z2);
    }

    static /* synthetic */ KotlinType enhance$default(signatureEnhancement signatureenhancement, signatureEnhancement2 signatureenhancement2, KotlinType kotlinType, List list, predefinedEnhancementInfo4 predefinedenhancementinfo4, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            predefinedenhancementinfo4 = null;
        }
        predefinedEnhancementInfo4 predefinedenhancementinfo42 = predefinedenhancementinfo4;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureenhancement.enhance(signatureenhancement2, kotlinType, list, predefinedenhancementinfo42, z);
    }

    private final KotlinType enhance(signatureEnhancement2 signatureenhancement2, KotlinType kotlinType, List<? extends KotlinType> list, predefinedEnhancementInfo4 predefinedenhancementinfo4, boolean z) {
        return this.typeEnhancement.enhance(kotlinType, signatureenhancement2.computeIndexedQualifiers(kotlinType, list, predefinedenhancementinfo4, z), signatureenhancement2.getSkipRawTypeArguments());
    }
}
