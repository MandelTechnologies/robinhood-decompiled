package kotlin.reflect.jvm.internal.impl.load.java.components;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments;
import kotlin.reflect.jvm.internal.impl.load.java.structure.annotationArguments5;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* compiled from: JavaAnnotationMapper.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper, reason: use source file name */
/* loaded from: classes14.dex */
public final class JavaAnnotationMapper3 {
    public static final JavaAnnotationMapper3 INSTANCE = new JavaAnnotationMapper3();
    private static final Map<String, EnumSet<KotlinTarget>> targetNameLists = MapsKt.mapOf(Tuples4.m3642to("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), Tuples4.m3642to(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), Tuples4.m3642to("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), Tuples4.m3642to("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), Tuples4.m3642to("FIELD", EnumSet.of(KotlinTarget.FIELD)), Tuples4.m3642to("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), Tuples4.m3642to("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), Tuples4.m3642to("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), Tuples4.m3642to("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), Tuples4.m3642to("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));
    private static final Map<String, KotlinRetention> retentionNameList = MapsKt.mapOf(Tuples4.m3642to("RUNTIME", KotlinRetention.RUNTIME), Tuples4.m3642to("CLASS", KotlinRetention.BINARY), Tuples4.m3642to("SOURCE", KotlinRetention.SOURCE));

    private JavaAnnotationMapper3() {
    }

    public final Set<KotlinTarget> mapJavaTargetArgumentByName(String str) {
        EnumSet<KotlinTarget> enumSet = targetNameLists.get(str);
        return enumSet != null ? enumSet : SetsKt.emptySet();
    }

    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(List<? extends annotationArguments> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList<annotationArguments5> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof annotationArguments5) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (annotationArguments5 annotationarguments5 : arrayList) {
            JavaAnnotationMapper3 javaAnnotationMapper3 = INSTANCE;
            Name entryName = annotationarguments5.getEntryName();
            CollectionsKt.addAll(arrayList2, javaAnnotationMapper3.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationTarget);
            Name nameIdentifier = Name.identifier(kotlinTarget.name());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            arrayList3.add(new EnumValue(classId, nameIdentifier));
        }
        return new ArrayValue(arrayList3, new Function1() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationTargetMapper$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj2) {
                return JavaAnnotationMapper3.mapJavaTargetArguments$lambda$2((ModuleDescriptor) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType mapJavaTargetArguments$lambda$2(ModuleDescriptor module) {
        KotlinType type2;
        Intrinsics.checkNotNullParameter(module, "module");
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), module.getBuiltIns().getBuiltInClassByFqName(StandardNames.FqNames.target));
        return (annotationParameterByName == null || (type2 = annotationParameterByName.getType()) == null) ? ErrorUtils.createErrorType(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type2;
    }

    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(annotationArguments annotationarguments) {
        annotationArguments5 annotationarguments5 = annotationarguments instanceof annotationArguments5 ? (annotationArguments5) annotationarguments : null;
        if (annotationarguments5 != null) {
            Map<String, KotlinRetention> map = retentionNameList;
            Name entryName = annotationarguments5.getEntryName();
            KotlinRetention kotlinRetention = map.get(entryName != null ? entryName.asString() : null);
            if (kotlinRetention != null) {
                ClassId classId = ClassId.Companion.topLevel(StandardNames.FqNames.annotationRetention);
                Name nameIdentifier = Name.identifier(kotlinRetention.name());
                Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                return new EnumValue(classId, nameIdentifier);
            }
        }
        return null;
    }
}
