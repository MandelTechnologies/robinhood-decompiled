package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.context4;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: SyntheticJavaPartsProvider.kt */
/* loaded from: classes21.dex */
public interface SyntheticJavaPartsProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    void generateConstructors(ClassDescriptor classDescriptor, List<ClassConstructorDescriptor> list, context4 context4Var);

    void generateMethods(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, context4 context4Var);

    void generateNestedClass(ClassDescriptor classDescriptor, Name name, List<ClassDescriptor> list, context4 context4Var);

    void generateStaticFunctions(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection, context4 context4Var);

    List<Name> getMethodNames(ClassDescriptor classDescriptor, context4 context4Var);

    List<Name> getNestedClassNames(ClassDescriptor classDescriptor, context4 context4Var);

    List<Name> getStaticFunctionNames(ClassDescriptor classDescriptor, context4 context4Var);

    PropertyDescriptorImpl modifyField(ClassDescriptor classDescriptor, PropertyDescriptorImpl propertyDescriptorImpl, context4 context4Var);

    /* compiled from: SyntheticJavaPartsProvider.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final SyntheticJavaPartsProvider2 EMPTY = new SyntheticJavaPartsProvider2(CollectionsKt.emptyList());

        private Companion() {
        }

        public final SyntheticJavaPartsProvider2 getEMPTY() {
            return EMPTY;
        }
    }
}
