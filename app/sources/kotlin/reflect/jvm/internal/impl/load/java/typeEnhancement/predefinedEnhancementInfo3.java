package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: predefinedEnhancementInfo.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder, reason: use source file name */
/* loaded from: classes14.dex */
final class predefinedEnhancementInfo3 {
    private final Map<String, predefinedEnhancementInfo2> signatures = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder$ClassEnhancementBuilder */
    public final class ClassEnhancementBuilder {
        private final String className;
        final /* synthetic */ predefinedEnhancementInfo3 this$0;

        public ClassEnhancementBuilder(predefinedEnhancementInfo3 predefinedenhancementinfo3, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.this$0 = predefinedenhancementinfo3;
            this.className = className;
        }

        public final String getClassName() {
            return this.className;
        }

        public static /* synthetic */ void function$default(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            classEnhancementBuilder.function(str, str2, function1);
        }

        public final void function(String name, String str, Function1<? super FunctionEnhancementBuilder, Unit> block) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            Map map = this.this$0.signatures;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, name, str);
            block.invoke(functionEnhancementBuilder);
            Tuples2<String, predefinedEnhancementInfo2> tuples2Build = functionEnhancementBuilder.build();
            map.put(tuples2Build.getFirst(), tuples2Build.getSecond());
        }

        /* compiled from: predefinedEnhancementInfo.kt */
        @SourceDebugExtension
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder */
        public final class FunctionEnhancementBuilder {
            private final String errorsSinceLanguageVersion;
            private final String functionName;
            private final List<Tuples2<String, predefinedEnhancementInfo4>> parameters;
            private Tuples2<String, predefinedEnhancementInfo4> returnType;
            final /* synthetic */ ClassEnhancementBuilder this$0;

            public FunctionEnhancementBuilder(ClassEnhancementBuilder classEnhancementBuilder, String functionName, String str) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.this$0 = classEnhancementBuilder;
                this.functionName = functionName;
                this.errorsSinceLanguageVersion = str;
                this.parameters = new ArrayList();
                this.returnType = Tuples4.m3642to("V", null);
            }

            public final void parameter(String type2, typeQualifiers... qualifiers) {
                predefinedEnhancementInfo4 predefinedenhancementinfo4;
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                List<Tuples2<String, predefinedEnhancementInfo4>> list = this.parameters;
                if (qualifiers.length == 0) {
                    predefinedenhancementinfo4 = null;
                } else {
                    Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                    for (IndexedValue indexedValue : iterableWithIndex) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (typeQualifiers) indexedValue.getValue());
                    }
                    predefinedenhancementinfo4 = new predefinedEnhancementInfo4(linkedHashMap);
                }
                list.add(Tuples4.m3642to(type2, predefinedenhancementinfo4));
            }

            public final void returns(String type2, typeQualifiers... qualifiers) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                for (IndexedValue indexedValue : iterableWithIndex) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.getIndex()), (typeQualifiers) indexedValue.getValue());
                }
                this.returnType = Tuples4.m3642to(type2, new predefinedEnhancementInfo4(linkedHashMap));
            }

            public final void returns(JvmPrimitiveType type2) {
                Intrinsics.checkNotNullParameter(type2, "type");
                String desc = type2.getDesc();
                Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
                this.returnType = Tuples4.m3642to(desc, null);
            }

            public final Tuples2<String, predefinedEnhancementInfo2> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.this$0.getClassName();
                String str = this.functionName;
                List<Tuples2<String, predefinedEnhancementInfo4>> list = this.parameters;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Tuples2) it.next()).getFirst());
                }
                String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, this.returnType.getFirst()));
                predefinedEnhancementInfo4 second = this.returnType.getSecond();
                List<Tuples2<String, predefinedEnhancementInfo4>> list2 = this.parameters;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((predefinedEnhancementInfo4) ((Tuples2) it2.next()).getSecond());
                }
                return Tuples4.m3642to(strSignature, new predefinedEnhancementInfo2(second, arrayList2, this.errorsSinceLanguageVersion));
            }
        }
    }

    public final Map<String, predefinedEnhancementInfo2> build() {
        return this.signatures;
    }
}
